package litebans;

import java.util.Iterator;
import java.util.Locale;
import java.util.UUID;
import net.milkbowl.vault.chat.Chat;
import net.milkbowl.vault.permission.Permission;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;
import org.bukkit.plugin.RegisteredServiceProvider;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ModulePriority(priority=0)
public final class DefaultHandler {
    private final LiteBansModule_158 LiteBansModule_31;
    private final LiteBansModule_161 c;
    private final LiteBansModule_161 BaseCoreGenericHandler;
    public DefaultHandler(@NotNull LiteBansModule_158 ec_02) {
        this.LiteBansModule_31 = ec_02;
        this.c = ProxyConnection.BaseCoreGenericHandler(() -> DefaultHandler.LiteBansModule_31(this));
        this.plugin = ProxyConnection.BaseCoreGenericHandler(() -> DefaultHandler.BaseCoreGenericHandler(this));
    }

    public final LiteBansModule_158 BaseCoreGenericHandler() {
        return this.LiteBansModule_31;
    }

    public final Object c() {
        LiteBansModule_161 eE2 = this.c;
        return eE2.BaseCoreGenericHandler();
    }

    public final Object LiteBansModule_31() {
        LiteBansModule_161 eE2 = this.plugin;
        return eE2.BaseCoreGenericHandler();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean BaseCoreGenericHandler(@NotNull String string, @NotNull UUID uUID, @NotNull String string2, @NotNull String string3, @NotNull String string4, @NotNull String[] args) {
        if (StringUtilities.BaseCoreGenericHandler((CharSequence)string, '#', false, 2, null)) {
            return false;
        }
        DefaultHandler e12 = this;
        LiteBansModule_158 ec_02 = e12.BaseCoreGenericHandler().c().i();
        ObjectUtilities.LiteBansModule_31(ec_02, "");
        BungeecordHandler_2 ao_02 = (BungeecordHandler_2)ec_02;
        Object object = this.c();
        if (!(object instanceof Permission)) return false;
        Permission permission = (Permission)object;
        if (permission == null) {
            return false;
        }
        Permission permission2 = permission;
        Object[] objectArray = ao_02.BaseCoreGenericHandler(uUID);
        if (!(objectArray instanceof OfflinePlayer)) return false;
        OfflinePlayer offlinePlayer = (OfflinePlayer)objectArray;
        if (offlinePlayer == null) {
            return false;
        }
        e12 = offlinePlayer;
        try {
            object = ObjectUtilities.BaseCoreGenericHandler((Object)string4, (Object)"default") ? null : string4;
            if (!(args.length == 0) && permission2.hasGroupSupport()) {
                objectArray = permission2.getPlayerGroups((String)object, (OfflinePlayer)e12);
                for (String string5 : args) {
                    Iterator iterator = ArrayHandler.BaseCoreGenericHandler(objectArray);
                    while (iterator.hasNext()) {
                        String string6 = (String)iterator.next();
                        if (!StringUtilities.BaseCoreGenericHandler(string5, string6, true)) continue;
                        return true;
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

    public final boolean BaseCoreGenericHandler(@Nullable Object object, @NotNull String string, @Nullable String string2) {
        Object object2 = this.c();
        Permission permission = object2 instanceof Permission ? (Permission)object2 : null;
        if (permission == null) {
            return false;
        }
        Permission permission2 = permission;
        ObjectUtilities.LiteBansModule_31(object, "");
        return permission2.playerHas(string2, (OfflinePlayer)object, string);
    }

    public static /* synthetic */ boolean BaseCoreGenericHandler(DefaultHandler e12, Object object, String string, String string2, int n, Object object2) {
        if ((n & 4) != 0) {
            string2 = null;
        }
        return e12.BaseCoreGenericHandler(object, string, string2);
    }

    public final String BaseCoreGenericHandler(@Nullable Object object) {
        if (object == null) {
            return "";
        }
        LiteBansModule_158 ec_02 = this.LiteBansModule_31;
        ObjectUtilities.LiteBansModule_31(ec_02, "");
        BungeecordHandler_2 ao_02 = (BungeecordHandler_2)ec_02;
        Object object2 = this.c();
        Permission permission = object2 instanceof Permission ? (Permission)object2 : null;
        if (permission == null) {
            return "";
        }
        Permission permission2 = permission;
        Object object3 = this.LiteBansModule_31();
        Chat chat = object3 instanceof Chat ? (Chat)object3 : null;
        if (chat == null) {
            return "";
        }
        Chat chat2 = chat;
        if (object instanceof UUID) {
            Object object4 = ao_02.BaseCoreGenericHandler((UUID)object);
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

    public final String LiteBansModule_31(@Nullable Object object) {
        if (object == null) {
            return "";
        }
        LiteBansModule_158 ec_02 = this.LiteBansModule_31;
        ObjectUtilities.LiteBansModule_31(ec_02, "");
        BungeecordHandler_2 ao_02 = (BungeecordHandler_2)ec_02;
        Object object2 = this.c();
        Permission permission = object2 instanceof Permission ? (Permission)object2 : null;
        if (permission == null) {
            return "";
        }
        Permission permission2 = permission;
        Object object3 = this.LiteBansModule_31();
        Chat chat = object3 instanceof Chat ? (Chat)object3 : null;
        if (chat == null) {
            return "";
        }
        Chat chat2 = chat;
        if (object instanceof UUID) {
            Object object4 = ao_02.BaseCoreGenericHandler((UUID)object);
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

    public final Object BaseCoreGenericHandler(@NotNull String string) {
        LiteBansModule_158 ec_02 = this.LiteBansModule_31;
        ObjectUtilities.LiteBansModule_31(ec_02, "");
        BungeecordHandler_2 ao_02 = (BungeecordHandler_2)ec_02;
        try {
            DefaultHandler e12 = this;
            RegisteredServiceProvider registeredServiceProvider = ao_02.BaseCoreGenericHandler(e12.BaseCoreGenericHandler().c()).getServer().getServicesManager().getRegistration(Class.forName(string));
            if (registeredServiceProvider != null) {
                return registeredServiceProvider.getProvider();
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
            if (StringUtilities.BaseCoreGenericHandler((CharSequence)(string2 = string3), (CharSequence)"zip file", false, 2, null)) {
                DefaultHandler e13 = this;
                e13.BaseCoreGenericHandler().c().getLogger().warning("Zip file was closed during access: " + string);
                return null;
            }
            throw illegalStateException;
        }
        return null;
    }

    private static final Object LiteBansModule_31(DefaultHandler e12) {
        return e12.BaseCoreGenericHandler("net.milkbowl.vault.permission.Permission");
    }

    private static final Object BaseCoreGenericHandler(DefaultHandler e12) {
        return e12.BaseCoreGenericHandler("net.milkbowl.vault.chat.Chat");
    }

    private static final void AsyncBackgroundTask_5() {
        AsyncBackgroundTask_5 = new String[]{"", "default", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "zip file", "Zip file was closed during access: ", "net.milkbowl.vault.permission.Permission", "net.milkbowl.vault.chat.Chat"};
}

