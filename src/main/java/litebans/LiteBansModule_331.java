package litebans;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
public class LiteBansModule_331
implements JsonSerializer,
JsonDeserializer {
    public LiteBansModule_168 BaseCoreGenericHandler(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        if (jsonElement.isJsonArray()) {
            return new LiteBansModule_168((LiteBansModule_434[])jsonDeserializationContext.deserialize(jsonElement, LiteBansModule_434[].class));
        }
        if (jsonElement.isJsonPrimitive()) {
            return new LiteBansModule_168(jsonElement.getAsJsonPrimitive().getAsString());
        }
        return new LiteBansModule_168(new LiteBansModule_434[]{(LiteBansModule_434)jsonDeserializationContext.deserialize(jsonElement, LiteBansModule_434.class)});
    }

    public JsonElement BaseCoreGenericHandler(LiteBansModule_168 ei_02, Type type, JsonSerializationContext jsonSerializationContext) {
        return jsonSerializationContext.serialize(ei_02.BaseCoreGenericHandler());
    }

    public JsonElement serialize(Object targetObj, Type type, JsonSerializationContext jsonSerializationContext) {
        return this.plugin((LiteBansModule_168)targetObj, type, jsonSerializationContext);
    }

    public Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        return this.plugin(jsonElement, type, jsonDeserializationContext);
    }
}

