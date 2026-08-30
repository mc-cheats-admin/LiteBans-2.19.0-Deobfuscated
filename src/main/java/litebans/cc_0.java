package litebans;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import litebans.cn_0;
import litebans.dG;
import litebans.gn;
import litebans.hl;

/*
 * Renamed from litebans.cC
 */
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
        throw new UnsupportedOperationException(d[0]);
    }

    public void add(Object object) {
        throw new UnsupportedOperationException(d[1]);
    }

    private static final void a() {
        d = new String[]{hl.a("\u41cf\u41f0\u41e5\u41f2\u41e1\u41f4\u41e9\u41ef\u41ee\u41a0\u41e9\u41f3\u41a0\u41ee\u41ef\u41f4\u41a0\u41f3\u41f5\u41f0\u41f0\u41ef\u41f2\u41f4\u41e5\u41e4\u41a0\u41e6\u41ef\u41f2\u41a0\u41f2\u41e5\u41e1\u41e4\u41ad\u41ef\u41ee\u41ec\u41f9\u41a0\u41e3\u41ef\u41ec\u41ec\u41e5\u41e3\u41f4\u41e9\u41ef\u41ee", 628113792), hl.a("\u146f\u1450\u1445\u1452\u1441\u1454\u1449\u144f\u144e\u1400\u1449\u1453\u1400\u144e\u144f\u1454\u1400\u1453\u1455\u1450\u1450\u144f\u1452\u1454\u1445\u1444\u1400\u1446\u144f\u1452\u1400\u1452\u1445\u1441\u1444\u140d\u144f\u144e\u144c\u1459\u1400\u1443\u144f\u144c\u144c\u1445\u1443\u1454\u1449\u144f\u144e", -547679200)};
    }

    static {
        cc_0.a();
    }
}

