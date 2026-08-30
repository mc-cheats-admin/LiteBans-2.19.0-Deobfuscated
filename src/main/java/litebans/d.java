package litebans;

import litebans.by_0;
import litebans.dw_0;
import org.yaml.snakeyaml.DumperOptions;
import org.yaml.snakeyaml.LoaderOptions;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.BaseConstructor;
import org.yaml.snakeyaml.constructor.Constructor;
import org.yaml.snakeyaml.representer.Representer;

static class d
extends ThreadLocal {
    final /* synthetic */ by_0 a;

    d(by_0 by_02) {
        this.a = by_02;
    }

    protected Yaml a() {
        DumperOptions dumperOptions = new DumperOptions();
        dumperOptions.setDefaultFlowStyle(DumperOptions.FlowStyle.BLOCK);
        dw_0 dw_02 = new dw_0(this, dumperOptions);
        return new Yaml((BaseConstructor)new Constructor(new LoaderOptions()), (Representer)dw_02, dumperOptions);
    }

    protected Object initialValue() {
        return this.a();
    }
}

