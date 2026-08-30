package litebans;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import litebans.ew;
import litebans.hl;
import litebans.i_;
import org.jetbrains.annotations.NotNull;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public static final class eH
implements i_ {
    private final AtomicReference a;
    private static /* synthetic */ String[] b;

    public eH(@NotNull i_ i_2) {
        ew.a((Object)i_2, b[0]);
        this.a = new AtomicReference<i_>(i_2);
    }

    @Override
    public Iterator a() {
        i_ i_2 = this.a.getAndSet(null);
        if (i_2 == null) {
            throw new IllegalStateException(b[1]);
        }
        i_ i_3 = i_2;
        return i_3.a();
    }

    private static final void a() {
        b = new String[]{hl.a("\u65c0\u65d6\u65c2\u65c6\u65d6\u65dd\u65d0\u65d6", -1042913869), hl.a("\u298d\u29b1\u29b0\u29aa\u29f9\u29aa\u29bc\u29a8\u29ac\u29bc\u29b7\u29ba\u29bc\u29f9\u29ba\u29b8\u29b7\u29f9\u29bb\u29bc\u29f9\u29ba\u29b6\u29b7\u29aa\u29ac\u29b4\u29bc\u29bd\u29f9\u29b6\u29b7\u29b5\u29a0\u29f9\u29b6\u29b7\u29ba\u29bc\u29f7", 408365529)};
    }

    static {
        eH.a();
    }
}

