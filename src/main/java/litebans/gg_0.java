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
import litebans.ai_0;
import litebans.bg_0;
import litebans.bn_0;
import litebans.by_0;
import litebans.c7;
import litebans.di_0;
import litebans.gn_0;
import litebans.hl;
import litebans.ie_0;
import litebans.kr_0;
import org.jetbrains.annotations.Nullable;

@ai_0(a=1)
public class gg_0
extends gn_0 {
    private ie_0 h;
    private final bg_0 g;
    private static /* synthetic */ String[] f;

    public gg_0(di_0 di_02) {
        super(di_02);
        this.g = this.a();
    }

    public gg_0(di_0 di_02, bg_0 bg_02) {
        super(di_02);
        this.g = bg_02;
    }

    @Override
    public boolean c(String string) {
        return this.h.e(string) != null;
    }

    @Override
    public Object b(String string) {
        return this.h.e(string);
    }

    @Override
    public Object a(String string, Object object) {
        return this.h.b(string, object);
    }

    @Override
    public boolean a(String string) {
        return this.h.f(string);
    }

    @Override
    public boolean a(String string, boolean bl) {
        Object object = this.a(string, (Object)bl);
        return object instanceof Boolean ? (Boolean)object : bl;
    }

    @Override
    public double d(String string) {
        return this.h.a(string);
    }

    @Override
    public int a(String string, int n) {
        return this.h.a(string, n);
    }

    @Override
    public Collection a(boolean bl) {
        return this.h.b();
    }

    @Override
    public long a(String string, long l3) {
        return this.h.a(string, l3);
    }

    public bg_0 a() {
        bg_0 bg_02;
        bg_0 bg_03 = bg_02 = this.c() == null || this.c().getName().endsWith(".yml") ? gg_0.d() : gg_0.c();
        if (bg_02 == null) {
            bg_0 bg_04 = gg_0.c();
            if (bg_04 == null) {
                throw new AssertionError((Object)"No configuration provider (yaml/json)");
            }
            return bg_04;
        }
        return bg_02;
    }

    public static bg_0 c() {
        return bg_0.a(bn_0.class);
    }

    public static bg_0 d() {
        return bg_0.a(by_0.class);
    }

    @Override
    public String e(String string) {
        return this.h.i(string);
    }

    @Override
    public String a(String string, String string2) {
        try {
            return this.h.a(string, string2);
        }
        catch (ClassCastException classCastException) {
            this.d.getLogger().severe("CCE getString(\"" + string + "\")");
            throw classCastException;
        }
    }

    @Override
    public List g(String string) {
        return this.h.j(string);
    }

    @Override
    public boolean f(String string) {
        return this.c(string);
    }

    @Override
    public gn_0 c(File file) {
        this.a((Throwable)null);
        File file2 = file.getParentFile();
        if (file.getName().endsWith(".yml") && this.g == gg_0.c()) {
            return this;
        }
        this.b(file);
        try {
            if (file2 != null && !file2.exists() && !file2.mkdirs()) {
                throw new IOException("Could not create folder: " + file2.getAbsolutePath());
            }
            if (!file.exists() && !file.createNewFile()) {
                throw new IOException("Could not create file: " + file.getAbsolutePath());
            }
            this.a(new FileInputStream(file));
        }
        catch (Exception exception) {
            this.a(exception);
            this.e();
        }
        return this;
    }

    private final void e() {
        this.h = null;
    }

    @Override
    public gn_0 a(InputStream inputStream) {
        this.a((Throwable)null);
        try {
            this.a();
            this.h = this.g.a(new InputStreamReader(inputStream, Charsets.UTF_8));
        }
        catch (Exception exception) {
            this.a(exception);
            this.e();
        }
        return this;
    }

    @Override
    public gn_0 f() {
        this.c(this.c());
        return this;
    }

    @Override
    public gn_0 h() {
        return this.a(this.c());
    }

    @Override
    public gn_0 a(File file) {
        this.a((Throwable)null);
        try {
            StringWriter stringWriter = new StringWriter();
            this.g.a(this.h, stringWriter);
            String string = stringWriter.toString();
            if (string.isEmpty()) {
                return this;
            }
            this.a(file, string);
        }
        catch (Exception exception) {
            this.a(exception);
        }
        return this;
    }

    @Override
    public @Nullable kr_0 a(String string) {
        ie_0 ie_02;
        try {
            ie_02 = this.h.b(string);
        }
        catch (ClassCastException classCastException) {
            this.a(string, classCastException);
            return null;
        }
        if (ie_02 == null) {
            return null;
        }
        return new c7(this, ie_02);
    }

    void a(String string, ClassCastException classCastException) {
        if (classCastException.getMessage() == null || classCastException.getMessage().length() < 8) {
            return;
        }
        String string2 = classCastException.getMessage().substring(6);
        String string3 = string2.substring(0, string2.indexOf(32)).replace("java + ", "");
        this.d.getLogger().warning("Expected a config section at \"" + string + "\" but found a " + string3 + " (in " + this.c().getName() + "). This section will be treated as empty. Define it as \"" + string + f[13]);
    }

    @Override
    public gn_0 b(String string, Object object) {
        this.h.a(string, object);
        return this;
    }

    @Override
    public gn_0 a() {
        this.e();
        this.a((Throwable)null);
        return this;
    }

    private static final void b() {
        f = new String[]{".yml", "No configuration provider (yaml/json)", "CCE getString(\"", "\")", ".yml", "Could not create folder: ", "Could not create file: ", "java + ", "", "Expected a config section at \"", "\" but found a ", " (in ", "). This section will be treated as empty. Define it as \"", ": {}\" if you want an empty node list."};
    }

    static {
        gg_0.b();
    }
}

