package litebans;

import java.util.RandomAccess;
import org.jetbrains.annotations.NotNull;

static final class ListHandler
extends LiteBansModule_230
implements RandomAccess {
    private final LiteBansModule_230 LiteBansModule_240;
    private final int e;
    private int LiteBansModule_194;
    public ListHandler(@NotNull LiteBansModule_230 gn2, int n, int n2) {
        ObjectUtilities.BaseCoreGenericHandler((Object)gn2, "list");
        this.LiteBansModule_240 = gn2;
        this.e = n;
        LiteBansModule_230.LiteBansModule_31.BaseCoreGenericHandler(this.e, n2, this.LiteBansModule_240.size());
        this.LiteBansModule_194 = n2 - this.e;
    }

    @Override
    public Object get(int n) {
        LiteBansModule_230.LiteBansModule_31.BaseCoreGenericHandler(n, this.LiteBansModule_194);
        return this.LiteBansModule_240.get(this.e + n);
    }

    @Override
    public int BaseCoreGenericHandler() {
        return this.LiteBansModule_194;
    }

    private static final void c() {
        g = new String[]{"list"};
}

