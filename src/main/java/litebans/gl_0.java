package litebans;

import litebans.aR;
import litebans.bz;
import litebans.hl;
import org.jetbrains.annotations.NotNull;

public final class gl_0 {
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
        a = new String[]{"Failed ", "={true}", "Failed ", "={false}", "Failed ", "Failed ", "Failed ", "Failed ", "Failed requirement."};
    }

    static {
        gl_0.a();
    }
}

