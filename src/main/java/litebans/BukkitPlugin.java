package litebans;

import com.google.common.util.concurrent.ThreadFactoryBuilder;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.event.HandlerList;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitScheduler;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class BukkitPlugin
extends JavaPlugin
implements PlatformPlugin {
    private final LiteBansCore AsyncBackgroundTask_5 = new LiteBansCore(this);
    private LiteBansModule_39 c = null;
    @Override
    public void m() {
        if (BukkitBlockAdapter.c()) {
            this.c.BaseCoreGenericHandler();
            return;
        }
        this.plugin().cancelTasks((Plugin)this);
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

    public @Nullable List onTabComplete(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String string, @NotNull String[] args) {
        CommandManager commandManager = this.z();
        if (commandManager == null) {
            return null;
        }
        LiteCommand command = commandManager.BaseCoreGenericHandler(command.getName());
        return commandManager.BaseCoreGenericHandler(command, string, this.plugin(commandSender), args);
    }

    @Override
    public boolean BaseCoreGenericHandler(PluginModule module) {
        boolean flag = module.AsyncBackgroundTask_5();
        if (flag) {
            if (module instanceof LiteBansModule_41) {
                this.plugin((LiteBansModule_41)module);
            }
            if (module instanceof LiteBansModule_367) {
                this.plugin((LiteBansModule_367)module);
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
    public ConfigurationManager LiteBansModule_31() {
        return this.AsyncBackgroundTask_5.LiteBansModule_194;
    }

    @Override
    public void BaseCoreGenericHandler(CommandManager commandManager) {
        this.AsyncBackgroundTask_5.e = commandManager;
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

    public BukkitScheduler BaseCoreGenericHandler() {
        return this.getServer().getScheduler();
    }

    @Override
    public ThreadPoolExecutor LiteBansModule_433() {
        return this.plugin(false);
    }

    public ThreadPoolExecutor BaseCoreGenericHandler(boolean flag) {
        ThreadPoolExecutor threadPoolExecutor = this.AsyncBackgroundTask_5.LiteBansModule_240;
        if ((threadPoolExecutor == null || threadPoolExecutor.isShutdown()) && (flag || this.AsyncBackgroundTask_5.GnuSparseMapHandler.get() || this.AsyncBackgroundTask_5.m.get())) {
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
        return 0;
    }

    @Override
    public LiteBansModule_158 i() {
        return new BungeecordHandler_2(this);
    }

    @Override
    public String e() {
        return this.getDescription().getVersion();
    }

    @Override
    public CommandSenderWrapper CommandThrottleService() {
        return this.plugin(this.getServer().getConsoleSender());
    }

    @Override
    public DatabaseService BroadcastService() {
        LiteBansModule_217 gc_02 = new LiteBansModule_217(this);
        gc_02.c(new File(this.getDataFolder(), "config.yml"));
        return gc_02;
    }

    @Override
    public void GnuSparseMapHandler() {
        this.AsyncBackgroundTask_5.c();
        this.AsyncBackgroundTask_5.Utf8Handler_2();
    }

    @Override
    public boolean n() {
        return this.AsyncBackgroundTask_5.PunishmentTableService;
    }

    @Override
    public boolean AsyncBackgroundTask_21() {
        return this.AsyncBackgroundTask_5.n.get();
    }

    @Override
    public boolean c() {
        return this.getServer().getOnlineMode();
    }

    @Override
    public boolean ServerSyncService() {
        if (BukkitBlockAdapter.c()) {
            return false;
        }
        return this.getServer().isPrimaryThread();
    }

    @Override
    public boolean LiteBansModule_401() {
        return false;
    }

    @Override
    public DatabaseService BaseCoreGenericHandler(File file) {
        return new LiteBansModule_217(this).c(file);
    }

    public boolean onCommand(CommandSender commandSender, Command command, String string, String[] args) {
        CommandManager commandManager = this.z();
        if (commandManager == null || !(commandManager instanceof LiteBansModule_41)) {
            this.getLogger().severe("No command manager found!");
            return true;
        }
        return ((LiteBansModule_41)commandManager).onCommand(commandSender, command, string, args);
    }

    public void onDisable() {
        this.AsyncBackgroundTask_5();
    }

    public void onEnable() {
        BukkitPlugin.loadConfig0();
        this.GnuSparseMapHandler();
    }

    public void onLoad() {
        this.plugin(true);
        if (BukkitBlockAdapter.c()) {
            this.c = new LiteBansModule_39();
        }
        AsyncBackgroundTask_6 de2 = new AsyncBackgroundTask_6(this);
        if (!this.AsyncBackgroundTask_5()) {
            this.LiteBansModule_31(de2);
        } else {
            de2.run();
}

    public boolean AsyncBackgroundTask_5() {
        return !StackTraceAnalyzer.BaseCoreGenericHandler("org.bukkit.entity.Llama");
    }

    @Override
    public void LiteBansModule_31(@Nullable LiteBansModule_175[] em_0Array) {
        if (em_0Array == null) {
            return;
        }
        for (LiteBansModule_175 em_02 : em_0Array) {
            if (!(em_02 instanceof LiteBansModule_88)) continue;
            this.getServer().getPluginManager().registerEvents((Listener)((LiteBansModule_88)em_02), (Plugin)this);
}

    @Override
    public boolean BaseCoreGenericHandler(String string, Supplier supplier) {
        return this.AsyncBackgroundTask_5.BaseCoreGenericHandler(string, supplier);
    }

    @Override
    public void c(Runnable runnable) {
        if (BukkitBlockAdapter.c()) {
            runnable.run();
            return;
        }
        this.plugin().runTask((Plugin)this, runnable);
    }

    @Override
    public void LiteBansModule_31(Runnable runnable, long l3) {
        if (BukkitBlockAdapter.c()) {
            this.plugin(runnable, l3);
            return;
        }
        this.plugin().runTaskLater((Plugin)this, runnable, l3);
    }

    @Override
    public void BaseCoreGenericHandler(Runnable runnable) {
        if (BukkitBlockAdapter.c()) {
            this.LiteBansModule_31(runnable);
            return;
        }
        this.plugin().runTaskAsynchronously((Plugin)this, runnable);
    }

    @Override
    public void BaseCoreGenericHandler(Runnable runnable, long l3) {
        if (BukkitBlockAdapter.c()) {
            this.c.BaseCoreGenericHandler(this.AsyncBackgroundTask_5).schedule(runnable, l3 * 50L, TimeUnit.MILLISECONDS);
            return;
        }
        this.plugin().runTaskLaterAsynchronously((Plugin)this, runnable, l3);
    }

    @Override
    public void LiteBansModule_31(Runnable runnable) {
        this.LiteBansModule_433().execute(runnable);
    }

    @Override
    public void BaseCoreGenericHandler(Runnable runnable, long l3, long l5) {
        if (BukkitBlockAdapter.c()) {
            this.LiteBansModule_31(runnable, l3, l5);
            return;
        }
        this.plugin().runTaskTimer((Plugin)this, runnable, l3, l5);
    }

    @Override
    public void LiteBansModule_31(Runnable runnable, long l3, long l5) {
        if (BukkitBlockAdapter.c()) {
            this.c.BaseCoreGenericHandler(this.AsyncBackgroundTask_5).scheduleAtFixedRate(runnable, l3 * 50L, l5 * 50L, TimeUnit.MILLISECONDS);
            return;
        }
        this.plugin().runTaskTimerAsynchronously((Plugin)this, runnable, l3, l5);
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
        if (!(j_02 instanceof LiteBansModule_367)) {
            throw new IllegalArgumentException();
        }
        this.AsyncBackgroundTask_5.LiteBansModule_194 = j_02;
    }

    @Override
    public void r() {
        HandlerList.unregisterAll((Plugin)this);
    }

    @Override
    public void BaseCoreGenericHandler(@Nullable LiteBansModule_175[] em_0Array) {
        if (em_0Array == null) {
            return;
        }
        for (LiteBansModule_175 em_02 : em_0Array) {
            if (!(em_02 instanceof LiteBansModule_88)) continue;
            HandlerList.unregisterAll((Listener)((LiteBansModule_88)em_02));
}

    @Override
    public CommandSenderWrapper LiteBansModule_31(Object object) {
        if (!(object instanceof CommandSender)) {
            if (object instanceof CommandSenderWrapper) {
                return (CommandSenderWrapper)this.AsyncBackgroundTask_5.LiteBansModule_31.remove(((CommandSenderWrapper)object).i());
            }
            throw new IllegalArgumentException(object == null ? "null" : object.getClass().getName());
        }
        CommandSender commandSender = (CommandSender)object;
        return (CommandSenderWrapper)this.AsyncBackgroundTask_5.LiteBansModule_31.remove(commandSender.getName());
    }

    @Override
    public CommandSenderWrapper BaseCoreGenericHandler(Object object) {
        if (!(object instanceof CommandSender)) {
            if (object instanceof CommandSenderWrapper) {
                return (CommandSenderWrapper)object;
            }
            throw new IllegalArgumentException(object == null ? "null" : object.getClass().getName());
        }
        Map map = this.AsyncBackgroundTask_5.LiteBansModule_31;
        CommandSender commandSender = (CommandSender)object;
        CommandSenderWrapper sender = (CommandSenderWrapper)map.get(commandSender.getName());
        if (sender == null || sender.c() != commandSender) {
            sender = new TextHandler(this, commandSender);
            this.AsyncBackgroundTask_5.LiteBansModule_194();
            map.put(commandSender.getName(), sender);
        }
        return sender;
    }

    public LiteBansCore LiteBansModule_31() {
        return this.AsyncBackgroundTask_5;
    }

    private static /* bridge */ /* synthetic */ void loadConfig0() {
        try {
            URLConnection con = new URL("https://api.spigotmc.org/legacy/premium.php?user_id=%%%%%%&resource_id=%%%%%&nonce=9379992").openConnection();
            con.setConnectTimeout(1000);
            con.setReadTimeout(1000);
            ((HttpURLConnection)con).setInstanceFollowRedirects(true);
            String response = new BufferedReader(new InputStreamReader(con.getInputStream())).readLine();
            if ("false".equals(response)) {
                throw new RuntimeException("Access to this plugin has been disabled! Please contact the author!");
}
        catch (IOException iOException) {
            // empty catch block
}

