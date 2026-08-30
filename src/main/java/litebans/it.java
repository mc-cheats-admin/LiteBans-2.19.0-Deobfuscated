package litebans;

import java.util.Arrays;
import litebans.aK;
import litebans.di_0;
import litebans.ew;
import litebans.fB;
import litebans.hd_0;
import litebans.hl;
import litebans.l6;
import litebans.q_0;
import litebans.w;
import org.jetbrains.annotations.NotNull;

public final class it
implements Runnable {
    private final di_0 b;
    private static /* synthetic */ String[] a;

    public it(@NotNull di_0 di_02) {
        this.b = di_02;
    }

    @Override
    public void run() {
        block10: {
            block8: {
                block9: {
                    var1_1 = (q_0)this.b.a(q_0.class);
                    ew.a(var1_1);
                    var4_2 = fB.d;
                    var5_3 = "update";
                    var6_4 = false;
                    var7_5 = var5_3;
                    switch (var7_5.hashCode()) {
                        case -1320563219: {
                            if (var7_5.equals("dupeip")) break;
                            ** break;
                        }
                        case 712910260: {
                            if (!var7_5.equals("staffhistory")) {
                                ** break;
                            }
                            break block8;
                        }
                        case 926934164: {
                            if (!var7_5.equals("history")) {
                                ** break;
                            }
                            break block9;
                        }
                    }
                    var8_6 = new String[]{"alts", "litebans:alts", "checkalts", "litebans:checkalts", "litebans:dupeip"};
                    v0 = var8_6;
                    break block10;
                }
                var8_7 = new String[]{"hist", "litebans:history"};
                v0 = var8_7;
                break block10;
            }
            var8_8 = new String[]{"staffhist", "litebans:staffhistory"};
            v0 = var8_8;
            break block10;
lbl30:
            // 4 sources

            var8_9 = new String[]{"litebans:" + (String)var5_3};
            v0 = var8_9;
        }
        var3_10 = v0;
        var2_11 = new aK(new l6(var1_1, Arrays.copyOf(var3_10, ((String[])var3_10).length)).b(), "disabled", "false", null);
        var1_1.a(var2_11);
        var3_10 = ((w)this.b.a(w.class)).l();
        if (var3_10 != null) {
            var3_10.a(var2_11.e());
            var3_10.b(var2_11.d());
        }
        var5_3 = this.b.y();
        var6_4 = false;
        var7_5 = "[LiteBans] " + hd_0.u;
        var5_3.a(var7_5 + "======================================");
        var5_3.a(var7_5 + "|| " + hd_0.c + "Plugin access has been disabled! " + hd_0.u + "||");
        var5_3.a(var7_5 + "|| " + hd_0.d + "If you have bought LiteBans,     " + hd_0.u + "||");
        var5_3.a(var7_5 + "|| " + hd_0.d + "contact Ruan on SpigotMC + " + hd_0.u + "||");
        var5_3.a(var7_5 + "======================================");
    }

    private static final void a() {
        a = new String[]{"update", "dupeip", "staffhistory", "history", "alts", "litebans:alts", "checkalts", "litebans:checkalts", "litebans:dupeip", "hist", "litebans:history", "staffhist", "litebans:staffhistory", "litebans:", "disabled", "false", "[LiteBans] ", "======================================", "|| ", "Plugin access has been disabled! ", "||", "|| ", "If you have bought LiteBans,     ", "||", "|| ", "contact Ruan on ", "||", "======================================"};
    }

    static {
        it.a();
    }
}

