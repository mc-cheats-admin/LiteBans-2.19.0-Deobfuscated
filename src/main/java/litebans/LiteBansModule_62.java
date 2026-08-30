package litebans;

import java.io.Reader;
import java.io.Writer;
import java.util.LinkedHashMap;
import org.yaml.snakeyaml.Yaml;

public class LiteBansModule_62
extends LiteBansModule_47 {
    private final ThreadLocal LiteBansModule_31 = new AsyncBackgroundTask_5(this);

    @Override
    public void BaseCoreGenericHandler(NullHandler_4 ie_02, Writer writer) {
        ((Yaml)this.LiteBansModule_31.get()).dump((Object)ie_02.AsyncBackgroundTask_5, writer);
    }

    @Override
    public NullHandler_4 BaseCoreGenericHandler(Reader reader) {
        return this.plugin(reader, null);
    }

    @Override
    public NullHandler_4 BaseCoreGenericHandler(Reader reader, NullHandler_4 ie_02) {
        LinkedHashMap linkedHashMap = (LinkedHashMap)((Yaml)this.LiteBansModule_31.get()).loadAs(reader, LinkedHashMap.class);
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap();
        }
        return new NullHandler_4(linkedHashMap, ie_02);
    }
}

