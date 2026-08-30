package litebans;

import java.util.RandomAccess;
import org.jetbrains.annotations.NotNull;

static final class ListHandler
extends LiteBansModule_231
implements RandomAccess {
    private final LiteBansModule_231 LiteBansModule_241;
    private final int e;
    private int LiteBansModule_195;
        public ListHandler(@NotNull LiteBansModule_231 gn2, int n, int n2) {
        ObjectUtilities.BaseCoreGenericHandler((Object)gn2, "list");
        this.LiteBansModule_241 = gn2;
        this.e = n;
        LiteBansModule_231.LiteBansModule_31.BaseCoreGenericHandler(this.e, n2, this.LiteBansModule_241.size());
        this.LiteBansModule_195 = n2 - this.e;
    }

    @Override
    public Object get(int n) {
        LiteBansModule_231.LiteBansModule_31.BaseCoreGenericHandler(n, this.LiteBansModule_195);
        return this.LiteBansModule_241.get(this.e + n);
    }

    @Override
    public int BaseCoreGenericHandler() {
        return this.LiteBansModule_195;
    }

    private static final void c() {
        g = new String[]{"list"};
    }

    static {
        ListHandler.c();
    }
}

