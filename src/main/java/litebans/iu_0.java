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

public class iu_0 {
    protected final e2 a;
    private static /* synthetic */ String[] b;

    protected void a(JsonObject jsonObject, v_0 v_02, JsonDeserializationContext jsonDeserializationContext) {
        Object object;
        int n;
        Object object2;
        JsonObject jsonObject2;
        boolean bl;
        v_02.a((ka_0)jsonDeserializationContext.deserialize((JsonElement)jsonObject, ka_0.class));
        JsonElement jsonElement = jsonObject.get("insertion");
        if (jsonElement != null) {
            v_02.b(jsonElement.getAsString());
        }
        boolean bl2 = bl = (jsonObject2 = jsonObject.getAsJsonObject("click_event")) != null;
        if (!bl) {
            jsonObject2 = jsonObject.getAsJsonObject("clickEvent");
        }
        if (jsonObject2 != null) {
            object2 = hm_0.a(jsonObject2.get("action").getAsString().toUpperCase(Locale.ROOT));
            if (bl) {
                switch (eh_0.a[((Enum)object2).ordinal()]) {
                    case 1: {
                        v_02.a(new kf_0((hm_0)((Object)object2), jsonObject2.get("url").getAsString()));
                        break;
                    }
                    case 2: 
                    case 3: {
                        v_02.a(new kf_0((hm_0)((Object)object2), jsonObject2.get("command").getAsString()));
                        break;
                    }
                    case 4: {
                        n = jsonObject2.get("page").getAsInt();
                        Preconditions.checkArgument((n >= 0 ? 1 : 0) != 0, (Object)"Page number has to be positive");
                        v_02.a(new kf_0((hm_0)((Object)object2), Integer.toString(n)));
                        break;
                    }
                    default: {
                        v_02.a(new kf_0((hm_0)((Object)object2), jsonObject2.has("value") ? jsonObject2.get("value").getAsString() : ""));
                        break;
                    }
                }
            } else {
                v_02.a(new kf_0((hm_0)((Object)object2), jsonObject2.has("value") ? jsonObject2.get("value").getAsString() : ""));
            }
        }
        int n2 = n = (object2 = jsonObject.getAsJsonObject("hover_event")) != null ? 1 : 0;
        if (n == 0) {
            object2 = jsonObject.getAsJsonObject("hoverEvent");
        }
        if (object2 != null) {
            object = null;
            eA eA2 = eA.a(object2.get("action").getAsString().toUpperCase(Locale.ROOT));
            if (n != 0 || object2.has("contents")) {
                JsonElement jsonElement2 = object2.get(n != 0 ? "value" : "contents");
                if (jsonElement2 != null) {
                    ed_0[] ed_0Array = jsonElement2.isJsonArray() ? (ed_0[])jsonDeserializationContext.deserialize(jsonElement2, (Type)eu_0.a(eA2, true)) : new ed_0[]{(ed_0)jsonDeserializationContext.deserialize(jsonElement2, (Type)eu_0.a(eA2, false))};
                    object = new eu_0(eA2, new ArrayList<ed_0>(Arrays.asList(ed_0Array)));
                }
            } else {
                JsonElement jsonElement3 = object2.get("value");
                if (jsonElement3 != null) {
                    v_0[] v_0Array = jsonElement3.isJsonArray() ? (v_0[])jsonDeserializationContext.deserialize(jsonElement3, v_0[].class) : new v_0[]{(v_0)jsonDeserializationContext.deserialize(jsonElement3, v_0.class)};
                    object = new eu_0(eA2, v_0Array);
                }
            }
            if (object != null) {
                v_02.a((eu_0)object);
            }
        }
        if ((object = jsonObject.get("extra")) != null) {
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
            Preconditions.checkArgument((!((Set)e2.a.get()).contains(v_02) ? 1 : 0) != 0, (Object)"Component loop");
            ((Set)e2.a.get()).add(v_02);
            dj_0.a(v_02.b(), jsonObject);
            if (v_02.s() != null) {
                jsonObject.addProperty("insertion", v_02.s());
            }
            if (v_02.f() != null) {
                jsonObject2 = new JsonObject();
                String string = v_02.f().a().toString().toLowerCase(Locale.ROOT);
                jsonObject2.addProperty("action", string.toLowerCase(Locale.ROOT));
                switch (this.a.b()) {
                    case a: {
                        hm_0 hm_02 = hm_0.a(string.toUpperCase(Locale.ROOT));
                        switch (hm_02) {
                            case e: {
                                jsonObject2.addProperty("url", v_02.f().c());
                                break;
                            }
                            case g: 
                            case a: {
                                jsonObject2.addProperty("command", v_02.f().c());
                                break;
                            }
                            case d: {
                                jsonObject2.addProperty("page", (Number)Integer.parseInt(v_02.f().c()));
                                break;
                            }
                            default: {
                                jsonObject2.addProperty("value", v_02.f().c());
                            }
                        }
                        jsonObject.add("click_event", (JsonElement)jsonObject2);
                        break;
                    }
                    case c: {
                        jsonObject2.addProperty("value", v_02.f().c());
                        jsonObject.add("clickEvent", (JsonElement)jsonObject2);
                        break;
                    }
                    default: {
                        throw new IllegalArgumentException("Unknown version " + (Object)((Object)this.a.b()));
                    }
                }
            }
            if (v_02.h() != null) {
                jsonObject2 = new JsonObject();
                jsonObject2.addProperty("action", v_02.h().d().toString().toLowerCase(Locale.ROOT));
                if (v_02.h().b()) {
                    jsonObject2.add("value", jsonSerializationContext.serialize(v_02.h().c().get(0)));
                } else {
                    switch (this.a.b()) {
                        case a: {
                            jsonObject2.add("value", jsonSerializationContext.serialize(v_02.h().c().size() == 1 ? v_02.h().c().get(0) : v_02.h().c()));
                            break;
                        }
                        case c: {
                            jsonObject2.add("contents", jsonSerializationContext.serialize(v_02.h().c().size() == 1 ? v_02.h().c().get(0) : v_02.h().c()));
                            break;
                        }
                        default: {
                            throw new IllegalArgumentException("Unknown version " + (Object)((Object)this.a.b()));
                        }
                    }
                }
                switch (this.a.b()) {
                    case a: {
                        jsonObject.add("hover_event", (JsonElement)jsonObject2);
                        break;
                    }
                    case c: {
                        jsonObject.add("hoverEvent", (JsonElement)jsonObject2);
                        break;
                    }
                    default: {
                        throw new IllegalArgumentException("Unknown version " + (Object)((Object)this.a.b()));
                    }
                }
            }
            if (v_02.v() != null) {
                jsonObject.add("extra", jsonSerializationContext.serialize((Object)v_02.v()));
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
        b = new String[]{"insertion", "click_event", "clickEvent", "action", "url", "command", "page", "Page number has to be positive", "value", "value", "", "value", "value", "", "hover_event", "hoverEvent", "action", "contents", "value", "contents", "value", "extra", "Component loop", "insertion", "action", "url", "command", "page", "value", "click_event", "value", "clickEvent", "Unknown version ", "action", "value", "value", "contents", "Unknown version ", "hover_event", "hoverEvent", "Unknown version ", "extra"};
    }

    static {
        iu_0.a();
    }
}

