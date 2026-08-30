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

    public static /* synthetic */ Plugin BaseCoreGenericHandler(BungeecordHandler_2 ao_02, PlatformPlugin plugin, int n, Object object) {
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

    public final String LiteBansModule_31(@NotNull Object object) {
        ObjectUtilities.LiteBansModule_31(object, "");
        String string = ((OfflinePlayer)object).getName();
        ObjectUtilities.BaseCoreGenericHandler((Object)string);
        return string;
    }

    @Override
    public Object c(@NotNull String string) {
        return Bukkit.getServer().getPluginManager().getPlugin(string);
    }

    @Override
    public List LiteBansModule_31(@NotNull String string) {
        Collection collection;
        Object object32;
        Object object2 = Bukkit.getServer().getPluginManager().getPlugins();
        boolean flag = false;
        Object[] objectArray = object2;
        Collection collection2 = new ArrayList(((Object[])object2).length);
        boolean flag2 = false;
        for (Object object32 : objectArray) {
            Plugin plugin = (Plugin)object32;
            collection = collection2;
            boolean flag3 = false;
            collection.add(plugin.getDescription());
        }
        object2 = (List)collection2;
        flag = false;
        objectArray = object2;
        collection2 = new ArrayList();
        flag2 = false;
        for (Object t2 : objectArray) {
            object32 = (PluginDescriptionFile)t2;
            boolean flag4 = false;
            if (!(object32.getDepend().contains(string) || object32.getSoftDepend().contains(string))) continue;
            collection2.add(t2);
        }
        object2 = (List)collection2;
        flag = false;
        objectArray = object2;
        collection2 = new ArrayList(CollectionUtilities.BaseCoreGenericHandler((Iterable)object2, 10));
        flag2 = false;
        for (Object t3 : objectArray) {
            object32 = (PluginDescriptionFile)t3;
            collection = collection2;
            boolean flag5 = false;
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

    public final String c(@NotNull Object object) {
        String string;
        Object object2 = object;
        if (object2 instanceof AsyncPlayerChatEvent) {
            string = ((AsyncPlayerChatEvent)object).getMessage();
        } else if (object2 instanceof PlayerCommandPreprocessEvent) {
            string = ((PlayerCommandPreprocessEvent)object).getMessage();
        } else {
            this.plugin(object);
            throw new CommandExitException();
        }
        String string2 = string;
        ObjectUtilities.BaseCoreGenericHandler((Object)string2);
        return string2;
    }

    @Override
    public LiteBansModule_95 BaseCoreGenericHandler(@NotNull Object object, boolean flag) {
        String string;
        UUID uUID;
        if (object instanceof AsyncPlayerPreLoginEvent) {
            String string2 = ((AsyncPlayerPreLoginEvent)object).getName();
            UUID uUID2 = ((AsyncPlayerPreLoginEvent)object).getUniqueId();
            if (uUID2 == null) {
                throw new NullPointerException(object.getClass().getSimpleName() + ".getUniqueId() == null (" + string2 + ')');
            }
            uUID = uUID2;
            InetAddress inetAddress = ((AsyncPlayerPreLoginEvent)object).getAddress();
            if (inetAddress == null) {
                if (!flag) {
                    this.c().getLogger().warning(object.getClass().getSimpleName() + ".getAddress() == null (" + string2 + ')');
                }
                string = null;
            } else {
                string = inetAddress.getHostAddress();
            }
        } else {
            this.plugin(object);
            throw new CommandExitException();
        }
        String string3 = string;
        return new LiteBansModule_95(((AsyncPlayerPreLoginEvent)object).getName(), uUID.toString(), string3);
    }

    public Void BaseCoreGenericHandler(@NotNull Object object, @NotNull CharSequence charSequence) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String BaseCoreGenericHandler(@NotNull Object object) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void BaseCoreGenericHandler(@NotNull Object object, @NotNull CharSequence charSequence, @NotNull String string, boolean flag, @NotNull String string2) {
        if (object instanceof AsyncPlayerPreLoginEvent) {
            ((AsyncPlayerPreLoginEvent)object).disallow(AsyncPlayerPreLoginEvent.Result.valueOf((String)string2), ((Object)charSequence).toString());
            return;
        }
        if (object instanceof PlayerLoginEvent) {
            ((PlayerLoginEvent)object).disallow(PlayerLoginEvent.Result.valueOf((String)string2), ((Object)charSequence).toString());
            return;
        }
        if (object instanceof Cancellable) {
            if (flag) {
                ((Cancellable)object).setCancelled(true);
            }
            if (object instanceof AsyncPlayerChatEvent) {
                BungeecordHandler_2 ao_02 = this;
                AsyncPlayerChatEvent asyncPlayerChatEvent = (AsyncPlayerChatEvent)object;
                boolean flag2 = false;
                try {
                    asyncPlayerChatEvent.getRecipients().clear();
                }
                catch (UnsupportedOperationException unsupportedOperationException) {
                }
                ((AsyncPlayerChatEvent)object).setMessage(string + ((AsyncPlayerChatEvent)object).getMessage());
            } else if (object instanceof PlayerCommandPreprocessEvent) {
                ((PlayerCommandPreprocessEvent)object).setMessage('/' + string + ((PlayerCommandPreprocessEvent)object).getMessage());
            }
        } else {
            this.plugin(object);
            throw new CommandExitException();
        }
    }

    private final Void BaseCoreGenericHandler(Object object) {
        throw new MessageHandler_2(object.getClass().getName());
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
    }

    @Override
    public void BaseCoreGenericHandler(Object object, CharSequence charSequence) {
        this.plugin(object, charSequence);
    }

    private static final void BaseCoreGenericHandler() {
        BaseCoreGenericHandler = new String[]{"", "BungeeCord", "BungeeCord", "BungeeCord", "Kicking ", " from ", "KickPlayerRaw", "", ".getUniqueId() == null (", ".getAddress() == null (", "KickPlayer", "BungeeCord"};
    }

    }

