package litebans;

import java.util.Collection;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

static final class ValuesHandler
implements Collection,
LiteBansModule_123 {
    private final Object[] BaseCoreGenericHandler;
    private final boolean c;
        public ValuesHandler(@NotNull Object[] objectArray, boolean flag) {
        ObjectUtilities.BaseCoreGenericHandler((Object)objectArray, "values");
        this.plugin = objectArray;
        this.c = flag;
    }

    public int BaseCoreGenericHandler() {
        return this.plugin.length;
    }

    @Override
    public boolean isEmpty() {
        return this.plugin.length == 0;
    }

    @Override
    public boolean contains(Object targetObj) {
        return ArrayUtilities.LiteBansModule_31(this.plugin, targetObj);
    }

    public boolean containsAll(@NotNull Collection collection) {
        boolean flag;
        block3: {
            ObjectUtilities.BaseCoreGenericHandler((Object)collection, "elements");
            Iterable iterable = collection;
            if (((Collection)iterable).isEmpty()) {
                flag = true;
            } else {
                Iterator iterator = iterable.iterator();
                while (iterator.hasNext()) {
                    Object t2;
                    Object t3 = t2 = iterator.next();
                    if (this.contains(t3)) continue;
                    flag = false;
                    break block3;
                }
                flag = true;
            }
        }
        return flag;
    }

    @Override
    public Iterator iterator() {
        return ArrayHandler.BaseCoreGenericHandler(this.plugin);
    }

    @Override
    public final Object[] toArray() {
        return CollectionUtilities.BaseCoreGenericHandler(this.plugin, this.c);
    }

    public boolean add(Object targetObj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean remove(Object targetObj) {
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
        return this.plugin();
    }

    public Object[] toArray(Object[] objectArray) {
        ObjectUtilities.BaseCoreGenericHandler((Object)objectArray, "array");
        return CollectionHandler.BaseCoreGenericHandler(this, objectArray);
    }

    private static final void LiteBansModule_31() {
        LiteBansModule_31 = new String[]{"values", "elements", "Operation is not supported for read-only collection", "Operation is not supported for read-only collection", "Operation is not supported for read-only collection", "Operation is not supported for read-only collection", "Operation is not supported for read-only collection", "Operation is not supported for read-only collection", "array"};
    }

    static {
        ValuesHandler.LiteBansModule_31();
    }
}

