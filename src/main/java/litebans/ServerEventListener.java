package litebans;

import java.util.concurrent.atomic.AtomicBoolean;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.player.AsyncPlayerPreLoginEvent;
import org.jetbrains.annotations.NotNull;

public final class ServerEventListener
implements LiteBansModule_88 {
    private final PlatformPlugin LiteBansModule_31;
    private final BroadcastService c;
    private final ConfigService AsyncBackgroundTask_5;
    public ServerEventListener(@NotNull PlatformPlugin plugin) {
        this.LiteBansModule_31 = plugin;
        this.c = (BroadcastService)this.LiteBansModule_31.BaseCoreGenericHandler(BroadcastService.class);
        this.AsyncBackgroundTask_5 = (ConfigService)this.LiteBansModule_31.BaseCoreGenericHandler(ConfigService.class);
    }

    public final BroadcastService c() {
        return this.c;
    }

    public final ConfigService e() {
        return this.AsyncBackgroundTask_5;
    }

    @EventHandler(priority=EventPriority.LOW)
    public final void LiteBansModule_31(@NotNull AsyncPlayerPreLoginEvent asyncPlayerPreLoginEvent) {
        if (this.AsyncBackgroundTask_5.BaseCoreGenericHandler(1)) {
            ServerEventListener aX2 = this;
            boolean flag = false;
            boolean flag2 = false;
            long l3 = System.nanoTime();
            boolean flag3 = false;
            aX2.BaseCoreGenericHandler(asyncPlayerPreLoginEvent);
            long l5 = System.nanoTime() - l3;
            double d10 = (double)l5 / 1000.0 / 1000.0;
            aX2.AsyncBackgroundTask_5.BaseCoreGenericHandler((Object)("Handled login event: " + LiteBansModule_287.LiteBansModule_31(d10) + " "));
        } else {
            this.plugin(asyncPlayerPreLoginEvent);
        }
    }

    private final void c(AsyncPlayerPreLoginEvent asyncPlayerPreLoginEvent) {
        boolean flag = false;
        boolean flag2 = false;
        long l3 = System.nanoTime();
        boolean flag3 = false;
        this.plugin(asyncPlayerPreLoginEvent);
        long l5 = System.nanoTime() - l3;
        double d10 = (double)l5 / 1000.0 / 1000.0;
        this.AsyncBackgroundTask_5.BaseCoreGenericHandler((Object)("Handled login event: " + LiteBansModule_287.LiteBansModule_31(d10) + " "));
    }

    private final void BaseCoreGenericHandler(AsyncPlayerPreLoginEvent asyncPlayerPreLoginEvent) {
        if (asyncPlayerPreLoginEvent.getLoginResult() != AsyncPlayerPreLoginEvent.Result.ALLOWED) {
            return;
        }
        if (this.LiteBansModule_31.AsyncBackgroundTask_21()) {
            return;
        }
        if (!this.LiteBansModule_31.n()) {
            this.LiteBansModule_31.getLogger().severe("Ignored " + asyncPlayerPreLoginEvent.getClass().getSimpleName() + "; plugin is not enabled yet!");
            if (OrgBukkitBlockHandler.LiteBansModule_31()) {
                this.LiteBansModule_31.getLogger().severe("Enable late-bind InitializerHandler_3 spigot.yml to fix this problem, otherwise banned players can join before LiteBans has been ");
            }
            return;
        }
        this.LiteBansModule_31();
        this.c.c().LiteBansModule_31(asyncPlayerPreLoginEvent);
    }

    private final void LiteBansModule_31() {
        if (!OrgBukkitBlockHandler.c()) {
            return;
        }
        if (this.AsyncBackgroundTask_5.B() != null) {
            Object object = this.AsyncBackgroundTask_5.B();
            ObjectUtilities.LiteBansModule_31(object, "");
            AtomicBoolean atomicBoolean = ((NullHandler_8)object).c();
            boolean flag = false;
            if (atomicBoolean.compareAndSet(false, true)) {
                Object object2 = this.AsyncBackgroundTask_5.B();
                ObjectUtilities.LiteBansModule_31(object2, "");
                ((NullHandler_8)object2).BaseCoreGenericHandler(this.AsyncBackgroundTask_5.AsyncBackgroundTask_22());
            }
        }
    }

    public ServerEventListener AsyncBackgroundTask_5() {
        ServerEventListener aX2;
        ServerEventListener aX3 = aX2 = this;
        boolean flag = false;
        LiteBansModule_175[] em_0Array = new LiteBansModule_175[]{aX3};
        aX3.LiteBansModule_31.LiteBansModule_31(em_0Array);
        return aX2;
    }

    @Override
    public LiteBansModule_175 BaseCoreGenericHandler() {
        return this.AsyncBackgroundTask_5();
    }

    private static final void BaseCoreGenericHandler() {
        BaseCoreGenericHandler = new String[]{"Handled login event: ", " ", "Handled login event: ", " ", "Ignored ", "; plugin is not enabled yet!", "Enable late-bind InitializerHandler_3 spigot.yml to fix this problem, otherwise banned players can join before LiteBans has been ", "", ""};
    }

    }

