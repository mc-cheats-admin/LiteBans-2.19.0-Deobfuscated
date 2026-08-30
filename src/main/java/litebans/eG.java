package litebans;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import litebans.a4;
import litebans.aJ;
import litebans.am;
import litebans.au;
import litebans.b3;
import litebans.bK;
import litebans.bz;
import litebans.cy;
import litebans.di_0;
import litebans.dk;
import litebans.ep;
import litebans.eq_0;
import litebans.ew;
import litebans.gZ;
import litebans.gg_0;
import litebans.gn_0;
import litebans.h1;
import litebans.hN;
import litebans.hl;
import litebans.hy_0;
import litebans.ip_0;
import litebans.jT;
import litebans.kc_0;
import litebans.kq_0;
import litebans.ll;
import litebans.lo_0;
import litebans.q_0;
import org.jetbrains.annotations.NotNull;

public final class eG {
    private final di_0 u;
    private final gn_0 A;
    private String o;
    private String ai;
    private String a;
    private final String aR;
    private final String aU;
    private final String aM;
    private final String t;
    private final String aC;
    private final String al;
    private final String a_;
    private final String[] as;
    private final int M;
    private final int aH;
    private final long L;
    private final long i;
    private final long ak;
    private final long x;
    private final List aP;
    private final Set B;
    private final boolean G;
    private final String[] v;
    private final boolean bd;
    private final boolean C;
    private final String aE;
    private final boolean aw;
    private final boolean aj;
    private final boolean af;
    private final String be;
    private final String[] a0;
    private final String[] ao;
    private final boolean a4;
    private final boolean ar;
    private final String Y;
    private final String ad;
    private final String bb;
    private final String am;
    private final String K;
    private final String p;
    private final String h;
    private final String ag;
    private final String aK;
    private final byte a2;
    private final byte aB;
    private final int H;
    private final int r;
    private final int ab;
    private final long a3;
    private final long E;
    private final long aY;
    private final long F;
    private final int T;
    private final int a1;
    private final String a5;
    private final boolean w;
    private final boolean aJ;
    private final boolean aG;
    private final boolean aD;
    private final boolean aI;
    private final boolean f;
    private final boolean s;
    private final boolean d;
    private final boolean Z;
    private final boolean a7;
    private final boolean bc;
    private final boolean W;
    private final boolean aO;
    private final boolean D;
    private final boolean aa;
    private final boolean aT;
    private final boolean a8;
    private final boolean I;
    private final boolean bh;
    private final boolean k;
    private final boolean V;
    private final boolean N;
    private final boolean ac;
    private final boolean aX;
    private final boolean aF;
    private final boolean a9;
    private final boolean aS;
    private final boolean at;
    private final boolean R;
    private final boolean ap;
    private final boolean ax;
    private final boolean ba;
    private final boolean aN;
    private final boolean Q;
    private final boolean aV;
    private final boolean au;
    private final boolean O;
    private final boolean aQ;
    private final boolean aq;
    private final boolean ay;
    private final boolean q;
    private final byte X;
    private final boolean U;
    private final boolean l;
    private final boolean J;
    private final boolean ae;
    private final boolean b;
    private final boolean aW;
    private final boolean m;
    private final boolean bg;
    private final boolean e;
    private final boolean aL;
    private final boolean aA;
    private final String n;
    private final String[] az;
    private final String[] y;
    private final String[] aZ;
    private final List j;
    private final List g;
    private final Set av;
    private final Set P;
    private final List z;
    private final long c;
    private final long an;
    private final int S;
    private final int a6;
    private final byte ah;
    private static /* synthetic */ String[] bf;

