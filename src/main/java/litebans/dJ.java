package litebans;

import java.util.Iterator;
import java.util.NoSuchElementException;
import litebans.b1;
import litebans.dG;
import litebans.ew;
import litebans.hl;

public static final class dJ
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
        throw new UnsupportedOperationException(b[0]);
    }

    public Object next() {
        return this.a();
    }

    private static final void b() {
        b = new String[]{hl.a("\uff45\uff7a\uff6f\uff78\uff6b\uff7e\uff63\uff65\uff64\uff2a\uff63\uff79\uff2a\uff64\uff65\uff7e\uff2a\uff79\uff7f\uff7a\uff7a\uff65\uff78\uff7e\uff6f\uff6e\uff2a\uff6c\uff65\uff78\uff2a\uff78\uff6f\uff6b\uff6e\uff27\uff65\uff64\uff66\uff73\uff2a\uff69\uff65\uff66\uff66\uff6f\uff69\uff7e\uff63\uff65\uff64", -1016660214)};
    }

    static {
        dJ.b();
    }
}

