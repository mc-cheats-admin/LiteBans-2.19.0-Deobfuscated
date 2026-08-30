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
public final class e1 {
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
        ew.b(ec_02, "");
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
            object = ew.a((Object)string4, (Object)"default") ? null : string4;
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
        ew.b(object, "");
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
            return "";
        }
        ec_0 ec_02 = this.b;
        ew.b(ec_02, "");
        ao_0 ao_02 = (ao_0)ec_02;
        Object object2 = this.c();
        Permission permission = object2 instanceof Permission ? (Permission)object2 : null;
        if (permission == null) {
            return "";
        }
        Permission permission2 = permission;
        Object object3 = this.b();
        Chat chat = object3 instanceof Chat ? (Chat)object3 : null;
        if (chat == null) {
            return "";
        }
        Chat chat2 = chat;
        if (object instanceof UUID) {
            Object object4 = ao_02.a((UUID)object);
            OfflinePlayer offlinePlayer = object4 instanceof OfflinePlayer ? (OfflinePlayer)object4 : null;
            if (offlinePlayer == null) {
                return "";
            }
            object2 = offlinePlayer;
            String string = chat2.getPlayerPrefix(null, (OfflinePlayer)object2);
            if (string == null) {
                string = "";
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
            return "";
        }
        ec_0 ec_02 = this.b;
        ew.b(ec_02, "");
        ao_0 ao_02 = (ao_0)ec_02;
        Object object2 = this.c();
        Permission permission = object2 instanceof Permission ? (Permission)object2 : null;
        if (permission == null) {
            return "";
        }
        Permission permission2 = permission;
        Object object3 = this.b();
        Chat chat = object3 instanceof Chat ? (Chat)object3 : null;
        if (chat == null) {
            return "";
        }
        Chat chat2 = chat;
        if (object instanceof UUID) {
            Object object4 = ao_02.a((UUID)object);
            OfflinePlayer offlinePlayer = object4 instanceof OfflinePlayer ? (OfflinePlayer)object4 : null;
            if (offlinePlayer == null) {
                return "";
            }
            object2 = offlinePlayer;
            String string = chat2.getPlayerSuffix(null, (OfflinePlayer)object2);
            if (string == null) {
                string = "";
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
        ew.b(ec_02, "");
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
                string3 = "";
            }
            if (bz.a((CharSequence)(string2 = string3), (CharSequence)"zip file", false, 2, null)) {
                e1 e13 = this;
                boolean bl = false;
                e13.a().c().getLogger().warning("Zip file was closed during access: " + string);
                return null;
            }
            throw illegalStateException;
        }
        return null;
    }

    private static final Object b(e1 e12) {
        return e12.a("net.milkbowl.vault.permission.Permission");
    }

    private static final Object a(e1 e12) {
        return e12.a("net.milkbowl.vault.chat.Chat");
    }

    private static final void d() {
        d = new String[]{"", "default", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "zip file", "Zip file was closed during access: ", "net.milkbowl.vault.permission.Permission", "net.milkbowl.vault.chat.Chat"};
    }

    static {
        e1.d();
    }
}

