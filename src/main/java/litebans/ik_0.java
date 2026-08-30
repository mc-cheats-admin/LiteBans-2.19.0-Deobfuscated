package litebans;

import litebans.hl_0;
import org.bukkit.entity.Player;

static class ik_0
implements Runnable {
    final /* synthetic */ Player b;
    final /* synthetic */ String a;
    final /* synthetic */ hl_0 c;

    ik_0(hl_0 hl_02, Player player, String string) {
        this.b = player;
        this.a = string;
        this.c = hl_02;
    }

    @Override
    public void run() {
        this.b.kickPlayer(this.a);
    }
}

