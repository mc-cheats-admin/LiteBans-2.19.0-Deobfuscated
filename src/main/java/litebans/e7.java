package litebans;

import com.velocitypowered.api.command.CommandSource;
import com.velocitypowered.api.event.PostOrder;
import com.velocitypowered.api.event.Subscribe;
import com.velocitypowered.api.event.command.CommandExecuteEvent;
import com.velocitypowered.api.event.player.PlayerChatEvent;
import com.velocitypowered.api.proxy.Player;
import litebans.di_0;
import litebans.ek_0;
import litebans.em_0;
import litebans.ew;
import litebans.f8;
import litebans.p;
import org.jetbrains.annotations.NotNull;

public final class e7
implements ek_0 {
    private final di_0 b;
    private final p a;

    public e7(@NotNull di_0 di_02) {
        this.b = di_02;
        this.a = (p)this.b.a(p.class);
    }

    public final di_0 b() {
        return this.b;
    }

    @Subscribe(order=PostOrder.EARLY)
    public final void a(@NotNull PlayerChatEvent playerChatEvent) {
        if (!playerChatEvent.getResult().isAllowed()) {
            return;
        }
        Player player = playerChatEvent.getPlayer();
        String string = playerChatEvent.getMessage();
        f8 f82 = this.a.a();
        ew.a((Object)string);
        f82.a((Object)playerChatEvent, string, this.b.a(player), true);
    }

    @Subscribe(order=PostOrder.EARLY)
    public final void a(@NotNull CommandExecuteEvent commandExecuteEvent) {
        CommandSource commandSource = commandExecuteEvent.getCommandSource();
        String string = commandExecuteEvent.getCommand();
        if (!commandExecuteEvent.getResult().isAllowed() || !(commandSource instanceof Player)) {
            return;
        }
        f8.a(this.a.a(), commandExecuteEvent, '/' + string, this.b.a(commandSource), false, 8, null);
    }

    @Override
    public e7 a() {
        e7 e72;
        e7 e73 = e72 = this;
        boolean bl = false;
        em_0[] em_0Array = new em_0[]{e73};
        e73.b.b(em_0Array);
        return e72;
    }

    @Override
    public em_0 a() {
        return this.a();
    }
}

