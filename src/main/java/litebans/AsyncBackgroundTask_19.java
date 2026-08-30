package litebans;

import java.util.Collection;
import litebans.api.Entry;
import litebans.api.Events$Listener;
public final class AsyncBackgroundTask_19
implements Runnable {
    final /* synthetic */ Collection c;
    final /* synthetic */ LiteBansModule_82 BaseCoreGenericHandler;
    final /* synthetic */ Entry LiteBansModule_31;

    public AsyncBackgroundTask_19(Collection collection, LiteBansModule_82 ch2, Entry entry) {
        this.c = collection;
        this.plugin = ch2;
        this.LiteBansModule_31 = entry;
    }

    @Override
    public final void run() {
        Iterable iterable = this.c;
        LiteBansModule_82 ch2 = this.plugin;
        for (Object t2 : iterable) {
            Events$Listener events$Listener = (Events$Listener)t2;
            try {
                Events$Listener events$Listener2 = events$Listener;
                events$Listener2.entryRemoved(this.LiteBansModule_31);
            }
            catch (Throwable throwable) {
                LiteBansModule_268.BaseCoreGenericHandler.BaseCoreGenericHandler(ch2, throwable);
}

