package litebans;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import litebans.a_;
import litebans.am;
import litebans.bF;
import litebans.bt_0;
import litebans.cP;
import litebans.ch;
import litebans.dZ;
import litebans.di_0;
import litebans.dy_0;
import litebans.eo_0;
import litebans.eq_0;
import litebans.ew;
import litebans.fg_0;
import litebans.gu;
import litebans.h1;
import litebans.hd_0;
import litebans.hl;
import litebans.hy_0;
import litebans.il_0;
import litebans.iv_0;
import litebans.k1;
import litebans.kR;
import litebans.kb_0;
import litebans.ll;
import litebans.o;
import litebans.q_0;
import litebans.w;
import net.md_5.bungee.api.event.LoginEvent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class gx_0
extends gu {
    private final ConcurrentHashMap g = new ConcurrentHashMap();
    private final ConcurrentHashMap e = new ConcurrentHashMap();
    private static /* synthetic */ String[] f;

    public gx_0(@NotNull di_0 di_02) {
        super(di_02);
    }

    public final ConcurrentHashMap b() {
        return this.g;
    }

    public final ConcurrentHashMap a() {
        return this.e;
    }

    public final void a(@NotNull ch ch2, @NotNull String string, @NotNull UUID uUID, @Nullable String string2, @NotNull String string3, @NotNull Collection collection) {
        Object object = this;
        boolean bl = false;
        int n = (int)uUID.getMostSignificantBits();
        object = (Collection)this.g.get(n);
        if (!collection.isEmpty()) {
            Iterable iterable = collection;
            boolean bl2 = false;
            for (Object t2 : iterable) {
                dZ dZ2 = (dZ)t2;
                boolean bl3 = false;
                ((Map)this.e).put(dZ2, bF.a(ch2, dZ2, string, uUID.toString(), string2, string3, -1));
            }
            Integer n2 = n;
            ((Map)this.g).put(n2, this.a(collection, (Collection)object));
        }
    }

    private final Collection a(Collection collection, Collection collection2) {
        Collection collection3 = collection2;
        if (collection3 == null || collection3.isEmpty()) {
            return collection;
        }
        collection3 = ll.a(collection2);
        for (dZ dZ2 : collection) {
            boolean bl;
            block5: {
                Iterable iterable = collection2;
                boolean bl2 = false;
                if (iterable instanceof Collection && ((Collection)iterable).isEmpty()) {
                    bl = true;
                } else {
                    for (Object t2 : iterable) {
                        dZ dZ3 = (dZ)t2;
                        boolean bl3 = false;
                        if (!(dZ3.a() == dZ2.a())) continue;
                        bl = false;
                        break block5;
                    }
                    bl = true;
                }
            }
            if (!bl) continue;
            collection3.add(dZ2);
        }
        return collection3;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     */
    public final void a(@NotNull LoginEvent var1_1) {
        block24: {
            v0 = this.h().i();
            ew.b(v0, "");
            var2_2 = (k1)v0;
            var3_3 = var1_1.getConnection();
            var4_4 = var3_3.getUniqueId();
            var5_5 = var4_4.toString();
            var6_6 = var3_3.getName();
            v1 = var3_3.getAddress();
            var7_7 = v1 != null && (v1 = v1.getAddress()) != null ? v1.getHostAddress() : null;
            ew.a(var3_3);
            v2 = var2_2.a(var3_3);
            if (v2 == null) {
                throw new AssertionError((Object)"No default server");
            }
            var8_8 = v2;
            var9_9 = new dy_0();
            var10_10 = var8_8.getName();
            var11_11 = this;
            var12_12 = false;
            var11_11 = (w)var11_11.h().a(w.class);
            var12_12 = false;
            try {
                var13_13 = var11_11.f();
                var14_15 = var13_13;
                var15_16 = null;
                try {
                    block26: {
                        block23: {
                            block25: {
                                var16_17 = (ch)var14_15;
                                var17_18 = false;
                                var18_21 = var13_13;
                                var19_22 = false;
                                var20_23 = this;
                                var21_27 = 0;
                                var22_31 = ((q_0)var20_23.h().a(q_0.class)).f().be();
                                var20_24 = var6_6.length();
                                var21_27 = 0;
                                if (ew.a(var20_24, var22_31 & 255) <= 0) break block25;
                                ew.a((Object)var6_6);
                                this.a(var18_21, var6_6, var22_31);
                                if (this.a(var18_21, var1_1, var5_5, var6_6, h1.a(hd_0.c, "Invalid username.\nMaximum " + hd_0.i + hy_0.b(var22_31) + ' ' + hd_0.c + "characters, found " + hd_0.u + hd_0.r + var6_6.length()), null, "KICK_OTHER", false)) break block26;
                            }
                            var9_9.a = var18_21.a(var5_5, var7_7, a_.h, "__ALL__", true, 0);
                            var20_25 = this;
                            var21_27 = 0;
                            if (((q_0)var20_25.h().a(q_0.class)).f().a6()) {
                                ew.a((Object)var6_6);
                                var20_25 = var18_21.a(var6_6, var5_5, "__ALL__", a_.h, true);
                                if (((Collection)var20_25).isEmpty() == false) {
                                    v3 = var9_9.a;
                                    ew.b(v3, "");
                                    kb_0.c(v3).addAll((Collection)var20_25);
                                }
                            }
                            var20_25 = this;
                            var21_27 = 0;
                            var20_25 = (q_0)var20_25.h().a(q_0.class);
                            var21_27 = 3;
                            var23_32 = false;
                            if (var20_25.a(var21_27)) {
                                var24_34 = var20_25;
                                var25_35 = false;
                                var24_34.a((Object)("Found " + ((List)var9_9.a).size() + " ban(s) for " + var6_6 + " (uuid: '" + var4_4 + "') + "));
                            }
                            var20_25 = this;
                            var21_27 = 0;
                            if (((q_0)var20_25.h().a(q_0.class)).a(10)) {
                                var20_25 = (Iterable)var9_9.a;
                                var21_28 = this;
                                var23_32 = false;
                                var21_28 = (q_0)var21_28.h().a(q_0.class);
                                var23_32 = false;
                                var25_36 = var20_25.iterator();
                                while (var25_36.hasNext()) {
                                    var27_41 = var26_39 = var25_36.next();
                                    var28_45 = false;
                                    var21_28.a(var27_41);
                                }
                            }
                            if (!(((Collection)var9_9.a).isEmpty() == false)) ** GOTO lbl-1000
                            ew.a(var4_4);
                            if (var18_21.a(var4_4, a_.h)) {
                                v4 = true;
                            } else lbl-1000:
                            // 2 sources

                            {
                                v4 = var20_26 = false;
                            }
                            if (var20_26) {
                                var21_29 = (Iterable)var9_9.a;
                                var24_34 = var9_9;
                                var23_32 = false;
                                var25_37 = var21_29;
                                var26_39 = new ArrayList<E>();
                                var27_42 = false;
                                var28_46 = var25_37.iterator();
                                while (var28_46.hasNext()) {
                                    var30_50 = var29_49 = var28_46.next();
                                    var31_52 = false;
                                    if (!ew.a((Object)var30_50.w(), (Object)var5_5)) continue;
                                    var26_39.add(var29_49);
                                }
                                var24_34.a = (List)var26_39;
                            }
                            if ((var21_30 = this.a(var7_7)) != null && !var20_26) {
                                ew.a((Object)var10_10);
                                ew.a((Object)var6_6);
                                this.a(var18_21, var1_1, var21_30, var10_10, var5_5, var6_6);
                            }
                            var25_38 = (Iterable)var9_9.a;
                            var26_40 = 0;
                            var27_43 = var25_38.iterator();
                            while (var27_43.hasNext()) {
                                var28_47 = var27_43.next();
                                var29_49 = (dZ)var28_47;
                                var30_51 = false;
                                ew.a((Object)var10_10);
                                v5 = var29_49.m();
                                if (v5 == null) {
                                    v5 = eq_0.f.b();
                                }
                                if (!(eq_0.f.a(var10_10, v5) != false && this.b(var10_10) != false)) continue;
                                v6 = var28_47;
                                break block23;
                            }
                            v6 = null;
                        }
                        var23_33 = v6;
                        var25_38 = this;
                        var26_40 = 0;
                        var25_38 = (q_0)var25_38.h().a(q_0.class);
                        var26_40 = 3;
                        var27_44 = false;
                        if (var25_38.a(var26_40)) {
                            var24_34 = var25_38;
                            var28_48 = false;
                            var24_34.a((Object)("Ban for " + var10_10 + " (uncached): " + var23_33));
                        }
                        if (var23_33 != null) {
                            ew.a((Object)var6_6);
                            this.a(var18_21, var1_1, var5_5, var6_6, var7_7, var10_10, var23_33);
                        } else {
                            ew.a((Object)var6_6);
                            ew.a(var4_4);
                            ew.a((Object)var10_10);
                            this.a(var18_21, var6_6, var4_4, var7_7, var10_10, (Collection)var9_9.a);
                        }
                    }
                    var16_17 = iv_0.a;
                }
                catch (Throwable var17_19) {
                    var15_16 = var17_19;
                    throw var17_19;
                }
                finally {
                    bt_0.a(var14_15, var15_16);
                }
            }
            catch (SQLException var13_14) {
                if (var11_11.b(var13_14)) break block24;
                throw var13_14;
            }
        }
    }

    @Override
    public void b(@NotNull Object var1_1) {
        try {
            block12: {
                block14: {
                    block13: {
                        block11: {
                            var2_2 = this.a(var1_1);
                            var3_6 = var2_2.f();
                            var4_10 = var2_2.e();
                            var5_14 = var2_2.d();
                            var6_16 = this.c(var1_1);
                            var7_18 = false;
                            if (!this.b(var6_16)) break block12;
                            v0 = (Collection)this.g.get(this.a(var4_10));
                            if (v0 == null) break block13;
                            var10_19 = v0;
                            var11_21 = false;
                            for (T var13_23 : var10_19) {
                                var14_24 = (dZ)var13_23;
                                var15_25 = false;
                                if (!var14_24.a(var4_10, var5_14, System.currentTimeMillis())) ** GOTO lbl-1000
                                v1 = var14_24.m();
                                if (v1 == null) {
                                    v1 = eq_0.f.b();
                                }
                                if (eq_0.f.a(var6_16, v1)) {
                                    v2 = true;
                                } else lbl-1000:
                                // 2 sources

                                {
                                    v2 = false;
                                }
                                if (!v2) continue;
                                v3 = var13_23;
                                break block11;
                            }
                            v3 = null;
                        }
                        v4 = v3;
                        break block14;
                    }
                    v4 = var8_26 = null;
                }
                if (var8_26 != null) {
                    var9_27 = this;
                    var10_20 = false;
                    if (!((o)var9_27.h().a(o.class)).a((dZ)var8_26, var3_6)) {
                        var7_18 = this.a(var1_1, var4_10, var3_6, var5_14, var6_16, (dZ)var8_26);
                    }
                }
            }
            var8_26 = this;
            var9_28 = false;
            ((o)var8_26.h().a(o.class)).a(var3_6, var5_14, var4_10, var6_16, var7_18);
        }
        catch (cP var2_3) {
            var3_7 = this;
            var4_11 = false;
            q_0.a((q_0)var3_7.h().a(q_0.class), var2_3, 0, 2, null);
        }
        catch (NullPointerException var2_4) {
            var3_8 = this.h();
            var4_12 = false;
            var5_15 = var3_8;
            var6_17 = false;
            if (var5_15.isEnabled() == false != false || var3_8.s() != false) {
                var3_8 = this;
                var4_12 = false;
                q_0.a((q_0)var3_8.h().a(q_0.class), var2_4, 0, 2, null);
            }
            throw var2_4;
        }
        catch (SQLException var2_5) {
            var3_9 = this;
            var4_13 = false;
            ((w)var3_9.h().a(w.class)).a(var2_5);
        }
    }

    public final int a(@NotNull String string) {
        gx_0 gx_02 = this;
        UUID uUID = UUID.fromString(string);
        boolean bl = false;
        return (int)uUID.getMostSignificantBits();
    }

    public final boolean a(@NotNull Object object, @NotNull String string, @NotNull String string2, @Nullable String string3, @Nullable String string4, @NotNull dZ dZ2) {
        CharSequence charSequence = (CharSequence)this.e.get(dZ2);
        if (charSequence == null) {
            charSequence = "null";
        }
        CharSequence charSequence2 = charSequence;
        Object object2 = this;
        int n = 0;
        object2 = (q_0)((fg_0)object2).h().a(q_0.class);
        n = 3;
        boolean bl = false;
        if (((q_0)object2).a(n)) {
            Object object3 = object2;
            boolean bl2 = false;
            ((q_0)object3).a((Object)("Ban for " + string4 + " (cached): " + dZ2));
        }
        il_0.a(this.h().i(), object, charSequence2, null, false, null, 28, null);
        object2 = this;
        n = 0;
        if (((q_0)((fg_0)object2).h().a(q_0.class)).f().aM()) {
            object2 = this;
            n = 0;
            ((w)((fg_0)object2).h().a(w.class)).a(arg_0 -> gx_0.a(dZ2, string2, string, string3, string4, this, arg_0));
        }
        this.a(object, arg_0 -> gx_0.a(this, dZ2, charSequence2, arg_0));
        return true;
    }

    @Override
    public void a(@NotNull Object object, @NotNull eo_0 eo_02) {
        if (object instanceof LoginEvent) {
            return;
        }
        super.a(object, eo_02);
    }

    private static final iv_0 a(dZ dZ2, String string, String string2, String string3, String string4, gx_0 gx_02, ch ch2) {
        CharSequence charSequence = ch2.a(kR.a(ch2, (CharSequence)am.h, dZ2, false, 2, null), string, string, string2, string3, string4);
        fg_0 fg_02 = gx_02;
        boolean bl = false;
        ((o)fg_02.h().a(o.class)).b(string2, charSequence, true);
        return iv_0.a;
    }

    private static final CharSequence a(gx_0 gx_02, dZ dZ2, CharSequence charSequence, ch ch2) {
        return gx_02.a(ch2, dZ2, charSequence);
    }

    private static final void c() {
        f = new String[]{"", "No default server", "Invalid username.\nMaximum ", "characters, found ", "KICK_OTHER", "__ALL__", "__ALL__", "", "Found ", " ban(s) for ", " (uuid: '", "') + ", "Ban for ", " (uncached): ", "null", "Ban for ", " (cached): "};
    }

    static {
        gx_0.c();
    }
}

