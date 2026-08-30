package litebans;

import litebans.aJ;
import litebans.ew;
import litebans.hl;
import org.jetbrains.annotations.NotNull;

public final class dv_0
extends Error {
    private static /* synthetic */ String[] a;

    public dv_0(@NotNull String string) {
        ew.a((Object)string, "message");
        super(string);
    }

    public /* synthetic */ dv_0(String string, int n, aJ aJ2) {
        if ((n & 1) != 0) {
            string = "An operation is not ";
        }
        this(string);
    }

    public dv_0() {
        this(null, 1, null);
    }

    private static final void a() {
        a = new String[]{"message", "An operation is not implemented."};
    }

    static {
        dv_0.a();
    }
}

