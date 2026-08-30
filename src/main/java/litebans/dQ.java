package litebans;

import litebans.aJ;
import litebans.bT;
import litebans.eo_0;
import litebans.ew;
import litebans.gZ;
import litebans.hl;
import org.jetbrains.annotations.NotNull;

public static final class dQ {
    private static /* synthetic */ String[] a;

    private dQ() {
    }

    public final eo_0 a() {
        return gZ.a();
    }

    public final int b() {
        return gZ.e();
    }

    public final void a(int n) {
        gZ.a(n);
    }

    public final eo_0 c() {
        return this.a();
    }

    public final eo_0 a(@NotNull eo_0 eo_02) {
        return eo_02;
    }

    public final eo_0 b(@NotNull eo_0 eo_02, @NotNull eo_0 eo_03) {
        return this.a(arg_0 -> dQ.a(eo_02, eo_03, arg_0));
    }

    public final eo_0 a(@NotNull eo_0 eo_02, @NotNull eo_0 eo_03) {
        if (ew.a((Object)eo_02, this.a())) {
            return eo_03;
        }
        return this.b(eo_02, eo_03);
    }

    public final String a(@NotNull gZ gZ2, @NotNull String string) {
        CharSequence charSequence;
        String string2 = string;
        boolean bl = ew.a((Object)string, (Object)a[0]);
        StringBuilder stringBuilder = new StringBuilder().append(string2);
        if (bl) {
            CharSequence charSequence2 = gZ2.c().h();
            CharSequence charSequence3 = a[1];
            boolean bl2 = false;
            charSequence = "" + charSequence2 + charSequence3;
        } else {
            charSequence = a[2];
        }
        string2 = stringBuilder.append((Object)charSequence).toString();
        if (bl) {
            string2 = string2 + gZ2.c().l();
        }
        return string2;
    }

    private static final bT a(eo_0 eo_02, eo_0 eo_03, bT bT2) {
        eo_02.a(bT2);
        return (bT)eo_03.a(bT2);
    }

    public /* synthetic */ dQ(aJ aJ2) {
        this();
    }

    private static final void d() {
        a = new String[]{hl.a("\u4035\u403a\u4036\u403e", -779272101), hl.a("\uc7d3", 1564919788), hl.a("\u9114\u9116", -1680961239), hl.a("\u2efd\u2e8a\u2e95\u2e98\u2e8f\u2e98\u2efd", -844615971), hl.a("\uc27f\uc260\uc26d\uc27a\uc26d", 1267450408), hl.a("\ua430\ua447\ua458\ua455\ua442\ua455\ua430", 102409232), hl.a("\ua8ac\ua8a3\ua8a9", 1502128365), hl.a("\ue5fd\ue58a\ue595\ue598\ue58f\ue598\ue5fd", -129767971), hl.a("\ua169\ua176\ua17b\ua16c\ua17b", 878158142), hl.a("\ua584\ua5f3\ua5ec\ua5e1\ua5f6\ua5e1\ua584", 849454500), hl.a("\u9cce\u9cf2\u9cff\u9ce7\u9cfb\u9cec\u9cbe\u9cf0\u9cff\u9cf3\u9cfb\u9cbe\u9cbc", -1570988898), hl.a("\u49d3\u49d1\u499d\u4994\u499f\u4996\u4985\u4999\u49d1\u49cf\u49d1", 283789809), hl.a("\u347c\u347c\u3460\u346d\u3409\u340b", 287650857), hl.a("\u88bb\u88b9\u88f5\u88fc\u88f7\u88fe\u88ed\u88f1\u88b9\u88a7\u88b9\u88aa\u88af", -118585191)};
    }

    static {
        dQ.d();
    }
}

