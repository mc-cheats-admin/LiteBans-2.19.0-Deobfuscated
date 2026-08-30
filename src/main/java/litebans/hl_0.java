package litebans;

import java.lang.ref.WeakReference;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.util.UUID;
import litebans.BukkitPlugin;
import litebans.ax_0;
import litebans.es_0;
import litebans.gr_0;
import litebans.hl;
import litebans.ik_0;
import litebans.ip_0;
import litebans.jv_0;
import lombok.NonNull;
import org.bukkit.command.BlockCommandSender;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.jetbrains.annotations.Nullable;

public class hl_0
implements jv_0 {
    private final BukkitPlugin j;
    private final WeakReference k;
    private UUID i = b;
    private String h = null;
    private final String e;
    private String d;
    private final boolean c;
    private final boolean g;
    private static /* synthetic */ String[] f;

    public hl_0(BukkitPlugin bukkitPlugin, CommandSender commandSender) {
        boolean bl;
        this.j = bukkitPlugin;
        this.k = new WeakReference<CommandSender>(commandSender);
        this.c = bl = commandSender instanceof Player;
        this.g = !bl && commandSender instanceof ConsoleCommandSender;
        this.e = commandSender.getName();
    }

    public boolean equals(Object object) {
        return this == object || object instanceof hl_0 && ((hl_0)object).d().equals(this.d());
    }

    @Override
    public void c(String string) {
        CommandSender commandSender = (CommandSender)this.k.get();
        if (commandSender == null || string.isEmpty()) {
            return;
        }
        if (es_0.c()) {
            if (commandSender instanceof BlockCommandSender) {
                ax_0.a(this.j, ((BlockCommandSender)commandSender).getBlock().getLocation(), () -> this.j.getServer().dispatchCommand(commandSender, string));
            } else if (commandSender instanceof Entity) {
                ax_0.a(this.j, this, () -> this.j.getServer().dispatchCommand(commandSender, string));
            } else {
                ax_0.a(this.j, () -> this.j.getServer().dispatchCommand(commandSender, string));
            }
            return;
        }
        this.j.getServer().dispatchCommand(commandSender, string);
    }

    @Override
    public String g() {
        CommandSender commandSender = (CommandSender)this.k.get();
        if (commandSender == null) {
            return this.e;
        }
        return this.c ? ((Player)commandSender).getDisplayName() : this.i();
    }

    @Override
    public Object c() {
        return this.k.get();
    }

    @Override
    public String b() {
        CommandSender commandSender;
        String string = this.d;
        if (string == null && (commandSender = (CommandSender)this.k.get()) != null) {
            this.d = string = this.a(commandSender);
        }
        return string;
    }

    @Override
    public String i() {
        return this.e;
    }

    @Override
    public @Nullable String h() {
        return null;
    }

    @Override
    public @NonNull UUID d() {
        UUID uUID;
        CommandSender commandSender;
        UUID uUID2 = this.i;
        if (uUID2.equals(b) && this.c && (commandSender = (CommandSender)this.k.get()) != null && (uUID = ((Player)commandSender).getUniqueId()) != null) {
            this.i = uUID;
            return uUID;
        }
        return uUID2;
    }

    @Override
    public String a() {
        String string = this.h;
        return string == null || string.equals("00000000-0000-0000-0000-000000000000") ? (this.h = this.d().toString()) : string;
    }

    @Override
    public boolean e(@Nullable String string) {
        if (string == null) {
            return true;
        }
        CommandSender commandSender = (CommandSender)this.k.get();
        return commandSender != null && commandSender.hasPermission(string);
    }

    @Override
    public boolean f() {
        return this.g;
    }

    @Override
    public boolean j() {
        CommandSender commandSender = (CommandSender)this.k.get();
        return this.c && commandSender != null && ((Player)commandSender).isOnline();
    }

    @Override
    public boolean e() {
        return this.c;
    }

    @Override
    public void d(String string) {
        CommandSender commandSender = (CommandSender)this.k.get();
        if (commandSender == null) {
            return;
        }
        if (this.c) {
            Player player = (Player)commandSender;
            if (es_0.c() || this.j.getServer().isPrimaryThread()) {
                player.kickPlayer(string);
            } else {
                this.j.c(new ik_0(this, player, string));
            }
        }
    }

    @Override
    public void b(String string) {
        CommandSender commandSender = (CommandSender)this.k.get();
        if (commandSender == null || string == null) {
            return;
        }
        if (this.c) {
            Player player = (Player)commandSender;
            if (es_0.b()) {
                es_0.a(player, string);
            } else {
                this.a(this.a(string));
            }
        } else {
            this.a(this.a(string));
        }
    }

    @Override
    public void a(String string) {
        CommandSender commandSender = (CommandSender)this.k.get();
        if (commandSender == null) {
            return;
        }
        if (es_0.c() && commandSender instanceof BlockCommandSender) {
            ax_0.a(this.j, ((BlockCommandSender)commandSender).getBlock().getLocation(), () -> commandSender.sendMessage(string));
            return;
        }
        commandSender.sendMessage(string);
    }

    @Override
    public void a(String string, byte[] byArray) {
        CommandSender commandSender = (CommandSender)this.k.get();
        if (commandSender == null) {
            return;
        }
        if (this.c) {
            ((Player)commandSender).sendPluginMessage((Plugin)this.j, string, byArray);
        }
    }

    private final String a(String string) {
        gr_0 gr_02 = (gr_0)new ip_0().a(string);
        return (String)gr_02.get("text");
    }

    private final String a(CommandSender commandSender) {
        InetAddress inetAddress;
        InetSocketAddress inetSocketAddress;
        if (commandSender instanceof Player && (inetSocketAddress = ((Player)commandSender).getAddress()) != null && (inetAddress = inetSocketAddress.getAddress()) != null) {
            return inetAddress.getHostAddress();
        }
        return null;
    }

    private static final void a() {
        f = new String[]{"00000000-0000-0000-0000-000000000000", "text"};
    }

    static {
        hl_0.a();
    }
}

