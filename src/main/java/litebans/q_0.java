package litebans;

import java.io.Closeable;
import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.invoke.LambdaMetafactory;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IllegalFormatException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;
import litebans.Z;
import litebans.a2;
import litebans.aK;
import litebans.aR;
import litebans.a_;
import litebans.am;
import litebans.ao_0;
import litebans.api.Database;
import litebans.api.Events;
import litebans.api.PlayerProvider;
import litebans.api.RandomID;
import litebans.api.exception.MissingImplementationException;
import litebans.as;
import litebans.as_0;
import litebans.bN;
import litebans.bt_0;
import litebans.bz;
import litebans.c1;
import litebans.c5;
import litebans.cP;
import litebans.cU;
import litebans.cW;
import litebans.c_0;
import litebans.cb;
import litebans.ch;
import litebans.cz_0;
import litebans.d6;
import litebans.d8;
import litebans.dU;
import litebans.dZ;
import litebans.db_0;
import litebans.dg_0;
import litebans.di_0;
import litebans.dk;
import litebans.dr_0;
import litebans.e1;
import litebans.eE;
import litebans.eG;
import litebans.eM;
import litebans.eS;
import litebans.eV;
import litebans.ec_0;
import litebans.el;
import litebans.eo_0;
import litebans.eq_0;
import litebans.es_0;
import litebans.ew;
import litebans.fS;
import litebans.fW;
import litebans.fg_0;
import litebans.fo_0;
import litebans.fu;
import litebans.fv_0;
import litebans.g2;
import litebans.gG;
import litebans.gg_0;
import litebans.gn_0;
import litebans.gz_0;
import litebans.h1;
import litebans.h7;
import litebans.hS;
import litebans.hl;
import litebans.hy_0;
import litebans.iA;
import litebans.iX;
import litebans.ig_0;
import litebans.ij_0;
import litebans.iv;
import litebans.iv_0;
import litebans.j5;
import litebans.jP;
import litebans.jT;
import litebans.jb_0;
import litebans.jc;
import litebans.jj_0;
import litebans.jm_0;
import litebans.jv_0;
import litebans.k2;
import litebans.k4;
import litebans.kL;
import litebans.kR;
import litebans.k_0;
import litebans.kc_0;
import litebans.kr_0;
import litebans.lE;
import litebans.lP;
import litebans.ll;
import litebans.lo_0;
import litebans.n_0;
import litebans.o;
import litebans.w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class q_0
extends n_0 {
    public static final ig_0 j;
    private byte b;
    private final byte s;
    private byte c;
    private final ThreadLocal y = new j5(this);
    public eG n;
    public k2 k;
    public fu A;
    public h7 m;
    private final cU d = new cU(() -> q_0.a(this));
    private final eE f = bN.a(() -> q_0.c(this));
    private Object v;
    private fv_0 B;
    private boolean q;
    private boolean e = true;
    private int u;
    private final dU C = new dU(false, false, 3, null);
    private aK p;
    private long l = Long.MAX_VALUE;
    private byte x;
    private String h;
    private iX D = new ij_0();
    public static final int i;
    public static final String o;
    public static final int r;
    private static int t;
    private static final AtomicBoolean z;
    private static final AtomicBoolean g;
    private static /* synthetic */ String[] w;

    public q_0(@NotNull di_0 di_02) {
        super(di_02);
        int n;
        Integer[] integerArray = new Integer[]{29, 5, 7, 1, 5};
        q_0 q_02 = this;
        int n2 = 0;
        for (Integer n3 : integerArray) {
            int n4 = ((Number)n3).intValue();
            n = n2;
            boolean bl = false;
            int n5 = this.x ^ n4;
            n2 = n + n5;
        }
        n = n2;
        q_02.s = (byte)n;
    }

    public final byte a() {
        return this.b;
    }

    public final void a(byte by2) {
        this.b = by2;
    }

    public final ThreadLocal c() {
        return this.y;
    }

    public final eG f() {
        eG eG2 = this.n;
        if (eG2 != null) {
            return eG2;
        }
        ew.e("");
        return null;
    }

    public final void a(@NotNull eG eG2) {
        this.n = eG2;
    }

    public final k2 z() {
        k2 k22 = this.k;
        if (k22 != null) {
            return k22;
        }
        ew.e("");
        return null;
    }

    public final void a(@NotNull k2 k22) {
        this.k = k22;
    }

    public final fu s() {
        fu fu2 = this.A;
        if (fu2 != null) {
            return fu2;
        }
        ew.e("");
        return null;
    }

    public final void a(@NotNull fu fu2) {
        this.A = fu2;
    }

    public final h7 b() {
        h7 h72 = this.m;
        if (h72 != null) {
            return h72;
        }
        ew.e("");
        return null;
    }

    public final void a(@NotNull h7 h72) {
        this.m = h72;
    }

    public final lE k() {
        eE eE2 = this.d;
        return (lE)eE2.a();
    }

    public final boolean y() {
        eE eE2 = this.f;
        return (Boolean)eE2.a();
    }

    public final Object B() {
        return this.v;
    }

    public final fv_0 h() {
        return this.B;
    }

    public final void a(@Nullable fv_0 fv_02) {
        this.B = fv_02;
    }

    public final boolean x() {
        return this.e;
    }

    public final void a(boolean bl) {
        this.e = bl;
    }

    public final int m() {
        return this.u;
    }

    public final void b(int n) {
        this.u = n;
    }

    public final dU r() {
        return this.C;
    }

    public final aK w() {
        return this.p;
    }

    public final void a(@Nullable aK aK2) {
        this.p = aK2;
    }

    public final long q() {
        return this.l;
    }

    public final void a(long l3) {
        this.l = l3;
    }

    public final byte l() {
        return this.x;
    }

    public final void c(byte by2) {
        this.x = by2;
    }

    public final String j() {
        return this.h;
    }

    public final void c(@Nullable String string) {
        this.h = string;
    }

    public final iX i() {
        return this.D;
    }

    public final void a(@NotNull iX iX2) {
        this.D = iX2;
    }

    public final boolean a(int n) {
        return this.b >= n;
    }

    public final void a(int n, @Nullable Object object) {
        if (this.a(n)) {
            this.a(object);
        }
    }

    public final void a(@Nullable Object object) {
        if (object instanceof Throwable) {
            ((Throwable)object).printStackTrace();
        } else {
            n_0 n_02 = this;
            String string = String.valueOf(object);
            boolean bl = false;
            n_02.a.getLogger().info(string);
        }
    }

    public final boolean g() {
        return this.b == this.s;
    }

    public final int a(@NotNull CharSequence[] charSequenceArray) {
        if (this.g()) {
            CharSequence[] charSequenceArray2;
            for (CharSequence charSequence : charSequenceArray2 = charSequenceArray) {
                boolean bl = false;
                this.a(charSequence);
            }
            return c_0.b(charSequenceArray2.length);
        }
        return -1;
    }

    public final void a(@Nullable Object object, int n) {
        if (this.g()) {
            if (object instanceof Throwable) {
                n_0 n_02 = this;
                String string = "0xAAA";
                boolean bl = false;
                n_02.a.getLogger().warning(string);
                ((Throwable)object).printStackTrace();
            } else {
                n_0 n_03 = this;
                String string = "0xAAA " + object;
                boolean bl = false;
                n_03.a.getLogger().warning(string);
                Thread.dumpStack();
            }
        } else if (n == 1 && object instanceof Throwable) {
            Object object2 = object.getClass().getName();
            boolean bl = false;
            int n2 = 0;
            for (int i = 0; i < object2.length(); ++i) {
                char c;
                char c10 = c = object2.charAt(i);
                int n3 = n2;
                boolean bl2 = false;
                int n4 = c10 ^ 0x17;
                n2 = n3 + n4;
            }
            int n5 = n2;
            if (n5 == 3140) {
                object2 = new iX(0L, 1, null);
                this.x = (byte)(((iX)object2).a(2) + 1);
                this.l = (long)((iX)object2).a(23) + 1L;
            }
        }
    }

    public static /* synthetic */ void a(q_0 q_02, Object object, int n, int n2, Object object2) {
        if ((n2 & 2) != 0) {
            n = 0;
        }
        q_02.a(object, n);
    }

    public final String b(@Nullable String string) {
        Object object = this.B;
        if (object == null || (object = ((fv_0)object).b(string)) == null) {
            object = "geoip.unavailable";
        }
        return object;
    }

    @Override
    public void c() {
        this.c = 0;
        this.a.m();
        g.set(false);
        q_0 q_02 = this;
        boolean bl = false;
        if (q_02.f().D()) {
            try {
                Object object;
                o o2 = (o)q_02.a.a(o.class);
                Object object2 = q_02.a.getDataFolder();
                String string = "lockdown.yml";
                boolean bl2 = false;
                File file = new File((File)object2, string);
                if (!file.exists() || gg_0.d() == null) {
                    object2 = q_02.a.getDataFolder();
                    string = "lockdown.json";
                    bl2 = false;
                    file = new File((File)object2, string);
                }
                gG gG2 = o2.e();
                if ((gG2 != null ? gG2.c() : null) == null) {
                    object = d6.b(file);
                } else {
                    object2 = q_02.a.a(file).g();
                    gG gG3 = o2.e();
                    gG gG4 = o2.e();
                    object = object2.b("reason", gG3 != null ? gG3.c() : null).b("scope", gG4 != null ? gG4.a() : null).h();
                }
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }

    public final void b(byte by2) {
        try {
            this.a(by2, false);
            throw new as();
        }
        catch (Exception exception) {
            n_0 n_02 = this;
            String string = exception.getMessage();
            if (string == null) {
                string = ".. + ";
            }
            String string2 = string;
            boolean bl = false;
            n_02.a.getLogger().warning(string2);
            return;
        }
    }

    public final Void a(byte by2, boolean bl) {
        if (bl) {
            q_0 q_02 = this;
            boolean bl2 = false;
            if (q_02.g()) {
                q_0 q_03 = q_02;
                boolean bl3 = false;
                q_03.a((Object)("" + '!' + by2 + '!'));
            }
        }
        throw new RuntimeException("Error 0x" + by2);
    }

    @Override
    public void a() {
        g2.b.a(true);
        g2.b.a(this.a);
        if (this.c >= 1) {
            return;
        }
        this.c = 1;
        this.u();
        try {
            this.a.a("config.yml");
        }
        catch (Exception exception) {
            this.a(exception);
        }
        this.a.o();
        Object object = this;
        boolean bl = false;
        Logger logger = ((q_0)object).a.getLogger();
        boolean bl2 = false;
        Throwable throwable = ((q_0)object).a.h().b();
        if (throwable != null) {
            Throwable throwable2 = throwable;
            ((q_0)object).a("config", throwable2);
            if (((q_0)object).a.h().c().exists()) {
                logger.severe("[!!] Your configuration might be invalid. It can be verified with https://yaml-online-parser.appspot.com/");
            } else {
                logger.severe("[!!] Configuration does not exist! Ensure that read/write permissions are correct. (\"" + ((q_0)object).a.h().c().getAbsolutePath() + "\")");
            }
            if (((q_0)object).a(2)) {
                ((q_0)object).a(throwable2);
            }
        }
        object = new eG(this.a, null, 2, null);
        this.a((eG)object);
    }

    private final void u() {
        if (gg_0.d() == null) {
            w w2 = (w)this.a.a(w.class);
            jP jP2 = new jP("SnakeYAML", dg_0.class.getName(), "https://repo1.maven.org/maven2/org/yaml/snakeyaml/2.4/snakeyaml-2.4.jar", "2.4", "ef779af5d29a9dde8cc70ce0341f5c6f7735e23edff9685ceaa9d35359b7bb7f");
            Object object = litebans.w.a(w2, jP2, false, false, 2, null);
            ew.b(object, "");
            Class clazz = (Class)object;
            this.a.a(new eV(this, clazz));
        }
    }

    @Override
    public void e() {
        block97: {
            block96: {
                var1_1 = this.a;
                var2_2 = (o)var1_1.a(o.class);
                if (this.c >= 2) {
                    return;
                }
                this.a();
                this.c = (byte)2;
                var1_1.b((Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, a(litebans.q_0 litebans.di_0 ), ()V)((q_0)this, (di_0)var1_1));
                var2_2.b(this.f().aF());
                ew.a(var1_1);
                var3_3 = new fu(var1_1, null, false, 6, null);
                var73_5 = this;
                var4_6 = false;
                var6_9 = var5_7 = var3_3;
                var7_10 = false;
                var8_14 = null;
                try {
                    block112: {
                        var3_3.c().a("templates.yml");
                        var8_14 = var3_3.c().a(var3_3.b()).g();
                        var8_14.a(gn_0.b("templates.yml", null));
                        var3_3.a(var8_14);
                        var3_3.d().clear();
                        var9_20 = var3_3;
                        var10_22 = false;
                        v0 = var9_20.a();
                        ew.a(v0);
                        var11_23 = v0;
                        var12_24 = a_.l.a();
                        var13_25 = false;
                        var14_28 = var12_24;
                        var15_30 = new ArrayList<E>(ll.a((Iterable)var12_24, 10));
                        var16_32 = false;
                        for (Object var18_36 : var14_28) {
                            var19_38 = (a_)var18_36;
                            var20_41 = var15_30;
                            var21_42 = false;
                            var20_41.add(kc_0.a(var19_38, var11_23.a(var19_38 + "-templates")));
                        }
                        var22_45 = (List)var15_30;
                        for (jT var13_26 : var22_45) {
                            var14_29 = 0;
                            var14_29 = 0;
                            var15_30 = (kr_0)var13_26.e();
                            if (var15_30 == null) continue;
                            var16_33 = var15_30.a(false);
                            var17_35 = var9_20.d();
                            ew.a(var16_33);
                            var18_36 = var16_33;
                            var19_39 = false;
                            var21_43 = var18_36;
                            var23_46 = new ArrayList<E>(ll.a(var18_36, 10));
                            var24_47 = false;
                            var25_48 = var21_43.iterator();
                            while (var25_48.hasNext()) {
                                block105: {
                                    block104: {
                                        var26_49 = var25_48.next();
                                        var27_50 = (String)var26_49;
                                        var20_41 = var23_46;
                                        var28_51 = false;
                                        var29_52 = var9_20;
                                        var30_53 = var14_29;
                                        var14_29 = hy_0.a((byte)(var30_53 + 1));
                                        var31_60 = (a_)var13_26.b();
                                        v1 = var13_26.e();
                                        ew.a(v1);
                                        var32_63 = ((kr_0)v1).a((String)var27_50);
                                        ew.a(var27_50);
                                        var33_65 = var27_50;
                                        var34_68 = false;
                                        if (!(var32_63 != null)) {
                                            var35_73 = false;
                                            var35_74 = "Empty template: '" + (String)var33_65 + '\'';
                                            throw new IllegalArgumentException(var35_74.toString());
                                        }
                                        if (!(bz.c((CharSequence)var33_65, ' ', false, 2, null) == false && bz.c((CharSequence)var33_65, '.', false, 2, null) == false)) {
                                            var35_75 = false;
                                            var35_76 = "Template name '" + (String)var33_65 + "' cannot include dots or spaces! Use dashes or underscores instead + ";
                                            throw new IllegalArgumentException(var35_76.toString());
                                        }
                                        var35_72 = "";
                                        var36_81 = false;
                                        if (!(var32_63 != null)) {
                                            var37_86 = false;
                                            var37_87 = var31_60 + " template '" + (String)var35_72 + "' has invalid section + ";
                                            throw new IllegalArgumentException(var37_87.toString());
                                        }
                                        var38_92 = var32_63.a(false);
                                        var37_88 = null;
                                        var39_94 = null;
                                        var40_99 = null;
                                        var41_105 = null;
                                        var42_109 = null;
                                        var43_117 = null;
                                        var43_117 = ll.e();
                                        var44_125 = null;
                                        var44_125 = ll.e();
                                        ew.a(var38_92);
                                        var45_132 /* !! */  = (Iterable)var38_92;
                                        var46_137 = false;
                                        for (T var48_153 : var45_132 /* !! */ ) {
                                            block100: {
                                                block103: {
                                                    block101: {
                                                        block98: {
                                                            block99: {
                                                                block102: {
                                                                    var49_158 = (String)var48_153;
                                                                    var50_164 = false;
                                                                    var51_169 = var49_158;
                                                                    if (var51_169 == null) continue;
                                                                    switch (var51_169.hashCode()) {
                                                                        case -1992012396: {
                                                                            if (var51_169.equals("duration")) break;
                                                                            ** break;
                                                                        }
                                                                        case -1618876223: {
                                                                            if (!var51_169.equals("broadcast")) {
                                                                                ** break;
                                                                            }
                                                                            break block98;
                                                                        }
                                                                        case -934964668: {
                                                                            if (!var51_169.equals("reason")) {
                                                                                ** break;
                                                                            }
                                                                            break block99;
                                                                        }
                                                                        case 97513095: {
                                                                            if (!var51_169.equals("flags")) {
                                                                                ** break;
                                                                            }
                                                                            break block100;
                                                                        }
                                                                        case -517618225: {
                                                                            if (!var51_169.equals("permission")) {
                                                                                ** break;
                                                                            }
                                                                            break block101;
                                                                        }
                                                                        case 954925063: {
                                                                            if (!var51_169.equals("message")) {
                                                                                ** break;
                                                                            }
                                                                            break block102;
                                                                        }
                                                                        case -1161803523: {
                                                                            if (!var51_169.equals("actions")) {
                                                                                ** break;
                                                                            }
                                                                            break block103;
                                                                        }
                                                                    }
                                                                    var37_88 = (long)db_0.a(dk.d, var32_63.e((String)var49_158), 0.0, 2, null);
                                                                    ** break;
                                                                }
                                                                var39_94 = var32_63.e((String)var49_158);
                                                                ** break;
                                                            }
                                                            var40_99 = var32_63.e((String)var49_158);
                                                            ** break;
                                                        }
                                                        var41_105 = var32_63.e((String)var49_158);
                                                        ** break;
                                                    }
                                                    var42_109 = var32_63.e((String)var49_158);
                                                    ** break;
                                                }
                                                var43_117 = var29_52.a(var32_63, (String)var49_158);
                                                ** break;
                                            }
                                            var44_125 = var29_52.a(var32_63, (String)var49_158);
lbl150:
                                            // 15 sources

                                        }
                                        var52_175 = jc.a[var31_60.ordinal()] == 1 ? new c5((String)var39_94, var40_99, (String)var41_105, (String)var42_109, var43_117, (List)var44_125) : (c5)new cW(var37_88, (String)var39_94, var40_99, (String)var41_105, (String)var42_109, var43_117, (List)var44_125);
                                        var36_80 = var29_52;
                                        var37_86 = false;
                                        v2 = var32_63.a("ladder");
                                        if (v2 != null) break block104;
                                        v3 = ll.e();
                                        break block105;
                                    }
                                    var38_92 = v2;
                                    var39_94 = var38_92.a(false);
                                    var40_100 = false;
                                    var41_105 = var39_94;
                                    var42_109 = new ArrayList<E>(ll.a((Iterable)var39_94, 10));
                                    var43_118 = false;
                                    var44_125 = var41_105.iterator();
                                    while (var44_125.hasNext()) {
                                        var45_132 /* !! */  = var44_125.next();
                                        var46_138 = (String)var45_132 /* !! */ ;
                                        var47_144 = var42_109;
                                        var48_154 = false;
                                        var47_144.add(var38_92.a(var46_138));
                                    }
                                    var39_94 = (List)var42_109;
                                    var40_100 = false;
                                    var41_105 = var39_94;
                                    var42_109 = new ArrayList<E>(ll.a((Iterable)var39_94, 10));
                                    var43_118 = false;
                                    var44_125 = var41_105.iterator();
                                    while (var44_125.hasNext()) {
                                        var45_132 /* !! */  = var44_125.next();
                                        var46_139 = (kr_0)var45_132 /* !! */ ;
                                        var47_144 = var42_109;
                                        var48_155 = false;
                                        var49_158 = var36_80;
                                        var50_164 = false;
                                        if (!(var46_139 != null)) {
                                            var51_170 = false;
                                            var51_171 = var31_60 + " template '" + (String)var33_65 + "' has invalid section + ";
                                            throw new IllegalArgumentException(var51_171.toString());
                                        }
                                        var53_176 /* !! */  = var46_139.a(false);
                                        var51_169 = null;
                                        var54_177 = null;
                                        var55_178 = null;
                                        var56_179 = null;
                                        var57_182 = null;
                                        var58_183 /* !! */  = null;
                                        var58_183 /* !! */  = ll.e();
                                        var59_184 = null;
                                        var59_184 = ll.e();
                                        ew.a(var53_176 /* !! */ );
                                        var60_185 = var53_176 /* !! */ ;
                                        var61_187 = false;
                                        for (T var63_190 : var60_185) {
                                            block108: {
                                                block111: {
                                                    block109: {
                                                        block106: {
                                                            block107: {
                                                                block110: {
                                                                    var64_191 /* !! */  = (String)var63_190;
                                                                    var65_192 = false;
                                                                    var66_194 = var64_191 /* !! */ ;
                                                                    if (var66_194 == null) continue;
                                                                    switch (var66_194.hashCode()) {
                                                                        case -1992012396: {
                                                                            if (var66_194.equals("duration")) break;
                                                                            ** break;
                                                                        }
                                                                        case -1618876223: {
                                                                            if (!var66_194.equals("broadcast")) {
                                                                                ** break;
                                                                            }
                                                                            break block106;
                                                                        }
                                                                        case -934964668: {
                                                                            if (!var66_194.equals("reason")) {
                                                                                ** break;
                                                                            }
                                                                            break block107;
                                                                        }
                                                                        case 97513095: {
                                                                            if (!var66_194.equals("flags")) {
                                                                                ** break;
                                                                            }
                                                                            break block108;
                                                                        }
                                                                        case -517618225: {
                                                                            if (!var66_194.equals("permission")) {
                                                                                ** break;
                                                                            }
                                                                            break block109;
                                                                        }
                                                                        case 954925063: {
                                                                            if (!var66_194.equals("message")) {
                                                                                ** break;
                                                                            }
                                                                            break block110;
                                                                        }
                                                                        case -1161803523: {
                                                                            if (!var66_194.equals("actions")) {
                                                                                ** break;
                                                                            }
                                                                            break block111;
                                                                        }
                                                                    }
                                                                    var51_169 = (long)db_0.a(dk.d, var46_139.e(var64_191 /* !! */ ), 0.0, 2, null);
                                                                    ** break;
                                                                }
                                                                var54_177 = var46_139.e(var64_191 /* !! */ );
                                                                ** break;
                                                            }
                                                            var55_178 = var46_139.e(var64_191 /* !! */ );
                                                            ** break;
                                                        }
                                                        var56_179 = var46_139.e(var64_191 /* !! */ );
                                                        ** break;
                                                    }
                                                    var57_182 = var46_139.e(var64_191 /* !! */ );
                                                    ** break;
                                                }
                                                var58_183 /* !! */  = var49_158.a(var46_139, var64_191 /* !! */ );
                                                ** break;
                                            }
                                            var59_184 = var49_158.a(var46_139, var64_191 /* !! */ );
lbl259:
                                            // 15 sources

                                        }
                                        var47_144.add(jc.a[var31_60.ordinal()] == 1 ? new c5((String)var54_177, (String)var55_178, var56_179, (String)var57_182, (List)var58_183 /* !! */ , (List)var59_184) : (c5)new cW((Long)var51_169, (String)var54_177, (String)var55_178, var56_179, (String)var57_182, (List)var58_183 /* !! */ , (List)var59_184));
                                    }
                                    v3 = ll.c((Iterable)((List)var42_109));
                                }
                                var35_72 = v3;
                                var67_195 = (long)db_0.a(dk.d, var32_63.a("expire_ladder", "0"), 0.0, 2, null);
                                var38_91 = var32_63.a("ip_template", false);
                                var20_41.add(new c1(var30_53, (String)var33_65, (a_)var31_60, (c5)var52_175, var38_91, (List)var35_72, var67_195, null));
                            }
                            var18_36 = (List)var23_46;
                            ll.a((Collection)var17_35, (Iterable)var18_36);
                        }
                        var9_20.c().getLogger().info("Loaded " + var9_20.d().size() + " templates from templates.yml!");
                        var12_24 = var11_23.a("template-groups");
                        if (var12_24 == null) break block112;
                        var13_27 = var12_24.a(false);
                        v4 = var9_20.e();
                        ew.a(var13_27);
                        var14_28 = var13_27;
                        var69_196 = v4;
                        var20_41 = var9_20;
                        var15_31 = false;
                        var16_34 = var14_28;
                        var17_35 = new ArrayList<E>(ll.a(var14_28, 10));
                        var18_37 = false;
                        for (T var21_44 : var16_34) {
                            block114: {
                                block113: {
                                    block95: {
                                        var23_46 = (String)var21_44;
                                        var70_197 = var17_35;
                                        var24_47 = false;
                                        var25_48 = var9_20;
                                        var26_49 = var12_24.a((String)var23_46);
                                        ew.a(var23_46);
                                        var27_50 = var23_46;
                                        var28_51 = false;
                                        v5 = var26_49;
                                        var29_52 = v5 != null ? v5.a("weights") : null;
                                        if (!(var26_49 != null)) {
                                            var30_55 = false;
                                            var30_56 = "Empty template group: '" + (String)var27_50 + '\'';
                                            throw new IllegalArgumentException(var30_56.toString());
                                        }
                                        if (!(var29_52 != null)) {
                                            var30_57 = false;
                                            var30_58 = "No weights for template group '" + (String)var27_50 + "'!";
                                            throw new IllegalArgumentException(var30_58.toString());
                                        }
                                        var30_59 /* !! */  = a_.values();
                                        var31_61 = false;
                                        var33_66 = var30_59 /* !! */ .length;
                                        for (var32_64 = 0; var32_64 < var33_66; ++var32_64) {
                                            var35_72 = var34_69 = var30_59 /* !! */ [var32_64];
                                            var36_82 = false;
                                            if (!ew.a((Object)(var26_49.a("type", "") != null ? var37_90.toLowerCase(Locale.ROOT) : null), (Object)var35_72.toString())) continue;
                                            v6 = var34_69;
                                            break block95;
                                        }
                                        v6 = var38_93 = null;
                                    }
                                    if (!(var38_93 != null && var38_93 == var38_93.c())) {
                                        var31_61 = false;
                                        var31_62 = "Template group '" + (String)var27_50 + "' type is missing: " + var38_93;
                                        throw new IllegalArgumentException(var31_62.toString());
                                    }
                                    var31_60 = var25_48;
                                    var32_64 = 0;
                                    if (var26_49.a("ladder") != null) break block113;
                                    v7 = ll.e();
                                    break block114;
                                }
                                var34_69 = var33_67.a(false);
                                var35_77 = false;
                                var36_83 = var34_69;
                                var37_90 = new ArrayList<E>(ll.a((Iterable)var34_69, 10));
                                var39_95 = false;
                                var40_101 = var36_83.iterator();
                                while (var40_101.hasNext()) {
                                    var41_105 = var40_101.next();
                                    var42_111 = (String)var41_105;
                                    var43_119 = var37_90;
                                    var44_127 = false;
                                    var43_119.add(var33_67.a(var42_111));
                                }
                                var34_69 = (List)var37_90;
                                var35_77 = false;
                                var36_83 = var34_69;
                                var37_90 = new ArrayList<E>(ll.a((Iterable)var34_69, 10));
                                var39_95 = false;
                                var40_101 = var36_83.iterator();
                                while (var40_101.hasNext()) {
                                    var41_105 = var40_101.next();
                                    var42_112 = (kr_0)var41_105;
                                    var43_120 = var37_90;
                                    var44_128 = false;
                                    var45_133 = var31_60;
                                    var46_140 = false;
                                    if (!(var42_112 != null)) {
                                        var47_146 = false;
                                        var47_147 = var38_93 + " template '" + (String)var27_50 + "' has invalid section + ";
                                        throw new IllegalArgumentException(var47_147.toString());
                                    }
                                    var48_156 = var42_112.a(false);
                                    var47_148 = null;
                                    var49_160 = null;
                                    var50_166 = null;
                                    var51_173 = null;
                                    var52_175 = null;
                                    var53_176 /* !! */  = null;
                                    var53_176 /* !! */  = ll.e();
                                    var54_177 = null;
                                    var54_177 = ll.e();
                                    ew.a(var48_156);
                                    var55_178 = var48_156;
                                    var56_181 = false;
                                    var57_182 = var55_178.iterator();
                                    while (var57_182.hasNext()) {
                                        block117: {
                                            block120: {
                                                block118: {
                                                    block115: {
                                                        block116: {
                                                            block119: {
                                                                var58_183 /* !! */  = var57_182.next();
                                                                var59_184 = (String)var58_183 /* !! */ ;
                                                                var60_186 = false;
                                                                var61_188 = var59_184;
                                                                if (var61_188 == null) continue;
                                                                switch (var61_188.hashCode()) {
                                                                    case -1992012396: {
                                                                        if (var61_188.equals("duration")) break;
                                                                        ** break;
                                                                    }
                                                                    case -1618876223: {
                                                                        if (!var61_188.equals("broadcast")) {
                                                                            ** break;
                                                                        }
                                                                        break block115;
                                                                    }
                                                                    case -934964668: {
                                                                        if (!var61_188.equals("reason")) {
                                                                            ** break;
                                                                        }
                                                                        break block116;
                                                                    }
                                                                    case 97513095: {
                                                                        if (!var61_188.equals("flags")) {
                                                                            ** break;
                                                                        }
                                                                        break block117;
                                                                    }
                                                                    case -517618225: {
                                                                        if (!var61_188.equals("permission")) {
                                                                            ** break;
                                                                        }
                                                                        break block118;
                                                                    }
                                                                    case 954925063: {
                                                                        if (!var61_188.equals("message")) {
                                                                            ** break;
                                                                        }
                                                                        break block119;
                                                                    }
                                                                    case -1161803523: {
                                                                        if (!var61_188.equals("actions")) {
                                                                            ** break;
                                                                        }
                                                                        break block120;
                                                                    }
                                                                }
                                                                var47_148 = (long)db_0.a(dk.d, var42_112.e((String)var59_184), 0.0, 2, null);
                                                                ** break;
                                                            }
                                                            var49_160 = var42_112.e((String)var59_184);
                                                            ** break;
                                                        }
                                                        var50_166 = var42_112.e((String)var59_184);
                                                        ** break;
                                                    }
                                                    var51_173 = var42_112.e((String)var59_184);
                                                    ** break;
                                                }
                                                var52_175 = var42_112.e((String)var59_184);
                                                ** break;
                                            }
                                            var53_176 /* !! */  = var45_133.a(var42_112, (String)var59_184);
                                            ** break;
                                        }
                                        var54_177 = var45_133.a(var42_112, (String)var59_184);
lbl430:
                                        // 15 sources

                                    }
                                    var43_120.add(jc.a[var38_93.ordinal()] == 1 ? new c5(var49_160, var50_166, var51_173, (String)var52_175, var53_176 /* !! */ , (List)var54_177) : (c5)new cW(var47_148, var49_160, var50_166, var51_173, (String)var52_175, var53_176 /* !! */ , (List)var54_177));
                                }
                                v7 = ll.c((Iterable)((List)var37_90));
                            }
                            var30_59 /* !! */  = v7;
                            var71_198 = (long)db_0.a(dk.d, var26_49.a("expire_ladder", "0"), 0.0, 2, null);
                            if (!(((Collection)var30_59 /* !! */ ).isEmpty() == false)) {
                                var34_70 = false;
                                var34_71 = "No ladder for template group '" + (String)var27_50 + "'!";
                                throw new IllegalArgumentException(var34_71.toString());
                            }
                            var34_69 = var29_52.a(false);
                            var35_78 = false;
                            var36_84 = new LinkedHashMap<K, V>(as_0.c(jm_0.a(ll.a((Iterable)var34_69, 10)), 16));
                            var37_90 = var34_69;
                            var39_97 = false;
                            var40_102 = var37_90.iterator();
                            while (var40_102.hasNext()) {
                                var41_105 = var40_102.next();
                                var42_113 /* !! */  = var41_105;
                                var64_191 /* !! */  = var41_105;
                                var65_193 = (Map)var36_84;
                                var43_121 = false;
                                var66_194 = Float.valueOf((float)var29_52.d(var42_113 /* !! */ ));
                                var65_193.put(var64_191 /* !! */ , var66_194);
                            }
                            var34_69 = (Map)var36_84;
                            var35_78 = false;
                            var36_84 = var34_69;
                            var37_90 = new LinkedHashMap<K, V>(jm_0.a(var34_69.size()));
                            var39_97 = false;
                            var40_102 = var36_84.entrySet();
                            var41_106 = false;
                            var42_114 = var40_102.iterator();
                            while (var42_114.hasNext()) {
                                var43_122 = var42_114.next();
                                var44_129 = (Map.Entry)var43_122;
                                var65_193 = var37_90;
                                var45_134 = false;
                                var46_141 = var25_48.a(var38_93, (String)var44_129.getKey());
                                if (!(var46_141 != null)) {
                                    var47_149 = false;
                                    var47_150 = "Template group '" + (String)var27_50 + "' refers to non-existing " + var38_93 + " template: '" + (String)var44_129.getKey() + '\'';
                                    throw new IllegalArgumentException(var47_150.toString());
                                }
                                if (((Collection)var46_141.b()).isEmpty() == false) {
                                    var25_48.c().getLogger().warning("Template '" + (String)var44_129.getKey() + "' belongs to template group '" + (String)var27_50 + "', its ladder will be ignored. Remove the ladder from '" + (String)var44_129.getKey() + "' to silence this warning + ");
                                }
                                var48_157 = (Map.Entry)var43_122;
                                var49_161 = var46_141;
                                var50_167 = var65_193;
                                var51_174 = false;
                                var52_175 = var48_157.getValue();
                                var50_167.put(var49_161, var52_175);
                            }
                            var33_65 = var37_90;
                            if (!(var33_65.isEmpty() == false)) {
                                var35_78 = false;
                                var35_79 = "No weights for template group '" + (String)var27_50 + "'!";
                                throw new IllegalArgumentException(var35_79.toString());
                            }
                            var34_69 = var33_65.values();
                            var35_78 = false;
                            var36_84 = var34_69;
                            var37_90 = new ArrayList<E>();
                            var39_97 = false;
                            var40_102 = var36_84.iterator();
                            while (var40_102.hasNext()) {
                                var41_108 = var40_102.next();
                                var42_115 = ((Number)var41_108).floatValue();
                                var43_123 = false;
                                if (!((double)var42_115 <= 0.0)) continue;
                                var37_90.add(var41_108);
                            }
                            var34_69 = (List)var37_90;
                            var35_78 = false;
                            var36_84 = var34_69.iterator();
                            while (var36_84.hasNext()) {
                                var37_90 = var36_84.next();
                                var39_98 = ((Number)var37_90).floatValue();
                                var40_103 = false;
                                var25_48.c().getLogger().warning("Template group '" + (String)var27_50 + "' includes a bad weight: " + var39_98);
                            }
                            var35_72 = var33_65;
                            var36_85 = false;
                            var37_90 = var35_72;
                            var39_94 = new LinkedHashMap<K, V>(jm_0.a(var35_72.size()));
                            var40_104 = false;
                            var41_105 = var37_90.entrySet();
                            var42_116 = false;
                            var43_124 = var41_105.iterator();
                            while (var43_124.hasNext()) {
                                var44_130 = var43_124.next();
                                var45_135 = (Map.Entry)var44_130;
                                var46_142 = var39_94;
                                var47_151 = false;
                                var48_157 = (Map.Entry)var44_130;
                                var64_191 /* !! */  = var45_135.getKey();
                                var65_193 = var46_142;
                                var49_162 = false;
                                var66_194 = (c1)var48_157.getKey();
                                var65_193.put(var64_191 /* !! */ , var66_194);
                            }
                            var35_72 = var39_94;
                            var36_85 = false;
                            var37_90 = var35_72;
                            var39_94 = new LinkedHashMap<K, V>(jm_0.a(var35_72.size()));
                            var40_104 = false;
                            var41_105 = var37_90.entrySet();
                            var42_116 = false;
                            var43_124 = var41_105.iterator();
                            while (var43_124.hasNext()) {
                                var44_131 = var43_124.next();
                                var45_136 /* !! */  = (Map.Entry)var44_131;
                                var65_193 = var39_94;
                                var46_143 = false;
                                var47_152 = (Map.Entry)var44_131;
                                var48_157 = hy_0.d(((c1)var45_136 /* !! */ .getKey()).f());
                                var49_163 = var65_193;
                                var50_168 = false;
                                var45_136 /* !! */  = var47_152.getValue();
                                var49_163.put(var48_157, var45_136 /* !! */ );
                            }
                            var34_69 = var39_94;
                            var70_197.add(new eM((String)var27_50, var38_93, (Map)var33_65, (Map)var34_69, (List)var30_59 /* !! */ , var71_198));
                        }
                        var70_197 = (List)var17_35;
                        var20_41.a(ll.a(var69_196, (Iterable)var70_197));
                    }
                    if (((Collection)var9_20.e()).isEmpty() == false) {
                        var9_20.c().getLogger().info("Loaded " + var9_20.e().size() + " template groups from templates.yml!");
                    } else {
                        var9_20.a(ll.e());
                    }
                }
                catch (Exception var9_21) {
                    var3_3.a(var9_21);
                    v8 = var3_3;
                    break block96;
                }
                v8 = var5_7;
            }
            var74_199 = v8;
            var73_5.a(var74_199);
            this.a(new h7(var1_1, null, 2, null).a());
            if (var1_1.l()) {
                var3_3 = this;
                var4_6 = false;
                try {
                    var5_7 = var3_3.t();
                    if (var5_7 == null) break block97;
                    var3_3.v = var6_9 = new Z(var3_3.a);
                    if (!es_0.c()) {
                        var6_9.a(var5_7);
                    }
                    break block97;
                }
                catch (Throwable var5_8) {
                    var6_9 = (n_0)var3_3;
                    var7_11 = h1.a((CharSequence)"Failed to hook into ServerListPlus + ", (CharSequence)"Try using the latest ServerListPlus development build + ");
                    var8_15 = false;
                    var9_20 = var6_9.a.getLogger();
                    var10_22 = false;
                    var9_20.warning(var7_11.toString());
                    if (var3_3.a(1)) {
                        var5_8.printStackTrace();
                    }
                    break block97;
                }
            }
            var1_1.c((Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, b(litebans.q_0 ), ()V)((q_0)this));
        }
        var3_3 = this;
        var4_6 = false;
        var5_7 = var3_3.f();
        if (var5_7.W()) {
            var6_9 = var3_3.a.getDataFolder();
            var7_12 = "geoip";
            var8_16 = false;
            var9_20 = d6.c(new File((File)var6_9, var7_12));
            var3_3.a.b(new cz_0((q_0)var3_3, (File)var9_20, (eG)var5_7));
        }
        try {
            this.q = true;
            var3_3 = this;
            var4_6 = false;
            var5_7 = (o)var3_3.a.a(o.class);
            var6_9 = var3_3.a.getDataFolder();
            var7_13 = "lockdown.yml";
            var8_17 = false;
            var9_20 = new File((File)var6_9, var7_13);
            if (!var9_20.exists() || gg_0.d() == null) {
                var6_9 = var3_3.a.getDataFolder();
                var7_13 = "lockdown.json";
                var8_17 = false;
                var9_20 = new File((File)var6_9, var7_13);
            }
            if (var9_20.exists()) {
                var6_9 = var3_3.a.a((File)var9_20).g();
                var7_13 = var6_9.a("scope", "*");
                var8_18 = var6_9.a("reason", "");
                if (var3_3.f().D()) {
                    ew.a((Object)var8_18);
                    if (((CharSequence)var8_18).length() > 0) {
                        var3_3.a.getLogger().info("Applying saved lockdown, reason: \"" + var8_18 + '\"');
                        ew.a((Object)var7_13);
                        var5_7.a(var7_13, (CharSequence)var8_18, true);
                    }
                }
            }
            this.d();
            var3_3 = this;
            var4_6 = false;
            var5_7 = jb_0.c();
            var6_9 = var3_3.a.e();
            if (!ew.a(var5_7, var6_9)) {
                var7_13 = "This is LiteBans version " + (String)var5_7 + ", NOT version " + (String)var6_9 + '!';
                var8_19 = new hS((q_0)var3_3, var7_13);
                var8_19.run();
                var3_3.a.a(var8_19, 20L);
            }
            if (this.g()) {
                var1_1.a((Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, a(litebans.di_0 litebans.q_0 ), ()V)((di_0)var1_1, (q_0)this), 140L);
            }
            if (var1_1.t() == 0) {
                var1_1.a((Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, b(litebans.di_0 litebans.q_0 ), ()V)((di_0)var1_1, (q_0)this), 300L);
            }
        }
        catch (Throwable var3_4) {
            this.a(var3_4);
        }
    }

    private final void d() {
        Database database = null;
        Events events = null;
        PlayerProvider playerProvider = null;
        RandomID randomID = null;
        try {
            Database database2 = Database.get();
            ew.b(database2, "");
            database = (k4)database2;
            Events events2 = Events.get();
            ew.b(events2, "");
            events = (cb)events2;
            playerProvider = PlayerProvider.get();
            randomID = RandomID.get();
        }
        catch (MissingImplementationException missingImplementationException) {
            database = new k4(this.a);
            events = new cb();
            playerProvider = new a2(this.a);
            randomID = new lP(this.a);
        }
        Database.setInstance(database);
        Events.setInstance(events);
        PlayerProvider.setInstance(playerProvider);
        RandomID.setInstance(randomID);
    }

    @Override
    public void b() {
        this.a.a("config.yml");
        this.a.h().f();
        this.c = 0;
        this.e();
    }

    public final void a(@NotNull Throwable throwable) {
        if (throwable instanceof iv) {
            n_0 n_02 = this;
            String string = throwable.getMessage();
            ew.a((Object)string);
            String string2 = string;
            boolean bl = false;
            n_02.a.getLogger().severe(string2);
            return;
        }
        StringWriter stringWriter = new StringWriter();
        throwable.printStackTrace(new PrintWriter(stringWriter));
        this.a(stringWriter.toString());
    }

    public final void a(@NotNull String string) {
        boolean bl;
        String string2;
        Object object;
        Iterator iterator;
        boolean bl2;
        Collection collection3;
        Object object2;
        boolean bl3;
        Iterable iterable;
        Object object3 = new String[]{System.lineSeparator()};
        List list = bz.a((CharSequence)string, (String[])object3, false, 0, 6, null);
        object3 = (q_0)this.a.a(q_0.class);
        if (!(list.size() <= 2 || object3 != null && ((q_0)object3).g())) {
            iterable = list;
            bl3 = false;
            object2 = iterable;
            collection3 = new ArrayList(ll.a(iterable, 10));
            bl2 = false;
            iterator = object2.iterator();
            while (iterator.hasNext()) {
                object = iterator.next();
                string2 = (String)object;
                Collection collection2 = collection3;
                bl = false;
                collection2.add(this.d(string2));
            }
            list = (List)collection3;
        }
        iterable = list;
        bl3 = false;
        object2 = iterable;
        collection3 = new ArrayList();
        bl2 = false;
        iterator = object2.iterator();
        while (iterator.hasNext()) {
            object = iterator.next();
            string2 = (String)object;
            bl = false;
            boolean bl4 = ((CharSequence)string2).length() > 0;
            if (!bl4) continue;
            collection3.add(object);
        }
        iterable = (List)collection3;
        bl3 = false;
        for (Collection collection3 : iterable) {
            String string3 = (String)((Object)collection3);
            boolean bl5 = false;
            object = this;
            boolean bl6 = false;
            ((n_0)object).a.getLogger().warning(string3);
        }
    }

    public final String d(@NotNull String string) {
        String string2;
        String string3 = string;
        boolean bl = false;
        CharSequence charSequence = string3;
        boolean bl2 = false;
        int n = 0;
        int n2 = charSequence.length() - 1;
        boolean bl3 = false;
        while (n <= n2) {
            int n3 = !bl3 ? n : n2;
            char c = charSequence.charAt(n3);
            boolean bl4 = false;
            char c10 = c = ew.a(c, 32) <= 0 ? (char)'\u0001' : '\u0000';
            if (!bl3) {
                if (c == '\u0000') {
                    bl3 = true;
                    continue;
                }
                ++n;
                continue;
            }
            if (c == '\u0000') break;
            --n2;
        }
        return bz.b(string2 = ((Object)charSequence.subSequence(n, n2 + 1)).toString(), "at java.lang.Thread.run(", false, 2, null) || bz.b(string2, "at java.util.concurrent.ThreadPoolExecutor$Worker.run(", false, 2, null) || bz.b(string2, "at java.util.concurrent.ThreadPoolExecutor.runWorker(", false, 2, null) || bz.b(string2, litebans.w.v.b(), false, 2, null) || bz.b(string2, litebans.w.v.d(), false, 2, null) || bz.b(string2, litebans.w.v.c(), false, 2, null) || bz.b(string2, "at sun.reflect.NativeConstructorAccessorImpl.newInstance", false, 2, null) || bz.b(string2, "at sun.reflect.DelegatingConstructorAccessorImpl.newInstance(", false, 2, null) || bz.b(string2, "at java.lang.reflect.Constructor.newInstance(", false, 2, null) ? "" : string;
    }

    public final void a(@NotNull String string, @NotNull Throwable throwable) {
        int n;
        Object object = this;
        String[] stringArray = "[!!] Could not load " + string + " + ";
        boolean bl = false;
        ((n_0)object).a.getLogger().severe((String)stringArray);
        object = "org.bukkit.configuration.InvalidConfigurationException: ";
        Object object2 = new String[]{(String)object + "while scanning an anchor", (String)object + "while scanning a simple key", (String)object + "while scanning for the next token", (String)object + "while parsing a block mapping", (String)object + "while parsing a block collection", object};
        stringArray = object2;
        object2 = null;
        String string2 = throwable.getMessage();
        if (string2 == null) {
            string2 = "";
        }
        object2 = string2;
        Object object3 = stringArray;
        boolean bl2 = false;
        int n2 = ((String[])object3).length;
        for (n = 0; n < n2; ++n) {
            String string3;
            String string4 = string3 = object3[n];
            boolean bl3 = false;
            object2 = bz.a((String)object2, string4, "", false, 4, null);
        }
        object2 = bz.a((String)object2, "\\t(TAB)", "TAB", false, 4, null);
        object3 = this;
        String string5 = "[!!] Configuration error found: " + (String)object2;
        n = 0;
        object3.a.getLogger().severe(string5);
        object3 = this;
        string5 = "[!!] LiteBans will use the default " + string + " until errors have been ";
        n = 0;
        object3.a.getLogger().severe(string5);
    }

    public final Object t() {
        return this.a.i().c("ServerListPlus");
    }

    public final q_0 o() {
        if (!this.q) {
            n_0 n_02 = this;
            String string = this.a.getName() + " is not enabled yet!";
            boolean bl = false;
            n_02.a.getLogger().severe(string);
            throw new cP();
        }
        return this;
    }

    public final CharSequence b(@Nullable Object object) {
        if (object == null) {
            return am.ay;
        }
        String string = object.toString();
        if (ew.a((Object)string, (Object)"true")) {
            return am.ap;
        }
        if (ew.a((Object)string, (Object)"false")) {
            return am.bW;
        }
        if (eq_0.f.b(string)) {
            return am.aA;
        }
        return string;
    }

    public final String a(@NotNull jv_0 jv_02, @NotNull Object object) {
        String string;
        String string2 = string = jv_02.b();
        boolean bl = false;
        if (string2 == null && !this.f().h()) {
            this.a.getLogger().warning("Player[name=" + jv_02.i() + "].getAddress() returned null on " + object.getClass().getSimpleName());
        }
        return string;
    }

    public final boolean e(@NotNull String string) {
        if (!this.f().p() && (bz.a(string, "mute", false, 2, null) || bz.a(string, "muteip", false, 2, null))) {
            return false;
        }
        if (!this.f().C() && bz.a(string, "warn", false, 2, null)) {
            return false;
        }
        return this.f().ab() || !ew.a((Object)string, (Object)"lockdown");
    }

    public final boolean p() {
        return this.a.t() == 0 && this.y() && !this.C.a() && this.f().ay();
    }

    public final SimpleDateFormat a(@NotNull CharSequence charSequence, @NotNull CharSequence charSequence2) {
        SimpleDateFormat simpleDateFormat;
        try {
            simpleDateFormat = new SimpleDateFormat(bz.a(((Object)charSequence).toString(), "YYYY", "yyyy", false, 4, null), this.z().d());
        }
        catch (Exception exception) {
            if (!(exception instanceof dr_0)) {
                n_0 n_02 = this;
                CharSequence charSequence3 = h1.a((CharSequence)("Invalid date format: \"" + charSequence + "\". Using default date format \"" + charSequence2 + "\" + "), (CharSequence)"Date format documentation: https://docs.oracle.com/javase/tutorial/i18n/format/simpleDateFormat.html");
                boolean bl = false;
                Logger logger = n_02.a.getLogger();
                boolean bl2 = false;
                logger.warning(((Object)charSequence3).toString());
            }
            simpleDateFormat = new SimpleDateFormat(((Object)charSequence2).toString());
        }
        SimpleDateFormat simpleDateFormat2 = simpleDateFormat;
        boolean bl = false;
        simpleDateFormat2.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpleDateFormat;
    }

    public static /* synthetic */ SimpleDateFormat a(q_0 q_02, CharSequence charSequence, CharSequence charSequence2, int n, Object object) {
        if ((n & 2) != 0) {
            charSequence2 = "yyyy-MM-dd";
        }
        return q_02.a(charSequence, charSequence2);
    }

    private static final lE a(q_0 q_02) {
        return new lE(q_02.f().aD());
    }

    private static final boolean c(q_0 q_02) {
        return q_02.a.i().a("AuthMe");
    }

    private static final void a(q_0 q_02, di_0 di_02) {
        k2 k22;
        q_0 q_03;
        block14: {
            Object object;
            Object object2;
            Object object3;
            k2 k23;
            ew.a(di_02);
            k2 k24 = new k2(di_02, null, 2, null);
            q_03 = q_02;
            boolean bl = false;
            k2 k25 = k23 = k24;
            boolean bl2 = false;
            gn_0 gn_02 = null;
            try {
                k24.a().a("messages.yml");
                gn_02 = k24.a().a(k24.g()).g();
                gn_02.a(gn_0.b("messages.yml", null));
                k24.a(gn_02);
                object3 = k24;
                boolean bl3 = false;
                gn_0 gn_03 = ((k2)object3).c();
                ew.a(gn_03);
                object2 = gn_03;
                object = am.values();
                boolean bl4 = false;
                for (CharSequence charSequence : object) {
                    am am2 = charSequence;
                    boolean bl5 = false;
                    String string = am2.Q;
                    CharSequence charSequence2 = am2.c3;
                    if (charSequence2 == null) continue;
                    String string2 = object2.a(string, null);
                    if (string2 != null) {
                        am2.a(object2.a(string, ((Object)charSequence2).toString()));
                        if (!(((CharSequence)string2).length() > 0)) continue;
                        object2.b(string, am.a(am2, string2));
                        continue;
                    }
                    object2.b(string, bz.a(((Object)charSequence2).toString(), '\u00a7', '&', false, 4, null));
                }
                object3 = gn_02.a("locale", "system");
                if (!ew.a(object3, (Object)"system")) {
                    Locale locale = k24.b();
                    k24.a(new Locale((String)object3));
                    k24.a().getLogger().info("Using configured locale (" + k24.d().getLanguage() + ')');
                    if (ew.a((Object)k24.d(), locale)) {
                        object2 = "Supported locales: " + lo_0.a(Locale.getAvailableLocales(), null, null, null, 0, null, (eo_0)el.a, 31, null);
                        object = k24.a().getLogger();
                        CharSequence charSequence = h1.a((CharSequence)"Note: If the configured locale is unrecognized, the system default locale is ", (CharSequence)object2);
                        int n = 0;
                        ((Logger)object).info(((Object)charSequence).toString());
                    }
                } else {
                    k24.a().getLogger().info("Using system locale (" + k24.d().getLanguage() + ')');
                }
                k24.a((gn_0)null);
            }
            catch (Exception exception) {
                k24.a(exception);
                k22 = k24;
                break block14;
            }
            if (gg_0.d() != null) {
                try {
                    gn_02.h();
                }
                catch (Exception exception) {
                    k24.a().getLogger().severe("[!!] Could not save messages + ");
                    k24.e().a(exception);
                }
            }
            object3 = k24;
            boolean bl6 = false;
            object2 = am.a2;
            object = am.ad;
            if (bz.a((CharSequence)object2, (CharSequence)"$bannedPlayer", false, 2, null) || bz.a((CharSequence)object, (CharSequence)"$bannedPlayer", false, 2, null)) {
                ((am)object2).c3 = ((am)object2).a((CharSequence)"$bannedPlayer", (Object)"$mutedPlayer");
                ((am)object).c3 = ((am)object).a((CharSequence)"$bannedPlayer", (Object)"$warnedPlayer");
            }
            try {
                db_0.a(dk.d, 0L, false, 2, null);
            }
            catch (Exception exception) {
                if (exception instanceof IllegalFormatException) {
                    CharSequence charSequence;
                    String string = "%d %s";
                    Logger logger = ((k2)object3).a().getLogger();
                    charSequence = h1.a((CharSequence)("Duration format (\"" + am.b_ + "\") is invalid! (" + exception.getClass().getSimpleName() + ')'), (CharSequence)("Using default format instead (\"" + string + "\") + "));
                    boolean bl7 = false;
                    logger.warning(((Object)charSequence).toString());
                    am.b_.a(string);
                }
                throw exception;
            }
            k22 = k23;
        }
        q_03.a(k22);
    }

    private static final void b(q_0 q_02) {
        block4: {
            q_0 q_03 = q_02;
            boolean bl = false;
            try {
                Object object = q_03.t();
                if (object != null) {
                    Z z = new Z(q_03.a);
                    q_03.v = z;
                    if (!es_0.c()) {
                        z.a(object);
                    }
                }
            }
            catch (Throwable throwable) {
                n_0 n_02 = q_03;
                CharSequence charSequence = h1.a((CharSequence)"Failed to hook into ", (CharSequence)"Try using the latest ServerListPlus development ");
                boolean bl2 = false;
                Logger logger = n_02.a.getLogger();
                boolean bl3 = false;
                logger.warning(((Object)charSequence).toString());
                if (!q_03.a(1)) break block4;
                throwable.printStackTrace();
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static final void a(di_0 di_02, q_0 q_02) {
        block18: {
            o o2 = (o)di_02.a(o.class);
            int n = di_02.z().e().size();
            if (!(n > 8)) {
                boolean bl = false;
                Integer n2 = n;
                throw new IllegalArgumentException(((Object)n2).toString());
            }
            Object object = new Class[]{di_0.class};
            Class[] classArray = object;
            object = new Object[]{di_02};
            List list = di_02.f().a(fS.class, classArray, (Object[])object);
            if (!(list.size() > 1)) {
                boolean bl = false;
                ew.a(list);
                List list2 = list;
                throw new IllegalArgumentException(list2.toString());
            }
            Object object2 = object = (w)di_02.a(w.class);
            boolean bl = false;
            try {
                ch ch2 = ((w)object2).f();
                Closeable closeable = ch2;
                Throwable throwable = null;
                try {
                    boolean bl2;
                    Object object3 = (ch)closeable;
                    boolean bl3 = false;
                    ch ch3 = ch2;
                    boolean bl4 = false;
                    ResultSet resultSet = eS.d(ch3.c((CharSequence)"SELECT NOW() as now"));
                    resultSet.next();
                    Timestamp timestamp = resultSet.getTimestamp("now");
                    Object object4 = q_02;
                    Object object5 = "t: " + timestamp.getTime();
                    boolean bl5 = false;
                    ((n_0)object4).a.getLogger().info((String)object5);
                    object4 = q_02;
                    object5 = "f: " + o2.a(timestamp.getTime(), true) + " +" + o2.a(true);
                    bl5 = false;
                    ((n_0)object4).a.getLogger().info((String)object5);
                    ew.a(di_02);
                    object5 = object4 = new gz_0(di_02, "", "", "");
                    bl5 = false;
                    iA iA2 = ch3.c("[CONSOLE]");
                    ew.a(iA2);
                    Object object6 = iA2;
                    String string = ((iA)object6).b();
                    ew.a((Object)string);
                    Object object7 = ((gz_0)object5).a(ch3, (iA)object6, new fW(string, ch3, null, false, 0, 28, null).i());
                    if (!(!bz.a((CharSequence)object7, (CharSequence)"))", false, 2, null))) {
                        boolean bl6 = false;
                        CharSequence charSequence = object7;
                        throw new IllegalArgumentException(((Object)charSequence).toString());
                    }
                    ch3.a(((iA)object6).b(), ((gz_0)object4).c(), a_.h, eq_0.f.b(), false, 1);
                    ch3.a(((iA)object6).b(), ((gz_0)object4).c(), a_.h, eq_0.f.b(), true, 1);
                    object5 = "*";
                    String string2 = eq_0.f.c("global");
                    if (!eq_0.f.b(string2)) {
                        boolean bl7 = false;
                        String string3 = string2 + ' ' + eq_0.f.b();
                        throw new IllegalArgumentException(string3.toString());
                    }
                    if (!(ew.a((Object)string2, object5) && string2.charAt(0) == ((String)object5).charAt(0))) {
                        boolean bl8 = false;
                        String string4 = string2 + ' ' + (String)object5;
                        throw new IllegalArgumentException(string4.toString());
                    }
                    d8 d82 = di_02.z().a("ban");
                    ew.a(d82);
                    object6 = d82;
                    object7 = fg_0.a;
                    Object object8 = di_02.y();
                    boolean bl9 = false;
                    try {
                        ((fo_0)object7).b().set(object8);
                        bl2 = false;
                        String[] stringArray = new String[]{"test", "server:*"};
                        object6.a(di_02.y(), stringArray);
                    }
                    finally {
                        ((fo_0)object7).b().remove();
                    }
                    iA iA3 = ch3.c("test");
                    ew.a(iA3);
                    object7 = iA3.b();
                    object8 = kR.a(ch3, (String)object7, null, a_.h, (String)object5, false, false, 48, null);
                    if (!(object8 != null && ew.a((Object)((dZ)object8).m(), object5))) {
                        bl2 = false;
                        String string5 = String.valueOf(object8);
                        throw new IllegalArgumentException(string5.toString());
                    }
                    if (di_02.t() == 0 && !(!ew.a(di_02.b().getClass(), k_0.class))) {
                        String string6 = "Failed ";
                        throw new IllegalArgumentException(string6.toString());
                    }
                    n_0 n_02 = q_02;
                    String string7 = "" + di_02.y().c();
                    boolean bl10 = false;
                    n_02.a.getLogger().info(string7);
                    object3 = iv_0.a;
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
                if (((w)object2).b(sQLException)) break block18;
                throw sQLException;
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static final void b(di_0 di_02, q_0 q_02) {
        try {
            boolean bl;
            n_0 n_02;
            Object object;
            Object object2;
            block16: {
                ec_0 ec_02 = di_02.i();
                ew.b(ec_02, "");
                e1 e12 = ((ao_0)ec_02).b();
                object2 = e12.c();
                object = e12.b();
                w w2 = (w)di_02.a(w.class);
                n_02 = w2;
                bl = false;
                try {
                    ch ch2 = ((w)n_02).f();
                    Closeable closeable = ch2;
                    Throwable throwable = null;
                    try {
                        Object object3 = (ch)closeable;
                        boolean bl2 = false;
                        ch ch3 = ch2;
                        boolean bl3 = false;
                        if (ch3.a()) {
                            CharSequence charSequence;
                            kL kL2 = kL.g;
                            Object object4 = "uuid";
                            int n = 0;
                            ResultSet resultSet = eS.d(ch3.c(aR.d(aR.a(aR.a(aR.e("SELECT " + object4 + " FROM " + kL2), "id"), (Number)1))));
                            object4 = resultSet;
                            n = 1;
                            boolean bl4 = false;
                            if (object4.next()) {
                                String string;
                                Object object5 = object4;
                                boolean bl5 = false;
                                try {
                                    string = object5.getString(n);
                                }
                                catch (SQLException sQLException) {
                                    string = null;
                                }
                                charSequence = string;
                            } else {
                                charSequence = kL2 = null;
                            }
                            if (jj_0.a((String)((Object)kL2))) {
                                object4 = UUID.fromString(jj_0.a.g((String)((Object)kL2)));
                                ec_0 ec_03 = di_02.i();
                                ew.b(ec_03, "");
                                ao_0 ao_02 = (ao_0)ec_03;
                                ew.a(object4);
                                e1.a(e12, ao_02.a((UUID)object4), "test", null, 4, null);
                                e12.a(object4);
                            }
                        }
                        object3 = iv_0.a;
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
                    if (((w)n_02).b(sQLException)) break block16;
                    throw sQLException;
                }
            }
            n_02 = q_02;
            bl = false;
            if (((q_0)n_02).g()) {
                n_0 n_03 = n_02;
                boolean bl6 = false;
                ((q_0)n_03).a((Object)("" + object2 + object + '\n'));
            }
        }
        catch (LinkageError linkageError) {
            q_0.a(q_02, linkageError, 0, 2, null);
        }
    }

    public static final /* synthetic */ int n() {
        return t;
    }

    public static final /* synthetic */ void c(int n) {
        t = n;
    }

    public static final /* synthetic */ AtomicBoolean e() {
        return z;
    }

    public static final /* synthetic */ AtomicBoolean A() {
        return g;
    }

    static {
        r = 40000;
        o = "geoip";
        i = 8;
        q_0.v();
        j = new ig_0(null);
        z = new AtomicBoolean();
        g = new AtomicBoolean();
    }

    private static final void v() {
        w = new String[]{"", "", "", "", "0xAAA", "0xAAA ", "geoip.unavailable", "lockdown.yml", "lockdown.json", "reason", "scope", "lockdown.yml", "lockdown.json", "scope", "*", "reason", "", "Applying saved lockdown, reason: \"", "lockdown.yml", "lockdown.json", "reason", "scope", ".. + ", "Error 0x", "config.yml", "config", "[!!] Your configuration might be invalid. It can be verified with https://yaml-online-parser.appspot.com/", "[!!] Configuration does not exist! Ensure that read/write permissions are correct. (\"", "\")", "SnakeYAML", "https://repo1.maven.org/maven2/org/yaml/snakeyaml/2.4/snakeyaml-2.4.jar", "2.4", "ef779af5d29a9dde8cc70ce0341f5c6f7735e23edff9685ceaa9d35359b7bb7f", "", "templates.yml", "templates.yml", "-templates", "Empty template: '", "Template name '", "' cannot include dots or spaces! Use dashes or underscores ", "", " template '", "' has invalid ", "duration", "broadcast", "reason", "flags", "permission", "message", "actions", "ladder", " template '", "' has invalid ", "duration", "broadcast", "reason", "flags", "permission", "message", "actions", "expire_ladder", "0", "ip_template", "Loaded ", " templates from templates.yml!", "template-groups", "weights", "Empty template group: '", "No weights for template group '", "'!", "type", "", "Template group '", "' type is missing: ", "ladder", " template '", "' has invalid ", "duration", "broadcast", "reason", "flags", "permission", "message", "actions", "expire_ladder", "0", "No ladder for template group '", "'!", "Template group '", "' refers to non-existing ", " template: '", "Template '", "' belongs to template group '", "', its ladder will be ignored. Remove the ladder from '", "' to silence this ", "No weights for template group '", "'!", "Template group '", "' includes a bad weight: ", "Loaded ", " template groups from templates.yml!", "Failed to hook into ", "Try using the latest ServerListPlus development ", "geoip", "lockdown.yml", "lockdown.json", "scope", "*", "reason", "", "Applying saved lockdown, reason: \"", "This is LiteBans version ", ", NOT version ", "", "", "This is LiteBans version ", ", NOT version ", "config.yml", "geoip", "config", "[!!] Your configuration might be invalid. It can be verified with https://yaml-online-parser.appspot.com/", "[!!] Configuration does not exist! Ensure that read/write permissions are correct. (\"", "\")", "at java.lang.Thread.run(", "at java.util.concurrent.ThreadPoolExecutor$Worker.run(", "at java.util.concurrent.ThreadPoolExecutor.runWorker(", "at sun.reflect.NativeConstructorAccessorImpl.newInstance", "at sun.reflect.DelegatingConstructorAccessorImpl.newInstance(", "at java.lang.reflect.Constructor.newInstance(", "", "[!!] Could not load ", " + ", "org.bukkit.configuration.InvalidConfigurationException: ", "while scanning an anchor", "while scanning a simple key", "while scanning for the next token", "while parsing a block mapping", "while parsing a block collection", "", "", "\\t(TAB)", "TAB", "[!!] Configuration error found: ", "[!!] LiteBans will use the default ", " until errors have been ", "Failed to hook into ", "Try using the latest ServerListPlus development ", "ServerListPlus", " is not enabled yet!", "true", "false", "Player[name=", "].getAddress() returned null on ", "mute", "muteip", "warn", "lockdown", "YYYY", "yyyy", "Invalid date format: \"", "\". Using default date format \"", "\" + ", "Date format documentation: https://docs.oracle.com/javase/tutorial/i18n/format/simpleDateFormat.html", "UTC", "yyyy-MM-dd", "AuthMe", "messages.yml", "messages.yml", "locale", "system", "system", "Using configured locale (", "Supported locales: ", "Note: If the configured locale is unrecognized, the system default locale is ", "Using system locale (", "[!!] Could not save messages + ", "$bannedPlayer", "$bannedPlayer", "$bannedPlayer", "$mutedPlayer", "$bannedPlayer", "$warnedPlayer", "%d %s", "Duration format (\"", "\") is invalid! (", "Using default format instead (\"", "\") + ", "Failed to hook into ", "Try using the latest ServerListPlus development ", "SELECT NOW() as now", "now", "t: ", "f: ", " +", "", "", "", "[CONSOLE]", "))", "*", "global", "ban", "test", "server:*", "test", "Failed ", "", "", "uuid", "SELECT ", " FROM ", "id", "", "test"};
    }
}

