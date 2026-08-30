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
    private final LiteBansModule_161 ServerSyncService = ProxyConnection.BaseCoreGenericHandler(() -> DatabaseMonitorService.BaseCoreGenericHandler(this));
    private final LiteBansModule_161 AsyncBackgroundTask_21 = ProxyConnection.BaseCoreGenericHandler(() -> DatabaseMonitorService.LiteBansModule_31(this));
    private ProxyPreparedStatement z;
    private LiteBansModule_15 HoverTextFormatter;
    private HashMap Utf8Handler_2;
    private AtomicLong AsyncBackgroundTask_22;
    private final AtomicBoolean AsyncBackgroundTask_5;
    private final AtomicBoolean LiteBansModule_401;
    private final AtomicBoolean GnuSparseMapHandler;
    private boolean e;
    private boolean LiteBansModule_194;
    private boolean BroadcastService;
    private byte A;
    private long n;
    private long m;
    private int r;
    private String DatabaseMonitorService;
    private int q;
    public static final int c;
    private static final String i;
    private static final String LiteBansModule_433;
    private static final String LiteBansModule_240;
    public DatabaseMonitorService(@NotNull PlatformPlugin plugin) {
        super(plugin);
        this.z = new ProxyPreparedStatement(plugin);
        this.Utf8Handler_2 = new HashMap();
        this.AsyncBackgroundTask_22 = new AtomicLong(0L);
        this.AsyncBackgroundTask_5 = new AtomicBoolean();
        this.LiteBansModule_401 = new AtomicBoolean();
        this.GnuSparseMapHandler = new AtomicBoolean();
        this.e = true;
        this.DatabaseMonitorService = "UTC";
    }

    public final HikariDataSource HoverTextFormatter() {
        return this.LiteBansModule_31;
    }

    public final ConfigService PunishmentTableService() {
        LiteBansModule_161 eE2 = this.ServerSyncService;
        return (ConfigService)eE2.BaseCoreGenericHandler();
    }

    public final BroadcastService Utf8Handler_2() {
        LiteBansModule_161 eE2 = this.AsyncBackgroundTask_21;
        return (BroadcastService)eE2.BaseCoreGenericHandler();
    }

    public final LiteBansModule_15 LiteBansModule_401() {
        return this.HoverTextFormatter;
    }

    public final String ServerSyncService() {
        LiteBansModule_15 aK2 = this.HoverTextFormatter;
        if (aK2 == null) {
            return this.PunishmentTableService().LiteBansModule_194().LiteBansModule_25();
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
        this.LiteBansModule_194 = flag;
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
            var3_2 = null;
            try {
                var4_3 = this.LiteBansModule_31;
                var5_8 = false;
                if (var4_3 == null) ** GOTO lbl-1000
                var6_10 = var4_3;
                var7_12 = false;
                if (var6_10.LiteBansModule_31() == false) {
                    v0 = var4_3.getConnection();
                } else lbl-1000:
                // 2 sources

                {
                    v0 = null;
                }
                var3_2 = v0;
                var4_4 = System.nanoTime() - v1;
            }
            catch (SQLException v4) {
                this.plugin(v4);
                break block9;
            }
            finally {
                var4_6 = System.nanoTime() - v1;
                if (var4_6 > 1000000000L) {
                    // empty if block
                }
            }
            if (var4_4 > 1000000000L && var3_2 != null && !this.LiteBansModule_240() && (var6_11 = (int)((double)var4_4 / 1.0E9)) > 12) {
                this.plugin.getLogger().warning(litebans + "Database is slow! Establishing connection took " + var6_11 + litebans + " seconds.");
            }
        }
        return var3_2;
    }

    public final String BaseCoreGenericHandler(@NotNull CommandSenderWrapper sender) {
        String string;
        byte by2 = this.plugin.AsyncBackgroundTask_22();
        if (by2 == 0 || by2 == 3) {
            string = null;
        } else if (by2 == 1 || by2 == 2) {
            string = sender.LiteBansModule_240();
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
        if (!this.PunishmentTableService().LiteBansModule_194().aS()) return false;
        LiteBansModule_15 aK2 = this.HoverTextFormatter;
        if (aK2 == null) return false;
        if (!aK2.LiteBansModule_31()) return false;
        return true;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final boolean BaseCoreGenericHandler(@NotNull LiteBansModule_82 ch2, @Nullable SQLiteDriverHandler_5 jr_02, boolean flag, boolean flag2) {
        Object object;
        ConfigService configService = (ConfigService)this.plugin.BaseCoreGenericHandler(ConfigService.class);
        Object object2 = this.plugin.getDataFolder();
        String string = ".version";
        boolean flag3 = false;
        File file = new File((File)object2, string);
        object2 = null;
        object2 = String.valueOf(litebans.DatabaseMonitorService.BaseCoreGenericHandler(this, false, 1, null));
        boolean flag4 = false;
        flag3 = !file.exists();
        try {
            object = LiteBansModule_112.BaseCoreGenericHandler(file);
            int n = 128;
            Object object3 = LiteBansModule_344.LiteBansModule_31;
            Object object4 = object;
            object4 = new InputStreamReader((InputStream)new FileInputStream((File)object4), (Charset)object3);
            object = object4 instanceof BufferedReader ? (BufferedReader)object4 : new BufferedReader((Reader)object4, n);
            object3 = null;
            try {
                Object object5 = (BufferedReader)object;
                boolean flag5 = false;
                String string2 = ((BufferedReader)object5).readLine();
                DiscordWebhookClient eG2 = configService.LiteBansModule_194();
                try {
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA-512");
                    if (messageDigest != null) {
                        messageDigest.reset();
                        Object[] objectArray = new String[]{LiteBansModule_336.LiteBansModule_31(), eG2.ElementsHandler(), eG2.q(), eG2.aW(), eG2.LiteBansModule_6(), eG2.DatabaseMonitorService(), eG2.AsyncBackgroundTask_5()};
                        String string3 = ArrayUtilities.BaseCoreGenericHandler(objectArray, (CharSequence)"\u0001", null, null, 0, null, null, 62, null);
                        objectArray = messageDigest.digest(string3.getBytes(LiteBansModule_344.LiteBansModule_31));
                        messageDigest.reset();
                        object2 = LiteBansModule_228.BaseCoreGenericHandler((byte[])objectArray, false);
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
                    boolean flag6 = false;
                    if (ObjectUtilities.BaseCoreGenericHandler((Object)string5, (Object)"sort")) {
                        String[] filteredArgs = new String[]{"00"};
                        args = filteredArgs;
                    } else {
                        String[] parsedArgs = new String[]{"01:" + string5};
                        args = parsedArgs;
                    }
                    String[] cmdArgs = args;
                    new LiteBansModule_403(configService, Arrays.copyOf(cmdArgs, cmdArgs.length)).LiteBansModule_31();
                }
                if (ObjectUtilities.BaseCoreGenericHandler(object2, (Object)string2) && !flag) {
                    configService.BaseCoreGenericHandler(2, (Object)"Table upgrade checks ");
                    boolean flag7 = true;
                    return flag7;
                }
                object5 = KotlinUnitHandler.BaseCoreGenericHandler;
            }
            catch (Throwable throwable) {
                object3 = throwable;
                throw throwable;
            }
            finally {
                BlockHandler.BaseCoreGenericHandler((Closeable)object, (Throwable)object3);
            }
        }
        catch (Exception exception) {
            this.plugin(exception);
            flag4 = true;
        }
        if (jr_02 != null) {
            if (!ch2.BaseCoreGenericHandler()) {
                boolean flag8 = false;
                String string6 = "Connection is closed. Only open connections can be used to upgrade ";
                throw new IllegalArgumentException(string6.toString());
            }
            try {
                ObjectUtilities.LiteBansModule_31(ch2, "");
                object = (SQLiteDriverHandler_3)ch2;
                ObjectUtilities.BaseCoreGenericHandler(configService);
                ((SQLiteDriverHandler_3)object).BaseCoreGenericHandler(flag2, configService, jr_02, flag3);
            }
            catch (Throwable throwable) {
                this.plugin(throwable);
                flag4 = true;
            }
            if (!flag4) {
                try {
                    LiteBansModule_373.BaseCoreGenericHandler(file, (String)object2, null, 2, null);
                }
                catch (Throwable throwable) {
                    this.plugin(throwable);
                }
            }
        }
        return false;
    }

    public static /* synthetic */ boolean BaseCoreGenericHandler(DatabaseMonitorService w2, LiteBansModule_82 ch2, SQLiteDriverHandler_5 jr_02, boolean flag, boolean flag2, int n, Object object) {
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
            Object object;
            block13: {
                boolean flag2 = false;
                object = this;
                flag = false;
                AsyncBackgroundTask_21 s2 = (AsyncBackgroundTask_21)((DatabaseMonitorService)object).BaseCoreGenericHandler.BaseCoreGenericHandler(AsyncBackgroundTask_21.class);
                if (!((Collection)s2.BaseCoreGenericHandler()).isEmpty()) {
                    DatabaseMonitorService w2 = object;
                    boolean flag3 = false;
                    try {
                        LiteBansModule_82 ch2 = w2.LiteBansModule_194();
                        Closeable closeable = ch2;
                        Throwable throwable = null;
                        try {
                            Object object2 = (LiteBansModule_82)closeable;
                            boolean flag4 = false;
                            LiteBansModule_82 ch3 = ch2;
                            boolean flag5 = false;
                            Iterable iterable = s2.BaseCoreGenericHandler();
                            boolean flag6 = false;
                            for (Object t2 : iterable) {
                                LiteBansModule_95 cp_02 = (LiteBansModule_95)t2;
                                boolean flag7 = false;
                                AllHandler_3.BaseCoreGenericHandler(ch3, cp_02.c(), cp_02.g(), cp_02.LiteBansModule_31(), false, false, 24, null);
                            }
                            object2 = KotlinUnitHandler.BaseCoreGenericHandler;
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
            object = this.AsyncBackgroundTask_5;
            flag = false;
            ((AtomicBoolean)object).set(false);
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

    public final LiteBansModule_386 c(@NotNull LiteBansModule_60 bT2) {
        this.z.BaseCoreGenericHandler(bT2);
        return LiteBansModule_397.BaseCoreGenericHandler();
    }

    public final List LiteBansModule_31(@NotNull ConfigService configService) {
        DiscordWebhookClient eG2 = configService.LiteBansModule_194();
        String[] args = eG2.aV();
        boolean flag = false;
        String[] filteredArgs = args;
        Collection collection = new ArrayList(args.length);
        boolean flag2 = false;
        int n = filteredArgs.length;
        for (int i = 0; i < n; ++i) {
            String string;
            String string2 = string = filteredArgs[i];
            Collection collection2 = collection;
            boolean flag3 = false;
            Object object = string2;
            Object object2 = new NativepatternHandler(":(?!(//))");
            int n2 = 5;
            object = ((NativepatternHandler)object2).BaseCoreGenericHandler((CharSequence)object, n2);
            boolean flag4 = false;
            Object object3 = object;
            Object[] objectArray = object3.toArray(new String[0]);
            object = (String)ArrayUtilities.BaseCoreGenericHandler(objectArray, 2);
            object2 = (String)ArrayUtilities.BaseCoreGenericHandler(objectArray, 3);
            if (object2 != null) {
                Object object4 = object;
                object = object4 != null ? StringUtilities.BaseCoreGenericHandler((String)object4, PunishmentTableService[14], (String)object2, false, 4, null) : null;
            }
            object3 = (String)ArrayUtilities.BaseCoreGenericHandler(objectArray, 4);
            Object object5 = objectArray[0];
            collection2.add(new JarHandler(((String)object5).toLowerCase(Locale.ENGLISH), (String)objectArray[1], (String)object, (String)object2, (String)object3));
        }
        return (List)collection;
    }

    public final LiteBansModule_15 BaseCoreGenericHandler(@NotNull LiteBansModule_82 ch2, int n, boolean flag) {
        LiteBansModule_15 aK2 = (LiteBansModule_15)this.Utf8Handler_2.get(n);
        if (aK2 == null && flag) {
            litebans.DatabaseMonitorService.BaseCoreGenericHandler(this, ch2, false, 2, null);
            return this.plugin(ch2, n, false);
        }
        return aK2;
    }

    public final boolean BaseCoreGenericHandler(int n) {
        int n2 = this.PunishmentTableService().LiteBansModule_194().LiteBansModule_5();
        DatabaseMonitorService w2 = this;
        boolean flag = false;
        Object object = w2.HoverTextFormatter();
        return (object != null && (object = ((HikariDataSource)object).BaseCoreGenericHandler()) != null ? object.e() : 0) >= n2 - n && n2 >= 3;
    }

    public static /* synthetic */ boolean BaseCoreGenericHandler(DatabaseMonitorService w2, int n, int n2, Object object) {
        if ((n2 & 1) != 0) {
            n = 1;
        }
        return w2.BaseCoreGenericHandler(n);
    }

    public final void BaseCoreGenericHandler(@NotNull Throwable throwable) {
        try {
            Object object;
            String string;
            ConfigService configService = (ConfigService)this.plugin.BaseCoreGenericHandler(ConfigService.class);
            String string2 = throwable.getMessage();
            if (string2 == null) {
                string2 = string = PunishmentTableService[15];
            }
            if (throwable instanceof LiteBansException_9) {
                PluginModule module = this;
                boolean flag = false;
                module.BaseCoreGenericHandler.getLogger().severe(string);
                return;
            }
            if (throwable instanceof LiteBansException_4) {
                object = configService;
                boolean flag = false;
                if (ObjectUtilities.BaseCoreGenericHandler(LiteBansModule_253.BaseCoreGenericHandler((ConfigService)object), (Object)MessageKey.BaseCoreGenericHandler(object, false, true))) {
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
            object = new StringWriter();
            throwable.printStackTrace(new PrintWriter((Writer)object));
            String string3 = ((StringWriter)object).toString();
            boolean flag = false;
            if (throwable instanceof SQLException) {
                boolean flag2;
                String string4;
                PluginModule n_03;
                int n;
                Object object2;
                Object object3;
                Throwable throwable2 = throwable;
                int n2 = 4;
                while (n2-- > 0 && throwable2.getCause() != null) {
                }
                if (throwable2 instanceof SocketTimeoutException || throwable instanceof SQLTransientConnectionException && this.GnuSparseMapHandler.get()) {
                    this.GnuSparseMapHandler.set(true);
                    flag = true;
                    object3 = this;
                    object2 = PunishmentTableService[17] + LiteBansModule_287.LiteBansModule_31((double)configService.LiteBansModule_194().Y() / 1000.0) + PunishmentTableService[18];
                    n = 0;
                    ((PluginModule)object3).BaseCoreGenericHandler.getLogger().severe((String)object2);
                } else {
                    object3 = this;
                    object2 = PunishmentTableService[19];
                    n = 0;
                    ((PluginModule)object3).BaseCoreGenericHandler.getLogger().severe((String)object2);
                }
                object3 = configService.LiteBansModule_194().ElementsHandler();
                object2 = this.plugin.LiteBansModule_240().LiteBansModule_31();
                n = configService.LiteBansModule_194().LiteBansModule_5();
                if (n < 5) {
                    n_03 = this;
                    string4 = PunishmentTableService[20] + n + PunishmentTableService[21];
                    flag2 = false;
                    n_03.BaseCoreGenericHandler.getLogger().warning(string4);
                }
                if (throwable instanceof SQLTransientConnectionException && !this.GnuSparseMapHandler.get() && this.LiteBansModule_240()) {
                    this.LiteBansModule_433();
                }
                if (StringUtilities.BaseCoreGenericHandler((CharSequence)string3, (CharSequence)PunishmentTableService[22], false, 2, null) && StringUtilities.BaseCoreGenericHandler((CharSequence)string3, (CharSequence)PunishmentTableService[23], false, 2, null) || StringUtilities.BaseCoreGenericHandler((CharSequence)string3, (CharSequence)PunishmentTableService[24], false, 2, null) && StringUtilities.BaseCoreGenericHandler((CharSequence)string3, (CharSequence)PunishmentTableService[25], false, 2, null) || StringUtilities.BaseCoreGenericHandler((CharSequence)string3, (CharSequence)PunishmentTableService[26], false, 2, null) && StringUtilities.BaseCoreGenericHandler((CharSequence)string3, (CharSequence)PunishmentTableService[27], false, 2, null)) {
                    this.q();
                }
                if (StringUtilities.BaseCoreGenericHandler((CharSequence)string3, (CharSequence)PunishmentTableService[28], false, 2, null)) {
                    this.AsyncBackgroundTask_5();
                    return;
                }
                if (object2 != null) {
                    n_03 = this;
                    string4 = PunishmentTableService[29];
                    flag2 = false;
                    n_03.BaseCoreGenericHandler.getLogger().severe(string4);
                } else if (ObjectUtilities.BaseCoreGenericHandler(object3, (Object)PunishmentTableService[30]) && StringUtilities.BaseCoreGenericHandler((CharSequence)string3, (CharSequence)PunishmentTableService[31], false, 2, null)) {
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
            boolean flag = false;
            n_04.BaseCoreGenericHandler.getLogger().severe(string);
            throwable3.printStackTrace();
            n_04 = this;
            string = PunishmentTableService[34];
            flag = false;
            n_04.BaseCoreGenericHandler.getLogger().severe(string);
            throwable.printStackTrace();
        }
    }

    private final boolean LiteBansModule_240() {
        DatabaseMonitorService w2 = this;
        boolean flag = false;
        Object object = w2.HoverTextFormatter();
        return (object != null && (object = ((HikariDataSource)object).BaseCoreGenericHandler()) != null ? object.e() : 0) >= this.PunishmentTableService().LiteBansModule_194().LiteBansModule_5();
    }

    private final void z() {
        if (StringUtilities.BaseCoreGenericHandler((CharSequence)this.PunishmentTableService().LiteBansModule_194().aN(), (CharSequence)PunishmentTableService[35], false, 2, null)) {
            PluginModule module = this;
            String string = PunishmentTableService[36];
            boolean flag = false;
            module.BaseCoreGenericHandler.getLogger().severe(string);
            module = this;
            string = PunishmentTableService[37];
            flag = false;
            module.BaseCoreGenericHandler.getLogger().severe(string);
        }
    }

    private final void AsyncBackgroundTask_5() {
        PluginModule module = this;
        String string = PunishmentTableService[38] + this.PunishmentTableService().LiteBansModule_194().aW() + PunishmentTableService[39] + this.PunishmentTableService().LiteBansModule_194().DatabaseMonitorService() + PunishmentTableService[40];
        boolean flag = false;
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
        Object object = this.LiteBansModule_401;
        boolean flag = false;
        if (((AtomicBoolean)object).compareAndSet(false, true)) {
            object = this;
            String string = PunishmentTableService[44];
            boolean flag2 = false;
            ((PluginModule)object).BaseCoreGenericHandler.getLogger().warning(string);
            Object object2 = object = (LiteBansCommand)this.plugin.z().BaseCoreGenericHandler(PunishmentTableService[45]);
            if (object2 != null) {
                ((LiteBansCommand)object2).LiteBansModule_31(this.plugin.HoverTextFormatter());
            }
        } else {
            object = this;
            String string = PunishmentTableService[46];
            boolean flag3 = false;
            ((PluginModule)object).BaseCoreGenericHandler.getLogger().severe(string);
        }
    }

    private final void LiteBansModule_433() {
        ConfigService configService = (ConfigService)this.plugin.BaseCoreGenericHandler(ConfigService.class);
        AsyncBackgroundTask_21 s2 = (AsyncBackgroundTask_21)this.plugin.BaseCoreGenericHandler(AsyncBackgroundTask_21.class);
        int n = configService.LiteBansModule_194().LiteBansModule_5();
        DatabaseMonitorService w2 = this;
        boolean flag = false;
        Object object = w2.HoverTextFormatter();
        int n2 = object != null && (object = ((HikariDataSource)object).BaseCoreGenericHandler()) != null ? object.e() : 0;
        Database database = Database.get();
        ObjectUtilities.LiteBansModule_31(database, PunishmentTableService[47]);
        int n3 = ((DefaultHandler_2)database).c();
        LiteBansModule_161 eE2 = ProxyConnection.BaseCoreGenericHandler(() -> DatabaseMonitorService.AsyncBackgroundTask_5(this));
        int n4 = s2.BaseCoreGenericHandler().size();
        PluginModule module = this;
        String string = PunishmentTableService[48] + n2 + PunishmentTableService[49] + n + PunishmentTableService[50] + n4 + ')';
        boolean flag2 = false;
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
                boolean flag = false;
                this.PunishmentTableService().e();
                if (!this.LiteBansModule_194) break block7;
                return;
            }
            try {
                litebans.DatabaseMonitorService.BaseCoreGenericHandler(this, this.PunishmentTableService().LiteBansModule_194().ElementsHandler(), 0L, 2, null);
                new LiteBansModule_202(this.plugin).run();
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
        Object object;
        boolean flag5;
        Object object2;
        ConfigService configService = (ConfigService)this.plugin.BaseCoreGenericHandler(ConfigService.class);
        String string2 = jP2.AsyncBackgroundTask_5();
        Object object3 = this;
        String string3 = PunishmentTableService[57] + jP2;
        boolean flag6 = false;
        if (!((DatabaseMonitorService)object3).AsyncBackgroundTask_5.get()) {
            object2 = (PluginModule)object3;
            flag5 = false;
            ((PluginModule)object2).BaseCoreGenericHandler.getLogger().info(string3);
        }
        object3 = configService;
        boolean flag7 = false;
        if (((ConfigService)object3).g()) {
            String string4;
            PluginModule module = object3;
            flag6 = false;
            StringBuilder stringBuilder = new StringBuilder().append(PunishmentTableService[58]);
            object2 = jP2;
            flag5 = false;
            if (((JarHandler)object2).e() == null) {
                object = object2;
                flag4 = false;
                string4 = ((JarHandler)object).AsyncBackgroundTask_5() + PunishmentTableService[59];
            } else {
                int n = StringUtilities.LiteBansModule_31((CharSequence)((JarHandler)object2).e(), '/', 0, false, 6, null);
                if (n < 0 || n > ((JarHandler)object2).e().length() - 1) {
                    Object object4 = object2;
                    flag3 = false;
                    string4 = ((JarHandler)object4).AsyncBackgroundTask_5() + PunishmentTableService[60];
                } else {
                    string4 = ((JarHandler)object2).e().substring(n + 1);
                }
            }
            ((ConfigService)module).BaseCoreGenericHandler((Object)stringBuilder.append(string4).toString());
        }
        File file = this.plugin.getDataFolder();
        Object object5 = PunishmentTableService[61];
        boolean flag8 = false;
        object5 = object3 = LiteBansModule_112.c(new File(file, (String)object5));
        Object object6 = jP2;
        flag5 = false;
        if (((JarHandler)object6).e() == null) {
            object = object6;
            flag4 = false;
            string = ((JarHandler)object).AsyncBackgroundTask_5() + PunishmentTableService[62];
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
        file = new File((File)object5, (String)object6);
        try {
            object5 = null;
            try {
                object5 = this.plugin(jP2, file, flag2);
            }
            catch (LiteBansException_9 iv2) {
                this.plugin(iv2);
            }
            if (object5 == null && (object6 = jP2.e()) != null) {
                boolean bl9;
                PluginModule n_03 = this;
                Object object7 = PunishmentTableService[64] + string2 + PunishmentTableService[65] + (String)object6;
                boolean bl10 = false;
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
                    boolean bl11 = false;
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
            if (object5 == null) {
                try {
                    object5 = this.plugin(jP2, file, flag2);
                    if (object5 == null) {
                        object6 = this;
                        String string6 = PunishmentTableService[72];
                        boolean bl12 = false;
                        ((PluginModule)object6).BaseCoreGenericHandler.getLogger().severe(string6);
                        return null;
                    }
                    object6 = this;
                    String string7 = PunishmentTableService[73] + string2 + '!';
                    boolean bl13 = false;
                    if (!((DatabaseMonitorService)object6).AsyncBackgroundTask_5.get()) {
                        PluginModule n_07 = (PluginModule)object6;
                        boolean bl14 = false;
                        n_07.BaseCoreGenericHandler.getLogger().info(string7);
                    }
                }
                catch (Throwable throwable) {
                    PluginModule n_08 = this;
                    String string8 = PunishmentTableService[74] + jP2 + '.';
                    boolean bl15 = false;
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
            return object5;
        }
        catch (Exception exception) {
            object6 = this;
            String string9 = PunishmentTableService[77] + file + ':';
            boolean bl16 = false;
            if (!((DatabaseMonitorService)object6).AsyncBackgroundTask_5.get()) {
                PluginModule n_09 = (PluginModule)object6;
                flag3 = false;
                n_09.BaseCoreGenericHandler.getLogger().info(string9);
            }
            this.plugin(exception);
            return null;
        }
    }

    public static /* synthetic */ Object BaseCoreGenericHandler(DatabaseMonitorService w2, JarHandler jP2, boolean flag, boolean flag2, int n, Object object) {
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
    public final void BaseCoreGenericHandler(@NotNull LiteBansModule_82 v1, boolean v2) {
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

    public static /* synthetic */ void BaseCoreGenericHandler(DatabaseMonitorService w2, LiteBansModule_82 ch2, boolean flag, int n, Object object) {
        if ((n & 2) != 0) {
            flag = false;
        }
        w2.BaseCoreGenericHandler(ch2, flag);
    }

    public final LiteBansModule_82 LiteBansModule_194() {
        if (this.plugin.ServerSyncService() && this.plugin.n()) {
            throw new AssertionError((Object)PunishmentTableService[87]);
        }
        Connection connection = this.c();
        return connection == null || !this.m() || this.LiteBansModule_194 ? (LiteBansModule_82)new LiteBansModule_244(this.plugin) : (LiteBansModule_82)new SQLiteDriverHandler_3(this.plugin, connection);
    }

    public final void BaseCoreGenericHandler(@NotNull LiteBansModule_178 eo_02) {
        CommandSenderWrapper sender = (CommandSenderWrapper)MessageHandler.BaseCoreGenericHandler.LiteBansModule_31().get();
        if (sender == null) {
            sender = this.plugin.HoverTextFormatter();
        }
        CommandSenderWrapper jv_03 = sender;
        this.plugin.LiteBansModule_31(() -> DatabaseMonitorService.BaseCoreGenericHandler(jv_03, this, eo_02));
    }

    public final boolean LiteBansModule_31(@NotNull Throwable throwable) {
        String string = throwable.getMessage();
        if (string == null) {
            string = PunishmentTableService[88];
        }
        String string2 = string;
        PlatformPlugin plugin = this.plugin;
        boolean flag = false;
        PlatformPlugin di_03 = plugin;
        boolean flag2 = false;
        return (!di_03.isEnabled() || plugin.AsyncBackgroundTask_21()) && (StringUtilities.BaseCoreGenericHandler((CharSequence)string2, (CharSequence)PunishmentTableService[89], false, 2, null) || StringUtilities.BaseCoreGenericHandler((CharSequence)string2, (CharSequence)PunishmentTableService[90], false, 2, null) || StringUtilities.BaseCoreGenericHandler((CharSequence)string2, (CharSequence)PunishmentTableService[91], false, 2, null) || StringUtilities.BaseCoreGenericHandler((CharSequence)string2, (CharSequence)PunishmentTableService[92], false, 2, null) || StringUtilities.BaseCoreGenericHandler((CharSequence)string2, (CharSequence)PunishmentTableService[93], false, 2, null));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final void BaseCoreGenericHandler(long l3, boolean flag, boolean flag2, boolean flag3) {
        KotlinUnitHandler iv_02;
        DiscordWebhookClient eG2 = this.PunishmentTableService().LiteBansModule_194();
        Connection connection = this.c();
        if (connection != null) {
            AutoCloseable autoCloseable = connection;
            Throwable throwable = null;
            try {
                Object object = (Connection)autoCloseable;
                boolean flag4 = false;
                AutoCloseable autoCloseable2 = object.createStatement();
                Throwable throwable2 = null;
                try {
                    Object object2 = (Statement)autoCloseable2;
                    boolean flag5 = false;
                    Closeable closeable = new SQLiteDriverHandler_3(this.plugin, (Connection)object);
                    Throwable throwable3 = null;
                    try {
                        String string;
                        String string2;
                        boolean flag6;
                        String string3;
                        Object object3;
                        int n;
                        Object object4;
                        Object object5;
                        boolean flag7;
                        Iterator iterator;
                        byte by2;
                        Object object6;
                        Object object7 = (SQLiteDriverHandler_3)closeable;
                        boolean flag8 = false;
                        Object object8 = object7;
                        boolean bl9 = false;
                        Object object9 = ((SQLiteDriverHandler_3)object8).LiteBansModule_31();
                        boolean bl10 = CommandThrottleService.BaseCoreGenericHandler(eG2.ElementsHandler());
                        DatabaseMonitorService w2 = this;
                        SQLiteDriverHandler_3 gZ2 = object8;
                        ObjectUtilities.BaseCoreGenericHandler(object2);
                        Statement statement = object2;
                        boolean bl11 = false;
                        Statement statement2 = statement;
                        boolean bl12 = false;
                        if (flag) {
                            object6 = BansHandler_2.AsyncBackgroundTask_5.BaseCoreGenericHandler();
                            by2 = 0;
                            Iterator iterator2 = object6;
                            iterator = new ArrayList(CollectionUtilities.BaseCoreGenericHandler((Iterable)object6, 10));
                            flag7 = false;
                            object5 = iterator2.iterator();
                            while (object5.hasNext()) {
                                Object e = object5.next();
                                object4 = (BansHandler_2)e;
                                Iterator iterator3 = iterator;
                                n = 0;
                                iterator3.add(gZ2.BaseCoreGenericHandler((BansHandler_2)object4, (SQLiteDriverHandler_5)object9));
                            }
                            object6 = (List)((Object)iterator);
                            by2 = 0;
                            iterator2 = object6.iterator();
                            while (iterator2.hasNext()) {
                                iterator = iterator2.next();
                                CharSequence charSequence = (CharSequence)((Object)iterator);
                                boolean bl13 = false;
                                boolean bl14 = false;
                                object4 = statement2;
                                n = 0;
                                Object object10 = object3 = object4;
                                boolean bl15 = false;
                                object4.addBatch(((Object)charSequence).toString());
                            }
                        }
                        if (flag2) {
                            object6 = statement2;
                            by2 = gZ2.g().LiteBansModule_194().be();
                            boolean bl16 = false;
                            iterator = object9;
                            flag7 = false;
                            object5 = new String[6];
                            Object object11 = iterator;
                            object4 = PunishmentTableService[138];
                            n = 0;
                            object5[0] = ObjectUtilities.BaseCoreGenericHandler((Object)((SQLiteDriverHandler_5)object11).LiteBansModule_31().BaseCoreGenericHandler(), (Object)PunishmentTableService[139]) ? (String)object4 + PunishmentTableService[140] : (String)object4 + PunishmentTableService[141];
                            object11 = PunishmentTableService[142];
                            object4 = PunishmentTableService[143];
                            n = 0;
                            object5[1] = (String)object11 + PunishmentTableService[144] + (String)object4;
                            object11 = PunishmentTableService[145];
                            int n2 = by2 & 0xFF;
                            String string4 = PunishmentTableService[146];
                            object3 = ((SQLiteDriverHandler_5)((Object)iterator)).LiteBansModule_31().c();
                            boolean bl17 = false;
                            object5[2] = CommandThrottleService.LiteBansModule_31(((SQLiteDriverHandler_5)((Object)iterator)).LiteBansModule_31().BaseCoreGenericHandler()) ? (String)object11 + PunishmentTableService[147] + n2 + ')' + (String)object3 + string4 : (String)object11 + PunishmentTableService[148] + n2 + ')' + string4;
                            object11 = PunishmentTableService[149];
                            n2 = 36;
                            string4 = PunishmentTableService[150];
                            object3 = ((SQLiteDriverHandler_5)((Object)iterator)).LiteBansModule_31().c();
                            bl17 = false;
                            object5[3] = CommandThrottleService.LiteBansModule_31(((SQLiteDriverHandler_5)((Object)iterator)).LiteBansModule_31().BaseCoreGenericHandler()) ? (String)object11 + PunishmentTableService[151] + n2 + ')' + (String)object3 + string4 : (String)object11 + PunishmentTableService[152] + n2 + ')' + string4;
                            object11 = PunishmentTableService[153];
                            n2 = 45;
                            string4 = PunishmentTableService[154];
                            object3 = ((SQLiteDriverHandler_5)((Object)iterator)).LiteBansModule_31().c();
                            bl17 = false;
                            object5[4] = CommandThrottleService.LiteBansModule_31(((SQLiteDriverHandler_5)((Object)iterator)).LiteBansModule_31().BaseCoreGenericHandler()) ? (String)object11 + PunishmentTableService[155] + n2 + ')' + (String)object3 + string4 : (String)object11 + PunishmentTableService[156] + n2 + ')' + string4;
                            object11 = iterator;
                            object4 = PunishmentTableService[157];
                            n = 0;
                            object5[5] = PunishmentTableService[158] + (String)object4 + ')';
                            SQLiteDriverHandler aR2 = SQLiteDriverHandler.AsyncBackgroundTask_5(((SQLiteDriverHandler_5)((Object)iterator)).BaseCoreGenericHandler(BansHandler_2.g, (String[])object5));
                            bl16 = false;
                            Iterator iterator4 = iterator = object6;
                            boolean bl18 = false;
                            object6.addBatch(((Object)aR2).toString());
                        }
                        if (flag3 && bl10) {
                            object6 = statement2;
                            Object object12 = gZ2;
                            boolean bl19 = false;
                            iterator = object9;
                            flag7 = false;
                            object5 = new String[5];
                            Object object13 = iterator;
                            object4 = PunishmentTableService[159];
                            n = 0;
                            object5[0] = ObjectUtilities.BaseCoreGenericHandler((Object)((SQLiteDriverHandler_5)object13).LiteBansModule_31().BaseCoreGenericHandler(), (Object)PunishmentTableService[160]) ? (String)object4 + PunishmentTableService[161] : (String)object4 + PunishmentTableService[162];
                            object13 = PunishmentTableService[163];
                            int n3 = 32;
                            String string5 = PunishmentTableService[164];
                            object3 = ((SQLiteDriverHandler_5)((Object)iterator)).LiteBansModule_31().c();
                            boolean bl20 = false;
                            Object object14 = iterator;
                            string3 = string5 + PunishmentTableService[165];
                            flag6 = false;
                            object5[1] = CommandThrottleService.LiteBansModule_31(((SQLiteDriverHandler_5)object14).LiteBansModule_31().BaseCoreGenericHandler()) ? (String)object13 + PunishmentTableService[166] + n3 + ')' + (String)object3 + string3 : (String)object13 + PunishmentTableService[167] + n3 + ')' + string3;
                            object13 = PunishmentTableService[168];
                            n3 = 32;
                            string5 = PunishmentTableService[169];
                            object3 = ((SQLiteDriverHandler_5)((Object)iterator)).LiteBansModule_31().c();
                            bl20 = false;
                            object14 = iterator;
                            string3 = string5 + PunishmentTableService[170];
                            flag6 = false;
                            object5[2] = CommandThrottleService.LiteBansModule_31(((SQLiteDriverHandler_5)object14).LiteBansModule_31().BaseCoreGenericHandler()) ? (String)object13 + PunishmentTableService[171] + n3 + ')' + (String)object3 + string3 : (String)object13 + PunishmentTableService[172] + n3 + ')' + string3;
                            object13 = PunishmentTableService[173];
                            String string6 = PunishmentTableService[174];
                            boolean bl21 = false;
                            object5[3] = (String)object13 + PunishmentTableService[175] + string6;
                            object13 = iterator;
                            string6 = PunishmentTableService[176];
                            bl21 = false;
                            object5[4] = PunishmentTableService[177] + string6 + ')';
                            object12 = SQLiteDriverHandler.AsyncBackgroundTask_5(((SQLiteDriverHandler_5)((Object)iterator)).BaseCoreGenericHandler(BansHandler_2.LiteBansModule_194, (String[])object5));
                            bl19 = false;
                            Iterator iterator5 = iterator = object6;
                            boolean bl22 = false;
                            object6.addBatch(object12.toString());
                            object6 = iterator;
                            object12 = gZ2;
                            bl19 = false;
                            iterator = object9;
                            boolean bl23 = false;
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
                            object3 = ((SQLiteDriverHandler_5)((Object)iterator)).LiteBansModule_31().c();
                            bl20 = false;
                            object14 = iterator;
                            string3 = string7 + PunishmentTableService[187];
                            flag6 = false;
                            args[2] = CommandThrottleService.LiteBansModule_31(((SQLiteDriverHandler_5)object14).LiteBansModule_31().BaseCoreGenericHandler()) ? (String)object13 + PunishmentTableService[188] + n4 + ')' + (String)object3 + string3 : (String)object13 + PunishmentTableService[189] + n4 + ')' + string3;
                            object13 = PunishmentTableService[190];
                            object4 = PunishmentTableService[191];
                            n = 0;
                            args[3] = (String)object13 + PunishmentTableService[192] + (String)object4;
                            object13 = iterator;
                            object4 = PunishmentTableService[193];
                            n = 0;
                            args[4] = PunishmentTableService[194] + (String)object4 + ')';
                            object12 = SQLiteDriverHandler.AsyncBackgroundTask_5(((SQLiteDriverHandler_5)((Object)iterator)).BaseCoreGenericHandler(BansHandler_2.c, args));
                            bl19 = false;
                            Iterator iterator6 = iterator = object6;
                            boolean bl24 = false;
                            object6.addBatch(object12.toString());
                        }
                        object6 = statement2;
                        Object object15 = w2;
                        boolean bl25 = false;
                        iterator = object9;
                        flag7 = false;
                        object5 = new String[3];
                        Object object16 = PunishmentTableService[195];
                        object4 = PunishmentTableService[196];
                        n = 0;
                        object3 = ((SQLiteDriverHandler_5)((Object)iterator)).LiteBansModule_31().BaseCoreGenericHandler();
                        object5[0] = ObjectUtilities.BaseCoreGenericHandler(object3, (Object)PunishmentTableService[197]) || ObjectUtilities.BaseCoreGenericHandler(object3, (Object)PunishmentTableService[198]) ? (String)object16 + PunishmentTableService[199] + (String)object4 : (String)object16 + PunishmentTableService[200] + ((SQLiteDriverHandler_5)((Object)iterator)).LiteBansModule_31().e() + PunishmentTableService[201] + (String)object4;
                        object16 = iterator;
                        object4 = PunishmentTableService[202];
                        n = 8192;
                        boolean bl26 = false;
                        if (ObjectUtilities.BaseCoreGenericHandler((Object)((SQLiteDriverHandler_5)object16).LiteBansModule_31().BaseCoreGenericHandler(), (Object)PunishmentTableService[203])) {
                            string2 = (String)object4 + PunishmentTableService[204];
                        } else {
                            String string8 = PunishmentTableService[205];
                            string8 = PunishmentTableService[206];
                            string2 = (String)object4 + ' ' + string8 + '(' + n + PunishmentTableService[207];
                        }
                        object5[1] = string2;
                        object16 = iterator;
                        object4 = PunishmentTableService[208];
                        n = 0;
                        object5[2] = PunishmentTableService[209] + (String)object4 + ')';
                        object15 = SQLiteDriverHandler.AsyncBackgroundTask_5(((SQLiteDriverHandler_5)((Object)iterator)).BaseCoreGenericHandler(BansHandler_2.n, (String[])object5));
                        bl25 = false;
                        Iterator iterator7 = iterator = object6;
                        boolean bl27 = false;
                        object6.addBatch(object15.toString());
                        object6 = iterator;
                        object15 = w2;
                        bl25 = false;
                        iterator = object9;
                        boolean bl28 = false;
                        String[] args = new String[6];
                        object16 = iterator;
                        object4 = PunishmentTableService[210];
                        n = 0;
                        args[0] = ObjectUtilities.BaseCoreGenericHandler((Object)((SQLiteDriverHandler_5)object16).LiteBansModule_31().BaseCoreGenericHandler(), (Object)PunishmentTableService[211]) ? (String)object4 + PunishmentTableService[212] : (String)object4 + PunishmentTableService[213];
                        object16 = PunishmentTableService[214];
                        int n5 = 128;
                        String string9 = PunishmentTableService[215];
                        String string10 = ((SQLiteDriverHandler_5)((Object)iterator)).LiteBansModule_31().c();
                        boolean bl29 = false;
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
                        boolean bl30 = false;
                        String string12 = ((SQLiteDriverHandler_5)object16).LiteBansModule_31().BaseCoreGenericHandler();
                        args[4] = ObjectUtilities.BaseCoreGenericHandler((Object)string12, (Object)PunishmentTableService[231]) || ObjectUtilities.BaseCoreGenericHandler((Object)string12, (Object)PunishmentTableService[232]) ? string11 + PunishmentTableService[233] + string9 : string11 + PunishmentTableService[234] + ((SQLiteDriverHandler_5)object16).LiteBansModule_31().e() + PunishmentTableService[235] + string9;
                        object16 = iterator;
                        string11 = PunishmentTableService[236];
                        boolean bl31 = false;
                        args[5] = PunishmentTableService[237] + string11 + ')';
                        object15 = SQLiteDriverHandler.AsyncBackgroundTask_5(((SQLiteDriverHandler_5)((Object)iterator)).BaseCoreGenericHandler(BansHandler_2.i, args));
                        bl25 = false;
                        Iterator iterator8 = iterator = object6;
                        boolean bl32 = false;
                        object6.addBatch(object15.toString());
                        object6 = iterator;
                        object15 = gZ2;
                        bl25 = false;
                        iterator = object9;
                        boolean bl33 = false;
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
                        object15 = SQLiteDriverHandler.AsyncBackgroundTask_5(((SQLiteDriverHandler_5)((Object)iterator)).BaseCoreGenericHandler(BansHandler_2.LiteBansModule_240, filteredArgs));
                        bl25 = false;
                        Iterator iterator9 = iterator = object6;
                        boolean bl34 = false;
                        object6.addBatch(object15.toString());
                        try {
                            object6 = w2.BaseCoreGenericHandler(statement);
                        }
                        catch (Exception exception) {
                            w2.BaseCoreGenericHandler(exception);
                            object6 = KotlinUnitHandler.BaseCoreGenericHandler;
                        }
                        boolean bl35 = litebans.DatabaseMonitorService.BaseCoreGenericHandler(this, (LiteBansModule_82)object7, (SQLiteDriverHandler_5)object9, false, false, 12, null);
                        this.BroadcastService();
                        ((SQLiteDriverHandler_3)object8).e().BaseCoreGenericHandler(() -> DatabaseMonitorService.BaseCoreGenericHandler(this, bl35), 200L);
                        this.HoverTextFormatter = null;
                        if (bl10 && eG2.aS()) {
                            litebans.DatabaseMonitorService.BaseCoreGenericHandler(this, (LiteBansModule_82)object7, 0L, true, 2, null);
                        }
                        object8 = LiteBansModule_287.LiteBansModule_31((double)(System.nanoTime() - l3) / 1000.0 / 1000.0);
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
                    object2 = KotlinUnitHandler.BaseCoreGenericHandler;
                }
                catch (Throwable throwable5) {
                    throwable2 = throwable5;
                    throw throwable5;
                }
                finally {
                    CloseactionHandler.BaseCoreGenericHandler(autoCloseable2, throwable2);
                }
                object = KotlinUnitHandler.BaseCoreGenericHandler;
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

    public static /* synthetic */ void BaseCoreGenericHandler(DatabaseMonitorService w2, long l3, boolean flag, boolean flag2, boolean flag3, int n, Object object) {
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
        long l5 = this.PunishmentTableService().LiteBansModule_194().LiteBansModule_15();
        if (this.PunishmentTableService().LiteBansModule_194().CommandThrottleService()) {
            TimeZone timeZone = TimeZone.getTimeZone(this.DatabaseMonitorService);
            Calendar calendar = Calendar.getInstance(timeZone);
            long l7 = calendar.getTimeInMillis();
            long l8 = l5 + (l7 + (long)timeZone.getOffset(l7));
            return l8;
        }
        return l3 + l5;
    }

    public static /* synthetic */ long BaseCoreGenericHandler(DatabaseMonitorService w2, boolean flag, int n, Object object) {
        if ((n & 1) != 0) {
            flag = false;
        }
        return w2.LiteBansModule_31(flag);
    }

    public final void BaseCoreGenericHandler(@NotNull LiteBansModule_82 ch2, long l3, boolean flag) {
        Object object;
        char stringArray7;
        CharSequence charSequenceArray6;
        int n;
        DiscordWebhookClient eG2 = this.PunishmentTableService().LiteBansModule_194();
        String string = eG2.LiteBansModule_25();
        String string2 = eG2.aG();
        Object object2 = BansHandler_2.LiteBansModule_194;
        CharSequence charSequence2 = PunishmentTableService[376];
        boolean flag2 = false;
        object2 = SQLiteDriverHandler.e(PunishmentTableService[377] + charSequence2 + PunishmentTableService[378] + object2);
        charSequence2 = PunishmentTableService[379];
        LiteBansModule_82 ch3 = ch2;
        flag2 = false;
        Object object3 = new CharSequence[]{SQLiteDriverHandler.AsyncBackgroundTask_5((String)object2), charSequence2};
        boolean c10 = false;
        CharSequence[] charSequenceArray = object3;
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
        object2 = ch3.c(SQLiteDriverHandler.AsyncBackgroundTask_5(SQLiteDriverHandler.e(SQLiteDriverHandler.LiteBansModule_31((String)object2) + PunishmentTableService[381] + charSequence2)));
        boolean flag4 = false;
        object3 = object = object2;
        boolean stringBuilder = false;
        ((LiteBansModule_60)object2).BaseCoreGenericHandler(string2);
        ResultSet resultSet = LiteBansModule_184.AsyncBackgroundTask_5((LiteBansModule_60)object);
        try {
            if (!resultSet.next()) {
                boolean flag3;
                int n3;
                object2 = BansHandler_2.LiteBansModule_194;
                String[] args = (String[])PunishmentTableService[382];
                ch3 = ch2;
                boolean flag6 = false;
                object3 = args;
                char object5 = ',';
                boolean flag5 = false;
                Object bl23 = object3;
                n = 0;
                n2 = 0;
                for (n3 = 0; n3 < bl23.length(); ++n3) {
                    char c;
                    stringArray7 = c = bl23.charAt(n3);
                    flag3 = false;
                    if (!(stringArray7 == object5)) continue;
                    ++n2;
                }
                int n4 = n2;
                object3 = PunishmentTableService[383];
                if (n4 > 0) {
                    StringBuilder object62 = new StringBuilder(n4 * 2);
                    Iterable iterable = new LiteBansModule_166(0, n4);
                    boolean stringArray6 = false;
                    Iterator iterator = iterable.iterator();
                    while (iterator.hasNext()) {
                        n3 = n2 = ((LiteBansModule_290)iterator).LiteBansModule_31();
                        boolean flag7 = false;
                        object62.append(PunishmentTableService[384]);
                    }
                    object3 = StringUtilities.LiteBansModule_31(object62.toString(), 1);
                }
                Object object4 = object2;
                boolean flag8 = false;
                object2 = ch3.c(SQLiteDriverHandler.AsyncBackgroundTask_5(SQLiteDriverHandler.e(PunishmentTableService[385] + object4 + '(' + args + PunishmentTableService[386] + (CharSequence)object3 + ')')));
                args = new String[]{string, string2};
                flag6 = false;
                Object object6 = object3 = object2;
                flag8 = false;
                String[] filteredArgs = args;
                boolean bl9 = false;
                n3 = filteredArgs.length;
                for (n2 = 0; n2 < n3; ++n2) {
                    String string4;
                    String string5 = string4 = filteredArgs[n2];
                    flag3 = false;
                    ((LiteBansModule_60)object2).BaseCoreGenericHandler(string5);
                }
                LiteBansModule_184.AsyncBackgroundTask_5((LiteBansModule_60)object3);
            } else {
                object2 = resultSet.getString(PunishmentTableService[387]);
                if (!ObjectUtilities.BaseCoreGenericHandler((Object)string, object2)) {
                    int n5;
                    this.PunishmentTableService().BaseCoreGenericHandler((Object)(PunishmentTableService[388] + (String)object2 + PunishmentTableService[389] + string + '\"'));
                    BansHandler_2[] kLArray = BansHandler_2.LiteBansModule_194;
                    boolean bl12 = false;
                    kLArray = SQLiteDriverHandler.c(SQLiteDriverHandler.e(PunishmentTableService[390] + kLArray), PunishmentTableService[391]);
                    String[] args = (String[])PunishmentTableService[392];
                    ch3 = ch2;
                    int n6 = 0;
                    CharSequence[] charSequenceArray3 = new CharSequence[]{SQLiteDriverHandler.AsyncBackgroundTask_5((String)kLArray), args};
                    charSequenceArray3 = charSequenceArray3;
                    boolean bl10 = false;
                    CharSequence[] charSequenceArray4 = charSequenceArray3;
                    n = 0;
                    int n7 = charSequenceArray4.length;
                    for (n2 = 0; n2 < n7; ++n2) {
                        CharSequence charSequence = charSequenceArray6 = charSequenceArray4[n2];
                        boolean bl11 = false;
                        if (charSequence.length() > 0) continue;
                        String string6 = PunishmentTableService[393];
                        throw new IllegalArgumentException(string6.toString());
                    }
                    kLArray = ch3.c(SQLiteDriverHandler.AsyncBackgroundTask_5(SQLiteDriverHandler.e(SQLiteDriverHandler.LiteBansModule_31((String)kLArray) + PunishmentTableService[394] + args)));
                    args = new String[]{string, string2};
                    n6 = 0;
                    BansHandler_2[] kLArray2 = kLArray;
                    Object object7 = kLArray2;
                    boolean bl13 = false;
                    String[] parsedArgs = args;
                    n2 = 0;
                    int n8 = parsedArgs.length;
                    for (n7 = 0; n7 < n8; ++n7) {
                        String string7;
                        String string8 = string7 = parsedArgs[n7];
                        n5 = 0;
                        kLArray.BaseCoreGenericHandler(string8);
                    }
                    LiteBansModule_184.AsyncBackgroundTask_5((LiteBansModule_60)kLArray2);
                    for (BansHandler_2 kL2 : BansHandler_2.values()) {
                        boolean bl14;
                        CharSequence charSequence;
                        int n9;
                        if (!kL2.BaseCoreGenericHandler()) continue;
                        object7 = kL2;
                        boolean bl15 = false;
                        object7 = SQLiteDriverHandler.c(SQLiteDriverHandler.e(PunishmentTableService[395] + object7), PunishmentTableService[396]);
                        String[] stringArray5 = (String[])PunishmentTableService[397];
                        ch3 = ch2;
                        boolean bl16 = false;
                        CharSequence[] charSequenceArray5 = new CharSequence[]{SQLiteDriverHandler.AsyncBackgroundTask_5((String)object7), stringArray5};
                        boolean bl17 = false;
                        CharSequence[] charSequenceArray7 = charSequenceArray5;
                        boolean bl18 = false;
                        n5 = charSequenceArray7.length;
                        for (n9 = 0; n9 < n5; ++n9) {
                            CharSequence charSequence3;
                            charSequence = charSequence3 = charSequenceArray7[n9];
                            boolean bl19 = false;
                            if (charSequence.length() > 0) continue;
                            String string9 = PunishmentTableService[398];
                            throw new IllegalArgumentException(string9.toString());
                        }
                        object7 = ch3.c(SQLiteDriverHandler.AsyncBackgroundTask_5(SQLiteDriverHandler.e(SQLiteDriverHandler.LiteBansModule_31((String)object7) + PunishmentTableService[399] + stringArray5)));
                        stringArray5 = new String[]{string, object2};
                        bl16 = false;
                        CharSequence[] charSequenceArray8 = charSequenceArray5 = object7;
                        boolean bl20 = false;
                        String[] stringArray6 = stringArray5;
                        n9 = 0;
                        int n10 = stringArray6.length;
                        for (n5 = 0; n5 < n10; ++n5) {
                            CharSequence charSequence4 = charSequence = stringArray6[n5];
                            bl14 = false;
                            ((LiteBansModule_60)object7).BaseCoreGenericHandler((String)charSequence4);
                        }
                        LiteBansModule_184.AsyncBackgroundTask_5((LiteBansModule_60)charSequenceArray5);
                        object7 = kL2;
                        boolean bl21 = false;
                        object7 = SQLiteDriverHandler.c(SQLiteDriverHandler.e(PunishmentTableService[400] + object7), PunishmentTableService[401]);
                        String[] stringArray8 = (String[])PunishmentTableService[402];
                        ch3 = ch2;
                        bl16 = false;
                        charSequenceArray5 = new CharSequence[]{SQLiteDriverHandler.AsyncBackgroundTask_5((String)object7), stringArray8};
                        boolean bl22 = false;
                        CharSequence[] charSequenceArray9 = charSequenceArray5;
                        boolean bl23 = false;
                        n5 = charSequenceArray9.length;
                        for (n9 = 0; n9 < n5; ++n9) {
                            CharSequence charSequence5;
                            charSequence = charSequence5 = charSequenceArray9[n9];
                            boolean bl24 = false;
                            if (charSequence.length() > 0) continue;
                            String string10 = PunishmentTableService[403];
                            throw new IllegalArgumentException(string10.toString());
                        }
                        object7 = ch3.c(SQLiteDriverHandler.AsyncBackgroundTask_5(SQLiteDriverHandler.e(SQLiteDriverHandler.LiteBansModule_31((String)object7) + PunishmentTableService[404] + stringArray8)));
                        stringArray8 = new String[]{string, object2};
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
                        LiteBansModule_184.AsyncBackgroundTask_5((LiteBansModule_60)charSequenceArray5);
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

    public static /* synthetic */ void BaseCoreGenericHandler(DatabaseMonitorService w2, LiteBansModule_82 ch2, long l3, boolean flag, int n, Object object) {
        if ((n & 2) != 0) {
            l3 = 0L;
        }
        if ((n & 4) != 0) {
            flag = false;
        }
        w2.BaseCoreGenericHandler(ch2, l3, flag);
    }

    private final void BaseCoreGenericHandler(String string, long l3) {
        boolean flag = false;
        if (ObjectUtilities.BaseCoreGenericHandler((Object)string, (Object)PunishmentTableService[408]) && this.e) {
            flag = LiteBansModule_429.LiteBansModule_31.BaseCoreGenericHandler(this);
        }
        if (!flag) {
            this.plugin(this.PunishmentTableService());
            litebans.DatabaseMonitorService.BaseCoreGenericHandler(this, l3, false, false, false, 14, null);
        }
    }

    static /* synthetic */ void BaseCoreGenericHandler(DatabaseMonitorService w2, String string, long l3, int n, Object object) {
        if ((n & 2) != 0) {
            l3 = System.nanoTime();
        }
        w2.BaseCoreGenericHandler(string, l3);
    }

    public final void BaseCoreGenericHandler(@NotNull ConfigService v1) {
        block53: {
            block52: {
                v2 = System.nanoTime();
                this.LiteBansModule_31 = null;
                var4_3 = v1.LiteBansModule_194();
                var5_4 = var4_3.ElementsHandler();
                var6_5 = this.LiteBansModule_31(v1);
                var7_6 = this.plugin(v1, var5_4);
                if (var7_6 == null) {
                    var8_7 = this;
                    var9_9 = var6_5;
                    var40_11 = new StringBuilder().append(litebans.DatabaseMonitorService.PunishmentTableService[409]).append(var5_4).append(litebans.DatabaseMonitorService.PunishmentTableService[410]);
                    var10_13 = false;
                    var11_15 = var9_9;
                    var12_17 = new ArrayList<PunishmentService>(CollectionUtilities.BaseCoreGenericHandler((Iterable)var9_9, 10));
                    var13_20 = false;
                    for (T var15_28 : var11_15) {
                        var16_31 = (JarHandler)var15_28;
                        var41_27 = var12_17;
                        var17_32 = false;
                        var41_27.add(var16_31.AsyncBackgroundTask_5());
                    }
                    var9_9 = var40_11.append((List)var12_17).toString();
                    var10_13 = false;
                    var8_7.BaseCoreGenericHandler.getLogger().severe((String)var9_9);
                    return;
                }
                v0 = litebans.DatabaseMonitorService.BaseCoreGenericHandler(this, var7_6, false, false, 6, null);
                if (v0 == null) {
                    return;
                }
                var8_8 = v0;
                var9_10 = var4_3.q();
                var11_16 = new String[]{litebans.DatabaseMonitorService.PunishmentTableService[411], litebans.DatabaseMonitorService.PunishmentTableService[412]};
                var10_14 = LiteBansModule_5.BaseCoreGenericHandler((Object[])var11_16).contains(var5_4);
                if (!StringUtilities.c((CharSequence)var9_10, ':', false, 2, null)) {
                    var11_16 = this.PunishmentTableService().LiteBansModule_194().ElementsHandler();
                    var12_18 = false;
                    if (litebans.DatabaseMonitorService.CommandThrottleService.LiteBansModule_31((String)var11_16)) {
                        v1 = var9_10 + litebans.DatabaseMonitorService.PunishmentTableService[413];
                    } else {
                        var13_21 = litebans.DatabaseMonitorService.CommandThrottleService;
                        var14_23 = false;
                        v1 = ObjectUtilities.BaseCoreGenericHandler(var11_16, (Object)litebans.DatabaseMonitorService.PunishmentTableService[414]) != false || ObjectUtilities.BaseCoreGenericHandler(var11_16, (Object)litebans.DatabaseMonitorService.PunishmentTableService[415]) != false ? var9_10 + litebans.DatabaseMonitorService.PunishmentTableService[416] : var9_10;
                    }
                    var9_10 = v1;
                }
                var11_16 = var5_4;
                switch (var11_16.hashCode()) {
                    case -894935028: {
                        if (!var11_16.equals(litebans.DatabaseMonitorService.PunishmentTableService[417])) {
                            ** break;
                        }
                        break block52;
                    }
                    case 3274: {
                        if (var11_16.equals(litebans.DatabaseMonitorService.PunishmentTableService[418])) break;
                        ** break;
                    }
                    case 106616951: {
                        if (!var11_16.equals(litebans.DatabaseMonitorService.PunishmentTableService[419])) {
                            ** break;
                        }
                        break block53;
                    }
                }
                var13_21 = this.plugin.getDataFolder();
                var14_24 = litebans.DatabaseMonitorService.PunishmentTableService[420];
                var15_29 = false;
                var9_10 = new File((File)var13_21, var14_24).getAbsolutePath();
                ** break;
            }
            var13_21 = this.plugin.getDataFolder();
            var14_25 = litebans.DatabaseMonitorService.PunishmentTableService[421];
            var15_29 = false;
            var9_10 = new File((File)var13_21, var14_25).getPath();
            this.z = new LiteBansModule_93(this.plugin);
            ** break;
        }
        var5_4 = litebans.DatabaseMonitorService.PunishmentTableService[422];
lbl71:
        // 7 sources

        var9_10 = this.z.BaseCoreGenericHandler(var9_10);
        var11_16 = null;
        var11_16 = litebans.DatabaseMonitorService.PunishmentTableService[423] + var5_4 + litebans.DatabaseMonitorService.PunishmentTableService[424] + var9_10;
        if (!var10_14) {
            var11_16 = (String)var11_16 + '/' + var4_3.DatabaseMonitorService();
        }
        if (((CharSequence)(var12_19 = var4_3.aN())).length() > 0) {
            if (!var10_14 && !StringUtilities.BaseCoreGenericHandler((CharSequence)var12_19, '?', false, 2, null)) {
                var12_19 = '?' + var12_19;
            }
            if (!(ObjectUtilities.BaseCoreGenericHandler((Object)var5_4, (Object)litebans.DatabaseMonitorService.PunishmentTableService[425]) && (ObjectUtilities.BaseCoreGenericHandler((Object)var12_19, (Object)litebans.DatabaseMonitorService.PunishmentTableService[426]) || ObjectUtilities.BaseCoreGenericHandler((Object)var12_19, (Object)litebans.DatabaseMonitorService.PunishmentTableService[427])) || ObjectUtilities.BaseCoreGenericHandler((Object)var5_4, (Object)litebans.DatabaseMonitorService.PunishmentTableService[428]))) {
                var11_16 = (String)var11_16 + var12_19;
            }
        }
        var13_21 = var11_16;
        var14_26 = StringUtilities.BaseCoreGenericHandler((String)var13_21, litebans.DatabaseMonitorService.PunishmentTableService[429], litebans.DatabaseMonitorService.PunishmentTableService[430], false, 4, null);
        if (ObjectUtilities.BaseCoreGenericHandler((Object)var5_4, (Object)litebans.DatabaseMonitorService.PunishmentTableService[431])) {
            var11_16 = (String)var11_16 + litebans.DatabaseMonitorService.PunishmentTableService[432];
        }
        var15_30 = Math.max(2000L, var4_3.Y());
        var17_33 = litebans.DatabaseMonitorService.BaseCoreGenericHandler(this, new LiteBansModule_244(this.plugin), null, false, false, 12, null);
        var18_34 = var17_33 != false ? var15_30 : 0x7FFFFFFFL;
        var20_35 = litebans.DatabaseMonitorService.CommandThrottleService;
        var21_37 = false;
        if (ObjectUtilities.BaseCoreGenericHandler((Object)var5_4, (Object)litebans.DatabaseMonitorService.PunishmentTableService[433]) != false || ObjectUtilities.BaseCoreGenericHandler((Object)var5_4, (Object)litebans.DatabaseMonitorService.PunishmentTableService[434]) != false) {
            var18_34 = Math.min(var18_34, 2147483L);
        }
        var20_35 = v1;
        var21_37 = false;
        if (var20_35.g()) {
            var40_12 = var20_35;
            var22_40 = false;
            var40_12.BaseCoreGenericHandler(var11_16);
        }
        var20_35 = v1;
        var21_37 = false;
        if (var20_35.g()) {
            var40_12 = var20_35;
            var22_40 = false;
            var40_12.BaseCoreGenericHandler((Object)this.plugin.i().LiteBansModule_31());
        }
        var20_35 = this;
        var21_38 = litebans.DatabaseMonitorService.PunishmentTableService[435];
        var22_40 = false;
        if (!litebans.DatabaseMonitorService.c((DatabaseMonitorService)var20_35).get()) {
            var23_46 = (PluginModule)var20_35;
            var24_54 = false;
            var23_46.BaseCoreGenericHandler.getLogger().info((String)var21_38);
        }
        try {
            HikariLogger.BaseCoreGenericHandler(this.plugin.getLogger());
            var20_35 = new HikariConfig();
            var20_35.LiteBansModule_194(litebans.DatabaseMonitorService.PunishmentTableService[436]);
            var20_35.g((String)var11_16);
            var21_38 = var20_35;
            var22_41 = litebans.DatabaseMonitorService.PunishmentTableService[437];
            var23_46 = var4_3.aW();
            var24_54 = false;
            var26_67 = var25_62 = var21_38;
            var27_70 = false;
            var21_38.BaseCoreGenericHandler((String)var22_41, var23_46);
            var21_38 = var25_62;
            var22_41 = litebans.DatabaseMonitorService.PunishmentTableService[438];
            var23_46 = var4_3.LiteBansModule_6();
            var24_54 = false;
            var26_67 = var25_62 = var21_38;
            var27_70 = false;
            var21_38.BaseCoreGenericHandler((String)var22_41, var23_46);
            var21_38 = var25_62;
            var22_41 = litebans.DatabaseMonitorService.PunishmentTableService[439];
            var23_46 = var15_30;
            var24_54 = false;
            var25_62 = var21_38;
            var26_67 = var23_46.toString();
            var27_70 = false;
            var29_78 = var28_73 = var25_62;
            var30_83 = false;
            var25_62.BaseCoreGenericHandler((String)var22_41, var26_67);
            var21_38 = var28_73;
            var22_41 = litebans.DatabaseMonitorService.PunishmentTableService[440];
            var23_46 = var18_34;
            var24_54 = false;
            var25_62 = var21_38;
            var26_67 = var23_46.toString();
            var27_70 = false;
            var29_78 = var28_73 = var25_62;
            var30_83 = false;
            var25_62.BaseCoreGenericHandler((String)var22_41, var26_67);
            var21_38 = var28_73;
            var22_41 = litebans.DatabaseMonitorService.PunishmentTableService[441];
            var23_46 = litebans.DatabaseMonitorService.PunishmentTableService[442];
            var24_54 = false;
            var26_67 = var25_62 = var21_38;
            var27_70 = false;
            var21_38.BaseCoreGenericHandler((String)var22_41, var23_46);
            var21_38 = var25_62;
            var22_41 = litebans.DatabaseMonitorService.PunishmentTableService[443];
            var23_46 = litebans.DatabaseMonitorService.PunishmentTableService[444];
            var24_54 = true;
            var25_63 = false;
            var26_67 = var21_38;
            var27_71 = litebans.DatabaseMonitorService.PunishmentTableService[445];
            var28_73 = litebans.DatabaseMonitorService.PunishmentTableService[446];
            var29_79 = false;
            var31_86 = var30_84 = var26_67;
            var32_90 = false;
            var26_67.BaseCoreGenericHandler((String)var27_71, var28_73);
            var26_67 = var21_38;
            var27_71 = litebans.DatabaseMonitorService.PunishmentTableService[447];
            var28_74 = false;
            var30_84 = var29_80 = var26_67;
            var31_87 = false;
            var26_67.BaseCoreGenericHandler((String)var27_71, var22_41);
            var26_67 = var29_80;
            var27_71 = litebans.DatabaseMonitorService.PunishmentTableService[448];
            var28_74 = false;
            var30_84 = var29_80 = var26_67;
            var31_87 = false;
            var26_67.BaseCoreGenericHandler((String)var27_71, var22_41);
            var26_67 = var29_80;
            var27_71 = litebans.DatabaseMonitorService.PunishmentTableService[449];
            var28_74 = false;
            var30_84 = var29_80 = var26_67;
            var31_87 = false;
            var26_67.BaseCoreGenericHandler((String)var27_71, var23_46);
            var21_38 = var29_80;
            var22_41 = litebans.DatabaseMonitorService.PunishmentTableService[450];
            var23_47 = false;
            var24_55 = var21_38;
            var25_64 = litebans.DatabaseMonitorService.PunishmentTableService[451];
            var26_68 = false;
            var28_75 = var27_71 = var24_55;
            var29_81 = 0;
            var24_55.BaseCoreGenericHandler((String)var22_41, var25_64);
            var21_38 = var27_71;
            var22_41 = new String[]{litebans.DatabaseMonitorService.PunishmentTableService[452], litebans.DatabaseMonitorService.PunishmentTableService[453], litebans.DatabaseMonitorService.PunishmentTableService[454], litebans.DatabaseMonitorService.PunishmentTableService[455], litebans.DatabaseMonitorService.PunishmentTableService[456], litebans.DatabaseMonitorService.PunishmentTableService[457]};
            var23_47 = false;
            var25_64 = var24_55 = var21_38;
            var26_68 = false;
            var27_71 = var22_41;
            var28_76 = false;
            var30_85 = var27_71.length;
            for (var29_81 = 0; var29_81 < var30_85; ++var29_81) {
                var32_91 = var31_88 = var27_71[var29_81];
                var33_93 = false;
                var34_94 = var21_38;
                var35_95 = litebans.DatabaseMonitorService.PunishmentTableService[458];
                var36_96 = false;
                var38_98 = var37_97 = var34_94;
                var39_99 = false;
                var34_94.BaseCoreGenericHandler(var32_91, var35_95);
            }
            var21_38 = var24_55;
            var22_41 = new String[]{litebans.DatabaseMonitorService.PunishmentTableService[459], litebans.DatabaseMonitorService.PunishmentTableService[460]};
            var23_47 = false;
            var25_64 = var24_55 = var21_38;
            var26_68 = false;
            var27_71 = var22_41;
            var28_76 = false;
            var30_85 = var27_71.length;
            for (var29_81 = 0; var29_81 < var30_85; ++var29_81) {
                var32_92 = var31_89 = var27_71[var29_81];
                var33_93 = false;
                var34_94 = var21_38;
                var35_95 = litebans.DatabaseMonitorService.PunishmentTableService[461];
                var36_96 = false;
                var38_98 = var37_97 = var34_94;
                var39_99 = false;
                var34_94.BaseCoreGenericHandler(var32_92, var35_95);
            }
            var20_35.AsyncBackgroundTask_5(var15_30);
            var20_35.LiteBansModule_194(Math.min(30000L, var15_30));
            if (var4_3.V() != var4_3.LiteBansModule_5()) {
                var20_35.e(var4_3.ServerEventListener());
            }
            var20_35.BaseCoreGenericHandler(Math.max(0, var4_3.V()));
            var20_35.LiteBansModule_31(Math.max(1, var4_3.LiteBansModule_5()));
            var20_35.g(Math.max(0L, var4_3.LiteBansModule_401()));
            var21_38 = this;
            var22_42 = false;
            var23_48 = var21_38.BaseCoreGenericHandler.LiteBansModule_433();
            var24_56 = false;
            var25_65 = Math.max(20, var20_35.LiteBansModule_194() + 8);
            var23_48.setMaximumPoolSize(var25_65);
            var23_48.setRejectedExecutionHandler(new LiteBansModule_140((DatabaseMonitorService)var21_38));
            var23_48.setCorePoolSize(Math.min(var25_65, var20_35.i() + 1));
            var23_48.setKeepAliveTime(4L, TimeUnit.MINUTES);
            if (ObjectUtilities.BaseCoreGenericHandler((Object)var5_4, (Object)litebans.DatabaseMonitorService.PunishmentTableService[462])) {
                var20_35.AsyncBackgroundTask_5(litebans.DatabaseMonitorService.PunishmentTableService[463]);
            } else if (ObjectUtilities.BaseCoreGenericHandler((Object)var5_4, (Object)litebans.DatabaseMonitorService.PunishmentTableService[464])) {
                var20_35.LiteBansModule_240(litebans.DatabaseMonitorService.PunishmentTableService[465]);
            }
            var20_35.BaseCoreGenericHandler(new LiteBansModule_187((Driver)var8_8, (HikariConfig)var20_35));
            if (this.plugin.AsyncBackgroundTask_22() == 1) {
                try {
                    v2 = this.plugin.i();
                    ObjectUtilities.LiteBansModule_31(v2, litebans.DatabaseMonitorService.PunishmentTableService[466]);
                    var20_35.BaseCoreGenericHandler(((GetcancelreasoncomponentsHandler)v2).BaseCoreGenericHandler(this.plugin));
                }
                catch (Throwable var21_39) {
                    this.plugin(var21_39);
                }
            }
            this.LiteBansModule_31 = new HikariDataSource((HikariConfig)var20_35);
        }
        catch (Exception var20_36) {
            var21_38 = this;
            var22_43 = litebans.DatabaseMonitorService.PunishmentTableService[467] + var14_26 + litebans.DatabaseMonitorService.PunishmentTableService[468];
            var23_49 = false;
            var21_38.BaseCoreGenericHandler.getLogger().severe(var22_43);
            if (!ObjectUtilities.BaseCoreGenericHandler((Object)var5_4, (Object)litebans.DatabaseMonitorService.PunishmentTableService[469]) && StringUtilities.LiteBansModule_31((CharSequence)var4_3.aW()) && StringUtilities.LiteBansModule_31((CharSequence)var4_3.LiteBansModule_6())) {
                var21_38 = this;
                var22_43 = litebans.DatabaseMonitorService.PunishmentTableService[470];
                var23_49 = false;
                var21_38.BaseCoreGenericHandler.getLogger().severe(var22_43);
            }
            var21_38 = var20_36.getMessage();
            v3 = var20_36.getCause();
            v4 = var22_43 = v3 != null ? v3.getMessage() : null;
            if (var22_43 == null || var21_38 == null || !StringUtilities.BaseCoreGenericHandler((CharSequence)var21_38, (CharSequence)var22_43, false, 2, null)) {
                var23_50 = this;
                var24_57 = litebans.DatabaseMonitorService.PunishmentTableService[471] + var20_36.getMessage();
                var25_66 = 0;
                var23_50.BaseCoreGenericHandler.getLogger().severe(var24_57);
            }
            var23_51 = litebans.DatabaseMonitorService.PunishmentTableService[472];
            var24_58 = var20_36;
            var25_66 = 16;
            while (var25_66-- > 0 && var24_58.getCause() != null) {
                v5 = var24_58.getLocalizedMessage();
                if (v5 == null) {
                    v5 = litebans.DatabaseMonitorService.PunishmentTableService[473];
                }
                if (((CharSequence)(var26_69 = v5)).length() > 0 && (StringUtilities.BaseCoreGenericHandler((CharSequence)var26_69, (CharSequence)litebans.DatabaseMonitorService.PunishmentTableService[474], false, 2, null) || StringUtilities.BaseCoreGenericHandler((CharSequence)var26_69, (CharSequence)litebans.DatabaseMonitorService.PunishmentTableService[475], false, 2, null))) continue;
                if (((CharSequence)var26_69).length() == 0 && (v6 = var24_58.getMessage()) == null) {
                    v6 = var26_69 = litebans.DatabaseMonitorService.PunishmentTableService[476];
                }
                if (var24_58 instanceof UnknownHostException) {
                    var26_69 = litebans.DatabaseMonitorService.PunishmentTableService[477] + var26_69;
                }
                if (!ObjectUtilities.BaseCoreGenericHandler((Object)var26_69, (Object)litebans.DatabaseMonitorService.PunishmentTableService[478]) && ((CharSequence)var26_69).length() > 0 && !StringUtilities.BaseCoreGenericHandler((CharSequence)var23_51, (CharSequence)var26_69, false, 2, null)) {
                    var27_72 = this;
                    var28_77 = litebans.DatabaseMonitorService.PunishmentTableService[479] + var26_69;
                    var29_82 = false;
                    var27_72.BaseCoreGenericHandler.getLogger().severe(var28_77);
                }
                if ((v7 = var24_58.getMessage()) == null) {
                    v7 = litebans.DatabaseMonitorService.PunishmentTableService[480];
                }
                if (!(((CharSequence)(var26_69 = v7)).length() > 0)) continue;
                if (StringUtilities.LiteBansModule_31(var26_69, litebans.DatabaseMonitorService.PunishmentTableService[481], false, 2, null)) {
                    this.plugin(var4_3);
                    break;
                }
                if (StringUtilities.BaseCoreGenericHandler((CharSequence)var26_69, (CharSequence)litebans.DatabaseMonitorService.PunishmentTableService[482], false, 2, null)) {
                    this.z();
                    break;
                }
                var23_51 = var26_69;
            }
            if (v1.BaseCoreGenericHandler(1)) {
                var20_36.printStackTrace();
            }
            return;
        }
        var20_35 = LiteBansModule_287.LiteBansModule_31((double)(System.nanoTime() - v2) / 1000.0 / 1000.0);
        if (v1.BaseCoreGenericHandler(1)) {
            var21_38 = this;
            var22_44 = litebans.DatabaseMonitorService.PunishmentTableService[483] + var14_26 + litebans.DatabaseMonitorService.PunishmentTableService[484] + (String)var20_35 + litebans.DatabaseMonitorService.PunishmentTableService[485];
            var23_52 = false;
            if (!litebans.DatabaseMonitorService.c((DatabaseMonitorService)var21_38).get()) {
                var24_59 = (PluginModule)var21_38;
                var25_65 = 0;
                var24_59.BaseCoreGenericHandler.getLogger().info((String)var22_44);
            }
        } else {
            var21_38 = this;
            var22_44 = litebans.DatabaseMonitorService.PunishmentTableService[486] + litebans.DatabaseMonitorService.CommandThrottleService.c(var5_4) + litebans.DatabaseMonitorService.PunishmentTableService[487] + (String)var20_35 + litebans.DatabaseMonitorService.PunishmentTableService[488];
            var23_52 = false;
            if (!litebans.DatabaseMonitorService.c((DatabaseMonitorService)var21_38).get()) {
                var24_60 = (PluginModule)var21_38;
                var25_65 = 0;
                var24_60.BaseCoreGenericHandler.getLogger().info((String)var22_44);
            }
        }
        this.AsyncBackgroundTask_5.set(true);
        if (ObjectUtilities.BaseCoreGenericHandler((Object)var5_4, (Object)litebans.DatabaseMonitorService.PunishmentTableService[489])) {
            try {
                var22_44 = this.plugin.getDataFolder();
                var23_53 = litebans.DatabaseMonitorService.PunishmentTableService[490];
                var24_61 = false;
                var21_38 = new File((File)var22_44, var23_53);
                if (!var21_38.exists() || YamlConfigProvider.AsyncBackgroundTask_5() == null) {
                    var22_44 = this.plugin.getDataFolder();
                    var23_53 = litebans.DatabaseMonitorService.PunishmentTableService[491];
                    var24_61 = false;
                    var21_38 = new File((File)var22_44, var23_53);
                }
                var22_44 = this.plugin.BaseCoreGenericHandler((File)var21_38).g();
                var22_44.LiteBansModule_31(litebans.DatabaseMonitorService.PunishmentTableService[492], var4_3.aW()).LiteBansModule_31(litebans.DatabaseMonitorService.PunishmentTableService[493], var4_3.LiteBansModule_6()).LiteBansModule_240();
            }
            catch (Exception var22_45) {
                var22_45.printStackTrace();
            }
        }
    }

    private final void BaseCoreGenericHandler(DiscordWebhookClient eG2) {
        PluginModule module = this;
        String string = PunishmentTableService[494] + eG2.DatabaseMonitorService() + PunishmentTableService[495];
        boolean flag = false;
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
                boolean flag = false;
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
        Object object = args;
        boolean flag = false;
        Object object2 = object;
        Collection collection = new ArrayList(((String[])object).length);
        boolean flag2 = false;
        int n2 = ((String[])object2).length;
        for (n = 0; n < n2; ++n) {
            String string3;
            String string4 = string3 = object2[n];
            Collection collection2 = collection;
            boolean flag3 = false;
            collection2.add(string2 + PunishmentTableService[547] + kL2 + '_' + string4 + PunishmentTableService[548] + kL2 + PunishmentTableService[549] + string4 + ')');
        }
        object = (List)collection;
        flag = false;
        object2 = object.iterator();
        while (object2.hasNext()) {
            collection = object2.next();
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
        String string = ConfigService.GnuSparseMapHandler.LiteBansModule_31(LiteBansModule_373.BaseCoreGenericHandler(file));
        if (jP2.c() != null && !ObjectUtilities.BaseCoreGenericHandler((Object)jP2.c(), (Object)string)) {
            file.delete();
            throw new LiteBansException_9(file, jP2.c(), string);
        }
        Object object = new URL[]{file.toURI().toURL(), DatabaseMonitorService.class.getProtectionDomain().getCodeSource().getLocation().toURI().toURL()};
        URLClassLoader uRLClassLoader = new URLClassLoader((URL[])object, Driver.class.getClassLoader());
        object = uRLClassLoader.loadClass(jP2.LiteBansModule_31());
        if (flag) {
            return ((Class)object).getConstructor(new Class[0]).newInstance(new Object[0]);
        }
        return object;
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

    private static final List BaseCoreGenericHandler(LiteBansModule_161 eE2) {
        LiteBansModule_161 eE3 = eE2;
        return (List)eE3.BaseCoreGenericHandler();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static final void BaseCoreGenericHandler(CommandSenderWrapper sender, DatabaseMonitorService w2, LiteBansModule_178 eo_02) {
        ChatFormatter chatFormatter = MessageHandler.BaseCoreGenericHandler;
        ObjectUtilities.BaseCoreGenericHandler(sender);
        CommandSenderWrapper jv_03 = sender;
        boolean flag = false;
        try {
            chatFormatter.LiteBansModule_31().set(jv_03);
            boolean flag2 = false;
            try {
                DatabaseMonitorService w3 = w2;
                boolean flag3 = false;
                try {
                    LiteBansModule_82 ch2 = w3.LiteBansModule_194();
                    Closeable closeable = ch2;
                    Throwable throwable = null;
                    try {
                        Object object = (LiteBansModule_82)closeable;
                        boolean flag4 = false;
                        eo_02.BaseCoreGenericHandler(ch2);
                        object = KotlinUnitHandler.BaseCoreGenericHandler;
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
                CommandSenderWrapper jv_04 = sender;
                CharSequence charSequence = String.valueOf(bi2.BaseCoreGenericHandler());
                boolean flag5 = false;
                ChatFormatter.BaseCoreGenericHandler(MessageHandler.BaseCoreGenericHandler, jv_04, charSequence, null, 4, null);
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
            LiteBansModule_82 ch2;
            boolean flag3;
            Object object;
            Throwable throwable;
            Closeable closeable;
            LiteBansModule_82 ch3;
            boolean flag4;
            String[] filteredArgs;
            String[] parsedArgs = args;
            boolean flag5 = false;
            try {
                filteredArgs = parsedArgs;
                flag4 = false;
                try {
                    ch3 = filteredArgs.LiteBansModule_194();
                    closeable = ch3;
                    throwable = null;
                    try {
                        object = (LiteBansModule_82)closeable;
                        flag3 = false;
                        ch2 = ch3;
                        flag2 = false;
                        if (ch2.BaseCoreGenericHandler()) {
                            ObjectUtilities.LiteBansModule_31(ch2, PunishmentTableService[550]);
                            AutoCloseable autoCloseable = ((SQLiteDriverHandler_3)ch2).LiteBansModule_194();
                            Throwable throwable2 = null;
                            try {
                                Object object2 = (Statement)autoCloseable;
                                boolean flag6 = false;
                                if (!flag) {
                                    String[] cmdArgs = parsedArgs;
                                    boolean flag7 = false;
                                    if (cmdArgs.A() <= 674) {
                                        CharSequence[] charSequenceArray;
                                        String[] stringArray5;
                                        LiteBansModule_144 dy_02 = new LiteBansModule_144();
                                        dy_02.BaseCoreGenericHandler = PunishmentTableService[551];
                                        if (CommandThrottleService.LiteBansModule_31(cmdArgs.PunishmentTableService().LiteBansModule_194().ElementsHandler())) {
                                            try {
                                                stringArray5 = cmdArgs;
                                                boolean flag8 = false;
                                                try {
                                                    charSequenceArray = stringArray5.LiteBansModule_194();
                                                    Closeable closeable2 = (Closeable)charSequenceArray;
                                                    Throwable throwable3 = null;
                                                    try {
                                                        String string;
                                                        String string2;
                                                        LiteBansModule_82 object3 = (LiteBansModule_82)closeable2;
                                                        boolean object4 = false;
                                                        String[] stringArray6 = charSequenceArray;
                                                        boolean bl9 = false;
                                                        ResultSet resultSet = LiteBansModule_184.AsyncBackgroundTask_5(stringArray6.c((CharSequence)PunishmentTableService[552]));
                                                        LiteBansModule_144 dy_03 = dy_02;
                                                        int n = 1;
                                                        boolean bl10 = false;
                                                        if (resultSet.next()) {
                                                            String string3;
                                                            ResultSet resultSet2 = resultSet;
                                                            boolean bl11 = false;
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
                                                    ((DatabaseMonitorService)cmdArgs).BaseCoreGenericHandler(stringArray5, (Statement)object2, (BansHandler_2)charSequence, (String)dy_02.BaseCoreGenericHandler);
                                                    continue;
                                                }
                                                CharSequence charSequence2 = charSequence;
                                                boolean bl12 = false;
                                                if (!(charSequence2 == BansHandler_2.g)) continue;
                                                ((DatabaseMonitorService)cmdArgs).BaseCoreGenericHandler(stringArray7, (Statement)object2, (BansHandler_2)charSequence, (String)dy_02.BaseCoreGenericHandler);
                                            }
                                        }
                                        catch (SQLException sQLException) {
                                            ConfigService.BaseCoreGenericHandler(cmdArgs.PunishmentTableService(), sQLException, 0, 2, null);
                                        }
                                    }
                                }
                                object2 = KotlinUnitHandler.BaseCoreGenericHandler;
                            }
                            catch (Throwable throwable5) {
                                throwable2 = throwable5;
                                throw throwable5;
                            }
                            finally {
                                CloseactionHandler.BaseCoreGenericHandler(autoCloseable, throwable2);
                            }
                        }
                        object = KotlinUnitHandler.BaseCoreGenericHandler;
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
                    ch3 = filteredArgs.LiteBansModule_194();
                    closeable = ch3;
                    throwable = null;
                    try {
                        object = (LiteBansModule_82)closeable;
                        flag3 = false;
                        ch2 = ch3;
                        flag2 = false;
                        ch2.BaseCoreGenericHandler(PunishmentTableService[566], PunishmentTableService[567], PunishmentTableService[568], false, false);
                        object = KotlinUnitHandler.BaseCoreGenericHandler;
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

    private static final void BaseCoreGenericHandler(DatabaseMonitorService w2, LiteBansModule_82 ch2, boolean flag) {
        w2.BaseCoreGenericHandler(ch2, flag);
    }

    private static final KotlinUnitHandler BaseCoreGenericHandler(DatabaseMonitorService w2, LiteBansModule_82 ch2) {
        Object object;
        Object object2;
        try {
            if (ch2.LiteBansModule_31()) {
                return KotlinUnitHandler.BaseCoreGenericHandler;
            }
            object2 = LiteBansModule_184.AsyncBackgroundTask_5(ch2.c((CharSequence)PunishmentTableService[569]));
            object2.next();
            object = object2.getTimestamp(PunishmentTableService[570]);
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeZone(TimeZone.getTimeZone(PunishmentTableService[571]));
            calendar.setTime((Date)object);
            w2.q = (int)(w2.LiteBansModule_31(true) - calendar.getTimeInMillis());
            String string = LiteBansModule_336.BaseCoreGenericHandler();
            String string2 = LiteBansModule_336.LiteBansModule_31();
            String string3 = PunishmentTableService[572];
            Object object3 = BansHandler_2.i;
            String[] args = (String[])PunishmentTableService[573];
            boolean flag = false;
            ResultSet resultSet = LiteBansModule_184.c(ch2.c(SQLiteDriverHandler.AsyncBackgroundTask_5(SQLiteDriverHandler.BaseCoreGenericHandler(SQLiteDriverHandler.e(PunishmentTableService[574] + args + PunishmentTableService[575] + object3), (Number)1))));
            if (resultSet.next()) {
                w2.BroadcastService = resultSet.getInt(PunishmentTableService[576]) > 0;
                w2.DatabaseMonitorService = resultSet.getString(PunishmentTableService[577]);
                if (!ObjectUtilities.BaseCoreGenericHandler((Object)string2, (Object)resultSet.getString(PunishmentTableService[578]))) {
                    object3 = BansHandler_2.i;
                    boolean flag2 = false;
                    LiteBansModule_184.LiteBansModule_31(ch2.c(SQLiteDriverHandler.AsyncBackgroundTask_5(SQLiteDriverHandler.c(SQLiteDriverHandler.e(PunishmentTableService[579] + object3), PunishmentTableService[580] + string + PunishmentTableService[581] + string2 + '\''))));
                }
            } else {
                boolean flag3;
                char c;
                int n;
                object3 = BansHandler_2.i;
                args = PunishmentTableService[582];
                LiteBansModule_82 ch3 = ch2;
                flag = false;
                Object object4 = args;
                char c10 = ',';
                boolean flag4 = false;
                String[] filteredArgs = object4;
                boolean flag5 = false;
                int n2 = 0;
                for (n = 0; n < filteredArgs.length(); ++n) {
                    char c11 = c = filteredArgs.charAt(n);
                    flag3 = false;
                    if (!(c11 == c10)) continue;
                    ++n2;
                }
                int n3 = n2;
                object4 = PunishmentTableService[583];
                if (n3 > 0) {
                    StringBuilder stringBuilder = new StringBuilder(n3 * 2);
                    Iterable iterable = new LiteBansModule_166(0, n3);
                    boolean flag6 = false;
                    Iterator iterator = iterable.iterator();
                    while (iterator.hasNext()) {
                        n = n2 = ((LiteBansModule_290)iterator).LiteBansModule_31();
                        c = '\u0000';
                        stringBuilder.append(PunishmentTableService[584]);
                    }
                    object4 = StringUtilities.LiteBansModule_31(stringBuilder.toString(), 1);
                }
                Object object5 = object3;
                flag4 = false;
                object3 = ch3.c(SQLiteDriverHandler.AsyncBackgroundTask_5(SQLiteDriverHandler.e(PunishmentTableService[585] + object5 + '(' + args + PunishmentTableService[586] + object4 + ')')));
                args = new String[]{string, string2, string3};
                flag = false;
                object5 = object4 = object3;
                flag4 = false;
                filteredArgs = args;
                flag5 = false;
                n = filteredArgs.length;
                for (n2 = 0; n2 < n; ++n2) {
                    String string4;
                    String string5 = string4 = filteredArgs[n2];
                    flag3 = false;
                    ((LiteBansModule_60)object3).BaseCoreGenericHandler(string5);
                }
                LiteBansModule_184.LiteBansModule_31((LiteBansModule_60)object4);
            }
        }
        catch (Exception exception) {
            w2.BaseCoreGenericHandler(exception);
        }
        if (w2.PunishmentTableService().LiteBansModule_194().e() > 0 && !w2.BroadcastService) {
            object2 = ch2.e().HoverTextFormatter();
            object = MessageKey.LiteBansModule_117;
            boolean flag = false;
            ChatFormatter.BaseCoreGenericHandler(MessageHandler.BaseCoreGenericHandler, (CommandSenderWrapper)object2, (CharSequence)object, null, 4, null);
        }
        return KotlinUnitHandler.BaseCoreGenericHandler;
    }

    public static final /* synthetic */ String GnuSparseMapHandler() {
        return i;
    }

    public static final /* synthetic */ String g() {
        return LiteBansModule_433;
    }

    public static final /* synthetic */ String DatabaseMonitorService() {
        return LiteBansModule_240;
    }

    static {
        c = 3000;
        litebans.DatabaseMonitorService.r();
        CommandThrottleService = new SQLiteDriverHandler_2(null);
        i = PunishmentTableService[587] + LiteBansModule_424.class.getName() + PunishmentTableService[588];
        LiteBansModule_433 = PunishmentTableService[589] + LiteBansModule_416.class.getName() + PunishmentTableService[590];
        LiteBansModule_240 = PunishmentTableService[591] + LiteBansModule_60.class.getName() + '.';
    }

    private static final void r() {
        PunishmentTableService = new String[]{"UTC", "Database is slow! Establishing connection took ", " ", ".version", "SHA-512", "\u0001", "", "sort", "00", "01:", "Table upgrade checks ", "Connection is closed. Only open connections can be used to upgrade ", "", ":(?!(//))", "{}", "", "Interrupted during connection acquisition", "Unfortunately, BaseCoreGenericHandler request has failed because your database server did not respond within ", " seconds. (Socket timeout)", "An unexpected database error has ", "max_connections InitializerHandler_3 config.yml is smaller than 5 (max=", ")! This can cause connection pool exhaustion (\"Connection is not available, request timed out ...\") + ", "Unknown column '", "' InitializerHandler_3 '", "Column '", "' not ", ": Column \"", "\" not found", "ALTER command denied to user ", "WARNING: config.yml was not loaded successfully, errors were encountered. Check startup logs for more ", "LiteBansModule_243", "The database is read only", "[!!!] Database is read-only. This indicates that LiteBans does not have write access to its own database!", "Exception InitializerHandler_3 exception handler", "Original exception:", "useSSL=false", "Database SSL connection support is disabled. Enabling SSL should fix this ", "Change \"useSSL=false\" to \"useSSL=true\" InitializerHandler_3 config.yml, and then run \"litebans reload\" + ", "Your database user (", ") is lacking ALTER permission for the ", " database!", "Without this permission, LiteBans cannot upgrade the ", "Please add the necessary permissions!", "The required permissions are SELECT, CREATE, INSERT, UPDATE, DELETE, ALTER, ", "Executing full upgrade check InitializerHandler_3 response to 'Unknown column' ", "litebans", "[!!!] An 'unknown column' exception likely indicates that tables could not be upgraded successfully - consider the following exception CommandExitException BaseCoreGenericHandler consequence of BaseCoreGenericHandler startup error, not the original ", "", "**Connection pool exhaustion detected** (open=", ", max=", ", logins=", "There have been ", " API calls to prepareStatement() + ", "Be aware that plugins which use the LiteBans API incorrectly can create BaseCoreGenericHandler connection leak, which inevitably leads to exhaustion after ", " connections have been ", "Plugin(AsyncBackgroundTask_21) which may be using LiteBans API: [", ", ", "Loading: ", "> ", ".jar", ".jar", "lib", ".jar", ".jar", "Download URL for ", ": ", "Downloading ", ".. + ", "Failed to download ", "Downloaded ", " ", "Something ", "What happened?", "Loaded ", "Failed to load ", "Attempting to recover from this error.. + ", "File removed: ", "Failed to load from ", "*", "SELECT ", " FROM ", "SQLiteDriverHandler_4", "name", "uuid", "[Sync] Server limit reached (", " servers). Resetting server ", "DROP TABLE ", "Main server thread is not permitted to perform database ", "", "Interrupted during connection", "SQLSTATE(08S01)", "Socket closed", "Connection is closed", "closed connection", "LiteBansModule_243", "SQLiteDriverHandler_4", "", "pgsql", "LiteBansModule_243", " SMALLINT NOT NULL", " TINYINT", " NOT NULL", "LiteBansModule_31", "pgsql", " BYTEA NOT NULL", "BINARY", "BLOB", ")NOT NULL", "SQLiteDriverHandler_4", "PRIMARY KEY(", "SQLiteDriverHandler_4", "sqlite", " INTEGER PRIMARY KEY AUTOINCREMENT", " SERIAL", "version", "", " NOT NULL", " VARCHAR(", " VARCHAR(", "build", "", " NOT NULL", " VARCHAR(", " VARCHAR(", "timezone", " DEFAULT '+00:00'", " NOT NULL", " VARCHAR(", " VARCHAR(", "accept", " DEFAULT 0", "pgsql", "LiteBansModule_243", " SMALLINT NOT NULL", " TINYINT", " NOT NULL", "SQLiteDriverHandler_4", "PRIMARY KEY(", "SQLiteDriverHandler_4", "sqlite", " INTEGER PRIMARY KEY AUTOINCREMENT", " SERIAL", "date", " DEFAULT CURRENT_TIMESTAMP", " TIMESTAMP", "name", "", " VARCHAR(", " VARCHAR(", "uuid", "", " VARCHAR(", " VARCHAR(", "ip", "", " VARCHAR(", " VARCHAR(", "SQLiteDriverHandler_4", "PRIMARY KEY(", "SQLiteDriverHandler_4", "sqlite", " INTEGER PRIMARY KEY AUTOINCREMENT", " SERIAL", "name", "", " NOT NULL", " VARCHAR(", " VARCHAR(", "uuid", "", " NOT NULL", " VARCHAR(", " VARCHAR(", "date", " DEFAULT CURRENT_TIMESTAMP", " TIMESTAMP", "SQLiteDriverHandler_4", "PRIMARY KEY(", "SQLiteDriverHandler_4", "sqlite", " INTEGER PRIMARY KEY AUTOINCREMENT", " SERIAL", "info", " INT", " NOT NULL", "msg", "", " NOT NULL", " VARCHAR(", " VARCHAR(", "time", " DEFAULT CURRENT_TIMESTAMP", " TIMESTAMP", "SQLiteDriverHandler_4", "PRIMARY KEY(", "SQLiteDriverHandler_4", "", "pgsql", "LiteBansModule_243", " SMALLINT NOT NULL", " TINYINT", " NOT NULL", "LiteBansModule_31", "pgsql", " BYTEA NOT NULL", "BINARY", "BLOB", ")NOT NULL", "SQLiteDriverHandler_4", "PRIMARY KEY(", "SQLiteDriverHandler_4", "sqlite", " INTEGER PRIMARY KEY AUTOINCREMENT", " SERIAL", "version", "", " NOT NULL", " VARCHAR(", " VARCHAR(", "build", "", " NOT NULL", " VARCHAR(", " VARCHAR(", "timezone", " DEFAULT '+00:00'", " NOT NULL", " VARCHAR(", " VARCHAR(", "accept", " DEFAULT 0", "pgsql", "LiteBansModule_243", " SMALLINT NOT NULL", " TINYINT", " NOT NULL", "SQLiteDriverHandler_4", "PRIMARY KEY(", "SQLiteDriverHandler_4", "sqlite", " INTEGER PRIMARY KEY AUTOINCREMENT", " SERIAL", "uuid", "pgsql", " BYTEA NOT NULL", "BINARY", ")NOT NULL", "type", "", "pgsql", "LiteBansModule_243", " SMALLINT NOT NULL", " TINYINT", " NOT NULL", "SQLiteDriverHandler_4", "PRIMARY KEY(", "Database connection fully initialized (", " ms) + ", "SQLiteDriverHandler_4", "sqlite", " INTEGER PRIMARY KEY AUTOINCREMENT", " SERIAL", "date", " DEFAULT CURRENT_TIMESTAMP", " TIMESTAMP", "name", "", " VARCHAR(", " VARCHAR(", "uuid", "", " VARCHAR(", " VARCHAR(", "ip", "", " VARCHAR(", " VARCHAR(", "SQLiteDriverHandler_4", "PRIMARY KEY(", "SQLiteDriverHandler_4", "sqlite", " INTEGER PRIMARY KEY AUTOINCREMENT", " SERIAL", "name", "", " NOT NULL", " VARCHAR(", " VARCHAR(", "uuid", "", " NOT NULL", " VARCHAR(", " VARCHAR(", "date", " DEFAULT CURRENT_TIMESTAMP", " TIMESTAMP", "SQLiteDriverHandler_4", "PRIMARY KEY(", "SQLiteDriverHandler_4", "sqlite", " INTEGER PRIMARY KEY AUTOINCREMENT", " SERIAL", "info", " INT", " NOT NULL", "msg", "", " NOT NULL", " VARCHAR(", " VARCHAR(", "time", " DEFAULT CURRENT_TIMESTAMP", " TIMESTAMP", "SQLiteDriverHandler_4", "PRIMARY KEY(", "SQLiteDriverHandler_4", "", "pgsql", "LiteBansModule_243", " SMALLINT NOT NULL", " TINYINT", " NOT NULL", "LiteBansModule_31", "pgsql", " BYTEA NOT NULL", "BINARY", "BLOB", ")NOT NULL", "SQLiteDriverHandler_4", "PRIMARY KEY(", "SQLiteDriverHandler_4", "sqlite", " INTEGER PRIMARY KEY AUTOINCREMENT", " SERIAL", "version", "", " NOT NULL", " VARCHAR(", " VARCHAR(", "build", "", " NOT NULL", " VARCHAR(", " VARCHAR(", "timezone", " DEFAULT '+00:00'", " NOT NULL", " VARCHAR(", " VARCHAR(", "accept", " DEFAULT 0", "pgsql", "LiteBansModule_243", " SMALLINT NOT NULL", " TINYINT", " NOT NULL", "SQLiteDriverHandler_4", "PRIMARY KEY(", "SQLiteDriverHandler_4", "sqlite", " INTEGER PRIMARY KEY AUTOINCREMENT", " SERIAL", "uuid", "pgsql", " BYTEA NOT NULL", "BINARY", ")NOT NULL", "type", "", "pgsql", "LiteBansModule_243", " SMALLINT NOT NULL", " TINYINT", " NOT NULL", "SQLiteDriverHandler_4", "PRIMARY KEY(", "*", "SELECT ", " FROM ", "uuid=?", "Failed ", " WHERE ", "name,uuid", "?", "?,", "INSERT INTO ", ")VALUES(", "name", "[Sync] Updating stored server name: \"", "\" -> \"", "UPDATE ", "name=?", "uuid=?", "Failed ", " WHERE ", "UPDATE ", "server_scope=?", "server_scope=?", "Failed ", " WHERE ", "UPDATE ", "server_origin=?", "server_origin=?", "Failed ", " WHERE ", "[Sync] Server limit reached (", " servers). Resetting server ", "DROP TABLE ", "sqlite", "Unknown SQL driver '", "'. Please use one of these drivers: ", "LiteBansModule_243", "sqlite", ":3306", "pgsql", "postgresql", ":5432", "sqlite", "LiteBansModule_243", "pgsql", "litebans", "litebans.sqlite", "postgresql", "jdbc:", "://", "LiteBansModule_243", "useSSL=false", "useSSL=false&serverTimezone=UTC", "sqlite", "?useSSL=", ";useSSL=", "LiteBansModule_243", ";TRACE_LEVEL_FILE=0;TRACE_LEVEL_SYSTEM_OUT=0", "pgsql", "postgresql", "Connecting to database.. + ", "litebans-pool", "user", "password", "connectTimeout", "socketTimeout", "timezone", "UTC", "utf-8", "utf8mb4_unicode_ci", "useUnicode", "true", "characterEncoding", "characterSetResults", "connectionCollation", "cachePrepStmts", "true", "useServerPrepStmts", "cacheResultSetMetadata", "cacheServerConfiguration", "elideSetAutoCommits", "useLocalSessionState", "useLocalTransactionState", "true", "maintainTimeStats", "alwaysSendSetIsolation", "false", "sqlite", "SELECT 1", "LiteBansModule_243", "SET IGNORECASE TRUE", "", "Failed to connect to [", "] + ", "LiteBansModule_243", "[!!] No username and password has been provided InitializerHandler_3 the configuration!", "Error: ", "", "", "Connection is not available, request timed out", "The driver has not received any packets from the ", "", "Unknown host: ", "Communications link failure", "Error: ", "", "Access denied for user", "Public Key Retrieval is not allowed", "Connected to [", "] successfully (", " ms) + ", "Connected to ", " database successfully (", " ms) + ", "LiteBansModule_243", "LiteBansModule_243.yml", "LiteBansModule_243.json", "user", "password", "[!] Access to the database \"", "\" was ", "[!] Ensure that the database \"", "\" has been created and that you have granted permission to access this ", "litebans", "[!!] Your database is named \"litebans\"; this is the default database name. Ensure that you have defined the correct database ", ":3306", "pgsql", "postgresql", ":5432", ":3306", "pgsql", "postgresql", ":5432", "", "", "SELECT @@version", "", "template", "ipban_wildcard", "uuid", "ip", "banned_by_uuid", "time", "until", "ipban", StringDecryptor.BaseCoreGenericHandler("\u2bb3\u2bb1\u2ba6\u2bbb\u2ba4\u2bb7", 0x22DD2BD2), "uuid", "name", "ip", "CONSOLE", "CONSOLE", "#", "", "SELECT @@version", "", "template", "ipban_wildcard", "uuid", "ip", "banned_by_uuid", "time", "until", "ipban", "active", "uuid", "name", "ip", "CREATE INDEX IF NOT EXISTS", "", "", "", "CREATE INDEX", " idx_", " ON ", " (", "", "", "SELECT @@version", "", "template", "ipban_wildcard", "uuid", "ip", "banned_by_uuid", "time", "until", "ipban", "active", "uuid", "name", "ip", "CONSOLE", "CONSOLE", "#", "SELECT NOW() CommandExitException now", "now", "UTC", "UTC", "*", "SELECT ", " FROM ", "accept", "timezone", "build", "UPDATE ", "version='", "',build='", "version,build,timezone", "?", "?,", "INSERT INTO ", ")VALUES(", "LiteBansModule_21 ", ".executeQuery(", "LiteBansModule_21 ", ".executeQuery(", "LiteBansModule_21 "};
    }
}