    public eG(@NotNull di_0 var1_1, @NotNull gn_0 var2_2) {
        block67: {
            block71: {
                block68: {
                    block70: {
                        block69: {
                            super();
                            this.u = var1_1;
                            this.A = var2_2;
                            var3_3 = (q_0)this.u.a(q_0.class);
                            var3_3.a(this);
                            var4_4 = this;
                            var5_5 = false;
                            var6_7 = System.getenv("LITEBANS_CONFIG");
                            if (var6_7 != null) {
                                var4_4.u.getLogger().info("Loading environment options: " + (String)var6_7);
                                v0 = new ip_0().a((String)var6_7);
                                ew.b(v0, "");
                                var7_8 = (HashMap)v0;
                                var8_11 = var7_8.entrySet();
                                var9_12 = false;
                                var10_14 = var8_11.iterator();
                                while (var10_14.hasNext()) {
                                    var11_16 = var10_14.next();
                                    var12_17 = (Map.Entry)var11_16;
                                    var13_20 = false;
                                    var4_4.A.b((String)var12_17.getKey(), var12_17.getValue());
                                }
                            }
                            gZ.l.a(this.A.a("online_player_select_limit", 64));
                            this.b = this.A.a("i_accept_that_dupeip_geoip_iphistory_and_ipban_will_not_work_without_getAddress_and_just_want_to_only_disable_warnings_logged_to_console", false);
                            this.m = this.A.a("disable_wildcard_bans", false);
                            this.bg = this.A.a("disable_expiry_update", false);
                            var4_4 = this;
                            var5_6 = "database_time_offset";
                            var6_7 = "0 seconds";
                            var7_9 = false;
                            this.c = (long)dk.d.a(var4_4.bc().a(var5_6, (String)var6_7), dk.d.a((String)var6_7, 0.0));
                            this.ah = hy_0.a((byte)this.A.a("username_max_length", 16));
                            var3_3.a((byte)Math.max(0, this.A.a("debug_level", 0)));
                            this.d = this.A.a("bungeecord", false);
                            this.Z = this.A.a("online_mode", true);
                            var5_6 = this.A.a("sql.driver", "h2");
                            var6_7 = Locale.ENGLISH;
                            var4_4 = var5_6.toLowerCase((Locale)var6_7);
                            if (bz.b((String)var4_4, "postgres", false, 2, null)) {
                                var4_4 = "pgsql";
                            }
                            this.a = var4_4;
                            var5_6 = this.A.a("sql.address", "localhost:3306");
                            var6_7 = this.A.a("sql.database", "litebans");
                            var7_10 = this.A.a("sql.username", "");
                            var8_11 = this.A.a("sql.password", "");
                            var9_13 = this.A.a("sql.table_prefix", "litebans_");
                            if (ew.a(var4_4, (Object)"h2")) {
                                try {
                                    var11_16 = this.u.getDataFolder();
                                    var12_17 = "h2.yml";
                                    var13_20 = false;
                                    var10_14 = new File((File)var11_16, (String)var12_17);
                                    if (!var10_14.exists() || gg_0.d() == null) {
                                        var11_16 = this.u.getDataFolder();
                                        var12_17 = "h2.json";
                                        var13_20 = false;
                                        var10_14 = new File((File)var11_16, (String)var12_17);
                                    }
                                    if (var10_14.exists()) {
                                        var11_16 = this.u.a((File)var10_14).g();
                                        var7_10 = var11_16.a("user", var7_10);
                                        var8_11 = var11_16.a("password", (String)var8_11);
                                    }
                                }
                                catch (Exception var10_15) {
                                    var10_15.printStackTrace();
                                }
                            }
                            if (!ew.a((Object)var9_13, (Object)"litebans_")) {
                                var10_14 = var9_13;
                                ew.a(var10_14);
                                var10_14 = (CharSequence)var10_14;
                                var11_16 = new hN("^[0-9a-zA-Z_]*$");
                                if (!var11_16.a((CharSequence)var10_14)) {
                                    this.u.getLogger().warning("Table prefix '" + var9_13 + "' is invalid! Using default ('litebans_') + ");
                                    var9_13 = "litebans_";
                                }
                            }
                            ew.a((Object)var5_6);
                            this.aR = var5_6;
                            var10_14 = var7_10;
                            ew.a(var10_14);
                            this.aU = var10_14;
                            var10_14 = var8_11;
                            ew.a(var10_14);
                            this.aM = var10_14;
                            ew.a(var6_7);
                            this.t = var6_7;
                            var10_14 = var9_13;
                            ew.a(var10_14);
                            this.aC = var10_14;
                            var10_14 = this;
                            var11_16 = this.A.a("sql.engine", "InnoDB");
                            var12_18 = false;
                            this.al = ew.a(var11_16, (Object)"InnoDB") == false && lo_0.b(var13_21 = new String[]{"mysql", "mariadb", "h2", "sqlite"}, var11_16.toLowerCase(Locale.ROOT)) != false ? "InnoDB" : var11_16;
                            this.a_ = var10_14 = this.A.a("sql.options", "useSSL=false&serverTimezone=UTC");
                            var10_14 = "version:8";
                            var12_19 /* !! */  = new String[]{var10_14, eG.bf[48], eG.bf[49], eG.bf[50], eG.bf[51], eG.bf[52]};
                            var11_16 = var12_19 /* !! */ ;
                            var13_22 = this;
                            var14_23 = eG.bf[53];
                            var15_24 = (String[])Arrays.copyOf(var11_16, ((Object)var11_16).length);
                            var16_25 = false;
                            if (!var13_22.bc().f((String)var14_23)) {
                                v1 = Arrays.copyOf(var15_24, ((String[])var15_24).length);
                            } else {
                                var17_28 = var13_22.bc().g((String)var14_23);
                                var18_30 = false;
                                var19_37 = var17_28;
                                v1 = var19_37.toArray(new String[0]);
                            }
                            if (!ew.a(lo_0.a(var12_19 /* !! */  = v1, 0), var10_14)) {
                                var12_19 /* !! */  = var11_16;
                                var3_3.a((Object)(eG.bf[54] + (String)var10_14 + eG.bf[55]));
                            }
                            this.as = var12_19 /* !! */ ;
                            this.M = this.A.a(eG.bf[56], 1);
                            this.aH = this.A.a(eG.bf[57], 10);
                            var13_22 = this;
                            var14_23 = eG.bf[58];
                            var15_24 = eG.bf[59];
                            var16_25 = false;
                            this.L = (long)dk.d.a(var13_22.bc().a((String)var14_23, (String)var15_24), dk.d.a((String)var15_24, 0.0));
                            var13_22 = this;
                            var14_23 = eG.bf[60];
                            var15_24 = eG.bf[61];
                            var16_25 = false;
                            this.i = (long)dk.d.a(var13_22.bc().a((String)var14_23, (String)var15_24), dk.d.a((String)var15_24, 0.0));
                            var13_22 = this;
                            var14_23 = eG.bf[62];
                            var15_24 = eG.bf[63];
                            var16_25 = false;
                            this.ak = (long)dk.d.a(var13_22.bc().a((String)var14_23, (String)var15_24), dk.d.a((String)var15_24, 0.0));
                            var13_22 = this;
                            var14_23 = eG.bf[64];
                            var15_24 = eG.bf[65];
                            var16_25 = false;
                            this.x = (long)dk.d.a(var13_22.bc().a((String)var14_23, (String)var15_24), dk.d.a((String)var15_24, 0.0));
                            var13_22 = this.A.a(eG.bf[66]);
                            var14_23 = new ArrayList<E>();
                            if (var13_22 != null) {
                                var15_24 = var13_22.a(false);
                                ew.a(var15_24);
                                var16_26 = (Iterable)var15_24;
                                var17_29 = false;
                                for (Object var19_37 : var16_26) {
                                    var20_40 = (String)var19_37;
                                    var21_45 = false;
                                    var22_53 = var13_22.a(var20_40);
                                    if (var22_53 == null) continue;
                                    var23_68 = this;
                                    var24_84 = false;
                                    var25_87 /* !! */  = new String[]{eG.bf[67], eG.bf[68], eG.bf[69]};
                                    var26_95 = false;
                                    var27_101 = var25_87 /* !! */ ;
                                    var28_107 = new ArrayList<E>();
                                    var29_115 = false;
                                    var31_120 = var27_101.length;
                                    for (var30_118 = 0; var30_118 < var31_120; ++var30_118) {
                                        var33_123 = var32_122 = var27_101[var30_118];
                                        var34_129 = false;
                                        if (!(var22_53.b((String)var33_123) == null)) continue;
                                        var28_107.add(var32_122);
                                    }
                                    var25_87 /* !! */  = (List)var28_107;
                                    var26_95 = false;
                                    var27_101 = var25_87 /* !! */ ;
                                    var28_107 = new ArrayList<E>(ll.a((Iterable)var25_87 /* !! */ , 10));
                                    var29_115 = false;
                                    for (T var31_121 : var27_101) {
                                        var32_122 = (String)var31_121;
                                        var35_130 = var28_107;
                                        var33_125 = false;
                                        var35_130.add(h1.a((CharSequence)(eG.bf[70] + var20_40 + eG.bf[71] + (String)var32_122 + eG.bf[72]), (CharSequence)eG.bf[73]));
                                    }
                                    var25_87 /* !! */  = (List)var28_107;
                                    var26_94 = var23_68.u.getLogger();
                                    var27_100 = false;
                                    for (E var29_116 : var25_87 /* !! */ ) {
                                        var30_117 = (CharSequence)var29_116;
                                        var31_120 = 0;
                                        var32_122 = var26_94;
                                        var33_126 = false;
                                        var32_122.warning(var30_117.toString());
                                    }
                                    var23_68 = eG.bf[74];
                                    var24_83 = eG.bf[75];
                                    var25_87 /* !! */  = var22_53.a(eG.bf[76], eG.bf[77]);
                                    var28_107 = this;
                                    var29_114 = var22_53;
                                    var30_117 = eG.bf[78];
                                    var31_120 = 0;
                                    var36_132 = (long)dk.d.a(var29_114.a((String)var30_117, (String)var23_68), dk.d.a((String)var23_68, 0.0));
                                    var30_117 = this;
                                    var31_119 = var22_53;
                                    var32_122 = eG.bf[79];
                                    var33_127 = false;
                                    var38_133 = (long)dk.d.a(var31_119.a((String)var32_122, (String)var23_68), dk.d.a((String)var23_68, 0.0));
                                    if (var36_132 <= 0L) {
                                        var36_132 = 0x7FFFFFFFFFFFFFFFL;
                                    }
                                    if (var38_133 <= 0L) {
                                        var38_133 = 0x7FFFFFFFFFFFFFFFL;
                                    }
                                    var32_122 = this;
                                    var33_123 = var22_53;
                                    var34_128 = eG.bf[80];
                                    var35_131 = false;
                                    var40_134 = (long)dk.d.a(var33_123.a((String)var34_128, (String)var24_83), dk.d.a((String)var24_83, 0.0));
                                    var34_128 = this;
                                    var35_130 = var22_53;
                                    var42_135 = eG.bf[81];
                                    var43_137 = false;
                                    var44_138 = (long)dk.d.a(var35_130.a((String)var42_135, (String)var24_83), dk.d.a((String)var24_83, 0.0));
                                    var42_135 = this;
                                    var43_136 = var22_53;
                                    var46_139 = eG.bf[82];
                                    var47_141 = false;
                                    var48_142 = (long)dk.d.a(var43_136.a((String)var46_139, (String)var24_83), dk.d.a((String)var24_83, 0.0));
                                    var46_139 = this;
                                    var47_140 = var22_53;
                                    var50_144 = eG.bf[83];
                                    var51_146 = false;
                                    var52_147 = (long)dk.d.a(var47_140.a((String)var50_144, (String)var24_83), dk.d.a((String)var24_83, 0.0));
                                    var50_144 = this;
                                    var51_145 = var22_53;
                                    var54_148 = eG.bf[84];
                                    var55_149 = eG.bf[85];
                                    var56_150 = false;
                                    var57_151 = (long)dk.d.a(var51_145.a(var54_148, var55_149), dk.d.a(var55_149, 0.0));
                                    var50_143 = var22_53.a(eG.bf[86], false);
                                    ew.a(var25_87 /* !! */ );
                                    var51_145 = new cy((String)var25_87 /* !! */ , new b3(var36_132, var38_133), new au(var40_134, var44_138, var48_142, var52_147, var57_151), new a4(var50_143));
                                    var14_23.add(var51_145);
                                }
                            }
                            this.g = (List)var14_23;
                            var15_24 = this;
                            var16_27 /* !! */  = eG.bf[87];
                            var17_28 = eG.bf[88];
                            var18_30 = false;
                            this.a3 = (long)dk.d.a(var15_24.bc().a((String)var16_27 /* !! */ , (String)var17_28), dk.d.a((String)var17_28, 0.0));
                            var15_24 = this;
                            var16_27 /* !! */  = eG.bf[89];
                            var17_28 = eG.bf[90];
                            var18_30 = false;
                            this.E = (long)dk.d.a(var15_24.bc().a((String)var16_27 /* !! */ , (String)var17_28), dk.d.a((String)var17_28, 0.0));
                            var15_24 = this.A.a(eG.bf[91], eG.bf[92]);
                            if (ew.a(var15_24, (Object)eG.bf[93])) {
                                var17_28 = ep.a;
                                var16_27 /* !! */  = bz.b((String)var17_28);
                                if (var16_27 /* !! */  != null) {
                                    var16_27 /* !! */  = var16_27 /* !! */ .longValue() * (long)127;
                                }
                                if ((v2 = (var17_28 = var16_27 /* !! */ )) == null || (v2 = (var18_32 = v2.toString())) == null) {
                                    v2 = eG.bf[94];
                                }
                                var15_24 = v2;
                            }
                            this.aY = var15_24.hashCode();
                            this.aO = this.A.a(eG.bf[95], true);
                            this.at = this.A.a(eG.bf[96], this.A.a(eG.bf[97], true));
                            this.W = this.A.a(eG.bf[98], true);
                            this.D = this.A.a(eG.bf[99], true);
                            this.aa = this.A.a(eG.bf[100], true);
                            var17_28 = this;
                            var18_33 = eG.bf[101];
                            var19_37 = new String[]{eG.bf[102], eG.bf[103], eG.bf[104], eG.bf[105]};
                            var20_41 = false;
                            if (!var17_28.bc().f(var18_33)) {
                                v3 = Arrays.copyOf(var19_37, ((String[])var19_37).length);
                            } else {
                                var21_46 = var17_28.bc().g(var18_33);
                                var22_54 = false;
                                var23_68 = var21_46;
                                v3 = var23_68.toArray(new String[0]);
                            }
                            var16_27 /* !! */  = v3;
                            var17_28 = this;
                            var59_152 = this;
                            var18_34 = false;
                            var19_37 = kq_0.a((String[])var16_27 /* !! */ );
                            var20_41 = false;
                            var21_47 = var19_37;
                            var22_55 = new ArrayList<E>(ll.a((Iterable)var19_37, 10));
                            var23_69 = false;
                            var24_83 = var21_47.iterator();
                            while (var24_83.hasNext()) {
                                var25_87 /* !! */  = var24_83.next();
                                var26_94 = (String)var25_87 /* !! */ ;
                                var27_102 = var22_55;
                                var28_109 = false;
                                var27_102.add(bz.b((CharSequence)var26_94, ' ', false, 2, null) != false ? var26_94 : (String)var26_94 + ' ');
                            }
                            var59_152.aP = var60_153 = (List)var22_55;
                            var17_28 = this;
                            var18_34 = false;
                            this.B = ll.g(kq_0.a((String[])var16_27 /* !! */ ));
                            this.G = this.A.a(eG.bf[106], true);
                            this.aE = var17_28 = this.A.a(eG.bf[107], eG.bf[108]);
                            var17_28 = this;
                            var18_35 = eG.bf[109];
                            var19_37 = new String[]{};
                            var20_41 = false;
                            if (!var17_28.bc().f((String)var18_35)) {
                                v4 = (String[])Arrays.copyOf(var19_37, ((Object)var19_37).length);
                            } else {
                                var21_47 = var17_28.bc().g((String)var18_35);
                                var22_56 = false;
                                var23_70 = var21_47;
                                v4 = var23_70.toArray(new String[0]);
                            }
                            this.v = v4;
                            this.bd = this.A.a(eG.bf[110], false);
                            this.C = this.A.a(eG.bf[111]);
                            var18_35 = this.A.a(eG.bf[112], eG.bf[113]);
                            v5 = var18_35;
                            var17_28 = v5 != null ? v5.toLowerCase(Locale.ROOT) : null;
                            var18_35 = var17_28;
                            if (var18_35 == null) break block68;
                            switch (var18_35.hashCode()) {
                                case 1841730422: {
                                    if (!var18_35.equals(eG.bf[114])) {
                                        ** break;
                                    }
                                    break block69;
                                }
                                case -1609594047: {
                                    if (var18_35.equals(eG.bf[115])) break;
                                    ** break;
                                }
                                case -1305285460: {
                                    if (!var18_35.equals(eG.bf[116])) {
                                        ** break;
                                    }
                                    break block70;
                                }
                            }
                            v6 = 1;
                            break block71;
                        }
                        v6 = 2;
                        break block71;
                    }
                    v6 = 3;
                    break block71;
                }
                v6 = 0;
            }
            this.a2 = v6;
            var18_35 = this;
            var19_37 = this.A;
            var20_42 = eG.bf[117];
            var21_47 = eG.bf[118];
            var22_57 = false;
            this.F = (long)dk.d.a(var19_37.a((String)var20_42, (String)var21_47), dk.d.a((String)var21_47, 0.0));
            this.a1 = this.A.a(eG.bf[119], 9999999);
            this.T = this.A.a(eG.bf[120], 20);
            this.a5 = var18_35 = this.A.a(eG.bf[121], eG.bf[122]);
            this.w = this.A.a(eG.bf[123], true);
            this.aJ = this.A.a(eG.bf[124], true);
            this.aG = this.A.a(eG.bf[125], true) != false || this.a2 > 1;
            this.aD = this.A.a(eG.bf[126], true);
            this.aI = this.A.a(eG.bf[127], false);
            this.f = this.A.a(eG.bf[128], false);
            this.s = this.A.a(eG.bf[129], true);
            this.aw = this.A.a(eG.bf[130], true);
            this.aj = this.A.a(eG.bf[131], false);
            this.af = this.A.a(eG.bf[132], true);
            this.be = var18_35 = this.A.a(eG.bf[133], eG.bf[134]);
            var18_35 = this;
            var19_37 = eG.bf[135];
            var20_42 = new String[]{};
            var21_48 = 0;
            if (!var18_35.bc().f((String)var19_37)) {
                v7 = Arrays.copyOf(var20_42, var20_42.length);
            } else {
                var22_58 = var18_35.bc().g((String)var19_37);
                var23_72 = false;
                var24_83 = var22_58;
                v7 = var24_83.toArray(new String[0]);
            }
            this.a0 = v7;
            var18_35 = this;
            var19_37 = eG.bf[136];
            var20_42 = new String[]{};
            var21_48 = 0;
            if (!var18_35.bc().f((String)var19_37)) {
                v8 = Arrays.copyOf(var20_42, var20_42.length);
            } else {
                var22_59 = var18_35.bc().g((String)var19_37);
                var23_73 = false;
                var24_83 = var22_59;
                v8 = var24_83.toArray(new String[0]);
            }
            this.ao = v8;
            this.aA = this.A.a(eG.bf[137], false);
            var18_35 = this;
            var19_37 = eG.bf[138];
            var20_42 = new String[]{};
            var21_48 = 0;
            if (!var18_35.bc().f((String)var19_37)) {
                v9 = Arrays.copyOf(var20_42, var20_42.length);
            } else {
                var22_60 = var18_35.bc().g((String)var19_37);
                var23_74 = false;
                var24_83 = var22_60;
                v9 = var24_83.toArray(new String[0]);
            }
            this.az = v9;
            var18_35 = this;
            var19_37 = eG.bf[139];
            var20_42 = new String[]{};
            var21_48 = 0;
            if (!var18_35.bc().f((String)var19_37)) {
                v10 = Arrays.copyOf(var20_42, var20_42.length);
            } else {
                var22_61 = var18_35.bc().g((String)var19_37);
                var23_75 = false;
                var24_83 = var22_61;
                v10 = var24_83.toArray(new String[0]);
            }
            this.y = v10;
            var18_35 = this;
            var19_37 = eG.bf[140];
            var20_42 = new String[]{eG.bf[141], eG.bf[142], eG.bf[143], eG.bf[144], eG.bf[145]};
            var21_48 = 0;
            if (!var18_35.bc().f((String)var19_37)) {
                v11 = Arrays.copyOf(var20_42, var20_42.length);
            } else {
                var22_62 = var18_35.bc().g((String)var19_37);
                var23_76 = false;
                var24_83 = var22_62;
                v11 = var24_83.toArray(new String[0]);
            }
            this.aZ = v11;
            this.n = var18_35 = this.A.a(eG.bf[146], eG.bf[147]);
            this.ad = var18_35 = this.A.a(eG.bf[148], eG.bf[149]);
            this.ar = this.A.a(eG.bf[150], true);
            this.a4 = this.A.a(eG.bf[151], true);
            this.Y = var18_35 = this.A.a(eG.bf[152], eG.bf[153]);
            this.bb = var18_35 = this.A.a(eG.bf[154], eG.bf[155]);
            this.K = var18_35 = this.A.a(eG.bf[156], eG.bf[157]);
            this.p = var18_35 = this.A.a(eG.bf[158], eG.bf[159]);
            this.am = var18_35 = this.A.a(eG.bf[160], eG.bf[161]);
            this.h = var18_35 = this.A.a(eG.bf[162], eG.bf[163]);
            var18_35 = litebans.am.a(this.A.a(eG.bf[164], eG.bf[165]), true);
            var18_35 = (CharSequence)var18_35;
            var19_38 = this.ah;
            var20_43 = false;
            this.aK = h1.a(var18_35.toString(), var19_38 & 255);
            this.a8 = this.A.a(eG.bf[166], false);
            this.I = this.A.a(eG.bf[167], false);
            var18_35 = this;
            var19_39 = this.A;
            var20_44 = eG.bf[168];
            var21_48 = 1;
            var22_63 = false;
            this.aB = (byte)var19_39.a((String)var20_44, var21_48);
            this.bh = this.A.a(eG.bf[169], true);
            this.k = this.A.a(eG.bf[170], false);
            this.aT = this.A.a(eG.bf[171], true);
            this.N = this.A.a(eG.bf[172], false);
            this.V = this.A.a(eG.bf[173], false);
            this.H = Math.max(0, this.A.a(eG.bf[174], 5));
            var18_36 = this.A.a(eG.bf[175], false);
            if (this.u.t() == 0 && this.u.i().a(eG.bf[176])) {
                var3_3.a((Object)eG.bf[177]);
                var18_36 = true;
            }
            this.ac = var18_36;
            this.ab = this.A.a(eG.bf[178], 12000);
            this.r = this.A.a(eG.bf[179], 12000);
            this.aX = this.A.a(eG.bf[180], false);
            this.aF = this.A.a(eG.bf[181], false);
            this.a9 = this.A.a(eG.bf[182], false);
            var19_39 = eG.a(this, false, 1, null);
            this.ai = (String)var19_39.b();
            this.o = (String)var19_39.e();
            var20_44 = this.A.a(eG.bf[183], eG.bf[184]);
            this.ag = h1.a((String)var20_44, 32);
            this.an = Math.max(40L, this.A.a(eG.bf[185], 55L));
            this.S = Math.max(1, this.A.a(eG.bf[186], 3));
            var20_44 = eG.bf[187];
            var21_48 = 1;
            var22_63 = false;
            var23_77 = this;
            var24_83 = new String[]{};
            var25_88 = false;
            if (!var23_77.bc().f((String)var20_44)) {
                v12 = Arrays.copyOf(var24_83, ((String[])var24_83).length);
            } else {
                var26_94 = var23_77.bc().g((String)var20_44);
                var27_103 = false;
                var28_110 = var26_94;
                v12 = var28_110.toArray(new String[0]);
            }
            this.av = ll.b((Iterable)kq_0.a(v12));
            var20_44 = this;
            var21_49 = eG.bf[188];
            var22_64 = new String[]{eG.bf[189]};
            var23_78 = false;
            if (!var20_44.bc().f(var21_49)) {
                v13 = Arrays.copyOf(var22_64, var22_64.length);
            } else {
                var24_83 = var20_44.bc().g(var21_49);
                var25_88 = false;
                var26_94 = var24_83;
                v13 = var26_94.toArray(new String[0]);
            }
            this.j = kq_0.a(v13);
            var20_44 = this;
            var21_49 = eG.bf[190];
            var23_79 = this;
            var24_83 = eG.bf[191];
            var25_89 = new String[]{};
            var26_96 = false;
            if (!var23_79.bc().f((String)var24_83)) {
                v14 = Arrays.copyOf(var25_89, var25_89.length);
            } else {
                var27_104 = var23_79.bc().g((String)var24_83);
                var28_111 = false;
                var29_114 = var27_104;
                v14 = var29_114.toArray(new String[0]);
            }
            var22_64 = v14;
            var22_64 = Arrays.copyOf(var22_64, var22_64.length);
            var23_80 = false;
            if (!var20_44.bc().f(var21_49)) {
                v15 = Arrays.copyOf(var22_64, var22_64.length);
            } else {
                var24_83 = var20_44.bc().g(var21_49);
                var25_90 = false;
                var26_97 = var24_83;
                v15 = var26_97.toArray(new String[0]);
            }
            this.z = kq_0.a(v15);
            var20_44 = eG.bf[192];
            var21_50 = true;
            var22_65 = false;
            var23_81 = this;
            var24_83 = new String[]{};
            var25_92 = false;
            if (!var23_81.bc().f((String)var20_44)) {
                v16 = (String[])Arrays.copyOf(var24_83, ((Object)var24_83).length);
            } else {
                var26_98 = var23_81.bc().g((String)var20_44);
                var27_105 = false;
                var28_112 = var26_98;
                v16 = var28_112.toArray(new String[0]);
            }
            this.P = ll.b((Iterable)kq_0.a(v16));
            var20_44 = eq_0.f;
            var21_51 = this.z;
            var59_152 = this;
            var22_65 = false;
            var23_81 = var21_51;
            var24_85 = false;
            if (var23_81 instanceof Collection && ((Collection)var23_81).isEmpty()) {
                v17 = false;
            } else {
                var25_93 = var23_81.iterator();
                while (var25_93.hasNext()) {
                    var26_99 = var25_93.next();
                    var27_106 = (String)var26_99;
                    var28_113 = false;
                    if (!eq_0.f.a(var27_106)) continue;
                    v17 = true;
                    break block67;
                }
                v17 = false;
            }
        }
        var59_152.aL = (var60_154 = v17) != false || this.z.contains(var19_39.b()) != false;
        this.a6 = this.A.a(eG.bf[193], 10);
        this.ap = this.A.a(eG.bf[194], true);
        this.ax = this.A.a(eG.bf[195], true);
        this.ba = this.A.a(eG.bf[196], true);
        this.aN = this.A.a(eG.bf[197], false);
        this.aS = this.A.a(eG.bf[198], false);
        this.Q = this.A.a(eG.bf[199], true);
        this.e = this.A.a(eG.bf[200], false);
        this.au = this.A.a(eG.bf[201], true);
        this.R = this.A.a(eG.bf[202], true);
        this.ae = this.aj != false || this.A.a(eG.bf[203], true) != false;
        this.bc = this.A.a(eG.bf[204], false);
        this.a7 = this.A.a(eG.bf[205], false);
        this.O = this.A.a(eG.bf[206], true);
        this.aV = this.A.a(eG.bf[207], true);
        this.aQ = this.A.a(eG.bf[208], true);
        this.ay = this.A.a(eG.bf[209], true);
        this.aq = this.A.a(eG.bf[210], true);
        this.U = this.A.a(eG.bf[211], false);
        this.l = this.A.a(eG.bf[212], false);
        this.J = this.A.a(eG.bf[213], true);
        this.q = this.A.a(eG.bf[214], true);
        this.X = (byte)Math.min(this.A.a(eG.bf[215], 1), 2);
        this.aW = this.A.a(eG.bf[216], false) != false && this.u.t() == 0;
        var20_44 = this;
        var21_52 = false;
        var22_66 = var20_44.u.getLogger();
        var23_82 = false;
        if (!var20_44.Q) {
            var22_66.warning(eG.bf[217]);
        }
        if (var20_44.aW) {
            var22_66.warning(eG.bf[218]);
        }
        if (var20_44.m) {
            var22_66.warning(eG.bf[219]);
        }
        if (var20_44.bg) {
            var22_66.warning(eG.bf[220]);
        }
        if (var20_44.a2 == 0) {
            v18 = var20_44.A.a(eG.bf[221], eG.bf[222]);
            if (v18 == null || (v18 = v18.toLowerCase(Locale.ROOT)) == null) {
                v18 = eG.bf[223];
            }
            if (((CharSequence)(var24_86 = v18)).length() > 0 && !ew.a((Object)var24_86, (Object)eG.bf[224])) {
                var22_66.warning(eG.bf[225] + var24_86 + eG.bf[226]);
            }
        }
        var20_44 = var3_3;
        var21_52 = false;
        if (var20_44.g()) {
            var59_152 = var20_44;
            var22_67 = false;
            var60_155 = h1.a(h1.a((CharSequence)ll.a(this.g, null, null, null, 0, null, null, 63, null), (CharSequence)(eG.bf[227] + Arrays.toString(var16_27 /* !! */ ))), (CharSequence)(eG.bf[228] + Arrays.toString(this.y)));
            var59_152.a(var60_155);
        }
    }

