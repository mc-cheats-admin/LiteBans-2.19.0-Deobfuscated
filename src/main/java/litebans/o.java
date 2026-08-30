package litebans;

import java.io.Closeable;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import litebans.aA;
import litebans.a_;
import litebans.am;
import litebans.ao_0;
import litebans.as;
import litebans.bF;
import litebans.bN;
import litebans.bh_0;
import litebans.bt_0;
import litebans.bz;
import litebans.cJ;
import litebans.ch;
import litebans.cz;
import litebans.d2;
import litebans.dZ;
import litebans.di_0;
import litebans.eE;
import litebans.eG;
import litebans.ec_0;
import litebans.eq_0;
import litebans.ew;
import litebans.fg_0;
import litebans.fo_0;
import litebans.gG;
import litebans.g_;
import litebans.gf_0;
import litebans.gi;
import litebans.gl;
import litebans.gn_0;
import litebans.gu;
import litebans.gv;
import litebans.gx_0;
import litebans.hA;
import litebans.hl;
import litebans.hq;
import litebans.iA;
import litebans.ij;
import litebans.iv_0;
import litebans.jT;
import litebans.jj_0;
import litebans.jv_0;
import litebans.kR;
import litebans.ll;
import litebans.m_0;
import litebans.n_0;
import litebans.p;
import litebans.q_0;
import litebans.t;
import litebans.w;
import litebans.x_0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class o
extends n_0 {
    public static final aA n;
    private final eE m = bN.a(() -> o.b(this));
    private final eE g = bN.a(() -> o.a(this));
    public CharSequence i;
    public CharSequence c;
    public CharSequence e;
    public CharSequence k;
    public CharSequence j;
    private gG d;
    private final Set f = Collections.newSetFromMap(new ConcurrentHashMap());
    private final eE o = bN.a(() -> o.c(this));
    private int l;
    public static final int b;
    private static /* synthetic */ String[] h;

    public o(@Nullable di_0 di_02) {
        super(di_02);
    }

    public final w i() {
        eE eE2 = this.m;
        return (w)eE2.a();
    }

    public final q_0 m() {
        eE eE2 = this.g;
        return (q_0)eE2.a();
    }

    public final void d(@NotNull CharSequence charSequence) {
        this.i = charSequence;
    }

    public final CharSequence b() {
        CharSequence charSequence = this.c;
        if (charSequence != null) {
            return charSequence;
        }
        ew.e("");
        return null;
    }

    public final void b(@NotNull CharSequence charSequence) {
        this.c = charSequence;
    }

    public final CharSequence h() {
        CharSequence charSequence = this.e;
        if (charSequence != null) {
            return charSequence;
        }
        ew.e("");
        return null;
    }

    public final void e(@NotNull CharSequence charSequence) {
        this.e = charSequence;
    }

    public final CharSequence k() {
        CharSequence charSequence = this.k;
        if (charSequence != null) {
            return charSequence;
        }
        ew.e("");
        return null;
    }

    public final void a(@NotNull CharSequence charSequence) {
        this.k = charSequence;
    }

    public final CharSequence l() {
        CharSequence charSequence = this.j;
        if (charSequence != null) {
            return charSequence;
        }
        ew.e("");
        return null;
    }

    public final void c(@NotNull CharSequence charSequence) {
        this.j = charSequence;
    }

    public final gG e() {
        return this.d;
    }

    public final Set f() {
        return this.f;
    }

    public final gu c() {
        eE eE2 = this.o;
        return (gu)eE2.a();
    }

    public final gu a(@NotNull di_0 di_02) {
        gu gu2;
        byte by2 = di_02.t();
        if (by2 == 0 || by2 == 3) {
            gu2 = new gv(di_02);
        } else if (by2 == 1) {
            gu2 = new gx_0(di_02);
        } else if (by2 == 2) {
            gu2 = new gu(di_02);
        } else {
            x_0.a();
            throw new as();
        }
        return gu2;
    }

    public final int j() {
        return this.l;
    }

    public final void a(int n) {
        this.l = n;
    }

    public final void a(@NotNull ch ch2, @NotNull CharSequence charSequence, @NotNull ij ij2, @Nullable a_ a_2, @Nullable String string, boolean bl, boolean bl2, @Nullable jv_0 jv_02) {
        this.a(ch2, charSequence, ij2.f(), a_2, string, bl, bl2, jv_02);
    }

    public static /* synthetic */ void a(o o2, ch ch2, CharSequence charSequence, ij ij2, a_ a_2, String string, boolean bl, boolean bl2, jv_0 jv_02, int n, Object object) {
        if ((n & 4) != 0) {
            a_2 = null;
        }
        if ((n & 8) != 0) {
            string = null;
        }
        if ((n & 0x10) != 0) {
            bl = true;
        }
        if ((n & 0x20) != 0) {
            bl2 = true;
        }
        if ((n & 0x40) != 0) {
            jv_02 = null;
        }
        o2.a(ch2, charSequence, ij2, a_2, string, bl, bl2, jv_02);
    }

    public final void a(@NotNull ch ch2, @NotNull CharSequence charSequence, @Nullable String string, @Nullable a_ a_2, @Nullable String string2, boolean bl, boolean bl2, @Nullable jv_0 jv_02) {
        eG eG2 = this.m().f();
        if (!eG2.B() && bl2) {
            q_0 q_02 = this.m();
            int n = 10;
            boolean bl3 = false;
            if (q_02.a(n)) {
                q_0 q_03 = q_02;
                boolean bl4 = false;
                q_03.a((Object)("Local messages are disabled, discarding message: \"" + charSequence + '\"'));
            }
            return;
        }
        if (!bl) {
            return;
        }
        if (eG2.aJ()) {
            if (ch2.e().t() == 3) {
                ch2.e().getLogger().info(((Object)charSequence).toString());
            } else {
                fo_0.a(fg_0.a, ch2.e().y(), charSequence, null, 4, null);
            }
        }
        if (jv_02 != null && !jv_02.f()) {
            fo_0.a(fg_0.a, jv_02, charSequence, null, 4, null);
        }
        hq.a.a(ch2, ch2.e(), charSequence, string);
        if (ew.a((Object)"console", (Object)string)) {
            return;
        }
        Object[] objectArray = ch2.e().q();
        if (string == null) {
            Iterator iterator = d2.a(objectArray);
            while (iterator.hasNext()) {
                jv_0 jv_03 = (jv_0)iterator.next();
                ew.a(jv_03);
                fo_0.a(fg_0.a, jv_03, charSequence, null, 4, null);
            }
        } else {
            Iterator iterator = d2.a(objectArray);
            while (iterator.hasNext()) {
                jv_0 jv_04 = (jv_0)iterator.next();
                if (ew.a((Object)jv_04, jv_02)) continue;
                ew.a(jv_04);
                if (!this.a(jv_04, string, a_2, string2)) continue;
                fo_0.a(fg_0.a, jv_04, charSequence, null, 4, null);
            }
        }
    }

    public static /* synthetic */ void a(o o2, ch ch2, CharSequence charSequence, String string, a_ a_2, String string2, boolean bl, boolean bl2, jv_0 jv_02, int n, Object object) {
        if ((n & 4) != 0) {
            a_2 = null;
        }
        if ((n & 8) != 0) {
            string2 = null;
        }
        if ((n & 0x10) != 0) {
            bl = true;
        }
        if ((n & 0x20) != 0) {
            bl2 = true;
        }
        if ((n & 0x40) != 0) {
            jv_02 = null;
        }
        o2.a(ch2, charSequence, string, a_2, string2, bl, bl2, jv_02);
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean a(@NotNull jv_0 jv_02, @NotNull String string, @Nullable a_ a_2, @Nullable String string2) {
        void var6_10;
        Object object = jv_02;
        String[] stringArray2 = new String[]{"litebans.notify", "litebans + " + string};
        stringArray2 = stringArray2;
        boolean bl = false;
        String[] stringArray3 = stringArray2;
        boolean bl2 = false;
        int n = stringArray3.length;
        for (int i = 0; i < n; ++i) {
            String string3;
            String string4 = string3 = stringArray3[i];
            boolean bl3 = false;
            if (!object.e(string4)) continue;
            return true;
        }
        boolean bl4 = false;
        if (bl4) {
            return true;
        }
        if (a_2 == null) return false;
        if (string2 == null) return false;
        object = this.i().u();
        String string5 = jv_02.h();
        if (string5 == null) {
            Object object2 = object;
        }
        jv_0 jv_03 = jv_02;
        String string6 = "litebans + " + string + '.' + string2 + '.' + a_2;
        bl2 = false;
        if (jv_03.e(string6)) return true;
        if (!ew.a((Object)var6_10, (Object)string2)) return false;
        jv_03 = jv_02;
        String string7 = "litebans + " + string + " + " + a_2;
        bl2 = false;
        if (!jv_03.e(string7)) return false;
        return true;
    }

    public final boolean a(@NotNull dZ dZ2, @NotNull String string) {
        Object object;
        if (!((Collection)this.f).isEmpty() && this.f.remove(((String)(object = string)).toLowerCase(Locale.ROOT))) {
            object = this.a.y();
            this.i().a(arg_0 -> o.a(dZ2, (jv_0)object, this, arg_0));
            this.a.getLogger().info("Unbanned player: " + string + '.');
            return true;
        }
        return false;
    }

    public final void b(@NotNull String string) {
        cJ cJ2 = w.v;
        boolean bl = false;
        if (ew.a((Object)string, (Object)"pgsql") || ew.a((Object)string, (Object)"postgresql")) {
            this.d("B'0'");
            this.b((CharSequence)"B'1'");
            this.e(" ILIKE ");
        } else {
            this.d("0");
            this.b((CharSequence)"1");
            this.e("=");
        }
        if (ew.a((Object)string, (Object)"sqlite")) {
            this.a((CharSequence)"name,uuid,ip,datetime(date) as date");
            this.c(" COLLATE NOCASE ");
        } else if (w.v.b(string)) {
            this.a((CharSequence)"name,uuid,ip,UNIX_TIMESTAMP(date) as date");
            this.c(" ");
        } else {
            this.a((CharSequence)"*");
            this.c(" ");
        }
    }

    @Override
    public void c() {
        if (this.d != null) {
            gG gG2 = this.d;
            ew.a(gG2);
            gG2.f();
        }
    }

    public final jv_0 a(@NotNull String string) {
        Object object;
        block1: {
            Object[] objectArray = this.a.q();
            boolean bl = false;
            for (Object object2 : objectArray) {
                jv_0 jv_02 = (jv_0)object2;
                boolean bl2 = false;
                if (!ew.a((Object)jv_02.a(), (Object)string)) continue;
                object = object2;
                break block1;
            }
            object = null;
        }
        return (jv_0)object;
    }

    public final CharSequence a(long l3, boolean bl) {
        jT jT2 = this.a();
        if (l3 == -1L) {
            return am.bT;
        }
        return ((SimpleDateFormat)jT2.e()).format(new Date(l3 + this.a(bl)));
    }

    private final jT a() {
        jT jT2 = (jT)this.m().c().get();
        if (!ew.a(jT2.b(), (Object)am.a0.toString())) {
            this.m().c().remove();
            jT2 = (jT)this.m().c().get();
        }
        jT jT3 = jT2;
        ew.a(jT3);
        return jT3;
    }

    public final java.util.Date a(@NotNull ResultSet resultSet, @NotNull String string, boolean bl, @Nullable String string2) {
        java.util.Date date = null;
        if (this.a(resultSet)) {
            try {
                String string3 = resultSet.getString(string);
                if (string3 == null || ((CharSequence)string3).length() == 0) {
                    return new java.util.Date();
                }
                date = ((SimpleDateFormat)m_0.b.a().get()).parse(string3);
            }
            catch (Exception exception) {
                this.m().a(exception, 0);
                date = new java.util.Date();
            }
        } else {
            String string4 = string2;
            if (string4 == null) {
                string4 = this.m().f().aF();
            }
            if (w.v.b(string4) && bl) {
                return new Date(resultSet.getLong(string) * 1000L);
            }
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeZone(TimeZone.getTimeZone("UTC"));
            Timestamp timestamp = resultSet.getTimestamp(string);
            if (timestamp == null) {
                return new java.util.Date();
            }
            Timestamp timestamp2 = timestamp;
            calendar.setTime(timestamp2);
            return calendar.getTime();
        }
        return date;
    }

    public final String a(@NotNull ch ch2, @NotNull dZ dZ2) {
        iA iA2;
        String string = dZ2.s();
        if (string == null) {
            return null;
        }
        String string2 = string;
        if (ew.a((Object)string2, (Object)"[Console]") || ew.a((Object)string2, (Object)"CONSOLE")) {
            return this.m().f().aR();
        }
        String string3 = dZ2.q();
        if (this.m().f().bh() && string3 != null) {
            return string3;
        }
        iA iA3 = iA2 = ch2.c(string2);
        return iA3 != null ? iA3.a() : null;
    }

    public final long a(boolean bl) {
        if (!bl && this.m().f().v() || !this.m().f().z()) {
            return 0L;
        }
        Calendar calendar = Calendar.getInstance();
        return calendar.get(15) + calendar.get(16);
    }

    public final void a(@Nullable String string, @Nullable String string2, @Nullable String string3, @Nullable String string4, boolean bl) {
        String string5 = string3;
        ew.a((Object)string5);
        String string6 = jj_0.f(string5);
        eG eG2 = this.m().f();
        p p2 = (p)this.a.a(p.class);
        boolean bl2 = !this.m().p() && !this.a.l() && !eG2.j();
        boolean bl3 = bl2 = bl2 || bl && this.a.l() && this.a.c();
        if (bl2) {
            String string7 = string;
            ew.a((Object)string7);
            new gf_0(this.a, string7, string6, string2).run();
        }
        if (bl) {
            return;
        }
        p p3 = p2;
        boolean bl4 = false;
        di_0 di_02 = p3.a;
        String string8 = string6;
        ew.a((Object)string8);
        new g_(di_02, string, string8, string2, string4).run();
        litebans.o.a(this, string6, string, 0, 4, null);
    }

    private final void a(String string, String string2, int n) {
        this.a.a(() -> o.a(this, string, n, string2), 30L * (long)n * (long)n);
    }

    static /* synthetic */ void a(o o2, String string, String string2, int n, int n2, Object object) {
        if ((n2 & 4) != 0) {
            n = 1;
        }
        o2.a(string, string2, n);
    }

    @Override
    public void e() {
        this.m().e();
        if (this.d == null) {
            this.a("", null, false);
        }
    }

    public final Object d() {
        if (this.a.i().a("\u11cb\u11f2\u11e4\u11ec\u11d7\u11e2\u11f5\u11ea\u11f4")) {
            return bh_0.b.a();
        }
        return null;
    }

    public final boolean a(@Nullable Object object) {
        if (object instanceof gi) {
            return bz.a((CharSequence)((gi)object).toString(), (CharSequence)"org.sqlite", false, 2, null);
        }
        return object != null && bz.b(object.getClass().getName(), "org.sqlite", false, 2, null);
    }

    public final void a(@NotNull ch ch2, @NotNull cz cz2) {
        dZ dZ2 = cz2.q();
        ew.a(dZ2);
        iA iA2 = cz2.t();
        this.a(ch2, dZ2, iA2 != null ? iA2.a() : null);
    }

    public final void a(@NotNull ch ch2, @NotNull dZ dZ2, @Nullable String string) {
        if (ch2.e().t() == 1 && dZ2.u() == a_.h) {
            Object object = dZ2.w();
            boolean bl = false;
            if (jj_0.a((String)object)) {
                gu gu2 = this.c();
                ew.b(gu2, "");
                Object object2 = object = (gx_0)gu2;
                boolean bl2 = false;
                String string2 = string;
                if (string2 == null) {
                    iA iA2 = ch2.c(dZ2.w());
                    string2 = iA2 != null ? iA2.a() : null;
                    if (string2 == null) {
                        string2 = "";
                    }
                }
                UUID uUID = UUID.fromString(dZ2.w());
                String string3 = dZ2.p();
                String string4 = dZ2.m();
                if (string4 == null) {
                    string4 = eq_0.f.b();
                }
                ((gx_0)object2).a(ch2, string2, uUID, string3, string4, ll.a(dZ2));
            }
        }
    }

    public static /* synthetic */ void a(o o2, ch ch2, dZ dZ2, String string, int n, Object object) {
        if ((n & 2) != 0) {
            string = null;
        }
        o2.a(ch2, dZ2, string);
    }

    public final void a(@NotNull ch ch2, @NotNull jv_0 jv_02) {
        gx_0 gx_02;
        List list = ch2.a(jv_02.a(), jv_02.b(), a_.h, "__ALL__", true, 0);
        gu gu2 = this.c();
        ew.b(gu2, "");
        gx_0 gx_03 = gx_02 = (gx_0)gu2;
        Comparable<UUID> comparable = jv_02.d();
        boolean bl = false;
        int n = (int)comparable.getMostSignificantBits();
        comparable = n;
        ((Map)gx_02.b()).put(comparable, list);
    }

    public final boolean a(@Nullable dZ dZ2) {
        dZ dZ3 = dZ2;
        if ((dZ3 != null ? dZ3.u() : null) == a_.h) {
            Object object = dZ2.w();
            int n = 0;
            if (jj_0.a((String)object) && this.a.t() == 1) {
                gu gu2 = this.c();
                ew.b(gu2, "");
                object = (gx_0)gu2;
                String string = dZ2.w();
                ew.a((Object)string);
                n = ((gx_0)object).a(string);
                Collection collection = (Collection)((gx_0)object).b().get(n);
                if (collection == null) {
                    return false;
                }
                Collection collection2 = collection;
                Map map = ((gx_0)object).b();
                Integer n2 = n;
                Iterable iterable = collection2;
                boolean bl = false;
                Iterable iterable2 = iterable;
                Collection collection3 = new ArrayList();
                boolean bl2 = false;
                for (Object t2 : iterable2) {
                    dZ dZ4 = (dZ)t2;
                    boolean bl3 = false;
                    if (!(dZ4.a() != dZ2.a())) continue;
                    collection3.add(t2);
                }
                iterable = (List)collection3;
                map.put(n2, iterable);
                return true;
            }
        }
        return false;
    }

    public final void a(@NotNull jv_0 jv_02, @Nullable String string) {
        ec_0 ec_02 = this.a.i();
        if (ec_02 instanceof ao_0 && this.m().f().aH()) {
            ao_0 ao_02 = (ao_0)ec_02;
            String string2 = string;
            ew.a((Object)string2);
            ao_02.b(jv_02, string2);
        } else {
            String string3 = string;
            ew.a((Object)string3);
            jv_02.d(string3);
        }
    }

    public final void a(@NotNull jv_0 jv_02, @NotNull CharSequence charSequence) {
        this.a.c(() -> o.a(this, jv_02, charSequence));
    }

    public final void a(@NotNull String string, @Nullable CharSequence charSequence, boolean bl) {
        if (this.d != null) {
            gG gG2 = this.d;
            ew.a(gG2);
            gG2.f();
        }
        gG gG3 = this.d = new gG(this.a, charSequence, string, bl);
        ew.a(gG3);
        gG3.i();
    }

    public final void b(@NotNull String string, @NotNull CharSequence charSequence, boolean bl) {
        new gl(this.a, string, charSequence, bl).run();
    }

    public final void a(@NotNull ch ch2, @NotNull jv_0 jv_02, @NotNull dZ dZ2, int n, @NotNull String string) {
        if (!this.m().f().B()) {
            return;
        }
        Object object = jv_02;
        CharSequence charSequence = "litebans + " + string;
        boolean bl = false;
        if (object.e((String)charSequence)) {
            CharSequence charSequence2;
            switch (hA.a[dZ2.u().ordinal()]) {
                case 1: {
                    Object object2 = am.bS;
                    break;
                }
                case 2: {
                    Object object2;
                    if (dZ2.y()) {
                        object2 = am.dK;
                        break;
                    }
                    object2 = am.e;
                    break;
                }
                default: {
                    Object object2 = object = am.Y;
                }
            }
            if ((charSequence2 = bF.a(ch2, dZ2, n, 0, 4, null)) == null) {
                charSequence2 = charSequence = (CharSequence)object;
            }
            if (dZ2.u() == a_.c) {
                charSequence = bF.a(charSequence, (CharSequence)"duration", (Object)this.m().f().ar());
            }
            fo_0.a(fg_0.a, jv_02, bF.a(ch2, dZ2, jv_02, charSequence, 0L, 8, null), null, 4, null);
        }
    }

    public final String a(@Nullable String string, @Nullable String string2) {
        jv_0 jv_02;
        if (this.m().f().bh() && string2 != null && (jv_02 = this.a(string2)) != null) {
            return jv_02.g();
        }
        return string;
    }

    private static final w b(o o2) {
        return (w)o2.a.a(w.class);
    }

    private static final q_0 a(o o2) {
        return (q_0)o2.a.a(q_0.class);
    }

    private static final gu c(o o2) {
        return o2.a(o2.a);
    }

    private static final iv_0 a(dZ dZ2, jv_0 jv_02, o o2, ch ch2) {
        kR.a(ch2, dZ2, jv_02.a(), jv_02.i(), null, false, 24, null);
        o2.a(dZ2);
        return iv_0.a;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static final void a(o o2, String string, int n, String string2) {
        try {
            String string3;
            Object object;
            jv_0 jv_02;
            block23: {
                Object object2;
                boolean bl;
                jv_02 = o2.a(string);
                if (jv_02 == null) {
                    if (n < 5) {
                        o2.a(string, string2, n + 1);
                    }
                    return;
                }
                if (!o2.a.l()) {
                    object = jv_02;
                    string3 = "litebans.exempt.dupeip_join";
                    bl = false;
                    object2 = object;
                    boolean bl2 = false;
                    if (!object2.e(string3)) {
                        object = (t)o2.a.a(t.class);
                        string3 = jv_02.b();
                        if (string3 != null) {
                            ((t)object).a(string2, jv_02.a(), string3);
                        }
                    }
                }
                object = jv_02;
                string3 = "litebans.notify.warned.offline";
                bl = false;
                if (object.e(string3)) {
                    object = o2.i();
                    boolean bl3 = false;
                    try {
                        ch ch2 = ((w)object).f();
                        object2 = ch2;
                        Throwable throwable = null;
                        try {
                            Object object3 = (ch)object2;
                            boolean bl4 = false;
                            ch ch3 = ch2;
                            boolean bl5 = false;
                            Iterator iterator = ch3.a(jv_02, a_.c, true, 512);
                            boolean bl6 = false;
                            Iterable iterable = iterator;
                            Object[] objectArray = (Object[])new ArrayList();
                            boolean bl7 = false;
                            for (Object t2 : iterable) {
                                dZ dZ2 = (dZ)t2;
                                boolean bl8 = false;
                                if (dZ2.c()) continue;
                                objectArray.add(t2);
                            }
                            List list = (List)objectArray;
                            if (!list.isEmpty()) {
                                ch3.b(string);
                                iterator = jv_02;
                                Object object42 = ch3.a((CharSequence)am.du, jv_02);
                                boolean bl9 = false;
                                fo_0.a(fg_0.a, (jv_0)((Object)iterator), (CharSequence)object42, null, 4, null);
                                for (Object object42 : list) {
                                    CharSequence charSequence = bF.a(ch3, (dZ)object42, -1, -1);
                                    if (charSequence == null) {
                                        charSequence = am.az;
                                    }
                                    fo_0.a(fg_0.a, jv_02, bF.a(ch3, (dZ)object42, jv_02, charSequence, 0L, 8, null), null, 4, null);
                                }
                                int n2 = list.size();
                                String string4 = "Notified %s of %d %";
                                objectArray = new Object[]{jv_02.i(), n2, n2 == 1 ? "warning" : "warnings"};
                                ch3.e().getLogger().info(String.format(string4, Arrays.copyOf(objectArray, objectArray.length)));
                            }
                            object3 = iv_0.a;
                        }
                        catch (Throwable throwable2) {
                            throwable = throwable2;
                            throw throwable2;
                        }
                        finally {
                            bt_0.a((Closeable)object2, throwable);
                        }
                    }
                    catch (SQLException sQLException) {
                        if (((w)object).b(sQLException)) break block23;
                        throw sQLException;
                    }
                }
            }
            object = jv_02;
            string3 = "litebans.admin";
            boolean bl = false;
            if (object.e(string3)) {
                object = o2.a.h();
                if (((gn_0)object).b() != null) {
                    fo_0.a(fg_0.a, jv_02, am.bU, null, 4, null);
                }
                if (o2.m().s().a() == null) {
                    fo_0.a(fg_0.a, jv_02, am.aV, null, 4, null);
                }
                gn_0 gn_02 = o2.m().z().c();
                if ((gn_02 != null ? gn_02.b() : null) != null) {
                    fo_0.a(fg_0.a, jv_02, am.bs, null, 4, null);
                }
            }
        }
        catch (Exception exception) {
            o2.i().a(exception);
        }
    }

    private static final void a(o o2, jv_0 jv_02, CharSequence charSequence) {
        o2.a(jv_02, ((Object)charSequence).toString());
    }

    static {
        b = 512;
        litebans.o.g();
        n = new aA(null);
    }

    private static final void g() {
        h = new String[]{"", "", "", "", "", "Local messages are disabled, discarding message: \"", "console", "litebans.notify", "litebans + ", "litebans + ", "litebans + ", " + ", "Unbanned player: ", "pgsql", "postgresql", "B'0'", "B'1'", " ILIKE ", "0", "1", "=", "sqlite", "name,uuid,ip,datetime(date) as date", " COLLATE NOCASE ", "name,uuid,ip,UNIX_TIMESTAMP(date) as date", " ", "*", " ", "UTC", "[Console]", "CONSOLE", "", hl.a("\u11cb\u11f2\u11e4\u11ec\u11d7\u11e2\u11f5\u11ea\u11f4", 0x78781187), "org.sqlite", "org.sqlite", "", "", "__ALL__", "", "", "litebans + ", "duration", "litebans.exempt.dupeip_join", "litebans.notify.warned.offline", "Notified %s of %d %", "warning", "warnings", "litebans.admin"};
    }
}

