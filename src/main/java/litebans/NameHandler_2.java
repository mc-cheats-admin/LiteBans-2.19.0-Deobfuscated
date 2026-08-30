package litebans;

import org.jetbrains.annotations.NotNull;

public final class NameHandler_2 {
        private NameHandler_2() {
    }

    public final LiteBansModule_179 BaseCoreGenericHandler() {
        return SQLiteDriverHandler_3.BaseCoreGenericHandler();
    }

    public final int LiteBansModule_31() {
        return SQLiteDriverHandler_3.e();
    }

    public final void BaseCoreGenericHandler(int n) {
        SQLiteDriverHandler_3.BaseCoreGenericHandler(n);
    }

    public final LiteBansModule_179 c() {
        return this.plugin();
    }

    public final LiteBansModule_179 BaseCoreGenericHandler(@NotNull LiteBansModule_179 eo_02) {
        return eo_02;
    }

    public final LiteBansModule_179 LiteBansModule_31(@NotNull LiteBansModule_179 eo_02, @NotNull LiteBansModule_179 eo_03) {
        return this.plugin(arg_0 -> NameHandler_2.BaseCoreGenericHandler(eo_02, eo_03, arg_0));
    }

    public final LiteBansModule_179 BaseCoreGenericHandler(@NotNull LiteBansModule_179 eo_02, @NotNull LiteBansModule_179 eo_03) {
        if (ObjectUtilities.BaseCoreGenericHandler((Object)eo_02, this.plugin())) {
            return eo_03;
        }
        return this.LiteBansModule_31(eo_02, eo_03);
    }

    public final String BaseCoreGenericHandler(@NotNull SQLiteDriverHandler_3 gZ2, @NotNull String string) {
        CharSequence charSequence;
        String string2 = string;
        boolean flag = ObjectUtilities.BaseCoreGenericHandler((Object)string, (Object)"name");
        StringBuilder stringBuilder = new StringBuilder().append(string2);
        if (flag) {
            CharSequence charSequence2 = gZ2.c().LiteBansModule_241();
            CharSequence charSequence3 = "?";
            charSequence = "" + charSequence2 + charSequence3;
        } else {
            charSequence = "=?";
        }
        string2 = stringBuilder.append((Object)charSequence).toString();
        if (flag) {
            string2 = string2 + gZ2.c().LiteBansModule_403();
        }
        return string2;
    }

    private static final LiteBansModule_60 BaseCoreGenericHandler(LiteBansModule_179 eo_02, LiteBansModule_179 eo_03, LiteBansModule_60 bT2) {
        eo_02.BaseCoreGenericHandler(bT2);
        return (LiteBansModule_60)eo_03.BaseCoreGenericHandler(bT2);
    }

    public /* synthetic */ NameHandler_2(LiteBansModule_14 aJ2) {
        this();
    }

    private static final void AsyncBackgroundTask_5() {
        BaseCoreGenericHandler = new String[]{"name", "?", "=?", " WHERE ", "WHERE", " WHERE ", "AND", " WHERE ", "WHERE", " WHERE ", "Player name \"", "\" length > ", "UUID \"", "\" length > 36"};
    }

    static {
        NameHandler_2.AsyncBackgroundTask_5();
    }
}

