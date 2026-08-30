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
            DatabaseMonitorService w2 = this.LiteBansModule_240().BaseCoreGenericHandler(DatabaseMonitorService.class);
            ServerSyncService u2 = this.LiteBansModule_240().BaseCoreGenericHandler(ServerSyncService.class);
                        targetObj = (ConfigService)targetObj.LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class);
            n2 = 0;
            if (targetObj.g()) {
                Object contextObj = targetObj;
                n = 0;
                ((ConfigService)contextObj).BaseCoreGenericHandler(LiteBansModule_4.BaseCoreGenericHandler.BaseCoreGenericHandler().LiteBansModule_31());
            }
            targetObj = (SortHandler)LiteBansModule_4.BaseCoreGenericHandler.BaseCoreGenericHandler().BaseCoreGenericHandler();
            ObjectUtilities.BaseCoreGenericHandler(w2);
            ObjectUtilities.BaseCoreGenericHandler(u2);
            this.plugin(this, (SortHandler)targetObj, w2, u2);
            n2 = 100;
            n = 0;
            while (n < n2) {
                int n3 = n++;
                this.plugin(this, (SortHandler)targetObj, w2, u2);
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
            int n;
{
                boolean flag2;
                boolean flag3;
{
                    Object helperObj = br2.BaseCoreGenericHandler();
                    if (helperObj == null) {
                        n = 0;
                        byte[][] byArrayArray = new byte[4][];
                        while (n < 4) {
                            int n2 = n++;
                            byArrayArray[n2] = LiteBansModule_389.BaseCoreGenericHandler();
                        }
                        helperObj = byArrayArray;
                    }
                    byte[][] byArray = helperObj;
                    br2.BaseCoreGenericHandler(byArray);
                    contextObj = (Object[])byArray;
                    n = 0;
                    for (Object tempObj : contextObj) {
                        resultObj = (byte[])tempObj;
                        flag3 = false;
                        boolean flag4 = ((byte[])resultObj).length == 0;
                        if (!flag4) continue;
                        flag2 = true;
                        break;
                    }
                    flag2 = false;
                }
                if (flag2) {
                    contextObj = w2;
                    n = 0;
                    try {
                        LiteBansModule_82 ch2 = ((DatabaseMonitorService)contextObj).LiteBansModule_194();
                        Closeable closeable = ch2;
                        tempObj = null;
                        try {
                            resultObj = (LiteBansModule_82)closeable;
                            flag3 = false;
                            LiteBansModule_82 ch3 = ch2;
                            if (ch3.BaseCoreGenericHandler()) {
                                try {
                                    ServerSyncService u3 = u2;
                                    ResultSet resultSet = u3.BaseCoreGenericHandler(ch3);
                                    targetObj = resultSet;
                                    flag = false;
                                    AutoCloseable autoCloseable = (AutoCloseable)targetObj;
                                    Throwable throwable = null;
                                    try {
                                        Object object6 = (ResultSet)autoCloseable;
                                        while (targetObj.next()) {
                                            Object object7 = targetObj;
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
                            resultObj = KotlinUnitHandler.BaseCoreGenericHandler;
                        }
                        catch (Throwable throwable) {
                            try {
                                tempObj = throwable;
                                throw throwable;
                            }
                            catch (Throwable throwable3) {
                                BlockHandler.BaseCoreGenericHandler(closeable, tempObj);
                                throw throwable3;
}
                        BlockHandler.BaseCoreGenericHandler(closeable, (Throwable)tempObj);
                    }
                    catch (SQLException sQLException) {
                        if (((DatabaseMonitorService)contextObj).LiteBansModule_31(sQLException)) break;
                        throw sQLException;
}
            try {
                contextObj = u2;
                n = 0;
                Iterable iterable = ge2.AsyncBackgroundTask_5;
                for (Object resultObj : iterable) {
                    boolean bl10;
                    Byte by2;
{
                        by2 = (Byte)resultObj;
                        if (by2 < 0) continue;
                        Iterable iterable2 = ((ServerSyncService)contextObj).GnuSparseMapHandler();
                        if (iterable2 instanceof Collection && ((Collection)iterable2).isEmpty()) {
                            bl10 = true;
                        } else {
                            for (ResultSet resultSet : iterable2) {
                                boolean bl13;
                                targetObj = (Reference)(resultSet);
                                flag = false;
                                LiteBansModule_56 bP2 = (LiteBansModule_56)targetObj.get();
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
                    ((ServerSyncService)contextObj).BaseCoreGenericHandler(by2.byteValue(), br2);
                }
                ((ServerSyncService)contextObj).BaseCoreGenericHandler(br2);
            }
            catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                ge2.BaseCoreGenericHandler(indexOutOfBoundsException, br2, u2);
            }
            ge2.AsyncBackgroundTask_5();
}

    private final void BaseCoreGenericHandler(Exception exception, SortHandler br2, ServerSyncService u2) {
        char[] cArray;
        this.LiteBansModule_240().getLogger().warning("Cache desync, reloading. (error " + ((targetObj = exception.getMessage()) != null && (targetObj = StringUtilities.BaseCoreGenericHandler(targetObj, cArray = new char[]{' '}, false, 0, 6, null)) != null ? (String)targetObj.get(1) : null) + ')');
        br2.BaseCoreGenericHandler((byte[][])null);
        u2.BaseCoreGenericHandler(0);
                contextObj = (ConfigService)((MessageHandler)contextObj).LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class);
        flag = false;
        if (((ConfigService)contextObj).g()) {
            ((ConfigService)contextObj).BaseCoreGenericHandler(exception);
        }
        Thread.sleep(1000L);
    }

    private static final void BaseCoreGenericHandler() {
        e = new String[]{"SQLiteDriverHandler_4", "LiteBansModule_31", "Cache desync, reloading. (error "};
}

