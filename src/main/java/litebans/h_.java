package litebans;

import java.util.Collection;
import java.util.Iterator;
import litebans.d2;
import litebans.d7;
import litebans.dG;
import litebans.ew;
import litebans.hl;
import litebans.ll;
import litebans.lo_0;
import org.jetbrains.annotations.NotNull;

static final class h_
implements Collection,
dG {
    private final Object[] a;
    private final boolean c;
    private static /* synthetic */ String[] b;

    public h_(@NotNull Object[] objectArray, boolean bl) {
        ew.a((Object)objectArray, "values");
        this.a = objectArray;
        this.c = bl;
    }

    public int a() {
        return this.a.length;
    }

    @Override
    public boolean isEmpty() {
        return this.a.length == 0;
    }

    @Override
    public boolean contains(Object object) {
        return lo_0.b(this.a, object);
    }

    public boolean containsAll(@NotNull Collection collection) {
        boolean bl;
        block3: {
            ew.a((Object)collection, "elements");
            Iterable iterable = collection;
            boolean bl2 = false;
            if (((Collection)iterable).isEmpty()) {
                bl = true;
            } else {
                Iterator iterator = iterable.iterator();
                while (iterator.hasNext()) {
                    Object t2;
                    Object t3 = t2 = iterator.next();
                    boolean bl3 = false;
                    if (this.contains(t3)) continue;
                    bl = false;
                    break block3;
                }
                bl = true;
            }
        }
        return bl;
    }

    @Override
    public Iterator iterator() {
        return d2.a(this.a);
    }

    @Override
    public final Object[] toArray() {
        return ll.a(this.a, this.c);
    }

    public boolean add(Object object) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean remove(Object object) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final int size() {
        return this.a();
    }

    public Object[] toArray(Object[] objectArray) {
        ew.a((Object)objectArray, "array");
        return d7.a(this, objectArray);
    }

    private static final void b() {
        b = new String[]{"values", "elements", "Operation is not supported for read-only collection", "Operation is not supported for read-only collection", "Operation is not supported for read-only collection", "Operation is not supported for read-only collection", "Operation is not supported for read-only collection", "Operation is not supported for read-only collection", "array"};
    }

    static {
        h_.b();
    }
}

