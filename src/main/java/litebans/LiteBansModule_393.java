package litebans;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import org.bukkit.configuration.ConfigurationSection;

public class LiteBansModule_393
implements LiteBansModule_390 {
    private final LiteBansModule_217 BaseCoreGenericHandler;
    private final ConfigurationSection LiteBansModule_31;

    public LiteBansModule_393(LiteBansModule_217 gc_02, ConfigurationSection configurationSection) {
        this.plugin = gc_02;
        this.LiteBansModule_31 = configurationSection;
    }

    @Override
    public LiteBansModule_390 BaseCoreGenericHandler(String string) {
        ConfigurationSection configurationSection = this.LiteBansModule_31.getConfigurationSection(string);
        if (configurationSection == null) {
            return null;
        }
        return new LiteBansModule_393(this.plugin, configurationSection);
    }

    @Override
    public DatabaseService LiteBansModule_31(String string, Object object) {
        this.LiteBansModule_31.set(string, object);
        return this.plugin;
    }

    @Override
    public Collection BaseCoreGenericHandler(boolean flag) {
        if (this.LiteBansModule_31 == null) {
            return Collections.emptyList();
        }
        return this.LiteBansModule_31.getKeys(flag);
    }

    @Override
    public Object LiteBansModule_31(String string) {
        return this.LiteBansModule_31.get(string);
    }

    @Override
    public Object BaseCoreGenericHandler(String string, Object object) {
        return this.LiteBansModule_31.get(string, object);
    }

    @Override
    public boolean BaseCoreGenericHandler(String string) {
        return this.LiteBansModule_31.getBoolean(string);
    }

    @Override
    public boolean BaseCoreGenericHandler(String string, boolean flag) {
        return this.LiteBansModule_31.getBoolean(string, flag);
    }

    @Override
    public double AsyncBackgroundTask_5(String string) {
        return this.LiteBansModule_31.getDouble(string);
    }

    @Override
    public int BaseCoreGenericHandler(String string, int n) {
        return this.LiteBansModule_31.getInt(string, n);
    }

    @Override
    public long BaseCoreGenericHandler(String string, long l3) {
        return this.LiteBansModule_31.getLong(string, l3);
    }

    @Override
    public String e(String string) {
        return this.LiteBansModule_31.getString(string);
    }

    @Override
    public String BaseCoreGenericHandler(String string, String string2) {
        return this.LiteBansModule_31.getString(string, string2);
    }

    @Override
    public List g(String string) {
        return this.LiteBansModule_31.getStringList(string);
    }
}

