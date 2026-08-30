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
        int n = 0;
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
        block1: {
            Iterable iterable = this.LiteBansModule_31;
            for (Object t2 : iterable) {
                Reference reference = (Reference)t2;
                boolean flag = false;
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
        DiscordWebhookClient eG2 = this.plugin().LiteBansModule_194();
        boolean flag = false;
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
        boolean flag = false;
        Object object = atomicBoolean;
        boolean flag2 = false;
        if (((AtomicBoolean)object).compareAndSet(false, true)) {
            try {
                object = this.AsyncBackgroundTask_5();
                flag2 = false;
                try {
                    LiteBansModule_82 ch2 = ((DatabaseMonitorService)object).LiteBansModule_194();
                    Closeable closeable = ch2;
                    Throwable throwable = null;
                    try {
                        Object object2 = (LiteBansModule_82)closeable;
                        boolean flag3 = false;
                        LiteBansModule_82 ch3 = ch2;
                        boolean flag4 = false;
                        this.BroadcastService = this.plugin(ch3, this.AsyncBackgroundTask_5, this.BroadcastService);
                        object2 = KotlinUnitHandler.BaseCoreGenericHandler;
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
                    if (!((DatabaseMonitorService)object).LiteBansModule_31(sQLException)) {
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

    private final void AsyncBackgroundTask_5(LiteBansModule_82 ch2) {
        long l3 = ((AtomicLong)this.LiteBansModule_401.LiteBansModule_194()).incrementAndGet();
        long l5 = l3 - ((AtomicLong)this.LiteBansModule_401.c()).get();
        if (l5 > 1L) {
            this.LiteBansModule_31(ch2);
        }
    }

    private final void LiteBansModule_31(LiteBansModule_82 ch2) {
        this.plugin().BaseCoreGenericHandler((Object)"[Sync] Detected duplicate server. This will be resolved ");
        LiteBansModule_389.BaseCoreGenericHandler(this.LiteBansModule_401, ResetHandler.LiteBansModule_401);
        Serializable serializable = ch2.e().getDataFolder();
        String string = "server.yml";
        boolean flag = false;
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
        Object object = charSequence;
        int n2 = 4092;
        char c = '\u0000';
        String string = LiteBansModule_242.BaseCoreGenericHandler(object.toString(), n2);
        object = this.AsyncBackgroundTask_5().LiteBansModule_401();
        if (object == null || ((LiteBansModule_15)object).LiteBansModule_194() && n == -1) {
            ServerSyncService u2 = this;
            c = 'LiteBansModule_433';
            boolean flag = false;
            ConfigService configService = u2.BaseCoreGenericHandler();
            boolean flag2 = false;
            if (configService.g()) {
                ConfigService q_03 = configService;
                boolean flag3 = false;
                q_03.BaseCoreGenericHandler((Object)("0x11 <" + c + "> " + object));
            }
            return;
        }
        try {
            Object object2;
            boolean flag;
            char c10;
            int n3;
            n2 = ((LiteBansModule_15)object).c();
            if (n != -1 && n != n2) {
                n2 = n;
            } else {
                ((AtomicLong)this.LiteBansModule_401.c()).incrementAndGet();
            }
            c = (ij2.AsyncBackgroundTask_5() << 16 | n2) + 42;
            Object object3 = BansHandler_2.c;
            CharSequence charSequence2 = "info,msg";
            LiteBansModule_82 ch3 = ch2;
            boolean flag4 = false;
            Object object4 = charSequence2;
            char c11 = ',';
            boolean flag5 = false;
            CharSequence charSequence3 = object4;
            boolean flag6 = false;
            int n4 = 0;
            for (n3 = 0; n3 < charSequence3.length(); ++n3) {
                char c12 = c10 = charSequence3.charAt(n3);
                flag = false;
                if (!(c12 == c11)) continue;
                ++n4;
            }
            int n5 = n4;
            object4 = "?";
            if (n5 > 0) {
                StringBuilder stringBuilder = new StringBuilder(n5 * 2);
                Iterable iterable = new LiteBansModule_166(0, n5);
                boolean flag7 = false;
                Iterator iterator = iterable.iterator();
                while (iterator.hasNext()) {
                    n3 = n4 = ((LiteBansModule_290)iterator).LiteBansModule_31();
                    c10 = '\u0000';
                    stringBuilder.append("?,");
                }
                object4 = StringUtilities.LiteBansModule_31(stringBuilder.toString(), 1);
            }
            BansHandler_2 kL2 = object3;
            flag5 = false;
            object3 = ch3.c(SQLiteDriverHandler.AsyncBackgroundTask_5(SQLiteDriverHandler.e("INSERT INTO " + kL2 + '(' + charSequence2 + ")VALUES(" + object4 + ')'))).BaseCoreGenericHandler(c);
            boolean flag8 = false;
            object4 = object2 = object3;
            boolean bl9 = false;
            ((LiteBansModule_60)object3).BaseCoreGenericHandler(string);
            LiteBansModule_184.AsyncBackgroundTask_5((LiteBansModule_60)object2);
            object3 = this;
            LiteBansModule_82 ch4 = ch2;
            boolean bl10 = false;
            object4 = (AsyncBackgroundTask_20)ch4.e().BaseCoreGenericHandler(AsyncBackgroundTask_20.class);
            long l3 = System.currentTimeMillis();
            if (l3 - ch4.AsyncBackgroundTask_5().i() > 28800000L) {
                ch4.AsyncBackgroundTask_5().LiteBansModule_31(l3);
                charSequence3 = "1 minute";
                if (ObjectUtilities.BaseCoreGenericHandler((Object)((ServerSyncService)object3).BaseCoreGenericHandler().LiteBansModule_194().ElementsHandler(), (Object)"pgsql")) {
                    charSequence3 = '\'' + (String)charSequence3 + '\'';
                }
                Object object5 = BansHandler_2.c;
                n4 = 0;
                object5 = SQLiteDriverHandler.e("DELETE FROM " + object5);
                CharSequence charSequence4 = "time < (NOW() - INTERVAL " + (String)charSequence3 + ')';
                LiteBansModule_82 ch5 = ch4;
                c10 = '\u0000';
                CharSequence[] charSequenceArray = new CharSequence[]{SQLiteDriverHandler.AsyncBackgroundTask_5((String)object5), charSequence4};
                flag = false;
                CharSequence[] charSequenceArray2 = charSequenceArray;
                boolean bl11 = false;
                int n6 = charSequenceArray2.length;
                for (int i = 0; i < n6; ++i) {
                    CharSequence charSequence5;
                    CharSequence charSequence6 = charSequence5 = charSequenceArray2[i];
                    boolean bl12 = false;
                    if (charSequence6.length() > 0) continue;
                    String string2 = "Failed ";
                    throw new IllegalArgumentException(string2.toString());
                }
                LiteBansModule_184.AsyncBackgroundTask_5(ch5.c(SQLiteDriverHandler.AsyncBackgroundTask_5(SQLiteDriverHandler.e(SQLiteDriverHandler.LiteBansModule_31((String)object5) + " WHERE " + charSequence4))));
                object5 = object4;
                boolean bl13 = false;
                ((AsyncBackgroundTask_20)object5).BaseCoreGenericHandler(ch4);
            }
        }
        catch (SQLException sQLException) {
            this.AsyncBackgroundTask_5().BaseCoreGenericHandler(sQLException);
        }
    }

    public static /* synthetic */ void BaseCoreGenericHandler(ServerSyncService u2, BroadcastHandler ij2, LiteBansModule_82 ch2, CharSequence charSequence, int n, int n2, Object object) {
        if ((n2 & 4) != 0) {
            charSequence = "";
        }
        if ((n2 & 8) != 0) {
            n = -1;
        }
        u2.BaseCoreGenericHandler(ij2, ch2, charSequence, n);
    }

    public void BaseCoreGenericHandler(@NotNull LiteBansModule_82 v1, @NotNull String v2, @NotNull String v3, @NotNull BroadcastHandler var4_4, @NotNull Set var5_5) {
        block38: {
            block37: {
                block36: {
                    if (v2.length() != 36) {
                        return;
                    }
                    var7_6 = var4_4;
                    var8_7 = false;
                    switch (LiteBansModule_384.BaseCoreGenericHandler[var7_6.ordinal()]) {
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
                            v0 = null;
                        }
                    }
                    var6_9 = v0;
                    if (var6_9 == null) {
                        var7_6 = this.plugin();
                        var8_7 = false;
                        if (var7_6.g()) {
                            var23_10 = var7_6;
                            var9_11 = false;
                            var23_10.BaseCoreGenericHandler((Object)("[!!!] NF " + (Object)var4_4));
                        }
                        return;
                    }
                    if (var4_4 == BroadcastHandler.AsyncBackgroundTask_21) {
                        var7_6 = this.g();
                        var8_7 = false;
                        var9_12 = CollectionUtilities.BaseCoreGenericHandler((Iterable)var7_6.BaseCoreGenericHandler().LiteBansModule_31().entrySet(), (LiteBansModule_178)new LiteBansModule_77(v2, v3));
                        if (var9_12) {
                            var7_6.BaseCoreGenericHandler(v2, v3);
                        }
                        return;
                    }
                    if (var5_5.isEmpty()) break block37;
                    if (var4_4.BaseCoreGenericHandler() || var5_5.contains(v2)) break block38;
                    if (((CharSequence)v3).length() == 0) break block37;
                    var7_6 = v1.e().q();
                    var8_7 = false;
                    for (Object var11_16 : var7_6) {
                        var12_18 = (Object[])var11_16;
                        var13_20 = false;
                        if (!SilentHandler.AsyncBackgroundTask_21.BaseCoreGenericHandler(true, var12_18.LiteBansModule_31(), v3, SilentHandler.AsyncBackgroundTask_21.BaseCoreGenericHandler(v3))) continue;
                        v1 = false;
                        break block36;
                    }
                    v1 = true;
                }
                if (!v1) break block38;
            }
            return;
        }
        v2 = AllHandler_3.BaseCoreGenericHandler(v1, v2, v3, var6_9, true, false, 16, null);
        if (v2 == null) {
            return;
        }
        var7_6 = v2;
        var8_8 = DatabaseMonitorService.BaseCoreGenericHandler(v1.AsyncBackgroundTask_5(), false, 1, null);
        if (v1.e().AsyncBackgroundTask_22() == 1) {
            var11_16 = this.LiteBansModule_31();
            var12_19 = false;
            if (var4_4 == BroadcastHandler.DatabaseMonitorService) {
                litebans.BroadcastService.BaseCoreGenericHandler((BroadcastService)var11_16, v1, (SilentHandler)var7_6, null, 2, null);
            } else if (var4_4 == BroadcastHandler.GnuSparseMapHandler) {
                var13_21 = var11_16.BaseCoreGenericHandler.q();
                var14_23 = false;
                var15_25 = var13_21;
                var16_27 = new ArrayList<PunishmentService>();
                var17_31 = false;
                for (Object var20_37 : var15_25) {
                    var21_38 = (CommandSenderWrapper)var20_37;
                    var22_39 = false;
                    if (!var7_6.BaseCoreGenericHandler(var21_38.BaseCoreGenericHandler(), var21_38.LiteBansModule_31(), var8_8)) continue;
                    var16_27.add(var20_37);
                }
                var13_21 = (List)var16_27;
                var14_23 = false;
                var15_25 = var13_21.iterator();
                while (var15_25.hasNext()) {
                    var16_27 = var15_25.next();
                    var17_32 = (CommandSenderWrapper)var16_27;
                    var18_34 = 0;
                    ObjectUtilities.BaseCoreGenericHandler(var17_32);
                    var11_16.BaseCoreGenericHandler(v1, var17_32);
                }
            }
        }
        var10_15 = v1.e().q();
        var11_17 = false;
        var12_18 = var10_15;
        var13_22 = new ArrayList<PunishmentService>();
        var14_23 = false;
        for (Object var17_33 : var12_18) {
            var18_35 = (CommandSenderWrapper)var17_33;
            var19_36 = 0;
            if (!var7_6.BaseCoreGenericHandler(var18_35.BaseCoreGenericHandler(), var18_35.LiteBansModule_31(), var8_8)) ** GOTO lbl-1000
            v3 = var18_35.LiteBansModule_240();
            if (v3 == null) {
                v3 = v1.AsyncBackgroundTask_5().ServerSyncService();
            }
            if ((v4 = var7_6.m()) == null) {
                v4 = LiteBansModule_181.LiteBansModule_194.LiteBansModule_31();
            }
            if (LiteBansModule_181.LiteBansModule_194.BaseCoreGenericHandler(v3, v4)) {
                v5 = true;
            } else lbl-1000:
            // 2 sources

            {
                v5 = false;
            }
            if (!v5) continue;
            var13_22.add(var17_33);
        }
        var10_15 = (List)var13_22;
        var11_17 = false;
        var12_18 = var10_15.iterator();
        while (var12_18.hasNext()) {
            var13_22 = var12_18.next();
            var14_24 = (CommandSenderWrapper)var13_22;
            var15_26 = 0;
            v6 = var6_9;
            switch (v6 == null ? -1 : LiteBansModule_388.BaseCoreGenericHandler[v6.ordinal()]) {
                case 1: {
                    ObjectUtilities.BaseCoreGenericHandler(var14_24);
                    if (!CommandArgumentUtils.BaseCoreGenericHandler(v1, (SilentHandler)var7_6, var14_24)) break;
                    this.LiteBansModule_31().BaseCoreGenericHandler(var14_24, GeoIPLookupService.BaseCoreGenericHandler(v1, (SilentHandler)var7_6, var14_24, -1));
                    break;
                }
                case 2: {
                    this.g().BaseCoreGenericHandler(v2, (SilentHandler)var7_6);
                    if (!this.plugin().LiteBansModule_194().aU()) break;
                    var16_29 = this.LiteBansModule_31();
                    var17_31 = false;
                    ObjectUtilities.BaseCoreGenericHandler(var14_24);
                    var16_29.BaseCoreGenericHandler(v1, var14_24, (SilentHandler)var7_6, -1, "muted");
                    break;
                }
                case 3: {
                    if (!this.plugin().LiteBansModule_194().aU()) break;
                    v1.LiteBansModule_31(v2);
                    var16_30 = this.LiteBansModule_31();
                    var17_31 = false;
                    ObjectUtilities.BaseCoreGenericHandler(var14_24);
                    var16_30.BaseCoreGenericHandler(v1, var14_24, (SilentHandler)var7_6, -1, "warned");
                    break;
                }
                case 4: {
                    v7 = this.LiteBansModule_31();
                    ObjectUtilities.BaseCoreGenericHandler(var14_24);
                    v7.BaseCoreGenericHandler(var14_24, (CharSequence)GeoIPLookupService.BaseCoreGenericHandler(v1, (SilentHandler)var7_6, var14_24));
                }
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Could not resolve type clashes
     * Unable to fully structure code
     */
    public final long BaseCoreGenericHandler(@NotNull LiteBansModule_82 v1, @NotNull Collection v2, long v3) {
        block106: {
            var72_4 = 0L;
            var72_4 = v3;
            try {
                var5_5 = v1.AsyncBackgroundTask_5().LiteBansModule_401();
                if (v1.LiteBansModule_31() || var5_5 == null) {
                    var6_7 = this;
                    var7_9 = 'AsyncBackgroundTask_21';
                    var8_11 = false;
                    var9_14 = var6_7.BaseCoreGenericHandler();
                    var10_16 = false;
                    if (var9_14.g()) {
                        var11_18 = var9_14;
                        var12_22 = false;
                        var11_18.BaseCoreGenericHandler((Object)("0x11 <" + var7_9 + "> " + var5_5));
                    }
                    return var72_4;
                }
                v6 = this.plugin().LiteBansModule_194().LiteBansModule_12();
                var8_12 = v1.e().q();
                var8_12 = (Object[])var8_12;
                var9_15 = false;
                var10_17 = var8_12;
                var11_19 = new ArrayList<PunishmentService>(((Object[])var8_12).length);
                var12_23 = false;
                for (Object var15_40 : var10_17) {
                    var16_42 = (CommandSenderWrapper)var15_40;
                    var69_33 = var11_19;
                    var17_45 = false;
                    var70_36 = var16_42.BaseCoreGenericHandler();
                    var69_33.add(var70_36);
                }
                v7 = CollectionUtilities.g((List)var11_19);
                if (v7.size() <= 0) {
                    var8_12 = v1.AsyncBackgroundTask_5();
                    var8_12.BaseCoreGenericHandler((byte)(var8_12.AsyncBackgroundTask_22() + 1));
                    if (var8_12.AsyncBackgroundTask_22() < v6) {
                        return var72_4;
                    }
                    v1.AsyncBackgroundTask_5().BaseCoreGenericHandler((byte)0);
                }
                var8_13 = DatabaseMonitorService.BaseCoreGenericHandler(v1.AsyncBackgroundTask_5(), false, 1, null);
                if (var72_4 == 0L) {
                    var11_19 = BansHandler_2.c;
                    var12_24 = "SQLiteDriverHandler_4";
                    var13_28 = 0;
                    var10_17 = LiteBansModule_184.AsyncBackgroundTask_5(v1.c(SQLiteDriverHandler.AsyncBackgroundTask_5(SQLiteDriverHandler.BaseCoreGenericHandler(SQLiteDriverHandler.BaseCoreGenericHandler(SQLiteDriverHandler.e("SELECT " + var12_24 + " FROM " + var11_19), "SQLiteDriverHandler_4"), (Number)1))));
                    if (var10_17.next()) {
                        var72_4 = var10_17.getLong("SQLiteDriverHandler_4");
                        var11_19 = this.plugin();
                        var12_25 = false;
                        if (var11_19.g()) {
                            var69_33 = var11_19;
                            var13_28 = 0;
                            var70_36 = "L+ " + var72_4;
                            var69_33.BaseCoreGenericHandler((Object)var70_36);
                        }
                    }
                }
                var10_17 = LiteBansModule_184.AsyncBackgroundTask_5(v1.c((CharSequence)("SELECT * FROM " + BansHandler_2.c + " WHERE SQLiteDriverHandler_4>?")).BaseCoreGenericHandler(var72_4));
                while (var10_17.next()) {
                    block105: {
                        var11_20 = var10_17.getLong("SQLiteDriverHandler_4");
                        var13_29 = var10_17.getLong("info") - (long)42;
                        var15_41 = LiteBansModule_72.LiteBansModule_31((int)(var13_29 & 65535L));
                        var16_43 = var13_29 >> 16;
                        var18_48 = v1.AsyncBackgroundTask_5().BaseCoreGenericHandler(v1, var15_41, true);
                        var72_4 = Math.max(var72_4, var11_20);
                        if (var18_48 == null) {
                            var19_50 = this;
                            var20_53 = 108;
                            var21_55 = false;
                            var22_60 = var19_50.BaseCoreGenericHandler();
                            var23_66 = false;
                            if (!var22_60.g()) continue;
                            var24_72 = var22_60;
                            var25_80 = false;
                            var24_72.BaseCoreGenericHandler((Object)("0x11 <" + (char)var20_53 + "> " + var18_48));
                            continue;
                        }
                        if (var15_41 == var5_5.c()) {
                            this.AsyncBackgroundTask_5(v1);
                            continue;
                        }
                        var19_50 = null;
                        var19_50 = var10_17.getString("msg");
                        var20_54 = BroadcastHandler.LiteBansModule_401.BaseCoreGenericHandler((int)var16_43);
                        if (var20_54 == null) {
                            var21_56 = this;
                            var22_61 = 'c';
                            var23_67 = var16_43;
                            var24_73 = false;
                            var25_81 = var21_56.BaseCoreGenericHandler();
                            var26_93 = false;
                            if (!var25_81.g()) continue;
                            var27_102 = var25_81;
                            var28_112 = false;
                            var27_102.BaseCoreGenericHandler((Object)("0x11 <" + var22_61 + "> " + var23_67));
                            continue;
                        }
                        ((AtomicLong)this.LiteBansModule_401.BaseCoreGenericHandler()).incrementAndGet();
                        var21_57 = this.plugin();
                        var22_62 = false;
                        if (var21_57.g()) {
                            var69_33 = var21_57;
                            var23_66 = false;
                            var70_36 = "SQLiteDriverHandler_4: " + var11_20 + ", type: " + var16_43 + ", server: " + LiteBansModule_72.c(var15_41) + ", message: \"" + (String)var19_50 + '\"';
                            var69_33.BaseCoreGenericHandler((Object)var70_36);
                        }
                        var21_57 = var19_50;
                        if (StringUtilities.BaseCoreGenericHandler((CharSequence)var21_57, (CharSequence)"server", false, 2, null) || StringUtilities.BaseCoreGenericHandler((CharSequence)(var21_57 = var19_50), (CharSequence)"Server", false, 2, null)) {
                            var22_63 = MessageKey.BaseCoreGenericHandler(var18_48.e(), false);
                            var21_57 = var22_63;
                            var22_63 = var19_50;
                            var19_50 = GeoIPLookupService.BaseCoreGenericHandler((CharSequence)GeoIPLookupService.BaseCoreGenericHandler((CharSequence)var22_63, (CharSequence)"server", var21_57), (CharSequence)"playerServer", var21_57);
                        }
                        var21_57 = v2;
                        var22_64 = false;
                        if (var21_57 instanceof Collection && ((Collection)var21_57).isEmpty()) {
                            v0 = false;
                        } else {
                            for (T var24_74 : var21_57) {
                                var25_82 = (LiteBansModule_200)var24_74;
                                var26_93 = false;
                                if (!(var25_82.BaseCoreGenericHandler((LiteBansModule_15)var18_48, var20_54, (String)var19_50) == false)) continue;
                                v0 = true;
                                break block105;
                            }
                            v0 = false;
                        }
                    }
                    if (v0) {
                        var21_57 = this;
                        var22_64 = false;
                        v1 = var21_57.BaseCoreGenericHandler();
                        var23_69 = AbstractCommand.AsyncBackgroundTask_5;
                        var24_75 = "0x11 <PluginHookService> " + var16_43;
                        var25_83 = false;
                        if (ObjectUtilities.BaseCoreGenericHandler((Object)var24_75, (Object)"sort")) {
                            var26_94 = new String[]{"00"};
                            v2 = var26_94;
                        } else {
                            var26_94 = new String[]{"01:" + var24_75};
                            v2 = var26_94;
                        }
                        var27_103 = v2;
                        new LiteBansModule_403(v1, Arrays.copyOf(var27_103, var27_103.length)).LiteBansModule_31();
                        continue;
                    }
                    var21_57 = null;
                    var23_70 = var22_65 = this.plugin().LiteBansModule_194();
                    var24_76 = false;
                    switch (LiteBansModule_388.LiteBansModule_31[var20_54.ordinal()]) {
                        case 1: 
                        case 2: 
                        case 3: 
                        case 4: 
                        case 5: {
                            v3 = var19_50;
                            ObjectUtilities.c(v3, "element");
                            var21_57 = LiteBansModule_303.BaseCoreGenericHandler(ServerSyncService.GnuSparseMapHandler, (String)v3, 0, 2, null);
                            this.plugin(v1, 0123456789abcdefmvzabcdefmvzHandler.LiteBansModule_194(var21_57[0]), var21_57[1], var20_54, v7);
                            v4 = KotlinUnitHandler.BaseCoreGenericHandler;
                            break;
                        }
                        case 6: 
                        case 7: {
                            if (!var23_70.AsyncBackgroundTask_21()) ** GOTO lbl186
                            v5 = var19_50;
                            ObjectUtilities.c(v5, "element");
                            var21_57 = ServerSyncService.GnuSparseMapHandler.BaseCoreGenericHandler((String)v5, 3);
                            v6 = (String)ArrayUtilities.BaseCoreGenericHandler((Object[])var21_57, 1);
                            if (v6 == null) {
                                v6 = "BAN";
                            }
                            var25_84 = v6;
                            var26_95 = var25_84.toUpperCase(Locale.ROOT);
                            var27_104 /* !! */  = BanHandler.values();
                            var28_112 = false;
                            var30_127 = var27_104 /* !! */ .length;
                            for (var29_119 = 0; var29_119 < var30_127; var29_119 += 1) {
                                var32_140 = var31_134 = var27_104 /* !! */ [var29_119];
                                var33_142 = 0;
                                if (!ObjectUtilities.BaseCoreGenericHandler((Object)var32_140.name(), (Object)var26_95)) {
                                    continue;
                                }
                                ** GOTO lbl177
                            }
                            throw new NoSuchElementException("Array contains no element matching the predicate + ");
lbl177:
                            // 1 sources

                            var25_84 = var31_134;
                            v7 = (String)ArrayUtilities.BaseCoreGenericHandler((Object[])var21_57, 2);
                            if (v7 == null) {
                                v7 = v1.AsyncBackgroundTask_5().ServerSyncService();
                            }
                            var27_104 /* !! */  = v7;
                            var29_120 = this.LiteBansModule_31();
                            var30_127 = 0;
                            litebans.BroadcastService.BaseCoreGenericHandler(var29_120, v1, (CharSequence)var21_57[0], var20_54, (BanHandler)var25_84, (String)var27_104 /* !! */ , false, false, null, 112, null);
lbl186:
                            // 2 sources

                            v4 = KotlinUnitHandler.BaseCoreGenericHandler;
                            break;
                        }
                        case 8: {
                            var25_85 = this.LiteBansModule_31();
                            var27_105 = false;
                            v8 = var19_50;
                            ObjectUtilities.c(v8, "element");
                            litebans.BroadcastService.BaseCoreGenericHandler(var25_85, v1, (CharSequence)v8, "console", null, null, var23_70.AsyncBackgroundTask_21() != false && var23_70.LiteBansModule_14() != false && var23_70.B() != false, false, null, 108, null);
                            v4 = KotlinUnitHandler.BaseCoreGenericHandler;
                            break;
                        }
                        case 9: {
                            v9 = var19_50;
                            ObjectUtilities.c(v9, "element");
                            var21_57 = LiteBansModule_303.BaseCoreGenericHandler(ServerSyncService.GnuSparseMapHandler, (String)v9, 0, 2, null);
                            var26_96 = var21_57[0];
                            var25_86 = var21_57[1];
                            var28_113 = this.LiteBansModule_31();
                            var29_121 = false;
                            litebans.BroadcastService.BaseCoreGenericHandler(var28_113, v1, (CharSequence)var25_86, var26_96, null, null, var23_70.AsyncBackgroundTask_21(), false, null, 108, null);
                            v4 = KotlinUnitHandler.BaseCoreGenericHandler;
                            break;
                        }
                        case 10: {
                            if (var23_70.aU()) {
                                v10 = var19_50;
                                ObjectUtilities.c(v10, "element");
                                var21_57 = LiteBansModule_303.BaseCoreGenericHandler(ServerSyncService.GnuSparseMapHandler, (String)v10, 0, 2, null);
                                this.LiteBansModule_31().LiteBansModule_31(var21_57[0], var21_57[1], false);
                            }
                            v4 = KotlinUnitHandler.BaseCoreGenericHandler;
                            break;
                        }
                        case 11: {
                            var25_87 = this.LiteBansModule_31();
                            var27_106 = false;
                            v11 = var19_50;
                            ObjectUtilities.c(v11, "element");
                            litebans.BroadcastService.BaseCoreGenericHandler(var25_87, v1, (CharSequence)v11, var20_54, null, null, var23_70.ExceptionHandler() != false && var23_70.LockdownCommandHandler() != false && var23_70.aU() != false, false, null, 108, null);
                            v4 = KotlinUnitHandler.BaseCoreGenericHandler;
                            break;
                        }
                        case 12: {
                            var25_88 = this.LiteBansModule_31();
                            var27_107 = false;
                            v12 = var19_50;
                            ObjectUtilities.c(v12, "element");
                            litebans.BroadcastService.BaseCoreGenericHandler(var25_88, v1, (CharSequence)v12, var20_54, BanHandler.GnuSparseMapHandler, null, var23_70.aU(), false, null, 104, null);
                            v4 = KotlinUnitHandler.BaseCoreGenericHandler;
                            break;
                        }
                        case 13: {
                            var26_97 = var23_70.LiteBansModule_4().q();
                            ObjectUtilities.BaseCoreGenericHandler(var26_97);
                            if (!(var26_97.length == 0 == false)) ** GOTO lbl299
                            v13 = var19_50;
                            ObjectUtilities.c(v13, "element");
                            var21_57 = ServerSyncService.GnuSparseMapHandler.BaseCoreGenericHandler((String)v13, 8);
                            var25_89 = 0123456789abcdefmvzabcdefmvzHandler.LiteBansModule_194(var21_57[0]);
                            var27_108 = var21_57[1];
                            var28_114 = var21_57[2];
                            var29_122 = var21_57[3];
                            var31_134 = ServerSyncService.GnuSparseMapHandler;
                            var32_140 = (String)ArrayUtilities.BaseCoreGenericHandler((Object[])var21_57, 4);
                            var33_142 = 0;
                            var30_127 = (int)ObjectUtilities.BaseCoreGenericHandler(var32_140, (Object)"1");
                            var32_140 = ServerSyncService.GnuSparseMapHandler;
                            var33_143 = (String)ArrayUtilities.BaseCoreGenericHandler((Object[])var21_57, 5);
                            var34_151 = false;
                            var31_135 = ObjectUtilities.BaseCoreGenericHandler((Object)var33_143, (Object)"1");
                            v14 = (String)ArrayUtilities.BaseCoreGenericHandler((Object[])var21_57, 6);
                            var32_141 = v14 != null && (v14 = LiteBansModule_232.BaseCoreGenericHandler((String)v14)) != null ? (byte)v14.BaseCoreGenericHandler() : -1;
                            v15 = (String)ArrayUtilities.BaseCoreGenericHandler((Object[])var21_57, 7);
                            var33_142 = v15 != null && (v15 = StringUtilities.BaseCoreGenericHandler((String)v15)) != null ? v15.intValue() : 0;
                            var35_153 = var26_97;
                            var37_161 = ((CommandSenderWrapper[])var35_153).length;
                            for (var36_154 = 0; var36_154 < var37_161; ++var36_154) {
                                var39_171 = var38_167 = var35_153[var36_154];
                                var40_172 = false;
                                if (!StringUtilities.BaseCoreGenericHandler(var39_171.i(), var28_114, true)) continue;
                                v16 = var38_167;
                                ** GOTO lbl267
                            }
                            v16 = var34_150 = null;
lbl267:
                            // 2 sources

                            if (var34_150 != null) {
                                v17 = v1.AsyncBackgroundTask_5().BaseCoreGenericHandler((CommandSenderWrapper)var34_150);
                                if (v17 == null) {
                                    v17 = v1.AsyncBackgroundTask_5().ServerSyncService();
                                }
                                var41_174 = v17;
                                var35_153 = new SilentHandler(BanHandler.g, var34_150.BaseCoreGenericHandler(), var34_150.LiteBansModule_31(), var29_122, var25_89, var27_108, LiteBansModule_181.LiteBansModule_194.LiteBansModule_31(), (String)var41_174, var8_13, -1L, var32_141, (boolean)var30_127, false, false, 0L, 16384, null);
                                v18 = var23_70.LiteBansModule_4().z().BaseCoreGenericHandler("kick");
                                ObjectUtilities.LiteBansModule_31(v18, "");
                                var36_155 = (KickHandler)v18;
                                v19 = this.plugin().AsyncBackgroundTask_21().BaseCoreGenericHandler(BanHandler.g, var32_141);
                                if (v19 == null) {
                                    v19 = LiteBansModule_65.LiteBansModule_31.BaseCoreGenericHandler();
                                }
                                var37_162 = v19;
                                var39_171 = BanHandler.g;
                                var42_176 = false;
                                var40_173 = new LiteBansModule_297(var34_150.i(), var34_150.BaseCoreGenericHandler(), var34_150.LiteBansModule_31(), new Date());
                                v20 = var27_108;
                                if (v20 == null) {
                                    v20 = "";
                                }
                                var42_175 = v20;
                                var43_177 = var35_153.GnuSparseMapHandler();
                                v21 = var35_153.m();
                                if (v21 == null) {
                                    v21 = LiteBansModule_181.LiteBansModule_194.LiteBansModule_31();
                                }
                                var44_180 = v21;
                                var38_167 = new NoneHandler_2((BanHandler)var39_171, false, (boolean)var30_127, var31_135, false, false, false, false, false, false, false, false, false, false, var8_13, 0L, 0L, 0, var37_162, null, false, null, var33_142, null, var40_173, null, null, (CommandSenderWrapper)var34_150, (String)var42_175, var25_89, var44_180, (String)var43_177, null, null, null, null, null, 112967666, 31, null);
                                var38_167.LiteBansModule_31((SilentHandler)var35_153);
                                var39_171 = var36_155;
                                var40_172 = false;
                                var39_171.BaseCoreGenericHandler((NoneHandler_2)var38_167, v1, (CommandSenderWrapper)var34_150);
                            }
lbl299:
                            // 4 sources

                            v4 = KotlinUnitHandler.BaseCoreGenericHandler;
                            break;
                        }
                        case 14: {
                            var26_98 = v1.AsyncBackgroundTask_5();
                            var25_90 = 21600000 + new LiteBansModule_324(0L, 1, null).BaseCoreGenericHandler(32400000);
                            var27_109 = false;
                            var26_98.BaseCoreGenericHandler(var8_13 + (long)var25_90);
                            this.r = 0;
                            v4 = KotlinUnitHandler.BaseCoreGenericHandler;
                            break;
                        }
                        case 15: {
                            ServerSyncService.BaseCoreGenericHandler(this, BroadcastHandler.CommandThrottleService, v1, (CharSequence)var19_50, 0, 8, null);
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
                    }
                }
                var11_21 = this.plugin().LiteBansModule_194().NullHandler_8();
                if (var11_21 <= 0 || this.r > 0 && this.AsyncBackgroundTask_21 < 32) break block106;
                this.r = 0;
                var12_27 = new ArrayList<PunishmentService>(6000);
                var13_30 = new int[4];
                var16_44 = 0;
                var17_46 = System.currentTimeMillis();
                var19_51 = 0;
                var20_53 = var11_21 * 2;
                if (var20_53 >= 60000) {
                    var20_53 = var11_21;
                }
                var21_58 = this.plugin(v1, var20_53);
                var22_60 = new HashSet<PunishmentService>(6000);
                var23_71 = new HashMap<K, V>();
                var24_77 = var21_58;
                var25_91 = false;
                var26_99 = (AutoCloseable)var24_77;
                var27_110 = null;
                try {
                    var28_115 = (ResultSet)var26_99;
                    var29_123 = 0;
                    while (var24_77.next()) {
                        var30_129 = var24_77;
                        var31_136 = false;
                        var32_140 = var30_129.getString("name");
                        var33_145 = var32_140.toLowerCase(Locale.ENGLISH);
                        if (var33_145.length() < 2) continue;
                        if (var33_145.charAt(0) == '.' || var33_145.charAt(0) == '*') {
                            var33_145 = var33_145.substring(1);
                        }
                        if (!var22_60.add(var33_145)) continue;
                        v22 = var30_129.getTimestamp("date");
                        var34_152 = v22 != null ? v22.getTime() : System.currentTimeMillis();
                        ((Collection)var12_27).add(LiteBansModule_371.BaseCoreGenericHandler(var34_152, var33_145));
                    }
                    var28_115 = KotlinUnitHandler.BaseCoreGenericHandler;
                }
                catch (Throwable var29_124) {
                    var27_110 = var29_124;
                    throw var29_124;
                }
                finally {
                    CloseactionHandler.BaseCoreGenericHandler((AutoCloseable)var26_99, (Throwable)var27_110);
                }
                if (var22_60.size() <= 5) {
                    this.r = 1;
                    return var72_4;
                }
                var24_77 = var12_27;
                var25_91 = false;
                if (var24_77.size() > 1) {
                    CollectionUtilities.BaseCoreGenericHandler((List)var24_77, new LiteBansModule_317());
                }
                var24_77 = CollectionUtilities.BaseCoreGenericHandler((Iterable)var12_27, var11_21);
                var25_91 = false;
                var26_99 = var24_77.iterator();
                while (var26_99.hasNext()) {
                    var27_110 = var26_99.next();
                    var28_115 = (LiteBansModule_354)var27_110;
                    var29_123 = 0;
                    var30_130 = this.plugin(StringUtilities.BaseCoreGenericHandler((CharSequence)var28_115.e()));
                    var31_137 = (Map)var23_71;
                    var32_140 = var30_130;
                    var33_146 = false;
                    var36_156 = var31_137.get(var32_140);
                    if (var36_156 == null) {
                        var37_163 = false;
                        var37_164 = new ArrayList<PunishmentService>((32 + var12_27.size()) / 5);
                        var31_137.put(var32_140, var37_164);
                        v23 /* !! */  = var37_164;
                    } else {
                        v23 /* !! */  = var36_156;
                    }
                    var38_167 = (List)v23 /* !! */ ;
                    ((Collection)var38_167).add(var28_115);
                    var13_30[var30_130] = var13_30[var30_130] + (((String)var28_115.e()).length() + 1);
                }
                var25_92 = var24_77 = (SortHandler)LiteBansModule_4.BaseCoreGenericHandler.BaseCoreGenericHandler().BaseCoreGenericHandler();
                synchronized (var25_92) {
                    var26_100 = false;
                    var27_110 = null;
                    if (this.AsyncBackgroundTask_21 >= 20 && var8_13 - v1.AsyncBackgroundTask_5().LiteBansModule_31() > 57600000L) {
                        this.c(v1);
                        var27_110 = LiteBansModule_397.BaseCoreGenericHandler();
                    } else {
                        var27_110 = this.plugin(v1);
                    }
                    var28_116 = 0;
                    var29_123 = ((Object[])this.g).length;
                    var30_131 /* !! */  = new byte[var29_123][];
                    while (var28_116 < var29_123) {
                        var31_138 = var28_116++;
                        var30_131 /* !! */ [var31_138] = LiteBansModule_389.BaseCoreGenericHandler();
                    }
                    var32_140 = var30_131 /* !! */ ;
                    var28_117 = var27_110;
                    var29_123 = 0;
                    var30_131 /* !! */  = (byte[][])((AutoCloseable)var28_117);
                    var31_139 = null;
                    try {
                        var33_147 = (ResultSet)var30_131 /* !! */ ;
                        var36_157 = false;
                        while (var28_117.next()) {
                            var37_165 = var28_117;
                            var38_169 = false;
                            var32_140[var37_165.getInt((String)"SQLiteDriverHandler_4")] = var37_165.getBytes("LiteBansModule_31");
                        }
                        var33_147 = KotlinUnitHandler.BaseCoreGenericHandler;
                    }
                    catch (Throwable var36_158) {
                        var31_139 = var36_158;
                        throw var36_158;
                    }
                    finally {
                        CloseactionHandler.BaseCoreGenericHandler((AutoCloseable)var30_131 /* !! */ , (Throwable)var31_139);
                    }
                    this.LiteBansModule_31.clear();
                    this.PunishmentTableService = new byte[0][];
                    var28_118 = false;
                    var28_118 = var23_71.size() >= ((Object[])var32_140).length;
                    var29_123 = 0;
                    var30_132 = ((Object[])this.g).length;
                    var31_139 = new byte[var30_132][];
                    var39_171 = var24_77;
                    while (var29_123 < var30_132) {
                        var33_148 = var29_123++;
                        var31_139[var33_148] = LiteBansModule_389.BaseCoreGenericHandler();
                    }
                    var39_171.BaseCoreGenericHandler((byte[][])var31_139);
                    var29_126 = new LiteBansModule_324(var24_77.c() << 32 << 32);
                    var30_133 = new byte[40];
                    var31_139 = var23_71.entrySet();
                    var33_149 = false;
                    var31_139 = CollectionUtilities.BaseCoreGenericHandler((Iterable)var31_139, (Comparator)new LiteBansModule_256());
                    var33_149 = false;
                    var36_160 = var31_139.iterator();
                    while (var36_160.hasNext()) {
                        block109: {
                            var37_166 = var36_160.next();
                            var38_170 = (Map.Entry)var37_166;
                            var40_172 = false;
                            var41_174 = null;
                            var42_175 = (Object[])var32_140;
                            var43_178 = false;
                            for (Object var46_187 : var42_175) {
                                var47_188 = (byte[])var46_187;
                                var48_192 = false;
                                v24 = var47_188.length == 0;
                                if (!v24) continue;
                                v25 = false;
                                break block109;
                            }
                            v25 = true;
                        }
                        if (v25) {
                            var41_174 = var32_140[((Number)var38_170.getKey()).intValue()];
                            var28_118 = false;
                        }
                        var42_175 = this;
                        ObjectUtilities.BaseCoreGenericHandler(var38_170);
                        var43_177 = var38_170;
                        var44_181 = 0;
                        var45_185 = null;
                        v26 = var41_174;
                        if (v26 == null) {
                            v26 = LiteBansModule_389.BaseCoreGenericHandler();
                        }
                        var45_185 = v26;
                        var46_187 = var24_77;
                        var47_189 = '\u0000';
                        var48_193 = (Iterable)var43_177.getValue();
                        var49_197 = false;
                        var50_200 = var48_193;
                        var51_203 = new ArrayList<PunishmentService>();
                        var52_205 = 0;
                        var53_206 = var50_200.iterator();
                        while (var53_206.hasNext()) {
                            block110: {
                                var54_209 = var53_206.next();
                                var55_212 = (LiteBansModule_354)var54_209;
                                var56_213 = 0;
                                if (((String)var55_212.e()).length() >= 20) ** GOTO lbl-1000
                                var57_214 = (CharSequence)var55_212.e();
                                var58_218 = SortHandler.P;
                                var59_221 /* !! */  = false;
                                for (var60_222 = 0; var60_222 < var57_214.length(); ++var60_222) {
                                    var62_226 = var61_224 = var57_214.charAt(var60_222);
                                    var63_227 = false;
                                    var64_229 = var58_218;
                                    var65_231 = false;
                                    if (97 <= var62_226 ? var62_226 < 123 : false) ** GOTO lbl-1000
                                    v27 = 48 <= var62_226 ? var62_226 < 58 : false;
                                    if (v27 || var62_226 == 44) lbl-1000:
                                    // 2 sources

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
                            // 2 sources

                            {
                                v30 = false;
                            }
                            if (!v30) continue;
                            var51_203.add(var54_209);
                        }
                        var48_193 = (List)var51_203;
                        var49_197 = false;
                        var50_200 = var48_193;
                        var51_203 = new ArrayList<PunishmentService>(CollectionUtilities.BaseCoreGenericHandler((Iterable)var48_193, 10));
                        var52_205 = 0;
                        var53_206 = var50_200.iterator();
                        while (var53_206.hasNext()) {
                            var54_209 = var53_206.next();
                            var55_212 = (LiteBansModule_354)var54_209;
                            var66_232 = var51_203;
                            var56_213 = 0;
                            var66_232.add((String)var55_212.e());
                        }
                        var48_193 = (List)var51_203;
                        var49_197 = false;
                        var67_233 = CollectionUtilities.BaseCoreGenericHandler((Iterable)var48_193, (Comparator)new LiteBansModule_71((SortHandler)var24_77));
                        var48_193 = CollectionUtilities.BaseCoreGenericHandler(var67_233, ",", null, null, 0, null, null, 62, null);
                        var50_200 = var46_187;
                        var51_203 = var48_193.getBytes(LiteBansModule_344.AsyncBackgroundTask_5);
                        var52_205 = 0;
                        var55_212 = var54_209 = (var53_206 = var51_203);
                        var56_213 = 0;
                        for (boolean var59_221 : var55_212) {
                            v31 = var56_213++;
                            var60_222 = var59_221 /* !! */ ;
                            var61_224 = v31;
                            var62_226 = 0;
                            var63_228 = var50_200;
                            var64_230 = false;
                            var51_203[var61_224] = var63_228.n()[var60_222 - 44];
                        }
                        var49_198 = var53_206;
                        var50_200 = new byte[((Object)var49_198).length];
                        var24_77.BaseCoreGenericHandler(var24_77.LiteBansModule_194());
                        if (var41_174 != null && ((Object)var41_174).length == 0 == false) {
                            var24_77.LiteBansModule_31().BaseCoreGenericHandler((byte[])var41_174);
                        } else {
                            var51_203 = new byte[8192];
                            var24_77.LiteBansModule_31().BaseCoreGenericHandler((byte[])var51_203);
                            var46_187.LiteBansModule_31(true);
                            SortHandler.BaseCoreGenericHandler((SortHandler)var46_187, (byte[])var49_198, (byte[])var50_200, false, false, 12, null);
                            var45_185 = var46_187.BroadcastService();
                            var46_187.LiteBansModule_31(false);
                        }
                        v32 = var24_77.BaseCoreGenericHandler();
                        if (v32 != null) {
                            v32[((Number)var43_177.getKey()).intValue()] = var24_77.LiteBansModule_31().LiteBansModule_31();
                            v33 = KotlinUnitHandler.BaseCoreGenericHandler;
                        } else {
                            v33 = null;
                        }
                        var51_203 = var46_187.BaseCoreGenericHandler(var42_175.BaseCoreGenericHandler, (String)var48_193, true, var24_77.LiteBansModule_194(), var29_126, var30_133);
                        SortHandler.BaseCoreGenericHandler((SortHandler)var46_187, (byte[])var51_203, (byte[])var50_200, false, false, 12, null);
                        v34 = var52_205 = var42_175.BaseCoreGenericHandler((SortHandler)var24_77) == false ? 1 : 0;
                        if (var52_205 != 0) {
                            SortHandler.BaseCoreGenericHandler((SortHandler)var46_187, (byte[])var50_200, 600, false, false, 12, null);
                        }
                        var53_206 = null;
                        if (var52_205 != 0) {
                            var54_209 = new ArrayList<PunishmentService>(71);
                            var53_206 = SortHandler.BaseCoreGenericHandler((SortHandler)var46_187, (byte[])var50_200, 0, 0, new LiteBansModule_176((ArrayList)var54_209, (ServerSyncService)var42_175), 6, null);
                            var55_212 = (Collection)var54_209;
                            var56_213 = 0;
                            var57_216 = var55_212;
                            var42_175.BaseCoreGenericHandler((byte[][])var57_216.toArray((T[])new byte[0][]));
                            var46_187.LiteBansModule_240();
                        } else {
                            var53_206 = SortHandler.BaseCoreGenericHandler((SortHandler)var46_187, (byte[])var50_200, 0, 0, null, 14, null);
                        }
                        var54_209 = var42_175.BaseCoreGenericHandler();
                        var55_211 = false;
                        if (var54_209.g()) {
                            var66_232 = var54_209;
                            var56_213 = 0;
                            v35 = new StringBuilder().append("Bucket ").append(((Number)var43_177.getKey()).intValue()).append(" filled with (").append(((Object)var51_203).length).append(" => ").append(((Object)var53_206).length).append(") bytes\n").append(ArrayUtilities.BaseCoreGenericHandler((byte[])var50_200, (CharSequence)",", null, null, 0, null, null, 62, null)).append('\n').append((String)var48_193).append('\n');
                            v36 = var42_175.BaseCoreGenericHandler();
                            var57_217 = AbstractCommand.AsyncBackgroundTask_5;
                            var58_220 = ArrayUtilities.BaseCoreGenericHandler((byte[])var53_206, null, null, null, 0, null, null, 63, null);
                            var59_221 /* !! */  = false;
                            if (ObjectUtilities.BaseCoreGenericHandler((Object)var58_220, (Object)"sort")) {
                                var60_223 = new String[]{"00"};
                                v37 = var60_223;
                            } else {
                                var60_223 = new String[]{"01:" + var58_220};
                                v37 = var60_223;
                            }
                            var61_225 = v37;
                            var66_232.BaseCoreGenericHandler((Object)v35.append((Object)LiteBansModule_72.c(new LiteBansModule_403(v36, Arrays.copyOf(var61_225, var61_225.length)).LiteBansModule_31())).toString());
                        }
                        var24_77.LiteBansModule_31().BaseCoreGenericHandler(LiteBansModule_389.BaseCoreGenericHandler());
                        ServerSyncService.c((ServerSyncService)var42_175)[((Number)var43_177.getKey()).intValue()] = (byte[])var53_206;
                        var42_175.BaseCoreGenericHandler(var42_175.Utf8Handler_2() + ((List)var43_177.getValue()).size());
                        var41_174 = var45_185;
                        if (!var28_118) continue;
                        try {
                            var43_177 = BansHandler_2.n;
                            var44_182 = "SQLiteDriverHandler_4,LiteBansModule_31";
                            var68_234 = v1;
                            var45_186 = false;
                            var46_187 = var44_182;
                            var47_189 = ',';
                            var48_194 = false;
                            var49_198 = var46_187;
                            var50_201 = false;
                            var51_204 = 0;
                            for (var52_205 = 0; var52_205 < var49_198.length(); ++var52_205) {
                                var54_210 = var53_207 = var49_198.charAt(var52_205);
                                var55_211 = false;
                                if (!(var54_210 == var47_189)) continue;
                                ++var51_204;
                            }
                            var56_213 = var51_204;
                            var46_187 = "?";
                            if (var56_213 > 0) {
                                var47_190 = new StringBuilder(var56_213 * 2);
                                var48_195 = new LiteBansModule_166(0, var56_213);
                                var49_199 = false;
                                var50_202 = var48_195.iterator();
                                while (var50_202.hasNext()) {
                                    var52_205 = var51_204 = ((LiteBansModule_290)var50_202).LiteBansModule_31();
                                    var53_208 = false;
                                    var47_190.append("?,");
                                }
                                var46_187 = StringUtilities.LiteBansModule_31(var47_190.toString(), 1);
                            }
                            var47_191 = var43_177;
                            var48_196 = false;
                            var42_175 = var68_234.c(SQLiteDriverHandler.AsyncBackgroundTask_5(SQLiteDriverHandler.e("INSERT INTO " + var47_191 + '(' + var44_182 + ")VALUES(" + (CharSequence)var46_187 + ')')));
                            LiteBansModule_184.AsyncBackgroundTask_5(var42_175.BaseCoreGenericHandler(((Number)var38_170.getKey()).intValue()).BaseCoreGenericHandler((byte[])var41_174));
                        }
                        catch (SQLException var43_179) {
                            v38 = var43_179.getMessage();
                            if (v38 == null) {
                                v38 = "";
                            }
                            if (StringUtilities.BaseCoreGenericHandler((CharSequence)(var44_183 = v38), (CharSequence)"Duplicate entry", false, 2, null) || StringUtilities.BaseCoreGenericHandler((CharSequence)var44_183, (CharSequence)"duplicate key", false, 2, null)) continue;
                            v1.AsyncBackgroundTask_5().BaseCoreGenericHandler(var43_179);
                        }
                    }
                    if (var28_118) {
                        ServerSyncService.BaseCoreGenericHandler(this, BroadcastHandler.PunishmentTableService, v1, null, 0, 12, null);
                    }
                    var26_101 = KotlinUnitHandler.BaseCoreGenericHandler;
                }
                var14_32 = System.currentTimeMillis() - var17_46;
                this.AsyncBackgroundTask_21 = 0;
                var16_44 = ArrayUtilities.BaseCoreGenericHandler(var13_30);
                var18_48 = (Object[])this.g;
                var19_51 = 0;
                for (Object var22_60 : var18_48) {
                    var23_71 = (byte[])var22_60;
                    var69_34 = var19_51;
                    var24_78 = false;
                    var70_37 = ((Object)var23_71).length;
                    var19_51 = var69_34 + var70_37;
                }
                var18_48 = (Object[])this.PunishmentTableService;
                var69_35 = var19_51;
                var19_51 = 0;
                for (Object var22_60 : var18_48) {
                    var23_71 = (byte[])var22_60;
                    var70_38 = var19_51;
                    var24_79 = false;
                    var71_235 = ((Object)var23_71).length;
                    var19_51 = var70_38 + var71_235;
                }
                var70_39 = var19_51;
                var17_47 = var69_35 + var70_39;
                var18_49 = Math.abs(100 - (int)((double)var17_47 / (double)var16_44 * 100.0));
                var19_52 = " (reduced " + var18_49 + "% from " + var16_44 + " bytes)";
                if (var17_47 >= var16_44) {
                    var19_52 = "";
                }
                this.plugin().BaseCoreGenericHandler((Object)("[Sync] Cached " + this.r + " offline users for tab completion InitializerHandler_3 " + var14_32 + " ms. Memory used: " + var17_47 + " bytes" + var19_52));
            }
            catch (Throwable var5_6) {
                v1.AsyncBackgroundTask_5().BaseCoreGenericHandler(var5_6);
            }
        }
        return var72_4;
    }

    private final ResultSet BaseCoreGenericHandler(LiteBansModule_82 ch2, int n) {
        BansHandler_2 kL2 = BansHandler_2.g;
        CharSequence charSequence = "name,date";
        boolean flag = false;
        return LiteBansModule_184.AsyncBackgroundTask_5(ch2.c(SQLiteDriverHandler.AsyncBackgroundTask_5(SQLiteDriverHandler.BaseCoreGenericHandler(SQLiteDriverHandler.BaseCoreGenericHandler(SQLiteDriverHandler.e("SELECT " + charSequence + " FROM " + kL2), "SQLiteDriverHandler_4"), (Number)n))));
    }

    public final ResultSet BaseCoreGenericHandler(@NotNull LiteBansModule_82 ch2) {
        BansHandler_2 kL2 = BansHandler_2.n;
        CharSequence charSequence = "*";
        boolean flag = false;
        return LiteBansModule_184.AsyncBackgroundTask_5(ch2.c(SQLiteDriverHandler.AsyncBackgroundTask_5(SQLiteDriverHandler.e("SELECT " + charSequence + " FROM " + kL2))));
    }

    public final ResultSet c(@NotNull LiteBansModule_82 ch2) {
        BansHandler_2 kL2 = BansHandler_2.n;
        boolean flag = false;
        return LiteBansModule_184.AsyncBackgroundTask_5(ch2.c(SQLiteDriverHandler.AsyncBackgroundTask_5(SQLiteDriverHandler.e("DELETE FROM " + kL2))));
    }

    public final boolean BaseCoreGenericHandler(@NotNull SortHandler br2) {
        if (!(((Object[])this.PunishmentTableService).length == 0)) {
            if (br2.LiteBansModule_401().isEmpty()) {
                byte by2 = 0;
                by2 = -128;
                Object[] objectArray = (Object[])this.PunishmentTableService;
                SortHandler br3 = br2;
                boolean flag = false;
                Object[] objectArray2 = objectArray;
                Collection collection = new ArrayList(objectArray.length);
                boolean flag2 = false;
                for (Object object : objectArray2) {
                    byte[] byArray = (byte[])object;
                    Collection collection2 = collection;
                    boolean flag3 = false;
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
        Object object;
        Object object2;
        Object[] objectArray;
        Object object3 = this.plugin();
        boolean flag = false;
        if (((ConfigService)object3).g()) {
            ConfigService configService = object3;
            boolean flag2 = false;
            objectArray = (Object[])this.PunishmentTableService;
            StringBuilder stringBuilder = new StringBuilder().append("Read bucket ").append(n).append(" + ").append(br2.LiteBansModule_401().size()).append(" loaded, ").append(((Object[])this.PunishmentTableService).length).append(" stored\n").append(CollectionUtilities.BaseCoreGenericHandler(br2.LiteBansModule_401(), "|", null, null, 0, null, ServerSyncService::BaseCoreGenericHandler, 30, null)).append('\n');
            boolean flag3 = false;
            Object[] objectArray2 = objectArray;
            object2 = new ArrayList(objectArray.length);
            boolean flag4 = false;
            for (Object object4 : objectArray2) {
                object = (byte[])object4;
                Collection object5 = object2;
                boolean object14 = false;
                object5.add(ArrayUtilities.BaseCoreGenericHandler((byte[])object, null, null, null, 0, null, null, 63, null));
            }
            configService.BaseCoreGenericHandler((Object)stringBuilder.append((List)object2).toString());
        }
        object3 = br2;
        synchronized (object3) {
            int n2;
            boolean flag2;
            Object object4;
            byte[] byArray;
            block19: {
                block18: {
                    flag = false;
                    this.plugin(br2);
                    if (!br2.LiteBansModule_401().isEmpty() && !(((Object[])this.PunishmentTableService).length == 0)) break block18;
                    this.plugin().BaseCoreGenericHandler(10, (Object)"No cache");
                    LiteBansModule_56 bP2 = new LiteBansModule_56((byte)n, LiteBansModule_348.BaseCoreGenericHandler());
                    return bP2;
                }
                byArray = this.g[n];
                objectArray = this.plugin();
                boolean flag7 = false;
                if (objectArray.g()) {
                    ConfigService q_03 = objectArray;
                    boolean flag8 = false;
                    q_03.BaseCoreGenericHandler((Object)ArrayUtilities.BaseCoreGenericHandler(byArray, null, null, null, 0, null, null, 63, null));
                }
                objectArray = (Object[])br2.BaseCoreGenericHandler();
                if (byArray != LiteBansModule_389.BaseCoreGenericHandler() && objectArray != null && !(((Object)objectArray[n]).length == 0)) break block19;
                this.plugin().BaseCoreGenericHandler(10, (Object)"No cache");
                LiteBansModule_56 bP3 = new LiteBansModule_56((byte)n, LiteBansModule_348.BaseCoreGenericHandler());
                return bP3;
            }
            br2.LiteBansModule_31().BaseCoreGenericHandler((byte[])objectArray[n]);
            ByteArrayOutputStream byteArrayOutputStream = this.c(byArray.length * 4);
            br2.BaseCoreGenericHandler(byArray, byteArrayOutputStream);
            byte[] byArray2 = new byte[byteArrayOutputStream.size()];
            br2.BaseCoreGenericHandler(br2.LiteBansModule_194());
            object2 = Arrays.copyOf(byteArrayOutputStream.toByteArray(), byteArrayOutputStream.size());
            ObjectUtilities.BaseCoreGenericHandler(object2);
            SortHandler.BaseCoreGenericHandler(br2, (byte[])object2, byArray2, false, false, 8, null);
            Object object7 = this.plugin();
            int n3 = 0;
            if (((ConfigService)object7).g()) {
                ConfigService q_04 = object7;
                int n4 = 0;
                q_04.BaseCoreGenericHandler((Object)ArrayUtilities.BaseCoreGenericHandler(byArray2, null, null, null, 0, null, null, 63, null));
            }
            object7 = br2.BaseCoreGenericHandler(byArray2).toString();
            Object object8 = new char[]{','};
            object8 = StringUtilities.BaseCoreGenericHandler((CharSequence)object7, object8, false, 0, 6, null);
            int n5 = 0;
            object = object8;
            String[] args = object.toArray(new String[0]);
            object8 = new HashMap(args.length * 2, 0.5f);
            for (String string : args) {
                if (!(((CharSequence)string).length() > 0)) continue;
                int[] nArray = this.plugin(string);
                object4 = nArray;
                flag2 = false;
                int n4 = ((int[])object4).length;
                for (n2 = 0; n2 < n4; ++n2) {
                    Object object5;
                    Object object6;
                    Object object9 = object6 = object4[n2];
                    boolean flag3 = false;
                    Map map = (Map)object8;
                    Integer n6 = (int)object9;
                    boolean flag4 = false;
                    Object v2 = map.get(n6);
                    if (v2 == null) {
                        boolean flag5 = false;
                        ArrayList arrayList = new ArrayList(64);
                        map.put(n6, arrayList);
                        object5 = arrayList;
                    } else {
                        object5 = v2;
                    }
                    ((ArrayList)object5).add(string);
                }
            }
            Object object12 = (Map)object8;
            int n8 = 0;
            for (Map.Entry entry : object12.entrySet()) {
                object4 = entry;
                flag2 = false;
                ((ArrayList)object4.getValue()).trimToSize();
            }
            object12 = br2;
            PlatformPlugin plugin = this.plugin;
            boolean flag6 = false;
            Object object10 = plugin;
            if (object10 != null && (object10 = (ConfigService)object10.BaseCoreGenericHandler(ConfigService.class)) != null) {
                String[] filteredArgs;
                String[] parsedArgs;
                Object object11 = object10;
                object4 = AbstractCommand.AsyncBackgroundTask_5;
                String string = ((Object)((CharSequence)object7)).toString();
                n2 = 0;
                if (ObjectUtilities.BaseCoreGenericHandler((Object)string, (Object)"sort")) {
                    String[] cmdArgs = new String[]{"00"};
                    parsedArgs = cmdArgs;
                } else {
                    String[] stringArray5 = new String[]{"01:" + string};
                    parsedArgs = stringArray5;
                }
                if (new LiteBansModule_403((ConfigService)object11, Arrays.copyOf(filteredArgs = parsedArgs, filteredArgs.length)).LiteBansModule_31() == object11.hashCode()) {
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

    }

