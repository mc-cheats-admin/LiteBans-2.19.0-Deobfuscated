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
implements LiteBansModule_99 {
    protected final PlatformPlugin AsyncBackgroundTask_5;
    protected MinecraftServer c;
    protected final LiteBansModule_256 LiteBansModule_31 = new LiteBansModule_256();
        public ArgsHandler(PlatformPlugin plugin) {
        this.AsyncBackgroundTask_5 = plugin;
    }

    @Override
    public void BaseCoreGenericHandler(Object targetObj, String string) {
        int n = this.LiteBansModule_31();
        V116Handler g82 = n >= 770 ? V116Handler.BaseCoreGenericHandler : V116Handler.c;
        ((ServerPlayer)targetObj).connection.disconnect((Component)this.LiteBansModule_31().LiteBansModule_31(LiteBansModule_165.BaseCoreGenericHandler(string, g82)));
    }

    @Override
    public Object LiteBansModule_195() {
        return this.c.createCommandSourceStack();
    }

    @Override
    public String BaseCoreGenericHandler(Object targetObj) {
        SocketAddress socketAddress;
        InetAddress inetAddress;
        if (targetObj instanceof CommandSourceStack) {
            ServerPlayer serverPlayer = ((CommandSourceStack)targetObj).getPlayer();
            if (serverPlayer == null) {
                return null;
            }
            return this.plugin(serverPlayer.connection);
        }
        if (targetObj instanceof Player && (inetAddress = ((InetSocketAddress)(socketAddress = (InetSocketAddress)((ServerPlayer)targetObj).connection.getRemoteAddress())).getAddress()) != null) {
            return inetAddress.getHostAddress();
        }
        if (targetObj instanceof ServerPlayer && (socketAddress = ((ServerPlayer)targetObj).connection.getRemoteAddress()) instanceof InetSocketAddress && (inetAddress = ((InetSocketAddress)socketAddress).getAddress()) != null) {
            return inetAddress.getHostAddress();
        }
        if (targetObj instanceof ServerGamePacketListenerImpl) {
            return this.plugin(((ServerGamePacketListenerImpl)targetObj).player);
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
    public void LiteBansModule_31(Object targetObj, String string) {
        this.c.getCommands().performPrefixedCommand((CommandSourceStack)targetObj, string);
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
    }

    @Override
    public Object AsyncBackgroundTask_5(Object targetObj) {
        if (targetObj instanceof ServerPlayer) {
            return ((ServerPlayer)targetObj).createCommandSourceStack();
        }
        return targetObj;
    }

    @Override
    public void c(Object targetObj, String string) {
        if (targetObj instanceof CommandSourceStack) {
            ((CommandSourceStack)targetObj).sendSystemMessage((Component)this.LiteBansModule_31().LiteBansModule_31(string));
        } else {
            this.c(this.AsyncBackgroundTask_5(targetObj), string);
        }
    }

    @Override
    public void BaseCoreGenericHandler(Object targetObj, String string, byte[] byArray) {
        LiteBansModule_158.BaseCoreGenericHandler(targetObj, string, byArray);
    }

    @Override
    public CommandSenderWrapper c(Object targetObj) {
        String string = (targetObj = this.AsyncBackgroundTask_5(targetObj)) instanceof CommandSourceStack ? ((CommandSourceStack)targetObj).getTextName() : targetObj.toString();
        return (CommandSenderWrapper)((ConfigYmlHandler)this.AsyncBackgroundTask_5).BaseCoreGenericHandler().LiteBansModule_31.remove(string);
    }

    @Override
    public CommandSenderWrapper LiteBansModule_31(Object targetObj) {
        return this.plugin(targetObj, (Supplier)null);
    }

    @Override
    public CommandSenderWrapper BaseCoreGenericHandler(Object targetObj, @Nullable Supplier supplier) {
        LiteBansCore core = ((ConfigYmlHandler)this.AsyncBackgroundTask_5).BaseCoreGenericHandler();
        Map map = core.LiteBansModule_31;
        String string = (targetObj = this.AsyncBackgroundTask_5(targetObj)) instanceof CommandSourceStack ? ((CommandSourceStack)targetObj).getTextName() : targetObj.toString();
        CommandSenderWrapper sender = (CommandSenderWrapper)map.get(string);
        if (sender == null || sender.c() != targetObj) {
            sender = new BungeecordHandler_3((ConfigYmlHandler)this.AsyncBackgroundTask_5, targetObj, supplier);
            core.LiteBansModule_195();
            map.put(string, sender);
        }
        return sender;
    }

    @Override
    public void BaseCoreGenericHandler(Function function) {
        CommandRegistrationCallback.EVENT.register((commandDispatcher, commandBuildContext, commandSelection) -> function.apply(commandDispatcher));
    }

    @Override
    public void BaseCoreGenericHandler(LiteBansModule_354 jq_02, CommandDispatcher commandDispatcher) {
        ArgumentBuilder argumentBuilder = ((LiteralArgumentBuilder)((LiteralArgumentBuilder)Commands.literal((String)jq_02.getName()).requires(commandSourceStack -> this.AsyncBackgroundTask_5.BaseCoreGenericHandler(commandSourceStack).e(jq_02.getPermission()))).executes((Command)jq_02)).then(Commands.argument((String)"args", (ArgumentType)StringArgumentType.greedyString()).suggests((SuggestionProvider)jq_02).executes((Command)jq_02));
        commandDispatcher.getRoot().getChildren().removeIf(commandNode -> commandNode.getName().equals(jq_02.getName()));
        commandDispatcher.register((LiteralArgumentBuilder)argumentBuilder);
    }

    @Override
    public boolean AsyncBackgroundTask_5(@Nullable Object targetObj, @NotNull String string) {
        return LiteBansModule_383.BaseCoreGenericHandler(targetObj, string);
    }

    @Override
    public void BaseCoreGenericHandler(MinecraftServer minecraftServer) {
        this.c = minecraftServer;
    }

    public LiteBansModule_256 LiteBansModule_31() {
        return this.LiteBansModule_31;
    }

    @Override
    public LiteBansModule_253 AsyncBackgroundTask_5() {
        return this.LiteBansModule_31();
    }

    private static final void BaseCoreGenericHandler() {
        BaseCoreGenericHandler = new String[]{"Unable to determine server protocol version", "args"};
    }

    static {
        ArgsHandler.BaseCoreGenericHandler();
    }
}

