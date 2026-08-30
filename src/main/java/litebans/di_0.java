package litebans;

import java.io.File;
import java.util.Map;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.function.Supplier;
import java.util.logging.Logger;
import litebans.a_0;
import litebans.ec_0;
import litebans.em_0;
import litebans.gn_0;
import litebans.hb_0;
import litebans.j_0;
import litebans.jv_0;
import litebans.jw_0;
import litebans.ln;
import litebans.n_0;

/*
 * Renamed from litebans.di
 */
public static interface di_0
extends jw_0 {
    public static final n_0[] a = new n_0[0];

    public void m();

    public gn_0 h();

    public n_0[] k();

    public void d();

    public boolean a(n_0 var1);

    public hb_0 f();

    public a_0 z();

    public j_0 b();

    public void a(a_0 var1);

    public jv_0 y();

    public jv_0 v();

    public gn_0 o();

    public File getDataFolder();

    public Logger getLogger();

    public n_0 a(Class var1);

    public n_0 b(Class var1);

    public n_0[] p();

    public int a();

    public jv_0[] q();

    public Map w();

    public ThreadPoolExecutor x();

    public long g();

    public byte t();

    public ec_0 i();

    public String e();

    public void j();

    public boolean isEnabled();

    public boolean n();

    public boolean s();

    public boolean c();

    public boolean u();

    public boolean l();

    public gn_0 a(File var1);

    public void b(em_0[] var1);

    public boolean a(String var1, Supplier var2);

    public void c(Runnable var1);

    public void b(Runnable var1, long var2);

    public void a(Runnable var1);

    public void a(Runnable var1, long var2);

    public void b(Runnable var1);

    public void a(Runnable var1, long var2, long var4);

    public void b(Runnable var1, long var2, long var4);

    public void a(String var1);

    public void a(ln var1);

    public void a(j_0 var1);

    public void r();

    public void a(em_0[] var1);

    public jv_0 b(Object var1);

    public jv_0 a(Object var1);
}

