package litebans;

import java.lang.invoke.LambdaMetafactory;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import litebans.aI;
import litebans.a_;
import litebans.aa_0;
import litebans.am;
import litebans.as;
import litebans.b7;
import litebans.bC;
import litebans.bF;
import litebans.bK;
import litebans.bb;
import litebans.bt_0;
import litebans.bz;
import litebans.c1;
import litebans.cP;
import litebans.cW;
import litebans.c_0;
import litebans.cb_0;
import litebans.cg_0;
import litebans.ch;
import litebans.cz;
import litebans.d9;
import litebans.dZ;
import litebans.db_0;
import litebans.di_0;
import litebans.dk;
import litebans.dr_0;
import litebans.dy_0;
import litebans.eY;
import litebans.eo_0;
import litebans.eq_0;
import litebans.ew;
import litebans.fB;
import litebans.fD;
import litebans.fV;
import litebans.fW;
import litebans.fg_0;
import litebans.fo_0;
import litebans.g1;
import litebans.h1;
import litebans.hd_0;
import litebans.he_0;
import litebans.hl;
import litebans.hq;
import litebans.ht_0;
import litebans.hv_0;
import litebans.i1;
import litebans.iA;
import litebans.iX;
import litebans.ij;
import litebans.iv_0;
import litebans.j0;
import litebans.jf_0;
import litebans.jj_0;
import litebans.jv_0;
import litebans.kL;
import litebans.kR;
import litebans.kb_0;
import litebans.l6;
import litebans.ll;
import litebans.lo_0;
import litebans.o;
import litebans.p;
import litebans.q_0;
import litebans.u;
import litebans.v;
import litebans.w;
import litebans.x;
import litebans.x_0;
import org.jetbrains.annotations.NotNull;

