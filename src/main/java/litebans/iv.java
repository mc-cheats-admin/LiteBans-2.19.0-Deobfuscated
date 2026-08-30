package litebans;

import java.io.File;
import litebans.hl;
import org.jetbrains.annotations.NotNull;

public final class iv
extends RuntimeException {
    private static /* synthetic */ String[] a;

    public iv(@NotNull File file, @NotNull String string, @NotNull String string2) {
        super("A downloaded dependency did not match the expected SHA-256 checksum!" + System.lineSeparator() + "Local checksum    : " + string2 + System.lineSeparator() + "Expected checksum : " + string + System.lineSeparator() + "File              : " + file.getAbsolutePath());
    }

    private static final void a() {
        a = new String[]{"A downloaded dependency did not match the expected SHA-256 checksum!", "Local checksum    : ", "Expected checksum : ", "File              : "};
    }

    static {
        iv.a();
    }
}

