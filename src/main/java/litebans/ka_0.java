package litebans;

import java.awt.Color;
import litebans.ae;
import litebans.gq;

public final class ka_0
implements Cloneable {
    private gq f;
    private Color g;
    private String d;
    private Boolean a;
    private Boolean e;
    private Boolean h;
    private Boolean b;
    private Boolean c;

    public gq d() {
        return this.f;
    }

    public boolean h() {
        return this.f != null;
    }

    public Color c() {
        return this.g;
    }

    public boolean m() {
        return this.g != null;
    }

    public String g() {
        return this.d;
    }

    public boolean r() {
        return this.d != null;
    }

    public boolean o() {
        return this.a != null && this.a != false;
    }

    public Boolean q() {
        return this.a;
    }

    public boolean j() {
        return this.e != null && this.e != false;
    }

    public Boolean k() {
        return this.e;
    }

    public boolean l() {
        return this.h != null && this.h != false;
    }

    public Boolean e() {
        return this.h;
    }

    public boolean p() {
        return this.b != null && this.b != false;
    }

    public Boolean i() {
        return this.b;
    }

    public boolean a() {
        return this.c != null && this.c != false;
    }

    public Boolean n() {
        return this.c;
    }

    public ka_0 f() {
        return new ka_0(this.f, this.g, this.d, this.a, this.e, this.h, this.b, this.c);
    }

    public static ae b() {
        return new ae();
    }

    public void a(gq gq2) {
        this.f = gq2;
    }

    public void a(Color color) {
        this.g = color;
    }

    public void a(String string) {
        this.d = string;
    }

    public void b(Boolean bl) {
        this.a = bl;
    }

    public void d(Boolean bl) {
        this.e = bl;
    }

    public void c(Boolean bl) {
        this.h = bl;
    }

    public void e(Boolean bl) {
        this.b = bl;
    }

    public void a(Boolean bl) {
        this.c = bl;
    }

    public ka_0(gq gq2, Color color, String string, Boolean bl, Boolean bl2, Boolean bl3, Boolean bl4, Boolean bl5) {
        this.f = gq2;
        this.g = color;
        this.d = string;
        this.a = bl;
        this.e = bl2;
        this.h = bl3;
        this.b = bl4;
        this.c = bl5;
    }

    public ka_0() {
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof ka_0)) {
            return false;
        }
        ka_0 ka_02 = (ka_0)object;
        Boolean bl = this.a;
        Boolean bl2 = ka_02.a;
        if (bl == null ? bl2 != null : !((Object)bl).equals(bl2)) {
            return false;
        }
        Boolean bl3 = this.e;
        Boolean bl4 = ka_02.e;
        if (bl3 == null ? bl4 != null : !((Object)bl3).equals(bl4)) {
            return false;
        }
        Boolean bl5 = this.h;
        Boolean bl6 = ka_02.h;
        if (bl5 == null ? bl6 != null : !((Object)bl5).equals(bl6)) {
            return false;
        }
        Boolean bl7 = this.b;
        Boolean bl8 = ka_02.b;
        if (bl7 == null ? bl8 != null : !((Object)bl7).equals(bl8)) {
            return false;
        }
        Boolean bl9 = this.c;
        Boolean bl10 = ka_02.c;
        if (bl9 == null ? bl10 != null : !((Object)bl9).equals(bl10)) {
            return false;
        }
        gq gq2 = this.d();
        gq gq3 = ka_02.d();
        if (gq2 == null ? gq3 != null : !((Object)gq2).equals(gq3)) {
            return false;
        }
        Color color = this.c();
        Color color2 = ka_02.c();
        if (color == null ? color2 != null : !((Object)color).equals(color2)) {
            return false;
        }
        String string = this.g();
        String string2 = ka_02.g();
        return !(string == null ? string2 != null : !string.equals(string2));
    }

    public int hashCode() {
        int n = 59;
        int n2 = 1;
        Boolean bl = this.a;
        n2 = n2 * 59 + (bl == null ? 43 : ((Object)bl).hashCode());
        Boolean bl2 = this.e;
        n2 = n2 * 59 + (bl2 == null ? 43 : ((Object)bl2).hashCode());
        Boolean bl3 = this.h;
        n2 = n2 * 59 + (bl3 == null ? 43 : ((Object)bl3).hashCode());
        Boolean bl4 = this.b;
        n2 = n2 * 59 + (bl4 == null ? 43 : ((Object)bl4).hashCode());
        Boolean bl5 = this.c;
        n2 = n2 * 59 + (bl5 == null ? 43 : ((Object)bl5).hashCode());
        gq gq2 = this.d();
        n2 = n2 * 59 + (gq2 == null ? 43 : ((Object)gq2).hashCode());
        Color color = this.c();
        n2 = n2 * 59 + (color == null ? 43 : ((Object)color).hashCode());
        String string = this.g();
        n2 = n2 * 59 + (string == null ? 43 : string.hashCode());
        return n2;
    }

    public Object clone() {
        return this.f();
    }
}

