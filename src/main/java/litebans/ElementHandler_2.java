package litebans;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class ElementHandler_2
implements Set,
Serializable,
LiteBansModule_123 {
    public static final ElementHandler_2 LiteBansModule_31;
    private static final long BaseCoreGenericHandler;
        private ElementHandler_2() {
    }

    @Override
    public boolean equals(@Nullable Object targetObj) {
        return targetObj instanceof Set && ((Set)targetObj).isEmpty();
    }

    @Override
    public int hashCode() {
        return 0;
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

    public boolean BaseCoreGenericHandler(@NotNull Void void_) {
        ObjectUtilities.BaseCoreGenericHandler((Object)void_, "element");
        return false;
    }

    @Override
    public boolean containsAll(@NotNull Collection collection) {
        ObjectUtilities.BaseCoreGenericHandler((Object)collection, "elements");
        return collection.isEmpty();
    }

    @Override
    public Iterator iterator() {
        return LiteBansModule_412.BaseCoreGenericHandler;
    }

    private final Object c() {
        return LiteBansModule_31;
    }

    @Override
    public boolean remove(Object targetObj) {
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
        return this.plugin();
    }

    @Override
    public final boolean contains(Object targetObj) {
        if (!(targetObj instanceof Void)) {
            return false;
        }
        return this.plugin((Void)targetObj);
    }

    @Override
    public boolean add(Object targetObj) {
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
        BaseCoreGenericHandler = 3406603774387020532L;
        ElementHandler_2.LiteBansModule_31();
        LiteBansModule_31 = new ElementHandler_2();
    }

    private static final void LiteBansModule_31() {
        c = new String[]{"[]", "element", "elements", "Operation is not supported for read-only collection", "Operation is not supported for read-only collection", "Operation is not supported for read-only collection", "Operation is not supported for read-only collection", "Operation is not supported for read-only collection", "Operation is not supported for read-only collection", "Operation is not supported for read-only collection", "array"};
    }
}

