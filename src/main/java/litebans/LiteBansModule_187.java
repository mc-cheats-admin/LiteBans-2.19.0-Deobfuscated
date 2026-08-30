package litebans;

import java.io.File;
public final class LiteBansModule_187
implements LiteBansModule_419 {
    final /* synthetic */ ConfigService LiteBansModule_31;
    final /* synthetic */ Class BaseCoreGenericHandler;

    LiteBansModule_187(ConfigService configService, Class clazz) {
        this.LiteBansModule_31 = configService;
        this.plugin = clazz;
    }

    @Override
    public DatabaseService BaseCoreGenericHandler(PlatformPlugin plugin, File file) {
        JsonHandler bb_02 = new JsonHandler(file, this.plugin);
        return new YamlConfigProvider(this.LiteBansModule_31.BaseCoreGenericHandler, bb_02).c(file);
    }
}

