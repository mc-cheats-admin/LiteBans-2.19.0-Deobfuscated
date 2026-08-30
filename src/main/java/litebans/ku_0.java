package litebans;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import litebans.gc_0;
import litebans.gn_0;
import litebans.kr_0;
import org.bukkit.configuration.ConfigurationSection;

public class ku_0
implements kr_0 {
    private final gc_0 a;
    private final ConfigurationSection b;

    public ku_0(gc_0 gc_02, ConfigurationSection configurationSection) {
        this.a = gc_02;
        this.b = configurationSection;
    }

    @Override
    public kr_0 a(String string) {
        ConfigurationSection configurationSection = this.b.getConfigurationSection(string);
        if (configurationSection == null) {
            return null;
        }
        return new ku_0(this.a, configurationSection);
    }

    @Override
    public gn_0 b(String string, Object object) {
        this.b.set(string, object);
        return this.a;
    }

    @Override
    public Collection a(boolean bl) {
        if (this.b == null) {
            return Collections.emptyList();
        }
        return this.b.getKeys(bl);
    }

    @Override
    public Object b(String string) {
        return this.b.get(string);
    }

    @Override
    public Object a(String string, Object object) {
        return this.b.get(string, object);
    }

    @Override
    public boolean a(String string) {
        return this.b.getBoolean(string);
    }

    @Override
    public boolean a(String string, boolean bl) {
        return this.b.getBoolean(string, bl);
    }

    @Override
    public double d(String string) {
        return this.b.getDouble(string);
    }

    @Override
    public int a(String string, int n) {
        return this.b.getInt(string, n);
    }

    @Override
    public long a(String string, long l3) {
        return this.b.getLong(string, l3);
    }

    @Override
    public String e(String string) {
        return this.b.getString(string);
    }

    @Override
    public String a(String string, String string2) {
        return this.b.getString(string, string2);
    }

    @Override
    public List g(String string) {
        return this.b.getStringList(string);
    }
}

