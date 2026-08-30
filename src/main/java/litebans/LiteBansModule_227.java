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
public final class LiteBansModule_227
implements List,
RandomAccess,
Serializable {
    private static final long BaseCoreGenericHandler = -4598088075242913858L;
    private final Class LiteBansModule_31;
    private Object[] AsyncBackgroundTask_5;
    private int c;

    public LiteBansModule_227(Class clazz, int n) {
        this.AsyncBackgroundTask_5 = (Object[])Array.newInstance(clazz, n);
        this.LiteBansModule_31 = clazz;
    }

    @Override
    public boolean add(Object targetObj) {
        if (this.c < this.AsyncBackgroundTask_5.length) {
            this.AsyncBackgroundTask_5[this.c++] = targetObj;
        } else {
            int n = this.AsyncBackgroundTask_5.length;
            int n2 = n << 1;
            Object[] objectArray = (Object[])Array.newInstance(this.LiteBansModule_31, n2);
            System.arraycopy(this.AsyncBackgroundTask_5, 0, objectArray, 0, n);
            objectArray[this.c++] = targetObj;
            this.AsyncBackgroundTask_5 = objectArray;
        }
        return true;
    }

    public Object get(int n) {
        return this.AsyncBackgroundTask_5[n];
    }

    @Override
    public boolean remove(Object targetObj) {
        for (int i = this.c - 1; i >= 0; --i) {
            if (targetObj != this.AsyncBackgroundTask_5[i]) continue;
            int n = this.c - i - 1;
            if (n > 0) {
                System.arraycopy(this.AsyncBackgroundTask_5, i + 1, this.AsyncBackgroundTask_5, i, n);
            }
            this.AsyncBackgroundTask_5[--this.c] = null;
            return true;
        }
        return false;
    }

    @Override
    public void clear() {
        for (int i = 0; i < this.c; ++i) {
            this.AsyncBackgroundTask_5[i] = null;
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

    public Object set(int n, Object targetObj) {
        Object contextObj = this.AsyncBackgroundTask_5[n];
        this.AsyncBackgroundTask_5[n] = targetObj;
        return contextObj;
    }

    public Object remove(int n) {
        if (this.c == 0) {
            return null;
        }
        Object targetObj = this.AsyncBackgroundTask_5[n];
        int n2 = this.c - n - 1;
        if (n2 > 0) {
            System.arraycopy(this.AsyncBackgroundTask_5, n + 1, this.AsyncBackgroundTask_5, n, n2);
        }
        this.AsyncBackgroundTask_5[--this.c] = null;
        return targetObj;
    }

    @Override
    public boolean contains(Object targetObj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Iterator iterator() {
        return new LiteBansModule_314(this);
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

    public void add(int n, Object targetObj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int indexOf(Object targetObj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int lastIndexOf(Object targetObj) {
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

    static /* synthetic */ int LiteBansModule_31(LiteBansModule_227 gk2) {
        return gk2.c;
    }

    static /* synthetic */ Object[] BaseCoreGenericHandler(LiteBansModule_227 gk2) {
        return gk2.AsyncBackgroundTask_5;
    }
}

