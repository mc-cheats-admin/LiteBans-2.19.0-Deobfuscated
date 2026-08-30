package litebans;

import java.io.Closeable;
import java.lang.ref.Reference;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;

public final class DatabaseSyncTask
extends MessageHandler
implements Runnable {
    private final AtomicBoolean LiteBansModule_194 = new AtomicBoolean();
    private final CopyOnWriteArrayList AsyncBackgroundTask_5 = new CopyOnWriteArrayList();
    public DatabaseSyncTask(@NotNull PlatformPlugin plugin) {
        super(plugin);
    }

    public final AtomicBoolean c() {
        return this.LiteBansModule_194;
    }

    public final CopyOnWriteArrayList LiteBansModule_31() {
        return this.AsyncBackgroundTask_5;
    }

    @Override
    public void run() {
        try {
            int n;
            DatabaseMonitorService w2 = (DatabaseMonitorService)this.LiteBansModule_240().BaseCoreGenericHandler(DatabaseMonitorService.class);
            ServerSyncService u2 = (ServerSyncService)this.LiteBansModule_240().BaseCoreGenericHandler(ServerSyncService.class);
            Object object = this;
            object = (ConfigService)((MessageHandler)object).LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class);
            n2 = 0;
            if (((ConfigService)object).g()) {
                Object object2 = object;
                n = 0;
                ((ConfigService)object2).BaseCoreGenericHandler((Object)LiteBansModule_4.BaseCoreGenericHandler.BaseCoreGenericHandler().LiteBansModule_31());
            }
            object = (SortHandler)LiteBansModule_4.BaseCoreGenericHandler.BaseCoreGenericHandler().BaseCoreGenericHandler();
            ObjectUtilities.BaseCoreGenericHandler(w2);
            ObjectUtilities.BaseCoreGenericHandler(u2);
            this.plugin(this, (SortHandler)object, w2, u2);
            n2 = 100;
            n = 0;
            while (n < n2) {
                int n3 = n++;
                this.plugin(this, (SortHandler)object, w2, u2);
                Thread.sleep(70L);
}
        catch (InterruptedException interruptedException) {
            this.AsyncBackgroundTask_5();
        }
        this.LiteBansModule_194.set(false);
    }

    private final void AsyncBackgroundTask_5() {
        this.AsyncBackgroundTask_5.clear();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private final void BaseCoreGenericHandler(DatabaseSyncTask ge2, SortHandler br2, DatabaseMonitorService w2, ServerSyncService u2) {
        if (!((Collection)ge2.AsyncBackgroundTask_5).isEmpty()) {
            boolean flag;
            Object object;
            Object object2;
            int n;
{
                boolean flag2;
                boolean flag3;
                Object object3;
{
                    Object object4 = br2.BaseCoreGenericHandler();
                    if (object4 == null) {
                        n = 0;
                        byte[][] byArrayArray = new byte[4][];
                        while (n < 4) {
                            int n2 = n++;
                            byArrayArray[n2] = LiteBansModule_389.BaseCoreGenericHandler();
                        }
                        object4 = byArrayArray;
                    }
                    byte[][] byArray = object4;
                    br2.BaseCoreGenericHandler(byArray);
                    object2 = (Object[])byArray;
                    n = 0;
                    for (Object object5 : object2) {
                        object3 = (byte[])object5;
                        flag3 = false;
                        boolean flag4 = ((byte[])object3).length == 0;
                        if (!flag4) continue;
                        flag2 = true;
                        break;
                    }
                    flag2 = false;
                }
                if (flag2) {
                    object2 = w2;
                    n = 0;
                    try {
                        Object object5;
                        LiteBansModule_82 ch2 = ((DatabaseMonitorService)object2).LiteBansModule_194();
                        Closeable closeable = ch2;
                        object5 = null;
                        try {
                            object3 = (LiteBansModule_82)closeable;
                            flag3 = false;
                            LiteBansModule_82 ch3 = ch2;
                            if (ch3.BaseCoreGenericHandler()) {
                                try {
                                    ServerSyncService u3 = u2;
                                    ResultSet resultSet = u3.BaseCoreGenericHandler(ch3);
                                    object = resultSet;
                                    flag = false;
                                    AutoCloseable autoCloseable = (AutoCloseable)object;
                                    Throwable throwable = null;
                                    try {
                                        Object object6 = (ResultSet)autoCloseable;
                                        while (object.next()) {
                                            Object object7 = object;
                                            byArray[object7.getInt((String)"SQLiteDriverHandler_4")] = object7.getBytes("LiteBansModule_31");
                                        }
                                        object6 = KotlinUnitHandler.BaseCoreGenericHandler;
                                    }
                                    catch (Throwable throwable2) {
                                        throwable = throwable2;
                                        throw throwable2;
                                    }
                                    finally {
                                        CloseactionHandler.BaseCoreGenericHandler(autoCloseable, throwable);
}
                                catch (SQLException sQLException) {
                                    w2.BaseCoreGenericHandler(sQLException);
}
                            object3 = KotlinUnitHandler.BaseCoreGenericHandler;
                        }
                        catch (Throwable throwable) {
                            try {
                                object5 = throwable;
                                throw throwable;
                            }
                            catch (Throwable throwable3) {
                                BlockHandler.BaseCoreGenericHandler(closeable, object5);
                                throw throwable3;
}
                        BlockHandler.BaseCoreGenericHandler(closeable, (Throwable)object5);
                    }
                    catch (SQLException sQLException) {
                        if (((DatabaseMonitorService)object2).LiteBansModule_31(sQLException)) break;
                        throw sQLException;
}
            try {
                object2 = u2;
                n = 0;
                Iterable iterable = ge2.AsyncBackgroundTask_5;
                for (Object object3 : iterable) {
                    boolean bl10;
                    Byte by2;
{
                        by2 = (Byte)object3;
                        if (by2 < 0) continue;
                        Iterable iterable2 = ((ServerSyncService)object2).GnuSparseMapHandler();
                        if (iterable2 instanceof Collection && ((Collection)iterable2).isEmpty()) {
                            bl10 = true;
                        } else {
                            for (ResultSet resultSet : iterable2) {
                                boolean bl13;
                                object = (Reference)((Object)resultSet);
                                flag = false;
                                LiteBansModule_56 bP2 = (LiteBansModule_56)((Reference)object).get();
                                if (bP2 != null) {
                                    byte by3 = bP2.LiteBansModule_31();
                                    bl13 = by2 == by3;
                                } else {
                                    bl13 = false;
                                }
                                if (!bl13) continue;
                                bl10 = false;
                                break;
                            }
                            bl10 = true;
}
                    if (!bl10) continue;
                    ((ServerSyncService)object2).BaseCoreGenericHandler(by2.byteValue(), br2);
                }
                ((ServerSyncService)object2).BaseCoreGenericHandler(br2);
            }
            catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                ge2.BaseCoreGenericHandler(indexOutOfBoundsException, br2, u2);
            }
            ge2.AsyncBackgroundTask_5();
}

    private final void BaseCoreGenericHandler(Exception exception, SortHandler br2, ServerSyncService u2) {
        char[] cArray;
        Object object;
        this.LiteBansModule_240().getLogger().warning("Cache desync, reloading. (error " + ((object = exception.getMessage()) != null && (object = StringUtilities.BaseCoreGenericHandler((CharSequence)object, cArray = new char[]{' '}, false, 0, 6, null)) != null ? (String)object.get(1) : null) + ')');
        br2.BaseCoreGenericHandler((byte[][])null);
        u2.BaseCoreGenericHandler(0);
        Object object2 = this;
        object2 = (ConfigService)((MessageHandler)object2).LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class);
        flag = false;
        if (((ConfigService)object2).g()) {
            ((ConfigService)object2).BaseCoreGenericHandler((Object)exception);
        }
        Thread.sleep(1000L);
    }

    private static final void BaseCoreGenericHandler() {
        e = new String[]{"SQLiteDriverHandler_4", "LiteBansModule_31", "Cache desync, reloading. (error "};
}

