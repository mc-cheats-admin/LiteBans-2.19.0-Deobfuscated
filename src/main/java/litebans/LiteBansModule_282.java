package litebans;

import org.yaml.snakeyaml.nodes.Node;
import org.yaml.snakeyaml.representer.Represent;

static class LiteBansModule_282
implements Represent {
    final /* synthetic */ LiteBansModule_143 BaseCoreGenericHandler;

    LiteBansModule_282(LiteBansModule_143 dw_02) {
        this.plugin = dw_02;
    }

    public Node representData(Object targetObj) {
        return this.plugin.represent(((NullHandler_4)targetObj).AsyncBackgroundTask_5);
    }
}

