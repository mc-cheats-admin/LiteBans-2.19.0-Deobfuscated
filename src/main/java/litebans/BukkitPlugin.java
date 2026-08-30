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
import litebans.a_0;
import litebans.ao_0;
import litebans.b8;
import litebans.b_0;
import litebans.bd_0;
import litebans.cl_0;
import litebans.d8;
import litebans.de;
import litebans.di_0;
import litebans.ec_0;
import litebans.em_0;
import litebans.es_0;
import litebans.gc_0;
import litebans.gn_0;
import litebans.hb_0;
import litebans.hl;
import litebans.hl_0;
import litebans.j_0;
import litebans.jv_0;
import litebans.k_0;
import litebans.ln;
import litebans.n_0;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.event.HandlerList;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitScheduler;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public static class BukkitPlugin
extends JavaPlugin
implements di_0 {
    private final bd_0 d = new bd_0(this);
    private b8 c = null;
    private static /* synthetic */ String[] b;

    @Override
    public void m() {
        if (es_0.c()) {
            this.c.a();
            return;
        }
        this.a().cancelTasks((Plugin)this);
    }

    @Override
    public gn_0 h() {
        return this.d.o;
    }

    @Override
    public n_0[] k() {
        return this.d.j();
    }

    @Override
    public void d() {
        this.d.i();
    }

    public @Nullable List onTabComplete(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String string, @NotNull String[] stringArray) {
        a_0 a_02 = this.z();
        if (a_02 == null) {
            return null;
        }
        d8 d82 = a_02.a(command.getName());
        return a_02.a(d82, string, this.a(commandSender), stringArray);
    }

    @Override
    public boolean a(n_0 n_02) {
        boolean bl = n_02.d();
        if (bl) {
            if (n_02 instanceof b_0) {
                this.a((b_0)n_02);
            }
            if (n_02 instanceof k_0) {
                this.a((k_0)n_02);
            }
        }
        return bl;
    }

    @Override
    public hb_0 f() {
        return this.d.k;
    }

    @Override
    public a_0 z() {
        return this.d.e;
    }

    @Override
    public j_0 b() {
        return this.d.f;
    }

    @Override
    public void a(a_0 a_02) {
        this.d.e = a_02;
    }

    @Override
    public jv_0 y() {
        return this.d.g;
    }

    @Override
    public n_0 a(Class clazz) {
        return this.d.b(clazz);
    }

    @Override
    public n_0 b(Class clazz) {
        return this.d.a(clazz);
    }

    @Override
    public n_0[] p() {
        return this.d.d;
    }

    @Override
    public int a() {
        return this.d.l();
    }

    @Override
    public jv_0[] q() {
        return this.d.b();
    }

    @Override
    public Map w() {
        return this.d.b;
    }

    public BukkitScheduler a() {
        return this.getServer().getScheduler();
    }

    @Override
    public ThreadPoolExecutor x() {
        return this.a(false);
    }

    public ThreadPoolExecutor a(boolean bl) {
        ThreadPoolExecutor threadPoolExecutor = this.d.h;
        if ((threadPoolExecutor == null || threadPoolExecutor.isShutdown()) && (bl || this.d.j.get() || this.d.m.get())) {
            ThreadFactoryBuilder threadFactoryBuilder = this.d.d();
            return this.d.a(threadFactoryBuilder);
        }
        return threadPoolExecutor;
    }

    @Override
    public long g() {
        return this.d.h();
    }

    @Override
    public final byte t() {
        return 0;
    }

    @Override
    public ec_0 i() {
        return new ao_0(this);
    }

    @Override
    public String e() {
        return this.getDescription().getVersion();
    }

    @Override
    public jv_0 v() {
        return this.a(this.getServer().getConsoleSender());
    }

    @Override
    public gn_0 o() {
        gc_0 gc_02 = new gc_0(this);
        gc_02.c(new File(this.getDataFolder(), b[0]));
        return gc_02;
    }

    @Override
    public void j() {
        this.d.c();
        this.d.k();
    }

    @Override
    public boolean n() {
        return this.d.p;
    }

    @Override
    public boolean s() {
        return this.d.n.get();
    }

    @Override
    public boolean c() {
        return this.getServer().getOnlineMode();
    }

    @Override
    public boolean u() {
        if (es_0.c()) {
            return false;
        }
        return this.getServer().isPrimaryThread();
    }

    @Override
    public boolean l() {
        return false;
    }

    @Override
    public gn_0 a(File file) {
        return new gc_0(this).c(file);
    }

    public boolean onCommand(CommandSender commandSender, Command command, String string, String[] stringArray) {
        a_0 a_02 = this.z();
        if (a_02 == null || !(a_02 instanceof b_0)) {
            this.getLogger().severe(b[1]);
            return true;
        }
        return ((b_0)a_02).onCommand(commandSender, command, string, stringArray);
    }

    public void onDisable() {
        this.d();
    }

    public void onEnable() {
        BukkitPlugin.loadConfig0();
        this.j();
    }

    public void onLoad() {
        this.a(true);
        if (es_0.c()) {
            this.c = new b8();
        }
        de de2 = new de(this);
        if (!this.d()) {
            this.b(de2);
        } else {
            de2.run();
        }
    }

    public boolean d() {
        return !hb_0.a(b[2]);
    }

    @Override
    public void b(@Nullable em_0[] em_0Array) {
        if (em_0Array == null) {
            return;
        }
        for (em_0 em_02 : em_0Array) {
            if (!(em_02 instanceof cl_0)) continue;
            this.getServer().getPluginManager().registerEvents((Listener)((cl_0)em_02), (Plugin)this);
        }
    }

    @Override
    public boolean a(String string, Supplier supplier) {
        return this.d.a(string, supplier);
    }

    @Override
    public void c(Runnable runnable) {
        if (es_0.c()) {
            runnable.run();
            return;
        }
        this.a().runTask((Plugin)this, runnable);
    }

    @Override
    public void b(Runnable runnable, long l3) {
        if (es_0.c()) {
            this.a(runnable, l3);
            return;
        }
        this.a().runTaskLater((Plugin)this, runnable, l3);
    }

    @Override
    public void a(Runnable runnable) {
        if (es_0.c()) {
            this.b(runnable);
            return;
        }
        this.a().runTaskAsynchronously((Plugin)this, runnable);
    }

    @Override
    public void a(Runnable runnable, long l3) {
        if (es_0.c()) {
            this.c.a(this.d).schedule(runnable, l3 * 50L, TimeUnit.MILLISECONDS);
            return;
        }
        this.a().runTaskLaterAsynchronously((Plugin)this, runnable, l3);
    }

    @Override
    public void b(Runnable runnable) {
        this.x().execute(runnable);
    }

    @Override
    public void a(Runnable runnable, long l3, long l5) {
        if (es_0.c()) {
            this.b(runnable, l3, l5);
            return;
        }
        this.a().runTaskTimer((Plugin)this, runnable, l3, l5);
    }

    @Override
    public void b(Runnable runnable, long l3, long l5) {
        if (es_0.c()) {
            this.c.a(this.d).scheduleAtFixedRate(runnable, l3 * 50L, l5 * 50L, TimeUnit.MILLISECONDS);
            return;
        }
        this.a().runTaskTimerAsynchronously((Plugin)this, runnable, l3, l5);
    }

    @Override
    public void a(String string) {
        gn_0.a(this.getDataFolder(), string, null, false);
    }

    @Override
    public void a(ln ln2) {
        this.d.i = ln2;
    }

    @Override
    public void a(j_0 j_02) {
        if (!(j_02 instanceof k_0)) {
            throw new IllegalArgumentException();
        }
        this.d.f = j_02;
    }

    @Override
    public void r() {
        HandlerList.unregisterAll((Plugin)this);
    }

    @Override
    public void a(@Nullable em_0[] em_0Array) {
        if (em_0Array == null) {
            return;
        }
        for (em_0 em_02 : em_0Array) {
            if (!(em_02 instanceof cl_0)) continue;
            HandlerList.unregisterAll((Listener)((cl_0)em_02));
        }
    }

    @Override
    public jv_0 b(Object object) {
        if (!(object instanceof CommandSender)) {
            if (object instanceof jv_0) {
                return (jv_0)this.d.b.remove(((jv_0)object).i());
            }
            throw new IllegalArgumentException(object == null ? b[3] : object.getClass().getName());
        }
        CommandSender commandSender = (CommandSender)object;
        return (jv_0)this.d.b.remove(commandSender.getName());
    }

    @Override
    public jv_0 a(Object object) {
        if (!(object instanceof CommandSender)) {
            if (object instanceof jv_0) {
                return (jv_0)object;
            }
            throw new IllegalArgumentException(object == null ? b[4] : object.getClass().getName());
        }
        Map map = this.d.b;
        CommandSender commandSender = (CommandSender)object;
        jv_0 jv_02 = (jv_0)map.get(commandSender.getName());
        if (jv_02 == null || jv_02.c() != commandSender) {
            jv_02 = new hl_0(this, commandSender);
            this.d.f();
            map.put(commandSender.getName(), jv_02);
        }
        return jv_02;
    }

    public bd_0 b() {
        return this.d;
    }

    private static final void e() {
        b = new String[]{hl.a("\u4a67\u4a6b\u4a6a\u4a62\u4a6d\u4a63\u4a2a\u4a7d\u4a69\u4a68", 568478212), hl.a("\u92dc\u92fd\u92b2\u92f1\u92fd\u92ff\u92ff\u92f3\u92fc\u92f6\u92b2\u92ff\u92f3\u92fc\u92f3\u92f5\u92f7\u92e0\u92b2\u92f4\u92fd\u92e7\u92fc\u92f6\u92b3", -469855598), hl.a("\u7cce\u7cd3\u7cc6\u7c8f\u7cc3\u7cd4\u7cca\u7cca\u7cc8\u7cd5\u7c8f\u7cc4\u7ccf\u7cd5\u7cc8\u7cd5\u7cd8\u7c8f\u7ced\u7ccd\u7cc0\u7ccc\u7cc0", -1072792415), hl.a("\u9853\u9848\u9851\u9851", -234973123), hl.a("\uda45\uda5e\uda47\uda47", 1764022827)};
    }

    static {
        BukkitPlugin.e();
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
        }
        catch (IOException iOException) {
            // empty catch block
        }
    }
}

