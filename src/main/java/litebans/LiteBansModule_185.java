package litebans;

import java.util.Map;
import org.yaml.snakeyaml.DumperOptions;
import org.yaml.snakeyaml.nodes.Node;
import org.yaml.snakeyaml.representer.Represent;
import org.yaml.snakeyaml.representer.Representer;

public final class LiteBansModule_185
extends Representer {
    LiteBansModule_185(DumperOptions dumperOptions) {
        super(dumperOptions);
        Map map = this.representers;
        Class<NullHandler_4> clazz = NullHandler_4.class;
        Represent represent = arg_0 -> LiteBansModule_185.BaseCoreGenericHandler(this, arg_0);
        map.put(clazz, represent);
    }

    private static final Node BaseCoreGenericHandler(LiteBansModule_185 et_02, Object object) {
        ObjectUtilities.LiteBansModule_31(object, "");
        return et_02.represent(((NullHandler_4)object).AsyncBackgroundTask_5);
    }

    private static final void BaseCoreGenericHandler() {
        BaseCoreGenericHandler = new String[]{""};
    }

    }

