package litebans;

import com.google.common.util.concurrent.ThreadFactoryBuilder;
import java.io.File;
import java.util.Map;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;
import litebans.a_0;
import litebans.bd_0;
import litebans.d_0;
import litebans.di_0;
import litebans.ea_0;
import litebans.ec_0;
import litebans.em_0;
import litebans.gn_0;
import litebans.hb_0;
import litebans.hl;
import litebans.j_0;
import litebans.jv_0;
import litebans.k1;
import litebans.l_0;
import litebans.ln;
import litebans.ly_0;
import litebans.n_0;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.plugin.Listener;
import net.md_5.bungee.api.plugin.Plugin;
import net.md_5.bungee.api.scheduler.GroupedThreadFactory;
import org.jetbrains.annotations.Nullable;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public static class BungeePlugin
extends Plugin
implements di_0 {
    private final bd_0 c = new bd_0(this);
    private static /* synthetic */ String[] b;

    @Override
    public void m() {
        this.getProxy().getScheduler().cancel((Plugin)this);
    }

    @Override
    public gn_0 h() {
        return this.c.o;
    }

    @Override
    public n_0[] k() {
        return this.c.j();
    }

    @Override
    public void d() {
        this.c.i();
    }

    @Override
    public boolean a(n_0 n_02) {
        boolean bl = n_02.d();
        if (bl) {
            if (n_02 instanceof l_0) {
                this.a((j_0)n_02);
            }
            if (n_02 instanceof d_0) {
                this.a((a_0)n_02);
            }
        }
        return bl;
    }

    @Override
    public hb_0 f() {
        return this.c.k;
    }

    @Override
    public a_0 z() {
        return this.c.e;
    }

    @Override
    public j_0 b() {
        return this.c.f;
    }

    @Override
    public void a(a_0 a_02) {
        this.c.e = a_02;
    }

    @Override
    public jv_0 y() {
        return this.c.g;
    }

    @Override
    public n_0 a(Class clazz) {
        return this.c.b(clazz);
    }

    @Override
    public n_0 b(Class clazz) {
        return this.c.a(clazz);
    }

    @Override
    public n_0[] p() {
        return this.c.d;
    }

    @Override
    public String getName() {
        return this.getDescription().getName();
    }

    @Override
    public int a() {
        return this.c.l();
    }

    @Override
    public jv_0[] q() {
        return this.c.b();
    }

    @Override
    public Map w() {
        return this.c.b;
    }

    @Override
    public ThreadPoolExecutor x() {
        ThreadPoolExecutor threadPoolExecutor = this.c.h;
        if (threadPoolExecutor == null) {
            ThreadFactoryBuilder threadFactoryBuilder = this.c.d();
            try {
                threadFactoryBuilder.setThreadFactory((ThreadFactory)new GroupedThreadFactory((Plugin)this, this.getName()));
            }
            catch (NoSuchMethodError noSuchMethodError) {
                threadFactoryBuilder.setThreadFactory((ThreadFactory)GroupedThreadFactory.class.getConstructor(Plugin.class).newInstance(this));
            }
            return this.c.a(threadFactoryBuilder);
        }
        return threadPoolExecutor;
    }

    @Override
    public long g() {
        return this.c.h();
    }

    @Override
    public final byte t() {
        return 1;
    }

    @Override
    public ec_0 i() {
        return new k1(this);
    }

    @Override
    public String e() {
        return this.getDescription().getVersion();
    }

    @Override
    public jv_0 v() {
        return this.a(this.getProxy().getConsole());
    }

    @Override
    public gn_0 o() {
        gn_0 gn_02;
        this.c.o = gn_02 = this.a(new File(this.getDataFolder(), b[0]));
        return gn_02;
    }

    @Override
    public void j() {
        this.c.c();
        this.c.k();
    }

    @Override
    public boolean s() {
        return this.c.n.get();
    }

    @Override
    public boolean c() {
        return this.getProxy().getConfig().isOnlineMode();
    }

    @Override
    public boolean u() {
        return false;
    }

    @Override
    public boolean l() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return this.c.j.get();
    }

    @Override
    public boolean n() {
        return this.c.p;
    }

    @Override
    public gn_0 a(File file) {
        return this.c.i.a(this, file);
    }

    public void onDisable() {
        this.d();
    }

    public void onEnable() {
        this.j();
    }

    @Override
    public void b(@Nullable em_0[] em_0Array) {
        if (em_0Array == null) {
            return;
        }
        for (em_0 em_02 : em_0Array) {
            if (!(em_02 instanceof ly_0)) continue;
            this.getProxy().getPluginManager().registerListener((Plugin)this, (Listener)((ly_0)em_02));
        }
    }

    @Override
    public boolean a(String string, Supplier supplier) {
        return this.c.a(string, supplier);
    }

    @Override
    public void c(Runnable runnable) {
        this.a(runnable);
    }

    @Override
    public void b(Runnable runnable, long l3) {
        this.a(runnable, l3);
    }

    @Override
    public void a(Runnable runnable) {
        this.x().execute(runnable);
    }

    @Override
    public void a(Runnable runnable, long l3) {
        if (l3 < 0L) {
            throw new IllegalArgumentException(b[1] + l3);
        }
        try {
            this.getProxy().getScheduler().schedule((Plugin)this, runnable, l3 * 50L, TimeUnit.MILLISECONDS);
        }
        catch (RejectedExecutionException rejectedExecutionException) {
            this.a(rejectedExecutionException);
        }
    }

    @Override
    public void b(Runnable runnable) {
        this.a(runnable);
    }

    @Override
    public void a(Runnable runnable, long l3, long l5) {
        this.b(runnable, l3, l5);
    }

    @Override
    public void b(Runnable runnable, long l3, long l5) {
        try {
            this.getProxy().getScheduler().schedule((Plugin)this, runnable, l3 * 50L, l5 * 50L, TimeUnit.MILLISECONDS);
        }
        catch (RejectedExecutionException rejectedExecutionException) {
            this.a(rejectedExecutionException);
        }
    }

    private final void a(Exception exception) {
        if (this.c.m.get()) {
            this.getLogger().warning(b[2]);
            return;
        }
        throw exception;
    }

    @Override
    public void a(String string) {
        gn_0.a(this.getDataFolder(), string, null, false);
    }

    @Override
    public void a(ln ln2) {
        this.c.i = ln2;
    }

    @Override
    public void a(j_0 j_02) {
        this.c.f = j_02;
    }

    @Override
    public void r() {
        this.getProxy().getPluginManager().unregisterListeners((Plugin)this);
    }

    @Override
    public void a(@Nullable em_0[] em_0Array) {
        if (em_0Array == null) {
            return;
        }
        for (em_0 em_02 : em_0Array) {
            if (!(em_02 instanceof ly_0)) continue;
            this.getProxy().getPluginManager().unregisterListener((Listener)((ly_0)em_02));
        }
    }

    @Override
    public jv_0 b(Object object) {
        if (!(object instanceof CommandSender)) {
            if (object instanceof jv_0) {
                return (jv_0)this.c.b.remove(((jv_0)object).i());
            }
            throw new IllegalArgumentException();
        }
        CommandSender commandSender = (CommandSender)object;
        return (jv_0)this.c.b.remove(commandSender.getName());
    }

    @Override
    public jv_0 a(Object object) {
        if (!(object instanceof CommandSender)) {
            if (object instanceof jv_0) {
                return (jv_0)object;
            }
            throw new IllegalArgumentException();
        }
        Map map = this.c.b;
        CommandSender commandSender = (CommandSender)object;
        jv_0 jv_02 = (jv_0)map.get(commandSender.getName());
        if (jv_02 == null || jv_02.c() != commandSender) {
            jv_02 = new ea_0(this, commandSender);
            this.c.f();
            map.put(commandSender.getName(), jv_02);
        }
        return jv_02;
    }

    public bd_0 b() {
        return this.c;
    }

    private static final void a() {
        b = new String[]{hl.a("\u751e\u7512\u7513\u751b\u7514\u751a\u7553\u7504\u7510\u7511", 1041659261), hl.a("\u4305\u4322\u433a\u432d\u4320\u4325\u4328\u436c\u4328\u4329\u4320\u432d\u4335\u4376\u436c", -926268596), hl.a("\u1ea1\u1e86\u1e93\u1e80\u1e86\u1e87\u1e82\u1ed2\u1e85\u1e93\u1e81\u1ed2\u1e91\u1e93\u1e9c\u1e91\u1e97\u1e9e\u1e9e\u1e97\u1e96\u1ed3\u1ed3", -830923022)};
    }

    static {
        BungeePlugin.a();
    }
}

