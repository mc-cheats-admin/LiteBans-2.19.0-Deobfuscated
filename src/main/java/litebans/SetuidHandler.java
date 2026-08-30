package litebans;

import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;

public final class SetuidHandler
extends Enum {
    public static final SetuidHandler c = new SetuidHandler("SETUID", 0, 2048);
    public static final SetuidHandler m = new SetuidHandler("SETGUI", 1, 1024);
    public static final SetuidHandler LiteBansModule_401 = new SetuidHandler("STICKY", 2, 512);
    public static final SetuidHandler Utf8Handler_2 = new SetuidHandler("USER_READ", 3, 256);
    public static final SetuidHandler AsyncBackgroundTask_5 = new SetuidHandler("USER_WRITE", 4, 128);
    public static final SetuidHandler BaseCoreGenericHandler = new SetuidHandler("USER_EXEC", 5, 64);
    public static final SetuidHandler LiteBansModule_194 = new SetuidHandler("GROUP_READ", 6, 32);
    public static final SetuidHandler e = new SetuidHandler("GROUP_WRITE", 7, 16);
    public static final SetuidHandler g = new SetuidHandler("GROUP_EXEC", 8, 8);
    public static final SetuidHandler GnuSparseMapHandler = new SetuidHandler("WORLD_READ", 9, 4);
    public static final SetuidHandler LiteBansModule_240 = new SetuidHandler("WORLD_WRITE", 10, 2);
    public static final SetuidHandler i = new SetuidHandler("WORLD_EXEC", 11, 1);
    private int LiteBansModule_31;
    private static final /* synthetic */ SetuidHandler[] n;

    public static final SetuidHandler[] values() {
        return (SetuidHandler[])n.clone();
    }

    public static final SetuidHandler BaseCoreGenericHandler(String string) {
        return Enum.valueOf(SetuidHandler.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private SetuidHandler() {
        void arg1;
        void var2_-1;
        void var1_-1;
        this.LiteBansModule_31 = arg1;
    }

    public static final Set BaseCoreGenericHandler(int n) {
        HashSet<SetuidHandler> hashSet = new HashSet<SetuidHandler>();
        for (SetuidHandler ki_02 : SetuidHandler.values()) {
            if ((n & ki_02.LiteBansModule_31) != ki_02.LiteBansModule_31) continue;
            hashSet.add(ki_02);
        }
        if (hashSet.isEmpty()) {
            return Collections.emptySet();
        }
        return EnumSet.copyOf(hashSet);
    }

    static {
        n = new SetuidHandler[]{c, m, LiteBansModule_401, Utf8Handler_2, AsyncBackgroundTask_5, BaseCoreGenericHandler, LiteBansModule_194, e, g, GnuSparseMapHandler, LiteBansModule_240, i};
}

