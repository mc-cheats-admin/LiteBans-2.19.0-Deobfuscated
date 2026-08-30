package litebans.api;

import java.sql.PreparedStatement;
import java.util.Collection;
import java.util.UUID;
import litebans.api.Entry;
import litebans.api.exception.MissingImplementationException;
import lombok.Generated;
import lombok.NonNull;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class Database {
    public static final String ANY_SERVER_SCOPE = "__ALL__";
    private static Database instance;

    public static Database get() {
        if (instance == null) {
            throw new MissingImplementationException();
        }
        return instance;
    }

    public abstract boolean isPlayerBanned(@Nullable UUID var1, @Nullable String var2);

    public abstract boolean isPlayerBanned(@Nullable UUID var1, @Nullable String var2, @Nullable String var3);

    public abstract boolean isPlayerMuted(@Nullable UUID var1, @Nullable String var2);

    public abstract boolean isPlayerMuted(@Nullable UUID var1, @Nullable String var2, @Nullable String var3);

    @Nullable
    public abstract Entry getBan(long var1, @Nullable String var3);

    @Nullable
    public abstract Entry getBan(@Nullable UUID var1, @Nullable String var2, @Nullable String var3);

    @Nullable
    public abstract Entry getMute(long var1, @Nullable String var3);

    @Nullable
    public abstract Entry getMute(@Nullable UUID var1, @Nullable String var2, @Nullable String var3);

    @Nullable
    public abstract Entry getWarning(long var1, @Nullable String var3);

    @Nullable
    public abstract Entry getWarning(@Nullable UUID var1, @Nullable String var2, @Nullable String var3);

    @Nullable
    public abstract Entry getKick(@Nullable UUID var1, @Nullable String var2, @Nullable String var3);

    @Nullable
    public abstract Entry getKick(long var1, @Nullable String var3);

    public abstract Collection getUsersByIP(String var1);

    @Nullable
    public abstract String getPlayerName(@NonNull UUID var1);

    @Nullable
    public abstract UUID getPlayerUUID(@NonNull String var1);

    public abstract PreparedStatement prepareStatement(@NotNull String var1);

    @Generated
    public static void setInstance(Database database) {
        instance = database;
    }
}

