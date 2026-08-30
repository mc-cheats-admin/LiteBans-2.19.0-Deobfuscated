package litebans;

import java.util.Arrays;
import java.util.zip.ZipException;
public class StrictForKnowHandler
extends Enum
implements LiteBansModule_138 {
    public static final StrictForKnowHandler LiteBansModule_195 = new LiteBansModule_170(LiteBansModule_402.c);
    public static final StrictForKnowHandler g = new StrictForKnowHandler("STRICT_FOR_KNOW_EXTRA_FIELDS", 1, LiteBansModule_402.c);
    public static final StrictForKnowHandler LiteBansModule_31 = new LiteBansModule_192(LiteBansModule_402.LiteBansModule_31);
    public static final StrictForKnowHandler BaseCoreGenericHandler = new StrictForKnowHandler("ONLY_PARSEABLE_STRICT", 3, LiteBansModule_402.LiteBansModule_31);
    public static final StrictForKnowHandler e = new StrictForKnowHandler("DRACONIC", 4, LiteBansModule_402.LiteBansModule_195);
    private final LiteBansModule_402 c;
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
        void v1;
        void var2_-1;
        void var1_-1;
        this.c = v1;
    }

    @Override
    public LiteBansModule_178 BaseCoreGenericHandler(byte[] byArray, int n, int n2, boolean flag, int n3) {
        return this.c.BaseCoreGenericHandler(byArray, n, n2, flag, n3);
    }

    @Override
    public LiteBansModule_178 BaseCoreGenericHandler(LiteBansModule_289 i22) {
        return LiteBansModule_8.BaseCoreGenericHandler(i22);
    }

    @Override
    public LiteBansModule_178 BaseCoreGenericHandler(LiteBansModule_178 en_02, byte[] byArray, int n, int n2, boolean flag) {
        return LiteBansModule_8.BaseCoreGenericHandler(en_02, byArray, n, n2, flag);
    }

    private static final LiteBansModule_178 c(LiteBansModule_178 en_02, byte[] byArray, int n, int n2, boolean flag) {
        try {
            return LiteBansModule_8.BaseCoreGenericHandler(en_02, byArray, n, n2, flag);
        }
        catch (ZipException zipException) {
            LiteBansModule_436 y_02 = new LiteBansModule_436();
            y_02.BaseCoreGenericHandler(en_02.c());
            if (flag) {
                y_02.LiteBansModule_31(Arrays.copyOfRange(byArray, n, n + n2));
            } else {
                y_02.BaseCoreGenericHandler(Arrays.copyOfRange(byArray, n, n + n2));
            }
            return y_02;
        }
    }

    /*
     * WARNING - void declaration
     */
    /* synthetic */ StrictForKnowHandler(LiteBansModule_402 kz_02, LiteBansModule_95 co_02) {
        this((String)var1_-1, (int)co_02, (LiteBansModule_402)v2);
        void v2;
        void var1_-1;
    }

    static final /* synthetic */ LiteBansModule_178 LiteBansModule_31(LiteBansModule_178 en_02, byte[] byArray, int n, int n2, boolean flag) {
        return StrictForKnowHandler.c(en_02, byArray, n, n2, flag);
    }

    static {
        AsyncBackgroundTask_5 = new StrictForKnowHandler[]{LiteBansModule_195, g, LiteBansModule_31, BaseCoreGenericHandler, e};
    }
}

