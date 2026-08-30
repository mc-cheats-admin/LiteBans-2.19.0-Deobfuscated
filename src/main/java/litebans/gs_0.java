package litebans;

import litebans.c_0;
import litebans.ew;
import litebans.hl;
import litebans.hy_0;
import litebans.jc_0;
import org.jetbrains.annotations.NotNull;

public final class gs_0 {
    private static /* synthetic */ String[] a;

    public static final hy_0 a(@NotNull String string) {
        ew.a((Object)string, "<this>");
        return gs_0.a(string, 10);
    }

    public static final hy_0 a(@NotNull String string, int n) {
        ew.a((Object)string, "<this>");
        c_0 c_02 = gs_0.b(string, n);
        if (c_02 == null) {
            return null;
        }
        int n2 = c_02.a();
        int n3 = -1;
        if (Integer.compareUnsigned(n2, c_0.b(n3 & 0xFF)) > 0) {
            return null;
        }
        return hy_0.d(hy_0.a((byte)n2));
    }

    public static final c_0 b(@NotNull String string, int n) {
        int n2;
        ew.a((Object)string, "<this>");
        jc_0.a(n);
        int n3 = string.length();
        if (n3 == 0) {
            return null;
        }
        int n4 = -1;
        int n5 = 0;
        char c = string.charAt(0);
        if (ew.a(c, 48) < 0) {
            if (n3 == 1 || c != '+') {
                return null;
            }
            n5 = 1;
        } else {
            n5 = 0;
        }
        int n6 = n2 = 0x71C71C7;
        int n7 = c_0.b(n);
        int n8 = 0;
        for (int i = n5; i < n3; ++i) {
            int n9 = jc_0.a(string.charAt(i), n);
            if (n9 < 0) {
                return null;
            }
            if (Integer.compareUnsigned(n8, n6) > 0) {
                if (n6 == n2) {
                    n6 = Integer.divideUnsigned(n4, n7);
                    if (Integer.compareUnsigned(n8, n6) > 0) {
                        return null;
                    }
                } else {
                    return null;
                }
            }
            int n10 = n8 = c_0.b(n8 * n7);
            if (Integer.compareUnsigned(n8 = c_0.b(n8 + c_0.b(n9)), n10) >= 0) continue;
            return null;
        }
        return c_0.a(n8);
    }

    private static final void a() {
        a = new String[]{"<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>", "<this>"};
    }

    static {
        gs_0.a();
    }
}

