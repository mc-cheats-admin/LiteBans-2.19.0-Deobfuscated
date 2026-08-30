package litebans;

import litebans.bA;
import litebans.bz;
import litebans.ew;
import litebans.hl;
import litebans.jc_0;
import org.jetbrains.annotations.NotNull;

static class b_
extends bA {
    private static /* synthetic */ String[] h;

    public static final Integer a(@NotNull String string) {
        ew.a((Object)string, "<this>");
        return bz.a(string, 10);
    }

    public static final Integer a(@NotNull String string, int n) {
        int n2;
        int n3;
        boolean bl;
        int n4;
        block14: {
            int n5;
            block13: {
                ew.a((Object)string, "<this>");
                jc_0.a(n);
                n4 = string.length();
                if (n4 == 0) {
                    return null;
                }
                n5 = 0;
                bl = false;
                n3 = 0;
                char c = string.charAt(0);
                if (ew.a(c, 48) >= 0) break block13;
                if (n4 == 1) {
                    return null;
                }
                n5 = 1;
                switch (c) {
                    case '-': {
                        bl = true;
                        n3 = Integer.MIN_VALUE;
                        break block14;
                    }
                    case '+': {
                        bl = false;
                        n3 = -2147483647;
                        break block14;
                    }
                    default: {
                        return null;
                    }
                }
            }
            n5 = 0;
            bl = false;
            n3 = -2147483647;
        }
        int n6 = n2 = -59652323;
        int n7 = 0;
        for (int i = n5; i < n4; ++i) {
            int n8 = jc_0.a(string.charAt(i), n);
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
        return bl ? Integer.valueOf(n7) : Integer.valueOf(-n7);
    }

    public static final Long b(@NotNull String string) {
        ew.a((Object)string, "<this>");
        return bz.b(string, 10);
    }

    public static final Long b(@NotNull String string, int n) {
        long l3;
        long l5;
        boolean bl;
        int n2;
        block14: {
            int n3;
            block13: {
                ew.a((Object)string, "<this>");
                jc_0.a(n);
                n2 = string.length();
                if (n2 == 0) {
                    return null;
                }
                n3 = 0;
                bl = false;
                l5 = 0L;
                char c = string.charAt(0);
                if (ew.a(c, 48) >= 0) break block13;
                if (n2 == 1) {
                    return null;
                }
                n3 = 1;
                switch (c) {
                    case '-': {
                        bl = true;
                        l5 = Long.MIN_VALUE;
                        break block14;
                    }
                    case '+': {
                        bl = false;
                        l5 = -9223372036854775807L;
                        break block14;
                    }
                    default: {
                        return null;
                    }
                }
            }
            n3 = 0;
            bl = false;
            l5 = -9223372036854775807L;
        }
        long l7 = l3 = -256204778801521550L;
        long l8 = 0L;
        for (int i = n3; i < n2; ++i) {
            int n4 = jc_0.a(string.charAt(i), n);
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
        return bl ? Long.valueOf(l8) : Long.valueOf(-l8);
    }

    private static final void h() {
        h = new String[]{"<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "input", "Invalid number format: '"};
    }

    static {
        b_.h();
    }
}

