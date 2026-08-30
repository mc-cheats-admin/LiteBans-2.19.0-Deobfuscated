package litebans;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import net.md_5.bungee.api.AbstractReconnectHandler;
import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.ReconnectHandler;
import net.md_5.bungee.api.chat.BaseComponent;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.config.ConfigurationAdapter;
import net.md_5.bungee.api.config.ListenerInfo;
import net.md_5.bungee.api.config.ServerInfo;
import net.md_5.bungee.api.connection.PendingConnection;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.event.ChatEvent;
import net.md_5.bungee.api.event.LoginEvent;
import net.md_5.bungee.api.event.ServerConnectEvent;
import net.md_5.bungee.api.plugin.Cancellable;
import net.md_5.bungee.api.plugin.Plugin;
import net.md_5.bungee.chat.ComponentSerializer;
import org.jetbrains.annotations.NotNull;

@ModulePriority(priority=1)
public final class GetcancelreasoncomponentsHandler
implements LiteBansModule_158 {
    private final PlatformPlugin AsyncBackgroundTask_5;
    private boolean LiteBansModule_31;
    private boolean c;
    public GetcancelreasoncomponentsHandler(@NotNull PlatformPlugin plugin) {
        GetcancelreasoncomponentsHandler k12;
        boolean flag;
        GetcancelreasoncomponentsHandler k13;
        this.AsyncBackgroundTask_5 = plugin;
        this.LiteBansModule_31 = true;
        this.c = true;
        GetcancelreasoncomponentsHandler k14 = this;
        try {
            k13 = k14;
            Class.forName("net.md_5.bungee.api.event.LoginEvent").getMethod("getCancelReasonComponents", new Class[0]);
            flag = true;
        }
        catch (NoSuchMethodException noSuchMethodException) {
            k13 = k14;
            flag = false;
        }
        k13.LiteBansModule_31 = flag;
        k14 = this;
        try {
            k12 = k14;
            Class[] classArray = new Class[]{String.class};
            Class.forName("net.md_5.bungee.api.plugin.Command").getDeclaredMethod("setPermissionMessage", classArray);
            flag = true;
        }
        catch (NoSuchMethodException noSuchMethodException) {
            k12 = k14;
            flag = false;
        }
        k12.c = flag;
    }

    @Override
    public PlatformPlugin c() {
        return this.AsyncBackgroundTask_5;
    }

    public final boolean BaseCoreGenericHandler() {
        return this.c;
    }

    public final ProxyServer c(@NotNull PlatformPlugin plugin) {
        return this.LiteBansModule_31(plugin).getProxy();
    }

    public final BungeePlugin LiteBansModule_31(@NotNull PlatformPlugin plugin) {
        ObjectUtilities.LiteBansModule_31(plugin, "");
        return (BungeePlugin)plugin;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean BaseCoreGenericHandler(@NotNull String string, @NotNull String string2, @NotNull String string3) {
        try {
            boolean flag;
            String string4;
            boolean flag2;
            ConfigurationAdapter configurationAdapter = this.c(this.c()).getConfigurationAdapter();
            Iterable iterable = configurationAdapter.getGroups(string);
            if (iterable instanceof Collection && ((Collection)iterable).isEmpty()) {
                flag2 = false;
            } else {
                for (Object t2 : iterable) {
                    string4 = (String)t2;
                    flag = false;
                    if (!StringUtilities.BaseCoreGenericHandler(string4, string3, true)) continue;
                    return true;
                }
                flag2 = false;
            }
            if (flag2) return true;
            iterable = configurationAdapter.getGroups(string2);
            flag4 = false;
            if (iterable instanceof Collection && ((Collection)iterable).isEmpty()) {
                return false;
            }
            Iterator iterator = iterable.iterator();
            do {
                Object t2;
                if (!iterator.hasNext()) return false;
                t2 = iterator.next();
                string4 = (String)t2;
                flag = false;
            } while (!StringUtilities.BaseCoreGenericHandler(string4, string3, true));
            return true;
        }
        catch (IllegalStateException illegalStateException) {
            return false;
}

    public final ThreadFactory BaseCoreGenericHandler(@NotNull PlatformPlugin plugin) {
        BungeePlugin bungeePlugin = this.LiteBansModule_31(plugin);
        ExecutorService executorService = bungeePlugin.getProxy().getScheduler().unsafe().getExecutorService((Plugin)bungeePlugin);
        ObjectUtilities.LiteBansModule_31(executorService, "");
        return ((ThreadPoolExecutor)executorService).getThreadFactory();
    }

    public final int c() {
        return this.c(this.c()).getPlayers().size();
    }

    @Override
    public Object c(@NotNull String string) {
        return ProxyServer.getInstance().getPluginManager().getPlugin(string);
    }

    @Override
    public List LiteBansModule_31(@NotNull String v1) {
        v2 = this.c(this.c()).getPluginManager().getPlugins();
        arg1 = v2;
        arg2 = new ArrayList<PunishmentService>();
        for (T arg3 : arg1) {
            arg4 = (Plugin)arg3;
            v0 = arg4;
            if (v0 != null && (v0 = v0.getDescription()) != null && (v0 = v0.getDepends()) != null ? v0.contains(v1) : false) ** GOTO lbl-1000
            v1 = arg4;
            v2 = v1 != null && (v1 = v1.getDescription()) != null && (v1 = v1.getSoftDepends()) != null ? v1.contains(v1) : false;
            if (v2) lbl-1000:
                        {
            } else {
            }
            if (!v3) continue;
            arg2.add(arg3);
        }
        v2 = (List)arg2;
        arg1 = v2;
        arg2 = new ArrayList<PunishmentService>(CollectionUtilities.BaseCoreGenericHandler(v2, 10));
        for (T arg3 : arg1) {
            arg4 = (Plugin)arg3;
            arg5 = arg2;
            v4   = arg4;
            if (v4   == null || (v4   = v4  .getDescription()) == null || (v4   = v4  .getName()) == null) {
                v4   = "";
            }
            arg5.add(v4  );
        }
        return (List)arg2;
    }

    @Override
    public Collection BaseCoreGenericHandler() {
        return this.c(this.c()).getServers().keySet();
    }

    @Override
    public String LiteBansModule_31() {
        return this.c(this.c()).getVersion();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean LiteBansModule_31(@NotNull String string, @NotNull String string2, @NotNull String string3) {
        try {
            boolean flag;
            String string4;
            boolean flag2;
            ConfigurationAdapter configurationAdapter = this.c(this.c()).getConfigurationAdapter();
            Iterable iterable = configurationAdapter.getGroups(string);
            if (iterable instanceof Collection && ((Collection)iterable).isEmpty()) {
                flag2 = false;
            } else {
                for (Object t2 : iterable) {
                    string4 = (String)t2;
                    flag = false;
                    if (!configurationAdapter.getPermissions(string4).contains(string3)) continue;
                    return true;
                }
                flag2 = false;
            }
            if (flag2) return true;
            iterable = configurationAdapter.getGroups(string2);
            flag4 = false;
            if (iterable instanceof Collection && ((Collection)iterable).isEmpty()) {
                return false;
            }
            Iterator iterator = iterable.iterator();
            do {
                Object t2;
                if (!iterator.hasNext()) return false;
                t2 = iterator.next();
                string4 = (String)t2;
                flag = false;
            } while (!configurationAdapter.getPermissions(string4).contains(string3));
            return true;
        }
        catch (Exception exception) {
            boolean flag = exception instanceof ClassCastException;
            if (flag) {
                this.c().getLogger().warning("Bungee permission config (InitializerHandler_3 Bungee config.yml) is invalid, ignoring. No players will be ");
            }
            if (exception instanceof IllegalStateException) return false;
            if (!flag) throw exception;
            return false;
}

    public final void BaseCoreGenericHandler(@NotNull CommandSenderWrapper sender, @NotNull String string) {
        Object targetObj = sender.c();
        ObjectUtilities.LiteBansModule_31(targetObj, "");
        BaseComponent[] baseComponentArray = ComponentSerializer.parse((String)string);
        targetObj.disconnect(Arrays.copyOf(baseComponentArray, baseComponentArray.length));
    }

    @Override
    public LiteBansModule_95 BaseCoreGenericHandler(@NotNull Object targetObj, boolean flag) {
        if (!(targetObj instanceof ServerConnectEvent)) {
            throw new UnsupportedOperationException();
        }
        ProxiedPlayer proxiedPlayer = targetObj.getPlayer();
        return new LiteBansModule_95(proxiedPlayer.getName(), proxiedPlayer.getUniqueId().toString(), proxiedPlayer.getAddress().getAddress().getHostAddress());
    }

    @Override
    public void BaseCoreGenericHandler(@NotNull Object targetObj, @NotNull CharSequence charSequence) {
        Object contextObj = targetObj;
        if (contextObj instanceof ServerConnectEvent) {
            if (targetObj.getPlayer().isConnected()) {
                BaseComponent[] baseComponentArray = TextComponent.fromLegacyText((String)(charSequence).toString());
                targetObj.getPlayer().sendMessage(Arrays.copyOf(baseComponentArray, baseComponentArray.length));
} else if (!(contextObj instanceof LoginEvent)) {
            throw new UnsupportedOperationException();
}

    @Override
    public String BaseCoreGenericHandler(@NotNull Object targetObj) {
        if (!(targetObj instanceof ServerConnectEvent)) {
            throw new UnsupportedOperationException();
        }
        return targetObj.getTarget().getName();
    }

    @Override
    public void BaseCoreGenericHandler(@NotNull Object targetObj, @NotNull CharSequence charSequence, @NotNull String string, boolean flag, @NotNull String string2) {
        if (targetObj instanceof Cancellable) {
            targetObj.setCancelled(true);
        }
        if ((contextObj = targetObj) instanceof ChatEvent) {
            boolean flag2 = StringUtilities.BaseCoreGenericHandler((CharSequence)targetObj.getMessage(), '/', false, 2, null);
            targetObj.setMessage((flag2 ? "/" : "") + string + targetObj.getMessage());
        } else if (contextObj instanceof LoginEvent) {
            if (this.LiteBansModule_31) {
                BaseComponent[] baseComponentArray = TextComponent.fromLegacyText((String)(charSequence).toString());
                targetObj.setCancelReason(Arrays.copyOf(baseComponentArray, baseComponentArray.length));
            } else {
                LiteBansModule_225.BaseCoreGenericHandler.BaseCoreGenericHandler(targetObj, charSequence);
} else if (contextObj instanceof ServerConnectEvent && flag && targetObj.getPlayer().getServer() == null) {
            BaseComponent[] baseComponentArray = TextComponent.fromLegacyText((String)(charSequence).toString());
            targetObj.getPlayer().disconnect(Arrays.copyOf(baseComponentArray, baseComponentArray.length));
}

    public final ServerInfo BaseCoreGenericHandler(@NotNull Object targetObj) {
        ServerInfo serverInfo;
        ProxyServer proxyServer = this.c(this.c());
        if (targetObj instanceof PendingConnection) {
            ReconnectHandler reconnectHandler = proxyServer.getReconnectHandler();
            if (reconnectHandler == null) {
                return this.LiteBansModule_31(targetObj);
            }
            ReconnectHandler reconnectHandler2 = reconnectHandler;
            serverInfo = reconnectHandler2.getServer((ProxiedPlayer)new NullHandler_2(this.c(), (PendingConnection)targetObj));
            if (serverInfo == null) {
                return this.LiteBansModule_31(targetObj);
} else {
            serverInfo = null;
        }
        return serverInfo;
    }

    public final ServerInfo LiteBansModule_31(@NotNull Object targetObj) {
        ServerInfo serverInfo;
        ProxyServer proxyServer = this.c(this.c());
        if (targetObj instanceof PendingConnection) {
            GetcancelreasoncomponentsHandler k12 = this;
            ListenerInfo listenerInfo = targetObj.getListener();
            serverInfo = proxyServer.getServerInfo(listenerInfo.getDefaultServer());
            if (serverInfo == null) {
                serverInfo = AbstractReconnectHandler.getForcedHost((PendingConnection)targetObj);
} else {
            serverInfo = null;
        }
        return serverInfo;
    }

    @Override
    public boolean BaseCoreGenericHandler(@NotNull String string) {
        return KickBannedHandler.BaseCoreGenericHandler(this, string);
    }

    private static final void LiteBansModule_31() {
        BaseCoreGenericHandler = new String[]{"net.md_5.bungee.api.event.LoginEvent", "getCancelReasonComponents", "net.md_5.bungee.api.plugin.Command", "setPermissionMessage", "", "", "", "Bungee permission config (InitializerHandler_3 Bungee config.yml) is invalid, ignoring. No players will be ", "", "/", ""};
}

