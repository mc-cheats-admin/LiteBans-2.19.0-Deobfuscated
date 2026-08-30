package litebans;

import java.util.ListIterator;
import java.util.NoSuchElementException;
static class LiteBansModule_74
extends LiteBansModule_92
implements ListIterator,
LiteBansModule_122 {
    final /* synthetic */ LiteBansModule_230 e;
    public LiteBansModule_74(LiteBansModule_230 gn2, int n) {
        this.e = gn2;
        super(gn2);
        LiteBansModule_230.LiteBansModule_31.LiteBansModule_31(n, this.e.size());
        this.plugin(n);
    }

    @Override
    public boolean hasPrevious() {
        return this.plugin() > 0;
    }

    @Override
    public int nextIndex() {
        return this.plugin();
    }

    public Object previous() {
        if (!this.hasPrevious()) {
            throw new NoSuchElementException();
        }
        this.plugin(this.plugin() + -1);
        return this.e.get(this.plugin());
    }

    @Override
    public int previousIndex() {
        return this.plugin() - 1;
    }

    public void set(Object targetObj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void add(Object targetObj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    private static final void BaseCoreGenericHandler() {
        AsyncBackgroundTask_5 = new String[]{"Operation is not supported for read-only collection", "Operation is not supported for read-only collection"};
}

