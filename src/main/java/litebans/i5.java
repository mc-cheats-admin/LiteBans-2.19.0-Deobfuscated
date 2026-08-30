package litebans;

import java.util.Iterator;
import litebans.dG;
import litebans.hl;

public abstract class i5
implements Iterator,
dG {
    private static /* synthetic */ String[] a;

    public abstract int b();

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Object next() {
        return this.b();
    }

    private static final void a() {
        a = new String[]{"Operation is not supported for read-only collection"};
    }

    static {
        i5.a();
    }
}

