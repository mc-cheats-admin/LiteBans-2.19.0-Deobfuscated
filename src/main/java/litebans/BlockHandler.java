package litebans;

import java.io.Closeable;
import org.jetbrains.annotations.Nullable;

public final class BlockHandler {
    public static final void BaseCoreGenericHandler(@Nullable Closeable closeable, @Nullable Throwable throwable) {
        if (closeable != null) {
            if (throwable == null) {
                closeable.close();
            } else {
                try {
                    closeable.close();
                }
                catch (Throwable throwable2) {
                    LiteBansModule_36.BaseCoreGenericHandler(throwable, throwable2);
}

    private static final void BaseCoreGenericHandler() {
        BaseCoreGenericHandler = new String[]{"block"};
}

