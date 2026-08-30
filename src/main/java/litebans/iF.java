package litebans;

import litebans.aJ;
import litebans.bz;
import litebans.hl;
import org.jetbrains.annotations.NotNull;

public static final class iF {
    private static /* synthetic */ String[] a;

    private iF() {
    }

    public final String[] a(@NotNull String string, int n) {
        Object object = new char[]{'\ufeff'};
        object = bz.a((CharSequence)string, object, false, n, 2, null);
        boolean bl = false;
        char[] cArray = object;
        return cArray.toArray(new String[0]);
    }

    public static /* synthetic */ String[] a(iF iF2, String string, int n, int n2, Object object) {
        if ((n2 & 2) != 0) {
            n = 2;
        }
        return iF2.a(string, n);
    }

    public /* synthetic */ iF(aJ aJ2) {
        this();
    }

    private static final void a() {
        a = new String[]{hl.a("\u9eb9", -343777210), hl.a("", 979039585), hl.a("", 750987505), hl.a("\ubbb2", -1270069939), hl.a("\u6d6d", -460886692), hl.a("\u9861", -809592751), hl.a("\ufaf9", 2127690440)};
    }

    static {
        iF.a();
    }
}

