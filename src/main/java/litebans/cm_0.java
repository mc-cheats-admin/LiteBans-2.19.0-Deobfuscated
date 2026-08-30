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
import litebans.VelocityPlugin;
import litebans.cp_0;
import litebans.di_0;
import litebans.ec_0;
import litebans.ew;
import litebans.hl;
import litebans.il_0;
import litebans.ll;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.TextComponent;
import net.kyori.adventure.text.serializer.legacy.LegacyComponentSerializer;
import org.jetbrains.annotations.NotNull;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from litebans.cm
 */
public static final class cm_0
implements ec_0 {
    private final di_0 a;
    private static /* synthetic */ String[] b;

    public cm_0(@NotNull di_0 di_02) {
        this.a = di_02;
    }

    @Override
    public di_0 c() {
        return this.a;
    }

    public final VelocityPlugin a(@NotNull di_0 di_02) {
        ew.b(di_02, b[0]);
        return (VelocityPlugin)di_02;
    }

    public static /* synthetic */ VelocityPlugin a(cm_0 cm_02, di_0 di_02, int n, Object object) {
        if ((n & 1) != 0) {
            di_02 = cm_02.c();
        }
        return cm_02.a(di_02);
    }

    @Override
    public Object c(@NotNull String string) {
        Object object = this;
        boolean bl = false;
        object = string;
        Optional optional = cm_0.a((cm_0)object, null, (int)1, null).c.getPluginManager().getPlugin(((String)object).toLowerCase(Locale.ENGLISH));
        return optional.isPresent() && ((PluginContainer)optional.get()).getInstance().isPresent() ? ((PluginContainer)optional.get()).getInstance().get() : null;
    }

    public List b() {
        cm_0 cm_02 = this;
        boolean bl = false;
        Iterable iterable = cm_0.a((cm_0)cm_02, null, (int)1, null).c.getAllServers();
        boolean bl2 = false;
        Iterable iterable2 = iterable;
        Collection collection = new ArrayList(ll.a(iterable, 10));
        boolean bl3 = false;
        for (Object t2 : iterable2) {
            RegisteredServer registeredServer = (RegisteredServer)t2;
            Collection collection2 = collection;
            boolean bl4 = false;
            collection2.add(registeredServer.getServerInfo().getName());
        }
        return (List)collection;
    }

    @Override
    public String b() {
        cm_0 cm_02 = this;
        boolean bl = false;
        return cm_0.a((cm_0)cm_02, null, (int)1, null).c.getVersion().getVersion();
    }

    @Override
    public List b(@NotNull String string) {
        boolean bl;
        Collection collection;
        PluginContainer pluginContainer;
        cm_0 cm_02 = this;
        boolean bl2 = false;
        Iterable iterable = cm_0.a((cm_0)cm_02, null, (int)1, null).c.getPluginManager().getPlugins();
        boolean bl3 = false;
        Iterable iterable2 = iterable;
        Collection collection2 = new ArrayList(ll.a(iterable, 10));
        boolean bl4 = false;
        for (Object t2 : iterable2) {
            pluginContainer = (PluginContainer)t2;
            collection = collection2;
            bl = false;
            collection.add(pluginContainer.getDescription());
        }
        iterable = (List)collection2;
        bl3 = false;
        iterable2 = iterable;
        collection2 = new ArrayList();
        bl4 = false;
        for (Object t2 : iterable2) {
            boolean bl5;
            block7: {
                pluginContainer = (PluginDescription)t2;
                bl = false;
                Iterable iterable3 = pluginContainer.getDependencies();
                boolean bl6 = false;
                if (iterable3 instanceof Collection && ((Collection)iterable3).isEmpty()) {
                    bl5 = false;
                } else {
                    for (Object t3 : iterable3) {
                        PluginDependency pluginDependency = (PluginDependency)t3;
                        boolean bl7 = false;
                        String string2 = string;
                        if (!ew.a((Object)pluginDependency.getId(), (Object)string2.toLowerCase(Locale.ENGLISH))) continue;
                        bl5 = true;
                        break block7;
                    }
                    bl5 = false;
                }
            }
            if (!bl5) continue;
            collection2.add(t2);
        }
        iterable = (List)collection2;
        bl3 = false;
        iterable2 = iterable;
        collection2 = new ArrayList();
        bl4 = false;
        for (Object t2 : iterable2) {
            pluginContainer = (PluginDescription)t2;
            bl = false;
            if (!pluginContainer.getName().isPresent()) continue;
            collection2.add(t2);
        }
        iterable = (List)collection2;
        bl3 = false;
        iterable2 = iterable;
        collection2 = new ArrayList(ll.a(iterable, 10));
        bl4 = false;
        for (Object t2 : iterable2) {
            pluginContainer = (PluginDescription)t2;
            collection = collection2;
            bl = false;
            collection.add((String)pluginContainer.getName().get());
        }
        return (List)collection2;
    }

    @Override
    public void a(@NotNull Object object, @NotNull CharSequence charSequence) {
        if (!(object instanceof ServerPreConnectEvent)) {
            throw new UnsupportedOperationException();
        }
        ((ServerPreConnectEvent)object).getPlayer().sendMessage((Component)this.a(charSequence));
    }

    @Override
    public void a(@NotNull Object object, @NotNull CharSequence charSequence, @NotNull String string, boolean bl, @NotNull String string2) {
        Object object2 = object;
        if (object2 instanceof PlayerChatEvent) {
            ((PlayerChatEvent)object).setResult(PlayerChatEvent.ChatResult.denied());
        } else if (object2 instanceof CommandExecuteEvent) {
            ((CommandExecuteEvent)object).setResult(CommandExecuteEvent.CommandResult.denied());
        } else if (object2 instanceof ServerPreConnectEvent) {
            ((ServerPreConnectEvent)object).setResult(ServerPreConnectEvent.ServerResult.denied());
            if (bl && !((ServerPreConnectEvent)object).getPlayer().getCurrentServer().isPresent()) {
                ((ServerPreConnectEvent)object).getPlayer().disconnect((Component)this.a(charSequence));
            }
        }
    }

    public final TextComponent a(@NotNull CharSequence charSequence) {
        return LegacyComponentSerializer.legacySection().deserialize(((Object)charSequence).toString());
    }

    @Override
    public cp_0 a(@NotNull Object object, boolean bl) {
        if (!(object instanceof ServerPreConnectEvent)) {
            throw new UnsupportedOperationException();
        }
        Player player = ((ServerPreConnectEvent)object).getPlayer();
        boolean bl2 = false;
        return new cp_0(player.getUsername(), player.getUniqueId().toString(), player.getRemoteAddress().getAddress().getHostAddress());
    }

    @Override
    public String a(@NotNull Object object) {
        if (!(object instanceof ServerPreConnectEvent)) {
            throw new UnsupportedOperationException();
        }
        return ((RegisteredServer)((ServerPreConnectEvent)object).getResult().getServer().get()).getServerInfo().getName();
    }

    @Override
    public boolean a(@NotNull String string) {
        return il_0.a(this, string);
    }

    @Override
    public Collection a() {
        return this.b();
    }

    private static final void a() {
        b = new String[]{hl.a("", 208475039)};
    }

    static {
        cm_0.a();
    }
}

