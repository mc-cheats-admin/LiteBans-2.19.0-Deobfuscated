package litebans;

import java.util.Collection;
import litebans.api.Entry;
import litebans.api.Events$Listener;
import litebans.ch;
import litebans.hq;

public final class kV
implements Runnable {
    final /* synthetic */ Collection c;
    final /* synthetic */ ch a;
    final /* synthetic */ Entry b;

    public kV(Collection collection, ch ch2, Entry entry) {
        this.c = collection;
        this.a = ch2;
        this.b = entry;
    }

    @Override
    public final void run() {
        Iterable iterable = this.c;
        ch ch2 = this.a;
        boolean bl = false;
        for (Object t2 : iterable) {
            Events$Listener events$Listener = (Events$Listener)t2;
            boolean bl2 = false;
            try {
                Events$Listener events$Listener2 = events$Listener;
                boolean bl3 = false;
                events$Listener2.entryRemoved(this.b);
            }
            catch (Throwable throwable) {
                hq.a.a(ch2, throwable);
            }
        }
    }
}

