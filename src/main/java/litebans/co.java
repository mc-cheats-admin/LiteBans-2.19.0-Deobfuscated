package litebans;

import java.io.File;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import litebans.bT;
import litebans.bU;
import litebans.d6;
import litebans.di_0;
import litebans.kx_0;
import org.jetbrains.annotations.NotNull;

public static final class co
extends bU {
    private final ReentrantReadWriteLock e = new ReentrantReadWriteLock();

    public co(@NotNull di_0 di_02) {
        super(di_02);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public ResultSet c(@NotNull bT bT2) {
        ResultSet resultSet;
        if (bT2.c().b()) {
            bU bU2 = this;
            Object var3_4 = null;
            boolean bl = false;
            return kx_0.a();
        }
        Lock lock = this.e.writeLock();
        lock.lock();
        try {
            ResultSet resultSet2;
            boolean bl = false;
            bT bT3 = bT2;
            boolean bl2 = false;
            if (bT3.b().execute()) {
                bT3 = bT2;
                bl2 = false;
                resultSet2 = bT3.b().getResultSet();
            } else {
                resultSet2 = kx_0.a();
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
    public int[] a(@NotNull Statement statement) {
        int[] nArray;
        Lock lock = this.e.writeLock();
        lock.lock();
        try {
            boolean bl = false;
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
    public ResultSet b(@NotNull bT bT2) {
        ResultSet resultSet;
        if (bT2.c().b()) {
            bU bU2 = this;
            Object var3_4 = null;
            boolean bl = false;
            return kx_0.a();
        }
        Lock lock = this.e.readLock();
        lock.lock();
        try {
            boolean bl = false;
            bT bT3 = bT2;
            boolean bl2 = false;
            resultSet = bT3.b().executeQuery();
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
    public int a(@NotNull bT bT2) {
        int n;
        if (bT2.c().b()) {
            return -1;
        }
        Lock lock = this.e.writeLock();
        lock.lock();
        try {
            n = 0;
            bT bT3 = bT2;
            boolean bl = false;
            n = bT3.b().executeUpdate();
        }
        finally {
            lock.unlock();
        }
        return n;
    }

    @Override
    public String a(@NotNull String string) {
        return d6.a(new File(string)).getAbsolutePath();
    }
}

