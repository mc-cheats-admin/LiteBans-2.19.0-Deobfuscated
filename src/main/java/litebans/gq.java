package litebans;

import com.google.common.base.Preconditions;
import java.awt.Color;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Pattern;
import litebans.hl;

public static final class gq {
    public static final char a;
    public static final String z;
    public static final Pattern D;
    private static final Map e;
    private static final Map d;
    public static final gq y;
    public static final gq f;
    public static final gq i;
    public static final gq m;
    public static final gq G;
    public static final gq l;
    public static final gq s;
    public static final gq q;
    public static final gq p;
    public static final gq B;
    public static final gq E;
    public static final gq n;
    public static final gq r;
    public static final gq g;
    public static final gq F;
    public static final gq x;
    public static final gq b;
    public static final gq t;
    public static final gq c;
    public static final gq A;
    public static final gq k;
    public static final gq u;
    private static int v;
    private final String C;
    private final String w;
    private final int h;
    private final Color j;
    private static /* synthetic */ String[] o;

    private gq(char c, String string) {
        this(c, string, null);
    }

    private gq(char c, String string, Color color) {
        this.w = string;
        this.C = new String(new char[]{'\u00a7', c});
        this.h = v++;
        this.j = color;
        e.put(Character.valueOf(c), this);
        d.put(string.toUpperCase(Locale.ROOT), this);
    }

    private gq(String string, String string2, int n) {
        this.w = string;
        this.C = string2;
        this.h = -1;
        this.j = new Color(n);
    }

    public int hashCode() {
        int n = 7;
        n = 53 * n + Objects.hashCode(this.C);
        return n;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        gq gq2 = (gq)object;
        return Objects.equals(this.C, gq2.C);
    }

    public String toString() {
        return this.C;
    }

    public static gq a(char c) {
        return (gq)e.get(Character.valueOf(c));
    }

    public static gq a(String string) {
        Preconditions.checkArgument((string != null ? 1 : 0) != 0, (Object)o[4]);
        if (string.length() == 7 && string.charAt(0) == '#') {
            int n;
            try {
                n = Integer.parseInt(string.substring(1), 16);
            }
            catch (NumberFormatException numberFormatException) {
                throw new IllegalArgumentException(o[5] + string);
            }
            StringBuilder stringBuilder = new StringBuilder(o[6]);
            for (char c : string.substring(1).toCharArray()) {
                stringBuilder.append('\u00a7').append(c);
            }
            return new gq(string, stringBuilder.toString(), n);
        }
        gq gq2 = (gq)d.get(string.toUpperCase(Locale.ROOT));
        if (gq2 != null) {
            return gq2;
        }
        throw new IllegalArgumentException(o[7] + string);
    }

    public String a() {
        return this.w;
    }

    public Color c() {
        return this.j;
    }

    static {
        z = "0123456789AaBbCcDdEeFfKkLlMmNnOoRrXx";
        a = (char)167;
        gq.b();
        D = Pattern.compile(o[12] + String.valueOf('\u00a7') + o[13]);
        e = new HashMap();
        d = new HashMap();
        y = new gq('0', o[14], new Color(0));
        f = new gq('1', o[15], new Color(170));
        i = new gq('2', o[16], new Color(43520));
        m = new gq('3', o[17], new Color(43690));
        G = new gq('4', o[18], new Color(0xAA0000));
        l = new gq('5', o[19], new Color(0xAA00AA));
        s = new gq('6', o[20], new Color(0xFFAA00));
        q = new gq('7', o[21], new Color(0xAAAAAA));
        p = new gq('8', o[22], new Color(0x555555));
        B = new gq('9', o[23], new Color(0x5555FF));
        E = new gq('a', o[24], new Color(0x55FF55));
        n = new gq('b', o[25], new Color(0x55FFFF));
        r = new gq('c', o[26], new Color(0xFF5555));
        g = new gq('d', o[27], new Color(0xFF55FF));
        F = new gq('e', o[28], new Color(0xFFFF55));
        x = new gq('f', o[29], new Color(0xFFFFFF));
        b = new gq('k', o[30]);
        t = new gq('l', o[31]);
        c = new gq('m', o[32]);
        A = new gq('n', o[33]);
        k = new gq('o', o[34]);
        u = new gq('r', o[35]);
        v = 0;
    }

