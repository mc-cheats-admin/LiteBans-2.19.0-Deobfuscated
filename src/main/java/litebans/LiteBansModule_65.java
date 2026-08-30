package litebans;

import java.util.List;
import org.jetbrains.annotations.Nullable;

public final class LiteBansModule_65 {
    public static final LiteBansModule_427 LiteBansModule_31;
    private final byte AsyncBackgroundTask_5;
    private final String e;
    private final BanHandler g;
    private final LiteBansModule_66 BaseCoreGenericHandler;
    private final boolean LiteBansModule_240;
    private final List GnuSparseMapHandler;
    private final long i;
    public static final byte LiteBansModule_194;
    public static final int m;
    private static final LiteBansModule_66 Utf8Handler_2;
    private static final LiteBansModule_65 LiteBansModule_401;
    private LiteBansModule_65(byte by2, String string, BanHandler a_2, LiteBansModule_66 c52, boolean flag, List list, long l3) {
        this.AsyncBackgroundTask_5 = by2;
        this.e = string;
        this.g = a_2;
        this.plugin = c52;
        this.LiteBansModule_240 = flag;
        this.GnuSparseMapHandler = list;
        this.i = l3;
    }

    public final byte LiteBansModule_194() {
        return this.AsyncBackgroundTask_5;
    }

    public final String g() {
        return this.e;
    }

    public final BanHandler AsyncBackgroundTask_5() {
        return this.g;
    }

    public final LiteBansModule_66 LiteBansModule_240() {
        return this.plugin;
    }

    public final boolean GnuSparseMapHandler() {
        return this.LiteBansModule_240;
    }

    public final List LiteBansModule_31() {
        return this.GnuSparseMapHandler;
    }

    public final long i() {
        return this.i;
    }

    public final LiteBansModule_66 BaseCoreGenericHandler(int n) {
        return this.GnuSparseMapHandler.isEmpty() ? this.plugin : (n >= this.GnuSparseMapHandler.size() ? (LiteBansModule_66)CollectionUtilities.BaseCoreGenericHandler(this.GnuSparseMapHandler) : (n < 0 ? (LiteBansModule_66)CollectionUtilities.LiteBansModule_31(this.GnuSparseMapHandler) : this.GnuSparseMapHandler.get(n)));
    }

    public String toString() {
        return "Template(SQLiteDriverHandler_4=" + LiteBansModule_283.LiteBansModule_31(this.AsyncBackgroundTask_5) + ", name=" + this.e + ", type=" + this.g + ", defaults=" + this.plugin + ", ipTemplate=" + this.LiteBansModule_240 + ", ladder=" + this.GnuSparseMapHandler + ", ladderExpiry=" + this.i + ')';
    }

    public int hashCode() {
        int n = LiteBansModule_283.c(this.AsyncBackgroundTask_5);
        n = n * 31 + this.e.hashCode();
        n = n * 31 + this.g.hashCode();
        n = n * 31 + this.plugin.hashCode();
        n = n * 31 + Boolean.hashCode(this.LiteBansModule_240);
        n = n * 31 + (this.GnuSparseMapHandler).hashCode();
        n = n * 31 + Long.hashCode(this.i);
        return n;
    }

    public boolean equals(@Nullable Object targetObj) {
        if (this == targetObj) {
            return true;
        }
        if (!(targetObj instanceof LiteBansModule_65)) {
            return false;
        }
        LiteBansModule_65 c12 = (LiteBansModule_65)targetObj;
        if (this.AsyncBackgroundTask_5 != c12.AsyncBackgroundTask_5) {
            return false;
        }
        if (!ObjectUtilities.BaseCoreGenericHandler(this.e, c12.e)) {
            return false;
        }
        if (this.g != c12.g) {
            return false;
        }
        if (!ObjectUtilities.BaseCoreGenericHandler(this.plugin, c12.BaseCoreGenericHandler)) {
            return false;
        }
        if (this.LiteBansModule_240 != c12.LiteBansModule_240) {
            return false;
        }
        if (!ObjectUtilities.BaseCoreGenericHandler(this.GnuSparseMapHandler, c12.GnuSparseMapHandler)) {
            return false;
        }
        return this.i == c12.i;
    }

    public /* synthetic */ LiteBansModule_65(byte by2, String string, BanHandler a_2, LiteBansModule_66 c52, boolean flag, List list, long l3, LiteBansModule_14 aJ2) {
        this(by2, string, a_2, c52, flag, list, l3);
    }

    public static final /* synthetic */ LiteBansModule_66 c() {
        return Utf8Handler_2;
    }

    public static final /* synthetic */ LiteBansModule_65 BaseCoreGenericHandler() {
        return LiteBansModule_401;
    }

    static {
        m = -1;
        LiteBansModule_194 = (byte)-1;
        LiteBansModule_65.e();
        LiteBansModule_31 = new LiteBansModule_427(null);
        Utf8Handler_2 = new LiteBansModule_66(null, null, null, null, CollectionUtilities.e(), CollectionUtilities.e());
        LiteBansModule_401 = new LiteBansModule_65(-1, "", BanHandler.LiteBansModule_240, Utf8Handler_2, false, CollectionUtilities.e(), 0L, null);
    }

    private static final void e() {
        c = new String[]{"Template(SQLiteDriverHandler_4=", ", name=", ", type=", ", defaults=", ", ipTemplate=", ", ladder=", ", ladderExpiry=", ""};
}

