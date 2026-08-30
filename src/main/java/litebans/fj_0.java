package litebans;

import litebans.aJ;
import litebans.a_;
import litebans.as;
import litebans.e3;
import litebans.h2;
import litebans.ij;
import litebans.x_0;
import org.jetbrains.annotations.NotNull;

public final class fj_0 {
    private fj_0() {
    }

    public final ij a(int n) {
        ij[] ijArray = ij.e();
        return ijArray.length <= n ? null : ijArray[n];
    }

    public final ij a(@NotNull a_ a_2) {
        ij ij2;
        switch (h2.a[a_2.ordinal()]) {
            case 1: {
                ij2 = ij.w;
                break;
            }
            case 2: {
                ij2 = ij.u;
                break;
            }
            case 3: {
                ij2 = ij.x;
                break;
            }
            case 4: {
                ij2 = ij.j;
                break;
            }
            case 5: {
                ij2 = ij.s;
                break;
            }
            case 6: {
                ij2 = ij.f;
                break;
            }
            case 7: {
                x_0.a();
                throw new as();
            }
            default: {
                throw new e3();
            }
        }
        return ij2;
    }

    public /* synthetic */ fj_0(aJ aJ2) {
        this();
    }
}

