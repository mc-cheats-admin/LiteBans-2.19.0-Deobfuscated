package litebans;

import org.yaml.snakeyaml.DumperOptions;
import org.yaml.snakeyaml.LoaderOptions;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.BaseConstructor;
import org.yaml.snakeyaml.constructor.Constructor;
import org.yaml.snakeyaml.representer.Representer;

static class AsyncBackgroundTask_5
extends ThreadLocal {
    final /* synthetic */ LiteBansModule_62 BaseCoreGenericHandler;

    AsyncBackgroundTask_5(LiteBansModule_62 by_02) {
        this.plugin = by_02;
    }

    protected Yaml BaseCoreGenericHandler() {
        DumperOptions dumperOptions = new DumperOptions();
        dumperOptions.setDefaultFlowStyle(DumperOptions.FlowStyle.BLOCK);
        LiteBansModule_142 dw_02 = new LiteBansModule_142(this, dumperOptions);
        return new Yaml((BaseConstructor)new Constructor(new LoaderOptions()), (Representer)dw_02, dumperOptions);
    }

    protected Object initialValue() {
        return this.plugin();
    }
}

