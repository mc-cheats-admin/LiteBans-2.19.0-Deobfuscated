package litebans;

import litebans.d;
import litebans.hx_0;
import litebans.ie_0;
import org.yaml.snakeyaml.DumperOptions;
import org.yaml.snakeyaml.representer.Representer;

/*
 * Renamed from litebans.dW
 */
static class dw_0
extends Representer {
    final /* synthetic */ d a;

    dw_0(d d10, DumperOptions dumperOptions) {
        this.a = d10;
        super(dumperOptions);
        this.representers.put(ie_0.class, new hx_0(this));
    }
}

