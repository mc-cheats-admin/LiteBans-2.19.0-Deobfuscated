package litebans;

import org.jetbrains.annotations.NotNull;

public final class LiteBansModule_203 {
    private LiteBansModule_203() {
    }

    public final BroadcastHandler BaseCoreGenericHandler(int n) {
        BroadcastHandler[] ijArray = BroadcastHandler.e();
        return ijArray.length <= n ? null : ijArray[n];
    }

    public final BroadcastHandler BaseCoreGenericHandler(@NotNull BanHandler a_2) {
        BroadcastHandler ij2;
        switch (LiteBansModule_243.BaseCoreGenericHandler[a_2.ordinal()]) {
            case 1: {
                ij2 = BroadcastHandler.DatabaseMonitorService;
                break;
            }
            case 2: {
                ij2 = BroadcastHandler.ServerSyncService;
                break;
            }
            case 3: {
                ij2 = BroadcastHandler.LiteBansModule_433;
                break;
            }
            case 4: {
                ij2 = BroadcastHandler.GnuSparseMapHandler;
                break;
            }
            case 5: {
                ij2 = BroadcastHandler.AsyncBackgroundTask_21;
                break;
            }
            case 6: {
                ij2 = BroadcastHandler.LiteBansModule_194;
                break;
            }
            case 7: {
                AssertionUtilities.BaseCoreGenericHandler();
                throw new CommandExitException();
            }
            default: {
                throw new LiteBansException_5();
}
        return ij2;
    }

    public /* synthetic */ LiteBansModule_203(LiteBansModule_14 aJ2) {
        this();
}

