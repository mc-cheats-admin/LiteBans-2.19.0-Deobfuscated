package litebans;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import litebans.ew;
import litebans.hl;
import litebans.i_;
import org.jetbrains.annotations.NotNull;

public final class eH
implements i_ {
    private final AtomicReference a;
    private static /* synthetic */ String[] b;

    public eH(@NotNull i_ i_2) {
        ew.a((Object)i_2, "sequence");
        this.a = new AtomicReference<i_>(i_2);
    }

    @Override
    public Iterator a() {
        i_ i_2 = this.a.getAndSet(null);
        if (i_2 == null) {
            throw new IllegalStateException("This sequence can be consumed only ");
        }
        i_ i_3 = i_2;
        return i_3.a();
    }

    private static final void a() {
        b = new String[]{"sequence", "This sequence can be consumed only once."};
    }

    static {
        eH.a();
    }
}

