package litebans;

import java.util.Date;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class LiteBansModule_327 {
    private final CharSequence g;
    private final String AsyncBackgroundTask_5;
    private final String LiteBansModule_31;
    private final Date LiteBansModule_194;
    private final SilentHandler e;
    private final SilentHandler BaseCoreGenericHandler;
    public LiteBansModule_327(@NotNull CharSequence charSequence, @NotNull String string, @NotNull String string2, @NotNull Date date, @Nullable SilentHandler dZ2, @Nullable SilentHandler dZ3) {
        this.g = charSequence;
        this.AsyncBackgroundTask_5 = string;
        this.LiteBansModule_31 = string2;
        this.LiteBansModule_194 = date;
        this.e = dZ2;
        this.plugin = dZ3;
    }

    public final CharSequence AsyncBackgroundTask_5() {
        return this.g;
    }

    public final String e() {
        return this.AsyncBackgroundTask_5;
    }

    public final String LiteBansModule_31() {
        return this.LiteBansModule_31;
    }

    public final SilentHandler c() {
        return this.e;
    }

    public String toString() {
        return "DupeIPResult(prefix=" + this.g + ", name=" + this.AsyncBackgroundTask_5 + ", uuid=" + this.LiteBansModule_31 + ", date=" + this.LiteBansModule_194 + ", ban=" + this.e + ", mute=" + this.plugin + ')';
    }

    public int hashCode() {
        int n = this.g.hashCode();
        n = n * 31 + this.AsyncBackgroundTask_5.hashCode();
        n = n * 31 + this.LiteBansModule_31.hashCode();
        n = n * 31 + this.LiteBansModule_194.hashCode();
        n = n * 31 + (this.e == null ? 0 : this.e.hashCode());
        n = n * 31 + (this.plugin == null ? 0 : this.plugin.hashCode());
        return n;
    }

    public boolean equals(@Nullable Object targetObj) {
        if (this == targetObj) {
            return true;
        }
        if (!(targetObj instanceof LiteBansModule_327)) {
            return false;
        }
        LiteBansModule_327 j02 = (LiteBansModule_327)targetObj;
        if (!ObjectUtilities.BaseCoreGenericHandler(this.g, j02.g)) {
            return false;
        }
        if (!ObjectUtilities.BaseCoreGenericHandler(this.AsyncBackgroundTask_5, j02.AsyncBackgroundTask_5)) {
            return false;
        }
        if (!ObjectUtilities.BaseCoreGenericHandler(this.LiteBansModule_31, j02.LiteBansModule_31)) {
            return false;
        }
        if (!ObjectUtilities.BaseCoreGenericHandler(this.LiteBansModule_194, j02.LiteBansModule_194)) {
            return false;
        }
        if (!ObjectUtilities.BaseCoreGenericHandler(this.e, j02.e)) {
            return false;
        }
        return ObjectUtilities.BaseCoreGenericHandler(this.plugin, j02.BaseCoreGenericHandler);
    }

    private static final void BaseCoreGenericHandler() {
        c = new String[]{"DupeIPResult(prefix=", ", name=", ", uuid=", ", date=", ", ban=", ", mute="};
}