    private static final void b() {
        o = new String[]{hl.a("", 1275327790), hl.a("\u8b7f\u8b7e\u8b7d\u8b7c\u8b7b\u8b7a\u8b79\u8b78\u8b77\u8b76\u8b0e\u8b2e\u8b0d\u8b2d\u8b0c\u8b2c\u8b0b\u8b2b\u8b0a\u8b2a\u8b09\u8b29\u8b04\u8b24\u8b03\u8b23\u8b02\u8b22\u8b01\u8b21\u8b00\u8b20\u8b1d\u8b3d\u8b17\u8b37", 2122353487), hl.a("\u9228", -2059234805), hl.a("\u4ce8\u4cfd\u4cf5\u4cb5", 438783181), hl.a("\u48e8\u48ef\u48e9\u48f2\u48f5\u48fc\u48bb\u48f8\u48fa\u48f5\u48f5\u48f4\u48ef\u48bb\u48f9\u48fe\u48bb\u48f5\u48ee\u48f7\u48f7", 2138523803), hl.a("\u6e8d\u6ea8\u6ea8\u6ea1\u6ea3\u6ea5\u6ea8\u6ee4\u6eac\u6ea1\u6ebc\u6ee4\u6eb7\u6eb0\u6eb6\u6ead\u6eaa\u6ea3\u6ee4", -213684540), hl.a("\u15c1\u151e", -565176986), hl.a("\u2b5e\u2b72\u2b68\u2b71\u2b79\u2b3d\u2b73\u2b72\u2b69\u2b3d\u2b6d\u2b7c\u2b6f\u2b6e\u2b78\u2b3d\u2b5e\u2b75\u2b7c\u2b69\u2b5e\u2b72\u2b71\u2b72\u2b6f\u2b3d", -1733547235), hl.a("\u8c71\u8c5e\u8c52\u8c5a\u8c1f\u8c56\u8c4c\u8c1f\u8c51\u8c4a\u8c53\u8c53", 1718914111), hl.a("\ub4ed\ub4cc\ub483\ub4c6\ub4cd\ub4d6\ub4ce\ub483\ub4c0\ub4cc\ub4cd\ub4d0\ub4d7\ub4c2\ub4cd\ub4d7\ub483", -2145995613), hl.a("\u016e", 213778752), hl.a("\u5aeb\u5ac9\u5ac6\u5ac6\u5ac7\u5adc\u5a88\u5acf\u5acd\u5adc\u5a88\u5ac7\u5ada\u5acc\u5ac1\u5ac6\u5ac9\u5ac4\u5a88\u5ac7\u5ace\u5a88\u5ac0\u5acd\u5ad0\u5a88\u5acb\u5ac7\u5ac4\u5ac7\u5ada", -2057151832), hl.a("\u8fb7\u8fa0\u8ff6\u8fb6", -905998433), hl.a("\uab6d\uab06\uab1b\uab0f\uab77\uab1b\uab70\uab7d\uab1b\uab79\uab64\uab6e\uab6b", -377705674), hl.a("\u5b89\u5b87\u5b8a\u5b88\u5b80", -1816503317), hl.a("\u5121\u5124\u5137\u512e\u511a\u5127\u5129\u5130\u5120", -1875357371), hl.a("\u2eef\u2eea\u2ef9\u2ee0\u2ed4\u2eec\u2ef9\u2eee\u2eee\u2ee5", -1933955445), hl.a("\u07ab\u07ae\u07bd\u07a4\u0790\u07ae\u07be\u07ba\u07ae", -1541601329), hl.a("\ue39a\ue39f\ue38c\ue395\ue3a1\ue38c\ue39b\ue39a", 849732606), hl.a("\u0226\u0223\u0230\u0229\u021d\u0232\u0237\u0230\u0232\u022e\u0227", -1782644158), hl.a("\ufbe1\ufbe9\ufbea\ufbe2", -395969658), hl.a("\u53f9\u53ec\u53ff\u53e7", -1463528546), hl.a("\u38f2\u38f7\u38e4\u38fd\u38c9\u38f1\u38e4\u38f7\u38ef", -1077135210), hl.a("\uca92\uca9c\uca85\uca95", -1766012176), hl.a("\u79df\u79ca\u79dd\u79dd\u79d6", 1690728888), hl.a("\u1e20\u1e30\u1e34\u1e20", 219618881), hl.a("\ue6c4\ue6d3\ue6d2", 638183094), hl.a("\uc78b\uc78e\uc780\uc78f\uc793\uc7b8\uc797\uc792\uc795\uc797\uc78b\uc782", -1604007961), hl.a("\u7b04\u7b18\u7b11\u7b11\u7b12\u7b0a", -630228099), hl.a("\u3ccd\u3cd2\u3cd3\u3cce\u3cdf", 1688943802), hl.a("\u3c8f\u3c82\u3c86\u3c95\u3c93\u3c83\u3c81\u3c94\u3c85\u3c84", -1204994848), hl.a("\u31aa\u31a7\u31a4\u31ac", 1278161352), hl.a("\u6454\u6453\u6455\u644e\u644c\u6442\u6453\u644f\u6455\u6448\u6452\u6440\u644f", 503079975), hl.a("\u26ef\u26f4\u26fe\u26ff\u26e8\u26f6\u26f3\u26f4\u26ff", 508634778), hl.a("\u562d\u5630\u5625\u5628\u562d\u5627", 2072008260), hl.a("\u71b5\u71a2\u71b4\u71a2\u71b3", 0x111C71C7)};
    }
}

