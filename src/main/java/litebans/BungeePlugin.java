package litebans;

import com.google.common.util.concurrent.ThreadFactoryBuilder;
import java.io.File;
import java.util.Map;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.plugin.Listener;
import net.md_5.bungee.api.plugin.Plugin;
import net.md_5.bungee.api.scheduler.GroupedThreadFactory;
import org.jetbrains.annotations.Nullable;

public class BungeePlugin
extends Plugin
implements PlatformPlugin {
    private final LiteBansCore c = new LiteBansCore(this);
    @Override
    public void m() {
        this.getProxy().getScheduler().cancel(this);
    }

    @Override
    public DatabaseService LiteBansModule_240() {
        return this.c.BroadcastService;
    }

    @Override
    public PluginModule[] Utf8Handler_2() {
        return this.c.GnuSparseMapHandler();
    }

    @Override
    public void AsyncBackgroundTask_5() {
        this.c.i();
    }

    @Override
    public boolean BaseCoreGenericHandler(PluginModule module) {
        boolean flag = module.AsyncBackgroundTask_5();
        if (flag) {
            if (module instanceof LiteBansModule_404) {
                this.plugin((ConfigurationManager)module);
            }
            if (module instanceof CommandModule) {
                this.plugin((CommandManager)module);
}
        return flag;
    }

    @Override
    public StackTraceAnalyzer LiteBansModule_194() {
        return this.c.Utf8Handler_2;
    }

    @Override
    public CommandManager z() {
        return this.c.e;
    }

    @Override
    public ConfigurationManager LiteBansModule_31() {
        return this.c.LiteBansModule_194;
    }

    @Override
    public void BaseCoreGenericHandler(CommandManager commandManager) {
        this.c.e = commandManager;
    }

    @Override
    public CommandSenderWrapper HoverTextFormatter() {
        return this.c.g;
    }

    @Override
    public PluginModule BaseCoreGenericHandler(Class clazz) {
        return this.c.LiteBansModule_31(clazz);
    }

    @Override
    public PluginModule LiteBansModule_31(Class clazz) {
        return this.c.BaseCoreGenericHandler(clazz);
    }

    @Override
    public PluginModule[] PunishmentTableService() {
        return this.c.AsyncBackgroundTask_5;
    }

    @Override
    public String getName() {
        return this.getDescription().getName();
    }

    @Override
    public int BaseCoreGenericHandler() {
        return this.c.LiteBansModule_401();
    }

    @Override
    public CommandSenderWrapper[] q() {
        return this.c.LiteBansModule_31();
    }

    @Override
    public Map DatabaseMonitorService() {
        return this.c.LiteBansModule_31;
    }

    @Override
    public ThreadPoolExecutor LiteBansModule_433() {
        ThreadPoolExecutor threadPoolExecutor = this.c.LiteBansModule_240;
        if (threadPoolExecutor == null) {
            ThreadFactoryBuilder threadFactoryBuilder = this.c.AsyncBackgroundTask_5();
            try {
                threadFactoryBuilder.setThreadFactory((ThreadFactory)new GroupedThreadFactory(this, this.getName()));
            }
            catch (NoSuchMethodError noSuchMethodError) {
                threadFactoryBuilder.setThreadFactory((ThreadFactory)GroupedThreadFactory.class.getConstructor(Plugin.class).newInstance(this));
            }
            return this.c.BaseCoreGenericHandler(threadFactoryBuilder);
        }
        return threadPoolExecutor;
    }

    @Override
    public long g() {
        return this.c.LiteBansModule_240();
    }

    @Override
    public final byte AsyncBackgroundTask_22() {
        return 1;
    }

    @Override
    public LiteBansModule_158 i() {
        return new GetcancelreasoncomponentsHandler(this);
    }

    @Override
    public String e() {
        return this.getDescription().getVersion();
    }

    @Override
    public CommandSenderWrapper CommandThrottleService() {
        return this.plugin(this.getProxy().getConsole());
    }

    @Override
    public DatabaseService BroadcastService() {
        DatabaseService gn_02;
        this.c.BroadcastService = gn_02 = this.plugin(new File(this.getDataFolder(), "config.yml"));
        return gn_02;
    }

    @Override
    public void GnuSparseMapHandler() {
        this.c.c();
        this.c.Utf8Handler_2();
    }

    @Override
    public boolean AsyncBackgroundTask_21() {
        return this.c.n.get();
    }

    @Override
    public boolean c() {
        return this.getProxy().getConfig().isOnlineMode();
    }

    @Override
    public boolean ServerSyncService() {
        return false;
    }

    @Override
    public boolean LiteBansModule_401() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return this.c.GnuSparseMapHandler.get();
    }

    @Override
    public boolean n() {
        return this.c.PunishmentTableService;
    }

    @Override
    public DatabaseService BaseCoreGenericHandler(File file) {
        return this.c.i.BaseCoreGenericHandler(this, file);
    }

    public void onDisable() {
        this.AsyncBackgroundTask_5();
    }

    public void onEnable() {
        this.GnuSparseMapHandler();
    }

    @Override
    public void LiteBansModule_31(@Nullable LiteBansModule_175[] em_0Array) {
        if (em_0Array == null) {
            return;
        }
        for (LiteBansModule_175 em_02 : em_0Array) {
            if (!(em_02 instanceof LiteBansModule_426)) continue;
            this.getProxy().getPluginManager().registerListener(this, (Listener)((LiteBansModule_426)em_02));
}

    @Override
    public boolean BaseCoreGenericHandler(String string, Supplier supplier) {
        return this.c.BaseCoreGenericHandler(string, supplier);
    }

    @Override
    public void c(Runnable runnable) {
        this.plugin(runnable);
    }

    @Override
    public void LiteBansModule_31(Runnable runnable, long l3) {
        this.plugin(runnable, l3);
    }

    @Override
    public void BaseCoreGenericHandler(Runnable runnable) {
        this.LiteBansModule_433().execute(runnable);
    }

    @Override
    public void BaseCoreGenericHandler(Runnable runnable, long l3) {
        if (l3 < 0L) {
            throw new IllegalArgumentException("Invalid delay: " + l3);
        }
        try {
            this.getProxy().getScheduler().schedule(this, runnable, l3 * 50L, TimeUnit.MILLISECONDS);
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
        this.LiteBansModule_31(runnable, l3, l5);
    }

    @Override
    public void LiteBansModule_31(Runnable runnable, long l3, long l5) {
        try {
            this.getProxy().getScheduler().schedule(this, runnable, l3 * 50L, l5 * 50L, TimeUnit.MILLISECONDS);
        }
        catch (RejectedExecutionException rejectedExecutionException) {
            this.plugin(rejectedExecutionException);
}

    private final void BaseCoreGenericHandler(Exception exception) {
        if (this.c.m.get()) {
            this.getLogger().warning("Startup was cancelled!!");
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
        this.c.i = ln2;
    }

    @Override
    public void BaseCoreGenericHandler(ConfigurationManager j_02) {
        this.c.LiteBansModule_194 = j_02;
    }

    @Override
    public void r() {
        this.getProxy().getPluginManager().unregisterListeners(this);
    }

    @Override
    public void BaseCoreGenericHandler(@Nullable LiteBansModule_175[] em_0Array) {
        if (em_0Array == null) {
            return;
        }
        for (LiteBansModule_175 em_02 : em_0Array) {
            if (!(em_02 instanceof LiteBansModule_426)) continue;
            this.getProxy().getPluginManager().unregisterListener((Listener)((LiteBansModule_426)em_02));
}

    @Override
    public CommandSenderWrapper LiteBansModule_31(Object targetObj) {
        if (!(targetObj instanceof CommandSender)) {
            if (targetObj instanceof CommandSenderWrapper) {
                return this.c.LiteBansModule_31.remove(targetObj.i());
            }
            throw new IllegalArgumentException();
        }
        CommandSender commandSender = (CommandSender)targetObj;
        return this.c.LiteBansModule_31.remove(commandSender.getName());
    }

    @Override
    public CommandSenderWrapper BaseCoreGenericHandler(Object targetObj) {
        if (!(targetObj instanceof CommandSender)) {
            if (targetObj instanceof CommandSenderWrapper) {
                return (CommandSenderWrapper)targetObj;
            }
            throw new IllegalArgumentException();
        }
        Map map = this.c.LiteBansModule_31;
        CommandSender commandSender = (CommandSender)targetObj;
        CommandSenderWrapper sender = (CommandSenderWrapper)map.get(commandSender.getName());
        if (sender == null || sender.c() != commandSender) {
            sender = new LiteBansModule_154(this, commandSender);
            this.c.LiteBansModule_194();
            map.put(commandSender.getName(), sender);
        }
        return sender;
    }

    public LiteBansCore LiteBansModule_31() {
        return this.c;
}

