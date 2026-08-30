package litebans;

import java.util.Iterator;
import java.util.NoSuchElementException;
import litebans.dG;
import litebans.ew;
import litebans.hl;
import org.jetbrains.annotations.NotNull;

static final class g7
implements Iterator,
dG {
    private final Object[] b;
    private int c;
    private static /* synthetic */ String[] a;

    public g7(@NotNull Object[] objectArray) {
        ew.a((Object)objectArray, "array");
        this.b = objectArray;
    }

    @Override
    public boolean hasNext() {
        return this.c < this.b.length;
    }

    public Object next() {
        Object object;
        try {
            int n = this.c;
            this.c = n + 1;
            object = this.b[n];
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

    private static final void a() {
        a = new String[]{"array", "Operation is not supported for read-only collection"};
    }

    static {
        g7.a();
    }
}