    public /* synthetic */ eG(di_0 di_02, gn_0 gn_02, int n, aJ aJ2) {
        if ((n & 2) != 0) {
            gn_02 = di_02.h();
        }
        this(di_02, gn_02);
    }

    public final di_0 a7() {
        return this.u;
    }

    public final gn_0 bc() {
        return this.A;
    }

    public final String aG() {
        return this.o;
    }

    public final void a(@NotNull String string) {
        this.o = string;
    }

    public final String aw() {
        return this.ai;
    }

    public final void b(@NotNull String string) {
        this.ai = string;
    }

    public final String aF() {
        return this.a;
    }

    public final void c(@NotNull String string) {
        this.a = string;
    }

    public final String q() {
        return this.aR;
    }

    public final String aW() {
        return this.aU;
    }

    public final String a9() {
        return this.aM;
    }

    public final String w() {
        return this.t;
    }

    public final String d() {
        return this.aC;
    }

    public final String a_() {
        return this.al;
    }

    public final String aN() {
        return this.a_;
    }

    public final String[] aV() {
        return this.as;
    }

    public final int V() {
        return this.M;
    }

    public final int a8() {
        return this.aH;
    }

    public final long l() {
        return this.L;
    }

    public final long Y() {
        return this.i;
    }

    public final long aX() {
        return this.ak;
    }

