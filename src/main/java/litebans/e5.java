package litebans;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import litebans.d7;
import litebans.dG;
import litebans.ew;
import litebans.hl;
import litebans.le_0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class e5
implements Set,
Serializable,
dG {
    public static final e5 b;
    private static final long a;
    private static /* synthetic */ String[] c;

    private e5() {
    }

    @Override
    public boolean equals(@Nullable Object object) {
        return object instanceof Set && ((Set)object).isEmpty();
    }

    @Override
    public int hashCode() {
        return 0;
    }

    public String toString() {
        return "[]";
    }

    public int a() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return true;
    }

    public boolean a(@NotNull Void void_) {
        ew.a((Object)void_, "element");
        return false;
    }

    @Override
    public boolean containsAll(@NotNull Collection collection) {
        ew.a((Object)collection, "elements");
        return collection.isEmpty();
    }

    @Override
    public Iterator iterator() {
        return le_0.a;
    }

    private final Object c() {
        return b;
    }

    @Override
    public boolean remove(Object object) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
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

    @Override
    public final boolean contains(Object object) {
        if (!(object instanceof Void)) {
            return false;
        }
        return this.a((Void)object);
    }

    @Override
    public boolean add(Object object) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public Object[] toArray(Object[] objectArray) {
        ew.a((Object)objectArray, "array");
        return d7.a(this, objectArray);
    }

    @Override
    public Object[] toArray() {
        return d7.a(this);
    }

    static {
        a = 3406603774387020532L;
        e5.b();
        b = new e5();
    }

    private static final void b() {
        c = new String[]{"[]", "element", "elements", "Operation is not supported for read-only collection", "Operation is not supported for read-only collection", "Operation is not supported for read-only collection", "Operation is not supported for read-only collection", "Operation is not supported for read-only collection", "Operation is not supported for read-only collection", "Operation is not supported for read-only collection", "array"};
    }
}

