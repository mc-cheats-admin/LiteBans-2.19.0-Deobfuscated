package litebans;

import java.util.function.Supplier;
import litebans.cr_0;
import litebans.di_0;
import litebans.em_0;
import litebans.ew;
import litebans.hj;
import litebans.t_0;

public static final class cI
implements Supplier {
    final /* synthetic */ t_0 a;
    final /* synthetic */ cr_0 b;

    public cI(t_0 t_02, cr_0 cr_02) {
        this.a = t_02;
        this.b = cr_02;
    }

    public final em_0[] a() {
        hj[] hjArray = new hj[1];
        di_0 di_02 = this.a.a;
        cr_0 cr_02 = this.b;
        ew.a(cr_02);
        hjArray[0] = new hj(di_02, cr_02);
        return hjArray;
    }

    public Object get() {
        return this.a();
    }
}