    public final List ae() {
        return this.aP;
    }

    public final Set aC() {
        return this.B;
    }

    public final boolean C() {
        return this.G;
    }

    public final String[] A() {
        return this.v;
    }

    public final boolean a0() {
        return this.bd;
    }

    public final boolean a1() {
        return this.C;
    }

    public final String ar() {
        return this.aE;
    }

    public final boolean R() {
        return this.aw;
    }

    public final boolean ac() {
        return this.aj;
    }

    public final boolean N() {
        return this.af;
    }

    public final String aL() {
        return this.be;
    }

    public final String[] as() {
        return this.a0;
    }

    public final String[] r() {
        return this.ao;
    }

    public final boolean X() {
        return this.a4;
    }

    public final boolean ai() {
        return this.ar;
    }

    public final String m() {
        return this.Y;
    }

    public final String bd() {
        return this.ad;
    }

    public final String G() {
        return this.bb;
    }

    public final String ao() {
        return this.am;
    }

    public final String P() {
        return this.K;
    }

    public final String ah() {
        return this.p;
    }

    public final String az() {
        return this.h;
    }

    public final String a5() {
        return this.ag;
    }

    public final String aR() {
        return this.aK;
    }

    public final byte e() {
        return this.a2;
    }

    public final byte b() {
        return this.aB;
    }

