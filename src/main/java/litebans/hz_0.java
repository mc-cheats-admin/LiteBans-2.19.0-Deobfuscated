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
import litebans.VelocityPlugin;
import litebans.ai_0;
import litebans.hl;
import litebans.ih_0;
import litebans.jv_0;
import lombok.NonNull;
import net.kyori.adventure.text.Component;
import org.jetbrains.annotations.Nullable;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from litebans.hZ
 */
@ai_0(a=2)
public static class hz_0
implements jv_0 {
    private final VelocityPlugin f;
    private final WeakReference e;
    private final String c;
    private final boolean d;
    private UUID j = b;
    private String i = null;
    private String g;
    private static /* synthetic */ String[] h;

    public hz_0(VelocityPlugin velocityPlugin, CommandSource commandSource) {
        this.f = velocityPlugin;
        this.e = new WeakReference<CommandSource>(commandSource);
        this.d = commandSource instanceof Player;
        this.c = this.d ? ((Player)commandSource).getUsername() : h[0];
    }

    public boolean equals(Object object) {
        return this == object || object instanceof hz_0 && ((hz_0)object).d().equals(this.d());
    }

    @Override
    public void c(String string) {
        CommandSource commandSource = (CommandSource)this.e.get();
        if (commandSource == null || string.isEmpty()) {
            return;
        }
        this.f.c.getCommandManager().executeAsync(commandSource, string);
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
    public @Nullable String b() {
        CommandSource commandSource;
        String string = this.g;
        if (string == null && (commandSource = (CommandSource)this.e.get()) != null) {
            this.g = string = this.a(commandSource);
        }
        return string;
    }

    @Override
    public String i() {
        return this.c;
    }

    @Override
    public @Nullable String h() {
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
    public @NonNull UUID d() {
        UUID uUID;
        CommandSource commandSource;
        UUID uUID2 = this.j;
        if (uUID2.equals(b) && this.d && (commandSource = (CommandSource)this.e.get()) != null && (uUID = ((Player)commandSource).getUniqueId()) != null) {
            this.j = uUID;
            return uUID;
        }
        return uUID2;
    }

    @Override
    public String a() {
        String string = this.i;
        return string == null || string.equals(h[1]) ? (this.i = this.d().toString()) : string;
    }

    public int a() {
        Object object = this.c();
        if (object instanceof Player) {
            Player player = (Player)object;
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
    public boolean f() {
        return !this.d;
    }

    @Override
    public boolean j() {
        CommandSource commandSource;
        if (this.d && (commandSource = (CommandSource)this.e.get()) != null) {
            return ((Player)commandSource).isActive();
        }
        return this.e.get() != null;
    }

    @Override
    public boolean e() {
        return this.d;
    }

    @Override
    public void d(@NonNull String string) {
        if (string == null) {
            throw new NullPointerException(h[2]);
        }
        CommandSource commandSource = (CommandSource)this.e.get();
        if (commandSource == null) {
            return;
        }
        if (this.e()) {
            ((Player)commandSource).disconnect((Component)ih_0.a(string));
        }
    }

    @Override
    public void b(String string) {
        CommandSource commandSource = (CommandSource)this.e.get();
        if (commandSource == null) {
            return;
        }
        commandSource.sendMessage(ih_0.b(string));
    }

    @Override
    public void a(String string) {
        CommandSource commandSource = (CommandSource)this.e.get();
        if (commandSource == null) {
            return;
        }
        commandSource.sendMessage((Component)ih_0.a(string));
    }

    @Override
    public void a(String string, byte[] byArray) {
        CommandSource commandSource = (CommandSource)this.e.get();
        if (commandSource == null) {
            return;
        }
        if (this.e()) {
            ((Player)commandSource).sendPluginMessage((ChannelIdentifier)new LegacyChannelIdentifier(string), byArray);
        }
    }

    private final String a(CommandSource commandSource) {
        InetAddress inetAddress;
        InetSocketAddress inetSocketAddress;
        if (commandSource instanceof Player && (inetSocketAddress = ((Player)commandSource).getRemoteAddress()) != null && (inetAddress = inetSocketAddress.getAddress()) != null) {
            return inetAddress.getHostAddress();
        }
        return null;
    }

    private static final void b() {
        h = new String[]{hl.a("\ua689\ua691\ua6bd\ua6bc\ua6a1\ua6bd\ua6be\ua6b7\ua68f", -529291566), hl.a("\u47d1\u47d1\u47d1\u47d1\u47d1\u47d1\u47d1\u47d1\u47cc\u47d1\u47d1\u47d1\u47d1\u47cc\u47d1\u47d1\u47d1\u47d1\u47cc\u47d1\u47d1\u47d1\u47d1\u47cc\u47d1\u47d1\u47d1\u47d1\u47d1\u47d1\u47d1\u47d1\u47d1\u47d1\u47d1\u47d1", 1445152737), hl.a("\ufff7\uffe0\uffe4\ufff6\uffea\uffeb\uffa5\uffec\ufff6\uffa5\uffe8\uffe4\ufff7\uffee\uffe0\uffe1\uffa5\uffeb\uffea\uffeb\uffa8\uffeb\ufff0\uffe9\uffe9\uffa5\uffe7\ufff0\ufff1\uffa5\uffec\ufff6\uffa5\uffeb\ufff0\uffe9\uffe9", -182583419)};
    }

    static {
        hz_0.b();
    }
}

