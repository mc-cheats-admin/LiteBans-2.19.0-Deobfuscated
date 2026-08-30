package litebans;

import com.google.gson.JsonElement;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
static class LiteBansModule_107
implements JsonSerializer {
    final /* synthetic */ LiteBansModule_54 BaseCoreGenericHandler;

    LiteBansModule_107(LiteBansModule_54 bn_02) {
        this.plugin = bn_02;
    }

    public JsonElement BaseCoreGenericHandler(NullHandler_4 ie_02, Type type, JsonSerializationContext jsonSerializationContext) {
        return jsonSerializationContext.serialize((Object)ie_02.AsyncBackgroundTask_5);
    }

    public JsonElement serialize(Object targetObj, Type type, JsonSerializationContext jsonSerializationContext) {
        return this.plugin((NullHandler_4)targetObj, type, jsonSerializationContext);
    }
}

