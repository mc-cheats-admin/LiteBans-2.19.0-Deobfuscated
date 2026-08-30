package litebans;

import java.io.File;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.util.jar.JarEntry;
import java.util.jar.JarInputStream;
public class FabricModJsonHandler {
    private String AsyncBackgroundTask_5;
    private String LiteBansModule_31;
    private String BaseCoreGenericHandler;
        public FabricModJsonHandler(String string) {
        JarEntry jarEntry;
        String string2 = "fabric.mod.json";
        JarInputStream jarInputStream = new JarInputStream(Files.newInputStream(new File(string).toPath(), new OpenOption[0]));
        while ((jarEntry = jarInputStream.getNextJarEntry()) != null) {
            if (!jarEntry.getName().endsWith(string2)) continue;
            NullHandler_3 gr_02 = (NullHandler_3)new LiteBansModule_315().LiteBansModule_31(new InputStreamReader(jarInputStream));
            this.AsyncBackgroundTask_5 = (String)gr_02.get("SQLiteDriverHandler_4");
            this.LiteBansModule_31 = (String)gr_02.get("name");
            this.plugin = (String)gr_02.get("version");
            break;
        }
        if (this.AsyncBackgroundTask_5 == null) {
            throw new AssertionError((Object)("Missing " + string2));
        }
    }

    public String toString() {
        return "FabricMeta(SQLiteDriverHandler_4=" + this.c() + ", name=" + this.AsyncBackgroundTask_5() + ", version=" + this.LiteBansModule_31() + ")";
    }

    public String c() {
        return this.AsyncBackgroundTask_5;
    }

    public String AsyncBackgroundTask_5() {
        return this.LiteBansModule_31;
    }

    public String LiteBansModule_31() {
        return this.plugin;
    }

    private static final void BaseCoreGenericHandler() {
        c = new String[]{"fabric.mod.json", "SQLiteDriverHandler_4", "name", "version"};
    }

    static {
        FabricModJsonHandler.BaseCoreGenericHandler();
    }
}

