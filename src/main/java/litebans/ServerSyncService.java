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
    public static final LiteBansModule_304 GnuSparseMapHandler;
    private final LiteBansModule_162 q = ProxyConnection.BaseCoreGenericHandler(() -> ServerSyncService.BaseCoreGenericHandler(this));
    private final LiteBansModule_162 e = ProxyConnection.BaseCoreGenericHandler(() -> ServerSyncService.LiteBansModule_31(this));
    private final LiteBansModule_162 c = ProxyConnection.BaseCoreGenericHandler(() -> ServerSyncService.e(this));
    private final LiteBansModule_162 LiteBansModule_241 = ProxyConnection.BaseCoreGenericHandler(() -> ServerSyncService.AsyncBackgroundTask_5(this));
    private final AtomicBoolean Utf8Handler_2 = new AtomicBoolean();
    private final DatabaseSyncTask i = new DatabaseSyncTask(this.plugin);
    private long BroadcastService;
    private int r;
    private byte AsyncBackgroundTask_21;
    private byte[][] PunishmentTableService = new byte[0][];
    private final byte[][] g;
    private CopyOnWriteArrayList LiteBansModule_31;
    private final CopyOnWriteArrayList AsyncBackgroundTask_5;
    private final LiteBansModule_302 LiteBansModule_403;
    public static final char n;
    public static final String m;
        public ServerSyncService(@NotNull PlatformPlugin plugin) {
        super(plugin);
        byte[][] byArrayArray = new byte[4][];
        ServerSyncService u2 = this;
        while (n < 4) {
            int n2 = n++;
            byArrayArray[n2] = LiteBansModule_391.BaseCoreGenericHandler();
        }
        u2.g = byArrayArray;
        this.LiteBansModule_31 = new CopyOnWriteArrayList();
        this.AsyncBackgroundTask_5 = new CopyOnWriteArrayList();
        this.LiteBansModule_403 = new LiteBansModule_302(new AtomicLong(), new AtomicLong(), new AtomicLong());
    }

    public final ConfigService BaseCoreGenericHandler() {
        LiteBansModule_162 eE2 = this.q;
        return (ConfigService)eE2.BaseCoreGenericHandler();
    }

    public final DatabaseMonitorService AsyncBackgroundTask_5() {
        LiteBansModule_162 eE2 = this.e;
        return (DatabaseMonitorService)eE2.BaseCoreGenericHandler();
    }

    public final BroadcastService LiteBansModule_31() {
        LiteBansModule_162 eE2 = this.c;
        return (BroadcastService)eE2.BaseCoreGenericHandler();
    }

    public final PunishmentTableService g() {
        LiteBansModule_162 eE2 = this.LiteBansModule_241;
        return (PunishmentTableService)eE2.BaseCoreGenericHandler();
    }

    public final DatabaseSyncTask LiteBansModule_241() {
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

    public final LiteBansModule_302 i() {
        return this.LiteBansModule_403;
    }

    public final boolean BaseCoreGenericHandler(@NotNull LiteBansModule_201 fa_02) {
        return this.AsyncBackgroundTask_5.add(fa_02);
    }

    public final boolean LiteBansModule_31(@NotNull LiteBansModule_201 fa_02) {
        return this.AsyncBackgroundTask_5.remove(fa_02);
    }

    public final LiteBansModule_56 LiteBansModule_31(int n) {
        Object v1;
        block1: {
            Iterable iterable = this.LiteBansModule_31;
            for (Object t2 : iterable) {
                Reference reference = (Reference)t2;
                LiteBansModule_56 bP2 = (LiteBansModule_56)reference.get();
                if (!((bP2 != null ? bP2.LiteBansModule_31() : -1) == n)) continue;
                v1 = t2;
                break block1;
            }
            v1 = null;
        }
        Reference reference = v1;
        return reference != null ? (LiteBansModule_56)reference.get() : null;
    }

    @Override
    public void e() {
        this.plugin().e();
        DiscordWebhookClient eG2 = this.plugin().LiteBansModule_195();
        if (DatabaseMonitorService.CommandThrottleService.BaseCoreGenericHandler(eG2.ElementsHandler()) && eG2.aS()) {
            this.Utf8Handler_2.set(false);
            eG2.LiteBansModule_4().LiteBansModule_31(this, eG2.LiteBansModule_18(), eG2.LiteBansModule_18());
        }
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
        if (((AtomicBoolean)targetObj).compareAndSet(false, true)) {
            try {
                targetObj = this.AsyncBackgroundTask_5();
                flag2 = false;
                try {
                    LiteBansModule_83 ch2 = ((DatabaseMonitorService)targetObj).LiteBansModule_195();
                    Closeable closeable = ch2;
                    Throwable throwable = null;
                    try {
                        Object contextObj = (LiteBansModule_83)closeable;
                        LiteBansModule_83 ch3 = ch2;
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
                }
                catch (SQLException sQLException) {
                    if (!((DatabaseMonitorService)targetObj).LiteBansModule_31(sQLException)) {
                        throw sQLException;
                    }
                }
            }
            catch (SQLException sQLException) {
                this.AsyncBackgroundTask_5().BaseCoreGenericHandler(sQLException);
            }
            finally {
                AtomicBoolean atomicBoolean2 = atomicBoolean;
                flag2 = false;
                atomicBoolean2.set(false);
            }
        }
    }

    private final void AsyncBackgroundTask_5(LiteBansModule_83 ch2) {
        long l3 = ((AtomicLong)this.LiteBansModule_403.LiteBansModule_195()).incrementAndGet();
        long l5 = l3 - ((AtomicLong)this.LiteBansModule_403.c()).get();
        if (l5 > 1L) {
            this.LiteBansModule_31(ch2);
        }
    }

    private final void LiteBansModule_31(LiteBansModule_83 ch2) {
        this.plugin().BaseCoreGenericHandler((Object)"[Sync] Detected duplicate server. This will be resolved ");
        LiteBansModule_391.BaseCoreGenericHandler(this.LiteBansModule_403, ResetHandler.LiteBansModule_403);
        Serializable serializable = ch2.e().getDataFolder();
        String string = "server.yml";
        LiteBansModule_113.LiteBansModule_31(new File((File)serializable, string));
        serializable = ch2.e().getDataFolder();
        string = "server.json";
        flag = false;
        LiteBansModule_113.LiteBansModule_31(new File((File)serializable, string));
        serializable = this.plugin().LiteBansModule_195().BaseCoreGenericHandler(true);
        this.plugin().LiteBansModule_195().LiteBansModule_31((String)((LiteBansModule_356)serializable).LiteBansModule_31());
        this.plugin().LiteBansModule_195().BaseCoreGenericHandler((String)((LiteBansModule_356)serializable).e());
        DatabaseMonitorService.BaseCoreGenericHandler(ch2.AsyncBackgroundTask_5(), ch2, 0L, false, 6, null);
    }

    public final void BaseCoreGenericHandler(@NotNull BroadcastHandler ij2, @NotNull LiteBansModule_83 ch2, @NotNull CharSequence charSequence, int n) {
        if (!this.AsyncBackgroundTask_5().AsyncBackgroundTask_21() || ch2.LiteBansModule_31()) {
            return;
        }
        Object targetObj = charSequence;
        int n2 = 4092;
        char c = '\u0000';
        String string = LiteBansModule_243.BaseCoreGenericHandler(targetObj.toString(), n2);
        targetObj = this.AsyncBackgroundTask_5().LiteBansModule_403();
        if (targetObj == null || ((LiteBansModule_15)targetObj).LiteBansModule_195() && n == -1) {
            ServerSyncService u2 = this;
            c = 'LiteBansModule_435';
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
            n2 = ((LiteBansModule_15)targetObj).c();
            if (n != -1 && n != n2) {
                n2 = n;
            } else {
                ((AtomicLong)this.LiteBansModule_403.c()).incrementAndGet();
            }
            c = (ij2.AsyncBackgroundTask_5() << 16 | n2) + 42;
            Object resultObj = BansHandler_2.c;
            CharSequence charSequence2 = "info,msg";
            LiteBansModule_83 ch3 = ch2;
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
                Iterable iterable = new LiteBansModule_167(0, n5);
                Iterator iterator = iterable.iterator();
                while (iterator.hasNext()) {
                    n3 = n4 = ((LiteBansModule_291)iterator).LiteBansModule_31();
                    c10 = '\u0000';
                    stringBuilder.append("?,");
                }
                helperObj = StringUtilities.LiteBansModule_31(stringBuilder.toString(), 1);
            }
            BansHandler_2 kL2 = resultObj;
            flag5 = false;
            resultObj = ch3.c(SQLiteDriverHandler.AsyncBackgroundTask_5(SQLiteDriverHandler.e("INSERT INTO " + kL2 + '(' + charSequence2 + ")VALUES(" + helperObj + ')'))).BaseCoreGenericHandler(c);
            helperObj = contextObj = resultObj;
            ((LiteBansModule_60)resultObj).BaseCoreGenericHandler(string);
            LiteBansModule_185.AsyncBackgroundTask_5((LiteBansModule_60)contextObj);
            resultObj = this;
            LiteBansModule_83 ch4 = ch2;
            helperObj = (AsyncBackgroundTask_20)ch4.e().BaseCoreGenericHandler(AsyncBackgroundTask_20.class);
            long l3 = System.currentTimeMillis();
            if (l3 - ch4.AsyncBackgroundTask_5().i() > 28800000L) {
                ch4.AsyncBackgroundTask_5().LiteBansModule_31(l3);
                charSequence3 = "1 minute";
                if (ObjectUtilities.BaseCoreGenericHandler((Object)((ServerSyncService)resultObj).BaseCoreGenericHandler().LiteBansModule_195().ElementsHandler(), (Object)"pgsql")) {
                    charSequence3 = '\'' + (String)charSequence3 + '\'';
                }
                Object tempObj = BansHandler_2.c;
                n4 = 0;
                tempObj = SQLiteDriverHandler.e("DELETE FROM " + tempObj);
                CharSequence charSequence4 = "time < (NOW() - INTERVAL " + (String)charSequence3 + ')';
                LiteBansModule_83 ch5 = ch4;
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
                LiteBansModule_185.AsyncBackgroundTask_5(ch5.c(SQLiteDriverHandler.AsyncBackgroundTask_5(SQLiteDriverHandler.e(SQLiteDriverHandler.LiteBansModule_31((String)tempObj) + " WHERE " + charSequence4))));
                tempObj = helperObj;
                ((AsyncBackgroundTask_20)tempObj).BaseCoreGenericHandler(ch4);
            }
        }
        catch (SQLException sQLException) {
            this.AsyncBackgroundTask_5().BaseCoreGenericHandler(sQLException);
        }
    }

    public static /* synthetic */ void BaseCoreGenericHandler(ServerSyncService u2, BroadcastHandler ij2, LiteBansModule_83 ch2, CharSequence charSequence, int n, int n2, Object targetObj) {
        if ((n2 & 4) != 0) {
            charSequence = "";
        }
        if ((n2 & 8) != 0) {
            n = -1;
        }
        u2.BaseCoreGenericHandler(ij2, ch2, charSequence, n);
    }

    public void BaseCoreGenericHandler(@NotNull LiteBansModule_83 v1, @NotNull String v2, @NotNull String v3, @NotNull BroadcastHandler v4, @NotNull Set v5) {
        block38: {
            block37: {
                block36: {
                    if (v2.length() != 36) {
                        return;
                    }
                    v6 = v4;
                    switch (LiteBansModule_386.BaseCoreGenericHandler[v6.ordinal()]) {
                        case 6: {
                            v0 = BanHandler.LiteBansModule_241;
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
                            v0 = BanHandler.LiteBansModule_241;
                            break;
                        }
                        case 12: {
                            v0 = BanHandler.GnuSparseMapHandler;
                            break;
                        }
                        default: {
                            v0 = null;
                        }
                    }
                    v7 = v0;
                    if (v7 == null) {
                        v6 = this.plugin();
                        if (v6.g()) {
                            v8 = v6;
                            v8.BaseCoreGenericHandler((Object)("[!!!] NF " + (Object)v4));
                        }
                        return;
                    }
                    if (v4 == BroadcastHandler.AsyncBackgroundTask_21) {
                        v6 = this.g();
                        v9 = CollectionUtilities.BaseCoreGenericHandler((Iterable)v6.BaseCoreGenericHandler().LiteBansModule_31().entrySet(), (LiteBansModule_179)new LiteBansModule_78(v2, v3));
                        if (v9) {
                            v6.BaseCoreGenericHandler(v2, v3);
                        }
                        return;
                    }
                    if (v5.isEmpty()) break block37;
                    if (v4.BaseCoreGenericHandler() || v5.contains(v2)) break block38;
                    if (((CharSequence)v3).length() == 0) break block37;
                    v6 = v1.e().q();
                    for (Object v10 : v6) {
                        v11 = (Object[])v10;
                        if (!SilentHandler.AsyncBackgroundTask_21.BaseCoreGenericHandler(true, v11.LiteBansModule_31(), v3, SilentHandler.AsyncBackgroundTask_21.BaseCoreGenericHandler(v3))) continue;
                        v1 = false;
                        break block36;
                    }
                    v1 = true;
                }
                if (!v1) break block38;
            }
            return;
        }
        v2 = AllHandler_3.BaseCoreGenericHandler(v1, v2, v3, v7, true, false, 16, null);
        if (v2 == null) {
            return;
        }
        v6 = v2;
        v12 = DatabaseMonitorService.BaseCoreGenericHandler(v1.AsyncBackgroundTask_5(), false, 1, null);
        if (v1.e().AsyncBackgroundTask_22() == 1) {
            v10 = this.LiteBansModule_31();
            if (v4 == BroadcastHandler.DatabaseMonitorService) {
                litebans.BroadcastService.BaseCoreGenericHandler((BroadcastService)v10, v1, (SilentHandler)v6, null, 2, null);
            } else if (v4 == BroadcastHandler.GnuSparseMapHandler) {
                v13 = v10.BaseCoreGenericHandler.q();
                v14 = v13;
                v15 = new ArrayList<PunishmentService>();
                for (Object v16 : v14) {
                    v17 = (CommandSenderWrapper)v16;
                    if (!v6.BaseCoreGenericHandler(v17.BaseCoreGenericHandler(), v17.LiteBansModule_31(), v12)) continue;
                    v15.add(v16);
                }
                v13 = (List)v15;
                v14 = v13.iterator();
                while (v14.hasNext()) {
                    v15 = v14.next();
                    v18 = (CommandSenderWrapper)v15;
                    ObjectUtilities.BaseCoreGenericHandler(v18);
                    v10.BaseCoreGenericHandler(v1, v18);
                }
            }
        }
        v19 = v1.e().q();
        v11 = v19;
        v20 = new ArrayList<PunishmentService>();
        for (Object v21 : v11) {
            v22 = (CommandSenderWrapper)v21;
            if (!v6.BaseCoreGenericHandler(v22.BaseCoreGenericHandler(), v22.LiteBansModule_31(), v12)) ** GOTO lbl-1000
            v3 = v22.LiteBansModule_241();
            if (v3 == null) {
                v3 = v1.AsyncBackgroundTask_5().ServerSyncService();
            }
            if ((v4 = v6.m()) == null) {
                v4 = LiteBansModule_182.LiteBansModule_195.LiteBansModule_31();
            }
            if (LiteBansModule_182.LiteBansModule_195.BaseCoreGenericHandler(v3, v4)) {
                v5 = true;
            } else lbl-1000:
                        {
                v5 = false;
            }
            if (!v5) continue;
            v20.add(v21);
        }
        v19 = (List)v20;
        v11 = v19.iterator();
        while (v11.hasNext()) {
            v20 = v11.next();
            v23 = (CommandSenderWrapper)v20;
            v6 = v7;
            switch (v6 == null ? -1 : LiteBansModule_390.BaseCoreGenericHandler[v6.ordinal()]) {
                case 1: {
                    ObjectUtilities.BaseCoreGenericHandler(v23);
                    if (!CommandArgumentUtils.BaseCoreGenericHandler(v1, (SilentHandler)v6, v23)) break;
                    this.LiteBansModule_31().BaseCoreGenericHandler(v23, GeoIPLookupService.BaseCoreGenericHandler(v1, (SilentHandler)v6, v23, -1));
                    break;
                }
                case 2: {
                    this.g().BaseCoreGenericHandler(v2, (SilentHandler)v6);
                    if (!this.plugin().LiteBansModule_195().aU()) break;
                    v24 = this.LiteBansModule_31();
                    ObjectUtilities.BaseCoreGenericHandler(v23);
                    v24.BaseCoreGenericHandler(v1, v23, (SilentHandler)v6, -1, "muted");
                    break;
                }
                case 3: {
                    if (!this.plugin().LiteBansModule_195().aU()) break;
                    v1.LiteBansModule_31(v2);
                    v25 = this.LiteBansModule_31();
                    ObjectUtilities.BaseCoreGenericHandler(v23);
                    v25.BaseCoreGenericHandler(v1, v23, (SilentHandler)v6, -1, "warned");
                    break;
                }
                case 4: {
                    v7 = this.LiteBansModule_31();
                    ObjectUtilities.BaseCoreGenericHandler(v23);
                    v7.BaseCoreGenericHandler(v23, (CharSequence)GeoIPLookupService.BaseCoreGenericHandler(v1, (SilentHandler)v6, v23));
                }
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Could not resolve type clashes
     * Unable to fully structure code
     */
    public final long BaseCoreGenericHandler(@NotNull LiteBansModule_83 v1, @NotNull Collection v2, long v3) {
        block106: {
            v26 = 0L;
            v26 = v3;
            try {
                v5 = v1.AsyncBackgroundTask_5().LiteBansModule_403();
                if (v1.LiteBansModule_31() || v5 == null) {
                    v27 = this;
                    v28 = 'AsyncBackgroundTask_21';
                    v29 = v27.BaseCoreGenericHandler();
                    if (v29.g()) {
                        v30 = v29;
                        v30.BaseCoreGenericHandler((Object)("0x11 <" + v28 + "> " + v5));
                    }
                    return v26;
                }
                v31 = this.plugin().LiteBansModule_195().LiteBansModule_12();
                v32 = v1.e().q();
                v32 = (Object[])v32;
                v33 = v32;
                v34 = new ArrayList<PunishmentService>(((Object[])v32).length);
                for (Object v35 : v33) {
                    v36 = (CommandSenderWrapper)v35;
                    v37 = v34;
                    v38 = v36.BaseCoreGenericHandler();
                    v37.add(v38);
                }
                v39 = CollectionUtilities.g((List)v34);
                if (v39.size() <= 0) {
                    v32 = v1.AsyncBackgroundTask_5();
                    v32.BaseCoreGenericHandler((byte)(v32.AsyncBackgroundTask_22() + 1));
                    if (v32.AsyncBackgroundTask_22() < v31) {
                        return v26;
                    }
                    v1.AsyncBackgroundTask_5().BaseCoreGenericHandler((byte)0);
                }
                v40 = DatabaseMonitorService.BaseCoreGenericHandler(v1.AsyncBackgroundTask_5(), false, 1, null);
                if (v26 == 0L) {
                    v34 = BansHandler_2.c;
                    v41 = "SQLiteDriverHandler_4";
                    v33 = LiteBansModule_185.AsyncBackgroundTask_5(v1.c(SQLiteDriverHandler.AsyncBackgroundTask_5(SQLiteDriverHandler.BaseCoreGenericHandler(SQLiteDriverHandler.BaseCoreGenericHandler(SQLiteDriverHandler.e("SELECT " + v41 + " FROM " + v34), "SQLiteDriverHandler_4"), (Number)1))));
                    if (v33.next()) {
                        v26 = v33.getLong("SQLiteDriverHandler_4");
                        v34 = this.plugin();
                        if (v34.g()) {
                            v37 = v34;
                            v38 = "L+ " + v26;
                            v37.BaseCoreGenericHandler((Object)v38);
                        }
                    }
                }
                v33 = LiteBansModule_185.AsyncBackgroundTask_5(v1.c((CharSequence)("SELECT * FROM " + BansHandler_2.c + " WHERE SQLiteDriverHandler_4>?")).BaseCoreGenericHandler(v26));
                while (v33.next()) {
                    block105: {
                        v42 = v33.getLong("SQLiteDriverHandler_4");
                        v43 = v33.getLong("info") - (long)42;
                        v44 = LiteBansModule_73.LiteBansModule_31((int)(v43 & 65535L));
                        v45 = v43 >> 16;
                        v46 = v1.AsyncBackgroundTask_5().BaseCoreGenericHandler(v1, v44, true);
                        v26 = Math.max(v26, v42);
                        if (v46 == null) {
                            v47 = this;
                            v48 = 108;
                            v49 = v47.BaseCoreGenericHandler();
                            if (!v49.g()) continue;
                            v50 = v49;
                            v50.BaseCoreGenericHandler((Object)("0x11 <" + (char)v48 + "> " + v46));
                            continue;
                        }
                        if (v44 == v5.c()) {
                            this.AsyncBackgroundTask_5(v1);
                            continue;
                        }
                        v47 = v33.getString("msg");
                        v51 = BroadcastHandler.LiteBansModule_403.BaseCoreGenericHandler((int)v45);
                        if (v51 == null) {
                            v52 = this;
                            v53 = 'c';
                            v54 = v45;
                            v55 = v52.BaseCoreGenericHandler();
                            if (!v55.g()) continue;
                            v56 = v55;
                            v56.BaseCoreGenericHandler((Object)("0x11 <" + v53 + "> " + v54));
                            continue;
                        }
                        ((AtomicLong)this.LiteBansModule_403.BaseCoreGenericHandler()).incrementAndGet();
                        v57 = this.plugin();
                        if (v57.g()) {
                            v37 = v57;
                            v38 = "SQLiteDriverHandler_4: " + v42 + ", type: " + v45 + ", server: " + LiteBansModule_73.c(v44) + ", message: \"" + (String)v47 + '\"';
                            v37.BaseCoreGenericHandler((Object)v38);
                        }
                        v57 = v47;
                        if (StringUtilities.BaseCoreGenericHandler((CharSequence)v57, (CharSequence)"server", false, 2, null) || StringUtilities.BaseCoreGenericHandler((CharSequence)(v57 = v47), (CharSequence)"Server", false, 2, null)) {
                            v58 = MessageKey.BaseCoreGenericHandler(v46.e(), false);
                            v57 = v58;
                            v58 = v47;
                            v47 = GeoIPLookupService.BaseCoreGenericHandler((CharSequence)GeoIPLookupService.BaseCoreGenericHandler((CharSequence)v58, (CharSequence)"server", v57), (CharSequence)"playerServer", v57);
                        }
                        v57 = v2;
                        if (v57 instanceof Collection && ((Collection)v57).isEmpty()) {
                            v0 = false;
                        } else {
                            for (T v59 : v57) {
                                v60 = (LiteBansModule_201)v59;
                                if (!(v60.BaseCoreGenericHandler((LiteBansModule_15)v46, v51, (String)v47) == false)) continue;
                                v0 = true;
                                break block105;
                            }
                            v0 = false;
                        }
                    }
                    if (v0) {
                        v57 = this;
                        v1 = v57.BaseCoreGenericHandler();
                        v61 = AbstractCommand.AsyncBackgroundTask_5;
                        v62 = "0x11 <PluginHookService> " + v45;
                        if (ObjectUtilities.BaseCoreGenericHandler((Object)v62, (Object)"sort")) {
                            v63 = new String[]{"00"};
                            v2 = v63;
                        } else {
                            v63 = new String[]{"01:" + v62};
                            v2 = v63;
                        }
                        v64 = v2;
                        new LiteBansModule_405(v1, Arrays.copyOf(v64, v64.length)).LiteBansModule_31();
                        continue;
                    }
                    v65 = v66 = this.plugin().LiteBansModule_195();
                    switch (LiteBansModule_390.LiteBansModule_31[v51.ordinal()]) {
                        case 1: 
                        case 2: 
                        case 3: 
                        case 4: 
                        case 5: {
                            v3 = v47;
                            ObjectUtilities.c(v3, "element");
                            v57 = LiteBansModule_304.BaseCoreGenericHandler(ServerSyncService.GnuSparseMapHandler, (String)v3, 0, 2, null);
                            this.plugin(v1, LiteBansModule_346.LiteBansModule_195(v57[0]), v57[1], v51, v39);
                            v4 = KotlinUnitHandler.BaseCoreGenericHandler;
                            break;
                        }
                        case 6: 
                        case 7: {
                            if (!v65.AsyncBackgroundTask_21()) ** GOTO lbl186
                            v5 = v47;
                            ObjectUtilities.c(v5, "element");
                            v57 = ServerSyncService.GnuSparseMapHandler.BaseCoreGenericHandler((String)v5, 3);
                            v6 = (String)ArrayUtilities.BaseCoreGenericHandler((Object[])v57, 1);
                            if (v6 == null) {
                                v6 = "BAN";
                            }
                            v67 = v6;
                            v68 = v67.toUpperCase(Locale.ROOT);
                            v69   = BanHandler.values();
                            v70 = v69  .length;
                            for (v71 = 0; v71 < v70; v71 += 1) {
                                v72 = v73 = v69  [v71];
                                if (!ObjectUtilities.BaseCoreGenericHandler((Object)v72.name(), (Object)v68)) {
                                    continue;
                                }
                                ** GOTO lbl177
                            }
                            throw new NoSuchElementException("Array contains no element matching the predicate + ");
                                                        v67 = v73;
                            v7 = (String)ArrayUtilities.BaseCoreGenericHandler((Object[])v57, 2);
                            if (v7 == null) {
                                v7 = v1.AsyncBackgroundTask_5().ServerSyncService();
                            }
                            v69   = v7;
                            v74 = this.LiteBansModule_31();
                            litebans.BroadcastService.BaseCoreGenericHandler(v74, v1, (CharSequence)v57[0], v51, (BanHandler)v67, (String)v69  , false, false, null, 112, null);
                                                        v4 = KotlinUnitHandler.BaseCoreGenericHandler;
                            break;
                        }
                        case 8: {
                            v75 = this.LiteBansModule_31();
                            v8 = v47;
                            ObjectUtilities.c(v8, "element");
                            litebans.BroadcastService.BaseCoreGenericHandler(v75, v1, (CharSequence)v8, "console", null, null, v65.AsyncBackgroundTask_21() != false && v65.LiteBansModule_14() != false && v65.B() != false, false, null, 108, null);
                            v4 = KotlinUnitHandler.BaseCoreGenericHandler;
                            break;
                        }
                        case 9: {
                            v9 = v47;
                            ObjectUtilities.c(v9, "element");
                            v57 = LiteBansModule_304.BaseCoreGenericHandler(ServerSyncService.GnuSparseMapHandler, (String)v9, 0, 2, null);
                            v76 = v57[0];
                            v77 = v57[1];
                            v78 = this.LiteBansModule_31();
                            litebans.BroadcastService.BaseCoreGenericHandler(v78, v1, (CharSequence)v77, v76, null, null, v65.AsyncBackgroundTask_21(), false, null, 108, null);
                            v4 = KotlinUnitHandler.BaseCoreGenericHandler;
                            break;
                        }
                        case 10: {
                            if (v65.aU()) {
                                v10 = v47;
                                ObjectUtilities.c(v10, "element");
                                v57 = LiteBansModule_304.BaseCoreGenericHandler(ServerSyncService.GnuSparseMapHandler, (String)v10, 0, 2, null);
                                this.LiteBansModule_31().LiteBansModule_31(v57[0], v57[1], false);
                            }
                            v4 = KotlinUnitHandler.BaseCoreGenericHandler;
                            break;
                        }
                        case 11: {
                            v79 = this.LiteBansModule_31();
                            v11 = v47;
                            ObjectUtilities.c(v11, "element");
                            litebans.BroadcastService.BaseCoreGenericHandler(v79, v1, (CharSequence)v11, v51, null, null, v65.ExceptionHandler() != false && v65.LockdownCommandHandler() != false && v65.aU() != false, false, null, 108, null);
                            v4 = KotlinUnitHandler.BaseCoreGenericHandler;
                            break;
                        }
                        case 12: {
                            v80 = this.LiteBansModule_31();
                            v12 = v47;
                            ObjectUtilities.c(v12, "element");
                            litebans.BroadcastService.BaseCoreGenericHandler(v80, v1, (CharSequence)v12, v51, BanHandler.GnuSparseMapHandler, null, v65.aU(), false, null, 104, null);
                            v4 = KotlinUnitHandler.BaseCoreGenericHandler;
                            break;
                        }
                        case 13: {
                            v81 = v65.LiteBansModule_4().q();
                            ObjectUtilities.BaseCoreGenericHandler(v81);
                            if (!(v81.length == 0 == false)) ** GOTO lbl299
                            v13 = v47;
                            ObjectUtilities.c(v13, "element");
                            v57 = ServerSyncService.GnuSparseMapHandler.BaseCoreGenericHandler((String)v13, 8);
                            v82 = LiteBansModule_346.LiteBansModule_195(v57[0]);
                            v83 = v57[1];
                            v84 = v57[2];
                            v85 = v57[3];
                            v73 = ServerSyncService.GnuSparseMapHandler;
                            v72 = (String)ArrayUtilities.BaseCoreGenericHandler((Object[])v57, 4);
                            v70 = (int)ObjectUtilities.BaseCoreGenericHandler(v72, (Object)"1");
                            v72 = ServerSyncService.GnuSparseMapHandler;
                            v86 = (String)ArrayUtilities.BaseCoreGenericHandler((Object[])v57, 5);
                            v87 = ObjectUtilities.BaseCoreGenericHandler((Object)v86, (Object)"1");
                            v14 = (String)ArrayUtilities.BaseCoreGenericHandler((Object[])v57, 6);
                            v88 = v14 != null && (v14 = LiteBansModule_233.BaseCoreGenericHandler((String)v14)) != null ? (byte)v14.BaseCoreGenericHandler() : -1;
                            v15 = (String)ArrayUtilities.BaseCoreGenericHandler((Object[])v57, 7);
                            v89 = v15 != null && (v15 = StringUtilities.BaseCoreGenericHandler((String)v15)) != null ? v15.intValue() : 0;
                            v90 = v81;
                            v91 = ((CommandSenderWrapper[])v90).length;
                            for (v92 = 0; v92 < v91; ++v92) {
                                v93 = v94 = v90[v92];
                                if (!StringUtilities.BaseCoreGenericHandler(v93.i(), v84, true)) continue;
                                v16 = v94;
                                ** GOTO lbl267
                            }
                            v16 = v95 = null;
                                                        if (v95 != null) {
                                v17 = v1.AsyncBackgroundTask_5().BaseCoreGenericHandler((CommandSenderWrapper)v95);
                                if (v17 == null) {
                                    v17 = v1.AsyncBackgroundTask_5().ServerSyncService();
                                }
                                v96 = v17;
                                v90 = new SilentHandler(BanHandler.g, v95.BaseCoreGenericHandler(), v95.LiteBansModule_31(), v85, v82, v83, LiteBansModule_182.LiteBansModule_195.LiteBansModule_31(), (String)v96, v40, -1L, v88, (boolean)v70, false, false, 0L, 16384, null);
                                v18 = v65.LiteBansModule_4().z().BaseCoreGenericHandler("kick");
                                ObjectUtilities.LiteBansModule_31(v18, "");
                                v97 = (KickHandler)v18;
                                v19 = this.plugin().AsyncBackgroundTask_21().BaseCoreGenericHandler(BanHandler.g, v88);
                                if (v19 == null) {
                                    v19 = LiteBansModule_65.LiteBansModule_31.BaseCoreGenericHandler();
                                }
                                v98 = v19;
                                v93 = BanHandler.g;
                                v99 = new LiteBansModule_298(v95.i(), v95.BaseCoreGenericHandler(), v95.LiteBansModule_31(), new Date());
                                v20 = v83;
                                if (v20 == null) {
                                    v20 = "";
                                }
                                v100 = v20;
                                v101 = v90.GnuSparseMapHandler();
                                v21 = v90.m();
                                if (v21 == null) {
                                    v21 = LiteBansModule_182.LiteBansModule_195.LiteBansModule_31();
                                }
                                v102 = v21;
                                v94 = new NoneHandler_2((BanHandler)v93, false, (boolean)v70, v87, false, false, false, false, false, false, false, false, false, false, v40, 0L, 0L, 0, v98, null, false, null, v89, null, v99, null, null, (CommandSenderWrapper)v95, (String)v100, v82, v102, (String)v101, null, null, null, null, null, 112967666, 31, null);
                                v94.LiteBansModule_31((SilentHandler)v90);
                                v93 = v97;
                                v93.BaseCoreGenericHandler((NoneHandler_2)v94, v1, (CommandSenderWrapper)v95);
                            }
                                                        v4 = KotlinUnitHandler.BaseCoreGenericHandler;
                            break;
                        }
                        case 14: {
                            v103 = v1.AsyncBackgroundTask_5();
                            v104 = 21600000 + new LiteBansModule_325(0L, 1, null).BaseCoreGenericHandler(32400000);
                            v103.BaseCoreGenericHandler(v40 + (long)v104);
                            this.r = 0;
                            v4 = KotlinUnitHandler.BaseCoreGenericHandler;
                            break;
                        }
                        case 15: {
                            ServerSyncService.BaseCoreGenericHandler(this, BroadcastHandler.CommandThrottleService, v1, (CharSequence)v47, 0, 8, null);
                            v4 = KotlinUnitHandler.BaseCoreGenericHandler;
                            break;
                        }
                        case 16: {
                            DatabaseMonitorService.BaseCoreGenericHandler(v1.AsyncBackgroundTask_5(), v1, this.plugin().LiteBansModule_195().LiteBansModule_18() * (long)2, false, 4, null);
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
                    }
                }
                v105 = this.plugin().LiteBansModule_195().NullHandler_8();
                if (v105 <= 0 || this.r > 0 && this.AsyncBackgroundTask_21 < 32) break block106;
                this.r = 0;
                v106 = new ArrayList<PunishmentService>(6000);
                v107 = new int[4];
                v108 = System.currentTimeMillis();
                v48 = v105 * 2;
                if (v48 >= 60000) {
                    v48 = v105;
                }
                v109 = this.plugin(v1, v48);
                v49 = new HashSet<PunishmentService>(6000);
                v110 = new HashMap<K, V>();
                v111 = v109;
                v112 = (AutoCloseable)v111;
                try {
                    v113 = (ResultSet)v112;
                    while (v111.next()) {
                        v114 = v111;
                        v72 = v114.getString("name");
                        v115 = v72.toLowerCase(Locale.ENGLISH);
                        if (v115.length() < 2) continue;
                        if (v115.charAt(0) == '.' || v115.charAt(0) == '*') {
                            v115 = v115.substring(1);
                        }
                        if (!v49.add(v115)) continue;
                        v22 = v114.getTimestamp("date");
                        v116 = v22 != null ? v22.getTime() : System.currentTimeMillis();
                        ((Collection)v106).add(LiteBansModule_373.BaseCoreGenericHandler(v116, v115));
                    }
                    v113 = KotlinUnitHandler.BaseCoreGenericHandler;
                }
                catch (Throwable v117) {
                    v118 = v117;
                    throw v117;
                }
                finally {
                    CloseactionHandler.BaseCoreGenericHandler((AutoCloseable)v112, (Throwable)v118);
                }
                if (v49.size() <= 5) {
                    this.r = 1;
                    return v26;
                }
                v111 = v106;
                if (v111.size() > 1) {
                    CollectionUtilities.BaseCoreGenericHandler((List)v111, new LiteBansModule_318());
                }
                v111 = CollectionUtilities.BaseCoreGenericHandler((Iterable)v106, v105);
                v112 = v111.iterator();
                while (v112.hasNext()) {
                    v118 = v112.next();
                    v113 = (LiteBansModule_356)v118;
                    v119 = this.plugin(StringUtilities.BaseCoreGenericHandler((CharSequence)v113.e()));
                    v120 = (Map)v110;
                    v72 = v119;
                    v121 = v120.get(v72);
                    if (v121 == null) {
                        v122 = new ArrayList<PunishmentService>((32 + v106.size()) / 5);
                        v120.put(v72, v122);
                        v23   = v122;
                    } else {
                        v23   = v121;
                    }
                    v94 = (List)v23  ;
                    ((Collection)v94).add(v113);
                    v107[v119] = v107[v119] + (((String)v113.e()).length() + 1);
                }
                v123 = v111 = (SortHandler)LiteBansModule_4.BaseCoreGenericHandler.BaseCoreGenericHandler().BaseCoreGenericHandler();
                synchronized (v123) {
                    if (this.AsyncBackgroundTask_21 >= 20 && v40 - v1.AsyncBackgroundTask_5().LiteBansModule_31() > 57600000L) {
                        this.c(v1);
                        v118 = LiteBansModule_399.BaseCoreGenericHandler();
                    } else {
                        v118 = this.plugin(v1);
                    }
                    v124 = ((Object[])this.g).length;
                    v125   = new byte[v124][];
                    while (v126 < v124) {
                        v127 = v126++;
                        v125  [v127] = LiteBansModule_391.BaseCoreGenericHandler();
                    }
                    v72 = v125  ;
                    v128 = v118;
                    v125   = (byte[][])((AutoCloseable)v128);
                    try {
                        v129 = (ResultSet)v125  ;
                        while (v128.next()) {
                            v130 = v128;
                            v72[v130.getInt((String)"SQLiteDriverHandler_4")] = v130.getBytes("LiteBansModule_31");
                        }
                        v129 = KotlinUnitHandler.BaseCoreGenericHandler;
                    }
                    catch (Throwable v131) {
                        v132 = v131;
                        throw v131;
                    }
                    finally {
                        CloseactionHandler.BaseCoreGenericHandler((AutoCloseable)v125  , (Throwable)v132);
                    }
                    this.LiteBansModule_31.clear();
                    this.PunishmentTableService = new byte[0][];
                    v133 = v110.size() >= ((Object[])v72).length;
                    v134 = ((Object[])this.g).length;
                    v132 = new byte[v134][];
                    v93 = v111;
                    while (v124 < v134) {
                        v135 = v124++;
                        v132[v135] = LiteBansModule_391.BaseCoreGenericHandler();
                    }
                    v93.BaseCoreGenericHandler((byte[][])v132);
                    v136 = new LiteBansModule_325(v111.c() << 32 << 32);
                    v137 = new byte[40];
                    v132 = v110.entrySet();
                    v132 = CollectionUtilities.BaseCoreGenericHandler((Iterable)v132, (Comparator)new LiteBansModule_257());
                    v138 = v132.iterator();
                    while (v138.hasNext()) {
                        block109: {
                            v139 = v138.next();
                            v140 = (Map.Entry)v139;
                            v100 = (Object[])v72;
                            for (Object v141 : v100) {
                                v142 = (byte[])v141;
                                v24 = v142.length == 0;
                                if (!v24) continue;
                                v25 = false;
                                break block109;
                            }
                            v25 = true;
                        }
                        if (v25) {
                            v96 = v72[((Number)v140.getKey()).intValue()];
                        }
                        v100 = this;
                        ObjectUtilities.BaseCoreGenericHandler(v140);
                        v101 = v140;
                        v26 = v96;
                        if (v26 == null) {
                            v26 = LiteBansModule_391.BaseCoreGenericHandler();
                        }
                        v143 = v26;
                        v141 = v111;
                        v144 = '\u0000';
                        v145 = (Iterable)v101.getValue();
                        v146 = v145;
                        v147 = new ArrayList<PunishmentService>();
                        v148 = v146.iterator();
                        while (v148.hasNext()) {
                            block110: {
                                v149 = v148.next();
                                v150 = (LiteBansModule_356)v149;
                                if (((String)v150.e()).length() >= 20) ** GOTO lbl-1000
                                v151 = (CharSequence)v150.e();
                                v152 = SortHandler.P;
                                for (v153 = 0; v153 < v151.length(); ++v153) {
                                    v154 = v155 = v151.charAt(v153);
                                    v156 = v152;
                                    if (97 <= v154 ? v154 < 123 : false) ** GOTO lbl-1000
                                    v27 = 48 <= v154 ? v154 < 58 : false;
                                    if (v27 || v154 == 44) lbl-1000:
                                                                        {
                                        v28 = true;
                                    } else {
                                        v28 = false;
                                    }
                                    if (v28) continue;
                                    v29 = false;
                                    break block110;
                                }
                                v29 = true;
                            }
                            if (v29) {
                                v30 = true;
                            } else lbl-1000:
                                                        {
                                v30 = false;
                            }
                            if (!v30) continue;
                            v147.add(v149);
                        }
                        v145 = (List)v147;
                        v146 = v145;
                        v147 = new ArrayList<PunishmentService>(CollectionUtilities.BaseCoreGenericHandler((Iterable)v145, 10));
                        v148 = v146.iterator();
                        while (v148.hasNext()) {
                            v149 = v148.next();
                            v150 = (LiteBansModule_356)v149;
                            v157 = v147;
                            v157.add((String)v150.e());
                        }
                        v145 = (List)v147;
                        v158 = CollectionUtilities.BaseCoreGenericHandler((Iterable)v145, (Comparator)new LiteBansModule_72((SortHandler)v111));
                        v145 = CollectionUtilities.BaseCoreGenericHandler(v158, ",", null, null, 0, null, null, 62, null);
                        v146 = v141;
                        v147 = v145.getBytes(LiteBansModule_345.AsyncBackgroundTask_5);
                        v150 = v149 = (v148 = v147);
                        for (boolean v159 : v150) {
                            v31 = v160++;
                            v153 = v159  ;
                            v155 = v31;
                            v161 = v146;
                            v147[v155] = v161.n()[v153 - 44];
                        }
                        v162 = v148;
                        v146 = new byte[((Object)v162).length];
                        v111.BaseCoreGenericHandler(v111.LiteBansModule_195());
                        if (v96 != null && ((Object)v96).length == 0 == false) {
                            v111.LiteBansModule_31().BaseCoreGenericHandler((byte[])v96);
                        } else {
                            v147 = new byte[8192];
                            v111.LiteBansModule_31().BaseCoreGenericHandler((byte[])v147);
                            v141.LiteBansModule_31(true);
                            SortHandler.BaseCoreGenericHandler((SortHandler)v141, (byte[])v162, (byte[])v146, false, false, 12, null);
                            v143 = v141.BroadcastService();
                            v141.LiteBansModule_31(false);
                        }
                        v32 = v111.BaseCoreGenericHandler();
                        if (v32 != null) {
                            v32[((Number)v101.getKey()).intValue()] = v111.LiteBansModule_31().LiteBansModule_31();
                            v33 = KotlinUnitHandler.BaseCoreGenericHandler;
                        } else {
                            v33 = null;
                        }
                        v147 = v141.BaseCoreGenericHandler(v100.BaseCoreGenericHandler, (String)v145, true, v111.LiteBansModule_195(), v136, v137);
                        SortHandler.BaseCoreGenericHandler((SortHandler)v141, (byte[])v147, (byte[])v146, false, false, 12, null);
                        v34 = v163 = v100.BaseCoreGenericHandler((SortHandler)v111) == false ? 1 : 0;
                        if (v163 != 0) {
                            SortHandler.BaseCoreGenericHandler((SortHandler)v141, (byte[])v146, 600, false, false, 12, null);
                        }
                        if (v163 != 0) {
                            v149 = new ArrayList<PunishmentService>(71);
                            v148 = SortHandler.BaseCoreGenericHandler((SortHandler)v141, (byte[])v146, 0, 0, new LiteBansModule_177((ArrayList)v149, (ServerSyncService)v100), 6, null);
                            v150 = (Collection)v149;
                            v164 = v150;
                            v100.BaseCoreGenericHandler((byte[][])v164.toArray((T[])new byte[0][]));
                            v141.LiteBansModule_241();
                        } else {
                            v148 = SortHandler.BaseCoreGenericHandler((SortHandler)v141, (byte[])v146, 0, 0, null, 14, null);
                        }
                        v149 = v100.BaseCoreGenericHandler();
                        if (v149.g()) {
                            v157 = v149;
                            v35 = new StringBuilder().append("Bucket ").append(((Number)v101.getKey()).intValue()).append(" filled with (").append(((Object)v147).length).append(" => ").append(((Object)v148).length).append(") bytes\n").append(ArrayUtilities.BaseCoreGenericHandler((byte[])v146, (CharSequence)",", null, null, 0, null, null, 62, null)).append('\n').append((String)v145).append('\n');
                            v36 = v100.BaseCoreGenericHandler();
                            v165 = AbstractCommand.AsyncBackgroundTask_5;
                            v166 = ArrayUtilities.BaseCoreGenericHandler((byte[])v148, null, null, null, 0, null, null, 63, null);
                            if (ObjectUtilities.BaseCoreGenericHandler((Object)v166, (Object)"sort")) {
                                v167 = new String[]{"00"};
                                v37 = v167;
                            } else {
                                v167 = new String[]{"01:" + v166};
                                v37 = v167;
                            }
                            v168 = v37;
                            v157.BaseCoreGenericHandler((Object)v35.append((Object)LiteBansModule_73.c(new LiteBansModule_405(v36, Arrays.copyOf(v168, v168.length)).LiteBansModule_31())).toString());
                        }
                        v111.LiteBansModule_31().BaseCoreGenericHandler(LiteBansModule_391.BaseCoreGenericHandler());
                        ServerSyncService.c((ServerSyncService)v100)[((Number)v101.getKey()).intValue()] = (byte[])v148;
                        v100.BaseCoreGenericHandler(v100.Utf8Handler_2() + ((List)v101.getValue()).size());
                        v96 = v143;
                        if (!v133) continue;
                        try {
                            v101 = BansHandler_2.n;
                            v169 = "SQLiteDriverHandler_4,LiteBansModule_31";
                            v170 = v1;
                            v141 = v169;
                            v144 = ',';
                            v162 = v141;
                            for (v163 = 0; v163 < v162.length(); ++v163) {
                                v171 = v172 = v162.charAt(v163);
                                if (!(v171 == v144)) continue;
                                ++v173;
                            }
                            v160 = v173;
                            v141 = "?";
                            if (v160 > 0) {
                                v174 = new StringBuilder(v160 * 2);
                                v175 = new LiteBansModule_167(0, v160);
                                v176 = v175.iterator();
                                while (v176.hasNext()) {
                                    v163 = v173 = ((LiteBansModule_291)v176).LiteBansModule_31();
                                    v174.append("?,");
                                }
                                v141 = StringUtilities.LiteBansModule_31(v174.toString(), 1);
                            }
                            v177 = v101;
                            v100 = v170.c(SQLiteDriverHandler.AsyncBackgroundTask_5(SQLiteDriverHandler.e("INSERT INTO " + v177 + '(' + v169 + ")VALUES(" + (CharSequence)v141 + ')')));
                            LiteBansModule_185.AsyncBackgroundTask_5(v100.BaseCoreGenericHandler(((Number)v140.getKey()).intValue()).BaseCoreGenericHandler((byte[])v96));
                        }
                        catch (SQLException v178) {
                            v38 = v178.getMessage();
                            if (v38 == null) {
                                v38 = "";
                            }
                            if (StringUtilities.BaseCoreGenericHandler((CharSequence)(v179 = v38), (CharSequence)"Duplicate entry", false, 2, null) || StringUtilities.BaseCoreGenericHandler((CharSequence)v179, (CharSequence)"duplicate key", false, 2, null)) continue;
                            v1.AsyncBackgroundTask_5().BaseCoreGenericHandler(v178);
                        }
                    }
                    if (v133) {
                        ServerSyncService.BaseCoreGenericHandler(this, BroadcastHandler.PunishmentTableService, v1, null, 0, 12, null);
                    }
                    v180 = KotlinUnitHandler.BaseCoreGenericHandler;
                }
                v181 = System.currentTimeMillis() - v108;
                this.AsyncBackgroundTask_21 = 0;
                v182 = ArrayUtilities.BaseCoreGenericHandler(v107);
                v46 = (Object[])this.g;
                for (Object v49 : v46) {
                    v110 = (byte[])v49;
                    v183 = v184;
                    v185 = ((Object)v110).length;
                    v184 = v183 + v185;
                }
                v46 = (Object[])this.PunishmentTableService;
                v186 = v184;
                for (Object v49 : v46) {
                    v110 = (byte[])v49;
                    v187 = v184;
                    v188 = ((Object)v110).length;
                    v184 = v187 + v188;
                }
                v189 = v184;
                v190 = v186 + v189;
                v191 = Math.abs(100 - (int)((double)v190 / (double)v182 * 100.0));
                v192 = " (reduced " + v191 + "% from " + v182 + " bytes)";
                if (v190 >= v182) {
                    v192 = "";
                }
                this.plugin().BaseCoreGenericHandler((Object)("[Sync] Cached " + this.r + " offline users for tab completion InitializerHandler_3 " + v181 + " ms. Memory used: " + v190 + " bytes" + v192));
            }
            catch (Throwable v193) {
                v1.AsyncBackgroundTask_5().BaseCoreGenericHandler(v193);
            }
        }
        return v26;
    }

    private final ResultSet BaseCoreGenericHandler(LiteBansModule_83 ch2, int n) {
        BansHandler_2 kL2 = BansHandler_2.g;
        CharSequence charSequence = "name,date";
        return LiteBansModule_185.AsyncBackgroundTask_5(ch2.c(SQLiteDriverHandler.AsyncBackgroundTask_5(SQLiteDriverHandler.BaseCoreGenericHandler(SQLiteDriverHandler.BaseCoreGenericHandler(SQLiteDriverHandler.e("SELECT " + charSequence + " FROM " + kL2), "SQLiteDriverHandler_4"), (Number)n))));
    }

    public final ResultSet BaseCoreGenericHandler(@NotNull LiteBansModule_83 ch2) {
        BansHandler_2 kL2 = BansHandler_2.n;
        CharSequence charSequence = "*";
        return LiteBansModule_185.AsyncBackgroundTask_5(ch2.c(SQLiteDriverHandler.AsyncBackgroundTask_5(SQLiteDriverHandler.e("SELECT " + charSequence + " FROM " + kL2))));
    }

    public final ResultSet c(@NotNull LiteBansModule_83 ch2) {
        BansHandler_2 kL2 = BansHandler_2.n;
        return LiteBansModule_185.AsyncBackgroundTask_5(ch2.c(SQLiteDriverHandler.AsyncBackgroundTask_5(SQLiteDriverHandler.e("DELETE FROM " + kL2))));
    }

    public final boolean BaseCoreGenericHandler(@NotNull SortHandler br2) {
        if (!(((Object[])this.PunishmentTableService).length == 0)) {
            if (br2.LiteBansModule_403().isEmpty()) {
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
                    collection2.add(new LiteBansModule_343(byArray, by3, 0, 4, null));
                }
                br3.BaseCoreGenericHandler((List)collection);
            }
            return true;
        }
        return false;
    }

    public final ByteArrayOutputStream c(int n) {
        return new LiteBansModule_214(n);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final LiteBansModule_56 BaseCoreGenericHandler(int n, @NotNull SortHandler br2) {
        Object[] objectArray;
        Object resultObj = this.plugin();
        if (((ConfigService)resultObj).g()) {
            ConfigService configService = resultObj;
            objectArray = (Object[])this.PunishmentTableService;
            StringBuilder stringBuilder = new StringBuilder().append("Read bucket ").append(n).append(" + ").append(br2.LiteBansModule_403().size()).append(" loaded, ").append(((Object[])this.PunishmentTableService).length).append(" stored\n").append(CollectionUtilities.BaseCoreGenericHandler(br2.LiteBansModule_403(), "|", null, null, 0, null, ServerSyncService::BaseCoreGenericHandler, 30, null)).append('\n');
            Object[] objectArray2 = objectArray;
            contextObj = new ArrayList(objectArray.length);
            for (Object helperObj : objectArray2) {
                targetObj = (byte[])helperObj;
                Collection tempObj = contextObj;
                boolean object14 = false;
                tempObj.add(ArrayUtilities.BaseCoreGenericHandler((byte[])targetObj, null, null, null, 0, null, null, 63, null));
            }
            configService.BaseCoreGenericHandler((Object)stringBuilder.append((List)contextObj).toString());
        }
        resultObj = br2;
        synchronized (resultObj) {
            int n2;
            boolean flag2;
            byte[] byArray;
            block19: {
                block18: {
                    flag = false;
                    this.plugin(br2);
                    if (!br2.LiteBansModule_403().isEmpty() && !(((Object[])this.PunishmentTableService).length == 0)) break block18;
                    this.plugin().BaseCoreGenericHandler(10, (Object)"No cache");
                    LiteBansModule_56 bP2 = new LiteBansModule_56((byte)n, LiteBansModule_350.BaseCoreGenericHandler());
                    return bP2;
                }
                byArray = this.g[n];
                objectArray = this.plugin();
                if (objectArray.g()) {
                    ConfigService q_03 = objectArray;
                    q_03.BaseCoreGenericHandler((Object)ArrayUtilities.BaseCoreGenericHandler(byArray, null, null, null, 0, null, null, 63, null));
                }
                objectArray = (Object[])br2.BaseCoreGenericHandler();
                if (byArray != LiteBansModule_391.BaseCoreGenericHandler() && objectArray != null && !(((Object)objectArray[n]).length == 0)) break block19;
                this.plugin().BaseCoreGenericHandler(10, (Object)"No cache");
                LiteBansModule_56 bP3 = new LiteBansModule_56((byte)n, LiteBansModule_350.BaseCoreGenericHandler());
                return bP3;
            }
            br2.LiteBansModule_31().BaseCoreGenericHandler((byte[])objectArray[n]);
            ByteArrayOutputStream byteArrayOutputStream = this.c(byArray.length * 4);
            br2.BaseCoreGenericHandler(byArray, byteArrayOutputStream);
            byte[] byArray2 = new byte[byteArrayOutputStream.size()];
            br2.BaseCoreGenericHandler(br2.LiteBansModule_195());
            contextObj = Arrays.copyOf(byteArrayOutputStream.toByteArray(), byteArrayOutputStream.size());
            ObjectUtilities.BaseCoreGenericHandler(contextObj);
            SortHandler.BaseCoreGenericHandler(br2, (byte[])contextObj, byArray2, false, false, 8, null);
            Object object7 = this.plugin();
            if (((ConfigService)object7).g()) {
                ConfigService q_04 = object7;
                q_04.BaseCoreGenericHandler((Object)ArrayUtilities.BaseCoreGenericHandler(byArray2, null, null, null, 0, null, null, 63, null));
            }
            object7 = br2.BaseCoreGenericHandler(byArray2).toString();
            Object object8 = new char[]{','};
            object8 = StringUtilities.BaseCoreGenericHandler((CharSequence)object7, object8, false, 0, 6, null);
            targetObj = object8;
            String[] args = targetObj.toArray(new String[0]);
            object8 = new HashMap(args.length * 2, 0.5f);
            for (String string : args) {
                if (!(((CharSequence)string).length() > 0)) continue;
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
                String string = ((Object)((CharSequence)object7)).toString();
                n2 = 0;
                if (ObjectUtilities.BaseCoreGenericHandler((Object)string, (Object)"sort")) {
                    String[] cmdArgs = new String[]{"00"};
                    parsedArgs = cmdArgs;
                } else {
                    String[] stringArray5 = new String[]{"01:" + string};
                    parsedArgs = stringArray5;
                }
                if (new LiteBansModule_405((ConfigService)object11, Arrays.copyOf(filteredArgs = parsedArgs, filteredArgs.length)).LiteBansModule_31() == object11.hashCode()) {
                    throw new IllegalArgumentException();
                }
            }
            object12 = new LiteBansModule_56((byte)n, new HashMap((Map)object8));
            ((Collection)this.LiteBansModule_31).add(new SoftReference<Object>(object12));
            Object object13 = object12;
            return object13;
        }
    }

    public final int BaseCoreGenericHandler(char c) {
        return c % ((Object[])this.g).length;
    }

    public final int[] BaseCoreGenericHandler(@NotNull String string) {
        if (((CharSequence)string).length() == 0) {
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

    private static final CharSequence BaseCoreGenericHandler(LiteBansModule_343 jg_02) {
        return ArrayUtilities.BaseCoreGenericHandler(jg_02.c(), null, null, null, 0, null, null, 63, null);
    }

    public static final /* synthetic */ byte[][] c(ServerSyncService u2) {
        return u2.g;
    }

    static {
        m = "\ufeff";
        n = (char)65279;
        ServerSyncService.LiteBansModule_195();
        GnuSparseMapHandler = new LiteBansModule_304(null);
    }

    private static final void LiteBansModule_195() {
        LiteBansModule_195 = new String[]{"0x11 <PluginHookService> ", "sort", "00", "01:", "0x11 <", "> ", "[Sync] Detected duplicate server. This will be resolved ", "server.yml", "server.json", "0x11 <", "> ", "info,msg", "?", "?,", "INSERT INTO ", ")VALUES(", "1 minute", "pgsql", "DELETE FROM ", "time < (NOW() - INTERVAL ", "Failed ", " WHERE ", "", "1 minute", "pgsql", "DELETE FROM ", "time < (NOW() - INTERVAL ", "Failed ", " WHERE ", "[!!!] NF ", "muted", "warned", "0x11 <", "> ", "SQLiteDriverHandler_4", "SELECT ", " FROM ", "SQLiteDriverHandler_4", "SQLiteDriverHandler_4", "L+ ", "SELECT * FROM ", " WHERE SQLiteDriverHandler_4>?", "SQLiteDriverHandler_4", "info", "0x11 <", "> ", "msg", "0x11 <", "> ", "SQLiteDriverHandler_4: ", ", type: ", ", server: ", ", message: \"", "server", "Server", "server", "playerServer", "0x11 <PluginHookService> ", "sort", "00", "01:", "element", "element", "BAN", "Array contains no element matching the ", "element", "console", "element", "element", "element", "element", "element", "1", "1", "kick", "", "", "name", "date", "SQLiteDriverHandler_4", "LiteBansModule_31", ",", "Bucket ", " filled with (", " => ", ") bytes\n", ",", "sort", "00", "01:", "SQLiteDriverHandler_4,LiteBansModule_31", "?", "?,", "INSERT INTO ", ")VALUES(", "", "Duplicate entry", "duplicate key", " (reduced ", "% from ", " bytes)", "", "[Sync] Cached ", " offline users for tab completion InitializerHandler_3 ", " ms. Memory used: ", " bytes", "name,date", "SELECT ", " FROM ", "SQLiteDriverHandler_4", "*", "SELECT ", " FROM ", "DELETE FROM ", ",", "Bucket ", " filled with (", " => ", ") bytes\n", ",", "sort", "00", "01:", "Read bucket ", " + ", " loaded, ", " stored\n", "|", "No cache", "No cache", "sort", "00", "01:", "):"};
    }
}
}
}
}
}
