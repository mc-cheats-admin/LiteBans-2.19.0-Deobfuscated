package litebans;

import java.io.File;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.jetbrains.annotations.NotNull;

public final class LiteBansModule_94
extends ProxyPreparedStatement {
    private final ReentrantReadWriteLock e = new ReentrantReadWriteLock();

    public LiteBansModule_94(@NotNull PlatformPlugin plugin) {
        super(plugin);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public ResultSet c(@NotNull LiteBansModule_60 bT2) {
        ResultSet resultSet;
        if (bT2.c().LiteBansModule_31()) {
            ProxyPreparedStatement bU2 = this;
            Object v1 = null;
            return LiteBansModule_399.BaseCoreGenericHandler();
        }
        Lock lock = this.e.writeLock();
        lock.lock();
        try {
            ResultSet resultSet2;
            LiteBansModule_60 bT3 = bT2;
            if (bT3.LiteBansModule_31().execute()) {
                bT3 = bT2;
                flag2 = false;
                resultSet2 = bT3.LiteBansModule_31().getResultSet();
            } else {
                resultSet2 = LiteBansModule_399.BaseCoreGenericHandler();
            }
            resultSet = resultSet2;
        }
        finally {
            lock.unlock();
        }
        return resultSet;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public int[] BaseCoreGenericHandler(@NotNull Statement statement) {
        int[] nArray;
        Lock lock = this.e.writeLock();
        lock.lock();
        try {
            nArray = statement.executeBatch();
        }
        finally {
            lock.unlock();
        }
        return nArray;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public ResultSet LiteBansModule_31(@NotNull LiteBansModule_60 bT2) {
        ResultSet resultSet;
        if (bT2.c().LiteBansModule_31()) {
            ProxyPreparedStatement bU2 = this;
            Object v1 = null;
            return LiteBansModule_399.BaseCoreGenericHandler();
        }
        Lock lock = this.e.readLock();
        lock.lock();
        try {
            LiteBansModule_60 bT3 = bT2;
            resultSet = bT3.LiteBansModule_31().executeQuery();
        }
        finally {
            lock.unlock();
        }
        return resultSet;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public int BaseCoreGenericHandler(@NotNull LiteBansModule_60 bT2) {
        int n;
        if (bT2.c().LiteBansModule_31()) {
            return -1;
        }
        Lock lock = this.e.writeLock();
        lock.lock();
        try {
            n = 0;
            LiteBansModule_60 bT3 = bT2;
            n = bT3.LiteBansModule_31().executeUpdate();
        }
        finally {
            lock.unlock();
        }
        return n;
    }

    @Override
    public String BaseCoreGenericHandler(@NotNull String string) {
        return LiteBansModule_113.BaseCoreGenericHandler(new File(string)).getAbsolutePath();
    }
}

