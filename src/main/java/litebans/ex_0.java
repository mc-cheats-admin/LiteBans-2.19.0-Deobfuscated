package litebans;

import java.util.Arrays;
import java.util.zip.ZipException;
import litebans.ab_0;
import litebans.co_0;
import litebans.dt_0;
import litebans.ej_0;
import litebans.en_0;
import litebans.ey_0;
import litebans.i2;
import litebans.kz_0;
import litebans.y_0;

/*
 * Renamed from litebans.eX
 */
public static class ex_0
extends Enum
implements dt_0 {
    public static final ex_0 f = new ej_0(kz_0.c);
    public static final ex_0 g = new ex_0("STRICT_FOR_KNOW_EXTRA_FIELDS", 1, kz_0.c);
    public static final ex_0 b = new ey_0(kz_0.b);
    public static final ex_0 a = new ex_0("ONLY_PARSEABLE_STRICT", 3, kz_0.b);
    public static final ex_0 e = new ex_0("DRACONIC", 4, kz_0.f);
    private final kz_0 c;
    private static final /* synthetic */ ex_0[] d;

    public static final ex_0[] values() {
        return (ex_0[])d.clone();
    }

    public static final ex_0 a(String string) {
        return Enum.valueOf(ex_0.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ex_0() {
        void var3_1;
        void var2_-1;
        void var1_-1;
        this.c = var3_1;
    }

    @Override
    public en_0 a(byte[] byArray, int n, int n2, boolean bl, int n3) {
        return this.c.a(byArray, n, n2, bl, n3);
    }

    @Override
    public en_0 a(i2 i22) {
        return ab_0.a(i22);
    }

    @Override
    public en_0 a(en_0 en_02, byte[] byArray, int n, int n2, boolean bl) {
        return ab_0.a(en_02, byArray, n, n2, bl);
    }

    private static final en_0 c(en_0 en_02, byte[] byArray, int n, int n2, boolean bl) {
        try {
            return ab_0.a(en_02, byArray, n, n2, bl);
        }
        catch (ZipException zipException) {
            y_0 y_02 = new y_0();
            y_02.a(en_02.c());
            if (bl) {
                y_02.b(Arrays.copyOfRange(byArray, n, n + n2));
            } else {
                y_02.a(Arrays.copyOfRange(byArray, n, n + n2));
            }
            return y_02;
        }
    }

    /*
     * WARNING - void declaration
     */
    /* synthetic */ ex_0(kz_0 kz_02, co_0 co_02) {
        this((String)var1_-1, (int)co_02, (kz_0)var3_2);
        void var3_2;
        void var1_-1;
    }

    static final /* synthetic */ en_0 b(en_0 en_02, byte[] byArray, int n, int n2, boolean bl) {
        return ex_0.c(en_02, byArray, n, n2, bl);
    }

    static {
        d = new ex_0[]{f, g, b, a, e};
    }
}

