package litebans;

import java.util.concurrent.CopyOnWriteArrayList;
import litebans.aK;
import litebans.ew;
import litebans.fa_0;
import litebans.ij;

public final class jn
implements fa_0 {
    final /* synthetic */ String d;
    final /* synthetic */ CopyOnWriteArrayList e;

    jn(String string, CopyOnWriteArrayList copyOnWriteArrayList) {
        this.d = string;
        this.e = copyOnWriteArrayList;
    }

    @Override
    public boolean a(aK aK2, ij ij2, String string) {
        if (ij2 == ij.v && ew.a((Object)string, (Object)this.d) && aK2 != null) {
            this.e.add(aK2);
        }
        return true;
    }
}

