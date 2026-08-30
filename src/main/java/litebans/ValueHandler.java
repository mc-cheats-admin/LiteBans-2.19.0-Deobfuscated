package litebans;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

static class ValueHandler {
    public static final void BaseCoreGenericHandler(@NotNull Appendable appendable, Object targetObj, @Nullable LiteBansModule_178 eo_02) {
        Appendable appendable2;
        ObjectUtilities.BaseCoreGenericHandler(appendable, "<this>");
        LiteBansModule_178 eo_03 = eo_02;
        if (eo_03 != null) {
            appendable2 = appendable.append(eo_03.BaseCoreGenericHandler(targetObj));
        } else {
            Object contextObj = targetObj;
            appendable2 = (contextObj == null ? true : contextObj instanceof CharSequence) ? appendable.append(targetObj) : (targetObj instanceof Character ? appendable.append(targetObj.charValue()) : appendable.append(targetObj.toString()));
}

    private static final void BaseCoreGenericHandler() {
        BaseCoreGenericHandler = new String[]{"<this>", "value", "", "<this>", "value", "<this>", "<this>", "<this>", "<this>"};
}

