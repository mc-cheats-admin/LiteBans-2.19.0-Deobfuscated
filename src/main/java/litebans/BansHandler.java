package litebans;

import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InternalAnnotation
public abstract class BansHandler
extends MessageHandler {
    private final String e;
    private String GnuSparseMapHandler;
    private final int i;
    private final long LiteBansModule_241;
    private final Logger LiteBansModule_195;
    private final LiteBansModule_162 Utf8Handler_2;
    private final LiteBansModule_162 g;
    private final LiteBansModule_162 AsyncBackgroundTask_5;
        public BansHandler(@NotNull PlatformPlugin plugin, @NotNull String string, @NotNull String string2, int n, long l3) {
        super(plugin);
        this.e = string;
        this.GnuSparseMapHandler = string2;
        this.i = n;
        this.LiteBansModule_241 = l3;
        this.LiteBansModule_195 = plugin.getLogger();
        this.Utf8Handler_2 = ProxyConnection.BaseCoreGenericHandler(BansHandler::c);
        this.g = ProxyConnection.BaseCoreGenericHandler(BansHandler::n);
        this.AsyncBackgroundTask_5 = ProxyConnection.BaseCoreGenericHandler(BansHandler::LiteBansModule_241);
    }

    public /* synthetic */ BansHandler(PlatformPlugin plugin, String string, String string2, int n, long l3, int n2, LiteBansModule_14 aJ2) {
        if ((n2 & 4) != 0) {
            string2 = "";
        }
        if ((n2 & 8) != 0) {
            n = 4096;
        }
        if ((n2 & 0x10) != 0) {
            l3 = 5000L;
        }
        this(plugin, string, string2, n, l3);
    }

    public final String Utf8Handler_2() {
        return this.e;
    }

    public final String i() {
        return this.GnuSparseMapHandler;
    }

    public final void BaseCoreGenericHandler(@NotNull String string) {
        this.GnuSparseMapHandler = string;
    }

    public final int GnuSparseMapHandler() {
        return this.i;
    }

    public final long AsyncBackgroundTask_5() {
        return this.LiteBansModule_241;
    }

    public final Logger m() {
        return this.LiteBansModule_195;
    }

    public final HashMap BaseCoreGenericHandler() {
        LiteBansModule_162 eE2 = this.Utf8Handler_2;
        return (HashMap)eE2.BaseCoreGenericHandler();
    }

    public final AtomicLong g() {
        LiteBansModule_162 eE2 = this.g;
        return (AtomicLong)eE2.BaseCoreGenericHandler();
    }

    public final AtomicLong LiteBansModule_195() {
        LiteBansModule_162 eE2 = this.AsyncBackgroundTask_5;
        return (AtomicLong)eE2.BaseCoreGenericHandler();
    }

    public boolean c(@NotNull String string) {
        return StringUtilities.BaseCoreGenericHandler(this.e, string, true);
    }

    public boolean LiteBansModule_403() {
        return true;
    }

    public boolean e() {
        return true;
    }

    public void BaseCoreGenericHandler(@NotNull CommandSenderWrapper sender) {
        ChatFormatter.BaseCoreGenericHandler(MessageHandler.BaseCoreGenericHandler, sender, GeoIPLookupService.BaseCoreGenericHandler((CharSequence)MessageKey.ValueHandler_2.BaseCoreGenericHandler("bans", (Object)this.g()), (CharSequence)"ipbans", this.LiteBansModule_195()), null, 4, null);
    }

    public abstract void BaseCoreGenericHandler(@NotNull String var1, @NotNull Connection var2, @NotNull LiteBansModule_83 var3, boolean var4);

    public Void BroadcastService() {
        AssertionUtilities.BaseCoreGenericHandler();
        throw new CommandExitException();
    }

    public final String LiteBansModule_31(@Nullable String string) {
        String string2;
        String string3;
        if (string == null || StringUtilities.BaseCoreGenericHandler((CharSequence)string, '#', false, 2, null)) {
            return "#";
        }
        String string4 = string3 = (String)this.plugin().get(string);
        if (string4 != null) {
            return string4;
        }
                boolean flag2 = ((ConfigService)((MessageHandler)targetObj).LiteBansModule_241().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_195().af();
        if (flag2) {
            LiteBansModule_90 cM2 = LiteBansModule_50.c.BaseCoreGenericHandler(string);
            if (cM2 == null) {
                return "#";
            }
            string2 = String.valueOf(cM2.BaseCoreGenericHandler());
        } else {
            string2 = LiteBansModule_243.BaseCoreGenericHandler(string);
        }
        targetObj = string2;
        ((Map)this.plugin()).put(string, targetObj);
        return targetObj;
    }

    public String BaseCoreGenericHandler(@NotNull UUID uUID) {
        String string = LiteBansModule_50.c.LiteBansModule_195(uUID.toString());
        if (string == null) {
            string = "#";
        }
        return string;
    }

    public final void BaseCoreGenericHandler(@NotNull LiteBansModule_83 ch2, @NotNull SilentHandler dZ2, @NotNull AtomicLong atomicLong, @NotNull AtomicLong atomicLong2) {
        String string = dZ2.PunishmentTableService();
        if (AllHandler_3.BaseCoreGenericHandler(ch2, null, string, dZ2.ServerSyncService(), false, false, 24, null) == null) {
            ch2.c(dZ2);
            if (dZ2.ServerSyncService() == BanHandler.LiteBansModule_241) {
                AtomicLong[] atomicLongArray = new AtomicLong[]{atomicLong, atomicLong2};
                int n = atomicLongArray.length;
                for (int i = 0; i < n; ++i) {
                    AtomicLong atomicLong3;
                    AtomicLong atomicLong4 = atomicLong3 = atomicLongArray[i];
                    atomicLong4.incrementAndGet();
                }
            }
        } else {
            this.LiteBansModule_241().getLogger().warning("Ignoring duplicate ban for " + string);
        }
    }

    public final void BaseCoreGenericHandler(@NotNull LiteBansModule_83 ch2, @Nullable String string, @NotNull String string2, long l3, long l5, @Nullable String string3, @Nullable UUID uUID, @Nullable UUID uUID2, @Nullable String string4, @NotNull AtomicLong atomicLong, @NotNull BanHandler a_2) {
        Object helperObj = uUID;
        if (helperObj == null || (helperObj = ((UUID)helperObj).toString()) == null) {
            helperObj = resultObj = this.LiteBansModule_31(string);
        }
        if ((contextObj = uUID2) == null || (contextObj = ((UUID)contextObj).toString()) == null) {
            contextObj = targetObj = this.LiteBansModule_31(string3);
        }
        if (string4 == null && StringUtilities.LiteBansModule_31((String)resultObj, "#", false, 2, null)) {
            return;
        }
        MessageHandler messageHandler = this;
        SilentHandler dZ2 = AllHandler_3.BaseCoreGenericHandler(ch2, (String)resultObj, string4, a_2, ((DatabaseMonitorService)messageHandler.LiteBansModule_241().BaseCoreGenericHandler(DatabaseMonitorService.class)).ServerSyncService(), false, false, 48, null);
        if (a_2 == BanHandler.c || dZ2 == null || !ObjectUtilities.BaseCoreGenericHandler((Object)dZ2.DatabaseMonitorService(), resultObj)) {
            boolean flag2 = string4 != null;
                        String string5 = ((ConfigService)((MessageHandler)tempObj).LiteBansModule_241().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_195().LiteBansModule_25();
                        tempObj = LiteBansModule_182.LiteBansModule_195.BaseCoreGenericHandler(((ConfigService)((MessageHandler)object6).LiteBansModule_241().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_195().BuilderactionHandler(), string5, this.LiteBansModule_241().HoverTextFormatter());
            object6 = new SilentHandler(a_2, (String)resultObj, string4, string2, (String)targetObj, string3, (String)tempObj, string5, l3, l5, 0, false, flag2, false, 0L, 27648, null);
            ch2.c((SilentHandler)object6);
            if (a_2 == BanHandler.LiteBansModule_241) {
                atomicLong.incrementAndGet();
                if (flag2) {
                    this.LiteBansModule_195().incrementAndGet();
                }
            }
        } else {
            this.LiteBansModule_241().getLogger().warning("Ignoring duplicate " + a_2 + " for " + string + " (ip=" + string4 + ')');
        }
        if (string != null && resultObj != null) {
            new LiteBansModule_222(this.LiteBansModule_241(), string, (String)resultObj, "#").run();
        }
        if (string3 != null && targetObj != null) {
            new LiteBansModule_222(this.LiteBansModule_241(), string3, (String)targetObj, "#").run();
        }
    }

    public static /* synthetic */ void BaseCoreGenericHandler(BansHandler fS2, LiteBansModule_83 ch2, String string, String string2, long l3, long l5, String string3, UUID uUID, UUID uUID2, String string4, AtomicLong atomicLong, BanHandler a_2, int n, Object targetObj) {
        if (targetObj != null) {
            throw new UnsupportedOperationException("");
        }
        if ((n & 0x40) != 0) {
            uUID = null;
        }
        if ((n & 0x80) != 0) {
            uUID2 = null;
        }
        if ((n & 0x100) != 0) {
            string4 = null;
        }
        if ((n & 0x200) != 0) {
            atomicLong = fS2.g();
        }
        if ((n & 0x400) != 0) {
            a_2 = BanHandler.LiteBansModule_241;
        }
        fS2.BaseCoreGenericHandler(ch2, string, string2, l3, l5, string3, uUID, uUID2, string4, atomicLong, a_2);
    }

    private static final HashMap c() {
        return new HashMap();
    }

    private static final AtomicLong n() {
        return new AtomicLong();
    }

    private static final AtomicLong LiteBansModule_241() {
        return new AtomicLong();
    }

    @Override
    public void run() {
        this.BroadcastService();
    }

    private static final void LiteBansModule_31() {
        LiteBansModule_403 = new String[]{"", "bans", "ipbans", "#", "#", "#", "Ignoring duplicate ban for ", "#", "Ignoring duplicate ", " for ", " (ip=", "#", "#", ""};
    }

    static {
        BansHandler.LiteBansModule_31();
    }
}

