package litebans;

import org.jetbrains.annotations.NotNull;

public final class AsyncBackgroundTask_3
implements Runnable {
    private final Object[] LiteBansModule_31;
        public AsyncBackgroundTask_3(@NotNull Object[] objectArray) {
        this.LiteBansModule_31 = objectArray;
    }

    public final Object[] c() {
        return this.LiteBansModule_31;
    }

    @Override
    public void run() {
        this.plugin();
    }

    private final int BaseCoreGenericHandler() {
        Object targetObj = this.LiteBansModule_31[0];
        ObjectUtilities.LiteBansModule_31(targetObj, "");
        String string = (String)targetObj;
        Object[] objectArray = new Object[]{this.LiteBansModule_31[1]};
        ConfigService.GnuSparseMapHandler.BaseCoreGenericHandler("/dev/null", string, "/dev/null", objectArray);
        return 0;
    }

    private static final void LiteBansModule_31() {
        BaseCoreGenericHandler = new String[]{"", "/dev/null", "/dev/null"};
    }

    static {
        AsyncBackgroundTask_3.LiteBansModule_31();
    }
}

