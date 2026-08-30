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
        ew.a((Object)objectArray, a[0]);
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
        throw new UnsupportedOperationException(a[1]);
    }

    private static final void a() {
        a = new String[]{hl.a("\u75d8\u75cb\u75cb\u75d8\u75c0", -512789063), hl.a("\uee78\uee47\uee52\uee45\uee56\uee43\uee5e\uee58\uee59\uee17\uee5e\uee44\uee17\uee59\uee58\uee43\uee17\uee44\uee42\uee47\uee47\uee58\uee45\uee43\uee52\uee53\uee17\uee51\uee58\uee45\uee17\uee45\uee52\uee56\uee53\uee1a\uee58\uee59\uee5b\uee4e\uee17\uee54\uee58\uee5b\uee5b\uee52\uee54\uee43\uee5e\uee58\uee59", -642191817)};
    }

    static {
        g7.a();
    }
}

