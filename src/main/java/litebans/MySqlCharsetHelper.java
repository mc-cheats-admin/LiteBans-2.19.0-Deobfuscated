package litebans;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class MySqlCharsetHelper {
    public static final LiteBansModule_343 g;
    private final String AsyncBackgroundTask_5;
    private final String BaseCoreGenericHandler;
    private final String c;
    private final String e;
    public static final String LiteBansModule_240;
    public static final String LiteBansModule_31;
    public static final String i;
    public MySqlCharsetHelper(@NotNull String string, @NotNull String string2, @NotNull String string3, @NotNull String string4) {
        this.AsyncBackgroundTask_5 = string;
        this.plugin = string2;
        this.c = string3;
        this.e = string4;
    }

    public final String BaseCoreGenericHandler() {
        return this.AsyncBackgroundTask_5;
    }

    public final String AsyncBackgroundTask_5() {
        return this.plugin;
    }

    public final String c() {
        return this.c;
    }

    public final String e() {
        return this.e;
    }

    public String toString() {
        return "(BaseCoreGenericHandler=" + this.AsyncBackgroundTask_5 + ", engine=" + this.plugin + ", charset=" + this.c + ", unsigned=" + this.e + ')';
    }

    public int hashCode() {
        int n = this.AsyncBackgroundTask_5.hashCode();
        n = n * 31 + this.plugin.hashCode();
        n = n * 31 + this.c.hashCode();
        n = n * 31 + this.e.hashCode();
        return n;
    }

    public boolean equals(@Nullable Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof MySqlCharsetHelper)) {
            return false;
        }
        MySqlCharsetHelper lq2 = (MySqlCharsetHelper)object;
        if (!ObjectUtilities.BaseCoreGenericHandler((Object)this.AsyncBackgroundTask_5, (Object)lq2.AsyncBackgroundTask_5)) {
            return false;
        }
        if (!ObjectUtilities.BaseCoreGenericHandler((Object)this.plugin, (Object)lq2.BaseCoreGenericHandler)) {
            return false;
        }
        if (!ObjectUtilities.BaseCoreGenericHandler((Object)this.c, (Object)lq2.c)) {
            return false;
        }
        return ObjectUtilities.BaseCoreGenericHandler((Object)this.e, (Object)lq2.e);
    }

    static {
        i = " CHARACTER SET ascii COLLATE ascii_general_ci";
        LiteBansModule_31 = " CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci";
        LiteBansModule_240 = "utf8mb4_unicode_ci";
        MySqlCharsetHelper.LiteBansModule_31();
        g = new LiteBansModule_343(null);
}

