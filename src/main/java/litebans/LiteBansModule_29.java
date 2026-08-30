package litebans;

import java.io.Closeable;
import java.sql.PreparedStatement;
import org.jetbrains.annotations.NotNull;

public final class LiteBansModule_29
extends LiteBansModule_13 {
    private final Closeable LiteBansModule_31;

    public LiteBansModule_29(@NotNull PreparedStatement preparedStatement, @NotNull Closeable closeable) {
        super(preparedStatement);
        this.LiteBansModule_31 = closeable;
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
            Closeable closeable = this.LiteBansModule_31;
            try {
                closeable.close();
            }
            catch (Exception exception) {
                throw new RuntimeException(exception);
            }
        }
    }
}

