package litebans;

import litebans.aJ;
import litebans.bz;
import litebans.jj_0;
import litebans.jv_0;
import org.jetbrains.annotations.Nullable;

public final class d9 {
    private String d;
    private String e;
    private String g;
    private String c;
    private String a;
    private final jv_0 b;
    private final String f;

    public d9(@Nullable String string, @Nullable String string2, @Nullable String string3, @Nullable String string4, @Nullable String string5, @Nullable jv_0 jv_02, @Nullable String string6) {
        this.d = string;
        this.e = string2;
        this.g = string3;
        this.c = string4;
        this.a = string5;
        this.b = jv_02;
        this.f = string6;
        String string7 = this.a;
        this.a = string7 != null ? bz.a(string7, '*', '%', false, 4, null) : null;
    }

    public /* synthetic */ d9(String string, String string2, String string3, String string4, String string5, jv_0 jv_02, String string6, int n, aJ aJ2) {
        if ((n & 2) != 0) {
            string2 = string;
        }
        if ((n & 4) != 0) {
            string3 = string;
        }
        if ((n & 0x20) != 0) {
            jv_02 = null;
        }
        if ((n & 0x40) != 0) {
            string6 = string;
        }
        this(string, string2, string3, string4, string5, jv_02, string6);
    }

    public final String d() {
        return this.e;
    }

    public final void a(@Nullable String string) {
        this.e = string;
    }

    public final String f() {
        return this.g;
    }

    public final void b(@Nullable String string) {
        this.g = string;
    }

    public final String a() {
        return this.c;
    }

    public final String c() {
        return this.a;
    }

    public final jv_0 e() {
        return this.b;
    }

    public final String g() {
        return this.f;
    }

    public final boolean b() {
        boolean bl;
        String string = this.f;
        if (string != null) {
            String string2 = string;
            boolean bl2 = false;
            bl = jj_0.a.i(string2);
        } else {
            bl = false;
        }
        return bl;
    }
}

