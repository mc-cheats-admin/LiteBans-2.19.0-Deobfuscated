package litebans;

import java.util.Collection;
import litebans.api.Entry;
import litebans.api.Events$Listener;
public final class AsyncBackgroundTask_10
implements Runnable {
    final /* synthetic */ Collection LiteBansModule_31;
    final /* synthetic */ LiteBansModule_83 c;
    final /* synthetic */ Entry BaseCoreGenericHandler;

    public AsyncBackgroundTask_10(Collection collection, LiteBansModule_83 ch2, Entry entry) {
        this.LiteBansModule_31 = collection;
        this.c = ch2;
        this.plugin = entry;
    }

    @Override
    public final void run() {
        Iterable iterable = this.LiteBansModule_31;
        LiteBansModule_83 ch2 = this.c;
        for (Object t2 : iterable) {
            Events$Listener events$Listener = (Events$Listener)t2;
            try {
                Events$Listener events$Listener2 = events$Listener;
                events$Listener2.entryAdded(this.plugin);
            }
            catch (Throwable throwable) {
                LiteBansModule_269.BaseCoreGenericHandler.BaseCoreGenericHandler(ch2, throwable);
            }
        }
    }
}

