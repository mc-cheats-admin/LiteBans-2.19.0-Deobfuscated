package litebans;

import litebans.BukkitPlugin;
import litebans.hb_0;

static class de
implements Runnable {
    final /* synthetic */ BukkitPlugin a;

    de(BukkitPlugin bukkitPlugin) {
        this.a = bukkitPlugin;
    }

    @Override
    public void run() {
        if (!this.a.d()) {
            Thread.sleep(1250L);
        }
        hb_0 hb_02 = new hb_0(this.a);
        hb_02.a(hb_0.a(hb_0.class), true);
    }
}

