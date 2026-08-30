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
            boolean flag3 = false;
            Iterable iterable = configurationAdapter.getGroups(string);
            boolean flag4 = false;
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
    }

    public final ThreadFactory BaseCoreGenericHandler(@NotNull PlatformPlugin plugin) {
        BungeePlugin bungeePlugin = this.LiteBansModule_31(plugin);
        boolean flag = false;
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
        v3 = false;
        var4_4 = v2;
        var5_5 = new ArrayList<PunishmentService>();
        var6_6 = false;
        for (T var8_8 : var4_4) {
            var9_9 = (Plugin)var8_8;
            var10_10 = false;
            v0 = var9_9;
            if (v0 != null && (v0 = v0.getDescription()) != null && (v0 = v0.getDepends()) != null ? v0.contains(v1) : false) ** GOTO lbl-1000
            v1 = var9_9;
            v2 = v1 != null && (v1 = v1.getDescription()) != null && (v1 = v1.getSoftDepends()) != null ? v1.contains(v1) : false;
            if (v2) lbl-1000:
            // 2 sources

            {
                v3 = true;
            } else {
                v3 = false;
            }
            if (!v3) continue;
            var5_5.add(var8_8);
        }
        v2 = (List)var5_5;
        v3 = false;
        var4_4 = v2;
        var5_5 = new ArrayList<PunishmentService>(CollectionUtilities.BaseCoreGenericHandler(v2, 10));
        var6_6 = false;
        for (T var8_8 : var4_4) {
            var9_9 = (Plugin)var8_8;
            var11_11 = var5_5;
            var10_10 = false;
            v4 /* !! */  = var9_9;
            if (v4 /* !! */  == null || (v4 /* !! */  = v4 /* !! */ .getDescription()) == null || (v4 /* !! */  = v4 /* !! */ .getName()) == null) {
                v4 /* !! */  = "";
            }
            var11_11.add(v4 /* !! */ );
        }
        return (List)var5_5;
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
            boolean flag3 = false;
            Iterable iterable = configurationAdapter.getGroups(string);
            boolean flag4 = false;
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
    }

    public final void BaseCoreGenericHandler(@NotNull CommandSenderWrapper sender, @NotNull String string) {
        Object object = sender.c();
        ObjectUtilities.LiteBansModule_31(object, "");
        BaseComponent[] baseComponentArray = ComponentSerializer.parse((String)string);
        ((ProxiedPlayer)object).disconnect(Arrays.copyOf(baseComponentArray, baseComponentArray.length));
    }

    @Override
    public LiteBansModule_95 BaseCoreGenericHandler(@NotNull Object object, boolean flag) {
        if (!(object instanceof ServerConnectEvent)) {
            throw new UnsupportedOperationException();
        }
        ProxiedPlayer proxiedPlayer = ((ServerConnectEvent)object).getPlayer();
        boolean flag2 = false;
        return new LiteBansModule_95(proxiedPlayer.getName(), proxiedPlayer.getUniqueId().toString(), proxiedPlayer.getAddress().getAddress().getHostAddress());
    }

    @Override
    public void BaseCoreGenericHandler(@NotNull Object object, @NotNull CharSequence charSequence) {
        Object object2 = object;
        if (object2 instanceof ServerConnectEvent) {
            if (((ServerConnectEvent)object).getPlayer().isConnected()) {
                BaseComponent[] baseComponentArray = TextComponent.fromLegacyText((String)((Object)charSequence).toString());
                ((ServerConnectEvent)object).getPlayer().sendMessage(Arrays.copyOf(baseComponentArray, baseComponentArray.length));
            }
        } else if (!(object2 instanceof LoginEvent)) {
            throw new UnsupportedOperationException();
        }
    }

    @Override
    public String BaseCoreGenericHandler(@NotNull Object object) {
        if (!(object instanceof ServerConnectEvent)) {
            throw new UnsupportedOperationException();
        }
        return ((ServerConnectEvent)object).getTarget().getName();
    }

    @Override
    public void BaseCoreGenericHandler(@NotNull Object object, @NotNull CharSequence charSequence, @NotNull String string, boolean flag, @NotNull String string2) {
        Object object2;
        if (object instanceof Cancellable) {
            ((Cancellable)object).setCancelled(true);
        }
        if ((object2 = object) instanceof ChatEvent) {
            boolean flag2 = StringUtilities.BaseCoreGenericHandler((CharSequence)((ChatEvent)object).getMessage(), '/', false, 2, null);
            ((ChatEvent)object).setMessage((flag2 ? "/" : "") + string + ((ChatEvent)object).getMessage());
        } else if (object2 instanceof LoginEvent) {
            if (this.LiteBansModule_31) {
                BaseComponent[] baseComponentArray = TextComponent.fromLegacyText((String)((Object)charSequence).toString());
                ((LoginEvent)object).setCancelReason(Arrays.copyOf(baseComponentArray, baseComponentArray.length));
            } else {
                LiteBansModule_225.BaseCoreGenericHandler.BaseCoreGenericHandler(object, charSequence);
            }
        } else if (object2 instanceof ServerConnectEvent && flag && ((ServerConnectEvent)object).getPlayer().getServer() == null) {
            BaseComponent[] baseComponentArray = TextComponent.fromLegacyText((String)((Object)charSequence).toString());
            ((ServerConnectEvent)object).getPlayer().disconnect(Arrays.copyOf(baseComponentArray, baseComponentArray.length));
        }
    }

    public final ServerInfo BaseCoreGenericHandler(@NotNull Object object) {
        ServerInfo serverInfo;
        ProxyServer proxyServer = this.c(this.c());
        boolean flag = false;
        if (object instanceof PendingConnection) {
            ReconnectHandler reconnectHandler = proxyServer.getReconnectHandler();
            if (reconnectHandler == null) {
                return this.LiteBansModule_31(object);
            }
            ReconnectHandler reconnectHandler2 = reconnectHandler;
            serverInfo = reconnectHandler2.getServer((ProxiedPlayer)new NullHandler_2(this.c(), (PendingConnection)object));
            if (serverInfo == null) {
                return this.LiteBansModule_31(object);
            }
        } else {
            serverInfo = null;
        }
        return serverInfo;
    }

    public final ServerInfo LiteBansModule_31(@NotNull Object object) {
        ServerInfo serverInfo;
        ProxyServer proxyServer = this.c(this.c());
        boolean flag = false;
        if (object instanceof PendingConnection) {
            GetcancelreasoncomponentsHandler k12 = this;
            ListenerInfo listenerInfo = ((PendingConnection)object).getListener();
            boolean flag2 = false;
            serverInfo = proxyServer.getServerInfo(listenerInfo.getDefaultServer());
            if (serverInfo == null) {
                serverInfo = AbstractReconnectHandler.getForcedHost((PendingConnection)((PendingConnection)object));
            }
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

    }

