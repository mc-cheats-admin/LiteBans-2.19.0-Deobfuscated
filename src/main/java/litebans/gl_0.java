package litebans;

import litebans.aR;
import litebans.bz;
import litebans.hl;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from litebans.gL
 */
public static final class gl_0 {
    private static /* synthetic */ String[] a;

    public static final String c(@NotNull CharSequence charSequence) {
        CharSequence[] charSequenceArray = new CharSequence[]{charSequence};
        boolean bl = false;
        CharSequence[] charSequenceArray2 = charSequenceArray;
        boolean bl2 = false;
        int n = charSequenceArray2.length;
        for (int i = 0; i < n; ++i) {
            CharSequence charSequence2;
            CharSequence charSequence3 = charSequence2 = charSequenceArray2[i];
            boolean bl3 = false;
            if (charSequence3.length() > 0) continue;
            String string = a[2];
            throw new IllegalArgumentException(string.toString());
        }
        return aR.e(charSequence + a[3]);
    }

    public static final void a(@NotNull CharSequence charSequence) {
        if (!(!bz.c(charSequence, ' ', false, 2, null) && !bz.c(charSequence, '=', false, 2, null) && !bz.c(charSequence, '>', false, 2, null) && !bz.c(charSequence, '<', false, 2, null) && !bz.c(charSequence, ',', false, 2, null))) {
            String string = a[5];
            throw new IllegalArgumentException(string.toString());
        }
    }

    public static final void b(@NotNull CharSequence charSequence) {
        if (!bz.c(charSequence, ' ', false, 2, null)) {
            String string = a[7];
            throw new IllegalArgumentException(string.toString());
        }
    }

    public static final void d(@NotNull CharSequence charSequence) {
        if (!bz.c(charSequence, '=', false, 2, null)) {
            String string = a[8];
            throw new IllegalArgumentException(string.toString());
        }
    }

    private static final void a() {
        a = new String[]{hl.a("\u0fea\u0fcd\u0fc5\u0fc0\u0fc9\u0fc8\u0f8c\u0fde\u0fc9\u0fdd\u0fd9\u0fc5\u0fde\u0fc9\u0fc1\u0fc9\u0fc2\u0fd8\u0f82", -355725396), hl.a("\u9e14\u9e52\u9e5d\u9e5b\u9e5c\u9e4c\u9e54", -631267799), hl.a("\u87c4\u87e3\u87eb\u87ee\u87e7\u87e6\u87a2\u87f0\u87e7\u87f3\u87f7\u87eb\u87f0\u87e7\u87ef\u87e7\u87ec\u87f6\u87ac", 2084407170), hl.a("\u6653\u6615\u6608\u660f\u6602\u661d\u660b\u6613", 16868974), hl.a("\u279f\u27b8\u27b0\u27b5\u27bc\u27bd\u27f9\u27ab\u27bc\u27a8\u27ac\u27b0\u27ab\u27bc\u27b4\u27bc\u27b7\u27ad\u27f7", -1502271527), hl.a("\ue109\ue12e\ue126\ue123\ue12a\ue12b\ue16f\ue13d\ue12a\ue13e\ue13a\ue126\ue13d\ue12a\ue122\ue12a\ue121\ue13b\ue161", -938286769), hl.a("\uf34f\uf368\uf360\uf365\uf36c\uf36d\uf329\uf37b\uf36c\uf378\uf37c\uf360\uf37b\uf36c\uf364\uf36c\uf367\uf37d\uf327", -260050167), hl.a("\uf8e2\uf8c5\uf8cd\uf8c8\uf8c1\uf8c0\uf884\uf8d6\uf8c1\uf8d5\uf8d1\uf8cd\uf8d6\uf8c1\uf8c9\uf8c1\uf8ca\uf8d0\uf88a", 44955812), hl.a("\u8f9a\u8fbd\u8fb5\u8fb0\u8fb9\u8fb8\u8ffc\u8fae\u8fb9\u8fad\u8fa9\u8fb5\u8fae\u8fb9\u8fb1\u8fb9\u8fb2\u8fa8\u8ff2", -423915556)};
    }

    static {
        gl_0.a();
    }
}

