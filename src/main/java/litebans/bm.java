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
        ew.a((Object)e02, a[0]);
        return new in(e02, null, 2, null);
    }

    public static final eE a(@NotNull l4 l42, @NotNull e0 e02) {
        eE eE2;
        ew.a((Object)l42, a[1]);
        ew.a((Object)e02, a[2]);
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
        a = new String[]{hl.a("\u59c0\u59c7\u59c0\u59dd\u59c0\u59c8\u59c5\u59c0\u59d3\u59cc\u59db", -1784718935), hl.a("\u9e4f\u9e4d\u9e46\u9e47", -432562654), hl.a("\u1270\u1277\u1270\u126d\u1270\u1278\u1275\u1270\u1263\u127c\u126b", 718606873), hl.a("\u5ca9\u5cae\u5ca9\u5cb4\u5ca9\u5ca1\u5cac\u5ca9\u5cba\u5ca5\u5cb2", 644570304)};
    }

    static {
        bm.a();
    }
}

