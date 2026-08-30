package litebans;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
public class TextHandler_2
extends InsertionHandler
implements JsonSerializer,
JsonDeserializer {
    public TextHandler_2(LiteBansModule_147 e22) {
        super(e22);
    }

    public HttpHandler BaseCoreGenericHandler(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        HttpHandler w_02 = new HttpHandler();
        JsonObject jsonObject = jsonElement.getAsJsonObject();
        JsonElement jsonElement2 = jsonObject.get("text");
        if (jsonElement2 != null) {
            w_02.c(jsonElement2.getAsString());
        }
        this.plugin(jsonObject, (LiteBansModule_432)w_02, jsonDeserializationContext);
        return w_02;
    }

    public JsonElement BaseCoreGenericHandler(HttpHandler w_02, Type type, JsonSerializationContext jsonSerializationContext) {
        JsonObject jsonObject = new JsonObject();
        this.plugin(jsonObject, (LiteBansModule_432)w_02, jsonSerializationContext);
        jsonObject.addProperty("text", w_02.LiteBansModule_31());
        return jsonObject;
    }

    public JsonElement serialize(Object targetObj, Type type, JsonSerializationContext jsonSerializationContext) {
        return this.plugin((HttpHandler)targetObj, type, jsonSerializationContext);
    }

    public Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        return this.plugin(jsonElement, type, jsonDeserializationContext);
    }

    private static final void LiteBansModule_31() {
        c = new String[]{"text", "text"};
}

