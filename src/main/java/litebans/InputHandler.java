package litebans;

import org.jetbrains.annotations.NotNull;

static class InputHandler
extends NanHandler {
        public static final Integer BaseCoreGenericHandler(@NotNull String string) {
        ObjectUtilities.BaseCoreGenericHandler((Object)string, "<this>");
        return StringUtilities.BaseCoreGenericHandler(string, 10);
    }

    public static final Integer BaseCoreGenericHandler(@NotNull String string, int n) {
        int n2;
        int n3;
        boolean flag;
        int n4;
        block14: {
            int n5;
            block13: {
                ObjectUtilities.BaseCoreGenericHandler((Object)string, "<this>");
                LiteBansModule_339.BaseCoreGenericHandler(n);
                n4 = string.length();
                if (n4 == 0) {
                    return null;
                }
                n5 = 0;
                flag = false;
                n3 = 0;
                char c = string.charAt(0);
                if (ObjectUtilities.BaseCoreGenericHandler(c, 48) >= 0) break block13;
                if (n4 == 1) {
                    return null;
                }
                n5 = 1;
                switch (c) {
                    case '-': {
                        flag = true;
                        n3 = Integer.MIN_VALUE;
                        break block14;
                    }
                    case '+': {
                        flag = false;
                        n3 = -2147483647;
                        break block14;
                    }
                    default: {
                        return null;
                    }
                }
            }
            n5 = 0;
            flag = false;
            n3 = -2147483647;
        }
        int n6 = n2 = -59652323;
        for (int i = n5; i < n4; ++i) {
            int n8 = LiteBansModule_339.BaseCoreGenericHandler(string.charAt(i), n);
            if (n8 < 0) {
                return null;
            }
            if (n7 < n6) {
                if (n6 == n2) {
                    n6 = n3 / n;
                    if (n7 < n6) {
                        return null;
                    }
                } else {
                    return null;
                }
            }
            if ((n7 *= n) < n3 + n8) {
                return null;
            }
            n7 -= n8;
        }
        return flag ? Integer.valueOf(n7) : Integer.valueOf(-n7);
    }

    public static final Long LiteBansModule_31(@NotNull String string) {
        ObjectUtilities.BaseCoreGenericHandler((Object)string, "<this>");
        return StringUtilities.LiteBansModule_31(string, 10);
    }

    public static final Long LiteBansModule_31(@NotNull String string, int n) {
        long l3;
        long l5;
        boolean flag;
        int n2;
        block14: {
            int n3;
            block13: {
                ObjectUtilities.BaseCoreGenericHandler((Object)string, "<this>");
                LiteBansModule_339.BaseCoreGenericHandler(n);
                n2 = string.length();
                if (n2 == 0) {
                    return null;
                }
                n3 = 0;
                flag = false;
                l5 = 0L;
                char c = string.charAt(0);
                if (ObjectUtilities.BaseCoreGenericHandler(c, 48) >= 0) break block13;
                if (n2 == 1) {
                    return null;
                }
                n3 = 1;
                switch (c) {
                    case '-': {
                        flag = true;
                        l5 = Long.MIN_VALUE;
                        break block14;
                    }
                    case '+': {
                        flag = false;
                        l5 = -9223372036854775807L;
                        break block14;
                    }
                    default: {
                        return null;
                    }
                }
            }
            n3 = 0;
            flag = false;
            l5 = -9223372036854775807L;
        }
        long l7 = l3 = -256204778801521550L;
        long l8 = 0L;
        for (int i = n3; i < n2; ++i) {
            int n4 = LiteBansModule_339.BaseCoreGenericHandler(string.charAt(i), n);
            if (n4 < 0) {
                return null;
            }
            if (l8 < l7) {
                if (l7 == l3) {
                    l7 = l5 / (long)n;
                    if (l8 < l7) {
                        return null;
                    }
                } else {
                    return null;
                }
            }
            if ((l8 *= (long)n) < l5 + (long)n4) {
                return null;
            }
            l8 -= (long)n4;
        }
        return flag ? Long.valueOf(l8) : Long.valueOf(-l8);
    }

    private static final void LiteBansModule_241() {
        LiteBansModule_241 = new String[]{"<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "input", "Invalid number format: '"};
    }

    static {
        InputHandler.LiteBansModule_241();
    }
}

