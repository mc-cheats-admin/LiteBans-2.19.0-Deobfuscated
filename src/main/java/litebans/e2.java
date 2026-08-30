package litebans;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import java.lang.reflect.Type;
import litebans.dj_0;
import litebans.ei_0;
import litebans.g8;
import litebans.hl;
import litebans.ix_0;
import litebans.j4;
import litebans.ka_0;
import litebans.v_0;
import litebans.w_0;

public class e2
implements JsonDeserializer {
    private final Gson e;
    private final g8 f;
    private static final e2 d;
    private static final e2 c;
    public static final ThreadLocal a;
    private static /* synthetic */ String[] b;

    public e2(g8 g82) {
        this.f = g82;
        this.e = new GsonBuilder().registerTypeAdapter(v_0.class, (Object)this).registerTypeAdapter(w_0.class, (Object)new ix_0(this)).registerTypeAdapter(ka_0.class, (Object)new dj_0()).registerTypeAdapter(ei_0.class, (Object)new j4()).create();
    }

    public static e2 a(g8 g82) {
        switch (g82) {
            case c: {
                return d;
            }
            case a: {
                return c;
            }
        }
        throw new IllegalArgumentException("Unknown version " + (Object)((Object)g82));
    }

    @Deprecated
    public static e2 a() {
        return d;
    }

    public v_0[] a(String string) {
        JsonElement jsonElement = JsonParser.parseString((String)string);
        if (jsonElement.isJsonArray()) {
            return (v_0[])this.e.fromJson(jsonElement, v_0[].class);
        }
        return new v_0[]{(v_0)this.e.fromJson(jsonElement, v_0.class)};
    }

    public String a(v_0[] v_0Array) {
        if (v_0Array.length == 1) {
            return this.e.toJson((Object)v_0Array[0]);
        }
        return this.e.toJson((Object)new w_0(v_0Array));
    }

    public v_0 a(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        if (jsonElement.isJsonPrimitive()) {
            return new w_0(jsonElement.getAsString());
        }
        return (v_0)jsonDeserializationContext.deserialize(jsonElement, w_0.class);
    }

    public g8 b() {
        return this.f;
    }

    public Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        return this.a(jsonElement, type, jsonDeserializationContext);
    }

    static {
        e2.c();
        d = new e2(g8.c);
        c = new e2(g8.a);
        a = new ThreadLocal();
    }

    private static final void c() {
        b = new String[]{"Unknown version "};
    }
}

