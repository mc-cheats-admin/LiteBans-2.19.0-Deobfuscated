package litebans;

import java.io.File;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;

public final class LiteBansModule_112 {
    public static final File BaseCoreGenericHandler(@NotNull File file) {
        File file2;
        File file3 = file2 = file;
        boolean flag = false;
        if (!file.exists() && !file.createNewFile()) {
            throw new IOException("Could not create file: " + file.getAbsolutePath());
        }
        return file2;
    }

    public static final File LiteBansModule_31(@NotNull File file) {
        File file2;
        File file3 = file2 = file;
        boolean flag = false;
        if (file.exists() && !file.delete()) {
            throw new IOException("Could not delete file: " + file.getAbsolutePath());
        }
        return file2;
    }

    public static final File c(@NotNull File file) {
        File file2;
        File file3 = file2 = file;
        boolean flag = false;
        if (!file.exists() && !file.mkdirs()) {
            throw new IOException("mkdir failed: " + file.getAbsolutePath());
        }
        if (!file.isDirectory()) {
            throw new IOException("Not BaseCoreGenericHandler directory: " + file.getAbsolutePath());
        }
        return file2;
    }

    private static final void BaseCoreGenericHandler() {
        BaseCoreGenericHandler = new String[]{"Could not create file: ", "Could not delete file: ", "mkdir failed: ", "Not BaseCoreGenericHandler directory: "};
    }

    }

