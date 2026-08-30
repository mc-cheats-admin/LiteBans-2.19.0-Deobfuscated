package litebans;

import java.util.Date;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class LiteBansModule_297 {
    private final String c;
    private final String e;
    private final String AsyncBackgroundTask_5;
    private final Date BaseCoreGenericHandler;
    public LiteBansModule_297(@Nullable String string, @Nullable String string2, @Nullable String string3, @NotNull Date date) {
        this.c = string;
        this.e = string2;
        this.AsyncBackgroundTask_5 = string3;
        this.plugin = date;
    }

    public /* synthetic */ LiteBansModule_297(String string, String string2, String string3, Date date, int n, LiteBansModule_14 aJ2) {
        if ((n & 4) != 0) {
            string3 = "#";
        }
        if ((n & 8) != 0) {
            date = new Date();
        }
        this(string, string2, string3, date);
    }

    public final String BaseCoreGenericHandler() {
        return this.c;
    }

    public final String LiteBansModule_31() {
        return this.e;
    }

    public final String i() {
        return this.AsyncBackgroundTask_5;
    }

    public final Date LiteBansModule_194() {
        return this.plugin;
    }

    public final String LiteBansModule_240() {
        return this.c;
    }

    public final String c() {
        return this.e;
    }

    public final String AsyncBackgroundTask_5() {
        return this.AsyncBackgroundTask_5;
    }

    public final Date e() {
        return this.plugin;
    }

    public String toString() {
        return "(BaseCoreGenericHandler=" + this.c + ", uuid=" + this.e + ", ip=" + this.AsyncBackgroundTask_5 + ", date=" + this.plugin + ')';
    }

    public int hashCode() {
        int n = this.c == null ? 0 : this.c.hashCode();
        n = n * 31 + (this.e == null ? 0 : this.e.hashCode());
        n = n * 31 + (this.AsyncBackgroundTask_5 == null ? 0 : this.AsyncBackgroundTask_5.hashCode());
        n = n * 31 + this.plugin.hashCode();
        return n;
    }

    public boolean equals(@Nullable Object targetObj) {
        if (this == targetObj) {
            return true;
        }
        if (!(targetObj instanceof LiteBansModule_297)) {
            return false;
        }
        LiteBansModule_297 iA2 = (LiteBansModule_297)targetObj;
        if (!ObjectUtilities.BaseCoreGenericHandler(this.c, iA2.c)) {
            return false;
        }
        if (!ObjectUtilities.BaseCoreGenericHandler(this.e, iA2.e)) {
            return false;
        }
        if (!ObjectUtilities.BaseCoreGenericHandler(this.AsyncBackgroundTask_5, iA2.AsyncBackgroundTask_5)) {
            return false;
        }
        return ObjectUtilities.BaseCoreGenericHandler(this.plugin, iA2.BaseCoreGenericHandler);
}

