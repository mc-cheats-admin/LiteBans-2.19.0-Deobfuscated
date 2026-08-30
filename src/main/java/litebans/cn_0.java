package litebans;

import java.util.Iterator;
import java.util.NoSuchElementException;
import litebans.dG;
import litebans.gn;
import litebans.hl;

static class cn_0
implements Iterator,
dG {
    private int c;
    final /* synthetic */ gn b;
    private static /* synthetic */ String[] a;

    public cn_0(gn gn2) {
        this.b = gn2;
    }

    protected final int a() {
        return this.c;
    }

    protected final void a(int n) {
        this.c = n;
    }

    @Override
    public boolean hasNext() {
        return this.c < this.b.size();
    }

    public Object next() {
        if (!this.hasNext()) {
            throw new NoSuchElementException();
        }
        int n = this.c;
        this.c = n + 1;
        return this.b.get(n);
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    private static final void b() {
        a = new String[]{"Operation is not supported for read-only collection"};
    }

    static {
        cn_0.b();
    }
}

