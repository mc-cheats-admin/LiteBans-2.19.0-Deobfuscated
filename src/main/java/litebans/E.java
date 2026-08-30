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
import litebans.bz;
import litebans.d8;
import litebans.d_0;
import litebans.da;
import litebans.di_0;
import litebans.eo_0;
import litebans.ew;
import litebans.fB;
import litebans.fg_0;
import litebans.fn;
import litebans.fo_0;
import litebans.hO;
import litebans.hl;
import litebans.jv_0;
import litebans.ll;
import litebans.q_0;
import litebans.x_0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ai_0(a=1)
public final class E
extends d_0 {
    private static /* synthetic */ String[] e;

    public E(@NotNull di_0 di_02) {
        super(di_02);
    }

    @Override
    public Collection g() {
        Collection collection;
        Collection collection2 = collection = super.g();
        boolean bl = false;
        collection2.removeIf(arg_0 -> E.a(E::a, arg_0));
        return collection;
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
            E e = this;
            n2 = 0;
            e.a.b(new da(jv_02, stringArray4, fB2, (String)object2));
            return;
        }
        object = aa_0.a(fB.d, (String)object2, stringArray4);
        E e = this;
        Object object3 = this;
        n3 = 0;
        fB fB3 = (fB)((a_0)object3).a("ban");
        if (fB3 == null) {
            x_0.a();
            throw new as();
        }
        object3 = fB3;
        n3 = 0;
        e.a.b(new da(jv_02, (String[])object, (fB)object3, (String)object2));
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
                        v1 = var9_15.getPermission();
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
                                if (!var16_28.equals("history")) {
                                    ** break;
                                }
                                break block39;
                            }
                        }
                        var17_31 /* !! */  = new String[]{"alts", "litebans:alts", "checkalts", "litebans:checkalts", "litebans:dupeip"};
                        v2 = var17_31 /* !! */ ;
                        break block40;
                    }
                    var17_31 /* !! */  = new String[]{"hist", "litebans:history"};
                    v2 = var17_31 /* !! */ ;
                    break block40;
                }
                var17_31 /* !! */  = new String[]{"staffhist", "litebans:staffhistory"};
                v2 = var17_31 /* !! */ ;
                break block40;
lbl47:
                // 4 sources

                var17_31 /* !! */  = new String[]{"litebans:" + (String)var14_24};
                v2 = var17_31 /* !! */ ;
            }
            var18_32 /* !! */  = v2;
            var24_33.add(new hO((d8)var9_15, v0, v1, Arrays.copyOf(var18_32 /* !! */ , var18_32 /* !! */ .length)));
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
                                            v3 = new StringBuilder().append("litebans + ");
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
                                            v4 = "unban.own";
                                            break block45;
                                        }
                                        v4 = "unmute.own";
                                        break block45;
                                    }
                                    v4 = "unwarn.own";
                                    break block45;
                                }
                                v4 = "ipmute";
                                break block45;
                            }
                            v4 = "ipban";
                            break block45;
lbl137:
                            // 11 sources

                            v4 = var10_17;
                        }
                        var17_31 /* !! */  = v3.append((String)v4).toString();
                        var14_24 = var12_21;
                        var15_27 = new fn((String)var10_17, (String)var17_31 /* !! */ , (E)var12_21);
                        var16_30 = false;
                        v5 = var14_24.a;
                        v6 = var15_27.getPermission();
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
                        v7 = var22_37;
                        break block48;
                    }
                    var22_37 = new String[]{"hist", "litebans:history"};
                    v7 = var22_37;
                    break block48;
                }
                var22_37 = new String[]{"staffhist", "litebans:staffhistory"};
                v7 = var22_37;
                break block48;
