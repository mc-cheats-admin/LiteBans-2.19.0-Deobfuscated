package litebans;

import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;
import litebans.aJ;
import litebans.a_;
import litebans.am;
import litebans.as;
import litebans.bF;
import litebans.bK;
import litebans.bN;
import litebans.bz;
import litebans.cM;
import litebans.ch;
import litebans.dZ;
import litebans.di_0;
import litebans.eE;
import litebans.eq_0;
import litebans.ew;
import litebans.fg_0;
import litebans.fo_0;
import litebans.gf_0;
import litebans.gy_0;
import litebans.h1;
import litebans.hl;
import litebans.jv_0;
import litebans.kR;
import litebans.q_0;
import litebans.w;
import litebans.x_0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@gy_0
public abstract class fS
extends fg_0 {
    private final String e;
    private String j;
    private final int i;
    private final long h;
    private final Logger f;
    private final eE k;
    private final eE g;
    private final eE d;
    private static /* synthetic */ String[] l;

    public fS(@NotNull di_0 di_02, @NotNull String string, @NotNull String string2, int n, long l3) {
        super(di_02);
        this.e = string;
        this.j = string2;
        this.i = n;
        this.h = l3;
        this.f = di_02.getLogger();
        this.k = bN.a(fS::c);
        this.g = bN.a(fS::n);
        this.d = bN.a(fS::h);
    }

    public /* synthetic */ fS(di_0 di_02, String string, String string2, int n, long l3, int n2, aJ aJ2) {
        if ((n2 & 4) != 0) {
            string2 = "";
        }
        if ((n2 & 8) != 0) {
            n = 4096;
        }
        if ((n2 & 0x10) != 0) {
            l3 = 5000L;
        }
        this(di_02, string, string2, n, l3);
    }

    public final String k() {
        return this.e;
    }

    public final String i() {
        return this.j;
    }

    public final void a(@NotNull String string) {
        this.j = string;
    }

    public final int j() {
        return this.i;
    }

    public final long d() {
        return this.h;
    }

    public final Logger m() {
        return this.f;
    }

    public final HashMap a() {
        eE eE2 = this.k;
        return (HashMap)eE2.a();
    }

    public final AtomicLong g() {
        eE eE2 = this.g;
        return (AtomicLong)eE2.a();
    }

    public final AtomicLong f() {
        eE eE2 = this.d;
        return (AtomicLong)eE2.a();
    }

    public boolean c(@NotNull String string) {
        return bz.a(this.e, string, true);
    }

    public boolean l() {
        return true;
    }

    public boolean e() {
        return true;
    }

    public void a(@NotNull jv_0 jv_02) {
        fo_0.a(fg_0.a, jv_02, bF.a((CharSequence)am.bo.a("bans", (Object)this.g()), (CharSequence)"ipbans", this.f()), null, 4, null);
    }

    public abstract void a(@NotNull String var1, @NotNull Connection var2, @NotNull ch var3, boolean var4);

    public Void o() {
        x_0.a();
        throw new as();
    }

    public final String b(@Nullable String string) {
        String string2;
        String string3;
        if (string == null || bz.a((CharSequence)string, '#', false, 2, null)) {
            return "#";
        }
        String string4 = string3 = (String)this.a().get(string);
        if (string4 != null) {
            return string4;
        }
        Object object = this;
        boolean bl = false;
        boolean bl2 = ((q_0)((fg_0)object).h().a(q_0.class)).f().af();
        if (bl2) {
            cM cM2 = bK.c.a(string);
            if (cM2 == null) {
                return "#";
            }
            string2 = String.valueOf(cM2.a());
        } else {
            string2 = h1.a(string);
        }
        object = string2;
        ((Map)this.a()).put(string, object);
        return object;
    }

    public String a(@NotNull UUID uUID) {
        String string = bK.c.f(uUID.toString());
        if (string == null) {
            string = "#";
        }
        return string;
    }

    public final void a(@NotNull ch ch2, @NotNull dZ dZ2, @NotNull AtomicLong atomicLong, @NotNull AtomicLong atomicLong2) {
        String string = dZ2.p();
        if (kR.a(ch2, null, string, dZ2.u(), false, false, 24, null) == null) {
            ch2.c(dZ2);
            if (dZ2.u() == a_.h) {
                AtomicLong[] atomicLongArray = new AtomicLong[]{atomicLong, atomicLong2};
                boolean bl = false;
                int n = atomicLongArray.length;
                for (int i = 0; i < n; ++i) {
                    AtomicLong atomicLong3;
                    AtomicLong atomicLong4 = atomicLong3 = atomicLongArray[i];
                    boolean bl2 = false;
                    atomicLong4.incrementAndGet();
                }
            }
        } else {
            this.h().getLogger().warning("Ignoring duplicate ban for " + string);
        }
    }

    public final void a(@NotNull ch ch2, @Nullable String string, @NotNull String string2, long l3, long l5, @Nullable String string3, @Nullable UUID uUID, @Nullable UUID uUID2, @Nullable String string4, @NotNull AtomicLong atomicLong, @NotNull a_ a_2) {
        Object object;
        Object object2;
        Object object3;
        Object object4 = uUID;
        if (object4 == null || (object4 = ((UUID)object4).toString()) == null) {
            object4 = object3 = this.b(string);
        }
        if ((object2 = uUID2) == null || (object2 = ((UUID)object2).toString()) == null) {
            object2 = object = this.b(string3);
        }
        if (string4 == null && bz.b((String)object3, "#", false, 2, null)) {
            return;
        }
        fg_0 fg_02 = this;
        boolean bl = false;
        dZ dZ2 = kR.a(ch2, (String)object3, string4, a_2, ((w)fg_02.h().a(w.class)).u(), false, false, 48, null);
        if (a_2 == a_.c || dZ2 == null || !ew.a((Object)dZ2.w(), object3)) {
            boolean bl2 = string4 != null;
            Object object5 = this;
            boolean bl3 = false;
            String string5 = ((q_0)((fg_0)object5).h().a(q_0.class)).f().aw();
            Object object6 = this;
            boolean bl4 = false;
            object5 = eq_0.f.a(((q_0)((fg_0)object6).h().a(q_0.class)).f().a5(), string5, this.h().y());
            object6 = new dZ(a_2, (String)object3, string4, string2, (String)object, string3, (String)object5, string5, l3, l5, 0, false, bl2, false, 0L, 27648, null);
            ch2.c((dZ)object6);
            if (a_2 == a_.h) {
                atomicLong.incrementAndGet();
                if (bl2) {
                    this.f().incrementAndGet();
                }
            }
        } else {
            this.h().getLogger().warning("Ignoring duplicate " + a_2 + " for " + string + " (ip=" + string4 + ')');
        }
        if (string != null && object3 != null) {
            new gf_0(this.h(), string, (String)object3, "#").run();
        }
        if (string3 != null && object != null) {
            new gf_0(this.h(), string3, (String)object, "#").run();
        }
    }

    public static /* synthetic */ void a(fS fS2, ch ch2, String string, String string2, long l3, long l5, String string3, UUID uUID, UUID uUID2, String string4, AtomicLong atomicLong, a_ a_2, int n, Object object) {
        if (object != null) {
            throw new UnsupportedOperationException("");
        }
        if ((n & 0x40) != 0) {
            uUID = null;
        }
        if ((n & 0x80) != 0) {
            uUID2 = null;
        }
        if ((n & 0x100) != 0) {
            string4 = null;
        }
        if ((n & 0x200) != 0) {
            atomicLong = fS2.g();
        }
        if ((n & 0x400) != 0) {
            a_2 = a_.h;
        }
        fS2.a(ch2, string, string2, l3, l5, string3, uUID, uUID2, string4, atomicLong, a_2);
    }

    private static final HashMap c() {
        return new HashMap();
    }

    private static final AtomicLong n() {
        return new AtomicLong();
    }

    private static final AtomicLong h() {
        return new AtomicLong();
    }

    @Override
    public void run() {
        this.o();
    }

    private static final void b() {
        l = new String[]{"", "bans", "ipbans", "#", "#", "#", "Ignoring duplicate ban for ", "#", "Ignoring duplicate ", " for ", " (ip=", "#", "#", ""};
    }

    static {
        fS.b();
    }
}

