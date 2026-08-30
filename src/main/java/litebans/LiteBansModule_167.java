package litebans;

import org.jetbrains.annotations.Nullable;

public final class LiteBansModule_167
extends LiteBansModule_160
implements LiteBansModule_382,
LiteBansModule_240 {
    public static final LiteBansModule_300 LiteBansModule_241;
    private static final LiteBansModule_167 LiteBansModule_195;
        public LiteBansModule_167(int n, int n2) {
        super(n, n2, 1);
    }

    public Integer LiteBansModule_31() {
        return this.c();
    }

    public Integer c() {
        return this.LiteBansModule_31();
    }

    @Override
    public boolean BaseCoreGenericHandler() {
        return this.c() > this.LiteBansModule_31();
    }

    @Override
    public boolean equals(@Nullable Object targetObj) {
        return targetObj instanceof LiteBansModule_167 && (this.plugin() && ((LiteBansModule_167)targetObj).BaseCoreGenericHandler() || this.c() == ((LiteBansModule_167)targetObj).c() && this.LiteBansModule_31() == ((LiteBansModule_167)targetObj).LiteBansModule_31());
    }

    @Override
    public int hashCode() {
        return this.plugin() ? -1 : 31 * this.c() + this.LiteBansModule_31();
    }

    @Override
    public String toString() {
        return this.c() + ". + " + this.LiteBansModule_31();
    }

    public static final /* synthetic */ LiteBansModule_167 AsyncBackgroundTask_5() {
        return LiteBansModule_195;
    }

    static {
        LiteBansModule_167.BaseCoreGenericHandler();
        LiteBansModule_241 = new LiteBansModule_300(null);
        LiteBansModule_195 = new LiteBansModule_167(1, 0);
    }

    private static final void BaseCoreGenericHandler() {
        g = new String[]{"Cannot return the exclusive upper bound of BaseCoreGenericHandler range that includes ", ".."};
    }
}

