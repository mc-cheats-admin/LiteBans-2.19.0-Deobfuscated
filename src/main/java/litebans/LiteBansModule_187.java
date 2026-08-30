package litebans;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.util.logging.Logger;
import javax.sql.DataSource;
import org.jetbrains.annotations.NotNull;

public final class LiteBansModule_187
implements DataSource {
    private final Driver BaseCoreGenericHandler;
    private final HikariConfig LiteBansModule_31;

    public LiteBansModule_187(@NotNull Driver driver, @NotNull HikariConfig aB2) {
        this.plugin = driver;
        this.LiteBansModule_31 = aB2;
        this.setLoginTimeout((int)this.LiteBansModule_31.c());
    }

    @Override
    public Connection getConnection() {
        return this.plugin.connect(this.LiteBansModule_31.m(), this.LiteBansModule_31.A());
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
        AssertionUtilities.BaseCoreGenericHandler();
        throw new CommandExitException();
    }

    public Void BaseCoreGenericHandler(@NotNull PrintWriter printWriter) {
        AssertionUtilities.BaseCoreGenericHandler();
        throw new CommandExitException();
    }

    public Object unwrap(@NotNull Class clazz) {
        AssertionUtilities.BaseCoreGenericHandler();
        throw new CommandExitException();
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
        this.plugin(printWriter);
    }
}

