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

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public static final class o
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
        ew.e(h[1]);
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
        ew.e(h[2]);
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
        ew.e(h[3]);
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
        ew.e(h[4]);
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
                q_03.a((Object)(h[5] + charSequence + '\"'));
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
        if (ew.a((Object)h[6], (Object)string)) {
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
        String[] stringArray2 = new String[]{h[7], h[8] + string};
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
        String string6 = h[9] + string + '.' + string2 + '.' + a_2;
        bl2 = false;
        if (jv_03.e(string6)) return true;
        if (!ew.a((Object)var6_10, (Object)string2)) return false;
        jv_03 = jv_02;
        String string7 = h[10] + string + h[11] + a_2;
        bl2 = false;
        if (!jv_03.e(string7)) return false;
        return true;
    }

    public final boolean a(@NotNull dZ dZ2, @NotNull String string) {
        Object object;
        if (!((Collection)this.f).isEmpty() && this.f.remove(((String)(object = string)).toLowerCase(Locale.ROOT))) {
            object = this.a.y();
            this.i().a(arg_0 -> o.a(dZ2, (jv_0)object, this, arg_0));
            this.a.getLogger().info(h[12] + string + '.');
            return true;
        }
        return false;
    }

    public final void b(@NotNull String string) {
        cJ cJ2 = w.v;
        boolean bl = false;
        if (ew.a((Object)string, (Object)h[13]) || ew.a((Object)string, (Object)h[14])) {
            this.d(h[15]);
            this.b((CharSequence)h[16]);
            this.e(h[17]);
        } else {
            this.d(h[18]);
            this.b((CharSequence)h[19]);
            this.e(h[20]);
        }
        if (ew.a((Object)string, (Object)h[21])) {
            this.a((CharSequence)h[22]);
            this.c(h[23]);
        } else if (w.v.b(string)) {
            this.a((CharSequence)h[24]);
            this.c(h[25]);
        } else {
            this.a((CharSequence)h[26]);
            this.c(h[27]);
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
            calendar.setTimeZone(TimeZone.getTimeZone(h[28]));
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
        if (ew.a((Object)string2, (Object)h[29]) || ew.a((Object)string2, (Object)h[30])) {
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
            this.a(h[31], null, false);
        }
    }

    public final Object d() {
        if (this.a.i().a(h[32])) {
            return bh_0.b.a();
        }
        return null;
    }

    public final boolean a(@Nullable Object object) {
        if (object instanceof gi) {
            return bz.a((CharSequence)((gi)object).toString(), (CharSequence)h[33], false, 2, null);
        }
        return object != null && bz.b(object.getClass().getName(), h[34], false, 2, null);
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
                ew.b(gu2, h[35]);
                Object object2 = object = (gx_0)gu2;
                boolean bl2 = false;
                String string2 = string;
                if (string2 == null) {
                    iA iA2 = ch2.c(dZ2.w());
                    string2 = iA2 != null ? iA2.a() : null;
                    if (string2 == null) {
                        string2 = h[36];
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
        List list = ch2.a(jv_02.a(), jv_02.b(), a_.h, h[37], true, 0);
        gu gu2 = this.c();
        ew.b(gu2, h[38]);
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
                ew.b(gu2, h[39]);
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
        CharSequence charSequence = h[40] + string;
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
                charSequence = bF.a(charSequence, (CharSequence)h[41], (Object)this.m().f().ar());
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
                    string3 = h[42];
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
                string3 = h[43];
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
                                String string4 = h[44];
                                objectArray = new Object[]{jv_02.i(), n2, n2 == 1 ? h[45] : h[46]};
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
            string3 = h[47];
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
        h = new String[]{hl.a("", 1500085323), hl.a("", 1573719957), hl.a("", -1942621069), hl.a("", 935401922), hl.a("", 1362824518), hl.a("\uf096\uf0b5\uf0b9\uf0bb\uf0b6\uf0fa\uf0b7\uf0bf\uf0a9\uf0a9\uf0bb\uf0bd\uf0bf\uf0a9\uf0fa\uf0bb\uf0a8\uf0bf\uf0fa\uf0be\uf0b3\uf0a9\uf0bb\uf0b8\uf0b6\uf0bf\uf0be\uf0f6\uf0fa\uf0be\uf0b3\uf0a9\uf0b9\uf0bb\uf0a8\uf0be\uf0b3\uf0b4\uf0bd\uf0fa\uf0b7\uf0bf\uf0a9\uf0a9\uf0bb\uf0bd\uf0bf\uf0e0\uf0fa\uf0f8", -1283919654), hl.a("\uf657\uf65b\uf65a\uf647\uf65b\uf658\uf651", 1340012084), hl.a("\u7c9c\u7c99\u7c84\u7c95\u7c92\u7c91\u7c9e\u7c83\u7cde\u7c9e\u7c9f\u7c84\u7c99\u7c96\u7c89", 1764130032), hl.a("\u36ca\u36cf\u36d2\u36c3\u36c4\u36c7\u36c8\u36d5\u3688\u36c8\u36c9\u36d2\u36cf\u36c0\u36df\u3688", 735786662), hl.a("\u2e8f\u2e8a\u2e97\u2e86\u2e81\u2e82\u2e8d\u2e90\u2ecd\u2e8d\u2e8c\u2e97\u2e8a\u2e85\u2e9a\u2ecd", 2039230179), hl.a("\uff7e\uff7b\uff66\uff77\uff70\uff73\uff7c\uff61\uff3c\uff7c\uff7d\uff66\uff7b\uff74\uff6b\uff3c", -1388904686), hl.a("\u3414\u3456\u3455\u3459\u345b\u3456\u3414", -906087366), hl.a("\u5e28\u5e13\u5e1f\u5e1c\u5e13\u5e13\u5e18\u5e19\u5e5d\u5e0d\u5e11\u5e1c\u5e04\u5e18\u5e0f\u5e47\u5e5d", 518086269), hl.a("\u3ba8\u3bbf\u3bab\u3ba9\u3bb4", 1942174680), hl.a("\u3f92\u3f8d\u3f91\u3f96\u3f85\u3f90\u3f87\u3f91\u3f93\u3f8e", 1217085410), hl.a("\ud9fb\ud99e\ud989\ud99e", 762960313), hl.a("\u4ae2\u4a87\u4a91\u4a87", -1619965280), hl.a("\u40b5\u40dc\u40d9\u40dc\u40de\u40d0\u40b5", 184565909), hl.a("\ud3e4", 1408029652), hl.a("\u8963", 691898706), hl.a("\uce6d", -116535728), hl.a("\ueb3a\ueb38\ueb25\ueb20\ueb3d\ueb2c", 1496509257), hl.a("\u4aad\u4aa2\u4aae\u4aa6\u4aef\u4ab6\u4ab6\u4aaa\u4aa7\u4aef\u4aaa\u4ab3\u4aef\u4aa7\u4aa2\u4ab7\u4aa6\u4ab7\u4aaa\u4aae\u4aa6\u4aeb\u4aa7\u4aa2\u4ab7\u4aa6\u4aea\u4ae3\u4aa2\u4ab0\u4ae3\u4aa7\u4aa2\u4ab7\u4aa6", -328316221), hl.a("\u83a7\u83c4\u83c8\u83cb\u83cb\u83c6\u83d3\u83c2\u83a7\u83c9\u83c8\u83c4\u83c6\u83d4\u83c2\u83a7", -350583929), hl.a("\u987c\u9873\u987f\u9877\u983e\u9867\u9867\u987b\u9876\u983e\u987b\u9862\u983e\u9847\u985c\u985b\u984a\u984d\u9846\u985b\u985f\u9857\u9841\u9846\u9853\u985f\u9842\u983a\u9876\u9873\u9866\u9877\u983b\u9832\u9873\u9861\u9832\u9876\u9873\u9866\u9877", 1491638290), hl.a("\udf5c", -1396711556), hl.a("\ucdf3", 111922649), hl.a("\ud299", -1867459911), hl.a("\ubd2b\ubd2a\ubd3d", 459980158), hl.a("\u1f8e\u1f96\u1fba\u1fbb\u1fa6\u1fba\u1fb9\u1fb0\u1f88", -815063083), hl.a("\u7cba\u7cb6\u7cb7\u7caa\u7cb6\u7cb5\u7cbc", -1083147015), hl.a("", -2042800419), hl.a("\u11cb\u11f2\u11e4\u11ec\u11d7\u11e2\u11f5\u11ea\u11f4", 0x78781187), hl.a("\u99d0\u99cd\u99d8\u9991\u99cc\u99ce\u99d3\u99d6\u99cb\u99da", -1442604609), hl.a("\ub893\ub88e\ub89b\ub8d2\ub88f\ub88d\ub890\ub895\ub888\ub899", -959989508), hl.a("", 1001248048), hl.a("", 441608672), hl.a("\u25b1\u25b1\u25af\u25a2\u25a2\u25b1\u25b1", 904734190), hl.a("", -643754910), hl.a("", 765037248), hl.a("\u66e6\u66e3\u66fe\u66ef\u66e8\u66eb\u66e4\u66f9\u66a4\u66e4\u66e5\u66fe\u66e3\u66ec\u66f3\u66a4", 486499978), hl.a("\u1641\u1650\u1657\u1644\u1651\u164c\u164a\u164b", 2075792933), hl.a("\u5142\u5147\u515a\u514b\u514c\u514f\u5140\u515d\u5100\u514b\u5156\u514b\u5143\u515e\u515a\u5100\u514a\u515b\u515e\u514b\u5147\u515e\u5171\u5144\u5141\u5147\u5140", 1554796846), hl.a("\uf29a\uf29f\uf282\uf293\uf294\uf297\uf298\uf285\uf2d8\uf298\uf299\uf282\uf29f\uf290\uf28f\uf2d8\uf281\uf297\uf284\uf298\uf293\uf292\uf2d8\uf299\uf290\uf290\uf29a\uf29f\uf298\uf293", 1406792438), hl.a("\u2be6\u2bc7\u2bdc\u2bc1\u2bce\u2bc1\u2bcd\u2bcc\u2b88\u2b8d\u2bdb\u2b88\u2bc7\u2bce\u2b88\u2b8d\u2bcc\u2b88\u2b8d\u2bdb\u2b86", 180300712), hl.a("\u2241\u2257\u2244\u2258\u225f\u2258\u2251", 1204036150), hl.a("\u8af8\u8aee\u8afd\u8ae1\u8ae6\u8ae1\u8ae8\u8afc", -1548449137), hl.a("\udeae\udeab\udeb6\udea7\udea0\udea3\udeac\udeb1\udeec\udea3\udea6\udeaf\udeab\udeac", 1042013890)};
    }
}

