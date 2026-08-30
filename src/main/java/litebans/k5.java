package litebans;

import litebans.bk_0;
import litebans.c9;
import litebans.di_0;
import litebans.em_0;
import litebans.ew;
import litebans.f8;
import litebans.jv_0;
import litebans.p;
import net.fabricmc.fabric.api.message.v1.ServerMessageEvents;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.network.chat.ChatType;
import net.minecraft.network.chat.PlayerChatMessage;
import net.minecraft.server.level.ServerPlayer;
import org.jetbrains.annotations.NotNull;

public final class k5
implements bk_0 {
    private final di_0 b;
    private final p a;

    public k5(@NotNull di_0 di_02) {
        this.b = di_02;
        this.a = (p)this.b.a(p.class);
    }

    public final di_0 a() {
        return this.b;
    }

    public k5 b() {
        k5 k52;
        k5 k53 = k52 = this;
        boolean bl = false;
        ServerMessageEvents.ALLOW_CHAT_MESSAGE.register(k53::a);
        ServerMessageEvents.ALLOW_COMMAND_MESSAGE.register(k53::a);
        return k52;
    }

    public final boolean a(@NotNull PlayerChatMessage playerChatMessage, @NotNull ServerPlayer serverPlayer, @NotNull ChatType.Bound bound) {
        jv_0 jv_02 = this.b.a(serverPlayer);
        String string = playerChatMessage.decoratedContent().getString();
        c9 c92 = new c9(playerChatMessage, false, 2, null);
        f8 f82 = this.a.a();
        ew.a(jv_02);
        f82.a((Object)c92, string, jv_02, true);
        return !c92.a();
    }

    public final boolean a(@NotNull PlayerChatMessage playerChatMessage, @NotNull CommandSourceStack commandSourceStack, @NotNull ChatType.Bound bound) {
        jv_0 jv_02 = this.b.a(commandSourceStack);
        String string = playerChatMessage.decoratedContent().getString();
        c9 c92 = new c9(playerChatMessage, false, 2, null);
        f8 f82 = this.a.a();
        ew.a(jv_02);
        f8.a(f82, c92, string, jv_02, false, 8, null);
        return !c92.a();
    }

    @Override
    public em_0 a() {
        return this.b();
    }
}

