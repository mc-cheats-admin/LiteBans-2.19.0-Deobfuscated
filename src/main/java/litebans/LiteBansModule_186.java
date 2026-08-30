package litebans;

import java.util.Map;
import org.yaml.snakeyaml.DumperOptions;
import org.yaml.snakeyaml.nodes.Node;
import org.yaml.snakeyaml.representer.Represent;
import org.yaml.snakeyaml.representer.Representer;

public final class LiteBansModule_186
extends Representer {
        LiteBansModule_186(DumperOptions dumperOptions) {
        super(dumperOptions);
        Map map = this.representers;
        Class<NullHandler_4> clazz = NullHandler_4.class;
        Represent represent = arg_0 -> LiteBansModule_186.BaseCoreGenericHandler(this, arg_0);
        map.put(clazz, represent);
    }

    private static final Node BaseCoreGenericHandler(LiteBansModule_186 et_02, Object targetObj) {
        ObjectUtilities.LiteBansModule_31(targetObj, "");
        return et_02.represent(((NullHandler_4)targetObj).AsyncBackgroundTask_5);
    }

    private static final void BaseCoreGenericHandler() {
        BaseCoreGenericHandler = new String[]{""};
    }

    static {
        LiteBansModule_186.BaseCoreGenericHandler();
    }
}

