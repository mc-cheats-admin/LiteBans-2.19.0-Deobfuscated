package litebans;

import java.io.File;
import java.io.IOException;
import litebans.hl;
import org.jetbrains.annotations.NotNull;

public static final class d6 {
    private static /* synthetic */ String[] a;

    public static final File a(@NotNull File file) {
        File file2;
        File file3 = file2 = file;
        boolean bl = false;
        if (!file.exists() && !file.createNewFile()) {
            throw new IOException(a[0] + file.getAbsolutePath());
        }
        return file2;
    }

    public static final File b(@NotNull File file) {
        File file2;
        File file3 = file2 = file;
        boolean bl = false;
        if (file.exists() && !file.delete()) {
            throw new IOException(a[1] + file.getAbsolutePath());
        }
        return file2;
    }

    public static final File c(@NotNull File file) {
        File file2;
        File file3 = file2 = file;
        boolean bl = false;
        if (!file.exists() && !file.mkdirs()) {
            throw new IOException(a[2] + file.getAbsolutePath());
        }
        if (!file.isDirectory()) {
            throw new IOException(a[3] + file.getAbsolutePath());
        }
        return file2;
    }

    private static final void a() {
        a = new String[]{hl.a("\uad0c\uad20\uad3a\uad23\uad2b\uad6f\uad21\uad20\uad3b\uad6f\uad2c\uad3d\uad2a\uad2e\uad3b\uad2a\uad6f\uad29\uad26\uad23\uad2a\uad75\uad6f", 1656728911), hl.a("\uae0f\uae23\uae39\uae20\uae28\uae6c\uae22\uae23\uae38\uae6c\uae28\uae29\uae20\uae29\uae38\uae29\uae6c\uae2a\uae25\uae20\uae29\uae76\uae6c", -2773428), hl.a("\u1715\u1713\u171c\u1711\u170a\u1758\u171e\u1719\u1711\u1714\u171d\u171c\u1742\u1758", -392095880), hl.a("\u1767\u1746\u175d\u1709\u1748\u1709\u174d\u1740\u175b\u174c\u174a\u175d\u1746\u175b\u1750\u1713\u1709", -1101981911)};
    }

    static {
        d6.a();
    }
}

