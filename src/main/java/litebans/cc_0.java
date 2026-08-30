package litebans;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import litebans.cn_0;
import litebans.dG;
import litebans.gn;
import litebans.hl;

static class cc_0
extends cn_0
implements ListIterator,
dG {
    final /* synthetic */ gn e;
    private static /* synthetic */ String[] d;

    public cc_0(gn gn2, int n) {
        this.e = gn2;
        super(gn2);
        gn.b.b(n, this.e.size());
        this.a(n);
    }

    @Override
    public boolean hasPrevious() {
        return this.a() > 0;
    }

    @Override
    public int nextIndex() {
        return this.a();
    }

    public Object previous() {
        if (!this.hasPrevious()) {
            throw new NoSuchElementException();
        }
        this.a(this.a() + -1);
        return this.e.get(this.a());
    }

    @Override
    public int previousIndex() {
        return this.a() - 1;
    }

    public void set(Object object) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void add(Object object) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    private static final void a() {
        d = new String[]{"Operation is not supported for read-only collection", "Operation is not supported for read-only collection"};
    }

    static {
        cc_0.a();
    }
}

