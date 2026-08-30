package litebans;

import net.md_5.bungee.api.event.PlayerDisconnectEvent;
import net.md_5.bungee.event.EventHandler;
import org.jetbrains.annotations.NotNull;

@ModulePriority(priority=1)
public final class PlayerQuitListener
extends LiteBansModule_404
implements LiteBansModule_426 {
    public PlayerQuitListener(@NotNull PlatformPlugin plugin) {
        super(plugin);
    }

    @Override
    public void c() {
        LiteBansModule_175[] em_0Array = new LiteBansModule_175[]{this};
        this.plugin.BaseCoreGenericHandler(em_0Array);
    }

    @Override
    public void e() {
        if (!(this.plugin.AsyncBackgroundTask_22() == 1)) {
            String string = "Failed ";
            throw new IllegalArgumentException(string.toString());
        }
        this.plugin.BaseCoreGenericHandler(this);
        this.e();
    }

    @EventHandler
    public final void BaseCoreGenericHandler(@NotNull PlayerDisconnectEvent playerDisconnectEvent) {
        this.plugin.LiteBansModule_31(playerDisconnectEvent.getPlayer());
        ConfigService configService = this.plugin.BaseCoreGenericHandler(ConfigService.class);
        int n = configService.m();
        LiteBansModule_158 ec_02 = this.plugin.i();
        ObjectUtilities.LiteBansModule_31(ec_02, "");
        int n2 = ((GetcancelreasoncomponentsHandler)ec_02).c();
        configService.LiteBansModule_31(Math.max(n, n2));
    }

    public PlayerQuitListener e() {
        PlayerQuitListener m;
        PlayerQuitListener m2 = m = this;
        LiteBansModule_175[] em_0Array = new LiteBansModule_175[]{m2};
        m2.BaseCoreGenericHandler.LiteBansModule_31(em_0Array);
        return m;
    }

    @Override
    public LiteBansModule_175 BaseCoreGenericHandler() {
        return this.e();
}

