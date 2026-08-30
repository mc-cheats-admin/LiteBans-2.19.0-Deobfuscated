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
        boolean flag = false;
        Utf8mb4UnicodeCiHandler lq2 = this.LiteBansModule_31();
        boolean flag2 = false;
        BansHandler_2 kL4 = kL3;
        char c = '(';
        Object object = filteredArgs;
        StringBuilder stringBuilder = new StringBuilder();
        boolean flag3 = false;
        String[] parsedArgs = object;
        Collection collection = new ArrayList();
        boolean flag4 = false;
        int n = parsedArgs.length;
        for (int i = 0; i < n; ++i) {
            String string;
            String string2 = string = parsedArgs[i];
            boolean flag5 = false;
            boolean flag6 = ((CharSequence)string2).length() > 0;
            if (!flag6) continue;
            collection.add(string);
        }
        object = CollectionUtilities.BaseCoreGenericHandler((List)collection, ",", null, null, 0, null, null, 62, null);
        CharSequence charSequence = stringBuilder.append(c + (String)object).append(')').append(lq2.AsyncBackgroundTask_5()).append(lq2.c()).toString();
        boolean flag7 = false;
        return SQLiteDriverHandler.e("CREATE TABLE IF NOT EXISTS " + kL4 + charSequence);
    }

    private static final void BaseCoreGenericHandler() {
        BaseCoreGenericHandler = new String[]{",", "CREATE TABLE IF NOT EXISTS ", "pgsql", " BYTEA NOT NULL", "BINARY", "BLOB", ")NOT NULL", "pgsql", " BYTEA NOT NULL", "BINARY", "BLOB", ")NOT NULL", " NOT NULL", " VARCHAR(", " VARCHAR(", "", " NOT NULL", " VARCHAR(", " VARCHAR(", " VARCHAR(", " VARCHAR(", "", " VARCHAR(", " VARCHAR(", "PRIMARY KEY(", " BIGINT NOT NULL", " BIGINT", " NOT NULL", " TIMESTAMP", " DEFAULT CURRENT_TIMESTAMP", " TIMESTAMP", "sqlite", " INTEGER PRIMARY KEY AUTOINCREMENT", " SERIAL", " INT NOT NULL", " INT", " NOT NULL", "pgsql", " SMALLINT NOT NULL", " TINYINT NOT NULL", "pgsql", "LiteBansModule_243", " SMALLINT NOT NULL", " TINYINT", " NOT NULL", "", "pgsql", "LiteBansModule_243", " SMALLINT NOT NULL", " TINYINT", " NOT NULL", " BIT", " NOT NULL", " BIT"};
    }

    }

