package litebans;

import java.lang.ref.WeakReference;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.util.UUID;
import litebans.BungeePlugin;
import litebans.ai_0;
import litebans.bp_0;
import litebans.hl;
import litebans.hw_0;
import litebans.jv_0;
import lombok.NonNull;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.connection.PendingConnection;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.connection.Server;
import net.md_5.bungee.chat.ChatVersion;
import org.jetbrains.annotations.Nullable;

@ai_0(a=1)
public class ea_0
implements jv_0 {
    private final BungeePlugin i;
    private final WeakReference e;
    private UUID d = b;
    private String g = null;
    private String c;
    private final String f;
    private final boolean j;
    private static /* synthetic */ String[] h;

    public ea_0(BungeePlugin bungeePlugin, CommandSender commandSender) {
        this.i = bungeePlugin;
        this.e = new WeakReference<CommandSender>(commandSender);
        this.j = commandSender instanceof ProxiedPlayer;
        this.f = commandSender.getName();
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
            return this.f;
        }
        return this.e() ? ((ProxiedPlayer)commandSender).getDisplayName() : this.i();
    }

    @Override
    public Object c() {
        return this.e.get();
    }

    @Override
    public @Nullable String b() {
        CommandSender commandSender;
        String string = this.c;
        if (string == null && (commandSender = (CommandSender)this.e.get()) != null) {
            this.c = string = this.a(commandSender);
        }
        return string;
    }

    @Override
    public String i() {
        return this.f;
    }

    @Override
    public @Nullable String h() {
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
    public @NonNull UUID d() {
        UUID uUID;
        CommandSender commandSender;
        UUID uUID2 = this.d;
        if (uUID2.equals(b) && this.j && (commandSender = (CommandSender)this.e.get()) != null && (uUID = ((ProxiedPlayer)commandSender).getUniqueId()) != null) {
            this.d = uUID;
            return uUID;
        }
        return uUID2;
    }

    @Override
    public String a() {
        String string = this.g;
        return string == null || string.equals("00000000-0000-0000-0000-000000000000") ? (this.g = this.d().toString()) : string;
    }

    public int b() {
        Object object = this.c();
        if (object instanceof ProxiedPlayer) {
            PendingConnection pendingConnection = ((ProxiedPlayer)object).getPendingConnection();
            return pendingConnection.getVersion();
        }
        return 0;
    }

    public boolean equals(Object object) {
        return this == object || object instanceof ea_0 && ((ea_0)object).d().equals(this.d());
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
    public boolean f() {
        return !this.j;
    }

    @Override
    public boolean j() {
        CommandSender commandSender;
        if (this.j && (commandSender = (CommandSender)this.e.get()) != null) {
            return ((ProxiedPlayer)commandSender).isConnected();
        }
        return this.e.get() != null;
    }

    @Override
    public boolean e() {
        return this.j;
    }

    @Override
    public void d(@NonNull String string) {
        if (string == null) {
            throw new NullPointerException("reason is marked non-null but is null");
        }
        CommandSender commandSender = (CommandSender)this.e.get();
        if (commandSender == null) {
            return;
        }
        if (this.e()) {
            ProxiedPlayer proxiedPlayer = (ProxiedPlayer)commandSender;
            proxiedPlayer.disconnect(bp_0.a(string));
        }
    }

    @Override
    public void b(String string) {
        CommandSender commandSender = (CommandSender)this.e.get();
        if (commandSender == null) {
            return;
        }
        if (bp_0.b()) {
            if (this.b() >= 770) {
                commandSender.sendMessage(hw_0.a(string, ChatVersion.V1_21_5));
            } else {
                commandSender.sendMessage(hw_0.a(string, ChatVersion.V1_16));
            }
        } else {
            commandSender.sendMessage(bp_0.b(string));
        }
    }

    @Override
    public void a(String string) {
        CommandSender commandSender = (CommandSender)this.e.get();
        if (commandSender == null || this.j && !this.j()) {
            return;
        }
        commandSender.sendMessage(bp_0.a(string));
    }

    @Override
    public void a(String string, byte[] byArray) {
        CommandSender commandSender = (CommandSender)this.e.get();
        if (commandSender == null) {
            return;
        }
        if (this.e()) {
            ((ProxiedPlayer)commandSender).sendData(string, byArray);
        }
    }

    private final String a(CommandSender commandSender) {
        InetAddress inetAddress;
        InetSocketAddress inetSocketAddress;
        if (commandSender instanceof ProxiedPlayer && (inetSocketAddress = ((ProxiedPlayer)commandSender).getAddress()) != null && (inetAddress = inetSocketAddress.getAddress()) != null) {
            return inetAddress.getHostAddress();
        }
        return null;
    }

    private static final void a() {
        h = new String[]{"00000000-0000-0000-0000-000000000000", "reason is marked non-null but is null"};
    }

    static {
        ea_0.a();
    }
}

