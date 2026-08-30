package litebans;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class LiteBansModule_121 {
    private LiteBansModule_121() {
    }

    public final DescHandler BaseCoreGenericHandler(@NotNull LiteBansModule_82 ch2, @Nullable String string, @NotNull String string2, @NotNull UuidHandler jR2, boolean flag, @Nullable String string3, boolean flag2, @NotNull Number number, @NotNull Number number2) {
        LiteBansModule_82 ch3 = ch2;
        boolean flag3 = false;
        return new DescHandler(ch2, string, jR2, flag, new AllHandler(ch3.e(), string2), string3, flag2, number, number2);
    }

    public static /* synthetic */ DescHandler BaseCoreGenericHandler(LiteBansModule_121 df_02, LiteBansModule_82 ch2, String string, String string2, UuidHandler jR2, boolean flag, String string3, boolean flag2, Number number, Number number2, int n, Object object) {
        if ((n & 4) != 0) {
            jR2 = UuidHandler.g;
        }
        if ((n & 8) != 0) {
            flag = false;
        }
        if ((n & 0x10) != 0) {
            string3 = null;
        }
        if ((n & 0x20) != 0) {
            flag2 = true;
        }
        if ((n & 0x40) != 0) {
            number = 0;
        }
        if ((n & 0x80) != 0) {
            number2 = 0;
        }
        return df_02.BaseCoreGenericHandler(ch2, string, string2, jR2, flag, string3, flag2, number, number2);
    }

    public /* synthetic */ LiteBansModule_121(LiteBansModule_14 aJ2) {
        this();
    }
}

