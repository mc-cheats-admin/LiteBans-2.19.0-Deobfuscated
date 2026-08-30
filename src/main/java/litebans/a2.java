package litebans;

import litebans.api.PlayerProvider;
import litebans.di_0;
import litebans.hl;
import litebans.q_0;
import org.jetbrains.annotations.NotNull;

public final class a2
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
        return "PlayerProvider";
    }

    private static final void a() {
        a = new String[]{"PlayerProvider"};
    }

    static {
        a2.a();
    }
}

