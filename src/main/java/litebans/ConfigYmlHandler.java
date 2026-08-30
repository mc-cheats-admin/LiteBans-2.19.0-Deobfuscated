package litebans;

import com.google.common.util.concurrent.ThreadFactoryBuilder;
import java.io.File;
import java.util.Map;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;
import net.fabricmc.api.DedicatedServerModInitializer;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;
import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.ModContainer;
import net.minecraft.server.MinecraftServer;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConfigYmlHandler
implements DedicatedServerModInitializer,
PlatformPlugin {
    private static final Logger g;
    private FabricModJsonHandler LiteBansModule_194;
    private java.util.logging.Logger LiteBansModule_31;
    private ModContainer e;
    private LiteBansModule_39 GnuSparseMapHandler;
    private final LiteBansCore AsyncBackgroundTask_5 = new LiteBansCore(this);
    private LiteBansModule_98 LiteBansModule_240;
    private boolean c = false;
    @Override
    public void m() {
        this.GnuSparseMapHandler.BaseCoreGenericHandler();
    }

    @Override
    public DatabaseService LiteBansModule_240() {
        return this.AsyncBackgroundTask_5.BroadcastService;
    }

    @Override
    public PluginModule[] Utf8Handler_2() {
        return this.AsyncBackgroundTask_5.GnuSparseMapHandler();
    }

    @Override
    public void AsyncBackgroundTask_5() {
        this.AsyncBackgroundTask_5.i();
    }

    @Override
    public boolean BaseCoreGenericHandler(PluginModule module) {
        boolean flag = module.AsyncBackgroundTask_5();
        if (flag) {
            if (module instanceof LiteBansModule_430) {
                this.plugin((ConfigurationManager)module);
            }
            if (module instanceof LiteBansModule_199) {
                this.plugin((CommandManager)module);
}
        return flag;
    }

    @Override
    public StackTraceAnalyzer LiteBansModule_194() {
        return this.AsyncBackgroundTask_5.Utf8Handler_2;
    }

    @Override
    public CommandManager z() {
        return this.AsyncBackgroundTask_5.e;
    }

    @Override
    public void BaseCoreGenericHandler(CommandManager commandManager) {
        this.AsyncBackgroundTask_5.e = commandManager;
    }

    @Override
    public ConfigurationManager LiteBansModule_31() {
        return this.AsyncBackgroundTask_5.LiteBansModule_194;
    }

    @Override
    public CommandSenderWrapper HoverTextFormatter() {
        return this.AsyncBackgroundTask_5.g;
    }

    @Override
    public PluginModule BaseCoreGenericHandler(Class clazz) {
        return this.AsyncBackgroundTask_5.LiteBansModule_31(clazz);
    }

    @Override
    public PluginModule LiteBansModule_31(Class clazz) {
        return this.AsyncBackgroundTask_5.BaseCoreGenericHandler(clazz);
    }

    @Override
    public PluginModule[] PunishmentTableService() {
        return this.AsyncBackgroundTask_5.AsyncBackgroundTask_5;
    }

    @Override
    public String getName() {
        return this.LiteBansModule_194.AsyncBackgroundTask_5();
    }

    @Override
    public int BaseCoreGenericHandler() {
        return this.AsyncBackgroundTask_5.LiteBansModule_401();
    }

    @Override
    public CommandSenderWrapper[] q() {
        return this.AsyncBackgroundTask_5.LiteBansModule_31();
    }

    @Override
    public Map DatabaseMonitorService() {
        return this.AsyncBackgroundTask_5.LiteBansModule_31;
    }

    @Override
    public ThreadPoolExecutor LiteBansModule_433() {
        ThreadPoolExecutor threadPoolExecutor = this.AsyncBackgroundTask_5.LiteBansModule_240;
        if ((threadPoolExecutor == null || threadPoolExecutor.isShutdown()) && (this.AsyncBackgroundTask_5.GnuSparseMapHandler.get() || this.AsyncBackgroundTask_5.m.get())) {
            ThreadFactoryBuilder threadFactoryBuilder = this.AsyncBackgroundTask_5.AsyncBackgroundTask_5();
            return this.AsyncBackgroundTask_5.BaseCoreGenericHandler(threadFactoryBuilder);
        }
        return threadPoolExecutor;
    }

    @Override
    public long g() {
        return this.AsyncBackgroundTask_5.LiteBansModule_240();
    }

    @Override
    public final byte AsyncBackgroundTask_22() {
        return 3;
    }

    @Override
    public LiteBansModule_158 i() {
        return new NullHandler(this);
    }

    @Override
    public String e() {
        return this.LiteBansModule_194.LiteBansModule_31();
    }

    @Override
    public CommandSenderWrapper CommandThrottleService() {
        return this.LiteBansModule_240.BaseCoreGenericHandler(this.LiteBansModule_240.LiteBansModule_194(), () -> this.LiteBansModule_240.LiteBansModule_194());
    }

    @Override
    public DatabaseService BroadcastService() {
        DatabaseService gn_02;
        this.AsyncBackgroundTask_5.BroadcastService = gn_02 = this.plugin(new File(this.getDataFolder(), "config.yml"));
        return gn_02;
    }

    @Override
    public File getDataFolder() {
        return FabricLoader.getInstance().getConfigDir().resolve(this.LiteBansModule_194.c()).toFile();
    }

    public int LiteBansModule_31() {
        return this.LiteBansModule_240.LiteBansModule_31();
    }

    @Override
    public java.util.logging.Logger getLogger() {
        return this.LiteBansModule_31;
    }

    @Override
    public void GnuSparseMapHandler() {
        this.GnuSparseMapHandler = new LiteBansModule_39();
        this.AsyncBackgroundTask_5.Utf8Handler_2();
    }

    @Override
    public boolean AsyncBackgroundTask_21() {
        return this.AsyncBackgroundTask_5.n.get();
    }

    @Override
    public boolean isEnabled() {
        return this.AsyncBackgroundTask_5.GnuSparseMapHandler.get();
    }

    @Override
    public boolean n() {
        return this.AsyncBackgroundTask_5.PunishmentTableService;
    }

    @Override
    public DatabaseService BaseCoreGenericHandler(File file) {
        return this.AsyncBackgroundTask_5.i.BaseCoreGenericHandler(this, file);
    }

    public ScheduledExecutorService c() {
        return this.GnuSparseMapHandler.BaseCoreGenericHandler(this.AsyncBackgroundTask_5);
    }

    @Override
    public boolean c() {
        return this.LiteBansModule_240.BaseCoreGenericHandler();
    }

    @Override
    public boolean ServerSyncService() {
        return this.LiteBansModule_240.e();
    }

    @Override
    public boolean LiteBansModule_401() {
        return false;
    }

    public void onInitializeServer() {
        this.LiteBansModule_194 = new FabricModJsonHandler(StackTraceAnalyzer.BaseCoreGenericHandler(FabricModJsonHandler.class));
        String string = this.LiteBansModule_194.c();
        this.LiteBansModule_31 = new WarningHandler(LoggerFactory.getLogger((String)string), string);
        this.LiteBansModule_240 = BytecodeReflectionHelper.LiteBansModule_31(this, ((ModContainer)FabricLoader.getInstance().getModContainer("fabric-api").get()).getMetadata().getVersion().getFriendlyString().split("\\+")[1]);
        ServerLifecycleEvents.SERVER_STARTING.register(this::BaseCoreGenericHandler);
        ServerLifecycleEvents.SERVER_STOPPING.register(this::LiteBansModule_31);
        this.AsyncBackgroundTask_5.c();
    }

    private final void BaseCoreGenericHandler(MinecraftServer minecraftServer) {
        this.LiteBansModule_240.BaseCoreGenericHandler(minecraftServer);
        this.e = FabricLoader.getInstance().getModContainer(this.LiteBansModule_194.c()).orElse(null);
        try {
            Class.forName("me.lucko.fabric.api.permissions.v0.Permissions");
            this.c = true;
        }
        catch (ClassNotFoundException classNotFoundException) {
            // empty catch block
        }
        this.GnuSparseMapHandler();
    }

    private final void LiteBansModule_31(MinecraftServer minecraftServer) {
        this.AsyncBackgroundTask_5();
    }

    @Override
    public void LiteBansModule_31(@Nullable LiteBansModule_175[] em_0Array) {
        if (em_0Array == null) {
            return;
        }
        for (LiteBansModule_175 em_02 : em_0Array) {
            if (!(em_02 instanceof LiteBansModule_51)) continue;
            LiteBansModule_51 bk_02 = (LiteBansModule_51)em_02;
            bk_02.BaseCoreGenericHandler();
}

    @Override
    public boolean BaseCoreGenericHandler(String string, Supplier supplier) {
        return this.AsyncBackgroundTask_5.BaseCoreGenericHandler(string, supplier);
    }

    @Override
    public void c(Runnable runnable) {
        this.LiteBansModule_240.BaseCoreGenericHandler(runnable);
    }

    @Override
    public void LiteBansModule_31(Runnable runnable, long l3) {
        this.plugin(() -> this.c(runnable), l3);
    }

    @Override
    public void BaseCoreGenericHandler(Runnable runnable) {
        this.LiteBansModule_433().execute(runnable);
    }

    @Override
    public void BaseCoreGenericHandler(Runnable runnable, long l3) {
        if (l3 < 0L) {
            throw new IllegalArgumentException("Invalid delay " + l3);
        }
        try {
            this.c().schedule(runnable, l3 * 50L, TimeUnit.MILLISECONDS);
        }
        catch (RejectedExecutionException rejectedExecutionException) {
            this.plugin(rejectedExecutionException);
}

    @Override
    public void LiteBansModule_31(Runnable runnable) {
        this.plugin(runnable);
    }

    @Override
    public void BaseCoreGenericHandler(Runnable runnable, long l3, long l5) {
        this.LiteBansModule_31(() -> this.c(runnable), l3, l5);
    }

    @Override
    public void LiteBansModule_31(Runnable runnable, long l3, long l5) {
        try {
            this.c().scheduleAtFixedRate(runnable, l3 * 50L, l5 * 50L, TimeUnit.MILLISECONDS);
        }
        catch (RejectedExecutionException rejectedExecutionException) {
            this.plugin(rejectedExecutionException);
}

    private final void BaseCoreGenericHandler(Exception exception) {
        if (this.AsyncBackgroundTask_5.m.get()) {
            this.getLogger().warning("Startup was cancelled");
            return;
        }
        throw exception;
    }

    @Override
    public void BaseCoreGenericHandler(String string) {
        DatabaseService.BaseCoreGenericHandler(this.getDataFolder(), string, null, false);
    }

    @Override
    public void BaseCoreGenericHandler(LiteBansModule_417 ln2) {
        this.AsyncBackgroundTask_5.i = ln2;
    }

    @Override
    public void BaseCoreGenericHandler(ConfigurationManager j_02) {
        this.AsyncBackgroundTask_5.LiteBansModule_194 = j_02;
    }

    @Override
    public void r() {
    }

    @Override
    public void BaseCoreGenericHandler(@Nullable LiteBansModule_175[] em_0Array) {
    }

    @Override
    public CommandSenderWrapper LiteBansModule_31(Object targetObj) {
        return this.LiteBansModule_240.c(targetObj);
    }

    @Override
    public CommandSenderWrapper BaseCoreGenericHandler(Object targetObj) {
        return this.LiteBansModule_240.LiteBansModule_31(targetObj);
    }

    public ModContainer LiteBansModule_240() {
        return this.e;
    }

    public LiteBansCore BaseCoreGenericHandler() {
        return this.AsyncBackgroundTask_5;
    }

    public LiteBansModule_98 g() {
        return this.LiteBansModule_240;
    }

    public boolean AsyncBackgroundTask_5() {
        return this.c;
    }

    static {
        ConfigYmlHandler.e();
        g = LoggerFactory.getLogger(ConfigYmlHandler.class);
    }

    private static final void e() {
        i = new String[]{"config.yml", "fabric-api", "\\+", "me.lucko.fabric.api.permissions.v0.Permissions", "Invalid delay ", "Startup was cancelled"};
}

