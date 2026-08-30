package litebans;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ElementHandler
implements List,
Serializable,
RandomAccess,
LiteBansModule_123 {
    public static final ElementHandler c;
    private static final long LiteBansModule_31;
        private ElementHandler() {
    }

    @Override
    public boolean equals(@Nullable Object targetObj) {
        return targetObj instanceof List && ((List)targetObj).isEmpty();
    }

    @Override
    public int hashCode() {
        return 1;
    }

    public String toString() {
        return "[]";
    }

    public int BaseCoreGenericHandler() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return true;
    }

    public boolean LiteBansModule_31(@NotNull Void void_) {
        ObjectUtilities.BaseCoreGenericHandler((Object)void_, "element");
        return false;
    }

    @Override
    public boolean containsAll(@NotNull Collection collection) {
        ObjectUtilities.BaseCoreGenericHandler((Object)collection, "elements");
        return collection.isEmpty();
    }

    public Void BaseCoreGenericHandler(int n) {
        throw new IndexOutOfBoundsException("Empty list doesn'AsyncBackgroundTask_22 contain element LiteBansModule_21 index " + n + '.');
    }

    public int c(@NotNull Void void_) {
        ObjectUtilities.BaseCoreGenericHandler((Object)void_, "element");
        return -1;
    }

    public int BaseCoreGenericHandler(@NotNull Void void_) {
        ObjectUtilities.BaseCoreGenericHandler((Object)void_, "element");
        return -1;
    }

    @Override
    public Iterator iterator() {
        return LiteBansModule_412.BaseCoreGenericHandler;
    }

    public ListIterator listIterator() {
        return LiteBansModule_412.BaseCoreGenericHandler;
    }

    public ListIterator listIterator(int n) {
        if (n != 0) {
            throw new IndexOutOfBoundsException("Index: " + n);
        }
        return LiteBansModule_412.BaseCoreGenericHandler;
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
    public boolean remove(Object targetObj) {
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
        return this.plugin();
    }

    @Override
    public final boolean contains(Object targetObj) {
        if (!(targetObj instanceof Void)) {
            return false;
        }
        return this.LiteBansModule_31((Void)targetObj);
    }

    public Object get(int n) {
        return this.plugin(n);
    }

    @Override
    public final int indexOf(Object targetObj) {
        if (!(targetObj instanceof Void)) {
            return -1;
        }
        return this.c((Void)targetObj);
    }

    @Override
    public final int lastIndexOf(Object targetObj) {
        if (!(targetObj instanceof Void)) {
            return -1;
        }
        return this.plugin((Void)targetObj);
    }

    @Override
    public boolean add(Object targetObj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void add(int n, Object targetObj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Object set(int n, Object targetObj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public Object[] toArray(Object[] objectArray) {
        ObjectUtilities.BaseCoreGenericHandler((Object)objectArray, "array");
        return CollectionHandler.BaseCoreGenericHandler(this, objectArray);
    }

    @Override
    public Object[] toArray() {
        return CollectionHandler.BaseCoreGenericHandler(this);
    }

    static {
        LiteBansModule_31 = -7390468764508069838L;
        ElementHandler.LiteBansModule_31();
        c = new ElementHandler();
    }

    private static final void LiteBansModule_31() {
        BaseCoreGenericHandler = new String[]{"[]", "element", "elements", "Empty list doesn'AsyncBackgroundTask_22 contain element LiteBansModule_21 index ", "element", "element", "Index: ", "fromIndex: ", ", toIndex: ", "Operation is not supported for read-only collection", "Operation is not supported for read-only collection", "Operation is not supported for read-only collection", "Operation is not supported for read-only collection", "Operation is not supported for read-only collection", "Operation is not supported for read-only collection", "Operation is not supported for read-only collection", "Operation is not supported for read-only collection", "Operation is not supported for read-only collection", "Operation is not supported for read-only collection", "Operation is not supported for read-only collection", "Operation is not supported for read-only collection", "Operation is not supported for read-only collection", "Operation is not supported for read-only collection", "array"};
    }
}

