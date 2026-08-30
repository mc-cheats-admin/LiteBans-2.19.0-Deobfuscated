package litebans;

import litebans.ai_0;
import litebans.d1;
import litebans.di_0;
import litebans.e7;
import litebans.ek_0;
import litebans.em_0;
import litebans.ew;
import litebans.hl;
import litebans.jm;
import litebans.jw_0;
import litebans.p_0;
import litebans.q_0;
import org.jetbrains.annotations.NotNull;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from litebans.U
 */
@ai_0(a=2)
public static final class u_0
extends p_0 {
    private static /* synthetic */ String[] b;

    public u_0(@NotNull di_0 di_02) {
        super(di_02);
    }

    @Override
    public void c() {
        this.a.r();
    }

    @Override
    public boolean d() {
        return this.a.t() == 2;
    }

    @Override
    public void e() {
        q_0 q_02 = (q_0)this.a.a(q_0.class);
        q_02.e();
        new d1(this.a).b();
        if (q_02.f().p()) {
            new e7(this.a).a();
        }
    }

    @Override
    public ek_0 a(@NotNull jw_0 jw_02) {
        if (ew.a((Object)jw_02.getName(), (Object)b[0])) {
            return new jm(this.a);
        }
        return (ek_0)super.a(jw_02);
    }

    @Override
    public em_0 a(jw_0 jw_02) {
        return this.a(jw_02);
    }

    private static final void d() {
        b = new String[]{hl.a("\u0459\u045a\u0456\u045e\u0451\u045a\u0442\u045b", 1928332341)};
    }

    static {
        u_0.d();
    }
}

