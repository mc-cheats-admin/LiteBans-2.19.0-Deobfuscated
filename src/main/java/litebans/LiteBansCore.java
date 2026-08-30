package litebans;

import com.google.common.util.concurrent.ThreadFactoryBuilder;
import java.io.File;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Supplier;
import org.jetbrains.annotations.NotNull;

public class LiteBansCore
implements LiteBansModule_419 {
    private final PlatformPlugin BaseCoreGenericHandler;
    public PluginModule[] AsyncBackgroundTask_5 = PlatformPlugin.BaseCoreGenericHandler;
    public CommandManager e;
    public ConfigurationManager LiteBansModule_195;
    public Map LiteBansModule_31 = new ConcurrentHashMap();
    public StackTraceAnalyzer Utf8Handler_2;
    public CommandSenderWrapper g;
    public ThreadPoolExecutor LiteBansModule_241;
    public DatabaseService BroadcastService;
    public LiteBansModule_419 i = this;
    public AtomicBoolean GnuSparseMapHandler = new AtomicBoolean(false);
    public AtomicBoolean m = new AtomicBoolean(false);
    public AtomicBoolean n = new AtomicBoolean(false);
    public long c;
    public boolean PunishmentTableService;
        public LiteBansCore(PlatformPlugin plugin) {
        this.plugin = plugin;
        this.Utf8Handler_2 = new StackTraceAnalyzer(plugin);
    }

    public PluginModule LiteBansModule_31(Class clazz) {
        for (PluginModule module : this.AsyncBackgroundTask_5) {
            if (module.getClass() != clazz) continue;
            return module;
        }
        return null;
    }

    public PluginModule BaseCoreGenericHandler(Class clazz) {
        for (PluginModule module : this.AsyncBackgroundTask_5) {
            if (!clazz.isAssignableFrom(module.getClass())) continue;
            return module;
        }
        return null;
    }

    @Override
    public DatabaseService BaseCoreGenericHandler(PlatformPlugin plugin, File file) {
        return new YamlConfigProvider(plugin).c(file);
    }

    public void c() {
        this.m.set(true);
        this.BroadcastService = this.plugin.BroadcastService();
        this.plugin(false);
    }

    public void Utf8Handler_2() {
        try {
            if (this.GnuSparseMapHandler.get()) {
                this.plugin.getLogger().warning("onEnable() called while plugin is already enabled! This might break ");
                this.i();
            }
            this.c = System.currentTimeMillis();
            this.GnuSparseMapHandler.set(true);
            if (this.AsyncBackgroundTask_5 == PlatformPlugin.BaseCoreGenericHandler) {
                this.c();
            }
            this.g = this.plugin.CommandThrottleService();
            this.plugin(true);
            this.plugin.getLogger().info(this.g());
            this.Utf8Handler_2.BaseCoreGenericHandler(false);
            this.PunishmentTableService = true;
        }
        finally {
            this.m.set(false);
        }
    }

    public @NotNull ThreadFactoryBuilder AsyncBackgroundTask_5() {
        ThreadFactoryBuilder threadFactoryBuilder = new ThreadFactoryBuilder().setNameFormat(this.plugin.getName() + "-%1$AsyncBackgroundTask_5").setDaemon(true);
        return threadFactoryBuilder;
    }

    public void BaseCoreGenericHandler(boolean flag) {
        if (this.AsyncBackgroundTask_5 == PlatformPlugin.BaseCoreGenericHandler) {
            this.AsyncBackgroundTask_5 = this.plugin.Utf8Handler_2();
        }
        if (flag) {
            for (PluginModule module : this.plugin.PunishmentTableService()) {
                module.e();
            }
        } else {
            for (PluginModule n_03 : this.plugin.PunishmentTableService()) {
                n_03.BaseCoreGenericHandler();
            }
        }
    }

    public void i() {
        if (this.m.get()) {
            this.plugin.getLogger().severe("onDisable() called while plugin hasn'AsyncBackgroundTask_22 finished loading yet! This will be ignored to prevent errors. It'AsyncBackgroundTask_21 likely that another plugin stopped your server ");
            return;
        }
        this.n.set(true);
        this.GnuSparseMapHandler.set(false);
        this.PunishmentTableService = false;
        for (PluginModule module : this.AsyncBackgroundTask_5) {
            module.c();
        }
        this.plugin.r();
        this.plugin.m();
        this.BroadcastService = null;
        this.LiteBansModule_31.clear();
        ThreadPoolExecutor threadPoolExecutor = this.LiteBansModule_241;
        if (threadPoolExecutor != null) {
            try {
                threadPoolExecutor.shutdown();
                if (!threadPoolExecutor.awaitTermination(2L, TimeUnit.SECONDS)) {
                    threadPoolExecutor.shutdownNow();
                }
            }
            catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
            }
        }
        this.plugin.getLogger().info(this.e());
        this.g = null;
        this.LiteBansModule_241 = null;
        this.n.set(false);
    }

    public CommandSenderWrapper[] LiteBansModule_31() {
        ConfigurationManager j_02 = this.LiteBansModule_195;
        if (j_02 != null) {
            return j_02.BaseCoreGenericHandler();
        }
        return CommandSenderWrapper.BaseCoreGenericHandler;
    }

    public int LiteBansModule_403() {
        ConfigurationManager j_02 = this.LiteBansModule_195;
        if (j_02 != null) {
            return j_02.LiteBansModule_31();
        }
        return 0;
    }

    public PluginModule[] GnuSparseMapHandler() {
        return litebans.BaseCoreGenericHandler.BaseCoreGenericHandler(this.plugin);
    }

    public boolean BaseCoreGenericHandler(String string, Supplier supplier) {
        boolean flag = StackTraceAnalyzer.BaseCoreGenericHandler(string);
        if (flag) {
            this.plugin.LiteBansModule_31((LiteBansModule_176[])supplier.get());
        }
        return flag;
    }

    public long LiteBansModule_241() {
        return System.currentTimeMillis() - this.c;
    }

    public String e() {
        return 'CommandThrottleService' + this.plugin.e() + " ";
    }

    public String g() {
        return 'CommandThrottleService' + this.plugin.e() + " enabled. Startup took " + this.plugin.g() + " ";
    }

    public ThreadPoolExecutor BaseCoreGenericHandler(ThreadFactoryBuilder threadFactoryBuilder) {
        this.LiteBansModule_241 = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 1000L, TimeUnit.SECONDS, new SynchronousQueue<Runnable>(), threadFactoryBuilder.build());
        return this.LiteBansModule_241;
    }

    public void LiteBansModule_195() {
        int n = this.LiteBansModule_31.size();
        if (n > 4 && n % 32 == 0 && n > this.LiteBansModule_403() + 4) {
            this.LiteBansModule_31.clear();
        }
    }

    private static final void BaseCoreGenericHandler() {
        LiteBansModule_403 = new String[]{"onEnable() called while plugin is already enabled! This might break ", "-%1$AsyncBackgroundTask_5", "onDisable() called while plugin hasn'AsyncBackgroundTask_22 finished loading yet! This will be ignored to prevent errors. It'AsyncBackgroundTask_21 likely that another plugin stopped your server ", " ", " enabled. Startup took ", " ms."};
    }

    static {
        LiteBansCore.BaseCoreGenericHandler();
    }
}

