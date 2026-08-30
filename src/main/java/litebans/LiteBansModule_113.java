package litebans;

import org.jetbrains.annotations.Nullable;

public final class LiteBansModule_113 {
    private String AsyncBackgroundTask_5;
    private String e;
    private String g;
    private String c;
    private String BaseCoreGenericHandler;
    private final CommandSenderWrapper LiteBansModule_31;
    private final String LiteBansModule_194;

    public LiteBansModule_113(@Nullable String string, @Nullable String string2, @Nullable String string3, @Nullable String string4, @Nullable String string5, @Nullable CommandSenderWrapper sender, @Nullable String string6) {
        this.AsyncBackgroundTask_5 = string;
        this.e = string2;
        this.g = string3;
        this.c = string4;
        this.plugin = string5;
        this.LiteBansModule_31 = sender;
        this.LiteBansModule_194 = string6;
        String string7 = this.plugin;
        this.plugin = string7 != null ? StringUtilities.BaseCoreGenericHandler(string7, '*', '%', false, 4, null) : null;
    }

    public /* synthetic */ LiteBansModule_113(String string, String string2, String string3, String string4, String string5, CommandSenderWrapper sender, String string6, int n, LiteBansModule_14 aJ2) {
        if ((n & 2) != 0) {
            string2 = string;
        }
        if ((n & 4) != 0) {
            string3 = string;
        }
        if ((n & 0x20) != 0) {
            sender = null;
        }
        if ((n & 0x40) != 0) {
            string6 = string;
        }
        this(string, string2, string3, string4, string5, sender, string6);
    }

    public final String AsyncBackgroundTask_5() {
        return this.e;
    }

    public final void BaseCoreGenericHandler(@Nullable String string) {
        this.e = string;
    }

    public final String LiteBansModule_194() {
        return this.g;
    }

    public final void LiteBansModule_31(@Nullable String string) {
        this.g = string;
    }

    public final String BaseCoreGenericHandler() {
        return this.c;
    }

    public final String c() {
        return this.plugin;
    }

    public final CommandSenderWrapper e() {
        return this.LiteBansModule_31;
    }

    public final String g() {
        return this.LiteBansModule_194;
    }

    public final boolean LiteBansModule_31() {
        boolean flag;
        String string = this.LiteBansModule_194;
        if (string != null) {
            String string2 = string;
            boolean flag2 = false;
            flag = HexEncodingHelper.BaseCoreGenericHandler.i(string2);
        } else {
            flag = false;
        }
        return flag;
    }
}

