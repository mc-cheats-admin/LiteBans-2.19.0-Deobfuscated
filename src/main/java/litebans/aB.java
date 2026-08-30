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
import litebans.bh;
import litebans.dO;
import litebans.jo;
import litebans.kI;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public static class aB
implements jo {
    private static final kI l;
    private static final char[] a;
    private static final long v;
    private static final long A;
    private static final long c;
    private static final long N;
    private static final long n;
    private static final long I;
    private static final int B;
    private static boolean u;
    private volatile String G;
    private volatile long i;
    private volatile long L;
    private volatile long H;
    private volatile long D;
    private volatile long K;
    private volatile int r = -1;
    private volatile int w = -1;
    private volatile String q;
    private volatile String t;
    private long J = 1L;
    private String o;
    private String F;
    private String z;
    private String x;
    private String h;
    private String k;
    private String s;
    private String b;
    private String P;
    private String C;
    private boolean E = true;
    private boolean M;
    private boolean e;
    private boolean m;
    private boolean Q;
    private DataSource O;
    private Properties f = new Properties();
    private ThreadFactory d;
    private ScheduledExecutorService y;
    private Properties g = new Properties();
    private long j = 0L;
    private volatile boolean p;

    public aB() {
        this.K = n;
        this.i = v;
        this.L = A;
        this.H = N;
        String string = System.getProperty("hikaricp.configurationFile");
        if (string != null) {
            this.e(string);
        }
    }

    @Override
    public String d() {
        return this.G;
    }

    @Override
    public void a(String string) {
        this.G = string;
    }

    @Override
    public long c() {
        return this.i;
    }

    @Override
    public void d(long l3) {
        if (l3 == 0L) {
            this.i = Integer.MAX_VALUE;
        } else {
            if (l3 < c) {
                throw new IllegalArgumentException("connectionTimeout cannot be less than " + c + "ms");
            }
            this.i = l3;
        }
    }

    @Override
    public long a() {
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
    public void b(long l3) {
        this.D = l3;
    }

    @Override
    public long b() {
        return this.K;
    }

    @Override
    public void c(long l3) {
        this.K = l3;
    }

    @Override
    public int f() {
        return this.r;
    }

    @Override
    public void b(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("maxPoolSize cannot be less than 1");
        }
        this.r = n;
    }

    @Override
    public int i() {
        return this.w;
    }

    @Override
    public void a(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("minimumIdle cannot be negative");
        }
        this.w = n;
    }

    public String s() {
        return this.t;
    }

    @Override
    public void b(String string) {
        this.t = string;
    }

    public String B() {
        return this.q;
    }

    @Override
    public void c(String string) {
        this.q = string;
    }

    @Override
    public long h() {
        return this.L;
    }

    @Override
    public void a(long l3) {
        if (l3 < c) {
            throw new IllegalArgumentException("validationTimeout cannot be less than " + c + "ms");
        }
        this.L = l3;
    }

    public String x() {
        return this.F;
    }

    public void d(String string) {
        this.y();
        this.F = string;
    }

    public String b() {
        return this.o;
    }

    public void h(String string) {
        this.y();
        this.o = string;
    }

    public DataSource t() {
        return this.O;
    }

    public void a(DataSource dataSource) {
        this.y();
        this.O = dataSource;
    }

    public String w() {
        return this.z;
    }

    public void a(String string, Object object) {
        this.y();
        this.f.put(string, object);
    }

    public String i() {
        return this.x;
    }

    public Properties A() {
        return this.f;
    }

    public String f() {
        return this.h;
    }

    public String m() {
        return this.s;
    }

    public void g(String string) {
        this.y();
        this.s = string;
    }

    public boolean v() {
        return this.E;
    }

    public boolean a() {
        return this.Q;
    }

    public long d() {
        return this.J;
    }

    public void f(long l3) {
        this.y();
        this.J = l3;
    }

    public boolean j() {
        return this.e;
    }

    public long z() {
        return this.j;
    }

    public void g(long l3) {
        this.j = l3;
    }

    public boolean k() {
        return this.M;
    }

    public boolean h() {
        return this.m;
    }

    @Override
    public String e() {
        return this.b;
    }

    public void f(String string) {
        this.y();
        this.b = string;
    }

    public ScheduledExecutorService l() {
        return this.y;
    }

    public String C() {
        return this.C;
    }

    public String p() {
        return this.P;
    }

    public String q() {
        return this.k;
    }

    public ThreadFactory u() {
        return this.d;
    }

    public void a(ThreadFactory threadFactory) {
        this.y();
        this.d = threadFactory;
    }

    void e() {
        this.p = true;
    }

    public void a(aB aB2) {
        for (Field field : aB.class.getDeclaredFields()) {
            if (Modifier.isFinal(field.getModifiers())) continue;
            field.setAccessible(true);
            try {
                field.set(aB2, field.get(this));
            }
            catch (Exception exception) {
                throw new RuntimeException("Failed to copy HikariConfig state: " + exception.getMessage(), exception);
            }
        }
        aB2.p = false;
    }

    public void r() {
        if (this.b == null) {
            this.b = this.o();
        } else if (this.m && this.b.contains(":")) {
            throw new IllegalArgumentException("poolName cannot contain ':' when used with JMX");
        }
        this.G = dO.b(this.G);
        this.o = dO.b(this.o);
        this.F = dO.b(this.F);
        this.C = dO.b(this.C);
        this.z = dO.b(this.z);
        this.x = dO.b(this.x);
        this.h = dO.b(this.h);
        this.s = dO.b(this.s);
        if (this.O != null) {
            if (this.z != null) {
                l.c("%s - using dataSource and ignoring dataSourceClassName.", new Object[]{this.b});
            }
        } else if (this.z != null) {
            if (this.h != null) {
                l.a("%s - cannot use driverClassName and dataSourceClassName together.", new Object[]{this.b});
                throw new IllegalStateException("cannot use driverClassName and dataSourceClassName together.");
            }
            if (this.s != null) {
                l.c("{} - using dataSourceClassName and ignoring jdbcUrl.", new Object[]{this.b});
            }
        } else if (this.s == null && this.x == null) {
            if (this.h != null) {
                l.a("{} - jdbcUrl is required with driverClassName.", new Object[]{this.b});
                throw new IllegalArgumentException("jdbcUrl is required with driverClassName.");
            }
            l.a("{} - dataSource or dataSourceClassName or jdbcUrl is required.", new Object[]{this.b});
            throw new IllegalArgumentException("dataSource or dataSourceClassName or jdbcUrl is required.");
        }
        this.n();
        if (l.a() || u) {
            this.g();
        }
    }

    private final void n() {
        if (this.K != 0L && this.K < TimeUnit.SECONDS.toMillis(30L)) {
            l.c("%s - maxLifetime is less than 30000ms, setting to default %dms.", new Object[]{this.b, n});
            this.K = n;
        }
        if (this.j != 0L && this.j < TimeUnit.SECONDS.toMillis(30L)) {
            l.c("%s - keepaliveTime is less than 30000ms, disabling it.", new Object[]{this.b});
            this.j = 0L;
        }
        if (this.j != 0L && this.K != 0L && this.j >= this.K) {
            l.c("%s - keepaliveTime is greater than or equal to maxLifetime, disabling it.", new Object[]{this.b});
            this.j = 0L;
        }
        if (this.D > 0L && !u && (this.D < TimeUnit.SECONDS.toMillis(2L) || this.D > this.K && this.K > 0L)) {
            l.c("%s - leakDetectionThreshold is less than 2000ms or more than maxLifetime, disabling it.", new Object[]{this.b});
            this.D = 0L;
        }
        if (this.i < c) {
            l.c("%s - connectionTimeout is less than %dms, setting to %dms.", new Object[]{this.b, c, v});
            this.i = v;
        }
        if (this.L < c) {
            l.c("%s - validationTimeout is less than %dms, setting to %dms.", new Object[]{this.b, c, A});
            this.L = A;
        }
        if (this.r < 1) {
            this.r = 10;
        }
        if (this.w < 0 || this.w > this.r) {
            this.w = this.r;
        }
        if (this.H + TimeUnit.SECONDS.toMillis(1L) > this.K && this.K > 0L && this.w < this.r) {
            l.c("%s - idleTimeout is close to or more than maxLifetime, disabling it.", new Object[]{this.b});
            this.H = 0L;
        } else if (this.H != 0L && this.H < TimeUnit.SECONDS.toMillis(10L) && this.w < this.r) {
            l.c("%s - idleTimeout is less than 10000ms, setting to default {}ms.", new Object[]{this.b, N});
            this.H = N;
        } else if (this.H != N && this.H != 0L && this.w == this.r) {
            l.c("%s - idleTimeout has been set but has no effect because the pool is operating as a fixed size pool.", new Object[]{this.b});
        }
    }

    private final void y() {
        if (this.p) {
            throw new IllegalStateException("The configuration of the pool is sealed once started. Use HikariConfigMXBean for runtime changes.");
        }
    }

    private final void g() {
        l.b("%s - configuration:", new Object[]{this.b});
        TreeSet treeSet = new TreeSet(bh.a(aB.class));
        for (String string : treeSet) {
            try {
                Object object = bh.a(string, this);
                if ("dataSourceProperties".equals(string)) {
                    Properties properties = bh.a(this.f);
                    properties.setProperty("password", "<masked>");
                    object = properties;
                }
                if ("initializationFailTimeout".equals(string) && this.J == Long.MAX_VALUE) {
                    object = "infinite";
                } else if ("transactionIsolation".equals(string) && this.C == null) {
                    object = "default";
                } else if (string.matches("scheduledExecutorService|threadFactory") && object == null) {
                    object = "internal";
                } else if (string.contains("jdbcUrl") && object instanceof String) {
                    object = ((String)object).replaceAll("([?&;]password=)[^&#;]*(.*)", "$1<masked>$2");
                } else if (string.contains("password")) {
                    object = "<masked>";
                } else if (object instanceof String) {
                    object = "\"" + object + "\"";
                } else if (object == null) {
                    object = "none";
                }
                l.b("{}{}", new Object[]{string + "................................................".substring(0, 32), object});
            }
            catch (Exception exception) {}
        }
    }

    private final void e(String string) {
        block15: {
            File file = new File(string);
            try (InputStream inputStream = file.isFile() ? new FileInputStream(file) : this.getClass().getResourceAsStream(string);){
                if (inputStream != null) {
                    Properties properties = new Properties();
                    properties.load(inputStream);
                    bh.a(this, properties);
                    break block15;
                }
                throw new IllegalArgumentException("Cannot find property file: " + string);
            }
            catch (IOException iOException) {
                throw new RuntimeException("Failed to read property file", iOException);
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private final String o() {
        String string = "HikariPool-";
        try {
            Properties properties = System.getProperties();
            synchronized (properties) {
                String string2 = String.valueOf(Integer.getInteger("com.zaxxer.hikari.pool_number", 0) + 1);
                System.setProperty("com.zaxxer.hikari.pool_number", string2);
                return "HikariPool-" + string2;
            }
        }
        catch (AccessControlException accessControlException) {
            ThreadLocalRandom threadLocalRandom = ThreadLocalRandom.current();
            StringBuilder stringBuilder = new StringBuilder("HikariPool-");
            for (int i = 0; i < 4; ++i) {
                stringBuilder.append(a[threadLocalRandom.nextInt(62)]);
            }
            l.d("assigned random pool name '{}' (security manager prevented access to system properties)", new Object[]{stringBuilder});
            return stringBuilder.toString();
        }
    }

    static {
        B = 10;
        I = 0L;
        l = kI.a(aB.class);
        a = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        v = TimeUnit.SECONDS.toMillis(30L);
        A = TimeUnit.SECONDS.toMillis(5L);
        c = Long.getLong("com.zaxxer.hikari.timeoutMs.floor", 250L);
        N = TimeUnit.MINUTES.toMillis(10L);
        n = TimeUnit.MINUTES.toMillis(30L);
        u = false;
    }
}

