package litebans;

import java.util.Iterator;
import java.util.NoSuchElementException;
import litebans.as_0;
import litebans.bz;
import litebans.dG;
import litebans.eI;
import litebans.ee_0;
import litebans.ew;
import litebans.hl;
import litebans.jT;

public static final class j_
implements Iterator,
dG {
    private int f = -1;
    private int d;
    private int c;
    private eI g;
    private int a;
    final /* synthetic */ ee_0 b;
    private static /* synthetic */ String[] e;

    j_(ee_0 ee_02) {
        this.b = ee_02;
        this.c = this.d = as_0.a(ee_0.a(ee_02), 0, ee_0.c(ee_02).length());
    }

    /*
     * Unable to fully structure code
     */
    private final void c() {
        block5: {
            block6: {
                block4: {
                    if (this.c >= 0) break block4;
                    this.f = 0;
                    this.g = null;
                    break block5;
                }
                if (ee_0.d(this.b) <= 0) break block6;
                ++this.a;
                if (this.a >= ee_0.d(this.b)) ** GOTO lbl-1000
            }
            if (this.c > ee_0.c(this.b).length()) lbl-1000:
            // 2 sources

            {
                this.g = new eI(this.d, bz.a(ee_0.c(this.b)));
                this.c = -1;
            } else {
                var1_1 = (jT)ee_0.b(this.b).a(ee_0.c(this.b), this.c);
                if (var1_1 == null) {
                    this.g = new eI(this.d, bz.a(ee_0.c(this.b)));
                    this.c = -1;
                } else {
                    var2_2 = ((Number)var1_1.a()).intValue();
                    var3_3 = ((Number)var1_1.c()).intValue();
                    this.g = as_0.b(this.d, var2_2);
                    this.d = var2_2 + var3_3;
                    this.c = this.d + (var3_3 == 0 ? 1 : 0);
                }
            }
            this.f = 1;
        }
    }

    public eI a() {
        if (this.f == -1) {
            this.c();
        }
        if (this.f == 0) {
            throw new NoSuchElementException();
        }
        eI eI2 = this.g;
        ew.b(eI2, e[0]);
        eI eI3 = eI2;
        this.g = null;
        this.f = -1;
        return eI3;
    }

    @Override
    public boolean hasNext() {
        if (this.f == -1) {
            this.c();
        }
        return this.f == 1;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException(e[1]);
    }

    public Object next() {
        return this.a();
    }

    private static final void b() {
        e = new String[]{hl.a("", -1491610173), hl.a("\u34ef\u34d0\u34c5\u34d2\u34c1\u34d4\u34c9\u34cf\u34ce\u3480\u34c9\u34d3\u3480\u34ce\u34cf\u34d4\u3480\u34d3\u34d5\u34d0\u34d0\u34cf\u34d2\u34d4\u34c5\u34c4\u3480\u34c6\u34cf\u34d2\u3480\u34d2\u34c5\u34c1\u34c4\u348d\u34cf\u34ce\u34cc\u34d9\u3480\u34c3\u34cf\u34cc\u34cc\u34c5\u34c3\u34d4\u34c9\u34cf\u34ce", -241421152)};
    }

    static {
        j_.b();
    }
}

