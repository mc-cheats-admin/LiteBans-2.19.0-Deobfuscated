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
import lombok.NonNull;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class DatabaseService
implements LiteBansModule_390,
Closeable {
    protected PlatformPlugin AsyncBackgroundTask_5;
    private File LiteBansModule_31;
    private Throwable c;
    private String BaseCoreGenericHandler = "";
    public DatabaseService(PlatformPlugin plugin) {
        this.AsyncBackgroundTask_5 = plugin;
    }

    public static InputStream BaseCoreGenericHandler(@NotNull String string, @Nullable String string2) {
        if (string2 == null) {
            string2 = StackTraceAnalyzer.BaseCoreGenericHandler(DatabaseService.class);
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

    public static String LiteBansModule_31(@NonNull String string, @Nullable String string2) {
        String string3;
        block9: {
            if (string == null) {
                throw new NullPointerException("resource is marked non-null but is null");
            }
            InputStream inputStream = DatabaseService.BaseCoreGenericHandler(string, string2);
            try {
                string3 = DatabaseService.LiteBansModule_31(inputStream);
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
    public static String LiteBansModule_31(@Nullable InputStream inputStream) {
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
    public static void BaseCoreGenericHandler(@NotNull File file, @NotNull String string, @Nullable String string2, boolean flag) {
        block16: {
            try (InputStream inputStream = DatabaseService.BaseCoreGenericHandler(string, string2);){
                if (inputStream == null) {
                    return;
                }
                File file2 = new File(file, string);
                int n = string.lastIndexOf(47);
                File file3 = new File(file, string.substring(0, n >= 0 ? n : 0));
                if (!file3.exists() && !file3.mkdirs()) {
                    throw new IOException("mkdir failed: " + file3.getAbsolutePath());
                }
                if (file2.exists() && file2.length() != 0L && !flag) break block16;
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

    public static String LiteBansModule_31(String string) {
        String[] args;
        String string2 = System.lineSeparator();
        StringBuilder stringBuilder = new StringBuilder();
        for (String string3 : args = string.split("\\r?\\n")) {
            if (string3.startsWith("#")) continue;
            stringBuilder.append(string3).append(string2);
        }
        string = stringBuilder.toString();
        return string;
    }

    public DatabaseService g() {
        if (this.c != null) {
            throw new RuntimeException(this.c);
        }
        return this;
    }

    @Override
    public boolean c(String string) {
        return this.LiteBansModule_31(string) != null;
    }

    @Override
    public boolean LiteBansModule_194(String string) {
        return this.LiteBansModule_31(string) != null;
    }

    public abstract DatabaseService c(File var1);

    public abstract DatabaseService BaseCoreGenericHandler(InputStream var1);

    public abstract DatabaseService LiteBansModule_194();

    public abstract DatabaseService LiteBansModule_240();

    public abstract DatabaseService BaseCoreGenericHandler(File var1);

    @Override
    public DatabaseService BaseCoreGenericHandler(String string) {
        this.plugin = string;
        return this;
    }

    public abstract DatabaseService BaseCoreGenericHandler();

    @Override
    public void close() {
        this.plugin();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void BaseCoreGenericHandler(File file, String string) {
        try (OutputStreamWriter outputStreamWriter = new OutputStreamWriter((OutputStream)new FileOutputStream(file), Charsets.UTF_8);){
            outputStreamWriter.write(this.e() + DatabaseService.LiteBansModule_31(string));
            outputStreamWriter.flush();
        }
    }

    public File c() {
        return this.LiteBansModule_31;
    }

    public void LiteBansModule_31(File file) {
        this.LiteBansModule_31 = file;
    }

    public Throwable LiteBansModule_31() {
        return this.c;
    }

    public void BaseCoreGenericHandler(Throwable throwable) {
        this.c = throwable;
    }

    public String e() {
        return this.plugin;
    }

    private static final void AsyncBackgroundTask_5() {
        e = new String[]{"", "resource is marked non-null but is null", "#Header 404", "", "#", "mkdir failed: ", "\\r?\\n", "#", ".yml generated LiteBansModule_61 version", "\\r?\\n", "#"};
    }

    }

