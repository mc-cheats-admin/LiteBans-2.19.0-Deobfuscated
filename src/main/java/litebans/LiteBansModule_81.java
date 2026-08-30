package litebans;

import org.jetbrains.annotations.NotNull;

public final class LiteBansModule_81 {
    public static final String BaseCoreGenericHandler(@NotNull NativepatternHandler hN2, @NotNull CharSequence charSequence, @NotNull String string) {
        return hN2.BaseCoreGenericHandler().matcher(charSequence).replaceAll(string);
    }
}

