package litebans;

import com.velocitypowered.api.command.CommandSource;
import com.velocitypowered.api.proxy.Player;
import com.velocitypowered.api.proxy.ServerConnection;
import com.velocitypowered.api.proxy.messages.ChannelIdentifier;
import com.velocitypowered.api.proxy.messages.LegacyChannelIdentifier;
import java.lang.ref.WeakReference;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.util.Optional;
import java.util.UUID;
import lombok.NonNull;
import net.kyori.adventure.text.Component;
import org.jetbrains.annotations.Nullable;

@ModulePriority(priority=2)
public class LiteBansModule_286
implements CommandSenderWrapper {
    private final VelocityPlugin LiteBansModule_195;
    private final WeakReference e;
    private final String c;
    private final boolean AsyncBackgroundTask_5;
    private UUID GnuSparseMapHandler = LiteBansModule_31;
    private String i = null;
    private String g;
        public LiteBansModule_286(VelocityPlugin velocityPlugin, CommandSource commandSource) {
        this.LiteBansModule_195 = velocityPlugin;
        this.e = new WeakReference<CommandSource>(commandSource);
        this.AsyncBackgroundTask_5 = commandSource instanceof Player;
        this.c = this.AsyncBackgroundTask_5 ? ((Player)commandSource).getUsername() : "[Console]";
    }

    public boolean equals(Object targetObj) {
        return this == targetObj || targetObj instanceof LiteBansModule_286 && ((LiteBansModule_286)targetObj).AsyncBackgroundTask_5().equals(this.AsyncBackgroundTask_5());
    }

    @Override
    public void c(String string) {
        CommandSource commandSource = (CommandSource)this.e.get();
        if (commandSource == null || string.isEmpty()) {
            return;
        }
        this.LiteBansModule_195.c.getCommandManager().executeAsync(commandSource, string);
    }

    @Override
    public String g() {
        return this.i();
    }

    @Override
    public Object c() {
        return this.e.get();
    }

    @Override
    public @Nullable String LiteBansModule_31() {
        CommandSource commandSource;
        String string = this.g;
        if (string == null && (commandSource = (CommandSource)this.e.get()) != null) {
            this.g = string = this.plugin(commandSource);
        }
        return string;
    }

    @Override
    public String i() {
        return this.c;
    }

    @Override
    public @Nullable String LiteBansModule_241() {
        CommandSource commandSource = (CommandSource)this.e.get();
        if (commandSource == null) {
            return null;
        }
        if (this.e()) {
            Player player = (Player)commandSource;
            Optional optional = player.getCurrentServer();
            if (!optional.isPresent()) {
                return null;
            }
            return ((ServerConnection)optional.get()).getServerInfo().getName();
        }
        return null;
    }

    @Override
    public @NonNull UUID AsyncBackgroundTask_5() {
        UUID uUID;
        CommandSource commandSource;
        UUID uUID2 = this.GnuSparseMapHandler;
        if (uUID2.equals(LiteBansModule_31) && this.AsyncBackgroundTask_5 && (commandSource = (CommandSource)this.e.get()) != null && (uUID = ((Player)commandSource).getUniqueId()) != null) {
            this.GnuSparseMapHandler = uUID;
            return uUID;
        }
        return uUID2;
    }

    @Override
    public String BaseCoreGenericHandler() {
        String string = this.i;
        return string == null || string.equals("00000000-0000-0000-0000-000000000000") ? (this.i = this.AsyncBackgroundTask_5().toString()) : string;
    }

    public int BaseCoreGenericHandler() {
        Object targetObj = this.c();
        if (targetObj instanceof Player) {
            Player player = (Player)targetObj;
            return player.getProtocolVersion().getProtocol();
        }
        return 0;
    }

    @Override
    public boolean e(@Nullable String string) {
        if (string == null) {
            return true;
        }
        CommandSource commandSource = (CommandSource)this.e.get();
        return commandSource != null && commandSource.hasPermission(string);
    }

    @Override
    public boolean LiteBansModule_195() {
        return !this.AsyncBackgroundTask_5;
    }

    @Override
    public boolean GnuSparseMapHandler() {
        CommandSource commandSource;
        if (this.AsyncBackgroundTask_5 && (commandSource = (CommandSource)this.e.get()) != null) {
            return ((Player)commandSource).isActive();
        }
        return this.e.get() != null;
    }

    @Override
    public boolean e() {
        return this.AsyncBackgroundTask_5;
    }

    @Override
    public void AsyncBackgroundTask_5(@NonNull String string) {
        if (string == null) {
            throw new NullPointerException("reason is marked non-null but is null");
        }
        CommandSource commandSource = (CommandSource)this.e.get();
        if (commandSource == null) {
            return;
        }
        if (this.e()) {
            ((Player)commandSource).disconnect((Component)LiteBansModule_305.BaseCoreGenericHandler(string));
        }
    }

    @Override
    public void LiteBansModule_31(String string) {
        CommandSource commandSource = (CommandSource)this.e.get();
        if (commandSource == null) {
            return;
        }
        commandSource.sendMessage(LiteBansModule_305.LiteBansModule_31(string));
    }

    @Override
    public void BaseCoreGenericHandler(String string) {
        CommandSource commandSource = (CommandSource)this.e.get();
        if (commandSource == null) {
            return;
        }
        commandSource.sendMessage((Component)LiteBansModule_305.BaseCoreGenericHandler(string));
    }

    @Override
    public void BaseCoreGenericHandler(String string, byte[] byArray) {
        CommandSource commandSource = (CommandSource)this.e.get();
        if (commandSource == null) {
            return;
        }
        if (this.e()) {
            ((Player)commandSource).sendPluginMessage((ChannelIdentifier)new LegacyChannelIdentifier(string), byArray);
        }
    }

    private final String BaseCoreGenericHandler(CommandSource commandSource) {
        InetAddress inetAddress;
        InetSocketAddress inetSocketAddress;
        if (commandSource instanceof Player && (inetSocketAddress = ((Player)commandSource).getRemoteAddress()) != null && (inetAddress = inetSocketAddress.getAddress()) != null) {
            return inetAddress.getHostAddress();
        }
        return null;
    }

    private static final void LiteBansModule_31() {
        LiteBansModule_241 = new String[]{"[Console]", "00000000-0000-0000-0000-000000000000", "reason is marked non-null but is null"};
    }

    static {
        LiteBansModule_286.LiteBansModule_31();
    }
}

