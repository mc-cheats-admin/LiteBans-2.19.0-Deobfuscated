package litebans;

import litebans.eo_0;
import litebans.ew;
import litebans.hl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

static class a3 {
    private static /* synthetic */ String[] a;

    public static final void a(@NotNull Appendable appendable, Object object, @Nullable eo_0 eo_02) {
        Appendable appendable2;
        ew.a((Object)appendable, a[8]);
        eo_0 eo_03 = eo_02;
        if (eo_03 != null) {
            appendable2 = appendable.append((CharSequence)eo_03.a(object));
        } else {
            Object object2 = object;
            appendable2 = (object2 == null ? true : object2 instanceof CharSequence) ? appendable.append((CharSequence)object) : (object instanceof Character ? appendable.append(((Character)object).charValue()) : appendable.append(object.toString()));
        }
    }

    private static final void a() {
        a = new String[]{hl.a("\ud44d\ud405\ud419\ud418\ud402\ud44f", -768551823), hl.a("\ua103\ua114\ua119\ua100\ua110", -1089560203), hl.a("", -2114283999), hl.a("\ufaec\ufaa4\ufab8\ufab9\ufaa3\ufaee", 889518800), hl.a("\u6322\u6335\u6338\u6321\u6331", -44539052), hl.a("\uc6be\uc6f6\uc6ea\uc6eb\uc6f1\uc6bc", -2042378622), hl.a("\uc82e\uc866\uc87a\uc87b\uc861\uc82c", 782223378), hl.a("\u663f\u6677\u666b\u666a\u6670\u663d", 1216046595), hl.a("\uadc3\uad8b\uad97\uad96\uad8c\uadc1", -719016449)};
    }

    static {
        a3.a();
    }
}

