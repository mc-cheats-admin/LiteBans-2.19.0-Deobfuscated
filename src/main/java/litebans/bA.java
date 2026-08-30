package litebans;

import litebans.bw_0;
import litebans.bz;
import litebans.ew;
import litebans.hl;
import org.jetbrains.annotations.NotNull;

static class bA
extends bw_0 {
    private static /* synthetic */ String[] g;

    public static final Double b(@NotNull String string) {
        String string2;
        ew.a((Object)string, g[11]);
        boolean bl = false;
        try {
            Double d10;
            if (bA.a(string)) {
                string2 = string;
                boolean bl2 = false;
                d10 = Double.parseDouble(string2);
            } else {
                d10 = null;
            }
            string2 = d10;
        }
        catch (NumberFormatException numberFormatException) {
            string2 = null;
        }
        return string2;
    }

    private static final boolean a(String string) {
        int n;
        boolean bl;
        char c;
        boolean bl2;
        int n2;
        char c10;
        int n3;
        int n4;
        int n5;
        char c11;
        int n6;
        int n7 = 0;
        int n8 = string.length() - 1;
        String string2 = string;
        for (n6 = n7; n6 <= n8; ++n6) {
            c11 = string2.charAt(n6);
            n5 = 0;
            if (!(c11 <= ' ')) break;
        }
        if ((n7 = n6) > n8) {
            return false;
        }
        string2 = string;
        for (n6 = n8; n6 > n7; --n6) {
            c11 = string2.charAt(n6);
            n5 = 0;
            if (!(c11 <= ' ')) break;
        }
        n8 = n6;
        if (string.charAt(n7) == '+' || string.charAt(n7) == '-') {
            ++n7;
        }
        if (n7 > n8) {
            return false;
        }
        boolean bl3 = false;
        if (string.charAt(n7) == '0') {
            if (++n7 > n8) {
                return true;
            }
            if ((string.charAt(n7) | 0x20) == 120) {
                int n9;
                String string3 = string;
                n4 = n5 = ++n7;
                String string4 = string3;
                for (n3 = n5; n3 <= n8; ++n3) {
                    c10 = string4.charAt(n3);
                    n2 = 0;
                    if (!((c10 - 48 & 0xFFFF) < 10 || ((c10 | 0x20) - 97 & 0xFFFF) < 6)) break;
                }
                boolean bl4 = bl2 = n4 != (n5 = n3);
                if (n5 > n8) {
                    n9 = -1;
                } else {
                    n3 = 0;
                    if (string3.charAt(n5) == '.') {
                        n4 = ++n5;
                        String string5 = string3;
                        for (n2 = n5; n2 <= n8; ++n2) {
                            c = string5.charAt(n2);
                            bl = false;
                            if (!((c - 48 & 0xFFFF) < 10 || ((c | 0x20) - 97 & 0xFFFF) < 6)) break;
                        }
                        n3 = n4 != (n5 = n2) ? 1 : 0;
                    }
                    n9 = n7 = !bl2 && n3 == 0 ? -1 : n5;
                }
                if (n7 == -1 || n7 > n8) {
                    return false;
                }
                bl3 = true;
            } else {
                --n7;
            }
        }
        if (!bl3) {
            int n10;
            String string6 = string;
            n4 = n5 = n7;
            String string7 = string6;
            for (n3 = n5; n3 <= n8; ++n3) {
                c10 = string7.charAt(n3);
                n2 = 0;
                boolean bl5 = (c10 - 48 & 0xFFFF) < 10;
                if (!bl5) break;
            }
            boolean bl6 = bl2 = n4 != (n5 = n3);
            if (n5 > n8) {
                n10 = n5;
            } else {
                n3 = 0;
                if (string6.charAt(n5) == '.') {
                    n4 = ++n5;
                    String string8 = string6;
                    for (n2 = n5; n2 <= n8; ++n2) {
                        c = string8.charAt(n2);
                        bl = false;
                        boolean bl7 = (c - 48 & 0xFFFF) < 10;
                        if (!bl7) break;
                    }
                    int n11 = n3 = n4 != (n5 = n2) ? 1 : 0;
                }
                if (!bl2 && n3 == 0) {
                    String string9;
                    n2 = n8;
                    String string10 = n2 == n5 + 3 - 1 ? g[22] : (string9 = n2 == n5 + 8 - 1 ? g[23] : null);
                    n10 = string9 == null ? -1 : (bz.b((CharSequence)string6, string9, n5, false) == n5 ? n8 + 1 : -1);
                } else {
                    n10 = n7 = n5;
                }
            }
            if (n7 == -1) {
                return false;
            }
            if (n7 > n8) {
                return true;
            }
        }
        if ((n = string.charAt(n7++) | 0x20) != (bl3 ? 112 : 101)) {
            return !bl3 && (n == 102 || n == 100) && n7 > n8;
        }
        if (n7 > n8) {
            return false;
        }
        if ((string.charAt(n7) == '+' || string.charAt(n7) == '-') && ++n7 > n8) {
            return false;
        }
        String string11 = string;
        for (n5 = n7; n5 <= n8; ++n5) {
            n4 = string11.charAt(n5);
            bl2 = false;
            boolean bl8 = (n4 - 48 & 0xFFFF) < 10;
            if (!bl8) break;
        }
        if ((n7 = n5) > n8) {
            return true;
        }
        if (n7 == n8) {
            n = string.charAt(n7) | 0x20;
            return n == 102 || n == 100;
        }
        return false;
    }

    private static final void g() {
        g = new String[]{hl.a("\u72fd\u72b5\u72a9\u72a8\u72b2\u72ff", -1867746623), hl.a("\u6a1f\u6a57\u6a4b\u6a4a\u6a50\u6a1d", 812804643), hl.a("\ue74c\ue704\ue718\ue719\ue703\ue74e", 1901979504), hl.a("\u7401\u7449\u7455\u7454\u744e\u7403", -1545964483), hl.a("\u713e\u7176\u716a\u716b\u7171\u713c", 698708226), hl.a("\u50fe\u50b6\u50aa\u50ab\u50b1\u50fc", 750145730), hl.a("\u7563\u752b\u7537\u7536\u752c\u7561", -587434657), hl.a("\u8c62\u8c2a\u8c36\u8c37\u8c2d\u8c60", -463106978), hl.a("\uf770\uf738\uf724\uf725\uf73f\uf772", -1093863604), hl.a("\u65aa\u65e2\u65fe\u65ff\u65e5\u65a8", -403348074), hl.a("\u588d\u58c5\u58d9\u58d8\u58c2\u588f", -1228711759), hl.a("\u2ba1\u2be9\u2bf5\u2bf4\u2bee\u2ba3", -212259939), hl.a("\ue4dd\ue495\ue489\ue488\ue492\ue4df", 1413211361), hl.a("\u396a\u3922\u393e\u393f\u3925\u3968", -394380970), hl.a("\u3a7a\u3a32\u3a2e\u3a2f\u3a35\u3a78", 574175814), hl.a("\uad16\uad5e\uad42\uad43\uad59\uad14", -621892310), hl.a("\u6fe7\u6faf\u6fb3\u6fb2\u6fa8\u6fe5", -1956679717), hl.a("\u74ad\u74e5\u74f9\u74f8\u74e2\u74af", 399078545), hl.a("\u3644\u3648\u365d\u3641\u366a\u3646\u3647\u365d\u364c\u3651\u365d", -501533143), hl.a("\u54f6\u54be\u54a2\u54a3\u54b9\u54f4", 33182922), hl.a("\ub624\ub66c\ub670\ub671\ub66b\ub626", 1546761752), hl.a("\u7717\u771b\u770e\u7712\u7739\u7715\u7714\u770e\u771f\u7702\u770e", 181434234), hl.a("\u150b\u1524\u150b", -1012394683), hl.a("\u56b8\u569f\u5697\u5698\u569f\u5698\u5685\u5688", 858150641), hl.a("\u1e10\u1e3f\u1e10", -185917858), hl.a("\ubcbc\ubc9b\ubc93\ubc9c\ubc9b\ubc9c\ubc81\ubc8c", 1742781685), hl.a("\u2110\u213f\u2110", -767811234), hl.a("\u1a85\u1aa2\u1aaa\u1aa5\u1aa2\u1aa5\u1ab8\u1ab5", 1721244364)};
    }

    static {
        bA.g();
    }
}

