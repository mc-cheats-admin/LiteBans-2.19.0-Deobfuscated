package litebans;

import java.util.ArrayList;
import java.util.List;
import litebans.i7;
import litebans.jt_0;
import litebans.lG;

public static class dT
implements lG {
    private final boolean ap;
    private List ao;

    public dT(byte[] byArray) {
        int n = 0;
        this.ao = new ArrayList();
        for (int i = 0; i < 21; ++i) {
            i7 i72 = jt_0.b(byArray, n + i * 24);
            if (i72.a() <= 0L && i72.b() <= 0L) continue;
            this.ao.add(i72);
        }
        this.ap = jt_0.a(byArray, n += 504);
    }

    public boolean b() {
        return this.ap;
    }

    public List a() {
        return this.ao;
    }
}

