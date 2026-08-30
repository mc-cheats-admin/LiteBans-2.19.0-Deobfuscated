package litebans;

import java.util.List;
public abstract class BaseCoreGenericHandler
implements PlatformPlugin {
    public static PluginModule[] BaseCoreGenericHandler(PlatformPlugin plugin) {
        List list = plugin.LiteBansModule_194().BaseCoreGenericHandler(PluginModule.class, new Class[]{PlatformPlugin.class}, new Object[]{plugin});
        list.removeIf(module -> !plugin.BaseCoreGenericHandler((PluginModule)module));
        return list.toArray(new PluginModule[list.size()]);
    }

    }

