package litebans;

import java.sql.ResultSet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class DescHandler
implements CharSequence {
    public static final LiteBansModule_121 GnuSparseMapHandler;
    private final LiteBansModule_82 g;
    private final String LiteBansModule_194;
    private final UuidHandler BaseCoreGenericHandler;
    private final boolean Utf8Handler_2;
    private final AllHandler LiteBansModule_401;
    private final String LiteBansModule_31;
    private final boolean e;
    private final Number LiteBansModule_240;
    private final Number c;
    private LiteBansModule_178 AsyncBackgroundTask_5;
    public DescHandler(@NotNull LiteBansModule_82 ch2, @Nullable String string, @NotNull UuidHandler jR2, boolean flag, @NotNull AllHandler jJ2, @Nullable String string2, boolean flag2, @NotNull Number number, @NotNull Number number2) {
        this.g = ch2;
        this.LiteBansModule_194 = string;
        this.plugin = jR2;
        this.Utf8Handler_2 = flag;
        this.LiteBansModule_401 = jJ2;
        this.LiteBansModule_31 = string2;
        this.e = flag2;
        this.LiteBansModule_240 = number;
        this.c = number2;
        this.AsyncBackgroundTask_5 = SQLiteDriverHandler_3.LiteBansModule_401.c();
    }

    public /* synthetic */ DescHandler(LiteBansModule_82 ch2, String string, UuidHandler jR2, boolean flag, AllHandler jJ2, String string2, boolean flag2, Number number, Number number2, int n, LiteBansModule_14 aJ2) {
        if ((n & 4) != 0) {
            jR2 = UuidHandler.g;
        }
        if ((n & 8) != 0) {
            flag = false;
        }
        if ((n & 0x20) != 0) {
            string2 = null;
        }
        if ((n & 0x40) != 0) {
            flag2 = true;
        }
        if ((n & 0x80) != 0) {
            number = 0;
        }
        if ((n & 0x100) != 0) {
            number2 = 0;
        }
        this(ch2, string, jR2, flag, jJ2, string2, flag2, number, number2);
    }

    public final String c() {
        return this.LiteBansModule_194;
    }

    public final LiteBansModule_178 BaseCoreGenericHandler() {
        return this.AsyncBackgroundTask_5;
    }

    public final void BaseCoreGenericHandler(@NotNull LiteBansModule_178 eo_02) {
        this.AsyncBackgroundTask_5 = eo_02;
    }

    public int LiteBansModule_31() {
        return this.toString().length();
    }

    public char BaseCoreGenericHandler(int n) {
        return this.toString().charAt(n);
    }

    @Override
    public CharSequence subSequence(int n, int n2) {
        return this.toString().subSequence(n, n2);
    }

    @Override
    public String toString() {
        Object object;
        this.e();
        CharSequence charSequence = "";
        charSequence = this.LiteBansModule_31(this.c(this.plugin(charSequence)));
        if (this.LiteBansModule_31 != null) {
            object = this.e ? "DESC" : "ASC";
            CharSequence charSequence2 = charSequence;
            CharSequence charSequence3 = " ORDER BY " + this.LiteBansModule_31 + ' ' + (String)object;
            boolean flag = false;
            charSequence = "" + charSequence2 + charSequence3;
        }
        object = this.LiteBansModule_240;
        int n = 0;
        boolean flag = false;
        if (ObjectUtilities.BaseCoreGenericHandler(((Number)object).intValue(), n) > 0) {
            object = charSequence;
            CharSequence charSequence4 = " LIMIT ? OFFSET ?";
            flag = false;
            charSequence = "" + object + charSequence4;
            this.AsyncBackgroundTask_5 = SQLiteDriverHandler_3.LiteBansModule_401.BaseCoreGenericHandler(this.AsyncBackgroundTask_5, arg_0 -> DescHandler.LiteBansModule_31(this, arg_0));
        }
        return ((Object)charSequence).toString();
    }

    private final CharSequence c(CharSequence charSequence) {
        if (this.Utf8Handler_2) {
            this.AsyncBackgroundTask_5 = SQLiteDriverHandler_3.LiteBansModule_401.BaseCoreGenericHandler(this.AsyncBackgroundTask_5, DescHandler::BaseCoreGenericHandler);
            return this.plugin(charSequence, (CharSequence)i[5]);
        }
        return charSequence;
    }

    private final CharSequence LiteBansModule_31(CharSequence charSequence) {
        this.AsyncBackgroundTask_5 = SQLiteDriverHandler_3.LiteBansModule_401.BaseCoreGenericHandler(this.AsyncBackgroundTask_5, arg_0 -> DescHandler.BaseCoreGenericHandler(this, arg_0));
        CharSequence charSequence2 = charSequence;
        CharSequence charSequence3 = this.LiteBansModule_401;
        boolean flag = false;
        return "" + charSequence2 + charSequence3;
    }

    public void e() {
        if (!ObjectUtilities.BaseCoreGenericHandler((Object)this.AsyncBackgroundTask_5, SQLiteDriverHandler_3.LiteBansModule_401.BaseCoreGenericHandler())) {
            this.AsyncBackgroundTask_5 = SQLiteDriverHandler_3.LiteBansModule_401.c();
        }
    }

    public CharSequence BaseCoreGenericHandler(@NotNull CharSequence charSequence) {
        if (this.LiteBansModule_194 == null) {
            return charSequence;
        }
        switch (LiteBansModule_85.BaseCoreGenericHandler[this.plugin.ordinal()]) {
            case 1: {
                return this.plugin(this.LiteBansModule_194, i[6], charSequence);
            }
            case 2: {
                return this.plugin(this.LiteBansModule_194, i[7], charSequence);
            }
            case 3: {
                DescHandler hc2 = this;
                boolean flag = false;
                Object object = hc2.c();
                return this.plugin(object != null && (object = StringUtilities.LiteBansModule_31((String)object)) != null ? (Long)object : -1L, i[8], charSequence);
            }
        }
        return this.plugin(charSequence, (CharSequence)('(' + this.LiteBansModule_194 + ')'));
    }

    private final CharSequence BaseCoreGenericHandler(String string, String string2, CharSequence charSequence) {
        this.AsyncBackgroundTask_5 = SQLiteDriverHandler_3.LiteBansModule_401.BaseCoreGenericHandler(this.AsyncBackgroundTask_5, arg_0 -> DescHandler.BaseCoreGenericHandler(string, arg_0));
        return this.plugin(charSequence, (CharSequence)(string2 + i[9]));
    }

    private final CharSequence BaseCoreGenericHandler(long l3, String string, CharSequence charSequence) {
        this.AsyncBackgroundTask_5 = SQLiteDriverHandler_3.LiteBansModule_401.BaseCoreGenericHandler(this.AsyncBackgroundTask_5, arg_0 -> DescHandler.BaseCoreGenericHandler(l3, arg_0));
        return this.plugin(charSequence, (CharSequence)(string + i[10]));
    }

    public final CharSequence BaseCoreGenericHandler(@NotNull CharSequence charSequence, @NotNull CharSequence charSequence2) {
        return charSequence.length() == 0 ? charSequence2 : (charSequence2.length() == 0 ? charSequence : (CharSequence)(charSequence + i[11] + charSequence2));
    }

    public final ResultSet BaseCoreGenericHandler(@NotNull BanHandler a_2, @NotNull CharSequence charSequence) {
        return this.plugin(a_2.BaseCoreGenericHandler(), charSequence);
    }

    public static /* synthetic */ ResultSet BaseCoreGenericHandler(DescHandler hc2, BanHandler a_2, CharSequence charSequence, int n, Object object) {
        if (object != null) {
            throw new UnsupportedOperationException(i[12]);
        }
        if ((n & 2) != 0) {
            charSequence = i[13];
        }
        return hc2.BaseCoreGenericHandler(a_2, charSequence);
    }

    public final ResultSet BaseCoreGenericHandler(@NotNull BansHandler_2 kL2, @NotNull CharSequence charSequence) {
        if (this.g instanceof LiteBansModule_244) {
            return LiteBansModule_397.BaseCoreGenericHandler();
        }
        LiteBansModule_82 ch2 = this.g;
        ObjectUtilities.LiteBansModule_31(ch2, i[14]);
        BansHandler_2 kL3 = kL2;
        boolean flag = false;
        return LiteBansModule_184.BaseCoreGenericHandler(((SQLiteDriverHandler_3)ch2).c(SQLiteDriverHandler.AsyncBackgroundTask_5(SQLiteDriverHandler.e(i[15] + charSequence + i[16] + kL3 + i[17] + this))), this);
    }

    private static final LiteBansModule_60 LiteBansModule_31(DescHandler hc2, LiteBansModule_60 bT2) {
        LiteBansModule_60 bT3;
        LiteBansModule_60 bT4 = bT2;
        Number[] numberArray = new Number[]{hc2.LiteBansModule_240, hc2.c};
        boolean flag = false;
        LiteBansModule_60 bT5 = bT3 = bT4;
        boolean flag2 = false;
        Number[] numberArray2 = numberArray;
        boolean flag3 = false;
        int n = numberArray2.length;
        for (int i = 0; i < n; ++i) {
            Number number;
            Number number2 = number = numberArray2[i];
            boolean flag4 = false;
            bT4.BaseCoreGenericHandler(number2);
        }
        return bT3;
    }

    private static final LiteBansModule_60 BaseCoreGenericHandler(LiteBansModule_60 bT2) {
        return LiteBansModule_184.BaseCoreGenericHandler(bT2);
    }

    private static final LiteBansModule_60 BaseCoreGenericHandler(DescHandler hc2, LiteBansModule_60 bT2) {
        LiteBansModule_60 bT3;
        LiteBansModule_60 bT4 = bT2;
        AllHandler jJ2 = hc2.LiteBansModule_401;
        boolean flag = false;
        LiteBansModule_60 bT5 = bT3 = bT4;
        boolean flag2 = false;
        jJ2.BaseCoreGenericHandler(bT5);
        return bT3;
    }

    private static final LiteBansModule_60 BaseCoreGenericHandler(String string, LiteBansModule_60 bT2) {
        return bT2.BaseCoreGenericHandler(string);
    }

    private static final LiteBansModule_60 BaseCoreGenericHandler(long l3, LiteBansModule_60 bT2) {
        return bT2.BaseCoreGenericHandler(l3);
    }

    @Override
    public final int length() {
        return this.LiteBansModule_31();
    }

    @Override
    public final char charAt(int n) {
        return this.plugin(n);
    }

    static {
        DescHandler.AsyncBackgroundTask_5();
        GnuSparseMapHandler = new LiteBansModule_121(null);
    }

    private static final void AsyncBackgroundTask_5() {
        i = new String[]{"", "DESC", "ASC", " ORDER BY ", " LIMIT ? OFFSET ?", "(active={true} AND(until<1 OR until>?))", "uuid", "banned_by_uuid", "SQLiteDriverHandler_4", "=?", "=?", " AND ", "", "*", "", "SELECT ", " FROM ", " WHERE ", "", "*"};
    }
}

