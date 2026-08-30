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

public abstract class gn_0
implements kr_0,
Closeable {
    protected di_0 d;
    private File b;
    private Throwable c;
    private String a = "";
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
                throw new NullPointerException("resource is marked non-null but is null");
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
                    return "#Header 404" + System.lineSeparator();
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
            return "";
        }
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream), 1024);){
            String string2;
            StringBuilder stringBuilder = new StringBuilder();
            while ((string2 = bufferedReader.readLine()) != null && string2.startsWith("#")) {
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
                    throw new IOException("mkdir failed: " + file3.getAbsolutePath());
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
        for (String string3 : stringArray = string.split("\\r?\\n")) {
            if (string3.startsWith("#")) continue;
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
        e = new String[]{"", "resource is marked non-null but is null", "#Header 404", "", "#", "mkdir failed: ", "\\r?\\n", "#", ".yml generated by version", "\\r?\\n", "#"};
    }

    static {
        gn_0.d();
    }
}

