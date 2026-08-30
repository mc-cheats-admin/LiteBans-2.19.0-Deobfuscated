package litebans;

import java.util.Map;
import litebans.ew;
import litebans.hl;
import litebans.ie_0;
import org.yaml.snakeyaml.DumperOptions;
import org.yaml.snakeyaml.nodes.Node;
import org.yaml.snakeyaml.representer.Represent;
import org.yaml.snakeyaml.representer.Representer;

/*
 * Renamed from litebans.eT
 */
public static final class et_0
extends Representer {
    private static /* synthetic */ String[] a;

    et_0(DumperOptions dumperOptions) {
        super(dumperOptions);
        Map map = this.representers;
        Class<ie_0> clazz = ie_0.class;
        Represent represent = arg_0 -> et_0.a(this, arg_0);
        map.put(clazz, represent);
    }

    private static final Node a(et_0 et_02, Object object) {
        ew.b(object, a[0]);
        return et_02.represent(((ie_0)object).d);
    }

    private static final void a() {
        a = new String[]{hl.a("", -1033773818)};
    }

    static {
        et_0.a();
    }
}

