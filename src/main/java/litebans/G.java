package litebans;

import com.mojang.brigadier.CommandDispatcher;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import litebans.FabricPlugin;
import litebans.a_0;
import litebans.aa_0;
import litebans.ai_0;
import litebans.am;
import litebans.as;
import litebans.bz;
import litebans.d5;
import litebans.d8;
import litebans.da;
import litebans.di_0;
import litebans.ew;
import litebans.fB;
import litebans.f_0;
import litebans.fg_0;
import litebans.fo_0;
import litebans.fr_0;
import litebans.hl;
import litebans.jq_0;
import litebans.jv_0;
import litebans.ll;
import litebans.lo_0;
import litebans.q_0;
import litebans.x_0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ai_0(a=3)
public final class G
extends f_0 {
    private static /* synthetic */ String[] e;

    public G(@NotNull di_0 di_02) {
        super(di_02);
    }

    @Override
    public boolean d() {
        return this.a.t() == 3;
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
            G g = this;
            n2 = 0;
            g.a.b(new da(jv_02, stringArray4, fB2, (String)object2));
            return;
        }
        object = aa_0.a(fB.d, (String)object2, stringArray4);
        G g = this;
        Object object3 = this;
        n3 = 0;
        fB fB3 = (fB)((a_0)object3).a("ban");
        if (fB3 == null) {
            x_0.a();
            throw new as();
        }
        object3 = fB3;
        n3 = 0;
        g.a.b(new da(jv_02, (String[])object, (fB)object3, (String)object2));
    }

    @Override
    public void a() {
        q_0 q_02 = (q_0)this.a.a(q_0.class);
        q_02.a();
        super.a();
        this.a.a(this);
        G g = this;
        ew.a(q_02);
        q_0 q_03 = q_02;
        boolean bl = false;
        di_0 di_02 = g.a;
        ew.b(di_02, "");
        ((FabricPlugin)di_02).g().a(new d5(q_03, g));
    }

    @Override
    public void a(@NotNull jq_0 var1_1, @NotNull CommandDispatcher var2_2) {
        block37: {
            block40: {
                block38: {
                    block39: {
                        var3_3 = (q_0)this.a.a(q_0.class);
                        if (!var3_3.e(var1_1.getName())) break block37;
                        super.a(var1_1, var2_2);
                        if (var1_1.a() instanceof fr_0) break block37;
                        var4_4 = new String[2][];
                        var4_4[0] = var1_1.getAliases();
                        var5_5 = fB.d;
                        var6_7 = var1_1.getName();
                        var7_8 = false;
                        var8_10 = var6_7;
                        switch (var8_10.hashCode()) {
                            case -1320563219: {
                                if (var8_10.equals("dupeip")) break;
                                ** break;
                            }
                            case 712910260: {
                                if (!var8_10.equals("staffhistory")) {
                                    ** break;
                                }
                                break block38;
                            }
                            case 926934164: {
                                if (!var8_10.equals("history")) {
                                    ** break;
                                }
                                break block39;
                            }
                        }
                        var9_13 = new String[]{"alts", "litebans:alts", "checkalts", "litebans:checkalts", "litebans:dupeip"};
                        v0 /* !! */  = var9_13;
                        break block40;
                    }
                    var9_13 = new String[]{"hist", "litebans:history"};
                    v0 /* !! */  = var9_13;
                    break block40;
                }
                var9_13 = new String[]{"staffhist", "litebans:staffhistory"};
                v0 /* !! */  = var9_13;
                break block40;
lbl34:
                // 4 sources

                var9_13 = new String[]{"litebans:" + (String)var6_7};
                v0 /* !! */  = var9_13;
            }
            var4_4[1] = v0 /* !! */ ;
            var4_4 = lo_0.a((Object[][])var4_4);
            var5_6 = false;
            var6_7 = var4_4;
            var7_9 = new ArrayList<E>();
            var8_11 = false;
            var9_13 = var6_7.iterator();
            while (var9_13.hasNext()) {
                var10_15 = var9_13.next();
                var11_16 = (String)var10_15;
                var12_17 = false;
                ew.a((Object)var11_16);
                if (!(bz.c((CharSequence)var11_16, ':', false, 2, null) == false)) continue;
                var7_9.add(var10_15);
            }
            var4_4 = (List)var7_9;
            var5_6 = false;
            var6_7 = var4_4.iterator();
            while (var6_7.hasNext()) {
                block48: {
                    block46: {
                        block47: {
                            block45: {
                                block41: {
                                    block43: {
                                        block42: {
                                            block44: {
                                                var7_9 = var6_7.next();
                                                var8_12 = (String)var7_9;
                                                var9_14 = false;
                                                var10_15 = this;
                                                ew.a((Object)var8_12);
                                                var11_16 = var8_12;
                                                var12_18 = var1_1.getName();
                                                var13_19 = false;
                                                v1 = new StringBuilder().append("litebans + ");
                                                var14_20 = fB.d;
                                                var15_22 = false;
                                                var16_23 = var11_16;
                                                switch (var16_23.hashCode()) {
                                                    case -1396405339: {
                                                        if (!var16_23.equals("ban-ip")) {
                                                            ** break;
                                                        }
                                                        break block41;
                                                    }
                                                    case 111426262: {
                                                        if (var16_23.equals("unban")) break;
                                                        ** break;
                                                    }
                                                    case -840127329: {
                                                        if (!var16_23.equals("unwarn")) {
                                                            ** break;
                                                        }
                                                        break block42;
                                                    }
                                                    case 1972486690: {
                                                        if (!var16_23.equals("tempbanip")) {
                                                            ** break;
                                                        }
                                                        break block41;
                                                    }
                                                    case 93503862: {
                                                        if (!var16_23.equals("banip")) {
                                                            ** break;
                                                        }
                                                        break block41;
                                                    }
                                                    case -1062781696: {
                                                        if (!var16_23.equals("muteip")) {
                                                            ** break;
                                                        }
                                                        break block43;
                                                    }
                                                    case -840405966: {
                                                        if (!var16_23.equals("unmute")) {
                                                            ** break;
                                                        }
                                                        break block44;
                                                    }
                                                    case 1351111124: {
                                                        if (!var16_23.equals("tempmuteip")) {
                                                            ** break;
                                                        }
                                                        break block43;
                                                    }
                                                    case 1231784084: {
                                                        if (!var16_23.equals("tempipmute")) {
                                                            ** break;
                                                        }
                                                        break block43;
                                                    }
                                                    case 1979386420: {
                                                        if (!var16_23.equals("tempipban")) {
                                                            ** break;
                                                        }
                                                        break block41;
                                                    }
                                                }
                                                v2 = "unban.own";
                                                break block45;
                                            }
                                            v2 = "unmute.own";
                                            break block45;
                                        }
                                        v2 = "unwarn.own";
                                        break block45;
                                    }
                                    v2 = "ipmute";
                                    break block45;
                                }
                                v2 = "ipban";
                                break block45;
lbl125:
                                // 11 sources

                                v2 = var11_16;
                            }
                            var17_24 = v1.append(v2).toString();
                            var14_20 = new fr_0(var11_16, var12_18, var1_1, var17_24, (a_0)var10_15);
                            var15_21 = var10_15;
                            var16_23 = fB.d;
                            var18_26 = var14_20.getName();
                            var19_27 = false;
                            var20_28 = var18_26;
                            switch (var20_28.hashCode()) {
                                case -1320563219: {
                                    if (var20_28.equals("dupeip")) break;
                                    ** break;
                                }
                                case 712910260: {
                                    if (!var20_28.equals("staffhistory")) {
                                        ** break;
                                    }
                                    break block46;
                                }
                                case 926934164: {
                                    if (!var20_28.equals("history")) {
                                        ** break;
                                    }
                                    break block47;
                                }
                            }
                            var21_29 = new String[]{"alts", "litebans:alts", "checkalts", "litebans:checkalts", "litebans:dupeip"};
                            v3 = var21_29;
                            break block48;
                        }
                        var21_29 = new String[]{"hist", "litebans:history"};
                        v3 = var21_29;
                        break block48;
                    }
                    var21_29 = new String[]{"staffhist", "litebans:staffhistory"};
                    v3 = var21_29;
                    break block48;
lbl158:
                    // 4 sources

                    var21_29 = new String[]{"litebans:" + var18_26};
                    v3 = var21_29;
                }
                var16_23 = v3;
                var18_25 = false;
                var10_15.a(new jq_0((d8)var14_20, ((d8)var14_20).getPermission(), var15_21.a, var16_23), var2_2);
                if (var1_1 == null) continue;
                var10_15.a(var11_16, (d8)var14_20);
            }
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
        e = new String[]{"ban", "litebans:", "ban", "", "dupeip", "staffhistory", "history", "alts", "litebans:alts", "checkalts", "litebans:checkalts", "litebans:dupeip", "hist", "litebans:history", "staffhist", "litebans:staffhistory", "litebans:", "", "ban-ip", "unban", "unwarn", "tempbanip", "banip", "muteip", "unmute", "tempmuteip", "tempipmute", "tempipban", "unban.own", "unmute.own", "unwarn.own", "ipmute", "ipban", "dupeip", "staffhistory", "history", "alts", "litebans:alts", "checkalts", "litebans:checkalts", "litebans:dupeip", "hist", "litebans:history", "staffhist", "litebans:staffhistory", "litebans:", "", "", "ban-ip", "unban", "unwarn", "tempbanip", "banip", "muteip", "unmute", "tempmuteip", "tempipmute", "tempipban", "unban.own", "unmute.own", "unwarn.own", hl.a("\ubf96\ubf8f\ubf92\ubf8a\ubf8b\ubf9a", 0xFFFBFFF), "ipban", "dupeip", "staffhistory", "history", "alts", "litebans:alts", "checkalts", "litebans:checkalts", "litebans:dupeip", "hist", "litebans:history", "staffhist", "litebans:staffhistory", "litebans:", "litebans.tabcomplete"};
    }

    static {
        G.g();
    }
}

