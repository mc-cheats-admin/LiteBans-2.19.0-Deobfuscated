package litebans;

import java.io.File;
import org.jetbrains.annotations.NotNull;

public final class LiteBansException_9
extends RuntimeException {
    public LiteBansException_9(@NotNull File file, @NotNull String string, @NotNull String string2) {
        super("A downloaded dependency did not match the expected SHA-256 checksum!" + System.lineSeparator() + "Local checksum    : " + string2 + System.lineSeparator() + "Expected checksum : " + string + System.lineSeparator() + "File              : " + file.getAbsolutePath());
    }

    private static final void BaseCoreGenericHandler() {
        BaseCoreGenericHandler = new String[]{"A downloaded dependency did not match the expected SHA-256 checksum!", "Local checksum    : ", "Expected checksum : ", "File              : "};
}

