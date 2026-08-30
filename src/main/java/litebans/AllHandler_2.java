package litebans;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class AllHandler_2
extends AllHandler {
    private final boolean LiteBansModule_194;
    public AllHandler_2(@NotNull PlatformPlugin plugin, @Nullable String string, boolean flag) {
        super(plugin, string);
        this.LiteBansModule_194 = flag;
    }

    @Override
    public void BaseCoreGenericHandler(@NotNull LiteBansModule_60 bT2) {
        if (ObjectUtilities.BaseCoreGenericHandler((Object)this.c(), (Object)"__ALL__")) {
            return;
        }
        bT2.BaseCoreGenericHandler(this.c());
    }

    @Override
    public String toString() {
        if (ObjectUtilities.BaseCoreGenericHandler((Object)this.c(), (Object)"__ALL__")) {
            return "";
        }
        if (this.LiteBansModule_194) {
            return " AND(server_scope=?)";
        }
        return "server_scope=?";
    }

    private static final void BaseCoreGenericHandler() {
        e = new String[]{"__ALL__", "__ALL__", "", " AND(server_scope=?)", "server_scope=?"};
    }

    }

