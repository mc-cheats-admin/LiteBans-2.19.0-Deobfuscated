package litebans;

import com.velocitypowered.api.event.PostOrder;
import com.velocitypowered.api.event.Subscribe;
import com.velocitypowered.api.event.player.ServerPreConnectEvent;
import com.velocitypowered.api.proxy.server.RegisteredServer;
import litebans.VelocityPlugin;
import litebans.bz;
import litebans.di_0;
import litebans.ek_0;
import litebans.em_0;
import litebans.eq_0;
import litebans.ew;
import litebans.fg_0;
import litebans.fo_0;
import litebans.gG;
import litebans.hl;
import litebans.jv_0;
import litebans.ll;
import litebans.o;
import litebans.w;
import org.jetbrains.annotations.NotNull;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public static final class jm
implements ek_0 {
    private final di_0 c;
    private final o a;
    private static /* synthetic */ String[] b;

    public jm(@NotNull di_0 di_02) {
        this.c = di_02;
        this.a = (o)this.c.a(o.class);
    }

    public final di_0 a() {
        return this.c;
    }

    /*
     * Unable to fully structure code
     */
    @Subscribe(order=PostOrder.FIRST)
    public final void a(@NotNull ServerPreConnectEvent var1_1) {
        block12: {
            if (!var1_1.getResult().isAllowed()) {
                return;
            }
            var2_2 = this.c.a(var1_1.getPlayer());
            v0 = this.a.e();
            if (v0 == null) {
                return;
            }
            var3_3 = v0;
            v1 = this.c;
            ew.b(v1, jm.b[0]);
            var4_4 = (VelocityPlugin)v1;
            var5_5 = var3_3;
            var6_6 = false;
            ew.a(var2_2);
            var7_7 = var2_2;
            var8_8 = jm.b[1];
            var9_9 = false;
            var10_11 = var7_7;
            var11_14 = false;
            if (!(var10_11.e((String)var8_8) == false)) break block12;
            var7_7 = ((RegisteredServer)var1_1.getResult().getServer().get()).getServerInfo().getName();
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
                        var10_13 = var4_4.c.getConfiguration().getAttemptConnectionOrder();
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
                        var1_1.setResult(ServerPreConnectEvent.ServerResult.allowed((RegisteredServer)((RegisteredServer)ll.h(var4_4.c.matchServer((String)var9_10)))));
                        var10_13 = var2_2;
                        var11_14 = false;
                        fo_0.a(fg_0.a, (jv_0)var10_13, (CharSequence)var8_8, null, 4, null);
                    }
                } else {
                    gG.a(var5_5, var1_1, null, false, 2, null);
                    var9_10 = var2_2;
                    var10_12 = false;
                    fo_0.a(fg_0.a, (jv_0)var9_10, (CharSequence)var8_8, null, 4, null);
                }
            }
        }
    }

    public jm c() {
        jm jm2;
        jm jm3 = jm2 = this;
        boolean bl = false;
        em_0[] em_0Array = new em_0[]{jm3};
        jm3.c.b(em_0Array);
        return jm2;
    }

    @Override
    public em_0 a() {
        return this.c();
    }

    private static final void b() {
        b = new String[]{hl.a("", 244885265), hl.a("\u9e42\u9e47\u9e5a\u9e4b\u9e4c\u9e4f\u9e40\u9e5d\u9e00\u9e42\u9e41\u9e4d\u9e45\u9e4a\u9e41\u9e59\u9e40\u9e00\u9e4c\u9e57\u9e5e\u9e4f\u9e5d\u9e5d", 1198169646)};
    }

    static {
        jm.b();
    }
}

