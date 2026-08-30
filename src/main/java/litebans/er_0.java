package litebans;

import java.util.List;
import litebans.aJ;
import litebans.bz;
import litebans.de_0;
import litebans.hl;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from litebans.eR
 */
public static final class er_0 {
    private static /* synthetic */ String[] a;

    private er_0() {
    }

    public final de_0 a(@NotNull String string, @NotNull Integer[] integerArray) {
        char[] cArray;
        String string2 = string;
        if (bz.b(string2, a[0], false, 2, null)) {
            string2 = bz.d(string2, ':', null, 2, null);
        }
        if (bz.c((CharSequence)string2, '+', false, 2, null)) {
            cArray = new char[]{'+'};
            string2 = (String)bz.a((CharSequence)string2, cArray, false, 0, 6, null).get(1);
        }
        if (bz.c((CharSequence)string2, '-', false, 2, null)) {
            cArray = new char[]{'-'};
            string2 = (String)bz.a((CharSequence)string2, cArray, false, 0, 6, null).get(0);
        }
        int n = integerArray[0];
        int n2 = integerArray[1];
        int n3 = integerArray[2];
        if (bz.c((CharSequence)string2, '.', false, 2, null)) {
            char[] cArray2 = new char[]{'.'};
            List list = bz.a((CharSequence)string2, cArray2, false, 0, 6, null);
            if (list.size() >= 3) {
                Integer n4 = bz.a((String)list.get(0));
                n = n4 != null ? n4 : n;
                Integer n5 = bz.a((String)list.get(1));
                n2 = n5 != null ? n5 : n2;
                Integer n6 = bz.a((String)list.get(2));
                n3 = n6 != null ? n6 : n3;
            }
        } else {
            Integer n7 = bz.a(string2);
            n = n7 != null ? n7 : n;
        }
        return new de_0(n, n2, n3);
    }

    public static /* synthetic */ de_0 a(er_0 er_02, String string, Integer[] integerArray, int n, Object object) {
        if ((n & 2) != 0) {
            Integer[] integerArray2 = new Integer[]{1, 21, 5};
            integerArray = integerArray2;
        }
        return er_02.a(string, integerArray);
    }

    public /* synthetic */ er_0(aJ aJ2) {
        this();
    }

    private static final void a() {
        a = new String[]{hl.a("\u9bc8\u9bc6\u9bdb\u9b95", -638674001)};
    }

    static {
        er_0.a();
    }
}

