package litebans;

import com.google.common.base.Charsets;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Collection;
import java.util.List;
import litebans.ai_0;
import litebans.di_0;
import litebans.gn_0;
import litebans.hl;
import litebans.kr_0;
import litebans.ku_0;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.jetbrains.annotations.Nullable;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from litebans.gC
 */
@ai_0(a=0)
public static class gc_0
extends gn_0 {
    private FileConfiguration f;
    private static /* synthetic */ String[] g;

    public gc_0(di_0 di_02) {
        super(di_02);
    }

    @Override
    public gn_0 c(File file) {
        block6: {
            this.a((Throwable)null);
            this.b(file);
            File file2 = file.getParentFile();
            if (file2 != null && !file2.exists() && !file2.mkdirs()) {
                throw new IOException(g[0] + file2.getAbsolutePath());
            }
            if (!file.exists() && !file.createNewFile()) {
                throw new IOException(g[1] + file.getAbsolutePath());
            }
            try {
                this.a(new FileInputStream(file));
            }
            catch (Exception exception) {
                if (exception instanceof FileNotFoundException) break block6;
                this.a(exception);
            }
        }
        return this;
    }

    @Override
    public gn_0 a(InputStream inputStream) {
        this.a((Throwable)null);
        try {
            this.f = new YamlConfiguration();
            this.a(new InputStreamReader(inputStream, Charsets.UTF_8));
        }
        catch (Exception exception) {
            this.a(exception);
        }
        return this;
    }

    @Override
    public gn_0 f() {
        return this.c(this.c());
    }

    @Override
    public gn_0 h() {
        return this.a(this.c());
    }

    @Override
    public gn_0 a(File file) {
        this.a((Throwable)null);
        try {
            this.a(file, this.f.saveToString());
        }
        catch (Exception exception) {
            this.a(exception);
        }
        return this;
    }

    @Override
    public @Nullable kr_0 a(String string) {
        ConfigurationSection configurationSection = this.f.getConfigurationSection(string);
        if (configurationSection == null) {
            return null;
        }
        return new ku_0(this, configurationSection);
    }

    @Override
    public Collection a(boolean bl) {
        return this.f.getKeys(bl);
    }

    @Override
    public gn_0 b(String string, Object object) {
        this.f.set(string, object);
        return this;
    }

    @Override
    public gn_0 a() {
        this.f.loadFromString(g[2]);
        this.a((Throwable)null);
        return this;
    }

    private final void a(Reader reader) {
        StringBuilder stringBuilder = new StringBuilder();
        try (BufferedReader bufferedReader = reader instanceof BufferedReader ? (BufferedReader)reader : new BufferedReader(reader);){
            String string;
            while ((string = bufferedReader.readLine()) != null) {
                stringBuilder.append(string);
                stringBuilder.append('\n');
            }
        }
        this.f.loadFromString(stringBuilder.toString());
    }

    @Override
    public Object b(String string) {
        return this.f.get(string);
    }

    @Override
    public Object a(String string, Object object) {
        return this.f.get(string, object);
    }

    @Override
    public boolean a(String string) {
        return this.f.getBoolean(string);
    }

    @Override
    public boolean a(String string, boolean bl) {
        return this.f.getBoolean(string, bl);
    }

    @Override
    public double d(String string) {
        return this.f.getDouble(string);
    }

    @Override
    public int a(String string, int n) {
        return this.f.getInt(string, n);
    }

    @Override
    public long a(String string, long l3) {
        return this.f.getLong(string, l3);
    }

    @Override
    public String e(String string) {
        return this.f.getString(string);
    }

    @Override
    public String a(String string, String string2) {
        return this.f.getString(string, string2);
    }

    @Override
    public List g(String string) {
        return this.f.getStringList(string);
    }

    @Override
    public boolean f(String string) {
        return this.f.isSet(string);
    }

    private static final void a() {
        g = new String[]{hl.a("\uf6ca\uf6e6\uf6fc\uf6e5\uf6ed\uf6a9\uf6e7\uf6e6\uf6fd\uf6a9\uf6ea\uf6fb\uf6ec\uf6e8\uf6fd\uf6ec\uf6a9\uf6ef\uf6e6\uf6e5\uf6ed\uf6ec\uf6fb\uf6b3\uf6a9", 2079782537), hl.a("\ucd72\ucd5e\ucd44\ucd5d\ucd55\ucd11\ucd5f\ucd5e\ucd45\ucd11\ucd52\ucd43\ucd54\ucd50\ucd45\ucd54\ucd11\ucd57\ucd58\ucd5d\ucd54\ucd0b\ucd11", -1722626767), hl.a("", -1264402614)};
    }

    static {
        gc_0.a();
    }
}

