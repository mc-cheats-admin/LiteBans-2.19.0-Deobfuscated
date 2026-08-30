package litebans;

import org.jetbrains.annotations.NotNull;

public final class LiteBansModule_343 {
    private LiteBansModule_343() {
    }

    public final Utf8mb4UnicodeCiHandler BaseCoreGenericHandler(@NotNull String string, @NotNull String string2) {
        if (DatabaseMonitorService.CommandThrottleService.LiteBansModule_31(string)) {
            return new Utf8mb4UnicodeCiHandler(string, StringUtilities.LiteBansModule_31((CharSequence)string2) ? "" : "ENGINE=" + string2, " CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci", " UNSIGNED");
        }
        return new Utf8mb4UnicodeCiHandler(string, "", "", " ");
    }

    public /* synthetic */ LiteBansModule_343(LiteBansModule_14 aJ2) {
        this();
    }

    private static final void BaseCoreGenericHandler() {
        BaseCoreGenericHandler = new String[]{"", "ENGINE=", " CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci", " UNSIGNED", "", "", " "};
    }

    }

