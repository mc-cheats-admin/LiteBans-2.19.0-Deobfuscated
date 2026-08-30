package litebans;

import java.util.Arrays;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

public final class RemoteUpdateService
extends PluginModule {
    public static final LiteBansModule_381 LiteBansModule_31;
    private ScheduledExecutorService c;
    private static String AsyncBackgroundTask_5;
        public RemoteUpdateService(@NotNull PlatformPlugin plugin) {
        super(plugin);
    }

    @Override
    public void c() {
        ScheduledExecutorService scheduledExecutorService = this.c;
        if (scheduledExecutorService != null) {
            try {
                scheduledExecutorService.shutdown();
                scheduledExecutorService.awaitTermination(1L, TimeUnit.SECONDS);
            }
            catch (Throwable throwable) {
                throwable.printStackTrace();
            }
        }
        this.c = null;
    }

    @Override
    public void e() {
        PlatformPlugin plugin = this.plugin;
        ConfigService configService = (ConfigService)plugin.BaseCoreGenericHandler(ConfigService.class);
        configService.e();
        String string = AsyncBackgroundTask_5;
        if (string == null || ((CharSequence)string).length() == 0) {
            return;
        }
        ThreadPoolExecutor threadPoolExecutor = plugin.LiteBansModule_435();
        ObjectUtilities.LiteBansModule_31(threadPoolExecutor, "");
        ThreadFactory threadFactory = threadPoolExecutor.getThreadFactory();
        this.c = Executors.newScheduledThreadPool(1, threadFactory);
        Object[] objectArray = new Object[]{string, plugin};
        Object[] objectArray2 = objectArray;
        ScheduledExecutorService scheduledExecutorService = this.c;
        ObjectUtilities.BaseCoreGenericHandler(scheduledExecutorService);
        scheduledExecutorService.scheduleAtFixedRate(new AsyncBackgroundTask_3(Arrays.copyOf(objectArray2, objectArray2.length)), 0L, 2L, TimeUnit.DAYS);
        AsyncBackgroundTask_5 = "";
    }

    static {
        RemoteUpdateService.AsyncBackgroundTask_5();
        LiteBansModule_31 = new LiteBansModule_381(null);
        try {
            AsyncBackgroundTask_5 = "https://litebans.AsyncBackgroundTask_5-n-AsyncBackgroundTask_21.name/update.php";
            AsyncBackgroundTask_5 = AsyncBackgroundTask_5 + LitebansHandler.LiteBansModule_31.c();
            AsyncBackgroundTask_5 = AsyncBackgroundTask_5 + LiteBansModule_180.BaseCoreGenericHandler;
            AsyncBackgroundTask_5 = AsyncBackgroundTask_5 + LitebansHandler.LiteBansModule_31.BaseCoreGenericHandler();
            AsyncBackgroundTask_5 = AsyncBackgroundTask_5 + LiteBansModule_146.BaseCoreGenericHandler;
            AsyncBackgroundTask_5 = AsyncBackgroundTask_5 + LitebansHandler.LiteBansModule_31.LiteBansModule_195();
            AsyncBackgroundTask_5 = AsyncBackgroundTask_5 + StringUtilities.BaseCoreGenericHandler(LiteBansModule_181.AsyncBackgroundTask_5, " + ", "", false, 4, null);
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    private static final void AsyncBackgroundTask_5() {
        e = new String[]{"", "", "https://litebans.AsyncBackgroundTask_5-n-AsyncBackgroundTask_21.name/update.php", " + ", ""};
    }
}
}
