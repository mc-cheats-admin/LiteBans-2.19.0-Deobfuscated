package litebans;

import java.util.Locale;
import java.util.stream.IntStream;
import litebans.a_;
import litebans.cL;
import litebans.eG;
import litebans.ew;
import litebans.g2;
import litebans.hl;
import litebans.iC;
import litebans.k7;
import litebans.kd;
import litebans.q_0;
import org.jetbrains.annotations.NotNull;

public final class kL
extends Enum
implements CharSequence {
    public static final cL d;
    public static final kL k;
    public static final kL m;
    public static final kL b;
    public static final kL j;
    public static final kL g;
    public static final kL c;
    public static final kL f;
    public static final kL n;
    public static final kL i;
    public static final kL h;
    private static final /* synthetic */ kL[] e;
    private static final /* synthetic */ kd a;
    private static /* synthetic */ String[] l;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private kL() {
        void var2_-1;
        void var1_-1;
    }

    public final boolean a() {
        boolean bl;
        switch (k7.a[this.ordinal()]) {
            case 1: 
            case 2: 
            case 3: 
            case 4: {
                bl = true;
                break;
            }
            default: {
                bl = false;
            }
        }
        return bl;
    }

    public final a_ c() {
        a_ a_2;
        switch (k7.a[this.ordinal()]) {
            case 1: {
                a_2 = a_.h;
                break;
            }
            case 3: {
                a_2 = a_.c;
                break;
            }
            case 2: {
                a_2 = a_.j;
                break;
            }
            case 4: {
                a_2 = a_.g;
                break;
            }
            default: {
                throw new UnsupportedOperationException();
            }
        }
        return a_2;
    }

    @Override
    public String toString() {
        return kL.a(this, null, false, 3, null);
    }

    public int e() {
        return this.toString().length();
    }

    @Override
    public IntStream chars() {
        return this.toString().chars();
    }

    public char a(int n) {
        return this.toString().charAt(n);
    }

    @Override
    public CharSequence subSequence(int n, int n2) {
        return this.toString().subSequence(n, n2);
    }

    public final String a(@NotNull Locale locale, boolean bl) {
        if (g2.b.c()) {
            q_0 q_02 = (q_0)g2.b.a().a(q_0.class);
            String string = this.name().toLowerCase(locale);
            if (q_02 != null) {
                eG eG2 = q_02.f();
                string = eG2.d() + string;
                if (ew.a((Object)q_02.f().aF(), (Object)"h2") && bl) {
                    string = string.toUpperCase(locale);
                }
                return string;
            }
        }
        return this.name();
    }

    public static /* synthetic */ String a(kL kL2, Locale locale, boolean bl, int n, Object object) {
        if (object != null) {
            throw new UnsupportedOperationException("");
        }
        if ((n & 1) != 0) {
            locale = Locale.ENGLISH;
        }
        if ((n & 2) != 0) {
            bl = true;
        }
        return kL2.a(locale, bl);
    }

    public static kL[] values() {
        return (kL[])e.clone();
    }

    public static kL a(String string) {
        return Enum.valueOf(kL.class, string);
    }

    @Override
    public final int length() {
        return this.e();
    }

    @Override
    public final char charAt(int n) {
        return this.a(n);
    }

    static {
        kL.d();
        k = new kL("BANS", 0);
        m = new kL("MUTES", 1);
        b = new kL("WARNINGS", 2);
        j = new kL("KICKS", 3);
        g = new kL("HISTORY", 4);
        c = new kL("SYNC", 5);
        f = new kL("SERVERS", 6);
        n = new kL("CACHE8K", 7);
        i = new kL("CONFIG", 8);
        h = new kL("ALLOW", 9);
        e = kLArray = new kL[]{kL.k, kL.m, kL.b, kL.j, kL.g, kL.c, kL.f, kL.n, kL.i, kL.h};
        a = iC.a(e);
        d = new cL(null);
    }

    private static final void d() {
        l = new String[]{"h2", "", "BANS", "MUTES", "WARNINGS", "KICKS", "HISTORY", "SYNC", "SERVERS", "CACHE8K", "CONFIG", "ALLOW"};
    }
}