    public final int aZ() {
        return this.H;
    }

    public final int bf() {
        return this.r;
    }

    public final int Z() {
        return this.ab;
    }

    public final long a2() {
        return this.a3;
    }

    public final long bb() {
        return this.E;
    }

    public final long aD() {
        return this.aY;
    }

    public final long o() {
        return this.F;
    }

    public final int y() {
        return this.T;
    }

    public final int a3() {
        return this.a1;
    }

    public final String aO() {
        return this.a5;
    }

    public final boolean aM() {
        return this.w;
    }

    public final boolean c() {
        return this.aJ;
    }

    public final boolean aP() {
        return this.aG;
    }

    public final boolean aY() {
        return this.aD;
    }

    public final boolean Q() {
        return this.aI;
    }

    public final boolean ak() {
        return this.f;
    }

    public final boolean aJ() {
        return this.s;
    }

    public final boolean aH() {
        return this.d;
    }

    public final boolean af() {
        return this.Z;
    }

    public final boolean u() {
        return this.a7;
    }

    public final boolean n() {
        return this.bc;
    }

    public final boolean aI() {
        return this.W;
    }

    public final boolean p() {
        return this.aO;
    }

    public final boolean ab() {
        return this.D;
    }

    public final boolean D() {
        return this.aa;
    }

