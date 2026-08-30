package litebans;

import java.util.Arrays;
import litebans.aX;
import litebans.ad_0;
import litebans.ai_0;
import litebans.al_0;
import litebans.cl_0;
import litebans.dX;
import litebans.di_0;
import litebans.ds;
import litebans.du_0;
import litebans.dy;
import litebans.eG;
import litebans.em_0;
import litebans.ew;
import litebans.hE;
import litebans.hl;
import litebans.jw_0;
import litebans.lX;
import litebans.n_0;
import litebans.p_0;
import litebans.q_0;
import org.jetbrains.annotations.NotNull;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@ai_0(a=0)
public static final class Q
extends p_0 {
    private boolean b;
    private Object[] c = new Object[0];
    private static /* synthetic */ String[] d;

    public Q(@NotNull di_0 di_02) {
        super(di_02);
    }

    @Override
    public void c() {
        this.a.r();
        Object[] objectArray = this.c;
        boolean bl = false;
        int n = objectArray.length;
        for (int i = 0; i < n; ++i) {
            Object object;
            Object object2 = object = objectArray[i];
            boolean bl2 = false;
            al_0.b(this, object2);
        }
    }

    @Override
    public boolean d() {
        return this.a.t() == 0;
    }

    @Override
    public void e() {
        q_0 q_02 = (q_0)this.a.a(q_0.class);
        q_02.e();
        eG eG2 = q_02.f();
        new aX(this.a).d();
        di_0 di_02 = this.a;
        boolean bl = eG2.J();
        boolean bl2 = false;
        if (bl) {
            em_0 em_02;
            em_0[] em_0Array = new em_0[1];
            int n = 0;
            em_0[] em_0Array2 = em_0Array;
            di_0 di_03 = di_02;
            boolean bl3 = false;
            em_0Array2[n] = em_02 = (em_0)new dy(this.a);
            di_03.b(em_0Array);
        }
        this.a.c(() -> Q.a(q_02, this));
        if (q_02.f().p()) {
            this.a.c(() -> Q.a(this, eG2, q_02));
            new hE(this.a).a();
        }
    }

    @Override
    public cl_0 a(@NotNull jw_0 jw_02) {
        if (ew.a((Object)jw_02.getName(), (Object)d[0])) {
            return new ad_0(this.a);
        }
        return (cl_0)super.a(jw_02);
    }

    private static final em_0[] a(Q q) {
        lX[] lXArray = new lX[]{new lX(q.a)};
        return lXArray;
    }

    private static final void a(q_0 q_02, Q q) {
        if (q_02.p()) {
            try {
                q.a.a(d[1], () -> Q.a(q));
            }
            catch (Exception exception) {
                n_0 n_02 = q;
                String string = d[2];
                boolean bl = false;
                n_02.a.getLogger().warning(string);
                exception.printStackTrace();
            }
        }
    }

    private static final void a(Q q, eG eG2, q_0 q_02) {
        block6: {
            try {
                boolean bl = q.b = eG2.a() && q.a.i().a(d[3]);
                if (q.b && du_0.b.b()) {
                    q.a.getLogger().warning(d[4]);
                } else if (q.b) {
                    Object[] objectArray;
                    n_0 n_02 = q;
                    Object[] objectArray2 = new Object[]{new ds(q.a), new dX(q.a)};
                    Q q2 = q;
                    boolean bl2 = false;
                    for (Object object : objectArray = objectArray2) {
                        boolean bl3 = false;
                        al_0.a(n_02, object);
                    }
                    Object[] objectArray3 = objectArray;
                    q2.c = Arrays.copyOf(objectArray3, objectArray3.length);
                }
            }
            catch (Throwable throwable) {
                q.a.getLogger().warning(d[5]);
                if ((throwable instanceof LinkageError || throwable instanceof ReflectiveOperationException) && !q_02.g()) break block6;
                q_02.a(throwable);
            }
        }
    }

    @Override
    public em_0 a(jw_0 jw_02) {
        return this.a(jw_02);
    }

    private static final void d() {
        d = new String[]{hl.a("\u1b34\u1b37\u1b3b\u1b33\u1b3c\u1b37\u1b2f\u1b36", -901899432), hl.a("\u11c9\u11dd\u1181\u11d7\u11ca\u11df\u11c7\u11c6\u1181\u11ce\u11da\u11db\u11c7\u11c2\u11ca\u1181\u11ca\u11d9\u11ca\u11c1\u11db\u11dc\u1181\u11e3\u11c0\u11c8\u11c6\u11c1\u11ea\u11d9\u11ca\u11c1\u11db", 1674056111), hl.a("\ud165\ud142\ud142\ud146\ud144\ud143\ud14a\ud10d\ud144\ud143\ud159\ud142\ud10d\ud16c\ud158\ud159\ud145\ud160\ud148\ud10d\ud14b\ud14c\ud144\ud141\ud148\ud149\ud103", 181719341), hl.a("\u9c8b\u9ca9\u9cb4\u9caf\u9cb4\u9cb8\u9cb4\u9cb7\u9c97\u9cb2\u9cb9", -1033331493), hl.a("\u9edb\u9ef9\u9ee4\u9eff\u9ee4\u9ee8\u9ee4\u9ee7\u9ec7\u9ee2\u9ee9\u9eab\u9eee\u9ef9\u9ef9\u9ee4\u9ef9\u9eab\u9ebb\u9ebb\u9eab\u9ea6\u9eab\u9ee6\u9eea\u9ee5\u9eea\u9eec\u9eee\u9ef9\u9eab\u9ee2\u9ef8\u9eab\u9ee6\u9ee2\u9ef8\u9ef8\u9ee2\u9ee5\u9eec\u9ea5", 393977483), hl.a("\u6ecd\u6eea\u6ee2\u6ee7\u6eee\u6eef\u6eab\u6eff\u6ee4\u6eab\u6eea\u6eef\u6eef\u6eab\u6edb\u6ef9\u6ee4\u6eff\u6ee4\u6ee8\u6ee4\u6ee7\u6ec7\u6ee2\u6ee9\u6eab\u6efb\u6eea\u6ee8\u6ee0\u6eee\u6eff\u6eab\u6ee7\u6ee2\u6ef8\u6eff\u6eee\u6ee5\u6eee\u6ef9\u6ea5", 131231371)};
    }

    static {
        Q.d();
    }
}

