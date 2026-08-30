package litebans;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class SilentHandler
implements Comparable {
    public static final LiteBansModule_220 AsyncBackgroundTask_21;
    private final BanHandler AsyncBackgroundTask_5;
    private final String LiteBansModule_401;
    private final String e;
    private final CharSequence LiteBansModule_31;
    private final String AsyncBackgroundTask_22;
    private final String LiteBansModule_240;
    private final String LiteBansModule_194;
    private final String g;
    private final long BroadcastService;
    private final long PunishmentTableService;
    private final byte i;
    private final boolean ServerSyncService;
    private final boolean CommandThrottleService;
    private final boolean n;
    private long c;
    private long BaseCoreGenericHandler;
    private String q;
    private String Utf8Handler_2;
    private CharSequence m;
    private boolean GnuSparseMapHandler;
    private SilentHandler(BanHandler a_2, String string, String string2, CharSequence charSequence, String string3, String string4, String string5, String string6, long l3, long l5, byte by2, boolean flag, boolean flag2, boolean flag3, long l7) {
        this.AsyncBackgroundTask_5 = a_2;
        this.LiteBansModule_401 = string;
        this.e = string2;
        this.LiteBansModule_31 = charSequence;
        this.AsyncBackgroundTask_22 = string3;
        this.LiteBansModule_240 = string4;
        this.LiteBansModule_194 = string5;
        this.g = string6;
        this.BroadcastService = l3;
        this.PunishmentTableService = l5;
        this.i = by2;
        this.ServerSyncService = flag;
        this.CommandThrottleService = flag2;
        this.n = flag3;
        this.c = l7;
    }

    public /* synthetic */ SilentHandler(BanHandler a_2, String string, String string2, CharSequence charSequence, String string3, String string4, String string5, String string6, long l3, long l5, byte by2, boolean flag, boolean flag2, boolean flag3, long l7, int n, LiteBansModule_14 aJ2) {
        if ((n & 0x400) != 0) {
            by2 = (byte)-1;
        }
        if ((n & 0x800) != 0) {
            flag = false;
        }
        if ((n & 0x1000) != 0) {
            flag2 = false;
        }
        if ((n & 0x2000) != 0) {
            flag3 = true;
        }
        if ((n & 0x4000) != 0) {
            l7 = -1L;
        }
        this(a_2, string, string2, charSequence, string3, string4, string5, string6, l3, l5, by2, flag, flag2, flag3, l7, null);
    }

    public final BanHandler ServerSyncService() {
        return this.AsyncBackgroundTask_5;
    }

    public final String DatabaseMonitorService() {
        return this.LiteBansModule_401;
    }

    public final String PunishmentTableService() {
        return this.e;
    }

    public final CharSequence LiteBansModule_31() {
        return this.LiteBansModule_31;
    }

    public final String e() {
        return this.AsyncBackgroundTask_22;
    }

    public final String LiteBansModule_433() {
        return this.LiteBansModule_240;
    }

    public final String m() {
        return this.LiteBansModule_194;
    }

    public final String GnuSparseMapHandler() {
        return this.g;
    }

    public final long BroadcastService() {
        return this.BroadcastService;
    }

    public final long LiteBansModule_401() {
        return this.PunishmentTableService;
    }

    public final byte r() {
        return this.i;
    }

    public final boolean AsyncBackgroundTask_5() {
        return this.ServerSyncService;
    }

    public final boolean LiteBansModule_240() {
        return this.CommandThrottleService;
    }

    public final boolean AsyncBackgroundTask_22() {
        return this.n;
    }

    public final long BaseCoreGenericHandler() {
        return this.c;
    }

    public final void BaseCoreGenericHandler(long l3) {
        this.c = l3;
    }

    public SilentHandler(@NotNull NoneHandler_2 cz2, @NotNull LiteBansModule_113 d92, @NotNull CharSequence charSequence) {
        LiteBansModule_65 c12 = cz2.g();
        LiteBansModule_65 c13 = c12;
        this(cz2.ServerSyncService(), d92.BaseCoreGenericHandler(), d92.c(), charSequence, cz2.AsyncBackgroundTask_5(), cz2.H(), cz2.LiteBansModule_31(), cz2.CommandThrottleService(), cz2.J(), cz2.DatabaseMonitorService(), c13 != null ? c13.LiteBansModule_194() : (byte)-1, cz2.B(), cz2.HoverTextFormatter(), !cz2.PunishmentTableService(), 0L, 16384, null);
    }

    public final long LiteBansModule_194() {
        return this.plugin;
    }

    public final void c(long l3) {
        this.plugin = l3;
    }

    public final String AsyncBackgroundTask_21() {
        return this.q;
    }

    public final void BaseCoreGenericHandler(@Nullable String string) {
        this.q = string;
    }

    public final String q() {
        return this.Utf8Handler_2;
    }

    public final void LiteBansModule_31(@Nullable String string) {
        this.Utf8Handler_2 = string;
    }

    public final CharSequence CommandThrottleService() {
        return this.m;
    }

    public final void BaseCoreGenericHandler(@Nullable CharSequence charSequence) {
        this.m = charSequence;
    }

    public final boolean c() {
        return this.GnuSparseMapHandler;
    }

    public final void BaseCoreGenericHandler(boolean flag) {
        this.GnuSparseMapHandler = flag;
    }

    public int BaseCoreGenericHandler(@NotNull SilentHandler dZ2) {
        return ObjectUtilities.BaseCoreGenericHandler(dZ2.BroadcastService, this.BroadcastService);
    }

    public final String g() {
        return this.AsyncBackgroundTask_5 == BanHandler.c ? ",warned" : "";
    }

    public final long n() {
        return this.HoverTextFormatter() ? -1L : this.PunishmentTableService - this.BroadcastService;
    }

    public final boolean i() {
        return this.CommandThrottleService && AsyncBackgroundTask_21.BaseCoreGenericHandler(this.e);
    }

    public final boolean LiteBansModule_31(long l3) {
        SilentHandler dZ2 = this;
        return !dZ2.HoverTextFormatter() && l3 >= this.PunishmentTableService;
    }

    public final boolean HoverTextFormatter() {
        return this.PunishmentTableService <= 0L;
    }

    public final String BaseCoreGenericHandler(@NotNull NoneHandler_2 cz2) {
        CharSequence charSequence;
        NoneHandler_2 cz3 = cz2;
        StringBuilder stringBuilder = new StringBuilder().append(cz3.B() ? "silent_" : "");
        switch (LiteBansModule_49.BaseCoreGenericHandler[cz3.ServerSyncService().ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5: {
                charSequence = cz3.ServerSyncService();
                break;
            }
            default: {
                SilentHandler dZ2 = this;
                charSequence = (!dZ2.HoverTextFormatter() ? "temp_" : "") + (cz3.HoverTextFormatter() ? "ip" : "") + cz3.ServerSyncService();
}
        return stringBuilder.append(charSequence).toString();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean BaseCoreGenericHandler(@Nullable String string, @Nullable String string2, long l3) {
        SilentHandler dZ2 = this;
        if (!AsyncBackgroundTask_21.BaseCoreGenericHandler(dZ2.DatabaseMonitorService(), string)) {
            dZ2 = this;
            flag = false;
            if (!AsyncBackgroundTask_21.BaseCoreGenericHandler(dZ2.LiteBansModule_240(), dZ2.PunishmentTableService(), string2, dZ2.i())) return false;
        }
        if (!this.n) return false;
        if (this.LiteBansModule_31(l3)) return false;
        return true;
    }

    public final void BaseCoreGenericHandler(@Nullable String string, @Nullable String string2, @NotNull CharSequence charSequence) {
        this.Utf8Handler_2 = string;
        this.q = string2;
        this.m = (charSequence).toString();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Entry(type=").append(this.AsyncBackgroundTask_5).append(", uuid=").append(this.LiteBansModule_401).append(", ip=").append(this.e).append(", reason=").append(this.LiteBansModule_31).append(", executorUUID=").append(this.AsyncBackgroundTask_22).append(", executorName=").append(this.LiteBansModule_240).append(", serverScope=").append(this.LiteBansModule_194).append(", serverOrigin=").append(this.g).append(", dateStart=").append(this.BroadcastService).append(", dateEnd=").append(this.PunishmentTableService).append(", template=").append(LiteBansModule_283.LiteBansModule_31(this.i)).append(", silent=");
        stringBuilder.append(this.ServerSyncService).append(", ipban=").append(this.CommandThrottleService).append(", active=").append(this.n).append(", SQLiteDriverHandler_4=").append(this.c).append(')');
        return stringBuilder.toString();
    }

    public int hashCode() {
        int n = this.AsyncBackgroundTask_5.hashCode();
        n = n * 31 + (this.LiteBansModule_401 == null ? 0 : this.LiteBansModule_401.hashCode());
        n = n * 31 + (this.e == null ? 0 : this.e.hashCode());
        n = n * 31 + this.LiteBansModule_31.hashCode();
        n = n * 31 + this.AsyncBackgroundTask_22.hashCode();
        n = n * 31 + (this.LiteBansModule_240 == null ? 0 : this.LiteBansModule_240.hashCode());
        n = n * 31 + (this.LiteBansModule_194 == null ? 0 : this.LiteBansModule_194.hashCode());
        n = n * 31 + (this.g == null ? 0 : this.g.hashCode());
        n = n * 31 + Long.hashCode(this.BroadcastService);
        n = n * 31 + Long.hashCode(this.PunishmentTableService);
        n = n * 31 + LiteBansModule_283.c(this.i);
        n = n * 31 + Boolean.hashCode(this.ServerSyncService);
        n = n * 31 + Boolean.hashCode(this.CommandThrottleService);
        n = n * 31 + Boolean.hashCode(this.n);
        n = n * 31 + Long.hashCode(this.c);
        return n;
    }

    public boolean equals(@Nullable Object targetObj) {
        if (this == targetObj) {
            return true;
        }
        if (!(targetObj instanceof SilentHandler)) {
            return false;
        }
        SilentHandler dZ2 = (SilentHandler)targetObj;
        if (this.AsyncBackgroundTask_5 != dZ2.AsyncBackgroundTask_5) {
            return false;
        }
        if (!ObjectUtilities.BaseCoreGenericHandler(this.LiteBansModule_401, dZ2.LiteBansModule_401)) {
            return false;
        }
        if (!ObjectUtilities.BaseCoreGenericHandler(this.e, dZ2.e)) {
            return false;
        }
        if (!ObjectUtilities.BaseCoreGenericHandler(this.LiteBansModule_31, dZ2.LiteBansModule_31)) {
            return false;
        }
        if (!ObjectUtilities.BaseCoreGenericHandler(this.AsyncBackgroundTask_22, dZ2.AsyncBackgroundTask_22)) {
            return false;
        }
        if (!ObjectUtilities.BaseCoreGenericHandler(this.LiteBansModule_240, dZ2.LiteBansModule_240)) {
            return false;
        }
        if (!ObjectUtilities.BaseCoreGenericHandler(this.LiteBansModule_194, dZ2.LiteBansModule_194)) {
            return false;
        }
        if (!ObjectUtilities.BaseCoreGenericHandler(this.g, dZ2.g)) {
            return false;
        }
        if (this.BroadcastService != dZ2.BroadcastService) {
            return false;
        }
        if (this.PunishmentTableService != dZ2.PunishmentTableService) {
            return false;
        }
        if (this.i != dZ2.i) {
            return false;
        }
        if (this.ServerSyncService != dZ2.ServerSyncService) {
            return false;
        }
        if (this.CommandThrottleService != dZ2.CommandThrottleService) {
            return false;
        }
        if (this.n != dZ2.n) {
            return false;
        }
        return this.c == dZ2.c;
    }

    public int compareTo(Object targetObj) {
        return this.plugintargetObj;
    }

    public /* synthetic */ SilentHandler(BanHandler a_2, String string, String string2, CharSequence charSequence, String string3, String string4, String string5, String string6, long l3, long l5, byte by2, boolean flag, boolean flag2, boolean flag3, long l7, LiteBansModule_14 aJ2) {
        this(a_2, string, string2, charSequence, string3, string4, string5, string6, l3, l5, by2, flag, flag2, flag3, l7);
    }

    static {
        SilentHandler.Utf8Handler_2();
        AsyncBackgroundTask_21 = new LiteBansModule_220(null);
    }

    private static final void Utf8Handler_2() {
        r = new String[]{",warned", "", "silent_", "", "temp_", "", "ip", "", "Entry(type=", ", uuid=", ", ip=", ", reason=", ", executorUUID=", ", executorName=", ", serverScope=", ", serverOrigin=", ", dateStart=", ", dateEnd=", ", template=", ", silent=", ", ipban=", ", active=", ", SQLiteDriverHandler_4="};
}

