package litebans;

import java.util.Comparator;
import litebans.au;
import litebans.cy;
import litebans.dZ;
import litebans.hj_0;

public final class gD
implements Comparator {
    final /* synthetic */ dZ a;

    public gD(dZ dZ2) {
        this.a = dZ2;
    }

    public final int compare(Object object, Object object2) {
        cy cy2 = (cy)object;
        boolean bl = false;
        au au2 = cy2.g();
        cy2 = (cy)object2;
        Comparable comparable = Long.valueOf(au2.a(this.a));
        bl = false;
        au2 = cy2.g();
        return hj_0.a(comparable, Long.valueOf(au2.a(this.a)));
    }
}

