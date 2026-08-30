package litebans;

import java.util.ArrayList;
import java.util.List;
import litebans.a9;
import litebans.aJ;
import litebans.at;
import litebans.aw;
import litebans.dw;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class g9 {
    private String e;
    private String b;
    private String d;
    private int f;
    private aw c;
    private String i;
    private a9 h;
    private dw a;
    private final List g;

    public g9(@Nullable String string, @Nullable String string2, @Nullable String string3, int n, @Nullable aw aw2, @Nullable String string4, @Nullable a9 a92, @Nullable dw dw2, @NotNull List list) {
        this.e = string;
        this.b = string2;
        this.d = string3;
        this.f = n;
        this.c = aw2;
        this.i = string4;
        this.h = a92;
        this.a = dw2;
        this.g = list;
    }

    public /* synthetic */ g9(String string, String string2, String string3, int n, aw aw2, String string4, a9 a92, dw dw2, List list, int n2, aJ aJ2) {
        if ((n2 & 1) != 0) {
            string = null;
        }
        if ((n2 & 2) != 0) {
            string2 = null;
        }
        if ((n2 & 4) != 0) {
            string3 = null;
        }
        if ((n2 & 8) != 0) {
            n = 0xFFFFFF;
        }
        if ((n2 & 0x10) != 0) {
            aw2 = null;
        }
        if ((n2 & 0x20) != 0) {
            string4 = null;
        }
        if ((n2 & 0x40) != 0) {
            a92 = null;
        }
        if ((n2 & 0x80) != 0) {
            dw2 = null;
        }
        if ((n2 & 0x100) != 0) {
            list = new ArrayList();
        }
        this(string, string2, string3, n, aw2, string4, a92, dw2, list);
    }

    public final String f() {
        return this.e;
    }

    public final String h() {
        return this.b;
    }

    public final String b() {
        return this.d;
    }

    public final int a() {
        return this.f;
    }

    public final aw g() {
        return this.c;
    }

    public final String e() {
        return this.i;
    }

    public final a9 d() {
        return this.h;
    }

    public final dw c() {
        return this.a;
    }

    public final List i() {
        return this.g;
    }

    public final g9 a(@Nullable String string, @Nullable String string2, boolean bl) {
        this.g.add(new at(this, string, string2, bl));
        return this;
    }

    public g9() {
        this(null, null, null, 0, null, null, null, null, null, 511, null);
    }
}

