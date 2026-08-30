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

public static final class d5
implements Function {
    final /* synthetic */ q_0 b;
    final /* synthetic */ G c;
    private static /* synthetic */ String[] a;

    public d5(q_0 q_02, G g) {
        this.b = q_02;
        this.c = g;
    }

    /*
     * Unable to fully structure code
     */
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
                                            ew.b(var1_1, d5.a[0]);
                                            var12_12 = (CommandDispatcher)var1_1;
                                            var13_13 = false;
                                            v0 = new StringBuilder().append(d5.a[1]);
                                            var14_14 = fB.d;
                                            var15_16 = false;
                                            var16_17 = var8_8;
                                            switch (var16_17.hashCode()) {
                                                case -1396405339: {
                                                    if (!var16_17.equals(d5.a[2])) {
                                                        ** break;
                                                    }
                                                    break block29;
                                                }
                                                case 111426262: {
                                                    if (var16_17.equals(d5.a[3])) break;
                                                    ** break;
                                                }
                                                case -840127329: {
                                                    if (!var16_17.equals(d5.a[4])) {
                                                        ** break;
                                                    }
                                                    break block30;
                                                }
                                                case 1972486690: {
                                                    if (!var16_17.equals(d5.a[5])) {
                                                        ** break;
                                                    }
                                                    break block29;
                                                }
                                                case 93503862: {
                                                    if (!var16_17.equals(d5.a[6])) {
                                                        ** break;
                                                    }
                                                    break block29;
                                                }
                                                case -1062781696: {
                                                    if (!var16_17.equals(d5.a[7])) {
                                                        ** break;
                                                    }
                                                    break block31;
                                                }
                                                case -840405966: {
                                                    if (!var16_17.equals(d5.a[8])) {
                                                        ** break;
                                                    }
                                                    break block32;
                                                }
                                                case 1351111124: {
                                                    if (!var16_17.equals(d5.a[9])) {
                                                        ** break;
                                                    }
                                                    break block31;
                                                }
                                                case 1231784084: {
                                                    if (!var16_17.equals(d5.a[10])) {
                                                        ** break;
                                                    }
                                                    break block31;
                                                }
                                                case 1979386420: {
                                                    if (!var16_17.equals(d5.a[11])) {
                                                        ** break;
                                                    }
                                                    break block29;
                                                }
                                            }
                                            v1 = d5.a[12];
                                            break block33;
                                        }
                                        v1 = d5.a[13];
                                        break block33;
                                    }
                                    v1 = d5.a[14];
                                    break block33;
                                }
                                v1 = d5.a[15];
                                break block33;
                            }
                            v1 = d5.a[16];
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
                                if (var20_22.equals(d5.a[17])) break;
                                ** break;
                            }
                            case 712910260: {
                                if (!var20_22.equals(d5.a[18])) {
                                    ** break;
                                }
                                break block34;
                            }
                            case 926934164: {
                                if (!var20_22.equals(d5.a[19])) {
                                    ** break;
                                }
                                break block35;
                            }
                        }
                        var21_23 = new String[]{d5.a[20], d5.a[21], d5.a[22], d5.a[23], d5.a[24]};
                        v2 = var21_23;
                        break block36;
                    }
                    var21_23 = new String[]{d5.a[25], d5.a[26]};
                    v2 = var21_23;
                    break block36;
                }
                var21_23 = new String[]{d5.a[27], d5.a[28]};
                v2 = var21_23;
                break block36;
