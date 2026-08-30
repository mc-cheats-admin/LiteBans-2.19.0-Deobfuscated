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

public abstract class gn
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
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(int n, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Object set(int n, Object object) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Object remove(int n) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    static {
        c = 0x7FFFFFF7;
        gn.a();
        b = new bq_0(null);
    }

    private static final void a() {
        d = new String[]{"Operation is not supported for read-only collection", "Operation is not supported for read-only collection", "Operation is not supported for read-only collection", "Operation is not supported for read-only collection"};
    }
}

