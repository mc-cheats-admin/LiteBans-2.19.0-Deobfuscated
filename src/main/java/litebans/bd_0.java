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

/*
 * Renamed from litebans.bd
 */
public static class bd_0
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
                this.a.getLogger().warning(l[0]);
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
        ThreadFactoryBuilder threadFactoryBuilder = new ThreadFactoryBuilder().setNameFormat(this.a.getName() + l[1]).setDaemon(true);
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
            this.a.getLogger().severe(l[2]);
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
        return 'v' + this.a.e() + l[3];
    }

    public String g() {
        return 'v' + this.a.e() + l[4] + this.a.g() + l[5];
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
        l = new String[]{hl.a("\u28c1\u28c0\u28eb\u28c0\u28cf\u28cc\u28c2\u28cb\u2886\u2887\u288e\u28cd\u28cf\u28c2\u28c2\u28cb\u28ca\u288e\u28d9\u28c6\u28c7\u28c2\u28cb\u288e\u28de\u28c2\u28db\u28c9\u28c7\u28c0\u288e\u28c7\u28dd\u288e\u28cf\u28c2\u28dc\u28cb\u28cf\u28ca\u28d7\u288e\u28cb\u28c0\u28cf\u28cc\u28c2\u28cb\u28ca\u288f\u288e\u28fa\u28c6\u28c7\u28dd\u288e\u28c3\u28c7\u28c9\u28c6\u28da\u288e\u28cc\u28dc\u28cb\u28cf\u28c5\u288e\u28dd\u28c1\u28c3\u28cb\u28da\u28c6\u28c7\u28c0\u28c9\u2880", 229320878), hl.a("\u7f2a\u7f22\u7f36\u7f23\u7f63", 630554375), hl.a("\u0abf\u0abe\u0a94\u0ab9\u0aa3\u0ab1\u0ab2\u0abc\u0ab5\u0af8\u0af9\u0af0\u0ab3\u0ab1\u0abc\u0abc\u0ab5\u0ab4\u0af0\u0aa7\u0ab8\u0ab9\u0abc\u0ab5\u0af0\u0aa0\u0abc\u0aa5\u0ab7\u0ab9\u0abe\u0af0\u0ab8\u0ab1\u0aa3\u0abe\u0af7\u0aa4\u0af0\u0ab6\u0ab9\u0abe\u0ab9\u0aa3\u0ab8\u0ab5\u0ab4\u0af0\u0abc\u0abf\u0ab1\u0ab4\u0ab9\u0abe\u0ab7\u0af0\u0aa9\u0ab5\u0aa4\u0af1\u0af0\u0a84\u0ab8\u0ab9\u0aa3\u0af0\u0aa7\u0ab9\u0abc\u0abc\u0af0\u0ab2\u0ab5\u0af0\u0ab9\u0ab7\u0abe\u0abf\u0aa2\u0ab5\u0ab4\u0af0\u0aa4\u0abf\u0af0\u0aa0\u0aa2\u0ab5\u0aa6\u0ab5\u0abe\u0aa4\u0af0\u0ab5\u0aa2\u0aa2\u0abf\u0aa2\u0aa3\u0afe\u0af0\u0a99\u0aa4\u0af7\u0aa3\u0af0\u0abc\u0ab9\u0abb\u0ab5\u0abc\u0aa9\u0af0\u0aa4\u0ab8\u0ab1\u0aa4\u0af0\u0ab1\u0abe\u0abf\u0aa4\u0ab8\u0ab5\u0aa2\u0af0\u0aa0\u0abc\u0aa5\u0ab7\u0ab9\u0abe\u0af0\u0aa3\u0aa4\u0abf\u0aa0\u0aa0\u0ab5\u0ab4\u0af0\u0aa9\u0abf\u0aa5\u0aa2\u0af0\u0aa3\u0ab5\u0aa2\u0aa6\u0ab5\u0aa2\u0af0\u0ab1\u0aa3\u0aa9\u0abe\u0ab3\u0ab8\u0aa2\u0abf\u0abe\u0abf\u0aa5\u0aa3\u0abc\u0aa9\u0afe", -1464464688), hl.a("\u6571\u6535\u6538\u6522\u6530\u6533\u653d\u6534\u6535\u657f", -1947114159), hl.a("\u49bd\u49f8\u49f3\u49fc\u49ff\u49f1\u49f8\u49f9\u49b3\u49bd\u49ce\u49e9\u49fc\u49ef\u49e9\u49e8\u49ed\u49bd\u49e9\u49f2\u49f2\u49f6\u49bd", 2101103005), hl.a("\u2b3c\u2b71\u2b6f\u2b32", 1549806364)};
    }

    static {
        bd_0.a();
    }
}

