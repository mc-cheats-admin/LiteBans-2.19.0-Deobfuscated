package litebans;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class LiteBansModule_109 {
    private final String e;
    private final LiteBansModule_34 c;
    private final LiteBansModule_23 BaseCoreGenericHandler;
    private final LiteBansModule_3 LiteBansModule_31;
    public LiteBansModule_109(@NotNull String string, @NotNull LiteBansModule_34 b32, @NotNull LiteBansModule_23 au2, @NotNull LiteBansModule_3 a42) {
        this.e = string;
        this.c = b32;
        this.plugin = au2;
        this.LiteBansModule_31 = a42;
    }

    public final String BaseCoreGenericHandler() {
        return this.e;
    }

    public final LiteBansModule_34 c() {
        return this.c;
    }

    public final LiteBansModule_23 LiteBansModule_194() {
        return this.plugin;
    }

    public final LiteBansModule_3 e() {
        return this.LiteBansModule_31;
    }

    public final LiteBansModule_34 AsyncBackgroundTask_5() {
        return this.c;
    }

    public final LiteBansModule_23 g() {
        return this.plugin;
    }

    public String toString() {
        return "(BaseCoreGenericHandler=" + this.e + ", duration=" + this.c + ", cooldown=" + this.plugin + ", other=" + this.LiteBansModule_31 + ')';
    }

    public int hashCode() {
        int n = this.e.hashCode();
        n = n * 31 + this.c.hashCode();
        n = n * 31 + this.plugin.hashCode();
        n = n * 31 + this.LiteBansModule_31.hashCode();
        return n;
    }

    public boolean equals(@Nullable Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof LiteBansModule_109)) {
            return false;
        }
        LiteBansModule_109 cy2 = (LiteBansModule_109)object;
        if (!ObjectUtilities.BaseCoreGenericHandler((Object)this.e, (Object)cy2.e)) {
            return false;
        }
        if (!ObjectUtilities.BaseCoreGenericHandler((Object)this.c, cy2.c)) {
            return false;
        }
        if (!ObjectUtilities.BaseCoreGenericHandler((Object)this.plugin, cy2.BaseCoreGenericHandler)) {
            return false;
        }
        return ObjectUtilities.BaseCoreGenericHandler((Object)this.LiteBansModule_31, cy2.LiteBansModule_31);
    }

    private static final void LiteBansModule_31() {
        AsyncBackgroundTask_5 = new String[]{"(BaseCoreGenericHandler=", ", duration=", ", cooldown=", ", other="};
}

