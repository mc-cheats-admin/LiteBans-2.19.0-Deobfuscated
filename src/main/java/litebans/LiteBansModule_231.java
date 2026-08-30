package litebans;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import org.jetbrains.annotations.Nullable;

public abstract class LiteBansModule_231
extends ElementsHandler_4
implements List,
LiteBansModule_123 {
    public static final OtherHandler LiteBansModule_31;
    private static final int c;
        protected LiteBansModule_231() {
    }

    @Override
    public abstract int BaseCoreGenericHandler();

    public abstract Object get(int var1);

    @Override
    public Iterator iterator() {
        return new LiteBansModule_93(this);
    }

    @Override
    public int indexOf(Object targetObj) {
        int n;
        block2: {
            List list = this;
            Iterator iterator = list.iterator();
            while (iterator.hasNext()) {
                Object e;
                Object e10 = e = iterator.next();
                if (ObjectUtilities.BaseCoreGenericHandler(e10, targetObj)) {
                    n = n2;
                    break block2;
                }
                ++n2;
            }
            n = -1;
        }
        return n;
    }

    @Override
    public int lastIndexOf(Object targetObj) {
        int n;
        block1: {
            List list = this;
            ListIterator listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                Object e = listIterator.previous();
                if (!ObjectUtilities.BaseCoreGenericHandler(e, targetObj)) continue;
                n = listIterator.nextIndex();
                break block1;
            }
            n = -1;
        }
        return n;
    }

    public ListIterator listIterator() {
        return new LiteBansModule_75(this, 0);
    }

    public ListIterator listIterator(int n) {
        return new LiteBansModule_75(this, n);
    }

    public List subList(int n, int n2) {
        return new ListHandler(this, n, n2);
    }

    @Override
    public boolean equals(@Nullable Object targetObj) {
        if (targetObj == this) {
            return true;
        }
        if (!(targetObj instanceof List)) {
            return false;
        }
        return LiteBansModule_31.BaseCoreGenericHandler(this, (Collection)targetObj);
    }

    @Override
    public int hashCode() {
        return LiteBansModule_31.BaseCoreGenericHandler(this);
    }

    public void add(int n, Object targetObj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(int n, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Object set(int n, Object targetObj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Object remove(int n) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    static {
        c = 0x7FFFFFF7;
        LiteBansModule_231.BaseCoreGenericHandler();
        LiteBansModule_31 = new OtherHandler(null);
    }

    private static final void BaseCoreGenericHandler() {
        AsyncBackgroundTask_5 = new String[]{"Operation is not supported for read-only collection", "Operation is not supported for read-only collection", "Operation is not supported for read-only collection", "Operation is not supported for read-only collection"};
    }
}

