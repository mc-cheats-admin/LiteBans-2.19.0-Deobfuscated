package litebans;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.stream.IntStream;
public final class BanHandler
extends Enum
implements CharSequence {
    public static final TempHandler LiteBansModule_401;
    private final BanHandler LiteBansModule_194;
    private final BansHandler_2 m;
    private static final List LiteBansModule_31;
    public static final BanHandler LiteBansModule_240;
    public static final BanHandler GnuSparseMapHandler;
    public static final BanHandler c;
    public static final BanHandler g;
    public static final BanHandler AsyncBackgroundTask_5;
    public static final BanHandler n;
    public static final BanHandler e;
    private static final /* synthetic */ BanHandler[] Utf8Handler_2;
    private static final /* synthetic */ LiteBansModule_372 BaseCoreGenericHandler;
    /*
     * WARNING - void declaration
     */
    private BanHandler() {
        void arg1;
        void arg2;
        void var2_-1;
        void var1_-1;
        this.LiteBansModule_194 = arg2;
        this.m = arg1;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    /* synthetic */ BanHandler(BanHandler a_2, BansHandler_2 kL2, int object, LiteBansModule_14 aJ2) {
        void v4;
        void var1_-1;
{
            Object object2;
{
                    void arg3;
                    if ((arg3 & 1) != 0) {
                        object = null;
                    }
                    if ((arg3 & 2) == 0) break;
                    object2 = object;
                    if (object2 == null) break;
                    BansHandler_2 kL3 = object2.m;
                    object2 = kL3;
                    if (kL3 != null) break;
                }
                object2 = (BansHandler_2)((Object)AssertionUtilities.BaseCoreGenericHandler());
            }
            Object object3 = object2;
        }
        this((String)var1_-1, (int)kL2, (BanHandler)object, (BansHandler_2)v4);
    }

    public final BansHandler_2 BaseCoreGenericHandler() {
        return this.m;
    }

    public final BanHandler c() {
        BanHandler a_2 = this.LiteBansModule_194;
        if (a_2 == null) {
            a_2 = this;
        }
        return a_2;
    }

    public int e() {
        return this.toString().length();
    }

    @Override
    public String toString() {
        String string = super.toString();
        return string.toLowerCase(Locale.ENGLISH);
    }

    @Override
    public IntStream chars() {
        return this.toString().chars();
    }

    @Override
    public IntStream codePoints() {
        return this.toString().codePoints();
    }

    public char BaseCoreGenericHandler(int n) {
        return this.toString().charAt(n);
    }

    @Override
    public CharSequence subSequence(int n, int n2) {
        return this.toString().subSequence(n, n2);
    }

    public static BanHandler[] values() {
        return (BanHandler[])Utf8Handler_2.clone();
    }

    public static BanHandler BaseCoreGenericHandler(String string) {
        return Enum.valueOf(BanHandler.class, string);
    }

    @Override
    public final int length() {
        return this.e();
    }

    @Override
    public final char charAt(int n) {
        return this.plugin(n);
    }

    public static final /* synthetic */ List AsyncBackgroundTask_5() {
        return LiteBansModule_31;
    }

    static {
        BanHandler.LiteBansModule_31();
        LiteBansModule_240 = new BanHandler("BAN", 0, null, BansHandler_2.Utf8Handler_2, 1, null);
        GnuSparseMapHandler = new BanHandler("MUTE", 1, null, BansHandler_2.m, 1, null);
        c = new BanHandler("WARN", 2, null, BansHandler_2.LiteBansModule_31, 1, null);
        g = new BanHandler("KICK", 3, null, BansHandler_2.GnuSparseMapHandler, 1, null);
        AsyncBackgroundTask_5 = new BanHandler("UNBAN", 4, LiteBansModule_240, null, 2, null);
        n = new BanHandler("UNMUTE", 5, GnuSparseMapHandler, null, 2, null);
        e = new BanHandler("UNWARN", 6, c, null, 2, null);
        Utf8Handler_2 = a_Array = new BanHandler[]{BanHandler.LiteBansModule_240, BanHandler.GnuSparseMapHandler, BanHandler.c, BanHandler.g, BanHandler.AsyncBackgroundTask_5, BanHandler.n, BanHandler.e};
        BaseCoreGenericHandler = EntriesHandler_3.BaseCoreGenericHandler(Utf8Handler_2);
        LiteBansModule_401 = new TempHandler(null);
        BanHandler[] a_Array = BanHandler.values();
        BanHandler[] a_Array2 = a_Array;
        Collection collection = new ArrayList();
        int n = a_Array2.length;
        for (int i = 0; i < n; ++i) {
            BanHandler a_2;
            BanHandler a_3 = a_2 = a_Array2[i];
            if (!(a_3 == a_3.c())) continue;
            collection.add(a_2);
        }
        LiteBansModule_31 = (List)collection;
    }

    private static final void LiteBansModule_31() {
        i = new String[]{"un", "temp_", "temp_ip", "ip", "un", "un", "temp_", "temp_ip", "ip", "un", "silent_", "BAN", "MUTE", "WARN", "KICK", "UNBAN", "UNMUTE", "UNWARN"};
}

