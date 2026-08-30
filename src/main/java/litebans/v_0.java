package litebans;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import litebans.eu_0;
import litebans.gq;
import litebans.hl;
import litebans.io_0;
import litebans.ka_0;
import litebans.kf_0;

/*
 * Renamed from litebans.V
 */
public static abstract class v_0 {
    v_0 a;
    private ka_0 g = new ka_0();
    private String h;
    private List f;
    private kf_0 d;
    private eu_0 c;
    private transient boolean b;
    private static /* synthetic */ String[] e;

    @Deprecated
    public v_0() {
    }

    v_0(v_0 v_02) {
        this.a(v_02, io_0.f, true);
        if (v_02.v() != null) {
            for (v_0 v_03 : v_02.v()) {
                this.a(v_03.p());
            }
        }
    }

    public void a(v_0 v_02, io_0 io_02, boolean bl) {
        if (io_02 == io_0.d || io_02 == io_0.f) {
            if (bl || this.d == null) {
                this.a(v_02.f());
            }
            if (bl || this.c == null) {
                this.a(v_02.h());
            }
        }
        if (io_02 == io_0.e || io_02 == io_0.f) {
            if (bl || !this.g.h()) {
                this.a(v_02.k());
            }
            if (bl || !this.g.m()) {
                this.a(v_02.t());
            }
            if (bl || !this.g.r()) {
                this.a(v_02.q());
            }
            if (bl || this.g.q() == null) {
                this.d(v_02.l());
            }
            if (bl || this.g.k() == null) {
                this.c(v_02.o());
            }
            if (bl || this.g.e() == null) {
                this.b(v_02.i());
            }
            if (bl || this.g.i() == null) {
                this.e(v_02.d());
            }
            if (bl || this.g.n() == null) {
                this.a(v_02.m());
            }
            if (bl || this.h == null) {
                this.b(v_02.s());
            }
        }
    }

    public abstract v_0 p();

    public static String a(v_0[] v_0Array) {
        StringBuilder stringBuilder = new StringBuilder();
        for (v_0 v_02 : v_0Array) {
            stringBuilder.append(v_02.a());
        }
        return stringBuilder.toString();
    }

    public void a(gq gq2) {
        this.g.a(gq2);
    }

    public gq u() {
        if (!this.g.h()) {
            if (this.a == null) {
                return gq.x;
            }
            return this.a.u();
        }
        return this.g.d();
    }

    public gq k() {
        return this.g.d();
    }

    public void a(Color color) {
        this.g.a(color);
    }

    public Color t() {
        return this.g.c();
    }

    public void a(String string) {
        this.g.a(string);
    }

    public String q() {
        return this.g.g();
    }

    public void d(Boolean bl) {
        this.g.b(bl);
    }

    public boolean e() {
        if (this.g.q() == null) {
            return this.a != null && this.a.e();
        }
        return this.g.o();
    }

    public Boolean l() {
        return this.g.q();
    }

    public void c(Boolean bl) {
        this.g.d(bl);
    }

    public boolean j() {
        if (this.g.k() == null) {
            return this.a != null && this.a.j();
        }
        return this.g.j();
    }

    public Boolean o() {
        return this.g.k();
    }

    public void b(Boolean bl) {
        this.g.c(bl);
    }

    public boolean g() {
        if (this.g.e() == null) {
            return this.a != null && this.a.g();
        }
        return this.g.l();
    }

    public Boolean i() {
        return this.g.e();
    }

    public void e(Boolean bl) {
        this.g.e(bl);
    }

    public boolean r() {
        if (this.g.i() == null) {
            return this.a != null && this.a.r();
        }
        return this.g.p();
    }

    public Boolean d() {
        return this.g.i();
    }

    public void a(Boolean bl) {
        this.g.a(bl);
    }

    public boolean n() {
        if (this.g.n() == null) {
            return this.a != null && this.a.n();
        }
        return this.g.a();
    }

    public Boolean m() {
        return this.g.n();
    }

    public void a(ka_0 ka_02) {
        if (ka_02.h()) {
            this.a(ka_02.d());
        }
        if (ka_02.m()) {
            this.a(ka_02.c());
        }
        if (ka_02.r()) {
            this.a(ka_02.g());
        }
        if (ka_02.q() != null) {
            this.d(ka_02.q());
        }
        if (ka_02.k() != null) {
            this.c(ka_02.k());
        }
        if (ka_02.e() != null) {
            this.b(ka_02.e());
        }
        if (ka_02.i() != null) {
            this.e(ka_02.i());
        }
        if (ka_02.n() != null) {
            this.a(ka_02.n());
        }
    }

    public void a(List list) {
        for (v_0 v_02 : list) {
            v_02.a = this;
        }
        this.f = list;
    }

