package litebans;

import litebans.aJ;
import litebans.bz;
import litebans.hl;
import org.jetbrains.annotations.NotNull;

public final class iF {
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
        a = new String[]{"\ufeff", "", "", "\ufeff", "1", "0", "1"};
    }

    static {
        iF.a();
    }
}

