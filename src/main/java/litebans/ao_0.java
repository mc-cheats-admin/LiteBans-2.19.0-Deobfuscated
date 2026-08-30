package litebans;

import com.google.common.io.ByteArrayDataOutput;
import com.google.common.io.ByteStreams;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import litebans.ai_0;
import litebans.as;
import litebans.bN;
import litebans.cp_0;
import litebans.de_0;
import litebans.di_0;
import litebans.dv_0;
import litebans.e1;
import litebans.eE;
import litebans.ec_0;
import litebans.eg_0;
import litebans.er_0;
import litebans.ew;
import litebans.g8;
import litebans.hl;
import litebans.il_0;
import litebans.jv_0;
import litebans.ll;
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

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from litebans.aO
 */
@ai_0(a=0)
public static final class ao_0
implements ec_0 {
    private final di_0 c;
    private final eE b;
    private static /* synthetic */ String[] a;

    public ao_0(@NotNull di_0 di_02) {
        this.c = di_02;
        this.b = bN.a(() -> ao_0.a(this));
    }

    @Override
    public di_0 c() {
        return this.c;
    }

    public final e1 b() {
        eE eE2 = this.b;
        return (e1)eE2.a();
    }

    public final Plugin a(@NotNull di_0 di_02) {
        ew.b(di_02, a[0]);
        return (Plugin)di_02;
    }

    public static /* synthetic */ Plugin a(ao_0 ao_02, di_0 di_02, int n, Object object) {
        if ((n & 1) != 0) {
            di_02 = ao_02.c();
        }
        return ao_02.a(di_02);
    }

    public final void b(@NotNull jv_0 jv_02, @NotNull String string) {
        if (!this.b(a[1])) {
            this.a(a[2]);
        }
        this.c().a(() -> ao_0.c(jv_02, string), 8L);
        if (jv_02.j()) {
            byte[] byArray = this.a(jv_02, string);
            jv_02.a(a[3], byArray);
        }
        this.c().getLogger().info(a[4] + jv_02.i() + a[5]);
    }

    public final byte[] a(@NotNull jv_0 jv_02, @NotNull String string) {
        de_0 de_02 = er_0.a(de_0.c, this.b(), null, 2, null);
        ByteArrayDataOutput byteArrayDataOutput = ByteStreams.newDataOutput();
        byteArrayDataOutput.writeUTF(a[6]);
        byteArrayDataOutput.writeUTF(jv_02.i());
        g8 g82 = de_02.a(1, 21, 5) ? g8.a : g8.c;
        byteArrayDataOutput.writeUTF(eg_0.a(string, g82));
        byte[] byArray = byteArrayDataOutput.toByteArray();
        ew.a(byArray);
        return byArray;
    }

    public final Object a(@NotNull UUID uUID) {
        ao_0.a(this, null, 1, null).getServer().getVersion();
        return ao_0.a(this, null, 1, null).getServer().getOfflinePlayer(uUID);
    }

    public final String b(@NotNull Object object) {
        ew.b(object, a[7]);
        String string = ((OfflinePlayer)object).getName();
        ew.a((Object)string);
        return string;
    }

    @Override
    public Object c(@NotNull String string) {
        return Bukkit.getServer().getPluginManager().getPlugin(string);
    }

    @Override
    public List b(@NotNull String string) {
        Collection collection;
        Object object32;
        Object object2 = Bukkit.getServer().getPluginManager().getPlugins();
        boolean bl = false;
        Object[] objectArray = object2;
        Collection collection2 = new ArrayList(((Object[])object2).length);
        boolean bl2 = false;
        for (Object object32 : objectArray) {
            Plugin plugin = (Plugin)object32;
            collection = collection2;
            boolean bl3 = false;
            collection.add(plugin.getDescription());
        }
        object2 = (List)collection2;
        bl = false;
        objectArray = object2;
        collection2 = new ArrayList();
        bl2 = false;
        for (Object t2 : objectArray) {
            object32 = (PluginDescriptionFile)t2;
            boolean bl4 = false;
            if (!(object32.getDepend().contains(string) || object32.getSoftDepend().contains(string))) continue;
            collection2.add(t2);
        }
        object2 = (List)collection2;
        bl = false;
        objectArray = object2;
        collection2 = new ArrayList(ll.a((Iterable)object2, 10));
        bl2 = false;
        for (Object t3 : objectArray) {
            object32 = (PluginDescriptionFile)t3;
            collection = collection2;
            boolean bl5 = false;
            collection.add(object32.getName());
        }
        return (List)collection2;
    }

    @Override
    public Collection a() {
        return ll.e();
    }

    @Override
    public String b() {
        return ao_0.a(this, null, 1, null).getServer().getBukkitVersion();
    }

    public final boolean b(@NotNull String string) {
        return ao_0.a(this, null, 1, null).getServer().getMessenger().isOutgoingChannelRegistered(ao_0.a(this, null, 1, null), string);
    }

    public final void a(@NotNull String string) {
        ao_0.a(this, null, 1, null).getServer().getMessenger().registerOutgoingPluginChannel(ao_0.a(this, null, 1, null), string);
    }

    public final String c(@NotNull Object object) {
        String string;
        Object object2 = object;
        if (object2 instanceof AsyncPlayerChatEvent) {
            string = ((AsyncPlayerChatEvent)object).getMessage();
        } else if (object2 instanceof PlayerCommandPreprocessEvent) {
            string = ((PlayerCommandPreprocessEvent)object).getMessage();
        } else {
            this.a(object);
            throw new as();
        }
        String string2 = string;
        ew.a((Object)string2);
        return string2;
    }

    @Override
    public cp_0 a(@NotNull Object object, boolean bl) {
        String string;
        UUID uUID;
        if (object instanceof AsyncPlayerPreLoginEvent) {
            String string2 = ((AsyncPlayerPreLoginEvent)object).getName();
            UUID uUID2 = ((AsyncPlayerPreLoginEvent)object).getUniqueId();
            if (uUID2 == null) {
                throw new NullPointerException(object.getClass().getSimpleName() + a[8] + string2 + ')');
            }
            uUID = uUID2;
            InetAddress inetAddress = ((AsyncPlayerPreLoginEvent)object).getAddress();
            if (inetAddress == null) {
                if (!bl) {
                    this.c().getLogger().warning(object.getClass().getSimpleName() + a[9] + string2 + ')');
                }
                string = null;
            } else {
                string = inetAddress.getHostAddress();
            }
        } else {
            this.a(object);
            throw new as();
        }
        String string3 = string;
        return new cp_0(((AsyncPlayerPreLoginEvent)object).getName(), uUID.toString(), string3);
    }

    public Void a(@NotNull Object object, @NotNull CharSequence charSequence) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String a(@NotNull Object object) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void a(@NotNull Object object, @NotNull CharSequence charSequence, @NotNull String string, boolean bl, @NotNull String string2) {
        if (object instanceof AsyncPlayerPreLoginEvent) {
            ((AsyncPlayerPreLoginEvent)object).disallow(AsyncPlayerPreLoginEvent.Result.valueOf((String)string2), ((Object)charSequence).toString());
            return;
        }
        if (object instanceof PlayerLoginEvent) {
            ((PlayerLoginEvent)object).disallow(PlayerLoginEvent.Result.valueOf((String)string2), ((Object)charSequence).toString());
            return;
        }
        if (object instanceof Cancellable) {
            if (bl) {
                ((Cancellable)object).setCancelled(true);
            }
            if (object instanceof AsyncPlayerChatEvent) {
                ao_0 ao_02 = this;
                AsyncPlayerChatEvent asyncPlayerChatEvent = (AsyncPlayerChatEvent)object;
                boolean bl2 = false;
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
            this.a(object);
            throw new as();
        }
    }

    private final Void a(Object object) {
        throw new dv_0(object.getClass().getName());
    }

    @Override
    public boolean a(@NotNull String string) {
        return il_0.a(this, string);
    }

    private static final e1 a(ao_0 ao_02) {
        return new e1(ao_02);
    }

    private static final void c(jv_0 jv_02, String string) {
        if (jv_02.j()) {
            ByteArrayDataOutput byteArrayDataOutput = ByteStreams.newDataOutput();
            byteArrayDataOutput.writeUTF(a[10]);
            byteArrayDataOutput.writeUTF(jv_02.i());
            byteArrayDataOutput.writeUTF(string);
            jv_02.a(a[11], byteArrayDataOutput.toByteArray());
        }
    }

    @Override
    public void a(Object object, CharSequence charSequence) {
        this.a(object, charSequence);
    }

    private static final void a() {
        a = new String[]{hl.a("", 1872554281), hl.a("\ufc00\ufc37\ufc2c\ufc25\ufc27\ufc27\ufc01\ufc2d\ufc30\ufc26", -412025790), hl.a("\u1787\u17b0\u17ab\u17a2\u17a0\u17a0\u1786\u17aa\u17b7\u17a1", -1996154939), hl.a("\ub7f4\ub7c3\ub7d8\ub7d1\ub7d3\ub7d3\ub7f5\ub7d9\ub7c4\ub7d2", -1605978186), hl.a("\ubbc6\ubbe4\ubbee\ubbe6\ubbe4\ubbe3\ubbea\ubbad", 918666125), hl.a("\u35a2\u35e4\u35f0\u35ed\u35ef\u35a2\u35c0\u35f7\u35ec\u35e5\u35e7\u35e7\u35c1\u35ed\u35f0\u35e6\u35ac", -1313065598), hl.a("\u0687\u06a5\u06af\u06a7\u069c\u06a0\u06ad\u06b5\u06a9\u06be\u069e\u06ad\u06bb", -1782970676), hl.a("", -149221686), hl.a("\u0b66\u0b2f\u0b2d\u0b3c\u0b1d\u0b26\u0b21\u0b39\u0b3d\u0b2d\u0b01\u0b2c\u0b60\u0b61\u0b68\u0b75\u0b75\u0b68\u0b26\u0b3d\u0b24\u0b24\u0b68\u0b60", -1658778808), hl.a("\u5ded\u5da4\u5da6\u5db7\u5d82\u5da7\u5da7\u5db1\u5da6\u5db0\u5db0\u5deb\u5dea\u5de3\u5dfe\u5dfe\u5de3\u5dad\u5db6\u5daf\u5daf\u5de3\u5deb", -381592125), hl.a("\ufa63\ufa41\ufa4b\ufa43\ufa78\ufa44\ufa49\ufa51\ufa4d\ufa5a", -1396245976), hl.a("\u9d3a\u9d0d\u9d16\u9d1f\u9d1d\u9d1d\u9d3b\u9d17\u9d0a\u9d1c", 1122147704)};
    }

    static {
        ao_0.a();
    }
}

