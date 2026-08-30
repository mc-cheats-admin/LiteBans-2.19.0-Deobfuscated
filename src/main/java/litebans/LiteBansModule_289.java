package litebans;

import org.jetbrains.annotations.NotNull;

public final class LiteBansModule_289 {
    private final String LiteBansModule_31;
    private final String e;
    private final String AsyncBackgroundTask_5;
    private final String LiteBansModule_194;
    private final boolean BaseCoreGenericHandler;
    private final boolean c;
    public LiteBansModule_289(@NotNull String string, @NotNull String string2, @NotNull String string3, @NotNull String string4, boolean flag, boolean flag2) {
        this.LiteBansModule_31 = string;
        this.e = string2;
        this.AsyncBackgroundTask_5 = string3;
        this.LiteBansModule_194 = string4;
        this.plugin = flag;
        this.c = flag2;
    }

    public /* synthetic */ LiteBansModule_289(String string, String string2, String string3, String string4, boolean flag, boolean flag2, int n, LiteBansModule_14 aJ2) {
        if ((n & 8) != 0) {
            string4 = "";
        }
        if ((n & 0x10) != 0) {
            flag = false;
        }
        if ((n & 0x20) != 0) {
            flag2 = false;
        }
        this(string, string2, string3, string4, flag, flag2);
    }

    public final String e() {
        return this.LiteBansModule_31;
    }

    public final String g() {
        return this.e;
    }

    public final String c() {
        return this.AsyncBackgroundTask_5;
    }

    public final String BaseCoreGenericHandler() {
        return this.LiteBansModule_194;
    }

    public final boolean LiteBansModule_31() {
        return this.plugin;
    }

    public final boolean AsyncBackgroundTask_5() {
        return this.c;
    }

    private static final void LiteBansModule_194() {
        g = new String[]{""};
    }

    }

