package litebans;

import java.io.Closeable;
import java.lang.ref.Reference;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.jetbrains.annotations.NotNull;

public final class AsyncBackgroundTask_20
extends PluginModule
implements Runnable {
    public static final LiteBansModule_118 c;
    private final LiteBansModule_162 e = ProxyConnection.BaseCoreGenericHandler(() -> AsyncBackgroundTask_20.BaseCoreGenericHandler(this));
    public static final long AsyncBackgroundTask_5;
        public AsyncBackgroundTask_20(@NotNull PlatformPlugin plugin) {
        super(plugin);
    }

    public final DatabaseMonitorService BaseCoreGenericHandler() {
        LiteBansModule_162 eE2 = this.e;
        return (DatabaseMonitorService)eE2.BaseCoreGenericHandler();
    }

    @Override
    public void e() {
        this.plugin.LiteBansModule_31(this, 48000L, 48000L);
    }

    @Override
    public void LiteBansModule_31() {
        this.c();
        this.e();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void run() {
        block7: {
            DatabaseMonitorService w2 = this.plugin();
            try {
                LiteBansModule_83 ch2 = w2.LiteBansModule_195();
                Closeable closeable = ch2;
                Throwable throwable = null;
                try {
                    Object targetObj = (LiteBansModule_83)closeable;
                    LiteBansModule_83 ch3 = ch2;
                    this.plugin(ch3);
                    targetObj = KotlinUnitHandler.BaseCoreGenericHandler;
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
                if (w2.LiteBansModule_31(sQLException)) break block7;
                throw sQLException;
            }
        }
    }

    public final void BaseCoreGenericHandler(@NotNull LiteBansModule_83 ch2) {
        ConfigService configService = (ConfigService)ch2.e().BaseCoreGenericHandler(ConfigService.class);
        PunishmentTableService p2 = (PunishmentTableService)ch2.e().BaseCoreGenericHandler(PunishmentTableService.class);
        ServerSyncService u2 = (ServerSyncService)ch2.e().BaseCoreGenericHandler(ServerSyncService.class);
        CommandSenderWrapper[] jv_0Array = ch2.e().q();
        ObjectUtilities.BaseCoreGenericHandler(jv_0Array);
        if (jv_0Array.length == 0) {
            if (configService.LiteBansModule_195().PunishmentTableService()) {
                p2.BaseCoreGenericHandler().LiteBansModule_31().clear();
            }
            if (ch2.e().AsyncBackgroundTask_22() == 1) {
                this.LiteBansModule_31(ch2);
            }
        } else {
            if (configService.LiteBansModule_195().PunishmentTableService()) {
                p2.BaseCoreGenericHandler().LiteBansModule_31().values().removeIf(arg_0 -> AsyncBackgroundTask_20.BaseCoreGenericHandler(arg_0 -> AsyncBackgroundTask_20.BaseCoreGenericHandler(this, ch2, jv_0Array, arg_0), arg_0));
            }
            if (ch2.e().AsyncBackgroundTask_22() == 1) {
                this.plugin(ch2, jv_0Array);
            }
        }
        byte by2 = u2.c();
        u2.BaseCoreGenericHandler((byte)(by2 + 1));
        if (u2.GnuSparseMapHandler().size() > 8) {
            Iterable iterable = u2.GnuSparseMapHandler();
            Iterable iterable2 = iterable;
            Collection collection = new ArrayList();
            for (Object t2 : iterable2) {
                Reference reference = (Reference)t2;
                if (!(reference.get() != null)) continue;
                collection.add(t2);
            }
            List list = (List)collection;
            if (list.isEmpty()) {
                u2.GnuSparseMapHandler().clear();
            } else {
                u2.BaseCoreGenericHandler(new CopyOnWriteArrayList(list));
            }
        }
    }

    private final void LiteBansModule_31(LiteBansModule_83 ch2) {
        BroadcastService o2 = (BroadcastService)ch2.e().BaseCoreGenericHandler(BroadcastService.class);
        GeoIPLookupService_3 gu2 = o2.c();
        ObjectUtilities.LiteBansModule_31(gu2, "");
        KickOtherHandler gx_02 = (KickOtherHandler)gu2;
        gx_02.LiteBansModule_31().clear();
        gx_02.BaseCoreGenericHandler().clear();
    }

    private final void BaseCoreGenericHandler(LiteBansModule_83 ch2, CommandSenderWrapper[] jv_0Array) {
        BroadcastService o2 = (BroadcastService)ch2.e().BaseCoreGenericHandler(BroadcastService.class);
        GeoIPLookupService_3 gu2 = o2.c();
        ObjectUtilities.LiteBansModule_31(gu2, "");
        KickOtherHandler gx_02 = (KickOtherHandler)gu2;
        gx_02.LiteBansModule_31().values().removeIf(arg_0 -> AsyncBackgroundTask_20.c(arg_0 -> AsyncBackgroundTask_20.BaseCoreGenericHandler(this, ch2, jv_0Array, arg_0), arg_0));
        if (gx_02.LiteBansModule_31().isEmpty()) {
            gx_02.BaseCoreGenericHandler().clear();
        } else {
            ((ConcurrentHashMap.KeySetView)gx_02.BaseCoreGenericHandler().keySet()).removeIf(arg_0 -> AsyncBackgroundTask_20.LiteBansModule_31(arg_0 -> AsyncBackgroundTask_20.BaseCoreGenericHandler(gx_02, arg_0), arg_0));
        }
    }

    public final boolean BaseCoreGenericHandler(@NotNull LiteBansModule_83 ch2, @NotNull CommandSenderWrapper[] jv_0Array, @NotNull SilentHandler dZ2) {
        boolean flag;
        block1: {
            CommandSenderWrapper[] jv_0Array2 = jv_0Array;
            int n = jv_0Array2.length;
            for (int i = 0; i < n; ++i) {
                CommandSenderWrapper sender;
                CommandSenderWrapper senderWrapper = sender = jv_0Array2[i];
                if (!ch2.BaseCoreGenericHandler(dZ2, senderWrapper)) continue;
                flag = false;
                break block1;
            }
            flag = true;
        }
        return flag;
    }

    private static final DatabaseMonitorService BaseCoreGenericHandler(AsyncBackgroundTask_20 r_02) {
        return (DatabaseMonitorService)r_02.BaseCoreGenericHandler.BaseCoreGenericHandler(DatabaseMonitorService.class);
    }

    private static final boolean BaseCoreGenericHandler(AsyncBackgroundTask_20 r_02, LiteBansModule_83 ch2, CommandSenderWrapper[] jv_0Array, SilentHandler dZ2) {
        ObjectUtilities.BaseCoreGenericHandler(jv_0Array);
        ObjectUtilities.BaseCoreGenericHandler(dZ2);
        return r_02.BaseCoreGenericHandler(ch2, jv_0Array, dZ2);
    }

    private static final boolean BaseCoreGenericHandler(LiteBansModule_179 eo_02, Object targetObj) {
        return (Boolean)eo_02.BaseCoreGenericHandler(targetObj);
    }

    private static final boolean BaseCoreGenericHandler(AsyncBackgroundTask_20 r_02, LiteBansModule_83 ch2, CommandSenderWrapper[] jv_0Array, Collection collection) {
        boolean flag;
        block3: {
            ObjectUtilities.BaseCoreGenericHandler(collection);
            Iterable iterable = collection;
            if (((Collection)iterable).isEmpty()) {
                flag = false;
            } else {
                for (Object t2 : iterable) {
                    SilentHandler dZ2 = (SilentHandler)t2;
                    if (!(!r_02.BaseCoreGenericHandler(ch2, jv_0Array, dZ2))) continue;
                    flag = true;
                    break block3;
                }
                flag = false;
            }
        }
        return !flag;
    }

    private static final boolean c(LiteBansModule_179 eo_02, Object targetObj) {
        return (Boolean)eo_02.BaseCoreGenericHandler(targetObj);
    }

    private static final boolean BaseCoreGenericHandler(KickOtherHandler gx_02, SilentHandler dZ2) {
        boolean flag;
        block7: {
            Iterable iterable = gx_02.LiteBansModule_31().values();
            if (((Collection)iterable).isEmpty()) {
                flag = true;
            } else {
                for (Object t2 : iterable) {
                    boolean flag3;
                    block6: {
                        Collection collection = (Collection)t2;
                        ObjectUtilities.BaseCoreGenericHandler(collection);
                        Iterable iterable2 = collection;
                        if (iterable2 instanceof Collection && ((Collection)iterable2).isEmpty()) {
                            flag3 = false;
                        } else {
                            for (Object t3 : iterable2) {
                                SilentHandler dZ3 = (SilentHandler)t3;
                                if (!(dZ3.BaseCoreGenericHandler() == dZ2.BaseCoreGenericHandler())) continue;
                                flag3 = true;
                                break block6;
                            }
                            flag3 = false;
                        }
                    }
                    if (!flag3) continue;
                    flag = false;
                    break block7;
                }
                flag = true;
            }
        }
        return flag;
    }

    private static final boolean LiteBansModule_31(LiteBansModule_179 eo_02, Object targetObj) {
        return (Boolean)eo_02.BaseCoreGenericHandler(targetObj);
    }

    static {
        AsyncBackgroundTask_5 = 48000L;
        AsyncBackgroundTask_20.AsyncBackgroundTask_5();
        c = new LiteBansModule_118(null);
    }

    private static final void AsyncBackgroundTask_5() {
        LiteBansModule_31 = new String[]{"", ""};
    }
}

