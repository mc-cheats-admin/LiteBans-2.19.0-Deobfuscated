package litebans;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import litebans.b1;
import litebans.bt_0;
import litebans.eo_0;
import litebans.ew;
import litebans.gt;
import litebans.hl;
import litebans.i_;
import litebans.iv_0;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from litebans.gO
 */
public static final class go_0 {
    private static /* synthetic */ String[] a;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static final void a(@NotNull Reader reader, @NotNull eo_0 eo_02) {
        ew.a((Object)reader, a[4]);
        ew.a((Object)eo_02, a[5]);
        Reader reader2 = reader;
        boolean bl = false;
        Closeable closeable = reader2;
        int n = 8192;
        closeable = closeable instanceof BufferedReader ? (BufferedReader)closeable : new BufferedReader((Reader)closeable, n);
        Throwable throwable = null;
        try {
            Object object = (BufferedReader)closeable;
            boolean bl2 = false;
            i_ i_2 = go_0.a((BufferedReader)object);
            boolean bl3 = false;
            i_ i_3 = i_2;
            boolean bl4 = false;
            Iterator iterator = i_3.a();
            while (iterator.hasNext()) {
                Object e = iterator.next();
                eo_02.a(e);
            }
            object = iv_0.a;
        }
        catch (Throwable throwable2) {
            throwable = throwable2;
            throw throwable2;
        }
        finally {
            bt_0.a(closeable, throwable);
        }
    }

    public static final List a(@NotNull Reader reader) {
        ew.a((Object)reader, a[6]);
        ArrayList arrayList = new ArrayList();
        go_0.a(reader, arg_0 -> go_0.a(arrayList, arg_0));
        return arrayList;
    }

    public static final i_ a(@NotNull BufferedReader bufferedReader) {
        ew.a((Object)bufferedReader, a[10]);
        return gt.a(new b1(bufferedReader));
    }

    private static final iv_0 a(ArrayList arrayList, String string) {
        ew.a((Object)string, a[19]);
        arrayList.add(string);
        return iv_0.a;
    }

    private static final void a() {
        a = new String[]{hl.a("\ubf52\ubf1a\ubf06\ubf07\ubf1d\ubf50", -1443446930), hl.a("\u681c\u6854\u6848\u6849\u6853\u681e", 287533088), hl.a("\u1735\u177d\u1761\u1760\u177a\u1737", -1496443127), hl.a("\u340b\u3443\u345f\u345e\u3444\u3409", -1313328073), hl.a("\ub5f9\ub5b1\ub5ad\ub5ac\ub5b6\ub5fb", -1136544315), hl.a("\uc66e\uc66c\uc67b\uc666\uc660\uc661", 215533071), hl.a("\ueb52\ueb1a\ueb06\ueb07\ueb1d\ueb50", 390851438), hl.a("\u27b9\u27f1\u27ed\u27ec\u27f6\u27bb", -1071896699), hl.a("\u0b85\u0b8b\u0b88\u0b84\u0b8c", 1471351783), hl.a("\u32af\u32e7\u32fb\u32fa\u32e0\u32ad", 1971860115), hl.a("\u0c83\u0ccb\u0cd7\u0cd6\u0ccc\u0c81", -203420481), hl.a("\uaa48\uaa00\uaa1c\uaa1d\uaa07\uaa4a", 1898359412), hl.a("\u5641\u5609\u5615\u5614\u560e\u5643", -86354307), hl.a("\u301d\u3007\u3006", 1715220594), hl.a("\u3127\u316f\u3173\u3172\u3168\u3125", -2000277221), hl.a("\uedd3\uedd8\uedd1\uedc2\uedc3\uedd5\uedc4", -252645968), hl.a("\u2478\u2430\u242c\u242d\u2437\u247a", -654433212), hl.a("\uf3fa\uf3f1\uf3f8\uf3eb\uf3ea\uf3fc\uf3ed", -241962087), hl.a("\uf800\uf848\uf854\uf855\uf84f\uf802", -1199245252), hl.a("\u268e\u2693", 1624450791)};
    }

    static {
        go_0.a();
    }
}

