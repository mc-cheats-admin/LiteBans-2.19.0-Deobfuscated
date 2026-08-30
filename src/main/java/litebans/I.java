package litebans;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import litebans.a_0;
import litebans.aa_0;
import litebans.ai_0;
import litebans.am;
import litebans.as;
import litebans.b0;
import litebans.bz;
import litebans.d8;
import litebans.da;
import litebans.di_0;
import litebans.ew;
import litebans.fB;
import litebans.fg_0;
import litebans.fo_0;
import litebans.fp_0;
import litebans.h_0;
import litebans.hl;
import litebans.jv_0;
import litebans.ll;
import litebans.q_0;
import litebans.x_0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ai_0(a=2)
public final class I
extends h_0 {
    private static /* synthetic */ String[] e;

    public I(@NotNull di_0 di_02) {
        super(di_02);
    }

    @Override
    public void a(@NotNull d8 d82, @NotNull jv_0 jv_02, @NotNull String[] stringArray) {
        this.a(jv_02, d82.getName(), stringArray);
    }

    @Override
    public void a(@NotNull jv_0 jv_02, @NotNull String string, @NotNull String[] stringArray) {
        String[] stringArray2;
        boolean bl;
        int n;
        int n2;
        int n3;
        boolean bl2;
        Object object;
        Object object2;
        block8: {
            object2 = fB.d;
            boolean bl3 = false;
            object = stringArray;
            bl2 = false;
            n3 = ((String[])object).length;
            for (n2 = 0; n2 < n3; ++n2) {
                String string2;
                String string3 = string2 = object[n2];
                n = 0;
                if (!bz.b((CharSequence)string3)) continue;
                bl = false;
                break block8;
            }
            bl = true;
        }
        if (bl) {
            stringArray2 = stringArray;
        } else {
            object = stringArray;
            bl2 = false;
            String[] stringArray3 = object;
            Collection collection = new ArrayList();
            boolean bl4 = false;
            n = stringArray3.length;
            for (int i = 0; i < n; ++i) {
                String string4;
                String string5 = string4 = stringArray3[i];
                boolean bl5 = false;
                boolean bl6 = !bz.b((CharSequence)string5);
                if (!bl6) continue;
                collection.add(string4);
            }
            object = (List)collection;
            bl2 = false;
            stringArray3 = object;
            stringArray2 = stringArray3.toArray(new String[0]);
        }
        String[] stringArray4 = stringArray2;
        object2 = string;
        object2 = bz.a((String)object2, "litebans:", null, 2, null);
        fB fB2 = (fB)this.a((String)object2);
        if (fB2 != null) {
            object = fB2.getPermission();
            if (object != null) {
                jv_0 jv_03 = jv_02;
                n2 = 0;
                jv_0 jv_04 = jv_03;
                boolean bl7 = false;
                if (!jv_04.e((String)object)) {
                    jv_03 = jv_02;
                    CharSequence charSequence = am.cZ;
                    boolean bl8 = false;
                    fo_0.a(fg_0.a, jv_03, charSequence, null, 4, null);
                    return;
                }
            }
            I i = this;
            n2 = 0;
            i.a.b(new da(jv_02, stringArray4, fB2, (String)object2));
            return;
        }
        object = aa_0.a(fB.d, (String)object2, stringArray4);
        I i = this;
        Object object3 = this;
        n3 = 0;
        fB fB3 = (fB)((a_0)object3).a("ban");
        if (fB3 == null) {
            x_0.a();
            throw new as();
        }
        object3 = fB3;
        n3 = 0;
        i.a.b(new da(jv_02, (String[])object, (fB)object3, (String)object2));
    }

    @Override
    public void a() {
        var1_1 = (q_0)this.a.a(q_0.class);
        var1_1.e();
        super.a();
        this.a.a(this);
        var2_2 = this.e();
        var3_3 = false;
        var4_5 = var2_2;
        var5_7 = new ArrayList<E>(ll.a((Iterable)var2_2, 10));
        var6_8 = false;
        var7_10 = var4_5.iterator();
        while (var7_10.hasNext()) {
            block40: {
                block38: {
                    block39: {
                        var8_13 = var7_10.next();
                        var9_15 = (d8)var8_13;
                        var24_33 = var5_7;
                        var10_16 = false;
                        var11_18 = this;
                        var12_20 = false;
                        v0 = var11_18.a;
                        var13_22 = fB.d;
                        var14_24 = var9_15.getName();
                        var15_25 = false;
                        var16_28 = var14_24;
                        switch (var16_28.hashCode()) {
                            case -1320563219: {
                                if (var16_28.equals("dupeip")) break;
                                ** break;
                            }
                            case 712910260: {
                                if (!var16_28.equals("staffhistory")) {
                                    ** break;
                                }
                                break block38;
                            }
                            case 926934164: {
                                if (!var16_28.equals("\u777d\u777c\u7766\u7761\u777a\u7767\u776c")) {
                                    ** break;
                                }
                                break block39;
                            }
                        }
                        var17_31 /* !! */  = new String[]{"alts", "litebans:alts", "checkalts", "litebans:checkalts", "litebans:dupeip"};
                        v1 = var17_31 /* !! */ ;
                        break block40;
                    }
                    var17_31 /* !! */  = new String[]{"hist", "litebans:history"};
                    v1 = var17_31 /* !! */ ;
                    break block40;
                }
                var17_31 /* !! */  = new String[]{"staffhist", "litebans:staffhistory"};
                v1 = var17_31 /* !! */ ;
                break block40;
lbl46:
                // 4 sources

                var17_31 /* !! */  = new String[]{"litebans:" + (String)var14_24};
                v1 = var17_31 /* !! */ ;
            }
            var18_32 /* !! */  = v1;
            var24_33.add(new b0((d8)var9_15, v0, null, Arrays.copyOf(var18_32 /* !! */ , var18_32 /* !! */ .length), 4, null));
        }
        var2_2 = (List)var5_7;
        var3_3 = false;
        var4_5 = var2_2.iterator();
        while (var4_5.hasNext()) {
            var5_7 = var4_5.next();
            var6_9 = (d8)var5_7;
            var7_11 = false;
            this.b(var6_9);
        }
        var2_2 = this;
        ew.a(var1_1);
        var3_4 = var1_1;
        var4_6 = false;
        var5_7 = fB.d.a(var3_4);
        var6_8 = false;
        var8_14 = var5_7.length;
        for (var7_12 = 0; var7_12 < var8_14; ++var7_12) {
            block48: {
                block46: {
                    block47: {
                        block45: {
                            block41: {
                                block43: {
                                    block42: {
                                        block44: {
                                            var10_17 = var9_15 = var5_7[var7_12];
                                            var11_19 = false;
                                            var12_21 = var2_2;
                                            var13_23 = false;
                                            v2 = new StringBuilder().append("litebans + ");
                                            var14_24 = fB.d;
                                            var15_26 = false;
                                            var16_29 = var10_17;
                                            switch (var16_29.hashCode()) {
                                                case -1396405339: {
                                                    if (!var16_29.equals("ban-ip")) {
                                                        ** break;
                                                    }
                                                    break block41;
                                                }
                                                case 111426262: {
                                                    if (var16_29.equals("unban")) break;
                                                    ** break;
                                                }
                                                case -840127329: {
                                                    if (!var16_29.equals("unwarn")) {
                                                        ** break;
                                                    }
                                                    break block42;
                                                }
                                                case 1972486690: {
                                                    if (!var16_29.equals("tempbanip")) {
                                                        ** break;
                                                    }
                                                    break block41;
                                                }
                                                case 93503862: {
                                                    if (!var16_29.equals("banip")) {
                                                        ** break;
                                                    }
                                                    break block41;
                                                }
                                                case -1062781696: {
                                                    if (!var16_29.equals("muteip")) {
                                                        ** break;
                                                    }
                                                    break block43;
                                                }
                                                case -840405966: {
                                                    if (!var16_29.equals("unmute")) {
                                                        ** break;
                                                    }
                                                    break block44;
                                                }
                                                case 1351111124: {
                                                    if (!var16_29.equals("tempmuteip")) {
                                                        ** break;
                                                    }
                                                    break block43;
                                                }
                                                case 1231784084: {
                                                    if (!var16_29.equals("tempipmute")) {
                                                        ** break;
                                                    }
                                                    break block43;
                                                }
                                                case 1979386420: {
                                                    if (!var16_29.equals("tempipban")) {
                                                        ** break;
                                                    }
                                                    break block41;
                                                }
                                            }
                                            v3 = "unban.own";
                                            break block45;
                                        }
                                        v3 = "unmute.own";
                                        break block45;
                                    }
                                    v3 = "unwarn.own";
                                    break block45;
                                }
                                v3 = "ipmute";
                                break block45;
                            }
                            v3 = "ipban";
                            break block45;
lbl136:
                            // 11 sources

                            v3 = var10_17;
                        }
                        var17_31 /* !! */  = v2.append((String)v3).toString();
                        var14_24 = var12_21;
                        var15_27 = new fp_0((String)var10_17, (String)var17_31 /* !! */ , (a_0)var12_21);
                        var16_30 = false;
                        v4 = var14_24.a;
                        var18_32 /* !! */  = fB.d;
                        var19_34 = var15_27.getName();
                        var20_35 = false;
                        var21_36 = var19_34;
                        switch (var21_36.hashCode()) {
                            case -1320563219: {
                                if (var21_36.equals("dupeip")) break;
                                ** break;
                            }
                            case 712910260: {
                                if (!var21_36.equals("staffhistory")) {
                                    ** break;
                                }
                                break block46;
                            }
                            case 926934164: {
                                if (!var21_36.equals("history")) {
                                    ** break;
                                }
                                break block47;
                            }
                        }
                        var22_37 = new String[]{"alts", "litebans:alts", "checkalts", "litebans:checkalts", "litebans:dupeip"};
                        v5 = var22_37;
                        break block48;
                    }
                    var22_37 = new String[]{"hist", "litebans:history"};
                    v5 = var22_37;
                    break block48;
                }
                var22_37 = new String[]{"staffhist", "litebans:staffhistory"};
                v5 = var22_37;
                break block48;
lbl171:
                // 4 sources

                var22_37 = new String[]{"litebans:" + var19_34};
                v5 = var22_37;
            }
            var23_38 = v5;
            var12_21.b(new b0(var15_27, v4, null, Arrays.copyOf(var23_38, var23_38.length), 4, null));
        }
    }

    @Override
    public void b(@Nullable d8 d82) {
        q_0 q_02 = (q_0)this.a.a(q_0.class);
        if (d82 instanceof b0 && q_02.e(((b0)d82).getName())) {
            super.b(d82);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public List a(@Nullable d8 d82, @NotNull String string, @NotNull jv_0 jv_02, @NotNull String[] stringArray) {
        List list;
        if (!(stringArray.length == 0)) {
            jv_0 jv_03 = jv_02;
            String string2 = "litebans.tabcomplete";
            boolean bl = false;
            jv_0 jv_04 = jv_03;
            boolean bl2 = false;
            if (!(!jv_04.e(string2))) {
                list = fB.d.a(d82, string, jv_02, this.a, stringArray);
                return list;
            }
        }
        list = ll.e();
        return list;
    }

    private static final void g() {
        e = new String[]{"ban", "litebans:", "ban", "dupeip", "staffhistory", hl.a("\u777d\u777c\u7766\u7761\u777a\u7767\u776c", 0x51757715), "alts", "litebans:alts", "checkalts", "litebans:checkalts", "litebans:dupeip", "hist", "litebans:history", "staffhist", "litebans:staffhistory", "litebans:", "", "ban-ip", "unban", "unwarn", "tempbanip", "banip", "muteip", "unmute", "tempmuteip", "tempipmute", "tempipban", "unban.own", "unmute.own", "unwarn.own", "ipmute", "ipban", "dupeip", "staffhistory", "history", "alts", "litebans:alts", "checkalts", "litebans:checkalts", "litebans:dupeip", "hist", "litebans:history", "staffhist", "litebans:staffhistory", "litebans:", "dupeip", "staffhistory", "history", "alts", "litebans:alts", "checkalts", "litebans:checkalts", "litebans:dupeip", "hist", "litebans:history", "staffhist", "litebans:staffhistory", "litebans:", "", "ban-ip", "unban", "unwarn", "tempbanip", "banip", "muteip", "unmute", "tempmuteip", "tempipmute", "tempipban", "unban.own", "unmute.own", "unwarn.own", "ipmute", "ipban", "dupeip", "staffhistory", "history", "alts", "litebans:alts", "checkalts", "litebans:checkalts", "litebans:dupeip", "hist", "litebans:history", "staffhist", "litebans:staffhistory", "litebans:", "", "ban-ip", "unban", "unwarn", "tempbanip", "banip", "muteip", "unmute", "tempmuteip", "tempipmute", "tempipban", "unban.own", "unmute.own", "unwarn.own", "ipmute", "ipban", "dupeip", "staffhistory", "history", "alts", "litebans:alts", "checkalts", "litebans:checkalts", "litebans:dupeip", "hist", "litebans:history", "staffhist", "litebans:staffhistory", "litebans:", "litebans.tabcomplete"};
    }

    static {
        I.g();
    }
}

