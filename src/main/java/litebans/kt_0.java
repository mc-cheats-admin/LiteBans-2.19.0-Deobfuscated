package litebans;

import java.util.Comparator;
import litebans.i_0;
import litebans.ky_0;

static class kt_0
implements Comparator {
    final /* synthetic */ i_0 a;

    kt_0(i_0 i_02) {
        this.a = i_02;
    }

    public int a(ky_0 ky_02, ky_0 ky_03) {
        if (ky_02.c() == null || ky_03.c() == null) {
            return Integer.MAX_VALUE;
        }
        return ky_02.c().compareTo(ky_03.c());
    }

    public int compare(Object object, Object object2) {
        return this.a((ky_0)object, (ky_0)object2);
    }
}