lbl104:
                // 4 sources

                var21_23 = new String[]{d5.a[29] + var18_20};
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
        a = new String[]{hl.a("", 1548935482), hl.a("\ud863\ud866\ud87b\ud86a\ud86d\ud86e\ud861\ud87c\ud821", 1939134479), hl.a("\ub698\ub69b\ub694\ub6d7\ub693\ub68a", -594430214), hl.a("\u8adf\u8ac4\u8ac8\u8acb\u8ac4", -289502550), hl.a("\u2934\u292f\u2936\u2920\u2933\u292f", -818206399), hl.a("\u514d\u515c\u5154\u5149\u515b\u5158\u5157\u5150\u5149", 99045689), hl.a("\u5ebc\u5ebf\u5eb0\u5eb7\u5eae", 1709137630), hl.a("\u1297\u128f\u128e\u129f\u1293\u128a", -795667718), hl.a("\u6fff\u6fe4\u6fe7\u6fff\u6ffe\u6fef", 2000514954), hl.a("\u9d4d\u9d5c\u9d54\u9d49\u9d54\u9d4c\u9d4d\u9d5c\u9d50\u9d49", -1418945223), hl.a("\ub2bd\ub2ac\ub2a4\ub2b9\ub2a0\ub2b9\ub2a4\ub2bc\ub2bd\ub2ac", -1091783991), hl.a("\uddf8\udde9\udde1\uddfc\udde5\uddfc\uddee\udded\udde2", -1167467124), hl.a("\ueea4\ueebf\ueeb3\ueeb0\ueebf\ueeff\ueebe\ueea6\ueebf", 1244917457), hl.a("\u0611\u060a\u0609\u0611\u0610\u0601\u064a\u060b\u0613\u060a", 2045118052), hl.a("\u6b22\u6b39\u6b20\u6b36\u6b25\u6b39\u6b79\u6b38\u6b20\u6b39", 1931897687), hl.a("\ud693\ud68a\ud697\ud68f\ud68e\ud69f", 957142778), hl.a("\ucb43\ucb5a\ucb48\ucb4b\ucb44", 1001507626), hl.a("\u39d7\u39c6\u39c3\u39d6\u39da\u39c3", 329398707), hl.a("\u461c\u461b\u460e\u4609\u4609\u4607\u4606\u461c\u461b\u4600\u461d\u4616", 1353664111), hl.a("\u2cee\u2cef\u2cf5\u2cf2\u2ce9\u2cf4\u2cff", -118870906), hl.a("\uc857\uc85a\uc842\uc845", 1956038710), hl.a("\uc21a\uc21f\uc202\uc213\uc214\uc217\uc218\uc205\uc24c\uc217\uc21a\uc202\uc205", 1449706102), hl.a("\uea12\uea19\uea14\uea12\uea1a\uea10\uea1d\uea05\uea02", -2000491919), hl.a("\u83c9\u83cc\u83d1\u83c0\u83c7\u83c4\u83cb\u83d6\u839f\u83c6\u83cd\u83c0\u83c6\u83ce\u83c4\u83c9\u83d1\u83d6", 53904293), hl.a("\uae0f\uae0a\uae17\uae06\uae01\uae02\uae0d\uae10\uae59\uae07\uae16\uae13\uae06\uae0a\uae13", 732671587), hl.a("\ub804\ub805\ub81f\ub818", -1522354068), hl.a("\u4da8\u4dad\u4db0\u4da1\u4da6\u4da5\u4daa\u4db7\u4dfe\u4dac\u4dad\u4db7\u4db0\u4dab\u4db6\u4dbd", -733590076), hl.a("\ufc17\ufc10\ufc05\ufc02\ufc02\ufc0c\ufc0d\ufc17\ufc10", -1493500828), hl.a("\ud7e8\ud7ed\ud7f0\ud7e1\ud7e6\ud7e5\ud7ea\ud7f7\ud7be\ud7f7\ud7f0\ud7e5\ud7e2\ud7e2\ud7ec\ud7ed\ud7f7\ud7f0\ud7eb\ud7f6\ud7fd", 135321476), hl.a("\u7ee1\u7ee4\u7ef9\u7ee8\u7eef\u7eec\u7ee3\u7efe\u7eb7", -479822195)};
    }

    static {
        d5.a();
    }
}

