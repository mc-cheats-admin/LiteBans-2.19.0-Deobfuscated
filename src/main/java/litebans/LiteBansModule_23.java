package litebans;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class LiteBansModule_23 {
    private final long LiteBansModule_194;
    private final long e;
    private final long AsyncBackgroundTask_5;
    private final long BaseCoreGenericHandler;
    private final long c;
    public LiteBansModule_23(long l3, long l5, long l7, long l8, long l9) {
        this.LiteBansModule_194 = l3;
        this.e = l5;
        this.AsyncBackgroundTask_5 = l7;
        this.plugin = l8;
        this.c = l9;
    }

    public final long BaseCoreGenericHandler() {
        return this.c;
    }

    public final long BaseCoreGenericHandler(@NotNull SilentHandler dZ2) {
        long l3;
        switch (LiteBansModule_80.BaseCoreGenericHandler[dZ2.ServerSyncService().ordinal()]) {
            case 1: {
                l3 = this.LiteBansModule_194;
                break;
            }
            case 2: {
                l3 = this.e;
                break;
            }
            case 3: {
                l3 = this.AsyncBackgroundTask_5;
                break;
            }
            case 4: {
                l3 = this.plugin;
                break;
            }
            default: {
                AssertionUtilities.BaseCoreGenericHandler();
                throw new CommandExitException();
}
        return l3;
    }

    public String toString() {
        return "(BaseCoreGenericHandler=" + this.LiteBansModule_194 + ", mute=" + this.e + ", warn=" + this.AsyncBackgroundTask_5 + ", kick=" + this.plugin + ", redo=" + this.c + ')';
    }

    public int hashCode() {
        int n = Long.hashCode(this.LiteBansModule_194);
        n = n * 31 + Long.hashCode(this.e);
        n = n * 31 + Long.hashCode(this.AsyncBackgroundTask_5);
        n = n * 31 + Long.hashCode(this.plugin);
        n = n * 31 + Long.hashCode(this.c);
        return n;
    }

    public boolean equals(@Nullable Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof LiteBansModule_23)) {
            return false;
        }
        LiteBansModule_23 au2 = (LiteBansModule_23)object;
        if (this.LiteBansModule_194 != au2.LiteBansModule_194) {
            return false;
        }
        if (this.e != au2.e) {
            return false;
        }
        if (this.AsyncBackgroundTask_5 != au2.AsyncBackgroundTask_5) {
            return false;
        }
        if (this.plugin != au2.BaseCoreGenericHandler) {
            return false;
        }
        return this.c == au2.c;
}

