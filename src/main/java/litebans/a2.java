package litebans;

import litebans.api.PlayerProvider;
import litebans.di_0;
import litebans.hl;
import litebans.q_0;
import org.jetbrains.annotations.NotNull;

public static final class a2
extends PlayerProvider {
    private final di_0 b;
    private final q_0 c;
    private static /* synthetic */ String[] a;

    public a2(@NotNull di_0 di_02) {
        this.b = di_02;
        this.c = (q_0)this.b.a(q_0.class);
    }

    @Override
    public String provide(@NotNull String string) {
        return string;
    }

    public String toString() {
        return a[0];
    }

    private static final void a() {
        a = new String[]{hl.a("\u3e5c\u3e60\u3e6d\u3e75\u3e69\u3e7e\u3e5c\u3e7e\u3e63\u3e7a\u3e65\u3e68\u3e69\u3e7e", -266387956)};
    }

    static {
        a2.a();
    }
}

