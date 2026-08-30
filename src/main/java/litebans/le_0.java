package litebans;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import litebans.dG;
import litebans.hl;

public final class le_0
implements ListIterator,
dG {
    public static final le_0 a;
    private static /* synthetic */ String[] b;

    private le_0() {
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

    public Void b() {
        throw new NoSuchElementException();
    }

    public Void a() {
        throw new NoSuchElementException();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public Object next() {
        return this.b();
    }

    public Object previous() {
        return this.a();
    }

    public void set(Object object) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void add(Object object) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    static {
        le_0.c();
        a = new le_0();
    }

    private static final void c() {
        b = new String[]{"Operation is not supported for read-only collection", "Operation is not supported for read-only collection", "Operation is not supported for read-only collection", "Operation is not supported for read-only collection", "Operation is not supported for read-only collection"};
    }
}

