package litebans;

import java.util.Iterator;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;

static final class ArrayHandler_2
implements Iterator,
LiteBansModule_122 {
    private final Object[] LiteBansModule_31;
    private int c;
    public ArrayHandler_2(@NotNull Object[] objectArray) {
        ObjectUtilities.BaseCoreGenericHandler((Object)objectArray, "array");
        this.LiteBansModule_31 = objectArray;
    }

    @Override
    public boolean hasNext() {
        return this.c < this.LiteBansModule_31.length;
    }

    public Object next() {
        Object object;
        try {
            int n = this.c;
            this.c = n + 1;
            object = this.LiteBansModule_31[n];
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            --this.c;
            throw new NoSuchElementException(arrayIndexOutOfBoundsException.getMessage());
        }
        return object;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    private static final void BaseCoreGenericHandler() {
        BaseCoreGenericHandler = new String[]{"array", "Operation is not supported for read-only collection"};
}

