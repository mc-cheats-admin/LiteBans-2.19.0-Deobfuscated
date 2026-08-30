package litebans;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import litebans.dG;
import litebans.hl;

/*
 * Renamed from litebans.le
 */
public static final class le_0
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
        throw new UnsupportedOperationException(b[0]);
    }

    @Override
    public Object next() {
        return this.b();
    }

    public Object previous() {
        return this.a();
    }

    public void set(Object object) {
        throw new UnsupportedOperationException(b[3]);
    }

    public void add(Object object) {
        throw new UnsupportedOperationException(b[4]);
    }

    static {
        le_0.c();
        a = new le_0();
    }

    private static final void c() {
        b = new String[]{hl.a("\u9247\u9278\u926d\u927a\u9269\u927c\u9261\u9267\u9266\u9228\u9261\u927b\u9228\u9266\u9267\u927c\u9228\u927b\u927d\u9278\u9278\u9267\u927a\u927c\u926d\u926c\u9228\u926e\u9267\u927a\u9228\u927a\u926d\u9269\u926c\u9225\u9267\u9266\u9264\u9271\u9228\u926b\u9267\u9264\u9264\u926d\u926b\u927c\u9261\u9267\u9266", 1308856840), hl.a("\ua8a9\ua896\ua883\ua894\ua887\ua892\ua88f\ua889\ua888\ua8c6\ua88f\ua895\ua8c6\ua888\ua889\ua892\ua8c6\ua895\ua893\ua896\ua896\ua889\ua894\ua892\ua883\ua882\ua8c6\ua880\ua889\ua894\ua8c6\ua894\ua883\ua887\ua882\ua8cb\ua889\ua888\ua88a\ua89f\ua8c6\ua885\ua889\ua88a\ua88a\ua883\ua885\ua892\ua88f\ua889\ua888", 670410982), hl.a("\u1ea1\u1e9e\u1e8b\u1e9c\u1e8f\u1e9a\u1e87\u1e81\u1e80\u1ece\u1e87\u1e9d\u1ece\u1e80\u1e81\u1e9a\u1ece\u1e9d\u1e9b\u1e9e\u1e9e\u1e81\u1e9c\u1e9a\u1e8b\u1e8a\u1ece\u1e88\u1e81\u1e9c\u1ece\u1e9c\u1e8b\u1e8f\u1e8a\u1ec3\u1e81\u1e80\u1e82\u1e97\u1ece\u1e8d\u1e81\u1e82\u1e82\u1e8b\u1e8d\u1e9a\u1e87\u1e81\u1e80", -1195303186), hl.a("\u10e6\u10d9\u10cc\u10db\u10c8\u10dd\u10c0\u10c6\u10c7\u1089\u10c0\u10da\u1089\u10c7\u10c6\u10dd\u1089\u10da\u10dc\u10d9\u10d9\u10c6\u10db\u10dd\u10cc\u10cd\u1089\u10cf\u10c6\u10db\u1089\u10db\u10cc\u10c8\u10cd\u1084\u10c6\u10c7\u10c5\u10d0\u1089\u10ca\u10c6\u10c5\u10c5\u10cc\u10ca\u10dd\u10c0\u10c6\u10c7", -81129303), hl.a("\u42f1\u42ce\u42db\u42cc\u42df\u42ca\u42d7\u42d1\u42d0\u429e\u42d7\u42cd\u429e\u42d0\u42d1\u42ca\u429e\u42cd\u42cb\u42ce\u42ce\u42d1\u42cc\u42ca\u42db\u42da\u429e\u42d8\u42d1\u42cc\u429e\u42cc\u42db\u42df\u42da\u4293\u42d1\u42d0\u42d2\u42c7\u429e\u42dd\u42d1\u42d2\u42d2\u42db\u42dd\u42ca\u42d7\u42d1\u42d0", 296501950)};
    }
}

