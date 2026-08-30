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
import litebans.FabricPlugin;
import litebans.bd_0;
import litebans.cr_0;
import litebans.di_0;
import litebans.ec;
import litebans.eg_0;
import litebans.g8;
import litebans.hd;
import litebans.hf_0;
import litebans.hl;
import litebans.jh_0;
import litebans.jq_0;
import litebans.jv_0;
import litebans.kk_0;
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

public class iy
implements cr_0 {
    protected final di_0 d;
    protected MinecraftServer c;
    protected final hf_0 b = new hf_0();
    private static /* synthetic */ String[] a;

    public iy(di_0 di_02) {
        this.d = di_02;
    }

    @Override
    public void a(Object object, String string) {
        int n = this.b();
        g8 g82 = n >= 770 ? g8.a : g8.c;
        ((ServerPlayer)object).connection.disconnect((Component)this.b().b(eg_0.a(string, g82)));
    }

    @Override
    public Object f() {
        return this.c.createCommandSourceStack();
    }

    @Override
    public String a(Object object) {
        SocketAddress socketAddress;
        InetAddress inetAddress;
        if (object instanceof CommandSourceStack) {
            ServerPlayer serverPlayer = ((CommandSourceStack)object).getPlayer();
            if (serverPlayer == null) {
                return null;
            }
            return this.a(serverPlayer.connection);
        }
        if (object instanceof Player && (inetAddress = ((InetSocketAddress)(socketAddress = (InetSocketAddress)((ServerPlayer)object).connection.getRemoteAddress())).getAddress()) != null) {
            return inetAddress.getHostAddress();
        }
        if (object instanceof ServerPlayer && (socketAddress = ((ServerPlayer)object).connection.getRemoteAddress()) instanceof InetSocketAddress && (inetAddress = ((InetSocketAddress)socketAddress).getAddress()) != null) {
            return inetAddress.getHostAddress();
        }
        if (object instanceof ServerGamePacketListenerImpl) {
            return this.a(((ServerGamePacketListenerImpl)object).player);
        }
        return null;
    }

    @Override
    public boolean a() {
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
    public void a(Runnable runnable) {
        this.c.execute(runnable);
    }

    @Override
    public void b(Object object, String string) {
        this.c.getCommands().performPrefixedCommand((CommandSourceStack)object, string);
    }

    @Override
    public int b() {
        try {
            return SharedConstants.getProtocolVersion();
        }
        catch (LinkageError linkageError) {
            this.d.getLogger().warning("Unable to determine server protocol version");
            return 770;
        }
    }

    @Override
    public Object d(Object object) {
        if (object instanceof ServerPlayer) {
            return ((ServerPlayer)object).createCommandSourceStack();
        }
        return object;
    }

    @Override
    public void c(Object object, String string) {
        if (object instanceof CommandSourceStack) {
            ((CommandSourceStack)object).sendSystemMessage((Component)this.b().b(string));
        } else {
            this.c(this.d(object), string);
        }
    }

    @Override
    public void a(Object object, String string, byte[] byArray) {
        ec.a(object, string, byArray);
    }

    @Override
    public jv_0 c(Object object) {
        String string = (object = this.d(object)) instanceof CommandSourceStack ? ((CommandSourceStack)object).getTextName() : object.toString();
        return (jv_0)((FabricPlugin)this.d).a().b.remove(string);
    }

    @Override
    public jv_0 b(Object object) {
        return this.a(object, (Supplier)null);
    }

    @Override
    public jv_0 a(Object object, @Nullable Supplier supplier) {
        bd_0 bd_02 = ((FabricPlugin)this.d).a();
        Map map = bd_02.b;
        String string = (object = this.d(object)) instanceof CommandSourceStack ? ((CommandSourceStack)object).getTextName() : object.toString();
        jv_0 jv_02 = (jv_0)map.get(string);
        if (jv_02 == null || jv_02.c() != object) {
            jv_02 = new jh_0((FabricPlugin)this.d, object, supplier);
            bd_02.f();
            map.put(string, jv_02);
        }
        return jv_02;
    }

    @Override
    public void a(Function function) {
        CommandRegistrationCallback.EVENT.register((commandDispatcher, commandBuildContext, commandSelection) -> function.apply(commandDispatcher));
    }

    @Override
    public void a(jq_0 jq_02, CommandDispatcher commandDispatcher) {
        ArgumentBuilder argumentBuilder = ((LiteralArgumentBuilder)((LiteralArgumentBuilder)Commands.literal((String)jq_02.getName()).requires(commandSourceStack -> this.d.a(commandSourceStack).e(jq_02.getPermission()))).executes((Command)jq_02)).then(Commands.argument((String)"args", (ArgumentType)StringArgumentType.greedyString()).suggests((SuggestionProvider)jq_02).executes((Command)jq_02));
        commandDispatcher.getRoot().getChildren().removeIf(commandNode -> commandNode.getName().equals(jq_02.getName()));
        commandDispatcher.register((LiteralArgumentBuilder)argumentBuilder);
    }

    @Override
    public boolean d(@Nullable Object object, @NotNull String string) {
        return kk_0.a(object, string);
    }

    @Override
    public void a(MinecraftServer minecraftServer) {
        this.c = minecraftServer;
    }

    public hf_0 b() {
        return this.b;
    }

    @Override
    public hd d() {
        return this.b();
    }

    private static final void a() {
        a = new String[]{"Unable to determine server protocol version", "args"};
    }

    static {
        iy.a();
    }
}

