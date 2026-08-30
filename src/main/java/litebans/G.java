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
public static final class G
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
        object2 = bz.a((String)object2, e[1], null, 2, null);
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
        fB fB3 = (fB)((a_0)object3).a(e[2]);
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
        ew.b(di_02, e[3]);
        ((FabricPlugin)di_02).g().a(new d5(q_03, g));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
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
                                if (var8_10.equals(G.e[4])) break;
                                ** break;
                            }
                            case 712910260: {
                                if (!var8_10.equals(G.e[5])) {
                                    ** break;
                                }
                                break block38;
                            }
                            case 926934164: {
                                if (!var8_10.equals(G.e[6])) {
                                    ** break;
                                }
                                break block39;
                            }
                        }
                        var9_13 = new String[]{G.e[7], G.e[8], G.e[9], G.e[10], G.e[11]};
                        v0 /* !! */  = var9_13;
                        break block40;
                    }
                    var9_13 = new String[]{G.e[12], G.e[13]};
                    v0 /* !! */  = var9_13;
                    break block40;
                }
                var9_13 = new String[]{G.e[14], G.e[15]};
                v0 /* !! */  = var9_13;
                break block40;
lbl34:
                // 4 sources

                var9_13 = new String[]{G.e[16] + (String)var6_7};
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
                                                v1 = new StringBuilder().append(G.e[17]);
                                                var14_20 = fB.d;
                                                var15_22 = false;
                                                var16_23 = var11_16;
                                                switch (var16_23.hashCode()) {
                                                    case -1396405339: {
                                                        if (!var16_23.equals(G.e[18])) {
                                                            ** break;
                                                        }
                                                        break block41;
                                                    }
                                                    case 111426262: {
                                                        if (var16_23.equals(G.e[19])) break;
                                                        ** break;
                                                    }
                                                    case -840127329: {
                                                        if (!var16_23.equals(G.e[20])) {
                                                            ** break;
                                                        }
                                                        break block42;
                                                    }
                                                    case 1972486690: {
                                                        if (!var16_23.equals(G.e[21])) {
                                                            ** break;
                                                        }
                                                        break block41;
                                                    }
                                                    case 93503862: {
                                                        if (!var16_23.equals(G.e[22])) {
                                                            ** break;
                                                        }
                                                        break block41;
                                                    }
                                                    case -1062781696: {
                                                        if (!var16_23.equals(G.e[23])) {
                                                            ** break;
                                                        }
                                                        break block43;
                                                    }
                                                    case -840405966: {
                                                        if (!var16_23.equals(G.e[24])) {
                                                            ** break;
                                                        }
                                                        break block44;
                                                    }
                                                    case 1351111124: {
                                                        if (!var16_23.equals(G.e[25])) {
                                                            ** break;
                                                        }
                                                        break block43;
                                                    }
                                                    case 1231784084: {
                                                        if (!var16_23.equals(G.e[26])) {
                                                            ** break;
                                                        }
                                                        break block43;
                                                    }
                                                    case 1979386420: {
                                                        if (!var16_23.equals(G.e[27])) {
                                                            ** break;
                                                        }
                                                        break block41;
                                                    }
                                                }
                                                v2 = G.e[28];
                                                break block45;
                                            }
                                            v2 = G.e[29];
                                            break block45;
                                        }
                                        v2 = G.e[30];
                                        break block45;
                                    }
                                    v2 = G.e[31];
                                    break block45;
                                }
                                v2 = G.e[32];
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
                                    if (var20_28.equals(G.e[33])) break;
                                    ** break;
                                }
                                case 712910260: {
                                    if (!var20_28.equals(G.e[34])) {
                                        ** break;
                                    }
                                    break block46;
                                }
                                case 926934164: {
                                    if (!var20_28.equals(G.e[35])) {
                                        ** break;
                                    }
                                    break block47;
                                }
                            }
                            var21_29 = new String[]{G.e[36], G.e[37], G.e[38], G.e[39], G.e[40]};
                            v3 = var21_29;
                            break block48;
                        }
                        var21_29 = new String[]{G.e[41], G.e[42]};
                        v3 = var21_29;
                        break block48;
                    }
                    var21_29 = new String[]{G.e[43], G.e[44]};
                    v3 = var21_29;
                    break block48;
