package litebans;

import net.fabricmc.fabric.api.message.v1.ServerMessageEvents;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.network.chat.ChatType;
import net.minecraft.network.chat.PlayerChatMessage;
import net.minecraft.server.level.ServerPlayer;
import org.jetbrains.annotations.NotNull;

public final class LiteBansModule_366
implements LiteBansModule_51 {
    private final PlatformPlugin LiteBansModule_31;
    private final PunishmentTableService BaseCoreGenericHandler;

    public LiteBansModule_366(@NotNull PlatformPlugin plugin) {
        this.LiteBansModule_31 = plugin;
        this.plugin = (PunishmentTableService)this.LiteBansModule_31.BaseCoreGenericHandler(PunishmentTableService.class);
    }

    public final PlatformPlugin BaseCoreGenericHandler() {
        return this.LiteBansModule_31;
    }

    public LiteBansModule_366 LiteBansModule_31() {
        LiteBansModule_366 k52;
        LiteBansModule_366 k53 = k52 = this;
        ServerMessageEvents.ALLOW_CHAT_MESSAGE.register(k53::BaseCoreGenericHandler);
        ServerMessageEvents.ALLOW_COMMAND_MESSAGE.register(k53::BaseCoreGenericHandler);
        return k52;
    }

    public final boolean BaseCoreGenericHandler(@NotNull PlayerChatMessage playerChatMessage, @NotNull ServerPlayer serverPlayer, @NotNull ChatType.Bound bound) {
        CommandSenderWrapper sender = this.LiteBansModule_31.BaseCoreGenericHandler(serverPlayer);
        String string = playerChatMessage.decoratedContent().getString();
        LiteBansModule_71 c92 = new LiteBansModule_71(playerChatMessage, false, 2, null);
        TestHandler_2 f82 = this.plugin.BaseCoreGenericHandler();
        ObjectUtilities.BaseCoreGenericHandler(sender);
        f82.BaseCoreGenericHandler((Object)c92, string, sender, true);
        return !c92.BaseCoreGenericHandler();
    }

    public final boolean BaseCoreGenericHandler(@NotNull PlayerChatMessage playerChatMessage, @NotNull CommandSourceStack commandSourceStack, @NotNull ChatType.Bound bound) {
        CommandSenderWrapper sender = this.LiteBansModule_31.BaseCoreGenericHandler(commandSourceStack);
        String string = playerChatMessage.decoratedContent().getString();
        LiteBansModule_71 c92 = new LiteBansModule_71(playerChatMessage, false, 2, null);
        TestHandler_2 f82 = this.plugin.BaseCoreGenericHandler();
        ObjectUtilities.BaseCoreGenericHandler(sender);
        TestHandler_2.BaseCoreGenericHandler(f82, c92, string, sender, false, 8, null);
        return !c92.BaseCoreGenericHandler();
    }

    @Override
    public LiteBansModule_176 BaseCoreGenericHandler() {
        return this.LiteBansModule_31();
    }
}

