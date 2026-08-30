package litebans;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import org.jetbrains.annotations.NotNull;

public final class ServerSyncService
extends PluginModule
implements Runnable {
    public static final LiteBansModule_303 GnuSparseMapHandler;
    private final LiteBansModule_161 q = ProxyConnection.BaseCoreGenericHandler(() -> ServerSyncService.BaseCoreGenericHandler(this));
    private final LiteBansModule_161 e = ProxyConnection.BaseCoreGenericHandler(() -> ServerSyncService.LiteBansModule_31(this));
    private final LiteBansModule_161 c = ProxyConnection.BaseCoreGenericHandler(() -> ServerSyncService.e(this));
    private final LiteBansModule_161 LiteBansModule_240 = ProxyConnection.BaseCoreGenericHandler(() -> ServerSyncService.AsyncBackgroundTask_5(this));
    private final AtomicBoolean Utf8Handler_2 = new AtomicBoolean();
    private final DatabaseSyncTask i = new DatabaseSyncTask(this.plugin);
    private long BroadcastService;
    private int r;
    private byte AsyncBackgroundTask_21;
    private byte[][] PunishmentTableService = new byte[0][];
    private final byte[][] g;
    private CopyOnWriteArrayList LiteBansModule_31;
    private final CopyOnWriteArrayList AsyncBackgroundTask_5;
    private final LiteBansModule_301 LiteBansModule_401;
    public static final char n;
    public static final String m;
    public ServerSyncService(@NotNull PlatformPlugin plugin) {
        super(plugin);
        byte[][] byArrayArray = new byte[4][];
        ServerSyncService u2 = this;
        while (n < 4) {
            int n2 = n++;
            byArrayArray[n2] = LiteBansModule_389.BaseCoreGenericHandler();
        }
        u2.g = byArrayArray;
        this.LiteBansModule_31 = new CopyOnWriteArrayList();
        this.AsyncBackgroundTask_5 = new CopyOnWriteArrayList();
        this.LiteBansModule_401 = new LiteBansModule_301(new AtomicLong(), new AtomicLong(), new AtomicLong());
    }

    public final ConfigService BaseCoreGenericHandler() {
        LiteBansModule_161 eE2 = this.q;
        return (ConfigService)eE2.BaseCoreGenericHandler();
    }

    public final DatabaseMonitorService AsyncBackgroundTask_5() {
        LiteBansModule_161 eE2 = this.e;
        return (DatabaseMonitorService)eE2.BaseCoreGenericHandler();
    }

    public final BroadcastService LiteBansModule_31() {
        LiteBansModule_161 eE2 = this.c;
        return (BroadcastService)eE2.BaseCoreGenericHandler();
    }

    public final PunishmentTableService g() {
        LiteBansModule_161 eE2 = this.LiteBansModule_240;
        return (PunishmentTableService)eE2.BaseCoreGenericHandler();
    }

    public final DatabaseSyncTask LiteBansModule_240() {
        return this.i;
    }

    public final int Utf8Handler_2() {
        return this.r;
    }

    public final void BaseCoreGenericHandler(int n) {
        this.r = n;
    }

    public final byte c() {
        return this.AsyncBackgroundTask_21;
    }

    public final void BaseCoreGenericHandler(byte by2) {
        this.AsyncBackgroundTask_21 = by2;
    }

    public final void BaseCoreGenericHandler(@NotNull byte[][] byArray) {
        this.PunishmentTableService = byArray;
    }

    public final CopyOnWriteArrayList GnuSparseMapHandler() {
        return this.LiteBansModule_31;
    }

    public final void BaseCoreGenericHandler(@NotNull CopyOnWriteArrayList copyOnWriteArrayList) {
        this.LiteBansModule_31 = copyOnWriteArrayList;
    }

    public final LiteBansModule_301 i() {
        return this.LiteBansModule_401;
    }

    public final boolean BaseCoreGenericHandler(@NotNull LiteBansModule_200 fa_02) {
        return this.AsyncBackgroundTask_5.add(fa_02);
    }

    public final boolean LiteBansModule_31(@NotNull LiteBansModule_200 fa_02) {
        return this.AsyncBackgroundTask_5.remove(fa_02);
    }

    public final LiteBansModule_56 LiteBansModule_31(int n) {
        Object v1;
{
            Iterable iterable = this.LiteBansModule_31;
            for (Object t2 : iterable) {
                Reference reference = (Reference)t2;
                LiteBansModule_56 bP2 = (LiteBansModule_56)reference.get();
                if (!((bP2 != null ? bP2.LiteBansModule_31() : -1) == n)) continue;
                v1 = t2;
                break;
}
        Reference reference = v1;
        return reference != null ? (LiteBansModule_56)reference.get() : null;
    }

    @Override
    public void e() {
        this.plugin().e();
        DiscordWebhookClient eG2 = this.plugin().LiteBansModule_194();
        if (DatabaseMonitorService.CommandThrottleService.BaseCoreGenericHandler(eG2.ElementsHandler()) && eG2.aS()) {
            this.Utf8Handler_2.set(false);
            eG2.LiteBansModule_4().LiteBansModule_31(this, eG2.LiteBansModule_18(), eG2.LiteBansModule_18());
}

    @Override
    public void LiteBansModule_31() {
        this.e();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void run() {
        AtomicBoolean atomicBoolean = this.Utf8Handler_2;
        Object targetObj = atomicBoolean;
        if (targetObj.compareAndSet(false, true)) {
            try {
                targetObj = this.AsyncBackgroundTask_5();
                flag2 = false;
                try {
                    LiteBansModule_82 ch2 = targetObj.LiteBansModule_194();
                    Closeable closeable = ch2;
                    Throwable throwable = null;
                    try {
                        Object contextObj = (LiteBansModule_82)closeable;
                        LiteBansModule_82 ch3 = ch2;
                        this.BroadcastService = this.plugin(ch3, this.AsyncBackgroundTask_5, this.BroadcastService);
                        contextObj = KotlinUnitHandler.BaseCoreGenericHandler;
                    }
                    catch (Throwable throwable2) {
                        throwable = throwable2;
                        throw throwable2;
                    }
                    finally {
                        BlockHandler.BaseCoreGenericHandler(closeable, throwable);
}
                catch (SQLException sQLException) {
                    if (!targetObj.LiteBansModule_31(sQLException)) {
                        throw sQLException;
}
            catch (SQLException sQLException) {
                this.AsyncBackgroundTask_5().BaseCoreGenericHandler(sQLException);
            }
            finally {
                AtomicBoolean atomicBoolean2 = atomicBoolean;
                flag2 = false;
                atomicBoolean2.set(false);
}

    private final void AsyncBackgroundTask_5(LiteBansModule_82 ch2) {
        long l3 = (this.LiteBansModule_401.LiteBansModule_194()).incrementAndGet();
        long l5 = l3 - (this.LiteBansModule_401.c()).get();
        if (l5 > 1L) {
            this.LiteBansModule_31(ch2);
}

    private final void LiteBansModule_31(LiteBansModule_82 ch2) {
        this.plugin().BaseCoreGenericHandler((Object)"[Sync] Detected duplicate server. This will be resolved ");
        LiteBansModule_389.BaseCoreGenericHandler(this.LiteBansModule_401, ResetHandler.LiteBansModule_401);
        Serializable serializable = ch2.e().getDataFolder();
        String string = "server.yml";
        LiteBansModule_112.LiteBansModule_31(new File((File)serializable, string));
        serializable = ch2.e().getDataFolder();
        string = "server.json";
        flag = false;
        LiteBansModule_112.LiteBansModule_31(new File((File)serializable, string));
        serializable = this.plugin().LiteBansModule_194().BaseCoreGenericHandler(true);
        this.plugin().LiteBansModule_194().LiteBansModule_31((String)((LiteBansModule_354)serializable).LiteBansModule_31());
        this.plugin().LiteBansModule_194().BaseCoreGenericHandler((String)((LiteBansModule_354)serializable).e());
        DatabaseMonitorService.BaseCoreGenericHandler(ch2.AsyncBackgroundTask_5(), ch2, 0L, false, 6, null);
    }

    public final void BaseCoreGenericHandler(@NotNull BroadcastHandler ij2, @NotNull LiteBansModule_82 ch2, @NotNull CharSequence charSequence, int n) {
        if (!this.AsyncBackgroundTask_5().AsyncBackgroundTask_21() || ch2.LiteBansModule_31()) {
            return;
        }
        Object targetObj = charSequence;
        int n2 = 4092;
        char c = '\u0000';
        String string = LiteBansModule_242.BaseCoreGenericHandler(targetObj.toString(), n2);
        targetObj = this.AsyncBackgroundTask_5().LiteBansModule_401();
        if (targetObj == null || targetObj.LiteBansModule_194() && n == -1) {
            ServerSyncService u2 = this;
            c = 'LiteBansModule_433';
            ConfigService configService = u2.BaseCoreGenericHandler();
            if (configService.g()) {
                ConfigService q_03 = configService;
                q_03.BaseCoreGenericHandler((Object)("0x11 <" + c + "> " + targetObj));
            }
            return;
        }
        try {
            boolean flag;
            char c10;
            int n3;
            n2 = targetObj.c();
            if (n != -1 && n != n2) {
                n2 = n;
            } else {
                (this.LiteBansModule_401.c()).incrementAndGet();
            }
            c = (ij2.AsyncBackgroundTask_5() << 16 | n2) + 42;
            Object resultObj = BansHandler_2.c;
            CharSequence charSequence2 = "info,msg";
            LiteBansModule_82 ch3 = ch2;
            Object helperObj = charSequence2;
            char c11 = ',';
            CharSequence charSequence3 = helperObj;
            for (n3 = 0; n3 < charSequence3.length(); ++n3) {
                char c12 = c10 = charSequence3.charAt(n3);
                flag = false;
                if (!(c12 == c11)) continue;
                ++n4;
            }
            int n5 = n4;
            helperObj = "?";
            if (n5 > 0) {
                StringBuilder stringBuilder = new StringBuilder(n5 * 2);
                Iterable iterable = new LiteBansModule_166(0, n5);
                Iterator iterator = iterable.iterator();
                while (iterator.hasNext()) {
                    n3 = n4 = ((LiteBansModule_290)iterator).LiteBansModule_31();
                    c10 = '\u0000';
                    stringBuilder.append("?,");
                }
                helperObj = StringUtilities.LiteBansModule_31(stringBuilder.toString(), 1);
            }
            BansHandler_2 kL2 = resultObj;
            flag5 = false;
            resultObj = ch3.c(SQLiteDriverHandler.AsyncBackgroundTask_5(SQLiteDriverHandler.e("INSERT INTO " + kL2 + '(' + charSequence2 + ")VALUES(" + helperObj + ')'))).BaseCoreGenericHandler(c);
            helperObj = contextObj = resultObj;
            this.BaseCoreGenericHandler(string);
            LiteBansModule_184.AsyncBackgroundTask_5((LiteBansModule_60)contextObj);
            resultObj = this;
            LiteBansModule_82 ch4 = ch2;
            helperObj = (AsyncBackgroundTask_20)ch4.e().BaseCoreGenericHandler(AsyncBackgroundTask_20.class);
            long l3 = System.currentTimeMillis();
            if (l3 - ch4.AsyncBackgroundTask_5().i() > 28800000L) {
                ch4.AsyncBackgroundTask_5().LiteBansModule_31(l3);
                charSequence3 = "1 minute";
                if (ObjectUtilities.BaseCoreGenericHandler((Object)this.BaseCoreGenericHandler().LiteBansModule_194().ElementsHandler(), (Object)"pgsql")) {
                    charSequence3 = '\'' + (String)charSequence3 + '\'';
                }
                Object tempObj = BansHandler_2.c;
                n4 = 0;
                tempObj = SQLiteDriverHandler.e("DELETE FROM " + tempObj);
                CharSequence charSequence4 = "time < (NOW() - INTERVAL " + (String)charSequence3 + ')';
                LiteBansModule_82 ch5 = ch4;
                c10 = '\u0000';
                CharSequence[] charSequenceArray = new CharSequence[]{SQLiteDriverHandler.AsyncBackgroundTask_5((String)tempObj), charSequence4};
                flag = false;
                CharSequence[] charSequenceArray2 = charSequenceArray;
                int n6 = charSequenceArray2.length;
                for (int i = 0; i < n6; ++i) {
                    CharSequence charSequence5;
                    CharSequence charSequence6 = charSequence5 = charSequenceArray2[i];
                    if (charSequence6.length() > 0) continue;
                    String string2 = "Failed ";
                    throw new IllegalArgumentException(string2.toString());
                }
                LiteBansModule_184.AsyncBackgroundTask_5(ch5.c(SQLiteDriverHandler.AsyncBackgroundTask_5(SQLiteDriverHandler.e(SQLiteDriverHandler.LiteBansModule_31((String)tempObj) + " WHERE " + charSequence4))));
                tempObj = helperObj;
                ((AsyncBackgroundTask_20)tempObj).BaseCoreGenericHandler(ch4);
}
        catch (SQLException sQLException) {
            this.AsyncBackgroundTask_5().BaseCoreGenericHandler(sQLException);
}

    public static /* synthetic */ void BaseCoreGenericHandler(ServerSyncService u2, BroadcastHandler ij2, LiteBansModule_82 ch2, CharSequence charSequence, int n, int n2, Object targetObj) {
        if ((n2 & 4) != 0) {
            charSequence = "";
        }
        if ((n2 & 8) != 0) {
            n = -1;
        }
        u2.BaseCoreGenericHandler(ij2, ch2, charSequence, n);
    }

    public void BaseCoreGenericHandler(@NotNull LiteBansModule_82 v1, @NotNull String v2, @NotNull String v3, @NotNull BroadcastHandler arg1, @NotNull Set arg2) {
{
                    if (v2.length() != 36) {
                        return;
                    }
                    arg3 = arg1;
                    switch (LiteBansModule_384.BaseCoreGenericHandler[arg3.ordinal()]) {
                        case 6: {
                            v0 = BanHandler.LiteBansModule_240;
                            break;
                        }
                        case 7: {
                            v0 = BanHandler.GnuSparseMapHandler;
                            break;
                        }
                        case 8: {
                            v0 = BanHandler.c;
                            break;
                        }
                        case 9:
                        case 10: {
                            v0 = BanHandler.g;
                            break;
                        }
                        case 11: {
                            v0 = BanHandler.LiteBansModule_240;
                            break;
                        }
                        case 12: {
                            v0 = BanHandler.GnuSparseMapHandler;
                            break;
                        }
                        default: {
}
                    arg4 = v0;
                    if (arg4 == null) {
                        arg3 = this.plugin();
                        if (arg3.g()) {
                            arg5 = arg3;
                            arg5.BaseCoreGenericHandler((Object)("[!!!] NF " + arg1));
                        }
                        return;
                    }
                    if (arg1 == BroadcastHandler.AsyncBackgroundTask_21) {
                        arg3 = this.g();
                        arg6 = CollectionUtilities.BaseCoreGenericHandler((Iterable)arg3.BaseCoreGenericHandler().LiteBansModule_31().entrySet(), (LiteBansModule_178)new LiteBansModule_77(v2, v3));
                        if (arg6) {
                            arg3.BaseCoreGenericHandler(v2, v3);
                        }
                        return;
                    }
                    if (arg2.isEmpty()) break;
                    if (arg1.BaseCoreGenericHandler() || arg2.contains(v2)) break;
                    if ((v3).length() == 0) break;
                    arg3 = v1.e().q();
                    for (Object arg7 : arg3) {
                        arg8 = (Object[])arg7;
                        if (!SilentHandler.AsyncBackgroundTask_21.BaseCoreGenericHandler(true, arg8.LiteBansModule_31(), v3, SilentHandler.AsyncBackgroundTask_21.BaseCoreGenericHandler(v3))) continue;
                        break;
}
                if (!v1) break;
            }
            return;
        }
        v2 = AllHandler_3.BaseCoreGenericHandler(v1, v2, v3, arg4, true, false, 16, null);
        if (v2 == null) {
            return;
        }
        arg3 = v2;
        arg9 = DatabaseMonitorService.BaseCoreGenericHandler(v1.AsyncBackgroundTask_5(), false, 1, null);
        if (v1.e().AsyncBackgroundTask_22() == 1) {
            arg7 = this.LiteBansModule_31();
            if (arg1 == BroadcastHandler.DatabaseMonitorService) {
                litebans.BroadcastService.BaseCoreGenericHandler((BroadcastService)arg7, v1, (SilentHandler)arg3, null, 2, null);
            } else if (arg1 == BroadcastHandler.GnuSparseMapHandler) {
                arg10 = arg7.BaseCoreGenericHandler.q();
                arg11 = arg10;
                arg12 = new ArrayList<PunishmentService>();
                for (Object arg13 : arg11) {
                    arg14 = (CommandSenderWrapper)arg13;
                    if (!arg3.BaseCoreGenericHandler(arg14.BaseCoreGenericHandler(), arg14.LiteBansModule_31(), arg9)) continue;
                    arg12.add(arg13);
                }
                arg10 = (List)arg12;
                arg11 = arg10.iterator();
                while (arg11.hasNext()) {
                    arg12 = arg11.next();
                    arg15 = (CommandSenderWrapper)arg12;
                    ObjectUtilities.BaseCoreGenericHandler(arg15);
                    arg7.BaseCoreGenericHandler(v1, arg15);
}
        arg16 = v1.e().q();
        arg8 = arg16;
        arg17 = new ArrayList<PunishmentService>();
        for (Object arg18 : arg8) {
            arg19 = (CommandSenderWrapper)arg18;
            if (!arg3.BaseCoreGenericHandler(arg19.BaseCoreGenericHandler(), arg19.LiteBansModule_31(), arg9)) ** GOTO lbl-1000
            v3 = arg19.LiteBansModule_240();
            if (v3 == null) {
                v3 = v1.AsyncBackgroundTask_5().ServerSyncService();
            }
            if ((v4 = arg3.m()) == null) {
                v4 = LiteBansModule_181.LiteBansModule_194.LiteBansModule_31();
            }
            if (LiteBansModule_181.LiteBansModule_194.BaseCoreGenericHandler(v3, v4)) {
            } else lbl-1000:
                        {
            }
            if (!v5) continue;
            arg17.add(arg18);
        }
        arg16 = (List)arg17;
        arg8 = arg16.iterator();
        while (arg8.hasNext()) {
            arg17 = arg8.next();
            arg20 = (CommandSenderWrapper)arg17;
            v6 = arg4;
            switch (v6 == null ? -1 : LiteBansModule_388.BaseCoreGenericHandler[v6.ordinal()]) {
                case 1: {
                    ObjectUtilities.BaseCoreGenericHandler(arg20);
                    if (!CommandArgumentUtils.BaseCoreGenericHandler(v1, (SilentHandler)arg3, arg20)) break;
                    this.LiteBansModule_31().BaseCoreGenericHandler(arg20, GeoIPLookupService.BaseCoreGenericHandler(v1, (SilentHandler)arg3, arg20, -1));
                    break;
                }
                case 2: {
                    this.g().BaseCoreGenericHandler(v2, (SilentHandler)arg3);
                    if (!this.plugin().LiteBansModule_194().aU()) break;
                    arg21 = this.LiteBansModule_31();
                    ObjectUtilities.BaseCoreGenericHandler(arg20);
                    arg21.BaseCoreGenericHandler(v1, arg20, (SilentHandler)arg3, -1, "muted");
                    break;
                }
                case 3: {
                    if (!this.plugin().LiteBansModule_194().aU()) break;
                    v1.LiteBansModule_31(v2);
                    arg22 = this.LiteBansModule_31();
                    ObjectUtilities.BaseCoreGenericHandler(arg20);
                    arg22.BaseCoreGenericHandler(v1, arg20, (SilentHandler)arg3, -1, "warned");
                    break;
                }
                case 4: {
                    v7 = this.LiteBansModule_31();
                    ObjectUtilities.BaseCoreGenericHandler(arg20);
                    v7.BaseCoreGenericHandler(arg20, GeoIPLookupService.BaseCoreGenericHandler(v1, (SilentHandler)arg3, arg20));
}

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Could not resolve type clashes
     * Unable to fully structure code
     */
    public final long BaseCoreGenericHandler(@NotNull LiteBansModule_82 v1, @NotNull Collection v2, long v3) {
{
            arg23 = 0L;
            arg23 = v3;
            try {
                arg2 = v1.AsyncBackgroundTask_5().LiteBansModule_401();
                if (v1.LiteBansModule_31() || arg2 == null) {
                                        arg25 = 'AsyncBackgroundTask_21';
                    arg26 = arg24.BaseCoreGenericHandler();
                    if (arg26.g()) {
                        arg27 = arg26;
                        arg27.BaseCoreGenericHandler((Object)("0x11 <" + arg25 + "> " + arg2));
                    }
                    return arg23;
                }
                v6 = this.plugin().LiteBansModule_194().LiteBansModule_12();
                arg28 = v1.e().q();
                arg28 = (Object[])arg28;
                arg29 = arg28;
                arg30 = new ArrayList<PunishmentService>(((Object[])arg28).length);
                for (Object arg31 : arg29) {
                    arg32 = (CommandSenderWrapper)arg31;
                    arg33 = arg30;
                    arg34 = arg32.BaseCoreGenericHandler();
                    arg33.add(arg34);
                }
                v7 = CollectionUtilities.g((List)arg30);
                if (v7.size() <= 0) {
                    arg28 = v1.AsyncBackgroundTask_5();
                    arg28.BaseCoreGenericHandler((byte)(arg28.AsyncBackgroundTask_22() + 1));
                    if (arg28.AsyncBackgroundTask_22() < v6) {
                        return arg23;
                    }
                    v1.AsyncBackgroundTask_5().BaseCoreGenericHandler((byte)0);
                }
                arg35 = DatabaseMonitorService.BaseCoreGenericHandler(v1.AsyncBackgroundTask_5(), false, 1, null);
                if (arg23 == 0L) {
                    arg30 = BansHandler_2.c;
                    arg36 = "SQLiteDriverHandler_4";
                    arg29 = LiteBansModule_184.AsyncBackgroundTask_5(v1.c(SQLiteDriverHandler.AsyncBackgroundTask_5(SQLiteDriverHandler.BaseCoreGenericHandler(SQLiteDriverHandler.BaseCoreGenericHandler(SQLiteDriverHandler.e("SELECT " + arg36 + " FROM " + arg30), "SQLiteDriverHandler_4"), (Number)1))));
                    if (arg29.next()) {
                        arg23 = arg29.getLong("SQLiteDriverHandler_4");
                        arg30 = this.plugin();
                        if (arg30.g()) {
                            arg33 = arg30;
                            arg34 = "L+ " + arg23;
                            arg33.BaseCoreGenericHandler(arg34);
}
                arg29 = LiteBansModule_184.AsyncBackgroundTask_5(v1.c((CharSequence)("SELECT * FROM " + BansHandler_2.c + " WHERE SQLiteDriverHandler_4>?")).BaseCoreGenericHandler(arg23));
                while (arg29.next()) {
{
                        arg37 = arg29.getLong("SQLiteDriverHandler_4");
                        arg38 = arg29.getLong("info") - (long)42;
                        arg39 = LiteBansModule_72.LiteBansModule_31((int)(arg38 & 65535L));
                        arg40 = arg38 >> 16;
                        arg41 = v1.AsyncBackgroundTask_5().BaseCoreGenericHandler(v1, arg39, true);
                        arg23 = Math.max(arg23, arg37);
                        if (arg41 == null) {
                                                        arg43 = 108;
                            arg44 = arg42.BaseCoreGenericHandler();
                            if (!arg44.g()) continue;
                            arg45 = arg44;
                            arg45.BaseCoreGenericHandler((Object)("0x11 <" + (char)arg43 + "> " + arg41));
                            continue;
                        }
                        if (arg39 == arg2.c()) {
                            this.AsyncBackgroundTask_5(v1);
                            continue;
                        }
                        arg42 = arg29.getString("msg");
                        arg46 = BroadcastHandler.LiteBansModule_401.BaseCoreGenericHandler((int)arg40);
                        if (arg46 == null) {
                                                        arg48 = 'c';
                            arg49 = arg40;
                            arg50 = arg47.BaseCoreGenericHandler();
                            if (!arg50.g()) continue;
                            arg51 = arg50;
                            arg51.BaseCoreGenericHandler((Object)("0x11 <" + arg48 + "> " + arg49));
                            continue;
                        }
                        (this.LiteBansModule_401.BaseCoreGenericHandler()).incrementAndGet();
                        arg52 = this.plugin();
                        if (arg52.g()) {
                            arg33 = arg52;
                            arg34 = "SQLiteDriverHandler_4: " + arg37 + ", type: " + arg40 + ", server: " + LiteBansModule_72.c(arg39) + ", message: \"" + (String)arg42 + '\"';
                            arg33.BaseCoreGenericHandler(arg34);
                        }
                        arg52 = arg42;
                        if (StringUtilities.BaseCoreGenericHandler(arg52, (CharSequence)"server", false, 2, null) || StringUtilities.BaseCoreGenericHandler((CharSequence)(arg52 = arg42), (CharSequence)"Server", false, 2, null)) {
                            arg53 = MessageKey.BaseCoreGenericHandler(arg41.e(), false);
                            arg52 = arg53;
                            arg53 = arg42;
                            arg42 = GeoIPLookupService.BaseCoreGenericHandler(GeoIPLookupService.BaseCoreGenericHandler(arg53, (CharSequence)"server", arg52), (CharSequence)"playerServer", arg52);
                        }
                        arg52 = v2;
                        if (arg52 instanceof Collection && ((Collection)arg52).isEmpty()) {
                        } else {
                            for (T arg54 : arg52) {
                                arg55 = (LiteBansModule_200)arg54;
                                if (!(arg55.BaseCoreGenericHandler((LiteBansModule_15)arg41, arg46, (String)arg42) == false)) continue;
                                break;
}
                    if (v0) {
                                                v1 = arg52.BaseCoreGenericHandler();
                        arg56 = AbstractCommand.AsyncBackgroundTask_5;
                        arg57 = "0x11 <PluginHookService> " + arg40;
                        if (ObjectUtilities.BaseCoreGenericHandler(arg57, (Object)"sort")) {
                            arg58 = new String[]{"00"};
                            v2 = arg58;
                        } else {
                            arg58 = new String[]{"01:" + arg57};
                            v2 = arg58;
                        }
                        arg59 = v2;
                        new LiteBansModule_403(v1, Arrays.copyOf(arg59, arg59.length)).LiteBansModule_31();
                        continue;
                    }
                    arg60 = arg61 = this.plugin().LiteBansModule_194();
                    switch (LiteBansModule_388.LiteBansModule_31[arg46.ordinal()]) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5: {
                            v3 = arg42;
                            ObjectUtilities.c(v3, "element");
                            arg52 = LiteBansModule_303.BaseCoreGenericHandler(ServerSyncService.GnuSparseMapHandler, (String)v3, 0, 2, null);
                            this.plugin(v1, HexEncodingHelper.LiteBansModule_194(arg52[0]), arg52[1], arg46, v7);
                            v4 = KotlinUnitHandler.BaseCoreGenericHandler;
                            break;
                        }
                        case 6:
                        case 7: {
                            if (!arg60.AsyncBackgroundTask_21()) ** GOTO lbl186
                            v5 = arg42;
                            ObjectUtilities.c(v5, "element");
                            arg52 = ServerSyncService.GnuSparseMapHandler.BaseCoreGenericHandler((String)v5, 3);
                            v6 = (String)ArrayUtilities.BaseCoreGenericHandler((Object[])arg52, 1);
                            if (v6 == null) {
                                v6 = "BAN";
                            }
                            arg62 = v6;
                            arg63 = arg62.toUpperCase(Locale.ROOT);
                            arg64   = BanHandler.values();
                            arg65 = arg64  .length;
                            for (arg66 = 0; arg66 < arg65; arg66 += 1) {
                                arg67 = arg68 = arg64  [arg66];
                                if (!ObjectUtilities.BaseCoreGenericHandler(arg67.name(), arg63)) {
                                    continue;
                                }
                                ** GOTO lbl177
                            }
                            throw new NoSuchElementException("Array contains no element matching the predicate + ");
                                                        arg62 = arg68;
                            v7 = (String)ArrayUtilities.BaseCoreGenericHandler((Object[])arg52, 2);
                            if (v7 == null) {
                                v7 = v1.AsyncBackgroundTask_5().ServerSyncService();
                            }
                            arg64   = v7;
                            arg69 = this.LiteBansModule_31();
                            litebans.BroadcastService.BaseCoreGenericHandler(arg69, v1, arg52[0], arg46, (BanHandler)arg62, (String)arg64  , false, false, null, 112, null);
                                                        v4 = KotlinUnitHandler.BaseCoreGenericHandler;
                            break;
                        }
                        case 8: {
                            arg70 = this.LiteBansModule_31();
                            v8 = arg42;
                            ObjectUtilities.c(v8, "element");
                            litebans.BroadcastService.BaseCoreGenericHandler(arg70, v1, v8, "console", null, null, arg60.AsyncBackgroundTask_21() != false && arg60.LiteBansModule_14() != false && arg60.B() != false, false, null, 108, null);
                            v4 = KotlinUnitHandler.BaseCoreGenericHandler;
                            break;
                        }
                        case 9: {
                            v9 = arg42;
                            ObjectUtilities.c(v9, "element");
                            arg52 = LiteBansModule_303.BaseCoreGenericHandler(ServerSyncService.GnuSparseMapHandler, (String)v9, 0, 2, null);
                            arg71 = arg52[0];
                            arg72 = arg52[1];
                            arg73 = this.LiteBansModule_31();
                            litebans.BroadcastService.BaseCoreGenericHandler(arg73, v1, arg72, arg71, null, null, arg60.AsyncBackgroundTask_21(), false, null, 108, null);
                            v4 = KotlinUnitHandler.BaseCoreGenericHandler;
                            break;
                        }
                        case 10: {
                            if (arg60.aU()) {
                                v10 = arg42;
                                ObjectUtilities.c(v10, "element");
                                arg52 = LiteBansModule_303.BaseCoreGenericHandler(ServerSyncService.GnuSparseMapHandler, (String)v10, 0, 2, null);
                                this.LiteBansModule_31().LiteBansModule_31(arg52[0], arg52[1], false);
                            }
                            v4 = KotlinUnitHandler.BaseCoreGenericHandler;
                            break;
                        }
                        case 11: {
                            arg74 = this.LiteBansModule_31();
                            v11 = arg42;
                            ObjectUtilities.c(v11, "element");
                            litebans.BroadcastService.BaseCoreGenericHandler(arg74, v1, v11, arg46, null, null, arg60.ExceptionHandler() != false && arg60.LockdownCommandHandler() != false && arg60.aU() != false, false, null, 108, null);
                            v4 = KotlinUnitHandler.BaseCoreGenericHandler;
                            break;
                        }
                        case 12: {
                            arg75 = this.LiteBansModule_31();
                            v12 = arg42;
                            ObjectUtilities.c(v12, "element");
                            litebans.BroadcastService.BaseCoreGenericHandler(arg75, v1, v12, arg46, BanHandler.GnuSparseMapHandler, null, arg60.aU(), false, null, 104, null);
                            v4 = KotlinUnitHandler.BaseCoreGenericHandler;
                            break;
                        }
                        case 13: {
                            arg76 = arg60.LiteBansModule_4().q();
                            ObjectUtilities.BaseCoreGenericHandler(arg76);
                            if (!(arg76.length == 0 == false)) ** GOTO lbl299
                            v13 = arg42;
                            ObjectUtilities.c(v13, "element");
                            arg52 = ServerSyncService.GnuSparseMapHandler.BaseCoreGenericHandler((String)v13, 8);
                            arg77 = HexEncodingHelper.LiteBansModule_194(arg52[0]);
                            arg78 = arg52[1];
                            arg79 = arg52[2];
                            arg80 = arg52[3];
                            arg68 = ServerSyncService.GnuSparseMapHandler;
                            arg67 = (String)ArrayUtilities.BaseCoreGenericHandler((Object[])arg52, 4);
                            arg65 = (int)ObjectUtilities.BaseCoreGenericHandler(arg67, (Object)"1");
                            arg67 = ServerSyncService.GnuSparseMapHandler;
                            arg81 = (String)ArrayUtilities.BaseCoreGenericHandler((Object[])arg52, 5);
                            arg82 = ObjectUtilities.BaseCoreGenericHandler(arg81, (Object)"1");
                            v14 = (String)ArrayUtilities.BaseCoreGenericHandler((Object[])arg52, 6);
                            arg83 = v14 != null && (v14 = LiteBansModule_232.BaseCoreGenericHandler((String)v14)) != null ? (byte)v14.BaseCoreGenericHandler() : -1;
                            v15 = (String)ArrayUtilities.BaseCoreGenericHandler((Object[])arg52, 7);
                            arg84 = v15 != null && (v15 = StringUtilities.BaseCoreGenericHandler((String)v15)) != null ? v15.intValue() : 0;
                            arg85 = arg76;
                            arg86 = ((CommandSenderWrapper[])arg85).length;
                            for (arg87 = 0; arg87 < arg86; ++arg87) {
                                arg88 = arg89 = arg85[arg87];
                                if (!StringUtilities.BaseCoreGenericHandler(arg88.i(), arg79, true)) continue;
                                v16 = arg89;
                                ** GOTO lbl267
                            }
                            v16 = arg90 = null;
                                                        if (arg90 != null) {
                                v17 = v1.AsyncBackgroundTask_5().BaseCoreGenericHandler((CommandSenderWrapper)arg90);
                                if (v17 == null) {
                                    v17 = v1.AsyncBackgroundTask_5().ServerSyncService();
                                }
                                arg91 = v17;
                                arg85 = new SilentHandler(BanHandler.g, arg90.BaseCoreGenericHandler(), arg90.LiteBansModule_31(), arg80, arg77, arg78, LiteBansModule_181.LiteBansModule_194.LiteBansModule_31(), (String)arg91, arg35, -1L, arg83, (boolean)arg65, false, false, 0L, 16384, null);
                                v18 = arg60.LiteBansModule_4().z().BaseCoreGenericHandler("kick");
                                ObjectUtilities.LiteBansModule_31(v18, "");
                                arg92 = (KickHandler)v18;
                                v19 = this.plugin().AsyncBackgroundTask_21().BaseCoreGenericHandler(BanHandler.g, arg83);
                                if (v19 == null) {
                                    v19 = LiteBansModule_65.LiteBansModule_31.BaseCoreGenericHandler();
                                }
                                arg93 = v19;
                                arg88 = BanHandler.g;
                                arg94 = new LiteBansModule_297(arg90.i(), arg90.BaseCoreGenericHandler(), arg90.LiteBansModule_31(), new Date());
                                v20 = arg78;
                                if (v20 == null) {
                                    v20 = "";
                                }
                                arg95 = v20;
                                arg96 = arg85.GnuSparseMapHandler();
                                v21 = arg85.m();
                                if (v21 == null) {
                                    v21 = LiteBansModule_181.LiteBansModule_194.LiteBansModule_31();
                                }
                                arg97 = v21;
                                arg89 = new NoneHandler_2((BanHandler)arg88, false, (boolean)arg65, arg82, false, false, false, false, false, false, false, false, false, false, arg35, 0L, 0L, 0, arg93, null, false, null, arg84, null, arg94, null, null, (CommandSenderWrapper)arg90, (String)arg95, arg77, arg97, (String)arg96, null, null, null, null, null, 112967666, 31, null);
                                arg89.LiteBansModule_31((SilentHandler)arg85);
                                arg88 = arg92;
                                arg88.BaseCoreGenericHandler((NoneHandler_2)arg89, v1, (CommandSenderWrapper)arg90);
                            }
                                                        v4 = KotlinUnitHandler.BaseCoreGenericHandler;
                            break;
                        }
                        case 14: {
                            arg98 = v1.AsyncBackgroundTask_5();
                            arg99 = 21600000 + new LiteBansModule_324(0L, 1, null).BaseCoreGenericHandler(32400000);
                            arg98.BaseCoreGenericHandler(arg35 + (long)arg99);
                            this.r = 0;
                            v4 = KotlinUnitHandler.BaseCoreGenericHandler;
                            break;
                        }
                        case 15: {
                            ServerSyncService.BaseCoreGenericHandler(this, BroadcastHandler.CommandThrottleService, v1, arg42, 0, 8, null);
                            v4 = KotlinUnitHandler.BaseCoreGenericHandler;
                            break;
                        }
                        case 16: {
                            DatabaseMonitorService.BaseCoreGenericHandler(v1.AsyncBackgroundTask_5(), v1, this.plugin().LiteBansModule_194().LiteBansModule_18() * (long)2, false, 4, null);
                            v4 = KotlinUnitHandler.BaseCoreGenericHandler;
                            break;
                        }
                        case 17: {
                            v1.AsyncBackgroundTask_5().BroadcastService();
                            v4 = KotlinUnitHandler.BaseCoreGenericHandler;
                            break;
                        }
                        default: {
                            v4 = KotlinUnitHandler.BaseCoreGenericHandler;
}
                arg100 = this.plugin().LiteBansModule_194().NullHandler_8();
                if (arg100 <= 0 || this.r > 0 && this.AsyncBackgroundTask_21 < 32) break;
                this.r = 0;
                arg101 = new ArrayList<PunishmentService>(6000);
                arg102 = new int[4];
                arg103 = System.currentTimeMillis();
                arg43 = arg100 * 2;
                if (arg43 >= 60000) {
                    arg43 = arg100;
                }
                arg104 = this.plugin(v1, arg43);
                arg44 = new HashSet<PunishmentService>(6000);
                arg105 = new HashMap<K, V>();
                arg106 = arg104;
                arg107 = (AutoCloseable)arg106;
                try {
                    arg108 = (ResultSet)arg107;
                    while (arg106.next()) {
                        arg109 = arg106;
                        arg67 = arg109.getString("name");
                        arg110 = arg67.toLowerCase(Locale.ENGLISH);
                        if (arg110.length() < 2) continue;
                        if (arg110.charAt(0) == '.' || arg110.charAt(0) == '*') {
                            arg110 = arg110.substring(1);
                        }
                        if (!arg44.add(arg110)) continue;
                        v22 = arg109.getTimestamp("date");
                        arg111 = v22 != null ? v22.getTime() : System.currentTimeMillis();
                        ((Collection)arg101).add(LiteBansModule_371.BaseCoreGenericHandler(arg111, arg110));
                    }
                    arg108 = KotlinUnitHandler.BaseCoreGenericHandler;
                }
                catch (Throwable arg112) {
                    arg113 = arg112;
                    throw arg112;
                }
                finally {
                    CloseactionHandler.BaseCoreGenericHandler((AutoCloseable)arg107, (Throwable)arg113);
                }
                if (arg44.size() <= 5) {
                    this.r = 1;
                    return arg23;
                }
                arg106 = arg101;
                if (arg106.size() > 1) {
                    CollectionUtilities.BaseCoreGenericHandler((List)arg106, new LiteBansModule_317());
                }
                arg106 = CollectionUtilities.BaseCoreGenericHandler((Iterable)arg101, arg100);
                arg107 = arg106.iterator();
                while (arg107.hasNext()) {
                    arg113 = arg107.next();
                    arg108 = (LiteBansModule_354)arg113;
                    arg114 = this.plugin(StringUtilities.BaseCoreGenericHandler(arg108.e()));
                    arg115 = (Map)arg105;
                    arg67 = arg114;
                    arg116 = arg115.get(arg67);
                    if (arg116 == null) {
                        arg117 = new ArrayList<PunishmentService>((32 + arg101.size()) / 5);
                        arg115.put(arg67, arg117);
                        v23   = arg117;
                    } else {
                        v23   = arg116;
                    }
                    arg89 = (List)v23  ;
                    ((Collection)arg89).add(arg108);
                    arg102[arg114] = arg102[arg114] + (((String)arg108.e()).length() + 1);
                }
                arg118 = arg106 = (SortHandler)LiteBansModule_4.BaseCoreGenericHandler.BaseCoreGenericHandler().BaseCoreGenericHandler();
                synchronized (arg118) {
                    if (this.AsyncBackgroundTask_21 >= 20 && arg35 - v1.AsyncBackgroundTask_5().LiteBansModule_31() > 57600000L) {
                        this.c(v1);
                        arg113 = LiteBansModule_397.BaseCoreGenericHandler();
                    } else {
                        arg113 = this.plugin(v1);
                    }
                    arg119 = ((Object[])this.g).length;
                    arg120   = new byte[arg119][];
                    while (arg121 < arg119) {
                        arg122 = arg121++;
                        arg120  [arg122] = LiteBansModule_389.BaseCoreGenericHandler();
                    }
                    arg67 = arg120  ;
                    arg123 = arg113;
                    arg120   = (byte[][])((AutoCloseable)arg123);
                    try {
                        arg124 = (ResultSet)arg120  ;
                        while (arg123.next()) {
                            arg125 = arg123;
                            arg67[arg125.getInt((String)"SQLiteDriverHandler_4")] = arg125.getBytes("LiteBansModule_31");
                        }
                        arg124 = KotlinUnitHandler.BaseCoreGenericHandler;
                    }
                    catch (Throwable arg126) {
                        arg127 = arg126;
                        throw arg126;
                    }
                    finally {
                        CloseactionHandler.BaseCoreGenericHandler((AutoCloseable)arg120  , (Throwable)arg127);
                    }
                    this.LiteBansModule_31.clear();
                    this.PunishmentTableService = new byte[0][];
                    arg128 = arg105.size() >= ((Object[])arg67).length;
                    arg129 = ((Object[])this.g).length;
                    arg127 = new byte[arg129][];
                    arg88 = arg106;
                    while (arg119 < arg129) {
                        arg130 = arg119++;
                        arg127[arg130] = LiteBansModule_389.BaseCoreGenericHandler();
                    }
                    arg88.BaseCoreGenericHandler((byte[][])arg127);
                    arg131 = new LiteBansModule_324(arg106.c() << 32 << 32);
                    arg132 = new byte[40];
                    arg127 = arg105.entrySet();
                    arg127 = CollectionUtilities.BaseCoreGenericHandler((Iterable)arg127, (Comparator)new LiteBansModule_256());
                    arg133 = arg127.iterator();
                    while (arg133.hasNext()) {
{
                            arg134 = arg133.next();
                            arg135 = (Map.Entry)arg134;
                            arg95 = (Object[])arg67;
                            for (Object arg136 : arg95) {
                                arg137 = (byte[])arg136;
                                v24 = arg137.length == 0;
                                if (!v24) continue;
                                break;
}
                        if (v25) {
                            arg91 = arg67[((Number)arg135.getKey()).intValue()];
                        }
                                                ObjectUtilities.BaseCoreGenericHandler(arg135);
                        arg96 = arg135;
                        v26 = arg91;
                        if (v26 == null) {
                            v26 = LiteBansModule_389.BaseCoreGenericHandler();
                        }
                        arg138 = v26;
                        arg136 = arg106;
                        arg139 = '\u0000';
                        arg140 = (Iterable)arg96.getValue();
                        arg141 = arg140;
                        arg142 = new ArrayList<PunishmentService>();
                        arg143 = arg141.iterator();
                        while (arg143.hasNext()) {
{
                                arg144 = arg143.next();
                                arg145 = (LiteBansModule_354)arg144;
                                if (((String)arg145.e()).length() >= 20) ** GOTO lbl-1000
                                arg146 = arg145.e();
                                arg147 = SortHandler.P;
                                for (arg148 = 0; arg148 < arg146.length(); ++arg148) {
                                    arg149 = arg150 = arg146.charAt(arg148);
                                    arg151 = arg147;
                                    if (97 <= arg149 ? arg149 < 123 : false) ** GOTO lbl-1000
                                    v27 = 48 <= arg149 ? arg149 < 58 : false;
                                    if (v27 || arg149 == 44) lbl-1000:
                                                                        {
                                    } else {
                                    }
                                    if (v28) continue;
                                    break;
}
                            if (v29) {
                            } else lbl-1000:
                                                        {
                            }
                            if (!v30) continue;
                            arg142.add(arg144);
                        }
                        arg140 = (List)arg142;
                        arg141 = arg140;
                        arg142 = new ArrayList<PunishmentService>(CollectionUtilities.BaseCoreGenericHandler((Iterable)arg140, 10));
                        arg143 = arg141.iterator();
                        while (arg143.hasNext()) {
                            arg144 = arg143.next();
                            arg145 = (LiteBansModule_354)arg144;
                            arg152 = arg142;
                            arg152.add((String)arg145.e());
                        }
                        arg140 = (List)arg142;
                        arg153 = CollectionUtilities.BaseCoreGenericHandler((Iterable)arg140, (Comparator)new LiteBansModule_71((SortHandler)arg106));
                        arg140 = CollectionUtilities.BaseCoreGenericHandler(arg153, ",", null, null, 0, null, null, 62, null);
                        arg141 = arg136;
                        arg142 = arg140.getBytes(LiteBansModule_344.AsyncBackgroundTask_5);
                        arg145 = arg144 = (arg143 = arg142);
                        for (boolean arg154 : arg145) {
                            v31 = arg155++;
                            arg148 = arg154  ;
                            arg150 = v31;
                            arg156 = arg141;
                            arg142[arg150] = arg156.n()[arg148 - 44];
                        }
                        arg157 = arg143;
                        arg141 = new byte[(arg157).length];
                        arg106.BaseCoreGenericHandler(arg106.LiteBansModule_194());
                        if (arg91 != null && (arg91).length == 0 == false) {
                            arg106.LiteBansModule_31().BaseCoreGenericHandler((byte[])arg91);
                        } else {
                            arg142 = new byte[8192];
                            arg106.LiteBansModule_31().BaseCoreGenericHandler((byte[])arg142);
                            arg136.LiteBansModule_31(true);
                            SortHandler.BaseCoreGenericHandler((SortHandler)arg136, (byte[])arg157, (byte[])arg141, false, false, 12, null);
                            arg138 = arg136.BroadcastService();
                            arg136.LiteBansModule_31(false);
                        }
                        v32 = arg106.BaseCoreGenericHandler();
                        if (v32 != null) {
                            v32[((Number)arg96.getKey()).intValue()] = arg106.LiteBansModule_31().LiteBansModule_31();
                            v33 = KotlinUnitHandler.BaseCoreGenericHandler;
                        } else {
                        }
                        arg142 = arg136.BaseCoreGenericHandler(arg95.BaseCoreGenericHandler, (String)arg140, true, arg106.LiteBansModule_194(), arg131, arg132);
                        SortHandler.BaseCoreGenericHandler((SortHandler)arg136, (byte[])arg142, (byte[])arg141, false, false, 12, null);
                        v34 = arg158 = arg95.BaseCoreGenericHandler((SortHandler)arg106) == false ? 1 : 0;
                        if (arg158 != 0) {
                            SortHandler.BaseCoreGenericHandler((SortHandler)arg136, (byte[])arg141, 600, false, false, 12, null);
                        }
                        if (arg158 != 0) {
                            arg144 = new ArrayList<PunishmentService>(71);
                            arg143 = SortHandler.BaseCoreGenericHandler((SortHandler)arg136, (byte[])arg141, 0, 0, new LiteBansModule_176((ArrayList)arg144, (ServerSyncService)arg95), 6, null);
                            arg145 = (Collection)arg144;
                            arg159 = arg145;
                            arg95.BaseCoreGenericHandler((byte[][])arg159.toArray((T[])new byte[0][]));
                            arg136.LiteBansModule_240();
                        } else {
                            arg143 = SortHandler.BaseCoreGenericHandler((SortHandler)arg136, (byte[])arg141, 0, 0, null, 14, null);
                        }
                        arg144 = arg95.BaseCoreGenericHandler();
                        if (arg144.g()) {
                            arg152 = arg144;
                            v35 = new StringBuilder().append("Bucket ").append(((Number)arg96.getKey()).intValue()).append(" filled with (").append((arg142).length).append(" => ").append((arg143).length).append(") bytes\n").append(ArrayUtilities.BaseCoreGenericHandler((byte[])arg141, (CharSequence)",", null, null, 0, null, null, 62, null)).append('\n').append((String)arg140).append('\n');
                            v36 = arg95.BaseCoreGenericHandler();
                            arg160 = AbstractCommand.AsyncBackgroundTask_5;
                            arg161 = ArrayUtilities.BaseCoreGenericHandler((byte[])arg143, null, null, null, 0, null, null, 63, null);
                            if (ObjectUtilities.BaseCoreGenericHandler(arg161, (Object)"sort")) {
                                arg162 = new String[]{"00"};
                                v37 = arg162;
                            } else {
                                arg162 = new String[]{"01:" + arg161};
                                v37 = arg162;
                            }
                            arg163 = v37;
                            arg152.BaseCoreGenericHandler(v35.append(LiteBansModule_72.c(new LiteBansModule_403(v36, Arrays.copyOf(arg163, arg163.length)).LiteBansModule_31())).toString());
                        }
                        arg106.LiteBansModule_31().BaseCoreGenericHandler(LiteBansModule_389.BaseCoreGenericHandler());
                        ServerSyncService.c((ServerSyncService)arg95)[((Number)arg96.getKey()).intValue()] = (byte[])arg143;
                        arg95.BaseCoreGenericHandler(arg95.Utf8Handler_2() + ((List)arg96.getValue()).size());
                        arg91 = arg138;
                        if (!arg128) continue;
                        try {
                            arg96 = BansHandler_2.n;
                            arg164 = "SQLiteDriverHandler_4,LiteBansModule_31";
                            arg165 = v1;
                            arg136 = arg164;
                            arg139 = ',';
                            arg157 = arg136;
                            for (arg158 = 0; arg158 < arg157.length(); ++arg158) {
                                arg166 = arg167 = arg157.charAt(arg158);
                                if (!(arg166 == arg139)) continue;
                                ++arg168;
                            }
                            arg155 = arg168;
                            arg136 = "?";
                            if (arg155 > 0) {
                                arg169 = new StringBuilder(arg155 * 2);
                                arg170 = new LiteBansModule_166(0, arg155);
                                arg171 = arg170.iterator();
                                while (arg171.hasNext()) {
                                    arg158 = arg168 = ((LiteBansModule_290)arg171).LiteBansModule_31();
                                    arg169.append("?,");
                                }
                                arg136 = StringUtilities.LiteBansModule_31(arg169.toString(), 1);
                            }
                            arg172 = arg96;
                            arg95 = arg165.c(SQLiteDriverHandler.AsyncBackgroundTask_5(SQLiteDriverHandler.e("INSERT INTO " + arg172 + '(' + arg164 + ")VALUES(" + arg136 + ')')));
                            LiteBansModule_184.AsyncBackgroundTask_5(arg95.BaseCoreGenericHandler(((Number)arg135.getKey()).intValue()).BaseCoreGenericHandler((byte[])arg91));
                        }
                        catch (SQLException arg173) {
                            v38 = arg173.getMessage();
                            if (v38 == null) {
                                v38 = "";
                            }
                            if (StringUtilities.BaseCoreGenericHandler((CharSequence)(arg174 = v38), (CharSequence)"Duplicate entry", false, 2, null) || StringUtilities.BaseCoreGenericHandler(arg174, (CharSequence)"duplicate key", false, 2, null)) continue;
                            v1.AsyncBackgroundTask_5().BaseCoreGenericHandler(arg173);
}
                    if (arg128) {
                        ServerSyncService.BaseCoreGenericHandler(this, BroadcastHandler.PunishmentTableService, v1, null, 0, 12, null);
                    }
                    arg175 = KotlinUnitHandler.BaseCoreGenericHandler;
                }
                arg176 = System.currentTimeMillis() - arg103;
                this.AsyncBackgroundTask_21 = 0;
                arg177 = ArrayUtilities.BaseCoreGenericHandler(arg102);
                arg41 = (Object[])this.g;
                for (Object arg44 : arg41) {
                    arg105 = (byte[])arg44;
                    arg178 = arg179;
                    arg180 = (arg105).length;
                    arg179 = arg178 + arg180;
                }
                arg41 = (Object[])this.PunishmentTableService;
                arg181 = arg179;
                for (Object arg44 : arg41) {
                    arg105 = (byte[])arg44;
                    arg182 = arg179;
                    arg183 = (arg105).length;
                    arg179 = arg182 + arg183;
                }
                arg184 = arg179;
                arg185 = arg181 + arg184;
                arg186 = Math.abs(100 - (int)((double)arg185 / (double)arg177 * 100.0));
                arg187 = " (reduced " + arg186 + "% from " + arg177 + " bytes)";
                if (arg185 >= arg177) {
                    arg187 = "";
                }
                this.plugin().BaseCoreGenericHandler((Object)("[Sync] Cached " + this.r + " offline users for tab completion InitializerHandler_3 " + arg176 + " ms. Memory used: " + arg185 + " bytes" + arg187));
            }
            catch (Throwable arg188) {
                v1.AsyncBackgroundTask_5().BaseCoreGenericHandler(arg188);
}
        return arg23;
    }

    private final ResultSet BaseCoreGenericHandler(LiteBansModule_82 ch2, int n) {
        BansHandler_2 kL2 = BansHandler_2.g;
        CharSequence charSequence = "name,date";
        return LiteBansModule_184.AsyncBackgroundTask_5(ch2.c(SQLiteDriverHandler.AsyncBackgroundTask_5(SQLiteDriverHandler.BaseCoreGenericHandler(SQLiteDriverHandler.BaseCoreGenericHandler(SQLiteDriverHandler.e("SELECT " + charSequence + " FROM " + kL2), "SQLiteDriverHandler_4"), (Number)n))));
    }

    public final ResultSet BaseCoreGenericHandler(@NotNull LiteBansModule_82 ch2) {
        BansHandler_2 kL2 = BansHandler_2.n;
        CharSequence charSequence = "*";
        return LiteBansModule_184.AsyncBackgroundTask_5(ch2.c(SQLiteDriverHandler.AsyncBackgroundTask_5(SQLiteDriverHandler.e("SELECT " + charSequence + " FROM " + kL2))));
    }

    public final ResultSet c(@NotNull LiteBansModule_82 ch2) {
        BansHandler_2 kL2 = BansHandler_2.n;
        return LiteBansModule_184.AsyncBackgroundTask_5(ch2.c(SQLiteDriverHandler.AsyncBackgroundTask_5(SQLiteDriverHandler.e("DELETE FROM " + kL2))));
    }

    public final boolean BaseCoreGenericHandler(@NotNull SortHandler br2) {
        if (!(((Object[])this.PunishmentTableService).length == 0)) {
            if (br2.LiteBansModule_401().isEmpty()) {
                byte by2 = 0;
                by2 = -128;
                Object[] objectArray = (Object[])this.PunishmentTableService;
                SortHandler br3 = br2;
                Object[] objectArray2 = objectArray;
                Collection collection = new ArrayList(objectArray.length);
                for (Object targetObj : objectArray2) {
                    byte[] byArray = (byte[])targetObj;
                    Collection collection2 = collection;
                    byte by3 = by2;
                    by2 = (byte)(by3 + 1);
                    collection2.add(new LiteBansModule_342(byArray, by3, 0, 4, null));
                }
                br3.BaseCoreGenericHandler((List)collection);
            }
            return true;
        }
        return false;
    }

    public final ByteArrayOutputStream c(int n) {
        return new LiteBansModule_213(n);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final LiteBansModule_56 BaseCoreGenericHandler(int n, @NotNull SortHandler br2) {
        Object[] objectArray;
        Object resultObj = this.plugin();
        if (this.g()) {
            ConfigService configService = resultObj;
            objectArray = (Object[])this.PunishmentTableService;
            StringBuilder stringBuilder = new StringBuilder().append("Read bucket ").append(n).append(" + ").append(br2.LiteBansModule_401().size()).append(" loaded, ").append(((Object[])this.PunishmentTableService).length).append(" stored\n").append(CollectionUtilities.BaseCoreGenericHandler(br2.LiteBansModule_401(), "|", null, null, 0, null, ServerSyncService::BaseCoreGenericHandler, 30, null)).append('\n');
            Object[] objectArray2 = objectArray;
            contextObj = new ArrayList(objectArray.length);
            for (Object helperObj : objectArray2) {
                targetObj = (byte[])helperObj;
                Collection tempObj = contextObj;
                boolean object14 = false;
                tempObj.add(ArrayUtilities.BaseCoreGenericHandler((byte[])targetObj, null, null, null, 0, null, null, 63, null));
            }
            configService.BaseCoreGenericHandler(stringBuilder.append((List)contextObj).toString());
        }
        resultObj = br2;
        synchronized (resultObj) {
            int n2;
            boolean flag2;
            byte[] byArray;
{
                    flag = false;
                    this.plugin(br2);
                    if (!br2.LiteBansModule_401().isEmpty() && !(((Object[])this.PunishmentTableService).length == 0)) break;
                    this.plugin().BaseCoreGenericHandler(10, (Object)"No cache");
                    LiteBansModule_56 bP2 = new LiteBansModule_56((byte)n, LiteBansModule_348.BaseCoreGenericHandler());
                    return bP2;
                }
                byArray = this.g[n];
                objectArray = this.plugin();
                if (objectArray.g()) {
                    ConfigService q_03 = objectArray;
                    q_03.BaseCoreGenericHandler(ArrayUtilities.BaseCoreGenericHandler(byArray, null, null, null, 0, null, null, 63, null));
                }
                objectArray = (Object[])br2.BaseCoreGenericHandler();
                if (byArray != LiteBansModule_389.BaseCoreGenericHandler() && objectArray != null && !((objectArray[n]).length == 0)) break;
                this.plugin().BaseCoreGenericHandler(10, (Object)"No cache");
                LiteBansModule_56 bP3 = new LiteBansModule_56((byte)n, LiteBansModule_348.BaseCoreGenericHandler());
                return bP3;
            }
            br2.LiteBansModule_31().BaseCoreGenericHandler((byte[])objectArray[n]);
            ByteArrayOutputStream byteArrayOutputStream = this.c(byArray.length * 4);
            br2.BaseCoreGenericHandler(byArray, byteArrayOutputStream);
            byte[] byArray2 = new byte[byteArrayOutputStream.size()];
            br2.BaseCoreGenericHandler(br2.LiteBansModule_194());
            contextObj = Arrays.copyOf(byteArrayOutputStream.toByteArray(), byteArrayOutputStream.size());
            ObjectUtilities.BaseCoreGenericHandler(contextObj);
            SortHandler.BaseCoreGenericHandler(br2, (byte[])contextObj, byArray2, false, false, 8, null);
            Object object7 = this.plugin();
            if (((ConfigService)object7).g()) {
                ConfigService q_04 = object7;
                q_04.BaseCoreGenericHandler(ArrayUtilities.BaseCoreGenericHandler(byArray2, null, null, null, 0, null, null, 63, null));
            }
            object7 = br2.BaseCoreGenericHandler(byArray2).toString();
            Object object8 = new char[]{','};
            object8 = StringUtilities.BaseCoreGenericHandler(object7, object8, false, 0, 6, null);
            targetObj = object8;
            String[] args = targetObj.toArray(new String[0]);
            object8 = new HashMap(args.length * 2, 0.5f);
            for (String string : args) {
                if (!((string).length() > 0)) continue;
                int[] nArray = this.plugin(string);
                helperObj = nArray;
                flag2 = false;
                int n4 = ((int[])helperObj).length;
                for (n2 = 0; n2 < n4; ++n2) {
                    Object object9 = object6 = helperObj[n2];
                    Map map = (Map)object8;
                    Integer n6 = (int)object9;
                    Object v2 = map.get(n6);
                    if (v2 == null) {
                        ArrayList arrayList = new ArrayList(64);
                        map.put(n6, arrayList);
                        tempObj = arrayList;
                    } else {
                        tempObj = v2;
                    }
                    ((ArrayList)tempObj).add(string);
}
            Object object12 = (Map)object8;
            for (Map.Entry entry : object12.entrySet()) {
                helperObj = entry;
                flag2 = false;
                ((ArrayList)helperObj.getValue()).trimToSize();
            }
            object12 = br2;
            PlatformPlugin plugin = this.plugin;
            Object object10 = plugin;
            if (object10 != null && (object10 = (ConfigService)object10.BaseCoreGenericHandler(ConfigService.class)) != null) {
                String[] filteredArgs;
                String[] parsedArgs;
                Object object11 = object10;
                helperObj = AbstractCommand.AsyncBackgroundTask_5;
                String string = ((Object)(object7)).toString();
                n2 = 0;
                if (ObjectUtilities.BaseCoreGenericHandler(string, (Object)"sort")) {
                    String[] cmdArgs = new String[]{"00"};
                    parsedArgs = cmdArgs;
                } else {
                    String[] stringArray5 = new String[]{"01:" + string};
                    parsedArgs = stringArray5;
                }
                if (new LiteBansModule_403((ConfigService)object11, Arrays.copyOf(filteredArgs = parsedArgs, filteredArgs.length)).LiteBansModule_31() == object11.hashCode()) {
                    throw new IllegalArgumentException();
}
            object12 = new LiteBansModule_56((byte)n, new HashMap((Map)object8));
            (this.LiteBansModule_31).add(new SoftReference<Object>(object12));
            Object object13 = object12;
            return object13;
}

    public final int BaseCoreGenericHandler(char c) {
        return c % ((Object[])this.g).length;
    }

    public final int[] BaseCoreGenericHandler(@NotNull String string) {
        if ((string).length() == 0) {
            int[] nArray = new int[]{0};
            return nArray;
        }
        int n = string.charAt(0) * 3;
        if (string.length() <= 1) {
            int[] nArray = new int[]{n};
            return nArray;
        }
        int n2 = string.substring(0, 2).hashCode() * 13;
        if (string.length() <= 2) {
            int[] nArray = new int[]{n2, n};
            return nArray;
        }
        int n3 = string.substring(0, 3).hashCode() * 17;
        int[] nArray = new int[]{n3, n2, n};
        return nArray;
    }

    private static final ConfigService BaseCoreGenericHandler(ServerSyncService u2) {
        return (ConfigService)u2.BaseCoreGenericHandler.BaseCoreGenericHandler(ConfigService.class);
    }

    private static final DatabaseMonitorService LiteBansModule_31(ServerSyncService u2) {
        return (DatabaseMonitorService)u2.BaseCoreGenericHandler.BaseCoreGenericHandler(DatabaseMonitorService.class);
    }

    private static final BroadcastService e(ServerSyncService u2) {
        return (BroadcastService)u2.BaseCoreGenericHandler.BaseCoreGenericHandler(BroadcastService.class);
    }

    private static final PunishmentTableService AsyncBackgroundTask_5(ServerSyncService u2) {
        return (PunishmentTableService)u2.BaseCoreGenericHandler.BaseCoreGenericHandler(PunishmentTableService.class);
    }

    private static final CharSequence BaseCoreGenericHandler(LiteBansModule_342 jg_02) {
        return ArrayUtilities.BaseCoreGenericHandler(jg_02.c(), null, null, null, 0, null, null, 63, null);
    }

    public static final /* synthetic */ byte[][] c(ServerSyncService u2) {
        return u2.g;
    }

    static {
        m = "\ufeff";
        n = (char)65279;
        ServerSyncService.LiteBansModule_194();
        GnuSparseMapHandler = new LiteBansModule_303(null);
}

