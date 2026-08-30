package litebans;

import litebans.aJ;
import litebans.hl;
import org.jetbrains.annotations.NotNull;

public final class i4 {
    private final String b;
    private final String e;
    private final String d;
    private final String f;
    private final boolean a;
    private final boolean c;
    private static /* synthetic */ String[] g;

    public i4(@NotNull String string, @NotNull String string2, @NotNull String string3, @NotNull String string4, boolean bl, boolean bl2) {
        this.b = string;
        this.e = string2;
        this.d = string3;
        this.f = string4;
        this.a = bl;
        this.c = bl2;
    }

    public /* synthetic */ i4(String string, String string2, String string3, String string4, boolean bl, boolean bl2, int n, aJ aJ2) {
        if ((n & 8) != 0) {
            string4 = "";
        }
        if ((n & 0x10) != 0) {
            bl = false;
        }
        if ((n & 0x20) != 0) {
            bl2 = false;
        }
        this(string, string2, string3, string4, bl, bl2);
    }

    public final String e() {
        return this.b;
    }

    public final String g() {
        return this.e;
    }

    public final String c() {
        return this.d;
    }

    public final String a() {
        return this.f;
    }

    public final boolean b() {
        return this.a;
    }

    public final boolean d() {
        return this.c;
    }

    private static final void f() {
        g = new String[]{""};
    }

    static {
        i4.f();
    }
}

