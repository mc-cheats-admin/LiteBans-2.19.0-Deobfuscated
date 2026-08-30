package litebans;

import litebans.c_0;
import litebans.ew;
import litebans.hl;
import litebans.hy_0;
import litebans.jc_0;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from litebans.gs
 */
public static final class gs_0 {
    private static /* synthetic */ String[] a;

    public static final hy_0 a(@NotNull String string) {
        ew.a((Object)string, a[8]);
        return gs_0.a(string, 10);
    }

    public static final hy_0 a(@NotNull String string, int n) {
        ew.a((Object)string, a[9]);
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
        ew.a((Object)string, a[13]);
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
        a = new String[]{hl.a("\u28a0\u28e8\u28f4\u28f5\u28ef\u28a2", 1976476), hl.a("\u558a\u55c2\u55de\u55df\u55c5\u5588", -1704503882), hl.a("\u51de\u5196\u518a\u518b\u5191\u51dc", 1751339490), hl.a("\u42cc\u4284\u4298\u4299\u4283\u42ce", 232145648), hl.a("\u4362\u432a\u4336\u4337\u432d\u4360", -2061941922), hl.a("\u35e2\u35aa\u35b6\u35b7\u35ad\u35e0", -1077922338), hl.a("\u6984\u69cc\u69d0\u69d1\u69cb\u6986", 646932920), hl.a("\u570a\u5742\u575e\u575f\u5745\u5708", -1493608650), hl.a("\u6c58\u6c10\u6c0c\u6c0d\u6c17\u6c5a", -634295196), hl.a("\u6ccb\u6c83\u6c9f\u6c9e\u6c84\u6cc9", -1061458697), hl.a("\u3821\u3869\u3875\u3874\u386e\u3823", -1427556323), hl.a("\uc599\uc5d1\uc5cd\uc5cc\uc5d6\uc59b", 757450149), hl.a("\ub2ac\ub2e4\ub2f8\ub2f9\ub2e3\ub2ae", 259502736), hl.a("\ub64d\ub605\ub619\ub618\ub602\ub64f", -1072712079), hl.a("\ue53b\ue573\ue56f\ue56e\ue574\ue539", 913827079), hl.a("\uaf7d\uaf35\uaf29\uaf28\uaf32\uaf7f", 473542465)};
    }

    static {
        gs_0.a();
    }
}

