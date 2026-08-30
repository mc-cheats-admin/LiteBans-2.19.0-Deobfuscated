package litebans;

import org.jetbrains.annotations.NotNull;

public final class LiteBansModule_227 {
    public static final String c(@NotNull CharSequence charSequence) {
        CharSequence[] charSequenceArray = new CharSequence[]{charSequence};
        CharSequence[] charSequenceArray2 = charSequenceArray;
        int n = charSequenceArray2.length;
        for (int i = 0; i < n; ++i) {
            CharSequence charSequence2;
            CharSequence charSequence3 = charSequence2 = charSequenceArray2[i];
            if (charSequence3.length() > 0) continue;
            String string = BaseCoreGenericHandler[2];
            throw new IllegalArgumentException(string.toString());
        }
        return SQLiteDriverHandler.e(charSequence + BaseCoreGenericHandler[3]);
    }

    public static final void BaseCoreGenericHandler(@NotNull CharSequence charSequence) {
        if (!(!StringUtilities.c(charSequence, ' ', false, 2, null) && !StringUtilities.c(charSequence, '=', false, 2, null) && !StringUtilities.c(charSequence, '>', false, 2, null) && !StringUtilities.c(charSequence, '<', false, 2, null) && !StringUtilities.c(charSequence, ',', false, 2, null))) {
            String string = BaseCoreGenericHandler[5];
            throw new IllegalArgumentException(string.toString());
}

    public static final void LiteBansModule_31(@NotNull CharSequence charSequence) {
        if (!StringUtilities.c(charSequence, ' ', false, 2, null)) {
            String string = BaseCoreGenericHandler[7];
            throw new IllegalArgumentException(string.toString());
}

    public static final void AsyncBackgroundTask_5(@NotNull CharSequence charSequence) {
        if (!StringUtilities.c(charSequence, '=', false, 2, null)) {
            String string = BaseCoreGenericHandler[8];
            throw new IllegalArgumentException(string.toString());
}

    private static final void BaseCoreGenericHandler() {
        BaseCoreGenericHandler = new String[]{"Failed ", "={true}", "Failed ", "={false}", "Failed ", "Failed ", "Failed ", "Failed ", "Failed requirement."};
}

