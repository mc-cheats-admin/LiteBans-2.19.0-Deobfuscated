package litebans;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import litebans.e2;
import litebans.hl;
import litebans.iu_0;
import litebans.v_0;
import litebans.w_0;

/*
 * Renamed from litebans.ix
 */
public static class ix_0
extends iu_0
implements JsonSerializer,
JsonDeserializer {
    private static /* synthetic */ String[] c;

    public ix_0(e2 e22) {
        super(e22);
    }

    public w_0 a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        w_0 w_02 = new w_0();
        JsonObject jsonObject = jsonElement.getAsJsonObject();
        JsonElement jsonElement2 = jsonObject.get(c[0]);
        if (jsonElement2 != null) {
            w_02.c(jsonElement2.getAsString());
        }
        this.a(jsonObject, (v_0)w_02, jsonDeserializationContext);
        return w_02;
    }

    public JsonElement a(w_0 w_02, Type type, JsonSerializationContext jsonSerializationContext) {
        JsonObject jsonObject = new JsonObject();
        this.a(jsonObject, (v_0)w_02, jsonSerializationContext);
        jsonObject.addProperty(c[1], w_02.b());
        return jsonObject;
    }

    public JsonElement serialize(Object object, Type type, JsonSerializationContext jsonSerializationContext) {
        return this.a((w_0)object, type, jsonSerializationContext);
    }

    public Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        return this.a(jsonElement, type, jsonDeserializationContext);
    }

    private static final void b() {
        c = new String[]{hl.a("\u9f57\u9f46\u9f5b\u9f57", -1914200285), hl.a("\ua37d\ua36c\ua371\ua37d", 1177527049)};
    }

    static {
        ix_0.b();
    }
}

