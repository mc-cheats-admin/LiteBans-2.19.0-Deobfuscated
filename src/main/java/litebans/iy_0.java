package litebans;

import java.io.File;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.util.jar.JarEntry;
import java.util.jar.JarInputStream;
import litebans.gr_0;
import litebans.hl;
import litebans.ip_0;

public class iy_0 {
    private String d;
    private String b;
    private String a;
    private static /* synthetic */ String[] c;

    public iy_0(String string) {
        JarEntry jarEntry;
        String string2 = "fabric.mod.json";
        JarInputStream jarInputStream = new JarInputStream(Files.newInputStream(new File(string).toPath(), new OpenOption[0]));
        while ((jarEntry = jarInputStream.getNextJarEntry()) != null) {
            if (!jarEntry.getName().endsWith(string2)) continue;
            gr_0 gr_02 = (gr_0)new ip_0().b(new InputStreamReader(jarInputStream));
            this.d = (String)gr_02.get("id");
            this.b = (String)gr_02.get("name");
            this.a = (String)gr_02.get("version");
            break;
        }
        if (this.d == null) {
            throw new AssertionError((Object)("Missing " + string2));
        }
    }

    public String toString() {
        return "FabricMeta(id=" + this.c() + ", name=" + this.d() + ", version=" + this.b() + ")";
    }

    public String c() {
        return this.d;
    }

    public String d() {
        return this.b;
    }

    public String b() {
        return this.a;
    }

    private static final void a() {
        c = new String[]{"fabric.mod.json", "id", "name", "version"};
    }

    static {
        iy_0.a();
    }
}

