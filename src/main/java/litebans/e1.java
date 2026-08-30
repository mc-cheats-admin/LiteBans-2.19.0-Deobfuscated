package litebans;

import java.util.Iterator;
import java.util.Locale;
import java.util.UUID;
import litebans.ai_0;
import litebans.ao_0;
import litebans.bN;
import litebans.bz;
import litebans.d2;
import litebans.eE;
import litebans.ec_0;
import litebans.ew;
import litebans.hl;
import net.milkbowl.vault.chat.Chat;
import net.milkbowl.vault.permission.Permission;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;
import org.bukkit.plugin.RegisteredServiceProvider;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ai_0(a=0)
public static final class e1 {
    private final ec_0 b;
    private final eE c;
    private final eE a;
    private static /* synthetic */ String[] d;

    public e1(@NotNull ec_0 ec_02) {
        this.b = ec_02;
        this.c = bN.a(() -> e1.b(this));
        this.a = bN.a(() -> e1.a(this));
    }

    public final ec_0 a() {
        return this.b;
    }

    public final Object c() {
        eE eE2 = this.c;
        return eE2.a();
    }

    public final Object b() {
        eE eE2 = this.a;
        return eE2.a();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean a(@NotNull String string, @NotNull UUID uUID, @NotNull String string2, @NotNull String string3, @NotNull String string4, @NotNull String[] stringArray) {
        if (bz.a((CharSequence)string, '#', false, 2, null)) {
            return false;
        }
        e1 e12 = this;
        boolean bl = false;
        ec_0 ec_02 = e12.a().c().i();
        ew.b(ec_02, d[0]);
        ao_0 ao_02 = (ao_0)ec_02;
        Object object = this.c();
        if (!(object instanceof Permission)) return false;
        Permission permission = (Permission)object;
        if (permission == null) {
            return false;
        }
        Permission permission2 = permission;
        Object[] objectArray = ao_02.a(uUID);
        if (!(objectArray instanceof OfflinePlayer)) return false;
        OfflinePlayer offlinePlayer = (OfflinePlayer)objectArray;
        if (offlinePlayer == null) {
            return false;
        }
        e12 = offlinePlayer;
        try {
            object = ew.a((Object)string4, (Object)d[1]) ? null : string4;
            if (!(stringArray.length == 0) && permission2.hasGroupSupport()) {
                objectArray = permission2.getPlayerGroups((String)object, (OfflinePlayer)e12);
                for (String string5 : stringArray) {
                    Iterator iterator = d2.a(objectArray);
                    while (iterator.hasNext()) {
                        String string6 = (String)iterator.next();
                        if (!bz.a(string5, string6, true)) continue;
                        return true;
                    }
                }
            }
            if (permission2.playerHas((String)object, (OfflinePlayer)e12, string3)) return true;
            objectArray = string2;
            if (!permission2.playerHas((String)object, (OfflinePlayer)e12, string3 + '.' + objectArray.toLowerCase(Locale.ENGLISH))) return false;
            return true;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return false;
        }
        catch (NoSuchMethodError noSuchMethodError) {
            return false;
        }
    }

    public final boolean a(@Nullable Object object, @NotNull String string, @Nullable String string2) {
        Object object2 = this.c();
        Permission permission = object2 instanceof Permission ? (Permission)object2 : null;
        if (permission == null) {
            return false;
        }
        Permission permission2 = permission;
        ew.b(object, d[2]);
        return permission2.playerHas(string2, (OfflinePlayer)object, string);
    }

    public static /* synthetic */ boolean a(e1 e12, Object object, String string, String string2, int n, Object object2) {
        if ((n & 4) != 0) {
            string2 = null;
        }
        return e12.a(object, string, string2);
    }

    public final String a(@Nullable Object object) {
        if (object == null) {
            return d[3];
        }
        ec_0 ec_02 = this.b;
        ew.b(ec_02, d[4]);
        ao_0 ao_02 = (ao_0)ec_02;
        Object object2 = this.c();
        Permission permission = object2 instanceof Permission ? (Permission)object2 : null;
        if (permission == null) {
            return d[5];
        }
        Permission permission2 = permission;
        Object object3 = this.b();
        Chat chat = object3 instanceof Chat ? (Chat)object3 : null;
        if (chat == null) {
            return d[6];
        }
        Chat chat2 = chat;
        if (object instanceof UUID) {
            Object object4 = ao_02.a((UUID)object);
            OfflinePlayer offlinePlayer = object4 instanceof OfflinePlayer ? (OfflinePlayer)object4 : null;
            if (offlinePlayer == null) {
                return d[7];
            }
            object2 = offlinePlayer;
            String string = chat2.getPlayerPrefix(null, (OfflinePlayer)object2);
            if (string == null) {
                string = d[8];
            }
            return string;
        }
        String string = chat2.getPlayerPrefix((Player)object);
        if (string == null) {
            string = chat2.getGroupPrefix(((Player)object).getWorld().getName(), permission2.getPrimaryGroup((Player)object));
        }
        return string;
    }

    public final String b(@Nullable Object object) {
        if (object == null) {
            return d[9];
        }
        ec_0 ec_02 = this.b;
        ew.b(ec_02, d[10]);
        ao_0 ao_02 = (ao_0)ec_02;
        Object object2 = this.c();
        Permission permission = object2 instanceof Permission ? (Permission)object2 : null;
        if (permission == null) {
            return d[11];
        }
        Permission permission2 = permission;
        Object object3 = this.b();
        Chat chat = object3 instanceof Chat ? (Chat)object3 : null;
        if (chat == null) {
            return d[12];
        }
        Chat chat2 = chat;
        if (object instanceof UUID) {
            Object object4 = ao_02.a((UUID)object);
            OfflinePlayer offlinePlayer = object4 instanceof OfflinePlayer ? (OfflinePlayer)object4 : null;
            if (offlinePlayer == null) {
                return d[13];
            }
            object2 = offlinePlayer;
            String string = chat2.getPlayerSuffix(null, (OfflinePlayer)object2);
            if (string == null) {
                string = d[14];
            }
            return string;
        }
        String string = chat2.getPlayerSuffix((Player)object);
        if (string == null) {
            string = chat2.getGroupSuffix(((Player)object).getWorld().getName(), permission2.getPrimaryGroup((Player)object));
        }
        return string;
    }

    public final Object a(@NotNull String string) {
        ec_0 ec_02 = this.b;
        ew.b(ec_02, d[15]);
        ao_0 ao_02 = (ao_0)ec_02;
        try {
            e1 e12 = this;
            boolean bl = false;
            RegisteredServiceProvider registeredServiceProvider = ao_02.a(e12.a().c()).getServer().getServicesManager().getRegistration(Class.forName(string));
            if (registeredServiceProvider != null) {
                return registeredServiceProvider.getProvider();
            }
        }
        catch (NoClassDefFoundError noClassDefFoundError) {
        }
        catch (ClassNotFoundException classNotFoundException) {
        }
        catch (IllegalStateException illegalStateException) {
            String string2;
            String string3 = illegalStateException.getMessage();
            if (string3 == null) {
                string3 = d[16];
            }
            if (bz.a((CharSequence)(string2 = string3), (CharSequence)d[17], false, 2, null)) {
                e1 e13 = this;
                boolean bl = false;
                e13.a().c().getLogger().warning(d[18] + string);
                return null;
            }
            throw illegalStateException;
        }
        return null;
    }

    private static final Object b(e1 e12) {
        return e12.a(d[19]);
    }

    private static final Object a(e1 e12) {
        return e12.a(d[20]);
    }

    private static final void d() {
        d = new String[]{hl.a("", 679335416), hl.a("\uebc7\uebc6\uebc5\uebc2\uebd6\uebcf\uebd7", 1253632931), hl.a("", -2142591719), hl.a("", 1103385426), hl.a("", -994294914), hl.a("", -441578530), hl.a("", -1752312970), hl.a("", 1364113888), hl.a("", 2052464785), hl.a("", 925738509), hl.a("", 187922205), hl.a("", 180262873), hl.a("", -916633865), hl.a("", -1176268446), hl.a("", -1435780431), hl.a("", 1934567870), hl.a("", 1333648856), hl.a("\ua41d\ua40e\ua417\ua447\ua401\ua40e\ua40b\ua402", 748004455), hl.a("\u285a\u2869\u2870\u2820\u2866\u2869\u286c\u2865\u2820\u2877\u2861\u2873\u2820\u2863\u286c\u286f\u2873\u2865\u2864\u2820\u2864\u2875\u2872\u2869\u286e\u2867\u2820\u2861\u2863\u2863\u2865\u2873\u2873\u283a\u2820", 1423910912), hl.a("\u07e0\u07eb\u07fa\u07a0\u07e3\u07e7\u07e2\u07e5\u07ec\u07e1\u07f9\u07e2\u07a0\u07f8\u07ef\u07fb\u07e2\u07fa\u07a0\u07fe\u07eb\u07fc\u07e3\u07e7\u07fd\u07fd\u07e7\u07e1\u07e0\u07a0\u07de\u07eb\u07fc\u07e3\u07e7\u07fd\u07fd\u07e7\u07e1\u07e0", -823523442), hl.a("\u43f2\u43f9\u43e8\u43b2\u43f1\u43f5\u43f0\u43f7\u43fe\u43f3\u43eb\u43f0\u43b2\u43ea\u43fd\u43e9\u43f0\u43e8\u43b2\u43ff\u43f4\u43fd\u43e8\u43b2\u43df\u43f4\u43fd\u43e8", 2053391260)};
    }

    static {
        e1.d();
    }
}

