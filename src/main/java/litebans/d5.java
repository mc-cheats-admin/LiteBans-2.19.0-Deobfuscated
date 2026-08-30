package litebans;

import com.mojang.brigadier.CommandDispatcher;
import java.util.function.Function;
import litebans.G;
import litebans.d8;
import litebans.ew;
import litebans.fB;
import litebans.fr_0;
import litebans.hl;
import litebans.iv_0;
import litebans.jq_0;
import litebans.q_0;

public final class d5
implements Function {
    final /* synthetic */ q_0 b;
    final /* synthetic */ G c;
    private static /* synthetic */ String[] a;

    public d5(q_0 q_02, G g) {
        this.b = q_02;
        this.c = g;
    }

    public final void a(Object var1_1) {
        var2_2 = fB.d.a(this.b);
        var3_3 = this.c;
        var4_4 = false;
        var6_6 = var2_2.length;
        for (var5_5 = 0; var5_5 < var6_6; ++var5_5) {
            block36: {
                block34: {
                    block35: {
                        block33: {
                            block29: {
                                block31: {
                                    block30: {
                                        block32: {
                                            var8_8 = var7_7 = var2_2[var5_5];
                                            var9_9 = false;
                                            var10_10 = var3_3;
                                            var11_11 = null;
                                            ew.b(var1_1, "");
                                            var12_12 = (CommandDispatcher)var1_1;
                                            var13_13 = false;
                                            v0 = new StringBuilder().append("litebans + ");
                                            var14_14 = fB.d;
                                            var15_16 = false;
                                            var16_17 = var8_8;
                                            switch (var16_17.hashCode()) {
                                                case -1396405339: {
                                                    if (!var16_17.equals("ban-ip")) {
                                                        ** break;
                                                    }
                                                    break block29;
                                                }
                                                case 111426262: {
                                                    if (var16_17.equals("unban")) break;
                                                    ** break;
                                                }
                                                case -840127329: {
                                                    if (!var16_17.equals("unwarn")) {
                                                        ** break;
                                                    }
                                                    break block30;
                                                }
                                                case 1972486690: {
                                                    if (!var16_17.equals("tempbanip")) {
                                                        ** break;
                                                    }
                                                    break block29;
                                                }
                                                case 93503862: {
                                                    if (!var16_17.equals("banip")) {
                                                        ** break;
                                                    }
                                                    break block29;
                                                }
                                                case -1062781696: {
                                                    if (!var16_17.equals("muteip")) {
                                                        ** break;
                                                    }
                                                    break block31;
                                                }
                                                case -840405966: {
                                                    if (!var16_17.equals("unmute")) {
                                                        ** break;
                                                    }
                                                    break block32;
                                                }
                                                case 1351111124: {
                                                    if (!var16_17.equals("tempmuteip")) {
                                                        ** break;
                                                    }
                                                    break block31;
                                                }
                                                case 1231784084: {
                                                    if (!var16_17.equals("tempipmute")) {
                                                        ** break;
                                                    }
                                                    break block31;
                                                }
                                                case 1979386420: {
                                                    if (!var16_17.equals("tempipban")) {
                                                        ** break;
                                                    }
                                                    break block29;
                                                }
                                            }
                                            v1 = "unban.own";
                                            break block33;
                                        }
                                        v1 = "unmute.own";
                                        break block33;
                                    }
                                    v1 = "unwarn.own";
                                    break block33;
                                }
                                v1 = "ipmute";
                                break block33;
                            }
                            v1 = "ipban";
                            break block33;
lbl71:
                            // 11 sources

                            v1 = var8_8;
                        }
                        var17_18 = v0.append(v1).toString();
                        var14_14 = new fr_0(var8_8, var8_8, var11_11, var17_18, var10_10);
                        var15_15 = var10_10;
                        var16_17 = fB.d;
                        var18_20 = var14_14.getName();
                        var19_21 = false;
                        var20_22 = var18_20;
                        switch (var20_22.hashCode()) {
                            case -1320563219: {
                                if (var20_22.equals("dupeip")) break;
                                ** break;
                            }
                            case 712910260: {
                                if (!var20_22.equals("staffhistory")) {
                                    ** break;
                                }
                                break block34;
                            }
                            case 926934164: {
                                if (!var20_22.equals("history")) {
                                    ** break;
                                }
                                break block35;
                            }
                        }
                        var21_23 = new String[]{"alts", "litebans:alts", "checkalts", "litebans:checkalts", "litebans:dupeip"};
                        v2 = var21_23;
                        break block36;
                    }
                    var21_23 = new String[]{"hist", "litebans:history"};
                    v2 = var21_23;
                    break block36;
                }
                var21_23 = new String[]{"staffhist", "litebans:staffhistory"};
                v2 = var21_23;
                break block36;
lbl104:
                // 4 sources

                var21_23 = new String[]{"litebans:" + var18_20};
                v2 = var21_23;
            }
            var16_17 = v2;
            var18_19 = false;
            var10_10.a(new jq_0((d8)var14_14, ((d8)var14_14).getPermission(), var15_15.a, var16_17), var12_12);
        }
    }

    public Object apply(Object object) {
        this.a(object);
        return iv_0.a;
    }

    private static final void a() {
        a = new String[]{"", "", "ban-ip", "unban", "unwarn", "tempbanip", "banip", "muteip", "unmute", "tempmuteip", "tempipmute", "tempipban", "unban.own", "unmute.own", "unwarn.own", "ipmute", "ipban", "dupeip", "staffhistory", "history", "alts", "litebans:alts", "checkalts", "litebans:checkalts", "litebans:dupeip", "hist", "litebans:history", "staffhist", "litebans:staffhistory", "litebans:"};
    }

    static {
        d5.a();
    }
}

