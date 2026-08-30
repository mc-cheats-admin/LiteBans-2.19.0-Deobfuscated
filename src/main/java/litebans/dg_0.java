package litebans;

import java.io.Reader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Supplier;
import litebans.et_0;
import org.jetbrains.annotations.NotNull;
import org.yaml.snakeyaml.DumperOptions;
import org.yaml.snakeyaml.LoaderOptions;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.BaseConstructor;
import org.yaml.snakeyaml.constructor.Constructor;
import org.yaml.snakeyaml.representer.Representer;

public final class dg_0
implements Supplier {
    private final Reader a;
    private final Map b;

    public dg_0(@NotNull Reader reader) {
        this.a = reader;
        DumperOptions dumperOptions = new DumperOptions();
        dumperOptions.setDefaultFlowStyle(DumperOptions.FlowStyle.BLOCK);
        Representer representer = new et_0(dumperOptions);
        Yaml yaml = new Yaml((BaseConstructor)new Constructor(new LoaderOptions()), representer, dumperOptions);
        Map map = (Map)yaml.loadAs(this.a, LinkedHashMap.class);
        if (map == null) {
            map = new LinkedHashMap();
        }
        this.b = map;
    }

    public final Reader a() {
        return this.a;
    }

    public Map b() {
        return this.b;
    }

    public Object get() {
        return this.b();
    }
}

