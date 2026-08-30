package litebans;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.UUID;
import litebans.aJ;
import litebans.aR;
import litebans.a_;
import litebans.as;
import litebans.b9;
import litebans.bT;
import litebans.bz;
import litebans.c1;
import litebans.c3;
import litebans.cX;
import litebans.ch;
import litebans.cp_0;
import litebans.d9;
import litebans.dQ;
import litebans.dZ;
import litebans.dc_0;
import litebans.df_0;
import litebans.di_0;
import litebans.dy_0;
import litebans.eG;
import litebans.eI;
import litebans.eM;
import litebans.eS;
import litebans.ef;
import litebans.eo_0;
import litebans.eq_0;
import litebans.et;
import litebans.ew;
import litebans.fB;
import litebans.f_;
import litebans.gl_0;
import litebans.h1;
import litebans.hB;
import litebans.hP;
import litebans.hc;
import litebans.hk;
import litebans.hl;
import litebans.hy_0;
import litebans.i1;
import litebans.i5;
import litebans.i8;
import litebans.iA;
import litebans.ij;
import litebans.iv_0;
import litebans.jB;
import litebans.jJ;
import litebans.jR;
import litebans.jT;
import litebans.jb_0;
import litebans.jc_0;
import litebans.jj_0;
import litebans.jp_0;
import litebans.jr_0;
import litebans.jv_0;
import litebans.jy;
import litebans.kL;
import litebans.kR;
import litebans.kc_0;
import litebans.kx_0;
import litebans.l6;
import litebans.lB;
import litebans.ll;
import litebans.lq;
import litebans.o;
import litebans.p;
import litebans.q_0;
import litebans.s;
import litebans.u;
import litebans.w;
import litebans.x_0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class gZ
implements ch {
    public static final dQ l;
    private final di_0 h;
    private final Connection d;
    private final p k;
    private final o g;
    private final q_0 f;
    private static final eo_0 a;
    public static final int e;
    public static final int j;
    public static final int b;
    public static final int c;
    private static int i;
    private static /* synthetic */ String[] m;

    public gZ(@NotNull di_0 di_02, @NotNull Connection connection) {
        this.h = di_02;
        this.d = connection;
        this.k = (p)this.h.a(p.class);
        this.g = (o)this.h.a(o.class);
        this.f = (q_0)this.h.a(q_0.class);
    }

    @Override
    public final di_0 e() {
        return this.h;
    }

    public final o c() {
        return this.g;
    }

    public final q_0 g() {
        return this.f;
    }

    public DatabaseMetaData d() {
        return this.d.getMetaData();
    }

    @Override
    public boolean b() {
        return this.d.isClosed();
    }

    @Override
    public long c() {
        Iterable iterable = kL.d.a();
        long l3 = 0L;
        for (Object t2 : iterable) {
            kL kL2 = (kL)t2;
            long l5 = l3;
            boolean bl = false;
            long l7 = kR.a((ch)this, kL2, null, false, 6, null);
            l3 = l5 + l7;
        }
        return l3;
    }

    public final jT a(@NotNull dZ dZ2, boolean bl) {
        String string = "uuid,ip,reason,banned_by_uuid,banned_by_name,time,until,template,server_scope,server_origin,silent,ipban,ipban_wildcard,active" + dZ2.g();
        CharSequence charSequence = string;
        int n = 44;
        boolean bl2 = false;
        CharSequence charSequence2 = charSequence;
        boolean bl3 = false;
        int n2 = 0;
        for (int i = 0; i < charSequence2.length(); ++i) {
            int n3;
            int n4 = n3 = charSequence2.charAt(i);
            boolean bl4 = false;
            if (!(n4 == n)) continue;
            ++n2;
        }
        int n5 = n2 + 1;
        charSequence = new StringBuilder((n5 + 1) * 2);
        for (n = 0; n < n5; ++n) {
            if (bl && n > 9) {
                ((StringBuilder)charSequence).append("?::bit,");
                continue;
            }
            ((StringBuilder)charSequence).append('?').append(',');
        }
        String string2 = ((StringBuilder)charSequence).substring(0, ((StringBuilder)charSequence).length() - 1);
        return kc_0.a(string, string2);
    }

    @Override
    public void c(@NotNull dZ dZ2) {
        boolean bl;
        String string;
        String string2;
        int n;
        Object object;
        boolean bl2;
        q_0 q_02;
        jT jT2 = this.a(dZ2, ew.a((Object)this.f.f().aF(), (Object)"pgsql"));
        String string3 = (String)jT2.a();
        String string4 = (String)jT2.c();
        Object object2 = this.f;
        int n2 = 1;
        boolean bl3 = false;
        if (((q_0)object2).a(n2)) {
            q_02 = object2;
            bl2 = false;
            q_02.a((Object)("Created new " + dZ2.u() + " for server:" + eq_0.f.c(dZ2.m())));
        }
        object2 = this.f;
        n2 = 1;
        bl3 = false;
        if (((q_0)object2).a(n2)) {
            q_02 = object2;
            bl2 = false;
            q_02.a((Object)("Adding entry: " + dZ2));
        }
        Object object3 = dZ2;
        bl3 = false;
        object2 = "INSERT INTO " + ((dZ)object3).u().a() + '(' + string3 + ")VALUES(" + string4 + ')';
        object3 = this.c((CharSequence)object2);
        bl3 = false;
        dZ dZ3 = dZ2;
        boolean bl4 = false;
        Object object4 = object3;
        Object object5 = new String[5];
        String string5 = dZ3.w();
        object5[0] = string5 != null ? h1.a(string5, 36) : null;
        String string6 = dZ3.p();
        object5[1] = string6 != null ? h1.a(string6, 45) : null;
        CharSequence charSequence = dZ3.b();
        int n3 = 2048;
        boolean bl5 = false;
        object5[2] = h1.a(((Object)charSequence).toString(), n3);
        String string7 = dZ3.e();
        object5[3] = string7 != null ? h1.a(string7, 36) : null;
        String string8 = dZ3.x();
        object5[4] = string8 != null ? h1.a(string8, 128) : null;
        boolean bl6 = false;
        Object object6 = object = object4;
        boolean bl7 = false;
        String[] stringArray = object5;
        boolean bl8 = false;
        int n4 = stringArray.length;
        for (n = 0; n < n4; ++n) {
            string = string2 = stringArray[n];
            bl = false;
            ((bT)object4).a(string);
        }
        object4 = object;
        object5 = new long[2];
        object5[0] = (String)dZ3.o();
        object5[1] = (String)dZ3.l();
        bl6 = false;
        object6 = object = object4;
        bl7 = false;
        stringArray = object5;
        bl8 = false;
        n4 = stringArray.length;
        for (n = 0; n < n4; ++n) {
            String string9;
            String string10 = string9 = stringArray[n];
            boolean bl9 = false;
            ((bT)object4).a((long)string10);
        }
        object4 = ((bT)object).a(dZ3.r());
        object5 = new String[]{eq_0.f.c(dZ3.m()), eq_0.f.c(dZ3.j())};
        bl6 = false;
        object6 = object = object4;
        bl7 = false;
        stringArray = object5;
        bl8 = false;
        n4 = stringArray.length;
        for (n = 0; n < n4; ++n) {
            string = string2 = stringArray[n];
            bl = false;
            ((bT)object4).a(string);
        }
        object4 = object;
        object5 = new boolean[4];
        object5[0] = (String)dZ3.d();
        object5[1] = (String)dZ3.h();
        object5[2] = (String)dZ3.i();
        object5[3] = (String)dZ3.t();
        bl6 = false;
        object6 = object = object4;
        bl7 = false;
        stringArray = object5;
        bl8 = false;
        n4 = stringArray.length;
        for (n = 0; n < n4; ++n) {
            String string11;
            String string12 = string11 = stringArray[n];
            bl = false;
            ((bT)object4).a((boolean)string12);
        }
        object4 = object;
        object5 = object4;
        bl6 = false;
        if (dZ3.u() == a_.c) {
            ((bT)object3).a(dZ3.c());
        }
        eS.b((bT)object4);
    }

    @Override
    public iA a(@NotNull iA iA2, boolean bl) {
        iA iA3;
        iA iA4 = iA3 = iA2;
        boolean bl2 = false;
        kR.a((ch)this, iA4.a(), iA4.b(), iA4.i(), bl, false, 16, null);
        return iA3;
    }

    @Override
    public void a(@Nullable String string, @Nullable String string2, @Nullable String string3, boolean bl, boolean bl2) {
        String string4;
        String string5;
        String string6 = string;
        if (string6 == null) {
            string6 = string5 = "#";
        }
        if ((string4 = string3) == null) {
            string4 = "#";
        }
        String string7 = string4;
        Object object = l;
        String[] stringArray = this;
        boolean bl3 = false;
        int n = string5.length();
        byte by2 = stringArray.g().f().be();
        boolean bl4 = false;
        if (!(ew.a(n, by2 & 0xFF) <= 0)) {
            by2 = 0;
            String string8 = "Player name \"" + string5 + "\" length > " + hy_0.b(stringArray.g().f().be());
            throw new IllegalArgumentException(string8.toString());
        }
        if (!(string2 == null || string2.length() <= 36)) {
            by2 = 0;
            String string9 = "UUID \"" + string2 + "\" length > 36";
            throw new IllegalArgumentException(string9.toString());
        }
        try {
            Object object2;
            boolean bl5;
            int n2;
            String[] stringArray2;
            int n3;
            int n4;
            Object object3;
            if (this.a(string5, string2, string7)) {
                if (bl && !bz.c((CharSequence)string7, '#', false, 2, null) && string2 != null) {
                    CharSequence charSequence;
                    int n5;
                    object = kL.g;
                    boolean bl6 = false;
                    object = aR.c(aR.e("UPDATE " + object), "date=CURRENT_TIMESTAMP");
                    String[] stringArray3 = (String[])"ip=?";
                    gZ gZ2 = this;
                    bl3 = false;
                    Object object4 = new CharSequence[]{aR.d((String)object), stringArray3};
                    by2 = 0;
                    CharSequence[] charSequenceArray = object4;
                    boolean bl7 = false;
                    int n6 = charSequenceArray.length;
                    for (n5 = 0; n5 < n6; ++n5) {
                        CharSequence charSequence2;
                        charSequence = charSequence2 = charSequenceArray[n5];
                        boolean bl8 = false;
                        if (charSequence.length() > 0) continue;
                        String string10 = "Failed ";
                        throw new IllegalArgumentException(string10.toString());
                    }
                    object = gZ2.c(aR.d(aR.b(aR.b(aR.e(aR.b((String)object) + " WHERE " + stringArray3), "uuid=?"), "name=?")));
                    stringArray3 = new String[]{string7, string2, string5};
                    bl3 = false;
                    Object object5 = object4 = object;
                    boolean bl9 = false;
                    String[] stringArray4 = stringArray3;
                    n5 = 0;
                    int n7 = stringArray4.length;
                    for (n6 = 0; n6 < n7; ++n6) {
                        CharSequence charSequence3 = charSequence = stringArray4[n6];
                        boolean bl10 = false;
                        ((bT)object).a((String)charSequence3);
                    }
                    eS.b((bT)object4);
                }
                return;
            }
            if (this.f.f().a4() && bl2) {
                CharSequence charSequence;
                object = kL.g;
                boolean bl11 = false;
                object = aR.e("DELETE FROM " + object);
                stringArray = m[24];
                object3 = this;
                bl3 = false;
                Object object6 = new CharSequence[]{aR.d((String)object), stringArray};
                by2 = 0;
                CharSequence[] charSequenceArray = object6;
                boolean bl12 = false;
                n4 = charSequenceArray.length;
                for (n3 = 0; n3 < n4; ++n3) {
                    CharSequence charSequence4;
                    charSequence = charSequence4 = charSequenceArray[n3];
                    boolean bl13 = false;
                    if (charSequence.length() > 0) continue;
                    String string11 = m[25];
                    throw new IllegalArgumentException(string11.toString());
                }
                object = ((gZ)object3).c(aR.d(aR.d(aR.e(aR.b((String)object) + m[26] + stringArray), m[27])));
                stringArray = new String[]{string5, string2};
                bl3 = false;
                Object object7 = object6 = object;
                bl4 = false;
                stringArray2 = stringArray;
                n3 = 0;
                n2 = stringArray2.length;
                for (n4 = 0; n4 < n2; ++n4) {
                    CharSequence charSequence5 = charSequence = stringArray2[n4];
                    bl5 = false;
                    ((bT)object).a((String)charSequence5);
                }
                eS.b((bT)object6);
            }
            object = kL.g;
            stringArray = m[28];
            object3 = this;
            bl3 = false;
            String[] stringArray5 = stringArray;
            char c = ',';
            bl4 = false;
            stringArray2 = stringArray5;
            n3 = 0;
            n4 = 0;
            for (n2 = 0; n2 < stringArray2.length(); ++n2) {
                char c10;
                char c11 = c10 = stringArray2.charAt(n2);
                bl5 = false;
                if (!(c11 == c)) continue;
                ++n4;
            }
            int n8 = n4;
            stringArray5 = m[29];
            if (n8 > 0) {
                StringBuilder stringBuilder = new StringBuilder(n8 * 2);
                Iterable iterable = new eI(0, n8);
                boolean bl14 = false;
                Iterator iterator = iterable.iterator();
                while (iterator.hasNext()) {
                    n2 = n4 = ((i5)iterator).b();
                    boolean bl15 = false;
                    stringBuilder.append(m[30]);
                }
                stringArray5 = bz.b(stringBuilder.toString(), 1);
            }
            Object object8 = object;
            boolean bl16 = false;
            object = ((gZ)object3).c(aR.d(aR.e(m[31] + object8 + '(' + stringArray + m[32] + (CharSequence)stringArray5 + ')')));
            int n9 = 0;
            Object object9 = object;
            stringArray5 = object9;
            boolean bl17 = false;
            Object object10 = object;
            String[] stringArray6 = new String[]{string5, string2, string7};
            boolean bl18 = false;
            Object object11 = object2 = object10;
            boolean bl19 = false;
            String[] stringArray7 = stringArray6;
            bl5 = false;
            int n10 = stringArray7.length;
            for (n8 = 0; n8 < n10; ++n8) {
                String string12;
                String string13 = string12 = stringArray7[n8];
                boolean bl20 = false;
                ((bT)object10).a(string13);
            }
            eS.d((bT)object9);
            object = this.f;
            n9 = 1;
            boolean bl21 = false;
            if (((q_0)object).a(n9)) {
                object3 = object;
                boolean bl22 = false;
                ((q_0)object3).a((Object)(m[33] + string5 + ':' + string2 + ':' + string7 + ']'));
            }
        }
        catch (SQLException sQLException) {
            String string14 = sQLException.getMessage();
            boolean bl23 = string14 != null ? bz.a((CharSequence)string14, (CharSequence)m[34], false, 2, null) : false;
            if (bl23) {
                return;
            }
            this.d().a(sQLException);
        }
    }

    @Override
    public void close() {
        this.d.close();
    }

    public final Statement f() {
        return this.d.createStatement();
    }

    @Override
    public int a(@NotNull hc hc2, @NotNull a_ a_2) {
        ResultSet resultSet = hc2.a(a_2, (CharSequence)m[35]);
        int n = 1;
        boolean bl = false;
        Integer n2 = resultSet.next() ? Integer.valueOf(resultSet.getInt(n)) : null;
        return n2 != null ? n2 : 0;
    }

    @Override
    public List a(@Nullable String string, @Nullable String string2, @NotNull a_ a_2, @Nullable String string3, boolean bl, int n) {
        CharSequence charSequence;
        Object object;
        dy_0 dy_02 = new dy_0();
        dy_02.a = l.c();
        long l3 = this.f.f().bb();
        String string4 = m[36];
        if (string2 == null || bz.a((CharSequence)string2, '#', false, 2, null)) {
            dy_02.a = l.a((eo_0)dy_02.a, arg_0 -> gZ.b(string, arg_0));
        } else {
            object = m[37];
            charSequence = m[38];
            if (l3 > 0L) {
                string4 = string4 + m[39] + (String)object + m[40] + l3 + m[41] + charSequence + m[42];
                dy_02.a = l.a((eo_0)dy_02.a, arg_0 -> gZ.c(string, string2, arg_0));
            } else {
                string4 = string4 + m[43] + (String)object + m[44];
                dy_02.a = l.a((eo_0)dy_02.a, arg_0 -> gZ.b(string, string2, arg_0));
            }
        }
        object = this.f.s().a(a_2);
        if (!((Collection)object).isEmpty()) {
            string4 = '(' + string4 + m[45] + ll.a((Iterable)object, m[46], null, null, 0, null, null, 62, null) + ')';
        }
        String string5 = string4;
        jR jR2 = jR.c;
        ch ch2 = this;
        boolean bl2 = false;
        jJ jJ2 = new jJ(ch2.e(), string3);
        charSequence = new hk(this, bl, n, dy_02, string5, jR2, jJ2);
        return this.b(hc.a((hc)charSequence, a_2, null, 2, null), a_2);
    }

    @Override
    public List a(@NotNull String string, @NotNull a_ a_2, @NotNull String string2, int n) {
        df_0 df_02 = hc.j;
        jR jR2 = jR.e;
        hc hc2 = df_0.a(df_02, this, string, string2, jR2, false, m[47], false, n, null, 168, null);
        return this.b(hc.a(hc2, a_2, null, 2, null), a_2);
    }

    @Override
    public boolean b(@NotNull kL kL2, @NotNull String string, boolean bl) {
        boolean bl2;
        if (bl) {
            bl2 = eS.d(this.c((CharSequence)(m[48] + kL2 + m[49] + string + m[50]))).next();
        } else {
            String string2;
            DatabaseMetaData databaseMetaData = this.d();
            String string3 = kL.a(kL2, null, false, 3, null);
            w w2 = this.d();
            boolean bl3 = false;
            q_0 q_02 = (q_0)w2.a.a(q_0.class);
            if (ew.a((Object)q_02.f().aF(), (Object)m[51])) {
                String string4 = string;
                string2 = string4.toUpperCase(Locale.ENGLISH);
            } else {
                string2 = string;
            }
            bl2 = databaseMetaData.getColumns(null, null, string3, string2).next();
        }
        return bl2;
    }

    @Override
    public boolean b(@NotNull CharSequence charSequence) {
        return this.d().getTables(null, null, ((Object)charSequence).toString(), null).next();
    }

    @Override
    public List a(@Nullable String string, int n) {
        String string2 = string;
        if (string2 == null || bz.a((CharSequence)string2, '#', false, 2, null)) {
            return ll.e();
        }
        jp_0 jp_02 = jj_0.a.k(string2);
        String string3 = jp_02.b();
        String string4 = l.a(this, string3);
        if (jp_02.d() == 2 && bz.c((CharSequence)string2, '*', false, 2, null)) {
            string2 = bz.a(string2, '*', '%', false, 4, null);
            string4 = m[52];
        }
        Object object = kL.g;
        CharSequence charSequence = this.g.k();
        boolean bl = false;
        object = aR.e(m[53] + charSequence + m[54] + object);
        gZ gZ2 = this;
        boolean bl2 = false;
        CharSequence[] charSequenceArray = new CharSequence[]{aR.d((String)object), string4};
        boolean bl3 = false;
        CharSequence[] charSequenceArray2 = charSequenceArray;
        boolean bl4 = false;
        int n2 = charSequenceArray2.length;
        for (int i = 0; i < n2; ++i) {
            CharSequence charSequence2;
            CharSequence charSequence3 = charSequence2 = charSequenceArray2[i];
            boolean bl5 = false;
            if (charSequence3.length() > 0) continue;
            String string5 = m[55];
            throw new IllegalArgumentException(string5.toString());
        }
        ResultSet resultSet = eS.d(gZ2.c(aR.d(aR.a(aR.a(aR.e(aR.b((String)object) + m[56] + (CharSequence)string4), m[57]), (Number)n))).a(string2));
        object = new ArrayList(4);
        while (resultSet.next()) {
            ((Collection)object).add(this.a(resultSet, true, this.f.f().aF()));
        }
        return (List)object;
    }

    @Override
    public iA a(@NotNull ResultSet resultSet, boolean bl, @Nullable String string) {
        return new iA(resultSet.getString(m[58]), jj_0.f(resultSet.getString(m[59])), resultSet.getString(m[60]), this.g.a(resultSet, m[61], bl, string));
    }

    @Override
    public Collection a(@NotNull a_ a_2, long l3, long l5, boolean bl) {
        long l7 = Math.max(0L, l3);
        long l8 = Math.max(0L, l7 * l5);
        hc hc2 = hc.j.a(this, m[62], m[63], jR.c, bl, m[64], false, l5, l8);
        return this.b(hc.a(hc2, a_2, null, 2, null), a_2);
    }

    @Override
    public dZ a(@NotNull dZ dZ2, boolean bl) {
        return kR.a(this, dZ2.w(), dZ2.h() ? dZ2.p() : null, dZ2.u(), dZ2.m(), bl, false, 32, null);
    }

    @Override
    public dZ a(@Nullable String string, @Nullable String string2, @NotNull a_ a_2, boolean bl, boolean bl2) {
        return this.a(string, string2, a_2, this.d().u(), bl, bl2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public dZ a(@Nullable String string, @Nullable String string2, @NotNull a_ a_2, @Nullable String string3, boolean bl, boolean bl2) {
        long l3;
        double d10;
        long l5;
        Object object;
        block13: {
            boolean bl3;
            Object object2;
            Object object3;
            boolean bl4;
            boolean bl5;
            jJ jJ2;
            boolean bl6;
            boolean bl7;
            Object object4;
            String string4 = jj_0.a.g(string);
            kR.a((ch)this, false, 1, null);
            if (bl2) {
                object4 = this;
                bl7 = true;
                bl6 = false;
                jJ2 = new jy(object4.e(), string3, bl7);
            } else {
                object4 = this;
                bl7 = false;
                jJ2 = new jJ(object4.e(), string3);
            }
            jJ jJ3 = jJ2;
            Object object5 = this;
            bl6 = false;
            object4 = m[65] + (m[66] + ((gZ)object5).c().b() + m[67]);
            object5 = m[68];
            String string5 = m[69];
            if (a_2 != a_.c && a_2 != a_.g && !this.f.f().aE()) {
                object5 = m[70] + this.g.b() + m[71] + this.g.b() + m[72];
                string5 = m[73] + this.g.b() + ')';
            }
            boolean bl8 = string4 == null || bz.a((CharSequence)string4, '#', false, 2, null);
            boolean bl9 = bl5 = string2 == null || bz.a((CharSequence)string2, '#', false, 2, null);
            if (bl5 && bl8) {
                return null;
            }
            String string6 = bl ? m[74] : m[75];
            long l7 = this.f.f().bb();
            String string7 = l7 > 0L ? m[76] + this.g.b() + m[77] + (String)object5 + m[78] + l7 + m[79] + string5 + m[80] : m[81] + this.g.b() + m[82] + (String)object5 + m[83];
            String string8 = (bl5 ? m[84] + a_2.a() + m[85] + jJ3 + ')' + (String)object4 : (bl8 ? m[86] + a_2.a() + m[87] + string7 + jJ3 + ')' + (String)object4 : m[88] + a_2.a() + m[89] + string7 + ')' + jJ3 + ')' + (String)object4)) + string6;
            Object object6 = this.f;
            boolean bl10 = false;
            if (((q_0)object6).g()) {
                q_0 q_02 = object6;
                bl4 = false;
                q_02.a((Object)string8);
            }
            object6 = this.c((CharSequence)string8);
            if (!bl8) {
                Object object7 = object6;
                bl4 = false;
                object2 = object3 = object7;
                bl3 = false;
                ((bT)object7).a(string4);
            }
            if (!bl5) {
                ((bT)object6).a(string2);
                if (!bz.b((CharSequence)object5)) {
                    ((bT)object6).a(string2);
                }
                if (l7 > 0L) {
                    eS.a((bT)object6);
                }
            }
            object = object6;
            bl4 = false;
            object2 = object3 = object;
            bl3 = false;
            jJ3.a((bT)object2);
            eS.a((bT)object6);
            object = null;
            l5 = System.nanoTime();
            try {
                dZ dZ2;
                object2 = eS.d((bT)object6);
                if (!object2.next() || !(dZ2 = this.a((ResultSet)object2, a_2)).a(string4, string2, w.a(this.d(), false, 1, null))) break block13;
                object = dZ2;
            }
            catch (Throwable throwable) {
                long l8 = System.nanoTime() - l5;
                double d11 = (double)l8 / 1.0E9;
                if (d11 > 4.0) {
                    this.h.getLogger().warning(m[92] + i1.a(d11) + m[93]);
                }
                throw throwable;
            }
        }
        if ((d10 = (double)(l3 = System.nanoTime() - l5) / 1.0E9) > 4.0) {
            this.h.getLogger().warning(m[90] + i1.a(d10) + m[91]);
        }
        return object;
    }

    @Override
    public dZ a(@NotNull String string, @Nullable String string2, @Nullable String string3, @NotNull a_ a_2) {
        List list = kR.a((ch)this, string, 0, 2, null);
        if (list.isEmpty()) {
            return null;
        }
        for (iA iA2 : list) {
            String string4;
            if (iA2.b() == null || ew.a((Object)iA2.b(), (Object)string2)) continue;
            this.f.a(10, (Object)(m[94] + iA2.b()));
            dZ dZ2 = kR.a(this, iA2.b(), null, a_2, string3, false, false, 32, null);
            StringBuilder stringBuilder = new StringBuilder();
            a_ a_3 = a_2;
            boolean bl = false;
            String string5 = a_3.toString();
            if (((CharSequence)string5).length() > 0) {
                char c = string5.charAt(0);
                StringBuilder stringBuilder2 = new StringBuilder();
                int n = 0;
                String string6 = string5;
                n = 1;
                string4 = stringBuilder2.append((Object)(Character.isLowerCase(c) ? jc_0.a(c, Locale.getDefault()) : String.valueOf(c))).append(string6.substring(n)).toString();
            } else {
                string4 = string5;
            }
            this.f.a(10, (Object)stringBuilder.append(string4).append(m[95]).append(dZ2).toString());
            if (dZ2 == null) continue;
            this.h.getLogger().info(m[96] + string + m[97] + a_2 + m[98] + dZ2.a());
            return dZ2;
        }
        return null;
    }

    @Override
    public List a(@NotNull String string, @Nullable String string2, @Nullable String string3, @NotNull a_ a_2, boolean bl) {
        Iterable iterable;
        List list = kR.a((ch)this, string, 0, 2, null);
        if (list.isEmpty()) {
            return ll.e();
        }
        List list2 = new ArrayList();
        for (iA iA2 : list) {
            if (iA2.b() == null || ew.a((Object)iA2.b(), (Object)string2) || (iterable = this.a(iA2.b(), null, a_2, string3, true, 0)).isEmpty()) continue;
            list2.addAll((Collection)iterable);
        }
        if (bl) {
            Iterable iterable2 = list2;
            boolean bl2 = false;
            iterable = iterable2;
            Collection collection = new ArrayList(ll.a(iterable2, 10));
            boolean bl3 = false;
            Iterator iterator = iterable.iterator();
            while (iterator.hasNext()) {
                Object t2 = iterator.next();
                dZ dZ2 = (dZ)t2;
                Collection collection2 = collection;
                boolean bl4 = false;
                collection2.add(new dZ(a_2, string2, dZ2.p(), dZ2.b(), dZ2.e(), dZ2.x(), dZ2.m(), dZ2.j(), dZ2.o(), dZ2.l(), dZ2.r(), dZ2.d(), dZ2.h(), dZ2.t(), dZ2.a(), null));
            }
            return ll.a((Collection)((List)collection));
        }
        return list2;
    }

    @Override
    public dZ a(@NotNull String string, @NotNull a_ a_2, @NotNull String string2, boolean bl) {
        if (!jj_0.a.d(string)) {
            return null;
        }
        hc hc2 = df_0.a(hc.j, this, string, string2, jR.d, bl, null, false, null, null, 240, null);
        ResultSet resultSet = hc.a(hc2, a_2, null, 2, null);
        dZ dZ2 = this.c(resultSet, a_2);
        return !bl || this.a(dZ2) ? dZ2 : null;
    }

    @Override
    public dZ a(long l3, @NotNull a_ a_2, @NotNull String string, boolean bl) {
        return this.a(String.valueOf(l3), a_2, string, bl);
    }

    @Override
    public long a(@NotNull kL kL2, @NotNull String string, boolean bl) {
        String string2 = m[99] + kL2;
        Object object = this;
        boolean bl2 = true;
        boolean bl3 = false;
        jy jy2 = new jy(object.e(), string, bl2);
        object = m[100];
        if (bl) {
            gZ gZ2 = this;
            bl3 = false;
            object = m[101] + (m[102] + gZ2.c().b() + m[103]);
        }
        eo_0 eo_02 = ((CharSequence)object).length() == 0 ? l.c() : l.a(gZ::a);
        dQ dQ2 = l;
        String string3 = m[104];
        Object object2 = m[105];
        boolean bl4 = false;
        String string4 = ((CharSequence)object).length() == 0 ? m[106] + string3 : (!bz.a((CharSequence)object, (CharSequence)m[107], false, 2, null) ? m[108] + (String)object + ' ' + (String)object2 + ' ' + string3 : (String)object + ' ' + (String)object2 + ' ' + string3);
        object = string4;
        if (((CharSequence)object).length() > 0) {
            string2 = string2 + ' ' + (String)object;
        }
        string2 = string2 + jy2;
        eo_02 = l.a(eo_02, arg_0 -> gZ.a(jy2, arg_0));
        object2 = eS.a(this.c((CharSequence)string2), eo_02);
        int n = 1;
        bl4 = false;
        Long l3 = object2.next() ? Long.valueOf(object2.getLong(n)) : null;
        return l3 != null ? l3 : 0L;
    }

    @Override
    public boolean a(@NotNull UUID uUID, @NotNull a_ a_2) {
        CharSequence charSequence = kL.h;
        CharSequence charSequence2 = m[109];
        boolean bl = false;
        charSequence = aR.e(m[110] + charSequence2 + m[111] + charSequence);
        charSequence2 = m[112];
        gZ gZ2 = this;
        bl = false;
        CharSequence[] charSequenceArray = new CharSequence[]{aR.d((String)charSequence), charSequence2};
        boolean bl2 = false;
        CharSequence[] charSequenceArray2 = charSequenceArray;
        boolean bl3 = false;
        int n = charSequenceArray2.length;
        for (int i = 0; i < n; ++i) {
            CharSequence charSequence3;
            CharSequence charSequence4 = charSequence3 = charSequenceArray2[i];
            boolean bl4 = false;
            if (charSequence4.length() > 0) continue;
            String string = m[113];
            throw new IllegalArgumentException(string.toString());
        }
        return eS.c(gZ2.c(aR.d(aR.e(aR.b((String)charSequence) + m[114] + charSequence2))).a(uUID)).next();
    }

    @Override
    public ResultSet a(@NotNull UUID uUID, int n) {
        char c;
        int n2;
        kL kL2 = kL.h;
        CharSequence charSequence = m[115];
        gZ gZ2 = this;
        boolean bl = false;
        CharSequence charSequence2 = charSequence;
        char c10 = ',';
        boolean bl2 = false;
        CharSequence charSequence3 = charSequence2;
        boolean bl3 = false;
        int n3 = 0;
        for (n2 = 0; n2 < charSequence3.length(); ++n2) {
            char c11 = c = charSequence3.charAt(n2);
            boolean bl4 = false;
            if (!(c11 == c10)) continue;
            ++n3;
        }
        int n4 = n3;
        charSequence2 = m[116];
        if (n4 > 0) {
            StringBuilder stringBuilder = new StringBuilder(n4 * 2);
            Iterable iterable = new eI(0, n4);
            boolean bl5 = false;
            Iterator iterator = iterable.iterator();
            while (iterator.hasNext()) {
                n2 = n3 = ((i5)iterator).b();
                c = '\u0000';
                stringBuilder.append(m[117]);
            }
            charSequence2 = bz.b(stringBuilder.toString(), 1);
        }
        kL kL3 = kL2;
        bl2 = false;
        return eS.d(gZ2.c(aR.d(aR.e(m[118] + kL3 + '(' + charSequence + m[119] + charSequence2 + ')'))).a(uUID).a(n));
    }

    @Override
    public ResultSet a(@NotNull UUID uUID) {
        CharSequence charSequence = kL.h;
        boolean bl = false;
        charSequence = aR.e(m[120] + charSequence);
        CharSequence charSequence2 = m[121];
        gZ gZ2 = this;
        boolean bl2 = false;
        CharSequence[] charSequenceArray = new CharSequence[]{aR.d((String)charSequence), charSequence2};
        boolean bl3 = false;
        CharSequence[] charSequenceArray2 = charSequenceArray;
        boolean bl4 = false;
        int n = charSequenceArray2.length;
        for (int i = 0; i < n; ++i) {
            CharSequence charSequence3;
            CharSequence charSequence4 = charSequence3 = charSequenceArray2[i];
            boolean bl5 = false;
            if (charSequence4.length() > 0) continue;
            String string = m[122];
            throw new IllegalArgumentException(string.toString());
        }
        return eS.d(gZ2.c(aR.d(aR.e(aR.b((String)charSequence) + m[123] + charSequence2))).a(uUID));
    }

    @Override
    public List a(@NotNull String string) {
        Object object = string;
        boolean bl = false;
        if (jj_0.a.i((String)object)) {
            return kR.b(this, string, 0, 2, null);
        }
        object = this.c(string);
        return object != null ? kR.b(this, ((iA)object).b(), 0, 2, null) : ll.e();
    }

    @Override
    public iA c(@Nullable String string) {
        Object object;
        boolean bl;
        Object object2;
        Object object3;
        Object object4;
        if (string == null) {
            return null;
        }
        if (ew.a((Object)string, (Object)m[124])) {
            return new iA(m[125], m[126], m[127], null, 8, null);
        }
        jp_0 jp_02 = jj_0.a.k(string);
        String string2 = jp_02.b();
        String string3 = l.a(this, string2);
        s s2 = (s)this.h.a(s.class);
        if (!((Collection)s2.a()).isEmpty() && jp_02.d() == 0 || jp_02.d() == 1) {
            Object v0;
            block5: {
                object4 = s2.a();
                Iterator iterator = object4.iterator();
                while (iterator.hasNext()) {
                    object3 = iterator.next();
                    object2 = (cp_0)object3;
                    bl = false;
                    if (!(ew.a((Object)((cp_0)object2).c(), (Object)string) || ew.a((Object)((cp_0)object2).g(), (Object)string))) continue;
                    v0 = object3;
                    break block5;
                }
                v0 = null;
            }
            object = v0;
            if (object != null) {
                return new iA(((cp_0)object).c(), ((cp_0)object).g(), ((cp_0)object).b(), null, 8, null);
            }
        }
        bT bT2 = this.c((CharSequence)(m[128] + this.g.k() + m[129] + kL.g + m[130] + string3 + m[131]));
        object4 = jp_02.a();
        boolean bl2 = false;
        object3 = bT2;
        object2 = object3;
        bl = false;
        bT2.a((String)object4);
        object = eS.d(object3);
        return object.next() ? this.a((ResultSet)object, true, this.f.f().aF()) : null;
    }

    @Override
    public List b(@Nullable String string, int n) {
        bT bT2;
        if (string == null) {
            return ll.e();
        }
        if (ew.a((Object)string, (Object)m[132])) {
            return ll.a(new iA(m[133], m[134], m[135], null, 8, null));
        }
        jp_0 jp_02 = jj_0.a.k(string);
        String string2 = jp_02.b();
        String string3 = l.a(this, string2);
        Object object = this.c((CharSequence)(m[136] + this.g.k() + m[137] + kL.g + m[138] + string3 + m[139] + n));
        Object object2 = jp_02.a();
        boolean bl = false;
        bT bT3 = bT2 = object;
        boolean bl2 = false;
        ((bT)object).a((String)object2);
        ResultSet resultSet = eS.d(bT2);
        object = new ArrayList();
        object2 = new ArrayList();
        while (resultSet.next()) {
            iA iA2 = this.a(resultSet, true, this.f.f().aF());
            if (iA2.b() == null || ((ArrayList)object).contains(iA2.b())) continue;
            ((Collection)object).add(iA2.b());
            ((Collection)object2).add(iA2);
        }
        return (List)object2;
    }

    @Override
    public long b(@NotNull dZ dZ2) {
        dZ dZ3 = dZ2;
        boolean bl = false;
        Object object = dZ3;
        boolean bl2 = false;
        object = ((dZ)object).u().a();
        CharSequence charSequence = m[140];
        boolean bl3 = false;
        object = aR.e(m[141] + charSequence + m[142] + object);
        charSequence = m[143];
        gZ gZ2 = this;
        bl3 = false;
        CharSequence[] charSequenceArray = new CharSequence[]{aR.d((String)object), charSequence};
        boolean bl4 = false;
        CharSequence[] charSequenceArray2 = charSequenceArray;
        boolean bl5 = false;
        int n = charSequenceArray2.length;
        for (int i = 0; i < n; ++i) {
            CharSequence charSequence2;
            CharSequence charSequence3 = charSequence2 = charSequenceArray2[i];
            boolean bl6 = false;
            if (charSequence3.length() > 0) continue;
            String string = m[144];
            throw new IllegalArgumentException(string.toString());
        }
        object = eS.d(gZ2.c(aR.d(aR.a(aR.a(aR.b(aR.e(aR.b((String)object) + m[145] + charSequence), m[146]), m[147]), (Number)1))).a(dZ3.w()).a(dZ3.o()));
        charSequence = m[148];
        bl3 = false;
        Long l3 = object.next() ? Long.valueOf(object.getLong((String)charSequence)) : null;
        return l3 != null ? l3 : 0L;
    }

    @Override
    public boolean a(@Nullable String var1_1, @Nullable String var2_2, @NotNull String var3_3) {
        var4_4 = gZ.l;
        var5_5 = this;
        var6_6 = false;
        if (var1_1 == null) ** GOTO lbl-1000
        var7_7 = var1_1.length();
        var8_9 = var5_5.g().f().be();
        var9_13 = false;
        if (ew.a(var7_7, var8_9 & 255) <= 0) lbl-1000:
        // 2 sources

        {
            v0 = true;
        } else {
            v0 = false;
        }
        if (!v0) {
            var8_9 = 0;
            var8_10 = gZ.m[149] + var1_1 + gZ.m[150] + hy_0.b(var5_5.g().f().be());
            throw new IllegalArgumentException(var8_10.toString());
        }
        if (!(var2_2 == null || var2_2.length() <= 36)) {
            var8_9 = 0;
            var8_11 = gZ.m[151] + var2_2 + gZ.m[152];
            throw new IllegalArgumentException(var8_11.toString());
        }
        var4_4 = kL.g;
        var5_5 = gZ.m[153];
        var6_6 = false;
        var4_4 = aR.e(gZ.m[154] + var5_5 + gZ.m[155] + var4_4);
        var5_5 = gZ.m[156];
        var23_16 = this;
        var6_6 = false;
        var7_8 /* !! */  = new CharSequence[]{aR.d((String)var4_4), var5_5};
        var8_9 = 0;
        var9_14 = var7_8 /* !! */ ;
        var10_17 = false;
        var12_21 = var9_14.length;
        for (var11_19 = 0; var11_19 < var12_21; ++var11_19) {
            var14_23 = var13_22 = var9_14[var11_19];
            var15_24 = false;
            if (var14_23.length() > 0) continue;
            var16_25 = gZ.m[157];
            throw new IllegalArgumentException(var16_25.toString());
        }
        var4_4 = var23_16.c(aR.d(aR.a(aR.b(aR.b(aR.e(aR.b((String)var4_4) + gZ.m[158] + var5_5), gZ.m[159]), gZ.m[160]), (Number)1)));
        var5_5 = jj_0.a.g(var2_2);
        var6_6 = false;
        var8_12 /* !! */  = var7_8 /* !! */  = var4_4;
        var9_15 = false;
        var10_18 = var4_4;
        var11_20 = new String[]{var1_1, var5_5, var3_3};
        var12_21 = 0;
        var14_23 = var13_22 = var10_18;
        var15_24 = false;
        var16_26 = var11_20;
        var17_27 = false;
        var19_29 = var16_26.length;
        for (var18_28 = 0; var18_28 < var19_29; ++var18_28) {
            var21_31 = var20_30 = var16_26[var18_28];
            var22_32 = false;
            var10_18.a(var21_31);
        }
        return eS.d((bT)var7_8 /* !! */ ).next();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void a(@Nullable Connection connection, @NotNull kL kL2, boolean bl) {
        boolean bl2;
        CharSequence charSequence;
        boolean bl3;
        block24: {
            block25: {
                if (connection == null) {
                    return;
                }
                bl3 = kL2.a();
                charSequence = kL2;
                boolean bl4 = false;
                boolean bl5 = bl2 = charSequence == kL.g;
                if (!bl) break block24;
                charSequence = kL2;
                bl4 = false;
                if (charSequence == kL.c) break block25;
                charSequence = kL2;
                bl4 = false;
                if (!(charSequence == kL.f) && kL2 != kL.i) break block24;
            }
            return;
        }
        charSequence = bl ? m[161] : m[162];
        String string = kL.a(kL2, null, bl, 1, null);
        AutoCloseable autoCloseable = connection.prepareStatement(m[163] + string);
        Throwable throwable = null;
        try {
            Object object = (PreparedStatement)autoCloseable;
            boolean bl6 = false;
            AutoCloseable autoCloseable2 = object.executeQuery();
            Throwable throwable2 = null;
            try {
                Object object2 = (ResultSet)autoCloseable2;
                boolean bl7 = false;
                if (bl3) {
                    while (object2.next()) {
                        ew.a(object2);
                        dZ dZ2 = this.a((ResultSet)object2, kL2.c());
                        dZ dZ3 = kR.a((ch)this, dZ2, false, 2, null);
                        if (dZ3 != null && (!dZ3.h() || ew.a((Object)dZ3.w(), (Object)dZ2.w()))) continue;
                        try {
                            this.c(dZ2);
                        }
                        catch (SQLException sQLException) {
                            this.h.getLogger().severe(m[164] + dZ2.u() + m[165] + sQLException.getMessage() + m[166] + dZ2);
                            if (!this.f.a(1)) continue;
                            sQLException.printStackTrace();
                        }
                    }
                } else if (bl2) {
                    while (object2.next()) {
                        ew.a(object2);
                        iA iA2 = this.a((ResultSet)object2, false, (String)charSequence);
                        String string2 = iA2.h();
                        String string3 = iA2.c();
                        String string4 = iA2.d();
                        kR.a((ch)this, string2, string3, string4, false, false, 16, null);
                    }
                }
                object2 = iv_0.a;
            }
            catch (Throwable throwable3) {
                throwable2 = throwable3;
                throw throwable3;
            }
            finally {
                f_.a(autoCloseable2, throwable2);
            }
            object = iv_0.a;
        }
        catch (Throwable throwable4) {
            throwable = throwable4;
            throw throwable4;
        }
        finally {
            f_.a(autoCloseable, throwable);
        }
    }

    @Override
    public dZ a(@NotNull ResultSet resultSet, @NotNull a_ a_2) {
        String string;
        a_ a_3 = a_2.c();
        String string2 = jj_0.f(resultSet.getString(m[167]));
        String string3 = resultSet.getString(m[168]);
        CharSequence charSequence = resultSet.getString(m[169]);
        String string4 = resultSet.getString(m[170]);
        if (string4 == null) {
            string4 = m[171];
        }
        Object object = resultSet;
        Object object2 = m[173];
        String string5 = resultSet.getString(m[172]);
        String string6 = string4;
        CharSequence charSequence2 = charSequence;
        String string7 = string3;
        String string8 = string2;
        CharSequence charSequence3 = a_3;
        boolean bl = false;
        try {
            string = object.getString((String)object2);
        }
        catch (SQLException sQLException) {
            string = null;
        }
        String string9 = string;
        object = resultSet;
        object2 = m[174];
        bl = false;
        try {
            string = object.getString((String)object2);
        }
        catch (SQLException sQLException) {
            string = null;
        }
        String string10 = string;
        aJ aJ2 = null;
        int n = 16384;
        long l3 = 0L;
        boolean bl2 = resultSet.getBoolean(m[180]);
        boolean bl3 = resultSet.getBoolean(m[179]);
        boolean bl4 = resultSet.getBoolean(m[178]);
        byte by2 = hy_0.a((byte)resultSet.getInt(m[177]));
        long l5 = resultSet.getLong(m[176]);
        long l7 = resultSet.getLong(m[175]);
        String string11 = string10;
        String string12 = string9;
        String string13 = string5;
        String string14 = string6;
        CharSequence charSequence4 = charSequence2;
        String string15 = string7;
        String string16 = string8;
        a_ a_4 = charSequence3;
        dZ dZ2 = new dZ(a_4, string16, string15, charSequence4, string14, string13, string12, string11, l7, l5, by2, bl4, bl3, bl2, l3, n, aJ2);
        if (a_2 == a_.c) {
            dZ2.a(resultSet.getBoolean(m[181]));
        }
        if (!this.g.a(resultSet)) {
            dZ2.a(resultSet.getLong(m[182]));
        }
        if (a_2 != a_.g) {
            String string17;
            object = Calendar.getInstance();
            ((Calendar)object).setTimeZone(TimeZone.getTimeZone(m[183]));
            object2 = resultSet.getTimestamp(m[184]);
            if (object2 != null) {
                ((Calendar)object).setTime((Date)object2);
                dZ2.c(((Calendar)object).getTimeInMillis() + (long)this.d().a());
            } else {
                dZ2.c(0L);
            }
            ResultSet resultSet2 = resultSet;
            string = m[185];
            jj_0 jj_02 = jj_0.a;
            dZ dZ3 = dZ2;
            boolean bl5 = false;
            try {
                string17 = resultSet2.getString(string);
            }
            catch (SQLException sQLException) {
                string17 = null;
            }
            charSequence3 = string17;
            dZ3.a(jj_02.g((String)charSequence3));
            resultSet2 = resultSet;
            string = m[186];
            dZ3 = dZ2;
            bl5 = false;
            try {
                string17 = resultSet2.getString(string);
            }
            catch (SQLException sQLException) {
                string17 = null;
            }
            dZ3.b(string17);
            resultSet2 = resultSet;
            string = m[187];
            dZ3 = dZ2;
            bl5 = false;
            try {
                string17 = resultSet2.getString(string);
            }
            catch (SQLException sQLException) {
                string17 = null;
            }
            dZ3.a((CharSequence)string17);
        }
        return dZ2;
    }

    @Override
    public dZ c(@NotNull ResultSet resultSet, @NotNull a_ a_2) {
        return resultSet.next() ? this.a(resultSet, a_2) : null;
    }

    @Override
    public bT c(@NotNull CharSequence charSequence) {
        Object object = this.f;
        boolean bl = false;
        if (((q_0)object).g()) {
            ((q_0)object).a(charSequence);
        }
        PreparedStatement preparedStatement = this.d.prepareStatement(((Object)charSequence).toString());
        if (preparedStatement == null) {
            x_0.a();
            throw new as();
        }
        object = preparedStatement;
        String string = charSequence instanceof aR ? ((aR)charSequence).c() : null;
        return ew.a((Object)this.f.f().aF(), (Object)m[188]) ? (bT)new b9(this, (PreparedStatement)object, string, null) : new bT(this, (PreparedStatement)object, string, null);
    }

    @Override
    public void a(@Nullable String string, long l3) {
        Object object;
        String string2 = jj_0.a.g(string);
        String string3 = m[189] + w.a(this.d(), false, 1, null) + m[190];
        Object object2 = kL.values();
        boolean bl = false;
        Object object3 = object2;
        Collection collection = new ArrayList();
        boolean bl2 = false;
        for (kL kL2 : object3) {
            object = kL2;
            boolean bl3 = false;
            if (!((kL)object).a()) continue;
            collection.add(kL2);
        }
        object2 = (List)collection;
        bl = false;
        object3 = object2.iterator();
        while (object3.hasNext()) {
            collection = object3.next();
            kL kL3 = (kL)((Object)collection);
            int n = 0;
            Object object4 = kL3;
            boolean bl4 = false;
            object4 = aR.e(m[191] + object4);
            CharSequence charSequence = m[192];
            boolean bl5 = false;
            Object object5 = new CharSequence[]{aR.d((String)object4), charSequence};
            boolean bl6 = false;
            CharSequence[] charSequenceArray = object5;
            boolean bl7 = false;
            int n2 = charSequenceArray.length;
            for (int i = 0; i < n2; ++i) {
                CharSequence charSequence2;
                CharSequence charSequence3 = charSequence2 = charSequenceArray[i];
                boolean bl8 = false;
                if (charSequence3.length() > 0) continue;
                String string4 = m[193];
                throw new IllegalArgumentException(string4.toString());
            }
            String string5 = aR.b(aR.e(aR.b((String)object4) + m[194] + charSequence), m[195]);
            if (kL3 != kL.j) {
                string5 = aR.b(string5, string3);
            }
            object4 = this.c(aR.d(string5));
            boolean bl9 = false;
            object = object4;
            object5 = object;
            bl6 = false;
            ((bT)object4).a(string2);
            eS.d(((bT)object).a(l3));
        }
    }

    @Override
    public int a(@NotNull c1 c12, @Nullable String string, @Nullable String string2) {
        boolean bl;
        CharSequence[] charSequenceArray;
        boolean bl2;
        if (string == null) {
            return 0;
        }
        boolean bl3 = c12.j() && string2 != null && !bz.c((CharSequence)string2, '#', false, 2, null);
        kL kL2 = c12.d().a();
        eo_0 eo_02 = l.c();
        Object object = kL2;
        CharSequence charSequence = m[196];
        boolean bl4 = false;
        String string3 = aR.e(m[197] + charSequence + m[198] + object);
        if (bl3) {
            object = m[199];
            bl2 = false;
            charSequenceArray = new CharSequence[]{aR.d(string3), object};
            bl = false;
            CharSequence[] charSequenceArray2 = charSequenceArray;
            boolean bl5 = false;
            int n = charSequenceArray2.length;
            for (int i = 0; i < n; ++i) {
                CharSequence charSequence2;
                CharSequence charSequence3 = charSequence2 = charSequenceArray2[i];
                boolean bl6 = false;
                if (charSequence3.length() > 0) continue;
                String string4 = m[200];
                throw new IllegalArgumentException(string4.toString());
            }
            string3 = aR.b(aR.e(aR.b(string3) + m[201] + object), m[202]);
            eo_02 = l.a(eo_02, arg_0 -> gZ.a(string, string2, c12, arg_0));
        } else {
            object = m[203];
            bl2 = false;
            charSequenceArray = new CharSequence[]{aR.d(string3), object};
            bl = false;
            CharSequence[] charSequenceArray3 = charSequenceArray;
            boolean bl7 = false;
            int n = charSequenceArray3.length;
            for (int i = 0; i < n; ++i) {
                CharSequence charSequence4;
                CharSequence charSequence5 = charSequence4 = charSequenceArray3[i];
                boolean bl8 = false;
                if (charSequence5.length() > 0) continue;
                String string5 = m[204];
                throw new IllegalArgumentException(string5.toString());
            }
            string3 = aR.b(aR.e(aR.b(string3) + m[205] + object), m[206]);
            eo_02 = l.a(eo_02, arg_0 -> gZ.a(string, c12, arg_0));
        }
        if (c12.d() == a_.c) {
            object = this;
            bl2 = false;
            string3 = aR.b(string3, m[207] + ((gZ)object).c().b() + m[208]);
            eo_02 = l.a(eo_02, gZ::c);
        }
        if (c12.i() > 0L) {
            long l3 = w.a(this.d(), false, 1, null) - c12.i();
            string3 = aR.b(string3, m[209]);
            eo_02 = l.a(eo_02, arg_0 -> gZ.b(l3, arg_0));
        }
        ResultSet resultSet = eS.b(this.c(aR.d(string3)), eo_02);
        int n = 1;
        bl = false;
        Integer n2 = resultSet.next() ? Integer.valueOf(resultSet.getInt(n)) : null;
        return n2 != null ? n2 : 0;
    }

    @Override
    public jT a(@Nullable String string, @Nullable String string2, @NotNull eM eM2, @NotNull c1 c12) {
        boolean bl;
        CharSequence charSequence;
        CharSequence charSequence2;
        int n;
        int n2;
        boolean bl2;
        Object object;
        boolean bl3;
        CharSequence[] charSequenceArray;
        if (string == null) {
            return kc_0.a(0.0, 0.0);
        }
        boolean bl4 = c12.j() && string2 != null && !bz.c((CharSequence)string2, '#', false, 2, null);
        kL kL2 = eM2.c().a();
        Object object2 = kL2;
        Object object3 = m[210];
        boolean bl5 = false;
        String string3 = aR.e(m[211] + object3 + m[212] + object2);
        object2 = null;
        object2 = l.c();
        if (bl4) {
            object3 = m[213];
            bl5 = false;
            charSequenceArray = new CharSequence[]{aR.d(string3), object3};
            bl3 = false;
            object = charSequenceArray;
            bl2 = false;
            n2 = ((CharSequence[])object).length;
            for (n = 0; n < n2; ++n) {
                charSequence = charSequence2 = object[n];
                bl = false;
                if (charSequence.length() > 0) continue;
                String string4 = m[214];
                throw new IllegalArgumentException(string4.toString());
            }
            string3 = aR.e(aR.b(string3) + m[215] + object3);
            object2 = l.a((eo_0)object2, arg_0 -> gZ.a(string, string2, arg_0));
        } else {
            object3 = m[216];
            bl5 = false;
            charSequenceArray = new CharSequence[]{aR.d(string3), object3};
            bl3 = false;
            object = charSequenceArray;
            bl2 = false;
            n2 = ((CharSequence[])object).length;
            for (n = 0; n < n2; ++n) {
                charSequence = charSequence2 = object[n];
                bl = false;
                if (charSequence.length() > 0) continue;
                String string5 = m[217];
                throw new IllegalArgumentException(string5.toString());
            }
            string3 = aR.e(aR.b(string3) + m[218] + object3);
            object2 = l.a((eo_0)object2, arg_0 -> gZ.a(string, arg_0));
        }
        if (eM2.c() == a_.c) {
            object3 = this;
            bl5 = false;
            string3 = aR.b(string3, m[219] + ((gZ)object3).c().b() + m[220]);
            object2 = l.a((eo_0)object2, gZ::b);
        }
        if (eM2.d() > 0L) {
            long l3 = w.a(this.d(), false, 1, null) - eM2.d();
            string3 = aR.b(string3, m[221]);
            object2 = l.a((eo_0)object2, arg_0 -> gZ.a(l3, arg_0));
        }
        String string6 = null;
        string6 = m[222];
        Object object4 = eM2.e();
        boolean bl6 = false;
        Iterator iterator = object4.entrySet().iterator();
        while (iterator.hasNext()) {
            Object object5 = object = iterator.next();
            n = 0;
            c1 c13 = (c1)object5.getKey();
            string6 = string6 + m[223];
            object2 = l.a((eo_0)object2, arg_0 -> gZ.a(c13, arg_0));
        }
        string6 = string6.substring(0, string6.length() - 4);
        string3 = aR.b(string3, '(' + string6 + ')');
        object4 = eS.b(this.c(aR.d(string3)), (eo_0)object2);
        double d10 = 0.0;
        while (true) {
            String[] stringArray;
            String[] stringArray2;
            q_0 q_02;
            Object object6 = object4;
            n = 1;
            n2 = 0;
            Integer n3 = object6.next() ? Integer.valueOf(object6.getInt(n)) : null;
            if (n3 == null) {
                break;
            }
            byte by2 = hy_0.a((byte)n3.intValue());
            if ((c1)eM2.b().get(hy_0.d(by2)) == null) break;
            Object v2 = eM2.e().get(object);
            ew.a(v2);
            float f10 = ((Number)v2).floatValue();
            d10 += (double)f10;
            q_0 q_03 = this.f;
            n2 = 10;
            boolean bl7 = false;
            if (q_03.a(n2)) {
                q_02 = q_03;
                boolean bl8 = false;
                q_02.a((Object)('[' + eM2.a() + m[224] + i1.a(f10) + m[225] + ((c1)object).g() + m[226] + i1.a(d10)));
            }
            q_03 = this.f;
            n2 = 0;
            if (!q_03.g()) continue;
            q_02 = q_03;
            bl7 = false;
            et et2 = fB.d;
            String string7 = m[227] + f10;
            boolean bl9 = false;
            if (ew.a((Object)string7, (Object)m[228])) {
                stringArray2 = new String[]{m[229]};
                stringArray = stringArray2;
            } else {
                stringArray2 = new String[]{m[230] + string7};
                stringArray = stringArray2;
            }
            String[] stringArray3 = stringArray;
            q_02.a(new l6(this.f, Arrays.copyOf(stringArray3, stringArray3.length)));
        }
        Object v3 = eM2.e().get(c12);
        ew.a(v3);
        float f11 = ((Number)v3).floatValue();
        double d11 = d10 + (double)f11;
        return kc_0.a(d10, d11);
    }

    @Override
    public ResultSet a(@NotNull kL kL2, @NotNull String string, int n) {
        ResultSet resultSet;
        Object object = this;
        boolean bl = false;
        boolean bl2 = false;
        jy jy2 = new jy(object.e(), string, bl);
        if (n == 1) {
            if (!kL2.a()) {
                return kx_0.a();
            }
            object = kL2;
            bl = false;
            return eS.d(this.c(aR.d(aR.c(aR.e(m[231] + object), m[232]))));
        }
        if (n == 2) {
            if (!kL2.a()) {
                return kx_0.a();
            }
            object = kL2;
            bl = false;
            object = aR.e(m[233] + object);
            gZ gZ2 = this;
            bl = false;
            Object object2 = new CharSequence[]{aR.d((String)object), jy2};
            boolean bl3 = false;
            CharSequence[] charSequenceArray = object2;
            boolean bl4 = false;
            int n2 = charSequenceArray.length;
            for (int i = 0; i < n2; ++i) {
                CharSequence charSequence;
                CharSequence charSequence2 = charSequence = charSequenceArray[i];
                boolean bl5 = false;
                if (charSequence2.length() > 0) continue;
                String string2 = m[234];
                throw new IllegalArgumentException(string2.toString());
            }
            object = gZ2.c(aR.d(aR.b(aR.e(aR.b((String)object) + m[235] + (CharSequence)jy2), m[236])));
            bl = false;
            Object object3 = object2 = object;
            boolean bl6 = false;
            ((jJ)jy2).a((bT)object3);
            return eS.d((bT)object2);
        }
        if (eq_0.f.b(string)) {
            object = kL2;
            bl = false;
            resultSet = eS.d(this.c(aR.d(aR.e(m[237] + object))));
        } else {
            object = kL2;
            bl = false;
            object = aR.e(m[238] + object);
            gZ gZ3 = this;
            bl = false;
            Object object4 = new CharSequence[]{aR.d((String)object), jy2};
            boolean bl7 = false;
            CharSequence[] charSequenceArray = object4;
            boolean bl8 = false;
            int n3 = charSequenceArray.length;
            for (int i = 0; i < n3; ++i) {
                CharSequence charSequence;
                CharSequence charSequence3 = charSequence = charSequenceArray[i];
                boolean bl9 = false;
                if (charSequence3.length() > 0) continue;
                String string3 = m[239];
                throw new IllegalArgumentException(string3.toString());
            }
            object = gZ3.c(aR.d(aR.e(aR.b((String)object) + m[240] + (CharSequence)jy2)));
            bl = false;
            Object object5 = object4 = object;
            boolean bl10 = false;
            ((jJ)jy2).a((bT)object5);
            resultSet = eS.d((bT)object4);
        }
        return resultSet;
    }

    @Override
    public ResultSet a(@NotNull kL kL2) {
        kL kL3 = kL2;
        boolean bl = false;
        return eS.d(this.c(aR.d(aR.c(aR.e(m[241] + kL3), m[242]))));
    }

    @Override
    public void a(@NotNull CharSequence charSequence, long l3, @NotNull dZ dZ2) {
        Object object = this;
        Object object2 = dZ2.m();
        boolean bl = true;
        boolean bl2 = false;
        jy jy2 = new jy(object.e(), (String)object2, bl);
        object2 = dZ2;
        bl = false;
        object2 = ((dZ)object2).u().a();
        bl = false;
        object2 = aR.c(aR.e(m[243] + object2), m[244]);
        CharSequence charSequence2 = m[245];
        bl2 = false;
        Object object3 = new CharSequence[]{aR.d((String)object2), charSequence2};
        boolean bl3 = false;
        CharSequence[] charSequenceArray = object3;
        boolean bl4 = false;
        int n = charSequenceArray.length;
        for (int i = 0; i < n; ++i) {
            CharSequence charSequence3;
            CharSequence charSequence4 = charSequence3 = charSequenceArray[i];
            boolean bl5 = false;
            if (charSequence4.length() > 0) continue;
            String string = m[246];
            throw new IllegalArgumentException(string.toString());
        }
        String string = aR.e(aR.b((String)object2) + m[247] + charSequence2);
        object2 = this;
        boolean bl6 = false;
        object2 = aR.b(string, m[248] + ((gZ)object2).c().b() + m[249]);
        bl6 = false;
        object = aR.e(aR.b((String)object2) + (jJ)jy2);
        object2 = this.c(aR.d((String)object)).a(l3);
        bl6 = false;
        Object object4 = object2;
        object3 = object4;
        bl3 = false;
        ((bT)object2).a(String.valueOf(charSequence));
        object2 = eS.a(((bT)object4).a(dZ2.a()));
        bl6 = false;
        object4 = object2;
        object3 = object4;
        bl3 = false;
        ((jJ)jy2).a((bT)object3);
        eS.d((bT)object4);
    }

    @Override
    public void a(@Nullable String string, @Nullable String string2, @NotNull CharSequence charSequence, @NotNull dZ dZ2, boolean bl) {
        CharSequence charSequence2;
        int n;
        jT jT2;
        String string3 = string2;
        String string4 = string3 != null ? h1.a(string3, 128) : null;
        ch ch2 = this;
        Object object = dZ2.m();
        boolean bl2 = true;
        boolean bl3 = false;
        jy jy2 = new jy(ch2.e(), (String)object, bl2);
        boolean bl4 = dZ2.h() && dZ2.p() != null && !bz.c((CharSequence)dZ2.p(), '#', false, 2, null);
        if (bl) {
            dZ dZ3 = dZ2;
            bl3 = false;
            jT2 = kc_0.a(m[250], String.valueOf(dZ3.a()));
        } else {
            jT2 = bl4 ? kc_0.a(m[251], dZ2.p()) : kc_0.a(m[252], dZ2.w());
        }
        object = jT2;
        Object object2 = dZ2;
        boolean bl5 = false;
        object2 = ((dZ)object2).u().a();
        bl5 = false;
        object2 = aR.c(aR.e(m[253] + object2), m[254]);
        CharSequence charSequence3 = (String)((jT)object).b() + m[255];
        boolean bl6 = false;
        Object object3 = new CharSequence[]{aR.d((String)object2), charSequence3};
        boolean bl7 = false;
        CharSequence[] charSequenceArray = object3;
        boolean bl8 = false;
        int n2 = charSequenceArray.length;
        for (n = 0; n < n2; ++n) {
            CharSequence charSequence4;
            charSequence2 = charSequence4 = charSequenceArray[n];
            boolean bl9 = false;
            if (charSequence2.length() > 0) continue;
            String string5 = m[256];
            throw new IllegalArgumentException(string5.toString());
        }
        String string6 = aR.e(aR.b((String)object2) + m[257] + charSequence3);
        object2 = this;
        boolean bl10 = false;
        object2 = aR.b(string6, m[258] + ((gZ)object2).c().b() + m[259]);
        bl10 = false;
        String string7 = aR.e(aR.b((String)object2) + (jJ)jy2);
        object2 = this.f;
        bl10 = false;
        if (((q_0)object2).g()) {
            Object object4 = object2;
            bl6 = false;
            ((q_0)object4).a((Object)(aR.b(string7) + ' ' + dZ2.m() + ' ' + object));
        }
        object2 = this.c(aR.d(string7));
        String[] stringArray = new String[]{string, string4, ((Object)charSequence).toString(), ((jT)object).e()};
        bl6 = false;
        Object object5 = object3 = object2;
        boolean bl11 = false;
        String[] stringArray2 = stringArray;
        n = 0;
        int n3 = stringArray2.length;
        for (n2 = 0; n2 < n3; ++n2) {
            CharSequence charSequence5 = charSequence2 = stringArray2[n2];
            boolean bl12 = false;
            ((bT)object2).a((String)charSequence5);
        }
        object2 = eS.a((bT)object3);
        boolean bl13 = false;
        Object object6 = object2;
        object3 = object6;
        boolean bl14 = false;
        ((jJ)jy2).a((bT)object3);
        eS.d((bT)object6);
        dZ2.a(string4, string, charSequence);
    }

    @Override
    public void a(@NotNull dZ dZ2, @Nullable String string, @Nullable String string2, @NotNull CharSequence charSequence, boolean bl) {
        if (bl) {
            Object object = dZ2;
            boolean bl2 = false;
            object = ((dZ)object).u().a();
            bl2 = false;
            object = aR.e(m[260] + object);
            CharSequence charSequence2 = m[261];
            boolean bl3 = false;
            CharSequence[] charSequenceArray = new CharSequence[]{aR.d((String)object), charSequence2};
            boolean bl4 = false;
            CharSequence[] charSequenceArray2 = charSequenceArray;
            boolean bl5 = false;
            int n = charSequenceArray2.length;
            for (int i = 0; i < n; ++i) {
                CharSequence charSequence3;
                CharSequence charSequence4 = charSequence3 = charSequenceArray2[i];
                boolean bl6 = false;
                if (charSequence4.length() > 0) continue;
                String string3 = m[262];
                throw new IllegalArgumentException(string3.toString());
            }
            String string4 = aR.e(aR.b((String)object) + m[263] + charSequence2);
            eS.d(this.c(aR.d(string4)).a(dZ2.a()));
        } else {
            CharSequence charSequence5;
            Object object;
            Object object2 = dZ2;
            boolean bl7 = false;
            object2 = ((dZ)object2).u().a();
            bl7 = false;
            object2 = aR.c(aR.e(m[264] + object2), m[265]);
            CharSequence charSequence6 = m[266];
            boolean bl8 = false;
            Object object3 = new CharSequence[]{aR.d((String)object2), charSequence6};
            boolean bl9 = false;
            CharSequence[] charSequenceArray = object3;
            boolean bl10 = false;
            int n = charSequenceArray.length;
            for (int i = 0; i < n; ++i) {
                CharSequence charSequence7;
                CharSequence charSequence8 = charSequence7 = charSequenceArray[i];
                boolean bl11 = false;
                if (charSequence8.length() > 0) continue;
                String string5 = m[267];
                throw new IllegalArgumentException(string5.toString());
            }
            String string6 = aR.e(aR.b((String)object2) + m[268] + charSequence6);
            object2 = this.f;
            boolean bl12 = false;
            if (((q_0)object2).g()) {
                Object object4 = object2;
                bl8 = false;
                object3 = aR.d(string6);
                CharSequence charSequence9 = m[269] + dZ2.a();
                boolean bl13 = false;
                ((q_0)object4).a((Object)("" + object3 + charSequence9));
            }
            object2 = this.c(aR.d(string6));
            bl12 = false;
            object3 = object = object2;
            boolean bl14 = false;
            ((bT)object2).a(string);
            object2 = object;
            String string7 = string2;
            CharSequence charSequence10 = string7 != null ? h1.a(string7, 128) : null;
            boolean bl15 = false;
            Object object5 = object3 = object2;
            boolean bl16 = false;
            ((bT)object2).a((String)charSequence10);
            object2 = object3;
            charSequence10 = charSequence;
            if (bz.b(charSequence10)) {
                bl15 = false;
                charSequence5 = null;
            } else {
                charSequence5 = charSequence10;
            }
            charSequence10 = charSequence5;
            bl15 = false;
            object5 = object3 = object2;
            bl16 = false;
            ((bT)object2).a(String.valueOf(charSequence10));
            eS.d(((bT)object3).a(dZ2.a()));
            dZ2.a(string2, string, charSequence);
        }
    }

    @Override
    public long a(@NotNull String string, long l3, @NotNull String string2) {
        int n;
        boolean bl;
        CharSequence charSequence;
        CharSequence charSequence2;
        int n2;
        int n3;
        boolean bl2;
        CharSequence[] charSequenceArray;
        boolean bl3;
        int n4;
        Object object;
        ch ch2 = this;
        boolean bl4 = false;
        jJ jJ2 = new jJ(ch2.e(), string2);
        Object object2 = kL.values();
        int n5 = 0;
        Object object3 = object2;
        Object object4 = new ArrayList();
        boolean bl5 = false;
        for (kL kL2 : object3) {
            object = kL2;
            boolean bl6 = false;
            if (!((kL)object).a()) continue;
            object4.add(kL2);
        }
        object2 = (List)object4;
        n5 = 0;
        object3 = object2.iterator();
        while (object3.hasNext()) {
            object4 = object3.next();
            kL kL3 = (kL)object4;
            int n6 = n5;
            n4 = 0;
            Object object5 = kL3;
            boolean bl7 = false;
            object5 = aR.e(m[270] + object5);
            CharSequence charSequence3 = m[271];
            object = this;
            boolean bl8 = false;
            Object object6 = new CharSequence[]{aR.d((String)object5), charSequence3};
            bl3 = false;
            charSequenceArray = object6;
            bl2 = false;
            n3 = charSequenceArray.length;
            for (n2 = 0; n2 < n3; ++n2) {
                charSequence = charSequence2 = charSequenceArray[n2];
                bl = false;
                if (charSequence.length() > 0) continue;
                String string3 = m[272];
                throw new IllegalArgumentException(string3.toString());
            }
            object5 = ((gZ)object).c(aR.d(aR.b(aR.e(aR.b((String)object5) + m[273] + charSequence3), m[274] + jJ2)));
            boolean bl9 = false;
            Object object7 = object5;
            object6 = object7;
            bl3 = false;
            ((bT)object5).a(string);
            object5 = ((bT)object7).a(l3);
            bl9 = false;
            object7 = object5;
            object6 = object7;
            bl3 = false;
            jJ2.a((bT)object6);
            int n7 = eS.b((bT)object7);
            n5 = n6 + n7;
        }
        long l5 = n5;
        object2 = null;
        object2 = l.a(arg_0 -> gZ.c(string, arg_0));
        if (l3 > 0L) {
            Timestamp timestamp = new Timestamp(l3);
            object2 = l.a((eo_0)object2, arg_0 -> gZ.a(timestamp, arg_0));
        }
        object2 = l.a((eo_0)object2, arg_0 -> gZ.a(jJ2, arg_0));
        Object object8 = kL.values();
        boolean bl10 = false;
        object4 = object8;
        Collection collection = new ArrayList();
        n4 = 0;
        int n8 = ((kL[])object4).length;
        for (n = 0; n < n8; ++n) {
            Object object9 = object = object4[n];
            boolean bl11 = false;
            if (!(((kL)object9).a() && object9 != kL.j)) continue;
            collection.add(object);
        }
        object8 = (List)collection;
        bl10 = false;
        object4 = object8.iterator();
        while (object4.hasNext()) {
            collection = object4.next();
            kL kL4 = (kL)((Object)collection);
            n = 0;
            CharSequence charSequence4 = kL4;
            boolean bl12 = false;
            charSequence4 = aR.c(aR.e(m[275] + charSequence4), m[276]);
            object = aR.d(gl_0.c(m[277]));
            boolean bl13 = false;
            CharSequence[] charSequenceArray2 = new CharSequence[]{aR.d((String)charSequence4), object};
            bl3 = false;
            charSequenceArray = charSequenceArray2;
            bl2 = false;
            n3 = charSequenceArray.length;
            for (n2 = 0; n2 < n3; ++n2) {
                charSequence = charSequence2 = charSequenceArray[n2];
                bl = false;
                if (charSequence.length() > 0) continue;
                String string4 = m[278];
                throw new IllegalArgumentException(string4.toString());
            }
            String string5 = aR.b(aR.e(aR.b((String)charSequence4) + m[279] + object), m[280] + jJ2);
            if (l3 > 0L) {
                string5 = aR.b(string5, m[281]);
            }
            eS.b(this.c(aR.d(string5)), (eo_0)object2);
        }
        if (this.f.f().p()) {
            p p2 = this.k;
            boolean bl14 = false;
            p2.a(this);
        }
        return l5;
    }

    @Override
    public ResultSet b(@NotNull String string) {
        Object object = kL.b;
        boolean bl = false;
        object = i8.a(aR.e(m[282] + object), m[283]);
        CharSequence charSequence = m[284];
        gZ gZ2 = this;
        boolean bl2 = false;
        Object object2 = new CharSequence[]{aR.d((String)object), charSequence};
        boolean bl3 = false;
        CharSequence[] charSequenceArray = object2;
        boolean bl4 = false;
        int n = charSequenceArray.length;
        for (int i = 0; i < n; ++i) {
            CharSequence charSequence2;
            CharSequence charSequence3 = charSequence2 = charSequenceArray[i];
            boolean bl5 = false;
            if (charSequence3.length() > 0) continue;
            String string2 = m[285];
            throw new IllegalArgumentException(string2.toString());
        }
        object = gZ2.c(aR.d(aR.b(aR.e(aR.b((String)object) + m[286] + charSequence), aR.d(gl_0.c(m[287])))));
        boolean bl6 = false;
        Object object3 = object;
        object2 = object3;
        bl3 = false;
        ((bT)object).a(string);
        return eS.d((bT)object3);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void a(boolean bl) {
        try {
            if (this.f.f().I()) {
                return;
            }
            long l3 = w.a(this.d(), false, 1, null);
            if (l3 - this.d().b() <= 72000000L && !bl) {
                return;
            }
            u u2 = (u)this.h.a(u.class);
            Object object = this.d();
            int n = 0;
            boolean bl2 = false;
            ((w)object).a(l3 + (long)n);
            u.a(u2, ij.p, this, null, 0, 12, null);
            object = this.d.createStatement();
            Throwable throwable = null;
            try {
                int n2;
                int n3;
                boolean bl3;
                Object object2;
                int n4;
                boolean bl4;
                Object object3;
                Object object4 = (Statement)object;
                boolean bl5 = false;
                Object object5 = kL.values();
                boolean bl6 = false;
                Object object6 = object5;
                Collection<kL> collection = new ArrayList();
                boolean bl7 = false;
                for (CharSequence charSequence : object6) {
                    kL kL2 = charSequence;
                    boolean bl8 = false;
                    object3 = kL2;
                    bl4 = false;
                    boolean bl9 = object3.a() && object3 != kL.j;
                    if (!bl9) continue;
                    collection.add((kL)charSequence);
                }
                object5 = (List)collection;
                bl6 = false;
                object6 = object5.iterator();
                while (object6.hasNext()) {
                    CharSequence charSequence;
                    collection = object6.next();
                    kL kL3 = (kL)((Object)collection);
                    n4 = 0;
                    ew.a(object4);
                    Statement statement = object4;
                    charSequence = kL3;
                    boolean bl10 = false;
                    charSequence = aR.c(aR.e(m[288] + charSequence), m[289]);
                    CharSequence charSequence2 = m[290];
                    boolean bl11 = false;
                    object3 = new CharSequence[]{aR.d((String)charSequence), charSequence2};
                    bl4 = false;
                    object2 = object3;
                    bl3 = false;
                    n3 = ((CharSequence[])object2).length;
                    for (int i = 0; i < n3; ++i) {
                        CharSequence charSequence3;
                        CharSequence charSequence4 = charSequence3 = object2[i];
                        boolean bl12 = false;
                        if (charSequence4.length() > 0) continue;
                        String string = m[291];
                        throw new IllegalArgumentException(string.toString());
                    }
                    charSequence = aR.d(aR.b(aR.b(aR.e(aR.b((String)charSequence) + m[292] + charSequence2), m[293]), m[294] + l3));
                    boolean bl13 = false;
                    Statement statement2 = statement;
                    object3 = statement2;
                    bl4 = false;
                    statement.addBatch(((Object)charSequence).toString());
                }
                long l5 = this.f.f().bb();
                if (l5 > 0L) {
                    object6 = kL.values();
                    boolean bl14 = false;
                    Iterator iterator = object6;
                    Collection<Object> collection2 = new ArrayList();
                    n2 = 0;
                    for (Object object7 : iterator) {
                        object3 = object7;
                        bl4 = false;
                        object2 = object3;
                        bl3 = false;
                        boolean bl15 = object2.a() && object2 != kL.j;
                        if (!bl15) continue;
                        collection2.add(object7);
                    }
                    object6 = (List)collection2;
                    bl14 = false;
                    iterator = object6.iterator();
                    while (iterator.hasNext()) {
                        collection2 = iterator.next();
                        kL kL4 = (kL)((Object)collection2);
                        int n5 = 0;
                        ew.a(object4);
                        Object object8 = object4;
                        CharSequence charSequence = kL4;
                        boolean bl16 = false;
                        charSequence = aR.c(aR.e(m[295] + charSequence), m[296]);
                        CharSequence charSequence5 = m[297];
                        boolean bl17 = false;
                        object2 = new CharSequence[]{aR.d((String)charSequence), charSequence5};
                        bl3 = false;
                        CharSequence[] charSequenceArray = object2;
                        n3 = 0;
                        int n6 = charSequenceArray.length;
                        for (int i = 0; i < n6; ++i) {
                            CharSequence charSequence6;
                            CharSequence charSequence7 = charSequence6 = charSequenceArray[i];
                            boolean bl18 = false;
                            if (charSequence7.length() > 0) continue;
                            String string = m[298];
                            throw new IllegalArgumentException(string.toString());
                        }
                        charSequence = aR.d(aR.b(aR.b(aR.e(aR.b((String)charSequence) + m[299] + charSequence5), m[300]), m[301] + l5 + m[302] + l3));
                        boolean bl19 = false;
                        Object object9 = object8;
                        object2 = object9;
                        bl3 = false;
                        object8.addBatch(((Object)charSequence).toString());
                    }
                }
                w w2 = this.d();
                ew.a(object4);
                object6 = w2.a((Statement)object4);
                if (this.f.a(100)) {
                    Object object10 = object6;
                    n4 = 0;
                    int n7 = ((kL[])object10).length;
                    for (n2 = 0; n2 < n7; ++n2) {
                        kL kL5;
                        kL kL6 = kL5 = object10[n2];
                        int n8 = n4;
                        boolean bl20 = false;
                        int n9 = Math.max((int)kL6, 0);
                        n4 = n8 + n9;
                    }
                    int n10 = n4;
                    if (n10 > 0) {
                        this.f.a((Object)(m[303] + n10 + m[304] + l3 + ')'));
                    }
                }
                object4 = iv_0.a;
            }
            catch (Throwable throwable2) {
                throwable = throwable2;
                throw throwable2;
            }
            finally {
                f_.a((AutoCloseable)object, throwable);
            }
        }
        catch (SQLException sQLException) {
            String string = sQLException.getMessage();
            boolean bl21 = string != null ? bz.b(string, m[305], false, 2, null) : false;
            if (bl21) {
                return;
            }
            throw sQLException;
        }
    }

    @Override
    public int a(@NotNull iA iA2) {
        CharSequence charSequence;
        int n;
        Object object = kL.g;
        boolean bl = false;
        object = aR.c(aR.e(m[306] + object), m[307]);
        String[] stringArray = (String[])m[308];
        gZ gZ2 = this;
        boolean bl2 = false;
        Object object2 = new CharSequence[]{aR.d((String)object), stringArray};
        boolean bl3 = false;
        CharSequence[] charSequenceArray = object2;
        boolean bl4 = false;
        int n2 = charSequenceArray.length;
        for (n = 0; n < n2; ++n) {
            CharSequence charSequence2;
            charSequence = charSequence2 = charSequenceArray[n];
            boolean bl5 = false;
            if (charSequence.length() > 0) continue;
            String string = m[309];
            throw new IllegalArgumentException(string.toString());
        }
        object = gZ2.c(aR.d(aR.d(aR.e(aR.b((String)object) + m[310] + stringArray), m[311])));
        stringArray = new String[]{m[312], iA2.b(), iA2.i()};
        bl2 = false;
        Object object3 = object2 = object;
        boolean bl6 = false;
        String[] stringArray2 = stringArray;
        n = 0;
        int n3 = stringArray2.length;
        for (n2 = 0; n2 < n3; ++n2) {
            CharSequence charSequence3 = charSequence = stringArray2[n2];
            boolean bl7 = false;
            ((bT)object).a((String)charSequence3);
        }
        return eS.b((bT)object2);
    }

    private final void a(Statement statement) {
        kL[] kLArray = kL.values();
        boolean bl = false;
        int n = kLArray.length;
        for (int i = 0; i < n; ++i) {
            String string;
            kL kL2;
            kL kL3 = kL2 = kLArray[i];
            boolean bl2 = false;
            String string2 = kL.a(kL3, Locale.getDefault(), false, 2, null);
            if (ew.a((Object)string2, (Object)(string = kL.a(kL3, null, false, 3, null))) || this.b((CharSequence)string) || !this.b((CharSequence)string2)) continue;
            this.h.getLogger().info(m[325] + string2 + m[326] + string + '\"');
            statement.execute(m[327] + string2 + m[328] + string);
        }
    }

    public final jr_0 b() {
        eG eG2 = this.f.f();
        boolean bl = false;
        return new jr_0(lq.g.a(eG2.aF(), eG2.a_()));
    }

    public final CharSequence a(@NotNull kL kL2, @NotNull jr_0 jr_02) {
        boolean bl;
        Object object;
        String[] stringArray;
        String string = null;
        string = m[329];
        String string2 = null;
        string2 = m[330];
        jr_0 jr_03 = jr_02;
        boolean bl2 = false;
        if (kL2 == kL.b) {
            stringArray = m[331];
            object = m[332];
            boolean bl3 = false;
            string2 = (String)stringArray + m[333] + (String)object;
        }
        if (kL2 != kL.j) {
            stringArray = m[334];
            int n = 36;
            String string3 = m[335];
            String string4 = jr_03.b().c();
            boolean bl4 = false;
            String string5 = w.v.b(jr_03.b().a()) ? (String)stringArray + m[336] + n + ')' + string4 + string3 : (String)stringArray + m[337] + n + ')' + string3;
            stringArray = m[338];
            n = 128;
            string3 = m[339];
            string4 = jr_03.b().c();
            bl4 = false;
            String string6 = w.v.b(jr_03.b().a()) ? (String)stringArray + m[340] + n + ')' + string4 + string3 : (String)stringArray + m[341] + n + ')' + string3;
            stringArray = m[342];
            n = 2048;
            string3 = m[343];
            string4 = jr_03.b().c();
            bl4 = false;
            String string7 = w.v.b(jr_03.b().a()) ? (String)stringArray + m[344] + n + ')' + string4 + string3 : (String)stringArray + m[345] + n + ')' + string3;
            stringArray = jr_03;
            object = m[346];
            string3 = m[347];
            bl = false;
            string = string5 + ',' + string6 + ',' + string7 + ',' + ((String)object + m[348] + string3);
        }
        stringArray = new String[18];
        object = jr_03;
        String string8 = m[349];
        bl = false;
        stringArray[0] = ew.a((Object)((jr_0)object).b().a(), (Object)m[350]) ? string8 + m[351] : string8 + m[352];
        object = m[353];
        int n = 36;
        String string9 = m[354];
        String string10 = m[355];
        boolean bl5 = false;
        stringArray[1] = w.v.b(jr_03.b().a()) ? (String)object + m[356] + n + ')' + string9 + string10 : (String)object + m[357] + n + ')' + string10;
        object = m[358];
        n = 45;
        string9 = m[359];
        string10 = m[360];
        bl5 = false;
        stringArray[2] = w.v.b(jr_03.b().a()) ? (String)object + m[361] + n + ')' + string9 + string10 : (String)object + m[362] + n + ')' + string10;
        object = m[363];
        n = 2048;
        string10 = m[364];
        string9 = jr_03.b().c();
        bl5 = false;
        stringArray[3] = w.v.b(jr_03.b().a()) ? (String)object + m[365] + n + ')' + string9 + string10 : (String)object + m[366] + n + ')' + string10;
        object = m[367];
        n = 36;
        string10 = m[368];
        string9 = jr_03.b().c();
        bl5 = false;
        jr_0 jr_04 = jr_03;
        String string11 = string10 + m[369];
        boolean bl6 = false;
        stringArray[4] = w.v.b(jr_04.b().a()) ? (String)object + m[370] + n + ')' + string9 + string11 : (String)object + m[371] + n + ')' + string11;
        object = m[372];
        n = 128;
        string10 = m[373];
        string9 = jr_03.b().c();
        bl5 = false;
        stringArray[5] = w.v.b(jr_03.b().a()) ? (String)object + m[374] + n + ')' + string9 + string10 : (String)object + m[375] + n + ')' + string10;
        stringArray[6] = string;
        object = jr_03;
        String string12 = m[376];
        boolean bl7 = false;
        stringArray[7] = string12 + m[377];
        object = jr_03;
        string12 = m[378];
        bl7 = false;
        stringArray[8] = string12 + m[379];
        object = jr_03;
        string12 = m[380];
        String string13 = m[381];
        boolean bl8 = false;
        String string14 = ((jr_0)object).b().a();
        stringArray[9] = ew.a((Object)string14, (Object)m[382]) || ew.a((Object)string14, (Object)m[383]) ? string12 + m[384] + string13 : string12 + m[385] + ((jr_0)object).b().e() + m[386] + string13;
        object = m[387];
        int n2 = 32;
        string13 = m[388];
        String string15 = jr_03.b().c();
        boolean bl9 = false;
        stringArray[10] = w.v.b(jr_03.b().a()) ? (String)object + m[389] + n2 + ')' + string15 + string13 : (String)object + m[390] + n2 + ')' + string13;
        object = m[391];
        n2 = 32;
        string13 = m[392];
        string15 = jr_03.b().c();
        bl9 = false;
        stringArray[11] = w.v.b(jr_03.b().a()) ? (String)object + m[393] + n2 + ')' + string15 + string13 : (String)object + m[394] + n2 + ')' + string13;
        object = m[395];
        String string16 = m[396];
        boolean bl10 = false;
        stringArray[12] = (String)object + m[397] + string16;
        object = m[398];
        string16 = m[399];
        bl10 = false;
        stringArray[13] = (String)object + m[400] + string16;
        object = jr_03;
        string16 = m[401];
        String string17 = m[402];
        boolean bl11 = false;
        stringArray[14] = string16 + m[403] + string17;
        object = m[404];
        string16 = m[405];
        boolean bl12 = false;
        stringArray[15] = (String)object + m[406] + string16;
        stringArray[16] = string2;
        object = jr_03;
        string16 = m[407];
        bl12 = false;
        stringArray[17] = m[408] + string16 + ')';
        return aR.d(jr_03.a(kL2, stringArray));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private final void a(dc_0 dc_02) {
        dc_0 dc_03 = dc_02;
        boolean bl = false;
        AutoCloseable autoCloseable = this.f();
        Throwable throwable = null;
        try {
            Object object = (Statement)autoCloseable;
            boolean bl2 = false;
            if (dc_03.c()) {
                Iterable iterable = dc_03.b();
                boolean bl3 = false;
                for (Object t2 : iterable) {
                    String string = ((aR)t2).c();
                    boolean bl4 = false;
                    try {
                        Object object2 = object;
                        aR aR2 = aR.d(string);
                        boolean bl5 = false;
                        object2.execute(((Object)aR2).toString());
                    }
                    catch (SQLException sQLException) {
                        q_0.a(dc_03.e(), sQLException, 0, 2, null);
                    }
                }
            } else {
                Iterable iterable = dc_03.b();
                boolean bl6 = false;
                for (Object t3 : iterable) {
                    Object object3;
                    CharSequence charSequence = (CharSequence)t3;
                    boolean bl7 = false;
                    boolean bl8 = false;
                    Object object4 = object;
                    boolean bl9 = false;
                    Object object5 = object3 = object4;
                    boolean bl10 = false;
                    object4.addBatch(((Object)charSequence).toString());
                }
                if (!((Collection)dc_03.b()).isEmpty()) {
                    object.executeBatch();
                }
            }
            object = iv_0.a;
        }
        catch (Throwable throwable2) {
            throwable = throwable2;
            throw throwable2;
        }
        finally {
            f_.a(autoCloseable, throwable);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final void a(boolean bl, @NotNull q_0 q_02, @NotNull jr_0 jr_02, boolean bl2) {
        boolean bl3;
        int n;
        boolean bl4;
        int n2;
        dc_0 dc_02 = new dc_0(this.h, this, bl, null, 8, null);
        if (bl2) {
            n2 = 0;
        } else {
            int n3;
            try {
                String string;
                String string2;
                Object object = kL.i;
                CharSequence charSequence = m[506];
                bl4 = false;
                object = eS.d(this.c(aR.d(aR.a(aR.e(m[507] + charSequence + m[508] + object), (Number)1))));
                n = 1;
                bl4 = false;
                if (object.next()) {
                    String string3;
                    Object object2 = object;
                    bl3 = false;
                    try {
                        string3 = object2.getString(n);
                    }
                    catch (SQLException sQLException) {
                        string3 = null;
                    }
                    string2 = string3;
                } else {
                    string2 = string = null;
                }
                if (string2 == null) {
                    string = jb_0.b();
                }
                String string4 = string;
                ew.a((Object)string4);
                n3 = Integer.parseInt(string4);
            }
            catch (SQLException sQLException) {
                q_0.a(q_02, sQLException, 0, 2, null);
                n3 = 0;
            }
            n2 = n3;
        }
        int n4 = n2;
        Object object = q_02;
        boolean bl5 = false;
        if (((q_0)object).g()) {
            q_0 q_03 = object;
            boolean bl6 = false;
            q_03.a((Object)(m[509] + n4 + m[510] + jb_0.b()));
        }
        if (n4 <= 1168) {
            Object object3 = object = (u)this.h.a(u.class);
            boolean bl7 = false;
            ((u)object3).c(this);
        }
        object = this.f();
        Throwable throwable = null;
        try {
            boolean bl8;
            Object object4;
            int n3;
            Object object5;
            Object object6 = (Statement)object;
            n = 0;
            this.a((Statement)object6);
            bl4 = ew.a((Object)q_02.f().aF(), (Object)m[511]);
            boolean bl9 = this.b(kL.k);
            bl3 = this.b(kL.m);
            boolean bl10 = this.b(kL.b);
            boolean bl11 = this.b(kL.k, m[512], bl4);
            boolean bl12 = this.b(kL.b, m[513], bl4);
            if (!bl3 && bl9 && bl11) {
                int n6;
                CharSequence[] charSequenceArray;
                CharSequence charSequence;
                int n5;
                object5 = object6;
                Object object7 = this.a(kL.m, jr_02);
                boolean bl13 = false;
                object5.execute(object7.toString());
                object5 = object6;
                object7 = this.a(kL.b, jr_02);
                bl13 = false;
                object5.execute(object7.toString());
                object7 = object6;
                Object object8 = kL.k;
                CharSequence charSequence2 = m[514];
                boolean bl14 = false;
                object8 = aR.e(m[515] + charSequence2 + m[516] + object8);
                charSequence2 = m[517];
                bl14 = false;
                CharSequence[] charSequenceArray2 = new CharSequence[]{aR.d((String)object8), charSequence2};
                boolean bl15 = false;
                CharSequence[] bl21 = charSequenceArray2;
                n3 = 0;
                int n7 = bl21.length;
                for (n5 = 0; n5 < n7; ++n5) {
                    CharSequence charSequence3 = charSequence = bl21[n5];
                    boolean bl6 = false;
                    if (charSequence3.length() > 0) continue;
                    String string = m[518];
                    throw new IllegalArgumentException(string.toString());
                }
                object8 = aR.d(aR.e(aR.b((String)object8) + m[519] + charSequence2));
                boolean bl17 = false;
                object5 = object7.executeQuery(object8.toString());
                boolean bl18 = false;
                object8 = (AutoCloseable)object5;
                Throwable throwable2 = null;
                try {
                    charSequenceArray = (ResultSet)object8;
                    n6 = 0;
                    while (object5.next()) {
                        Object object9 = object5;
                        boolean charSequenceArray3 = false;
                        this.c(this.a((ResultSet)object9, a_.values()[object9.getInt(m[520])]));
                    }
                    charSequenceArray = iv_0.a;
                }
                catch (Throwable throwable3) {
                    throwable2 = throwable3;
                    throw throwable3;
                }
                finally {
                    f_.a((AutoCloseable)object8, throwable2);
                }
                object5 = object6;
                object4 = kL.k;
                boolean bl20 = false;
                object4 = aR.e(m[521] + object4);
                CharSequence charSequence4 = m[522];
                bl8 = false;
                charSequenceArray = new CharSequence[]{aR.d((String)object4), charSequence4};
                n6 = 0;
                CharSequence[] charSequenceArray4 = charSequenceArray;
                boolean bl7 = false;
                n5 = charSequenceArray4.length;
                for (n3 = 0; n3 < n5; ++n3) {
                    CharSequence charSequence5;
                    charSequence = charSequence5 = charSequenceArray4[n3];
                    boolean bl16 = false;
                    if (charSequence.length() > 0) continue;
                    String string = m[523];
                    throw new IllegalArgumentException(string.toString());
                }
                object4 = aR.d(aR.e(aR.b((String)object4) + m[524] + charSequence4));
                boolean bl23 = false;
                object5.executeUpdate(object4.toString());
            }
            if (!ew.a((Object)q_02.f().aF(), (Object)m[525])) {
                object5 = this.b();
                if (bl11) {
                    object4 = object6;
                    CharSequence charSequence = kL.k;
                    bl8 = false;
                    charSequence = aR.d(aR.h(aR.e(m[526] + charSequence), m[527]));
                    bl8 = false;
                    object4.execute(((Object)charSequence).toString());
                }
                if (bl10 && !bl12) {
                    object4 = object6;
                    CharSequence charSequence = kL.b;
                    bl8 = false;
                    charSequence = aR.d(aR.f(aR.e(m[528] + charSequence), m[529]));
                    bl8 = false;
                    object4.execute(((Object)charSequence).toString());
                    object4 = object6;
                    charSequence = kL.b;
                    bl8 = false;
                    charSequence = aR.d(aR.c(aR.e(m[530] + charSequence), m[531]));
                    bl8 = false;
                    object4.executeUpdate(((Object)charSequence).toString());
                }
                if (bl || bl9) {
                    object4 = object5;
                    boolean bl24 = false;
                    for (kL kL2 : kL.values()) {
                        if (kL2.a()) {
                            dc_02.a(kL2);
                            if (kL2 != kL.j) {
                                dc_02.a(kc_0.a(m[532], cX.a));
                                dc_02.a(kc_0.a(m[533], jB.b));
                                dc_02.a(kc_0.a(m[534], lB.a));
                                dc_02.a(kc_0.a(m[535], ef.b));
                            }
                            dc_02.a(kc_0.a(m[536], new hB((jr_0)object4)));
                            dc_02.a(kc_0.a(m[537], new c3((jr_0)object4)));
                            dc_02.a(kc_0.a(m[538], arg_0 -> gZ.b((jr_0)object4, arg_0)));
                            dc_02.a(kc_0.a(m[539], arg_0 -> gZ.a((jr_0)object4, arg_0)));
                        }
                        if (kL2 == kL.g || !w.v.b(q_02.f().aF()) || n4 > 680) continue;
                        kL kL3 = kL2;
                        n3 = 0;
                        aR.g(aR.e(m[540] + kL3), ((jr_0)object5).b().c());
                    }
                    if (bl || n4 < 883) {
                        dc_02.a(kL.i);
                        dc_02.a(kc_0.a(m[541], new hP((jr_0)object4)));
                    }
                    if (!((Collection)dc_02).isEmpty()) {
                        this.h.getLogger().info(m[542]);
                        this.a(dc_02);
                        this.h.getLogger().info(m[543]);
                    }
                }
            }
            object6 = iv_0.a;
        }
        catch (Throwable throwable4) {
            throwable = throwable4;
            throw throwable4;
        }
        finally {
            f_.a((AutoCloseable)object, throwable);
        }
    }

    @Override
    public boolean a() {
        return kR.b(this);
    }

    @Override
    public w d() {
        return kR.a(this);
    }

    @Override
    public List a(@NotNull iA iA2, @NotNull a_ a_2, @NotNull String string, boolean bl, int n) {
        return kR.a((ch)this, iA2, a_2, string, bl, n);
    }

    @Override
    public List a(@NotNull dZ dZ2, int n) {
        return kR.a((ch)this, dZ2, n);
    }

    @Override
    public List a(@NotNull jv_0 jv_02, @NotNull a_ a_2, boolean bl, int n) {
        return kR.a((ch)this, jv_02, a_2, bl, n);
    }

    @Override
    public List b(@NotNull ResultSet resultSet, @NotNull a_ a_2) {
        return kR.a((ch)this, resultSet, a_2);
    }

    @Override
    public String a(@NotNull jv_0 jv_02) {
        return kR.a((ch)this, jv_02);
    }

    @Override
    public CharSequence b(@NotNull CharSequence charSequence, @NotNull jv_0 jv_02) {
        return kR.a((ch)this, charSequence, jv_02);
    }

    @Override
    public CharSequence a(@NotNull CharSequence charSequence, @Nullable String string, @Nullable String string2, boolean bl) {
        return kR.a((ch)this, charSequence, string, string2, bl);
    }

    @Override
    public CharSequence a(@NotNull CharSequence charSequence) {
        return kR.a((ch)this, charSequence);
    }

    @Override
    public CharSequence a(@NotNull CharSequence charSequence, @Nullable iA iA2, boolean bl) {
        return kR.a((ch)this, charSequence, iA2, bl);
    }

    @Override
    public CharSequence a(@NotNull CharSequence charSequence, @Nullable jv_0 jv_02) {
        return kR.b(this, charSequence, jv_02);
    }

    @Override
    public CharSequence a(@NotNull CharSequence charSequence, @NotNull d9 d92) {
        return kR.a((ch)this, charSequence, d92);
    }

    @Override
    public CharSequence a(@NotNull CharSequence charSequence, @Nullable dZ dZ2, boolean bl) {
        return kR.a((ch)this, charSequence, dZ2, bl);
    }

    @Override
    public CharSequence a(@NotNull CharSequence charSequence, @Nullable dZ dZ2, @Nullable iA iA2, boolean bl) {
        return kR.a((ch)this, charSequence, dZ2, iA2, bl);
    }

    @Override
    public CharSequence a(@NotNull CharSequence charSequence, @Nullable String string, @Nullable String string2, @Nullable String string3, @Nullable String string4, @Nullable String string5) {
        return kR.a((ch)this, charSequence, string, string2, string3, string4, string5);
    }

    @Override
    public boolean a(@NotNull dZ dZ2, @NotNull jv_0 jv_02) {
        return kR.a((ch)this, dZ2, jv_02);
    }

    @Override
    public boolean a(@Nullable dZ dZ2) {
        return kR.a((ch)this, dZ2);
    }

    private static final bT b(String string, bT bT2) {
        bT bT3;
        bT bT4 = bT2;
        String[] stringArray = new String[]{string};
        boolean bl = false;
        bT bT5 = bT3 = bT4;
        boolean bl2 = false;
        String[] stringArray2 = stringArray;
        boolean bl3 = false;
        int n = stringArray2.length;
        for (int i = 0; i < n; ++i) {
            String string2;
            String string3 = string2 = stringArray2[i];
            boolean bl4 = false;
            bT4.a(string3);
        }
        return bT3;
    }

    private static final bT c(String string, String string2, bT bT2) {
        bT bT3;
        bT bT4 = bT2;
        String[] stringArray = new String[]{string, string2, string2};
        boolean bl = false;
        bT bT5 = bT3 = bT4;
        boolean bl2 = false;
        String[] stringArray2 = stringArray;
        boolean bl3 = false;
        int n = stringArray2.length;
        for (int i = 0; i < n; ++i) {
            String string3;
            String string4 = string3 = stringArray2[i];
            boolean bl4 = false;
            bT4.a(string4);
        }
        return eS.a(bT3);
    }

    private static final bT b(String string, String string2, bT bT2) {
        bT bT3;
        bT bT4 = bT2;
        String[] stringArray = new String[]{string, string2, string2};
        boolean bl = false;
        bT bT5 = bT3 = bT4;
        boolean bl2 = false;
        String[] stringArray2 = stringArray;
        boolean bl3 = false;
        int n = stringArray2.length;
        for (int i = 0; i < n; ++i) {
            String string3;
            String string4 = string3 = stringArray2[i];
            boolean bl4 = false;
            bT4.a(string4);
        }
        return bT3;
    }

    private static final bT a(bT bT2) {
        return eS.a(bT2);
    }

    private static final bT a(jy jy2, bT bT2) {
        bT bT3;
        bT bT4 = bT2;
        boolean bl = false;
        bT bT5 = bT3 = bT4;
        boolean bl2 = false;
        ((jJ)jy2).a(bT5);
        return bT3;
    }

    private static final bT a(String string, String string2, c1 c12, bT bT2) {
        bT bT3;
        bT bT4 = bT2;
        String[] stringArray = new String[]{string, string2};
        boolean bl = false;
        bT bT5 = bT3 = bT4;
        boolean bl2 = false;
        String[] stringArray2 = stringArray;
        boolean bl3 = false;
        int n = stringArray2.length;
        for (int i = 0; i < n; ++i) {
            String string3;
            String string4 = string3 = stringArray2[i];
            boolean bl4 = false;
            bT4.a(string4);
        }
        bT4 = bT3;
        boolean bl5 = false;
        return bT4.a(c12.f());
    }

    private static final bT a(String string, c1 c12, bT bT2) {
        bT bT3 = bT2.a(string);
        boolean bl = false;
        return bT3.a(c12.f());
    }

    private static final bT c(bT bT2) {
        return eS.a(bT2);
    }

    private static final bT b(long l3, bT bT2) {
        return bT2.a(l3);
    }

    private static final bT a(String string, String string2, bT bT2) {
        bT bT3;
        bT bT4 = bT2;
        String[] stringArray = new String[]{string, string2};
        boolean bl = false;
        bT bT5 = bT3 = bT4;
        boolean bl2 = false;
        String[] stringArray2 = stringArray;
        boolean bl3 = false;
        int n = stringArray2.length;
        for (int i = 0; i < n; ++i) {
            String string3;
            String string4 = string3 = stringArray2[i];
            boolean bl4 = false;
            bT4.a(string4);
        }
        return bT3;
    }

    private static final bT a(String string, bT bT2) {
        return bT2.a(string);
    }

    private static final bT b(bT bT2) {
        return eS.a(bT2);
    }

    private static final bT a(long l3, bT bT2) {
        return bT2.a(l3);
    }

    private static final bT a(c1 c12, bT bT2) {
        return bT2.a(c12.f());
    }

    private static final bT c(String string, bT bT2) {
        bT bT3;
        bT bT4 = bT2;
        boolean bl = false;
        bT bT5 = bT3 = bT4;
        boolean bl2 = false;
        bT4.a(string);
        return bT3;
    }

    private static final bT a(Timestamp timestamp, bT bT2) {
        bT bT3;
        bT bT4 = bT2;
        boolean bl = false;
        bT bT5 = bT3 = bT4;
        boolean bl2 = false;
        bT4.a(timestamp);
        return bT3;
    }

    private static final bT a(jJ jJ2, bT bT2) {
        bT bT3;
        bT bT4 = bT2;
        boolean bl = false;
        bT bT5 = bT3 = bT4;
        boolean bl2 = false;
        jJ2.a(bT5);
        return bT3;
    }

    private static final aR[] b(jr_0 jr_02, kL kL2) {
        aR[] aRArray = new aR[2];
        CharSequence charSequence = kL2;
        int n = 0;
        String string = aR.e(m[544] + charSequence);
        charSequence = m[545];
        n = 32;
        String string2 = m[546];
        String string3 = jr_02.b().c();
        boolean bl = false;
        aRArray[0] = aR.d(aR.f(string, w.v.b(jr_02.b().a()) ? (String)charSequence + m[547] + n + ')' + string3 + string2 : (String)charSequence + m[548] + n + ')' + string2));
        charSequence = kL2;
        n = 0;
        aRArray[1] = aR.d(aR.e(aR.c(aR.e(m[549] + charSequence), m[550]), m[551]));
        return aRArray;
    }

    private static final aR[] a(jr_0 jr_02, kL kL2) {
        aR[] aRArray = new aR[2];
        Object object = kL2;
        boolean bl = false;
        String string = aR.e(m[552] + object);
        object = jr_02;
        String string2 = m[553];
        String string3 = m[554];
        boolean bl2 = false;
        aRArray[0] = aR.d(aR.f(string, string2 + m[555] + string3));
        object = kL2;
        boolean bl3 = false;
        object = aR.c(aR.e(m[556] + object), m[557]);
        CharSequence charSequence = m[558];
        int n = 1;
        aR[] aRArray2 = aRArray;
        boolean bl4 = false;
        CharSequence[] charSequenceArray = new CharSequence[]{aR.d((String)object), charSequence};
        boolean bl5 = false;
        CharSequence[] charSequenceArray2 = charSequenceArray;
        boolean bl6 = false;
        int n2 = charSequenceArray2.length;
        for (int i = 0; i < n2; ++i) {
            CharSequence charSequence2;
            CharSequence charSequence3 = charSequence2 = charSequenceArray2[i];
            boolean bl7 = false;
            if (charSequence3.length() > 0) continue;
            String string4 = m[559];
            throw new IllegalArgumentException(string4.toString());
        }
        String string5 = aR.e(aR.b((String)object) + m[560] + charSequence);
        aRArray2[n] = aR.d(string5);
        return aRArray;
    }

    private static final bT d(bT bT2) {
        return bT2;
    }

    public static final /* synthetic */ eo_0 a() {
        return a;
    }

    public static final /* synthetic */ int e() {
        return i;
    }

    public static final /* synthetic */ void a(int n) {
        i = n;
    }

    static {
        c = 64;
        b = 28800000;
        j = 57600000;
        e = 72000000;
        gZ.h();
        l = new dQ(null);
        a = l.a(gZ::d);
        i = 64;
    }

    private static final void h() {
        m = new String[]{"active=", " AND(until<1 OR until>?)", "uuid,ip,reason,banned_by_uuid,banned_by_name,time,until,template,server_scope,server_origin,silent,ipban,ipban_wildcard,active", "?::bit,", "pgsql", "Created new ", " for server:", "Adding entry: ", "INSERT INTO ", ")VALUES(", "#", "#", "Player name \"", "\" length > ", "UUID \"", "\" length > 36", "UPDATE ", "date=CURRENT_TIMESTAMP", "ip=?", "Failed ", " WHERE ", "uuid=?", "name=?", "DELETE FROM ", "name{=?}", "Failed ", " WHERE ", "uuid=?", "name,uuid,ip", "?", "?,", "INSERT INTO ", ")VALUES(", "New login record: [", "Duplicate entry", "COUNT(*)", "uuid=?", " OR(ipban_wildcard={true} AND active={true} AND ? LIKE ip)", " OR(ipban_wildcard={true})", " OR(ipban={true} AND(ip=?", ")AND((time+", ")>?", "))", " OR(ipban={true} AND(ip=?", "))", ")AND template NOT IN(", ",", "time", "SELECT 1 FROM INFORMATION_SCHEMA.COLUMNS WHERE TABLE_NAME LIKE '", "' AND COLUMN_NAME='", "' LIMIT 1", "h2", "ip LIKE ?", "SELECT ", " FROM ", "Failed ", " WHERE ", "date", "name", "uuid", "ip", "date", "uuid IS NOT NULL", "__ALL__", "time", "AND ", "active=", " AND(until<1 OR until>?)", "", "", " OR(ipban_wildcard=", " AND active=", " AND ? LIKE ip)", " OR(ipban_wildcard=", "ORDER BY time DESC LIMIT 1", "LIMIT 1", "(ipban=", " AND(ip=?", ")AND((time+", ")>?", "))", "(ipban=", " AND(ip=?", "))", "SELECT * FROM ", " WHERE(uuid=?", "SELECT * FROM ", " WHERE(", "SELECT * FROM ", " WHERE((uuid=? OR", "Database is slow! Pooled connection took ", " seconds to retrieve result from ", "Database is slow! Pooled connection took ", " seconds to retrieve result from ", "UUID: ", ": ", "Player is name-banned: ", " - ", " ID is ", "SELECT COUNT(*) FROM ", "", "WHERE ", "active=", " AND(until<1 OR until>?)", "uuid IS NOT NULL", "AND", " WHERE ", "WHERE", " WHERE ", "1", "SELECT ", " FROM ", "uuid=?", "Failed ", " WHERE ", "uuid,type", "?", "?,", "INSERT INTO ", ")VALUES(", "DELETE FROM ", "uuid=?", "Failed ", " WHERE ", "[CONSOLE]", "[CONSOLE]", "CONSOLE", "#", "SELECT ", " FROM ", " WHERE ", " ORDER BY date DESC LIMIT 1", "[CONSOLE]", "[CONSOLE]", "CONSOLE", "#", "SELECT ", " FROM ", " WHERE ", " ORDER BY date DESC LIMIT ", "{column.id}", "SELECT ", " FROM ", "uuid=?", "Failed ", " WHERE ", "time=?", "id", "id", "Player name \"", "\" length > ", "UUID \"", "\" length > 36", "*", "SELECT ", " FROM ", "name{=?}", "Failed ", " WHERE ", "uuid=?", "ip=?", "h2", "mysql", "SELECT * FROM ", "Failed to add ", ": ", " - ", "uuid", "ip", "reason", "banned_by_uuid", "#", "banned_by_name", "server_scope", "server_origin", "time", "until", "template", "silent", "ipban", "active", "warned", "id", "UTC", "removed_by_date", "removed_by_uuid", "removed_by_name", "removed_by_reason", "pgsql", "(active={false} OR(until>0 AND ", ">until))", "DELETE FROM ", "uuid=?", "Failed ", " WHERE ", "time>?", "COUNT(*)", "SELECT ", " FROM ", "(uuid=? OR ipban={true} AND ip=?)", "Failed ", " WHERE ", "template=?", "uuid=?", "Failed ", " WHERE ", "template=?", "active=", " AND(until<1 OR until>?)", "time>?", "template", "SELECT ", " FROM ", "(uuid=? OR ipban={true} AND ip=?)", "Failed ", " WHERE ", "uuid=?", "Failed ", " WHERE ", "active=", " AND(until<1 OR until>?)", "time>?", "", "template=? OR ", "] Add ", " from ", " = ", "a:", "sort", "00", "01:", "UPDATE ", "active={false}", "DELETE FROM ", "Failed ", " WHERE ", "active={false}", "DROP TABLE ", "DELETE FROM ", "Failed ", " WHERE ", "UPDATE ", "template=255", "UPDATE ", "until=?,reason=?", "id=?", "Failed ", " WHERE ", "active=", " AND(until<1 OR until>?)", "id", "ip", "uuid", "UPDATE ", "active={false},removed_by_date=NOW(),removed_by_uuid=?,removed_by_name=?,removed_by_reason=?", "=?", "Failed ", " WHERE ", "active=", " AND(until<1 OR until>?)", "DELETE FROM ", "id=?", "Failed ", " WHERE ", "UPDATE ", "active={false},removed_by_date=NOW(),removed_by_uuid=?,removed_by_name=?,removed_by_reason=?", "id=?", "Failed ", " WHERE ", " id=", "DELETE FROM ", "banned_by_uuid=?", "Failed ", " WHERE ", "time>?", "UPDATE ", "active={true},removed_by_name=NULL,removed_by_uuid=NULL,removed_by_reason=NULL", "active", "Failed ", " WHERE ", "removed_by_uuid=?", "removed_by_date>?", "UPDATE ", "warned", "uuid=?", "Failed ", " WHERE ", "warned", "UPDATE ", "active={false},removed_by_name='#expired',removed_by_date=NOW()", "active={true}", "Failed ", " WHERE ", "until>0", "until<", "UPDATE ", "ipban={false}", "ipban={true}", "Failed ", " WHERE ", "ipban_wildcard={false}", "(time+", ")<", "Expired ", " entries(until<", "Deadlock ", "UPDATE ", "ip=?", "uuid=?", "Failed ", " WHERE ", "ip=?", "#", "SELECT * FROM ", " WHERE(", "active=", " AND(until<1 OR until>?)", ")AND(", "uuid=?", " OR(ipban=", " AND ", "ip=?)", " OR ", ")AND(server_scope='*' OR server_scope=? OR server_scope=?)", ": ", "Renaming table \"", "\" to \"", "RENAME TABLE ", " TO ", "", "", "warned", " NOT NULL", " BIT", "removed_by_uuid", "", " VARCHAR(", " VARCHAR(", "removed_by_name", "", " VARCHAR(", " VARCHAR(", "removed_by_reason", "", " VARCHAR(", " VARCHAR(", "removed_by_date", "", " TIMESTAMP", "id", "sqlite", " INTEGER PRIMARY KEY AUTOINCREMENT", " SERIAL", "uuid", " CHARACTER SET ascii COLLATE ascii_general_ci", "", " VARCHAR(", " VARCHAR(", "ip", " CHARACTER SET ascii COLLATE ascii_general_ci", "", " VARCHAR(", " VARCHAR(", "reason", "", " VARCHAR(", " VARCHAR(", "banned_by_uuid", "", " NOT NULL", " VARCHAR(", " VARCHAR(", "banned_by_name", "", " VARCHAR(", " VARCHAR(", "time", " BIGINT NOT NULL", "until", " BIGINT NOT NULL", "template", " DEFAULT 255", "pgsql", "h2", " SMALLINT NOT NULL", " TINYINT", " NOT NULL", "server_scope", "", " VARCHAR(", " VARCHAR(", "server_origin", "", " VARCHAR(", " VARCHAR(", "silent", " NOT NULL", " BIT", "ipban", " NOT NULL", " BIT", "ipban_wildcard", " NOT NULL DEFAULT {false}", " BIT", "active", " NOT NULL", " BIT", "id", "PRIMARY KEY(", "id", "sqlite", " INTEGER PRIMARY KEY AUTOINCREMENT", " SERIAL", "info", " INT", " NOT NULL", "msg", "", " NOT NULL", " VARCHAR(", " VARCHAR(", "time", " DEFAULT CURRENT_TIMESTAMP", " TIMESTAMP", "id", "PRIMARY KEY(", "id", "sqlite", " INTEGER PRIMARY KEY AUTOINCREMENT", " SERIAL", "uuid", "pgsql", " BYTEA NOT NULL", "BINARY", ")NOT NULL", "type", "", "pgsql", "h2", " SMALLINT NOT NULL", " TINYINT", " NOT NULL", "id", "PRIMARY KEY(", "id", "sqlite", " INTEGER PRIMARY KEY AUTOINCREMENT", " SERIAL", "date", " DEFAULT CURRENT_TIMESTAMP", " TIMESTAMP", "name", "", " VARCHAR(", " VARCHAR(", "uuid", "", " VARCHAR(", " VARCHAR(", "ip", "", " VARCHAR(", " VARCHAR(", "id", "PRIMARY KEY(", "", "id", "sqlite", " INTEGER PRIMARY KEY AUTOINCREMENT", " SERIAL", "date", " DEFAULT CURRENT_TIMESTAMP", " TIMESTAMP", "name", "", " VARCHAR(", " VARCHAR(", "uuid", "", " VARCHAR(", " VARCHAR(", "ip", "", " VARCHAR(", " VARCHAR(", "id", "PRIMARY KEY(", "id", "sqlite", " INTEGER PRIMARY KEY AUTOINCREMENT", " SERIAL", "name", "", " NOT NULL", " VARCHAR(", " VARCHAR(", "uuid", "", " NOT NULL", " VARCHAR(", " VARCHAR(", "date", " DEFAULT CURRENT_TIMESTAMP", " TIMESTAMP", "id", "PRIMARY KEY(", "build", "SELECT ", " FROM ", "Database build ", " => ", "mysql", "mode", "warned", "*", "SELECT ", " FROM ", "mode<>0", "Failed ", " WHERE ", "mode", "DELETE FROM ", "mode<>0", "Failed ", " WHERE ", "sqlite", "ALTER TABLE ", "mode", "ALTER TABLE ", "warned BIT", "UPDATE ", "warned={true}", "removed_by_uuid", "removed_by_name", "removed_by_date", "removed_by_reason", "template", "server_origin", "server_scope", "ipban_wildcard", "ALTER TABLE ", "accept", "Upgrading database tables.. + ", "Upgrade ", "ALTER TABLE ", "server_scope", "", " VARCHAR(", " VARCHAR(", "UPDATE ", "server_scope='*'", "server_scope", "ALTER TABLE ", "ipban_wildcard", " NOT NULL DEFAULT {false}", " BIT", "UPDATE ", "ipban_wildcard={true}", "ip like '%\\%%'", "Failed ", " WHERE "};
    }
}

