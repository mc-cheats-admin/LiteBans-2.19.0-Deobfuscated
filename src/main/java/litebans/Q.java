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

@ai_0(a=0)
public final class Q
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
        if (ew.a((Object)jw_02.getName(), (Object)"lockdown")) {
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
                q.a.a("fr.xephi.authme.events.LoginEvent", () -> Q.a(q));
            }
            catch (Exception exception) {
                n_0 n_02 = q;
                String string = "Hooking into AuthMe ";
                boolean bl = false;
                n_02.a.getLogger().warning(string);
                exception.printStackTrace();
            }
        }
    }

    private static final void a(Q q, eG eG2, q_0 q_02) {
        block6: {
            try {
                boolean bl = q.b = eG2.a() && q.a.i().a("ProtocolLib");
                if (q.b && du_0.b.b()) {
                    q.a.getLogger().warning("ProtocolLib error 00 - manager is ");
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
                q.a.getLogger().warning("Failed to add ProtocolLib packet ");
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
        d = new String[]{"lockdown", "fr.xephi.authme.events.LoginEvent", "Hooking into AuthMe ", "ProtocolLib", "ProtocolLib error 00 - manager is ", "Failed to add ProtocolLib packet listener."};
    }

    static {
        Q.d();
    }
}

