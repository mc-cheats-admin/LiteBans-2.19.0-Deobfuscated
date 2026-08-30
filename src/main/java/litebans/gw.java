package litebans;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;
import litebans.a_;
import litebans.aa_0;
import litebans.am;
import litebans.ch;
import litebans.dZ;
import litebans.di_0;
import litebans.ew;
import litebans.fg_0;
import litebans.h1;
import litebans.hd_0;
import litebans.hl;
import litebans.iX;
import litebans.iv_0;
import litebans.q_0;
import litebans.w;
import org.jetbrains.annotations.NotNull;

public final class gw
extends fg_0 {
    private final String[] e;
    private static /* synthetic */ String[] d;

    public gw(@NotNull String[] stringArray, @NotNull di_0 di_02) {
        super(di_02);
        this.e = stringArray;
    }

    @Override
    public void run() {
        Object object;
        a_ a_22;
        int n;
        iX iX2;
        block2: {
            iX2 = new iX(0L, 1, null);
            a_[] a_Array = a_.values();
            n = 0;
            for (a_ a_22 : a_Array) {
                object = a_22;
                boolean bl = false;
                if (!ew.a((Object)((Enum)object).name(), (Object)this.e[1])) {
                    continue;
                }
                break block2;
            }
            throw new NoSuchElementException("Array contains no element matching the ");
        }
        a_ a_3 = a_22;
        int n2 = Integer.parseInt(this.e[2]);
        n = Integer.parseInt(this.e[3]);
        int n3 = Integer.parseInt(this.e[4]);
        int n4 = 15;
        int n5 = 40;
        object = new ArrayList(n2);
        List list = new ArrayList(n2);
        fg_0 fg_02 = this;
        boolean bl = false;
        ((w)fg_02.h().a(w.class)).a(arg_0 -> gw.a(this, n2, (List)object, iX2, n5, n, n3, n4, a_3, list, arg_0));
    }

    private static final iv_0 a(gw gw2, int n, List list, iX iX2, int n2, int n3, int n4, int n5, a_ a_2, List list2, ch ch2) {
        boolean bl;
        boolean bl2;
        Object object;
        int n6;
        if (ch2.b()) {
            aa_0.a((fg_0)gw2, am.aX);
            return iv_0.a;
        }
        for (int i = 0; i < n; ++i) {
            list.add(new UUID(iX2.b(), iX2.b()).toString());
        }
        aa_0.a((fg_0)gw2, (CharSequence)h1.a(hd_0.i, "Generating entries.. + "));
        long l3 = w.a(ch2.d(), false, 1, null);
        for (n6 = 0; n6 < n; ++n6) {
            object = (String)list.get(n6);
            bl2 = iX2.a(100) < n2;
            boolean bl3 = iX2.a(100) < n3;
            boolean bl4 = bl3 && n4 > 0 && iX2.a(100) < n4;
            boolean bl5 = iX2.a(100) < n5;
            bl = !bl5;
            long l5 = 0L;
            if (bl2) {
                l5 = 0L;
            } else {
                l5 = l3 + (long)300000000 + (long)iX2.a(1000000000);
                if (bl5) {
                    l5 = l3 - (long)iX2.a(10000000);
                }
            }
            int n7 = iX2.a(252) + 2;
            int n8 = iX2.a(252) + 2;
            int n9 = iX2.a(252) + 2;
            String string = String.valueOf(iX2.a(252) + 2);
            if (bl3 && bl4) {
                string = "%";
            }
            String string2 = "" + n7 + '.' + n8 + '.' + n9 + '.' + string;
            dZ dZ2 = new dZ(a_2, (String)object, string2, "", "", "", "*", "", l3, l5, 0, false, bl3, bl, 0L, 17408, null);
            list2.add(dZ2);
        }
        aa_0.a((fg_0)gw2, (CharSequence)h1.a(hd_0.i, "Adding entries.. + "));
        object = gw2;
        bl2 = false;
        n6 = ((q_0)((fg_0)object).h().a(q_0.class)).a();
        object = gw2;
        bl2 = false;
        ((q_0)((fg_0)object).h().a(q_0.class)).a((byte)0);
        object = list2;
        bl2 = false;
        Iterator iterator = object.iterator();
        while (iterator.hasNext()) {
            Object t2 = iterator.next();
            dZ dZ3 = (dZ)t2;
            bl = false;
            ch2.c(dZ3);
        }
        object = gw2;
        bl2 = false;
        ((q_0)((fg_0)object).h().a(q_0.class)).a((byte)n6);
        long l7 = w.a(ch2.d(), false, 1, null);
        aa_0.a((fg_0)gw2, (CharSequence)(h1.a(hd_0.i, "Done in ") + (l7 - l3) + " "));
        return iv_0.a;
    }

    private static final void a() {
        d = new String[]{"Array contains no element matching the ", "Generating entries.. + ", "%", "", "", "", "*", "", "Adding entries.. + ", "Done in ", " ms."};
    }

    static {
        gw.a();
    }
}

