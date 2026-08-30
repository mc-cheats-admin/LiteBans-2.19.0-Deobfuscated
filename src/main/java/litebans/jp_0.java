package litebans;

import litebans.ew;
import litebans.gb;
import litebans.hl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class jp_0 {
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
            return "name";
        }
        if (by2 == 1) {
            return "uuid";
        }
        if (by2 == 2) {
            return "ip";
        }
        throw new AssertionError();
    }

    public String toString() {
        return "Target(type=" + this.b + ", target=" + this.e + ')';
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
        a = new String[]{"name", "uuid", "ip", "Target(type=", ", target="};
    }
}

