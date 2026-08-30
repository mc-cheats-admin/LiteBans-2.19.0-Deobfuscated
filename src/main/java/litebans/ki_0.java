package litebans;

import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;

/*
 * Renamed from litebans.ki
 */
public static final class ki_0
extends Enum {
    public static final ki_0 c = new ki_0("SETUID", 0, 2048);
    public static final ki_0 m = new ki_0("SETGUI", 1, 1024);
    public static final ki_0 l = new ki_0("STICKY", 2, 512);
    public static final ki_0 k = new ki_0("USER_READ", 3, 256);
    public static final ki_0 d = new ki_0("USER_WRITE", 4, 128);
    public static final ki_0 a = new ki_0("USER_EXEC", 5, 64);
    public static final ki_0 f = new ki_0("GROUP_READ", 6, 32);
    public static final ki_0 e = new ki_0("GROUP_WRITE", 7, 16);
    public static final ki_0 g = new ki_0("GROUP_EXEC", 8, 8);
    public static final ki_0 j = new ki_0("WORLD_READ", 9, 4);
    public static final ki_0 h = new ki_0("WORLD_WRITE", 10, 2);
    public static final ki_0 i = new ki_0("WORLD_EXEC", 11, 1);
    private int b;
    private static final /* synthetic */ ki_0[] n;

    public static final ki_0[] values() {
        return (ki_0[])n.clone();
    }

    public static final ki_0 a(String string) {
        return Enum.valueOf(ki_0.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ki_0() {
        void var3_1;
        void var2_-1;
        void var1_-1;
        this.b = var3_1;
    }

    public static final Set a(int n) {
        HashSet<ki_0> hashSet = new HashSet<ki_0>();
        for (ki_0 ki_02 : ki_0.values()) {
            if ((n & ki_02.b) != ki_02.b) continue;
            hashSet.add(ki_02);
        }
        if (hashSet.isEmpty()) {
            return Collections.emptySet();
        }
        return EnumSet.copyOf(hashSet);
    }

    static {
        n = new ki_0[]{c, m, l, k, d, a, f, e, g, j, h, i};
    }
}

