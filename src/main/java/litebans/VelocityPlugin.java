package litebans;

import com.google.common.util.concurrent.ThreadFactoryBuilder;
import com.google.inject.Inject;
import com.velocitypowered.api.command.CommandSource;
import com.velocitypowered.api.event.Subscribe;
import com.velocitypowered.api.event.proxy.ProxyInitializeEvent;
import com.velocitypowered.api.event.proxy.ProxyShutdownEvent;
import com.velocitypowered.api.plugin.Plugin;
import com.velocitypowered.api.plugin.annotation.DataDirectory;
import com.velocitypowered.api.proxy.Player;
import com.velocitypowered.api.proxy.ProxyServer;
import com.velocitypowered.api.scheduler.ScheduledTask;
import com.velocitypowered.api.scheduler.TaskStatus;
import java.io.File;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;
import org.slf4j.Logger;

@Plugin(SQLiteDriverHandler_4="litebans", name="LiteBans", version="2.19.0", url="https://www.spigotmc.org/resources/litebans.3715/", description="Lightweight banning plugin with full UUID ", authors={"Ruan"})
public class VelocityPlugin
implements PlatformPlugin {
    private final LiteBansCore LiteBansModule_195 = new LiteBansCore(this);
    public final ProxyServer c;
    private final WarningHandler e;
    private final Path AsyncBackgroundTask_5;
    private final List g = Collections.synchronizedList(new ArrayList());
        @Inject
    public VelocityPlugin(ProxyServer proxyServer, Logger logger, @DataDirectory Path path) {
        this.c = proxyServer;
        this.e = new WarningHandler(logger, this.getName());
        this.AsyncBackgroundTask_5 = path;
    }

    @Subscribe
    public void BaseCoreGenericHandler(ProxyInitializeEvent proxyInitializeEvent) {
        this.GnuSparseMapHandler();
    }

    @Subscribe
    public void BaseCoreGenericHandler(ProxyShutdownEvent proxyShutdownEvent) {
        this.AsyncBackgroundTask_5();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void m() {
        this.c();
        List list = this.g;
        synchronized (list) {
            this.g.forEach(ScheduledTask::cancel);
            this.g.clear();
        }
    }

    @Override
    public DatabaseService LiteBansModule_241() {
        return this.LiteBansModule_195.BroadcastService;
    }

    @Override
    public PluginModule[] Utf8Handler_2() {
        return this.LiteBansModule_195.GnuSparseMapHandler();
    }

    @Override
    public void AsyncBackgroundTask_5() {
        this.LiteBansModule_195.i();
    }

    @Override
    public boolean BaseCoreGenericHandler(PluginModule module) {
        boolean flag = module.AsyncBackgroundTask_5();
        if (flag) {
            if (module instanceof LiteBansModule_433) {
                this.plugin((ConfigurationManager)module);
            }
            if (module instanceof LiteBansModule_250) {
                this.plugin((CommandManager)module);
            }
        }
        return flag;
    }

    @Override
    public StackTraceAnalyzer LiteBansModule_195() {
        return this.LiteBansModule_195.Utf8Handler_2;
    }

    @Override
    public CommandManager z() {
        return this.LiteBansModule_195.e;
    }

    @Override
    public ConfigurationManager LiteBansModule_31() {
        return this.LiteBansModule_195.LiteBansModule_195;
    }

    @Override
    public void BaseCoreGenericHandler(CommandManager commandManager) {
        this.LiteBansModule_195.e = commandManager;
    }

    @Override
    public CommandSenderWrapper HoverTextFormatter() {
        return this.LiteBansModule_195.g;
    }

    @Override
    public CommandSenderWrapper CommandThrottleService() {
        return this.plugin(this.c.getConsoleCommandSource());
    }

    @Override
    public DatabaseService BroadcastService() {
        DatabaseService gn_02;
        this.LiteBansModule_195.BroadcastService = gn_02 = this.plugin(new File(this.getDataFolder(), "config.yml"));
        return gn_02;
    }

    @Override
    public File getDataFolder() {
        return this.AsyncBackgroundTask_5.toFile();
    }

    @Override
    public java.util.logging.Logger getLogger() {
        return this.e;
    }

    @Override
    public PluginModule BaseCoreGenericHandler(Class clazz) {
        return this.LiteBansModule_195.LiteBansModule_31(clazz);
    }

    @Override
    public PluginModule LiteBansModule_31(Class clazz) {
        return this.LiteBansModule_195.BaseCoreGenericHandler(clazz);
    }

    @Override
    public PluginModule[] PunishmentTableService() {
        return this.LiteBansModule_195.AsyncBackgroundTask_5;
    }

    @Override
    public String getName() {
        return "LiteBans";
    }

    @Override
    public int BaseCoreGenericHandler() {
        return this.LiteBansModule_195.LiteBansModule_403();
    }

    @Override
    public CommandSenderWrapper[] q() {
        return this.LiteBansModule_195.LiteBansModule_31();
    }

    @Override
    public Map DatabaseMonitorService() {
        return this.LiteBansModule_195.LiteBansModule_31;
    }

    @Override
    public ThreadPoolExecutor LiteBansModule_435() {
        ThreadPoolExecutor threadPoolExecutor = this.LiteBansModule_195.LiteBansModule_241;
        if ((threadPoolExecutor == null || threadPoolExecutor.isShutdown()) && (this.LiteBansModule_195.GnuSparseMapHandler.get() || this.LiteBansModule_195.m.get())) {
            ThreadFactoryBuilder threadFactoryBuilder = this.LiteBansModule_195.AsyncBackgroundTask_5();
            return this.LiteBansModule_195.BaseCoreGenericHandler(threadFactoryBuilder);
        }
        return threadPoolExecutor;
    }

    @Override
    public long g() {
        return this.LiteBansModule_195.LiteBansModule_241();
    }

    @Override
    public byte AsyncBackgroundTask_22() {
        return 2;
    }

    @Override
    public LiteBansModule_159 i() {
        return new LiteBansModule_91(this);
    }

    @Override
    public String e() {
        return "2.19.0";
    }

    @Override
    public void GnuSparseMapHandler() {
        this.LiteBansModule_195.c();
        this.LiteBansModule_195.Utf8Handler_2();
    }

    @Override
    public boolean isEnabled() {
        return this.LiteBansModule_195.PunishmentTableService;
    }

    @Override
    public boolean n() {
        return this.LiteBansModule_195.PunishmentTableService;
    }

    @Override
    public boolean AsyncBackgroundTask_21() {
        return this.LiteBansModule_195.n.get();
    }

    @Override
    public boolean c() {
        return this.c.getConfiguration().isOnlineMode();
    }

    @Override
    public boolean ServerSyncService() {
        return false;
    }

    @Override
    public boolean LiteBansModule_403() {
        return true;
    }

    @Override
    public DatabaseService BaseCoreGenericHandler(File file) {
        return this.LiteBansModule_195.i.BaseCoreGenericHandler(this, file);
    }

    @Override
    public void LiteBansModule_31(LiteBansModule_176[] em_0Array) {
        for (LiteBansModule_176 em_02 : em_0Array) {
            this.c.getEventManager().register((Object)this, (Object)em_02);
        }
    }

    @Override
    public boolean BaseCoreGenericHandler(String string, Supplier supplier) {
        return this.LiteBansModule_195.BaseCoreGenericHandler(string, supplier);
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
        this.LiteBansModule_435().execute(runnable);
    }

    @Override
    public void BaseCoreGenericHandler(Runnable runnable, long l3) {
        if (l3 < 0L) {
            throw new IllegalArgumentException("Invalid delay: " + l3);
        }
        this.c();
        this.g.add(this.c.getScheduler().buildTask((Object)this, runnable).delay(l3 * 50L, TimeUnit.MILLISECONDS).schedule());
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
        this.c();
        this.g.add(this.c.getScheduler().buildTask((Object)this, runnable).delay(l3 * 50L, TimeUnit.MILLISECONDS).repeat(l5 * 50L, TimeUnit.MILLISECONDS).schedule());
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void c() {
        List list = this.g;
        synchronized (list) {
            this.g.removeIf(scheduledTask -> scheduledTask.status() != TaskStatus.SCHEDULED);
        }
    }

    @Override
    public void BaseCoreGenericHandler(String string) {
        DatabaseService.BaseCoreGenericHandler(this.getDataFolder(), string, null, false);
    }

    @Override
    public void BaseCoreGenericHandler(LiteBansModule_419 ln2) {
        this.LiteBansModule_195.i = ln2;
    }

    @Override
    public void BaseCoreGenericHandler(ConfigurationManager j_02) {
        this.LiteBansModule_195.LiteBansModule_195 = j_02;
    }

    @Override
    public void r() {
        this.c.getEventManager().unregisterListeners((Object)this);
    }

    @Override
    public void BaseCoreGenericHandler(LiteBansModule_176[] em_0Array) {
        for (LiteBansModule_176 em_02 : em_0Array) {
            this.c.getEventManager().unregisterListener((Object)this, (Object)em_02);
        }
    }

    @Override
    public CommandSenderWrapper LiteBansModule_31(Object targetObj) {
        if (!(targetObj instanceof CommandSource)) {
            if (targetObj instanceof CommandSenderWrapper) {
                return (CommandSenderWrapper)this.LiteBansModule_195.LiteBansModule_31.remove(((CommandSenderWrapper)targetObj).i());
            }
            throw new IllegalArgumentException();
        }
        String string = "[Console]";
        if (targetObj instanceof Player) {
            string = ((Player)targetObj).getUsername();
        }
        return (CommandSenderWrapper)this.LiteBansModule_195.LiteBansModule_31.remove(string);
    }

    @Override
    public CommandSenderWrapper BaseCoreGenericHandler(Object targetObj) {
        CommandSenderWrapper sender;
        if (!(targetObj instanceof CommandSource)) {
            if (targetObj instanceof CommandSenderWrapper) {
                return (CommandSenderWrapper)targetObj;
            }
            throw new IllegalArgumentException();
        }
        CommandSource commandSource = (CommandSource)targetObj;
        Map map = this.LiteBansModule_195.LiteBansModule_31;
        String string = "[Console]";
        if (commandSource instanceof Player) {
            string = ((Player)commandSource).getUsername();
        }
        if ((sender = (CommandSenderWrapper)map.get(string)) == null || sender.c() != commandSource) {
            sender = new LiteBansModule_286(this, commandSource);
            this.LiteBansModule_195.LiteBansModule_195();
            map.put(string, sender);
        }
        return sender;
    }

    public LiteBansCore LiteBansModule_31() {
        return this.LiteBansModule_195;
    }

    private static final void BaseCoreGenericHandler() {
        LiteBansModule_31 = new String[]{"config.yml", "LiteBans", "2.19.0", "Invalid delay: ", "[Console]", "[Console]"};

    static {
        VelocityPlugin.BaseCoreGenericHandler();
