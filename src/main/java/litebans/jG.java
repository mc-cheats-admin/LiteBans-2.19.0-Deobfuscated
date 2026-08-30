package litebans;

import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import litebans.aJ;
import litebans.bz;
import litebans.eq_0;
import litebans.ew;
import litebans.h1;
import litebans.hl;
import litebans.jv_0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public static final class jG {
    private static /* synthetic */ String[] a;

    private jG() {
    }

    public final String b() {
        return eq_0.c();
    }

    public final eq_0 c() {
        return eq_0.b();
    }

    public final boolean b(@Nullable String string) {
        return ew.a((Object)string, (Object)this.b()) || bz.a(string, a[0], true) || bz.a(string, a[1], true);
    }

    public final boolean a(@Nullable String string) {
        return bz.a(string, a[2], true) || bz.a(string, a[3], true);
    }

    public final eq_0 a(@NotNull jv_0 jv_02, @NotNull List list, @NotNull String string, boolean bl) {
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            String string2;
            String string3 = (String)iterator.next();
            if (string3.length() >= 7 && bz.b((string2 = string3).toLowerCase(Locale.ENGLISH), a[4], false, 2, null)) {
                string2 = string3.substring(7);
                string2 = this.a(string2, string, jv_02);
                if (bl) {
                    iterator.remove();
                }
                return new eq_0(string2);
            }
            if (ew.a((Object)string3, (Object)a[5])) {
                return this.c();
            }
            if (!bz.a((CharSequence)string3, '-', false, 2, null) || !bz.c((CharSequence)string3, 'g', false, 2, null)) continue;
            if (bl) {
                iterator.remove();
            }
            return new eq_0(this.b());
        }
        return this.c();
    }

    public static /* synthetic */ eq_0 a(jG jG2, jv_0 jv_02, List list, String string, boolean bl, int n, Object object) {
        if ((n & 8) != 0) {
            bl = true;
        }
        return jG2.a(jv_02, list, string, bl);
    }

    public final String c(@Nullable String string) {
        if (string == null || this.b(string)) {
            return this.b();
        }
        return this.d(string);
    }

    public final String d(@NotNull String string) {
        return h1.a(string, 32);
    }

    public final String a(@NotNull String string, @NotNull String string2, @NotNull jv_0 jv_02) {
        if (this.b(string)) {
            return a[6];
        }
        if (this.a(string)) {
            String string3 = jv_02.h();
            String string4 = string3;
            if (string4 == null) {
                string4 = string2;
            }
            return string4;
        }
        return this.d(string);
    }

    public final boolean a(@NotNull String string, @NotNull String string2) {
        return this.b(string) || this.b(string2) ? true : bz.a(this.d(string), this.d(string2), true);
    }

    public /* synthetic */ jG(aJ aJ2) {
        this();
    }

    private static final void a() {
        a = new String[]{hl.a("\u5797\u579c\u579f\u5792\u5791\u579c", 1455052784), hl.a("\ua8cd\ua8c0\ua8c0", -1148802900), hl.a("\ub3ae\ub3ad\ub3a1\ub3a3\ub3ae", 1726002114), hl.a("\udf31\udf2d\udf2c\udf36", 1910169413), hl.a("\u7caa\u7cbc\u7cab\u7caf\u7cbc\u7cab\u7ce3", 831618265), hl.a("\u972d\u972d", 1077516032), hl.a("\u1649\u1642\u1641\u164c\u164f\u1642", -911731154)};
    }

    static {
        jG.a();
    }
}

