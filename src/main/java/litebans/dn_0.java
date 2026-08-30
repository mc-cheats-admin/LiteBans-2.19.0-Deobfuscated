package litebans;

import litebans.aJ;
import net.md_5.bungee.api.event.LoginEvent;
import org.jetbrains.annotations.NotNull;

public final class dn_0 {
    private dn_0() {
    }

    public final void a(@NotNull Object object, @NotNull CharSequence charSequence) {
        if (object instanceof LoginEvent) {
            ((LoginEvent)object).setCancelReason(((Object)charSequence).toString());
        }
    }

    public /* synthetic */ dn_0(aJ aJ2) {
        this();
    }
}