lbl158:
                    // 4 sources

                    var21_29 = new String[]{G.e[45] + var18_26};
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
            String string2 = e[76];
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
        e = new String[]{hl.a("\u2a0b\u2a08\u2a07", -1934022039), hl.a("\u88be\u88bb\u88a6\u88b7\u88b0\u88b3\u88bc\u88a1\u88e8", 1130531026), hl.a("\u498b\u4988\u4987", -894547479), hl.a("", 244455975), hl.a("\u0a84\u0a95\u0a90\u0a85\u0a89\u0a90", 801311456), hl.a("\u6fa8\u6faf\u6fba\u6fbd\u6fbd\u6fb3\u6fb2\u6fa8\u6faf\u6fb4\u6fa9\u6fa2", 342061019), hl.a("\ue6ee\ue6ef\ue6f5\ue6f2\ue6e9\ue6f4\ue6ff", 373089926), hl.a("\uead5\uead8\ueac0\ueac7", 273214132), hl.a("\u07ff\u07fa\u07e7\u07f6\u07f1\u07f2\u07fd\u07e0\u07a9\u07f2\u07ff\u07e7\u07e0", -596506733), hl.a("\ucc2c\ucc27\ucc2a\ucc2c\ucc24\ucc2e\ucc23\ucc3b\ucc3c", -629093297), hl.a("\u72e8\u72ed\u72f0\u72e1\u72e6\u72e5\u72ea\u72f7\u72be\u72e7\u72ec\u72e1\u72e7\u72ef\u72e5\u72e8\u72f0\u72f7", -659131772), hl.a("\uf3ec\uf3e9\uf3f4\uf3e5\uf3e2\uf3e1\uf3ee\uf3f3\uf3ba\uf3e4\uf3f5\uf3f0\uf3e5\uf3e9\uf3f0", -177081472), hl.a("\u585e\u585f\u5845\u5842", 651712566), hl.a("\ue3db\ue3de\ue3c3\ue3d2\ue3d5\ue3d6\ue3d9\ue3c4\ue38d\ue3df\ue3de\ue3c4\ue3c3\ue3d8\ue3c5\ue3ce", -1169693769), hl.a("\uc581\uc586\uc593\uc594\uc594\uc59a\uc59b\uc581\uc586", -2066299406), hl.a("\uc6f1\uc6f4\uc6e9\uc6f8\uc6ff\uc6fc\uc6f3\uc6ee\uc6a7\uc6ee\uc6e9\uc6fc\uc6fb\uc6fb\uc6f5\uc6f4\uc6ee\uc6e9\uc6f2\uc6ef\uc6e4", -539375971), hl.a("\u14c9\u14cc\u14d1\u14c0\u14c7\u14c4\u14cb\u14d6\u149f", -1274276699), hl.a("\u234d\u2348\u2355\u2344\u2343\u2340\u234f\u2352\u230f", 736699169), hl.a("\u97ff\u97fc\u97f3\u97b0\u97f4\u97ed", 1269602205), hl.a("\ub7b3\ub7a8\ub7a4\ub7a7\ub7a8", 294959046), hl.a("\u88c8\u88d3\u88ca\u88dc\u88cf\u88d3", -1737127747), hl.a("\ud32a\ud33b\ud333\ud32e\ud33c\ud33f\ud330\ud337\ud32e", -1741106338), hl.a("\u6e06\u6e05\u6e0a\u6e0d\u6e14", 2124705380), hl.a("\u2188\u2190\u2191\u2180\u218c\u2195", 1097933285), hl.a("\ue80d\ue816\ue815\ue80d\ue80c\ue81d", -993793928), hl.a("\ucaf5\ucae4\ucaec\ucaf1\ucaec\ucaf4\ucaf5\ucae4\ucae8\ucaf1", -688403839), hl.a("\u8458\u8449\u8441\u845c\u8445\u845c\u8441\u8459\u8458\u8449", -1913682900), hl.a("\ud642\ud653\ud65b\ud646\ud65f\ud646\ud654\ud657\ud658", -87304650), hl.a("\u9fd9\u9fc2\u9fce\u9fcd\u9fc2\u9f82\u9fc3\u9fdb\u9fc2", -1159618644), hl.a("\ua041\ua05a\ua059\ua041\ua040\ua051\ua01a\ua05b\ua043\ua05a", 1453957172), hl.a("\u5f7a\u5f61\u5f78\u5f6e\u5f7d\u5f61\u5f21\u5f60\u5f78\u5f61", 761945871), hl.a("\uf44c\uf455\uf448\uf450\uf451\uf440", -1282083803), hl.a("\u35e1\u35f8\u35ea\u35e9\u35e6", 1233925512), hl.a("\u58be\u58af\u58aa\u58bf\u58b3\u58aa", 464476378), hl.a("\u9847\u9840\u9855\u9852\u9852\u985c\u985d\u9847\u9840\u985b\u9846\u984d", 1396283444), hl.a("\u1df9\u1df8\u1de2\u1de5\u1dfe\u1de3\u1de8", -547086959), hl.a("\ub6aa\ub6a7\ub6bf\ub6b8", 171685579), hl.a("LITEBANS\u001aALTS", 674496544), hl.a("\u4b9b\u4b90\u4b9d\u4b9b\u4b93\u4b99\u4b94\u4b8c\u4b8b", 648432632), hl.a("\u34f0\u34f5\u34e8\u34f9\u34fe\u34fd\u34f2\u34ef\u34a6\u34ff\u34f4\u34f9\u34ff\u34f7\u34fd\u34f0\u34e8\u34ef", 1645491356), hl.a("\ufe10\ufe15\ufe08\ufe19\ufe1e\ufe1d\ufe12\ufe0f\ufe46\ufe18\ufe09\ufe0c\ufe19\ufe15\ufe0c", -1797652868), hl.a("\uf88d\uf88c\uf896\uf891", 1312487653), hl.a("\uba66\uba63\uba7e\uba6f\uba68\uba6b\uba64\uba79\uba30\uba62\uba63\uba79\uba7e\uba65\uba78\uba73", -1338394102), hl.a("\u3153\u3154\u3141\u3146\u3146\u3148\u3149\u3153\u3154", -587321056), hl.a("\u8f04\u8f01\u8f1c\u8f0d\u8f0a\u8f09\u8f06\u8f1b\u8f52\u8f1b\u8f1c\u8f09\u8f0e\u8f0e\u8f00\u8f01\u8f1b\u8f1c\u8f07\u8f1a\u8f11", -1614377112), hl.a("\u0f69\u0f6c\u0f71\u0f60\u0f67\u0f64\u0f6b\u0f76\u0f3f", -300871931), hl.a("", -1132096905), hl.a("\u7c50\u7c55\u7c48\u7c59\u7c5e\u7c5d\u7c52\u7c4f\u7c12", 1649048636), hl.a("\u0abc\u0abf\u0ab0\u0af3\u0ab7\u0aae", -1630663970), hl.a("\u4f70\u4f6b\u4f67\u4f64\u4f6b", 440094469), hl.a("\u028c\u0297\u028e\u0298\u028b\u0297", 220332793), hl.a("\uf292\uf283\uf28b\uf296\uf284\uf287\uf288\uf28f\uf296", -1258425626), hl.a("\u094d\u094e\u0941\u0946\u095f", -1322317521), hl.a("\u530b\u5313\u5312\u5303\u530f\u5316", 1343247206), hl.a("\u1c1e\u1c05\u1c06\u1c1e\u1c1f\u1c0e", -1060496277), hl.a("\ue2b7\ue2a6\ue2ae\ue2b3\ue2ae\ue2b6\ue2b7\ue2a6\ue2aa\ue2b3", -124394813), hl.a("\uc41b\uc40a\uc402\uc41f\uc406\uc41f\uc402\uc41a\uc41b\uc40a", 1644414063), hl.a("\u85d6\u85c7\u85cf\u85d2\u85cb\u85d2\u85c0\u85c3\u85cc", 933004706), hl.a("\u1694\u168f\u1683\u1680\u168f\u16cf\u168e\u1696\u168f", -1673980191), hl.a("\u06a6\u06bd\u06be\u06a6\u06a7\u06b6\u06fd\u06bc\u06a4\u06bd", -1762392365), hl.a("\u4aac\u4ab7\u4aae\u4ab8\u4aab\u4ab7\u4af7\u4ab6\u4aae\u4ab7", -338081063), hl.a("\ubf96\ubf8f\ubf92\ubf8a\ubf8b\ubf9a", 0xFFFBFFF), hl.a("\u31f6\u31ef\u31fd\u31fe\u31f1", 1376268703), hl.a("\ue20c\ue21d\ue218\ue20d\ue201\ue218", 1980293736), hl.a("\u8714\u8713\u8706\u8701\u8701\u870f\u870e\u8714\u8713\u8708\u8715\u871e", 1365870439), hl.a("\uaff9\uaff8\uafe2\uafe5\uaffe\uafe3\uafe8", -2118471791), hl.a("\ubd66\ubd6b\ubd73\ubd74", -992756473), hl.a("\u0019\u001c\u0001\u0010\u0017\u0014\u001b\u0006O\u0014\u0019\u0001\u0006", -623574923), hl.a("\u94db\u94d0\u94dd\u94db\u94d3\u94d9\u94d4\u94cc\u94cb", -1466461000), hl.a("\u73da\u73df\u73c2\u73d3\u73d4\u73d7\u73d8\u73c5\u738c\u73d5\u73de\u73d3\u73d5\u73dd\u73d7\u73da\u73c2\u73c5", -549555274), hl.a("\u57f0\u57f5\u57e8\u57f9\u57fe\u57fd\u57f2\u57ef\u57a6\u57f8\u57e9\u57ec\u57f9\u57f5\u57ec", -56797284), hl.a("\u4310\u4311\u430b\u430c", 492585848), hl.a("\uefbc\uefb9\uefa4\uefb5\uefb2\uefb1\uefbe\uefa3\uefea\uefb8\uefb9\uefa3\uefa4\uefbf\uefa2\uefa9", 1758916560), hl.a("\u5feb\u5fec\u5ff9\u5ffe\u5ffe\u5ff0\u5ff1\u5feb\u5fec", 512188312), hl.a("\uccca\ucccf\uccd2\uccc3\uccc4\uccc7\uccc8\uccd5\ucc9c\uccd5\uccd2\uccc7\uccc0\uccc0\uccce\ucccf\uccd5\uccd2\uccc9\uccd4\uccdf", 319736998), hl.a("\u9a6a\u9a6f\u9a72\u9a63\u9a64\u9a67\u9a68\u9a75\u9a3c", 753113606), hl.a("\u1a81\u1a84\u1a99\u1a88\u1a8f\u1a8c\u1a83\u1a9e\u1ac3\u1a99\u1a8c\u1a8f\u1a8e\u1a82\u1a80\u1a9d\u1a81\u1a88\u1a99\u1a88", -1779426579)};
    }

    static {
        G.g();
    }
}

