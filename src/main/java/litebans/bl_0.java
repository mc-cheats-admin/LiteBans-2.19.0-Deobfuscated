package litebans;

import java.util.Comparator;
import litebans.i7;
import litebans.j;

/*
 * Renamed from litebans.bl
 */
static class bl_0
implements Comparator {
    final /* synthetic */ j a;

    bl_0(j j10) {
        this.a = j10;
    }

    public int a(i7 i72, i7 i73) {
        Long l3 = i72.a();
        Long l5 = i73.a();
        return l3.compareTo(l5);
    }

    public int compare(Object object, Object object2) {
        return this.a((i7)object, (i7)object2);
    }
}

