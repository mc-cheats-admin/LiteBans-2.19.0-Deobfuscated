package litebans;

import com.mojang.brigadier.Command;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.minecraft.SharedConstants;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraft.network.chat.Component;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.network.ServerGamePacketListenerImpl;
import net.minecraft.server.players.PlayerList;
import net.minecraft.world.entity.player.Player;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class ArgsHandler
implements LiteBansModule_98 {
    protected final PlatformPlugin AsyncBackgroundTask_5;
    protected MinecraftServer c;
    protected final LiteBansModule_255 LiteBansModule_31 = new LiteBansModule_255();
    public ArgsHandler(PlatformPlugin plugin) {
        this.AsyncBackgroundTask_5 = plugin;
    }

    @Override
    public void BaseCoreGenericHandler(Object object, String string) {
        int n = this.LiteBansModule_31();
        V116Handler g82 = n >= 770 ? V116Handler.BaseCoreGenericHandler : V116Handler.c;
        ((ServerPlayer)object).connection.disconnect((Component)this.LiteBansModule_31().LiteBansModule_31(LiteBansModule_164.BaseCoreGenericHandler(string, g82)));
    }

    @Override
    public Object LiteBansModule_194() {
        return this.c.createCommandSourceStack();
    }

    @Override
    public String BaseCoreGenericHandler(Object object) {
        SocketAddress socketAddress;
        InetAddress inetAddress;
        if (object instanceof CommandSourceStack) {
            ServerPlayer serverPlayer = ((CommandSourceStack)object).getPlayer();
            if (serverPlayer == null) {
                return null;
            }
            return this.plugin(serverPlayer.connection);
        }
        if (object instanceof Player && (inetAddress = ((InetSocketAddress)(socketAddress = (InetSocketAddress)((ServerPlayer)object).connection.getRemoteAddress())).getAddress()) != null) {
            return inetAddress.getHostAddress();
        }
        if (object instanceof ServerPlayer && (socketAddress = ((ServerPlayer)object).connection.getRemoteAddress()) instanceof InetSocketAddress && (inetAddress = ((InetSocketAddress)socketAddress).getAddress()) != null) {
            return inetAddress.getHostAddress();
        }
        if (object instanceof ServerGamePacketListenerImpl) {
            return this.plugin(((ServerGamePacketListenerImpl)object).player);
        }
        return null;
    }

    @Override
    public boolean BaseCoreGenericHandler() {
        return this.c.usesAuthentication();
    }

    @Override
    public boolean e() {
        return this.c.isSameThread();
    }

    @Override
    public @Nullable List c() {
        PlayerList playerList = this.c.getPlayerList();
        if (playerList == null) {
            return null;
        }
        return playerList.getPlayers();
    }

    @Override
    public void BaseCoreGenericHandler(Runnable runnable) {
        this.c.execute(runnable);
    }

    @Override
    public void LiteBansModule_31(Object object, String string) {
        this.c.getCommands().performPrefixedCommand((CommandSourceStack)object, string);
    }

    @Override
    public int LiteBansModule_31() {
        try {
            return SharedConstants.getProtocolVersion();
        }
        catch (LinkageError linkageError) {
            this.AsyncBackgroundTask_5.getLogger().warning("Unable to determine server protocol version");
            return 770;
}

    @Override
    public Object AsyncBackgroundTask_5(Object object) {
        if (object instanceof ServerPlayer) {
            return ((ServerPlayer)object).createCommandSourceStack();
        }
        return object;
    }

    @Override
    public void c(Object object, String string) {
        if (object instanceof CommandSourceStack) {
            ((CommandSourceStack)object).sendSystemMessage((Component)this.LiteBansModule_31().LiteBansModule_31(string));
        } else {
            this.c(this.AsyncBackgroundTask_5(object), string);
}

    @Override
    public void BaseCoreGenericHandler(Object object, String string, byte[] byArray) {
        LiteBansModule_157.BaseCoreGenericHandler(object, string, byArray);
    }

    @Override
    public CommandSenderWrapper c(Object object) {
        String string = (object = this.AsyncBackgroundTask_5(object)) instanceof CommandSourceStack ? ((CommandSourceStack)object).getTextName() : object.toString();
        return (CommandSenderWrapper)((ConfigYmlHandler)this.AsyncBackgroundTask_5).BaseCoreGenericHandler().LiteBansModule_31.remove(string);
    }

    @Override
    public CommandSenderWrapper LiteBansModule_31(Object object) {
        return this.plugin(object, (Supplier)null);
    }

    @Override
    public CommandSenderWrapper BaseCoreGenericHandler(Object object, @Nullable Supplier supplier) {
        LiteBansCore core = ((ConfigYmlHandler)this.AsyncBackgroundTask_5).BaseCoreGenericHandler();
        Map map = core.LiteBansModule_31;
        String string = (object = this.AsyncBackgroundTask_5(object)) instanceof CommandSourceStack ? ((CommandSourceStack)object).getTextName() : object.toString();
        CommandSenderWrapper sender = (CommandSenderWrapper)map.get(string);
        if (sender == null || sender.c() != object) {
            sender = new BungeecordHandler_3((ConfigYmlHandler)this.AsyncBackgroundTask_5, object, supplier);
            core.LiteBansModule_194();
            map.put(string, sender);
        }
        return sender;
    }

    @Override
    public void BaseCoreGenericHandler(Function function) {
        CommandRegistrationCallback.EVENT.register((commandDispatcher, commandBuildContext, commandSelection) -> function.apply(commandDispatcher));
    }

    @Override
    public void BaseCoreGenericHandler(LiteBansModule_352 jq_02, CommandDispatcher commandDispatcher) {
        ArgumentBuilder argumentBuilder = ((LiteralArgumentBuilder)((LiteralArgumentBuilder)Commands.literal((String)jq_02.getName()).requires(commandSourceStack -> this.AsyncBackgroundTask_5.BaseCoreGenericHandler(commandSourceStack).e(jq_02.getPermission()))).executes((Command)jq_02)).then(Commands.argument((String)"args", (ArgumentType)StringArgumentType.greedyString()).suggests((SuggestionProvider)jq_02).executes((Command)jq_02));
        commandDispatcher.getRoot().getChildren().removeIf(commandNode -> commandNode.getName().equals(jq_02.getName()));
        commandDispatcher.register((LiteralArgumentBuilder)argumentBuilder);
    }

    @Override
    public boolean AsyncBackgroundTask_5(@Nullable Object object, @NotNull String string) {
        return LiteBansModule_381.BaseCoreGenericHandler(object, string);
    }

    @Override
    public void BaseCoreGenericHandler(MinecraftServer minecraftServer) {
        this.c = minecraftServer;
    }

    public LiteBansModule_255 LiteBansModule_31() {
        return this.LiteBansModule_31;
    }

    @Override
    public LiteBansModule_252 AsyncBackgroundTask_5() {
        return this.LiteBansModule_31();
    }

    private static final void BaseCoreGenericHandler() {
        BaseCoreGenericHandler = new String[]{"Unable to determine server protocol version", "args"};
}

