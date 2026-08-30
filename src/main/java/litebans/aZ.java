package litebans;

import java.io.Closeable;
import java.sql.PreparedStatement;
import litebans.aH;
import org.jetbrains.annotations.NotNull;

public static final class aZ
extends aH {
    private final Closeable b;

    public aZ(@NotNull PreparedStatement preparedStatement, @NotNull Closeable closeable) {
        super(preparedStatement);
        this.b = closeable;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void close() {
        try {
            super.close();
        }
        finally {
            Closeable closeable = this.b;
            try {
                closeable.close();
            }
            catch (Exception exception) {
                throw new RuntimeException(exception);
            }
        }
    }
}

