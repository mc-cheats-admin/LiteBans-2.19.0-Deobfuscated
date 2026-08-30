package litebans;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import litebans.d7;
import litebans.dG;
import litebans.ew;
import litebans.hl;
import litebans.le_0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class cK
implements List,
Serializable,
RandomAccess,
dG {
    public static final cK c;
    private static final long b;
    private static /* synthetic */ String[] a;

    private cK() {
    }

    @Override
    public boolean equals(@Nullable Object object) {
        return object instanceof List && ((List)object).isEmpty();
    }

    @Override
    public int hashCode() {
        return 1;
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

    public boolean b(@NotNull Void void_) {
        ew.a((Object)void_, "element");
        return false;
    }

    @Override
    public boolean containsAll(@NotNull Collection collection) {
        ew.a((Object)collection, "elements");
        return collection.isEmpty();
    }

    public Void a(int n) {
        throw new IndexOutOfBoundsException("Empty list doesn't contain element at index " + n + '.');
    }

    public int c(@NotNull Void void_) {
        ew.a((Object)void_, "element");
        return -1;
    }

    public int a(@NotNull Void void_) {
        ew.a((Object)void_, "element");
        return -1;
    }

    @Override
    public Iterator iterator() {
        return le_0.a;
    }

    public ListIterator listIterator() {
        return le_0.a;
    }

    public ListIterator listIterator(int n) {
        if (n != 0) {
            throw new IndexOutOfBoundsException("Index: " + n);
        }
        return le_0.a;
    }

    public List subList(int n, int n2) {
        if (n == 0 && n2 == 0) {
            return this;
        }
        throw new IndexOutOfBoundsException("fromIndex: " + n + ", toIndex: " + n2);
    }

    private final Object c() {
        return c;
    }

    @Override
    public boolean remove(Object object) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(int n, Collection collection) {
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

    public Object remove(int n) {
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
        return this.b((Void)object);
    }

    public Object get(int n) {
        return this.a(n);
    }

    @Override
    public final int indexOf(Object object) {
        if (!(object instanceof Void)) {
            return -1;
        }
        return this.c((Void)object);
    }

    @Override
    public final int lastIndexOf(Object object) {
        if (!(object instanceof Void)) {
            return -1;
        }
        return this.a((Void)object);
    }

    @Override
    public boolean add(Object object) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void add(int n, Object object) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Object set(int n, Object object) {
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
        b = -7390468764508069838L;
        cK.b();
        c = new cK();
    }

    private static final void b() {
        a = new String[]{"[]", "element", "elements", "Empty list doesn't contain element at index ", "element", "element", "Index: ", "fromIndex: ", ", toIndex: ", "Operation is not supported for read-only collection", "Operation is not supported for read-only collection", "Operation is not supported for read-only collection", "Operation is not supported for read-only collection", "Operation is not supported for read-only collection", "Operation is not supported for read-only collection", "Operation is not supported for read-only collection", "Operation is not supported for read-only collection", "Operation is not supported for read-only collection", "Operation is not supported for read-only collection", "Operation is not supported for read-only collection", "Operation is not supported for read-only collection", "Operation is not supported for read-only collection", "Operation is not supported for read-only collection", "array"};
    }
}