    public final boolean ay() {
        return this.aT;
    }

    public final boolean F() {
        return this.a8;
    }

    public final boolean E() {
        return this.I;
    }

    public final boolean a4() {
        return this.bh;
    }

    public final boolean K() {
        return this.k;
    }

    public final boolean aA() {
        return this.V;
    }

    public final boolean bh() {
        return this.N;
    }

    public final boolean a6() {
        return this.ac;
    }

    public final boolean i() {
        return this.aX;
    }

    public final boolean aq() {
        return this.aF;
    }

    public final boolean ad() {
        return this.a9;
    }

    public final boolean v() {
        return this.aS;
    }

    public final boolean x() {
        return this.at;
    }

    public final boolean ax() {
        return this.R;
    }

    public final boolean aS() {
        return this.ap;
    }

    public final boolean s() {
        return this.ax;
    }

    public final boolean aU() {
        return this.ba;
    }

    public final boolean bg() {
        return this.aN;
    }

    public final boolean B() {
        return this.Q;
    }

    public final boolean U() {
        return this.aV;
    }

    public final boolean a() {
        return this.au;
    }

    public final boolean z() {
        return this.O;
    }

    public final boolean O() {
        return this.aQ;
    }

    public final boolean t() {
        return this.aq;
    }

    public final boolean an() {
        return this.ay;
    }

