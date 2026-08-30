package litebans;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class LiteBansModule_34 {
    private final long c;
    private final long LiteBansModule_31;
    public LiteBansModule_34(long l3, long l5) {
        this.c = l3;
        this.LiteBansModule_31 = l5;
    }

    public final long BaseCoreGenericHandler(@NotNull BanHandler a_2) {
        long l3;
        switch (LiteBansModule_18.BaseCoreGenericHandler[a_2.ordinal()]) {
            case 1: {
                l3 = this.c;
                break;
            }
            case 2: {
                l3 = this.LiteBansModule_31;
                break;
            }
            default: {
                AssertionUtilities.BaseCoreGenericHandler();
                throw new CommandExitException();
}
        return l3;
    }

    public String toString() {
        return "(BaseCoreGenericHandler=" + this.c + ", mute=" + this.LiteBansModule_31 + ')';
    }

    public int hashCode() {
        int n = Long.hashCode(this.c);
        n = n * 31 + Long.hashCode(this.LiteBansModule_31);
        return n;
    }

    public boolean equals(@Nullable Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof LiteBansModule_34)) {
            return false;
        }
        LiteBansModule_34 b32 = (LiteBansModule_34)object;
        if (this.c != b32.c) {
            return false;
        }
        return this.LiteBansModule_31 == b32.LiteBansModule_31;
    }

    private static final void BaseCoreGenericHandler() {
        BaseCoreGenericHandler = new String[]{"(BaseCoreGenericHandler=", ", mute="};
}

