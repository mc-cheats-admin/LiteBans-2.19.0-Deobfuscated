package litebans;

import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class GlobalHandler_2 {
    private GlobalHandler_2() {
    }

    public final String LiteBansModule_31() {
        return LiteBansModule_181.c();
    }

    public final LiteBansModule_181 c() {
        return LiteBansModule_181.LiteBansModule_31();
    }

    public final boolean LiteBansModule_31(@Nullable String string) {
        return ObjectUtilities.BaseCoreGenericHandler((Object)string, (Object)this.LiteBansModule_31()) || StringUtilities.BaseCoreGenericHandler(string, "global", true) || StringUtilities.BaseCoreGenericHandler(string, "all", true);
    }

    public final boolean BaseCoreGenericHandler(@Nullable String string) {
        return StringUtilities.BaseCoreGenericHandler(string, "local", true) || StringUtilities.BaseCoreGenericHandler(string, "this", true);
    }

    public final LiteBansModule_181 BaseCoreGenericHandler(@NotNull CommandSenderWrapper sender, @NotNull List list, @NotNull String string, boolean flag) {
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            String string2;
            String string3 = (String)iterator.next();
            if (string3.length() >= 7 && StringUtilities.LiteBansModule_31((string2 = string3).toLowerCase(Locale.ENGLISH), "server:", false, 2, null)) {
                string2 = string3.substring(7);
                string2 = this.plugin(string2, string, sender);
                if (flag) {
                    iterator.remove();
                }
                return new LiteBansModule_181(string2);
            }
            if (ObjectUtilities.BaseCoreGenericHandler((Object)string3, (Object)"--")) {
                return this.c();
            }
            if (!StringUtilities.BaseCoreGenericHandler((CharSequence)string3, '-', false, 2, null) || !StringUtilities.c((CharSequence)string3, 'g', false, 2, null)) continue;
            if (flag) {
                iterator.remove();
            }
            return new LiteBansModule_181(this.LiteBansModule_31());
        }
        return this.c();
    }

    public static /* synthetic */ LiteBansModule_181 BaseCoreGenericHandler(GlobalHandler_2 jG2, CommandSenderWrapper sender, List list, String string, boolean flag, int n, Object object) {
        if ((n & 8) != 0) {
            flag = true;
        }
        return jG2.BaseCoreGenericHandler(sender, list, string, flag);
    }

    public final String c(@Nullable String string) {
        if (string == null || this.LiteBansModule_31(string)) {
            return this.LiteBansModule_31();
        }
        return this.AsyncBackgroundTask_5(string);
    }

    public final String AsyncBackgroundTask_5(@NotNull String string) {
        return LiteBansModule_242.BaseCoreGenericHandler(string, 32);
    }

    public final String BaseCoreGenericHandler(@NotNull String string, @NotNull String string2, @NotNull CommandSenderWrapper sender) {
        if (this.LiteBansModule_31(string)) {
            return "global";
        }
        if (this.plugin(string)) {
            String string3 = sender.LiteBansModule_240();
            String string4 = string3;
            if (string4 == null) {
                string4 = string2;
            }
            return string4;
        }
        return this.AsyncBackgroundTask_5(string);
    }

    public final boolean BaseCoreGenericHandler(@NotNull String string, @NotNull String string2) {
        return this.LiteBansModule_31(string) || this.LiteBansModule_31(string2) ? true : StringUtilities.BaseCoreGenericHandler(this.AsyncBackgroundTask_5(string), this.AsyncBackgroundTask_5(string2), true);
    }

    public /* synthetic */ GlobalHandler_2(LiteBansModule_14 aJ2) {
        this();
    }

    private static final void BaseCoreGenericHandler() {
        BaseCoreGenericHandler = new String[]{"global", "all", "local", "this", "server:", "--", "global"};
}

