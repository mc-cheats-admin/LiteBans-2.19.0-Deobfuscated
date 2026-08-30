package litebans;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import org.jetbrains.annotations.Nullable;

public abstract class LiteBansModule_230
extends ElementsHandler_4
implements List,
LiteBansModule_122 {
    public static final OtherHandler LiteBansModule_31;
    private static final int c;
    protected LiteBansModule_230() {
    }

    @Override
    public abstract int BaseCoreGenericHandler();

    public abstract Object get(int var1);

    @Override
    public Iterator iterator() {
        return new LiteBansModule_92(this);
    }

    @Override
    public int indexOf(Object object) {
        int n;
{
            List list = this;
            Iterator iterator = list.iterator();
            while (iterator.hasNext()) {
                Object e;
                Object e10 = e = iterator.next();
                if (ObjectUtilities.BaseCoreGenericHandler(e10, object)) {
                    n = n2;
                    break;
                }
                ++n2;
            }
            n = -1;
        }
        return n;
    }

    @Override
    public int lastIndexOf(Object object) {
        int n;
{
            List list = this;
            ListIterator listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                Object e = listIterator.previous();
                if (!ObjectUtilities.BaseCoreGenericHandler(e, object)) continue;
                n = listIterator.nextIndex();
                break;
            }
            n = -1;
        }
        return n;
    }

    public ListIterator listIterator() {
        return new LiteBansModule_74(this, 0);
    }

    public ListIterator listIterator(int n) {
        return new LiteBansModule_74(this, n);
    }

    public List subList(int n, int n2) {
        return new ListHandler(this, n, n2);
    }

    @Override
    public boolean equals(@Nullable Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof List)) {
            return false;
        }
        return LiteBansModule_31.BaseCoreGenericHandler(this, (Collection)object);
    }

    @Override
    public int hashCode() {
        return LiteBansModule_31.BaseCoreGenericHandler(this);
    }

    public void add(int n, Object object) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(int n, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Object set(int n, Object object) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Object remove(int n) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    static {
        c = 0x7FFFFFF7;
        LiteBansModule_230.BaseCoreGenericHandler();
        LiteBansModule_31 = new OtherHandler(null);
    }

    private static final void BaseCoreGenericHandler() {
        AsyncBackgroundTask_5 = new String[]{"Operation is not supported for read-only collection", "Operation is not supported for read-only collection", "Operation is not supported for read-only collection", "Operation is not supported for read-only collection"};
}

