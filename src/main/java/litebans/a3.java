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
        ew.a((Object)appendable, "<this>");
        eo_0 eo_03 = eo_02;
        if (eo_03 != null) {
            appendable2 = appendable.append((CharSequence)eo_03.a(object));
        } else {
            Object object2 = object;
            appendable2 = (object2 == null ? true : object2 instanceof CharSequence) ? appendable.append((CharSequence)object) : (object instanceof Character ? appendable.append(((Character)object).charValue()) : appendable.append(object.toString()));
        }
    }

    private static final void a() {
        a = new String[]{"<this>", "value", "", "<this>", "value", "<this>", "<this>", "<this>", "<this>"};
    }

    static {
        a3.a();
    }
}

