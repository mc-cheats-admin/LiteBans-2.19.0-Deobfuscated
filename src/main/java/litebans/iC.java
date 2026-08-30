package litebans;

import litebans.ew;
import litebans.gh;
import litebans.hl;
import litebans.kd;
import org.jetbrains.annotations.NotNull;

public final class iC {
    private static /* synthetic */ String[] a;

    public static final kd a(@NotNull Enum[] enumArray) {
        ew.a((Object)enumArray, "entries");
        return new gh(enumArray);
    }

    private static final void a() {
        a = new String[]{"entriesProvider", "entries"};
    }

    static {
        iC.a();
    }
}

