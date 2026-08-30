package litebans;

import org.jetbrains.annotations.Nullable;

public final class LiteBansModule_166
extends LiteBansModule_159
implements LiteBansModule_380,
LiteBansModule_239 {
    public static final LiteBansModule_299 LiteBansModule_240;
    private static final LiteBansModule_166 LiteBansModule_194;
    public LiteBansModule_166(int n, int n2) {
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
    public boolean equals(@Nullable Object object) {
        return object instanceof LiteBansModule_166 && (this.plugin() && ((LiteBansModule_166)object).BaseCoreGenericHandler() || this.c() == ((LiteBansModule_166)object).c() && this.LiteBansModule_31() == ((LiteBansModule_166)object).LiteBansModule_31());
    }

    @Override
    public int hashCode() {
        return this.plugin() ? -1 : 31 * this.c() + this.LiteBansModule_31();
    }

    @Override
    public String toString() {
        return this.c() + ". + " + this.LiteBansModule_31();
    }

    public static final /* synthetic */ LiteBansModule_166 AsyncBackgroundTask_5() {
        return LiteBansModule_194;
    }

    static {
        LiteBansModule_166.BaseCoreGenericHandler();
        LiteBansModule_240 = new LiteBansModule_299(null);
        LiteBansModule_194 = new LiteBansModule_166(1, 0);
    }

    private static final void BaseCoreGenericHandler() {
        g = new String[]{"Cannot return the exclusive upper bound of BaseCoreGenericHandler range that includes ", ".."};
}

