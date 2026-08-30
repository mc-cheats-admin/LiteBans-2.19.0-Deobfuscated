package litebans;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.Map;
import java.util.Properties;
import java.util.logging.Logger;
import javax.sql.DataSource;
public final class UserHandler
implements DataSource {
    private static final HikariLogger e;
    private static final String BaseCoreGenericHandler;
    private static final String c;
    private final String AsyncBackgroundTask_5;
    private final Properties LiteBansModule_194;
    private Driver LiteBansModule_31;

    /*
     * WARNING - void declaration
     */
    public UserHandler(String string, String string2, Properties properties, String string3, String string4) {
        Object object;
        this.AsyncBackgroundTask_5 = string;
        this.LiteBansModule_194 = new Properties();
        for (Map.Entry object2 : properties.entrySet()) {
            this.LiteBansModule_194.setProperty(object2.getKey().toString(), object2.getValue().toString());
        }
        if (string3 != null) {
            this.LiteBansModule_194.put("user", this.LiteBansModule_194.getProperty("user", string3));
        }
        if (string4 != null) {
            this.LiteBansModule_194.put("password", this.LiteBansModule_194.getProperty("password", string4));
        }
        if (string2 != null) {
            object = DriverManager.getDrivers();
            while (object.hasMoreElements()) {
                Driver driver = (Driver)object.nextElement();
                if (!driver.getClass().getName().equals(string2)) continue;
                this.LiteBansModule_31 = driver;
                break;
            }
            if (this.LiteBansModule_31 == null) {
                void arg1;
                e.c("Registered driver with driverClassName={} was not found, trying direct ", new Object[]{string2});
                Object v7 = null;
                ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
                try {
                    void arg2;
                    if (classLoader != null) {
                        try {
                            Class<?> clazz = classLoader.loadClass(string2);
                            e.LiteBansModule_31("Driver class {} found InitializerHandler_3 Thread context class loader {}", new Object[]{string2, classLoader});
                        }
                        catch (ClassNotFoundException classNotFoundException) {
                            e.LiteBansModule_31("Driver class {} not found InitializerHandler_3 Thread context class loader {}, trying classloader {}", new Object[]{string2, classLoader, this.getClass().getClassLoader()});
}
                    if (arg2 == null) {
                        Class<?> clazz = this.getClass().getClassLoader().loadClass(string2);
                        e.LiteBansModule_31("Driver class {} found InitializerHandler_3 the HikariConfig class classloader {}", new Object[]{string2, this.getClass().getClassLoader()});
}
                catch (ClassNotFoundException classNotFoundException) {
                    e.LiteBansModule_31("Failed to load driver class {} from HikariConfig class classloader {}", new Object[]{string2, this.getClass().getClassLoader()});
                }
                if (arg1 != null) {
                    try {
                        this.LiteBansModule_31 = (Driver)arg1.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    }
                    catch (Exception exception) {
                        e.c("Failed to create instance of driver class {}, trying jdbcUrl resolution", new Object[]{string2, exception});
}
        object = string.replaceAll("([?&;]password=)[^&#;]*(.*)", "$1<masked>$2");
        try {
            if (this.LiteBansModule_31 == null) {
                this.LiteBansModule_31 = DriverManager.getDriver(string);
                e.LiteBansModule_31("Loaded driver with class name {} for jdbcUrl={}", new Object[]{this.LiteBansModule_31.getClass().getName(), object});
            } else if (!this.LiteBansModule_31.acceptsURL(string)) {
                throw new RuntimeException("Driver " + string2 + " claims to not accept jdbcUrl, " + (String)object);
}
        catch (SQLException sQLException) {
            throw new RuntimeException("Failed to get driver instance for jdbcUrl=" + (String)object, sQLException);
}

    @Override
    public Connection getConnection() {
        return this.LiteBansModule_31.connect(this.AsyncBackgroundTask_5, this.LiteBansModule_194);
    }

    @Override
    public Connection getConnection(String string, String string2) {
        Properties properties = (Properties)this.LiteBansModule_194.clone();
        if (string != null) {
            properties.put("user", string);
            if (properties.containsKey("username")) {
                properties.put("username", string);
}
        if (string2 != null) {
            properties.put("password", string2);
        }
        return this.LiteBansModule_31.connect(this.AsyncBackgroundTask_5, properties);
    }

    @Override
    public PrintWriter getLogWriter() {
        throw new SQLFeatureNotSupportedException();
    }

    @Override
    public void setLogWriter(PrintWriter printWriter) {
        throw new SQLFeatureNotSupportedException();
    }

    @Override
    public void setLoginTimeout(int n) {
        DriverManager.setLoginTimeout(n);
    }

    @Override
    public int getLoginTimeout() {
        return DriverManager.getLoginTimeout();
    }

    @Override
    public Logger getParentLogger() {
        return this.LiteBansModule_31.getParentLogger();
    }

    public Object unwrap(Class clazz) {
        throw new SQLFeatureNotSupportedException();
    }

    public boolean isWrapperFor(Class clazz) {
        return false;
    }

    static {
        c = "user";
        BaseCoreGenericHandler = "password";
        e = HikariLogger.BaseCoreGenericHandler(UserHandler.class);
}

