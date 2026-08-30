package litebans;

import net.md_5.bungee.api.event.LoginEvent;
import org.jetbrains.annotations.NotNull;

public final class LiteBansModule_131 {
    private LiteBansModule_131() {
    }

    public final void BaseCoreGenericHandler(@NotNull Object targetObj, @NotNull CharSequence charSequence) {
        if (targetObj instanceof LoginEvent) {
            ((LoginEvent)targetObj).setCancelReason(((Object)charSequence).toString());
        }
    }

    public /* synthetic */ LiteBansModule_131(LiteBansModule_14 aJ2) {
        this();
    }
}

