package litebans;

import org.jetbrains.annotations.NotNull;

static class NanHandler
extends BuilderactionHandler_2 {
    public static final Double LiteBansModule_31(@NotNull String string) {
        String string2;
        ObjectUtilities.BaseCoreGenericHandler((Object)string, "<this>");
        try {
            Double d10;
            if (NanHandler.BaseCoreGenericHandler(string)) {
                string2 = string;
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

    private static final boolean BaseCoreGenericHandler(String string) {
        int n;
        boolean flag;
        char c;
        boolean flag2;
        int n2;
        char c10;
        int n3;
        int n4;
        int n5;
        char c11;
        int n6;
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
                boolean flag4 = flag2 = n4 != (n5 = n3);
                if (n5 > n8) {
                    n9 = -1;
                } else {
                    n3 = 0;
                    if (string3.charAt(n5) == '.') {
                        n4 = ++n5;
                        String string5 = string3;
                        for (n2 = n5; n2 <= n8; ++n2) {
                            c = string5.charAt(n2);
                            flag = false;
                            if (!((c - 48 & 0xFFFF) < 10 || ((c | 0x20) - 97 & 0xFFFF) < 6)) break;
                        }
                        n3 = n4 != (n5 = n2) ? 1 : 0;
                    }
                    n9 = n7 = !flag2 && n3 == 0 ? -1 : n5;
                }
                if (n7 == -1 || n7 > n8) {
                    return false;
                }
                flag3 = true;
            } else {
                --n7;
}
        if (!flag3) {
            int n10;
            String string6 = string;
            n4 = n5 = n7;
            String string7 = string6;
            for (n3 = n5; n3 <= n8; ++n3) {
                c10 = string7.charAt(n3);
                n2 = 0;
                boolean flag5 = (c10 - 48 & 0xFFFF) < 10;
                if (!flag5) break;
            }
            boolean flag6 = flag2 = n4 != (n5 = n3);
            if (n5 > n8) {
                n10 = n5;
            } else {
                n3 = 0;
                if (string6.charAt(n5) == '.') {
                    n4 = ++n5;
                    String string8 = string6;
                    for (n2 = n5; n2 <= n8; ++n2) {
                        c = string8.charAt(n2);
                        flag = false;
                        boolean flag7 = (c - 48 & 0xFFFF) < 10;
                        if (!flag7) break;
                    }
                    int n11 = n3 = n4 != (n5 = n2) ? 1 : 0;
                }
                if (!flag2 && n3 == 0) {
                    String string9;
                    n2 = n8;
                    String string10 = n2 == n5 + 3 - 1 ? "NaN" : (string9 = n2 == n5 + 8 - 1 ? "Infinity" : null);
                    n10 = string9 == null ? -1 : (StringUtilities.LiteBansModule_31((CharSequence)string6, string9, n5, false) == n5 ? n8 + 1 : -1);
                } else {
                    n10 = n7 = n5;
}
            if (n7 == -1) {
                return false;
            }
            if (n7 > n8) {
                return true;
}
        if ((n = string.charAt(n7++) | 0x20) != (flag3 ? 112 : 101)) {
            return !flag3 && (n == 102 || n == 100) && n7 > n8;
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
            flag2 = false;
            boolean flag8 = (n4 - 48 & 0xFFFF) < 10;
            if (!flag8) break;
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

