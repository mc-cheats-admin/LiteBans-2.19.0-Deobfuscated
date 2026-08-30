package litebans;

import java.util.UUID;
import org.jetbrains.annotations.Nullable;

public final class LiteBansModule_90 {
    private final String LiteBansModule_31;
    private final UUID c;
        public LiteBansModule_90(@Nullable String string, @Nullable UUID uUID) {
        this.LiteBansModule_31 = string;
        this.c = uUID;
    }

    public final String AsyncBackgroundTask_5() {
        return this.LiteBansModule_31;
    }

    public final UUID BaseCoreGenericHandler() {
        return this.c;
    }

    public final boolean c() {
        return ObjectUtilities.BaseCoreGenericHandler((Object)this, LiteBansModule_92.LiteBansModule_31());
    }

    public String toString() {
        return "Profile(name=" + this.LiteBansModule_31 + ", uuid=" + this.c + ')';
    }

    public int hashCode() {
        int n = this.LiteBansModule_31 == null ? 0 : this.LiteBansModule_31.hashCode();
        n = n * 31 + (this.c == null ? 0 : this.c.hashCode());
        return n;
    }

    public boolean equals(@Nullable Object targetObj) {
        if (this == targetObj) {
            return true;
        }
        if (!(targetObj instanceof LiteBansModule_90)) {
            return false;
        }
        LiteBansModule_90 cM2 = (LiteBansModule_90)targetObj;
        if (!ObjectUtilities.BaseCoreGenericHandler((Object)this.LiteBansModule_31, (Object)cM2.LiteBansModule_31)) {
            return false;
        }
        return ObjectUtilities.BaseCoreGenericHandler((Object)this.c, cM2.c);
    }

    private static final void LiteBansModule_31() {
        BaseCoreGenericHandler = new String[]{"Profile(name=", ", uuid="};
    }

    static {
        LiteBansModule_90.LiteBansModule_31();
    }
}

