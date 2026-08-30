package litebans;

import litebans.dw_0;
import litebans.ie_0;
import org.yaml.snakeyaml.nodes.Node;
import org.yaml.snakeyaml.representer.Represent;

static class hx_0
implements Represent {
    final /* synthetic */ dw_0 a;

    hx_0(dw_0 dw_02) {
        this.a = dw_02;
    }

    public Node representData(Object object) {
        return this.a.represent(((ie_0)object).d);
    }
}

