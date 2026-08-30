package litebans;

import litebans.aJ;
import litebans.ch;
import litebans.hc;
import litebans.jJ;
import litebans.jR;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from litebans.df
 */
public static final class df_0 {
    private df_0() {
    }

    public final hc a(@NotNull ch ch2, @Nullable String string, @NotNull String string2, @NotNull jR jR2, boolean bl, @Nullable String string3, boolean bl2, @NotNull Number number, @NotNull Number number2) {
        ch ch3 = ch2;
        boolean bl3 = false;
        return new hc(ch2, string, jR2, bl, new jJ(ch3.e(), string2), string3, bl2, number, number2);
    }

    public static /* synthetic */ hc a(df_0 df_02, ch ch2, String string, String string2, jR jR2, boolean bl, String string3, boolean bl2, Number number, Number number2, int n, Object object) {
        if ((n & 4) != 0) {
            jR2 = jR.g;
        }
        if ((n & 8) != 0) {
            bl = false;
        }
        if ((n & 0x10) != 0) {
            string3 = null;
        }
        if ((n & 0x20) != 0) {
            bl2 = true;
        }
        if ((n & 0x40) != 0) {
            number = 0;
        }
        if ((n & 0x80) != 0) {
            number2 = 0;
        }
        return df_02.a(ch2, string, string2, jR2, bl, string3, bl2, number, number2);
    }

    public /* synthetic */ df_0(aJ aJ2) {
        this();
    }
}

