package litebans;

import litebans.aJ;
import org.jetbrains.annotations.NotNull;

public static final class c9 {
    private final Object a;
    private boolean b;

    public c9(@NotNull Object object, boolean bl) {
        this.a = object;
        this.b = bl;
    }

    public /* synthetic */ c9(Object object, boolean bl, int n, aJ aJ2) {
        if ((n & 2) != 0) {
            bl = false;
        }
        this(object, bl);
    }

    public final boolean a() {
        return this.b;
    }

    public final void a(boolean bl) {
        this.b = bl;
    }
}

