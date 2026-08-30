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
        ew.a((Object)string, "<this>");
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
                    String string10 = n2 == n5 + 3 - 1 ? "NaN" : (string9 = n2 == n5 + 8 - 1 ? "Infinity" : null);
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
        g = new String[]{"<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "mathContext", "<this>", "<this>", "mathContext", "NaN", "Infinity", "NaN", "Infinity", "NaN", "Infinity"};
    }

    static {
        bA.g();
    }
}

