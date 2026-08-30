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

@ai_0(a=0)
public class gc_0
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
                throw new IOException("Could not create folder: " + file2.getAbsolutePath());
            }
            if (!file.exists() && !file.createNewFile()) {
                throw new IOException("Could not create file: " + file.getAbsolutePath());
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
        this.f.loadFromString("");
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
        g = new String[]{"Could not create folder: ", "Could not create file: ", ""};
    }

    static {
        gc_0.a();
    }
}