lbl173:
                // 4 sources

                var22_37 = new String[]{"litebans:" + var19_34};
                v7 = var22_37;
            }
            var23_38 = v7;
            var12_21.b(new hO(var15_27, v5, v6, Arrays.copyOf(var23_38, var23_38.length)));
        }
    }

    @Override
    public void e() {
    }

    @Override
    public void b() {
        var1_1 = this.e();
        var2_2 = false;
        var3_3 = var1_1;
        var4_4 /* !! */  = new ArrayList<E>(ll.a(var1_1, 10));
        var5_5 = false;
        var6_7 = var3_3.iterator();
        while (var6_7.hasNext()) {
            block11: {
                block9: {
                    block10: {
                        var7_9 = var6_7.next();
                        var8_10 = (d8)var7_9;
                        var18_20 = var4_4 /* !! */ ;
                        var9_11 = false;
                        var10_12 = this;
                        var11_13 = false;
                        v0 = var10_12.a;
                        v1 = var8_10.getPermission();
                        var12_14 = fB.d;
                        var13_15 = var8_10.getName();
                        var14_16 = false;
                        var15_17 = var13_15;
                        switch (var15_17.hashCode()) {
                            case -1320563219: {
                                if (var15_17.equals("dupeip")) break;
                                ** break;
                            }
                            case 712910260: {
                                if (!var15_17.equals("staffhistory")) {
                                    ** break;
                                }
                                break block9;
                            }
                            case 926934164: {
                                if (!var15_17.equals("history")) {
                                    ** break;
                                }
                                break block10;
                            }
                        }
                        var16_18 = new String[]{"alts", "litebans:alts", "checkalts", "litebans:checkalts", "litebans:dupeip"};
                        v2 = var16_18;
                        break block11;
                    }
                    var16_18 = new String[]{"hist", "litebans:history"};
                    v2 = var16_18;
                    break block11;
                }
                var16_18 = new String[]{"staffhist", "litebans:staffhistory"};
                v2 = var16_18;
                break block11;
lbl43:
                // 4 sources

                var16_18 = new String[]{"litebans:" + var13_15};
                v2 = var16_18;
            }
            var17_19 = v2;
            var18_20.add(new hO(var8_10, v0, v1, Arrays.copyOf(var17_19, var17_19.length)));
        }
        var1_1 = (List)var4_4 /* !! */ ;
        var2_2 = false;
        for (Collection var4_4 : var1_1) {
            var5_6 = (d8)var4_4 /* !! */ ;
            var6_8 = false;
            this.b(var5_6);
        }
    }

    @Override
    public void b(@Nullable d8 d82) {
        q_0 q_02 = (q_0)this.a.a(q_0.class);
        if (d82 instanceof hO && q_02.e(((hO)d82).getName())) {
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
            if (jv_03.e(string2)) {
                list = fB.d.a(d82, string, jv_02, this.a, stringArray);
                return list;
            }
        }
        list = ll.e();
        return list;
    }

    private static final boolean a(d8 d82) {
        return ew.a((Object)d82.getName(), (Object)"togglechat");
    }

    private static final boolean a(eo_0 eo_02, Object object) {
        return (Boolean)eo_02.a(object);
    }

    private static final void g() {
        e = new String[]{"ban", "litebans:", "ban", "dupeip", "staffhistory", "history", "alts", "litebans:alts", "checkalts", "litebans:checkalts", "litebans:dupeip", "hist", "litebans:history", "staffhist", "litebans:staffhistory", "litebans:", "", "ban-ip", "unban", "unwarn", "tempbanip", "banip", "muteip", "unmute", "tempmuteip", "tempipmute", "tempipban", "unban.own", "unmute.own", "unwarn.own", "ipmute", "ipban", "dupeip", "staffhistory", "history", "alts", "litebans:alts", "checkalts", "litebans:checkalts", "litebans:dupeip", "hist", "litebans:history", "staffhist", "litebans:staffhistory", "litebans:", "dupeip", "staffhistory", "history", "alts", "litebans:alts", "checkalts", "litebans:checkalts", "litebans:dupeip", "hist", "litebans:history", "staffhist", "litebans:staffhistory", "litebans:", "dupeip", "staffhistory", "history", "alts", "litebans:alts", "checkalts", "litebans:checkalts", "litebans:dupeip", "hist", "litebans:history", "staffhist", "litebans:staffhistory", "litebans:", "", "ban-ip", "unban", "unwarn", "tempbanip", "banip", "muteip", "unmute", "tempmuteip", "tempipmute", "tempipban", "unban.own", "unmute.own", "unwarn.own", "ipmute", "ipban", "dupeip", "staffhistory", "history", "alts", "litebans:alts", "checkalts", "litebans:checkalts", "litebans:dupeip", "hist", "litebans:history", "staffhist", "litebans:staffhistory", "litebans:", "", "ban-ip", "unban", "unwarn", "tempbanip", "banip", "muteip", "unmute", "tempmuteip", "tempipmute", "tempipban", "unban.own", "unmute.own", "unwarn.own", "ipmute", "ipban", "dupeip", "staffhistory", "history", "alts", "litebans:alts", "checkalts", "litebans:checkalts", "litebans:dupeip", "hist", "litebans:history", "staffhist", "litebans:staffhistory", "litebans:", "litebans.tabcomplete", "togglechat"};
    }

    static {
        E.g();
    }
}

