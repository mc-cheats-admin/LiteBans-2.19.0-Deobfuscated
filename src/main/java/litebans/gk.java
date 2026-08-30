package litebans;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import litebans.iP;

public static final class gk
implements List,
RandomAccess,
Serializable {
    private static final long a = -4598088075242913858L;
    private final Class b;
    private Object[] d;
    private int c;

    public gk(Class clazz, int n) {
        this.d = (Object[])Array.newInstance(clazz, n);
        this.b = clazz;
    }

    @Override
    public boolean add(Object object) {
        if (this.c < this.d.length) {
            this.d[this.c++] = object;
        } else {
            int n = this.d.length;
            int n2 = n << 1;
            Object[] objectArray = (Object[])Array.newInstance(this.b, n2);
            System.arraycopy(this.d, 0, objectArray, 0, n);
            objectArray[this.c++] = object;
            this.d = objectArray;
        }
        return true;
    }

    public Object get(int n) {
        return this.d[n];
    }

    @Override
    public boolean remove(Object object) {
        for (int i = this.c - 1; i >= 0; --i) {
            if (object != this.d[i]) continue;
            int n = this.c - i - 1;
            if (n > 0) {
                System.arraycopy(this.d, i + 1, this.d, i, n);
            }
            this.d[--this.c] = null;
            return true;
        }
        return false;
    }

    @Override
    public void clear() {
        for (int i = 0; i < this.c; ++i) {
            this.d[i] = null;
        }
        this.c = 0;
    }

    @Override
    public int size() {
        return this.c;
    }

    @Override
    public boolean isEmpty() {
        return this.c == 0;
    }

    public Object set(int n, Object object) {
        Object object2 = this.d[n];
        this.d[n] = object;
        return object2;
    }

    public Object remove(int n) {
        if (this.c == 0) {
            return null;
        }
        Object object = this.d[n];
        int n2 = this.c - n - 1;
        if (n2 > 0) {
            System.arraycopy(this.d, n + 1, this.d, n, n2);
        }
        this.d[--this.c] = null;
        return object;
    }

    @Override
    public boolean contains(Object object) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Iterator iterator() {
        return new iP(this);
    }

    @Override
    public Object[] toArray() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Object[] toArray(Object[] objectArray) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean containsAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public boolean addAll(int n, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public void add(int n, Object object) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int indexOf(Object object) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int lastIndexOf(Object object) {
        throw new UnsupportedOperationException();
    }

    public ListIterator listIterator() {
        throw new UnsupportedOperationException();
    }

    public ListIterator listIterator(int n) {
        throw new UnsupportedOperationException();
    }

    public List subList(int n, int n2) {
        throw new UnsupportedOperationException();
    }

    public Object clone() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void forEach(Consumer consumer) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Spliterator spliterator() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean removeIf(Predicate predicate) {
        throw new UnsupportedOperationException();
    }

    public void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException();
    }

    public void sort(Comparator comparator) {
        throw new UnsupportedOperationException();
    }

    static /* synthetic */ int b(gk gk2) {
        return gk2.c;
    }

    static /* synthetic */ Object[] a(gk gk2) {
        return gk2.d;
    }
}

