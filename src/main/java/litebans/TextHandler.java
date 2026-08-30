package litebans;

import java.lang.ref.WeakReference;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.util.UUID;
import lombok.NonNull;
import org.bukkit.command.BlockCommandSender;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.jetbrains.annotations.Nullable;

public class TextHandler
implements CommandSenderWrapper {
    private final BukkitPlugin GnuSparseMapHandler;
    private final WeakReference Utf8Handler_2;
    private UUID i = LiteBansModule_31;
    private String LiteBansModule_241 = null;
    private final String e;
    private String AsyncBackgroundTask_5;
    private final boolean c;
    private final boolean g;
        public TextHandler(BukkitPlugin bukkitPlugin, CommandSender commandSender) {
        boolean flag;
        this.GnuSparseMapHandler = bukkitPlugin;
        this.Utf8Handler_2 = new WeakReference<CommandSender>(commandSender);
        this.c = flag = commandSender instanceof Player;
        this.g = !flag && commandSender instanceof ConsoleCommandSender;
        this.e = commandSender.getName();
    }

    public boolean equals(Object targetObj) {
        return this == targetObj || targetObj instanceof TextHandler && ((TextHandler)targetObj).AsyncBackgroundTask_5().equals(this.AsyncBackgroundTask_5());
    }

    @Override
    public void c(String string) {
        CommandSender commandSender = (CommandSender)this.Utf8Handler_2.get();
        if (commandSender == null || string.isEmpty()) {
            return;
        }
        if (OrgBukkitBlockHandler.c()) {
            if (commandSender instanceof BlockCommandSender) {
                LiteBansModule_26.BaseCoreGenericHandler(this.GnuSparseMapHandler, ((BlockCommandSender)commandSender).getBlock().getLocation(), () -> this.GnuSparseMapHandler.getServer().dispatchCommand(commandSender, string));
            } else if (commandSender instanceof Entity) {
                LiteBansModule_26.BaseCoreGenericHandler(this.GnuSparseMapHandler, this, () -> this.GnuSparseMapHandler.getServer().dispatchCommand(commandSender, string));
            } else {
                LiteBansModule_26.BaseCoreGenericHandler(this.GnuSparseMapHandler, () -> this.GnuSparseMapHandler.getServer().dispatchCommand(commandSender, string));
            }
            return;
        }
        this.GnuSparseMapHandler.getServer().dispatchCommand(commandSender, string);
    }

    @Override
    public String g() {
        CommandSender commandSender = (CommandSender)this.Utf8Handler_2.get();
        if (commandSender == null) {
            return this.e;
        }
        return this.c ? ((Player)commandSender).getDisplayName() : this.i();
    }

    @Override
    public Object c() {
        return this.Utf8Handler_2.get();
    }

    @Override
    public String LiteBansModule_31() {
        CommandSender commandSender;
        String string = this.AsyncBackgroundTask_5;
        if (string == null && (commandSender = (CommandSender)this.Utf8Handler_2.get()) != null) {
            this.AsyncBackgroundTask_5 = string = this.plugin(commandSender);
        }
        return string;
    }

    @Override
    public String i() {
        return this.e;
    }

    @Override
    public @Nullable String LiteBansModule_241() {
        return null;
    }

    @Override
    public @NonNull UUID AsyncBackgroundTask_5() {
        UUID uUID;
        CommandSender commandSender;
        UUID uUID2 = this.i;
        if (uUID2.equals(LiteBansModule_31) && this.c && (commandSender = (CommandSender)this.Utf8Handler_2.get()) != null && (uUID = ((Player)commandSender).getUniqueId()) != null) {
            this.i = uUID;
            return uUID;
        }
        return uUID2;
    }

    @Override
    public String BaseCoreGenericHandler() {
        String string = this.LiteBansModule_241;
        return string == null || string.equals("00000000-0000-0000-0000-000000000000") ? (this.LiteBansModule_241 = this.AsyncBackgroundTask_5().toString()) : string;
    }

    @Override
    public boolean e(@Nullable String string) {
        if (string == null) {
            return true;
        }
        CommandSender commandSender = (CommandSender)this.Utf8Handler_2.get();
        return commandSender != null && commandSender.hasPermission(string);
    }

    @Override
    public boolean LiteBansModule_195() {
        return this.g;
    }

    @Override
    public boolean GnuSparseMapHandler() {
        CommandSender commandSender = (CommandSender)this.Utf8Handler_2.get();
        return this.c && commandSender != null && ((Player)commandSender).isOnline();
    }

    @Override
    public boolean e() {
        return this.c;
    }

    @Override
    public void AsyncBackgroundTask_5(String string) {
        CommandSender commandSender = (CommandSender)this.Utf8Handler_2.get();
        if (commandSender == null) {
            return;
        }
        if (this.c) {
            Player player = (Player)commandSender;
            if (OrgBukkitBlockHandler.c() || this.GnuSparseMapHandler.getServer().isPrimaryThread()) {
                player.kickPlayer(string);
            } else {
                this.GnuSparseMapHandler.c(new AsyncBackgroundTask_13(this, player, string));
            }
        }
    }

    @Override
    public void LiteBansModule_31(String string) {
        CommandSender commandSender = (CommandSender)this.Utf8Handler_2.get();
        if (commandSender == null || string == null) {
            return;
        }
        if (this.c) {
            Player player = (Player)commandSender;
            if (OrgBukkitBlockHandler.LiteBansModule_31()) {
                OrgBukkitBlockHandler.BaseCoreGenericHandler(player, string);
            } else {
                this.plugin(this.plugin(string));
            }
        } else {
            this.plugin(this.plugin(string));
        }
    }

    @Override
    public void BaseCoreGenericHandler(String string) {
        CommandSender commandSender = (CommandSender)this.Utf8Handler_2.get();
        if (commandSender == null) {
            return;
        }
        if (OrgBukkitBlockHandler.c() && commandSender instanceof BlockCommandSender) {
            LiteBansModule_26.BaseCoreGenericHandler(this.GnuSparseMapHandler, ((BlockCommandSender)commandSender).getBlock().getLocation(), () -> commandSender.sendMessage(string));
            return;
        }
        commandSender.sendMessage(string);
    }

    @Override
    public void BaseCoreGenericHandler(String string, byte[] byArray) {
        CommandSender commandSender = (CommandSender)this.Utf8Handler_2.get();
        if (commandSender == null) {
            return;
        }
        if (this.c) {
            ((Player)commandSender).sendPluginMessage((Plugin)this.GnuSparseMapHandler, string, byArray);
        }
    }

    private final String BaseCoreGenericHandler(String string) {
        NullHandler_3 gr_02 = (NullHandler_3)new LiteBansModule_315().BaseCoreGenericHandler(string);
        return (String)gr_02.get("text");
    }

    private final String BaseCoreGenericHandler(CommandSender commandSender) {
        InetAddress inetAddress;
        InetSocketAddress inetSocketAddress;
        if (commandSender instanceof Player && (inetSocketAddress = ((Player)commandSender).getAddress()) != null && (inetAddress = inetSocketAddress.getAddress()) != null) {
            return inetAddress.getHostAddress();
        }
        return null;
    }

    private static final void BaseCoreGenericHandler() {
        LiteBansModule_195 = new String[]{"00000000-0000-0000-0000-000000000000", "text"};
    }

    static {
        TextHandler.BaseCoreGenericHandler();
    }
}

