package litebans;

import com.google.common.base.Preconditions;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Locale;
import java.util.Set;
import litebans.dj_0;
import litebans.e2;
import litebans.eA;
import litebans.ed_0;
import litebans.eh_0;
import litebans.eu_0;
import litebans.hl;
import litebans.hm_0;
import litebans.ka_0;
import litebans.kf_0;
import litebans.v_0;

/*
 * Renamed from litebans.iu
 */
public static class iu_0 {
    protected final e2 a;
    private static /* synthetic */ String[] b;

    protected void a(JsonObject jsonObject, v_0 v_02, JsonDeserializationContext jsonDeserializationContext) {
        Object object;
        int n;
        Object object2;
        JsonObject jsonObject2;
        boolean bl;
        v_02.a((ka_0)jsonDeserializationContext.deserialize((JsonElement)jsonObject, ka_0.class));
        JsonElement jsonElement = jsonObject.get(b[0]);
        if (jsonElement != null) {
            v_02.b(jsonElement.getAsString());
        }
        boolean bl2 = bl = (jsonObject2 = jsonObject.getAsJsonObject(b[1])) != null;
        if (!bl) {
            jsonObject2 = jsonObject.getAsJsonObject(b[2]);
        }
        if (jsonObject2 != null) {
            object2 = hm_0.a(jsonObject2.get(b[3]).getAsString().toUpperCase(Locale.ROOT));
            if (bl) {
                switch (eh_0.a[((Enum)object2).ordinal()]) {
                    case 1: {
                        v_02.a(new kf_0((hm_0)((Object)object2), jsonObject2.get(b[4]).getAsString()));
                        break;
                    }
                    case 2: 
                    case 3: {
                        v_02.a(new kf_0((hm_0)((Object)object2), jsonObject2.get(b[5]).getAsString()));
                        break;
                    }
                    case 4: {
                        n = jsonObject2.get(b[6]).getAsInt();
                        Preconditions.checkArgument((n >= 0 ? 1 : 0) != 0, (Object)b[7]);
                        v_02.a(new kf_0((hm_0)((Object)object2), Integer.toString(n)));
                        break;
                    }
                    default: {
                        v_02.a(new kf_0((hm_0)((Object)object2), jsonObject2.has(b[8]) ? jsonObject2.get(b[9]).getAsString() : b[10]));
                        break;
                    }
                }
            } else {
                v_02.a(new kf_0((hm_0)((Object)object2), jsonObject2.has(b[11]) ? jsonObject2.get(b[12]).getAsString() : b[13]));
            }
        }
        int n2 = n = (object2 = jsonObject.getAsJsonObject(b[14])) != null ? 1 : 0;
        if (n == 0) {
            object2 = jsonObject.getAsJsonObject(b[15]);
        }
        if (object2 != null) {
            object = null;
            eA eA2 = eA.a(object2.get(b[16]).getAsString().toUpperCase(Locale.ROOT));
            if (n != 0 || object2.has(b[17])) {
                JsonElement jsonElement2 = object2.get(n != 0 ? b[18] : b[19]);
                if (jsonElement2 != null) {
                    ed_0[] ed_0Array = jsonElement2.isJsonArray() ? (ed_0[])jsonDeserializationContext.deserialize(jsonElement2, (Type)eu_0.a(eA2, true)) : new ed_0[]{(ed_0)jsonDeserializationContext.deserialize(jsonElement2, (Type)eu_0.a(eA2, false))};
                    object = new eu_0(eA2, new ArrayList<ed_0>(Arrays.asList(ed_0Array)));
                }
            } else {
                JsonElement jsonElement3 = object2.get(b[20]);
                if (jsonElement3 != null) {
                    v_0[] v_0Array = jsonElement3.isJsonArray() ? (v_0[])jsonDeserializationContext.deserialize(jsonElement3, v_0[].class) : new v_0[]{(v_0)jsonDeserializationContext.deserialize(jsonElement3, v_0.class)};
                    object = new eu_0(eA2, v_0Array);
                }
            }
            if (object != null) {
                v_02.a((eu_0)object);
            }
        }
        if ((object = jsonObject.get(b[21])) != null) {
            v_02.a(Arrays.asList((v_0[])jsonDeserializationContext.deserialize(object, v_0[].class)));
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected void a(JsonObject jsonObject, v_0 v_02, JsonSerializationContext jsonSerializationContext) {
        boolean bl = false;
        if (e2.a.get() == null) {
            bl = true;
            e2.a.set(Collections.newSetFromMap(new IdentityHashMap()));
        }
        try {
            JsonObject jsonObject2;
            Preconditions.checkArgument((!((Set)e2.a.get()).contains(v_02) ? 1 : 0) != 0, (Object)b[22]);
            ((Set)e2.a.get()).add(v_02);
            dj_0.a(v_02.b(), jsonObject);
            if (v_02.s() != null) {
                jsonObject.addProperty(b[23], v_02.s());
            }
            if (v_02.f() != null) {
                jsonObject2 = new JsonObject();
                String string = v_02.f().a().toString().toLowerCase(Locale.ROOT);
                jsonObject2.addProperty(b[24], string.toLowerCase(Locale.ROOT));
                switch (this.a.b()) {
                    case a: {
                        hm_0 hm_02 = hm_0.a(string.toUpperCase(Locale.ROOT));
                        switch (hm_02) {
                            case e: {
                                jsonObject2.addProperty(b[25], v_02.f().c());
                                break;
                            }
                            case g: 
                            case a: {
                                jsonObject2.addProperty(b[26], v_02.f().c());
                                break;
                            }
                            case d: {
                                jsonObject2.addProperty(b[27], (Number)Integer.parseInt(v_02.f().c()));
                                break;
                            }
                            default: {
                                jsonObject2.addProperty(b[28], v_02.f().c());
                            }
                        }
                        jsonObject.add(b[29], (JsonElement)jsonObject2);
                        break;
                    }
                    case c: {
                        jsonObject2.addProperty(b[30], v_02.f().c());
                        jsonObject.add(b[31], (JsonElement)jsonObject2);
                        break;
                    }
                    default: {
                        throw new IllegalArgumentException(b[32] + (Object)((Object)this.a.b()));
                    }
                }
            }
            if (v_02.h() != null) {
                jsonObject2 = new JsonObject();
                jsonObject2.addProperty(b[33], v_02.h().d().toString().toLowerCase(Locale.ROOT));
                if (v_02.h().b()) {
                    jsonObject2.add(b[34], jsonSerializationContext.serialize(v_02.h().c().get(0)));
                } else {
                    switch (this.a.b()) {
                        case a: {
                            jsonObject2.add(b[35], jsonSerializationContext.serialize(v_02.h().c().size() == 1 ? v_02.h().c().get(0) : v_02.h().c()));
                            break;
                        }
                        case c: {
                            jsonObject2.add(b[36], jsonSerializationContext.serialize(v_02.h().c().size() == 1 ? v_02.h().c().get(0) : v_02.h().c()));
                            break;
                        }
                        default: {
                            throw new IllegalArgumentException(b[37] + (Object)((Object)this.a.b()));
                        }
                    }
                }
                switch (this.a.b()) {
                    case a: {
                        jsonObject.add(b[38], (JsonElement)jsonObject2);
                        break;
                    }
                    case c: {
                        jsonObject.add(b[39], (JsonElement)jsonObject2);
                        break;
                    }
                    default: {
                        throw new IllegalArgumentException(b[40] + (Object)((Object)this.a.b()));
                    }
                }
            }
            if (v_02.v() != null) {
                jsonObject.add(b[41], jsonSerializationContext.serialize((Object)v_02.v()));
            }
        }
        finally {
            ((Set)e2.a.get()).remove(v_02);
            if (bl) {
                e2.a.set(null);
            }
        }
    }

    public iu_0(e2 e22) {
        this.a = e22;
    }

    private static final void a() {
        b = new String[]{hl.a("\u6c23\u6c24\u6c39\u6c2f\u6c38\u6c3e\u6c23\u6c25\u6c24", 1015639114), hl.a("\ub7c6\ub7c9\ub7cc\ub7c6\ub7ce\ub7fa\ub7c0\ub7d3\ub7c0\ub7cb\ub7d1", -137119835), hl.a("\u2176\u2179\u217c\u2176\u217e\u2150\u2163\u2170\u217b\u2161", 2036605205), hl.a("\u0b15\u0b17\u0b00\u0b1d\u0b1b\u0b1a", -391967884), hl.a("\u33e6\u33e1\u33ff", -1996213357), hl.a("\ube23\ube2f\ube2d\ube2d\ube21\ube2e\ube24", 1084931648), hl.a("\uf311\uf300\uf306\uf304", 564130657), hl.a("\uac9f\uacae\uaca8\uacaa\uacef\uaca1\uacba\uaca2\uacad\uacaa\uacbd\uacef\uaca7\uacae\uacbc\uacef\uacbb\uaca0\uacef\uacad\uacaa\uacef\uacbf\uaca0\uacbc\uaca6\uacbb\uaca6\uacb9\uacaa", -1150440241), hl.a("\ufd55\ufd42\ufd4f\ufd56\ufd46", -2120680157), hl.a("\uc931\uc926\uc92b\uc932\uc922", 1524418887), hl.a("", 1454058150), hl.a("\u141e\u1409\u1404\u141d\u140d", -1225059224), hl.a("\u96b5\u96a2\u96af\u96b6\u96a6", -2081319229), hl.a("", -762340917), hl.a("\u7538\u753f\u7526\u7535\u7522\u750f\u7535\u7526\u7535\u753e\u7524", 1340634448), hl.a("\u3595\u3592\u358b\u3598\u358f\u35b8\u358b\u3598\u3593\u3589", 821179901), hl.a("\u53a5\u53a7\u53b0\u53ad\u53ab\u53aa", 599020484), hl.a("\u9266\u926a\u926b\u9271\u9260\u926b\u9271\u9276", -1219718651), hl.a("\ue629\ue63e\ue633\ue62a\ue63a", 1496573535), hl.a("\u8a63\u8a6f\u8a6e\u8a74\u8a65\u8a6e\u8a74\u8a73", 1468172800), hl.a("\ub3ae\ub3b9\ub3b4\ub3ad\ub3bd", -93408296), hl.a("\u0a8d\u0a90\u0a9c\u0a9a\u0a89", -168097048), hl.a("\ud2c0\ud2ec\ud2ee\ud2f3\ud2ec\ud2ed\ud2e6\ud2ed\ud2f7\ud2a3\ud2ef\ud2ec\ud2ec\ud2f3", -1264070013), hl.a("\uce91\uce96\uce8b\uce9d\uce8a\uce8c\uce91\uce97\uce96", -807874824), hl.a("\u5b3a\u5b38\u5b2f\u5b32\u5b34\u5b35", 1733843803), hl.a("\ue437\ue430\ue42e", -1054743486), hl.a("\uba20\uba2c\uba2e\uba2e\uba22\uba2d\uba27", 723958339), hl.a("\u3e7b\u3e6a\u3e6c\u3e6e", -467583477), hl.a("\ua5e1\ua5f6\ua5fb\ua5e2\ua5f2", -99048041), hl.a("\u5e0c\u5e03\u5e06\u5e0c\u5e04\u5e30\u5e0a\u5e19\u5e0a\u5e01\u5e1b", 503668335), hl.a("\ua453\ua444\ua449\ua450\ua440", 990356517), hl.a("\u9082\u908d\u9088\u9082\u908a\u90a4\u9097\u9084\u908f\u9095", 857182433), hl.a("\u4073\u4048\u404d\u4048\u4049\u4051\u4048\u4006\u4050\u4043\u4054\u4055\u404f\u4049\u4048\u4006", 848445478), hl.a("\u6795\u6797\u6780\u679d\u679b\u679a", -635213836), hl.a("\u1814\u1803\u180e\u1817\u1807", 884152418), hl.a("\ubafd\ubaea\ubae7\ubafe\ubaee", 1891154571), hl.a("\u1f95\u1f99\u1f98\u1f82\u1f93\u1f98\u1f82\u1f85", -1037754378), hl.a("\ua257\ua26c\ua269\ua26c\ua26d\ua275\ua26c\ua222\ua274\ua267\ua270\ua271\ua26b\ua26d\ua26c\ua222", 5743106), hl.a("\u9627\u9620\u9639\u962a\u963d\u9610\u962a\u9639\u962a\u9621\u963b", -1582721457), hl.a("\u1f73\u1f74\u1f6d\u1f7e\u1f69\u1f5e\u1f6d\u1f7e\u1f75\u1f6f", 2080775963), hl.a("\u8fda\u8fe1\u8fe4\u8fe1\u8fe0\u8ff8\u8fe1\u8faf\u8ff9\u8fea\u8ffd\u8ffc\u8fe6\u8fe0\u8fe1\u8faf", 1159761807), hl.a("\uf1ce\uf1d3\uf1df\uf1d9\uf1ca", -159059541)};
    }

    static {
        iu_0.a();
    }
}

