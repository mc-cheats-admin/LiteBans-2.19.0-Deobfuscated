package litebans;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import litebans.BungeePlugin;
import litebans.ai_0;
import litebans.bz;
import litebans.cp_0;
import litebans.di_0;
import litebans.ec_0;
import litebans.ew;
import litebans.fe_0;
import litebans.gj_0;
import litebans.hl;
import litebans.il_0;
import litebans.jv_0;
import litebans.ll;
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

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@ai_0(a=1)
public static final class k1
implements ec_0 {
    private final di_0 d;
    private boolean b;
    private boolean c;
    private static /* synthetic */ String[] a;

    public k1(@NotNull di_0 di_02) {
        k1 k12;
        boolean bl;
        k1 k13;
        this.d = di_02;
        this.b = true;
        this.c = true;
        k1 k14 = this;
        try {
            k13 = k14;
            Class.forName(a[0]).getMethod(a[1], new Class[0]);
            bl = true;
        }
        catch (NoSuchMethodException noSuchMethodException) {
            k13 = k14;
            bl = false;
        }
        k13.b = bl;
        k14 = this;
        try {
            k12 = k14;
            Class[] classArray = new Class[]{String.class};
            Class.forName(a[2]).getDeclaredMethod(a[3], classArray);
            bl = true;
        }
        catch (NoSuchMethodException noSuchMethodException) {
            k12 = k14;
            bl = false;
        }
        k12.c = bl;
    }

    @Override
    public di_0 c() {
        return this.d;
    }

    public final boolean a() {
        return this.c;
    }

    public final ProxyServer c(@NotNull di_0 di_02) {
        return this.b(di_02).getProxy();
    }

    public final BungeePlugin b(@NotNull di_0 di_02) {
        ew.b(di_02, a[4]);
        return (BungeePlugin)di_02;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean a(@NotNull String string, @NotNull String string2, @NotNull String string3) {
        try {
            boolean bl;
            String string4;
            boolean bl2;
            ConfigurationAdapter configurationAdapter = this.c(this.c()).getConfigurationAdapter();
            boolean bl3 = false;
            Iterable iterable = configurationAdapter.getGroups(string);
            boolean bl4 = false;
            if (iterable instanceof Collection && ((Collection)iterable).isEmpty()) {
                bl2 = false;
            } else {
                for (Object t2 : iterable) {
                    string4 = (String)t2;
                    bl = false;
                    if (!bz.a(string4, string3, true)) continue;
                    return true;
                }
                bl2 = false;
            }
            if (bl2) return true;
            iterable = configurationAdapter.getGroups(string2);
            bl4 = false;
            if (iterable instanceof Collection && ((Collection)iterable).isEmpty()) {
                return false;
            }
            Iterator iterator = iterable.iterator();
            do {
                Object t2;
                if (!iterator.hasNext()) return false;
                t2 = iterator.next();
                string4 = (String)t2;
                bl = false;
            } while (!bz.a(string4, string3, true));
            return true;
        }
        catch (IllegalStateException illegalStateException) {
            return false;
        }
    }

    public final ThreadFactory a(@NotNull di_0 di_02) {
        BungeePlugin bungeePlugin = this.b(di_02);
        boolean bl = false;
        ExecutorService executorService = bungeePlugin.getProxy().getScheduler().unsafe().getExecutorService((Plugin)bungeePlugin);
        ew.b(executorService, a[5]);
        return ((ThreadPoolExecutor)executorService).getThreadFactory();
    }

    public final int c() {
        return this.c(this.c()).getPlayers().size();
    }

    @Override
    public Object c(@NotNull String string) {
        return ProxyServer.getInstance().getPluginManager().getPlugin(string);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public List b(@NotNull String var1_1) {
        var2_2 = this.c(this.c()).getPluginManager().getPlugins();
        var3_3 = false;
        var4_4 = var2_2;
        var5_5 = new ArrayList<E>();
        var6_6 = false;
        for (T var8_8 : var4_4) {
            var9_9 = (Plugin)var8_8;
            var10_10 = false;
            v0 = var9_9;
            if (v0 != null && (v0 = v0.getDescription()) != null && (v0 = v0.getDepends()) != null ? v0.contains(var1_1) : false) ** GOTO lbl-1000
            v1 = var9_9;
            v2 = v1 != null && (v1 = v1.getDescription()) != null && (v1 = v1.getSoftDepends()) != null ? v1.contains(var1_1) : false;
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
        var2_2 = (List)var5_5;
        var3_3 = false;
        var4_4 = var2_2;
        var5_5 = new ArrayList<E>(ll.a(var2_2, 10));
        var6_6 = false;
        for (T var8_8 : var4_4) {
            var9_9 = (Plugin)var8_8;
            var11_11 = var5_5;
            var10_10 = false;
            v4 /* !! */  = var9_9;
            if (v4 /* !! */  == null || (v4 /* !! */  = v4 /* !! */ .getDescription()) == null || (v4 /* !! */  = v4 /* !! */ .getName()) == null) {
                v4 /* !! */  = k1.a[6];
            }
            var11_11.add(v4 /* !! */ );
        }
        return (List)var5_5;
    }

    @Override
    public Collection a() {
        return this.c(this.c()).getServers().keySet();
    }

    @Override
    public String b() {
        return this.c(this.c()).getVersion();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean b(@NotNull String string, @NotNull String string2, @NotNull String string3) {
        try {
            boolean bl;
            String string4;
            boolean bl2;
            ConfigurationAdapter configurationAdapter = this.c(this.c()).getConfigurationAdapter();
            boolean bl3 = false;
            Iterable iterable = configurationAdapter.getGroups(string);
            boolean bl4 = false;
            if (iterable instanceof Collection && ((Collection)iterable).isEmpty()) {
                bl2 = false;
            } else {
                for (Object t2 : iterable) {
                    string4 = (String)t2;
                    bl = false;
                    if (!configurationAdapter.getPermissions(string4).contains(string3)) continue;
                    return true;
                }
                bl2 = false;
            }
            if (bl2) return true;
            iterable = configurationAdapter.getGroups(string2);
            bl4 = false;
            if (iterable instanceof Collection && ((Collection)iterable).isEmpty()) {
                return false;
            }
            Iterator iterator = iterable.iterator();
            do {
                Object t2;
                if (!iterator.hasNext()) return false;
                t2 = iterator.next();
                string4 = (String)t2;
                bl = false;
            } while (!configurationAdapter.getPermissions(string4).contains(string3));
            return true;
        }
        catch (Exception exception) {
            boolean bl = exception instanceof ClassCastException;
            if (bl) {
                this.c().getLogger().warning(a[7]);
            }
            if (exception instanceof IllegalStateException) return false;
            if (!bl) throw exception;
            return false;
        }
    }

    public final void a(@NotNull jv_0 jv_02, @NotNull String string) {
        Object object = jv_02.c();
        ew.b(object, a[8]);
        BaseComponent[] baseComponentArray = ComponentSerializer.parse((String)string);
        ((ProxiedPlayer)object).disconnect(Arrays.copyOf(baseComponentArray, baseComponentArray.length));
    }

    @Override
    public cp_0 a(@NotNull Object object, boolean bl) {
        if (!(object instanceof ServerConnectEvent)) {
            throw new UnsupportedOperationException();
        }
        ProxiedPlayer proxiedPlayer = ((ServerConnectEvent)object).getPlayer();
        boolean bl2 = false;
        return new cp_0(proxiedPlayer.getName(), proxiedPlayer.getUniqueId().toString(), proxiedPlayer.getAddress().getAddress().getHostAddress());
    }

    @Override
    public void a(@NotNull Object object, @NotNull CharSequence charSequence) {
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
    public String a(@NotNull Object object) {
        if (!(object instanceof ServerConnectEvent)) {
            throw new UnsupportedOperationException();
        }
        return ((ServerConnectEvent)object).getTarget().getName();
    }

    @Override
    public void a(@NotNull Object object, @NotNull CharSequence charSequence, @NotNull String string, boolean bl, @NotNull String string2) {
        Object object2;
        if (object instanceof Cancellable) {
            ((Cancellable)object).setCancelled(true);
        }
        if ((object2 = object) instanceof ChatEvent) {
            boolean bl2 = bz.a((CharSequence)((ChatEvent)object).getMessage(), '/', false, 2, null);
            ((ChatEvent)object).setMessage((bl2 ? a[9] : a[10]) + string + ((ChatEvent)object).getMessage());
        } else if (object2 instanceof LoginEvent) {
            if (this.b) {
                BaseComponent[] baseComponentArray = TextComponent.fromLegacyText((String)((Object)charSequence).toString());
                ((LoginEvent)object).setCancelReason(Arrays.copyOf(baseComponentArray, baseComponentArray.length));
            } else {
                gj_0.a.a(object, charSequence);
            }
        } else if (object2 instanceof ServerConnectEvent && bl && ((ServerConnectEvent)object).getPlayer().getServer() == null) {
            BaseComponent[] baseComponentArray = TextComponent.fromLegacyText((String)((Object)charSequence).toString());
            ((ServerConnectEvent)object).getPlayer().disconnect(Arrays.copyOf(baseComponentArray, baseComponentArray.length));
        }
    }

    public final ServerInfo a(@NotNull Object object) {
        ServerInfo serverInfo;
        ProxyServer proxyServer = this.c(this.c());
        boolean bl = false;
        if (object instanceof PendingConnection) {
            ReconnectHandler reconnectHandler = proxyServer.getReconnectHandler();
            if (reconnectHandler == null) {
                return this.b(object);
            }
            ReconnectHandler reconnectHandler2 = reconnectHandler;
            serverInfo = reconnectHandler2.getServer((ProxiedPlayer)new fe_0(this.c(), (PendingConnection)object));
            if (serverInfo == null) {
                return this.b(object);
            }
        } else {
            serverInfo = null;
        }
        return serverInfo;
    }

    public final ServerInfo b(@NotNull Object object) {
        ServerInfo serverInfo;
        ProxyServer proxyServer = this.c(this.c());
        boolean bl = false;
        if (object instanceof PendingConnection) {
            k1 k12 = this;
            ListenerInfo listenerInfo = ((PendingConnection)object).getListener();
            boolean bl2 = false;
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
    public boolean a(@NotNull String string) {
        return il_0.a(this, string);
    }

    private static final void b() {
        a = new String[]{hl.a("\u862f\u8624\u8635\u866f\u862c\u8625\u861e\u8674\u866f\u8623\u8634\u862f\u8626\u8624\u8624\u866f\u8620\u8631\u8628\u866f\u8624\u8637\u8624\u862f\u8635\u866f\u860d\u862e\u8626\u8628\u862f\u8604\u8637\u8624\u862f\u8635", 1201571393), hl.a("\u2714\u2716\u2707\u2730\u2712\u271d\u2710\u2716\u271f\u2721\u2716\u2712\u2700\u271c\u271d\u2730\u271c\u271e\u2703\u271c\u271d\u2716\u271d\u2707\u2700", -1630656653), hl.a("\uf0f3\uf0f8\uf0e9\uf0b3\uf0f0\uf0f9\uf0c2\uf0a8\uf0b3\uf0ff\uf0e8\uf0f3\uf0fa\uf0f8\uf0f8\uf0b3\uf0fc\uf0ed\uf0f4\uf0b3\uf0ed\uf0f1\uf0e8\uf0fa\uf0f4\uf0f3\uf0b3\uf0de\uf0f2\uf0f0\uf0f0\uf0fc\uf0f3\uf0f9", 1657204893), hl.a("\u95de\u95c8\u95d9\u95fd\u95c8\u95df\u95c0\u95c4\u95de\u95de\u95c4\u95c2\u95c3\u95e0\u95c8\u95de\u95de\u95cc\u95ca\u95c8", -531982931), hl.a("", -264900310), hl.a("", 815799681), hl.a("", -619263265), hl.a("\u4b97\u4ba0\u4bbb\u4bb2\u4bb0\u4bb0\u4bf5\u4ba5\u4bb0\u4ba7\u4bb8\u4bbc\u4ba6\u4ba6\u4bbc\u4bba\u4bbb\u4bf5\u4bb6\u4bba\u4bbb\u4bb3\u4bbc\u4bb2\u4bf5\u4bfd\u4bbc\u4bbb\u4bf5\u4b97\u4ba0\u4bbb\u4bb2\u4bb0\u4bb0\u4bf5\u4bb6\u4bba\u4bbb\u4bb3\u4bbc\u4bb2\u4bfb\u4bac\u4bb8\u4bb9\u4bfc\u4bf5\u4bbc\u4ba6\u4bf5\u4bbc\u4bbb\u4ba3\u4bb4\u4bb9\u4bbc\u4bb1\u4bf9\u4bf5\u4bbc\u4bb2\u4bbb\u4bba\u4ba7\u4bbc\u4bbb\u4bb2\u4bfb\u4bf5\u4b9b\u4bba\u4bf5\u4ba5\u4bb9\u4bb4\u4bac\u4bb0\u4ba7\u4ba6\u4bf5\u4ba2\u4bbc\u4bb9\u4bb9\u4bf5\u4bb7\u4bb0\u4bf5\u4bb0\u4bad\u4bb0\u4bb8\u4ba5\u4ba1\u4bfb", 1220496341), hl.a("", -1272005341), hl.a("\u6192", 4743613), hl.a("", -1618725614)};
    }

    static {
        k1.b();
    }
}

