package litebans;

import litebans.aP;
import litebans.ai_0;
import litebans.di_0;
import litebans.em_0;
import litebans.ew;
import litebans.gX;
import litebans.hl;
import litebans.jw_0;
import litebans.kX;
import litebans.ly_0;
import litebans.p_0;
import litebans.q_0;
import org.jetbrains.annotations.NotNull;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@ai_0(a=1)
public static final class R
extends p_0 {
    private static /* synthetic */ String[] b;

    public R(@NotNull di_0 di_02) {
        super(di_02);
    }

    @Override
    public void c() {
        this.a.r();
    }

    @Override
    public boolean d() {
        return this.a.t() == 1;
    }

    @Override
    public void e() {
        q_0 q_02 = (q_0)this.a.a(q_0.class);
        q_02.e();
        new gX(this.a).a();
        if (q_02.f().p()) {
            new kX(this.a).b();
        }
    }

    @Override
    public ly_0 a(@NotNull jw_0 jw_02) {
        if (ew.a((Object)jw_02.getName(), (Object)b[0])) {
            return new aP(this.a);
        }
        return (ly_0)super.a(jw_02);
    }

    @Override
    public em_0 a(jw_0 jw_02) {
        return this.a(jw_02);
    }

    private static final void d() {
        b = new String[]{hl.a("\ue45c\ue45f\ue453\ue45b\ue454\ue45f\ue447\ue45e", -397548496)};
    }

    static {
        R.d();
    }
}

