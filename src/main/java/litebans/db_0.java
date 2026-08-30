package litebans;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import litebans.aJ;
import litebans.am;
import litebans.bz;
import litebans.cg_0;
import litebans.dk;
import litebans.ew;
import litebans.hN;
import litebans.hl;
import litebans.ll;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from litebans.dB
 */
public static final class db_0 {
    private static /* synthetic */ String[] a;

    private db_0() {
    }

    public final hN b() {
        return dk.d();
    }

    public final hN a() {
        return dk.a();
    }

    /*
     * Unable to fully structure code
     */
    public final dk a(@NotNull String var1_1) {
        block5: {
            var2_2 = dk.values();
            var4_4 = var2_2.length;
            for (var3_3 = 0; var3_3 < var4_4; ++var3_3) {
                block4: {
                    var6_6 = var5_5 = var2_2[var3_3];
                    var7_7 = false;
                    var8_8 = var6_6;
                    var9_9 = false;
                    if (var8_8.b(var1_1)) ** GOTO lbl-1000
                    var10_10 = var8_8;
                    var11_11 = false;
                    var12_12 = dk.a(var10_10);
                    var13_13 = false;
                    var15_15 = var12_12.length;
                    for (var14_14 = 0; var14_14 < var15_15; ++var14_14) {
                        var17_17 = var16_16 = var12_12[var14_14];
                        var18_18 = false;
                        if (!bz.a(var17_17, var1_1, true)) continue;
                        v0 = true;
                        break block4;
                    }
                    v0 = false;
                }
                if (v0) lbl-1000:
                // 2 sources

                {
                    v1 = true;
                } else {
                    v1 = false;
                }
                if (!v1) continue;
                v2 = var5_5;
                break block5;
            }
            v2 = null;
        }
        return v2;
    }

    public final double a(@NotNull String string, double d10) {
        Double d11;
        List list;
        Object object;
        block13: {
            Object object2;
            block12: {
                List list2;
                if (ew.a((Object)string, (Object)a[0]) || ew.a((Object)string, (Object)a[1]) || ew.a((Object)string, (Object)a[2]) || ew.a((Object)string, (Object)a[3]) || ew.a((Object)string, (Object)am.bT.toString())) {
                    return 0.0;
                }
                object2 = new char[]{' '};
                object2 = bz.a((CharSequence)string, object2, false, 0, 6, null);
                boolean bl = false;
                if (!object2.isEmpty()) {
                    object = object2.listIterator(object2.size());
                    while (object.hasPrevious()) {
                        String string2 = (String)object.previous();
                        boolean bl2 = false;
                        if (((CharSequence)string2).length() == 0) continue;
                        list2 = ll.a((Iterable)object2, object.nextIndex() + 1);
                        break;
                    }
                } else {
                    list2 = list = ll.e();
                }
                if (list.isEmpty()) {
                    return d10;
                }
                object2 = bz.a((String)list.get(0), ',', '.', false, 4, null);
                d11 = bz.b((String)object2);
                if (d11 == null) break block12;
                String string3 = String.valueOf(bz.b((CharSequence)object2));
                ew.b(string3, a[4]);
                if (!ew.a((Object)string3.toLowerCase(Locale.ROOT), (Object)a[5])) break block13;
            }
            Double d12 = bz.b(cg_0.a(this.a(), (CharSequence)object2, a[6]));
            if (d12 == null) {
                return d10;
            }
            double d13 = d12;
            String string4 = cg_0.a(this.b(), (CharSequence)object2, a[7]);
            dk dk2 = this.a(string4);
            if (dk2 == null) {
                return d10;
            }
            dk dk3 = dk2;
            return dk3.b(d13);
        }
        if (list.size() == 1) {
            return d11;
        }
        dk dk4 = this.a((String)list.get(1));
        if (dk4 == null) {
            return d10;
        }
        object = dk4;
        return ((dk)((Object)object)).b(d11);
    }

    public static /* synthetic */ double a(db_0 db_02, String string, double d10, int n, Object object) {
        if ((n & 2) != 0) {
            d10 = 0.0;
        }
        return db_02.a(string, d10);
    }

