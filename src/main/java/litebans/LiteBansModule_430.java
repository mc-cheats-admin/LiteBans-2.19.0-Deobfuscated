package litebans;

import java.util.List;
public class LiteBansModule_430
extends ConfigurationManager {
    public LiteBansModule_430(PlatformPlugin plugin) {
        super(plugin);
    }

    @Override
    public CommandSenderWrapper[] BaseCoreGenericHandler() {
        List list = this.plugin().g().c();
        if (list == null) {
            return CommandSenderWrapper.BaseCoreGenericHandler;
        }
        return (CommandSenderWrapper[])list.stream().map(this.plugin::BaseCoreGenericHandler).toArray(CommandSenderWrapper[]::new);
    }

    @Override
    public int LiteBansModule_31() {
        List list = this.plugin().g().c();
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    private final ConfigYmlHandler BaseCoreGenericHandler() {
        return (ConfigYmlHandler)this.plugin;
    }
}

