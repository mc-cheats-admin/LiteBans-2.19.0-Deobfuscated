package litebans;

import java.io.BufferedReader;
import java.util.Iterator;
import litebans.dJ;
import litebans.ew;
import litebans.hl;
import litebans.i_;
import org.jetbrains.annotations.NotNull;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
static final class b1
implements i_ {
    private final BufferedReader a;
    private static /* synthetic */ String[] b;

    public b1(@NotNull BufferedReader bufferedReader) {
        ew.a((Object)bufferedReader, b[0]);
        this.a = bufferedReader;
    }

    @Override
    public Iterator a() {
        return new dJ(this);
    }

    public static final /* synthetic */ BufferedReader a(b1 b12) {
        return b12.a;
    }

    private static final void a() {
        b = new String[]{hl.a("\u03a7\u03b0\u03b4\u03b1\u03b0\u03a7", 2019230677)};
    }

    static {
        b1.a();
    }
}

