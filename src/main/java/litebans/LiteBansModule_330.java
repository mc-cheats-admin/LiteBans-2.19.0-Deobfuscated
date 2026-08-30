package litebans;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
public class LiteBansModule_330
implements JsonSerializer,
JsonDeserializer {
    public LiteBansModule_167 BaseCoreGenericHandler(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        if (jsonElement.isJsonArray()) {
            return new LiteBansModule_167((LiteBansModule_432[])jsonDeserializationContext.deserialize(jsonElement, LiteBansModule_432[].class));
        }
        if (jsonElement.isJsonPrimitive()) {
            return new LiteBansModule_167(jsonElement.getAsJsonPrimitive().getAsString());
        }
        return new LiteBansModule_167(new LiteBansModule_432[]{(LiteBansModule_432)jsonDeserializationContext.deserialize(jsonElement, LiteBansModule_432.class)});
    }

    public JsonElement BaseCoreGenericHandler(LiteBansModule_167 ei_02, Type type, JsonSerializationContext jsonSerializationContext) {
        return jsonSerializationContext.serialize(ei_02.BaseCoreGenericHandler());
    }

    public JsonElement serialize(Object object, Type type, JsonSerializationContext jsonSerializationContext) {
        return this.plugin((LiteBansModule_167)object, type, jsonSerializationContext);
    }

    public Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        return this.plugin(jsonElement, type, jsonDeserializationContext);
}

