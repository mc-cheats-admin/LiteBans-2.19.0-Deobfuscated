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
import litebans.a;
import litebans.a_0;
import litebans.di_0;
import litebans.em_0;
import litebans.gg_0;
import litebans.gn_0;
import litebans.hb_0;
import litebans.hl;
import litebans.j_0;
import litebans.jv_0;
import litebans.ln;
import litebans.n_0;
import org.jetbrains.annotations.NotNull;

public class bd_0
implements ln {
    private final di_0 a;
    public n_0[] d = di_0.a;
    public a_0 e;
    public j_0 f;
    public Map b = new ConcurrentHashMap();
    public hb_0 k;
    public jv_0 g;
    public ThreadPoolExecutor h;
    public gn_0 o;
    public ln i = this;
    public AtomicBoolean j = new AtomicBoolean(false);
    public AtomicBoolean m = new AtomicBoolean(false);
    public AtomicBoolean n = new AtomicBoolean(false);
    public long c;
    public boolean p;
    private static /* synthetic */ String[] l;

    public bd_0(di_0 di_02) {
        this.a = di_02;
        this.k = new hb_0(di_02);
    }

    public n_0 b(Class clazz) {
        for (n_0 n_02 : this.d) {
            if (n_02.getClass() != clazz) continue;
            return n_02;
        }
        return null;
    }

    public n_0 a(Class clazz) {
        for (n_0 n_02 : this.d) {
            if (!clazz.isAssignableFrom(n_02.getClass())) continue;
            return n_02;
        }
        return null;
    }

    @Override
    public gn_0 a(di_0 di_02, File file) {
        return new gg_0(di_02).c(file);
    }

    public void c() {
        this.m.set(true);
        this.o = this.a.o();
        this.a(false);
    }

    public void k() {
        try {
            if (this.j.get()) {
                this.a.getLogger().warning("onEnable() called while plugin is already enabled! This might break ");
                this.i();
            }
            this.c = System.currentTimeMillis();
            this.j.set(true);
            if (this.d == di_0.a) {
                this.c();
            }
            this.g = this.a.v();
            this.a(true);
            this.a.getLogger().info(this.g());
            this.k.a(false);
            this.p = true;
        }
        finally {
            this.m.set(false);
        }
    }

    public @NotNull ThreadFactoryBuilder d() {
        ThreadFactoryBuilder threadFactoryBuilder = new ThreadFactoryBuilder().setNameFormat(this.a.getName() + "-%1$d").setDaemon(true);
        return threadFactoryBuilder;
    }

    public void a(boolean bl) {
        if (this.d == di_0.a) {
            this.d = this.a.k();
        }
        if (bl) {
            for (n_0 n_02 : this.a.p()) {
                n_02.e();
            }
        } else {
            for (n_0 n_03 : this.a.p()) {
                n_03.a();
            }
        }
    }

    public void i() {
        if (this.m.get()) {
            this.a.getLogger().severe("onDisable() called while plugin hasn't finished loading yet! This will be ignored to prevent errors. It's likely that another plugin stopped your server ");
            return;
        }
        this.n.set(true);
        this.j.set(false);
        this.p = false;
        for (n_0 n_02 : this.d) {
            n_02.c();
        }
        this.a.r();
        this.a.m();
        this.o = null;
        this.b.clear();
        ThreadPoolExecutor threadPoolExecutor = this.h;
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
        this.a.getLogger().info(this.e());
        this.g = null;
        this.h = null;
        this.n.set(false);
    }

    public jv_0[] b() {
        j_0 j_02 = this.f;
        if (j_02 != null) {
            return j_02.a();
        }
        return jv_0.a;
    }

    public int l() {
        j_0 j_02 = this.f;
        if (j_02 != null) {
            return j_02.b();
        }
        return 0;
    }

    public n_0[] j() {
        return litebans.a.a(this.a);
    }

    public boolean a(String string, Supplier supplier) {
        boolean bl = hb_0.a(string);
        if (bl) {
            this.a.b((em_0[])supplier.get());
        }
        return bl;
    }

    public long h() {
        return System.currentTimeMillis() - this.c;
    }

    public String e() {
        return 'v' + this.a.e() + " ";
    }

    public String g() {
        return 'v' + this.a.e() + " enabled. Startup took " + this.a.g() + " ";
    }

    public ThreadPoolExecutor a(ThreadFactoryBuilder threadFactoryBuilder) {
        this.h = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 1000L, TimeUnit.SECONDS, new SynchronousQueue<Runnable>(), threadFactoryBuilder.build());
        return this.h;
    }

    public void f() {
        int n = this.b.size();
        if (n > 4 && n % 32 == 0 && n > this.l() + 4) {
            this.b.clear();
        }
    }

    private static final void a() {
        l = new String[]{"onEnable() called while plugin is already enabled! This might break ", "-%1$d", "onDisable() called while plugin hasn't finished loading yet! This will be ignored to prevent errors. It's likely that another plugin stopped your server ", " ", " enabled. Startup took ", " ms."};
    }

    static {
        bd_0.a();
    }
}

