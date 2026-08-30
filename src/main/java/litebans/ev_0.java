package litebans;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.util.logging.Logger;
import javax.sql.DataSource;
import litebans.aB;
import litebans.as;
import litebans.x_0;
import org.jetbrains.annotations.NotNull;

public final class ev_0
implements DataSource {
    private final Driver a;
    private final aB b;

    public ev_0(@NotNull Driver driver, @NotNull aB aB2) {
        this.a = driver;
        this.b = aB2;
        this.setLoginTimeout((int)this.b.c());
    }

    @Override
    public Connection getConnection() {
        return this.a.connect(this.b.m(), this.b.A());
    }

    @Override
    public Connection getConnection(@NotNull String string, @NotNull String string2) {
        return this.getConnection();
    }

    @Override
    public int getLoginTimeout() {
        return DriverManager.getLoginTimeout();
    }

    @Override
    public void setLoginTimeout(int n) {
        DriverManager.setLoginTimeout(n);
    }

    @Override
    public PrintWriter getLogWriter() {
        x_0.a();
        throw new as();
    }

    public Void a(@NotNull PrintWriter printWriter) {
        x_0.a();
        throw new as();
    }

    public Object unwrap(@NotNull Class clazz) {
        x_0.a();
        throw new as();
    }

    public boolean isWrapperFor(@NotNull Class clazz) {
        return false;
    }

    @Override
    public Logger getParentLogger() {
        return null;
    }

    @Override
    public void setLogWriter(PrintWriter printWriter) {
        this.a(printWriter);
    }
}

