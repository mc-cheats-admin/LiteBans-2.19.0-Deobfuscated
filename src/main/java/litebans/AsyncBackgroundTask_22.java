package litebans;

import java.util.Collection;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class AsyncBackgroundTask_22
extends PluginModule
implements Runnable {
    public static final LiteBansModule_273 LiteBansModule_31;
    private final LiteBansModule_161 c = ProxyConnection.BaseCoreGenericHandler(() -> AsyncBackgroundTask_22.BaseCoreGenericHandler(this));
    private final ArrayBlockingQueue LiteBansModule_194 = new ArrayBlockingQueue(512);
    private final AtomicBoolean g = new AtomicBoolean();
    public static final long AsyncBackgroundTask_5;
    public static final long e;
    public static final int LiteBansModule_240;
    public AsyncBackgroundTask_22(@NotNull PlatformPlugin plugin) {
        super(plugin);
    }

    private final AsyncBackgroundTask_21 BaseCoreGenericHandler() {
        LiteBansModule_161 eE2 = this.c;
        return (AsyncBackgroundTask_21)eE2.BaseCoreGenericHandler();
    }

    @Override
    public void e() {
        ConfigService configService = (ConfigService)this.plugin.BaseCoreGenericHandler(ConfigService.class);
        configService.e();
        long l3 = 80L;
        if (configService.LiteBansModule_194().e() > 1) {
            l3 = 30L;
        }
        this.plugin.LiteBansModule_31(this, l3, l3);
    }

    @Override
    public void c() {
        this.LiteBansModule_194.clear();
        AtomicBoolean atomicBoolean = this.g;
        boolean flag = false;
        atomicBoolean.set(false);
    }

    @Override
    public void LiteBansModule_31() {
        this.c();
        this.e();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void run() {
        AtomicBoolean atomicBoolean = this.g;
        boolean flag = false;
        Object object = atomicBoolean;
        int n = 0;
        if (!((AtomicBoolean)object).compareAndSet(false, true)) return;
        object = (DatabaseMonitorService)this.plugin.BaseCoreGenericHandler(DatabaseMonitorService.class);
        try {
            int n2;
            AsyncBackgroundTask_22 t2 = this;
            boolean flag2 = false;
            n = t2.LiteBansModule_194.size() >= 256 ? 3 : (t2.LiteBansModule_194.size() >= 128 ? 2 : (t2.LiteBansModule_194.size() >= 64 ? 1 : 0));
            AsyncBackgroundTask_22 t3 = this;
            boolean flag3 = false;
            switch (n) {
                case 0: {
                    n2 = 20;
                    break;
                }
                case 1: {
                    n2 = 40;
                    break;
                }
                case 2: {
                    n2 = 50;
                    break;
                }
                case 3: {
                    n2 = 80;
                    break;
                }
                default: {
                    AssertionUtilities.BaseCoreGenericHandler();
                    throw new CommandExitException();
                }
            }
            int n3 = n2;
            if (((DatabaseMonitorService)object).BaseCoreGenericHandler(2) && n <= 2) {
                return;
            }
            int n4 = 1;
            if (n4 > n3) return;
            while (true) {
                LiteBansModule_95 cp_02;
                if ((LiteBansModule_95)this.LiteBansModule_194.peek() == null) {
                    return;
                }
                if (this.plugin(cp_02)) return;
                LiteBansModule_95 cp_03 = (LiteBansModule_95)this.LiteBansModule_194.poll();
                if (cp_03 != cp_02) {
                    ObjectUtilities.BaseCoreGenericHandler(cp_03);
                    if (this.plugin(cp_03)) {
                        this.LiteBansModule_194.offer(cp_03);
                        return;
                    }
                }
                AsyncBackgroundTask_22 t4 = this;
                ObjectUtilities.BaseCoreGenericHandler(cp_03);
                LiteBansModule_95 cp_04 = cp_03;
                boolean flag4 = false;
                LiteBansModule_95 cp_05 = cp_04;
                boolean flag5 = false;
                new AltsHandler(t4.BaseCoreGenericHandler, cp_05.c(), cp_05.g(), cp_05.LiteBansModule_31()).run();
                if (n4 == n3) return;
                ++n4;
            }
        }
        catch (Exception exception) {
            if (exception instanceof InterruptedException) {
                return;
            }
            ((DatabaseMonitorService)object).BaseCoreGenericHandler(exception);
            return;
        }
        finally {
            AtomicBoolean atomicBoolean2 = atomicBoolean;
            boolean flag6 = false;
            atomicBoolean2.set(false);
        }
    }

    private final boolean BaseCoreGenericHandler(LiteBansModule_95 cp_02) {
        boolean flag;
        block3: {
            Iterable iterable = this.plugin().BaseCoreGenericHandler();
            boolean flag2 = false;
            if (iterable instanceof Collection && ((Collection)iterable).isEmpty()) {
                flag = false;
            } else {
                for (Object t2 : iterable) {
                    LiteBansModule_95 cp_03 = (LiteBansModule_95)t2;
                    boolean flag3 = false;
                    if (!(ObjectUtilities.BaseCoreGenericHandler((Object)cp_03.c(), (Object)cp_02.c()) || ObjectUtilities.BaseCoreGenericHandler((Object)cp_03.g(), (Object)cp_02.g()) || ObjectUtilities.BaseCoreGenericHandler((Object)cp_03.LiteBansModule_31(), (Object)cp_02.LiteBansModule_31()))) continue;
                    flag = true;
                    break block3;
                }
                flag = false;
            }
        }
        return flag;
    }

    public final void BaseCoreGenericHandler(@Nullable String string, @Nullable String string2, @Nullable String string3) {
        CommandThrottleService v2 = (CommandThrottleService)this.plugin.BaseCoreGenericHandler(CommandThrottleService.class);
        ConfigService configService = (ConfigService)this.plugin.BaseCoreGenericHandler(ConfigService.class);
        if (configService.LiteBansModule_194().LockdownCommandHandler() && !v2.BaseCoreGenericHandler((byte)0, string2)) {
            String string4 = string;
            ObjectUtilities.BaseCoreGenericHandler((Object)string4);
            String string5 = string2;
            ObjectUtilities.BaseCoreGenericHandler((Object)string5);
            this.LiteBansModule_194.offer(new LiteBansModule_95(string4, HexEncodingHelper.LiteBansModule_194(string5), string3));
            ConfigService q_03 = configService;
            boolean flag = false;
            if (q_03.g()) {
                ConfigService q_04 = q_03;
                boolean flag2 = false;
                q_04.BaseCoreGenericHandler((Object)("Offer " + string));
            }
        }
    }

    private static final AsyncBackgroundTask_21 BaseCoreGenericHandler(AsyncBackgroundTask_22 t2) {
        return (AsyncBackgroundTask_21)t2.BaseCoreGenericHandler.BaseCoreGenericHandler(AsyncBackgroundTask_21.class);
    }

    static {
        LiteBansModule_240 = 512;
        e = 30L;
        AsyncBackgroundTask_5 = 80L;
        AsyncBackgroundTask_22.AsyncBackgroundTask_5();
        LiteBansModule_31 = new LiteBansModule_273(null);
    }

    private static final void AsyncBackgroundTask_5() {
        i = new String[]{"Offer "};
    }
}

