package litebans;

import java.util.Iterator;
public abstract class LiteBansModule_290
implements Iterator,
LiteBansModule_122 {
    public abstract int LiteBansModule_31();

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Object next() {
        return this.LiteBansModule_31();
    }

    private static final void BaseCoreGenericHandler() {
        BaseCoreGenericHandler = new String[]{"Operation is not supported for read-only collection"};
    }

    }

