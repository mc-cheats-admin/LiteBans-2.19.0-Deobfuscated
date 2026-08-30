package litebans;

import com.google.common.base.Charsets;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.util.jar.JarEntry;
import java.util.jar.JarInputStream;
import litebans.di_0;
import litebans.hb_0;
import litebans.hl;
import litebans.kr_0;
import lombok.NonNull;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from litebans.gN
 */
public static abstract class gn_0
implements kr_0,
Closeable {
    protected di_0 d;
    private File b;
    private Throwable c;
    private String a = e[0];
    private static /* synthetic */ String[] e;

    public gn_0(di_0 di_02) {
        this.d = di_02;
    }

    public static InputStream a(@NotNull String string, @Nullable String string2) {
        if (string2 == null) {
            string2 = hb_0.a(gn_0.class);
        }
        try {
            JarEntry jarEntry;
            JarInputStream jarInputStream = new JarInputStream(Files.newInputStream(new File(string2).toPath(), new OpenOption[0]));
            while ((jarEntry = jarInputStream.getNextJarEntry()) != null) {
                if (!jarEntry.getName().endsWith(string)) continue;
                return jarInputStream;
            }
            jarInputStream.close();
        }
        catch (Exception exception) {
            throw new RuntimeException(exception);
        }
        return null;
    }

    public static String b(@NonNull String string, @Nullable String string2) {
        String string3;
        block9: {
            if (string == null) {
                throw new NullPointerException(e[1]);
            }
            InputStream inputStream = gn_0.a(string, string2);
            try {
                string3 = gn_0.b(inputStream);
                if (inputStream == null) break block9;
            }
            catch (Throwable throwable) {
                try {
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        }
                        catch (Throwable throwable2) {
                            throwable.addSuppressed(throwable2);
                        }
                    }
                    throw throwable;
                }
                catch (IOException iOException) {
                    iOException.printStackTrace();
                    return e[2] + System.lineSeparator();
                }
            }
            inputStream.close();
        }
        return string3;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static String b(@Nullable InputStream inputStream) {
        String string = System.lineSeparator();
        if (inputStream == null) {
            return e[3];
        }
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream), 1024);){
            String string2;
            StringBuilder stringBuilder = new StringBuilder();
            while ((string2 = bufferedReader.readLine()) != null && string2.startsWith(e[4])) {
                stringBuilder.append(string2).append(string);
            }
            string2 = stringBuilder.toString();
            return string2;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void a(@NotNull File file, @NotNull String string, @Nullable String string2, boolean bl) {
        block16: {
            try (InputStream inputStream = gn_0.a(string, string2);){
                if (inputStream == null) {
                    return;
                }
                File file2 = new File(file, string);
                int n = string.lastIndexOf(47);
                File file3 = new File(file, string.substring(0, n >= 0 ? n : 0));
                if (!file3.exists() && !file3.mkdirs()) {
                    throw new IOException(e[5] + file3.getAbsolutePath());
                }
                if (file2.exists() && file2.length() != 0L && !bl) break block16;
                try (FileOutputStream fileOutputStream = new FileOutputStream(file2);){
                    int n2;
                    byte[] byArray = new byte[8192];
                    while ((n2 = inputStream.read(byArray)) > 0) {
                        fileOutputStream.write(byArray, 0, n2);
                    }
                }
            }
        }
    }

    public static String b(String string) {
        String[] stringArray;
        String string2 = System.lineSeparator();
        StringBuilder stringBuilder = new StringBuilder();
        for (String string3 : stringArray = string.split(e[9])) {
            if (string3.startsWith(e[10])) continue;
            stringBuilder.append(string3).append(string2);
        }
        string = stringBuilder.toString();
        return string;
    }

    public gn_0 g() {
        if (this.c != null) {
            throw new RuntimeException(this.c);
        }
        return this;
    }

    @Override
    public boolean c(String string) {
        return this.b(string) != null;
    }

    @Override
    public boolean f(String string) {
        return this.b(string) != null;
    }

    public abstract gn_0 c(File var1);

    public abstract gn_0 a(InputStream var1);

    public abstract gn_0 f();

    public abstract gn_0 h();

    public abstract gn_0 a(File var1);

    @Override
    public gn_0 a(String string) {
        this.a = string;
        return this;
    }

    public abstract gn_0 a();

    @Override
    public void close() {
        this.a();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(File file, String string) {
        try (OutputStreamWriter outputStreamWriter = new OutputStreamWriter((OutputStream)new FileOutputStream(file), Charsets.UTF_8);){
            outputStreamWriter.write(this.e() + gn_0.b(string));
            outputStreamWriter.flush();
        }
    }

    public File c() {
        return this.b;
    }

    public void b(File file) {
        this.b = file;
    }

    public Throwable b() {
        return this.c;
    }

    public void a(Throwable throwable) {
        this.c = throwable;
    }

    public String e() {
        return this.a;
    }

    private static final void d() {
        e = new String[]{hl.a("", -1655218725), hl.a("\u2bec\u2bfb\u2bed\u2bf1\u2beb\u2bec\u2bfd\u2bfb\u2bbe\u2bf7\u2bed\u2bbe\u2bf3\u2bff\u2bec\u2bf5\u2bfb\u2bfa\u2bbe\u2bf0\u2bf1\u2bf0\u2bb3\u2bf0\u2beb\u2bf2\u2bf2\u2bbe\u2bfc\u2beb\u2bea\u2bbe\u2bf7\u2bed\u2bbe\u2bf0\u2beb\u2bf2\u2bf2", 1616784286), hl.a("\u17bb\u17d0\u17fd\u17f9\u17fc\u17fd\u17ea\u17b8\u17ac\u17a8\u17ac", 1333729176), hl.a("", 415441829), hl.a("\u205b", 1386291320), hl.a("\u06ef\u06e9\u06e6\u06eb\u06f0\u06a2\u06e4\u06e3\u06eb\u06ee\u06e7\u06e6\u06b8\u06a2", 1690502786), hl.a("\ub641\ub66f\ub622\ub641\ub673", 500020765), hl.a("\uaca0", -1624527741), hl.a("\u8456\u8401\u8415\u8414\u8458\u841f\u841d\u8416\u841d\u840a\u8419\u840c\u841d\u841c\u8458\u841a\u8401\u8458\u840e\u841d\u840a\u840b\u8411\u8417\u8416", 319325304), hl.a("\u0c7a\u0c54\u0c19\u0c7a\u0c48", -1100936154), hl.a("\u8943", 138643808)};
    }

    static {
        gn_0.d();
    }
}

