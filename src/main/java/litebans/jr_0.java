package litebans;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import litebans.aR;
import litebans.hl;
import litebans.kL;
import litebans.ll;
import litebans.lq;
import org.jetbrains.annotations.NotNull;

public final class jr_0 {
    private final lq b;
    private static /* synthetic */ String[] a;

    public jr_0(@NotNull lq lq2) {
        this.b = lq2;
    }

    public final lq b() {
        return this.b;
    }

    public final String a(@NotNull kL kL2, @NotNull String[] stringArray) {
        kL kL3 = kL2;
        String[] stringArray2 = Arrays.copyOf(stringArray, stringArray.length);
        boolean bl = false;
        lq lq2 = this.b();
        boolean bl2 = false;
        kL kL4 = kL3;
        char c = '(';
        Object object = stringArray2;
        StringBuilder stringBuilder = new StringBuilder();
        boolean bl3 = false;
        String[] stringArray3 = object;
        Collection collection = new ArrayList();
        boolean bl4 = false;
        int n = stringArray3.length;
        for (int i = 0; i < n; ++i) {
            String string;
            String string2 = string = stringArray3[i];
            boolean bl5 = false;
            boolean bl6 = ((CharSequence)string2).length() > 0;
            if (!bl6) continue;
            collection.add(string);
        }
        object = ll.a((List)collection, ",", null, null, 0, null, null, 62, null);
        CharSequence charSequence = stringBuilder.append(c + (String)object).append(')').append(lq2.d()).append(lq2.c()).toString();
        boolean bl7 = false;
        return aR.e("CREATE TABLE IF NOT EXISTS " + kL4 + charSequence);
    }

    private static final void a() {
        a = new String[]{",", "CREATE TABLE IF NOT EXISTS ", "pgsql", " BYTEA NOT NULL", "BINARY", "BLOB", ")NOT NULL", "pgsql", " BYTEA NOT NULL", "BINARY", "BLOB", ")NOT NULL", " NOT NULL", " VARCHAR(", " VARCHAR(", "", " NOT NULL", " VARCHAR(", " VARCHAR(", " VARCHAR(", " VARCHAR(", "", " VARCHAR(", " VARCHAR(", "PRIMARY KEY(", " BIGINT NOT NULL", " BIGINT", " NOT NULL", " TIMESTAMP", " DEFAULT CURRENT_TIMESTAMP", " TIMESTAMP", "sqlite", " INTEGER PRIMARY KEY AUTOINCREMENT", " SERIAL", " INT NOT NULL", " INT", " NOT NULL", "pgsql", " SMALLINT NOT NULL", " TINYINT NOT NULL", "pgsql", "h2", " SMALLINT NOT NULL", " TINYINT", " NOT NULL", "", "pgsql", "h2", " SMALLINT NOT NULL", " TINYINT", " NOT NULL", " BIT", " NOT NULL", " BIT"};
    }

    static {
        jr_0.a();
    }
}

