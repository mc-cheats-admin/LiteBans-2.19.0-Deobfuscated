package litebans;

import litebans.ew;
import litebans.gb;
import litebans.hl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from litebans.jp
 */
public static final class jp_0 {
    public static final gb c;
    private final byte b;
    private final String e;
    public static final byte f;
    public static final byte d;
    public static final byte g;
    private static /* synthetic */ String[] a;

    public jp_0(byte by2, @NotNull String string) {
        this.b = by2;
        this.e = string;
    }

    public final byte d() {
        return this.b;
    }

    public final String a() {
        return this.e;
    }

    public final String b() {
        byte by2 = this.b;
        if (by2 == 0) {
            return a[0];
        }
        if (by2 == 1) {
            return a[1];
        }
        if (by2 == 2) {
            return a[2];
        }
        throw new AssertionError();
    }

    public String toString() {
        return a[3] + this.b + a[4] + this.e + ')';
    }

    public int hashCode() {
        int n = Byte.hashCode(this.b);
        n = n * 31 + this.e.hashCode();
        return n;
    }

    public boolean equals(@Nullable Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof jp_0)) {
            return false;
        }
        jp_0 jp_02 = (jp_0)object;
        if (this.b != jp_02.b) {
            return false;
        }
        return ew.a((Object)this.e, (Object)jp_02.e);
    }

    static {
        g = (byte)2;
        d = 1;
        f = 0;
        jp_0.c();
        c = new gb(null);
    }

    private static final void c() {
        a = new String[]{hl.a("\u439f\u4390\u439c\u4394", -1374272527), hl.a("\u5b18\u5b18\u5b04\u5b09", -982688915), hl.a("\u0f3a\u0f23", 750325587), hl.a("\u5b3d\u5b08\u5b1b\u5b0e\u5b0c\u5b1d\u5b41\u5b1d\u5b10\u5b19\u5b0c\u5b54", 1532124009), hl.a("\u2908\u2904\u2950\u2945\u2956\u2943\u2941\u2950\u2919", -2018367196)};
    }
}

