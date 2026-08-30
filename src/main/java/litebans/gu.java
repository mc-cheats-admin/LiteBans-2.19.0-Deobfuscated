package litebans;

import java.sql.SQLException;
import java.util.Locale;
import java.util.UUID;
import litebans.a_;
import litebans.am;
import litebans.as;
import litebans.bF;
import litebans.bt_0;
import litebans.cP;
import litebans.ch;
import litebans.cp_0;
import litebans.dZ;
import litebans.di_0;
import litebans.eo_0;
import litebans.ew;
import litebans.fg_0;
import litebans.fv_0;
import litebans.h1;
import litebans.hd_0;
import litebans.hl;
import litebans.hy_0;
import litebans.il_0;
import litebans.iv_0;
import litebans.jj_0;
import litebans.kR;
import litebans.o;
import litebans.q_0;
import litebans.w;
import litebans.x_0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public static class gu
extends fg_0 {
    private static /* synthetic */ String[] d;

    public gu(@NotNull di_0 di_02) {
        super(di_02);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     */
    public void b(@NotNull Object var1_1) {
        try {
            block19: {
                var3_2 = this;
                var4_6 = false;
                var2_11 = ((q_0)var3_2.h().a(q_0.class)).o();
                var3_2 = this.a(var1_1);
                var4_7 = var3_2.f();
                var5_15 = var3_2.e();
                var6_17 = var3_2.d();
                var7_19 = var2_11.f().be();
                var8_20 = this.c(var1_1);
                var9_21 = false;
                var10_22 = false;
                var11_23 = this;
                var12_24 = false;
                var11_23 = (w)var11_23.h().a(w.class);
                var12_24 = false;
                try {
                    var13_25 = var11_23.f();
                    var14_27 = var13_25;
                    var15_28 = null;
                    try {
                        block21: {
                            block20: {
                                var16_29 = (ch)var14_27;
                                var17_30 = false;
                                var18_33 = var13_25;
                                var19_34 = false;
                                var20_35 = var4_7.length();
                                var21_37 = false;
                                if (ew.a(var20_35, var7_19 & 255) <= 0) break block20;
                                this.a(var18_33, var4_7, var7_19);
                                if (!this.a(var18_33, var1_1, var5_15, var4_7, h1.a(hd_0.c, gu.d[0] + hd_0.i + hy_0.b(var7_19) + ' ' + hd_0.f(gu.d[1]) + gu.d[2] + hd_0.d(hd_0.e(String.valueOf(var4_7.length())))), null, gu.d[3], false)) break block20;
                                var10_22 = true;
                                break block21;
                            }
                            if (!this.b(var8_20)) break block21;
                            var20_36 = kR.a(var18_33, var5_15, var6_17, null, var8_20, false, false, 52, null);
                            var21_38 = var2_11;
                            var22_39 = 3;
                            var23_42 = false;
                            if (var21_38.a(var22_39)) {
                                var24_44 = var21_38;
                                var25_45 = false;
                                var24_44.a((Object)(gu.d[4] + var4_7 + gu.d[5] + var5_15 + gu.d[6] + var8_20 + gu.d[7] + var20_36));
                            }
                            var21_38 = this.a(var6_17);
                            if (var21_38 != null) {
                                var9_21 = this.a(var18_33, var1_1, (String)var21_38, var8_20, var5_15, var4_7);
                            }
                            if (var9_21 || var20_36 == null) ** GOTO lbl-1000
                            var22_40 = this;
                            var23_42 = false;
                            if (!((o)var22_40.h().a(o.class)).a(var20_36, var4_7)) {
                                var9_21 = this.a(var18_33, var1_1, var5_15, var4_7, var6_17, var8_20, var20_36);
                            } else if (!var9_21 && var2_11.f().a6() && (var22_41 = kR.a(var18_33, var4_7, var5_15, var8_20, null, 8, null)) != null) {
                                var23_43 = this;
                                var25_45 = false;
                                if (!((o)var23_43.h().a(o.class)).a(var22_41, var4_7) && (var9_21 = this.a(var18_33, var1_1, var5_15, var4_7, var6_17, var8_20, var22_41))) {
                                    var10_22 = true;
                                }
                            }
                        }
                        var16_29 = iv_0.a;
                    }
                    catch (Throwable var17_31) {
                        var15_28 = var17_31;
                        throw var17_31;
                    }
                    finally {
                        bt_0.a(var14_27, var15_28);
                    }
                }
                catch (SQLException var13_26) {
                    if (var11_23.b(var13_26)) break block19;
                    throw var13_26;
                }
            }
            if (var10_22) {
                return;
            }
            var11_23 = this;
            var12_24 = false;
            ((o)var11_23.h().a(o.class)).a(var4_7, var6_17, var5_15, var8_20, var9_21);
        }
        catch (cP var2_12) {
            var3_3 = this;
            var4_8 = false;
            q_0.a((q_0)var3_3.h().a(q_0.class), var2_12, 0, 2, null);
        }
        catch (NullPointerException var2_13) {
            var3_4 = this.h();
            var4_9 = false;
            var5_16 = var3_4;
            var6_18 = false;
            if (var5_16.isEnabled() == false != false || var3_4.s() != false) {
                var3_4 = this;
                var4_9 = false;
                q_0.a((q_0)var3_4.h().a(q_0.class), var2_13, 0, 2, null);
            }
            throw var2_13;
        }
        catch (SQLException var2_14) {
            var3_5 = this;
            var4_10 = false;
            ((w)var3_5.h().a(w.class)).a(var2_14);
        }
    }

    public final void a(@NotNull ch ch2, @NotNull String string, byte by2) {
        ch2.e().getLogger().warning(d[8] + string + d[9] + hy_0.b(by2) + d[10]);
    }

    public final String a(@Nullable String string) {
        fg_0 fg_02 = this;
        boolean bl = false;
        fv_0 fv_02 = ((q_0)fg_02.h().a(q_0.class)).h();
        return fv_02 != null ? fv_02.a(string) : null;
    }

    public final boolean b(@NotNull String string) {
        boolean bl;
        if (this.h().l()) {
            Object object = this;
            boolean bl2 = false;
            bl = !((q_0)((fg_0)object).h().a(q_0.class)).f().ap().contains(((String)(object = string)).toLowerCase(Locale.ENGLISH));
        } else {
            fg_0 fg_02 = this;
            boolean bl3 = false;
            bl = !((q_0)fg_02.h().a(q_0.class)).f().M();
        }
        return bl;
    }

    public final boolean a(@NotNull ch ch2, @NotNull Object object, @NotNull String string, @NotNull String string2, @NotNull CharSequence charSequence, @Nullable dZ dZ2, @NotNull String string3, boolean bl) {
        UUID uUID = jj_0.a.j(string);
        if ((dZ2 == null || !ew.a((Object)dZ2.w(), (Object)string)) && uUID != null && ch2.a(uUID, a_.h) && bl) {
            ch2.e().getLogger().info(string2 + d[11]);
            return false;
        }
        this.a(object, charSequence, string3);
        return true;
    }

    public static /* synthetic */ boolean a(gu gu2, ch ch2, Object object, String string, String string2, CharSequence charSequence, dZ dZ2, String string3, boolean bl, int n, Object object2) {
        if (object2 != null) {
            throw new UnsupportedOperationException(d[12]);
        }
        if ((n & 0x20) != 0) {
            string3 = d[13];
        }
        if ((n & 0x40) != 0) {
            bl = true;
        }
        return gu2.a(ch2, object, string, string2, charSequence, dZ2, string3, bl);
    }

    public final cp_0 a(@NotNull Object object) {
        fg_0 fg_02 = this;
        boolean bl = false;
        return this.h().i().a(object, ((q_0)fg_02.h().a(q_0.class)).f().h());
    }

    public final void a(@NotNull Object object, @NotNull CharSequence charSequence, @NotNull String string) {
        il_0.a(this.h().i(), object, charSequence, null, false, string, 12, null);
    }

    public String c(@NotNull Object object) {
        return this.h().i().a(object);
    }

    public void a(@NotNull Object object, @NotNull eo_0 eo_02) {
        fg_0 fg_02 = this;
        boolean bl = false;
        ((w)fg_02.h().a(w.class)).a(arg_0 -> gu.a(object, eo_02, arg_0));
    }

    public final boolean a(@NotNull ch ch2, @NotNull Object object, @NotNull String string, @NotNull String string2, @NotNull String string3, @NotNull String string4) {
        if (gu.a(this, ch2, object, string3, string4, bF.a(ch2, string, string2), null, null, false, 96, null)) {
            CharSequence[] charSequenceArray = (CharSequence[])this;
            boolean bl = false;
            CharSequence[] charSequenceArray2 = charSequenceArray;
            boolean bl2 = false;
            if (((q_0)charSequenceArray2.h().a(q_0.class)).f().aM()) {
                charSequenceArray = this;
                bl = false;
                o o2 = (o)charSequenceArray.h().a(o.class);
                charSequenceArray = new CharSequence[]{d[14], string, d[15], string4};
                o2.b(string3, h1.a((CharSequence)am.dy, charSequenceArray), true);
                return true;
            }
        }
        return false;
    }

    public final boolean a(@NotNull ch ch2, @NotNull Object object, @NotNull String string, @NotNull String string2, @Nullable String string3, @Nullable String string4, @NotNull dZ dZ2) {
        CharSequence charSequence = bF.a(ch2, dZ2, string2, string, string3, string4, -1);
        if (gu.a(this, ch2, object, string, string2, charSequence, dZ2, null, false, 96, null)) {
            fg_0 fg_02 = this;
            boolean bl = false;
            if (((q_0)fg_02.h().a(q_0.class)).f().aM()) {
                ch2.d().a(arg_0 -> gu.a(dZ2, string2, string, string3, string4, this, arg_0));
            }
            if (ch2.e().l()) {
                this.a(object, arg_0 -> gu.a(this, dZ2, charSequence, arg_0));
            }
            return true;
        }
        return false;
    }

    public final CharSequence a(@NotNull ch ch2, @NotNull dZ dZ2, @NotNull CharSequence charSequence) {
        CharSequence charSequence2 = charSequence;
        dZ dZ3 = dZ2;
        boolean bl = false;
        if (!(dZ3 != null && dZ3.r() != -1)) {
            charSequence2 = dZ2.y() ? (CharSequence)am.d : (CharSequence)am.aj;
        }
        return kR.a(ch2, charSequence2, dZ2, false, 2, null);
    }

    public Void b() {
        x_0.a();
        throw new as();
    }

    private static final iv_0 a(Object object, eo_0 eo_02, ch ch2) {
        ch2.e().i().a(object, (CharSequence)eo_02.a(ch2));
        return iv_0.a;
    }

    private static final iv_0 a(dZ dZ2, String string, String string2, String string3, String string4, gu gu2, ch ch2) {
        CharSequence charSequence = ch2.a(kR.a(ch2, (CharSequence)am.h, dZ2, false, 2, null), string, string, string2, string3, string4);
        fg_0 fg_02 = gu2;
        boolean bl = false;
        ((o)fg_02.h().a(o.class)).b(string2, charSequence, true);
        return iv_0.a;
    }

    private static final CharSequence a(gu gu2, dZ dZ2, CharSequence charSequence, ch ch2) {
        return gu2.a(ch2, dZ2, charSequence);
    }

    @Override
    public void run() {
        this.b();
    }

    private static final void a() {
        d = new String[]{hl.a("\u17ad\u178a\u1792\u1785\u1788\u178d\u1780\u17c4\u1791\u1797\u1781\u1796\u178a\u1785\u1789\u1781\u17ca\u17ee\u17a9\u1785\u179c\u178d\u1789\u1791\u1789\u17c4", -158394396), hl.a("\u06fc\u06f7\u06fe\u06ed\u06fe\u06fc\u06eb\u06fa\u06ed\u06ec", -1860893025), hl.a("\u817c\u8170\u8136\u813f\u8125\u813e\u8134\u8170", -1823375024), hl.a("\u2b71\u2b73\u2b79\u2b71\u2b65\u2b75\u2b6e\u2b72\u2b7f\u2b68", -820368582), hl.a("\u2c07\u2c24\u2c2b\u2c65\u2c23\u2c2a\u2c37\u2c65", 449260613), hl.a("\ufaf7\ufaff\ufaa2\ufaa2\ufabe\ufab3\ufaed\ufaf7\ufaf0", -516621609), hl.a("\uf0fd\uf0f3\uf0fa\uf0b5\uf0b4\uf0fa", 1061089498), hl.a("\uf5d6\uf5cc", -193661460), hl.a("\u0365\u0343\u0355\u0342\u0310\u0312", 1952842544), hl.a("\u2702\u2700\u274c\u2745\u274e\u2747\u2754\u2748\u2700\u271e\u2700", 1848846112), hl.a("\u6f2f\u6f27\u6f66\u6f61\u6f79\u6f6e\u6f63\u6f66\u6f6b\u6f2f\u6f7a\u6f7c\u6f6a\u6f7d\u6f61\u6f6e\u6f62\u6f6a\u6f26\u6f34\u6f2f\u6f6d\u6f63\u6f60\u6f6c\u6f64\u6f66\u6f61\u6f68\u6f2f\u6f63\u6f60\u6f68\u6f66\u6f61\u6f21", 1824485135), hl.a("\u3e4d\u3e1a\u3e0c\u3e1e\u3e4d\u3e1d\u3e08\u3e1f\u3e00\u3e04\u3e19\u3e19\u3e08\u3e09\u3e4d\u3e19\u3e02\u3e4d\u3e07\u3e02\u3e04\u3e03\u3e4d\u3e19\u3e05\u3e08\u3e4d\u3e1e\u3e08\u3e1f\u3e1b\u3e08\u3e1f\u3e43", -1201783187), hl.a("", 1832510860), hl.a("\uee72\uee70\uee7a\uee72\uee66\uee7b\uee78\uee77\uee77\uee7c\uee7d", -704582087), hl.a("\u6379\u637b\u6371\u6377\u636e", 1079927582), hl.a("\ud64f\ud653\ud65e\ud646\ud65a\ud64d", 1183176255)};
    }

    static {
        gu.a();
    }
}

