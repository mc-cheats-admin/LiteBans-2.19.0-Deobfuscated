package litebans;

import org.bukkit.entity.Player;

static class AsyncBackgroundTask_13
implements Runnable {
    final /* synthetic */ Player LiteBansModule_31;
    final /* synthetic */ String BaseCoreGenericHandler;
    final /* synthetic */ TextHandler c;

    AsyncBackgroundTask_13(TextHandler hl_02, Player player, String string) {
        this.LiteBansModule_31 = player;
        this.plugin = string;
        this.c = hl_02;
    }

    @Override
    public void run() {
        this.LiteBansModule_31.kickPlayer(this.plugin);
    }
}

