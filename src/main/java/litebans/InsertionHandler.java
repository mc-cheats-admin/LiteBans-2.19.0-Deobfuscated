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
public class InsertionHandler {
    protected final LiteBansModule_148 BaseCoreGenericHandler;
        protected void BaseCoreGenericHandler(JsonObject jsonObject, LiteBansModule_434 v_02, JsonDeserializationContext jsonDeserializationContext) {
        int n;
        JsonObject jsonObject2;
        boolean flag;
        v_02.BaseCoreGenericHandler((LiteBansModule_370)jsonDeserializationContext.deserialize((JsonElement)jsonObject, LiteBansModule_370.class));
        JsonElement jsonElement = jsonObject.get("insertion");
        if (jsonElement != null) {
            v_02.LiteBansModule_31(jsonElement.getAsString());
        }
        boolean flag2 = flag = (jsonObject2 = jsonObject.getAsJsonObject("click_event")) != null;
        if (!flag) {
            jsonObject2 = jsonObject.getAsJsonObject("clickEvent");
        }
        if (jsonObject2 != null) {
            contextObj = OpenUrlHandler.BaseCoreGenericHandler(jsonObject2.get("action").getAsString().toUpperCase(Locale.ROOT));
            if (flag) {
                switch (LiteBansModule_166.BaseCoreGenericHandler[((Enum)contextObj).ordinal()]) {
                    case 1: {
                        v_02.BaseCoreGenericHandler(new LiteBansModule_379((OpenUrlHandler)((Object)contextObj), jsonObject2.get("url").getAsString()));
                        break;
                    }
                    case 2: 
                    case 3: {
                        v_02.BaseCoreGenericHandler(new LiteBansModule_379((OpenUrlHandler)((Object)contextObj), jsonObject2.get("command").getAsString()));
                        break;
                    }
                    case 4: {
                        n = jsonObject2.get("page").getAsInt();
                        Preconditions.checkArgument((n >= 0 ? 1 : 0) != 0, (Object)"Page number has to be positive");
                        v_02.BaseCoreGenericHandler(new LiteBansModule_379((OpenUrlHandler)((Object)contextObj), Integer.toString(n)));
                        break;
                    }
                    default: {
                        v_02.BaseCoreGenericHandler(new LiteBansModule_379((OpenUrlHandler)((Object)contextObj), jsonObject2.has("value") ? jsonObject2.get("value").getAsString() : ""));
                        break;
                    }
                }
            } else {
                v_02.BaseCoreGenericHandler(new LiteBansModule_379((OpenUrlHandler)((Object)contextObj), jsonObject2.has("value") ? jsonObject2.get("value").getAsString() : ""));
            }
        }
        int n2 = n = (contextObj = jsonObject.getAsJsonObject("hover_event")) != null ? 1 : 0;
        if (n == 0) {
            contextObj = jsonObject.getAsJsonObject("hoverEvent");
        }
        if (contextObj != null) {
            targetObj = null;
            ShowTextHandler eA2 = ShowTextHandler.BaseCoreGenericHandler(contextObj.get("action").getAsString().toUpperCase(Locale.ROOT));
            if (n != 0 || contextObj.has("contents")) {
                JsonElement jsonElement2 = contextObj.get(n != 0 ? "value" : "contents");
                if (jsonElement2 != null) {
                    LiteBansModule_161[] ed_0Array = jsonElement2.isJsonArray() ? (LiteBansModule_161[])jsonDeserializationContext.deserialize(jsonElement2, (Type)ActionHandler.BaseCoreGenericHandler(eA2, true)) : new LiteBansModule_161[]{(LiteBansModule_161)jsonDeserializationContext.deserialize(jsonElement2, (Type)ActionHandler.BaseCoreGenericHandler(eA2, false))};
                    targetObj = new ActionHandler(eA2, new ArrayList<LiteBansModule_161>(Arrays.asList(ed_0Array)));
                }
            } else {
                JsonElement jsonElement3 = contextObj.get("value");
                if (jsonElement3 != null) {
                    LiteBansModule_434[] v_0Array = jsonElement3.isJsonArray() ? (LiteBansModule_434[])jsonDeserializationContext.deserialize(jsonElement3, LiteBansModule_434[].class) : new LiteBansModule_434[]{(LiteBansModule_434)jsonDeserializationContext.deserialize(jsonElement3, LiteBansModule_434.class)};
                    targetObj = new ActionHandler(eA2, v_0Array);
                }
            }
            if (targetObj != null) {
                v_02.BaseCoreGenericHandler((ActionHandler)targetObj);
            }
        }
        if ((targetObj = jsonObject.get("extra")) != null) {
            v_02.BaseCoreGenericHandler(Arrays.asList((LiteBansModule_434[])jsonDeserializationContext.deserialize(targetObj, LiteBansModule_434[].class)));
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected void BaseCoreGenericHandler(JsonObject jsonObject, LiteBansModule_434 v_02, JsonSerializationContext jsonSerializationContext) {
        if (LiteBansModule_148.BaseCoreGenericHandler.get() == null) {
            flag = true;
            LiteBansModule_148.BaseCoreGenericHandler.set(Collections.newSetFromMap(new IdentityHashMap()));
        }
        try {
            JsonObject jsonObject2;
            Preconditions.checkArgument((!((Set)LiteBansModule_148.BaseCoreGenericHandler.get()).contains(v_02) ? 1 : 0) != 0, (Object)"Component loop");
            ((Set)LiteBansModule_148.BaseCoreGenericHandler.get()).add(v_02);
            BoldHandler.BaseCoreGenericHandler(v_02.LiteBansModule_31(), jsonObject);
            if (v_02.AsyncBackgroundTask_21() != null) {
                jsonObject.addProperty("insertion", v_02.AsyncBackgroundTask_21());
            }
            if (v_02.LiteBansModule_195() != null) {
                jsonObject2 = new JsonObject();
                String string = v_02.LiteBansModule_195().BaseCoreGenericHandler().toString().toLowerCase(Locale.ROOT);
                jsonObject2.addProperty("action", string.toLowerCase(Locale.ROOT));
                switch (this.plugin.LiteBansModule_31()) {
                    case BaseCoreGenericHandler: {
                        OpenUrlHandler hm_02 = OpenUrlHandler.BaseCoreGenericHandler(string.toUpperCase(Locale.ROOT));
                        switch (hm_02) {
                            case e: {
                                jsonObject2.addProperty("url", v_02.LiteBansModule_195().c());
                                break;
                            }
                            case g: 
                            case BaseCoreGenericHandler: {
                                jsonObject2.addProperty("command", v_02.LiteBansModule_195().c());
                                break;
                            }
                            case AsyncBackgroundTask_5: {
                                jsonObject2.addProperty("page", (Number)Integer.parseInt(v_02.LiteBansModule_195().c()));
                                break;
                            }
                            default: {
                                jsonObject2.addProperty("value", v_02.LiteBansModule_195().c());
                            }
                        }
                        jsonObject.add("click_event", (JsonElement)jsonObject2);
                        break;
                    }
                    case c: {
                        jsonObject2.addProperty("value", v_02.LiteBansModule_195().c());
                        jsonObject.add("clickEvent", (JsonElement)jsonObject2);
                        break;
                    }
                    default: {
                        throw new IllegalArgumentException("Unknown version " + (Object)((Object)this.plugin.LiteBansModule_31()));
                    }
                }
            }
            if (v_02.LiteBansModule_241() != null) {
                jsonObject2 = new JsonObject();
                jsonObject2.addProperty("action", v_02.LiteBansModule_241().AsyncBackgroundTask_5().toString().toLowerCase(Locale.ROOT));
                if (v_02.LiteBansModule_241().LiteBansModule_31()) {
                    jsonObject2.add("value", jsonSerializationContext.serialize(v_02.LiteBansModule_241().c().get(0)));
                } else {
                    switch (this.plugin.LiteBansModule_31()) {
                        case BaseCoreGenericHandler: {
                            jsonObject2.add("value", jsonSerializationContext.serialize(v_02.LiteBansModule_241().c().size() == 1 ? v_02.LiteBansModule_241().c().get(0) : v_02.LiteBansModule_241().c()));
                            break;
                        }
                        case c: {
                            jsonObject2.add("contents", jsonSerializationContext.serialize(v_02.LiteBansModule_241().c().size() == 1 ? v_02.LiteBansModule_241().c().get(0) : v_02.LiteBansModule_241().c()));
                            break;
                        }
                        default: {
                            throw new IllegalArgumentException("Unknown version " + (Object)((Object)this.plugin.LiteBansModule_31()));
                        }
                    }
                }
                switch (this.plugin.LiteBansModule_31()) {
                    case BaseCoreGenericHandler: {
                        jsonObject.add("hover_event", (JsonElement)jsonObject2);
                        break;
                    }
                    case c: {
                        jsonObject.add("hoverEvent", (JsonElement)jsonObject2);
                        break;
                    }
                    default: {
                        throw new IllegalArgumentException("Unknown version " + (Object)((Object)this.plugin.LiteBansModule_31()));
                    }
                }
            }
            if (v_02.CommandThrottleService() != null) {
                jsonObject.add("extra", jsonSerializationContext.serialize((Object)v_02.CommandThrottleService()));
            }
        }
        finally {
            ((Set)LiteBansModule_148.BaseCoreGenericHandler.get()).remove(v_02);
            if (flag) {
                LiteBansModule_148.BaseCoreGenericHandler.set(null);
            }
        }
    }

    public InsertionHandler(LiteBansModule_148 e22) {
        this.plugin = e22;
    }

    private static final void BaseCoreGenericHandler() {
        LiteBansModule_31 = new String[]{"insertion", "click_event", "clickEvent", "action", "url", "command", "page", "Page number has to be positive", "value", "value", "", "value", "value", "", "hover_event", "hoverEvent", "action", "contents", "value", "contents", "value", "extra", "Component loop", "insertion", "action", "url", "command", "page", "value", "click_event", "value", "clickEvent", "Unknown version ", "action", "value", "value", "contents", "Unknown version ", "hover_event", "hoverEvent", "Unknown version ", "extra"};
    }

    static {
        InsertionHandler.BaseCoreGenericHandler();
    }
}