    public void a(v_0 v_02) {
        if (this.f == null) {
            this.f = new ArrayList();
        }
        v_02.a = this;
        this.f.add(v_02);
    }

    public String a() {
        StringBuilder stringBuilder = new StringBuilder();
        this.a(stringBuilder);
        return stringBuilder.toString();
    }

    void a(StringBuilder stringBuilder) {
        if (this.f != null) {
            for (v_0 v_02 : this.f) {
                v_02.a(stringBuilder);
            }
        }
    }

    void b(StringBuilder stringBuilder) {
        stringBuilder.append(this.u());
        if (this.e()) {
            stringBuilder.append(gq.t);
        }
        if (this.j()) {
            stringBuilder.append(gq.k);
        }
        if (this.g()) {
            stringBuilder.append(gq.A);
        }
        if (this.r()) {
            stringBuilder.append(gq.c);
        }
        if (this.n()) {
            stringBuilder.append(gq.b);
        }
    }

    public void b(String string) {
        this.h = string;
    }

    public void a(kf_0 kf_02) {
        this.d = kf_02;
    }

    public void a(eu_0 eu_02) {
        this.c = eu_02;
    }

    public void a(boolean bl) {
        this.b = bl;
    }

    public String toString() {
        return e[0] + this.b() + e[1] + this.s() + e[2] + this.v() + e[3] + this.f() + e[4] + this.h() + e[5] + this.w() + e[6];
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof v_0)) {
            return false;
        }
        v_0 v_02 = (v_0)object;
        if (!v_02.a((Object)this)) {
            return false;
        }
        ka_0 ka_02 = this.b();
        ka_0 ka_03 = v_02.b();
        if (ka_02 == null ? ka_03 != null : !((Object)ka_02).equals(ka_03)) {
            return false;
        }
        String string = this.s();
        String string2 = v_02.s();
        if (string == null ? string2 != null : !string.equals(string2)) {
            return false;
        }
        List list = this.v();
        List list2 = v_02.v();
        if (list == null ? list2 != null : !((Object)list).equals(list2)) {
            return false;
        }
        kf_0 kf_02 = this.f();
        kf_0 kf_03 = v_02.f();
        if (kf_02 == null ? kf_03 != null : !((Object)kf_02).equals(kf_03)) {
            return false;
        }
        eu_0 eu_02 = this.h();
        eu_0 eu_03 = v_02.h();
        return !(eu_02 == null ? eu_03 != null : !((Object)eu_02).equals(eu_03));
    }

    protected boolean a(Object object) {
        return object instanceof v_0;
    }

    public int hashCode() {
        int n = 59;
        int n2 = 1;
        ka_0 ka_02 = this.b();
        n2 = n2 * 59 + (ka_02 == null ? 43 : ((Object)ka_02).hashCode());
        String string = this.s();
        n2 = n2 * 59 + (string == null ? 43 : string.hashCode());
        List list = this.v();
        n2 = n2 * 59 + (list == null ? 43 : ((Object)list).hashCode());
        kf_0 kf_02 = this.f();
        n2 = n2 * 59 + (kf_02 == null ? 43 : ((Object)kf_02).hashCode());
        eu_0 eu_02 = this.h();
        n2 = n2 * 59 + (eu_02 == null ? 43 : ((Object)eu_02).hashCode());
        return n2;
    }

    public ka_0 b() {
        return this.g;
    }

    public String s() {
        return this.h;
    }

    public List v() {
        return this.f;
    }

    public kf_0 f() {
        return this.d;
    }

    public eu_0 h() {
        return this.c;
    }

    public boolean w() {
        return this.b;
    }

    private static final void c() {
        e = new String[]{hl.a("\ude0d\ude2e\ude3c\ude2a\ude0c\ude20\ude22\ude3f\ude20\ude21\ude2a\ude21\ude3b\ude67\ude3c\ude3b\ude36\ude23\ude2a\ude72", 1266212431), hl.a("\u870f\u8703\u874a\u874d\u8750\u8746\u8751\u8757\u874a\u874c\u874d\u871e", 884246307), hl.a("\u8c33\u8c3f\u8c7a\u8c67\u8c6b\u8c6d\u8c7e\u8c22", -1515025377), hl.a("\ufc9d\ufc91\ufcd2\ufcdd\ufcd8\ufcd2\ufcda\ufcf4\ufcc7\ufcd4\ufcdf\ufcc5\ufc8c", -1692009295), hl.a("\u5b4b\u5b47\u5b0f\u5b08\u5b11\u5b02\u5b15\u5b22\u5b11\u5b02\u5b09\u5b13\u5b5a", 256138087), hl.a("\u0672\u067e\u062c\u063b\u062d\u063b\u062a\u0663", -593099170), hl.a("\ub9c6", -1018643985)};
    }

    static {
        v_0.c();
    }
}

