package litebans;

import litebans.bT;
import litebans.di_0;
import litebans.ew;
import litebans.hl;
import litebans.jJ;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class jy
extends jJ {
    private final boolean f;
    private static /* synthetic */ String[] e;

    public jy(@NotNull di_0 di_02, @Nullable String string, boolean bl) {
        super(di_02, string);
        this.f = bl;
    }

    @Override
    public void a(@NotNull bT bT2) {
        if (ew.a((Object)this.c(), (Object)"__ALL__")) {
            return;
        }
        bT2.a(this.c());
    }

    @Override
    public String toString() {
        if (ew.a((Object)this.c(), (Object)"__ALL__")) {
            return "";
        }
        if (this.f) {
            return " AND(server_scope=?)";
        }
        return "server_scope=?";
    }

    private static final void a() {
        e = new String[]{"__ALL__", "__ALL__", "", " AND(server_scope=?)", "server_scope=?"};
    }

    static {
        jy.a();
    }
}

