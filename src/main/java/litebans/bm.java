package litebans;

import litebans.e0;
import litebans.e3;
import litebans.eE;
import litebans.ew;
import litebans.hl;
import litebans.iH;
import litebans.in;
import litebans.jk;
import litebans.jx_0;
import litebans.l4;
import org.jetbrains.annotations.NotNull;

static class bm {
    private static /* synthetic */ String[] a;

    public static final eE a(@NotNull e0 e02) {
        ew.a((Object)e02, "initializer");
        return new in(e02, null, 2, null);
    }

    public static final eE a(@NotNull l4 l42, @NotNull e0 e02) {
        eE eE2;
        ew.a((Object)l42, "mode");
        ew.a((Object)e02, "initializer");
        switch (jk.a[l42.ordinal()]) {
            case 1: {
                eE2 = new in(e02, null, 2, null);
                break;
            }
            case 2: {
                eE2 = new jx_0(e02);
                break;
            }
            case 3: {
                eE2 = new iH(e02);
                break;
            }
            default: {
                throw new e3();
            }
        }
        return eE2;
    }

    private static final void a() {
        a = new String[]{"initializer", "mode", "initializer", "initializer"};
    }

    static {
        bm.a();
    }
}