    public final boolean aa() {
        return this.q;
    }

    public final byte am() {
        return this.X;
    }

    public final boolean al() {
        return this.U;
    }

    public final boolean f() {
        return this.l;
    }

    public final boolean av() {
        return this.J;
    }

    public final boolean aB() {
        return this.ae;
    }

    public final boolean h() {
        return this.b;
    }

    public final boolean M() {
        return this.aW;
    }

    public final boolean aE() {
        return this.m;
    }

    public final boolean I() {
        return this.bg;
    }

    public final boolean J() {
        return this.e;
    }

    public final boolean j() {
        return this.aL;
    }

    public final boolean W() {
        return this.aA;
    }

    public final String k() {
        return this.n;
    }

    public final String[] at() {
        return this.az;
    }

    public final String[] S() {
        return this.y;
    }

    public final String[] g() {
        return this.aZ;
    }

    public final List H() {
        return this.j;
    }

    public final List L() {
        return this.g;
    }

    public final Set au() {
        return this.av;
    }

    public final Set ap() {
        return this.P;
    }

    public final List aj() {
        return this.z;
    }

    public final long aK() {
        return this.c;
    }

    public final long aQ() {
        return this.an;
    }

    public final int ag() {
        return this.S;
    }

    public final int aT() {
        return this.a6;
    }

    public final byte be() {
        return this.ah;
    }

