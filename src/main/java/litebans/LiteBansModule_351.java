package litebans;

import java.util.concurrent.CopyOnWriteArrayList;
public final class LiteBansModule_351
implements LiteBansModule_201 {
    final /* synthetic */ String AsyncBackgroundTask_5;
    final /* synthetic */ CopyOnWriteArrayList e;

    LiteBansModule_351(String string, CopyOnWriteArrayList copyOnWriteArrayList) {
        this.AsyncBackgroundTask_5 = string;
        this.e = copyOnWriteArrayList;
    }

    @Override
    public boolean BaseCoreGenericHandler(LiteBansModule_15 aK2, BroadcastHandler ij2, String string) {
        if (ij2 == BroadcastHandler.CommandThrottleService && ObjectUtilities.BaseCoreGenericHandler((Object)string, (Object)this.AsyncBackgroundTask_5) && aK2 != null) {
            this.e.add(aK2);
        }
        return true;
    }
}

