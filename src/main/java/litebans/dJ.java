package litebans;

import java.util.Iterator;
import java.util.NoSuchElementException;
import litebans.b1;
import litebans.dG;
import litebans.ew;
import litebans.hl;

public final class dJ
implements Iterator,
dG {
    private String a;
    private boolean d;
    final /* synthetic */ b1 c;
    private static /* synthetic */ String[] b;

    dJ(b1 b12) {
        this.c = b12;
    }

    @Override
    public boolean hasNext() {
        if (this.a == null && !this.d) {
            this.a = b1.a(this.c).readLine();
            if (this.a == null) {
                this.d = true;
            }
        }
        return this.a != null;
    }

    public String a() {
        if (!this.hasNext()) {
            throw new NoSuchElementException();
        }
        String string = this.a;
        this.a = null;
        String string2 = string;
        ew.a((Object)string2);
        return string2;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Object next() {
        return this.a();
    }

    private static final void b() {
        b = new String[]{"Operation is not supported for read-only collection"};
    }

    static {
        dJ.b();
    }
}

