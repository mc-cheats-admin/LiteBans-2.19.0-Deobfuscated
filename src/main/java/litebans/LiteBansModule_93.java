package litebans;

import java.util.Iterator;
import java.util.NoSuchElementException;
static class LiteBansModule_93
implements Iterator,
LiteBansModule_123 {
    private int c;
    final /* synthetic */ LiteBansModule_231 LiteBansModule_31;
        public LiteBansModule_93(LiteBansModule_231 gn2) {
        this.LiteBansModule_31 = gn2;
    }

    protected final int BaseCoreGenericHandler() {
        return this.c;
    }

    protected final void BaseCoreGenericHandler(int n) {
        this.c = n;
    }

    @Override
    public boolean hasNext() {
        return this.c < this.LiteBansModule_31.size();
    }

    public Object next() {
        if (!this.hasNext()) {
            throw new NoSuchElementException();
        }
        int n = this.c;
        this.c = n + 1;
        return this.LiteBansModule_31.get(n);
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    private static final void LiteBansModule_31() {
        BaseCoreGenericHandler = new String[]{"Operation is not supported for read-only collection"};
    }

    static {
        LiteBansModule_93.LiteBansModule_31();
    }
}