    public final jT a(boolean bl) {
        String string;
        q_0 q_02 = (q_0)this.u.a(q_0.class);
        String string2 = h1.a(this.A.a(bf[255], bf[256]), 32);
        if (eq_0.f.b(string2)) {
            q_02.a((Object)(bf[257] + string2 + bf[258]));
            string2 = bf[259];
        }
        String string3 = null;
        File file = this.u.getDataFolder();
        Object object = bf[260];
        boolean bl2 = false;
        File file2 = new File(file, (String)object);
        if (!file2.exists() || gg_0.d() == null) {
            file = this.u.getDataFolder();
            object = bf[261];
            bl2 = false;
            file2 = new File(file, (String)object);
        }
        try {
            boolean bl3 = bl || !file2.exists();
            object = this.u.a(file2).g();
            String string4 = object.a(bf[262], null);
            if (string4 != null && string4.length() == 32) {
                string3 = string4;
            } else {
                string3 = this.T();
                bl3 = true;
            }
            if (bl3) {
                object.b(bf[263], string3);
                ((gn_0)object).h();
            } else {
                q_02.a(false);
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
            q_02.a(false);
        }
        if ((string = string3) == null) {
            string = this.T();
        }
        jT jT2 = kc_0.a(string2, string);
        object = q_02;
        int n = 10;
        boolean bl4 = false;
        if (((q_0)object).a(n)) {
            Object object2 = object;
            boolean bl5 = false;
            ((q_0)object2).a((Object)(bf[264] + (String)jT2.e() + '\"'));
        }
        return jT2;
    }

    public static /* synthetic */ jT a(eG eG2, boolean bl, int n, Object object) {
        if ((n & 1) != 0) {
            bl = false;
        }
        return eG2.a(bl);
    }

    public final String T() {
        return bK.c.a(UUID.randomUUID());
    }

    private static final void ba() {
        bf = new String[]{"LITEBANS_CONFIG", "Loading environment options: ", "", "online_player_select_limit", "i_accept_that_dupeip_geoip_iphistory_and_ipban_will_not_work_without_getAddress_and_just_want_to_only_disable_warnings_logged_to_console", "disable_wildcard_bans", "disable_expiry_update", "database_time_offset", "0 seconds", "username_max_length", "debug_level", "bungeecord", "online_mode", "sql.driver", "h2", "postgres", "pgsql", "sql.address", "localhost:3306", "sql.database", "litebans", "sql.username", "", "sql.password", "", "sql.table_prefix", "litebans_", "h2", "h2.yml", "h2.json", "user", "password", "litebans_", "^[0-9a-zA-Z_]*$", "Table prefix '", "' is invalid! Using default ('litebans_') + ", "litebans_", "sql.engine", "InnoDB", "InnoDB", "mysql", "mariadb", "h2", "sqlite", "InnoDB", "sql.options", "useSSL=false&serverTimezone=UTC", "version:8", "mysql:com.mysql.cj.jdbc.Driver:https://repo1.maven.org/maven2/mysql/mysql-connector-java/{}/mysql-connector-java-{}.jar:8.0.29:d4e32d2a6026b5acc00300b73a86c28fb92681ae9629b21048ee67014c911db6", "pgsql:org.postgresql.Driver:https://repo1.maven.org/maven2/org/postgresql/postgresql/{}/postgresql-{}.jar:42.4.0:fe25b9c0a2c59458504ec88862853df522ee87f8a02564835d537c29ae4cb125", "mariadb:org.mariadb.jdbc.Driver:https://repo1.maven.org/maven2/org/mariadb/jdbc/mariadb-java-client/{}/mariadb-java-client-{}.jar:3.1.2:aaec1ad348d030a65b25c93c65cdaf472bf8b4b6b314b965e5ba13aec81bc622", "sqlite:org.sqlite.JDBC:https://repo1.maven.org/maven2/org/xerial/sqlite-jdbc/{}/sqlite-jdbc-{}.jar:3.8.11.1:58ab29176a24a85a0c76177561257a986c4865e45730b79882c688846371d341", "h2:org.h2.Driver:https://repo1.maven.org/maven2/com/h2database/h2/{}/h2-{}.jar:1.4.197:37f5216e14af2772930dff9b8734353f0a80e89ba3f33e065441de6537c5e842", "sql.drivers", "Using default database drivers (", ") + ", "sql.pool.min_connections", "sql.pool.max_connections", "sql.pool.keepalive", "0 seconds", "sql.pool.timeout", "95 seconds", "sql.pool.idle_timeout", "1 minute", "sql.pool.max_lifetime", "15 minutes", "durations.limits", "permission", "tempban", "tempmute", "The duration limit group \"", "\" does not have the \"", "\" option ", "Note that tempban/tempmute durations will default to 27 seconds and the permission will default to ", "27 seconds", "5 seconds", "permission", "none", "tempban", "tempmute", "cooldown_ban", "cooldown_mute", "cooldown_warn", "cooldown_kick", "cooldown_redo", "1 second", "require_template", "durations.console_cooldown", "1 second", "durations.effective_ipban_duration", "permanent", "security.obscure_seed", "0", "0", "1", "mutes.enabled", "durations.reduce_to_limit", "durations.round_down", "mutes.prevent_bypass", "lockdown.enabled", "lockdown.persist_enabled", "mutes.command_blacklist", "/me", "/say", "/msg", "/tell", "warnings.enabled", "warnings.expire_after", "3 days", "warnings.actions", "warnings.actions_execute_as_console", "warnings.delete_warnings_after_action", "ban_alts", "", "enhanced", "enabled", "extreme", "notify.dupeip_scan_filter_duration", "7d", "notify.dupeip_on_join_threshold", "notify.dupeip_scan_limit", "notify.notify_discord", "", "notify.banned_player_join", "notify.muted_player_chat", "notify.dupeip_on_join", "notify.dupeip_on_banned_account", "notify.dupeip_on_muted_account", "notify.dupeip_show_muted_accounts", "notify.notify_console", "exempt.enable", "exempt.use_group_weights", "exempt.permit_same_weight", "exempt.permission_world", "default", "exempt.exempt_groups", "exempt.exempt_players", "geoip.enable", "geoip.blacklist", "geoip.whitelist", "geoip.download.api", "https://repo1.maven.org/maven2/com/maxmind/geoip2/geoip2/2.1.0/geoip2-2.1.0.jar:81035e738fc392bcfb00be5d39f50fde56692ba305b21338412da9c0fc98e3fb", "https://repo1.maven.org/maven2/com/fasterxml/jackson/core/jackson-annotations/2.4.3/jackson-annotations-2.4.3.jar:3c680cfafad00cfe1432514f19c5c13fde17913aa2269a9844882404242f6452", "https://repo1.maven.org/maven2/com/fasterxml/jackson/core/jackson-core/2.4.3/jackson-core-2.4.3.jar:2c77b1c9441f257eb9e3dda476758a034a9383ef848f97b9949287a0519923e6", "https://repo1.maven.org/maven2/com/fasterxml/jackson/core/jackson-databind/2.4.3/jackson-databind-2.4.3.jar:d7ac4f5ce138ce63478673e64378c2efd27f0294602f0fc69cb867685c723797", "https://repo1.maven.org/maven2/com/maxmind/db/maxmind-db/1.0.0/maxmind-db-1.0.0.jar:3cd5c1c731d8d9cb561d4e53ad6017862e4917cc08c24f45111061b1c2170b06", "geoip.download.db", "https://download.maxmind.com/app/geoip_download?edition_id=GeoLite2-Country&license_key=YOUR_LICENSE_KEY&suffix=tar.gz", "import.from", "vanilla", "import.sqlite", "import.import_ipbans", "import.sqlite_file", "plugins/MaxBans/bans.db", "import.import_mysql_address", "localhost:3306", "import.import_mysql_username", "", "import.import_mysql_password", hl.a("", 0x1E1BB1B1), "import.import_mysql_database", "maxbans", "import.import_table_prefix", "default", "console_sender_name", "Console", "autocomplete_online_player_names", "dupeip_scan_all_ips", "ipreport_minimum_accounts", "delete_previous_history", "unban_all_history", "support_authme", "use_display_names", "banlist_show_active_only", "banlist_bans_per_page", "ban_names", "FastLogin", "FastLogin detected; forcing `ban_names=true` + ", "offline_tab_size", "notification_throttle_ticks", "require_kick_reason", "require_ban_mute_reason", "require_unban_unmute_reason", "default_server_scope", "*", "sync_poll_ticks", "sync_poll_skip", "hidden_dupeip_players", "ignored_kick_messages", "restarting", "ignored_iphistory_servers", "ignored_history_servers", "disable_login_ban_check_servers", "default_history_limit", "sync", "sync_broadcasts", "sync_notifications", "sync_dupeip_notifications", "use_database_time", "local_messages", "check_after_join", "use_protocollib", "override_lower_duration", "allow_exempt_bypass", "silent", "punish_ip", "use_timezone", "update_check", "security.dupeip", "security.iphistory", "security.staffrollback", "security.modify", "security.prunehistory", "security.sender_custom", "security.ipban", "security.ipban_command", "disable_login_ban_check", "Local messages are disabled! If you don't see any broadcasts, try enabling ", "Login ban checks are disabled! Bans will not take effect ", "Wildcard bans are disabled! Wildcard IP-bans and IP-mutes will not take ", "Expiry update query is disabled! One instance should have this enabled, at ", "ban_alts", "", "", "disabled", "Unrecognized setting for ban_alts: \"", "\". This option will be ", "m:", "gw: ", "LITEBANS_CONFIG", "Loading environment options: ", "", "InnoDB", "mysql", "mariadb", "h2", "sqlite", "InnoDB", "Local messages are disabled! If you don't see any broadcasts, try enabling ", "Login ban checks are disabled! Bans will not take effect ", "Wildcard bans are disabled! Wildcard IP-bans and IP-mutes will not take ", "Expiry update query is disabled! One instance should have this enabled, at ", "ban_alts", "", "", "disabled", "Unrecognized setting for ban_alts: \"", "\". This option will be ", "permission", "tempban", "tempmute", "The duration limit group \"", "\" does not have the \"", "\" option ", "Note that tempban/tempmute durations will default to 27 seconds and the permission will default to ", "server_name", "litebans", "[Sync] Server name cannot be \"", "\" (global context)! Reverting to ", "litebans", "server.yml", "server.json", "uuid", "uuid", "Server UUID: \""};
    }

    static {
        eG.ba();
    }
}

