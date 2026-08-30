package litebans;

import java.util.Iterator;
import litebans.ew;
import litebans.g7;
import litebans.hl;
import org.jetbrains.annotations.NotNull;

public static final class d2 {
    private static /* synthetic */ String[] a;

    public static final Iterator a(@NotNull Object[] objectArray) {
        ew.a((Object)objectArray, a[0]);
        return new g7(objectArray);
    }

    private static final void a() {
        a = new String[]{hl.a("\ud01b\ud008\ud008\ud01b\ud003", 1339150458)};
    }

    static {
        d2.a();
    }
}

