package litebans;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.Reader;
import java.io.Writer;
import java.util.LinkedHashMap;
public class LiteBansModule_54
extends LiteBansModule_47 {
    private final Gson LiteBansModule_31 = new GsonBuilder().serializeNulls().setPrettyPrinting().registerTypeAdapter(NullHandler_4.class, new LiteBansModule_106(this)).create();

    @Override
    public void BaseCoreGenericHandler(NullHandler_4 ie_02, Writer writer) {
        this.LiteBansModule_31.toJson(ie_02.AsyncBackgroundTask_5, (Appendable)writer);
    }

    @Override
    public NullHandler_4 BaseCoreGenericHandler(Reader reader) {
        return this.plugin(reader, null);
    }

    @Override
    public NullHandler_4 BaseCoreGenericHandler(Reader reader, NullHandler_4 ie_02) {
        LinkedHashMap linkedHashMap = this.LiteBansModule_31.fromJson(reader, LinkedHashMap.class);
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap();
        }
        return new NullHandler_4(linkedHashMap, ie_02);
}

