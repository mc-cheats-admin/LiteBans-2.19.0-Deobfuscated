package litebans;

import litebans.q_0;

public static final class hS
implements Runnable {
    final /* synthetic */ q_0 b;
    final /* synthetic */ String a;

    public hS(q_0 q_02, String string) {
        this.b = q_02;
        this.a = string;
    }

    @Override
    public final void run() {
        this.b.a.getLogger().info(this.a);
    }
}

