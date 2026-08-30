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
    protected final LiteBansModule_147 BaseCoreGenericHandler;
    protected void BaseCoreGenericHandler(JsonObject jsonObject, LiteBansModule_432 v_02, JsonDeserializationContext jsonDeserializationContext) {
        Object object;
        int n;
        Object object2;
        JsonObject jsonObject2;
        boolean flag;
        v_02.BaseCoreGenericHandler((LiteBansModule_368)jsonDeserializationContext.deserialize((JsonElement)jsonObject, LiteBansModule_368.class));
        JsonElement jsonElement = jsonObject.get("insertion");
        if (jsonElement != null) {
            v_02.LiteBansModule_31(jsonElement.getAsString());
        }
        boolean flag2 = flag = (jsonObject2 = jsonObject.getAsJsonObject("click_event")) != null;
        if (!flag) {
            jsonObject2 = jsonObject.getAsJsonObject("clickEvent");
        }
        if (jsonObject2 != null) {
            object2 = OpenUrlHandler.BaseCoreGenericHandler(jsonObject2.get("action").getAsString().toUpperCase(Locale.ROOT));
            if (flag) {
                switch (LiteBansModule_165.BaseCoreGenericHandler[((Enum)object2).ordinal()]) {
                    case 1: {
                        v_02.BaseCoreGenericHandler(new LiteBansModule_377((OpenUrlHandler)((Object)object2), jsonObject2.get("url").getAsString()));
                        break;
                    }
                    case 2:
                    case 3: {
                        v_02.BaseCoreGenericHandler(new LiteBansModule_377((OpenUrlHandler)((Object)object2), jsonObject2.get("command").getAsString()));
                        break;
                    }
                    case 4: {
                        n = jsonObject2.get("page").getAsInt();
                        Preconditions.checkArgument((n >= 0 ? 1 : 0) != 0, (Object)"Page number has to be positive");
                        v_02.BaseCoreGenericHandler(new LiteBansModule_377((OpenUrlHandler)((Object)object2), Integer.toString(n)));
                        break;
                    }
                    default: {
                        v_02.BaseCoreGenericHandler(new LiteBansModule_377((OpenUrlHandler)((Object)object2), jsonObject2.has("value") ? jsonObject2.get("value").getAsString() : ""));
                        break;
} else {
                v_02.BaseCoreGenericHandler(new LiteBansModule_377((OpenUrlHandler)((Object)object2), jsonObject2.has("value") ? jsonObject2.get("value").getAsString() : ""));
}
        int n2 = n = (object2 = jsonObject.getAsJsonObject("hover_event")) != null ? 1 : 0;
        if (n == 0) {
            object2 = jsonObject.getAsJsonObject("hoverEvent");
        }
        if (object2 != null) {
            object = null;
            ShowTextHandler eA2 = ShowTextHandler.BaseCoreGenericHandler(object2.get("action").getAsString().toUpperCase(Locale.ROOT));
            if (n != 0 || object2.has("contents")) {
                JsonElement jsonElement2 = object2.get(n != 0 ? "value" : "contents");
                if (jsonElement2 != null) {
                    LiteBansModule_160[] ed_0Array = jsonElement2.isJsonArray() ? (LiteBansModule_160[])jsonDeserializationContext.deserialize(jsonElement2, (Type)ActionHandler.BaseCoreGenericHandler(eA2, true)) : new LiteBansModule_160[]{(LiteBansModule_160)jsonDeserializationContext.deserialize(jsonElement2, (Type)ActionHandler.BaseCoreGenericHandler(eA2, false))};
                    object = new ActionHandler(eA2, new ArrayList<LiteBansModule_160>(Arrays.asList(ed_0Array)));
} else {
                JsonElement jsonElement3 = object2.get("value");
                if (jsonElement3 != null) {
                    LiteBansModule_432[] v_0Array = jsonElement3.isJsonArray() ? (LiteBansModule_432[])jsonDeserializationContext.deserialize(jsonElement3, LiteBansModule_432[].class) : new LiteBansModule_432[]{(LiteBansModule_432)jsonDeserializationContext.deserialize(jsonElement3, LiteBansModule_432.class)};
                    object = new ActionHandler(eA2, v_0Array);
}
            if (object != null) {
                v_02.BaseCoreGenericHandler((ActionHandler)object);
}
        if ((object = jsonObject.get("extra")) != null) {
            v_02.BaseCoreGenericHandler(Arrays.asList((LiteBansModule_432[])jsonDeserializationContext.deserialize(object, LiteBansModule_432[].class)));
}

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected void BaseCoreGenericHandler(JsonObject jsonObject, LiteBansModule_432 v_02, JsonSerializationContext jsonSerializationContext) {
        if (LiteBansModule_147.BaseCoreGenericHandler.get() == null) {
            flag = true;
            LiteBansModule_147.BaseCoreGenericHandler.set(Collections.newSetFromMap(new IdentityHashMap()));
        }
        try {
            JsonObject jsonObject2;
            Preconditions.checkArgument((!((Set)LiteBansModule_147.BaseCoreGenericHandler.get()).contains(v_02) ? 1 : 0) != 0, (Object)"Component loop");
            ((Set)LiteBansModule_147.BaseCoreGenericHandler.get()).add(v_02);
            BoldHandler.BaseCoreGenericHandler(v_02.LiteBansModule_31(), jsonObject);
            if (v_02.AsyncBackgroundTask_21() != null) {
                jsonObject.addProperty("insertion", v_02.AsyncBackgroundTask_21());
            }
            if (v_02.LiteBansModule_194() != null) {
                jsonObject2 = new JsonObject();
                String string = v_02.LiteBansModule_194().BaseCoreGenericHandler().toString().toLowerCase(Locale.ROOT);
                jsonObject2.addProperty("action", string.toLowerCase(Locale.ROOT));
                switch (this.plugin.LiteBansModule_31()) {
                    case BaseCoreGenericHandler: {
                        OpenUrlHandler hm_02 = OpenUrlHandler.BaseCoreGenericHandler(string.toUpperCase(Locale.ROOT));
                        switch (hm_02) {
                            case e: {
                                jsonObject2.addProperty("url", v_02.LiteBansModule_194().c());
                                break;
                            }
                            case g:
                            case BaseCoreGenericHandler: {
                                jsonObject2.addProperty("command", v_02.LiteBansModule_194().c());
                                break;
                            }
                            case AsyncBackgroundTask_5: {
                                jsonObject2.addProperty("page", (Number)Integer.parseInt(v_02.LiteBansModule_194().c()));
                                break;
                            }
                            default: {
                                jsonObject2.addProperty("value", v_02.LiteBansModule_194().c());
}
                        jsonObject.add("click_event", (JsonElement)jsonObject2);
                        break;
                    }
                    case c: {
                        jsonObject2.addProperty("value", v_02.LiteBansModule_194().c());
                        jsonObject.add("clickEvent", (JsonElement)jsonObject2);
                        break;
                    }
                    default: {
                        throw new IllegalArgumentException("Unknown version " + (Object)((Object)this.plugin.LiteBansModule_31()));
}
            if (v_02.LiteBansModule_240() != null) {
                jsonObject2 = new JsonObject();
                jsonObject2.addProperty("action", v_02.LiteBansModule_240().AsyncBackgroundTask_5().toString().toLowerCase(Locale.ROOT));
                if (v_02.LiteBansModule_240().LiteBansModule_31()) {
                    jsonObject2.add("value", jsonSerializationContext.serialize(v_02.LiteBansModule_240().c().get(0)));
                } else {
                    switch (this.plugin.LiteBansModule_31()) {
                        case BaseCoreGenericHandler: {
                            jsonObject2.add("value", jsonSerializationContext.serialize(v_02.LiteBansModule_240().c().size() == 1 ? v_02.LiteBansModule_240().c().get(0) : v_02.LiteBansModule_240().c()));
                            break;
                        }
                        case c: {
                            jsonObject2.add("contents", jsonSerializationContext.serialize(v_02.LiteBansModule_240().c().size() == 1 ? v_02.LiteBansModule_240().c().get(0) : v_02.LiteBansModule_240().c()));
                            break;
                        }
                        default: {
                            throw new IllegalArgumentException("Unknown version " + (Object)((Object)this.plugin.LiteBansModule_31()));
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
            if (v_02.CommandThrottleService() != null) {
                jsonObject.add("extra", jsonSerializationContext.serialize((Object)v_02.CommandThrottleService()));
}
        finally {
            ((Set)LiteBansModule_147.BaseCoreGenericHandler.get()).remove(v_02);
            if (flag) {
                LiteBansModule_147.BaseCoreGenericHandler.set(null);
}

    public InsertionHandler(LiteBansModule_147 e22) {
        this.plugin = e22;
}

