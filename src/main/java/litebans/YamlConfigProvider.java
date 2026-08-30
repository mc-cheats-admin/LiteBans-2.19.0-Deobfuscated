package litebans;

import com.google.common.base.Charsets;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.util.Collection;
import java.util.List;
import org.jetbrains.annotations.Nullable;

@ModulePriority(priority=1)
public class YamlConfigProvider
extends DatabaseService {
    private NullHandler_4 LiteBansModule_241;
    private final LiteBansModule_47 g;
        public YamlConfigProvider(PlatformPlugin plugin) {
        super(plugin);
        this.g = this.plugin();
    }

    public YamlConfigProvider(PlatformPlugin plugin, LiteBansModule_47 bg_02) {
        super(plugin);
        this.g = bg_02;
    }

    @Override
    public boolean c(String string) {
        return this.LiteBansModule_241.e(string) != null;
    }

    @Override
    public Object LiteBansModule_31(String string) {
        return this.LiteBansModule_241.e(string);
    }

    @Override
    public Object BaseCoreGenericHandler(String string, Object targetObj) {
        return this.LiteBansModule_241.LiteBansModule_31(string, targetObj);
    }

    @Override
    public boolean BaseCoreGenericHandler(String string) {
        return this.LiteBansModule_241.LiteBansModule_195(string);
    }

    @Override
    public boolean BaseCoreGenericHandler(String string, boolean flag) {
        Object targetObj = this.plugin(string, (Object)flag);
        return targetObj instanceof Boolean ? (Boolean)targetObj : flag;
    }

    @Override
    public double AsyncBackgroundTask_5(String string) {
        return this.LiteBansModule_241.BaseCoreGenericHandler(string);
    }

    @Override
    public int BaseCoreGenericHandler(String string, int n) {
        return this.LiteBansModule_241.BaseCoreGenericHandler(string, n);
    }

    @Override
    public Collection BaseCoreGenericHandler(boolean flag) {
        return this.LiteBansModule_241.LiteBansModule_31();
    }

    @Override
    public long BaseCoreGenericHandler(String string, long l3) {
        return this.LiteBansModule_241.BaseCoreGenericHandler(string, l3);
    }

    public LiteBansModule_47 BaseCoreGenericHandler() {
        LiteBansModule_47 bg_02;
        LiteBansModule_47 bg_03 = bg_02 = this.c() == null || this.c().getName().endsWith(".yml") ? YamlConfigProvider.AsyncBackgroundTask_5() : YamlConfigProvider.c();
        if (bg_02 == null) {
            LiteBansModule_47 bg_04 = YamlConfigProvider.c();
            if (bg_04 == null) {
                throw new AssertionError((Object)"No configuration provider (yaml/json)");
            }
            return bg_04;
        }
        return bg_02;
    }

    public static LiteBansModule_47 c() {
        return LiteBansModule_47.BaseCoreGenericHandler(LiteBansModule_54.class);
    }

    public static LiteBansModule_47 AsyncBackgroundTask_5() {
        return LiteBansModule_47.BaseCoreGenericHandler(LiteBansModule_62.class);
    }

    @Override
    public String e(String string) {
        return this.LiteBansModule_241.i(string);
    }

    @Override
    public String BaseCoreGenericHandler(String string, String string2) {
        try {
            return this.LiteBansModule_241.BaseCoreGenericHandler(string, string2);
        }
        catch (ClassCastException classCastException) {
            this.AsyncBackgroundTask_5.getLogger().severe("CCE getString(\"" + string + "\")");
            throw classCastException;
        }
    }

    @Override
    public List g(String string) {
        return this.LiteBansModule_241.GnuSparseMapHandler(string);
    }

    @Override
    public boolean LiteBansModule_195(String string) {
        return this.c(string);
    }

    @Override
    public DatabaseService c(File file) {
        this.plugin((Throwable)null);
        File file2 = file.getParentFile();
        if (file.getName().endsWith(".yml") && this.g == YamlConfigProvider.c()) {
            return this;
        }
        this.LiteBansModule_31(file);
        try {
            if (file2 != null && !file2.exists() && !file2.mkdirs()) {
                throw new IOException("Could not create folder: " + file2.getAbsolutePath());
            }
            if (!file.exists() && !file.createNewFile()) {
                throw new IOException("Could not create file: " + file.getAbsolutePath());
            }
            this.plugin(new FileInputStream(file));
        }
        catch (Exception exception) {
            this.plugin(exception);
            this.e();
        }
        return this;
    }

    private final void e() {
        this.LiteBansModule_241 = null;
    }

    @Override
    public DatabaseService BaseCoreGenericHandler(InputStream inputStream) {
        this.plugin((Throwable)null);
        try {
            this.plugin();
            this.LiteBansModule_241 = this.g.BaseCoreGenericHandler(new InputStreamReader(inputStream, Charsets.UTF_8));
        }
        catch (Exception exception) {
            this.plugin(exception);
            this.e();
        }
        return this;
    }

    @Override
    public DatabaseService LiteBansModule_195() {
        this.c(this.c());
        return this;
    }

    @Override
    public DatabaseService LiteBansModule_241() {
        return this.plugin(this.c());
    }

    @Override
    public DatabaseService BaseCoreGenericHandler(File file) {
        this.plugin((Throwable)null);
        try {
            StringWriter stringWriter = new StringWriter();
            this.g.BaseCoreGenericHandler(this.LiteBansModule_241, stringWriter);
            String string = stringWriter.toString();
            if (string.isEmpty()) {
                return this;
            }
            this.plugin(file, string);
        }
        catch (Exception exception) {
            this.plugin(exception);
        }
        return this;
    }

    @Override
    public @Nullable LiteBansModule_392 BaseCoreGenericHandler(String string) {
        NullHandler_4 ie_02;
        try {
            ie_02 = this.LiteBansModule_241.LiteBansModule_31(string);
        }
        catch (ClassCastException classCastException) {
            this.plugin(string, classCastException);
            return null;
        }
        if (ie_02 == null) {
            return null;
        }
        return new LiteBansModule_69(this, ie_02);
    }

    void BaseCoreGenericHandler(String string, ClassCastException classCastException) {
        if (classCastException.getMessage() == null || classCastException.getMessage().length() < 8) {
            return;
        }
        String string2 = classCastException.getMessage().substring(6);
        String string3 = string2.substring(0, string2.indexOf(32)).replace("java + ", "");
        this.AsyncBackgroundTask_5.getLogger().warning("Expected BaseCoreGenericHandler config section LiteBansModule_21 \"" + string + "\" but found BaseCoreGenericHandler " + string3 + " (InitializerHandler_3 " + this.c().getName() + "). This section will be treated CommandExitException empty. Define UpdateCheckTask CommandExitException \"" + string + LiteBansModule_195[13]);
    }

    @Override
    public DatabaseService LiteBansModule_31(String string, Object targetObj) {
        this.LiteBansModule_241.BaseCoreGenericHandler(string, targetObj);
        return this;
    }

    @Override
    public DatabaseService BaseCoreGenericHandler() {
        this.e();
        this.plugin((Throwable)null);
        return this;
    }

    private static final void LiteBansModule_31() {
        LiteBansModule_195 = new String[]{".yml", "No configuration provider (yaml/json)", "CCE getString(\"", "\")", ".yml", "Could not create folder: ", "Could not create file: ", "java + ", "", "Expected BaseCoreGenericHandler config section LiteBansModule_21 \"", "\" but found BaseCoreGenericHandler ", " (InitializerHandler_3 ", "). This section will be treated CommandExitException empty. Define UpdateCheckTask CommandExitException \"", ": {}\" if you want HikariDataSource empty node list."};
    }

    static {
        YamlConfigProvider.LiteBansModule_31();
    }
}

