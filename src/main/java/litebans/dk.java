package litebans;

import litebans.am;
import litebans.db_0;
import litebans.e3;
import litebans.eZ;
import litebans.hN;
import litebans.hl;
import litebans.iC;
import litebans.kd;
import org.jetbrains.annotations.NotNull;

public static final class dk
extends Enum {
    public static final db_0 d;
    private final String[] o;
    public static final double m;
    private static final hN c;
    private static final hN e;
    public static final dk f;
    public static final dk i;
    public static final dk n;
    public static final dk a;
    public static final dk j;
    public static final dk g;
    public static final dk h;
    private static final /* synthetic */ dk[] l;
    private static final /* synthetic */ kd k;
    private static /* synthetic */ String[] b;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private dk() {
        void var3_1;
        void var2_-1;
        void var1_-1;
        this.o = var3_1;
    }

    public final long b(double d10) {
        double d11;
        double d12 = d10 * 1000.0;
        switch (eZ.a[this.ordinal()]) {
            case 1: {
                d11 = d12;
                break;
            }
            case 2: {
                d11 = d12 * 60.0;
                break;
            }
            case 3: {
                d11 = d12 * 60.0 * 60.0;
                break;
            }
            case 4: {
                d11 = d12 * 60.0 * 60.0 * 24.0;
                break;
            }
            case 5: {
                d11 = d12 * 60.0 * 60.0 * 24.0 * 7.0;
                break;
            }
            case 6: {
                d11 = d12 * 60.0 * 60.0 * 24.0 * 30.0;
                break;
            }
            case 7: {
                d11 = d12 * 60.0 * 60.0 * 24.0 * 365.0;
                break;
            }
            default: {
                throw new e3();
            }
        }
        return (long)d11;
    }

    public final boolean b(@NotNull String string) {
        boolean bl;
        switch (eZ.a[this.ordinal()]) {
            case 1: {
                bl = db_0.a(d, string, am.dC, am.bu);
                break;
            }
            case 2: {
                bl = db_0.a(d, string, am.r, am.cB);
                break;
            }
            case 3: {
                bl = db_0.a(d, string, am.cH, am.bh);
                break;
            }
            case 4: {
                bl = db_0.a(d, string, am.dJ, am.aq);
                break;
            }
            case 5: {
                bl = db_0.a(d, string, am.cc, am.aU);
                break;
            }
            case 6: {
                bl = db_0.a(d, string, am.ae, am.aT);
                break;
            }
            case 7: {
                bl = db_0.a(d, string, am.de, am.q);
                break;
            }
            default: {
                throw new e3();
            }
        }
        return bl;
    }

    public final CharSequence a(double d10) {
        CharSequence charSequence;
        switch (eZ.a[this.ordinal()]) {
            case 1: {
                charSequence = d.a(d10, (Object)am.dC, (Object)am.bu);
                break;
            }
            case 2: {
                charSequence = d.a(d10, (Object)am.r, (Object)am.cB);
                break;
            }
            case 3: {
                charSequence = d.a(d10, (Object)am.cH, (Object)am.bh);
                break;
            }
            case 4: {
                charSequence = d.a(d10, (Object)am.dJ, (Object)am.aq);
                break;
            }
            case 5: {
                charSequence = d.a(d10, (Object)am.cc, (Object)am.aU);
                break;
            }
            case 6: {
                charSequence = d.a(d10, (Object)am.ae, (Object)am.aT);
                break;
            }
            case 7: {
                charSequence = d.a(d10, (Object)am.de, (Object)am.q);
                break;
            }
            default: {
                throw new e3();
            }
        }
        return charSequence;
    }

    public static dk[] values() {
        return (dk[])l.clone();
    }

    public static dk a(String string) {
        return Enum.valueOf(dk.class, string);
    }

    public static final /* synthetic */ String[] a(dk dk2) {
        return dk2.o;
    }

    public static final /* synthetic */ hN d() {
        return c;
    }

    public static final /* synthetic */ hN a() {
        return e;
    }

    static {
        m = 0.0;
        dk.b();
        String[] stringArray = new String[]{b[1], b[2], b[3], b[4], b[5], b[6], b[7]};
        f = new dk(b[0], 0, stringArray);
        stringArray = new String[]{b[9], b[10], b[11], b[12], b[13], b[14]};
        i = new dk(b[8], 1, stringArray);
        stringArray = new String[]{b[16], b[17], b[18], b[19], b[20]};
        n = new dk(b[15], 2, stringArray);
        stringArray = new String[]{b[22], b[23], b[24], b[25], b[26]};
        a = new dk(b[21], 3, stringArray);
        stringArray = new String[]{b[28], b[29], b[30], b[31], b[32], b[33]};
        j = new dk(b[27], 4, stringArray);
        stringArray = new String[]{b[35], b[36], b[37], b[38], b[39]};
        g = new dk(b[34], 5, stringArray);
        stringArray = new String[]{b[41], b[42], b[43], b[44], b[45], b[46]};
        h = new dk(b[40], 6, stringArray);
        l = dkArray = new dk[]{dk.f, dk.i, dk.n, dk.a, dk.j, dk.g, dk.h};
        k = iC.a(l);
        d = new db_0(null);
        c = new hN(b[47]);
        e = new hN(b[48]);
    }

    private static final void b() {
        b = new String[]{hl.a("\u1737\u1721\u1727\u172b\u172a\u1720\u1737", 22288228), hl.a("\u9a7e", -184313331), hl.a("\u4622\u4634", -580237743), hl.a("\u7d61\u7d71", 2069003538), hl.a("\ufe20\ufe36\ufe30", 1679031891), hl.a("\u075c\u074a\u074c\u075c", 1533544239), hl.a("\uae42\uae54\uae52\uae5e\uae5f\uae55", 487239217), hl.a("\ue83e\ue828\ue82e\ue822\ue823\ue829\ue83e", 984934477), hl.a("\u046e\u046a\u046d\u0476\u0477\u0466\u0470", -1129380829), hl.a("\u1cf1", -282846052), hl.a("\ufad7\ufad3", 144571066), hl.a("\ua27f\ua27b\ua27c", 972333586), hl.a("\ucf33\ucf37\ucf30\ucf2d", -1106915490), hl.a("\u93bc\u93b8\u93bf\u93a4\u93a5\u93b4", -141323311), hl.a("\u771d\u7719\u771e\u7705\u7704\u7715\u7703", 760117104), hl.a("\u2222\u2225\u223f\u2238\u2239", 42607210), hl.a("\ua424", -1942641588), hl.a("\u7c2f\u7c35", -2102363065), hl.a("\ud725\ud73f\ud73e", -243411123), hl.a("\u43a1\u43a6\u43bc\u43bb", -1326562359), hl.a("\u258f\u2588\u2592\u2595\u2594", 1704338919), hl.a("\ud4d6\ud4d3\ud4cb\ud4c1", -1984637806), hl.a("\uf8af", -1863780149), hl.a("\u5a03\u5a06", -464954777), hl.a("\u547b\u5466", -1810213857), hl.a("\uf348\uf34d\uf355", -1746930900), hl.a("\ubd0b\ubd0e\ubd16\ubd1c", -1321484945), hl.a("\ubf2d\ubf3f\ubf3f\ubf31\ubf29", 1288814458), hl.a("\u8fee", -1320906855), hl.a("\u3842\u3850", 2084714549), hl.a("\ufd73\ufd6f", 292879620), hl.a("\u0ef2\u0eee\u0ef6", -476049787), hl.a("\uf24c\uf25e\uf25e\uf250", 69005883), hl.a("\u4324\u4336\u4336\u4338\u4320", 1872184147), hl.a("\udf8b\udf89\udf88\udf92\udf8e\udf95", 1255858118), hl.a("\u3b56\u3b54", 1390492475), hl.a("\uf065\uf060", -304091128), hl.a("\u762d\u762f\u762e", 1418884672), hl.a("\u6f8b\u6f89\u6f88\u6f92\u6f8e", -725258266), hl.a("\uff04\uff06\uff07\uff1d\uff01\uff1a", -1576861847), hl.a("\u677a\u6766\u6762\u6771\u6770", -2124519645), hl.a("\u443f", 905528390), hl.a("\uec26\uec3a", -866915233), hl.a("\u4172\u4179", -1730330357), hl.a("\u9933\u9938\u9939", 1396218186), hl.a("\u8d7a\u8d66\u8d62\u8d71", 83397891), hl.a("\u0fc7\u0fdb\u0fdf\u0fcc\u0fcd", -348975170), hl.a("\ub72a\ub741\ub75c\ub748\ub75f\ub72c", 753121137), hl.a("\ucfe9\ucfec\ucf82\ucf9f\ucf8b\ucf9c\ucfef", 471781298)};
    }
}

