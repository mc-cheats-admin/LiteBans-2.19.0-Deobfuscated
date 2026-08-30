package litebans;

import net.md_5.bungee.api.event.LoginEvent;
import org.jetbrains.annotations.NotNull;

public final class LiteBansModule_130 {
    private LiteBansModule_130() {
    }

    public final void BaseCoreGenericHandler(@NotNull Object targetObj, @NotNull CharSequence charSequence) {
        if (targetObj instanceof LoginEvent) {
            targetObj.setCancelReason((charSequence).toString());
}

    public /* synthetic */ LiteBansModule_130(LiteBansModule_14 aJ2) {
        this();
}

