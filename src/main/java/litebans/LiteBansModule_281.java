package litebans;

import org.yaml.snakeyaml.nodes.Node;
import org.yaml.snakeyaml.representer.Represent;

static class LiteBansModule_281
implements Represent {
    final /* synthetic */ LiteBansModule_142 BaseCoreGenericHandler;

    LiteBansModule_281(LiteBansModule_142 dw_02) {
        this.plugin = dw_02;
    }

    public Node representData(Object targetObj) {
        return this.plugin.represent(targetObj.AsyncBackgroundTask_5);
}

