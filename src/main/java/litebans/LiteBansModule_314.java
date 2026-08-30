package litebans;

import java.util.Iterator;
import java.util.NoSuchElementException;
static class LiteBansModule_314
implements Iterator {
    private int BaseCoreGenericHandler;
    final /* synthetic */ LiteBansModule_227 LiteBansModule_31;

    LiteBansModule_314(LiteBansModule_227 gk2) {
        this.LiteBansModule_31 = gk2;
    }

    @Override
    public boolean hasNext() {
        return this.plugin < LiteBansModule_227.LiteBansModule_31(this.LiteBansModule_31);
    }

    public Object next() {
        if (this.plugin < LiteBansModule_227.LiteBansModule_31(this.LiteBansModule_31)) {
            return LiteBansModule_227.BaseCoreGenericHandler(this.LiteBansModule_31)[this.plugin++];
        }
        throw new NoSuchElementException("No more elements InitializerHandler_3 FastList");
    }
}

