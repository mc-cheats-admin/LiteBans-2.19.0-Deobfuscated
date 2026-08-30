package litebans;

import litebans.aJ;
import litebans.bi;
import litebans.di_0;
import litebans.fg_0;
import litebans.g2;
import litebans.h1;
import litebans.hl;
import litebans.jv_0;
import litebans.y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class fo_0 {
    private static /* synthetic */ String[] a;

    private fo_0() {
    }

    public final ThreadLocal b() {
        return fg_0.c();
    }

    public final Void a(@Nullable Object object) {
        throw new bi(object);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void a(@NotNull jv_0 jv_02, @NotNull CharSequence charSequence, @NotNull di_0 di_02) {
        if (charSequence.length() == 0) {
            return;
        }
        boolean bl = false;
        if (bl) {
            return;
        }
        y y2 = (y)di_02.a(y.class);
        CharSequence charSequence2 = charSequence;
        int n = 4096;
        boolean bl2 = false;
        String string = h1.a(((Object)charSequence2).toString(), n);
        String string2 = y2.a(jv_02, string);
        if (string2 == null) {
            return;
        }
        charSequence2 = string2;
        if (!jv_02.e() && di_02.t() == 0) {
            di_0 di_03 = di_02;
            bl2 = false;
            di_0 di_04 = di_03;
            boolean bl3 = false;
            if (!(!di_04.isEnabled() || di_03.s())) {
                di_02.c(() -> fo_0.a(jv_02, (String)charSequence2));
                return;
            }
        }
        jv_02.a((String)charSequence2);
    }

    public static /* synthetic */ void a(fo_0 fo_02, jv_0 jv_02, CharSequence charSequence, di_0 di_02, int n, Object object) {
        if ((n & 4) != 0) {
            di_02 = g2.b.a();
        }
        fo_02.a(jv_02, charSequence, di_02);
    }

    private static final void a(jv_0 jv_02, String string) {
        jv_02.a(string);
    }

    public /* synthetic */ fo_0(aJ aJ2) {
        this();
    }

    private static final void a() {
        a = new String[]{""};
    }

    static {
        fo_0.a();
    }
}

