package litebans;

import java.util.List;
public abstract class BaseCoreGenericHandler
implements PlatformPlugin {
        public static PluginModule[] BaseCoreGenericHandler(PlatformPlugin plugin) {
        List list = plugin.LiteBansModule_195().BaseCoreGenericHandler(PluginModule.class, new Class[]{PlatformPlugin.class}, new Object[]{plugin});
        list.removeIf(module -> !plugin.BaseCoreGenericHandler((PluginModule)module));
        return list.toArray(new PluginModule[list.size()]);
    }

    private static final void BaseCoreGenericHandler() {
        LiteBansModule_31 = new String[]{"base.core.generic.data_folder", " + ", "ReflectManager", "1.0"};
    }

    static {
        BaseCoreGenericHandler.BaseCoreGenericHandler();
    }
}

