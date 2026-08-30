package litebans;

import com.google.gson.JsonElement;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import litebans.bn_0;
import litebans.ie_0;

static class cw_0
implements JsonSerializer {
    final /* synthetic */ bn_0 a;

    cw_0(bn_0 bn_02) {
        this.a = bn_02;
    }

    public JsonElement a(ie_0 ie_02, Type type, JsonSerializationContext jsonSerializationContext) {
        return jsonSerializationContext.serialize((Object)ie_02.d);
    }

    public JsonElement serialize(Object object, Type type, JsonSerializationContext jsonSerializationContext) {
        return this.a((ie_0)object, type, jsonSerializationContext);
    }
}

