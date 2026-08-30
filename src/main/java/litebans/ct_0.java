package litebans;

import java.util.Collection;
import litebans.aJ;
import litebans.br;
import litebans.ez_0;
import litebans.jT;
import litebans.jg_0;
import litebans.kc_0;
import litebans.kq_0;
import org.jetbrains.annotations.NotNull;

public final class ct_0 {
    private ct_0() {
    }

    public final jT a() {
        return jg_0.d();
    }

    public final jT a(@NotNull byte[] byArray, int n, int n2, @NotNull br br2, boolean bl) {
        int n3 = byArray.length - n;
        int n4 = bl ? Math.min(1600, Math.min(byArray.length / 2, n3)) : n3;
        int n5 = 0;
        while (n5 < n4) {
            short s2;
            boolean bl2;
            int n6;
            block4: {
                n6 = n5++;
                Iterable iterable = br2.l();
                boolean bl3 = false;
                if (iterable instanceof Collection && ((Collection)iterable).isEmpty()) {
                    bl2 = false;
                } else {
                    for (Object t2 : iterable) {
                        jg_0 jg_02 = (jg_0)t2;
                        boolean bl4 = false;
                        if (!jg_02.a(byArray, n6, n6 + n)) continue;
                        bl2 = true;
                        break block4;
                    }
                    bl2 = false;
                }
            }
            if (bl2 || ((s2 = this.a(byArray, n4, n6, n, n2, bl)) & 0xFFFF) <= n2) continue;
            return this.a(n, byArray, n6, s2);
        }
        return this.a();
    }

    private final jT a(int n, byte[] byArray, int n2, short s2) {
        byte[] byArray2 = new byte[n];
        System.arraycopy(byArray, n2, byArray2, 0, n);
        return kc_0.a(ez_0.d(s2), byArray2);
    }

    private final short a(byte[] byArray, int n, int n2, int n3, int n4, boolean bl) {
        short s2 = 0;
        s2 = 0;
        int n5 = 0;
        n5 = Integer.MIN_VALUE;
        int n6 = bl ? 568 : Integer.MAX_VALUE;
        byte[] byArray2 = byArray;
        boolean bl2 = false;
        int n7 = 0;
        for (byte by2 : byArray2) {
            int n8 = n7++;
            byte by3 = by2;
            int n9 = n8;
            boolean bl3 = false;
            if (n9 > n6 && (s2 & 0xFFFF) < n4) {
                return s2;
            }
            boolean bl4 = n5 <= n9 ? n9 < n : false;
            if (!bl4 || !kq_0.a(byArray, byArray, n2, n9, n9 + n3)) continue;
            n5 = n9 + n3;
            s2 = ez_0.a((short)(s2 + 1));
        }
        return s2;
    }

    public /* synthetic */ ct_0(aJ aJ2) {
        this();
    }
}

