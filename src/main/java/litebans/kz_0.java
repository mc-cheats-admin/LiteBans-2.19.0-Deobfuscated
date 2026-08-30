package litebans;

import java.util.zip.ZipException;
import litebans.en_0;
import litebans.hn_0;
import litebans.jo_0;

/*
 * Renamed from litebans.kZ
 */
public static final class kz_0
implements jo_0 {
    public static final int e;
    public static final int g;
    public static final int a;
    public static final kz_0 f;
    public static final kz_0 b;
    public static final kz_0 c;
    private final int d;

    private kz_0(int n) {
        this.d = n;
    }

    @Override
    public en_0 a(byte[] byArray, int n, int n2, boolean bl, int n3) {
        switch (this.d) {
            case 0: {
                throw new ZipException("Bad extra field starting at " + n + ".  Block length of " + n3 + " bytes exceeds remaining data of " + (n2 - 4) + " bytes.");
            }
            case 2: {
                hn_0 hn_02 = new hn_0();
                if (bl) {
                    hn_02.a(byArray, n, n2);
                } else {
                    hn_02.b(byArray, n, n2);
                }
                return hn_02;
            }
            case 1: {
                return null;
            }
        }
        throw new ZipException("Unknown UnparseableExtraField key: " + this.d);
    }

    static {
        a = 2;
        g = 1;
        e = 0;
        f = new kz_0(0);
        b = new kz_0(1);
        c = new kz_0(2);
    }
}

