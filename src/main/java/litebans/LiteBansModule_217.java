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
public class LiteBansModule_217
extends DatabaseService {
    private FileConfiguration LiteBansModule_194;
    public LiteBansModule_217(PlatformPlugin plugin) {
        super(plugin);
    }

    @Override
    public DatabaseService c(File file) {
{
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
                if (exception instanceof FileNotFoundException) break;
                this.plugin(exception);
}
        return this;
    }

    @Override
    public DatabaseService BaseCoreGenericHandler(InputStream inputStream) {
        this.plugin((Throwable)null);
        try {
            this.LiteBansModule_194 = new YamlConfiguration();
            this.plugin(new InputStreamReader(inputStream, Charsets.UTF_8));
        }
        catch (Exception exception) {
            this.plugin(exception);
        }
        return this;
    }

    @Override
    public DatabaseService LiteBansModule_194() {
        return this.c(this.c());
    }

    @Override
    public DatabaseService LiteBansModule_240() {
        return this.plugin(this.c());
    }

    @Override
    public DatabaseService BaseCoreGenericHandler(File file) {
        this.plugin((Throwable)null);
        try {
            this.plugin(file, this.LiteBansModule_194.saveToString());
        }
        catch (Exception exception) {
            this.plugin(exception);
        }
        return this;
    }

    @Override
    public @Nullable LiteBansModule_390 BaseCoreGenericHandler(String string) {
        ConfigurationSection configurationSection = this.LiteBansModule_194.getConfigurationSection(string);
        if (configurationSection == null) {
            return null;
        }
        return new LiteBansModule_393(this, configurationSection);
    }

    @Override
    public Collection BaseCoreGenericHandler(boolean flag) {
        return this.LiteBansModule_194.getKeys(flag);
    }

    @Override
    public DatabaseService LiteBansModule_31(String string, Object targetObj) {
        this.LiteBansModule_194.set(string, targetObj);
        return this;
    }

    @Override
    public DatabaseService BaseCoreGenericHandler() {
        this.LiteBansModule_194.loadFromString("");
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
        this.LiteBansModule_194.loadFromString(stringBuilder.toString());
    }

    @Override
    public Object LiteBansModule_31(String string) {
        return this.LiteBansModule_194.get(string);
    }

    @Override
    public Object BaseCoreGenericHandler(String string, Object targetObj) {
        return this.LiteBansModule_194.get(string, targetObj);
    }

    @Override
    public boolean BaseCoreGenericHandler(String string) {
        return this.LiteBansModule_194.getBoolean(string);
    }

    @Override
    public boolean BaseCoreGenericHandler(String string, boolean flag) {
        return this.LiteBansModule_194.getBoolean(string, flag);
    }

    @Override
    public double AsyncBackgroundTask_5(String string) {
        return this.LiteBansModule_194.getDouble(string);
    }

    @Override
    public int BaseCoreGenericHandler(String string, int n) {
        return this.LiteBansModule_194.getInt(string, n);
    }

    @Override
    public long BaseCoreGenericHandler(String string, long l3) {
        return this.LiteBansModule_194.getLong(string, l3);
    }

    @Override
    public String e(String string) {
        return this.LiteBansModule_194.getString(string);
    }

    @Override
    public String BaseCoreGenericHandler(String string, String string2) {
        return this.LiteBansModule_194.getString(string, string2);
    }

    @Override
    public List g(String string) {
        return this.LiteBansModule_194.getStringList(string);
    }

    @Override
    public boolean LiteBansModule_194(String string) {
        return this.LiteBansModule_194.isSet(string);
    }

    private static final void BaseCoreGenericHandler() {
        g = new String[]{"Could not create folder: ", "Could not create file: ", ""};
}

