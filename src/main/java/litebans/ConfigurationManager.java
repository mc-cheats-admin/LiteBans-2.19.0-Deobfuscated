package litebans;

public abstract class ConfigurationManager
extends PluginModule {
    public ConfigurationManager(PlatformPlugin plugin) {
        super(plugin);
    }

    public abstract CommandSenderWrapper[] BaseCoreGenericHandler();

    public abstract int LiteBansModule_31();

    @Override
    public void e() {
    }
}

