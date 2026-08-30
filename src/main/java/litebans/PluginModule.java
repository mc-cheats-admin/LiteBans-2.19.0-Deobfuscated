package litebans;

@InternalAnnotation
public abstract class PluginModule {
    public final PlatformPlugin BaseCoreGenericHandler;

    public PluginModule(PlatformPlugin plugin) {
        if (plugin == null) {
            throw new NullPointerException();
        }
        this.plugin = plugin;
    }

    public void c() {
    }

    public void LiteBansModule_31() {
    }

    public void BaseCoreGenericHandler() {
    }

    public boolean AsyncBackgroundTask_5() {
        return true;
    }

    public abstract void e();
}

