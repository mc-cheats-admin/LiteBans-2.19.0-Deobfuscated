package litebans;

import java.lang.ref.WeakReference;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.util.UUID;
import lombok.NonNull;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.connection.PendingConnection;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.connection.Server;
import net.md_5.bungee.chat.ChatVersion;
import org.jetbrains.annotations.Nullable;

@ModulePriority(priority=1)
public class LiteBansModule_154
implements CommandSenderWrapper {
    private final BungeePlugin i;
    private final WeakReference e;
    private UUID AsyncBackgroundTask_5 = LiteBansModule_31;
    private String g = null;
    private String c;
    private final String LiteBansModule_194;
    private final boolean GnuSparseMapHandler;
    public LiteBansModule_154(BungeePlugin bungeePlugin, CommandSender commandSender) {
        this.i = bungeePlugin;
        this.e = new WeakReference<CommandSender>(commandSender);
        this.GnuSparseMapHandler = commandSender instanceof ProxiedPlayer;
        this.LiteBansModule_194 = commandSender.getName();
    }

    @Override
    public void c(String string) {
        CommandSender commandSender = (CommandSender)this.e.get();
        if (commandSender == null || string.isEmpty()) {
            return;
        }
        this.i.getProxy().getPluginManager().dispatchCommand(commandSender, string);
    }

    @Override
    public String g() {
        CommandSender commandSender = (CommandSender)this.e.get();
        if (commandSender == null) {
            return this.LiteBansModule_194;
        }
        return this.e() ? ((ProxiedPlayer)commandSender).getDisplayName() : this.i();
    }

    @Override
    public Object c() {
        return this.e.get();
    }

    @Override
    public @Nullable String LiteBansModule_31() {
        CommandSender commandSender;
        String string = this.c;
        if (string == null && (commandSender = (CommandSender)this.e.get()) != null) {
            this.c = string = this.plugin(commandSender);
        }
        return string;
    }

    @Override
    public String i() {
        return this.LiteBansModule_194;
    }

    @Override
    public @Nullable String LiteBansModule_240() {
        CommandSender commandSender = (CommandSender)this.e.get();
        if (commandSender == null) {
            return null;
        }
        if (this.e()) {
            ProxiedPlayer proxiedPlayer = (ProxiedPlayer)commandSender;
            Server server = proxiedPlayer.getServer();
            if (server == null) {
                return null;
            }
            return server.getInfo().getName();
        }
        return null;
    }

    @Override
    public @NonNull UUID AsyncBackgroundTask_5() {
        UUID uUID;
        CommandSender commandSender;
        UUID uUID2 = this.AsyncBackgroundTask_5;
        if (uUID2.equals(LiteBansModule_31) && this.GnuSparseMapHandler && (commandSender = (CommandSender)this.e.get()) != null && (uUID = ((ProxiedPlayer)commandSender).getUniqueId()) != null) {
            this.AsyncBackgroundTask_5 = uUID;
            return uUID;
        }
        return uUID2;
    }

    @Override
    public String BaseCoreGenericHandler() {
        String string = this.g;
        return string == null || string.equals("00000000-0000-0000-0000-000000000000") ? (this.g = this.AsyncBackgroundTask_5().toString()) : string;
    }

    public int LiteBansModule_31() {
        Object object = this.c();
        if (object instanceof ProxiedPlayer) {
            PendingConnection pendingConnection = ((ProxiedPlayer)object).getPendingConnection();
            return pendingConnection.getVersion();
        }
        return 0;
    }

    public boolean equals(Object object) {
        return this == object || object instanceof LiteBansModule_154 && ((LiteBansModule_154)object).AsyncBackgroundTask_5().equals(this.AsyncBackgroundTask_5());
    }

    @Override
    public boolean e(@Nullable String string) {
        if (string == null) {
            return true;
        }
        CommandSender commandSender = (CommandSender)this.e.get();
        return commandSender != null && commandSender.hasPermission(string);
    }

    @Override
    public boolean LiteBansModule_194() {
        return !this.GnuSparseMapHandler;
    }

    @Override
    public boolean GnuSparseMapHandler() {
        CommandSender commandSender;
        if (this.GnuSparseMapHandler && (commandSender = (CommandSender)this.e.get()) != null) {
            return ((ProxiedPlayer)commandSender).isConnected();
        }
        return this.e.get() != null;
    }

    @Override
    public boolean e() {
        return this.GnuSparseMapHandler;
    }

    @Override
    public void AsyncBackgroundTask_5(@NonNull String string) {
        if (string == null) {
            throw new NullPointerException("reason is marked non-null but is null");
        }
        CommandSender commandSender = (CommandSender)this.e.get();
        if (commandSender == null) {
            return;
        }
        if (this.e()) {
            ProxiedPlayer proxiedPlayer = (ProxiedPlayer)commandSender;
            proxiedPlayer.disconnect(LiteBansModule_57.BaseCoreGenericHandler(string));
        }
    }

    @Override
    public void LiteBansModule_31(String string) {
        CommandSender commandSender = (CommandSender)this.e.get();
        if (commandSender == null) {
            return;
        }
        if (LiteBansModule_57.LiteBansModule_31()) {
            if (this.LiteBansModule_31() >= 770) {
                commandSender.sendMessage(LiteBansModule_280.BaseCoreGenericHandler(string, ChatVersion.V1_21_5));
            } else {
                commandSender.sendMessage(LiteBansModule_280.BaseCoreGenericHandler(string, ChatVersion.V1_16));
            }
        } else {
            commandSender.sendMessage(LiteBansModule_57.LiteBansModule_31(string));
        }
    }

    @Override
    public void BaseCoreGenericHandler(String string) {
        CommandSender commandSender = (CommandSender)this.e.get();
        if (commandSender == null || this.GnuSparseMapHandler && !this.GnuSparseMapHandler()) {
            return;
        }
        commandSender.sendMessage(LiteBansModule_57.BaseCoreGenericHandler(string));
    }

    @Override
    public void BaseCoreGenericHandler(String string, byte[] byArray) {
        CommandSender commandSender = (CommandSender)this.e.get();
        if (commandSender == null) {
            return;
        }
        if (this.e()) {
            ((ProxiedPlayer)commandSender).sendData(string, byArray);
        }
    }

    private final String BaseCoreGenericHandler(CommandSender commandSender) {
        InetAddress inetAddress;
        InetSocketAddress inetSocketAddress;
        if (commandSender instanceof ProxiedPlayer && (inetSocketAddress = ((ProxiedPlayer)commandSender).getAddress()) != null && (inetAddress = inetSocketAddress.getAddress()) != null) {
            return inetAddress.getHostAddress();
        }
        return null;
    }

    }

