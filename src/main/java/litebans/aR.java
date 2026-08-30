package litebans;

import litebans.bz;
import litebans.ew;
import litebans.g2;
import litebans.gl_0;
import litebans.hl;
import litebans.o;
import litebans.q_0;
import litebans.x;
import org.jetbrains.annotations.NotNull;

public static final class aR
implements CharSequence {
    private final String a;
    private static /* synthetic */ String[] b;

    public static int c(String string) {
        return string.length();
    }

    public int b() {
        return aR.c(this.a);
    }

    public static char a(String string, int n) {
        return string.charAt(n);
    }

    public char a(int n) {
        return aR.a(this.a, n);
    }

    public static CharSequence a(String string, int n, int n2) {
        return string.subSequence(n, n2);
    }

    @Override
    public CharSequence subSequence(int n, int n2) {
        return aR.a(this.a, n, n2);
    }

    public static String b(String string) {
        String string2 = string;
        if (bz.c((CharSequence)string2, '{', false, 2, null)) {
            q_0 q_02 = (q_0)g2.b.a().a(q_0.class);
            o o2 = (o)g2.b.a().a(o.class);
            String string3 = q_02.f().aF();
            String string4 = b[0];
            String string5 = b[1];
            if (ew.a((Object)string3, (Object)b[2])) {
                string4 = b[3];
                string5 = b[4];
            }
            string2 = x.b.a(string2, b[5], (Object)string4);
            string2 = x.b.a(string2, b[6], (Object)string5);
            string2 = x.b.a(string2, b[7], (Object)(!ew.a((Object)string3, (Object)b[8]) ? b[9] : b[10]));
            string2 = x.b.a(string2, b[11], (Object)("" + o2.h() + '?' + o2.l()));
        }
        return string2;
    }

    @Override
    public String toString() {
        return aR.b(this.a);
    }

    public static final String b(String string, @NotNull CharSequence charSequence) {
        CharSequence[] charSequenceArray = new CharSequence[]{aR.d(string), charSequence};
        boolean bl = false;
        CharSequence[] charSequenceArray2 = charSequenceArray;
        boolean bl2 = false;
        int n = charSequenceArray2.length;
        for (int i = 0; i < n; ++i) {
            CharSequence charSequence2;
            CharSequence charSequence3 = charSequence2 = charSequenceArray2[i];
            boolean bl3 = false;
            if (charSequence3.length() > 0) continue;
            String string2 = b[20];
            throw new IllegalArgumentException(string2.toString());
        }
        return aR.e(aR.b(string) + b[21] + charSequence);
    }

    public static final String d(String string, @NotNull CharSequence charSequence) {
        CharSequence[] charSequenceArray = new CharSequence[]{aR.d(string), charSequence};
        boolean bl = false;
        CharSequence[] charSequenceArray2 = charSequenceArray;
        boolean bl2 = false;
        int n = charSequenceArray2.length;
        for (int i = 0; i < n; ++i) {
            CharSequence charSequence2;
            CharSequence charSequence3 = charSequence2 = charSequenceArray2[i];
            boolean bl3 = false;
            if (charSequence3.length() > 0) continue;
            String string2 = b[22];
            throw new IllegalArgumentException(string2.toString());
        }
        return aR.e(aR.b(string) + b[23] + charSequence);
    }

    public static final String e(String string, @NotNull CharSequence charSequence) {
        CharSequence[] charSequenceArray = new CharSequence[]{aR.d(string), charSequence};
        boolean bl = false;
        CharSequence[] charSequenceArray2 = charSequenceArray;
        boolean bl2 = false;
        int n = charSequenceArray2.length;
        for (int i = 0; i < n; ++i) {
            CharSequence charSequence2;
            CharSequence charSequence3 = charSequence2 = charSequenceArray2[i];
            boolean bl3 = false;
            if (charSequence3.length() > 0) continue;
            String string2 = b[24];
            throw new IllegalArgumentException(string2.toString());
        }
        gl_0.a(charSequence);
        return aR.e(aR.b(string) + b[25] + charSequence + b[26]);
    }

    public static final String c(String string, @NotNull CharSequence charSequence) {
        CharSequence[] charSequenceArray = new CharSequence[]{aR.d(string), charSequence};
        boolean bl = false;
        CharSequence[] charSequenceArray2 = charSequenceArray;
        boolean bl2 = false;
        int n = charSequenceArray2.length;
        for (int i = 0; i < n; ++i) {
            CharSequence charSequence2;
            CharSequence charSequence3 = charSequence2 = charSequenceArray2[i];
            boolean bl3 = false;
            if (charSequence3.length() > 0) continue;
            String string2 = b[30];
            throw new IllegalArgumentException(string2.toString());
        }
        gl_0.d(charSequence);
        return aR.e(aR.b(string) + b[31] + charSequence);
    }

    public static final String g(String string, @NotNull CharSequence charSequence) {
        CharSequence[] charSequenceArray = new CharSequence[]{aR.d(string), charSequence};
        boolean bl = false;
        CharSequence[] charSequenceArray2 = charSequenceArray;
        boolean bl2 = false;
        int n = charSequenceArray2.length;
        for (int i = 0; i < n; ++i) {
            CharSequence charSequence2;
            CharSequence charSequence3 = charSequence2 = charSequenceArray2[i];
            boolean bl3 = false;
            if (charSequence3.length() > 0) continue;
            String string2 = b[32];
            throw new IllegalArgumentException(string2.toString());
        }
        return aR.e(aR.b(string) + b[33] + charSequence);
    }

    public static final String f(String string, @NotNull CharSequence charSequence) {
        CharSequence[] charSequenceArray = new CharSequence[]{aR.d(string), charSequence};
        boolean bl = false;
        CharSequence[] charSequenceArray2 = charSequenceArray;
        boolean bl2 = false;
        int n = charSequenceArray2.length;
        for (int i = 0; i < n; ++i) {
            CharSequence charSequence2;
            CharSequence charSequence3 = charSequence2 = charSequenceArray2[i];
            boolean bl3 = false;
            if (charSequence3.length() > 0) continue;
            String string2 = b[34];
            throw new IllegalArgumentException(string2.toString());
        }
        gl_0.b(charSequence);
        return aR.e(aR.b(string) + b[35] + charSequence);
    }

    public static final String h(String string, @NotNull CharSequence charSequence) {
        CharSequence[] charSequenceArray = new CharSequence[]{aR.d(string), charSequence};
        boolean bl = false;
        CharSequence[] charSequenceArray2 = charSequenceArray;
        boolean bl2 = false;
        int n = charSequenceArray2.length;
        for (int i = 0; i < n; ++i) {
            CharSequence charSequence2;
            CharSequence charSequence3 = charSequence2 = charSequenceArray2[i];
            boolean bl3 = false;
            if (charSequence3.length() > 0) continue;
            String string2 = b[36];
            throw new IllegalArgumentException(string2.toString());
        }
        gl_0.a(charSequence);
        return aR.e(aR.b(string) + b[37] + charSequence);
    }

    public static final String a(String string, @NotNull CharSequence charSequence) {
        CharSequence[] charSequenceArray = new CharSequence[]{aR.d(string), charSequence};
        boolean bl = false;
        CharSequence[] charSequenceArray2 = charSequenceArray;
        boolean bl2 = false;
        int n = charSequenceArray2.length;
        for (int i = 0; i < n; ++i) {
            CharSequence charSequence2;
            CharSequence charSequence3 = charSequence2 = charSequenceArray2[i];
            boolean bl3 = false;
            if (charSequence3.length() > 0) continue;
            String string2 = b[38];
            throw new IllegalArgumentException(string2.toString());
        }
        return aR.e(aR.b(string) + b[39] + charSequence + b[40]);
    }

    public static final String a(String string, @NotNull Number number) {
        CharSequence[] charSequenceArray = new CharSequence[]{aR.d(string)};
        boolean bl = false;
        CharSequence[] charSequenceArray2 = charSequenceArray;
        boolean bl2 = false;
        int n = charSequenceArray2.length;
        for (int i = 0; i < n; ++i) {
            CharSequence charSequence;
            CharSequence charSequence2 = charSequence = charSequenceArray2[i];
            boolean bl3 = false;
            if (charSequence2.length() > 0) continue;
            String string2 = b[44];
            throw new IllegalArgumentException(string2.toString());
        }
        return aR.e(aR.b(string) + b[45] + number);
    }

    public static int a(String string) {
        return string.hashCode();
    }

    public int hashCode() {
        return aR.a(this.a);
    }

    public static boolean a(String string, Object object) {
        if (!(object instanceof aR)) {
            return false;
        }
        return ew.a((Object)string, (Object)((aR)object).c());
    }

    public boolean equals(Object object) {
        return aR.a(this.a, object);
    }

    private /* synthetic */ aR(String string) {
        this.a = string;
    }

    public static String e(@NotNull String string) {
        return string;
    }

    public static final /* synthetic */ aR d(String string) {
        return new aR(string);
    }

    public final /* synthetic */ String c() {
        return this.a;
    }

    @Override
    public int length() {
        return this.b();
    }

    @Override
    public final char charAt(int n) {
        return this.a(n);
    }

    private static final void a() {
        b = new String[]{hl.a("\u7109", 1818063160), hl.a("\ue04a", -1517166470), hl.a("\u2827\u2830\u2824\u2826\u283b", 1280452695), hl.a("\uac45\uac20\uac36\uac20", 1724886023), hl.a("\u962d\u9648\u965f\u9648", 1697420911), hl.a("\u3a7b\u3a74\u3a72\u3a75\u3a65\u3a7d", -1288619520), hl.a("\u692d\u6930\u6937\u693a\u6925\u6933\u692b", -628790954), hl.a("\u9732\u972a\u9726\u9725\u973c\u9724\u9727\u9767\u9720\u972d\u9734", 1930467145), hl.a("\u2425\u2427\u243a\u243f\u2422\u2433", -1248779178), hl.a("\uc4b8\uc4b5", -874789679), hl.a("\u9f72\u9f6f\u9f77\u9f69\u9f64\u9f20\u9f61\u9f73\u9f20\u9f69\u9f64", 1298112256), hl.a("\uf920\uf966\uf964\uf926", 1109653851), hl.a("\u5d09\u5d1f\u5d16\u5d1f\u5d19\u5d0e\u5d7a", 1592745306), hl.a("\u27e9\u27ee\u27f3\u27e5\u27f2\u27f4\u2780", -1634523232), hl.a("\uce78\uce79\uce70\uce79\uce68\uce79\uce1c", 1192021564), hl.a("\u85dd\u85d8\u85cc\u85c9\u85dc\u85cd\u85a8", 1027835272), hl.a("\u9ee6\u9eeb\u9ef3\u9ee2\u9ef5\u9e87", 1909759655), hl.a("\u1dbe\u1daf\u1db8\u1dbc\u1da9\u1db8\u1ddd", 2122587645), hl.a("\u48d9\u48fe\u48f6\u48f3\u48fa\u48fb\u48bf\u48ed\u48fa\u48ee\u48ea\u48f6\u48ed\u48fa\u48f2\u48fa\u48f1\u48eb\u48b1", -251311969), hl.a("\u4998\u49ef\u49f0\u49fd\u49ea\u49fd\u4998", -1155905096), hl.a("\ue955\ue972\ue97a\ue97f\ue976\ue977\ue933\ue961\ue976\ue962\ue966\ue97a\ue961\ue976\ue97e\ue976\ue97d\ue967\ue93d", 1062398227), hl.a("\u8689\u86e8\u86e7\u86ed\u8689", -1696823639), hl.a("\u76e9\u76ce\u76c6\u76c3\u76ca\u76cb\u768f\u76dd\u76ca\u76de\u76da\u76c6\u76dd\u76ca\u76c2\u76ca\u76c1\u76db\u7681", 820410031), hl.a("\ubb01\ubb6e\ubb73\ubb01", 1977924385), hl.a("\uebc1\uebe6\uebee\uebeb\uebe2\uebe3\ueba7\uebf5\uebe2\uebf6\uebf2\uebee\uebf5\uebe2\uebea\uebe2\uebe9\uebf3\ueba9", 289663879), hl.a("\u6229\u625e\u6241\u624c\u625b\u624c\u6229", 501834249), hl.a("\u42af\u42c6\u42dc\u42af\u42c1\u42da\u42c3\u42c3", -721599857), hl.a("\u1c37\u1c10\u1c18\u1c1d\u1c14\u1c15\u1c51\u1c03\u1c14\u1c00\u1c04\u1c18\u1c03\u1c14\u1c1c\u1c14\u1c1f\u1c05\u1c5f", -2115822479), hl.a("\u7c3f\u7c48\u7c57\u7c5a\u7c4d\u7c5a\u7c3f", -1539146721), hl.a("\u03ed\u0384\u039e\u03ed\u0383\u0382\u0399\u03ed\u0383\u0398\u0381\u0381", -1748237363), hl.a("\ucce8\ucccf\uccc7\uccc2\ucccb\uccca\ucc8e\uccdc\ucccb\uccdf\uccdb\uccc7\uccdc\ucccb\uccc3\ucccb\uccc0\uccda\ucc80", -33960786), hl.a("\u3b87\u3bf4\u3be2\u3bf3\u3b87", 1927101351), hl.a("\u9fc4\u9fe3\u9feb\u9fee\u9fe7\u9fe6\u9fa2\u9ff0\u9fe7\u9ff3\u9ff7\u9feb\u9ff0\u9fe7\u9fef\u9fe7\u9fec\u9ff6\u9fac", 299868034), hl.a("\ua5ab\ua5c8\ua5c4\ua5c5\ua5dd\ua5ce\ua5d9\ua5df\ua5ab\ua5df\ua5c4\ua5ab", 358786443), hl.a("\u0fd9\u0ffe\u0ff6\u0ff3\u0ffa\u0ffb\u0fbf\u0fed\u0ffa\u0fee\u0fea\u0ff6\u0fed\u0ffa\u0ff2\u0ffa\u0ff1\u0feb\u0fb1", -414642273), hl.a("\ud136\ud157\ud152\ud152\ud136\ud155\ud159\ud15a\ud143\ud15b\ud158\ud136", -1212755690), hl.a("\u45b1\u4596\u459e\u459b\u4592\u4593\u45d7\u4585\u4592\u4586\u4582\u459e\u4585\u4592\u459a\u4592\u4599\u4583\u45d9", -1199684105), hl.a("\ue3e7\ue383\ue395\ue388\ue397\ue3e7\ue384\ue388\ue38b\ue392\ue38a\ue389\ue3e7", -1606622265), hl.a("\u2afe\u2ad9\u2ad1\u2ad4\u2add\u2adc\u2a98\u2aca\u2add\u2ac9\u2acd\u2ad1\u2aca\u2add\u2ad5\u2add\u2ad6\u2acc\u2a96", 168438456), hl.a("\ubda6\ubdc9\ubdd4\ubdc2\ubdc3\ubdd4\ubda6\ubdc4\ubddf\ubda6", -517948026), hl.a("\uef25\uef41\uef40\uef56\uef46", 1753870085), hl.a("\uace0\uacc7\uaccf\uacca\uacc3\uacc2\uac86\uacd4\uacc3\uacd7\uacd3\uaccf\uacd4\uacc3\uaccb\uacc3\uacc8\uacd2\uac88", -1277645658), hl.a("\u610f\u6160\u617d\u616b\u616a\u617d\u610f\u616d\u6176\u610f", -1228906193), hl.a("\u73fe\u739f\u738d\u739d", 1359311838), hl.a("\u2dde\u2df9\u2df1\u2df4\u2dfd\u2dfc\u2db8\u2dea\u2dfd\u2de9\u2ded\u2df1\u2dea\u2dfd\u2df5\u2dfd\u2df6\u2dec\u2db6", -671994472), hl.a("\u4b7f\u4b13\u4b16\u4b12\u4b16\u4b0b\u4b7f", 1725582175), hl.a("\uabc1\uabad\uaba8\uabac\uaba8\uabb5\uabc1\uabde", -187585567), hl.a("\ubf65\ubf0a\ubf03\ubf03\ubf16\ubf00\ubf11\ubf65\ubf7a", 682409797), hl.a("\u950f\u9563\u9566\u9562\u9566\u957b\u950f\u9510\u950f\u9560\u9569\u9569\u957c\u956a\u957b\u950f\u9510", 2121241903)};
    }

    static {
        aR.a();
    }
}

