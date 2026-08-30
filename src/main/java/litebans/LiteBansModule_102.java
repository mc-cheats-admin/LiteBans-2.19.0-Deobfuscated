package litebans;

import java.util.Collection;
import org.jetbrains.annotations.NotNull;

public final class LiteBansModule_102 {
    private LiteBansModule_102() {
    }

    public final LiteBansModule_356 BaseCoreGenericHandler() {
        return LiteBansModule_343.AsyncBackgroundTask_5();
    }

    public final LiteBansModule_356 BaseCoreGenericHandler(@NotNull byte[] byArray, int n, int n2, @NotNull SortHandler br2, boolean flag) {
        int n3 = byArray.length - n;
        int n4 = flag ? Math.min(1600, Math.min(byArray.length / 2, n3)) : n3;
        while (n5 < n4) {
            short s2;
            boolean flag2;
            int n6;
            block4: {
                n6 = n5++;
                Iterable iterable = br2.LiteBansModule_403();
                if (iterable instanceof Collection && ((Collection)iterable).isEmpty()) {
                    flag2 = false;
                } else {
                    for (Object t2 : iterable) {
                        LiteBansModule_343 jg_02 = (LiteBansModule_343)t2;
                        if (!jg_02.BaseCoreGenericHandler(byArray, n6, n6 + n)) continue;
                        flag2 = true;
                        break block4;
                    }
                    flag2 = false;
                }
            }
            if (flag2 || ((s2 = this.plugin(byArray, n4, n6, n, n2, flag)) & 0xFFFF) <= n2) continue;
            return this.plugin(n, byArray, n6, s2);
        }
        return this.plugin();
    }

    private final LiteBansModule_356 BaseCoreGenericHandler(int n, byte[] byArray, int n2, short s2) {
        byte[] byArray2 = new byte[n];
        System.arraycopy(byArray, n2, byArray2, 0, n);
        return LiteBansModule_373.BaseCoreGenericHandler(LiteBansModule_194.AsyncBackgroundTask_5(s2), byArray2);
    }

    private final short BaseCoreGenericHandler(byte[] byArray, int n, int n2, int n3, int n4, boolean flag) {
        short s2 = 0;
        s2 = 0;
        n5 = Integer.MIN_VALUE;
        int n6 = flag ? 568 : Integer.MAX_VALUE;
        byte[] byArray2 = byArray;
        for (byte by2 : byArray2) {
            int n8 = n7++;
            byte by3 = by2;
            int n9 = n8;
            if (n9 > n6 && (s2 & 0xFFFF) < n4) {
                return s2;
            }
            boolean flag4 = n5 <= n9 ? n9 < n : false;
            if (!flag4 || !LiteBansModule_391.BaseCoreGenericHandler(byArray, byArray, n2, n9, n9 + n3)) continue;
            n5 = n9 + n3;
            s2 = LiteBansModule_194.BaseCoreGenericHandler((short)(s2 + 1));
        }
        return s2;
    }

    public /* synthetic */ LiteBansModule_102(LiteBansModule_14 aJ2) {
        this();
    }
}

