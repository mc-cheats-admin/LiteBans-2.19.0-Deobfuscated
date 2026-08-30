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

/*
 * Renamed from litebans.iY
 */
public static class iy_0 {
    private String d;
    private String b;
    private String a;
    private static /* synthetic */ String[] c;

    public iy_0(String string) {
        JarEntry jarEntry;
        String string2 = c[0];
        JarInputStream jarInputStream = new JarInputStream(Files.newInputStream(new File(string).toPath(), new OpenOption[0]));
        while ((jarEntry = jarInputStream.getNextJarEntry()) != null) {
            if (!jarEntry.getName().endsWith(string2)) continue;
            gr_0 gr_02 = (gr_0)new ip_0().b(new InputStreamReader(jarInputStream));
            this.d = (String)gr_02.get(c[1]);
            this.b = (String)gr_02.get(c[2]);
            this.a = (String)gr_02.get(c[3]);
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
        c = new String[]{hl.a("\u9d58\u9d5f\u9d5c\u9d4c\u9d57\u9d5d\u9d10\u9d53\u9d51\u9d5a\u9d10\u9d54\u9d4d\u9d51\u9d50", -1975345858), hl.a("\u062b\u0626", -1005124030), hl.a("\u5eea\u5ee5\u5ee9\u5ee1", 2057002628), hl.a("\u066a\u0679\u066e\u066f\u0675\u0673\u0672", -248642020)};
    }

    static {
        iy_0.a();
    }
}

