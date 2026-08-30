package litebans;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

static class ValueHandler {
    public static final void BaseCoreGenericHandler(@NotNull Appendable appendable, Object object, @Nullable LiteBansModule_178 eo_02) {
        Appendable appendable2;
        ObjectUtilities.BaseCoreGenericHandler((Object)appendable, "<this>");
        LiteBansModule_178 eo_03 = eo_02;
        if (eo_03 != null) {
            appendable2 = appendable.append((CharSequence)eo_03.BaseCoreGenericHandler(object));
        } else {
            Object object2 = object;
            appendable2 = (object2 == null ? true : object2 instanceof CharSequence) ? appendable.append((CharSequence)object) : (object instanceof Character ? appendable.append(((Character)object).charValue()) : appendable.append(object.toString()));
        }
    }

    private static final void BaseCoreGenericHandler() {
        BaseCoreGenericHandler = new String[]{"<this>", "value", "", "<this>", "value", "<this>", "<this>", "<this>", "<this>"};
    }

    }

