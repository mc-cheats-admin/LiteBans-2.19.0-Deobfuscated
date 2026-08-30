package litebans;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.security.AccessControlException;
import java.util.Properties;
import java.util.TreeSet;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
import javax.sql.DataSource;
public class HikariConfig
implements LiteBansModule_350 {
    private static final HikariLogger LiteBansModule_401;
    private static final char[] BaseCoreGenericHandler;
    private static final long CommandThrottleService;
    private static final long A;
    private static final long c;
    private static final long LiteBansModule_430;
    private static final long n;
    private static final long BanHandler_5;
    private static final int B;
    private static boolean ServerSyncService;
    private volatile String BanHandler_4;
    private volatile long i;
    private volatile long L;
    private volatile long H;
    private volatile long D;
    private volatile long K;
    private volatile int r = -1;
    private volatile int DatabaseMonitorService = -1;
    private volatile String q;
    private volatile String AsyncBackgroundTask_22;
    private long J = 1L;
    private String BroadcastService;
    private String F;
    private String z;
    private String LiteBansModule_433;
    private String LiteBansModule_240;
    private String Utf8Handler_2;
    private String AsyncBackgroundTask_21;
    private String LiteBansModule_31;
    private String P;
    private String BanHandler_2;
    private boolean PunishmentService = true;
    private boolean PlayerQuitListener;
    private boolean e;
    private boolean m;
    private boolean PluginHookService;
    private DataSource O;
    private Properties LiteBansModule_194 = new Properties();
    private ThreadFactory AsyncBackgroundTask_5;
    private ScheduledExecutorService HoverTextFormatter;
    private Properties g = new Properties();
    private long GnuSparseMapHandler = 0L;
    private volatile boolean PunishmentTableService;

    public HikariConfig() {
        this.K = n;
        this.i = CommandThrottleService;
        this.L = A;
        this.H = LiteBansModule_430;
        String string = System.getProperty("hikaricp.configurationFile");
        if (string != null) {
            this.e(string);
}

    @Override
    public String AsyncBackgroundTask_5() {
        return this.BanHandler_4;
    }

    @Override
    public void BaseCoreGenericHandler(String string) {
        this.BanHandler_4 = string;
    }

    @Override
    public long c() {
        return this.i;
    }

    @Override
    public void AsyncBackgroundTask_5(long l3) {
        if (l3 == 0L) {
            this.i = Integer.MAX_VALUE;
        } else {
            if (l3 < c) {
                throw new IllegalArgumentException("connectionTimeout cannot be less than " + c + "ms");
            }
            this.i = l3;
}

    @Override
    public long BaseCoreGenericHandler() {
        return this.H;
    }

    @Override
    public void e(long l3) {
        if (l3 < 0L) {
            throw new IllegalArgumentException("idleTimeout cannot be negative");
        }
        this.H = l3;
    }

    @Override
    public long g() {
        return this.D;
    }

    @Override
    public void LiteBansModule_31(long l3) {
        this.D = l3;
    }

    @Override
    public long LiteBansModule_31() {
        return this.K;
    }

    @Override
    public void c(long l3) {
        this.K = l3;
    }

    @Override
    public int LiteBansModule_194() {
        return this.r;
    }

    @Override
    public void LiteBansModule_31(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("maxPoolSize cannot be less than 1");
        }
        this.r = n;
    }

    @Override
    public int i() {
        return this.DatabaseMonitorService;
    }

    @Override
    public void BaseCoreGenericHandler(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("minimumIdle cannot be negative");
        }
        this.DatabaseMonitorService = n;
    }

    public String AsyncBackgroundTask_21() {
        return this.AsyncBackgroundTask_22;
    }

    @Override
    public void LiteBansModule_31(String string) {
        this.AsyncBackgroundTask_22 = string;
    }

    public String B() {
        return this.q;
    }

    @Override
    public void c(String string) {
        this.q = string;
    }

    @Override
    public long LiteBansModule_240() {
        return this.L;
    }

    @Override
    public void BaseCoreGenericHandler(long l3) {
        if (l3 < c) {
            throw new IllegalArgumentException("validationTimeout cannot be less than " + c + "ms");
        }
        this.L = l3;
    }

    public String LiteBansModule_433() {
        return this.F;
    }

    public void AsyncBackgroundTask_5(String string) {
        this.HoverTextFormatter();
        this.F = string;
    }

    public String LiteBansModule_31() {
        return this.BroadcastService;
    }

    public void LiteBansModule_240(String string) {
        this.HoverTextFormatter();
        this.BroadcastService = string;
    }

    public DataSource AsyncBackgroundTask_22() {
        return this.O;
    }

    public void BaseCoreGenericHandler(DataSource dataSource) {
        this.HoverTextFormatter();
        this.O = dataSource;
    }

    public String DatabaseMonitorService() {
        return this.z;
    }

    public void BaseCoreGenericHandler(String string, Object targetObj) {
        this.HoverTextFormatter();
        this.LiteBansModule_194.put(string, targetObj);
    }

    public String i() {
        return this.LiteBansModule_433;
    }

    public Properties A() {
        return this.LiteBansModule_194;
    }

    public String LiteBansModule_194() {
        return this.LiteBansModule_240;
    }

    public String m() {
        return this.AsyncBackgroundTask_21;
    }

    public void g(String string) {
        this.HoverTextFormatter();
        this.AsyncBackgroundTask_21 = string;
    }

    public boolean CommandThrottleService() {
        return this.PunishmentService;
    }

    public boolean BaseCoreGenericHandler() {
        return this.PluginHookService;
    }

    public long AsyncBackgroundTask_5() {
        return this.J;
    }

    public void LiteBansModule_194(long l3) {
        this.HoverTextFormatter();
        this.J = l3;
    }

    public boolean GnuSparseMapHandler() {
        return this.e;
    }

    public long z() {
        return this.GnuSparseMapHandler;
    }

    public void g(long l3) {
        this.GnuSparseMapHandler = l3;
    }

    public boolean Utf8Handler_2() {
        return this.PlayerQuitListener;
    }

    public boolean LiteBansModule_240() {
        return this.m;
    }

    @Override
    public String e() {
        return this.LiteBansModule_31;
    }

    public void LiteBansModule_194(String string) {
        this.HoverTextFormatter();
        this.LiteBansModule_31 = string;
    }

    public ScheduledExecutorService LiteBansModule_401() {
        return this.HoverTextFormatter;
    }

    public String BanHandler_2() {
        return this.BanHandler_2;
    }

    public String PunishmentTableService() {
        return this.P;
    }

    public String q() {
        return this.Utf8Handler_2;
    }

    public ThreadFactory ServerSyncService() {
        return this.AsyncBackgroundTask_5;
    }

    public void BaseCoreGenericHandler(ThreadFactory threadFactory) {
        this.HoverTextFormatter();
        this.AsyncBackgroundTask_5 = threadFactory;
    }

    void e() {
        this.PunishmentTableService = true;
    }

    public void BaseCoreGenericHandler(HikariConfig aB2) {
        for (Field field : HikariConfig.class.getDeclaredFields()) {
            if (Modifier.isFinal(field.getModifiers())) continue;
            field.setAccessible(true);
            try {
                field.set(aB2, field.get(this));
            }
            catch (Exception exception) {
                throw new RuntimeException("Failed to copy HikariConfig state: " + exception.getMessage(), exception);
}
        aB2.PunishmentTableService = false;
    }

    public void r() {
        if (this.LiteBansModule_31 == null) {
            this.LiteBansModule_31 = this.BroadcastService();
        } else if (this.m && this.LiteBansModule_31.contains(":")) {
            throw new IllegalArgumentException("poolName cannot contain ':' when used with JMX");
        }
        this.BanHandler_4 = LiteBansModule_131.LiteBansModule_31(this.BanHandler_4);
        this.BroadcastService = LiteBansModule_131.LiteBansModule_31(this.BroadcastService);
        this.F = LiteBansModule_131.LiteBansModule_31(this.F);
        this.BanHandler_2 = LiteBansModule_131.LiteBansModule_31(this.BanHandler_2);
        this.z = LiteBansModule_131.LiteBansModule_31(this.z);
        this.LiteBansModule_433 = LiteBansModule_131.LiteBansModule_31(this.LiteBansModule_433);
        this.LiteBansModule_240 = LiteBansModule_131.LiteBansModule_31(this.LiteBansModule_240);
        this.AsyncBackgroundTask_21 = LiteBansModule_131.LiteBansModule_31(this.AsyncBackgroundTask_21);
        if (this.O != null) {
            if (this.z != null) {
                LiteBansModule_401.c("%AsyncBackgroundTask_21 - using dataSource and ignoring ", new Object[]{this.LiteBansModule_31});
} else if (this.z != null) {
            if (this.LiteBansModule_240 != null) {
                LiteBansModule_401.BaseCoreGenericHandler("%AsyncBackgroundTask_21 - cannot use driverClassName and dataSourceClassName ", new Object[]{this.LiteBansModule_31});
                throw new IllegalStateException("cannot use driverClassName and dataSourceClassName ");
            }
            if (this.AsyncBackgroundTask_21 != null) {
                LiteBansModule_401.c("{} - using dataSourceClassName and ignoring ", new Object[]{this.LiteBansModule_31});
} else if (this.AsyncBackgroundTask_21 == null && this.LiteBansModule_433 == null) {
            if (this.LiteBansModule_240 != null) {
                LiteBansModule_401.BaseCoreGenericHandler("{} - jdbcUrl is required with ", new Object[]{this.LiteBansModule_31});
                throw new IllegalArgumentException("jdbcUrl is required with ");
            }
            LiteBansModule_401.BaseCoreGenericHandler("{} - dataSource or dataSourceClassName or jdbcUrl is ", new Object[]{this.LiteBansModule_31});
            throw new IllegalArgumentException("dataSource or dataSourceClassName or jdbcUrl is ");
        }
        this.n();
        if (LiteBansModule_401.BaseCoreGenericHandler() || ServerSyncService) {
            this.g();
}

    private final void n() {
        if (this.K != 0L && this.K < TimeUnit.SECONDS.toMillis(30L)) {
            LiteBansModule_401.c("%AsyncBackgroundTask_21 - maxLifetime is less than 30000ms, setting to default %", new Object[]{this.LiteBansModule_31, n});
            this.K = n;
        }
        if (this.GnuSparseMapHandler != 0L && this.GnuSparseMapHandler < TimeUnit.SECONDS.toMillis(30L)) {
            LiteBansModule_401.c("%AsyncBackgroundTask_21 - keepaliveTime is less than 30000ms, disabling ", new Object[]{this.LiteBansModule_31});
            this.GnuSparseMapHandler = 0L;
        }
        if (this.GnuSparseMapHandler != 0L && this.K != 0L && this.GnuSparseMapHandler >= this.K) {
            LiteBansModule_401.c("%AsyncBackgroundTask_21 - keepaliveTime is greater than or equal to maxLifetime, disabling ", new Object[]{this.LiteBansModule_31});
            this.GnuSparseMapHandler = 0L;
        }
        if (this.D > 0L && !ServerSyncService && (this.D < TimeUnit.SECONDS.toMillis(2L) || this.D > this.K && this.K > 0L)) {
            LiteBansModule_401.c("%AsyncBackgroundTask_21 - leakDetectionThreshold is less than 2000ms or more than maxLifetime, disabling ", new Object[]{this.LiteBansModule_31});
            this.D = 0L;
        }
        if (this.i < c) {
            LiteBansModule_401.c("%AsyncBackgroundTask_21 - connectionTimeout is less than %dms, setting to %", new Object[]{this.LiteBansModule_31, c, CommandThrottleService});
            this.i = CommandThrottleService;
        }
        if (this.L < c) {
            LiteBansModule_401.c("%AsyncBackgroundTask_21 - validationTimeout is less than %dms, setting to %", new Object[]{this.LiteBansModule_31, c, A});
            this.L = A;
        }
        if (this.r < 1) {
            this.r = 10;
        }
        if (this.DatabaseMonitorService < 0 || this.DatabaseMonitorService > this.r) {
            this.DatabaseMonitorService = this.r;
        }
        if (this.H + TimeUnit.SECONDS.toMillis(1L) > this.K && this.K > 0L && this.DatabaseMonitorService < this.r) {
            LiteBansModule_401.c("%AsyncBackgroundTask_21 - idleTimeout is close to or more than maxLifetime, disabling ", new Object[]{this.LiteBansModule_31});
            this.H = 0L;
        } else if (this.H != 0L && this.H < TimeUnit.SECONDS.toMillis(10L) && this.DatabaseMonitorService < this.r) {
            LiteBansModule_401.c("%AsyncBackgroundTask_21 - idleTimeout is less than 10000ms, setting to default {}", new Object[]{this.LiteBansModule_31, LiteBansModule_430});
            this.H = LiteBansModule_430;
        } else if (this.H != LiteBansModule_430 && this.H != 0L && this.DatabaseMonitorService == this.r) {
            LiteBansModule_401.c("%AsyncBackgroundTask_21 - idleTimeout has been set but has no effect because the pool is operating CommandExitException BaseCoreGenericHandler fixed size ", new Object[]{this.LiteBansModule_31});
}

    private final void HoverTextFormatter() {
        if (this.PunishmentTableService) {
            throw new IllegalStateException("The configuration of the pool is sealed once started. Use HikariConfigMXBean for runtime ");
}

    private final void g() {
        LiteBansModule_401.LiteBansModule_31("%AsyncBackgroundTask_21 - configuration:", new Object[]{this.LiteBansModule_31});
        TreeSet treeSet = new TreeSet(SetHandler.BaseCoreGenericHandler(HikariConfig.class));
        for (String string : treeSet) {
            try {
                Object targetObj = SetHandler.BaseCoreGenericHandler(string, this);
                if ("dataSourceProperties".equals(string)) {
                    Properties properties = SetHandler.BaseCoreGenericHandler(this.LiteBansModule_194);
                    properties.setProperty("password", "<masked>");
                    targetObj = properties;
                }
                if ("initializationFailTimeout".equals(string) && this.J == Long.MAX_VALUE) {
                    targetObj = "infinite";
                } else if ("transactionIsolation".equals(string) && this.BanHandler_2 == null) {
                    targetObj = "default";
                } else if (string.matches("scheduledExecutorService|threadFactory") && targetObj == null) {
                    targetObj = "internal";
                } else if (string.contains("jdbcUrl") && targetObj instanceof String) {
                    targetObj = targetObj.replaceAll("([?&;]password=)[^&#;]*(.*)", "$1<masked>$2");
                } else if (string.contains("password")) {
                    targetObj = "<masked>";
                } else if (targetObj instanceof String) {
                    targetObj = "\"" + targetObj + "\"";
                } else if (targetObj == null) {
                    targetObj = "none";
                }
                LiteBansModule_401.LiteBansModule_31("{}{}", new Object[]{string + "............................................... + ".substring(0, 32), targetObj});
            }
            catch (Exception exception) {}
}

    private final void e(String string) {
{
            File file = new File(string);
            try (InputStream inputStream = file.isFile() ? new FileInputStream(file) : this.getClass().getResourceAsStream(string);){
                if (inputStream != null) {
                    Properties properties = new Properties();
                    properties.load(inputStream);
                    SetHandler.BaseCoreGenericHandler(this, properties);
                    break;
                }
                throw new IllegalArgumentException("Cannot find property file: " + string);
            }
            catch (IOException iOException) {
                throw new RuntimeException("Failed to read property file", iOException);
}

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private final String BroadcastService() {
        String string = "HikariPool-";
        try {
            Properties properties = System.getProperties();
            synchronized (properties) {
                String string2 = String.valueOf(Integer.getInteger("com.zaxxer.hikari.pool_number", 0) + 1);
                System.setProperty("com.zaxxer.hikari.pool_number", string2);
                return "HikariPool-" + string2;
}
        catch (AccessControlException accessControlException) {
            ThreadLocalRandom threadLocalRandom = ThreadLocalRandom.current();
            StringBuilder stringBuilder = new StringBuilder("HikariPool-");
            for (int i = 0; i < 4; ++i) {
                stringBuilder.append(BaseCoreGenericHandler[threadLocalRandom.nextInt(62)]);
            }
            LiteBansModule_401.AsyncBackgroundTask_5("assigned random pool name '{}' (security manager prevented access to system properties)", new Object[]{stringBuilder});
            return stringBuilder.toString();
}

    static {
        B = 10;
        BanHandler_5 = 0L;
        LiteBansModule_401 = HikariLogger.BaseCoreGenericHandler(HikariConfig.class);
        BaseCoreGenericHandler = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        CommandThrottleService = TimeUnit.SECONDS.toMillis(30L);
        A = TimeUnit.SECONDS.toMillis(5L);
        c = Long.getLong("com.zaxxer.hikari.timeoutMs.floor", 250L);
        LiteBansModule_430 = TimeUnit.MINUTES.toMillis(10L);
        n = TimeUnit.MINUTES.toMillis(30L);
        ServerSyncService = false;
}

