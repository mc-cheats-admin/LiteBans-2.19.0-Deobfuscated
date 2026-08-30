package litebans;

import litebans.bz;
import litebans.di_0;
import litebans.em_0;
import litebans.eq_0;
import litebans.ew;
import litebans.fg_0;
import litebans.fo_0;
import litebans.gG;
import litebans.hl;
import litebans.jv_0;
import litebans.k1;
import litebans.ly_0;
import litebans.o;
import litebans.w;
import net.md_5.bungee.api.event.ServerConnectEvent;
import net.md_5.bungee.event.EventHandler;
import org.jetbrains.annotations.NotNull;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public static final class aP
implements ly_0 {
    private final di_0 c;
    private final o b;
    private static /* synthetic */ String[] a;

    public aP(@NotNull di_0 di_02) {
        this.c = di_02;
        this.b = (o)this.c.a(o.class);
    }

    /*
     * Unable to fully structure code
     */
    @EventHandler(priority=-64)
    public final void a(@NotNull ServerConnectEvent var1_1) {
        block12: {
            if (var1_1.isCancelled()) {
                return;
            }
            var2_2 = this.c.a(var1_1.getPlayer());
            v0 = this.b.e();
            if (v0 == null) {
                return;
            }
            var3_3 = v0;
            v1 = this.c.i();
            ew.b(v1, aP.a[0]);
            var4_4 = ((k1)v1).b(this.c).getProxy();
            var5_5 = var3_3;
            var6_6 = false;
            ew.a(var2_2);
            var7_7 = var2_2;
            var8_8 = aP.a[1];
            var9_9 = false;
            var10_11 = var7_7;
            var11_14 = false;
            if (!(var10_11.e((String)var8_8) == false)) break block12;
            var7_7 = var1_1.getTarget().getName();
            var8_8 = var5_5;
            var9_9 = false;
            if (eq_0.f.b(var8_8.a())) ** GOTO lbl-1000
            var10_11 = var8_8;
            var11_15 = (fg_0)var8_8;
            var12_16 = false;
            var11_15 = ((w)var11_15.h().a(w.class)).u();
            var12_16 = false;
            if (bz.a(var10_11.a(), (String)var11_15, true)) lbl-1000:
            // 2 sources

            {
                v2 = true;
            } else {
                v2 = false;
            }
            if (v2) {
                ew.a(var7_7);
                gG.a(var5_5, var1_1, var5_5.a((String)var7_7, true), false, 4, null);
            }
            var8_8 = var5_5;
            ew.a(var7_7);
            var9_10 = var7_7;
            var10_12 = false;
            if (bz.a(var8_8.a(), (String)var9_10, true)) {
                var8_8 = var5_5.a((String)var7_7, false);
                if (var2_2.h() == null) {
                    block11: {
                        var10_13 = var1_1.getPlayer().getPendingConnection().getListener().getServerPriority();
                        var11_14 = false;
                        var12_17 = var10_13.iterator();
                        while (var12_17.hasNext()) {
                            var13_18 = var12_17.next();
                            var14_19 = (String)var13_18;
                            var15_20 = false;
                            var16_21 = var5_5;
                            ew.a((Object)var14_19);
                            var17_22 = var14_19;
                            var18_23 = false;
                            if (!(bz.a(var16_21.a(), var17_22, true) == false)) continue;
                            v3 = var13_18;
                            break block11;
                        }
                        v3 = null;
                    }
                    var9_10 = v3;
                    if (var9_10 == null) {
                        gG.a(var5_5, var1_1, (String)var8_8, false, 4, null);
                    } else {
                        var1_1.setTarget(var4_4.getServerInfo((String)var9_10));
                        var10_13 = var2_2;
                        var11_14 = false;
                        fo_0.a(fg_0.a, (jv_0)var10_13, (CharSequence)var8_8, null, 4, null);
                    }
                } else {
                    gG.a(var5_5, var1_1, null, false, 2, null);
                    fo_0.a(fg_0.a, var2_2, (CharSequence)var8_8, null, 4, null);
                }
            }
        }
    }

    public aP b() {
        aP aP2;
        aP aP3 = aP2 = this;
        boolean bl = false;
        em_0[] em_0Array = new em_0[]{aP3};
        aP3.c.b(em_0Array);
        return aP2;
    }

    @Override
    public em_0 a() {
        return this.b();
    }

    private static final void a() {
        a = new String[]{hl.a("", 1540887676), hl.a("\udb17\udb12\udb0f\udb1e\udb19\udb1a\udb15\udb08\udb55\udb17\udb14\udb18\udb10\udb1f\udb14\udb0c\udb15\udb55\udb19\udb02\udb0b\udb1a\udb08\udb08", -253633669)};
    }

    static {
        aP.a();
    }
}

