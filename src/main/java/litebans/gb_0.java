package litebans;

import java.util.Collection;
import java.util.Iterator;
import litebans.d7;
import litebans.dG;
import litebans.ew;
import litebans.hl;
import litebans.ll;
import org.jetbrains.annotations.NotNull;

public abstract class gb_0
implements Collection,
dG {
    private static /* synthetic */ String[] a;

    protected gb_0() {
    }

    public abstract int a();

    @Override
    public abstract Iterator iterator();

    @Override
    public boolean contains(Object object) {
        boolean bl;
        block3: {
            Iterable iterable = this;
            boolean bl2 = false;
            if (iterable instanceof Collection && ((Collection)iterable).isEmpty()) {
                bl = false;
            } else {
                Iterator iterator = iterable.iterator();
                while (iterator.hasNext()) {
                    Object t2;
                    Object t3 = t2 = iterator.next();
                    boolean bl3 = false;
                    if (!ew.a(t3, object)) continue;
                    bl = true;
                    break block3;
                }
                bl = false;
            }
        }
        return bl;
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
    public boolean isEmpty() {
        return this.size() == 0;
    }

    public String toString() {
        return ll.a(this, ", ", "[", "]", 0, null, arg_0 -> gb_0.a(this, arg_0), 24, null);
    }

    @Override
    public Object[] toArray() {
        return d7.a(this);
    }

    public Object[] toArray(@NotNull Object[] objectArray) {
        ew.a((Object)objectArray, "array");
        return d7.a(this, objectArray);
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

    private static final CharSequence a(gb_0 gb_02, Object object) {
        return object == gb_02 ? (CharSequence)"(this Collection)" : (CharSequence)String.valueOf(object);
    }

    @Override
    public final int size() {
        return this.a();
    }

    private static final void b() {
        a = new String[]{"elements", ", ", "[", "]", "array", "Operation is not supported for read-only collection", "Operation is not supported for read-only collection", "Operation is not supported for read-only collection", "Operation is not supported for read-only collection", "Operation is not supported for read-only collection", "Operation is not supported for read-only collection", "(this Collection)"};
    }

    static {
        gb_0.b();
    }
}

