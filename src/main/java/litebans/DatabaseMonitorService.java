package litebans;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLClassLoader;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLTransientConnectionException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.zip.ZipException;
import litebans.api.Database;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class DatabaseMonitorService
extends PluginModule {
    public static final SQLiteDriverHandler_2 CommandThrottleService;
    private HikariDataSource LiteBansModule_31;
    private final ReentrantLock g = new ReentrantLock();
    private final LiteBansModule_162 ServerSyncService = ProxyConnection.BaseCoreGenericHandler(() -> DatabaseMonitorService.BaseCoreGenericHandler(this));
    private final LiteBansModule_162 AsyncBackgroundTask_21 = ProxyConnection.BaseCoreGenericHandler(() -> DatabaseMonitorService.LiteBansModule_31(this));
    private ProxyPreparedStatement z;
    private LiteBansModule_15 HoverTextFormatter;
    private HashMap Utf8Handler_2;
    private AtomicLong AsyncBackgroundTask_22;
    private final AtomicBoolean AsyncBackgroundTask_5;
    private final AtomicBoolean LiteBansModule_403;
    private final AtomicBoolean GnuSparseMapHandler;
    private boolean e;
    private boolean LiteBansModule_195;
    private boolean BroadcastService;
    private byte A;
    private long n;
    private long m;
    private int r;
    private String DatabaseMonitorService;
    private int q;
    public static final int c;
    private static final String i;
    private static final String LiteBansModule_435;
    private static final String LiteBansModule_241;
        public DatabaseMonitorService(@NotNull PlatformPlugin plugin) {
        super(plugin);
        this.z = new ProxyPreparedStatement(plugin);
        this.Utf8Handler_2 = new HashMap();
        this.AsyncBackgroundTask_22 = new AtomicLong(0L);
        this.AsyncBackgroundTask_5 = new AtomicBoolean();
        this.LiteBansModule_403 = new AtomicBoolean();
        this.GnuSparseMapHandler = new AtomicBoolean();
        this.e = true;
        this.DatabaseMonitorService = "UTC";
    }

    public final HikariDataSource HoverTextFormatter() {
        return this.LiteBansModule_31;
    }

    public final ConfigService PunishmentTableService() {
        LiteBansModule_162 eE2 = this.ServerSyncService;
        return (ConfigService)eE2.BaseCoreGenericHandler();
    }

    public final BroadcastService Utf8Handler_2() {
        LiteBansModule_162 eE2 = this.AsyncBackgroundTask_21;
        return (BroadcastService)eE2.BaseCoreGenericHandler();
    }

    public final LiteBansModule_15 LiteBansModule_403() {
        return this.HoverTextFormatter;
    }

    public final String ServerSyncService() {
        LiteBansModule_15 aK2 = this.HoverTextFormatter;
        if (aK2 == null) {
            return this.PunishmentTableService().LiteBansModule_195().LiteBansModule_25();
        }
        LiteBansModule_15 aK3 = aK2;
        return aK3.toString();
    }

    public final HashMap e() {
        return this.Utf8Handler_2;
    }

    public final boolean m() {
        HikariDataSource an2 = this.LiteBansModule_31;
        return (an2 != null ? !an2.LiteBansModule_31() : false) && this.AsyncBackgroundTask_5.get();
    }

    public final void BaseCoreGenericHandler(boolean flag) {
        this.e = flag;
    }

    public final void c(boolean flag) {
        this.LiteBansModule_195 = flag;
    }

    public final boolean CommandThrottleService() {
        return this.BroadcastService;
    }

    public final void AsyncBackgroundTask_5(boolean flag) {
        this.BroadcastService = flag;
    }

    public final byte AsyncBackgroundTask_22() {
        return this.A;
    }

    public final void BaseCoreGenericHandler(byte by2) {
        this.A = by2;
    }

    public final long i() {
        return this.n;
    }

    public final void LiteBansModule_31(long l3) {
        this.n = l3;
    }

    public final long LiteBansModule_31() {
        return this.m;
    }

    public final void BaseCoreGenericHandler(long l3) {
        this.m = l3;
    }

    public final int A() {
        return this.r;
    }

    public final String n() {
        return this.DatabaseMonitorService;
    }

    public final void BaseCoreGenericHandler(@NotNull String string) {
        this.DatabaseMonitorService = string;
    }

    public final int BaseCoreGenericHandler() {
        return this.q;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     */
    public final Connection c() {
        block9: {
            v1 = System.nanoTime();
            try {
                v2 = this.LiteBansModule_31;
                if (v2 == null) ** GOTO lbl-1000
                v3 = v2;
                if (v3.LiteBansModule_31() == false) {
                    v0 = v2.getConnection();
                } else lbl-1000:
                                {
                    v0 = null;
                }
                v4 = v0;
                v5 = System.nanoTime() - v1;
            }
            catch (SQLException v6) {
                this.plugin(v6);
                break block9;
            }
            finally {
                v7 = System.nanoTime() - v1;
                if (v7 > 1000000000L) {
                    // empty if block
                }
            }
            if (v5 > 1000000000L && v4 != null && !this.LiteBansModule_241() && (v8 = (int)((double)v5 / 1.0E9)) > 12) {
                this.plugin.getLogger().warning(litebans + "Database is slow! Establishing connection took " + v8 + litebans + " seconds.");
            }
        }
        return v4;
    }

    public final String BaseCoreGenericHandler(@NotNull CommandSenderWrapper sender) {
        String string;
        byte by2 = this.plugin.AsyncBackgroundTask_22();
        if (by2 == 0 || by2 == 3) {
            string = null;
        } else if (by2 == 1 || by2 == 2) {
            string = sender.LiteBansModule_241();
        } else {
            AssertionUtilities.BaseCoreGenericHandler();
            throw new CommandExitException();
        }
        return string;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean AsyncBackgroundTask_21() {
        if (!this.PunishmentTableService().LiteBansModule_195().aS()) return false;
        LiteBansModule_15 aK2 = this.HoverTextFormatter;
        if (aK2 == null) return false;
        if (!aK2.LiteBansModule_31()) return false;
        return true;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final boolean BaseCoreGenericHandler(@NotNull LiteBansModule_83 ch2, @Nullable SQLiteDriverHandler_5 jr_02, boolean flag, boolean flag2) {
        ConfigService configService = (ConfigService)this.plugin.BaseCoreGenericHandler(ConfigService.class);
        Object contextObj = this.plugin.getDataFolder();
        String string = ".version";
        File file = new File((File)contextObj, string);
        contextObj = null;
        contextObj = String.valueOf(litebans.DatabaseMonitorService.BaseCoreGenericHandler(this, false, 1, null));
        flag3 = !file.exists();
        try {
            targetObj = LiteBansModule_113.BaseCoreGenericHandler(file);
            int n = 128;
            Object resultObj = LiteBansModule_345.LiteBansModule_31;
            Object helperObj = targetObj;
            helperObj = new InputStreamReader((InputStream)new FileInputStream((File)helperObj), (Charset)resultObj);
            targetObj = helperObj instanceof BufferedReader ? (BufferedReader)helperObj : new BufferedReader((Reader)helperObj, n);
            resultObj = null;
            try {
                Object tempObj = (BufferedReader)targetObj;
                String string2 = ((BufferedReader)tempObj).readLine();
                DiscordWebhookClient eG2 = configService.LiteBansModule_195();
                try {
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA-512");
                    if (messageDigest != null) {
                        messageDigest.reset();
                        Object[] objectArray = new String[]{LiteBansModule_337.LiteBansModule_31(), eG2.ElementsHandler(), eG2.q(), eG2.aW(), eG2.LiteBansModule_6(), eG2.DatabaseMonitorService(), eG2.AsyncBackgroundTask_5()};
                        String string3 = ArrayUtilities.BaseCoreGenericHandler(objectArray, (CharSequence)"\u0001", null, null, 0, null, null, 62, null);
                        objectArray = messageDigest.digest(string3.getBytes(LiteBansModule_345.LiteBansModule_31));
                        messageDigest.reset();
                        contextObj = LiteBansModule_229.BaseCoreGenericHandler((byte[])objectArray, false);
                    }
                }
                catch (NoSuchAlgorithmException noSuchAlgorithmException) {
                    String[] args;
                    ConfigService.BaseCoreGenericHandler(configService, noSuchAlgorithmException, 0, 2, null);
                    ObjectUtilities.BaseCoreGenericHandler(configService);
                    MuteHandler et2 = AbstractCommand.AsyncBackgroundTask_5;
                    String string4 = noSuchAlgorithmException.getMessage();
                    if (string4 == null) {
                        string4 = "";
                    }
                    String string5 = string4;
                    if (ObjectUtilities.BaseCoreGenericHandler((Object)string5, (Object)"sort")) {
                        String[] filteredArgs = new String[]{"00"};
                        args = filteredArgs;
                    } else {
                        String[] parsedArgs = new String[]{"01:" + string5};
                        args = parsedArgs;
                    }
                    String[] cmdArgs = args;
                    new LiteBansModule_405(configService, Arrays.copyOf(cmdArgs, cmdArgs.length)).LiteBansModule_31();
                }
                if (ObjectUtilities.BaseCoreGenericHandler(contextObj, (Object)string2) && !flag) {
                    configService.BaseCoreGenericHandler(2, (Object)"Table upgrade checks ");
                    return flag7;
                }
                tempObj = KotlinUnitHandler.BaseCoreGenericHandler;
            }
            catch (Throwable throwable) {
                resultObj = throwable;
                throw throwable;
            }
            finally {
                BlockHandler.BaseCoreGenericHandler((Closeable)targetObj, (Throwable)resultObj);
            }
        }
        catch (Exception exception) {
            this.plugin(exception);
            flag4 = true;
        }
        if (jr_02 != null) {
            if (!ch2.BaseCoreGenericHandler()) {
                String string6 = "Connection is closed. Only open connections can be used to upgrade ";
                throw new IllegalArgumentException(string6.toString());
            }
            try {
                ObjectUtilities.LiteBansModule_31(ch2, "");
                targetObj = (SQLiteDriverHandler_3)ch2;
                ObjectUtilities.BaseCoreGenericHandler(configService);
                ((SQLiteDriverHandler_3)targetObj).BaseCoreGenericHandler(flag2, configService, jr_02, flag3);
            }
            catch (Throwable throwable) {
                this.plugin(throwable);
                flag4 = true;
            }
            if (!flag4) {
                try {
                    LiteBansModule_375.BaseCoreGenericHandler(file, (String)contextObj, null, 2, null);
                }
                catch (Throwable throwable) {
                    this.plugin(throwable);
                }
            }
        }
        return false;
    }

    public static /* synthetic */ boolean BaseCoreGenericHandler(DatabaseMonitorService w2, LiteBansModule_83 ch2, SQLiteDriverHandler_5 jr_02, boolean flag, boolean flag2, int n, Object targetObj) {
        if ((n & 4) != 0) {
            flag = false;
        }
        if ((n & 8) != 0) {
            flag2 = false;
        }
        return w2.BaseCoreGenericHandler(ch2, jr_02, flag, flag2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void c() {
        Lock lock = this.g;
        lock.lock();
        try {
            boolean flag;
            block13: {
                targetObj = this;
                flag = false;
                AsyncBackgroundTask_21 s2 = (AsyncBackgroundTask_21)((DatabaseMonitorService)targetObj).BaseCoreGenericHandler.BaseCoreGenericHandler(AsyncBackgroundTask_21.class);
                if (!((Collection)s2.BaseCoreGenericHandler()).isEmpty()) {
                    DatabaseMonitorService w2 = targetObj;
                    try {
                        LiteBansModule_83 ch2 = w2.LiteBansModule_195();
                        Closeable closeable = ch2;
                        Throwable throwable = null;
                        try {
                            Object contextObj = (LiteBansModule_83)closeable;
                            LiteBansModule_83 ch3 = ch2;
                            Iterable iterable = s2.BaseCoreGenericHandler();
                            for (Object t2 : iterable) {
                                LiteBansModule_96 cp_02 = (LiteBansModule_96)t2;
                                AllHandler_3.BaseCoreGenericHandler(ch3, cp_02.c(), cp_02.g(), cp_02.LiteBansModule_31(), false, false, 24, null);
                            }
                            contextObj = KotlinUnitHandler.BaseCoreGenericHandler;
                        }
                        catch (Throwable throwable2) {
                            throwable = throwable2;
                            throw throwable2;
                        }
                        finally {
                            BlockHandler.BaseCoreGenericHandler(closeable, throwable);
                        }
                    }
                    catch (SQLException sQLException) {
                        if (w2.LiteBansModule_31(sQLException)) break block13;
                        throw sQLException;
                    }
                }
            }
            targetObj = this.AsyncBackgroundTask_5;
            flag = false;
            ((AtomicBoolean)targetObj).set(false);
            HikariDataSource an2 = this.LiteBansModule_31;
            if (an2 != null) {
                an2.close();
            }
            this.LiteBansModule_31 = null;
            KotlinUnitHandler iv_02 = KotlinUnitHandler.BaseCoreGenericHandler;
        }
        finally {
            lock.unlock();
        }
    }

    public final ResultSet AsyncBackgroundTask_5(@NotNull LiteBansModule_60 bT2) {
        return this.z.c(bT2);
    }

    public final int[] BaseCoreGenericHandler(@NotNull Statement statement) {
        return this.z.BaseCoreGenericHandler(statement);
    }

    public final ResultSet BaseCoreGenericHandler(@NotNull LiteBansModule_60 bT2) {
        return this.z.LiteBansModule_31(bT2);
    }

    public final int LiteBansModule_31(@NotNull LiteBansModule_60 bT2) {
        return this.z.BaseCoreGenericHandler(bT2);
    }

    public final LiteBansModule_388 c(@NotNull LiteBansModule_60 bT2) {
        this.z.BaseCoreGenericHandler(bT2);
        return LiteBansModule_399.BaseCoreGenericHandler();
    }

    public final List LiteBansModule_31(@NotNull ConfigService configService) {
        DiscordWebhookClient eG2 = configService.LiteBansModule_195();
        String[] args = eG2.aV();
        String[] filteredArgs = args;
        Collection collection = new ArrayList(args.length);
        int n = filteredArgs.length;
        for (int i = 0; i < n; ++i) {
            String string;
            String string2 = string = filteredArgs[i];
            Collection collection2 = collection;
            Object targetObj = string2;
            Object contextObj = new NativepatternHandler(":(?!(//))");
            int n2 = 5;
            targetObj = ((NativepatternHandler)contextObj).BaseCoreGenericHandler((CharSequence)targetObj, n2);
            Object resultObj = targetObj;
            Object[] objectArray = resultObj.toArray(new String[0]);
            targetObj = (String)ArrayUtilities.BaseCoreGenericHandler(objectArray, 2);
            contextObj = (String)ArrayUtilities.BaseCoreGenericHandler(objectArray, 3);
            if (contextObj != null) {
                Object helperObj = targetObj;
                targetObj = helperObj != null ? StringUtilities.BaseCoreGenericHandler((String)helperObj, PunishmentTableService[14], (String)contextObj, false, 4, null) : null;
            }
            resultObj = (String)ArrayUtilities.BaseCoreGenericHandler(objectArray, 4);
            Object tempObj = objectArray[0];
            collection2.add(new JarHandler(((String)tempObj).toLowerCase(Locale.ENGLISH), (String)objectArray[1], (String)targetObj, (String)contextObj, (String)resultObj));
        }
        return (List)collection;
    }

    public final LiteBansModule_15 BaseCoreGenericHandler(@NotNull LiteBansModule_83 ch2, int n, boolean flag) {
        LiteBansModule_15 aK2 = (LiteBansModule_15)this.Utf8Handler_2.get(n);
        if (aK2 == null && flag) {
            litebans.DatabaseMonitorService.BaseCoreGenericHandler(this, ch2, false, 2, null);
            return this.plugin(ch2, n, false);
        }
        return aK2;
    }

    public final boolean BaseCoreGenericHandler(int n) {
        int n2 = this.PunishmentTableService().LiteBansModule_195().LiteBansModule_5();
        DatabaseMonitorService w2 = this;
        Object targetObj = w2.HoverTextFormatter();
        return (targetObj != null && (targetObj = ((HikariDataSource)targetObj).BaseCoreGenericHandler()) != null ? targetObj.e() : 0) >= n2 - n && n2 >= 3;
    }

    public static /* synthetic */ boolean BaseCoreGenericHandler(DatabaseMonitorService w2, int n, int n2, Object targetObj) {
        if ((n2 & 1) != 0) {
            n = 1;
        }
        return w2.BaseCoreGenericHandler(n);
    }

    public final void BaseCoreGenericHandler(@NotNull Throwable throwable) {
        try {
            String string;
            ConfigService configService = (ConfigService)this.plugin.BaseCoreGenericHandler(ConfigService.class);
            String string2 = throwable.getMessage();
            if (string2 == null) {
                string2 = string = PunishmentTableService[15];
            }
            if (throwable instanceof LiteBansException_9) {
                PluginModule module = this;
                module.BaseCoreGenericHandler.getLogger().severe(string);
                return;
            }
            if (throwable instanceof LiteBansException_4) {
                targetObj = configService;
                if (ObjectUtilities.BaseCoreGenericHandler(LiteBansModule_254.BaseCoreGenericHandler((ConfigService)targetObj), (Object)MessageKey.BaseCoreGenericHandler(targetObj, false, true))) {
                    return;
                }
            }
            if (!this.plugin.isEnabled()) {
                if (throwable instanceof SQLException && StringUtilities.BaseCoreGenericHandler((CharSequence)string, (CharSequence)PunishmentTableService[16], false, 2, null)) {
                    return;
                }
                throwable.printStackTrace();
                return;
            }
            if (throwable instanceof VirtualMachineError) {
                throw throwable;
            }
            targetObj = new StringWriter();
            throwable.printStackTrace(new PrintWriter((Writer)targetObj));
            String string3 = ((StringWriter)targetObj).toString();
            if (throwable instanceof SQLException) {
                boolean flag2;
                String string4;
                PluginModule n_03;
                int n;
                Throwable throwable2 = throwable;
                int n2 = 4;
                while (n2-- > 0 && throwable2.getCause() != null) {
                }
                if (throwable2 instanceof SocketTimeoutException || throwable instanceof SQLTransientConnectionException && this.GnuSparseMapHandler.get()) {
                    this.GnuSparseMapHandler.set(true);
                    flag = true;
                    resultObj = this;
                    contextObj = PunishmentTableService[17] + LiteBansModule_288.LiteBansModule_31((double)configService.LiteBansModule_195().Y() / 1000.0) + PunishmentTableService[18];
                    n = 0;
                    ((PluginModule)resultObj).BaseCoreGenericHandler.getLogger().severe((String)contextObj);
                } else {
                    resultObj = this;
                    contextObj = PunishmentTableService[19];
                    n = 0;
                    ((PluginModule)resultObj).BaseCoreGenericHandler.getLogger().severe((String)contextObj);
                }
                resultObj = configService.LiteBansModule_195().ElementsHandler();
                contextObj = this.plugin.LiteBansModule_241().LiteBansModule_31();
                n = configService.LiteBansModule_195().LiteBansModule_5();
                if (n < 5) {
                    n_03 = this;
                    string4 = PunishmentTableService[20] + n + PunishmentTableService[21];
                    flag2 = false;
                    n_03.BaseCoreGenericHandler.getLogger().warning(string4);
                }
                if (throwable instanceof SQLTransientConnectionException && !this.GnuSparseMapHandler.get() && this.LiteBansModule_241()) {
                    this.LiteBansModule_435();
                }
                if (StringUtilities.BaseCoreGenericHandler((CharSequence)string3, (CharSequence)PunishmentTableService[22], false, 2, null) && StringUtilities.BaseCoreGenericHandler((CharSequence)string3, (CharSequence)PunishmentTableService[23], false, 2, null) || StringUtilities.BaseCoreGenericHandler((CharSequence)string3, (CharSequence)PunishmentTableService[24], false, 2, null) && StringUtilities.BaseCoreGenericHandler((CharSequence)string3, (CharSequence)PunishmentTableService[25], false, 2, null) || StringUtilities.BaseCoreGenericHandler((CharSequence)string3, (CharSequence)PunishmentTableService[26], false, 2, null) && StringUtilities.BaseCoreGenericHandler((CharSequence)string3, (CharSequence)PunishmentTableService[27], false, 2, null)) {
                    this.q();
                }
                if (StringUtilities.BaseCoreGenericHandler((CharSequence)string3, (CharSequence)PunishmentTableService[28], false, 2, null)) {
                    this.AsyncBackgroundTask_5();
                    return;
                }
                if (contextObj != null) {
                    n_03 = this;
                    string4 = PunishmentTableService[29];
                    flag2 = false;
                    n_03.BaseCoreGenericHandler.getLogger().severe(string4);
                } else if (ObjectUtilities.BaseCoreGenericHandler(resultObj, (Object)PunishmentTableService[30]) && StringUtilities.BaseCoreGenericHandler((CharSequence)string3, (CharSequence)PunishmentTableService[31], false, 2, null)) {
                    n_03 = this;
                    string4 = PunishmentTableService[32];
                    flag2 = false;
                    n_03.BaseCoreGenericHandler.getLogger().severe(string4);
                }
            }
            if (flag && !configService.BaseCoreGenericHandler(1)) {
                return;
            }
            configService.BaseCoreGenericHandler(string3);
        }
        catch (Throwable throwable3) {
            PluginModule n_04 = this;
            String string = PunishmentTableService[33];
            n_04.BaseCoreGenericHandler.getLogger().severe(string);
            throwable3.printStackTrace();
            n_04 = this;
            string = PunishmentTableService[34];
            flag = false;
            n_04.BaseCoreGenericHandler.getLogger().severe(string);
            throwable.printStackTrace();
        }
    }

    private final boolean LiteBansModule_241() {
        DatabaseMonitorService w2 = this;
        Object targetObj = w2.HoverTextFormatter();
        return (targetObj != null && (targetObj = ((HikariDataSource)targetObj).BaseCoreGenericHandler()) != null ? targetObj.e() : 0) >= this.PunishmentTableService().LiteBansModule_195().LiteBansModule_5();
    }

    private final void z() {
        if (StringUtilities.BaseCoreGenericHandler((CharSequence)this.PunishmentTableService().LiteBansModule_195().aN(), (CharSequence)PunishmentTableService[35], false, 2, null)) {
            PluginModule module = this;
            String string = PunishmentTableService[36];
            module.BaseCoreGenericHandler.getLogger().severe(string);
            module = this;
            string = PunishmentTableService[37];
            flag = false;
            module.BaseCoreGenericHandler.getLogger().severe(string);
        }
    }

    private final void AsyncBackgroundTask_5() {
        PluginModule module = this;
        String string = PunishmentTableService[38] + this.PunishmentTableService().LiteBansModule_195().aW() + PunishmentTableService[39] + this.PunishmentTableService().LiteBansModule_195().DatabaseMonitorService() + PunishmentTableService[40];
        module.BaseCoreGenericHandler.getLogger().severe(string);
        module = this;
        string = PunishmentTableService[41];
        flag = false;
        module.BaseCoreGenericHandler.getLogger().severe(string);
        module = this;
        string = PunishmentTableService[42];
        flag = false;
        module.BaseCoreGenericHandler.getLogger().severe(string);
        module = this;
        string = PunishmentTableService[43];
        flag = false;
        module.BaseCoreGenericHandler.getLogger().severe(string);
    }

    private final void q() {
        Object targetObj = this.LiteBansModule_403;
        if (((AtomicBoolean)targetObj).compareAndSet(false, true)) {
            targetObj = this;
            String string = PunishmentTableService[44];
            ((PluginModule)targetObj).BaseCoreGenericHandler.getLogger().warning(string);
            Object contextObj = targetObj = (LiteBansCommand)this.plugin.z().BaseCoreGenericHandler(PunishmentTableService[45]);
            if (contextObj != null) {
                ((LiteBansCommand)contextObj).LiteBansModule_31(this.plugin.HoverTextFormatter());
            }
        } else {
            targetObj = this;
            String string = PunishmentTableService[46];
            ((PluginModule)targetObj).BaseCoreGenericHandler.getLogger().severe(string);
        }
    }

    private final void LiteBansModule_435() {
        ConfigService configService = (ConfigService)this.plugin.BaseCoreGenericHandler(ConfigService.class);
        AsyncBackgroundTask_21 s2 = (AsyncBackgroundTask_21)this.plugin.BaseCoreGenericHandler(AsyncBackgroundTask_21.class);
        int n = configService.LiteBansModule_195().LiteBansModule_5();
        DatabaseMonitorService w2 = this;
        Object targetObj = w2.HoverTextFormatter();
        int n2 = targetObj != null && (targetObj = ((HikariDataSource)targetObj).BaseCoreGenericHandler()) != null ? targetObj.e() : 0;
        Database database = Database.get();
        ObjectUtilities.LiteBansModule_31(database, PunishmentTableService[47]);
        int n3 = ((DefaultHandler_2)database).c();
        LiteBansModule_162 eE2 = ProxyConnection.BaseCoreGenericHandler(() -> DatabaseMonitorService.AsyncBackgroundTask_5(this));
        int n4 = s2.BaseCoreGenericHandler().size();
        PluginModule module = this;
        String string = PunishmentTableService[48] + n2 + PunishmentTableService[49] + n + PunishmentTableService[50] + n4 + ')';
        module.BaseCoreGenericHandler.getLogger().severe(string);
        if (n3 > 0) {
            module = this;
            string = PunishmentTableService[51] + n3 + PunishmentTableService[52];
            flag2 = false;
            module.BaseCoreGenericHandler.getLogger().severe(string);
            module = this;
            string = PunishmentTableService[53] + n + PunishmentTableService[54];
            flag2 = false;
            module.BaseCoreGenericHandler.getLogger().severe(string);
            if (!((Collection)litebans.DatabaseMonitorService.BaseCoreGenericHandler(eE2)).isEmpty()) {
                module = this;
                string = PunishmentTableService[55] + CollectionUtilities.BaseCoreGenericHandler(litebans.DatabaseMonitorService.BaseCoreGenericHandler(eE2), PunishmentTableService[56], null, null, 0, null, null, 62, null) + ']';
                flag2 = false;
                module.BaseCoreGenericHandler.getLogger().severe(string);
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void e() {
        Lock lock = this.g;
        lock.lock();
        try {
            block7: {
                this.PunishmentTableService().e();
                if (!this.LiteBansModule_195) break block7;
                return;
            }
            try {
                litebans.DatabaseMonitorService.BaseCoreGenericHandler(this, this.PunishmentTableService().LiteBansModule_195().ElementsHandler(), 0L, 2, null);
                new LiteBansModule_203(this.plugin).run();
            }
            catch (Throwable throwable) {
                this.plugin(throwable);
            }
            KotlinUnitHandler iv_02 = KotlinUnitHandler.BaseCoreGenericHandler;
        }
        finally {
            lock.unlock();
        }
    }

    public final Object BaseCoreGenericHandler(@NotNull JarHandler jP2, boolean flag, boolean flag2) {
        String string;
        boolean flag3;
        boolean flag4;
        boolean flag5;
        ConfigService configService = (ConfigService)this.plugin.BaseCoreGenericHandler(ConfigService.class);
        String string2 = jP2.AsyncBackgroundTask_5();
                String string3 = PunishmentTableService[57] + jP2;
        if (!((DatabaseMonitorService)resultObj).AsyncBackgroundTask_5.get()) {
            contextObj = (PluginModule)resultObj;
            flag5 = false;
            ((PluginModule)contextObj).BaseCoreGenericHandler.getLogger().info(string3);
        }
        resultObj = configService;
        if (((ConfigService)resultObj).g()) {
            String string4;
            PluginModule module = resultObj;
            flag6 = false;
            StringBuilder stringBuilder = new StringBuilder().append(PunishmentTableService[58]);
            contextObj = jP2;
            flag5 = false;
            if (((JarHandler)contextObj).e() == null) {
                targetObj = contextObj;
                flag4 = false;
                string4 = ((JarHandler)targetObj).AsyncBackgroundTask_5() + PunishmentTableService[59];
            } else {
                int n = StringUtilities.LiteBansModule_31((CharSequence)((JarHandler)contextObj).e(), '/', 0, false, 6, null);
                if (n < 0 || n > ((JarHandler)contextObj).e().length() - 1) {
                    Object helperObj = contextObj;
                    flag3 = false;
                    string4 = ((JarHandler)helperObj).AsyncBackgroundTask_5() + PunishmentTableService[60];
                } else {
                    string4 = ((JarHandler)contextObj).e().substring(n + 1);
                }
            }
            ((ConfigService)module).BaseCoreGenericHandler((Object)stringBuilder.append(string4).toString());
        }
        File file = this.plugin.getDataFolder();
        Object tempObj = PunishmentTableService[61];
        tempObj = resultObj = LiteBansModule_113.c(new File(file, (String)tempObj));
        Object object6 = jP2;
        flag5 = false;
        if (((JarHandler)object6).e() == null) {
            targetObj = object6;
            flag4 = false;
            string = ((JarHandler)targetObj).AsyncBackgroundTask_5() + PunishmentTableService[62];
        } else {
            int n = StringUtilities.LiteBansModule_31((CharSequence)((JarHandler)object6).e(), '/', 0, false, 6, null);
            if (n < 0 || n > ((JarHandler)object6).e().length() - 1) {
                JarHandler jP3 = object6;
                flag3 = false;
                string = jP3.AsyncBackgroundTask_5() + PunishmentTableService[63];
            } else {
                string = ((JarHandler)object6).e().substring(n + 1);
            }
        }
        object6 = string;
        flag5 = false;
        file = new File((File)tempObj, (String)object6);
        try {
            tempObj = null;
            try {
                tempObj = this.plugin(jP2, file, flag2);
            }
            catch (LiteBansException_9 iv2) {
                this.plugin(iv2);
            }
            if (tempObj == null && (object6 = jP2.e()) != null) {
                boolean bl9;
                PluginModule n_03 = this;
                Object object7 = PunishmentTableService[64] + string2 + PunishmentTableService[65] + (String)object6;
                if (!((DatabaseMonitorService)n_03).AsyncBackgroundTask_5.get()) {
                    PluginModule n_04 = n_03;
                    bl9 = false;
                    n_04.BaseCoreGenericHandler.getLogger().info((String)object7);
                }
                n_03 = this;
                object7 = PunishmentTableService[66] + string2 + PunishmentTableService[67];
                bl10 = false;
                if (!((DatabaseMonitorService)n_03).AsyncBackgroundTask_5.get()) {
                    PluginModule n_05 = n_03;
                    bl9 = false;
                    n_05.BaseCoreGenericHandler.getLogger().info((String)object7);
                }
                try {
                    MariaDBDriverHandler.BaseCoreGenericHandler(ConfigService.GnuSparseMapHandler, file.toString(), (String)object6, null, null, 12, null);
                }
                catch (Exception exception) {
                    object7 = this;
                    String string5 = PunishmentTableService[68] + string2 + '.';
                    ((PluginModule)object7).BaseCoreGenericHandler.getLogger().severe(string5);
                    this.plugin(exception);
                    return null;
                }
                if (file.exists()) {
                    n_03 = this;
                    object7 = PunishmentTableService[69] + string2 + PunishmentTableService[70];
                    bl10 = false;
                    if (!((DatabaseMonitorService)n_03).AsyncBackgroundTask_5.get()) {
                        PluginModule n_06 = n_03;
                        bl9 = false;
                        n_06.BaseCoreGenericHandler.getLogger().info((String)object7);
                    }
                } else {
                    n_03 = this;
                    object7 = PunishmentTableService[71];
                    bl10 = false;
                    n_03.BaseCoreGenericHandler.getLogger().warning((String)object7);
                }
            }
            if (tempObj == null) {
                try {
                    tempObj = this.plugin(jP2, file, flag2);
                    if (tempObj == null) {
                        object6 = this;
                        String string6 = PunishmentTableService[72];
                        ((PluginModule)object6).BaseCoreGenericHandler.getLogger().severe(string6);
                        return null;
                    }
                    object6 = this;
                    String string7 = PunishmentTableService[73] + string2 + '!';
                    if (!((DatabaseMonitorService)object6).AsyncBackgroundTask_5.get()) {
                        PluginModule n_07 = (PluginModule)object6;
                        n_07.BaseCoreGenericHandler.getLogger().info(string7);
                    }
                }
                catch (Throwable throwable) {
                    PluginModule n_08 = this;
                    String string8 = PunishmentTableService[74] + jP2 + '.';
                    n_08.BaseCoreGenericHandler.getLogger().severe(string8);
                    this.plugin(throwable);
                    if (throwable instanceof ZipException && flag) {
                        n_08 = this;
                        string8 = PunishmentTableService[75];
                        bl15 = false;
                        n_08.BaseCoreGenericHandler.getLogger().severe(string8);
                        if (file.exists() && file.delete()) {
                            n_08 = this;
                            string8 = PunishmentTableService[76] + file;
                            bl15 = false;
                            n_08.BaseCoreGenericHandler.getLogger().severe(string8);
                        }
                        return litebans.DatabaseMonitorService.BaseCoreGenericHandler(this, jP2, false, false, 4, null);
                    }
                    return null;
                }
            }
            return tempObj;
        }
        catch (Exception exception) {
            object6 = this;
            String string9 = PunishmentTableService[77] + file + ':';
            if (!((DatabaseMonitorService)object6).AsyncBackgroundTask_5.get()) {
                PluginModule n_09 = (PluginModule)object6;
                flag3 = false;
                n_09.BaseCoreGenericHandler.getLogger().info(string9);
            }
            this.plugin(exception);
            return null;
        }
    }

    public static /* synthetic */ Object BaseCoreGenericHandler(DatabaseMonitorService w2, JarHandler jP2, boolean flag, boolean flag2, int n, Object targetObj) {
        if ((n & 2) != 0) {
            flag = true;
        }
        if ((n & 4) != 0) {
            flag2 = true;
        }
        return w2.BaseCoreGenericHandler(jP2, flag, flag2);
    }

    /*
     * Exception decompiling
     */
    public final void BaseCoreGenericHandler(@NotNull LiteBansModule_83 v1, boolean v9) {
        /*
         * This method has failed to decompile.  When submitting BaseCoreGenericHandler bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [1[TRYBLOCK]], but top level block is 12[WHILELOOP]
         *     LiteBansModule_21 org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     LiteBansModule_21 org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     LiteBansModule_21 org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     LiteBansModule_21 org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     LiteBansModule_21 org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     LiteBansModule_21 org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     LiteBansModule_21 org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     LiteBansModule_21 org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     LiteBansModule_21 org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     LiteBansModule_21 org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     LiteBansModule_21 org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     LiteBansModule_21 org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     LiteBansModule_21 org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     LiteBansModule_21 org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public static /* synthetic */ void BaseCoreGenericHandler(DatabaseMonitorService w2, LiteBansModule_83 ch2, boolean flag, int n, Object targetObj) {
        if ((n & 2) != 0) {
            flag = false;
        }
        w2.BaseCoreGenericHandler(ch2, flag);
    }

    public final LiteBansModule_83 LiteBansModule_195() {
        if (this.plugin.ServerSyncService() && this.plugin.n()) {
            throw new AssertionError((Object)PunishmentTableService[87]);
        }
        Connection connection = this.c();
        return connection == null || !this.m() || this.LiteBansModule_195 ? (LiteBansModule_83)new LiteBansModule_245(this.plugin) : (LiteBansModule_83)new SQLiteDriverHandler_3(this.plugin, connection);
    }

    public final void BaseCoreGenericHandler(@NotNull LiteBansModule_179 eo_02) {
        CommandSenderWrapper sender = (CommandSenderWrapper)MessageHandler.BaseCoreGenericHandler.LiteBansModule_31().get();
        if (sender == null) {
            sender = this.plugin.HoverTextFormatter();
        }
        CommandSenderWrapper senderWrapper = sender;
        this.plugin.LiteBansModule_31(() -> DatabaseMonitorService.BaseCoreGenericHandler(senderWrapper, this, eo_02));
    }

    public final boolean LiteBansModule_31(@NotNull Throwable throwable) {
        String string = throwable.getMessage();
        if (string == null) {
            string = PunishmentTableService[88];
        }
        String string2 = string;
        PlatformPlugin plugin = this.plugin;
        PlatformPlugin pluginWrapper = plugin;
        return (!pluginWrapper.isEnabled() || plugin.AsyncBackgroundTask_21()) && (StringUtilities.BaseCoreGenericHandler((CharSequence)string2, (CharSequence)PunishmentTableService[89], false, 2, null) || StringUtilities.BaseCoreGenericHandler((CharSequence)string2, (CharSequence)PunishmentTableService[90], false, 2, null) || StringUtilities.BaseCoreGenericHandler((CharSequence)string2, (CharSequence)PunishmentTableService[91], false, 2, null) || StringUtilities.BaseCoreGenericHandler((CharSequence)string2, (CharSequence)PunishmentTableService[92], false, 2, null) || StringUtilities.BaseCoreGenericHandler((CharSequence)string2, (CharSequence)PunishmentTableService[93], false, 2, null));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final void BaseCoreGenericHandler(long l3, boolean flag, boolean flag2, boolean flag3) {
        KotlinUnitHandler iv_02;
        DiscordWebhookClient eG2 = this.PunishmentTableService().LiteBansModule_195();
        Connection connection = this.c();
        if (connection != null) {
            AutoCloseable autoCloseable = connection;
            Throwable throwable = null;
            try {
                Object targetObj = (Connection)autoCloseable;
                AutoCloseable autoCloseable2 = targetObj.createStatement();
                Throwable throwable2 = null;
                try {
                    Object contextObj = (Statement)autoCloseable2;
                    Closeable closeable = new SQLiteDriverHandler_3(this.plugin, (Connection)targetObj);
                    Throwable throwable3 = null;
                    try {
                        String string;
                        String string2;
                        boolean flag6;
                        String string3;
                        int n;
                        boolean flag7;
                        Iterator iterator;
                        byte by2;
                        Object object7 = (SQLiteDriverHandler_3)closeable;
                        Object object8 = object7;
                        Object object9 = ((SQLiteDriverHandler_3)object8).LiteBansModule_31();
                        boolean bl10 = CommandThrottleService.BaseCoreGenericHandler(eG2.ElementsHandler());
                        DatabaseMonitorService w2 = this;
                        SQLiteDriverHandler_3 gZ2 = object8;
                        ObjectUtilities.BaseCoreGenericHandler(contextObj);
                        Statement statement = contextObj;
                        Statement statement2 = statement;
                        if (flag) {
                            object6 = BansHandler_2.AsyncBackgroundTask_5.BaseCoreGenericHandler();
                            by2 = 0;
                            Iterator iterator2 = object6;
                            iterator = new ArrayList(CollectionUtilities.BaseCoreGenericHandler((Iterable)object6, 10));
                            flag7 = false;
                            tempObj = iterator2.iterator();
                            while (tempObj.hasNext()) {
                                Object e = tempObj.next();
                                helperObj = (BansHandler_2)e;
                                Iterator iterator3 = iterator;
                                n = 0;
                                iterator3.add(gZ2.BaseCoreGenericHandler((BansHandler_2)helperObj, (SQLiteDriverHandler_5)object9));
                            }
                            object6 = (List)((Object)iterator);
                            by2 = 0;
                            iterator2 = object6.iterator();
                            while (iterator2.hasNext()) {
                                iterator = iterator2.next();
                                CharSequence charSequence = (CharSequence)((Object)iterator);
                                helperObj = statement2;
                                n = 0;
                                Object object10 = resultObj = helperObj;
                                helperObj.addBatch(((Object)charSequence).toString());
                            }
                        }
                        if (flag2) {
                            object6 = statement2;
                            by2 = gZ2.g().LiteBansModule_195().be();
                            iterator = object9;
                            flag7 = false;
                            tempObj = new String[6];
                            Object object11 = iterator;
                            helperObj = PunishmentTableService[138];
                            n = 0;
                            tempObj[0] = ObjectUtilities.BaseCoreGenericHandler((Object)((SQLiteDriverHandler_5)object11).LiteBansModule_31().BaseCoreGenericHandler(), (Object)PunishmentTableService[139]) ? (String)helperObj + PunishmentTableService[140] : (String)helperObj + PunishmentTableService[141];
                            object11 = PunishmentTableService[142];
                            helperObj = PunishmentTableService[143];
                            n = 0;
                            tempObj[1] = (String)object11 + PunishmentTableService[144] + (String)helperObj;
                            object11 = PunishmentTableService[145];
                            int n2 = by2 & 0xFF;
                            String string4 = PunishmentTableService[146];
                            resultObj = ((SQLiteDriverHandler_5)((Object)iterator)).LiteBansModule_31().c();
                            tempObj[2] = CommandThrottleService.LiteBansModule_31(((SQLiteDriverHandler_5)((Object)iterator)).LiteBansModule_31().BaseCoreGenericHandler()) ? (String)object11 + PunishmentTableService[147] + n2 + ')' + (String)resultObj + string4 : (String)object11 + PunishmentTableService[148] + n2 + ')' + string4;
                            object11 = PunishmentTableService[149];
                            n2 = 36;
                            string4 = PunishmentTableService[150];
                            resultObj = ((SQLiteDriverHandler_5)((Object)iterator)).LiteBansModule_31().c();
                            bl17 = false;
                            tempObj[3] = CommandThrottleService.LiteBansModule_31(((SQLiteDriverHandler_5)((Object)iterator)).LiteBansModule_31().BaseCoreGenericHandler()) ? (String)object11 + PunishmentTableService[151] + n2 + ')' + (String)resultObj + string4 : (String)object11 + PunishmentTableService[152] + n2 + ')' + string4;
                            object11 = PunishmentTableService[153];
                            n2 = 45;
                            string4 = PunishmentTableService[154];
                            resultObj = ((SQLiteDriverHandler_5)((Object)iterator)).LiteBansModule_31().c();
                            bl17 = false;
                            tempObj[4] = CommandThrottleService.LiteBansModule_31(((SQLiteDriverHandler_5)((Object)iterator)).LiteBansModule_31().BaseCoreGenericHandler()) ? (String)object11 + PunishmentTableService[155] + n2 + ')' + (String)resultObj + string4 : (String)object11 + PunishmentTableService[156] + n2 + ')' + string4;
                            object11 = iterator;
                            helperObj = PunishmentTableService[157];
                            n = 0;
                            tempObj[5] = PunishmentTableService[158] + (String)helperObj + ')';
                            SQLiteDriverHandler aR2 = SQLiteDriverHandler.AsyncBackgroundTask_5(((SQLiteDriverHandler_5)((Object)iterator)).BaseCoreGenericHandler(BansHandler_2.g, (String[])tempObj));
                            bl16 = false;
                            Iterator iterator4 = iterator = object6;
                            object6.addBatch(((Object)aR2).toString());
                        }
                        if (flag3 && bl10) {
                            object6 = statement2;
                            Object object12 = gZ2;
                            iterator = object9;
                            flag7 = false;
                            tempObj = new String[5];
                            Object object13 = iterator;
                            helperObj = PunishmentTableService[159];
                            n = 0;
                            tempObj[0] = ObjectUtilities.BaseCoreGenericHandler((Object)((SQLiteDriverHandler_5)object13).LiteBansModule_31().BaseCoreGenericHandler(), (Object)PunishmentTableService[160]) ? (String)helperObj + PunishmentTableService[161] : (String)helperObj + PunishmentTableService[162];
                            object13 = PunishmentTableService[163];
                            int n3 = 32;
                            String string5 = PunishmentTableService[164];
                            resultObj = ((SQLiteDriverHandler_5)((Object)iterator)).LiteBansModule_31().c();
                            Object object14 = iterator;
                            string3 = string5 + PunishmentTableService[165];
                            flag6 = false;
                            tempObj[1] = CommandThrottleService.LiteBansModule_31(((SQLiteDriverHandler_5)object14).LiteBansModule_31().BaseCoreGenericHandler()) ? (String)object13 + PunishmentTableService[166] + n3 + ')' + (String)resultObj + string3 : (String)object13 + PunishmentTableService[167] + n3 + ')' + string3;
                            object13 = PunishmentTableService[168];
                            n3 = 32;
                            string5 = PunishmentTableService[169];
                            resultObj = ((SQLiteDriverHandler_5)((Object)iterator)).LiteBansModule_31().c();
                            bl20 = false;
                            object14 = iterator;
                            string3 = string5 + PunishmentTableService[170];
                            flag6 = false;
                            tempObj[2] = CommandThrottleService.LiteBansModule_31(((SQLiteDriverHandler_5)object14).LiteBansModule_31().BaseCoreGenericHandler()) ? (String)object13 + PunishmentTableService[171] + n3 + ')' + (String)resultObj + string3 : (String)object13 + PunishmentTableService[172] + n3 + ')' + string3;
                            object13 = PunishmentTableService[173];
                            String string6 = PunishmentTableService[174];
                            tempObj[3] = (String)object13 + PunishmentTableService[175] + string6;
                            object13 = iterator;
                            string6 = PunishmentTableService[176];
                            bl21 = false;
                            tempObj[4] = PunishmentTableService[177] + string6 + ')';
                            object12 = SQLiteDriverHandler.AsyncBackgroundTask_5(((SQLiteDriverHandler_5)((Object)iterator)).BaseCoreGenericHandler(BansHandler_2.LiteBansModule_195, (String[])tempObj));
                            bl19 = false;
                            Iterator iterator5 = iterator = object6;
                            object6.addBatch(object12.toString());
                            object6 = iterator;
                            object12 = gZ2;
                            bl19 = false;
                            iterator = object9;
                            String[] args = new String[5];
                            object13 = iterator;
                            string6 = PunishmentTableService[178];
                            bl21 = false;
                            args[0] = ObjectUtilities.BaseCoreGenericHandler((Object)((SQLiteDriverHandler_5)object13).LiteBansModule_31().BaseCoreGenericHandler(), (Object)PunishmentTableService[179]) ? string6 + PunishmentTableService[180] : string6 + PunishmentTableService[181];
                            object13 = iterator;
                            string6 = PunishmentTableService[182];
                            bl21 = false;
                            args[1] = string6 + PunishmentTableService[183] + ((SQLiteDriverHandler_5)object13).LiteBansModule_31().e() + PunishmentTableService[184];
                            object13 = PunishmentTableService[185];
                            int n4 = 4096;
                            String string7 = PunishmentTableService[186];
                            resultObj = ((SQLiteDriverHandler_5)((Object)iterator)).LiteBansModule_31().c();
                            bl20 = false;
                            object14 = iterator;
                            string3 = string7 + PunishmentTableService[187];
                            flag6 = false;
                            args[2] = CommandThrottleService.LiteBansModule_31(((SQLiteDriverHandler_5)object14).LiteBansModule_31().BaseCoreGenericHandler()) ? (String)object13 + PunishmentTableService[188] + n4 + ')' + (String)resultObj + string3 : (String)object13 + PunishmentTableService[189] + n4 + ')' + string3;
                            object13 = PunishmentTableService[190];
                            helperObj = PunishmentTableService[191];
                            n = 0;
                            args[3] = (String)object13 + PunishmentTableService[192] + (String)helperObj;
                            object13 = iterator;
                            helperObj = PunishmentTableService[193];
                            n = 0;
                            args[4] = PunishmentTableService[194] + (String)helperObj + ')';
                            object12 = SQLiteDriverHandler.AsyncBackgroundTask_5(((SQLiteDriverHandler_5)((Object)iterator)).BaseCoreGenericHandler(BansHandler_2.c, args));
                            bl19 = false;
                            Iterator iterator6 = iterator = object6;
                            object6.addBatch(object12.toString());
                        }
                        object6 = statement2;
                        Object object15 = w2;
                        iterator = object9;
                        flag7 = false;
                        tempObj = new String[3];
                        Object object16 = PunishmentTableService[195];
                        helperObj = PunishmentTableService[196];
                        n = 0;
                        resultObj = ((SQLiteDriverHandler_5)((Object)iterator)).LiteBansModule_31().BaseCoreGenericHandler();
                        tempObj[0] = ObjectUtilities.BaseCoreGenericHandler(resultObj, (Object)PunishmentTableService[197]) || ObjectUtilities.BaseCoreGenericHandler(resultObj, (Object)PunishmentTableService[198]) ? (String)object16 + PunishmentTableService[199] + (String)helperObj : (String)object16 + PunishmentTableService[200] + ((SQLiteDriverHandler_5)((Object)iterator)).LiteBansModule_31().e() + PunishmentTableService[201] + (String)helperObj;
                        object16 = iterator;
                        helperObj = PunishmentTableService[202];
                        n = 8192;
                        if (ObjectUtilities.BaseCoreGenericHandler((Object)((SQLiteDriverHandler_5)object16).LiteBansModule_31().BaseCoreGenericHandler(), (Object)PunishmentTableService[203])) {
                            string2 = (String)helperObj + PunishmentTableService[204];
                        } else {
                            String string8 = PunishmentTableService[205];
                            string8 = PunishmentTableService[206];
                            string2 = (String)helperObj + ' ' + string8 + '(' + n + PunishmentTableService[207];
                        }
                        tempObj[1] = string2;
                        object16 = iterator;
                        helperObj = PunishmentTableService[208];
                        n = 0;
                        tempObj[2] = PunishmentTableService[209] + (String)helperObj + ')';
                        object15 = SQLiteDriverHandler.AsyncBackgroundTask_5(((SQLiteDriverHandler_5)((Object)iterator)).BaseCoreGenericHandler(BansHandler_2.n, (String[])tempObj));
                        bl25 = false;
                        Iterator iterator7 = iterator = object6;
                        object6.addBatch(object15.toString());
                        object6 = iterator;
                        object15 = w2;
                        bl25 = false;
                        iterator = object9;
                        String[] args = new String[6];
                        object16 = iterator;
                        helperObj = PunishmentTableService[210];
                        n = 0;
                        args[0] = ObjectUtilities.BaseCoreGenericHandler((Object)((SQLiteDriverHandler_5)object16).LiteBansModule_31().BaseCoreGenericHandler(), (Object)PunishmentTableService[211]) ? (String)helperObj + PunishmentTableService[212] : (String)helperObj + PunishmentTableService[213];
                        object16 = PunishmentTableService[214];
                        int n5 = 128;
                        String string9 = PunishmentTableService[215];
                        String string10 = ((SQLiteDriverHandler_5)((Object)iterator)).LiteBansModule_31().c();
                        Object object17 = iterator;
                        string3 = string9 + PunishmentTableService[216];
                        flag6 = false;
                        args[1] = CommandThrottleService.LiteBansModule_31(((SQLiteDriverHandler_5)object17).LiteBansModule_31().BaseCoreGenericHandler()) ? (String)object16 + PunishmentTableService[217] + n5 + ')' + string10 + string3 : (String)object16 + PunishmentTableService[218] + n5 + ')' + string3;
                        object16 = PunishmentTableService[219];
                        n5 = 128;
                        string9 = PunishmentTableService[220];
                        string10 = ((SQLiteDriverHandler_5)((Object)iterator)).LiteBansModule_31().c();
                        bl29 = false;
                        object17 = iterator;
                        string3 = string9 + PunishmentTableService[221];
                        flag6 = false;
                        args[2] = CommandThrottleService.LiteBansModule_31(((SQLiteDriverHandler_5)object17).LiteBansModule_31().BaseCoreGenericHandler()) ? (String)object16 + PunishmentTableService[222] + n5 + ')' + string10 + string3 : (String)object16 + PunishmentTableService[223] + n5 + ')' + string3;
                        object16 = PunishmentTableService[224];
                        n5 = 64;
                        string9 = PunishmentTableService[225];
                        string10 = ((SQLiteDriverHandler_5)((Object)iterator)).LiteBansModule_31().c();
                        bl29 = false;
                        object17 = iterator;
                        string3 = string9 + PunishmentTableService[226];
                        flag6 = false;
                        args[3] = CommandThrottleService.LiteBansModule_31(((SQLiteDriverHandler_5)object17).LiteBansModule_31().BaseCoreGenericHandler()) ? (String)object16 + PunishmentTableService[227] + n5 + ')' + string10 + string3 : (String)object16 + PunishmentTableService[228] + n5 + ')' + string3;
                        object16 = iterator;
                        String string11 = PunishmentTableService[229];
                        string9 = PunishmentTableService[230];
                        String string12 = ((SQLiteDriverHandler_5)object16).LiteBansModule_31().BaseCoreGenericHandler();
                        args[4] = ObjectUtilities.BaseCoreGenericHandler((Object)string12, (Object)PunishmentTableService[231]) || ObjectUtilities.BaseCoreGenericHandler((Object)string12, (Object)PunishmentTableService[232]) ? string11 + PunishmentTableService[233] + string9 : string11 + PunishmentTableService[234] + ((SQLiteDriverHandler_5)object16).LiteBansModule_31().e() + PunishmentTableService[235] + string9;
                        object16 = iterator;
                        string11 = PunishmentTableService[236];
                        args[5] = PunishmentTableService[237] + string11 + ')';
                        object15 = SQLiteDriverHandler.AsyncBackgroundTask_5(((SQLiteDriverHandler_5)((Object)iterator)).BaseCoreGenericHandler(BansHandler_2.i, args));
                        bl25 = false;
                        Iterator iterator8 = iterator = object6;
                        object6.addBatch(object15.toString());
                        object6 = iterator;
                        object15 = gZ2;
                        bl25 = false;
                        iterator = object9;
                        String[] filteredArgs = new String[4];
                        object16 = iterator;
                        string11 = PunishmentTableService[238];
                        bl31 = false;
                        filteredArgs[0] = ObjectUtilities.BaseCoreGenericHandler((Object)((SQLiteDriverHandler_5)object16).LiteBansModule_31().BaseCoreGenericHandler(), (Object)PunishmentTableService[239]) ? string11 + PunishmentTableService[240] : string11 + PunishmentTableService[241];
                        object16 = PunishmentTableService[242];
                        int n6 = 16;
                        bl31 = false;
                        if (ObjectUtilities.BaseCoreGenericHandler((Object)((SQLiteDriverHandler_5)((Object)iterator)).LiteBansModule_31().BaseCoreGenericHandler(), (Object)PunishmentTableService[243])) {
                            string = (String)object16 + PunishmentTableService[244];
                        } else {
                            String string13 = PunishmentTableService[245];
                            string = (String)object16 + ' ' + string13 + '(' + n6 + PunishmentTableService[246];
                        }
                        filteredArgs[1] = string;
                        object16 = PunishmentTableService[247];
                        String string14 = PunishmentTableService[248];
                        bl31 = false;
                        String string15 = ((SQLiteDriverHandler_5)((Object)iterator)).LiteBansModule_31().BaseCoreGenericHandler();
                        filteredArgs[2] = ObjectUtilities.BaseCoreGenericHandler((Object)string15, (Object)PunishmentTableService[249]) || ObjectUtilities.BaseCoreGenericHandler((Object)string15, (Object)PunishmentTableService[250]) ? (String)object16 + PunishmentTableService[251] + string14 : (String)object16 + PunishmentTableService[252] + ((SQLiteDriverHandler_5)((Object)iterator)).LiteBansModule_31().e() + PunishmentTableService[253] + string14;
                        object16 = iterator;
                        string14 = PunishmentTableService[254];
                        bl31 = false;
                        filteredArgs[3] = PunishmentTableService[255] + string14 + ')';
                        object15 = SQLiteDriverHandler.AsyncBackgroundTask_5(((SQLiteDriverHandler_5)((Object)iterator)).BaseCoreGenericHandler(BansHandler_2.LiteBansModule_241, filteredArgs));
                        bl25 = false;
                        Iterator iterator9 = iterator = object6;
                        object6.addBatch(object15.toString());
                        try {
                            object6 = w2.BaseCoreGenericHandler(statement);
                        }
                        catch (Exception exception) {
                            w2.BaseCoreGenericHandler(exception);
                            object6 = KotlinUnitHandler.BaseCoreGenericHandler;
                        }
                        boolean bl35 = litebans.DatabaseMonitorService.BaseCoreGenericHandler(this, (LiteBansModule_83)object7, (SQLiteDriverHandler_5)object9, false, false, 12, null);
                        this.BroadcastService();
                        ((SQLiteDriverHandler_3)object8).e().BaseCoreGenericHandler(() -> DatabaseMonitorService.BaseCoreGenericHandler(this, bl35), 200L);
                        this.HoverTextFormatter = null;
                        if (bl10 && eG2.aS()) {
                            litebans.DatabaseMonitorService.BaseCoreGenericHandler(this, (LiteBansModule_83)object7, 0L, true, 2, null);
                        }
                        object8 = LiteBansModule_288.LiteBansModule_31((double)(System.nanoTime() - l3) / 1000.0 / 1000.0);
                        PluginModule module = this;
                        object9 = PunishmentTableService[256] + (String)object8 + PunishmentTableService[257];
                        bl10 = false;
                        module.BaseCoreGenericHandler.getLogger().info((String)object9);
                        object7 = KotlinUnitHandler.BaseCoreGenericHandler;
                    }
                    catch (Throwable throwable4) {
                        throwable3 = throwable4;
                        throw throwable4;
                    }
                    finally {
                        BlockHandler.BaseCoreGenericHandler(closeable, throwable3);
                    }
                    contextObj = KotlinUnitHandler.BaseCoreGenericHandler;
                }
                catch (Throwable throwable5) {
                    throwable2 = throwable5;
                    throw throwable5;
                }
                finally {
                    CloseactionHandler.BaseCoreGenericHandler(autoCloseable2, throwable2);
                }
                targetObj = KotlinUnitHandler.BaseCoreGenericHandler;
            }
            catch (Throwable throwable6) {
                throwable = throwable6;
                throw throwable6;
            }
            finally {
                CloseactionHandler.BaseCoreGenericHandler(autoCloseable, throwable);
            }
            iv_02 = KotlinUnitHandler.BaseCoreGenericHandler;
        } else {
            iv_02 = null;
        }
    }

    public static /* synthetic */ void BaseCoreGenericHandler(DatabaseMonitorService w2, long l3, boolean flag, boolean flag2, boolean flag3, int n, Object targetObj) {
        if ((n & 1) != 0) {
            l3 = System.nanoTime();
        }
        if ((n & 2) != 0) {
            flag = true;
        }
        if ((n & 4) != 0) {
            flag2 = true;
        }
        if ((n & 8) != 0) {
            flag3 = true;
        }
        w2.BaseCoreGenericHandler(l3, flag, flag2, flag3);
    }

    public final long LiteBansModule_31(boolean flag) {
        long l3 = System.currentTimeMillis();
        if (flag) {
            return l3;
        }
        long l5 = this.PunishmentTableService().LiteBansModule_195().LiteBansModule_15();
        if (this.PunishmentTableService().LiteBansModule_195().CommandThrottleService()) {
            TimeZone timeZone = TimeZone.getTimeZone(this.DatabaseMonitorService);
            Calendar calendar = Calendar.getInstance(timeZone);
            long l7 = calendar.getTimeInMillis();
            long l8 = l5 + (l7 + (long)timeZone.getOffset(l7));
            return l8;
        }
        return l3 + l5;
    }

    public static /* synthetic */ long BaseCoreGenericHandler(DatabaseMonitorService w2, boolean flag, int n, Object targetObj) {
        if ((n & 1) != 0) {
            flag = false;
        }
        return w2.LiteBansModule_31(flag);
    }

    public final void BaseCoreGenericHandler(@NotNull LiteBansModule_83 ch2, long l3, boolean flag) {
        char stringArray7;
        CharSequence charSequenceArray6;
        int n;
        DiscordWebhookClient eG2 = this.PunishmentTableService().LiteBansModule_195();
        String string = eG2.LiteBansModule_25();
        String string2 = eG2.aG();
        Object contextObj = BansHandler_2.LiteBansModule_195;
        CharSequence charSequence2 = PunishmentTableService[376];
        contextObj = SQLiteDriverHandler.e(PunishmentTableService[377] + charSequence2 + PunishmentTableService[378] + contextObj);
        charSequence2 = PunishmentTableService[379];
        LiteBansModule_83 ch3 = ch2;
        flag2 = false;
        Object resultObj = new CharSequence[]{SQLiteDriverHandler.AsyncBackgroundTask_5((String)contextObj), charSequence2};
        boolean c10 = false;
        CharSequence[] charSequenceArray = resultObj;
        boolean cmdArgs = false;
        int n2 = charSequenceArray.length;
        for (n = 0; n < n2; ++n) {
            CharSequence charSequence;
            charSequenceArray6 = charSequence = charSequenceArray[n];
            stringArray7 = '\u0000';
            if (charSequenceArray6.length() > 0) continue;
            String string3 = PunishmentTableService[380];
            throw new IllegalArgumentException(string3.toString());
        }
        contextObj = ch3.c(SQLiteDriverHandler.AsyncBackgroundTask_5(SQLiteDriverHandler.e(SQLiteDriverHandler.LiteBansModule_31((String)contextObj) + PunishmentTableService[381] + charSequence2)));
        resultObj = targetObj = contextObj;
        boolean stringBuilder = false;
        ((LiteBansModule_60)contextObj).BaseCoreGenericHandler(string2);
        ResultSet resultSet = LiteBansModule_185.AsyncBackgroundTask_5((LiteBansModule_60)targetObj);
        try {
            if (!resultSet.next()) {
                boolean flag3;
                int n3;
                contextObj = BansHandler_2.LiteBansModule_195;
                String[] args = (String[])PunishmentTableService[382];
                ch3 = ch2;
                resultObj = args;
                char tempObj = ',';
                Object bl23 = resultObj;
                n = 0;
                n2 = 0;
                for (n3 = 0; n3 < bl23.length(); ++n3) {
                    char c;
                    stringArray7 = c = bl23.charAt(n3);
                    flag3 = false;
                    if (!(stringArray7 == tempObj)) continue;
                    ++n2;
                }
                int n4 = n2;
                resultObj = PunishmentTableService[383];
                if (n4 > 0) {
                    StringBuilder object62 = new StringBuilder(n4 * 2);
                    Iterable iterable = new LiteBansModule_167(0, n4);
                    boolean stringArray6 = false;
                    Iterator iterator = iterable.iterator();
                    while (iterator.hasNext()) {
                        n3 = n2 = ((LiteBansModule_291)iterator).LiteBansModule_31();
                        object62.append(PunishmentTableService[384]);
                    }
                    resultObj = StringUtilities.LiteBansModule_31(object62.toString(), 1);
                }
                Object helperObj = contextObj;
                contextObj = ch3.c(SQLiteDriverHandler.AsyncBackgroundTask_5(SQLiteDriverHandler.e(PunishmentTableService[385] + helperObj + '(' + args + PunishmentTableService[386] + (CharSequence)resultObj + ')')));
                args = new String[]{string, string2};
                flag6 = false;
                Object object6 = resultObj = contextObj;
                flag8 = false;
                String[] filteredArgs = args;
                n3 = filteredArgs.length;
                for (n2 = 0; n2 < n3; ++n2) {
                    String string4;
                    String string5 = string4 = filteredArgs[n2];
                    flag3 = false;
                    ((LiteBansModule_60)contextObj).BaseCoreGenericHandler(string5);
                }
                LiteBansModule_185.AsyncBackgroundTask_5((LiteBansModule_60)resultObj);
            } else {
                contextObj = resultSet.getString(PunishmentTableService[387]);
                if (!ObjectUtilities.BaseCoreGenericHandler((Object)string, contextObj)) {
                    int n5;
                    this.PunishmentTableService().BaseCoreGenericHandler((Object)(PunishmentTableService[388] + (String)contextObj + PunishmentTableService[389] + string + '\"'));
                    BansHandler_2[] kLArray = BansHandler_2.LiteBansModule_195;
                    kLArray = SQLiteDriverHandler.c(SQLiteDriverHandler.e(PunishmentTableService[390] + kLArray), PunishmentTableService[391]);
                    String[] args = (String[])PunishmentTableService[392];
                    ch3 = ch2;
                    CharSequence[] charSequenceArray3 = new CharSequence[]{SQLiteDriverHandler.AsyncBackgroundTask_5((String)kLArray), args};
                    charSequenceArray3 = charSequenceArray3;
                    CharSequence[] charSequenceArray4 = charSequenceArray3;
                    n = 0;
                    int n7 = charSequenceArray4.length;
                    for (n2 = 0; n2 < n7; ++n2) {
                        CharSequence charSequence = charSequenceArray6 = charSequenceArray4[n2];
                        if (charSequence.length() > 0) continue;
                        String string6 = PunishmentTableService[393];
                        throw new IllegalArgumentException(string6.toString());
                    }
                    kLArray = ch3.c(SQLiteDriverHandler.AsyncBackgroundTask_5(SQLiteDriverHandler.e(SQLiteDriverHandler.LiteBansModule_31((String)kLArray) + PunishmentTableService[394] + args)));
                    args = new String[]{string, string2};
                    n6 = 0;
                    BansHandler_2[] kLArray2 = kLArray;
                    Object object7 = kLArray2;
                    String[] parsedArgs = args;
                    n2 = 0;
                    int n8 = parsedArgs.length;
                    for (n7 = 0; n7 < n8; ++n7) {
                        String string7;
                        String string8 = string7 = parsedArgs[n7];
                        n5 = 0;
                        kLArray.BaseCoreGenericHandler(string8);
                    }
                    LiteBansModule_185.AsyncBackgroundTask_5((LiteBansModule_60)kLArray2);
                    for (BansHandler_2 kL2 : BansHandler_2.values()) {
                        boolean bl14;
                        CharSequence charSequence;
                        int n9;
                        if (!kL2.BaseCoreGenericHandler()) continue;
                        object7 = kL2;
                        object7 = SQLiteDriverHandler.c(SQLiteDriverHandler.e(PunishmentTableService[395] + object7), PunishmentTableService[396]);
                        String[] stringArray5 = (String[])PunishmentTableService[397];
                        ch3 = ch2;
                        CharSequence[] charSequenceArray5 = new CharSequence[]{SQLiteDriverHandler.AsyncBackgroundTask_5((String)object7), stringArray5};
                        CharSequence[] charSequenceArray7 = charSequenceArray5;
                        n5 = charSequenceArray7.length;
                        for (n9 = 0; n9 < n5; ++n9) {
                            CharSequence charSequence3;
                            charSequence = charSequence3 = charSequenceArray7[n9];
                            if (charSequence.length() > 0) continue;
                            String string9 = PunishmentTableService[398];
                            throw new IllegalArgumentException(string9.toString());
                        }
                        object7 = ch3.c(SQLiteDriverHandler.AsyncBackgroundTask_5(SQLiteDriverHandler.e(SQLiteDriverHandler.LiteBansModule_31((String)object7) + PunishmentTableService[399] + stringArray5)));
                        stringArray5 = new String[]{string, contextObj};
                        bl16 = false;
                        CharSequence[] charSequenceArray8 = charSequenceArray5 = object7;
                        String[] stringArray6 = stringArray5;
                        n9 = 0;
                        int n10 = stringArray6.length;
                        for (n5 = 0; n5 < n10; ++n5) {
                            CharSequence charSequence4 = charSequence = stringArray6[n5];
                            bl14 = false;
                            ((LiteBansModule_60)object7).BaseCoreGenericHandler((String)charSequence4);
                        }
                        LiteBansModule_185.AsyncBackgroundTask_5((LiteBansModule_60)charSequenceArray5);
                        object7 = kL2;
                        object7 = SQLiteDriverHandler.c(SQLiteDriverHandler.e(PunishmentTableService[400] + object7), PunishmentTableService[401]);
                        String[] stringArray8 = (String[])PunishmentTableService[402];
                        ch3 = ch2;
                        bl16 = false;
                        charSequenceArray5 = new CharSequence[]{SQLiteDriverHandler.AsyncBackgroundTask_5((String)object7), stringArray8};
                        CharSequence[] charSequenceArray9 = charSequenceArray5;
                        n5 = charSequenceArray9.length;
                        for (n9 = 0; n9 < n5; ++n9) {
                            CharSequence charSequence5;
                            charSequence = charSequence5 = charSequenceArray9[n9];
                            if (charSequence.length() > 0) continue;
                            String string10 = PunishmentTableService[403];
                            throw new IllegalArgumentException(string10.toString());
                        }
                        object7 = ch3.c(SQLiteDriverHandler.AsyncBackgroundTask_5(SQLiteDriverHandler.e(SQLiteDriverHandler.LiteBansModule_31((String)object7) + PunishmentTableService[404] + stringArray8)));
                        stringArray8 = new String[]{string, contextObj};
                        bl16 = false;
                        CharSequence[] charSequenceArray10 = charSequenceArray5 = object7;
                        n8 = 0;
                        String[] stringArray9 = stringArray8;
                        n9 = 0;
                        int n11 = stringArray9.length;
                        for (n5 = 0; n5 < n11; ++n5) {
                            CharSequence charSequence6 = charSequence = stringArray9[n5];
                            bl14 = false;
                            ((LiteBansModule_60)object7).BaseCoreGenericHandler((String)charSequence6);
                        }
                        LiteBansModule_185.AsyncBackgroundTask_5((LiteBansModule_60)charSequenceArray5);
                    }
                }
            }
            if (l3 <= 0L) {
                this.plugin(ch2, flag);
            } else {
                this.plugin.BaseCoreGenericHandler(() -> DatabaseMonitorService.BaseCoreGenericHandler(this, ch2, flag), l3);
            }
        }
        catch (Exception exception) {
            if (exception instanceof SQLException) {
                this.plugin(exception);
            }
            ConfigService.BaseCoreGenericHandler(this.PunishmentTableService(), exception, 0, 2, null);
        }
    }

    public static /* synthetic */ void BaseCoreGenericHandler(DatabaseMonitorService w2, LiteBansModule_83 ch2, long l3, boolean flag, int n, Object targetObj) {
        if ((n & 2) != 0) {
            l3 = 0L;
        }
        if ((n & 4) != 0) {
            flag = false;
        }
        w2.BaseCoreGenericHandler(ch2, l3, flag);
    }

    private final void BaseCoreGenericHandler(String string, long l3) {
        if (ObjectUtilities.BaseCoreGenericHandler((Object)string, (Object)PunishmentTableService[408]) && this.e) {
            flag = LiteBansModule_431.LiteBansModule_31.BaseCoreGenericHandler(this);
        }
        if (!flag) {
            this.plugin(this.PunishmentTableService());
            litebans.DatabaseMonitorService.BaseCoreGenericHandler(this, l3, false, false, false, 14, null);
        }
    }

    static /* synthetic */ void BaseCoreGenericHandler(DatabaseMonitorService w2, String string, long l3, int n, Object targetObj) {
        if ((n & 2) != 0) {
            l3 = System.nanoTime();
        }
        w2.BaseCoreGenericHandler(string, l3);
    }

    public final void BaseCoreGenericHandler(@NotNull ConfigService v1) {
        block53: {
            block52: {
                v9 = System.nanoTime();
                this.LiteBansModule_31 = null;
                v2 = v1.LiteBansModule_195();
                v10 = v2.ElementsHandler();
                v11 = this.LiteBansModule_31(v1);
                v12 = this.plugin(v1, v10);
                if (v12 == null) {
                    v13 = this;
                    v14 = v11;
                    v15 = new StringBuilder().append(litebans.DatabaseMonitorService.PunishmentTableService[409]).append(v10).append(litebans.DatabaseMonitorService.PunishmentTableService[410]);
                    v16 = v14;
                    v17 = new ArrayList<PunishmentService>(CollectionUtilities.BaseCoreGenericHandler((Iterable)v14, 10));
                    for (T v18 : v16) {
                        v19 = (JarHandler)v18;
                        v20 = v17;
                        v20.add(v19.AsyncBackgroundTask_5());
                    }
                    v14 = v15.append((List)v17).toString();
                    v13.BaseCoreGenericHandler.getLogger().severe((String)v14);
                    return;
                }
                v0 = litebans.DatabaseMonitorService.BaseCoreGenericHandler(this, v12, false, false, 6, null);
                if (v0 == null) {
                    return;
                }
                v21 = v0;
                v22 = v2.q();
                v23 = new String[]{litebans.DatabaseMonitorService.PunishmentTableService[411], litebans.DatabaseMonitorService.PunishmentTableService[412]};
                v24 = LiteBansModule_5.BaseCoreGenericHandler((Object[])v23).contains(v10);
                if (!StringUtilities.c((CharSequence)v22, ':', false, 2, null)) {
                    v23 = this.PunishmentTableService().LiteBansModule_195().ElementsHandler();
                    if (litebans.DatabaseMonitorService.CommandThrottleService.LiteBansModule_31((String)v23)) {
                        v1 = v22 + litebans.DatabaseMonitorService.PunishmentTableService[413];
                    } else {
                        v25 = litebans.DatabaseMonitorService.CommandThrottleService;
                        v1 = ObjectUtilities.BaseCoreGenericHandler(v23, (Object)litebans.DatabaseMonitorService.PunishmentTableService[414]) != false || ObjectUtilities.BaseCoreGenericHandler(v23, (Object)litebans.DatabaseMonitorService.PunishmentTableService[415]) != false ? v22 + litebans.DatabaseMonitorService.PunishmentTableService[416] : v22;
                    }
                    v22 = v1;
                }
                v23 = v10;
                switch (v23.hashCode()) {
                    case -894935028: {
                        if (!v23.equals(litebans.DatabaseMonitorService.PunishmentTableService[417])) {
                            break;
                        }
                        break block52;
                    }
                    case 3274: {
                        if (v23.equals(litebans.DatabaseMonitorService.PunishmentTableService[418])) break;
                        break;
                    }
                    case 106616951: {
                        if (!v23.equals(litebans.DatabaseMonitorService.PunishmentTableService[419])) {
                            break;
                        }
                        break block53;
                    }
                }
                v25 = this.plugin.getDataFolder();
                v26 = litebans.DatabaseMonitorService.PunishmentTableService[420];
                v22 = new File((File)v25, v26).getAbsolutePath();
                break;
            }
            v25 = this.plugin.getDataFolder();
            v27 = litebans.DatabaseMonitorService.PunishmentTableService[421];
            v22 = new File((File)v25, v27).getPath();
            this.z = new LiteBansModule_94(this.plugin);
            break;
        }
        v10 = litebans.DatabaseMonitorService.PunishmentTableService[422];
                v22 = this.z.BaseCoreGenericHandler(v22);
        v23 = litebans.DatabaseMonitorService.PunishmentTableService[423] + v10 + litebans.DatabaseMonitorService.PunishmentTableService[424] + v22;
        if (!v24) {
            v23 = (String)v23 + '/' + v2.DatabaseMonitorService();
        }
        if (((CharSequence)(v28 = v2.aN())).length() > 0) {
            if (!v24 && !StringUtilities.BaseCoreGenericHandler((CharSequence)v28, '?', false, 2, null)) {
                v28 = '?' + v28;
            }
            if (!(ObjectUtilities.BaseCoreGenericHandler((Object)v10, (Object)litebans.DatabaseMonitorService.PunishmentTableService[425]) && (ObjectUtilities.BaseCoreGenericHandler((Object)v28, (Object)litebans.DatabaseMonitorService.PunishmentTableService[426]) || ObjectUtilities.BaseCoreGenericHandler((Object)v28, (Object)litebans.DatabaseMonitorService.PunishmentTableService[427])) || ObjectUtilities.BaseCoreGenericHandler((Object)v10, (Object)litebans.DatabaseMonitorService.PunishmentTableService[428]))) {
                v23 = (String)v23 + v28;
            }
        }
        v25 = v23;
        v29 = StringUtilities.BaseCoreGenericHandler((String)v25, litebans.DatabaseMonitorService.PunishmentTableService[429], litebans.DatabaseMonitorService.PunishmentTableService[430], false, 4, null);
        if (ObjectUtilities.BaseCoreGenericHandler((Object)v10, (Object)litebans.DatabaseMonitorService.PunishmentTableService[431])) {
            v23 = (String)v23 + litebans.DatabaseMonitorService.PunishmentTableService[432];
        }
        v30 = Math.max(2000L, v2.Y());
        v31 = litebans.DatabaseMonitorService.BaseCoreGenericHandler(this, new LiteBansModule_245(this.plugin), null, false, false, 12, null);
        v32 = v31 != false ? v30 : 0x7FFFFFFFL;
        v33 = litebans.DatabaseMonitorService.CommandThrottleService;
        if (ObjectUtilities.BaseCoreGenericHandler((Object)v10, (Object)litebans.DatabaseMonitorService.PunishmentTableService[433]) != false || ObjectUtilities.BaseCoreGenericHandler((Object)v10, (Object)litebans.DatabaseMonitorService.PunishmentTableService[434]) != false) {
            v32 = Math.min(v32, 2147483L);
        }
        v33 = v1;
        if (v33.g()) {
            v34 = v33;
            v34.BaseCoreGenericHandler(v23);
        }
        v33 = v1;
        if (v33.g()) {
            v34 = v33;
            v34.BaseCoreGenericHandler((Object)this.plugin.i().LiteBansModule_31());
        }
        v33 = this;
        v35 = litebans.DatabaseMonitorService.PunishmentTableService[435];
        if (!litebans.DatabaseMonitorService.c((DatabaseMonitorService)v33).get()) {
            v36 = (PluginModule)v33;
            v36.BaseCoreGenericHandler.getLogger().info((String)v35);
        }
        try {
            HikariLogger.BaseCoreGenericHandler(this.plugin.getLogger());
            v33 = new HikariConfig();
            v33.LiteBansModule_195(litebans.DatabaseMonitorService.PunishmentTableService[436]);
            v33.g((String)v23);
            v35 = v33;
            v37 = litebans.DatabaseMonitorService.PunishmentTableService[437];
            v36 = v2.aW();
            v38 = v39 = v35;
            v35.BaseCoreGenericHandler((String)v37, v36);
            v35 = v39;
            v37 = litebans.DatabaseMonitorService.PunishmentTableService[438];
            v36 = v2.LiteBansModule_6();
            v38 = v39 = v35;
            v35.BaseCoreGenericHandler((String)v37, v36);
            v35 = v39;
            v37 = litebans.DatabaseMonitorService.PunishmentTableService[439];
            v36 = v30;
            v39 = v35;
            v38 = v36.toString();
            v40 = v41 = v39;
            v39.BaseCoreGenericHandler((String)v37, v38);
            v35 = v41;
            v37 = litebans.DatabaseMonitorService.PunishmentTableService[440];
            v36 = v32;
            v39 = v35;
            v38 = v36.toString();
            v40 = v41 = v39;
            v39.BaseCoreGenericHandler((String)v37, v38);
            v35 = v41;
            v37 = litebans.DatabaseMonitorService.PunishmentTableService[441];
            v36 = litebans.DatabaseMonitorService.PunishmentTableService[442];
            v38 = v39 = v35;
            v35.BaseCoreGenericHandler((String)v37, v36);
            v35 = v39;
            v37 = litebans.DatabaseMonitorService.PunishmentTableService[443];
            v36 = litebans.DatabaseMonitorService.PunishmentTableService[444];
            v38 = v35;
            v42 = litebans.DatabaseMonitorService.PunishmentTableService[445];
            v41 = litebans.DatabaseMonitorService.PunishmentTableService[446];
            v43 = v44 = v38;
            v38.BaseCoreGenericHandler((String)v42, v41);
            v38 = v35;
            v42 = litebans.DatabaseMonitorService.PunishmentTableService[447];
            v44 = v45 = v38;
            v38.BaseCoreGenericHandler((String)v42, v37);
            v38 = v45;
            v42 = litebans.DatabaseMonitorService.PunishmentTableService[448];
            v44 = v45 = v38;
            v38.BaseCoreGenericHandler((String)v42, v37);
            v38 = v45;
            v42 = litebans.DatabaseMonitorService.PunishmentTableService[449];
            v44 = v45 = v38;
            v38.BaseCoreGenericHandler((String)v42, v36);
            v35 = v45;
            v37 = litebans.DatabaseMonitorService.PunishmentTableService[450];
            v46 = v35;
            v47 = litebans.DatabaseMonitorService.PunishmentTableService[451];
            v48 = v42 = v46;
            v46.BaseCoreGenericHandler((String)v37, v47);
            v35 = v42;
            v37 = new String[]{litebans.DatabaseMonitorService.PunishmentTableService[452], litebans.DatabaseMonitorService.PunishmentTableService[453], litebans.DatabaseMonitorService.PunishmentTableService[454], litebans.DatabaseMonitorService.PunishmentTableService[455], litebans.DatabaseMonitorService.PunishmentTableService[456], litebans.DatabaseMonitorService.PunishmentTableService[457]};
            v47 = v46 = v35;
            v42 = v37;
            v49 = v42.length;
            for (v50 = 0; v50 < v49; ++v50) {
                v51 = v52 = v42[v50];
                v53 = v35;
                v54 = litebans.DatabaseMonitorService.PunishmentTableService[458];
                v55 = v56 = v53;
                v53.BaseCoreGenericHandler(v51, v54);
            }
            v35 = v46;
            v37 = new String[]{litebans.DatabaseMonitorService.PunishmentTableService[459], litebans.DatabaseMonitorService.PunishmentTableService[460]};
            v47 = v46 = v35;
            v42 = v37;
            v49 = v42.length;
            for (v50 = 0; v50 < v49; ++v50) {
                v57 = v58 = v42[v50];
                v53 = v35;
                v54 = litebans.DatabaseMonitorService.PunishmentTableService[461];
                v55 = v56 = v53;
                v53.BaseCoreGenericHandler(v57, v54);
            }
            v33.AsyncBackgroundTask_5(v30);
            v33.LiteBansModule_195(Math.min(30000L, v30));
            if (v2.V() != v2.LiteBansModule_5()) {
                v33.e(v2.ServerEventListener());
            }
            v33.BaseCoreGenericHandler(Math.max(0, v2.V()));
            v33.LiteBansModule_31(Math.max(1, v2.LiteBansModule_5()));
            v33.g(Math.max(0L, v2.LiteBansModule_403()));
            v35 = this;
            v59 = v35.BaseCoreGenericHandler.LiteBansModule_435();
            v60 = Math.max(20, v33.LiteBansModule_195() + 8);
            v59.setMaximumPoolSize(v60);
            v59.setRejectedExecutionHandler(new LiteBansModule_141((DatabaseMonitorService)v35));
            v59.setCorePoolSize(Math.min(v60, v33.i() + 1));
            v59.setKeepAliveTime(4L, TimeUnit.MINUTES);
            if (ObjectUtilities.BaseCoreGenericHandler((Object)v10, (Object)litebans.DatabaseMonitorService.PunishmentTableService[462])) {
                v33.AsyncBackgroundTask_5(litebans.DatabaseMonitorService.PunishmentTableService[463]);
            } else if (ObjectUtilities.BaseCoreGenericHandler((Object)v10, (Object)litebans.DatabaseMonitorService.PunishmentTableService[464])) {
                v33.LiteBansModule_241(litebans.DatabaseMonitorService.PunishmentTableService[465]);
            }
            v33.BaseCoreGenericHandler(new LiteBansModule_188((Driver)v21, (HikariConfig)v33));
            if (this.plugin.AsyncBackgroundTask_22() == 1) {
                try {
                    v2 = this.plugin.i();
                    ObjectUtilities.LiteBansModule_31(v2, litebans.DatabaseMonitorService.PunishmentTableService[466]);
                    v33.BaseCoreGenericHandler(((GetcancelreasoncomponentsHandler)v2).BaseCoreGenericHandler(this.plugin));
                }
                catch (Throwable v61) {
                    this.plugin(v61);
                }
            }
            this.LiteBansModule_31 = new HikariDataSource((HikariConfig)v33);
        }
        catch (Exception v62) {
            v35 = this;
            v63 = litebans.DatabaseMonitorService.PunishmentTableService[467] + v29 + litebans.DatabaseMonitorService.PunishmentTableService[468];
            v35.BaseCoreGenericHandler.getLogger().severe(v63);
            if (!ObjectUtilities.BaseCoreGenericHandler((Object)v10, (Object)litebans.DatabaseMonitorService.PunishmentTableService[469]) && StringUtilities.LiteBansModule_31((CharSequence)v2.aW()) && StringUtilities.LiteBansModule_31((CharSequence)v2.LiteBansModule_6())) {
                v35 = this;
                v63 = litebans.DatabaseMonitorService.PunishmentTableService[470];
                v35.BaseCoreGenericHandler.getLogger().severe(v63);
            }
            v35 = v62.getMessage();
            v3 = v62.getCause();
            v4 = v63 = v3 != null ? v3.getMessage() : null;
            if (v63 == null || v35 == null || !StringUtilities.BaseCoreGenericHandler((CharSequence)v35, (CharSequence)v63, false, 2, null)) {
                v64 = this;
                v65 = litebans.DatabaseMonitorService.PunishmentTableService[471] + v62.getMessage();
                v64.BaseCoreGenericHandler.getLogger().severe(v65);
            }
            v66 = litebans.DatabaseMonitorService.PunishmentTableService[472];
            v67 = v62;
            v68 = 16;
            while (v68-- > 0 && v67.getCause() != null) {
                v5 = v67.getLocalizedMessage();
                if (v5 == null) {
                    v5 = litebans.DatabaseMonitorService.PunishmentTableService[473];
                }
                if (((CharSequence)(v69 = v5)).length() > 0 && (StringUtilities.BaseCoreGenericHandler((CharSequence)v69, (CharSequence)litebans.DatabaseMonitorService.PunishmentTableService[474], false, 2, null) || StringUtilities.BaseCoreGenericHandler((CharSequence)v69, (CharSequence)litebans.DatabaseMonitorService.PunishmentTableService[475], false, 2, null))) continue;
                if (((CharSequence)v69).length() == 0 && (v6 = v67.getMessage()) == null) {
                    v6 = v69 = litebans.DatabaseMonitorService.PunishmentTableService[476];
                }
                if (v67 instanceof UnknownHostException) {
                    v69 = litebans.DatabaseMonitorService.PunishmentTableService[477] + v69;
                }
                if (!ObjectUtilities.BaseCoreGenericHandler((Object)v69, (Object)litebans.DatabaseMonitorService.PunishmentTableService[478]) && ((CharSequence)v69).length() > 0 && !StringUtilities.BaseCoreGenericHandler((CharSequence)v66, (CharSequence)v69, false, 2, null)) {
                    v70 = this;
                    v71 = litebans.DatabaseMonitorService.PunishmentTableService[479] + v69;
                    v70.BaseCoreGenericHandler.getLogger().severe(v71);
                }
                if ((v7 = v67.getMessage()) == null) {
                    v7 = litebans.DatabaseMonitorService.PunishmentTableService[480];
                }
                if (!(((CharSequence)(v69 = v7)).length() > 0)) continue;
                if (StringUtilities.LiteBansModule_31(v69, litebans.DatabaseMonitorService.PunishmentTableService[481], false, 2, null)) {
                    this.plugin(v2);
                    break;
                }
                if (StringUtilities.BaseCoreGenericHandler((CharSequence)v69, (CharSequence)litebans.DatabaseMonitorService.PunishmentTableService[482], false, 2, null)) {
                    this.z();
                    break;
                }
                v66 = v69;
            }
            if (v1.BaseCoreGenericHandler(1)) {
                v62.printStackTrace();
            }
            return;
        }
        v33 = LiteBansModule_288.LiteBansModule_31((double)(System.nanoTime() - v9) / 1000.0 / 1000.0);
        if (v1.BaseCoreGenericHandler(1)) {
            v35 = this;
            v72 = litebans.DatabaseMonitorService.PunishmentTableService[483] + v29 + litebans.DatabaseMonitorService.PunishmentTableService[484] + (String)v33 + litebans.DatabaseMonitorService.PunishmentTableService[485];
            if (!litebans.DatabaseMonitorService.c((DatabaseMonitorService)v35).get()) {
                v73 = (PluginModule)v35;
                v73.BaseCoreGenericHandler.getLogger().info((String)v72);
            }
        } else {
            v35 = this;
            v72 = litebans.DatabaseMonitorService.PunishmentTableService[486] + litebans.DatabaseMonitorService.CommandThrottleService.c(v10) + litebans.DatabaseMonitorService.PunishmentTableService[487] + (String)v33 + litebans.DatabaseMonitorService.PunishmentTableService[488];
            if (!litebans.DatabaseMonitorService.c((DatabaseMonitorService)v35).get()) {
                v74 = (PluginModule)v35;
                v74.BaseCoreGenericHandler.getLogger().info((String)v72);
            }
        }
        this.AsyncBackgroundTask_5.set(true);
        if (ObjectUtilities.BaseCoreGenericHandler((Object)v10, (Object)litebans.DatabaseMonitorService.PunishmentTableService[489])) {
            try {
                v72 = this.plugin.getDataFolder();
                v75 = litebans.DatabaseMonitorService.PunishmentTableService[490];
                v35 = new File((File)v72, v75);
                if (!v35.exists() || YamlConfigProvider.AsyncBackgroundTask_5() == null) {
                    v72 = this.plugin.getDataFolder();
                    v75 = litebans.DatabaseMonitorService.PunishmentTableService[491];
                    v35 = new File((File)v72, v75);
                }
                v72 = this.plugin.BaseCoreGenericHandler((File)v35).g();
                v72.LiteBansModule_31(litebans.DatabaseMonitorService.PunishmentTableService[492], v2.aW()).LiteBansModule_31(litebans.DatabaseMonitorService.PunishmentTableService[493], v2.LiteBansModule_6()).LiteBansModule_241();
            }
            catch (Exception v76) {
                v76.printStackTrace();
            }
        }
    }

    private final void BaseCoreGenericHandler(DiscordWebhookClient eG2) {
        PluginModule module = this;
        String string = PunishmentTableService[494] + eG2.DatabaseMonitorService() + PunishmentTableService[495];
        module.BaseCoreGenericHandler.getLogger().severe(string);
        module = this;
        string = PunishmentTableService[496] + eG2.DatabaseMonitorService() + PunishmentTableService[497];
        flag = false;
        module.BaseCoreGenericHandler.getLogger().severe(string);
        if (ObjectUtilities.BaseCoreGenericHandler((Object)eG2.DatabaseMonitorService(), (Object)PunishmentTableService[498])) {
            module = this;
            string = PunishmentTableService[499];
            flag = false;
            module.BaseCoreGenericHandler.getLogger().severe(string);
        }
    }

    public final JarHandler BaseCoreGenericHandler(@NotNull ConfigService configService, @NotNull String string) {
        Object v0;
        block1: {
            Iterable iterable = this.LiteBansModule_31(configService);
            for (Object t2 : iterable) {
                JarHandler jP2 = (JarHandler)t2;
                if (!ObjectUtilities.BaseCoreGenericHandler((Object)jP2.AsyncBackgroundTask_5(), (Object)string)) continue;
                v0 = t2;
                break block1;
            }
            v0 = null;
        }
        return v0;
    }

    private final void BaseCoreGenericHandler(String[] args, Statement statement, BansHandler_2 kL2, String string) {
        int n;
        String string2 = null;
        string2 = PunishmentTableService[542];
        if (StringUtilities.LiteBansModule_31(string, PunishmentTableService[543], false, 2, null) || StringUtilities.LiteBansModule_31(string, PunishmentTableService[544], false, 2, null) || StringUtilities.LiteBansModule_31(string, PunishmentTableService[545], false, 2, null)) {
            string2 = PunishmentTableService[546];
        }
        Object targetObj = args;
        Object contextObj = targetObj;
        Collection collection = new ArrayList(((String[])targetObj).length);
        int n2 = ((String[])contextObj).length;
        for (n = 0; n < n2; ++n) {
            String string3;
            String string4 = string3 = contextObj[n];
            Collection collection2 = collection;
            collection2.add(string2 + PunishmentTableService[547] + kL2 + '_' + string4 + PunishmentTableService[548] + kL2 + PunishmentTableService[549] + string4 + ')');
        }
        targetObj = (List)collection;
        flag = false;
        contextObj = targetObj.iterator();
        while (contextObj.hasNext()) {
            collection = contextObj.next();
            String string5 = (String)((Object)collection);
            n = 0;
            statement.execute(string5);
        }
    }

    public final void BroadcastService() {
        this.plugin(arg_0 -> DatabaseMonitorService.BaseCoreGenericHandler(this, arg_0));
    }

    public final Object BaseCoreGenericHandler(@NotNull JarHandler jP2, @NotNull File file, boolean flag) {
        if (!file.exists()) {
            return null;
        }
        String string = ConfigService.GnuSparseMapHandler.LiteBansModule_31(LiteBansModule_375.BaseCoreGenericHandler(file));
        if (jP2.c() != null && !ObjectUtilities.BaseCoreGenericHandler((Object)jP2.c(), (Object)string)) {
            file.delete();
            throw new LiteBansException_9(file, jP2.c(), string);
        }
        Object targetObj = new URL[]{file.toURI().toURL(), DatabaseMonitorService.class.getProtectionDomain().getCodeSource().getLocation().toURI().toURL()};
        URLClassLoader uRLClassLoader = new URLClassLoader((URL[])targetObj, Driver.class.getClassLoader());
        targetObj = uRLClassLoader.loadClass(jP2.LiteBansModule_31());
        if (flag) {
            return ((Class)targetObj).getConstructor(new Class[0]).newInstance(new Object[0]);
        }
        return targetObj;
    }

    private static final ConfigService BaseCoreGenericHandler(DatabaseMonitorService w2) {
        return (ConfigService)w2.BaseCoreGenericHandler.BaseCoreGenericHandler(ConfigService.class);
    }

    private static final BroadcastService LiteBansModule_31(DatabaseMonitorService w2) {
        return (BroadcastService)w2.BaseCoreGenericHandler.BaseCoreGenericHandler(BroadcastService.class);
    }

    private static final List AsyncBackgroundTask_5(DatabaseMonitorService w2) {
        return w2.BaseCoreGenericHandler.i().LiteBansModule_31(w2.BaseCoreGenericHandler.getName());
    }

    private static final List BaseCoreGenericHandler(LiteBansModule_162 eE2) {
        LiteBansModule_162 eE3 = eE2;
        return (List)eE3.BaseCoreGenericHandler();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static final void BaseCoreGenericHandler(CommandSenderWrapper sender, DatabaseMonitorService w2, LiteBansModule_179 eo_02) {
        ChatFormatter chatFormatter = MessageHandler.BaseCoreGenericHandler;
        ObjectUtilities.BaseCoreGenericHandler(sender);
        CommandSenderWrapper senderWrapper = sender;
        try {
            chatFormatter.LiteBansModule_31().set(senderWrapper);
            try {
                DatabaseMonitorService w3 = w2;
                try {
                    LiteBansModule_83 ch2 = w3.LiteBansModule_195();
                    Closeable closeable = ch2;
                    Throwable throwable = null;
                    try {
                        Object targetObj = (LiteBansModule_83)closeable;
                        eo_02.BaseCoreGenericHandler(ch2);
                        targetObj = KotlinUnitHandler.BaseCoreGenericHandler;
                    }
                    catch (Throwable throwable2) {
                        throwable = throwable2;
                        throw throwable2;
                    }
                    finally {
                        BlockHandler.BaseCoreGenericHandler(closeable, throwable);
                    }
                }
                catch (SQLException sQLException) {
                    if (!w3.LiteBansModule_31(sQLException)) {
                        throw sQLException;
                    }
                }
            }
            catch (LiteBansException bi2) {
                CommandSenderWrapper senderWrapper = sender;
                CharSequence charSequence = String.valueOf(bi2.BaseCoreGenericHandler());
                ChatFormatter.BaseCoreGenericHandler(MessageHandler.BaseCoreGenericHandler, senderWrapper, charSequence, null, 4, null);
            }
            catch (SQLException sQLException) {
                w2.BaseCoreGenericHandler(sQLException);
            }
        }
        finally {
            chatFormatter.LiteBansModule_31().remove();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static final void BaseCoreGenericHandler(DatabaseMonitorService args, boolean flag) {
        block51: {
            boolean flag2;
            LiteBansModule_83 ch2;
            boolean flag3;
            Throwable throwable;
            Closeable closeable;
            LiteBansModule_83 ch3;
            boolean flag4;
            String[] filteredArgs;
            String[] parsedArgs = args;
            try {
                filteredArgs = parsedArgs;
                flag4 = false;
                try {
                    ch3 = filteredArgs.LiteBansModule_195();
                    closeable = ch3;
                    throwable = null;
                    try {
                        targetObj = (LiteBansModule_83)closeable;
                        flag3 = false;
                        ch2 = ch3;
                        flag2 = false;
                        if (ch2.BaseCoreGenericHandler()) {
                            ObjectUtilities.LiteBansModule_31(ch2, PunishmentTableService[550]);
                            AutoCloseable autoCloseable = ((SQLiteDriverHandler_3)ch2).LiteBansModule_195();
                            Throwable throwable2 = null;
                            try {
                                Object contextObj = (Statement)autoCloseable;
                                if (!flag) {
                                    String[] cmdArgs = parsedArgs;
                                    if (cmdArgs.A() <= 674) {
                                        CharSequence[] charSequenceArray;
                                        String[] stringArray5;
                                        LiteBansModule_145 dy_02 = new LiteBansModule_145();
                                        dy_02.BaseCoreGenericHandler = PunishmentTableService[551];
                                        if (CommandThrottleService.LiteBansModule_31(cmdArgs.PunishmentTableService().LiteBansModule_195().ElementsHandler())) {
                                            try {
                                                stringArray5 = cmdArgs;
                                                try {
                                                    charSequenceArray = stringArray5.LiteBansModule_195();
                                                    Closeable closeable2 = (Closeable)charSequenceArray;
                                                    Throwable throwable3 = null;
                                                    try {
                                                        String string;
                                                        String string2;
                                                        LiteBansModule_83 resultObj = (LiteBansModule_83)closeable2;
                                                        boolean helperObj = false;
                                                        String[] stringArray6 = charSequenceArray;
                                                        ResultSet resultSet = LiteBansModule_185.AsyncBackgroundTask_5(stringArray6.c((CharSequence)PunishmentTableService[552]));
                                                        LiteBansModule_145 dy_03 = dy_02;
                                                        int n = 1;
                                                        if (resultSet.next()) {
                                                            String string3;
                                                            ResultSet resultSet2 = resultSet;
                                                            try {
                                                                string3 = resultSet2.getString(n);
                                                            }
                                                            catch (SQLException sQLException) {
                                                                string3 = null;
                                                            }
                                                            string2 = string3;
                                                        } else {
                                                            string2 = string = null;
                                                        }
                                                        if (string2 == null) {
                                                            string = PunishmentTableService[553];
                                                        }
                                                        dy_03.BaseCoreGenericHandler = string;
                                                        KotlinUnitHandler iv_02 = KotlinUnitHandler.BaseCoreGenericHandler;
                                                    }
                                                    catch (Throwable throwable4) {
                                                        throwable3 = throwable4;
                                                        throw throwable4;
                                                    }
                                                    finally {
                                                        BlockHandler.BaseCoreGenericHandler(closeable2, throwable3);
                                                    }
                                                }
                                                catch (SQLException sQLException) {
                                                    if (!stringArray5.LiteBansModule_31(sQLException)) {
                                                        throw sQLException;
                                                    }
                                                }
                                            }
                                            catch (SQLException sQLException) {
                                                cmdArgs.BaseCoreGenericHandler(sQLException);
                                            }
                                        }
                                        String[] stringArray7 = new String[]{PunishmentTableService[554], PunishmentTableService[555], PunishmentTableService[556], PunishmentTableService[557], PunishmentTableService[558], PunishmentTableService[559], PunishmentTableService[560], PunishmentTableService[561], PunishmentTableService[562]};
                                        stringArray5 = stringArray7;
                                        charSequenceArray = new String[]{PunishmentTableService[563], PunishmentTableService[564], PunishmentTableService[565]};
                                        stringArray7 = charSequenceArray;
                                        try {
                                            for (CharSequence charSequence : BansHandler_2.values()) {
                                                if (((BansHandler_2)charSequence).BaseCoreGenericHandler()) {
                                                    ((DatabaseMonitorService)cmdArgs).BaseCoreGenericHandler(stringArray5, (Statement)contextObj, (BansHandler_2)charSequence, (String)dy_02.BaseCoreGenericHandler);
                                                    continue;
                                                }
                                                CharSequence charSequence2 = charSequence;
                                                if (!(charSequence2 == BansHandler_2.g)) continue;
                                                ((DatabaseMonitorService)cmdArgs).BaseCoreGenericHandler(stringArray7, (Statement)contextObj, (BansHandler_2)charSequence, (String)dy_02.BaseCoreGenericHandler);
                                            }
                                        }
                                        catch (SQLException sQLException) {
                                            ConfigService.BaseCoreGenericHandler(cmdArgs.PunishmentTableService(), sQLException, 0, 2, null);
                                        }
                                    }
                                }
                                contextObj = KotlinUnitHandler.BaseCoreGenericHandler;
                            }
                            catch (Throwable throwable5) {
                                throwable2 = throwable5;
                                throw throwable5;
                            }
                            finally {
                                CloseactionHandler.BaseCoreGenericHandler(autoCloseable, throwable2);
                            }
                        }
                        targetObj = KotlinUnitHandler.BaseCoreGenericHandler;
                    }
                    catch (Throwable throwable6) {
                        throwable = throwable6;
                        throw throwable6;
                    }
                    finally {
                        BlockHandler.BaseCoreGenericHandler(closeable, throwable);
                    }
                }
                catch (SQLException sQLException) {
                    if (!filteredArgs.LiteBansModule_31(sQLException)) {
                        throw sQLException;
                    }
                }
            }
            catch (Exception exception) {
                parsedArgs.BaseCoreGenericHandler(exception);
            }
            try {
                if (flag) break block51;
                filteredArgs = parsedArgs;
                flag4 = false;
                try {
                    ch3 = filteredArgs.LiteBansModule_195();
                    closeable = ch3;
                    throwable = null;
                    try {
                        targetObj = (LiteBansModule_83)closeable;
                        flag3 = false;
                        ch2 = ch3;
                        flag2 = false;
                        ch2.BaseCoreGenericHandler(PunishmentTableService[566], PunishmentTableService[567], PunishmentTableService[568], false, false);
                        targetObj = KotlinUnitHandler.BaseCoreGenericHandler;
                    }
                    catch (Throwable throwable7) {
                        throwable = throwable7;
                        throw throwable7;
                    }
                    finally {
                        BlockHandler.BaseCoreGenericHandler(closeable, throwable);
                    }
                }
                catch (SQLException sQLException) {
                    if (!filteredArgs.LiteBansModule_31(sQLException)) {
                        throw sQLException;
                    }
                }
            }
            catch (Throwable throwable8) {
                parsedArgs.BaseCoreGenericHandler(throwable8);
            }
        }
    }

    private static final void BaseCoreGenericHandler(DatabaseMonitorService w2, LiteBansModule_83 ch2, boolean flag) {
        w2.BaseCoreGenericHandler(ch2, flag);
    }

    private static final KotlinUnitHandler BaseCoreGenericHandler(DatabaseMonitorService w2, LiteBansModule_83 ch2) {
        try {
            if (ch2.LiteBansModule_31()) {
                return KotlinUnitHandler.BaseCoreGenericHandler;
            }
            contextObj = LiteBansModule_185.AsyncBackgroundTask_5(ch2.c((CharSequence)PunishmentTableService[569]));
            contextObj.next();
            targetObj = contextObj.getTimestamp(PunishmentTableService[570]);
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeZone(TimeZone.getTimeZone(PunishmentTableService[571]));
            calendar.setTime((Date)targetObj);
            w2.q = (int)(w2.LiteBansModule_31(true) - calendar.getTimeInMillis());
            String string = LiteBansModule_337.BaseCoreGenericHandler();
            String string2 = LiteBansModule_337.LiteBansModule_31();
            String string3 = PunishmentTableService[572];
            Object resultObj = BansHandler_2.i;
            String[] args = (String[])PunishmentTableService[573];
            ResultSet resultSet = LiteBansModule_185.c(ch2.c(SQLiteDriverHandler.AsyncBackgroundTask_5(SQLiteDriverHandler.BaseCoreGenericHandler(SQLiteDriverHandler.e(PunishmentTableService[574] + args + PunishmentTableService[575] + resultObj), (Number)1))));
            if (resultSet.next()) {
                w2.BroadcastService = resultSet.getInt(PunishmentTableService[576]) > 0;
                w2.DatabaseMonitorService = resultSet.getString(PunishmentTableService[577]);
                if (!ObjectUtilities.BaseCoreGenericHandler((Object)string2, (Object)resultSet.getString(PunishmentTableService[578]))) {
                    resultObj = BansHandler_2.i;
                    LiteBansModule_185.LiteBansModule_31(ch2.c(SQLiteDriverHandler.AsyncBackgroundTask_5(SQLiteDriverHandler.c(SQLiteDriverHandler.e(PunishmentTableService[579] + resultObj), PunishmentTableService[580] + string + PunishmentTableService[581] + string2 + '\''))));
                }
            } else {
                boolean flag3;
                char c;
                int n;
                resultObj = BansHandler_2.i;
                args = PunishmentTableService[582];
                LiteBansModule_83 ch3 = ch2;
                flag = false;
                Object helperObj = args;
                char c10 = ',';
                String[] filteredArgs = helperObj;
                for (n = 0; n < filteredArgs.length(); ++n) {
                    char c11 = c = filteredArgs.charAt(n);
                    flag3 = false;
                    if (!(c11 == c10)) continue;
                    ++n2;
                }
                int n3 = n2;
                helperObj = PunishmentTableService[583];
                if (n3 > 0) {
                    StringBuilder stringBuilder = new StringBuilder(n3 * 2);
                    Iterable iterable = new LiteBansModule_167(0, n3);
                    Iterator iterator = iterable.iterator();
                    while (iterator.hasNext()) {
                        n = n2 = ((LiteBansModule_291)iterator).LiteBansModule_31();
                        c = '\u0000';
                        stringBuilder.append(PunishmentTableService[584]);
                    }
                    helperObj = StringUtilities.LiteBansModule_31(stringBuilder.toString(), 1);
                }
                Object tempObj = resultObj;
                flag4 = false;
                resultObj = ch3.c(SQLiteDriverHandler.AsyncBackgroundTask_5(SQLiteDriverHandler.e(PunishmentTableService[585] + tempObj + '(' + args + PunishmentTableService[586] + helperObj + ')')));
                args = new String[]{string, string2, string3};
                flag = false;
                tempObj = helperObj = resultObj;
                flag4 = false;
                filteredArgs = args;
                flag5 = false;
                n = filteredArgs.length;
                for (n2 = 0; n2 < n; ++n2) {
                    String string4;
                    String string5 = string4 = filteredArgs[n2];
                    flag3 = false;
                    ((LiteBansModule_60)resultObj).BaseCoreGenericHandler(string5);
                }
                LiteBansModule_185.LiteBansModule_31((LiteBansModule_60)helperObj);
            }
        }
        catch (Exception exception) {
            w2.BaseCoreGenericHandler(exception);
        }
        if (w2.PunishmentTableService().LiteBansModule_195().e() > 0 && !w2.BroadcastService) {
            contextObj = ch2.e().HoverTextFormatter();
            targetObj = MessageKey.LiteBansModule_118;
            ChatFormatter.BaseCoreGenericHandler(MessageHandler.BaseCoreGenericHandler, (CommandSenderWrapper)contextObj, (CharSequence)targetObj, null, 4, null);
        }
        return KotlinUnitHandler.BaseCoreGenericHandler;
    }

    public static final /* synthetic */ String GnuSparseMapHandler() {
        return i;
    }

    public static final /* synthetic */ String g() {
        return LiteBansModule_435;
    }

    public static final /* synthetic */ String DatabaseMonitorService() {
        return LiteBansModule_241;
    }

    static {
        c = 3000;
        litebans.DatabaseMonitorService.r();
        CommandThrottleService = new SQLiteDriverHandler_2(null);
        i = PunishmentTableService[587] + LiteBansModule_426.class.getName() + PunishmentTableService[588];
        LiteBansModule_435 = PunishmentTableService[589] + LiteBansModule_418.class.getName() + PunishmentTableService[590];
        LiteBansModule_241 = PunishmentTableService[591] + LiteBansModule_60.class.getName() + '.';
    }

    private static final void r() {
        PunishmentTableService = new String[]{"UTC", "Database is slow! Establishing connection took ", " ", ".version", "SHA-512", "\u0001", "", "sort", "00", "01:", "Table upgrade checks ", "Connection is closed. Only open connections can be used to upgrade ", "", ":(?!(//))", "{}", "", "Interrupted during connection acquisition", "Unfortunately, BaseCoreGenericHandler request has failed because your database server did not respond within ", " seconds. (Socket timeout)", "An unexpected database error has ", "max_connections InitializerHandler_3 config.yml is smaller than 5 (max=", ")! This can cause connection pool exhaustion (\"Connection is not available, request timed out ...\") + ", "Unknown column '", "' InitializerHandler_3 '", "Column '", "' not ", ": Column \"", "\" not found", "ALTER command denied to user ", "WARNING: config.yml was not loaded successfully, errors were encountered. Check startup logs for more ", "LiteBansModule_244", "The database is read only", "[!!!] Database is read-only. This indicates that LiteBans does not have write access to its own database!", "Exception InitializerHandler_3 exception handler", "Original exception:", "useSSL=false", "Database SSL connection support is disabled. Enabling SSL should fix this ", "Change \"useSSL=false\" to \"useSSL=true\" InitializerHandler_3 config.yml, and then run \"litebans reload\" + ", "Your database user (", ") is lacking ALTER permission for the ", " database!", "Without this permission, LiteBans cannot upgrade the ", "Please add the necessary permissions!", "The required permissions are SELECT, CREATE, INSERT, UPDATE, DELETE, ALTER, ", "Executing full upgrade check InitializerHandler_3 response to 'Unknown column' ", "litebans", "[!!!] An 'unknown column' exception likely indicates that tables could not be upgraded successfully - consider the following exception CommandExitException BaseCoreGenericHandler consequence of BaseCoreGenericHandler startup error, not the original ", "", "**Connection pool exhaustion detected** (open=", ", max=", ", logins=", "There have been ", " API calls to prepareStatement() + ", "Be aware that plugins which use the LiteBans API incorrectly can create BaseCoreGenericHandler connection leak, which inevitably leads to exhaustion after ", " connections have been ", "Plugin(AsyncBackgroundTask_21) which may be using LiteBans API: [", ", ", "Loading: ", "> ", ".jar", ".jar", "lib", ".jar", ".jar", "Download URL for ", ": ", "Downloading ", ".. + ", "Failed to download ", "Downloaded ", " ", "Something ", "What happened?", "Loaded ", "Failed to load ", "Attempting to recover from this error.. + ", "File removed: ", "Failed to load from ", "*", "SELECT ", " FROM ", "SQLiteDriverHandler_4", "name", "uuid", "[Sync] Server limit reached (", " servers). Resetting server ", "DROP TABLE ", "Main server thread is not permitted to perform database ", "", "Interrupted during connection", "SQLSTATE(08S01)", "Socket closed", "Connection is closed", "closed connection", "LiteBansModule_244", "SQLiteDriverHandler_4", "", "pgsql", "LiteBansModule_244", " SMALLINT NOT NULL", " TINYINT", " NOT NULL", "LiteBansModule_31", "pgsql", " BYTEA NOT NULL", "BINARY", "BLOB", ")NOT NULL", "SQLiteDriverHandler_4", "PRIMARY KEY(", "SQLiteDriverHandler_4", "sqlite", " INTEGER PRIMARY KEY AUTOINCREMENT", " SERIAL", "version", "", " NOT NULL", " VARCHAR(", " VARCHAR(", "build", "", " NOT NULL", " VARCHAR(", " VARCHAR(", "timezone", " DEFAULT '+00:00'", " NOT NULL", " VARCHAR(", " VARCHAR(", "accept", " DEFAULT 0", "pgsql", "LiteBansModule_244", " SMALLINT NOT NULL", " TINYINT", " NOT NULL", "SQLiteDriverHandler_4", "PRIMARY KEY(", "SQLiteDriverHandler_4", "sqlite", " INTEGER PRIMARY KEY AUTOINCREMENT", " SERIAL", "date", " DEFAULT CURRENT_TIMESTAMP", " TIMESTAMP", "name", "", " VARCHAR(", " VARCHAR(", "uuid", "", " VARCHAR(", " VARCHAR(", "ip", "", " VARCHAR(", " VARCHAR(", "SQLiteDriverHandler_4", "PRIMARY KEY(", "SQLiteDriverHandler_4", "sqlite", " INTEGER PRIMARY KEY AUTOINCREMENT", " SERIAL", "name", "", " NOT NULL", " VARCHAR(", " VARCHAR(", "uuid", "", " NOT NULL", " VARCHAR(", " VARCHAR(", "date", " DEFAULT CURRENT_TIMESTAMP", " TIMESTAMP", "SQLiteDriverHandler_4", "PRIMARY KEY(", "SQLiteDriverHandler_4", "sqlite", " INTEGER PRIMARY KEY AUTOINCREMENT", " SERIAL", "info", " INT", " NOT NULL", "msg", "", " NOT NULL", " VARCHAR(", " VARCHAR(", "time", " DEFAULT CURRENT_TIMESTAMP", " TIMESTAMP", "SQLiteDriverHandler_4", "PRIMARY KEY(", "SQLiteDriverHandler_4", "", "pgsql", "LiteBansModule_244", " SMALLINT NOT NULL", " TINYINT", " NOT NULL", "LiteBansModule_31", "pgsql", " BYTEA NOT NULL", "BINARY", "BLOB", ")NOT NULL", "SQLiteDriverHandler_4", "PRIMARY KEY(", "SQLiteDriverHandler_4", "sqlite", " INTEGER PRIMARY KEY AUTOINCREMENT", " SERIAL", "version", "", " NOT NULL", " VARCHAR(", " VARCHAR(", "build", "", " NOT NULL", " VARCHAR(", " VARCHAR(", "timezone", " DEFAULT '+00:00'", " NOT NULL", " VARCHAR(", " VARCHAR(", "accept", " DEFAULT 0", "pgsql", "LiteBansModule_244", " SMALLINT NOT NULL", " TINYINT", " NOT NULL", "SQLiteDriverHandler_4", "PRIMARY KEY(", "SQLiteDriverHandler_4", "sqlite", " INTEGER PRIMARY KEY AUTOINCREMENT", " SERIAL", "uuid", "pgsql", " BYTEA NOT NULL", "BINARY", ")NOT NULL", "type", "", "pgsql", "LiteBansModule_244", " SMALLINT NOT NULL", " TINYINT", " NOT NULL", "SQLiteDriverHandler_4", "PRIMARY KEY(", "Database connection fully initialized (", " ms) + ", "SQLiteDriverHandler_4", "sqlite", " INTEGER PRIMARY KEY AUTOINCREMENT", " SERIAL", "date", " DEFAULT CURRENT_TIMESTAMP", " TIMESTAMP", "name", "", " VARCHAR(", " VARCHAR(", "uuid", "", " VARCHAR(", " VARCHAR(", "ip", "", " VARCHAR(", " VARCHAR(", "SQLiteDriverHandler_4", "PRIMARY KEY(", "SQLiteDriverHandler_4", "sqlite", " INTEGER PRIMARY KEY AUTOINCREMENT", " SERIAL", "name", "", " NOT NULL", " VARCHAR(", " VARCHAR(", "uuid", "", " NOT NULL", " VARCHAR(", " VARCHAR(", "date", " DEFAULT CURRENT_TIMESTAMP", " TIMESTAMP", "SQLiteDriverHandler_4", "PRIMARY KEY(", "SQLiteDriverHandler_4", "sqlite", " INTEGER PRIMARY KEY AUTOINCREMENT", " SERIAL", "info", " INT", " NOT NULL", "msg", "", " NOT NULL", " VARCHAR(", " VARCHAR(", "time", " DEFAULT CURRENT_TIMESTAMP", " TIMESTAMP", "SQLiteDriverHandler_4", "PRIMARY KEY(", "SQLiteDriverHandler_4", "", "pgsql", "LiteBansModule_244", " SMALLINT NOT NULL", " TINYINT", " NOT NULL", "LiteBansModule_31", "pgsql", " BYTEA NOT NULL", "BINARY", "BLOB", ")NOT NULL", "SQLiteDriverHandler_4", "PRIMARY KEY(", "SQLiteDriverHandler_4", "sqlite", " INTEGER PRIMARY KEY AUTOINCREMENT", " SERIAL", "version", "", " NOT NULL", " VARCHAR(", " VARCHAR(", "build", "", " NOT NULL", " VARCHAR(", " VARCHAR(", "timezone", " DEFAULT '+00:00'", " NOT NULL", " VARCHAR(", " VARCHAR(", "accept", " DEFAULT 0", "pgsql", "LiteBansModule_244", " SMALLINT NOT NULL", " TINYINT", " NOT NULL", "SQLiteDriverHandler_4", "PRIMARY KEY(", "SQLiteDriverHandler_4", "sqlite", " INTEGER PRIMARY KEY AUTOINCREMENT", " SERIAL", "uuid", "pgsql", " BYTEA NOT NULL", "BINARY", ")NOT NULL", "type", "", "pgsql", "LiteBansModule_244", " SMALLINT NOT NULL", " TINYINT", " NOT NULL", "SQLiteDriverHandler_4", "PRIMARY KEY(", "*", "SELECT ", " FROM ", "uuid=?", "Failed ", " WHERE ", "name,uuid", "?", "?,", "INSERT INTO ", ")VALUES(", "name", "[Sync] Updating stored server name: \"", "\" -> \"", "UPDATE ", "name=?", "uuid=?", "Failed ", " WHERE ", "UPDATE ", "server_scope=?", "server_scope=?", "Failed ", " WHERE ", "UPDATE ", "server_origin=?", "server_origin=?", "Failed ", " WHERE ", "[Sync] Server limit reached (", " servers). Resetting server ", "DROP TABLE ", "sqlite", "Unknown SQL driver '", "'. Please use one of these drivers: ", "LiteBansModule_244", "sqlite", ":3306", "pgsql", "postgresql", ":5432", "sqlite", "LiteBansModule_244", "pgsql", "litebans", "litebans.sqlite", "postgresql", "jdbc:", "://", "LiteBansModule_244", "useSSL=false", "useSSL=false&serverTimezone=UTC", "sqlite", "?useSSL=", ";useSSL=", "LiteBansModule_244", ";TRACE_LEVEL_FILE=0;TRACE_LEVEL_SYSTEM_OUT=0", "pgsql", "postgresql", "Connecting to database.. + ", "litebans-pool", "user", "password", "connectTimeout", "socketTimeout", "timezone", "UTC", "utf-8", "utf8mb4_unicode_ci", "useUnicode", "true", "characterEncoding", "characterSetResults", "connectionCollation", "cachePrepStmts", "true", "useServerPrepStmts", "cacheResultSetMetadata", "cacheServerConfiguration", "elideSetAutoCommits", "useLocalSessionState", "useLocalTransactionState", "true", "maintainTimeStats", "alwaysSendSetIsolation", "false", "sqlite", "SELECT 1", "LiteBansModule_244", "SET IGNORECASE TRUE", "", "Failed to connect to [", "] + ", "LiteBansModule_244", "[!!] No username and password has been provided InitializerHandler_3 the configuration!", "Error: ", "", "", "Connection is not available, request timed out", "The driver has not received any packets from the ", "", "Unknown host: ", "Communications link failure", "Error: ", "", "Access denied for user", "Public Key Retrieval is not allowed", "Connected to [", "] successfully (", " ms) + ", "Connected to ", " database successfully (", " ms) + ", "LiteBansModule_244", "LiteBansModule_244.yml", "LiteBansModule_244.json", "user", "password", "[!] Access to the database \"", "\" was ", "[!] Ensure that the database \"", "\" has been created and that you have granted permission to access this ", "litebans", "[!!] Your database is named \"litebans\"; this is the default database name. Ensure that you have defined the correct database ", ":3306", "pgsql", "postgresql", ":5432", ":3306", "pgsql", "postgresql", ":5432", "", "", "SELECT @@version", "", "template", "ipban_wildcard", "uuid", "ip", "banned_by_uuid", "time", "until", "ipban", StringDecryptor.BaseCoreGenericHandler("\u2bb3\u2bb1\u2ba6\u2bbb\u2ba4\u2bb7", 0x22DD2BD2), "uuid", "name", "ip", "CONSOLE", "CONSOLE", "#", "", "SELECT @@version", "", "template", "ipban_wildcard", "uuid", "ip", "banned_by_uuid", "time", "until", "ipban", "active", "uuid", "name", "ip", "CREATE INDEX IF NOT EXISTS", "", "", "", "CREATE INDEX", " idx_", " ON ", " (", "", "", "SELECT @@version", "", "template", "ipban_wildcard", "uuid", "ip", "banned_by_uuid", "time", "until", "ipban", "active", "uuid", "name", "ip", "CONSOLE", "CONSOLE", "#", "SELECT NOW() CommandExitException now", "now", "UTC", "UTC", "*", "SELECT ", " FROM ", "accept", "timezone", "build", "UPDATE ", "version='", "',build='", "version,build,timezone", "?", "?,", "INSERT INTO ", ")VALUES(", "LiteBansModule_21 ", ".executeQuery(", "LiteBansModule_21 ", ".executeQuery(", "LiteBansModule_21 "};
    }
}
}
