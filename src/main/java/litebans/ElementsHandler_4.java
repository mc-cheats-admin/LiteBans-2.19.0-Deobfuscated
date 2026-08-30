package litebans;

import java.util.Collection;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

public abstract class ElementsHandler_4
implements Collection,
LiteBansModule_122 {
    protected ElementsHandler_4() {
    }

    public abstract int BaseCoreGenericHandler();

    @Override
    public abstract Iterator iterator();

    @Override
    public boolean contains(Object targetObj) {
        boolean flag;
{
            Iterable iterable = this;
            if (iterable instanceof Collection && ((Collection)iterable).isEmpty()) {
                flag = false;
            } else {
                Iterator iterator = iterable.iterator();
                while (iterator.hasNext()) {
                    Object t2;
                    Object t3 = t2 = iterator.next();
                    if (!ObjectUtilities.BaseCoreGenericHandler(t3, targetObj)) continue;
                    flag = true;
                    break;
                }
                flag = false;
}
        return flag;
    }

    public boolean containsAll(@NotNull Collection collection) {
        boolean flag;
{
            ObjectUtilities.BaseCoreGenericHandler(collection, "elements");
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
                    break;
                }
                flag = true;
}
        return flag;
    }

    @Override
    public boolean isEmpty() {
        return this.size() == 0;
    }

    public String toString() {
        return CollectionUtilities.BaseCoreGenericHandler(this, ", ", "[", "]", 0, null, arg_0 -> ElementsHandler_4.BaseCoreGenericHandler(this, arg_0), 24, null);
    }

    @Override
    public Object[] toArray() {
        return CollectionHandler.BaseCoreGenericHandler(this);
    }

    public Object[] toArray(@NotNull Object[] objectArray) {
        ObjectUtilities.BaseCoreGenericHandler(objectArray, "array");
        return CollectionHandler.BaseCoreGenericHandler(this, objectArray);
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

    private static final CharSequence BaseCoreGenericHandler(ElementsHandler_4 gb_02, Object targetObj) {
        return targetObj == gb_02 ? (CharSequence)"(this Collection)" : String.valueOf(targetObj);
    }

    @Override
    public final int size() {
        return this.plugin();
    }

    private static final void LiteBansModule_31() {
        BaseCoreGenericHandler = new String[]{"elements", ", ", "[", "]", "array", "Operation is not supported for read-only collection", "Operation is not supported for read-only collection", "Operation is not supported for read-only collection", "Operation is not supported for read-only collection", "Operation is not supported for read-only collection", "Operation is not supported for read-only collection", "(this Collection)"};
}

