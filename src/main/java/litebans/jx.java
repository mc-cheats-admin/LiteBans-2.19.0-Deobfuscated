package litebans;

import java.util.Comparator;
import litebans.a_;
import litebans.b3;
import litebans.cy;
import litebans.hj_0;

public static final class jx
implements Comparator {
    final /* synthetic */ a_ a;

    public jx(a_ a_2) {
        this.a = a_2;
    }

    public final int compare(Object object, Object object2) {
        cy cy2 = (cy)object2;
        boolean bl = false;
        b3 b32 = cy2.d();
        cy2 = (cy)object;
        Comparable comparable = Long.valueOf(b32.a(this.a));
        bl = false;
        b32 = cy2.d();
        return hj_0.a(comparable, Long.valueOf(b32.a(this.a)));
    }
}

