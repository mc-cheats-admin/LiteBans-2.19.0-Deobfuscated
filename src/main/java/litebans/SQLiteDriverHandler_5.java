package litebans;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.jetbrains.annotations.NotNull;

public final class SQLiteDriverHandler_5 {
    private final Utf8mb4UnicodeCiHandler LiteBansModule_31;
        public SQLiteDriverHandler_5(@NotNull Utf8mb4UnicodeCiHandler lq2) {
        this.LiteBansModule_31 = lq2;
    }

    public final Utf8mb4UnicodeCiHandler LiteBansModule_31() {
        return this.LiteBansModule_31;
    }

    public final String BaseCoreGenericHandler(@NotNull BansHandler_2 kL2, @NotNull String[] args) {
        BansHandler_2 kL3 = kL2;
        String[] filteredArgs = Arrays.copyOf(args, args.length);
        Utf8mb4UnicodeCiHandler lq2 = this.LiteBansModule_31();
        BansHandler_2 kL4 = kL3;
        char c = '(';
        Object targetObj = filteredArgs;
        StringBuilder stringBuilder = new StringBuilder();
        String[] parsedArgs = targetObj;
        Collection collection = new ArrayList();
        int n = parsedArgs.length;
        for (int i = 0; i < n; ++i) {
            String string;
            String string2 = string = parsedArgs[i];
            boolean flag6 = ((CharSequence)string2).length() > 0;
            if (!flag6) continue;
            collection.add(string);
        }
        targetObj = CollectionUtilities.BaseCoreGenericHandler((List)collection, ",", null, null, 0, null, null, 62, null);
        CharSequence charSequence = stringBuilder.append(c + (String)targetObj).append(')').append(lq2.AsyncBackgroundTask_5()).append(lq2.c()).toString();
        return SQLiteDriverHandler.e("CREATE TABLE IF NOT EXISTS " + kL4 + charSequence);
    }

    private static final void BaseCoreGenericHandler() {
        BaseCoreGenericHandler = new String[]{",", "CREATE TABLE IF NOT EXISTS ", "pgsql", " BYTEA NOT NULL", "BINARY", "BLOB", ")NOT NULL", "pgsql", " BYTEA NOT NULL", "BINARY", "BLOB", ")NOT NULL", " NOT NULL", " VARCHAR(", " VARCHAR(", "", " NOT NULL", " VARCHAR(", " VARCHAR(", " VARCHAR(", " VARCHAR(", "", " VARCHAR(", " VARCHAR(", "PRIMARY KEY(", " BIGINT NOT NULL", " BIGINT", " NOT NULL", " TIMESTAMP", " DEFAULT CURRENT_TIMESTAMP", " TIMESTAMP", "sqlite", " INTEGER PRIMARY KEY AUTOINCREMENT", " SERIAL", " INT NOT NULL", " INT", " NOT NULL", "pgsql", " SMALLINT NOT NULL", " TINYINT NOT NULL", "pgsql", "LiteBansModule_244", " SMALLINT NOT NULL", " TINYINT", " NOT NULL", "", "pgsql", "LiteBansModule_244", " SMALLINT NOT NULL", " TINYINT", " NOT NULL", " BIT", " NOT NULL", " BIT"};
    }

    static {
        SQLiteDriverHandler_5.BaseCoreGenericHandler();
    }
}