public final class fk_0
extends fV {
    public static final bC j;
    private static /* synthetic */ String[] k;

    public fk_0(@NotNull di_0 di_02) {
        super("ban", di_02);
    }

    @Override
    public boolean a() {
        return false;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Could not resolve type clashes
     * Unable to fully structure code
     */
    @Override
    public void a(@NotNull jv_0 var1_1, @NotNull String[] var2_2) {
        block271: {
            var4_3 = this;
            var5_4 = 0;
            var3_5 = (q_0)var4_3.h().a(q_0.class);
            var4_3 = this.h().w();
            var5_4 = var4_3.size();
            try {
                var6_6 = var3_5;
                var7_8 = false;
                if (var6_6.g()) {
                    var78_10 = var6_6;
                    var8_11 = false;
                    var79_15 = "[c] " + var5_4;
                    var78_10.a((Object)var79_15);
                }
            }
            catch (dr_0 var6_7) {
                var7_9 = var3_5;
                var8_12 = false;
                if (ew.a(he_0.a((q_0)var7_9), (Object)am.a(var7_9, false, true))) {
                    var3_5.b((byte)49);
                }
                var7_9 = this;
                var8_12 = false;
                ((w)var7_9.h().a(w.class)).a(var6_7);
                return;
            }
            var6_6 = this;
            var7_8 = false;
            var6_6 = (w)var6_6.h().a(w.class);
            var7_8 = false;
            try {
                var8_13 = var6_6.f();
                var9_16 = var8_13;
                var10_17 = null;
                try {
                    block268: {
                        var11_18 = (ch)var9_16;
                        var12_19 = false;
                        var13_22 = var8_13;
                        var14_23 = false;
                        var15_24 = new cP();
                        if (var13_22.b()) {
                            var16_25 = fg_0.a;
                            var17_28 = var3_5.w() != null;
                            var18_30 = hd_0.c + "[LiteBans]" + hd_0.F + " Plugin access has been disabled!";
                            var19_32 = var1_1;
                            var20_35 = "litebans.admin";
                            var21_39 = false;
                            var19_33 = var19_32.e(var20_35);
                            var20_36 = false;
                            if (var19_33) {
                                var21_39 = false;
                                var22_41 = hd_0.c + "[LiteBans]" + hd_0.d + " If you have bought LiteBans, contact Ruan on SpigotMC + ";
                                var23_47 = false;
                                if (var22_41 != null && var22_41.length() > 0 != false) {
                                    var23_48 = var18_30;
                                    var24_53 = "\n";
                                    var25_62 = false;
                                    var23_48 = "" + var23_48 + var24_53;
                                    var24_54 = false;
                                    v0 = "" + var23_48 + var22_41;
                                } else {
                                    v0 = var18_30;
                                }
                            } else {
                                v0 = var18_30;
                            }
                            var18_30 = h1.a(v0, (CharSequence)var3_5.j());
                            var19_33 = false;
                            var20_37 = var16_25;
                            var21_39 = false;
                            if (var17_28) {
                                var22_41 = var20_37;
                                var23_49 = false;
                                var22_41.a(var18_30);
                                throw new as();
                            }
                            fg_0.a.a(am.aX);
                            throw new as();
                        }
                        try {
                            if (fD.i == null) {
                                throw var15_24;
                            }
                            var16_26 = var3_5.f();
                            var17_29 = var13_22.e().q();
                            var18_31 = var16_26.a5();
                            var20_38 = a_.h;
                            var21_40 = var16_26.u();
                            var22_42 = var16_26.n();
                            var23_50 = var13_22.d().a(var1_1);
                            var26_69 = w.a(var13_22.d(), false, 1, null);
                            var28_70 = var13_22.a(var1_1);
                            var19_34 = new cz((a_)var20_38, var21_40, var22_42, false, false, false, false, false, false, false, false, false, false, false, var26_69, 0L, 0L, 0, null, null, false, null, 0, null, null, null, null, var1_1, (String)var28_70, null, var18_31, var23_50, null, null, var2_2, null, null, 671072248, 27, null);
                            var20_38 = var19_34;
                            var21_40 = false;
                            try {
                                block270: {
                                    block283: {
                                        block284: {
                                            block275: {
                                                block276: {
                                                    block278: {
                                                        block279: {
                                                            block282: {
                                                                block280: {
                                                                    block281: {
                                                                        block277: {
                                                                            block274: {
                                                                                block272: {
                                                                                    block267: {
                                                                                        block273: {
                                                                                            cz.a((cz)var20_38, var13_22, null, false, 3, null);
                                                                                            var22_43 = fg_0.a;
                                                                                            var23_51 = var20_38.u().c() == a_.j && var16_26.p() == false ? 1 : 0;
                                                                                            var24_55 = am.ds;
                                                                                            var25_63 = false;
                                                                                            var28_70 = var22_43;
                                                                                            var29_81 = false;
                                                                                            if (var23_51 != 0) {
                                                                                                var30_101 = var28_70;
                                                                                                var31_118 = false;
                                                                                                var30_101.a(var24_55);
                                                                                                throw new as();
                                                                                            }
                                                                                            var22_43 = fg_0.a;
                                                                                            var23_51 = var20_38.k() != false && var1_1.e() != false && var16_26.av() != false ? 1 : 0;
                                                                                            var24_55 = am.b;
                                                                                            var25_63 = false;
                                                                                            var28_70 = var22_43;
                                                                                            var29_81 = false;
                                                                                            if (var23_51 != 0) {
                                                                                                var30_102 = var28_70;
                                                                                                var31_119 = false;
                                                                                                var30_102.a(var24_55);
                                                                                                throw new as();
                                                                                            }
                                                                                            var22_43 = fg_0.a;
                                                                                            var23_51 = var20_38.F() != false && var1_1.e() != false && var16_26.al() != false ? 1 : 0;
                                                                                            var24_55 = am.b;
                                                                                            var25_63 = false;
                                                                                            var28_70 = var22_43;
                                                                                            var29_81 = false;
                                                                                            if (var23_51 != 0) {
                                                                                                var30_103 = var28_70;
                                                                                                var31_120 = false;
                                                                                                var30_103.a(var24_55);
                                                                                                throw new as();
                                                                                            }
                                                                                            var22_44 = var3_5.i().a(10);
                                                                                            switch (var22_44) {
                                                                                                case 0: 
                                                                                                case 1: {
                                                                                                    var23_51 = var3_5.i().a(10);
                                                                                                    if (var23_51 != 1) ** GOTO lbl182
                                                                                                    var24_55 = var3_5;
                                                                                                    var25_63 = false;
                                                                                                    if (!var24_55.g()) ** GOTO lbl183
                                                                                                    var32_136 = var24_55;
                                                                                                    var28_71 = false;
                                                                                                    v1 = new StringBuilder().append("Timeout after ");
                                                                                                    var29_82 = fB.d;
                                                                                                    var30_104 /* !! */  = this.getName();
                                                                                                    var31_121 = false;
                                                                                                    var33_137 = var30_104 /* !! */ ;
                                                                                                    switch (var33_137.hashCode()) {
                                                                                                        case -1320563219: {
                                                                                                            if (var33_137.equals("dupeip")) break;
                                                                                                            ** break;
                                                                                                        }
                                                                                                        case 712910260: {
                                                                                                            if (!var33_137.equals("staffhistory")) {
                                                                                                                ** break;
                                                                                                            }
                                                                                                            ** GOTO lbl171
                                                                                                        }
                                                                                                        case 926934164: {
                                                                                                            if (!var33_137.equals("history")) {
                                                                                                                ** break;
                                                                                                            }
                                                                                                            ** GOTO lbl168
                                                                                                        }
                                                                                                    }
                                                                                                    var34_155 /* !! */  = new String[]{"alts", "litebans:alts", "checkalts", "litebans:checkalts", "litebans:dupeip"};
                                                                                                    v2 = var34_155 /* !! */ ;
                                                                                                    ** GOTO lbl177
lbl168:
                                                                                                    // 1 sources

                                                                                                    var34_155 /* !! */  = new String[]{"hist", "litebans:history"};
                                                                                                    v2 = var34_155 /* !! */ ;
                                                                                                    ** GOTO lbl177
lbl171:
                                                                                                    // 1 sources

                                                                                                    var34_155 /* !! */  = new String[]{"staffhist", "litebans:staffhistory"};
                                                                                                    v2 = var34_155 /* !! */ ;
                                                                                                    ** GOTO lbl177
lbl174:
                                                                                                    // 4 sources

                                                                                                    var34_155 /* !! */  = new String[]{"litebans:" + (String)var30_104 /* !! */ };
                                                                                                    v2 = var34_155 /* !! */ ;
lbl177:
                                                                                                    // 4 sources

                                                                                                    var35_170 = v2;
                                                                                                    var36_182 /* !! */  = v1.append((Object)c_0.c(new l6(var3_5, Arrays.copyOf(var35_170, ((String[])var35_170).length)).b())).append(" seconds").toString();
                                                                                                    var32_136.a((Object)var36_182 /* !! */ );
                                                                                                    ** GOTO lbl183
lbl182:
                                                                                                    // 1 sources

                                                                                                    var13_22.d().c();
lbl183:
                                                                                                    // 3 sources

                                                                                                    v3 = iv_0.a;
                                                                                                    break;
                                                                                                }
                                                                                                case 2: {
                                                                                                    he_0.a(var3_5, am.a(var3_5.f(), false, true));
                                                                                                    v3 = iv_0.a;
                                                                                                    break;
                                                                                                }
                                                                                                case 3: 
                                                                                                case 4: 
                                                                                                case 5: 
                                                                                                case 6: 
                                                                                                case 7: {
                                                                                                    var23_51 = var3_5.l();
                                                                                                    if (var23_51 == 1 && new iX(0L, 1, null).a((int)var3_5.q()) == 0 || var23_51 == 2 && (long)var17_29.length >= var3_5.q() || var23_51 == 3 && kR.a(var13_22, kL.k, null, true, 2, null) >= var3_5.q()) {
                                                                                                        var3_5.a(new iX(0L, 1, null));
                                                                                                    }
                                                                                                    var24_56 = 0;
                                                                                                    while (var24_56 < var20_38.A().size()) {
                                                                                                        var28_72 = var20_38.A().get(var24_56);
                                                                                                        var25_65 = (String)var28_72;
                                                                                                        if (((CharSequence)var25_65).length() == 0) {
                                                                                                            ++var24_56;
                                                                                                            continue;
                                                                                                        }
                                                                                                        if (ew.a((Object)var25_65, (Object)"duration:permanent") && (var20_38.F() || !var20_38.I() && var20_38.u().c() != a_.c)) {
                                                                                                            var20_38.b(-2L);
                                                                                                            var20_38.l(false);
                                                                                                            ++var24_56;
                                                                                                            continue;
                                                                                                        }
                                                                                                        var25_65 = x.b.a(var25_65, "\\-", (Object)"-");
                                                                                                        var28_73 = var24_56 == var20_38.A().size() - 1;
                                                                                                        var29_83 = cg_0.a(dk.d.a(), var25_65, "");
                                                                                                        var30_104 /* !! */  = this.a((cz)var20_38, var25_65);
                                                                                                        if (var30_104 /* !! */  == null) ** GOTO lbl214
                                                                                                        this.a((cz)var20_38, (c1)var30_104 /* !! */ );
                                                                                                        ** GOTO lbl304
lbl214:
                                                                                                        // 1 sources

                                                                                                        if (!var20_38.F() && var20_38.I() || var20_38.u().c() == a_.c || var20_38.w() != -1L || !Character.isDigit(var25_65.charAt(0)) || bz.c((CharSequence)var25_65, ':', false, 2, null) || bz.c((CharSequence)var25_65, '%', false, 2, null) || bz.c((CharSequence)var25_65, '*', false, 2, null) || !jj_0.a.c(var29_83) || jj_0.a(var25_65)) ** GOTO lbl296
                                                                                                        if (!(((CharSequence)var20_38.s()).length() == 0) || var25_65.length() <= 1) ** GOTO lbl251
                                                                                                        var31_122 = hd_0.a((CharSequence)var25_65);
                                                                                                        ew.a(var17_29);
                                                                                                        var34_155 /* !! */  = var17_29;
                                                                                                        ew.a(var31_122);
                                                                                                        var35_170 = var31_122;
                                                                                                        var37_183 = true;
                                                                                                        var38_208 = false;
                                                                                                        var39_234 = var34_155 /* !! */ ;
                                                                                                        var41_280 = ((Object)var39_234).length;
                                                                                                        for (var40_252 = 0; var40_252 < var41_280; ++var40_252) {
                                                                                                            var43_332 = var42_304 = var39_234[var40_252];
                                                                                                            var44_357 = false;
                                                                                                            if (!bz.a(var43_332.i(), (String)var35_170, var37_183)) continue;
                                                                                                            v4 = var42_304;
                                                                                                            ** GOTO lbl233
                                                                                                        }
                                                                                                        v4 = null;
lbl233:
                                                                                                        // 2 sources

                                                                                                        if ((var33_138 = v4) != null) {
                                                                                                            var34_155 /* !! */  = var33_138.i();
                                                                                                            var20_38.b((String)var34_155 /* !! */ );
                                                                                                            if (fB.d.a(var13_22.e(), var20_38.v())) {
                                                                                                                var13_22.d().a((eo_0)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, a(litebans.jv_0 litebans.ch ), (Llitebans/ch;)Llitebans/iV;)((jv_0)var33_138));
                                                                                                            }
                                                                                                            ++var24_56;
                                                                                                            continue;
                                                                                                        }
                                                                                                        var20_38.a(var13_22.c(var25_65));
                                                                                                        if (var20_38.t() != null) {
                                                                                                            var34_155 /* !! */  = var20_38.t();
                                                                                                            v5 = var34_155 /* !! */ ;
                                                                                                            if (v5 == null || (v5 = (var35_170 = v5.a())) == null) {
                                                                                                                v5 = "";
                                                                                                            }
                                                                                                            var20_38.b((String)v5);
                                                                                                            ++var24_56;
                                                                                                            continue;
                                                                                                        }
lbl251:
                                                                                                        // 3 sources

                                                                                                        if ((var31_122 = bz.b(var29_83)) == null) {
                                                                                                            if (((CharSequence)var20_38.s()).length() == 0) {
                                                                                                                var20_38.b(var25_65);
                                                                                                            }
                                                                                                            ++var24_56;
                                                                                                            continue;
                                                                                                        }
                                                                                                        var33_139 = cg_0.a(dk.d.b(), var25_65, "");
                                                                                                        var34_155 /* !! */  = dk.d.a(var33_139);
                                                                                                        if (var34_155 /* !! */  == null) {
                                                                                                            if (var28_73) {
                                                                                                                if (((CharSequence)var20_38.s()).length() == 0) {
                                                                                                                    var20_38.b(var25_65);
                                                                                                                } else {
                                                                                                                    this.b((cz)var20_38, var25_65);
                                                                                                                }
                                                                                                                ++var24_56;
                                                                                                                continue;
                                                                                                            }
                                                                                                            var37_184 /* !! */  = var20_38.A().get(++var24_56);
                                                                                                            var35_170 = (String)var37_184 /* !! */ ;
                                                                                                            var34_155 /* !! */  = dk.d.a((String)var35_170);
                                                                                                            if (var34_155 /* !! */  == null) {
                                                                                                                if (((CharSequence)var20_38.s()).length() == 0) {
                                                                                                                    var20_38.b(var25_65);
                                                                                                                    var37_184 /* !! */  = cg_0.a(dk.d.b(), (CharSequence)var35_170, "");
                                                                                                                    var38_209 = dk.d.a((String)var37_184 /* !! */ );
                                                                                                                    if (var38_209 == null) {
                                                                                                                        this.b((cz)var20_38, (String)var35_170);
                                                                                                                    } else {
                                                                                                                        var39_234 = bz.b(cg_0.a(dk.d.a(), (CharSequence)var35_170, ""));
                                                                                                                        if (var39_234 == null) {
                                                                                                                            this.b((cz)var20_38, (String)var35_170);
                                                                                                                        } else {
                                                                                                                            var20_38.a(var38_209.b(var39_234.doubleValue()));
                                                                                                                            var20_38.b(var20_38.J() + var20_38.o());
                                                                                                                            var20_38.a((CharSequence)(i1.a(var39_234.doubleValue()) + ' ' + var38_209.a(var39_234.doubleValue())));
                                                                                                                        }
                                                                                                                    }
                                                                                                                    v6 = iv_0.a;
                                                                                                                } else {
                                                                                                                    v6 = var20_38.n().append(var25_65).append(' ').append((String)var35_170).append(' ');
                                                                                                                }
                                                                                                                ++var24_56;
                                                                                                                continue;
                                                                                                            }
                                                                                                        }
                                                                                                        var20_38.a(var34_155 /* !! */ .b(var31_122.doubleValue()));
                                                                                                        var20_38.b(var20_38.J() + var20_38.o());
                                                                                                        var20_38.a((CharSequence)(i1.a(var31_122.doubleValue()) + ' ' + var34_155 /* !! */ .a(var31_122.doubleValue())));
                                                                                                        ** GOTO lbl304
lbl296:
                                                                                                        // 1 sources

                                                                                                        if (((CharSequence)var20_38.s()).length() == 0) {
                                                                                                            var20_38.b(var25_65);
                                                                                                        } else {
                                                                                                            this.b((cz)var20_38, var25_65);
                                                                                                            var31_122 = this;
                                                                                                            var33_140 = false;
                                                                                                            if (((o)var31_122.h().a(o.class)).j() == 0) {
                                                                                                                throw var15_24;
                                                                                                            }
                                                                                                        }
lbl304:
                                                                                                        // 5 sources

                                                                                                        ++var24_56;
                                                                                                    }
                                                                                                    if (var20_38.w() > 0L) {
                                                                                                        var20_38.l(true);
                                                                                                    }
                                                                                                    v3 = iv_0.a;
                                                                                                    break;
                                                                                                }
                                                                                                default: {
                                                                                                    v3 = iv_0.a;
                                                                                                }
                                                                                            }
                                                                                            var22_45 = var20_38;
                                                                                            var23_52 = this;
                                                                                            var24_57 = false;
                                                                                            var25_66 = cz.a((cz)var22_45, null, 1, null);
                                                                                            if (!var22_45.y()) ** GOTO lbl-1000
                                                                                            var28_74 = var23_52;
                                                                                            var29_84 = false;
                                                                                            var30_104 /* !! */  = var28_74;
                                                                                            var31_124 = false;
                                                                                            if (!((q_0)var30_104 /* !! */ .h().a(q_0.class)).f().u()) {
                                                                                                v7 = true;
                                                                                            } else lbl-1000:
                                                                                            // 2 sources

                                                                                            {
                                                                                                v7 = false;
                                                                                            }
                                                                                            var33_141 = v7;
                                                                                            switch (bb.a[var22_45.u().ordinal()]) {
                                                                                                case 4: 
                                                                                                case 5: {
                                                                                                    if (var22_45.l()) {
                                                                                                        var31_125 = new String[]{"litebans.temp" + var22_45.u(), "litebans + " + var22_45.u(), "litebans.ip" + var22_45.u()};
                                                                                                        v8 = var31_125;
                                                                                                    } else {
                                                                                                        var31_125 = new String[]{"litebans + " + var22_45.u(), "litebans.ip" + var22_45.u()};
                                                                                                        v8 = var30_104 /* !! */  = var31_125;
                                                                                                    }
                                                                                                    if (var33_141) {
                                                                                                        var31_125 = var23_52;
                                                                                                        var34_155 /* !! */  = "litebans.ip" + var22_45.u();
                                                                                                        var35_171 = false;
                                                                                                        var37_185 = var31_125.d();
                                                                                                        var38_208 = false;
                                                                                                        var39_234 = fg_0.a;
                                                                                                        var40_253 = var37_185;
                                                                                                        var41_280 = 0;
                                                                                                        var42_304 = var40_253;
                                                                                                        var43_333 = false;
                                                                                                        var40_252 = var42_304.e((String)var34_155 /* !! */ ) == false ? 1 : 0;
                                                                                                        var41_281 = am.cZ;
                                                                                                        var42_305 = false;
                                                                                                        var43_332 = var39_234;
                                                                                                        var44_357 = false;
                                                                                                        if (var40_252 != 0) {
                                                                                                            var45_376 = var43_332;
                                                                                                            var46_395 = false;
                                                                                                            var45_376.a(var41_281);
                                                                                                            throw new as();
                                                                                                        }
                                                                                                    }
                                                                                                    aa_0.a((fg_0)var23_52, Arrays.copyOf(var30_104 /* !! */ , var30_104 /* !! */ .length));
                                                                                                    v9 = iv_0.a;
                                                                                                    break;
                                                                                                }
                                                                                                case 6: {
                                                                                                    var30_104 /* !! */  = var23_52;
                                                                                                    var31_125 = "litebans + " + var22_45.u();
                                                                                                    var34_156 = false;
                                                                                                    var35_170 = var30_104 /* !! */ .d();
                                                                                                    var37_183 = false;
                                                                                                    var38_210 = fg_0.a;
                                                                                                    var39_234 = var35_170;
                                                                                                    var40_252 = 0;
                                                                                                    var41_282 = var39_234;
                                                                                                    var42_306 = false;
                                                                                                    var39_235 = var41_282.e((String)var31_125) == false;
                                                                                                    var40_254 = am.cZ;
                                                                                                    var41_283 = false;
                                                                                                    var42_307 = var38_210;
                                                                                                    var43_334 = false;
                                                                                                    if (var39_235) {
                                                                                                        var44_358 = var42_307;
                                                                                                        var45_377 = false;
                                                                                                        var44_358.a(var40_254);
                                                                                                        throw new as();
                                                                                                    }
                                                                                                    v9 = iv_0.a;
                                                                                                    break;
                                                                                                }
                                                                                                case 1: 
                                                                                                case 2: 
                                                                                                case 3: {
                                                                                                    var30_104 /* !! */  = var22_45.F() != false ? "litebans.modify" : "litebans + " + var22_45.u();
                                                                                                    var31_125 = new String[]{var30_104 /* !! */ , (String)var30_104 /* !! */  + ".own"};
                                                                                                    aa_0.a((fg_0)var23_52, (String[])var31_125);
                                                                                                    v9 = iv_0.a;
                                                                                                    break;
                                                                                                }
                                                                                                default: {
                                                                                                    x_0.a();
                                                                                                    throw new as();
                                                                                                }
                                                                                            }
                                                                                            if (!var22_45.I() && var25_66) {
                                                                                                var28_75 = var23_52;
                                                                                                var29_85 = "litebans.ip" + var22_45.u() + ".wildcard";
                                                                                                var30_105 = false;
                                                                                                var31_125 = var28_75.d();
                                                                                                var34_157 = false;
                                                                                                var35_170 = fg_0.a;
                                                                                                var37_186 = var31_125;
                                                                                                var38_211 = false;
                                                                                                var39_237 = var37_186;
                                                                                                var40_256 = false;
                                                                                                var37_187 = var39_237.e(var29_85) == false;
                                                                                                var38_212 = am.cZ;
                                                                                                var39_238 = false;
                                                                                                var40_257 = var35_170;
                                                                                                var41_284 = false;
                                                                                                if (var37_187) {
                                                                                                    var42_308 = var40_257;
                                                                                                    var43_335 = false;
                                                                                                    var42_308.a(var38_212);
                                                                                                    throw new as();
                                                                                                }
                                                                                            }
                                                                                            var20_38.a(aI.f);
                                                                                            if (((CharSequence)var20_38.s()).length() == 0) {
                                                                                                var22_45 = fk_0.j;
                                                                                                var23_52 = var20_38.u();
                                                                                                var24_57 = var20_38.I();
                                                                                                var25_66 = false;
                                                                                                var28_76 = am.cC;
                                                                                                var29_86 = false;
                                                                                                if (var24_57) {
                                                                                                    v10 = am.c(var23_52 + "_USAGE");
                                                                                                } else {
                                                                                                    switch (eY.a[var23_52.ordinal()]) {
                                                                                                        case 1: {
                                                                                                            if (var28_76 == am.aP) {
                                                                                                                v11 = am.a6;
                                                                                                                break;
                                                                                                            }
                                                                                                            v11 = am.cU;
                                                                                                            break;
                                                                                                        }
                                                                                                        case 2: {
                                                                                                            if (var28_76 == am.aP) {
                                                                                                                v11 = am.ah;
                                                                                                                break;
                                                                                                            }
                                                                                                            v11 = am.c2;
                                                                                                            break;
                                                                                                        }
                                                                                                        case 3: {
                                                                                                            v11 = am.b6;
                                                                                                            break;
                                                                                                        }
                                                                                                        default: {
                                                                                                            v11 = var28_76;
                                                                                                        }
                                                                                                    }
                                                                                                    v10 = v11;
                                                                                                }
                                                                                                var30_106 = v10;
                                                                                                var28_76 = fg_0.a;
                                                                                                var29_86 = var23_52 == a_.g;
                                                                                                var31_126 = false;
                                                                                                var33_142 = var28_76;
                                                                                                var34_158 = false;
                                                                                                if (var29_86) {
                                                                                                    var35_170 = var33_142;
                                                                                                    var37_188 = false;
                                                                                                    var35_170.a(var30_106);
                                                                                                    throw new as();
                                                                                                }
                                                                                                var29_87 = var22_45;
                                                                                                var31_127 = am.aP;
                                                                                                var33_143 = false;
                                                                                                if (var24_57) {
                                                                                                    v12 = am.c(var23_52 + "_USAGE");
                                                                                                } else {
                                                                                                    switch (eY.a[var23_52.ordinal()]) {
                                                                                                        case 1: {
                                                                                                            if (var31_127 == am.aP) {
                                                                                                                v13 = am.a6;
                                                                                                                break;
                                                                                                            }
                                                                                                            v13 = am.cU;
                                                                                                            break;
                                                                                                        }
                                                                                                        case 2: {
                                                                                                            if (var31_127 == am.aP) {
                                                                                                                v13 = am.ah;
                                                                                                                break;
                                                                                                            }
                                                                                                            v13 = am.c2;
                                                                                                            break;
                                                                                                        }
                                                                                                        case 3: {
                                                                                                            v13 = am.b6;
                                                                                                            break;
                                                                                                        }
                                                                                                        default: {
                                                                                                            v13 = var31_127;
                                                                                                        }
                                                                                                    }
                                                                                                    v12 = v13;
                                                                                                }
                                                                                                var28_76 = v12;
                                                                                                fg_0.a.a(h1.a(var30_106, var24_57 == false, (CharSequence)var28_76));
                                                                                                throw new as();
                                                                                            }
                                                                                            this.a((cz)var20_38);
                                                                                            var20_38.b(var20_38.a(this));
                                                                                            var22_45 = aa_0.b(this, var20_38.s());
                                                                                            v14 = var22_45;
                                                                                            v15 = v14 != null && (v14 = (var24_58 = v14.h())) != null ? h1.a((String)v14, 32) : (var23_52 = null);
                                                                                            if (eq_0.f.b(var18_31) || bz.a(var20_38.b(), var18_31, true)) break block272;
                                                                                            if (!eq_0.f.a(var18_31)) break block273;
                                                                                            v16 = var20_38.b();
                                                                                            var24_59 = var20_38.v();
                                                                                            v17 = var24_59;
                                                                                            if (v17 == null && (v17 = var23_52) == null) {
                                                                                                v17 = var13_22.d().u();
                                                                                            }
                                                                                            if (bz.a(v16, (String)v17, true)) break block272;
                                                                                        }
                                                                                        var24_60 = var1_1;
                                                                                        var25_67 = new String[]{"litebans.server + " + var20_38.b(), "litebans.server + " + var20_38.b() + '.' + var20_38.u().c()};
                                                                                        var28_77 = false;
                                                                                        var29_88 = var24_60;
                                                                                        var30_107 = Arrays.copyOf(var25_67, var25_67.length);
                                                                                        var31_128 = false;
                                                                                        var33_144 = var30_107;
                                                                                        var34_159 = false;
                                                                                        var37_189 = var33_144.length;
                                                                                        for (var35_172 = 0; var35_172 < var37_189; ++var35_172) {
                                                                                            var39_239 = var38_213 = var33_144[var35_172];
                                                                                            var40_258 = false;
                                                                                            if (!var29_88.e(var39_239)) continue;
                                                                                            v18 = true;
                                                                                            break block267;
                                                                                        }
                                                                                        v18 = false;
                                                                                    }
                                                                                    if (v18 == false) {
                                                                                        var20_38.d(eq_0.f.a(var18_31, var13_22.d().u(), var1_1));
                                                                                    }
                                                                                }
                                                                                var24_61 = eq_0.f.a(var13_22.d().u(), var20_38.b()) != false || var23_52 != null && eq_0.f.a((String)var23_52, var20_38.b()) != false;
                                                                                var25_68 /* !! */  = var3_5;
                                                                                var28_78 = false;
                                                                                if (var25_68 /* !! */ .g()) {
                                                                                    var32_136 = var25_68 /* !! */ ;
                                                                                    var29_89 = false;
                                                                                    var36_182 /* !! */  = var20_38.b();
                                                                                    var32_136.a((Object)var36_182 /* !! */ );
                                                                                }
                                                                                var25_68 /* !! */  = null;
                                                                                if (var22_45 == null) break block274;
                                                                                var28_79 = var3_5;
                                                                                var29_90 = var22_45.g();
                                                                                var30_108 = var22_45.i();
                                                                                var31_129 = false;
                                                                                var25_68 /* !! */  = new d9(var20_38.s(), var22_45.i(), var28_79.f().bh() != false ? var29_90 : var30_108, var22_45.a(), var22_45.b(), (jv_0)var22_45, null, 64, null);
                                                                                var20_38.a(new iA(var25_68 /* !! */ .d(), var25_68 /* !! */ .a(), var25_68 /* !! */ .c(), new Date(var20_38.J())));
                                                                                break block275;
                                                                            }
                                                                            var20_38.a(var13_22.c(var20_38.s()));
                                                                            var28_79 = var20_38.t();
                                                                            v19 = var28_79;
                                                                            if (!(v19 != null && (v19 = (var29_91 = v19.b())) != null ? !bz.a((CharSequence)v19, '#', false, 2, null) : false)) {
                                                                                var20_38.a((iA)null);
                                                                            }
                                                                            if (var20_38.t() != null) break block276;
                                                                            var28_79 = var20_38.s();
                                                                            var29_92 = false;
                                                                            if (!jj_0.a.i((String)var28_79)) break block277;
                                                                            var20_38.m(true);
                                                                            var28_79 = fg_0.a;
                                                                            var29_93 = var1_1;
                                                                            var30_109 /* !! */  = "litebans.ip" + var20_38.u().c();
                                                                            var31_130 = false;
                                                                            var33_145 = var29_93;
                                                                            var34_160 = false;
                                                                            var29_94 = var33_145.e(var30_109 /* !! */ ) == false;
                                                                            var30_109 /* !! */  = am.cZ;
                                                                            var31_130 = false;
                                                                            var33_145 = var28_79;
                                                                            var34_160 = false;
                                                                            if (var29_94) {
                                                                                var35_173 = var33_145;
                                                                                var37_190 = false;
                                                                                var35_173.a(var30_109 /* !! */ );
                                                                                throw new as();
                                                                            }
                                                                            var20_38.a(new iA("#offline#", "#offline#", var20_38.s(), new Date()));
                                                                            break block278;
                                                                        }
                                                                        if (!var20_38.I()) break block279;
                                                                        var28_79 = aa_0.d(this, var20_38.s());
                                                                        if (ew.a(var28_79, (Object)var20_38.s())) break block280;
                                                                        var29_95 = kR.a(var13_22, (String)var28_79, var20_38.u(), null, var20_38.C() == false, 4, null);
                                                                        if (var20_38.C()) break block281;
                                                                        v20 = var29_95;
                                                                        v21 = v20 != null ? var13_22.a(v20) : false;
                                                                        if (!v21) break block280;
                                                                    }
                                                                    v22 = var29_95;
                                                                    var20_38.a(var13_22.c(v22 != null ? v22.w() : null));
                                                                    v23 = var29_95;
                                                                    if (v23 == null || (v23 = (var30_110 = v23.m())) == null) {
                                                                        v23 = var20_38.b();
                                                                    }
                                                                    var20_38.d((String)v23);
                                                                    var20_38.a(var29_95);
                                                                }
                                                                if (var20_38.t() != null || !jj_0.a.d(var20_38.s())) break block279;
                                                                var29_96 = kR.a(var13_22, var20_38.s(), var20_38.u(), null, var20_38.C() == false, 4, null);
                                                                if (var20_38.C()) break block282;
                                                                v24 = var29_96;
                                                                v25 = v24 != null ? var13_22.a(v24) : false;
                                                                if (!v25) break block279;
                                                            }
                                                            v26 = var29_96;
                                                            var20_38.a(var13_22.c(v26 != null ? v26.w() : null));
                                                            v27 = var29_96;
                                                            if (v27 == null || (v27 = (var30_111 = v27.m())) == null) {
                                                                v27 = var20_38.b();
                                                            }
                                                            var20_38.d((String)v27);
                                                            var20_38.a(var29_96);
                                                        }
                                                        if (var20_38.t() == null) {
                                                            var29_97 = this;
                                                            var30_112 = var20_38.s();
                                                            var33_146 = var29_97;
                                                            var34_161 = false;
                                                            var31_131 = ((q_0)var33_146.h().a(q_0.class)).f().af();
                                                            var35_174 = false;
                                                            if (var31_131) {
                                                                if (jj_0.a(var30_112)) {
                                                                    v28 = bK.c.f(var30_112);
                                                                    if (v28 == null) {
                                                                        v29 = null;
                                                                    } else {
                                                                        var37_191 = v28;
                                                                        v29 = new iA(var37_191, var30_112, "#", new Date());
                                                                    }
                                                                } else {
                                                                    v30 = bK.c.a(var30_112);
                                                                    if (v30 == null) {
                                                                        v29 = null;
                                                                    } else {
                                                                        var37_192 = v30;
                                                                        var33_147 = false;
                                                                        v31 = var37_192.a();
                                                                        v29 = new iA(var37_192.d(), v31 != null ? v31.toString() : null, null, new Date());
                                                                    }
                                                                }
                                                            } else {
                                                                if (jj_0.a(var30_112)) {
                                                                    new iA(h1.a(var30_112, 16), var30_112, "#", new Date());
                                                                }
                                                                v29 = new iA(h1.a(var30_112, 16), h1.a(var30_112), "#", new Date());
                                                            }
                                                            v32 = var28_79 = v29;
                                                            if (v32 == null) {
                                                                var20_38.a(var13_22, (Object)am.aN.a("player", (Object)var20_38.s()));
                                                                throw new as();
                                                            }
                                                            var20_38.a((iA)v32);
                                                        }
                                                    }
                                                    v33 = var28_79 = var20_38.t();
                                                    if ((v33 != null ? v33.b() : null) != null) {
                                                        v34 = var20_38.t();
                                                        ew.a(v34);
                                                        v35 = v34.b();
                                                        ew.a((Object)v35);
                                                        if (!bz.a((CharSequence)v35, '#', false, 2, null)) {
                                                            v36 = var28_79 = var20_38.t();
                                                            if (!jj_0.a.b(v36 != null ? v36.a() : null) && fB.d.a(var13_22.e(), var20_38.v())) {
                                                                var13_22.d().a((eo_0)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, a(litebans.cz litebans.ch ), (Llitebans/ch;)Llitebans/iV;)((cz)var20_38));
                                                            }
                                                        }
                                                    }
                                                }
                                                v37 = var28_79 = var20_38.t();
                                                v38 = v37 != null ? v37.a() : null;
                                                v39 = var28_79 = var20_38.t();
                                                v40 = v39 != null ? v39.b() : null;
                                                v41 = var28_79 = var20_38.t();
                                                var25_68 /* !! */  = new d9(v38, null, null, v40, v41 != null ? v41.i() : null, null, var20_38.s(), 38, null);
                                                if (var25_68 /* !! */ .b()) {
                                                    var28_79 = var20_38.t();
                                                    v42 = var28_79;
                                                    v43 = v42 != null && (v42 = (var29_98 = v42.a())) != null ? bz.a((CharSequence)v42, '#', false, 2, null) : false;
                                                    if (v43) {
                                                        var28_79 = var25_68 /* !! */ ;
                                                        var29_99 = false;
                                                        if (var3_5.f().aa()) {
                                                            var3_5.a((Object)("Hiding IP address from broadcast: " + var28_79.c()));
                                                            var28_79.a(am.dk.toString());
                                                        } else {
                                                            var28_79.a(var28_79.c());
                                                        }
                                                        var28_79.b(var28_79.d());
                                                        var28_79 = var25_68 /* !! */ .c();
                                                        v44 = var28_79;
                                                        if (v44 == null) {
                                                            v44 = "";
                                                        }
                                                        var20_38.b((String)v44);
                                                    }
                                                }
                                            }
                                            var28_80 = cz.a((cz)var20_38, null, 1, null);
                                            var29_100 = fg_0.a;
                                            var30_113 = var28_80 != false && var1_1.f() == false && var3_5.f().am() >= 1 ? 1 : 0;
                                            var31_132 = am.b;
                                            var33_148 = false;
                                            var34_162 = var29_100;
                                            var35_175 = false;
                                            if (var30_113 != 0) {
                                                var37_193 = var34_162;
                                                var38_214 = false;
                                                var37_193.a(var31_132);
                                                throw new as();
                                            }
                                            var29_100 = fg_0.a;
                                            var30_113 = var20_38.y() != false && var3_5.f().am() >= 2 && var1_1.f() == false ? 1 : 0;
                                            var31_132 = am.b;
                                            var33_148 = false;
                                            var34_162 = var29_100;
                                            var35_175 = false;
                                            if (var30_113 != 0) {
                                                var37_194 = var34_162;
                                                var38_215 = false;
                                                var37_194.a(var31_132);
                                                throw new as();
                                            }
                                            var29_100 = var20_38.v();
                                            v45 = var29_100;
                                            if (v45 == null && (v45 = var23_52) == null) {
                                                v45 = var13_22.d().u();
                                            }
                                            var20_38.e((String)v45);
                                            var20_38.c(h1.a(var20_38.H(), 128));
                                            var20_38.a(h1.a(var20_38.d(), 36));
                                            var29_100 = this;
                                            var30_113 = var20_38.k();
                                            var31_132 = var20_38.H();
                                            var33_149 = var20_38.d();
                                            var34_163 = false;
                                            var35_176 = (fg_0)var29_100;
                                            var37_195 = false;
                                            ((w)var35_176.h().a(w.class)).a(new jf_0((boolean)var30_113, (String)var31_132, (fk_0)var29_100, (String)var33_149, var1_1));
                                            var20_38.a(aI.a);
                                            if (var20_38.E() && var25_68 /* !! */ .a() != null) {
                                                var29_100 = var20_38.g().b();
                                                if (var20_38.i() == null) {
                                                    var20_38.a(var13_22.a(var20_38.g(), var25_68 /* !! */ .a(), var25_68 /* !! */ .c()));
                                                    var20_38.a(var20_38.g().a(var20_38.D()));
                                                } else {
                                                    v46 = var20_38.i();
                                                    ew.a(v46);
                                                    var30_114 = v46;
                                                    var29_100 = var30_114.f();
                                                    var31_132 = var13_22.a(var25_68 /* !! */ .a(), var25_68 /* !! */ .c(), var30_114, var20_38.g());
                                                    var20_38.a((int)Math.floor(((Number)var31_132.e()).doubleValue()));
                                                    var20_38.a(var30_114.a(var20_38.D()));
                                                    var47_411 = ((Number)var31_132.b()).doubleValue();
                                                    if (var47_411 <= 0.0 || var20_38.D() != (int)Math.floor(var47_411)) {
                                                        var20_38.a(true);
                                                    }
                                                    var35_176 = i1.a(var47_411);
                                                    var37_196 = i1.a(((Number)var31_132.e()).doubleValue());
                                                    var38_216 = Math.min(var30_114.f().size(), var20_38.D() + 1);
                                                    var3_5.a((Object)("Applying " + var30_114.c() + " template group " + var30_114.a() + ": weight " + (String)var35_176 + " => " + var37_196 + " (" + var38_216 + '/' + var29_100.size() + ')'));
                                                }
                                                var30_113 = Math.min(var29_100.size(), var20_38.D() + 1);
                                                var3_5.a((Object)("Applying " + var20_38.g().d() + " template \"" + var20_38.g().g() + "\" at level " + var30_113 + '/' + var29_100.size()));
                                                var33_149 = var20_38.L();
                                                ew.b(var33_149, "");
                                                var31_132 = (cW)var33_149;
                                                var34_164 = var20_38.g().h();
                                                ew.b(var34_164, "");
                                                var33_149 = (cW)var34_164;
                                                var35_176 = var31_132.a();
                                                v47 = var35_176;
                                                if (v47 == null) {
                                                    v47 = var33_149.a();
                                                }
                                                if ((var34_164 = v47) != null) {
                                                    if (var34_164.longValue() > 0L) {
                                                        var20_38.b(var20_38.J() + var34_164.longValue());
                                                        var20_38.l(true);
                                                        var49_412 = var34_164.longValue();
                                                        var38_217 = false;
                                                        var20_38.a((CharSequence)db_0.a(dk.d, var49_412, false, 2, null));
                                                    } else {
                                                        var20_38.b(-1L);
                                                        var20_38.l(false);
                                                        var20_38.a(am.bT);
                                                    }
                                                }
                                                if (var20_38.g().j()) {
                                                    var20_38.m(true);
                                                }
                                                aa_0.a(this, var20_38.g(), var20_38.L());
                                                var20_38.a(var13_22);
                                            }
                                            var29_100 = fg_0.a;
                                            var30_113 = var20_38.l() != false && var20_38.I() == false && var20_38.w() <= 0L ? 1 : 0;
                                            var31_132 = am.aL;
                                            var33_150 = false;
                                            var34_165 = var29_100;
                                            var35_177 = false;
                                            if (var30_113 != 0) {
                                                var37_197 = var34_165;
                                                var38_218 = false;
                                                var37_197.a(var31_132);
                                                throw new as();
                                            }
                                            var29_100 = var20_38.c(var13_22);
                                            v48 = var25_68 /* !! */ .d();
                                            ew.a((Object)v48);
                                            v49 = var25_68 /* !! */ .a();
                                            ew.a((Object)v49);
                                            var20_38.a(var13_22, v48, v49);
                                            if (!var20_38.I()) break block283;
                                            var30_115 = new hv_0();
                                            var31_132 = null;
                                            var33_151 = var20_38.j();
                                            v50 = var33_151;
                                            if (v50 == null) {
                                                v50 = var13_22.a(var25_68 /* !! */ .a(), var25_68 /* !! */ .c(), var20_38.u(), var20_38.b(), true, true);
                                            }
                                            var20_38.b(v50);
                                            v51 = var34_165 = var20_38.q();
                                            var33_152 = ew.a((Object)(v51 != null ? v51.e() : null), (Object)var1_1.a());
                                            v52 = var34_165 = var33_152 != false ? ".own" : "";
                                            if (var20_38.q() != null && !var33_152 && var3_5.f().ac()) {
                                                var35_178 = fg_0.a;
                                                v53 = var37_198 = var20_38.q();
                                                var37_199 = var20_38.a(var13_22, v53 != null ? v53.e() : null) == false;
                                                var38_219 = am.cZ;
                                                var39_240 = false;
                                                var40_259 = var35_178;
                                                var41_285 = false;
                                                if (var37_199) {
                                                    var42_309 = var40_259;
                                                    var43_336 = false;
                                                    var42_309.a(var38_219);
                                                    throw new as();
                                                }
                                            }
                                            var35_179 = var20_38.q();
                                            var37_200 = 0;
                                            v54 = var35_179;
                                            if (!((v54 != null ? v54.w() : null) != null)) break block284;
                                            var35_179 = var20_38.q();
                                            var37_200 = 0;
                                            if (!(var35_179 != null && var35_179.r() != -1)) break block284;
                                            v55 = var3_5.s();
                                            v56 = var20_38.q();
                                            ew.a(v56);
                                            var35_179 = v55.a(v56);
                                            if (var35_179 == null) break block284;
                                            var38_220 = var20_38.q();
                                            v57 = var38_220;
                                            var38_220 = var20_38.q();
                                            v58 = var38_220;
                                            var37_200 = var13_22.a((c1)var35_179, v57 != null ? v57.w() : null, v58 != null ? v58.p() : null);
                                            var38_220 = var35_179.a(var37_200);
                                            var40_260 = var38_220.c();
                                            v59 = var40_260;
                                            if (v59 == null) {
                                                v59 = var35_179.h().c();
                                            }
                                            var39_241 = v59;
                                            var40_260 = fg_0.a;
                                            if (var39_241 == null) ** GOTO lbl-1000
                                            var41_286 = var1_1;
                                            var42_310 = false;
                                            var43_337 = var41_286;
                                            var44_357 = false;
                                            if (var43_337.e(var39_241) == false) {
                                                v60 = true;
                                            } else lbl-1000:
                                            // 2 sources

                                            {
                                                v60 = false;
                                            }
                                            var41_287 = v60;
                                            var42_311 = am.cZ;
                                            var43_338 = false;
                                            var44_359 = var40_260;
                                            var45_378 = false;
                                            if (var41_287) {
                                                var46_396 = var44_359;
                                                var51_413 = false;
                                                var46_396.a(var42_311);
                                                throw new as();
                                            }
                                        }
                                        var35_179 = var3_5;
                                        var37_200 = 0;
                                        if (var35_179.g()) {
                                            var32_136 = var35_179;
                                            var38_221 = false;
                                            v61 = var20_38.q();
                                            var36_182 /* !! */  = "[0xff] " + (v61 != null ? v61.e() : null) + ' ' + var1_1.a() + " (x=" + var33_152 + ')';
                                            var32_136.a((Object)var36_182 /* !! */ );
                                        }
                                        if (var20_38.F()) {
                                            var37_201 = var20_38.q();
                                            v62 = var37_201;
                                            if (v62 == null) {
                                                var20_38.a(var13_22, (Object)am.cJ);
                                                throw new as();
                                            }
                                            var35_179 = v62;
                                            var37_201 = this;
                                            var38_222 = "litebans.modify" + (String)var34_165;
                                            var39_242 = false;
                                            var40_261 = var37_201.d();
                                            var41_288 = false;
                                            var42_312 = fg_0.a;
                                            var43_339 = var40_261;
                                            var44_360 = false;
                                            var45_379 = var43_339;
                                            var46_397 = false;
                                            var43_340 = var45_379.e((String)var38_222) == false;
                                            var44_361 = am.cZ;
                                            var45_380 = false;
                                            var46_398 = var42_312;
                                            var51_414 = false;
                                            if (var43_340) {
                                                var52_424 = var46_398;
                                                var53_433 = false;
                                                var52_424.a(var44_361);
                                                throw new as();
                                            }
                                            var38_222 = var20_38.u();
                                            var39_242 = false;
                                            switch (ht_0.a[var38_222.c().ordinal()]) {
                                                case 1: {
                                                    v63 = am.df;
                                                    break;
                                                }
                                                case 2: {
                                                    v63 = am.R;
                                                    break;
                                                }
                                                case 3: {
                                                    v63 = am.cu;
                                                    break;
                                                }
                                                default: {
                                                    v63 = null;
                                                }
                                            }
                                            var37_201 = ew.a(var29_100, v63) != false ? var35_179.b() : var29_100;
                                            var54_440 = var20_38.w() == -1L ? var35_179.l() : var20_38.w();
                                            var20_38.b(var13_22);
                                            var13_22.a((CharSequence)var37_201, var54_440, (dZ)var35_179);
                                            var40_261 = new dy_0();
                                            var41_289 = var35_179;
                                            var42_313 = false;
                                            var40_261.a = new dZ(var41_289.u(), var41_289.w(), var41_289.p(), (CharSequence)var37_201, var41_289.e(), var41_289.x(), var41_289.m(), var41_289.j(), var41_289.o(), var54_440, var41_289.r(), var41_289.d(), var41_289.h(), var41_289.t(), var41_289.a(), null);
                                            var20_38.a(var13_22, kR.a(var13_22, (CharSequence)am.cj, (dZ)var40_261.a, false, 2, null));
                                        } else if (var20_38.C()) {
                                            var37_202 = var20_38.q();
                                            v64 = var37_202;
                                            if (v64 == null) {
                                                var20_38.a(var13_22, (Object)am.cJ);
                                                throw new as();
                                            }
                                            var35_179 = v64;
                                            var37_202 = this;
                                            var38_223 = "litebans.delete" + (String)var34_165;
                                            var39_243 = false;
                                            var40_262 = var37_202.d();
                                            var41_290 = false;
                                            var42_314 = fg_0.a;
                                            var43_341 = var40_262;
                                            var44_362 = false;
                                            var45_381 = var43_341;
                                            var46_399 = false;
                                            var43_342 = var45_381.e(var38_223) == false;
                                            var44_363 = am.cZ;
                                            var45_382 = false;
                                            var46_400 = var42_314;
                                            var51_415 = false;
                                            if (var43_342) {
                                                var52_425 = var46_400;
                                                var53_434 = false;
                                                var52_425.a(var44_363);
                                                throw new as();
                                            }
                                            var20_38.b(var13_22);
                                            kR.a(var13_22, (dZ)var35_179, null, null, null, true, 14, null);
                                            var20_38.a(var13_22, am.af);
                                        } else {
                                            var35_179 = this;
                                            var37_203 = "litebans + " + var20_38.u() + (String)var34_165;
                                            var38_224 = false;
                                            var39_244 = var35_179.d();
                                            var40_263 = false;
                                            var41_291 = fg_0.a;
                                            var42_315 = var39_244;
                                            var43_343 = false;
                                            var44_364 = var42_315;
                                            var45_378 = false;
                                            var42_316 = var44_364.e((String)var37_203) == false;
                                            var43_344 = am.cZ;
                                            var44_365 = false;
                                            var45_383 = var41_291;
                                            var46_401 = false;
                                            if (var42_316) {
                                                var51_416 = var45_383;
                                                var52_426 = false;
                                                var51_416.a(var43_344);
                                                throw new as();
                                            }
                                            if (var20_38.j() == null && var16_26.K() && var20_38.u() != a_.e && ((Collection)(var35_179 = var13_22.a(var25_68 /* !! */ .g(), 1024))).isEmpty() == false) {
                                                var37_203 = new HashSet<E>();
                                                var38_225 = var35_179.iterator();
                                                while (var38_225.hasNext()) {
                                                    var39_244 = (iA)var38_225.next();
                                                    var40_264 = var39_244.c();
                                                    var42_317 = kR.a(var13_22, var40_264, (String)(var41_291 = var39_244.d()), var20_38.u(), var20_38.b(), false, true, 16, null);
                                                    if (var42_317 == null || ll.a((Iterable)var37_203, (Object)var40_264) || var42_317.h()) continue;
                                                    var43_344 = var3_5;
                                                    var44_365 = false;
                                                    if (var43_344.g()) {
                                                        var32_136 = var43_344;
                                                        var45_384 = false;
                                                        var36_182 /* !! */  = var42_317;
                                                        var32_136.a((Object)var36_182 /* !! */ );
                                                    }
                                                    var31_132 = var42_317;
                                                    var30_115.a = true;
                                                    kR.a(var13_22, var20_38.d(), var20_38.H(), (CharSequence)var29_100, var42_317, false, 16, null);
                                                    aa_0.a(var13_22, var42_317, true, var24_61);
                                                    v65 = var40_264;
                                                    ew.a((Object)v65);
                                                    var37_203.add(v65);
                                                }
                                            }
                                            var37_203 = var35_179 = var20_38;
                                            var38_226 = false;
                                            if (var37_203.q() == null) {
                                                if (!var30_115.a) {
                                                    var39_244 = var3_5;
                                                    var40_265 = 1;
                                                    var41_292 = false;
                                                    if (var39_244.a(var40_265)) {
                                                        var42_318 = var39_244;
                                                        var43_345 = false;
                                                        var44_366 = "No active " + var37_203.u().c() + " found for uuid:" + var25_68 /* !! */ .a() + " / ip:" + var25_68 /* !! */ .c() + " on server:" + var37_203.b() + " (target: '" + var25_68 /* !! */ .d() + "')";
                                                        var45_385 = ew.a((Object)var37_203.s(), (Object)var25_68 /* !! */ .a()) == false;
                                                        var46_401 = false;
                                                        if (var45_385) {
                                                            var51_417 = false;
                                                            var52_427 = "Try targeting by UUID instead of name + ";
                                                            var53_435 = false;
                                                            if (var52_427.length() > 0 != false) {
                                                                var53_436 = var44_366;
                                                                var56_441 = "\n";
                                                                var57_448 = false;
                                                                var53_436 = "" + var53_436 + var56_441;
                                                                var56_442 = false;
                                                                v66 = "" + var53_436 + var52_427;
                                                            } else {
                                                                v66 = var44_366;
                                                            }
                                                        } else {
                                                            v66 = var44_366;
                                                        }
                                                        var42_318.a(v66);
                                                    }
                                                    var40_266 = var37_203.u();
                                                    var41_292 = false;
                                                    switch (ht_0.a[var40_266.c().ordinal()]) {
                                                        case 1: {
                                                            v67 = am.cJ;
                                                            break;
                                                        }
                                                        case 2: {
                                                            v67 = am.di;
                                                            break;
                                                        }
                                                        case 3: {
                                                            v67 = am.a5;
                                                            break;
                                                        }
                                                        default: {
                                                            x_0.a();
                                                            throw new as();
                                                        }
                                                    }
                                                    var39_244 = v67;
                                                    if (var37_203.u() == a_.d && !var25_68 /* !! */ .b() && var24_61 && !jj_0.a(var25_68 /* !! */ .g())) {
                                                        var40_266 = var1_1;
                                                        var41_293 = "litebans.unban.queue";
                                                        var43_346 = false;
                                                        if (var40_266.e(var41_293) && !var37_203.K()) {
                                                            this.a((d9)var25_68 /* !! */ );
                                                            var39_244 = am.aJ;
                                                        }
                                                    }
                                                    var37_203.a(var13_22, var39_244);
                                                    throw new as();
                                                }
                                            } else {
                                                var39_244 = var3_5;
                                                var40_267 = false;
                                                if (var39_244.g()) {
                                                    var42_319 = var39_244;
                                                    var41_294 = false;
                                                    var42_319.a(var37_203.q());
                                                }
                                                if (var37_203.u() == a_.e && var37_203.j() == null) {
                                                    v68 = var37_203.q();
                                                    ew.a(v68);
                                                    kR.a(var13_22, v68, var37_203.d(), var37_203.H(), (CharSequence)var29_100, false, 16, null);
                                                } else {
                                                    v69 = var37_203.d();
                                                    v70 = var37_203.H();
                                                    v71 = var37_203.q();
                                                    ew.a(v71);
                                                    var13_22.a(v69, v70, (CharSequence)var29_100, v71, var37_203.j() != null);
                                                }
                                                if (var37_203.u() == a_.e) {
                                                    var37_203.a(var13_22, var13_22.a((CharSequence)am.c8, (jv_0)var22_45));
                                                }
                                                var39_244 = var13_22;
                                                var40_268 = ij.l.a(var37_203.u());
                                                var41_295 = false;
                                                if (var39_244.d().s()) {
                                                    var58_456 = var40_268;
                                                    var42_320 = var39_244;
                                                    var43_347 = false;
                                                    var44_367 = u.j;
                                                    v72 = var37_203.q();
                                                    ew.a(v72);
                                                    var45_386 = v72;
                                                    var46_401 = false;
                                                    var51_418 = var25_68 /* !! */ ;
                                                    var52_428 = false;
                                                    var53_437 = u.j;
                                                    var56_443 = new CharSequence[2];
                                                    v73 = var51_418.a();
                                                    if (v73 == null) {
                                                        v73 = "";
                                                    }
                                                    var56_443[0] = bK.c.d(v73);
                                                    var56_443[1] = var45_386.h() != false ? String.valueOf(var51_418.c()) : "";
                                                    var57_449 = false;
                                                    var59_459 = lo_0.a(var56_443, (CharSequence)"\ufeff", null, null, 0, null, null, 62, null);
                                                    aa_0.a((ch)var42_320, var58_456, var59_459, null, null, 12, null);
                                                }
                                                v74 = var13_22.e();
                                                v75 = var37_203.q();
                                                ew.a(v75);
                                                hq.a.b(var13_22, v74, v75);
                                            }
                                            if (var20_38.q() == null) {
                                                var20_38.b((dZ)var31_132);
                                            }
                                            if (var20_38.q() != null) {
                                                var37_203 = var20_38.u();
                                                var38_226 = false;
                                                switch (ht_0.a[var37_203.c().ordinal()]) {
                                                    case 1: {
                                                        v76 = am.cO;
                                                        break;
                                                    }
                                                    case 2: {
                                                        v76 = am.a2;
                                                        break;
                                                    }
                                                    case 3: {
                                                        v76 = am.ad;
                                                        break;
                                                    }
                                                    default: {
                                                        x_0.a();
                                                        throw new as();
                                                    }
                                                }
                                                var35_179 = v76;
                                                var35_179 = kR.a(var13_22, (CharSequence)var35_179, var20_38.H(), var20_38.d(), false, 4, null);
                                                var35_179 = var13_22.a((CharSequence)var35_179, (d9)var25_68 /* !! */ );
                                                new g1((cz)var20_38, (jv_0)var22_45, var20_38.t(), (CharSequence)var35_179, var13_22.e(), null, false, var20_38.B(), 32, null).run();
                                                if (var20_38.u() == a_.n) {
                                                    if (var24_61) {
                                                        var37_203 = this;
                                                        var38_226 = false;
                                                        ((p)var37_203.h().a(p.class)).a(var20_38.q());
                                                    }
                                                    var37_203 = var13_22;
                                                    var38_227 = ij.s;
                                                    var39_245 = false;
                                                    if (var37_203.d().s()) {
                                                        var36_182 /* !! */  = var38_227;
                                                        var32_136 = var37_203;
                                                        var40_269 = false;
                                                        var41_296 = u.j;
                                                        v77 = var20_38.q();
                                                        ew.a(v77);
                                                        var42_321 = v77;
                                                        var43_348 = false;
                                                        var44_368 = var25_68 /* !! */ ;
                                                        var45_387 = false;
                                                        var46_402 = u.j;
                                                        var51_418 = new CharSequence[2];
                                                        v78 = var44_368.a();
                                                        if (v78 == null) {
                                                            v78 = "";
                                                        }
                                                        var51_418[0] = bK.c.d(v78);
                                                        var51_418[1] = var42_321.h() != false ? String.valueOf(var44_368.c()) : "";
                                                        var52_428 = false;
                                                        var60_462 = lo_0.a(var51_418, (CharSequence)"\ufeff", null, null, 0, null, null, 62, null);
                                                        aa_0.a((ch)var32_136, (ij)var36_182 /* !! */ , var60_462, null, null, 12, null);
                                                    }
                                                }
                                                var37_203 = this;
                                                var38_228 = false;
                                                v79 = ((o)var37_203.h().a(o.class)).a(var20_38.q());
                                            } else {
                                                q_0.a(var3_5, null, 0, 2, null);
                                                v79 = iv_0.a;
                                            }
                                        }
                                        break block268;
                                    }
                                    if (var20_38.u() == a_.c) {
                                        var30_116 = var20_38.g();
                                        var31_133 = false;
                                        var33_153 = var30_116;
                                        var34_166 = false;
                                        if (ew.a(var33_153.f() & 255, -1 & 255) < 0 == false) {
                                            var30_116 = dk.d;
                                            var61_465 = var20_38.J();
                                            var34_167 = var16_26.ar();
                                            var35_177 = false;
                                            var63_466 = db_0.a((db_0)var30_116, var34_167, 0.0, 2, null);
                                            var20_38.b((long)(var63_466 < 1.0 ? -1.0 : (double)var61_465 + var63_466));
                                        }
                                    }
                                    var20_38.b(var13_22);
                                    var20_38.b(Math.max(var20_38.w(), 0L));
                                    var30_117 = new dZ(var19_34, (d9)var25_68 /* !! */ , (CharSequence)var29_100);
                                    var19_34.b(var30_117);
                                    var20_38.a(aI.i);
                                    var20_38.a(var13_22, var1_1, var30_117, var20_38.t());
                                    var31_134 = this;
                                    var33_154 = var13_22;
                                    var34_168 /* !! */  = var25_68 /* !! */ .f();
                                    var35_177 = var20_38.x();
                                    var37_204 = var20_38.t();
                                    var38_229 = false;
                                    var39_246 = var30_117;
                                    var40_270 = false;
                                    switch (b7.a[var39_246.u().ordinal()]) {
                                        case 1: 
                                        case 2: {
                                            var41_297 = kR.a((ch)var33_154, var39_246.w(), var39_246.p(), var39_246.u(), var39_246.m(), false, false, 48, null);
                                            if (var41_297 == null || eq_0.f.b(var41_297.m()) && !eq_0.f.b(var39_246.m()) || var41_297.h() && !var39_246.h() || var41_297.h() && var39_246.h() && (!ew.a((Object)var39_246.w(), (Object)var41_297.w()) || !ew.a((Object)var39_246.p(), (Object)var41_297.p()))) ** GOTO lbl1262
                                            var42_322 = var31_134.d();
                                            var43_349 = "litebans.override";
                                            var44_357 = false;
                                            var45_388 = var42_322;
                                            var46_403 = false;
                                            if (var45_388.e((String)var43_349) == false) {
                                                var42_322 = kR.a((ch)var33_154, kR.a((ch)var33_154, (CharSequence)(var39_246.u() == a_.h ? am.b3 : am.aR), var41_297, false, 2, null), var37_204, false, 2, null);
                                                fg_0.a.a(var42_322);
                                                throw new as();
                                            }
                                            if (!var35_177) ** GOTO lbl1249
                                            var43_349 = (fg_0)var31_134;
                                            var44_357 = false;
                                            var45_388 = var43_349;
                                            var46_403 = false;
                                            if (!((q_0)var45_388.h().a(q_0.class)).f().ax()) ** GOTO lbl-1000
                                            var43_349 = var41_297;
                                            var44_357 = false;
                                            if (var43_349.y() == false && (var39_246.y() || var39_246.n() > var41_297.n())) {
                                                v80 = true;
                                            } else lbl-1000:
                                            // 2 sources

                                            {
                                                v80 = false;
                                            }
                                            var42_323 = v80;
                                            var43_349 = fg_0.a;
                                            var44_369 = kR.a((ch)var33_154, (CharSequence)(var39_246.u() == a_.h ? am.ai : am.a8), var37_204, false, 2, null);
                                            var45_389 = false;
                                            var46_404 = var43_349;
                                            var51_419 = var42_323 == false;
                                            var52_429 = false;
                                            if (var51_419) {
                                                var53_438 = var46_404;
                                                var56_444 = false;
                                                var53_438.a(var44_369);
                                                throw new as();
                                            }
lbl1249:
                                            // 3 sources

                                            kR.a((ch)var33_154, var19_34.d(), var19_34.H(), var39_246.b(), var41_297, false, 16, null);
                                            v81 = kR.a((ch)var33_154, (CharSequence)(var39_246.u() == a_.h ? am.dB : am.u), var41_297, false, 2, null);
                                            var43_349 = new CharSequence[4];
                                            var43_349[0] = "bannedPlayer";
                                            ew.a(var34_168 /* !! */ );
                                            var43_349[2] = "mutedPlayer";
                                            var43_349[3] = var34_168 /* !! */ ;
                                            var42_324 = kR.a((ch)var33_154, (CharSequence)h1.a(v81, var43_349), var37_204, false, 2, null);
                                            if (bz.c(var42_324, '#', false, 2, null)) {
                                                var42_324 = x.b.a(var42_324, "#offline#", (Object)var39_246.p());
                                            }
                                            fo_0.a(fg_0.a, var31_134.d(), var42_324, null, 4, null);
                                            aa_0.a((ch)var33_154, var41_297, true, var24_61);
lbl1262:
                                            // 2 sources

                                            v82 = iv_0.a;
                                            break;
                                        }
                                        default: {
                                            v82 = iv_0.a;
                                        }
                                    }
                                    if (var20_38.u() == a_.c && var22_45 != null && var24_61) {
                                        var30_117.a(true);
                                    }
                                    aa_0.a(var13_22, var30_117, false, false, 6, null);
                                    var20_38.a(var13_22, (jv_0)var22_45, (d9)var25_68 /* !! */ , var24_61);
                                    this.a((cz)var20_38, (d9)var25_68 /* !! */ );
                                    var20_38.a(aI.c);
                                    try {
                                        var31_134 = this;
                                        var33_154 = var13_22;
                                        var34_169 = false;
                                        var35_180 = var20_38;
                                        var37_205 = false;
                                        var31_134.a((ch)var33_154, var30_117, (cz)var35_180);
                                        if (!var35_180.p()) {
                                            var38_230 = var35_180.u();
                                            var39_247 = false;
                                            switch (ht_0.a[var38_230.c().ordinal()]) {
                                                case 1: {
                                                    v83 = am.D;
                                                    break;
                                                }
                                                case 2: {
                                                    v83 = am.dA;
                                                    break;
                                                }
                                                case 3: {
                                                    v83 = am.as;
                                                    break;
                                                }
                                                case 4: {
                                                    v83 = am.cs;
                                                    break;
                                                }
                                                default: {
                                                    x_0.a();
                                                    throw new as();
                                                }
                                            }
                                            var35_180.a((ch)var33_154, (CharSequence)bF.a(v83, (CharSequence)"tempDuration", var35_180.h()));
                                            switch (b7.a[var30_117.u().ordinal()]) {
                                                case 1: {
                                                    aa_0.a((ch)var33_154, var30_117, var35_180.D());
                                                    v84 = iv_0.a;
                                                    break;
                                                }
                                                case 2: {
                                                    var40_271 = var31_134;
                                                    var41_298 = var33_154;
                                                    var42_325 = false;
                                                    var43_350 = var41_298.e().q();
                                                    ew.a(var43_350);
                                                    if (!(var43_350.length == 0)) {
                                                        var44_370 = var43_350;
                                                        var45_390 = false;
                                                        var46_406 = var44_370;
                                                        var51_420 /* !! */  = new ArrayList<E>();
                                                        var52_429 = false;
                                                        var56_445 = ((jv_0[])var46_406).length;
                                                        for (var53_439 = 0; var53_439 < var56_445; ++var53_439) {
                                                            var58_457 = var57_450 = var46_406[var53_439];
                                                            var59_460 = false;
                                                            ew.a(var58_457);
                                                            if (!var41_298.a(var30_117, var58_457)) continue;
                                                            var51_420 /* !! */ .add(var57_450);
                                                        }
                                                        var44_370 = (List)var51_420 /* !! */ ;
                                                        var45_390 = false;
                                                        var46_406 = var44_370.iterator();
                                                        while (var46_406.hasNext()) {
                                                            var51_420 /* !! */  = var46_406.next();
                                                            var52_430 = (jv_0)var51_420 /* !! */ ;
                                                            var53_439 = 0;
                                                            var56_446 = (fg_0)var40_271;
                                                            var57_452 = false;
                                                            ((p)var56_446.h().a(p.class)).a(var52_430.a(), var30_117);
                                                        }
                                                    }
                                                    v84 = iv_0.a;
                                                    break;
                                                }
                                                case 3: {
                                                    var40_272 = var31_134;
                                                    var41_299 = var33_154;
                                                    var42_326 = false;
                                                    var43_351 = var30_117;
                                                    var44_371 = false;
                                                    var45_391 = (fg_0)var40_272;
                                                    var46_407 = false;
                                                    var51_422 = var45_391;
                                                    var52_429 = false;
                                                    if (!(((q_0)var51_422.h().a(q_0.class)).f().A().length == 0)) {
                                                        var45_391 = (v)var41_299.e().a(v.class);
                                                        if (var43_351.w() == null) {
                                                            var46_408 = (fg_0)var40_272;
                                                            var51_423 = false;
                                                            q_0.a((q_0)var46_408.h().a(q_0.class), (Object)"null", 0, 2, null);
                                                        } else {
                                                            var46_409 = var41_299.a(var43_351, 512);
                                                            var51_422 = var41_299.c(var43_351.w());
                                                            if (var51_422 == null) {
                                                                var52_431 = (fg_0)var40_272;
                                                                var53_439 = 0;
                                                                q_0.a((q_0)var52_431.h().a(q_0.class), (Object)"null", 0, 2, null);
                                                            } else {
                                                                var52_432 = var51_422.a();
                                                                var53_439 = var46_409.size();
                                                                var56_447 = (fg_0)var40_272;
                                                                var57_453 = 0;
                                                                var56_447 = (q_0)var56_447.h().a(q_0.class);
                                                                var57_453 = 10;
                                                                var58_458 = 0;
                                                                if (var56_447.a(var57_453)) {
                                                                    var59_461 = var56_447;
                                                                    var65_467 = false;
                                                                    var59_461.a((Object)("Active warnings: " + var53_439));
                                                                }
                                                                var57_454 = (fg_0)var40_272;
                                                                var58_458 = 0;
                                                                var65_468 = var57_454;
                                                                var66_469 = false;
                                                                for (Object var65_468 : ((q_0)var65_468.h().a(q_0.class)).f().A()) {
                                                                    if (bz.b((CharSequence)var65_468)) continue;
                                                                    var67_472 /* !! */  = new char[]{':'};
                                                                    var67_472 /* !! */  = (char[])bz.a((CharSequence)var65_468, var67_472 /* !! */ , false, 2, 2, null);
                                                                    var68_473 = 0;
                                                                    var69_474 = var67_472 /* !! */ ;
                                                                    var66_470 = var69_474.toArray(new String[0]);
                                                                    var67_471 = false;
                                                                    if (bz.b((CharSequence)var66_470[0], '+', false, 2, null)) {
                                                                        var67_471 = true;
                                                                        var66_470[0] = var66_470[0].substring(0, var66_470[0].length() - 1);
                                                                    }
                                                                    if (!bz.c((CharSequence)var65_468, ':', false, 2, null) || !jj_0.a.d(var66_470[0])) {
                                                                        var41_299.e().getLogger().warning("Warning action is invalid (bad format): '" + (String)var65_468 + "'. Ignored + ");
                                                                        continue;
                                                                    }
                                                                    var68_473 = Integer.parseInt(var66_470[0]);
                                                                    if (var68_473 < 1 && !var67_471) {
                                                                        var41_299.e().getLogger().warning("Warning action is invalid (threshold " + var68_473 + " < 1): '" + (String)var65_468 + "'. Ignored + ");
                                                                        continue;
                                                                    }
                                                                    if (var53_439 != var68_473 && (!var67_471 || var53_439 <= var68_473)) continue;
                                                                    var69_474 = new dy_0();
                                                                    var69_474.a = var66_470[1];
                                                                    if (bz.a((CharSequence)var69_474.a, '/', false, 2, null)) {
                                                                        var70_475 = (CharSequence)var69_474.a;
                                                                        var71_477 = 1;
                                                                        var72_479 = var70_475.length();
                                                                        var69_474.a = var70_475.subSequence(var71_477, var72_479).toString();
                                                                    }
                                                                    if (bF.b((CharSequence)var69_474.a, "list")) {
                                                                        var70_475 = new StringBuilder();
                                                                        var71_478 = var46_409;
                                                                        var72_479 = 0;
                                                                        for (T var74_481 : var71_478) {
                                                                            var75_484 = (dZ)var74_481;
                                                                            var76_485 = false;
                                                                            var70_475.append('\n').append(kR.a((ch)var41_299, (CharSequence)am.bC, var75_484, false, 2, null));
                                                                        }
                                                                        var69_474.a = bF.a((CharSequence)var69_474.a, (CharSequence)"list", var70_475);
                                                                    }
                                                                    var69_474.a = kR.a((ch)var41_299, (CharSequence)bF.a(kR.a((ch)var41_299, (CharSequence)var69_474.a, var43_351, false, 2, null), (CharSequence)"player", (Object)var52_432), (iA)var51_422, false, 2, null);
                                                                    var70_475 = (fg_0)var40_272;
                                                                    var71_477 = 0;
                                                                    ((q_0)var70_475.h().a(q_0.class)).a(10, var69_474.a);
                                                                    var71_476 = (fg_0)var40_272;
                                                                    var72_479 = 0;
                                                                    var73_480 = var71_476;
                                                                    var74_482 = false;
                                                                    v85 = var70_475 = ((q_0)var73_480.h().a(q_0.class)).f().a0() != false ? var41_299.e().y() : var40_272.d();
                                                                    ew.a(v85);
                                                                    var45_391.b((byte)3, v85.a());
                                                                    var41_299.e().c(new cb_0((jv_0)var70_475, (dy_0)var69_474));
                                                                    var71_476 = (fg_0)var40_272;
                                                                    var72_479 = 0;
                                                                    var73_480 = var71_476;
                                                                    var74_482 = false;
                                                                    if (!((q_0)var73_480.h().a(q_0.class)).f().a1()) continue;
                                                                    var71_476 = (fg_0)var40_272;
                                                                    var72_479 = 0;
                                                                    var73_480 = var71_476;
                                                                    var74_482 = false;
                                                                    if (var65_468 != lo_0.c(((q_0)var73_480.h().a(q_0.class)).f().A())) continue;
                                                                    var71_476 = var46_409;
                                                                    var72_479 = 0;
                                                                    var73_480 = var71_476.iterator();
                                                                    while (var73_480.hasNext()) {
                                                                        var74_483 = var73_480.next();
                                                                        var75_484 = (dZ)var74_483;
                                                                        var76_485 = false;
                                                                        kR.a((ch)var41_299, var75_484, var43_351.e(), var43_351.x(), null, false, 24, null);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    v84 = iv_0.a;
                                                    break;
                                                }
                                                case 4: {
                                                    x_0.a();
                                                    throw new as();
                                                }
                                                default: {
                                                    x_0.a();
                                                    throw new as();
                                                }
                                            }
                                            var38_230 = (fg_0)var31_134;
                                            var39_247 = false;
                                            var39_246 = (o)var38_230.h().a(o.class);
                                            var40_270 = false;
                                            var39_246.a((ch)var33_154, (cz)var20_38);
                                        }
                                        if (!var35_180.p()) {
                                            var38_231 = (fg_0)var31_134;
                                            var39_248 = false;
                                            var40_273 = var38_231;
                                            var41_300 = false;
                                            if (((q_0)var40_273.h().a(q_0.class)).f().e() > 0 && var30_117.u() == a_.h && var30_117.h() && var30_117.w() != null) {
                                                var38_231 = fg_0.a;
                                                var39_248 = var33_154.d().v() == false;
                                                var40_273 = am.dc;
                                                var41_300 = false;
                                                var42_327 = var38_231;
                                                var43_352 = false;
                                                if (var39_248) {
                                                    var44_372 = var42_327;
                                                    var45_392 = false;
                                                    var44_372.a(var40_273);
                                                    throw new as();
                                                }
                                                var38_231 = new fW(var30_117.w(), (ch)var33_154, null, false, 0, 28, null).i();
                                                if (var38_231.n()) {
                                                    block269: {
                                                        var39_249 = fg_0.a;
                                                        var40_274 = var38_231.m() > 10 && var35_180.f() == false;
                                                        var41_300 = false;
                                                        if (var40_274) {
                                                            var77_486 = var39_249;
                                                            var42_328 = false;
                                                            var77_486.a(am.U.a("list", (Object)var38_231.c()));
                                                            throw new as();
                                                        }
                                                        var39_249 = fg_0.a;
                                                        var40_275 = var38_231.h();
                                                        var41_300 = false;
                                                        if (var40_275 instanceof Collection && ((Collection)var40_275).isEmpty()) {
                                                            v86 = false;
                                                        } else {
                                                            for (T var43_353 : var40_275) {
                                                                var44_373 = (j0)var43_353;
                                                                var45_393 = false;
                                                                if (!ew.a((Object)var44_373.b(), (Object)var35_180.d())) continue;
                                                                v86 = true;
                                                                break block269;
                                                            }
                                                            v86 = false;
                                                        }
                                                    }
                                                    var40_276 = v86;
                                                    var41_301 = am.aa;
                                                    var42_329 = false;
                                                    var43_354 = var39_249;
                                                    var44_374 = false;
                                                    if (var40_276) {
                                                        var45_394 = var43_354;
                                                        var46_410 = false;
                                                        var45_394.a(var41_301);
                                                        throw new as();
                                                    }
                                                    for (j0 var40_277 : var38_231.h()) {
                                                        if (jj_0.a.j(var40_277.b()) == null || ew.a((Object)var40_277.b(), (Object)var30_117.w()) || var40_277.c() != null && ew.a((Object)var40_277.c().w(), (Object)var40_277.b()) || kR.a((ch)var33_154, (UUID)var41_301, null, 2, null)) continue;
                                                        var35_180.a((ch)var33_154, var40_277.e(), var40_277.b());
                                                        v87 = var35_180.t();
                                                        v88 = var35_180.t();
                                                        aa_0.a((ch)var33_154, var40_277, var30_117, v87 != null ? v87.a() : null, v88 != null ? v88.i() : null, null, null, false, 112, null);
                                                    }
                                                }
                                            }
                                        }
                                        var31_134 = var13_22;
                                        var33_154 = ij.l.a(var20_38.u());
                                        var34_169 = false;
                                        if (!var31_134.d().s()) break block270;
                                        var36_182 /* !! */  = var33_154;
                                        var32_136 = var31_134;
                                        var35_181 = false;
                                        var37_206 = u.j;
                                        var38_232 = false;
                                        var39_250 = var25_68 /* !! */ ;
                                        var40_278 = false;
                                        var41_302 = u.j;
                                    }
                                    catch (Throwable var31_135) {
                                        var33_154 = var13_22;
                                        var34_168 /* !! */  = ij.l.a(var20_38.u());
                                        var35_177 = false;
                                        if (var33_154.d().s()) {
                                            var36_182 /* !! */  = var34_168 /* !! */ ;
                                            var32_136 = var33_154;
                                            var37_207 = false;
                                            var38_233 = u.j;
                                            var39_251 = false;
                                            var40_279 = var25_68 /* !! */ ;
                                            var41_303 = false;
                                            var42_331 = u.j;
                                            var43_356 = new CharSequence[2];
                                            v89 = var40_279.a();
                                            if (v89 == null) {
                                                v89 = "";
                                            }
                                            var43_356[0] = bK.c.d(v89);
                                            var43_356[1] = var30_117.h() != false ? String.valueOf(var40_279.c()) : "";
                                            var44_375 = false;
                                            var60_464 = lo_0.a(var43_356, (CharSequence)"\ufeff", null, null, 0, null, null, 62, null);
                                            aa_0.a((ch)var32_136, (ij)var36_182 /* !! */ , var60_464, null, null, 12, null);
                                        }
                                        throw var31_135;
                                    }
                                    var42_330 = new CharSequence[2];
                                    v90 = var39_250.a();
                                    if (v90 == null) {
                                        v90 = "";
                                    }
                                    var42_330[0] = bK.c.d(v90);
                                    var42_330[1] = var30_117.h() != false ? String.valueOf(var39_250.c()) : "";
                                    var43_355 = false;
                                    var60_463 = lo_0.a(var42_330, (CharSequence)"\ufeff", null, null, 0, null, null, 62, null);
                                    aa_0.a((ch)var32_136, (ij)var36_182 /* !! */ , var60_463, null, null, 12, null);
                                }
                                var20_38.a(aI.e);
                            }
                            finally {
                                var20_38.a(aI.b);
                            }
                        }
                        catch (cP var16_27) {
                        }
                    }
                    var11_18 = iv_0.a;
                }
                catch (Throwable var12_20) {
                    var10_17 = var12_20;
                    throw var12_20;
                }
                finally {
                    bt_0.a(var9_16, var10_17);
                }
            }
            catch (SQLException var8_14) {
                if (var6_6.b(var8_14)) break block271;
                throw var8_14;
            }
        }
    }

    private final void b(cz cz2, String string) {
        c1 c12 = this.a(cz2, string);
        if (c12 == null) {
            cz2.n().append(string).append(' ');
        } else {
            this.a(cz2, c12);
        }
    }

    private final void a(cz cz2, c1 c12) {
        cz2.a(c12);
        fg_0 fg_02 = this;
        boolean bl = false;
        cz2.a(((q_0)fg_02.h().a(q_0.class)).s().a(cz2.u(), c12));
    }

    private final c1 a(cz cz2, String string) {
        c1 c12;
        if (((CharSequence)cz2.n()).length() > 0 || ((CharSequence)cz2.s()).length() == 0 || cz2.E() || cz2.I()) {
            c12 = null;
        } else {
            fg_0 fg_02 = this;
            boolean bl = false;
            c12 = ((q_0)fg_02.h().a(q_0.class)).s().a(cz2.u(), string);
        }
        return c12;
    }

    private final void a(cz cz2, d9 d92) {
        if (cz2.u() == a_.h) {
            String string;
            Object object = this;
            boolean bl = false;
            object = ((o)((fg_0)object).h().a(o.class)).f();
            String string2 = d92.d();
            if (string2 != null) {
                String string3 = string2;
                string = string3.toLowerCase(Locale.ENGLISH);
            } else {
                string = null;
            }
            String string4 = string;
            kb_0.b(object).remove(string4);
        }
    }

    private final void a(d9 d92) {
        String string;
        String string2;
        Object object = this;
        boolean bl = false;
        fg_0 fg_02 = (fg_0)object;
        boolean bl2 = false;
        if (((o)fg_02.h().a(o.class)).f().size() >= 128) {
            fg_02 = (fg_0)object;
            bl2 = false;
            ((o)fg_02.h().a(o.class)).f().clear();
            ((fg_0)object).h().getLogger().warning("Too many unbanned players in queue! Cleared list to prevent memory ");
        }
        if ((string2 = d92.g()) == null || (string2 = (string = string2).toLowerCase(Locale.ENGLISH)) == null) {
            return;
        }
        object = string2;
        fg_0 fg_03 = this;
        boolean bl3 = false;
        ((o)fg_03.h().a(o.class)).f().add(object);
    }

    private static final iv_0 a(jv_0 jv_02, ch ch2) {
        kR.a(ch2, jv_02.i(), jv_02.a(), jv_02.b(), false, false, 16, null);
        return iv_0.a;
    }

    private static final iv_0 a(cz cz2, ch ch2) {
        iA iA2 = cz2.t();
        ew.a(iA2);
        ch2.a(iA2, false);
        return iv_0.a;
    }

    static {
        fk_0.b();
        j = new bC(null);
    }

    private static final void b() {
        k = new String[]{"ban", "[c] ", "[LiteBans]", " Plugin access has been disabled!", "litebans.admin", "[LiteBans]", " If you have bought LiteBans, contact Ruan on ", "\n", "Timeout after ", "dupeip", "staffhistory", "history", "alts", "litebans:alts", "checkalts", "litebans:checkalts", "litebans:dupeip", "hist", "litebans:history", "staffhist", "litebans:staffhistory", "litebans:", " seconds", "duration:permanent", "\\-", "-", "", "", "", "", "", "litebans.temp", "", "litebans.ip", "", "litebans.ip", "litebans.ip", "", "litebans.modify", "", ".own", "litebans.ip", ".wildcard", "_USAGE", "_USAGE", "litebans + ", "litebans + ", "litebans.ip", "#offline#", "#offline#", "#", "#", "#", "player", "Hiding IP address from broadcast: ", "", "Applying ", " template group ", ": weight ", " => ", " (", "Applying ", " template \"", "\" at level ", "", "", ".own", "", "[0xff] ", " (x=", "litebans.modify", "litebans.delete", "", "No active ", " found for uuid:", " / ip:", " on server:", " (target: '", "')", "Try targeting by UUID instead of ", "\n", "litebans.unban.queue", "", "", "\ufeff", "", "", "\ufeff", "litebans.override", "bannedPlayer", "mutedPlayer", "#offline#", "tempDuration", "null", "null", "Active warnings: ", "Warning action is invalid (bad format): '", "' + ", "Warning action is invalid (threshold ", " < 1): '", "' + ", "list", "list", "player", "list", "", "", "\ufeff", "", "", "\ufeff", "Too many unbanned players in queue! Cleared list to prevent memory ", "Too many unbanned players in queue! Cleared list to prevent memory ", "litebans.override", "bannedPlayer", "mutedPlayer", "#offline#", "null", "null", "Active warnings: ", "Warning action is invalid (bad format): '", "' + ", "Warning action is invalid (threshold ", " < 1): '", "' + ", "list", "list", "player", "tempDuration", "null", "null", "Active warnings: ", "Warning action is invalid (bad format): '", "' + ", "Warning action is invalid (threshold ", " < 1): '", "' + ", "list", "list", "player", "list"};
    }
}

