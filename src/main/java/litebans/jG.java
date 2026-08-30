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

public final class jG {
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
        return ew.a((Object)string, (Object)this.b()) || bz.a(string, "global", true) || bz.a(string, "all", true);
    }

    public final boolean a(@Nullable String string) {
        return bz.a(string, "local", true) || bz.a(string, "this", true);
    }

    public final eq_0 a(@NotNull jv_0 jv_02, @NotNull List list, @NotNull String string, boolean bl) {
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            String string2;
            String string3 = (String)iterator.next();
            if (string3.length() >= 7 && bz.b((string2 = string3).toLowerCase(Locale.ENGLISH), "server:", false, 2, null)) {
                string2 = string3.substring(7);
                string2 = this.a(string2, string, jv_02);
                if (bl) {
                    iterator.remove();
                }
                return new eq_0(string2);
            }
            if (ew.a((Object)string3, (Object)"--")) {
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
            return "global";
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
        a = new String[]{"global", "all", "local", "this", "server:", "--", "global"};
    }

    static {
        jG.a();
    }
}

