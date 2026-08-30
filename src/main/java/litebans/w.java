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
import litebans.a8;
import litebans.aB;
import litebans.aK;
import litebans.aR;
import litebans.am;
import litebans.an;
import litebans.api.Database;
import litebans.as;
import litebans.bN;
import litebans.bT;
import litebans.bU;
import litebans.bi;
import litebans.bt_0;
import litebans.bz;
import litebans.cJ;
import litebans.ch;
import litebans.co;
import litebans.cp_0;
import litebans.d6;
import litebans.di_0;
import litebans.dr_0;
import litebans.dv;
import litebans.dy_0;
import litebans.eE;
import litebans.eG;
import litebans.eI;
import litebans.eS;
import litebans.eo_0;
import litebans.et;
import litebans.ev_0;
import litebans.ew;
import litebans.fB;
import litebans.fD;
import litebans.f_;
import litebans.ff_0;
import litebans.fg_0;
import litebans.fo_0;
import litebans.gZ;
import litebans.gg_0;
import litebans.gm;
import litebans.h3;
import litebans.hN;
import litebans.he_0;
import litebans.hl;
import litebans.i1;
import litebans.i5;
import litebans.ig_0;
import litebans.iv;
import litebans.iv_0;
import litebans.jP;
import litebans.jb_0;
import litebans.ji_0;
import litebans.jr_0;
import litebans.jv_0;
import litebans.k1;
import litebans.k4;
import litebans.kI;
import litebans.kL;
import litebans.kR;
import litebans.kd_0;
import litebans.kp;
import litebans.kx_0;
import litebans.l6;
import litebans.lK;
import litebans.lV;
import litebans.ll;
import litebans.lo_0;
import litebans.m_0;
import litebans.n_0;
import litebans.o;
import litebans.q_0;
import litebans.s;
import litebans.x_0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class w
extends n_0 {
    public static final cJ v;
    private an b;
    private final ReentrantLock g = new ReentrantLock();
    private final eE u = bN.a(() -> w.a(this));
    private final eE s = bN.a(() -> w.b(this));
    private bU z;
    private aK y;
    private HashMap k;
    private AtomicLong t;
    private final AtomicBoolean d;
    private final AtomicBoolean l;
    private final AtomicBoolean j;
    private boolean e;
    private boolean f;
    private boolean o;
    private byte A;
    private long n;
    private long m;
    private int r;
    private String w;
    private int q;
    public static final int c;
    private static final String i;
    private static final String x;
    private static final String h;
    private static /* synthetic */ String[] p;

    public w(@NotNull di_0 di_02) {
        super(di_02);
        this.z = new bU(di_02);
        this.k = new HashMap();
        this.t = new AtomicLong(0L);
        this.d = new AtomicBoolean();
        this.l = new AtomicBoolean();
        this.j = new AtomicBoolean();
        this.e = true;
        this.w = "UTC";
    }

    public final an y() {
        return this.b;
    }

    public final q_0 p() {
        eE eE2 = this.u;
        return (q_0)eE2.a();
    }

    public final o k() {
        eE eE2 = this.s;
        return (o)eE2.a();
    }

    public final aK l() {
        return this.y;
    }

    public final String u() {
        aK aK2 = this.y;
        if (aK2 == null) {
            return this.p().f().aw();
        }
        aK aK3 = aK2;
        return aK3.toString();
    }

    public final HashMap e() {
        return this.k;
    }

    public final boolean m() {
        an an2 = this.b;
        return (an2 != null ? !an2.b() : false) && this.d.get();
    }

    public final void a(boolean bl) {
        this.e = bl;
    }

    public final void c(boolean bl) {
        this.f = bl;
    }

    public final boolean v() {
        return this.o;
    }

    public final void d(boolean bl) {
        this.o = bl;
    }

    public final byte t() {
        return this.A;
    }

    public final void a(byte by2) {
        this.A = by2;
    }

    public final long i() {
        return this.n;
    }

    public final void b(long l3) {
        this.n = l3;
    }

    public final long b() {
        return this.m;
    }

    public final void a(long l3) {
        this.m = l3;
    }

    public final int A() {
        return this.r;
    }

    public final String n() {
        return this.w;
    }

    public final void a(@NotNull String string) {
        this.w = string;
    }

    public final int a() {
        return this.q;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     */
    public final Connection c() {
        block9: {
            var1_1 = System.nanoTime();
            var3_2 = null;
            try {
                var4_3 = this.b;
                var5_8 = false;
                if (var4_3 == null) ** GOTO lbl-1000
                var6_10 = var4_3;
                var7_12 = false;
                if (var6_10.b() == false) {
                    v0 = var4_3.getConnection();
                } else lbl-1000:
                // 2 sources

                {
                    v0 = null;
                }
                var3_2 = v0;
                var4_4 = System.nanoTime() - var1_1;
            }
            catch (SQLException var4_5) {
                this.a(var4_5);
                break block9;
            }
            finally {
                var4_6 = System.nanoTime() - var1_1;
                if (var4_6 > 1000000000L) {
                    // empty if block
                }
            }
            if (var4_4 > 1000000000L && var3_2 != null && !this.h() && (var6_11 = (int)((double)var4_4 / 1.0E9)) > 12) {
                this.a.getLogger().warning(litebans + "Database is slow! Establishing connection took " + var6_11 + litebans + " seconds.");
            }
        }
        return var3_2;
    }

    public final String a(@NotNull jv_0 jv_02) {
        String string;
        byte by2 = this.a.t();
        if (by2 == 0 || by2 == 3) {
            string = null;
        } else if (by2 == 1 || by2 == 2) {
            string = jv_02.h();
        } else {
            x_0.a();
            throw new as();
        }
        return string;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean s() {
        if (!this.p().f().aS()) return false;
        aK aK2 = this.y;
        if (aK2 == null) return false;
        if (!aK2.b()) return false;
        return true;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final boolean a(@NotNull ch ch2, @Nullable jr_0 jr_02, boolean bl, boolean bl2) {
        Object object;
        q_0 q_02 = (q_0)this.a.a(q_0.class);
        Object object2 = this.a.getDataFolder();
        String string = ".version";
        boolean bl3 = false;
        File file = new File((File)object2, string);
        object2 = null;
        object2 = String.valueOf(litebans.w.a(this, false, 1, null));
        boolean bl4 = false;
        bl3 = !file.exists();
        try {
            object = d6.a(file);
            int n = 128;
            Object object3 = ji_0.b;
            Object object4 = object;
            object4 = new InputStreamReader((InputStream)new FileInputStream((File)object4), (Charset)object3);
            object = object4 instanceof BufferedReader ? (BufferedReader)object4 : new BufferedReader((Reader)object4, n);
            object3 = null;
            try {
                Object object5 = (BufferedReader)object;
                boolean bl5 = false;
                String string2 = ((BufferedReader)object5).readLine();
                eG eG2 = q_02.f();
                try {
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA-512");
                    if (messageDigest != null) {
                        messageDigest.reset();
                        Object[] objectArray = new String[]{jb_0.b(), eG2.aF(), eG2.q(), eG2.aW(), eG2.a9(), eG2.w(), eG2.d()};
                        String string3 = lo_0.a(objectArray, (CharSequence)"\u0001", null, null, 0, null, null, 62, null);
                        objectArray = messageDigest.digest(string3.getBytes(ji_0.b));
                        messageDigest.reset();
                        object2 = gm.a((byte[])objectArray, false);
                    }
                }
                catch (NoSuchAlgorithmException noSuchAlgorithmException) {
                    String[] stringArray;
                    q_0.a(q_02, noSuchAlgorithmException, 0, 2, null);
                    ew.a(q_02);
                    et et2 = fB.d;
                    String string4 = noSuchAlgorithmException.getMessage();
                    if (string4 == null) {
                        string4 = "";
                    }
                    String string5 = string4;
                    boolean bl6 = false;
                    if (ew.a((Object)string5, (Object)"sort")) {
                        String[] stringArray2 = new String[]{"00"};
                        stringArray = stringArray2;
                    } else {
                        String[] stringArray3 = new String[]{"01:" + string5};
                        stringArray = stringArray3;
                    }
                    String[] stringArray4 = stringArray;
                    new l6(q_02, Arrays.copyOf(stringArray4, stringArray4.length)).b();
                }
                if (ew.a(object2, (Object)string2) && !bl) {
                    q_02.a(2, (Object)"Table upgrade checks ");
                    boolean bl7 = true;
                    return bl7;
                }
                object5 = iv_0.a;
            }
            catch (Throwable throwable) {
                object3 = throwable;
                throw throwable;
            }
            finally {
                bt_0.a((Closeable)object, (Throwable)object3);
            }
        }
        catch (Exception exception) {
            this.a(exception);
            bl4 = true;
        }
        if (jr_02 != null) {
            if (!ch2.a()) {
                boolean bl8 = false;
                String string6 = "Connection is closed. Only open connections can be used to upgrade ";
                throw new IllegalArgumentException(string6.toString());
            }
            try {
                ew.b(ch2, "");
                object = (gZ)ch2;
                ew.a(q_02);
                ((gZ)object).a(bl2, q_02, jr_02, bl3);
            }
            catch (Throwable throwable) {
                this.a(throwable);
                bl4 = true;
            }
            if (!bl4) {
                try {
                    kd_0.a(file, (String)object2, null, 2, null);
                }
                catch (Throwable throwable) {
                    this.a(throwable);
                }
            }
        }
        return false;
    }

    public static /* synthetic */ boolean a(w w2, ch ch2, jr_0 jr_02, boolean bl, boolean bl2, int n, Object object) {
        if ((n & 4) != 0) {
            bl = false;
        }
        if ((n & 8) != 0) {
            bl2 = false;
        }
        return w2.a(ch2, jr_02, bl, bl2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void c() {
        Lock lock = this.g;
        lock.lock();
        try {
            boolean bl;
            Object object;
            block13: {
                boolean bl2 = false;
                object = this;
                bl = false;
                s s2 = (s)((w)object).a.a(s.class);
                if (!((Collection)s2.a()).isEmpty()) {
                    w w2 = object;
                    boolean bl3 = false;
                    try {
                        ch ch2 = w2.f();
                        Closeable closeable = ch2;
                        Throwable throwable = null;
                        try {
                            Object object2 = (ch)closeable;
                            boolean bl4 = false;
                            ch ch3 = ch2;
                            boolean bl5 = false;
                            Iterable iterable = s2.a();
                            boolean bl6 = false;
                            for (Object t2 : iterable) {
                                cp_0 cp_02 = (cp_0)t2;
                                boolean bl7 = false;
                                kR.a(ch3, cp_02.c(), cp_02.g(), cp_02.b(), false, false, 24, null);
                            }
                            object2 = iv_0.a;
                        }
                        catch (Throwable throwable2) {
                            throwable = throwable2;
                            throw throwable2;
                        }
                        finally {
                            bt_0.a(closeable, throwable);
                        }
                    }
                    catch (SQLException sQLException) {
                        if (w2.b(sQLException)) break block13;
                        throw sQLException;
                    }
                }
            }
            object = this.d;
            bl = false;
            ((AtomicBoolean)object).set(false);
            an an2 = this.b;
            if (an2 != null) {
                an2.close();
            }
            this.b = null;
            iv_0 iv_02 = iv_0.a;
        }
        finally {
            lock.unlock();
        }
    }

    public final ResultSet d(@NotNull bT bT2) {
        return this.z.c(bT2);
    }

    public final int[] a(@NotNull Statement statement) {
        return this.z.a(statement);
    }

    public final ResultSet a(@NotNull bT bT2) {
        return this.z.b(bT2);
    }

    public final int b(@NotNull bT bT2) {
        return this.z.a(bT2);
    }

    public final kp c(@NotNull bT bT2) {
        this.z.a(bT2);
        return kx_0.a();
    }

    public final List b(@NotNull q_0 q_02) {
        eG eG2 = q_02.f();
        String[] stringArray = eG2.aV();
        boolean bl = false;
        String[] stringArray2 = stringArray;
        Collection collection = new ArrayList(stringArray.length);
        boolean bl2 = false;
        int n = stringArray2.length;
        for (int i = 0; i < n; ++i) {
            String string;
            String string2 = string = stringArray2[i];
            Collection collection2 = collection;
            boolean bl3 = false;
            Object object = string2;
            Object object2 = new hN(":(?!(//))");
            int n2 = 5;
            object = ((hN)object2).a((CharSequence)object, n2);
            boolean bl4 = false;
            Object object3 = object;
            Object[] objectArray = object3.toArray(new String[0]);
            object = (String)lo_0.a(objectArray, 2);
            object2 = (String)lo_0.a(objectArray, 3);
            if (object2 != null) {
                Object object4 = object;
                object = object4 != null ? bz.a((String)object4, p[14], (String)object2, false, 4, null) : null;
            }
            object3 = (String)lo_0.a(objectArray, 4);
            Object object5 = objectArray[0];
            collection2.add(new jP(((String)object5).toLowerCase(Locale.ENGLISH), (String)objectArray[1], (String)object, (String)object2, (String)object3));
        }
        return (List)collection;
    }

    public final aK a(@NotNull ch ch2, int n, boolean bl) {
        aK aK2 = (aK)this.k.get(n);
        if (aK2 == null && bl) {
            litebans.w.a(this, ch2, false, 2, null);
            return this.a(ch2, n, false);
        }
        return aK2;
    }

    public final boolean a(int n) {
        int n2 = this.p().f().a8();
        w w2 = this;
        boolean bl = false;
        Object object = w2.y();
        return (object != null && (object = ((an)object).a()) != null ? object.e() : 0) >= n2 - n && n2 >= 3;
    }

    public static /* synthetic */ boolean a(w w2, int n, int n2, Object object) {
        if ((n2 & 1) != 0) {
            n = 1;
        }
        return w2.a(n);
    }

    public final void a(@NotNull Throwable throwable) {
        try {
            Object object;
            String string;
            q_0 q_02 = (q_0)this.a.a(q_0.class);
            String string2 = throwable.getMessage();
            if (string2 == null) {
                string2 = string = p[15];
            }
            if (throwable instanceof iv) {
                n_0 n_02 = this;
                boolean bl = false;
                n_02.a.getLogger().severe(string);
                return;
            }
            if (throwable instanceof dr_0) {
                object = q_02;
                boolean bl = false;
                if (ew.a(he_0.a((q_0)object), (Object)am.a(object, false, true))) {
                    return;
                }
            }
            if (!this.a.isEnabled()) {
                if (throwable instanceof SQLException && bz.a((CharSequence)string, (CharSequence)p[16], false, 2, null)) {
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
            boolean bl = false;
            if (throwable instanceof SQLException) {
                boolean bl2;
                String string4;
                n_0 n_03;
                int n;
                Object object2;
                Object object3;
                Throwable throwable2 = throwable;
                int n2 = 4;
                while (n2-- > 0 && throwable2.getCause() != null) {
                }
                if (throwable2 instanceof SocketTimeoutException || throwable instanceof SQLTransientConnectionException && this.j.get()) {
                    this.j.set(true);
                    bl = true;
                    object3 = this;
                    object2 = p[17] + i1.b((double)q_02.f().Y() / 1000.0) + p[18];
                    n = 0;
                    ((n_0)object3).a.getLogger().severe((String)object2);
                } else {
                    object3 = this;
                    object2 = p[19];
                    n = 0;
                    ((n_0)object3).a.getLogger().severe((String)object2);
                }
                object3 = q_02.f().aF();
                object2 = this.a.h().b();
                n = q_02.f().a8();
                if (n < 5) {
                    n_03 = this;
                    string4 = p[20] + n + p[21];
                    bl2 = false;
                    n_03.a.getLogger().warning(string4);
                }
                if (throwable instanceof SQLTransientConnectionException && !this.j.get() && this.h()) {
                    this.x();
                }
                if (bz.a((CharSequence)string3, (CharSequence)p[22], false, 2, null) && bz.a((CharSequence)string3, (CharSequence)p[23], false, 2, null) || bz.a((CharSequence)string3, (CharSequence)p[24], false, 2, null) && bz.a((CharSequence)string3, (CharSequence)p[25], false, 2, null) || bz.a((CharSequence)string3, (CharSequence)p[26], false, 2, null) && bz.a((CharSequence)string3, (CharSequence)p[27], false, 2, null)) {
                    this.q();
                }
                if (bz.a((CharSequence)string3, (CharSequence)p[28], false, 2, null)) {
                    this.d();
                    return;
                }
                if (object2 != null) {
                    n_03 = this;
                    string4 = p[29];
                    bl2 = false;
                    n_03.a.getLogger().severe(string4);
                } else if (ew.a(object3, (Object)p[30]) && bz.a((CharSequence)string3, (CharSequence)p[31], false, 2, null)) {
                    n_03 = this;
                    string4 = p[32];
                    bl2 = false;
                    n_03.a.getLogger().severe(string4);
                }
            }
            if (bl && !q_02.a(1)) {
                return;
            }
            q_02.a(string3);
        }
        catch (Throwable throwable3) {
            n_0 n_04 = this;
            String string = p[33];
            boolean bl = false;
            n_04.a.getLogger().severe(string);
            throwable3.printStackTrace();
            n_04 = this;
            string = p[34];
            bl = false;
            n_04.a.getLogger().severe(string);
            throwable.printStackTrace();
        }
    }

    private final boolean h() {
        w w2 = this;
        boolean bl = false;
        Object object = w2.y();
        return (object != null && (object = ((an)object).a()) != null ? object.e() : 0) >= this.p().f().a8();
    }

    private final void z() {
        if (bz.a((CharSequence)this.p().f().aN(), (CharSequence)p[35], false, 2, null)) {
            n_0 n_02 = this;
            String string = p[36];
            boolean bl = false;
            n_02.a.getLogger().severe(string);
            n_02 = this;
            string = p[37];
            bl = false;
            n_02.a.getLogger().severe(string);
        }
    }

    private final void d() {
        n_0 n_02 = this;
        String string = p[38] + this.p().f().aW() + p[39] + this.p().f().w() + p[40];
        boolean bl = false;
        n_02.a.getLogger().severe(string);
        n_02 = this;
        string = p[41];
        bl = false;
        n_02.a.getLogger().severe(string);
        n_02 = this;
        string = p[42];
        bl = false;
        n_02.a.getLogger().severe(string);
        n_02 = this;
        string = p[43];
        bl = false;
        n_02.a.getLogger().severe(string);
    }

    private final void q() {
        Object object = this.l;
        boolean bl = false;
        if (((AtomicBoolean)object).compareAndSet(false, true)) {
            object = this;
            String string = p[44];
            boolean bl2 = false;
            ((n_0)object).a.getLogger().warning(string);
            Object object2 = object = (fD)this.a.z().a(p[45]);
            if (object2 != null) {
                ((fD)object2).b(this.a.y());
            }
        } else {
            object = this;
            String string = p[46];
            boolean bl3 = false;
            ((n_0)object).a.getLogger().severe(string);
        }
    }

    private final void x() {
        q_0 q_02 = (q_0)this.a.a(q_0.class);
        s s2 = (s)this.a.a(s.class);
        int n = q_02.f().a8();
        w w2 = this;
        boolean bl = false;
        Object object = w2.y();
        int n2 = object != null && (object = ((an)object).a()) != null ? object.e() : 0;
        Database database = Database.get();
        ew.b(database, p[47]);
        int n3 = ((k4)database).c();
        eE eE2 = bN.a(() -> w.d(this));
        int n4 = s2.a().size();
        n_0 n_02 = this;
        String string = p[48] + n2 + p[49] + n + p[50] + n4 + ')';
        boolean bl2 = false;
        n_02.a.getLogger().severe(string);
        if (n3 > 0) {
            n_02 = this;
            string = p[51] + n3 + p[52];
            bl2 = false;
            n_02.a.getLogger().severe(string);
            n_02 = this;
            string = p[53] + n + p[54];
            bl2 = false;
            n_02.a.getLogger().severe(string);
            if (!((Collection)litebans.w.a(eE2)).isEmpty()) {
                n_02 = this;
                string = p[55] + ll.a(litebans.w.a(eE2), p[56], null, null, 0, null, null, 62, null) + ']';
                bl2 = false;
                n_02.a.getLogger().severe(string);
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
                boolean bl = false;
                this.p().e();
                if (!this.f) break block7;
                return;
            }
            try {
                litebans.w.a(this, this.p().f().aF(), 0L, 2, null);
                new ff_0(this.a).run();
            }
            catch (Throwable throwable) {
                this.a(throwable);
            }
            iv_0 iv_02 = iv_0.a;
        }
        finally {
            lock.unlock();
        }
    }

    public final Object a(@NotNull jP jP2, boolean bl, boolean bl2) {
        String string;
        boolean bl3;
        boolean bl4;
        Object object;
        boolean bl5;
        Object object2;
        q_0 q_02 = (q_0)this.a.a(q_0.class);
        String string2 = jP2.d();
        Object object3 = this;
        String string3 = p[57] + jP2;
        boolean bl6 = false;
        if (!((w)object3).d.get()) {
            object2 = (n_0)object3;
            bl5 = false;
            ((n_0)object2).a.getLogger().info(string3);
        }
        object3 = q_02;
        boolean bl7 = false;
        if (((q_0)object3).g()) {
            String string4;
            n_0 n_02 = object3;
            bl6 = false;
            StringBuilder stringBuilder = new StringBuilder().append(p[58]);
            object2 = jP2;
            bl5 = false;
            if (((jP)object2).e() == null) {
                object = object2;
                bl4 = false;
                string4 = ((jP)object).d() + p[59];
            } else {
                int n = bz.b((CharSequence)((jP)object2).e(), '/', 0, false, 6, null);
                if (n < 0 || n > ((jP)object2).e().length() - 1) {
                    Object object4 = object2;
                    bl3 = false;
                    string4 = ((jP)object4).d() + p[60];
                } else {
                    string4 = ((jP)object2).e().substring(n + 1);
                }
            }
            ((q_0)n_02).a((Object)stringBuilder.append(string4).toString());
        }
        File file = this.a.getDataFolder();
        Object object5 = p[61];
        boolean bl8 = false;
        object5 = object3 = d6.c(new File(file, (String)object5));
        Object object6 = jP2;
        bl5 = false;
        if (((jP)object6).e() == null) {
            object = object6;
            bl4 = false;
            string = ((jP)object).d() + p[62];
        } else {
            int n = bz.b((CharSequence)((jP)object6).e(), '/', 0, false, 6, null);
            if (n < 0 || n > ((jP)object6).e().length() - 1) {
                jP jP3 = object6;
                bl3 = false;
                string = jP3.d() + p[63];
            } else {
                string = ((jP)object6).e().substring(n + 1);
            }
        }
        object6 = string;
        bl5 = false;
        file = new File((File)object5, (String)object6);
        try {
            object5 = null;
            try {
                object5 = this.a(jP2, file, bl2);
            }
            catch (iv iv2) {
                this.a(iv2);
            }
            if (object5 == null && (object6 = jP2.e()) != null) {
                boolean bl9;
                n_0 n_03 = this;
                Object object7 = p[64] + string2 + p[65] + (String)object6;
                boolean bl10 = false;
                if (!((w)n_03).d.get()) {
                    n_0 n_04 = n_03;
                    bl9 = false;
                    n_04.a.getLogger().info((String)object7);
                }
                n_03 = this;
                object7 = p[66] + string2 + p[67];
                bl10 = false;
                if (!((w)n_03).d.get()) {
                    n_0 n_05 = n_03;
                    bl9 = false;
                    n_05.a.getLogger().info((String)object7);
                }
                try {
                    ig_0.a(q_0.j, file.toString(), (String)object6, null, null, 12, null);
                }
                catch (Exception exception) {
                    object7 = this;
                    String string5 = p[68] + string2 + '.';
                    boolean bl11 = false;
                    ((n_0)object7).a.getLogger().severe(string5);
                    this.a(exception);
                    return null;
                }
                if (file.exists()) {
                    n_03 = this;
                    object7 = p[69] + string2 + p[70];
                    bl10 = false;
                    if (!((w)n_03).d.get()) {
                        n_0 n_06 = n_03;
                        bl9 = false;
                        n_06.a.getLogger().info((String)object7);
                    }
                } else {
                    n_03 = this;
                    object7 = p[71];
                    bl10 = false;
                    n_03.a.getLogger().warning((String)object7);
                }
            }
            if (object5 == null) {
                try {
                    object5 = this.a(jP2, file, bl2);
                    if (object5 == null) {
                        object6 = this;
                        String string6 = p[72];
                        boolean bl12 = false;
                        ((n_0)object6).a.getLogger().severe(string6);
                        return null;
                    }
                    object6 = this;
                    String string7 = p[73] + string2 + '!';
                    boolean bl13 = false;
                    if (!((w)object6).d.get()) {
                        n_0 n_07 = (n_0)object6;
                        boolean bl14 = false;
                        n_07.a.getLogger().info(string7);
                    }
                }
                catch (Throwable throwable) {
                    n_0 n_08 = this;
                    String string8 = p[74] + jP2 + '.';
                    boolean bl15 = false;
                    n_08.a.getLogger().severe(string8);
                    this.a(throwable);
                    if (throwable instanceof ZipException && bl) {
                        n_08 = this;
                        string8 = p[75];
                        bl15 = false;
                        n_08.a.getLogger().severe(string8);
                        if (file.exists() && file.delete()) {
                            n_08 = this;
                            string8 = p[76] + file;
                            bl15 = false;
                            n_08.a.getLogger().severe(string8);
                        }
                        return litebans.w.a(this, jP2, false, false, 4, null);
                    }
                    return null;
                }
            }
            return object5;
        }
        catch (Exception exception) {
            object6 = this;
            String string9 = p[77] + file + ':';
            boolean bl16 = false;
            if (!((w)object6).d.get()) {
                n_0 n_09 = (n_0)object6;
                bl3 = false;
                n_09.a.getLogger().info(string9);
            }
            this.a(exception);
            return null;
        }
    }

    public static /* synthetic */ Object a(w w2, jP jP2, boolean bl, boolean bl2, int n, Object object) {
        if ((n & 2) != 0) {
            bl = true;
        }
        if ((n & 4) != 0) {
            bl2 = true;
        }
        return w2.a(jP2, bl, bl2);
    }

    /*
     * Exception decompiling
     */
    public final void a(@NotNull ch var1_1, boolean var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [1[TRYBLOCK]], but top level block is 12[WHILELOOP]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public static /* synthetic */ void a(w w2, ch ch2, boolean bl, int n, Object object) {
        if ((n & 2) != 0) {
            bl = false;
        }
        w2.a(ch2, bl);
    }

    public final ch f() {
        if (this.a.u() && this.a.n()) {
            throw new AssertionError((Object)p[87]);
        }
        Connection connection = this.c();
        return connection == null || !this.m() || this.f ? (ch)new h3(this.a) : (ch)new gZ(this.a, connection);
    }

    public final void a(@NotNull eo_0 eo_02) {
        jv_0 jv_02 = (jv_0)fg_0.a.b().get();
        if (jv_02 == null) {
            jv_02 = this.a.y();
        }
        jv_0 jv_03 = jv_02;
        this.a.b(() -> w.a(jv_03, this, eo_02));
    }

    public final boolean b(@NotNull Throwable throwable) {
        String string = throwable.getMessage();
        if (string == null) {
            string = p[88];
        }
        String string2 = string;
        di_0 di_02 = this.a;
        boolean bl = false;
        di_0 di_03 = di_02;
        boolean bl2 = false;
        return (!di_03.isEnabled() || di_02.s()) && (bz.a((CharSequence)string2, (CharSequence)p[89], false, 2, null) || bz.a((CharSequence)string2, (CharSequence)p[90], false, 2, null) || bz.a((CharSequence)string2, (CharSequence)p[91], false, 2, null) || bz.a((CharSequence)string2, (CharSequence)p[92], false, 2, null) || bz.a((CharSequence)string2, (CharSequence)p[93], false, 2, null));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final void a(long l3, boolean bl, boolean bl2, boolean bl3) {
        iv_0 iv_02;
        eG eG2 = this.p().f();
        Connection connection = this.c();
        if (connection != null) {
            AutoCloseable autoCloseable = connection;
            Throwable throwable = null;
            try {
                Object object = (Connection)autoCloseable;
                boolean bl4 = false;
                AutoCloseable autoCloseable2 = object.createStatement();
                Throwable throwable2 = null;
                try {
                    Object object2 = (Statement)autoCloseable2;
                    boolean bl5 = false;
                    Closeable closeable = new gZ(this.a, (Connection)object);
                    Throwable throwable3 = null;
                    try {
                        String string;
                        String string2;
                        boolean bl6;
                        String string3;
                        Object object3;
                        int n;
                        Object object4;
                        Object object5;
                        boolean bl7;
                        Iterator iterator;
                        byte by2;
                        Object object6;
                        Object object7 = (gZ)closeable;
                        boolean bl8 = false;
                        Object object8 = object7;
                        boolean bl9 = false;
                        Object object9 = ((gZ)object8).b();
                        boolean bl10 = v.a(eG2.aF());
                        w w2 = this;
                        gZ gZ2 = object8;
                        ew.a(object2);
                        Statement statement = object2;
                        boolean bl11 = false;
                        Statement statement2 = statement;
                        boolean bl12 = false;
                        if (bl) {
                            object6 = kL.d.a();
                            by2 = 0;
                            Iterator iterator2 = object6;
                            iterator = new ArrayList(ll.a((Iterable)object6, 10));
                            bl7 = false;
                            object5 = iterator2.iterator();
                            while (object5.hasNext()) {
                                Object e = object5.next();
                                object4 = (kL)e;
                                Iterator iterator3 = iterator;
                                n = 0;
                                iterator3.add(gZ2.a((kL)object4, (jr_0)object9));
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
                        if (bl2) {
                            object6 = statement2;
                            by2 = gZ2.g().f().be();
                            boolean bl16 = false;
                            iterator = object9;
                            bl7 = false;
                            object5 = new String[6];
                            Object object11 = iterator;
                            object4 = p[138];
                            n = 0;
                            object5[0] = ew.a((Object)((jr_0)object11).b().a(), (Object)p[139]) ? (String)object4 + p[140] : (String)object4 + p[141];
                            object11 = p[142];
                            object4 = p[143];
                            n = 0;
                            object5[1] = (String)object11 + p[144] + (String)object4;
                            object11 = p[145];
                            int n2 = by2 & 0xFF;
                            String string4 = p[146];
                            object3 = ((jr_0)((Object)iterator)).b().c();
                            boolean bl17 = false;
                            object5[2] = v.b(((jr_0)((Object)iterator)).b().a()) ? (String)object11 + p[147] + n2 + ')' + (String)object3 + string4 : (String)object11 + p[148] + n2 + ')' + string4;
                            object11 = p[149];
                            n2 = 36;
                            string4 = p[150];
                            object3 = ((jr_0)((Object)iterator)).b().c();
                            bl17 = false;
                            object5[3] = v.b(((jr_0)((Object)iterator)).b().a()) ? (String)object11 + p[151] + n2 + ')' + (String)object3 + string4 : (String)object11 + p[152] + n2 + ')' + string4;
                            object11 = p[153];
                            n2 = 45;
                            string4 = p[154];
                            object3 = ((jr_0)((Object)iterator)).b().c();
                            bl17 = false;
                            object5[4] = v.b(((jr_0)((Object)iterator)).b().a()) ? (String)object11 + p[155] + n2 + ')' + (String)object3 + string4 : (String)object11 + p[156] + n2 + ')' + string4;
                            object11 = iterator;
                            object4 = p[157];
                            n = 0;
                            object5[5] = p[158] + (String)object4 + ')';
                            aR aR2 = aR.d(((jr_0)((Object)iterator)).a(kL.g, (String[])object5));
                            bl16 = false;
                            Iterator iterator4 = iterator = object6;
                            boolean bl18 = false;
                            object6.addBatch(((Object)aR2).toString());
                        }
                        if (bl3 && bl10) {
                            object6 = statement2;
                            Object object12 = gZ2;
                            boolean bl19 = false;
                            iterator = object9;
                            bl7 = false;
                            object5 = new String[5];
                            Object object13 = iterator;
                            object4 = p[159];
                            n = 0;
                            object5[0] = ew.a((Object)((jr_0)object13).b().a(), (Object)p[160]) ? (String)object4 + p[161] : (String)object4 + p[162];
                            object13 = p[163];
                            int n3 = 32;
                            String string5 = p[164];
                            object3 = ((jr_0)((Object)iterator)).b().c();
                            boolean bl20 = false;
                            Object object14 = iterator;
                            string3 = string5 + p[165];
                            bl6 = false;
                            object5[1] = v.b(((jr_0)object14).b().a()) ? (String)object13 + p[166] + n3 + ')' + (String)object3 + string3 : (String)object13 + p[167] + n3 + ')' + string3;
                            object13 = p[168];
                            n3 = 32;
                            string5 = p[169];
                            object3 = ((jr_0)((Object)iterator)).b().c();
                            bl20 = false;
                            object14 = iterator;
                            string3 = string5 + p[170];
                            bl6 = false;
                            object5[2] = v.b(((jr_0)object14).b().a()) ? (String)object13 + p[171] + n3 + ')' + (String)object3 + string3 : (String)object13 + p[172] + n3 + ')' + string3;
                            object13 = p[173];
                            String string6 = p[174];
                            boolean bl21 = false;
                            object5[3] = (String)object13 + p[175] + string6;
                            object13 = iterator;
                            string6 = p[176];
                            bl21 = false;
                            object5[4] = p[177] + string6 + ')';
                            object12 = aR.d(((jr_0)((Object)iterator)).a(kL.f, (String[])object5));
                            bl19 = false;
                            Iterator iterator5 = iterator = object6;
                            boolean bl22 = false;
                            object6.addBatch(object12.toString());
                            object6 = iterator;
                            object12 = gZ2;
                            bl19 = false;
                            iterator = object9;
                            boolean bl23 = false;
                            String[] stringArray = new String[5];
                            object13 = iterator;
                            string6 = p[178];
                            bl21 = false;
                            stringArray[0] = ew.a((Object)((jr_0)object13).b().a(), (Object)p[179]) ? string6 + p[180] : string6 + p[181];
                            object13 = iterator;
                            string6 = p[182];
                            bl21 = false;
                            stringArray[1] = string6 + p[183] + ((jr_0)object13).b().e() + p[184];
                            object13 = p[185];
                            int n4 = 4096;
                            String string7 = p[186];
                            object3 = ((jr_0)((Object)iterator)).b().c();
                            bl20 = false;
                            object14 = iterator;
                            string3 = string7 + p[187];
                            bl6 = false;
                            stringArray[2] = v.b(((jr_0)object14).b().a()) ? (String)object13 + p[188] + n4 + ')' + (String)object3 + string3 : (String)object13 + p[189] + n4 + ')' + string3;
                            object13 = p[190];
                            object4 = p[191];
                            n = 0;
                            stringArray[3] = (String)object13 + p[192] + (String)object4;
                            object13 = iterator;
                            object4 = p[193];
                            n = 0;
                            stringArray[4] = p[194] + (String)object4 + ')';
                            object12 = aR.d(((jr_0)((Object)iterator)).a(kL.c, stringArray));
                            bl19 = false;
                            Iterator iterator6 = iterator = object6;
                            boolean bl24 = false;
                            object6.addBatch(object12.toString());
                        }
                        object6 = statement2;
                        Object object15 = w2;
                        boolean bl25 = false;
                        iterator = object9;
                        bl7 = false;
                        object5 = new String[3];
                        Object object16 = p[195];
                        object4 = p[196];
                        n = 0;
                        object3 = ((jr_0)((Object)iterator)).b().a();
                        object5[0] = ew.a(object3, (Object)p[197]) || ew.a(object3, (Object)p[198]) ? (String)object16 + p[199] + (String)object4 : (String)object16 + p[200] + ((jr_0)((Object)iterator)).b().e() + p[201] + (String)object4;
                        object16 = iterator;
                        object4 = p[202];
                        n = 8192;
                        boolean bl26 = false;
                        if (ew.a((Object)((jr_0)object16).b().a(), (Object)p[203])) {
                            string2 = (String)object4 + p[204];
                        } else {
                            String string8 = p[205];
                            string8 = p[206];
                            string2 = (String)object4 + ' ' + string8 + '(' + n + p[207];
                        }
                        object5[1] = string2;
                        object16 = iterator;
                        object4 = p[208];
                        n = 0;
                        object5[2] = p[209] + (String)object4 + ')';
                        object15 = aR.d(((jr_0)((Object)iterator)).a(kL.n, (String[])object5));
                        bl25 = false;
                        Iterator iterator7 = iterator = object6;
                        boolean bl27 = false;
                        object6.addBatch(object15.toString());
                        object6 = iterator;
                        object15 = w2;
                        bl25 = false;
                        iterator = object9;
                        boolean bl28 = false;
                        String[] stringArray = new String[6];
                        object16 = iterator;
                        object4 = p[210];
                        n = 0;
                        stringArray[0] = ew.a((Object)((jr_0)object16).b().a(), (Object)p[211]) ? (String)object4 + p[212] : (String)object4 + p[213];
                        object16 = p[214];
                        int n5 = 128;
                        String string9 = p[215];
                        String string10 = ((jr_0)((Object)iterator)).b().c();
                        boolean bl29 = false;
                        Object object17 = iterator;
                        string3 = string9 + p[216];
                        bl6 = false;
                        stringArray[1] = v.b(((jr_0)object17).b().a()) ? (String)object16 + p[217] + n5 + ')' + string10 + string3 : (String)object16 + p[218] + n5 + ')' + string3;
                        object16 = p[219];
                        n5 = 128;
                        string9 = p[220];
                        string10 = ((jr_0)((Object)iterator)).b().c();
                        bl29 = false;
                        object17 = iterator;
                        string3 = string9 + p[221];
                        bl6 = false;
                        stringArray[2] = v.b(((jr_0)object17).b().a()) ? (String)object16 + p[222] + n5 + ')' + string10 + string3 : (String)object16 + p[223] + n5 + ')' + string3;
                        object16 = p[224];
                        n5 = 64;
                        string9 = p[225];
                        string10 = ((jr_0)((Object)iterator)).b().c();
                        bl29 = false;
                        object17 = iterator;
                        string3 = string9 + p[226];
                        bl6 = false;
                        stringArray[3] = v.b(((jr_0)object17).b().a()) ? (String)object16 + p[227] + n5 + ')' + string10 + string3 : (String)object16 + p[228] + n5 + ')' + string3;
                        object16 = iterator;
                        String string11 = p[229];
                        string9 = p[230];
                        boolean bl30 = false;
                        String string12 = ((jr_0)object16).b().a();
                        stringArray[4] = ew.a((Object)string12, (Object)p[231]) || ew.a((Object)string12, (Object)p[232]) ? string11 + p[233] + string9 : string11 + p[234] + ((jr_0)object16).b().e() + p[235] + string9;
                        object16 = iterator;
                        string11 = p[236];
                        boolean bl31 = false;
                        stringArray[5] = p[237] + string11 + ')';
                        object15 = aR.d(((jr_0)((Object)iterator)).a(kL.i, stringArray));
                        bl25 = false;
                        Iterator iterator8 = iterator = object6;
                        boolean bl32 = false;
                        object6.addBatch(object15.toString());
                        object6 = iterator;
                        object15 = gZ2;
                        bl25 = false;
                        iterator = object9;
                        boolean bl33 = false;
                        String[] stringArray2 = new String[4];
                        object16 = iterator;
                        string11 = p[238];
                        bl31 = false;
                        stringArray2[0] = ew.a((Object)((jr_0)object16).b().a(), (Object)p[239]) ? string11 + p[240] : string11 + p[241];
                        object16 = p[242];
                        int n6 = 16;
                        bl31 = false;
                        if (ew.a((Object)((jr_0)((Object)iterator)).b().a(), (Object)p[243])) {
                            string = (String)object16 + p[244];
                        } else {
                            String string13 = p[245];
                            string = (String)object16 + ' ' + string13 + '(' + n6 + p[246];
                        }
                        stringArray2[1] = string;
                        object16 = p[247];
                        String string14 = p[248];
                        bl31 = false;
                        String string15 = ((jr_0)((Object)iterator)).b().a();
                        stringArray2[2] = ew.a((Object)string15, (Object)p[249]) || ew.a((Object)string15, (Object)p[250]) ? (String)object16 + p[251] + string14 : (String)object16 + p[252] + ((jr_0)((Object)iterator)).b().e() + p[253] + string14;
                        object16 = iterator;
                        string14 = p[254];
                        bl31 = false;
                        stringArray2[3] = p[255] + string14 + ')';
                        object15 = aR.d(((jr_0)((Object)iterator)).a(kL.h, stringArray2));
                        bl25 = false;
                        Iterator iterator9 = iterator = object6;
                        boolean bl34 = false;
                        object6.addBatch(object15.toString());
                        try {
                            object6 = w2.a(statement);
                        }
                        catch (Exception exception) {
                            w2.a(exception);
                            object6 = iv_0.a;
                        }
                        boolean bl35 = litebans.w.a(this, (ch)object7, (jr_0)object9, false, false, 12, null);
                        this.o();
                        ((gZ)object8).e().a(() -> w.a(this, bl35), 200L);
                        this.y = null;
                        if (bl10 && eG2.aS()) {
                            litebans.w.a(this, (ch)object7, 0L, true, 2, null);
                        }
                        object8 = i1.b((double)(System.nanoTime() - l3) / 1000.0 / 1000.0);
                        n_0 n_02 = this;
                        object9 = p[256] + (String)object8 + p[257];
                        bl10 = false;
                        n_02.a.getLogger().info((String)object9);
                        object7 = iv_0.a;
                    }
                    catch (Throwable throwable4) {
                        throwable3 = throwable4;
                        throw throwable4;
                    }
                    finally {
                        bt_0.a(closeable, throwable3);
                    }
                    object2 = iv_0.a;
                }
                catch (Throwable throwable5) {
                    throwable2 = throwable5;
                    throw throwable5;
                }
                finally {
                    f_.a(autoCloseable2, throwable2);
                }
                object = iv_0.a;
            }
            catch (Throwable throwable6) {
                throwable = throwable6;
                throw throwable6;
            }
            finally {
                f_.a(autoCloseable, throwable);
            }
            iv_02 = iv_0.a;
        } else {
            iv_02 = null;
        }
    }

    public static /* synthetic */ void a(w w2, long l3, boolean bl, boolean bl2, boolean bl3, int n, Object object) {
        if ((n & 1) != 0) {
            l3 = System.nanoTime();
        }
        if ((n & 2) != 0) {
            bl = true;
        }
        if ((n & 4) != 0) {
            bl2 = true;
        }
        if ((n & 8) != 0) {
            bl3 = true;
        }
        w2.a(l3, bl, bl2, bl3);
    }

    public final long b(boolean bl) {
        long l3 = System.currentTimeMillis();
        if (bl) {
            return l3;
        }
        long l5 = this.p().f().aK();
        if (this.p().f().v()) {
            TimeZone timeZone = TimeZone.getTimeZone(this.w);
            Calendar calendar = Calendar.getInstance(timeZone);
            long l7 = calendar.getTimeInMillis();
            long l8 = l5 + (l7 + (long)timeZone.getOffset(l7));
            return l8;
        }
        return l3 + l5;
    }

    public static /* synthetic */ long a(w w2, boolean bl, int n, Object object) {
        if ((n & 1) != 0) {
            bl = false;
        }
        return w2.b(bl);
    }

    public final void a(@NotNull ch ch2, long l3, boolean bl) {
        Object object;
        char stringArray7;
        CharSequence charSequenceArray6;
        int n;
        eG eG2 = this.p().f();
        String string = eG2.aw();
        String string2 = eG2.aG();
        Object object2 = kL.f;
        CharSequence charSequence2 = p[376];
        boolean bl2 = false;
        object2 = aR.e(p[377] + charSequence2 + p[378] + object2);
        charSequence2 = p[379];
        ch ch3 = ch2;
        bl2 = false;
        Object object3 = new CharSequence[]{aR.d((String)object2), charSequence2};
        boolean c10 = false;
        CharSequence[] charSequenceArray = object3;
        boolean stringArray4 = false;
        int n2 = charSequenceArray.length;
        for (n = 0; n < n2; ++n) {
            CharSequence charSequence;
            charSequenceArray6 = charSequence = charSequenceArray[n];
            stringArray7 = '\u0000';
            if (charSequenceArray6.length() > 0) continue;
            String string3 = p[380];
            throw new IllegalArgumentException(string3.toString());
        }
        object2 = ch3.c(aR.d(aR.e(aR.b((String)object2) + p[381] + charSequence2)));
        boolean bl4 = false;
        object3 = object = object2;
        boolean stringBuilder = false;
        ((bT)object2).a(string2);
        ResultSet resultSet = eS.d((bT)object);
        try {
            if (!resultSet.next()) {
                boolean bl3;
                int n3;
                object2 = kL.f;
                String[] stringArray = (String[])p[382];
                ch3 = ch2;
                boolean bl6 = false;
                object3 = stringArray;
                char object5 = ',';
                boolean bl5 = false;
                Object bl23 = object3;
                n = 0;
                n2 = 0;
                for (n3 = 0; n3 < bl23.length(); ++n3) {
                    char c;
                    stringArray7 = c = bl23.charAt(n3);
                    bl3 = false;
                    if (!(stringArray7 == object5)) continue;
                    ++n2;
                }
                int n4 = n2;
                object3 = p[383];
                if (n4 > 0) {
                    StringBuilder object62 = new StringBuilder(n4 * 2);
                    Iterable iterable = new eI(0, n4);
                    boolean stringArray6 = false;
                    Iterator iterator = iterable.iterator();
                    while (iterator.hasNext()) {
                        n3 = n2 = ((i5)iterator).b();
                        boolean bl7 = false;
                        object62.append(p[384]);
                    }
                    object3 = bz.b(object62.toString(), 1);
                }
                Object object4 = object2;
                boolean bl8 = false;
                object2 = ch3.c(aR.d(aR.e(p[385] + object4 + '(' + stringArray + p[386] + (CharSequence)object3 + ')')));
                stringArray = new String[]{string, string2};
                bl6 = false;
                Object object6 = object3 = object2;
                bl8 = false;
                String[] stringArray2 = stringArray;
                boolean bl9 = false;
                n3 = stringArray2.length;
                for (n2 = 0; n2 < n3; ++n2) {
                    String string4;
                    String string5 = string4 = stringArray2[n2];
                    bl3 = false;
                    ((bT)object2).a(string5);
                }
                eS.d((bT)object3);
            } else {
                object2 = resultSet.getString(p[387]);
                if (!ew.a((Object)string, object2)) {
                    int n5;
                    this.p().a((Object)(p[388] + (String)object2 + p[389] + string + '\"'));
                    kL[] kLArray = kL.f;
                    boolean bl12 = false;
                    kLArray = aR.c(aR.e(p[390] + kLArray), p[391]);
                    String[] stringArray = (String[])p[392];
                    ch3 = ch2;
                    int n6 = 0;
                    CharSequence[] charSequenceArray3 = new CharSequence[]{aR.d((String)kLArray), stringArray};
                    charSequenceArray3 = charSequenceArray3;
                    boolean bl10 = false;
                    CharSequence[] charSequenceArray4 = charSequenceArray3;
                    n = 0;
                    int n7 = charSequenceArray4.length;
                    for (n2 = 0; n2 < n7; ++n2) {
                        CharSequence charSequence = charSequenceArray6 = charSequenceArray4[n2];
                        boolean bl11 = false;
                        if (charSequence.length() > 0) continue;
                        String string6 = p[393];
                        throw new IllegalArgumentException(string6.toString());
                    }
                    kLArray = ch3.c(aR.d(aR.e(aR.b((String)kLArray) + p[394] + stringArray)));
                    stringArray = new String[]{string, string2};
                    n6 = 0;
                    kL[] kLArray2 = kLArray;
                    Object object7 = kLArray2;
                    boolean bl13 = false;
                    String[] stringArray3 = stringArray;
                    n2 = 0;
                    int n8 = stringArray3.length;
                    for (n7 = 0; n7 < n8; ++n7) {
                        String string7;
                        String string8 = string7 = stringArray3[n7];
                        n5 = 0;
                        kLArray.a(string8);
                    }
                    eS.d((bT)kLArray2);
                    for (kL kL2 : kL.values()) {
                        boolean bl14;
                        CharSequence charSequence;
                        int n9;
                        if (!kL2.a()) continue;
                        object7 = kL2;
                        boolean bl15 = false;
                        object7 = aR.c(aR.e(p[395] + object7), p[396]);
                        String[] stringArray5 = (String[])p[397];
                        ch3 = ch2;
                        boolean bl16 = false;
                        CharSequence[] charSequenceArray5 = new CharSequence[]{aR.d((String)object7), stringArray5};
                        boolean bl17 = false;
                        CharSequence[] charSequenceArray7 = charSequenceArray5;
                        boolean bl18 = false;
                        n5 = charSequenceArray7.length;
                        for (n9 = 0; n9 < n5; ++n9) {
                            CharSequence charSequence3;
                            charSequence = charSequence3 = charSequenceArray7[n9];
                            boolean bl19 = false;
                            if (charSequence.length() > 0) continue;
                            String string9 = p[398];
                            throw new IllegalArgumentException(string9.toString());
                        }
                        object7 = ch3.c(aR.d(aR.e(aR.b((String)object7) + p[399] + stringArray5)));
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
                            ((bT)object7).a((String)charSequence4);
                        }
                        eS.d((bT)charSequenceArray5);
                        object7 = kL2;
                        boolean bl21 = false;
                        object7 = aR.c(aR.e(p[400] + object7), p[401]);
                        String[] stringArray8 = (String[])p[402];
                        ch3 = ch2;
                        bl16 = false;
                        charSequenceArray5 = new CharSequence[]{aR.d((String)object7), stringArray8};
                        boolean bl22 = false;
                        CharSequence[] charSequenceArray9 = charSequenceArray5;
                        boolean bl23 = false;
                        n5 = charSequenceArray9.length;
                        for (n9 = 0; n9 < n5; ++n9) {
                            CharSequence charSequence5;
                            charSequence = charSequence5 = charSequenceArray9[n9];
                            boolean bl24 = false;
                            if (charSequence.length() > 0) continue;
                            String string10 = p[403];
                            throw new IllegalArgumentException(string10.toString());
                        }
                        object7 = ch3.c(aR.d(aR.e(aR.b((String)object7) + p[404] + stringArray8)));
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
                            ((bT)object7).a((String)charSequence6);
                        }
                        eS.d((bT)charSequenceArray5);
                    }
                }
            }
            if (l3 <= 0L) {
                this.a(ch2, bl);
            } else {
                this.a.a(() -> w.a(this, ch2, bl), l3);
            }
        }
        catch (Exception exception) {
            if (exception instanceof SQLException) {
                this.a(exception);
            }
            q_0.a(this.p(), exception, 0, 2, null);
        }
    }

    public static /* synthetic */ void a(w w2, ch ch2, long l3, boolean bl, int n, Object object) {
        if ((n & 2) != 0) {
            l3 = 0L;
        }
        if ((n & 4) != 0) {
            bl = false;
        }
        w2.a(ch2, l3, bl);
    }

    private final void a(String string, long l3) {
        boolean bl = false;
        if (ew.a((Object)string, (Object)p[408]) && this.e) {
            bl = m_0.b.a(this);
        }
        if (!bl) {
            this.a(this.p());
            litebans.w.a(this, l3, false, false, false, 14, null);
        }
    }

    static /* synthetic */ void a(w w2, String string, long l3, int n, Object object) {
        if ((n & 2) != 0) {
            l3 = System.nanoTime();
        }
        w2.a(string, l3);
    }

    public final void a(@NotNull q_0 var1_1) {
        block53: {
            block52: {
                var2_2 = System.nanoTime();
                this.b = null;
                var4_3 = var1_1.f();
                var5_4 = var4_3.aF();
                var6_5 = this.b(var1_1);
                var7_6 = this.a(var1_1, var5_4);
                if (var7_6 == null) {
                    var8_7 = this;
                    var9_9 = var6_5;
                    var40_11 = new StringBuilder().append(litebans.w.p[409]).append(var5_4).append(litebans.w.p[410]);
                    var10_13 = false;
                    var11_15 = var9_9;
                    var12_17 = new ArrayList<E>(ll.a((Iterable)var9_9, 10));
                    var13_20 = false;
                    for (T var15_28 : var11_15) {
                        var16_31 = (jP)var15_28;
                        var41_27 = var12_17;
                        var17_32 = false;
                        var41_27.add(var16_31.d());
                    }
                    var9_9 = var40_11.append((List)var12_17).toString();
                    var10_13 = false;
                    var8_7.a.getLogger().severe((String)var9_9);
                    return;
                }
                v0 = litebans.w.a(this, var7_6, false, false, 6, null);
                if (v0 == null) {
                    return;
                }
                var8_8 = v0;
                var9_10 = var4_3.q();
                var11_16 = new String[]{litebans.w.p[411], litebans.w.p[412]};
                var10_14 = a8.a((Object[])var11_16).contains(var5_4);
                if (!bz.c((CharSequence)var9_10, ':', false, 2, null)) {
                    var11_16 = this.p().f().aF();
                    var12_18 = false;
                    if (litebans.w.v.b((String)var11_16)) {
                        v1 = var9_10 + litebans.w.p[413];
                    } else {
                        var13_21 = litebans.w.v;
                        var14_23 = false;
                        v1 = ew.a(var11_16, (Object)litebans.w.p[414]) != false || ew.a(var11_16, (Object)litebans.w.p[415]) != false ? var9_10 + litebans.w.p[416] : var9_10;
                    }
                    var9_10 = v1;
                }
                var11_16 = var5_4;
                switch (var11_16.hashCode()) {
                    case -894935028: {
                        if (!var11_16.equals(litebans.w.p[417])) {
                            ** break;
                        }
                        break block52;
                    }
                    case 3274: {
                        if (var11_16.equals(litebans.w.p[418])) break;
                        ** break;
                    }
                    case 106616951: {
                        if (!var11_16.equals(litebans.w.p[419])) {
                            ** break;
                        }
                        break block53;
                    }
                }
                var13_21 = this.a.getDataFolder();
                var14_24 = litebans.w.p[420];
                var15_29 = false;
                var9_10 = new File((File)var13_21, var14_24).getAbsolutePath();
                ** break;
            }
            var13_21 = this.a.getDataFolder();
            var14_25 = litebans.w.p[421];
            var15_29 = false;
            var9_10 = new File((File)var13_21, var14_25).getPath();
            this.z = new co(this.a);
            ** break;
        }
        var5_4 = litebans.w.p[422];
lbl71:
        // 7 sources

        var9_10 = this.z.a(var9_10);
        var11_16 = null;
        var11_16 = litebans.w.p[423] + var5_4 + litebans.w.p[424] + var9_10;
        if (!var10_14) {
            var11_16 = (String)var11_16 + '/' + var4_3.w();
        }
        if (((CharSequence)(var12_19 = var4_3.aN())).length() > 0) {
            if (!var10_14 && !bz.a((CharSequence)var12_19, '?', false, 2, null)) {
                var12_19 = '?' + var12_19;
            }
            if (!(ew.a((Object)var5_4, (Object)litebans.w.p[425]) && (ew.a((Object)var12_19, (Object)litebans.w.p[426]) || ew.a((Object)var12_19, (Object)litebans.w.p[427])) || ew.a((Object)var5_4, (Object)litebans.w.p[428]))) {
                var11_16 = (String)var11_16 + var12_19;
            }
        }
        var13_21 = var11_16;
        var14_26 = bz.a((String)var13_21, litebans.w.p[429], litebans.w.p[430], false, 4, null);
        if (ew.a((Object)var5_4, (Object)litebans.w.p[431])) {
            var11_16 = (String)var11_16 + litebans.w.p[432];
        }
        var15_30 = Math.max(2000L, var4_3.Y());
        var17_33 = litebans.w.a(this, new h3(this.a), null, false, false, 12, null);
        var18_34 = var17_33 != false ? var15_30 : 0x7FFFFFFFL;
        var20_35 = litebans.w.v;
        var21_37 = false;
        if (ew.a((Object)var5_4, (Object)litebans.w.p[433]) != false || ew.a((Object)var5_4, (Object)litebans.w.p[434]) != false) {
            var18_34 = Math.min(var18_34, 2147483L);
        }
        var20_35 = var1_1;
        var21_37 = false;
        if (var20_35.g()) {
            var40_12 = var20_35;
            var22_40 = false;
            var40_12.a(var11_16);
        }
        var20_35 = var1_1;
        var21_37 = false;
        if (var20_35.g()) {
            var40_12 = var20_35;
            var22_40 = false;
            var40_12.a((Object)this.a.i().b());
        }
        var20_35 = this;
        var21_38 = litebans.w.p[435];
        var22_40 = false;
        if (!litebans.w.c((w)var20_35).get()) {
            var23_46 = (n_0)var20_35;
            var24_54 = false;
            var23_46.a.getLogger().info((String)var21_38);
        }
        try {
            kI.a(this.a.getLogger());
            var20_35 = new aB();
            var20_35.f(litebans.w.p[436]);
            var20_35.g((String)var11_16);
            var21_38 = var20_35;
            var22_41 = litebans.w.p[437];
            var23_46 = var4_3.aW();
            var24_54 = false;
            var26_67 = var25_62 = var21_38;
            var27_70 = false;
            var21_38.a((String)var22_41, var23_46);
            var21_38 = var25_62;
            var22_41 = litebans.w.p[438];
            var23_46 = var4_3.a9();
            var24_54 = false;
            var26_67 = var25_62 = var21_38;
            var27_70 = false;
            var21_38.a((String)var22_41, var23_46);
            var21_38 = var25_62;
            var22_41 = litebans.w.p[439];
            var23_46 = var15_30;
            var24_54 = false;
            var25_62 = var21_38;
            var26_67 = var23_46.toString();
            var27_70 = false;
            var29_78 = var28_73 = var25_62;
            var30_83 = false;
            var25_62.a((String)var22_41, var26_67);
            var21_38 = var28_73;
            var22_41 = litebans.w.p[440];
            var23_46 = var18_34;
            var24_54 = false;
            var25_62 = var21_38;
            var26_67 = var23_46.toString();
            var27_70 = false;
            var29_78 = var28_73 = var25_62;
            var30_83 = false;
            var25_62.a((String)var22_41, var26_67);
            var21_38 = var28_73;
            var22_41 = litebans.w.p[441];
            var23_46 = litebans.w.p[442];
            var24_54 = false;
            var26_67 = var25_62 = var21_38;
            var27_70 = false;
            var21_38.a((String)var22_41, var23_46);
            var21_38 = var25_62;
            var22_41 = litebans.w.p[443];
            var23_46 = litebans.w.p[444];
            var24_54 = true;
            var25_63 = false;
            var26_67 = var21_38;
            var27_71 = litebans.w.p[445];
            var28_73 = litebans.w.p[446];
            var29_79 = false;
            var31_86 = var30_84 = var26_67;
            var32_90 = false;
            var26_67.a((String)var27_71, var28_73);
            var26_67 = var21_38;
            var27_71 = litebans.w.p[447];
            var28_74 = false;
            var30_84 = var29_80 = var26_67;
            var31_87 = false;
            var26_67.a((String)var27_71, var22_41);
            var26_67 = var29_80;
            var27_71 = litebans.w.p[448];
            var28_74 = false;
            var30_84 = var29_80 = var26_67;
            var31_87 = false;
            var26_67.a((String)var27_71, var22_41);
            var26_67 = var29_80;
            var27_71 = litebans.w.p[449];
            var28_74 = false;
            var30_84 = var29_80 = var26_67;
            var31_87 = false;
            var26_67.a((String)var27_71, var23_46);
            var21_38 = var29_80;
            var22_41 = litebans.w.p[450];
            var23_47 = false;
            var24_55 = var21_38;
            var25_64 = litebans.w.p[451];
            var26_68 = false;
            var28_75 = var27_71 = var24_55;
            var29_81 = 0;
            var24_55.a((String)var22_41, var25_64);
            var21_38 = var27_71;
            var22_41 = new String[]{litebans.w.p[452], litebans.w.p[453], litebans.w.p[454], litebans.w.p[455], litebans.w.p[456], litebans.w.p[457]};
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
                var35_95 = litebans.w.p[458];
                var36_96 = false;
                var38_98 = var37_97 = var34_94;
                var39_99 = false;
                var34_94.a(var32_91, var35_95);
            }
            var21_38 = var24_55;
            var22_41 = new String[]{litebans.w.p[459], litebans.w.p[460]};
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
                var35_95 = litebans.w.p[461];
                var36_96 = false;
                var38_98 = var37_97 = var34_94;
                var39_99 = false;
                var34_94.a(var32_92, var35_95);
            }
            var20_35.d(var15_30);
            var20_35.f(Math.min(30000L, var15_30));
            if (var4_3.V() != var4_3.a8()) {
                var20_35.e(var4_3.aX());
            }
            var20_35.a(Math.max(0, var4_3.V()));
            var20_35.b(Math.max(1, var4_3.a8()));
            var20_35.g(Math.max(0L, var4_3.l()));
            var21_38 = this;
            var22_42 = false;
            var23_48 = var21_38.a.x();
            var24_56 = false;
            var25_65 = Math.max(20, var20_35.f() + 8);
            var23_48.setMaximumPoolSize(var25_65);
            var23_48.setRejectedExecutionHandler(new dv((w)var21_38));
            var23_48.setCorePoolSize(Math.min(var25_65, var20_35.i() + 1));
            var23_48.setKeepAliveTime(4L, TimeUnit.MINUTES);
            if (ew.a((Object)var5_4, (Object)litebans.w.p[462])) {
                var20_35.d(litebans.w.p[463]);
            } else if (ew.a((Object)var5_4, (Object)litebans.w.p[464])) {
                var20_35.h(litebans.w.p[465]);
            }
            var20_35.a(new ev_0((Driver)var8_8, (aB)var20_35));
            if (this.a.t() == 1) {
                try {
                    v2 = this.a.i();
                    ew.b(v2, litebans.w.p[466]);
                    var20_35.a(((k1)v2).a(this.a));
                }
                catch (Throwable var21_39) {
                    this.a(var21_39);
                }
            }
            this.b = new an((aB)var20_35);
        }
        catch (Exception var20_36) {
            var21_38 = this;
            var22_43 = litebans.w.p[467] + var14_26 + litebans.w.p[468];
            var23_49 = false;
            var21_38.a.getLogger().severe(var22_43);
            if (!ew.a((Object)var5_4, (Object)litebans.w.p[469]) && bz.b((CharSequence)var4_3.aW()) && bz.b((CharSequence)var4_3.a9())) {
                var21_38 = this;
                var22_43 = litebans.w.p[470];
                var23_49 = false;
                var21_38.a.getLogger().severe(var22_43);
            }
            var21_38 = var20_36.getMessage();
            v3 = var20_36.getCause();
            v4 = var22_43 = v3 != null ? v3.getMessage() : null;
            if (var22_43 == null || var21_38 == null || !bz.a((CharSequence)var21_38, (CharSequence)var22_43, false, 2, null)) {
                var23_50 = this;
                var24_57 = litebans.w.p[471] + var20_36.getMessage();
                var25_66 = 0;
                var23_50.a.getLogger().severe(var24_57);
            }
            var23_51 = litebans.w.p[472];
            var24_58 = var20_36;
            var25_66 = 16;
            while (var25_66-- > 0 && var24_58.getCause() != null) {
                v5 = var24_58.getLocalizedMessage();
                if (v5 == null) {
                    v5 = litebans.w.p[473];
                }
                if (((CharSequence)(var26_69 = v5)).length() > 0 && (bz.a((CharSequence)var26_69, (CharSequence)litebans.w.p[474], false, 2, null) || bz.a((CharSequence)var26_69, (CharSequence)litebans.w.p[475], false, 2, null))) continue;
                if (((CharSequence)var26_69).length() == 0 && (v6 = var24_58.getMessage()) == null) {
                    v6 = var26_69 = litebans.w.p[476];
                }
                if (var24_58 instanceof UnknownHostException) {
                    var26_69 = litebans.w.p[477] + var26_69;
                }
                if (!ew.a((Object)var26_69, (Object)litebans.w.p[478]) && ((CharSequence)var26_69).length() > 0 && !bz.a((CharSequence)var23_51, (CharSequence)var26_69, false, 2, null)) {
                    var27_72 = this;
                    var28_77 = litebans.w.p[479] + var26_69;
                    var29_82 = false;
                    var27_72.a.getLogger().severe(var28_77);
                }
                if ((v7 = var24_58.getMessage()) == null) {
                    v7 = litebans.w.p[480];
                }
                if (!(((CharSequence)(var26_69 = v7)).length() > 0)) continue;
                if (bz.b(var26_69, litebans.w.p[481], false, 2, null)) {
                    this.a(var4_3);
                    break;
                }
                if (bz.a((CharSequence)var26_69, (CharSequence)litebans.w.p[482], false, 2, null)) {
                    this.z();
                    break;
                }
                var23_51 = var26_69;
            }
            if (var1_1.a(1)) {
                var20_36.printStackTrace();
            }
            return;
        }
        var20_35 = i1.b((double)(System.nanoTime() - var2_2) / 1000.0 / 1000.0);
        if (var1_1.a(1)) {
            var21_38 = this;
            var22_44 = litebans.w.p[483] + var14_26 + litebans.w.p[484] + (String)var20_35 + litebans.w.p[485];
            var23_52 = false;
            if (!litebans.w.c((w)var21_38).get()) {
                var24_59 = (n_0)var21_38;
                var25_65 = 0;
                var24_59.a.getLogger().info((String)var22_44);
            }
        } else {
            var21_38 = this;
            var22_44 = litebans.w.p[486] + litebans.w.v.c(var5_4) + litebans.w.p[487] + (String)var20_35 + litebans.w.p[488];
            var23_52 = false;
            if (!litebans.w.c((w)var21_38).get()) {
                var24_60 = (n_0)var21_38;
                var25_65 = 0;
                var24_60.a.getLogger().info((String)var22_44);
            }
        }
        this.d.set(true);
        if (ew.a((Object)var5_4, (Object)litebans.w.p[489])) {
            try {
                var22_44 = this.a.getDataFolder();
                var23_53 = litebans.w.p[490];
                var24_61 = false;
                var21_38 = new File((File)var22_44, var23_53);
                if (!var21_38.exists() || gg_0.d() == null) {
                    var22_44 = this.a.getDataFolder();
                    var23_53 = litebans.w.p[491];
                    var24_61 = false;
                    var21_38 = new File((File)var22_44, var23_53);
                }
                var22_44 = this.a.a((File)var21_38).g();
                var22_44.b(litebans.w.p[492], var4_3.aW()).b(litebans.w.p[493], var4_3.a9()).h();
            }
            catch (Exception var22_45) {
                var22_45.printStackTrace();
            }
        }
    }

    private final void a(eG eG2) {
        n_0 n_02 = this;
        String string = p[494] + eG2.w() + p[495];
        boolean bl = false;
        n_02.a.getLogger().severe(string);
        n_02 = this;
        string = p[496] + eG2.w() + p[497];
        bl = false;
        n_02.a.getLogger().severe(string);
        if (ew.a((Object)eG2.w(), (Object)p[498])) {
            n_02 = this;
            string = p[499];
            bl = false;
            n_02.a.getLogger().severe(string);
        }
    }

    public final jP a(@NotNull q_0 q_02, @NotNull String string) {
        Object v0;
        block1: {
            Iterable iterable = this.b(q_02);
            for (Object t2 : iterable) {
                jP jP2 = (jP)t2;
                boolean bl = false;
                if (!ew.a((Object)jP2.d(), (Object)string)) continue;
                v0 = t2;
                break block1;
            }
            v0 = null;
        }
        return v0;
    }

    private final void a(String[] stringArray, Statement statement, kL kL2, String string) {
        int n;
        String string2 = null;
        string2 = p[542];
        if (bz.b(string, p[543], false, 2, null) || bz.b(string, p[544], false, 2, null) || bz.b(string, p[545], false, 2, null)) {
            string2 = p[546];
        }
        Object object = stringArray;
        boolean bl = false;
        Object object2 = object;
        Collection collection = new ArrayList(((String[])object).length);
        boolean bl2 = false;
        int n2 = ((String[])object2).length;
        for (n = 0; n < n2; ++n) {
            String string3;
            String string4 = string3 = object2[n];
            Collection collection2 = collection;
            boolean bl3 = false;
            collection2.add(string2 + p[547] + kL2 + '_' + string4 + p[548] + kL2 + p[549] + string4 + ')');
        }
        object = (List)collection;
        bl = false;
        object2 = object.iterator();
        while (object2.hasNext()) {
            collection = object2.next();
            String string5 = (String)((Object)collection);
            n = 0;
            statement.execute(string5);
        }
    }

    public final void o() {
        this.a(arg_0 -> w.a(this, arg_0));
    }

    public final Object a(@NotNull jP jP2, @NotNull File file, boolean bl) {
        if (!file.exists()) {
            return null;
        }
        String string = q_0.j.b(kd_0.a(file));
        if (jP2.c() != null && !ew.a((Object)jP2.c(), (Object)string)) {
            file.delete();
            throw new iv(file, jP2.c(), string);
        }
        Object object = new URL[]{file.toURI().toURL(), w.class.getProtectionDomain().getCodeSource().getLocation().toURI().toURL()};
        URLClassLoader uRLClassLoader = new URLClassLoader((URL[])object, Driver.class.getClassLoader());
        object = uRLClassLoader.loadClass(jP2.b());
        if (bl) {
            return ((Class)object).getConstructor(new Class[0]).newInstance(new Object[0]);
        }
        return object;
    }

    private static final q_0 a(w w2) {
        return (q_0)w2.a.a(q_0.class);
    }

    private static final o b(w w2) {
        return (o)w2.a.a(o.class);
    }

    private static final List d(w w2) {
        return w2.a.i().b(w2.a.getName());
    }

    private static final List a(eE eE2) {
        eE eE3 = eE2;
        return (List)eE3.a();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static final void a(jv_0 jv_02, w w2, eo_0 eo_02) {
        fo_0 fo_02 = fg_0.a;
        ew.a(jv_02);
        jv_0 jv_03 = jv_02;
        boolean bl = false;
        try {
            fo_02.b().set(jv_03);
            boolean bl2 = false;
            try {
                w w3 = w2;
                boolean bl3 = false;
                try {
                    ch ch2 = w3.f();
                    Closeable closeable = ch2;
                    Throwable throwable = null;
                    try {
                        Object object = (ch)closeable;
                        boolean bl4 = false;
                        eo_02.a(ch2);
                        object = iv_0.a;
                    }
                    catch (Throwable throwable2) {
                        throwable = throwable2;
                        throw throwable2;
                    }
                    finally {
                        bt_0.a(closeable, throwable);
                    }
                }
                catch (SQLException sQLException) {
                    if (!w3.b(sQLException)) {
                        throw sQLException;
                    }
                }
            }
            catch (bi bi2) {
                jv_0 jv_04 = jv_02;
                CharSequence charSequence = String.valueOf(bi2.a());
                boolean bl5 = false;
                fo_0.a(fg_0.a, jv_04, charSequence, null, 4, null);
            }
            catch (SQLException sQLException) {
                w2.a(sQLException);
            }
        }
        finally {
            fo_02.b().remove();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static final void a(w stringArray, boolean bl) {
        block51: {
            boolean bl2;
            ch ch2;
            boolean bl3;
            Object object;
            Throwable throwable;
            Closeable closeable;
            ch ch3;
            boolean bl4;
            String[] stringArray2;
            String[] stringArray3 = stringArray;
            boolean bl5 = false;
            try {
                stringArray2 = stringArray3;
                bl4 = false;
                try {
                    ch3 = stringArray2.f();
                    closeable = ch3;
                    throwable = null;
                    try {
                        object = (ch)closeable;
                        bl3 = false;
                        ch2 = ch3;
                        bl2 = false;
                        if (ch2.a()) {
                            ew.b(ch2, p[550]);
                            AutoCloseable autoCloseable = ((gZ)ch2).f();
                            Throwable throwable2 = null;
                            try {
                                Object object2 = (Statement)autoCloseable;
                                boolean bl6 = false;
                                if (!bl) {
                                    String[] stringArray4 = stringArray3;
                                    boolean bl7 = false;
                                    if (stringArray4.A() <= 674) {
                                        CharSequence[] charSequenceArray;
                                        String[] stringArray5;
                                        dy_0 dy_02 = new dy_0();
                                        dy_02.a = p[551];
                                        if (v.b(stringArray4.p().f().aF())) {
                                            try {
                                                stringArray5 = stringArray4;
                                                boolean bl8 = false;
                                                try {
                                                    charSequenceArray = stringArray5.f();
                                                    Closeable closeable2 = (Closeable)charSequenceArray;
                                                    Throwable throwable3 = null;
                                                    try {
                                                        String string;
                                                        String string2;
                                                        ch object3 = (ch)closeable2;
                                                        boolean object4 = false;
                                                        String[] stringArray6 = charSequenceArray;
                                                        boolean bl9 = false;
                                                        ResultSet resultSet = eS.d(stringArray6.c((CharSequence)p[552]));
                                                        dy_0 dy_03 = dy_02;
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
                                                            string = p[553];
                                                        }
                                                        dy_03.a = string;
                                                        iv_0 iv_02 = iv_0.a;
                                                    }
                                                    catch (Throwable throwable4) {
                                                        throwable3 = throwable4;
                                                        throw throwable4;
                                                    }
                                                    finally {
                                                        bt_0.a(closeable2, throwable3);
                                                    }
                                                }
                                                catch (SQLException sQLException) {
                                                    if (!stringArray5.b(sQLException)) {
                                                        throw sQLException;
                                                    }
                                                }
                                            }
                                            catch (SQLException sQLException) {
                                                stringArray4.a(sQLException);
                                            }
                                        }
                                        String[] stringArray7 = new String[]{p[554], p[555], p[556], p[557], p[558], p[559], p[560], p[561], p[562]};
                                        stringArray5 = stringArray7;
                                        charSequenceArray = new String[]{p[563], p[564], p[565]};
                                        stringArray7 = charSequenceArray;
                                        try {
                                            for (CharSequence charSequence : kL.values()) {
                                                if (((kL)charSequence).a()) {
                                                    ((w)stringArray4).a(stringArray5, (Statement)object2, (kL)charSequence, (String)dy_02.a);
                                                    continue;
                                                }
                                                CharSequence charSequence2 = charSequence;
                                                boolean bl12 = false;
                                                if (!(charSequence2 == kL.g)) continue;
                                                ((w)stringArray4).a(stringArray7, (Statement)object2, (kL)charSequence, (String)dy_02.a);
                                            }
                                        }
                                        catch (SQLException sQLException) {
                                            q_0.a(stringArray4.p(), sQLException, 0, 2, null);
                                        }
                                    }
                                }
                                object2 = iv_0.a;
                            }
                            catch (Throwable throwable5) {
                                throwable2 = throwable5;
                                throw throwable5;
                            }
                            finally {
                                f_.a(autoCloseable, throwable2);
                            }
                        }
                        object = iv_0.a;
                    }
                    catch (Throwable throwable6) {
                        throwable = throwable6;
                        throw throwable6;
                    }
                    finally {
                        bt_0.a(closeable, throwable);
                    }
                }
                catch (SQLException sQLException) {
                    if (!stringArray2.b(sQLException)) {
                        throw sQLException;
                    }
                }
            }
            catch (Exception exception) {
                stringArray3.a(exception);
            }
            try {
                if (bl) break block51;
                stringArray2 = stringArray3;
                bl4 = false;
                try {
                    ch3 = stringArray2.f();
                    closeable = ch3;
                    throwable = null;
                    try {
                        object = (ch)closeable;
                        bl3 = false;
                        ch2 = ch3;
                        bl2 = false;
                        ch2.a(p[566], p[567], p[568], false, false);
                        object = iv_0.a;
                    }
                    catch (Throwable throwable7) {
                        throwable = throwable7;
                        throw throwable7;
                    }
                    finally {
                        bt_0.a(closeable, throwable);
                    }
                }
                catch (SQLException sQLException) {
                    if (!stringArray2.b(sQLException)) {
                        throw sQLException;
                    }
                }
            }
            catch (Throwable throwable8) {
                stringArray3.a(throwable8);
            }
        }
    }

    private static final void a(w w2, ch ch2, boolean bl) {
        w2.a(ch2, bl);
    }

    private static final iv_0 a(w w2, ch ch2) {
        Object object;
        Object object2;
        try {
            if (ch2.b()) {
                return iv_0.a;
            }
            object2 = eS.d(ch2.c((CharSequence)p[569]));
            object2.next();
            object = object2.getTimestamp(p[570]);
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeZone(TimeZone.getTimeZone(p[571]));
            calendar.setTime((Date)object);
            w2.q = (int)(w2.b(true) - calendar.getTimeInMillis());
            String string = jb_0.a();
            String string2 = jb_0.b();
            String string3 = p[572];
            Object object3 = kL.i;
            String[] stringArray = (String[])p[573];
            boolean bl = false;
            ResultSet resultSet = eS.c(ch2.c(aR.d(aR.a(aR.e(p[574] + stringArray + p[575] + object3), (Number)1))));
            if (resultSet.next()) {
                w2.o = resultSet.getInt(p[576]) > 0;
                w2.w = resultSet.getString(p[577]);
                if (!ew.a((Object)string2, (Object)resultSet.getString(p[578]))) {
                    object3 = kL.i;
                    boolean bl2 = false;
                    eS.b(ch2.c(aR.d(aR.c(aR.e(p[579] + object3), p[580] + string + p[581] + string2 + '\''))));
                }
            } else {
                boolean bl3;
                char c;
                int n;
                object3 = kL.i;
                stringArray = p[582];
                ch ch3 = ch2;
                bl = false;
                Object object4 = stringArray;
                char c10 = ',';
                boolean bl4 = false;
                String[] stringArray2 = object4;
                boolean bl5 = false;
                int n2 = 0;
                for (n = 0; n < stringArray2.length(); ++n) {
                    char c11 = c = stringArray2.charAt(n);
                    bl3 = false;
                    if (!(c11 == c10)) continue;
                    ++n2;
                }
                int n3 = n2;
                object4 = p[583];
                if (n3 > 0) {
                    StringBuilder stringBuilder = new StringBuilder(n3 * 2);
                    Iterable iterable = new eI(0, n3);
                    boolean bl6 = false;
                    Iterator iterator = iterable.iterator();
                    while (iterator.hasNext()) {
                        n = n2 = ((i5)iterator).b();
                        c = '\u0000';
                        stringBuilder.append(p[584]);
                    }
                    object4 = bz.b(stringBuilder.toString(), 1);
                }
                Object object5 = object3;
                bl4 = false;
                object3 = ch3.c(aR.d(aR.e(p[585] + object5 + '(' + stringArray + p[586] + object4 + ')')));
                stringArray = new String[]{string, string2, string3};
                bl = false;
                object5 = object4 = object3;
                bl4 = false;
                stringArray2 = stringArray;
                bl5 = false;
                n = stringArray2.length;
                for (n2 = 0; n2 < n; ++n2) {
                    String string4;
                    String string5 = string4 = stringArray2[n2];
                    bl3 = false;
                    ((bT)object3).a(string5);
                }
                eS.b((bT)object4);
            }
        }
        catch (Exception exception) {
            w2.a(exception);
        }
        if (w2.p().f().e() > 0 && !w2.o) {
            object2 = ch2.e().y();
            object = am.dc;
            boolean bl = false;
            fo_0.a(fg_0.a, (jv_0)object2, (CharSequence)object, null, 4, null);
        }
        return iv_0.a;
    }

    public static final /* synthetic */ String j() {
        return i;
    }

    public static final /* synthetic */ String g() {
        return x;
    }

    public static final /* synthetic */ String w() {
        return h;
    }

    static {
        c = 3000;
        litebans.w.r();
        v = new cJ(null);
        i = p[587] + lV.class.getName() + p[588];
        x = p[589] + lK.class.getName() + p[590];
        h = p[591] + bT.class.getName() + '.';
    }

    private static final void r() {
        p = new String[]{"UTC", "Database is slow! Establishing connection took ", " ", ".version", "SHA-512", "\u0001", "", "sort", "00", "01:", "Table upgrade checks ", "Connection is closed. Only open connections can be used to upgrade ", "", ":(?!(//))", "{}", "", "Interrupted during connection acquisition", "Unfortunately, a request has failed because your database server did not respond within ", " seconds. (Socket timeout)", "An unexpected database error has ", "max_connections in config.yml is smaller than 5 (max=", ")! This can cause connection pool exhaustion (\"Connection is not available, request timed out ...\") + ", "Unknown column '", "' in '", "Column '", "' not ", ": Column \"", "\" not found", "ALTER command denied to user ", "WARNING: config.yml was not loaded successfully, errors were encountered. Check startup logs for more ", "h2", "The database is read only", "[!!!] Database is read-only. This indicates that LiteBans does not have write access to its own database!", "Exception in exception handler", "Original exception:", "useSSL=false", "Database SSL connection support is disabled. Enabling SSL should fix this ", "Change \"useSSL=false\" to \"useSSL=true\" in config.yml, and then run \"litebans reload\" + ", "Your database user (", ") is lacking ALTER permission for the ", " database!", "Without this permission, LiteBans cannot upgrade the ", "Please add the necessary permissions!", "The required permissions are SELECT, CREATE, INSERT, UPDATE, DELETE, ALTER, ", "Executing full upgrade check in response to 'Unknown column' ", "litebans", "[!!!] An 'unknown column' exception likely indicates that tables could not be upgraded successfully - consider the following exception as a consequence of a startup error, not the original ", "", "**Connection pool exhaustion detected** (open=", ", max=", ", logins=", "There have been ", " API calls to prepareStatement() + ", "Be aware that plugins which use the LiteBans API incorrectly can create a connection leak, which inevitably leads to exhaustion after ", " connections have been ", "Plugin(s) which may be using LiteBans API: [", ", ", "Loading: ", "> ", ".jar", ".jar", "lib", ".jar", ".jar", "Download URL for ", ": ", "Downloading ", ".. + ", "Failed to download ", "Downloaded ", " ", "Something ", "What happened?", "Loaded ", "Failed to load ", "Attempting to recover from this error.. + ", "File removed: ", "Failed to load from ", "*", "SELECT ", " FROM ", "id", "name", "uuid", "[Sync] Server limit reached (", " servers). Resetting server ", "DROP TABLE ", "Main server thread is not permitted to perform database ", "", "Interrupted during connection", "SQLSTATE(08S01)", "Socket closed", "Connection is closed", "closed connection", "h2", "id", "", "pgsql", "h2", " SMALLINT NOT NULL", " TINYINT", " NOT NULL", "b", "pgsql", " BYTEA NOT NULL", "BINARY", "BLOB", ")NOT NULL", "id", "PRIMARY KEY(", "id", "sqlite", " INTEGER PRIMARY KEY AUTOINCREMENT", " SERIAL", "version", "", " NOT NULL", " VARCHAR(", " VARCHAR(", "build", "", " NOT NULL", " VARCHAR(", " VARCHAR(", "timezone", " DEFAULT '+00:00'", " NOT NULL", " VARCHAR(", " VARCHAR(", "accept", " DEFAULT 0", "pgsql", "h2", " SMALLINT NOT NULL", " TINYINT", " NOT NULL", "id", "PRIMARY KEY(", "id", "sqlite", " INTEGER PRIMARY KEY AUTOINCREMENT", " SERIAL", "date", " DEFAULT CURRENT_TIMESTAMP", " TIMESTAMP", "name", "", " VARCHAR(", " VARCHAR(", "uuid", "", " VARCHAR(", " VARCHAR(", "ip", "", " VARCHAR(", " VARCHAR(", "id", "PRIMARY KEY(", "id", "sqlite", " INTEGER PRIMARY KEY AUTOINCREMENT", " SERIAL", "name", "", " NOT NULL", " VARCHAR(", " VARCHAR(", "uuid", "", " NOT NULL", " VARCHAR(", " VARCHAR(", "date", " DEFAULT CURRENT_TIMESTAMP", " TIMESTAMP", "id", "PRIMARY KEY(", "id", "sqlite", " INTEGER PRIMARY KEY AUTOINCREMENT", " SERIAL", "info", " INT", " NOT NULL", "msg", "", " NOT NULL", " VARCHAR(", " VARCHAR(", "time", " DEFAULT CURRENT_TIMESTAMP", " TIMESTAMP", "id", "PRIMARY KEY(", "id", "", "pgsql", "h2", " SMALLINT NOT NULL", " TINYINT", " NOT NULL", "b", "pgsql", " BYTEA NOT NULL", "BINARY", "BLOB", ")NOT NULL", "id", "PRIMARY KEY(", "id", "sqlite", " INTEGER PRIMARY KEY AUTOINCREMENT", " SERIAL", "version", "", " NOT NULL", " VARCHAR(", " VARCHAR(", "build", "", " NOT NULL", " VARCHAR(", " VARCHAR(", "timezone", " DEFAULT '+00:00'", " NOT NULL", " VARCHAR(", " VARCHAR(", "accept", " DEFAULT 0", "pgsql", "h2", " SMALLINT NOT NULL", " TINYINT", " NOT NULL", "id", "PRIMARY KEY(", "id", "sqlite", " INTEGER PRIMARY KEY AUTOINCREMENT", " SERIAL", "uuid", "pgsql", " BYTEA NOT NULL", "BINARY", ")NOT NULL", "type", "", "pgsql", "h2", " SMALLINT NOT NULL", " TINYINT", " NOT NULL", "id", "PRIMARY KEY(", "Database connection fully initialized (", " ms) + ", "id", "sqlite", " INTEGER PRIMARY KEY AUTOINCREMENT", " SERIAL", "date", " DEFAULT CURRENT_TIMESTAMP", " TIMESTAMP", "name", "", " VARCHAR(", " VARCHAR(", "uuid", "", " VARCHAR(", " VARCHAR(", "ip", "", " VARCHAR(", " VARCHAR(", "id", "PRIMARY KEY(", "id", "sqlite", " INTEGER PRIMARY KEY AUTOINCREMENT", " SERIAL", "name", "", " NOT NULL", " VARCHAR(", " VARCHAR(", "uuid", "", " NOT NULL", " VARCHAR(", " VARCHAR(", "date", " DEFAULT CURRENT_TIMESTAMP", " TIMESTAMP", "id", "PRIMARY KEY(", "id", "sqlite", " INTEGER PRIMARY KEY AUTOINCREMENT", " SERIAL", "info", " INT", " NOT NULL", "msg", "", " NOT NULL", " VARCHAR(", " VARCHAR(", "time", " DEFAULT CURRENT_TIMESTAMP", " TIMESTAMP", "id", "PRIMARY KEY(", "id", "", "pgsql", "h2", " SMALLINT NOT NULL", " TINYINT", " NOT NULL", "b", "pgsql", " BYTEA NOT NULL", "BINARY", "BLOB", ")NOT NULL", "id", "PRIMARY KEY(", "id", "sqlite", " INTEGER PRIMARY KEY AUTOINCREMENT", " SERIAL", "version", "", " NOT NULL", " VARCHAR(", " VARCHAR(", "build", "", " NOT NULL", " VARCHAR(", " VARCHAR(", "timezone", " DEFAULT '+00:00'", " NOT NULL", " VARCHAR(", " VARCHAR(", "accept", " DEFAULT 0", "pgsql", "h2", " SMALLINT NOT NULL", " TINYINT", " NOT NULL", "id", "PRIMARY KEY(", "id", "sqlite", " INTEGER PRIMARY KEY AUTOINCREMENT", " SERIAL", "uuid", "pgsql", " BYTEA NOT NULL", "BINARY", ")NOT NULL", "type", "", "pgsql", "h2", " SMALLINT NOT NULL", " TINYINT", " NOT NULL", "id", "PRIMARY KEY(", "*", "SELECT ", " FROM ", "uuid=?", "Failed ", " WHERE ", "name,uuid", "?", "?,", "INSERT INTO ", ")VALUES(", "name", "[Sync] Updating stored server name: \"", "\" -> \"", "UPDATE ", "name=?", "uuid=?", "Failed ", " WHERE ", "UPDATE ", "server_scope=?", "server_scope=?", "Failed ", " WHERE ", "UPDATE ", "server_origin=?", "server_origin=?", "Failed ", " WHERE ", "[Sync] Server limit reached (", " servers). Resetting server ", "DROP TABLE ", "sqlite", "Unknown SQL driver '", "'. Please use one of these drivers: ", "h2", "sqlite", ":3306", "pgsql", "postgresql", ":5432", "sqlite", "h2", "pgsql", "litebans", "litebans.sqlite", "postgresql", "jdbc:", "://", "h2", "useSSL=false", "useSSL=false&serverTimezone=UTC", "sqlite", "?useSSL=", ";useSSL=", "h2", ";TRACE_LEVEL_FILE=0;TRACE_LEVEL_SYSTEM_OUT=0", "pgsql", "postgresql", "Connecting to database.. + ", "litebans-pool", "user", "password", "connectTimeout", "socketTimeout", "timezone", "UTC", "utf-8", "utf8mb4_unicode_ci", "useUnicode", "true", "characterEncoding", "characterSetResults", "connectionCollation", "cachePrepStmts", "true", "useServerPrepStmts", "cacheResultSetMetadata", "cacheServerConfiguration", "elideSetAutoCommits", "useLocalSessionState", "useLocalTransactionState", "true", "maintainTimeStats", "alwaysSendSetIsolation", "false", "sqlite", "SELECT 1", "h2", "SET IGNORECASE TRUE", "", "Failed to connect to [", "] + ", "h2", "[!!] No username and password has been provided in the configuration!", "Error: ", "", "", "Connection is not available, request timed out", "The driver has not received any packets from the ", "", "Unknown host: ", "Communications link failure", "Error: ", "", "Access denied for user", "Public Key Retrieval is not allowed", "Connected to [", "] successfully (", " ms) + ", "Connected to ", " database successfully (", " ms) + ", "h2", "h2.yml", "h2.json", "user", "password", "[!] Access to the database \"", "\" was ", "[!] Ensure that the database \"", "\" has been created and that you have granted permission to access this ", "litebans", "[!!] Your database is named \"litebans\"; this is the default database name. Ensure that you have defined the correct database ", ":3306", "pgsql", "postgresql", ":5432", ":3306", "pgsql", "postgresql", ":5432", "", "", "SELECT @@version", "", "template", "ipban_wildcard", "uuid", "ip", "banned_by_uuid", "time", "until", "ipban", hl.a("\u2bb3\u2bb1\u2ba6\u2bbb\u2ba4\u2bb7", 0x22DD2BD2), "uuid", "name", "ip", "CONSOLE", "CONSOLE", "#", "", "SELECT @@version", "", "template", "ipban_wildcard", "uuid", "ip", "banned_by_uuid", "time", "until", "ipban", "active", "uuid", "name", "ip", "CREATE INDEX IF NOT EXISTS", "", "", "", "CREATE INDEX", " idx_", " ON ", " (", "", "", "SELECT @@version", "", "template", "ipban_wildcard", "uuid", "ip", "banned_by_uuid", "time", "until", "ipban", "active", "uuid", "name", "ip", "CONSOLE", "CONSOLE", "#", "SELECT NOW() as now", "now", "UTC", "UTC", "*", "SELECT ", " FROM ", "accept", "timezone", "build", "UPDATE ", "version='", "',build='", "version,build,timezone", "?", "?,", "INSERT INTO ", ")VALUES(", "at ", ".executeQuery(", "at ", ".executeQuery(", "at "};
    }
}

