package litebans;

import org.yaml.snakeyaml.DumperOptions;
import org.yaml.snakeyaml.representer.Representer;

static class LiteBansModule_143
extends Representer {
    final /* synthetic */ AsyncBackgroundTask_5 BaseCoreGenericHandler;

    LiteBansModule_143(AsyncBackgroundTask_5 d10, DumperOptions dumperOptions) {
        this.plugin = d10;
        super(dumperOptions);
        this.representers.put(NullHandler_4.class, new LiteBansModule_282(this));
    }
}

