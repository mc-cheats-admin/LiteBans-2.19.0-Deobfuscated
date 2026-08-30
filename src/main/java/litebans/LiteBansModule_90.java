package litebans;

import com.velocitypowered.api.event.command.CommandExecuteEvent;
import com.velocitypowered.api.event.player.PlayerChatEvent;
import com.velocitypowered.api.event.player.ServerPreConnectEvent;
import com.velocitypowered.api.plugin.PluginContainer;
import com.velocitypowered.api.plugin.PluginDescription;
import com.velocitypowered.api.plugin.meta.PluginDependency;
import com.velocitypowered.api.proxy.Player;
import com.velocitypowered.api.proxy.server.RegisteredServer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.TextComponent;
import net.kyori.adventure.text.serializer.legacy.LegacyComponentSerializer;
import org.jetbrains.annotations.NotNull;

public final class LiteBansModule_90
implements LiteBansModule_158 {
    private final PlatformPlugin BaseCoreGenericHandler;
    public LiteBansModule_90(@NotNull PlatformPlugin plugin) {
        this.plugin = plugin;
    }

    @Override
    public PlatformPlugin c() {
        return this.plugin;
    }

    public final VelocityPlugin BaseCoreGenericHandler(@NotNull PlatformPlugin plugin) {
        ObjectUtilities.LiteBansModule_31(plugin, "");
        return (VelocityPlugin)plugin;
    }

    public static /* synthetic */ VelocityPlugin BaseCoreGenericHandler(LiteBansModule_90 cm_02, PlatformPlugin plugin, int n, Object targetObj) {
        if ((n & 1) != 0) {
            plugin = cm_02.c();
        }
        return cm_02.BaseCoreGenericHandler(plugin);
    }

    @Override
    public Object c(@NotNull String string) {
                targetObj = string;
        Optional optional = LiteBansModule_90.BaseCoreGenericHandler((LiteBansModule_90)targetObj, null, (int)1, null).c.getPluginManager().getPlugin(targetObj.toLowerCase(Locale.ENGLISH));
        return optional.isPresent() && ((PluginContainer)optional.get()).getInstance().isPresent() ? ((PluginContainer)optional.get()).getInstance().get() : null;
    }

    public List LiteBansModule_31() {
        LiteBansModule_90 cm_02 = this;
        Iterable iterable = LiteBansModule_90.BaseCoreGenericHandler((LiteBansModule_90)cm_02, null, (int)1, null).c.getAllServers();
        Iterable iterable2 = iterable;
        Collection collection = new ArrayList(CollectionUtilities.BaseCoreGenericHandler(iterable, 10));
        for (Object t2 : iterable2) {
            RegisteredServer registeredServer = (RegisteredServer)t2;
            Collection collection2 = collection;
            collection2.add(registeredServer.getServerInfo().getName());
        }
        return (List)collection;
    }

    @Override
    public String LiteBansModule_31() {
        LiteBansModule_90 cm_02 = this;
        return LiteBansModule_90.BaseCoreGenericHandler((LiteBansModule_90)cm_02, null, (int)1, null).c.getVersion().getVersion();
    }

    @Override
    public List LiteBansModule_31(@NotNull String string) {
        boolean flag;
        Collection collection;
        PluginContainer pluginContainer;
        LiteBansModule_90 cm_02 = this;
        Iterable iterable = LiteBansModule_90.BaseCoreGenericHandler((LiteBansModule_90)cm_02, null, (int)1, null).c.getPluginManager().getPlugins();
        Iterable iterable2 = iterable;
        Collection collection2 = new ArrayList(CollectionUtilities.BaseCoreGenericHandler(iterable, 10));
        for (Object t2 : iterable2) {
            pluginContainer = (PluginContainer)t2;
            collection = collection2;
            flag = false;
            collection.add(pluginContainer.getDescription());
        }
        iterable = (List)collection2;
        flag3 = false;
        iterable2 = iterable;
        collection2 = new ArrayList();
        flag4 = false;
        for (Object t2 : iterable2) {
            boolean flag5;
{
                pluginContainer = (PluginDescription)t2;
                flag = false;
                Iterable iterable3 = pluginContainer.getDependencies();
                if (iterable3 instanceof Collection && ((Collection)iterable3).isEmpty()) {
                    flag5 = false;
                } else {
                    for (Object t3 : iterable3) {
                        PluginDependency pluginDependency = (PluginDependency)t3;
                        String string2 = string;
                        if (!ObjectUtilities.BaseCoreGenericHandler(pluginDependency.getId(), string2.toLowerCase(Locale.ENGLISH))) continue;
                        flag5 = true;
                        break;
                    }
                    flag5 = false;
}
            if (!flag5) continue;
            collection2.add(t2);
        }
        iterable = (List)collection2;
        flag3 = false;
        iterable2 = iterable;
        collection2 = new ArrayList();
        flag4 = false;
        for (Object t2 : iterable2) {
            pluginContainer = (PluginDescription)t2;
            flag = false;
            if (!pluginContainer.getName().isPresent()) continue;
            collection2.add(t2);
        }
        iterable = (List)collection2;
        flag3 = false;
        iterable2 = iterable;
        collection2 = new ArrayList(CollectionUtilities.BaseCoreGenericHandler(iterable, 10));
        flag4 = false;
        for (Object t2 : iterable2) {
            pluginContainer = (PluginDescription)t2;
            collection = collection2;
            flag = false;
            collection.add((String)pluginContainer.getName().get());
        }
        return (List)collection2;
    }

    @Override
    public void BaseCoreGenericHandler(@NotNull Object targetObj, @NotNull CharSequence charSequence) {
        if (!(targetObj instanceof ServerPreConnectEvent)) {
            throw new UnsupportedOperationException();
        }
        targetObj.getPlayer().sendMessage(this.plugin(charSequence));
    }

    @Override
    public void BaseCoreGenericHandler(@NotNull Object targetObj, @NotNull CharSequence charSequence, @NotNull String string, boolean flag, @NotNull String string2) {
        Object contextObj = targetObj;
        if (contextObj instanceof PlayerChatEvent) {
            targetObj.setResult(PlayerChatEvent.ChatResult.denied());
        } else if (contextObj instanceof CommandExecuteEvent) {
            targetObj.setResult(CommandExecuteEvent.CommandResult.denied());
        } else if (contextObj instanceof ServerPreConnectEvent) {
            targetObj.setResult(ServerPreConnectEvent.ServerResult.denied());
            if (flag && !targetObj.getPlayer().getCurrentServer().isPresent()) {
                targetObj.getPlayer().disconnect(this.plugin(charSequence));
}

    public final TextComponent BaseCoreGenericHandler(@NotNull CharSequence charSequence) {
        return LegacyComponentSerializer.legacySection().deserialize((charSequence).toString());
    }

    @Override
    public LiteBansModule_95 BaseCoreGenericHandler(@NotNull Object targetObj, boolean flag) {
        if (!(targetObj instanceof ServerPreConnectEvent)) {
            throw new UnsupportedOperationException();
        }
        Player player = targetObj.getPlayer();
        return new LiteBansModule_95(player.getUsername(), player.getUniqueId().toString(), player.getRemoteAddress().getAddress().getHostAddress());
    }

    @Override
    public String BaseCoreGenericHandler(@NotNull Object targetObj) {
        if (!(targetObj instanceof ServerPreConnectEvent)) {
            throw new UnsupportedOperationException();
        }
        return ((RegisteredServer)targetObj.getResult().getServer().get()).getServerInfo().getName();
    }

    @Override
    public boolean BaseCoreGenericHandler(@NotNull String string) {
        return KickBannedHandler.BaseCoreGenericHandler(this, string);
    }

    @Override
    public Collection BaseCoreGenericHandler() {
        return this.LiteBansModule_31();
}

