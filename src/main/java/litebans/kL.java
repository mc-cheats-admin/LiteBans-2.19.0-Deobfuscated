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

public static final class kL
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
                if (ew.a((Object)q_02.f().aF(), (Object)l[0]) && bl) {
                    string = string.toUpperCase(locale);
                }
                return string;
            }
        }
        return this.name();
    }

    public static /* synthetic */ String a(kL kL2, Locale locale, boolean bl, int n, Object object) {
        if (object != null) {
            throw new UnsupportedOperationException(l[1]);
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
        k = new kL(l[2], 0);
        m = new kL(l[3], 1);
        b = new kL(l[4], 2);
        j = new kL(l[5], 3);
        g = new kL(l[6], 4);
        c = new kL(l[7], 5);
        f = new kL(l[8], 6);
        n = new kL(l[9], 7);
        i = new kL(l[10], 8);
        h = new kL(l[11], 9);
        e = kLArray = new kL[]{kL.k, kL.m, kL.b, kL.j, kL.g, kL.c, kL.f, kL.n, kL.i, kL.h};
        a = iC.a(e);
        d = new cL(null);
    }

    private static final void d() {
        l = new String[]{hl.a("\u8db3\u8de9", 2108591579), hl.a("", 1908361597), hl.a("\u7d8b\u7d88\u7d87\u7d9a", 1753906633), hl.a("\uda90\uda88\uda89\uda98\uda8e", 1018288861), hl.a("\uef95\uef83\uef90\uef8c\uef8b\uef8c\uef85\uef91", 1899556802), hl.a("\uf20a\uf208\uf202\uf20a\uf212", 492302913), hl.a("\ua9ce\ua9cf\ua9d5\ua9d2\ua9c9\ua9d4\ua9df", 1093183878), hl.a("\u8412\u8418\u840f\u8402", 1685423169), hl.a("\u7e96\u7e80\u7e97\u7e93\u7e80\u7e97\u7e96", -1802731835), hl.a("\u5600\u5602\u5600\u560b\u5606\u567b\u5608", 1462916675), hl.a("\ud7ed\ud7e1\ud7e0\ud7e8\ud7e7\ud7e9", 110090158), hl.a("\u1ff2\u1fff\u1fff\u1ffc\u1fe4", 1256005555)};
    }
}

