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
import litebans.kI;

public final class iO
implements DataSource {
    private static final kI e;
    private static final String a;
    private static final String c;
    private final String d;
    private final Properties f;
    private Driver b;

    /*
     * WARNING - void declaration
     */
    public iO(String string, String string2, Properties properties, String string3, String string4) {
        Object object;
        this.d = string;
        this.f = new Properties();
        for (Map.Entry object2 : properties.entrySet()) {
            this.f.setProperty(object2.getKey().toString(), object2.getValue().toString());
        }
        if (string3 != null) {
            this.f.put("user", this.f.getProperty("user", string3));
        }
        if (string4 != null) {
            this.f.put("password", this.f.getProperty("password", string4));
        }
        if (string2 != null) {
            object = DriverManager.getDrivers();
            while (object.hasMoreElements()) {
                Driver driver = (Driver)object.nextElement();
                if (!driver.getClass().getName().equals(string2)) continue;
                this.b = driver;
                break;
            }
            if (this.b == null) {
                void var7_14;
                e.c("Registered driver with driverClassName={} was not found, trying direct ", new Object[]{string2});
                Object var7_10 = null;
                ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
                try {
                    void var7_12;
                    if (classLoader != null) {
                        try {
                            Class<?> clazz = classLoader.loadClass(string2);
                            e.b("Driver class {} found in Thread context class loader {}", new Object[]{string2, classLoader});
                        }
                        catch (ClassNotFoundException classNotFoundException) {
                            e.b("Driver class {} not found in Thread context class loader {}, trying classloader {}", new Object[]{string2, classLoader, this.getClass().getClassLoader()});
                        }
                    }
                    if (var7_12 == null) {
                        Class<?> clazz = this.getClass().getClassLoader().loadClass(string2);
                        e.b("Driver class {} found in the HikariConfig class classloader {}", new Object[]{string2, this.getClass().getClassLoader()});
                    }
                }
                catch (ClassNotFoundException classNotFoundException) {
                    e.b("Failed to load driver class {} from HikariConfig class classloader {}", new Object[]{string2, this.getClass().getClassLoader()});
                }
                if (var7_14 != null) {
                    try {
                        this.b = (Driver)var7_14.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    }
                    catch (Exception exception) {
                        e.c("Failed to create instance of driver class {}, trying jdbcUrl resolution", new Object[]{string2, exception});
                    }
                }
            }
        }
        object = string.replaceAll("([?&;]password=)[^&#;]*(.*)", "$1<masked>$2");
        try {
            if (this.b == null) {
                this.b = DriverManager.getDriver(string);
                e.b("Loaded driver with class name {} for jdbcUrl={}", new Object[]{this.b.getClass().getName(), object});
            } else if (!this.b.acceptsURL(string)) {
                throw new RuntimeException("Driver " + string2 + " claims to not accept jdbcUrl, " + (String)object);
            }
        }
        catch (SQLException sQLException) {
            throw new RuntimeException("Failed to get driver instance for jdbcUrl=" + (String)object, sQLException);
        }
    }

    @Override
    public Connection getConnection() {
        return this.b.connect(this.d, this.f);
    }

    @Override
    public Connection getConnection(String string, String string2) {
        Properties properties = (Properties)this.f.clone();
        if (string != null) {
            properties.put("user", string);
            if (properties.containsKey("username")) {
                properties.put("username", string);
            }
        }
        if (string2 != null) {
            properties.put("password", string2);
        }
        return this.b.connect(this.d, properties);
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
        return this.b.getParentLogger();
    }

    public Object unwrap(Class clazz) {
        throw new SQLFeatureNotSupportedException();
    }

    public boolean isWrapperFor(Class clazz) {
        return false;
    }

    static {
        c = "user";
        a = "password";
        e = kI.a(iO.class);
    }
}

