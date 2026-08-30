package litebans;

import java.util.ListIterator;
import java.util.NoSuchElementException;
public final class LiteBansModule_410
implements ListIterator,
LiteBansModule_122 {
    public static final LiteBansModule_410 BaseCoreGenericHandler;
    private LiteBansModule_410() {
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public boolean hasPrevious() {
        return false;
    }

    @Override
    public int nextIndex() {
        return 0;
    }

    @Override
    public int previousIndex() {
        return -1;
    }

    public Void LiteBansModule_31() {
        throw new NoSuchElementException();
    }

    public Void BaseCoreGenericHandler() {
        throw new NoSuchElementException();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public Object next() {
        return this.LiteBansModule_31();
    }

    public Object previous() {
        return this.plugin();
    }

    public void set(Object object) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void add(Object object) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    static {
        LiteBansModule_410.c();
        BaseCoreGenericHandler = new LiteBansModule_410();
    }

    }

