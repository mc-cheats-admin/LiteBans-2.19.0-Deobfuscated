package litebans;

import java.util.Locale;
import litebans.aJ;
import litebans.ew;
import litebans.hl;
import litebans.w;
import org.jetbrains.annotations.NotNull;

public static final class cJ {
    private static /* synthetic */ String[] a;

    private cJ() {
    }

    public final String b() {
        return w.j();
    }

    public final String d() {
        return w.g();
    }

    public final String c() {
        return w.w();
    }

    public final boolean b(@NotNull String string) {
        String string2 = string;
        return ew.a((Object)string2, (Object)a[0]) || ew.a((Object)string2, (Object)a[1]);
    }

    public final boolean a(@NotNull String string) {
        String string2 = string;
        return !ew.a((Object)string2, (Object)a[4]) && !ew.a((Object)string2, (Object)a[5]);
    }

    /*
     * Unable to fully structure code
     */
    public final String c(@NotNull String var1_1) {
        block15: {
            block13: {
                block12: {
                    block14: {
                        block11: {
                            var3_2 = var1_1;
                            var2_3 = var3_2.toLowerCase(Locale.ENGLISH);
                            switch (var2_3.hashCode()) {
                                case 839186932: {
                                    if (!var2_3.equals(cJ.a[6])) {
                                        ** break;
                                    }
                                    break block11;
                                }
                                case -894935028: {
                                    if (!var2_3.equals(cJ.a[7])) {
                                        ** break;
                                    }
                                    break block12;
                                }
                                case 104382626: {
                                    if (var2_3.equals(cJ.a[8])) break;
                                    ** break;
                                }
                                case 3274: {
                                    if (!var2_3.equals(cJ.a[9])) {
                                        ** break;
                                    }
                                    break block13;
                                }
                                case 106616951: {
                                    if (!var2_3.equals(cJ.a[10])) {
                                        ** break;
                                    }
                                    break block14;
                                }
                            }
                            v0 = cJ.a[11];
                            break block15;
                        }
                        v0 = cJ.a[12];
                        break block15;
                    }
                    v0 = cJ.a[13];
                    break block15;
                }
                v0 = cJ.a[14];
                break block15;
            }
            v0 = cJ.a[15];
            break block15;
lbl37:
            // 6 sources

            v0 = var1_1;
        }
        return v0;
    }

    public /* synthetic */ cJ(aJ aJ2) {
        this();
    }

    private static final void a() {
        a = new String[]{hl.a("\u687c\u6868\u6862\u6860\u687d", -2013763567), hl.a("\uac55\uac59\uac4a\uac51\uac59\uac5c\uac5a", -307778504), hl.a("\uf6b1\uf6a6\uf6b2\uf6b0\uf6ad", -635373887), hl.a("\ue177\ue168\ue174\ue173\ue160\ue175\ue162\ue174\ue176\ue16b", -2031820537), hl.a("\u6398\u639a\u6387\u6382\u639f\u638e", 1012753387), hl.a("\u0f77\u0f2d", -581431521), hl.a("\u0e40\u0e4c\u0e5f\u0e44\u0e4c\u0e49\u0e4f", -863498707), hl.a("\ue888\ue88a\ue897\ue892\ue88f\ue89e", 985327867), hl.a("\u54c1\u54d5\u54df\u54dd\u54c0", -1952295764), hl.a("\u4a07\u4a5d", -1026602385), hl.a("\u70f7\u70e0\u70f4\u70f6\u70eb", 832925831), hl.a("\u3375\u3341\u336b\u3369\u3374", 1727935288), hl.a("\ue2f5\ue2d9\ue2ca\ue2d1\ue2d9\ue2fc\ue2fa", -1151999304), hl.a("\u6662\u665d\u6641\u6646\u6655\u6640\u6657\u6661\u6663\u667e", -2098567630), hl.a("\u5e5f\u5e5d\u5e40\u5e65\u5e78\u5e69", -2093588980), hl.a("\u00f5\u008f", -650116931)};
    }

    static {
        cJ.a();
    }
}

