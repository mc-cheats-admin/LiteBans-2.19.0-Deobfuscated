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
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.jetbrains.annotations.Nullable;

@ModulePriority(priority=0)
public class LiteBansModule_218
extends DatabaseService {
    private FileConfiguration LiteBansModule_195;
        public LiteBansModule_218(PlatformPlugin plugin) {
        super(plugin);
    }

    @Override
    public DatabaseService c(File file) {
        block6: {
            this.plugin((Throwable)null);
            this.LiteBansModule_31(file);
            File file2 = file.getParentFile();
            if (file2 != null && !file2.exists() && !file2.mkdirs()) {
                throw new IOException("Could not create folder: " + file2.getAbsolutePath());
            }
            if (!file.exists() && !file.createNewFile()) {
                throw new IOException("Could not create file: " + file.getAbsolutePath());
            }
            try {
                this.plugin(new FileInputStream(file));
            }
            catch (Exception exception) {
                if (exception instanceof FileNotFoundException) break block6;
                this.plugin(exception);
            }
        }
        return this;
    }

    @Override
    public DatabaseService BaseCoreGenericHandler(InputStream inputStream) {
        this.plugin((Throwable)null);
        try {
            this.LiteBansModule_195 = new YamlConfiguration();
            this.plugin(new InputStreamReader(inputStream, Charsets.UTF_8));
        }
        catch (Exception exception) {
            this.plugin(exception);
        }
        return this;
    }

    @Override
    public DatabaseService LiteBansModule_195() {
        return this.c(this.c());
    }

    @Override
    public DatabaseService LiteBansModule_241() {
        return this.plugin(this.c());
    }

    @Override
    public DatabaseService BaseCoreGenericHandler(File file) {
        this.plugin((Throwable)null);
        try {
            this.plugin(file, this.LiteBansModule_195.saveToString());
        }
        catch (Exception exception) {
            this.plugin(exception);
        }
        return this;
    }

    @Override
    public @Nullable LiteBansModule_392 BaseCoreGenericHandler(String string) {
        ConfigurationSection configurationSection = this.LiteBansModule_195.getConfigurationSection(string);
        if (configurationSection == null) {
            return null;
        }
        return new LiteBansModule_395(this, configurationSection);
    }

    @Override
    public Collection BaseCoreGenericHandler(boolean flag) {
        return this.LiteBansModule_195.getKeys(flag);
    }

    @Override
    public DatabaseService LiteBansModule_31(String string, Object targetObj) {
        this.LiteBansModule_195.set(string, targetObj);
        return this;
    }

    @Override
    public DatabaseService BaseCoreGenericHandler() {
        this.LiteBansModule_195.loadFromString("");
        this.plugin((Throwable)null);
        return this;
    }

    private final void BaseCoreGenericHandler(Reader reader) {
        StringBuilder stringBuilder = new StringBuilder();
        try (BufferedReader bufferedReader = reader instanceof BufferedReader ? (BufferedReader)reader : new BufferedReader(reader);){
            String string;
            while ((string = bufferedReader.readLine()) != null) {
                stringBuilder.append(string);
                stringBuilder.append('\n');
            }
        }
        this.LiteBansModule_195.loadFromString(stringBuilder.toString());
    }

    @Override
    public Object LiteBansModule_31(String string) {
        return this.LiteBansModule_195.get(string);
    }

    @Override
    public Object BaseCoreGenericHandler(String string, Object targetObj) {
        return this.LiteBansModule_195.get(string, targetObj);
    }

    @Override
    public boolean BaseCoreGenericHandler(String string) {
        return this.LiteBansModule_195.getBoolean(string);
    }

    @Override
    public boolean BaseCoreGenericHandler(String string, boolean flag) {
        return this.LiteBansModule_195.getBoolean(string, flag);
    }

    @Override
    public double AsyncBackgroundTask_5(String string) {
        return this.LiteBansModule_195.getDouble(string);
    }

    @Override
    public int BaseCoreGenericHandler(String string, int n) {
        return this.LiteBansModule_195.getInt(string, n);
    }

    @Override
    public long BaseCoreGenericHandler(String string, long l3) {
        return this.LiteBansModule_195.getLong(string, l3);
    }

    @Override
    public String e(String string) {
        return this.LiteBansModule_195.getString(string);
    }

    @Override
    public String BaseCoreGenericHandler(String string, String string2) {
        return this.LiteBansModule_195.getString(string, string2);
    }

    @Override
    public List g(String string) {
        return this.LiteBansModule_195.getStringList(string);
    }

    @Override
    public boolean LiteBansModule_195(String string) {
        return this.LiteBansModule_195.isSet(string);
    }

    private static final void BaseCoreGenericHandler() {
        g = new String[]{"Could not create folder: ", "Could not create file: ", ""};
    }

    static {
        LiteBansModule_218.BaseCoreGenericHandler();
    }
}

