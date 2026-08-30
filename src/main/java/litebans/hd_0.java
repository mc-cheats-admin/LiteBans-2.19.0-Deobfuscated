package litebans;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
import litebans.hl;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from litebans.hD
 */
public static final class hd_0
extends Enum
implements CharSequence {
    public static final hd_0 f;
    public static final hd_0 h;
    public static final hd_0 v;
    public static final hd_0 y;
    public static final hd_0 F;
    public static final hd_0 C;
    public static final hd_0 m;
    public static final hd_0 o;
    public static final hd_0 g;
    public static final hd_0 n;
    public static final hd_0 i;
    public static final hd_0 w;
    public static final hd_0 c;
    public static final hd_0 d;
    public static final hd_0 u;
    public static final hd_0 k;
    public static final hd_0 x;
    public static final hd_0 E;
    public static final hd_0 z;
    public static final hd_0 r;
    public static final hd_0 l;
    public static final hd_0 p;
    public static final hd_0 t;
    public static final char j;
    public static final String D;
    public static final Pattern b;
    private static final Map a;
    private final char q;
    private final String B;
    private final String A;
    private static final /* synthetic */ hd_0[] e;
    private static /* synthetic */ String[] s;

    public static hd_0[] values() {
        return (hd_0[])e.clone();
    }

    public static hd_0 b(String string) {
        return Enum.valueOf(hd_0.class, string);
    }

    /*
     * WARNING - void declaration
     */
    private hd_0() {
        void var4_2;
        void var3_1;
        void var2_-1;
        void var1_-1;
        this.q = var3_1;
        this.A = var4_2;
        this.B = new String(new char[]{'\u00a7', var3_1});
    }

    public static String a(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        return b.matcher(charSequence).replaceAll(s[0]);
    }

    public static String a(char c, String string) {
        char[] cArray = string.toCharArray();
        for (int i = 0; i < cArray.length - 1; ++i) {
            if (cArray[i] != c || s[1].indexOf(cArray[i + 1]) <= -1) continue;
            cArray[i] = 167;
            cArray[i + 1] = Character.toLowerCase(cArray[i + 1]);
        }
        return new String(cArray);
    }

    @Override
    public char charAt(int n) {
        return this.toString().charAt(n);
    }

    @Override
    public int length() {
        return this.toString().length();
    }

    @Override
    public CharSequence subSequence(int n, int n2) {
        return this.toString().subSequence(n, n2);
    }

    @Override
    public @NotNull String toString() {
        return this.B;
    }

    public static String g(String string) {
        return m + string;
    }

    public static String c(String string) {
        return i + string;
    }

    public static String f(String string) {
        return c + string;
    }

    public static String a(String string) {
        return d + string;
    }

    public static String d(String string) {
        return u + string;
    }

    public static String e(String string) {
        return r + string;
    }

    private static final /* synthetic */ hd_0[] b() {
        return new hd_0[]{f, h, v, y, F, C, m, o, g, n, i, w, c, d, u, k, x, E, z, r, l, p, t};
    }

    static {
        D = "0123456789AaBbCcDdEeFfKkLlMmNnOoRrXx";
        j = (char)167;
        hd_0.a();
        f = new hd_0(s[2], 0, '0', s[3]);
        h = new hd_0(s[4], 1, '1', s[5]);
        v = new hd_0(s[6], 2, '2', s[7]);
        y = new hd_0(s[8], 3, '3', s[9]);
        F = new hd_0(s[10], 4, '4', s[11]);
        C = new hd_0(s[12], 5, '5', s[13]);
        m = new hd_0(s[14], 6, '6', s[15]);
        o = new hd_0(s[16], 7, '7', s[17]);
        g = new hd_0(s[18], 8, '8', s[19]);
        n = new hd_0(s[20], 9, '9', s[21]);
        i = new hd_0(s[22], 10, 'a', s[23]);
        w = new hd_0(s[24], 11, 'b', s[25]);
        c = new hd_0(s[26], 12, 'c', s[27]);
        d = new hd_0(s[28], 13, 'd', s[29]);
        u = new hd_0(s[30], 14, 'e', s[31]);
        k = new hd_0(s[32], 15, 'f', s[33]);
        x = new hd_0(s[34], 16, 'k', s[35]);
        E = new hd_0(s[36], 17, 'l', s[37]);
        z = new hd_0(s[38], 18, 'm', s[39]);
        r = new hd_0(s[40], 19, 'n', s[41]);
        l = new hd_0(s[42], 20, 'o', s[43]);
        p = new hd_0(s[44], 21, 'r', s[45]);
        t = new hd_0(s[46], 22, 'x', s[47]);
        e = hd_0.b();
        b = Pattern.compile(s[48]);
        a = new HashMap();
        for (hd_0 hd_02 : hd_0.values()) {
            a.put(Character.valueOf(hd_02.q), hd_02);
        }
    }

    private static final void a() {
        s = new String[]{hl.a("", -146180849), hl.a("\ue79b\ue79a\ue799\ue798\ue79f\ue79e\ue79d\ue79c\ue793\ue792\ue7ea\ue7ca\ue7e9\ue7c9\ue7e8\ue7c8\ue7ef\ue7cf\ue7ee\ue7ce\ue7ed\ue7cd\ue7e0\ue7c0\ue7e7\ue7c7\ue7e6\ue7c6\ue7e5\ue7c5\ue7e4\ue7c4\ue7f9\ue7d9\ue7f3\ue7d3", -2099779669), hl.a("\u8e6a\u8e64\u8e69\u8e6b\u8e63", -1884647896), hl.a("\u7e27\u7e29\u7e24\u7e26\u7e2e", -1158054331), hl.a("\u11d1\u11d4\u11c7\u11de\u11ca\u11d7\u11d9\u11c0\u11d0", 1672090005), hl.a("\u2754\u2751\u2742\u275b\u276f\u2752\u275c\u2745\u2755", 1075652400), hl.a("\u7b1e\u7b1b\u7b08\u7b11\u7b05\u7b1d\u7b08\u7b1f\u7b1f\u7b14", 1609792346), hl.a("\u168e\u168b\u1698\u1681\u16b5\u168d\u1698\u168f\u168f\u1684", 1770133226), hl.a("\ue0b4\ue0b1\ue0a2\ue0bb\ue0af\ue0b1\ue0a1\ue0a5\ue0b1", -2060328720), hl.a("\u065b\u065e\u064d\u0654\u0660\u065e\u064e\u064a\u065e", -141294017), hl.a("\uaccd\uacc8\uacdb\uacc2\uacd6\uacdb\uaccc\uaccd", -1835815799), hl.a("\ud855\ud850\ud843\ud85a\ud86e\ud843\ud854\ud855", -2038310863), hl.a("\ue3d9\ue3dc\ue3cf\ue3d6\ue3c2\ue3cd\ue3c8\ue3cf\ue3cd\ue3d1\ue3d8", 1870914461), hl.a("\ub8bb\ub8be\ub8ad\ub8b4\ub880\ub8af\ub8aa\ub8ad\ub8af\ub8b3\ub8ba", 1689172191), hl.a("\uee23\uee2b\uee28\uee20", -1061687708), hl.a("\u0e49\u0e41\u0e42\u0e4a", -870511058), hl.a("\ufeee\ufefb\ufee8\ufef0", -1397752151), hl.a("\u7c5b\u7c4e\u7c5d\u7c45", 1078033468), hl.a("\ucadf\ucada\ucac9\ucad0\ucac4\ucadc\ucac9\ucada\ucac2", 1435224731), hl.a("\u7599\u759c\u758f\u7596\u75a2\u759a\u758f\u759c\u7584", -909150723), hl.a("\uc76a\uc764\uc77d\uc76d", 129419048), hl.a("\u2422\u242c\u2435\u2425", -950459328), hl.a("\u34ef\u34fa\u34ed\u34ed\u34e6", -463063896), hl.a("\u8195\u8180\u8197\u8197\u819c", 661225970), hl.a("\uafa3\uafb3\uafb7\uafa3", 1310568418), hl.a("\u2bd3\u2bc3\u2bc7\u2bd3", -887149646), hl.a("\u3740\u3757\u3756", 9516818), hl.a("\u4479\u446e\u446f", 1626031115), hl.a("\ud221\ud224\ud22a\ud225\ud239\ud232\ud23d\ud238\ud23f\ud23d\ud221\ud228", -406793619), hl.a("\u0890\u0895\u089b\u0894\u0888\u08a3\u088c\u0889\u088e\u088c\u0890\u0899", 1178274044), hl.a("\uee97\uee8b\uee82\uee82\uee81\uee99", -1640829234), hl.a("\u1d19\u1d05\u1d0c\u1d0c\u1d0f\u1d17", -10281632), hl.a("\u2f1c\u2f03\u2f02\u2f1f\u2f0e", -1983959221), hl.a("\u868f\u8690\u8691\u868c\u869d", 2000632), hl.a("\u1980\u198d\u1989\u199a\u199c\u198c\u198e\u199b\u198a\u198b", 363141583), hl.a("\u2d27\u2d2a\u2d2e\u2d3d\u2d3b\u2d2b\u2d29\u2d3c\u2d2d\u2d2c", 1603677512), hl.a("\u94da\u94d7\u94d4\u94dc", -929459048), hl.a("\u10f9\u10f4\u10f7\u10ff", 358158491), hl.a("\ua5a4\ua5a3\ua5a5\ua5be\ua5bc\ua5b2\ua5a3\ua5bf\ua5a5\ua5b8\ua5a2\ua5b0\ua5bf", 1409918455), hl.a("\u7df2\u7df5\u7df3\u7de8\u7dea\u7de4\u7df5\u7de9\u7df3\u7dee\u7df4\u7de6\u7de9", 351960449), hl.a("\u5088\u5093\u5099\u5098\u508f\u5091\u5094\u5093\u5098", 1900630237), hl.a("\u0d21\u0d3a\u0d30\u0d31\u0d26\u0d38\u0d3d\u0d3a\u0d31", 503057748), hl.a("\u9a82\u9a9f\u9a8a\u9a87\u9a82\u9a88", 966433483), hl.a("\ud82e\ud833\ud826\ud82b\ud82e\ud824", 1074518087), hl.a("\u571b\u570c\u571a\u570c\u571d", 541022025), hl.a("\u6d78\u6d6f\u6d79\u6d6f\u6d7e", -1622643446), hl.a("\uaccc\uacc0\uacc6\uacc8\uacc2", -1688949631), hl.a("\u91d6\u91da\u91dc\u91d2\u91d8", -653618757), hl.a("\ufde0\ufdf7\ufda1\ufde1\ufde0\ufdf7\ufdf4\ufde9\ufdf4\ufd88\ufde1\ufd93\ufdee\ufd6f\ufd95\ufd93\ufdf8\ufde5\ufdf1\ufd89\ufde5\ufd8e\ufd83\ufde5\ufd87\ufd9a\ufd90\ufd95", 1044446664)};
    }
}

