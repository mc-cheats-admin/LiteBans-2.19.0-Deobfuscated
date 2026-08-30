package litebans;

import java.io.Reader;
import java.io.Writer;
import java.util.LinkedHashMap;
import litebans.bg_0;
import litebans.d;
import litebans.ie_0;
import org.yaml.snakeyaml.Yaml;

public class by_0
extends bg_0 {
    private final ThreadLocal b = new d(this);

    @Override
    public void a(ie_0 ie_02, Writer writer) {
        ((Yaml)this.b.get()).dump((Object)ie_02.d, writer);
    }

    @Override
    public ie_0 a(Reader reader) {
        return this.a(reader, null);
    }

    @Override
    public ie_0 a(Reader reader, ie_0 ie_02) {
        LinkedHashMap linkedHashMap = (LinkedHashMap)((Yaml)this.b.get()).loadAs(reader, LinkedHashMap.class);
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap();
        }
        return new ie_0(linkedHashMap, ie_02);
    }
}

