package litebans;

import java.sql.Connection;
import litebans.am;
import litebans.ch;
import litebans.di_0;
import litebans.fS;
import litebans.fg_0;
import litebans.fo_0;
import litebans.hl;
import litebans.jv_0;
import litebans.kL;
import litebans.q_0;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from litebans.fs
 */
public static final class fs_0
extends fS {
    private static /* synthetic */ String[] m;

    public fs_0(@NotNull di_0 di_02) {
        super(di_02, m[0], null, 0, 0L, 28, null);
    }

    @Override
    public void a(@NotNull String string, @NotNull Connection connection, @NotNull ch ch2, boolean bl) {
        long l3 = ch2.c();
        kL[] kLArray = kL.values();
        boolean bl2 = false;
        int n = kLArray.length;
        for (int i = 0; i < n; ++i) {
            kL kL2;
            kL kL3 = kL2 = kLArray[i];
            boolean bl3 = false;
            fg_0 fg_02 = this;
            boolean bl4 = false;
            ch2.a(connection, kL3, ((q_0)fg_02.h().a(q_0.class)).f().ai());
        }
        long l5 = ch2.c();
        this.g().set(l5 - l3);
    }

    @Override
    public void a(@NotNull jv_0 jv_02) {
        fo_0.a(fg_0.a, jv_02, am.cL.a(m[1], (Object)this.g().get()), null, 4, null);
    }

    private static final void a() {
        m = new String[]{hl.a("\udfc8\udfed\udff0\udfe1\udfc6\udfe5\udfea\udff7", 1526128516), hl.a("\u5943\u594f\u594d\u5957\u594c\u5956", -344565470)};
    }

    static {
        fs_0.a();
    }
}

