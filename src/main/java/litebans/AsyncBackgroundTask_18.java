package litebans;

import java.util.Collection;
import litebans.api.Events$Listener;
public final class AsyncBackgroundTask_18
implements Runnable {
    final /* synthetic */ Collection AsyncBackgroundTask_5;
    final /* synthetic */ LiteBansModule_83 c;
    final /* synthetic */ CharSequence BaseCoreGenericHandler;
    final /* synthetic */ String LiteBansModule_31;

    public AsyncBackgroundTask_18(Collection collection, LiteBansModule_83 ch2, CharSequence charSequence, String string) {
        this.AsyncBackgroundTask_5 = collection;
        this.c = ch2;
        this.plugin = charSequence;
        this.LiteBansModule_31 = string;
    }

    @Override
    public final void run() {
        Iterable iterable = this.AsyncBackgroundTask_5;
        LiteBansModule_83 ch2 = this.c;
        for (Object t2 : iterable) {
            Events$Listener events$Listener = (Events$Listener)t2;
            try {
                Events$Listener events$Listener2 = events$Listener;
                events$Listener2.broadcastSent(((Object)this.plugin).toString(), this.LiteBansModule_31);
            }
            catch (Throwable throwable) {
                LiteBansModule_269.BaseCoreGenericHandler.BaseCoreGenericHandler(ch2, throwable);
            }
        }
    }
}

