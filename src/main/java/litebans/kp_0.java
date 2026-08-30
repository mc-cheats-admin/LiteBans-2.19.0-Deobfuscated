package litebans;

import kotlin.jvm.internal.Reflection;
import litebans.dp_0;
import litebans.ds_0;
import litebans.ew;
import litebans.f1;
import litebans.hl;
import litebans.kl_0;

/*
 * Renamed from litebans.kP
 */
public static class kp_0
extends kl_0
implements ds_0,
f1 {
    private final int i;
    private final int h;
    private static /* synthetic */ String[] j;

    public kp_0(int n, Object object, Class clazz, String string, String string2, int n2) {
        super(object, clazz, string, string2, (n2 & 1) == 1);
        this.i = n;
        this.h = n2 >> 1;
    }

    @Override
    protected dp_0 e() {
        return Reflection.function((kp_0)this);
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof kp_0) {
            kp_0 kp_02 = (kp_0)object;
            return this.a().equals(kp_02.a()) && this.d().equals(kp_02.d()) && this.h == kp_02.h && this.i == kp_02.i && ew.a(this.c(), kp_02.c()) && ew.a((Object)this.b(), kp_02.b());
        }
        if (object instanceof f1) {
            return object.equals(this.a());
        }
        return false;
    }

    public int hashCode() {
        return ((this.b() == null ? 0 : this.b().hashCode() * 31) + this.a().hashCode()) * 31 + this.d().hashCode();
    }

    public String toString() {
        dp_0 dp_02 = this.a();
        if (dp_02 != this) {
            return dp_02.toString();
        }
        return j[0].equals(this.a()) ? j[1] : j[2] + this.a() + j[3];
    }

    private static final void a() {
        j = new String[]{hl.a("\u19cb\u199e\u1999\u199e\u1983\u19c9", -1980229129), hl.a("\u107b\u1077\u1076\u106b\u106c\u106a\u106d\u107b\u106c\u1077\u106a\u1038\u1030\u1053\u1077\u106c\u1074\u1071\u1076\u1038\u106a\u107d\u107e\u1074\u107d\u107b\u106c\u1071\u1077\u1076\u1038\u1071\u106b\u1038\u1076\u1077\u106c\u1038\u1079\u106e\u1079\u1071\u1074\u1079\u107a\u1074\u107d\u1031", 786370584), hl.a("\u9d65\u9d76\u9d6d\u9d60\u9d77\u9d6a\u9d6c\u9d6d\u9d23", -388588285), hl.a("\u02a9\u02a1\u02c2\u02e6\u02fd\u02e5\u02e0\u02e7\u02a9\u02fb\u02ec\u02ef\u02e5\u02ec\u02ea\u02fd\u02e0\u02e6\u02e7\u02a9\u02e0\u02fa\u02a9\u02e7\u02e6\u02fd\u02a9\u02e8\u02ff\u02e8\u02e0\u02e5\u02e8\u02eb\u02e5\u02ec\u02a0", -789118327)};
    }

    static {
        kp_0.a();
    }
}

