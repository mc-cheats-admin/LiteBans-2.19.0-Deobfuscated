package litebans;

import java.io.Reader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Supplier;
import org.jetbrains.annotations.NotNull;
import org.yaml.snakeyaml.DumperOptions;
import org.yaml.snakeyaml.LoaderOptions;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.BaseConstructor;
import org.yaml.snakeyaml.constructor.Constructor;
import org.yaml.snakeyaml.representer.Representer;

public final class LiteBansModule_123
implements Supplier {
    private final Reader BaseCoreGenericHandler;
    private final Map LiteBansModule_31;

    public LiteBansModule_123(@NotNull Reader reader) {
        this.plugin = reader;
        DumperOptions dumperOptions = new DumperOptions();
        dumperOptions.setDefaultFlowStyle(DumperOptions.FlowStyle.BLOCK);
        Representer representer = new LiteBansModule_185(dumperOptions);
        Yaml yaml = new Yaml((BaseConstructor)new Constructor(new LoaderOptions()), representer, dumperOptions);
        Map map = (Map)yaml.loadAs(this.plugin, LinkedHashMap.class);
        if (map == null) {
            map = new LinkedHashMap();
        }
        this.LiteBansModule_31 = map;
    }

    public final Reader BaseCoreGenericHandler() {
        return this.plugin;
    }

    public Map LiteBansModule_31() {
        return this.LiteBansModule_31;
    }

    public Object get() {
        return this.LiteBansModule_31();
}

