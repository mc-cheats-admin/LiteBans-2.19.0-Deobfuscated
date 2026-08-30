package litebans;

import java.util.Iterator;
import java.util.NoSuchElementException;
import litebans.dG;
import litebans.gn;
import litebans.hl;

/*
 * Renamed from litebans.cN
 */
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
        throw new UnsupportedOperationException(a[0]);
    }

    private static final void b() {
        a = new String[]{hl.a("\u5d6f\u5d50\u5d45\u5d52\u5d41\u5d54\u5d49\u5d4f\u5d4e\u5d00\u5d49\u5d53\u5d00\u5d4e\u5d4f\u5d54\u5d00\u5d53\u5d55\u5d50\u5d50\u5d4f\u5d52\u5d54\u5d45\u5d44\u5d00\u5d46\u5d4f\u5d52\u5d00\u5d52\u5d45\u5d41\u5d44\u5d0d\u5d4f\u5d4e\u5d4c\u5d59\u5d00\u5d43\u5d4f\u5d4c\u5d4c\u5d45\u5d43\u5d54\u5d49\u5d4f\u5d4e", -770482912)};
    }

    static {
        cn_0.b();
    }
}

