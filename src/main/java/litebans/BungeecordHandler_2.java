package litebans;

import com.google.common.io.ByteArrayDataOutput;
import com.google.common.io.ByteStreams;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;
import org.bukkit.event.Cancellable;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.AsyncPlayerPreLoginEvent;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginDescriptionFile;
import org.jetbrains.annotations.NotNull;

@ModulePriority(priority=0)
public final class BungeecordHandler_2
implements LiteBansModule_158 {
    private final PlatformPlugin c;
    private final LiteBansModule_161 LiteBansModule_31;
    public BungeecordHandler_2(@NotNull PlatformPlugin plugin) {
        this.c = plugin;
        this.LiteBansModule_31 = ProxyConnection.BaseCoreGenericHandler(() -> BungeecordHandler_2.BaseCoreGenericHandler(this));
    }

    @Override
    public PlatformPlugin c() {
        return this.c;
    }

    public final DefaultHandler LiteBansModule_31() {
        LiteBansModule_161 eE2 = this.LiteBansModule_31;
        return (DefaultHandler)eE2.BaseCoreGenericHandler();
    }

    public final Plugin BaseCoreGenericHandler(@NotNull PlatformPlugin plugin) {
        ObjectUtilities.LiteBansModule_31(plugin, "");
        return (Plugin)plugin;
    }

    public static /* synthetic */ Plugin BaseCoreGenericHandler(BungeecordHandler_2 ao_02, PlatformPlugin plugin, int n, Object targetObj) {
        if ((n & 1) != 0) {
            plugin = ao_02.c();
        }
        return ao_02.BaseCoreGenericHandler(plugin);
    }

    public final void LiteBansModule_31(@NotNull CommandSenderWrapper sender, @NotNull String string) {
        if (!this.LiteBansModule_31("BungeeCord")) {
            this.plugin("BungeeCord");
        }
        this.c().BaseCoreGenericHandler(() -> BungeecordHandler_2.c(sender, string), 8L);
        if (sender.GnuSparseMapHandler()) {
            byte[] byArray = this.plugin(sender, string);
            sender.BaseCoreGenericHandler("BungeeCord", byArray);
        }
        this.c().getLogger().info("Kicking " + sender.i() + " from ");
    }

    public final byte[] BaseCoreGenericHandler(@NotNull CommandSenderWrapper sender, @NotNull String string) {
        LiteBansModule_120 de_02 = LiteBansModule_183.BaseCoreGenericHandler(LiteBansModule_120.c, this.LiteBansModule_31(), null, 2, null);
        ByteArrayDataOutput byteArrayDataOutput = ByteStreams.newDataOutput();
        byteArrayDataOutput.writeUTF("KickPlayerRaw");
        byteArrayDataOutput.writeUTF(sender.i());
        V116Handler g82 = de_02.BaseCoreGenericHandler(1, 21, 5) ? V116Handler.BaseCoreGenericHandler : V116Handler.c;
        byteArrayDataOutput.writeUTF(LiteBansModule_164.BaseCoreGenericHandler(string, g82));
        byte[] byArray = byteArrayDataOutput.toByteArray();
        ObjectUtilities.BaseCoreGenericHandler(byArray);
        return byArray;
    }

    public final Object BaseCoreGenericHandler(@NotNull UUID uUID) {
        BungeecordHandler_2.BaseCoreGenericHandler(this, null, 1, null).getServer().getVersion();
        return BungeecordHandler_2.BaseCoreGenericHandler(this, null, 1, null).getServer().getOfflinePlayer(uUID);
    }

    public final String LiteBansModule_31(@NotNull Object targetObj) {
        ObjectUtilities.LiteBansModule_31(targetObj, "");
        String string = targetObj.getName();
        ObjectUtilities.BaseCoreGenericHandler(string);
        return string;
    }

    @Override
    public Object c(@NotNull String string) {
        return Bukkit.getServer().getPluginManager().getPlugin(string);
    }

    @Override
    public List LiteBansModule_31(@NotNull String string) {
        Collection collection;
        Object contextObj = Bukkit.getServer().getPluginManager().getPlugins();
        Object[] objectArray = contextObj;
        Collection collection2 = new ArrayList(((Object[])contextObj).length);
        for (Object object32 : objectArray) {
            Plugin plugin = (Plugin)object32;
            collection = collection2;
            collection.add(plugin.getDescription());
        }
        contextObj = (List)collection2;
        flag = false;
        objectArray = contextObj;
        collection2 = new ArrayList();
        flag2 = false;
        for (Object t2 : objectArray) {
            object32 = (PluginDescriptionFile)t2;
            if (!(object32.getDepend().contains(string) || object32.getSoftDepend().contains(string))) continue;
            collection2.add(t2);
        }
        contextObj = (List)collection2;
        flag = false;
        objectArray = contextObj;
        collection2 = new ArrayList(CollectionUtilities.BaseCoreGenericHandler((Iterable)contextObj, 10));
        flag2 = false;
        for (Object t3 : objectArray) {
            object32 = (PluginDescriptionFile)t3;
            collection = collection2;
            collection.add(object32.getName());
        }
        return (List)collection2;
    }

    @Override
    public Collection BaseCoreGenericHandler() {
        return CollectionUtilities.e();
    }

    @Override
    public String LiteBansModule_31() {
        return BungeecordHandler_2.BaseCoreGenericHandler(this, null, 1, null).getServer().getBukkitVersion();
    }

    public final boolean LiteBansModule_31(@NotNull String string) {
        return BungeecordHandler_2.BaseCoreGenericHandler(this, null, 1, null).getServer().getMessenger().isOutgoingChannelRegistered(BungeecordHandler_2.BaseCoreGenericHandler(this, null, 1, null), string);
    }

    public final void BaseCoreGenericHandler(@NotNull String string) {
        BungeecordHandler_2.BaseCoreGenericHandler(this, null, 1, null).getServer().getMessenger().registerOutgoingPluginChannel(BungeecordHandler_2.BaseCoreGenericHandler(this, null, 1, null), string);
    }

    public final String c(@NotNull Object targetObj) {
        String string;
        Object contextObj = targetObj;
        if (contextObj instanceof AsyncPlayerChatEvent) {
            string = targetObj.getMessage();
        } else if (contextObj instanceof PlayerCommandPreprocessEvent) {
            string = targetObj.getMessage();
        } else {
            this.plugin(targetObj);
            throw new CommandExitException();
        }
        String string2 = string;
        ObjectUtilities.BaseCoreGenericHandler(string2);
        return string2;
    }

    @Override
    public LiteBansModule_95 BaseCoreGenericHandler(@NotNull Object targetObj, boolean flag) {
        String string;
        UUID uUID;
        if (targetObj instanceof AsyncPlayerPreLoginEvent) {
            String string2 = targetObj.getName();
            UUID uUID2 = targetObj.getUniqueId();
            if (uUID2 == null) {
                throw new NullPointerException(targetObj.getClass().getSimpleName() + ".getUniqueId() == null (" + string2 + ')');
            }
            uUID = uUID2;
            InetAddress inetAddress = targetObj.getAddress();
            if (inetAddress == null) {
                if (!flag) {
                    this.c().getLogger().warning(targetObj.getClass().getSimpleName() + ".getAddress() == null (" + string2 + ')');
                }
                string = null;
            } else {
                string = inetAddress.getHostAddress();
} else {
            this.plugin(targetObj);
            throw new CommandExitException();
        }
        String string3 = string;
        return new LiteBansModule_95(targetObj.getName(), uUID.toString(), string3);
    }

    public Void BaseCoreGenericHandler(@NotNull Object targetObj, @NotNull CharSequence charSequence) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String BaseCoreGenericHandler(@NotNull Object targetObj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void BaseCoreGenericHandler(@NotNull Object targetObj, @NotNull CharSequence charSequence, @NotNull String string, boolean flag, @NotNull String string2) {
        if (targetObj instanceof AsyncPlayerPreLoginEvent) {
            targetObj.disallow(AsyncPlayerPreLoginEvent.Result.valueOf((String)string2), (charSequence).toString());
            return;
        }
        if (targetObj instanceof PlayerLoginEvent) {
            targetObj.disallow(PlayerLoginEvent.Result.valueOf((String)string2), (charSequence).toString());
            return;
        }
        if (targetObj instanceof Cancellable) {
            if (flag) {
                targetObj.setCancelled(true);
            }
            if (targetObj instanceof AsyncPlayerChatEvent) {
                BungeecordHandler_2 ao_02 = this;
                AsyncPlayerChatEvent asyncPlayerChatEvent = (AsyncPlayerChatEvent)targetObj;
                try {
                    asyncPlayerChatEvent.getRecipients().clear();
                }
                catch (UnsupportedOperationException unsupportedOperationException) {
                }
                targetObj.setMessage(string + targetObj.getMessage());
            } else if (targetObj instanceof PlayerCommandPreprocessEvent) {
                targetObj.setMessage('/' + string + targetObj.getMessage());
} else {
            this.plugin(targetObj);
            throw new CommandExitException();
}

    private final Void BaseCoreGenericHandler(Object targetObj) {
        throw new MessageHandler_2(targetObj.getClass().getName());
    }

    @Override
    public boolean BaseCoreGenericHandler(@NotNull String string) {
        return KickBannedHandler.BaseCoreGenericHandler(this, string);
    }

    private static final DefaultHandler BaseCoreGenericHandler(BungeecordHandler_2 ao_02) {
        return new DefaultHandler(ao_02);
    }

    private static final void c(CommandSenderWrapper sender, String string) {
        if (sender.GnuSparseMapHandler()) {
            ByteArrayDataOutput byteArrayDataOutput = ByteStreams.newDataOutput();
            byteArrayDataOutput.writeUTF("KickPlayer");
            byteArrayDataOutput.writeUTF(sender.i());
            byteArrayDataOutput.writeUTF(string);
            sender.BaseCoreGenericHandler("BungeeCord", byteArrayDataOutput.toByteArray());
}

    @Override
    public void BaseCoreGenericHandler(Object targetObj, CharSequence charSequence) {
        this.plugin(targetObj, charSequence);
    }

    private static final void BaseCoreGenericHandler() {
        BaseCoreGenericHandler = new String[]{"", "BungeeCord", "BungeeCord", "BungeeCord", "Kicking ", " from ", "KickPlayerRaw", "", ".getUniqueId() == null (", ".getAddress() == null (", "KickPlayer", "BungeeCord"};
}

