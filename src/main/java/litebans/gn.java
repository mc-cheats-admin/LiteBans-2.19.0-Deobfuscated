package litebans;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import litebans.bq_0;
import litebans.cc_0;
import litebans.cn_0;
import litebans.dG;
import litebans.ew;
import litebans.gY;
import litebans.gb_0;
import litebans.hl;
import org.jetbrains.annotations.Nullable;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public static abstract class gn
extends gb_0
implements List,
dG {
    public static final bq_0 b;
    private static final int c;
    private static /* synthetic */ String[] d;

    protected gn() {
    }

    @Override
    public abstract int a();

    public abstract Object get(int var1);

    @Override
    public Iterator iterator() {
        return new cn_0(this);
    }

    @Override
    public int indexOf(Object object) {
        int n;
        block2: {
            List list = this;
            boolean bl = false;
            int n2 = 0;
            Iterator iterator = list.iterator();
            while (iterator.hasNext()) {
                Object e;
                Object e10 = e = iterator.next();
                boolean bl2 = false;
                if (ew.a(e10, object)) {
                    n = n2;
                    break block2;
                }
                ++n2;
            }
            n = -1;
        }
        return n;
    }

    @Override
    public int lastIndexOf(Object object) {
        int n;
        block1: {
            List list = this;
            boolean bl = false;
            ListIterator listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                Object e = listIterator.previous();
                boolean bl2 = false;
                if (!ew.a(e, object)) continue;
                n = listIterator.nextIndex();
                break block1;
            }
            n = -1;
        }
        return n;
    }

    public ListIterator listIterator() {
        return new cc_0(this, 0);
    }

    public ListIterator listIterator(int n) {
        return new cc_0(this, n);
    }

    public List subList(int n, int n2) {
        return new gY(this, n, n2);
    }

    @Override
    public boolean equals(@Nullable Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof List)) {
            return false;
        }
        return b.a(this, (Collection)object);
    }

    @Override
    public int hashCode() {
        return b.a(this);
    }

    public void add(int n, Object object) {
        throw new UnsupportedOperationException(d[0]);
    }

    public boolean addAll(int n, Collection collection) {
        throw new UnsupportedOperationException(d[1]);
    }

    public Object set(int n, Object object) {
        throw new UnsupportedOperationException(d[2]);
    }

    public Object remove(int n) {
        throw new UnsupportedOperationException(d[3]);
    }

    static {
        c = 0x7FFFFFF7;
        gn.a();
        b = new bq_0(null);
    }

    private static final void a() {
        d = new String[]{hl.a("\ua5e5\ua5da\ua5cf\ua5d8\ua5cb\ua5de\ua5c3\ua5c5\ua5c4\ua58a\ua5c3\ua5d9\ua58a\ua5c4\ua5c5\ua5de\ua58a\ua5d9\ua5df\ua5da\ua5da\ua5c5\ua5d8\ua5de\ua5cf\ua5ce\ua58a\ua5cc\ua5c5\ua5d8\ua58a\ua5d8\ua5cf\ua5cb\ua5ce\ua587\ua5c5\ua5c4\ua5c6\ua5d3\ua58a\ua5c9\ua5c5\ua5c6\ua5c6\ua5cf\ua5c9\ua5de\ua5c3\ua5c5\ua5c4", -30300758), hl.a("\uf561\uf55e\uf54b\uf55c\uf54f\uf55a\uf547\uf541\uf540\uf50e\uf547\uf55d\uf50e\uf540\uf541\uf55a\uf50e\uf55d\uf55b\uf55e\uf55e\uf541\uf55c\uf55a\uf54b\uf54a\uf50e\uf548\uf541\uf55c\uf50e\uf55c\uf54b\uf54f\uf54a\uf503\uf541\uf540\uf542\uf557\uf50e\uf54d\uf541\uf542\uf542\uf54b\uf54d\uf55a\uf547\uf541\uf540", -53742290), hl.a("\u0249\u0276\u0263\u0274\u0267\u0272\u026f\u0269\u0268\u0226\u026f\u0275\u0226\u0268\u0269\u0272\u0226\u0275\u0273\u0276\u0276\u0269\u0274\u0272\u0263\u0262\u0226\u0260\u0269\u0274\u0226\u0274\u0263\u0267\u0262\u022b\u0269\u0268\u026a\u027f\u0226\u0265\u0269\u026a\u026a\u0263\u0265\u0272\u026f\u0269\u0268", -1577188858), hl.a("\u95ff\u95c0\u95d5\u95c2\u95d1\u95c4\u95d9\u95df\u95de\u9590\u95d9\u95c3\u9590\u95de\u95df\u95c4\u9590\u95c3\u95c5\u95c0\u95c0\u95df\u95c2\u95c4\u95d5\u95d4\u9590\u95d6\u95df\u95c2\u9590\u95c2\u95d5\u95d1\u95d4\u959d\u95df\u95de\u95dc\u95c9\u9590\u95d3\u95df\u95dc\u95dc\u95d5\u95d3\u95c4\u95d9\u95df\u95de", 583767472)};
    }
}

