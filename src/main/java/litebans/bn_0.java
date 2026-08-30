package litebans;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.Reader;
import java.io.Writer;
import java.util.LinkedHashMap;
import litebans.bg_0;
import litebans.cw_0;
import litebans.ie_0;

/*
 * Renamed from litebans.bn
 */
public static class bn_0
extends bg_0 {
    private final Gson b = new GsonBuilder().serializeNulls().setPrettyPrinting().registerTypeAdapter(ie_0.class, (Object)new cw_0(this)).create();

    @Override
    public void a(ie_0 ie_02, Writer writer) {
        this.b.toJson((Object)ie_02.d, (Appendable)writer);
    }

    @Override
    public ie_0 a(Reader reader) {
        return this.a(reader, null);
    }

    @Override
    public ie_0 a(Reader reader, ie_0 ie_02) {
        LinkedHashMap linkedHashMap = (LinkedHashMap)this.b.fromJson(reader, LinkedHashMap.class);
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap();
        }
        return new ie_0(linkedHashMap, ie_02);
    }
}

