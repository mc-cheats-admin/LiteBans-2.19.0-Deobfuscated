package litebans;

import java.util.Locale;
import java.util.stream.IntStream;
import org.jetbrains.annotations.NotNull;

public final class BansHandler_2
extends Enum
implements CharSequence {
    public static final LiteBansModule_87 AsyncBackgroundTask_5;
    public static final BansHandler_2 Utf8Handler_2;
    public static final BansHandler_2 m;
    public static final BansHandler_2 LiteBansModule_31;
    public static final BansHandler_2 GnuSparseMapHandler;
    public static final BansHandler_2 g;
    public static final BansHandler_2 c;
    public static final BansHandler_2 LiteBansModule_194;
    public static final BansHandler_2 n;
    public static final BansHandler_2 i;
    public static final BansHandler_2 LiteBansModule_240;
    private static final /* synthetic */ BansHandler_2[] e;
    private static final /* synthetic */ LiteBansModule_372 BaseCoreGenericHandler;
    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private BansHandler_2() {
        void var2_-1;
        void var1_-1;
    }

    public final boolean BaseCoreGenericHandler() {
        boolean flag;
        switch (LiteBansModule_365.BaseCoreGenericHandler[this.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4: {
                flag = true;
                break;
            }
            default: {
                flag = false;
}
        return flag;
    }

    public final BanHandler c() {
        BanHandler a_2;
        switch (LiteBansModule_365.BaseCoreGenericHandler[this.ordinal()]) {
            case 1: {
                a_2 = BanHandler.LiteBansModule_240;
                break;
            }
            case 3: {
                a_2 = BanHandler.c;
                break;
            }
            case 2: {
                a_2 = BanHandler.GnuSparseMapHandler;
                break;
            }
            case 4: {
                a_2 = BanHandler.g;
                break;
            }
            default: {
                throw new UnsupportedOperationException();
}
        return a_2;
    }

    @Override
    public String toString() {
        return BansHandler_2.BaseCoreGenericHandler(this, null, false, 3, null);
    }

    public int e() {
        return this.toString().length();
    }

    @Override
    public IntStream chars() {
        return this.toString().chars();
    }

    public char BaseCoreGenericHandler(int n) {
        return this.toString().charAt(n);
    }

    @Override
    public CharSequence subSequence(int n, int n2) {
        return this.toString().subSequence(n, n2);
    }

    public final String BaseCoreGenericHandler(@NotNull Locale locale, boolean flag) {
        if (LiteBansModule_209.LiteBansModule_31.c()) {
            ConfigService configService = (ConfigService)LiteBansModule_209.LiteBansModule_31.BaseCoreGenericHandler().BaseCoreGenericHandler(ConfigService.class);
            String string = this.name().toLowerCase(locale);
            if (configService != null) {
                DiscordWebhookClient eG2 = configService.LiteBansModule_194();
                string = eG2.AsyncBackgroundTask_5() + string;
                if (ObjectUtilities.BaseCoreGenericHandler((Object)configService.LiteBansModule_194().ElementsHandler(), (Object)"LiteBansModule_243") && flag) {
                    string = string.toUpperCase(locale);
                }
                return string;
}
        return this.name();
    }

    public static /* synthetic */ String BaseCoreGenericHandler(BansHandler_2 kL2, Locale locale, boolean flag, int n, Object object) {
        if (object != null) {
            throw new UnsupportedOperationException("");
        }
        if ((n & 1) != 0) {
            locale = Locale.ENGLISH;
        }
        if ((n & 2) != 0) {
            flag = true;
        }
        return kL2.BaseCoreGenericHandler(locale, flag);
    }

    public static BansHandler_2[] values() {
        return (BansHandler_2[])e.clone();
    }

    public static BansHandler_2 BaseCoreGenericHandler(String string) {
        return Enum.valueOf(BansHandler_2.class, string);
    }

    @Override
    public final int length() {
        return this.e();
    }

    @Override
    public final char charAt(int n) {
        return this.plugin(n);
    }

    static {
        BansHandler_2.AsyncBackgroundTask_5();
        Utf8Handler_2 = new BansHandler_2("BANS", 0);
        m = new BansHandler_2("MUTES", 1);
        LiteBansModule_31 = new BansHandler_2("WARNINGS", 2);
        GnuSparseMapHandler = new BansHandler_2("KICKS", 3);
        g = new BansHandler_2("HISTORY", 4);
        c = new BansHandler_2("SYNC", 5);
        LiteBansModule_194 = new BansHandler_2("SERVERS", 6);
        n = new BansHandler_2("CACHE8K", 7);
        i = new BansHandler_2("CONFIG", 8);
        LiteBansModule_240 = new BansHandler_2("ALLOW", 9);
        e = kLArray = new BansHandler_2[]{BansHandler_2.Utf8Handler_2, BansHandler_2.m, BansHandler_2.LiteBansModule_31, BansHandler_2.GnuSparseMapHandler, BansHandler_2.g, BansHandler_2.c, BansHandler_2.LiteBansModule_194, BansHandler_2.n, BansHandler_2.i, BansHandler_2.LiteBansModule_240};
        BaseCoreGenericHandler = EntriesHandler_3.BaseCoreGenericHandler(e);
        AsyncBackgroundTask_5 = new LiteBansModule_87(null);
}

