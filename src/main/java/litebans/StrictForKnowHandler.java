package litebans;

import java.util.Arrays;
import java.util.zip.ZipException;
public class StrictForKnowHandler
extends Enum
implements LiteBansModule_137 {
    public static final StrictForKnowHandler LiteBansModule_194 = new LiteBansModule_169(LiteBansModule_400.c);
    public static final StrictForKnowHandler g = new StrictForKnowHandler("STRICT_FOR_KNOW_EXTRA_FIELDS", 1, LiteBansModule_400.c);
    public static final StrictForKnowHandler LiteBansModule_31 = new LiteBansModule_191(LiteBansModule_400.LiteBansModule_31);
    public static final StrictForKnowHandler BaseCoreGenericHandler = new StrictForKnowHandler("ONLY_PARSEABLE_STRICT", 3, LiteBansModule_400.LiteBansModule_31);
    public static final StrictForKnowHandler e = new StrictForKnowHandler("DRACONIC", 4, LiteBansModule_400.LiteBansModule_194);
    private final LiteBansModule_400 c;
    private static final /* synthetic */ StrictForKnowHandler[] AsyncBackgroundTask_5;

    public static final StrictForKnowHandler[] values() {
        return (StrictForKnowHandler[])AsyncBackgroundTask_5.clone();
    }

    public static final StrictForKnowHandler BaseCoreGenericHandler(String string) {
        return Enum.valueOf(StrictForKnowHandler.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private StrictForKnowHandler() {
        void arg1;
        void var2_-1;
        void var1_-1;
        this.c = arg1;
    }

    @Override
    public LiteBansModule_177 BaseCoreGenericHandler(byte[] byArray, int n, int n2, boolean flag, int n3) {
        return this.c.BaseCoreGenericHandler(byArray, n, n2, flag, n3);
    }

    @Override
    public LiteBansModule_177 BaseCoreGenericHandler(LiteBansModule_288 i22) {
        return LiteBansModule_8.BaseCoreGenericHandler(i22);
    }

    @Override
    public LiteBansModule_177 BaseCoreGenericHandler(LiteBansModule_177 en_02, byte[] byArray, int n, int n2, boolean flag) {
        return LiteBansModule_8.BaseCoreGenericHandler(en_02, byArray, n, n2, flag);
    }

    private static final LiteBansModule_177 c(LiteBansModule_177 en_02, byte[] byArray, int n, int n2, boolean flag) {
        try {
            return LiteBansModule_8.BaseCoreGenericHandler(en_02, byArray, n, n2, flag);
        }
        catch (ZipException zipException) {
            LiteBansModule_434 y_02 = new LiteBansModule_434();
            y_02.BaseCoreGenericHandler(en_02.c());
            if (flag) {
                y_02.LiteBansModule_31(Arrays.copyOfRange(byArray, n, n + n2));
            } else {
                y_02.BaseCoreGenericHandler(Arrays.copyOfRange(byArray, n, n + n2));
            }
            return y_02;
}

    /*
     * WARNING - void declaration
     */
    /* synthetic */ StrictForKnowHandler(LiteBansModule_400 kz_02, LiteBansModule_94 co_02) {
        this((String)var1_-1, (int)co_02, (LiteBansModule_400)arg2);
        void arg2;
        void var1_-1;
    }

    static final /* synthetic */ LiteBansModule_177 LiteBansModule_31(LiteBansModule_177 en_02, byte[] byArray, int n, int n2, boolean flag) {
        return StrictForKnowHandler.c(en_02, byArray, n, n2, flag);
    }

    static {
        AsyncBackgroundTask_5 = new StrictForKnowHandler[]{LiteBansModule_194, g, LiteBansModule_31, BaseCoreGenericHandler, e};
}

