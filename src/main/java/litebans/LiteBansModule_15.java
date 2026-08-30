package litebans;

import java.util.Objects;
import org.jetbrains.annotations.Nullable;

public final class LiteBansModule_15 {
    private final int BaseCoreGenericHandler;
    private String c;
    private String LiteBansModule_31;

    private LiteBansModule_15(int n, String string, String string2) {
        this.plugin = n;
        this.c = string;
        this.LiteBansModule_31 = string2;
    }

    public final int c() {
        return this.plugin;
    }

    public final String e() {
        return this.c;
    }

    public final void BaseCoreGenericHandler(@Nullable String string) {
        this.c = string;
    }

    public final String AsyncBackgroundTask_5() {
        return this.LiteBansModule_31;
    }

    public final void LiteBansModule_31(@Nullable String string) {
        this.LiteBansModule_31 = string;
    }

    public String toString() {
        return Objects.toString(this.c);
    }

    public final int BaseCoreGenericHandler() {
        return this.plugin;
    }

    public final boolean LiteBansModule_31() {
        return this.c != null && this.LiteBansModule_31 != null && Integer.compareUnsigned(this.plugin, 65535) < 0;
    }

    public final boolean LiteBansModule_194() {
        return !this.LiteBansModule_31();
    }

    public int hashCode() {
        int n = LiteBansModule_72.AsyncBackgroundTask_5(this.plugin);
        n = n * 31 + (this.c == null ? 0 : this.c.hashCode());
        n = n * 31 + (this.LiteBansModule_31 == null ? 0 : this.LiteBansModule_31.hashCode());
        return n;
    }

    public boolean equals(@Nullable Object targetObj) {
        if (this == targetObj) {
            return true;
        }
        if (!(targetObj instanceof LiteBansModule_15)) {
            return false;
        }
        LiteBansModule_15 aK2 = (LiteBansModule_15)targetObj;
        if (this.plugin != aK2.BaseCoreGenericHandler) {
            return false;
        }
        if (!ObjectUtilities.BaseCoreGenericHandler(this.c, aK2.c)) {
            return false;
        }
        return ObjectUtilities.BaseCoreGenericHandler(this.LiteBansModule_31, aK2.LiteBansModule_31);
    }

    public /* synthetic */ LiteBansModule_15(int n, String string, String string2, LiteBansModule_14 aJ2) {
        this(n, string, string2);
}

