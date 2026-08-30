package litebans;

import java.util.Iterator;
import java.util.NoSuchElementException;
import litebans.gk;

static class iP
implements Iterator {
    private int a;
    final /* synthetic */ gk b;

    iP(gk gk2) {
        this.b = gk2;
    }

    @Override
    public boolean hasNext() {
        return this.a < gk.b(this.b);
    }

    public Object next() {
        if (this.a < gk.b(this.b)) {
            return gk.a(this.b)[this.a++];
        }
        throw new NoSuchElementException("No more elements in FastList");
    }
}

