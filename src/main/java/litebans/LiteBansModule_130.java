package litebans;

import net.md_5.bungee.api.event.LoginEvent;
import org.jetbrains.annotations.NotNull;

public final class LiteBansModule_130 {
    private LiteBansModule_130() {
    }

    public final void BaseCoreGenericHandler(@NotNull Object object, @NotNull CharSequence charSequence) {
        if (object instanceof LoginEvent) {
            ((LoginEvent)object).setCancelReason(((Object)charSequence).toString());
        }
    }

    public /* synthetic */ LiteBansModule_130(LiteBansModule_14 aJ2) {
        this();
    }
}

