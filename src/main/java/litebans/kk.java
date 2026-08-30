package litebans;

import litebans.jv_0;

public final class kk
implements Runnable {
    final /* synthetic */ jv_0 a;
    final /* synthetic */ String b;

    public kk(jv_0 jv_02, String string) {
        this.a = jv_02;
        this.b = string;
    }

    @Override
    public final void run() {
        this.a.c(this.b);
    }
}

