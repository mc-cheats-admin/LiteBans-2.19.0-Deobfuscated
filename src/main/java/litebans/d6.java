package litebans;

import java.io.File;
import java.io.IOException;
import litebans.hl;
import org.jetbrains.annotations.NotNull;

public final class d6 {
    private static /* synthetic */ String[] a;

    public static final File a(@NotNull File file) {
        File file2;
        File file3 = file2 = file;
        boolean bl = false;
        if (!file.exists() && !file.createNewFile()) {
            throw new IOException("Could not create file: " + file.getAbsolutePath());
        }
        return file2;
    }

    public static final File b(@NotNull File file) {
        File file2;
        File file3 = file2 = file;
        boolean bl = false;
        if (file.exists() && !file.delete()) {
            throw new IOException("Could not delete file: " + file.getAbsolutePath());
        }
        return file2;
    }

    public static final File c(@NotNull File file) {
        File file2;
        File file3 = file2 = file;
        boolean bl = false;
        if (!file.exists() && !file.mkdirs()) {
            throw new IOException("mkdir failed: " + file.getAbsolutePath());
        }
        if (!file.isDirectory()) {
            throw new IOException("Not a directory: " + file.getAbsolutePath());
        }
        return file2;
    }

    private static final void a() {
        a = new String[]{"Could not create file: ", "Could not delete file: ", "mkdir failed: ", "Not a directory: "};
    }

    static {
        d6.a();
    }
}