    public final String a(long l3, boolean bl) {
        String string;
        if (l3 <= 0L) {
            return am.bT.toString();
        }
        long l5 = TimeUnit.MILLISECONDS.toDays(l3);
        long l7 = TimeUnit.MILLISECONDS.toHours(l3);
        long l8 = l7 - TimeUnit.DAYS.toHours(l5);
        long l9 = TimeUnit.MILLISECONDS.toMinutes(l3) - TimeUnit.HOURS.toMinutes(l7);
        long l10 = TimeUnit.MILLISECONDS.toSeconds(l3) - TimeUnit.MINUTES.toSeconds(l9);
        CharSequence charSequence = null;
        CharSequence charSequence2 = null;
        CharSequence charSequence3 = null;
        CharSequence charSequence4 = null;
        if (bl) {
            charSequence = this.a(l5, (Object)am.dJ, (Object)am.aq);
            charSequence2 = this.a(l8, (Object)am.cH, (Object)am.bh);
            charSequence3 = this.a(l9, (Object)am.r, (Object)am.cB);
            charSequence4 = this.a(l10, (Object)am.dC, (Object)am.bu);
        } else {
            charSequence = this.a(l5, (Object)a[8], (Object)a[9]);
            charSequence2 = this.a(l8, (Object)a[10], (Object)a[11]);
            charSequence3 = this.a(l9, (Object)a[12], (Object)a[13]);
            charSequence4 = this.a(l10, (Object)a[14], (Object)a[15]);
        }
        String string2 = am.b_.toString();
        String string3 = am.S.toString();
        if (l5 <= 0L) {
            if (l8 <= 0L) {
                if (l9 <= 0L) {
                    Object[] objectArray = new Object[]{l10, charSequence4};
                    string = String.format(string2, Arrays.copyOf(objectArray, objectArray.length));
                } else {
                    Object[] objectArray = new Object[]{l9, charSequence3};
                    string = String.format(string2, Arrays.copyOf(objectArray, objectArray.length));
                }
            } else if (l9 == 0L) {
                Object[] objectArray = new Object[]{l8, charSequence2};
                string = String.format(string2, Arrays.copyOf(objectArray, objectArray.length));
            } else {
                String string4 = string2 + string3 + string2;
                Object[] objectArray = new Object[]{l8, charSequence2, l9, charSequence3};
                string = String.format(string4, Arrays.copyOf(objectArray, objectArray.length));
            }
        } else if (l9 == 0L) {
            if (l8 == 0L) {
                Object[] objectArray = new Object[]{l5, charSequence};
                string = String.format(string2, Arrays.copyOf(objectArray, objectArray.length));
            } else {
                String string5 = string2 + string3 + string2;
                Object[] objectArray = new Object[]{l5, charSequence, l8, charSequence2};
                string = String.format(string5, Arrays.copyOf(objectArray, objectArray.length));
            }
        } else if (l8 == 0L) {
            String string6 = string2 + string3 + string2;
            Object[] objectArray = new Object[]{l5, charSequence, l9, charSequence3};
            string = String.format(string6, Arrays.copyOf(objectArray, objectArray.length));
        } else {
            String string7 = string2 + string3 + string2 + string3 + string2;
            Object[] objectArray = new Object[]{l5, charSequence, l8, charSequence2, l9, charSequence3};
            string = String.format(string7, Arrays.copyOf(objectArray, objectArray.length));
        }
        return string;
    }

    public static /* synthetic */ String a(db_0 db_02, long l3, boolean bl, int n, Object object) {
        if ((n & 2) != 0) {
            bl = true;
        }
        return db_02.a(l3, bl);
    }

    private final boolean a(String string, Object object) {
        return bz.a(string, object.toString(), true);
    }

    private final boolean a(String string, Object object, Object object2) {
        return this.a(string, object) || this.a(string, object2);
    }

    public final CharSequence a(@NotNull Number number, @NotNull Object object, @NotNull Object object2) {
        return (number.doubleValue() == 1.0 ? object : object2).toString();
    }

    public static final /* synthetic */ boolean a(db_0 db_02, String string, Object object, Object object2) {
        return db_02.a(string, object, object2);
    }

    public /* synthetic */ db_0(aJ aJ2) {
        this();
    }

    private static final void c() {
        a = new String[]{hl.a("\u24d3\u24c6\u24d1\u24ce\u24c2\u24cd\u24c6\u24cd\u24d7", 91628707), hl.a("\u76fb\u76fa\u76fb\u76f0", -805210475), hl.a("\u5694\u568f\u568d\u5688\u568c\u5688\u5695\u5684\u5685", 1274304225), hl.a("\u135d\u1356\u1345\u1356\u1341", 989991731), hl.a("", -21391574), hl.a("\ud45a", -489368514), hl.a("", -2043464426), hl.a("", -913983937), hl.a("\u5170\u5175\u516d", 19353876), hl.a("\u8708\u870d\u8715\u871f", 428574572), hl.a("\ua406\ua401\ua41b\ua41c", -2019842962), hl.a("\ub642\ub645\ub65f\ub658\ub659", -2081638870), hl.a("\u5382\u5386\u5381\u539a\u539b\u538a", 214782959), hl.a("\u7ca0\u7ca4\u7ca3\u7cb8\u7cb9\u7ca8\u7cbe", 65109197), hl.a("\uca52\uca44\uca42\uca4e\uca4f\uca45", 1724697121), hl.a("\u4595\u4583\u4585\u4589\u4588\u4582\u4595", 2083997158)};
    }

    static {
        db_0.c();
    }
}

