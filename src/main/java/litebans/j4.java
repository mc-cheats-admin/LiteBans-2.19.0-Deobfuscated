package litebans;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import litebans.ei_0;
import litebans.v_0;

public class j4
implements JsonSerializer,
JsonDeserializer {
    public ei_0 a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        if (jsonElement.isJsonArray()) {
            return new ei_0((v_0[])jsonDeserializationContext.deserialize(jsonElement, v_0[].class));
        }
        if (jsonElement.isJsonPrimitive()) {
            return new ei_0(jsonElement.getAsJsonPrimitive().getAsString());
        }
        return new ei_0(new v_0[]{(v_0)jsonDeserializationContext.deserialize(jsonElement, v_0.class)});
    }

    public JsonElement a(ei_0 ei_02, Type type, JsonSerializationContext jsonSerializationContext) {
        return jsonSerializationContext.serialize(ei_02.a());
    }

    public JsonElement serialize(Object object, Type type, JsonSerializationContext jsonSerializationContext) {
        return this.a((ei_0)object, type, jsonSerializationContext);
    }

    public Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        return this.a(jsonElement, type, jsonDeserializationContext);
    }
}

