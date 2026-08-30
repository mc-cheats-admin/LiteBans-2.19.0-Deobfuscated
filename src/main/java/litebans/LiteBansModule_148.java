package litebans;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import java.lang.reflect.Type;
public class LiteBansModule_148
implements JsonDeserializer {
    private final Gson e;
    private final V116Handler LiteBansModule_195;
    private static final LiteBansModule_148 AsyncBackgroundTask_5;
    private static final LiteBansModule_148 c;
    public static final ThreadLocal BaseCoreGenericHandler;
        public LiteBansModule_148(V116Handler g82) {
        this.LiteBansModule_195 = g82;
        this.e = new GsonBuilder().registerTypeAdapter(LiteBansModule_434.class, (Object)this).registerTypeAdapter(HttpHandler.class, (Object)new TextHandler_2(this)).registerTypeAdapter(LiteBansModule_370.class, (Object)new BoldHandler()).registerTypeAdapter(LiteBansModule_168.class, (Object)new LiteBansModule_331()).create();
    }

    public static LiteBansModule_148 BaseCoreGenericHandler(V116Handler g82) {
        switch (g82) {
            case c: {
                return AsyncBackgroundTask_5;
            }
            case BaseCoreGenericHandler: {
                return c;
            }
        }
        throw new IllegalArgumentException("Unknown version " + (Object)((Object)g82));
    }

    @Deprecated
    public static LiteBansModule_148 BaseCoreGenericHandler() {
        return AsyncBackgroundTask_5;
    }

    public LiteBansModule_434[] BaseCoreGenericHandler(String string) {
        JsonElement jsonElement = JsonParser.parseString((String)string);
        if (jsonElement.isJsonArray()) {
            return (LiteBansModule_434[])this.e.fromJson(jsonElement, LiteBansModule_434[].class);
        }
        return new LiteBansModule_434[]{(LiteBansModule_434)this.e.fromJson(jsonElement, LiteBansModule_434.class)};
    }

    public String BaseCoreGenericHandler(LiteBansModule_434[] v_0Array) {
        if (v_0Array.length == 1) {
            return this.e.toJson((Object)v_0Array[0]);
        }
        return this.e.toJson((Object)new HttpHandler(v_0Array));
    }

    public LiteBansModule_434 BaseCoreGenericHandler(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        if (jsonElement.isJsonPrimitive()) {
            return new HttpHandler(jsonElement.getAsString());
        }
        return (LiteBansModule_434)jsonDeserializationContext.deserialize(jsonElement, HttpHandler.class);
    }

    public V116Handler LiteBansModule_31() {
        return this.LiteBansModule_195;
    }

    public Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        return this.plugin(jsonElement, type, jsonDeserializationContext);
    }

    static {
        LiteBansModule_148.c();
        AsyncBackgroundTask_5 = new LiteBansModule_148(V116Handler.c);
        c = new LiteBansModule_148(V116Handler.BaseCoreGenericHandler);
        BaseCoreGenericHandler = new ThreadLocal();
    }

    private static final void c() {
        LiteBansModule_31 = new String[]{"Unknown version "};
    }
}

