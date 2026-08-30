package litebans;

import litebans.bz;
import litebans.ch;
import litebans.eo_0;
import litebans.fg_0;
import litebans.fk_0;
import litebans.h1;
import litebans.hl;
import litebans.iv_0;
import litebans.jv_0;
import litebans.kR;
import litebans.q_0;

public final class jf_0
implements eo_0 {
    final /* synthetic */ boolean e;
    final /* synthetic */ String b;
    final /* synthetic */ fk_0 c;
    final /* synthetic */ String d;
    final /* synthetic */ jv_0 a;
    private static /* synthetic */ String[] f;

    public jf_0(boolean bl, String string, fk_0 fk_02, String string2, jv_0 jv_02) {
        this.e = bl;
        this.b = string;
        this.c = fk_02;
        this.d = string2;
        this.a = jv_02;
    }

    public final void a(ch ch2) {
        if (this.e) {
            CharSequence charSequence = this.b;
            fg_0 fg_02 = this.c;
            boolean bl = false;
            byte by2 = ((q_0)fg_02.h().a(q_0.class)).f().be();
            bl = false;
            kR.a(ch2, h1.a(((Object)charSequence).toString(), by2 & 0xFF), this.d, this.a.b(), false, false, 16, null);
        } else if (this.a.e()) {
            CharSequence charSequence = this.a.i();
            fg_0 fg_03 = this.c;
            boolean bl = false;
            byte by3 = ((q_0)fg_03.h().a(q_0.class)).f().be();
            bl = false;
            kR.a(ch2, h1.a(((Object)charSequence).toString(), by3 & 0xFF), this.a.a(), this.a.b(), false, false, 16, null);
        } else if (this.a.f() && !bz.a(this.b, "CONSOLE", true) || !this.a.f()) {
            CharSequence charSequence = this.b;
            fg_0 fg_04 = this.c;
            boolean bl = false;
            byte by4 = ((q_0)fg_04.h().a(q_0.class)).f().be();
            bl = false;
            kR.a(ch2, h1.a(((Object)charSequence).toString(), by4 & 0xFF), this.d, "#", false, false, 16, null);
        } else if (this.a.f()) {
            kR.a(ch2, "CONSOLE", "CONSOLE", "#", false, false, 16, null);
        }
    }

    @Override
    public Object a(Object object) {
        this.a((ch)object);
        return iv_0.a;
    }

    private static final void a() {
        f = new String[]{"CONSOLE", "#", "CONSOLE", "CONSOLE", "#"};
    }

    static {
        jf_0.a();
    }
}

