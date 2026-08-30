package litebans;

import java.util.Collection;
import litebans.api.Entry;
import litebans.api.Events$Listener;
import litebans.ch;
import litebans.hq;

public static final class eu
implements Runnable {
    final /* synthetic */ Collection b;
    final /* synthetic */ ch c;
    final /* synthetic */ Entry a;

    public eu(Collection collection, ch ch2, Entry entry) {
        this.b = collection;
        this.c = ch2;
        this.a = entry;
    }

    @Override
    public final void run() {
        Iterable iterable = this.b;
        ch ch2 = this.c;
        boolean bl = false;
        for (Object t2 : iterable) {
            Events$Listener events$Listener = (Events$Listener)t2;
            boolean bl2 = false;
            try {
                Events$Listener events$Listener2 = events$Listener;
                boolean bl3 = false;
                events$Listener2.entryAdded(this.a);
            }
            catch (Throwable throwable) {
                hq.a.a(ch2, throwable);
            }
        }
    }
}

