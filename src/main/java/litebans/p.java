package litebans;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import litebans.a_;
import litebans.am;
import litebans.as;
import litebans.bT;
import litebans.ch;
import litebans.dZ;
import litebans.di_0;
import litebans.eS;
import litebans.eq_0;
import litebans.ew;
import litebans.f8;
import litebans.fg_0;
import litebans.gZ;
import litebans.g_;
import litebans.he_0;
import litebans.hl;
import litebans.jj_0;
import litebans.jv_0;
import litebans.kL;
import litebans.ll;
import litebans.n_0;
import litebans.q_0;
import litebans.w;
import litebans.x_0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class p
extends n_0 {
    public f8 b;
    private static /* synthetic */ String[] c;

    public p(@NotNull di_0 di_02) {
        super(di_02);
    }

    public final f8 a() {
        f8 f82 = this.b;
        if (f82 != null) {
            return f82;
        }
        ew.e("");
        return null;
    }

    public final void a(@NotNull f8 f82) {
        this.b = f82;
    }

    @Override
    public void e() {
        this.a(new f8(this.a));
    }

    public final void a(@NotNull ch ch2) {
        boolean bl;
        Object object;
        Object object2;
        Object object3;
        Object object4;
        Object object5;
        Object object6;
        int n;
        ArrayList<Object> arrayList;
        List list;
        jv_0[] jv_0Array = ch2.e().q();
        ew.a(jv_0Array);
        if (jv_0Array.length == 0 || ch2.b()) {
            return;
        }
        if (!(ch2 instanceof gZ)) {
            x_0.a();
            throw new as();
        }
        gZ gZ2 = (gZ)ch2;
        Object object7 = gZ2;
        Object object8 = kL.m;
        jv_0[] jv_0Array2 = jv_0Array;
        boolean bl2 = false;
        if (jv_0Array2.length == 0) {
            list = ll.e();
        } else {
            arrayList = new ArrayList(Math.max(1, jv_0Array2.length / gZ.l.b()));
            int n2 = 0;
            n = 0;
            object6 = new HashSet(jv_0Array2.length);
            object5 = new ArrayList(jv_0Array2.length * 2);
            while (true) {
                Object object9;
                boolean bl3;
                Object object10 = object7;
                boolean bl4 = false;
                StringBuilder stringBuilder = new StringBuilder("SELECT * FROM " + object8 + " WHERE(" + ("active=" + ((gZ)object10).c().b() + " AND(until<1 OR until>?)") + ")AND(");
                int n3 = jv_0Array2.length;
                while (n2 < n3) {
                    jv_0 jv_02 = jv_0Array2[n2];
                    object4 = jv_02.b();
                    stringBuilder.append("uuid=?");
                    ((ArrayList)object5).add(jv_02.a());
                    if (object4 != null && !((HashSet)object6).contains(object4)) {
                        stringBuilder.append(" OR(ipban=").append(((gZ)object7).c().b()).append(" AND ").append("ip=?)");
                        ((ArrayList)object5).add(object4);
                        ((HashSet)object6).add(object4);
                    }
                    if (n > gZ.l.b()) break;
                    if (n2 != n3 - 1) {
                        stringBuilder.append(" OR ");
                    }
                    ++n2;
                    ++n;
                }
                n = 0;
                stringBuilder.append(")AND(server_scope='*' OR server_scope=? OR server_scope=?)");
                object3 = stringBuilder.toString();
                object4 = ((gZ)object7).g();
                boolean bl5 = false;
                if (((q_0)object4).g()) {
                    Object object11 = object4;
                    bl3 = false;
                    ((q_0)object11).a((Object)(n2 + ": " + (String)object3));
                }
                object4 = ((gZ)object7).c((CharSequence)object3);
                eS.a((bT)object4);
                object2 = object4;
                bl3 = false;
                Object object12 = object9 = object2;
                boolean bl6 = false;
                Iterable iterable = (Iterable)object5;
                boolean bl7 = false;
                for (Object t2 : iterable) {
                    String string = (String)t2;
                    boolean bl8 = false;
                    ((bT)object2).a(string);
                }
                object2 = object4;
                String string = jv_0Array2[0].h();
                int n4 = 0;
                object = object12 = object2;
                bl = false;
                ((bT)object2).a(string);
                object2 = object4;
                string = ((gZ)object7).d().u();
                n4 = 0;
                object = object12 = object2;
                bl = false;
                ((bT)object2).a(string);
                arrayList.add(object4);
                if (n2 >= jv_0Array2.length) break;
                ((ArrayList)object5).clear();
            }
            list = arrayList;
        }
        List list2 = list;
        object7 = new ConcurrentHashMap();
        object8 = list2;
        boolean bl9 = false;
        Iterator iterator = object8.iterator();
        while (iterator.hasNext()) {
            arrayList = iterator.next();
            bT bT2 = (bT)((Object)arrayList);
            n = 0;
            object6 = eS.c(bT2);
            if (!object6.next()) continue;
            do {
                String string;
                if ((string = ((dZ)(object5 = gZ2.a((ResultSet)object6, a_.j))).w()) != null && string.length() == 36) {
                    ((Map)object7).put(UUID.fromString(string), object5);
                }
                object3 = ((gZ)ch2).e().q();
                boolean bl10 = false;
                object4 = object3;
                object2 = new ArrayList();
                boolean bl11 = false;
                for (Object object12 : object4) {
                    object = (jv_0)object12;
                    bl = false;
                    if (!((dZ)object5).a(object.a(), object.b(), w.a(ch2.d(), false, 1, null))) continue;
                    object2.add(object12);
                }
                object3 = (List)object2;
                bl10 = false;
                object4 = object3.iterator();
                while (object4.hasNext()) {
                    object2 = object4.next();
                    jv_0 jv_03 = (jv_0)object2;
                    int n5 = 0;
                    ((Map)object7).put(jv_03.d(), object5);
                }
            } while (object6.next());
        }
        if (this.a().b().size() != ((ConcurrentHashMap)object7).size()) {
            this.a().a((ConcurrentHashMap)object7);
        }
    }

    public final void a(@NotNull String string, @NotNull dZ dZ2) {
        try {
            UUID uUID = UUID.fromString(jj_0.f(string));
            ((Map)this.a().b()).put(uUID, dZ2);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            q_0 q_02 = (q_0)this.a.a(q_0.class);
            q_0.a(q_02, illegalArgumentException, 0, 2, null);
        }
    }

    public final void a(@Nullable String string, @Nullable String string2, @Nullable String string3, @Nullable String string4) {
        boolean bl = false;
        String string5 = string2;
        ew.a((Object)string5);
        new g_(this.a, string, string5, string3, string4).run();
    }

    public final dZ a(@NotNull UUID uUID, @Nullable String string, @Nullable String string2) {
        q_0 q_02 = (q_0)this.a.a(q_0.class);
        w w2 = (w)this.a.a(w.class);
        Object object = q_02;
        boolean bl = false;
        if (ew.a(he_0.a((q_0)object), (Object)am.a(object, false, true))) {
            return null;
        }
        object = (dZ)this.a().b().get(uUID);
        if (object != null) {
            String string3 = uUID.toString();
            if (((dZ)object).a(string3, string, w.a(w2, false, 1, null))) {
                String string4;
                String string5 = ((dZ)object).m();
                if (string5 == null) {
                    string5 = eq_0.f.b();
                }
                if ((string4 = string2) == null) {
                    string4 = w2.u();
                }
                if (eq_0.f.a(string5, string4)) {
                    return object;
                }
            } else if (ew.a((Object)string, (Object)((dZ)object).p())) {
                this.a().b().remove(uUID);
            }
            q_0 q_03 = q_02;
            boolean bl2 = false;
            if (q_03.g()) {
                q_0 q_04 = q_03;
                boolean bl3 = false;
                q_04.a((Object)("M! " + uUID));
            }
        }
        return null;
    }

    public final void a(@Nullable String string, @Nullable String string2) {
        jv_0 jv_02;
        Object object;
        g_ g_2;
        block3: {
            if (string == null) {
                return;
            }
            g_2 = new g_(this.a, null, string, string2, null);
            fg_0 fg_02 = g_2;
            boolean bl = false;
            for (Object object2 : (Object[])fg_02.h().q()) {
                jv_0 jv_03 = (jv_0)object2;
                boolean bl2 = false;
                if (!ew.a((Object)jv_03.a(), (Object)string)) continue;
                object = object2;
                break block3;
            }
            object = null;
        }
        if ((jv_02 = (jv_0)object) != null) {
            g_2.run();
        }
    }

    public final boolean a(@Nullable dZ dZ2) {
        dZ dZ3 = dZ2;
        if ((dZ3 != null ? dZ3.u() : null) == a_.j) {
            boolean bl = ll.a((Iterable)this.a().b().entrySet(), arg_0 -> p.a(dZ2, arg_0));
            if (bl) {
                this.a(dZ2.w(), dZ2.p());
            }
            return bl;
        }
        return false;
    }

    @Override
    public void c() {
        this.a().b().clear();
    }

    private static final boolean a(dZ dZ2, Map.Entry entry) {
        return dZ2.w() != null && ew.a((Object)dZ2.w(), (Object)((dZ)entry.getValue()).w()) || dZ2.h() && dZ2.p() != null && ew.a((Object)dZ2.p(), (Object)((dZ)entry.getValue()).p());
    }

    private static final void d() {
        c = new String[]{"", "SELECT * FROM ", " WHERE(", "active=", " AND(until<1 OR until>?)", ")AND(", "uuid=?", " OR(ipban=", " AND ", "ip=?)", " OR ", ")AND(server_scope='*' OR server_scope=? OR server_scope=?)", ": ", "M! "};
    }

    static {
        p.d();
    }
}

