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

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from litebans.gg
 */
@ai_0(a=1)
public static class gg_0
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
        bg_0 bg_03 = bg_02 = this.c() == null || this.c().getName().endsWith(f[0]) ? gg_0.d() : gg_0.c();
        if (bg_02 == null) {
            bg_0 bg_04 = gg_0.c();
            if (bg_04 == null) {
                throw new AssertionError((Object)f[1]);
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
            this.d.getLogger().severe(f[2] + string + f[3]);
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
        if (file.getName().endsWith(f[4]) && this.g == gg_0.c()) {
            return this;
        }
        this.b(file);
        try {
            if (file2 != null && !file2.exists() && !file2.mkdirs()) {
                throw new IOException(f[5] + file2.getAbsolutePath());
            }
            if (!file.exists() && !file.createNewFile()) {
                throw new IOException(f[6] + file.getAbsolutePath());
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
        String string3 = string2.substring(0, string2.indexOf(32)).replace(f[7], f[8]);
        this.d.getLogger().warning(f[9] + string + f[10] + string3 + f[11] + this.c().getName() + f[12] + string + f[13]);
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
        f = new String[]{hl.a("\u3295\u32c2\u32d6\u32d7", -414698821), hl.a("\u6294\u62b5\u62fa\u62b9\u62b5\u62b4\u62bc\u62b3\u62bd\u62af\u62a8\u62bb\u62ae\u62b3\u62b5\u62b4\u62fa\u62aa\u62a8\u62b5\u62ac\u62b3\u62be\u62bf\u62a8\u62fa\u62f2\u62a3\u62bb\u62b7\u62b6\u62f5\u62b0\u62a9\u62b5\u62b4\u62f3", 455303898), hl.a("\ud526\ud526\ud520\ud545\ud502\ud500\ud511\ud536\ud511\ud517\ud50c\ud50b\ud502\ud54d\ud547", 252302693), hl.a("\u9132\u9139", 1708167440), hl.a("\u402c\u407b\u406f\u406e", -1695137790), hl.a("\u70be\u7092\u7088\u7091\u7099\u70dd\u7093\u7092\u7089\u70dd\u709e\u708f\u7098\u709c\u7089\u7098\u70dd\u709b\u7092\u7091\u7099\u7098\u708f\u70c7\u70dd", 118911229), hl.a("\u8768\u8744\u875e\u8747\u874f\u870b\u8745\u8744\u875f\u870b\u8748\u8759\u874e\u874a\u875f\u874e\u870b\u874d\u8742\u8747\u874e\u8711\u870b", 1144227627), hl.a("\u5100\u510b\u511c\u510b\u5144\u5106\u510b\u5104\u510d\u5144", 1075466602), hl.a("", -101780379), hl.a("\u0c8b\u0cb6\u0cbe\u0cab\u0cad\u0cba\u0cab\u0caa\u0cee\u0caf\u0cee\u0cad\u0ca1\u0ca0\u0ca8\u0ca7\u0ca9\u0cee\u0cbd\u0cab\u0cad\u0cba\u0ca7\u0ca1\u0ca0\u0cee\u0caf\u0cba\u0cee\u0cec", 322112718), hl.a("\u5049\u504b\u5009\u501e\u501f\u504b\u500d\u5004\u501e\u5005\u500f\u504b\u500a\u504b", 1215320171), hl.a("\ue76c\ue764\ue725\ue722\ue76c", 1306781516), hl.a("\ub57b\ub57c\ub572\ub506\ub53a\ub53b\ub521\ub572\ub521\ub537\ub531\ub526\ub53b\ub53d\ub53c\ub572\ub525\ub53b\ub53e\ub53e\ub572\ub530\ub537\ub572\ub526\ub520\ub537\ub533\ub526\ub537\ub536\ub572\ub533\ub521\ub572\ub537\ub53f\ub522\ub526\ub52b\ub57c\ub572\ub516\ub537\ub534\ub53b\ub53c\ub537\ub572\ub53b\ub526\ub572\ub533\ub521\ub572\ub570", 467711314), hl.a("\u528f\u5295\u52ce\u52c8\u5297\u5295\u52dc\u52d3\u5295\u52cc\u52da\u52c0\u5295\u52c2\u52d4\u52db\u52c1\u5295\u52d4\u52db\u5295\u52d0\u52d8\u52c5\u52c1\u52cc\u5295\u52db\u52da\u52d1\u52d0\u5295\u52d9\u52dc\u52c6\u52c1\u529b", -355904843)};
    }

    static {
        gg_0.b();
    }
}

