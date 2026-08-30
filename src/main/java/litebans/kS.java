package litebans;

import java.util.Collection;
import litebans.api.Events$Listener;
import litebans.ch;
import litebans.hq;

public final class kS
implements Runnable {
    final /* synthetic */ Collection d;
    final /* synthetic */ ch c;
    final /* synthetic */ CharSequence a;
    final /* synthetic */ String b;

    public kS(Collection collection, ch ch2, CharSequence charSequence, String string) {
        this.d = collection;
        this.c = ch2;
        this.a = charSequence;
        this.b = string;
    }

    @Override
    public final void run() {
        Iterable iterable = this.d;
        ch ch2 = this.c;
        boolean bl = false;
        for (Object t2 : iterable) {
            Events$Listener events$Listener = (Events$Listener)t2;
            boolean bl2 = false;
            try {
                Events$Listener events$Listener2 = events$Listener;
                boolean bl3 = false;
                events$Listener2.broadcastSent(((Object)this.a).toString(), this.b);
            }
            catch (Throwable throwable) {
                hq.a.a(ch2, throwable);
            }
        }
    }
}

