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
import litebans.a_0;
import litebans.bd_0;
import litebans.cm_0;
import litebans.cv_0;
import litebans.di_0;
import litebans.ec_0;
import litebans.em_0;
import litebans.gn_0;
import litebans.h_0;
import litebans.hb_0;
import litebans.hl;
import litebans.hz_0;
import litebans.j_0;
import litebans.jv_0;
import litebans.ln;
import litebans.n_0;
import litebans.o_0;
import org.slf4j.Logger;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Plugin(id="litebans", name="LiteBans", version="2.19.0", url="https://www.spigotmc.org/resources/litebans.3715/", description="Lightweight banning plugin with full UUID support.", authors={"Ruan"})
public static class VelocityPlugin
implements di_0 {
    private final bd_0 f = new bd_0(this);
    public final ProxyServer c;
    private final cv_0 e;
    private final Path d;
    private final List g = Collections.synchronizedList(new ArrayList());
    private static /* synthetic */ String[] b;

    @Inject
    public VelocityPlugin(ProxyServer proxyServer, Logger logger, @DataDirectory Path path) {
        this.c = proxyServer;
        this.e = new cv_0(logger, this.getName());
        this.d = path;
    }

    @Subscribe
    public void a(ProxyInitializeEvent proxyInitializeEvent) {
        this.j();
    }

    @Subscribe
    public void a(ProxyShutdownEvent proxyShutdownEvent) {
        this.d();
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
    public gn_0 h() {
        return this.f.o;
    }

    @Override
    public n_0[] k() {
        return this.f.j();
    }

    @Override
    public void d() {
        this.f.i();
    }

    @Override
    public boolean a(n_0 n_02) {
        boolean bl = n_02.d();
        if (bl) {
            if (n_02 instanceof o_0) {
                this.a((j_0)n_02);
            }
            if (n_02 instanceof h_0) {
                this.a((a_0)n_02);
            }
        }
        return bl;
    }

    @Override
    public hb_0 f() {
        return this.f.k;
    }

    @Override
    public a_0 z() {
        return this.f.e;
    }

    @Override
    public j_0 b() {
        return this.f.f;
    }

    @Override
    public void a(a_0 a_02) {
        this.f.e = a_02;
    }

    @Override
    public jv_0 y() {
        return this.f.g;
    }

    @Override
    public jv_0 v() {
        return this.a(this.c.getConsoleCommandSource());
    }

    @Override
    public gn_0 o() {
        gn_0 gn_02;
        this.f.o = gn_02 = this.a(new File(this.getDataFolder(), b[0]));
        return gn_02;
    }

    @Override
    public File getDataFolder() {
        return this.d.toFile();
    }

    @Override
    public java.util.logging.Logger getLogger() {
        return this.e;
    }

    @Override
    public n_0 a(Class clazz) {
        return this.f.b(clazz);
    }

    @Override
    public n_0 b(Class clazz) {
        return this.f.a(clazz);
    }

    @Override
    public n_0[] p() {
        return this.f.d;
    }

    @Override
    public String getName() {
        return b[1];
    }

    @Override
    public int a() {
        return this.f.l();
    }

    @Override
    public jv_0[] q() {
        return this.f.b();
    }

    @Override
    public Map w() {
        return this.f.b;
    }

    @Override
    public ThreadPoolExecutor x() {
        ThreadPoolExecutor threadPoolExecutor = this.f.h;
        if ((threadPoolExecutor == null || threadPoolExecutor.isShutdown()) && (this.f.j.get() || this.f.m.get())) {
            ThreadFactoryBuilder threadFactoryBuilder = this.f.d();
            return this.f.a(threadFactoryBuilder);
        }
        return threadPoolExecutor;
    }

    @Override
    public long g() {
        return this.f.h();
    }

    @Override
    public byte t() {
        return 2;
    }

    @Override
    public ec_0 i() {
        return new cm_0(this);
    }

    @Override
    public String e() {
        return b[2];
    }

    @Override
    public void j() {
        this.f.c();
        this.f.k();
    }

    @Override
    public boolean isEnabled() {
        return this.f.p;
    }

    @Override
    public boolean n() {
        return this.f.p;
    }

    @Override
    public boolean s() {
        return this.f.n.get();
    }

    @Override
    public boolean c() {
        return this.c.getConfiguration().isOnlineMode();
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
    public gn_0 a(File file) {
        return this.f.i.a(this, file);
    }

    @Override
    public void b(em_0[] em_0Array) {
        for (em_0 em_02 : em_0Array) {
            this.c.getEventManager().register((Object)this, (Object)em_02);
        }
    }

    @Override
    public boolean a(String string, Supplier supplier) {
        return this.f.a(string, supplier);
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
            throw new IllegalArgumentException(b[3] + l3);
        }
        this.c();
        this.g.add(this.c.getScheduler().buildTask((Object)this, runnable).delay(l3 * 50L, TimeUnit.MILLISECONDS).schedule());
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
    public void a(String string) {
        gn_0.a(this.getDataFolder(), string, null, false);
    }

    @Override
    public void a(ln ln2) {
        this.f.i = ln2;
    }

    @Override
    public void a(j_0 j_02) {
        this.f.f = j_02;
    }

    @Override
    public void r() {
        this.c.getEventManager().unregisterListeners((Object)this);
    }

    @Override
    public void a(em_0[] em_0Array) {
        for (em_0 em_02 : em_0Array) {
            this.c.getEventManager().unregisterListener((Object)this, (Object)em_02);
        }
    }

    @Override
    public jv_0 b(Object object) {
        if (!(object instanceof CommandSource)) {
            if (object instanceof jv_0) {
                return (jv_0)this.f.b.remove(((jv_0)object).i());
            }
            throw new IllegalArgumentException();
        }
        String string = b[4];
        if (object instanceof Player) {
            string = ((Player)object).getUsername();
        }
        return (jv_0)this.f.b.remove(string);
    }

    @Override
    public jv_0 a(Object object) {
        jv_0 jv_02;
        if (!(object instanceof CommandSource)) {
            if (object instanceof jv_0) {
                return (jv_0)object;
            }
            throw new IllegalArgumentException();
        }
        CommandSource commandSource = (CommandSource)object;
        Map map = this.f.b;
        String string = b[5];
        if (commandSource instanceof Player) {
            string = ((Player)commandSource).getUsername();
        }
        if ((jv_02 = (jv_0)map.get(string)) == null || jv_02.c() != commandSource) {
            jv_02 = new hz_0(this, commandSource);
            this.f.f();
            map.put(string, jv_02);
        }
        return jv_02;
    }

    public bd_0 b() {
        return this.f;
    }

    private static final void a() {
        b = new String[]{hl.a("\u9fa8\u9fa4\u9fa5\u9fad\u9fa2\u9fac\u9fe5\u9fb2\u9fa6\u9fa7", 17932235), hl.a("\u3c18\u3c3d\u3c20\u3c31\u3c16\u3c35\u3c3a\u3c27", -140231596), hl.a("\u6224\u6238\u6227\u622f\u6238\u6226", 75784726), hl.a("\u80ae\u8089\u8091\u8086\u808b\u808e\u8083\u80c7\u8083\u8082\u808b\u8086\u809e\u80dd\u80c7", -1426947865), hl.a("\u9a26\u9a3e\u9a12\u9a13\u9a0e\u9a12\u9a11\u9a18\u9a20", 1332320893), hl.a("\u9d70\u9d68\u9d44\u9d45\u9d58\u9d44\u9d47\u9d4e\u9d76", 1578081579)};
    }

    static {
        VelocityPlugin.a();
    }
}

