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
    private final LiteBansModule_159 LiteBansModule_31;
    private final LiteBansModule_162 c;
    private final LiteBansModule_162 BaseCoreGenericHandler;
        public DefaultHandler(@NotNull LiteBansModule_159 ec_02) {
        this.LiteBansModule_31 = ec_02;
        this.c = ProxyConnection.BaseCoreGenericHandler(() -> DefaultHandler.LiteBansModule_31(this));
        this.plugin = ProxyConnection.BaseCoreGenericHandler(() -> DefaultHandler.BaseCoreGenericHandler(this));
    }

    public final LiteBansModule_159 BaseCoreGenericHandler() {
        return this.LiteBansModule_31;
    }

    public final Object c() {
        LiteBansModule_162 eE2 = this.c;
        return eE2.BaseCoreGenericHandler();
    }

    public final Object LiteBansModule_31() {
        LiteBansModule_162 eE2 = this.plugin;
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
        LiteBansModule_159 ec_02 = e12.BaseCoreGenericHandler().c().i();
        ObjectUtilities.LiteBansModule_31(ec_02, "");
        BungeecordHandler_2 ao_02 = (BungeecordHandler_2)ec_02;
        Object targetObj = this.c();
        if (!(targetObj instanceof Permission)) return false;
        Permission permission = (Permission)targetObj;
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
            targetObj = ObjectUtilities.BaseCoreGenericHandler((Object)string4, (Object)"default") ? null : string4;
            if (!(args.length == 0) && permission2.hasGroupSupport()) {
                objectArray = permission2.getPlayerGroups((String)targetObj, (OfflinePlayer)e12);
                for (String string5 : args) {
                    Iterator iterator = ArrayHandler.BaseCoreGenericHandler(objectArray);
                    while (iterator.hasNext()) {
                        String string6 = (String)iterator.next();
                        if (!StringUtilities.BaseCoreGenericHandler(string5, string6, true)) continue;
                        return true;
                    }
                }
            }
            if (permission2.playerHas((String)targetObj, (OfflinePlayer)e12, string3)) return true;
            objectArray = string2;
            if (!permission2.playerHas((String)targetObj, (OfflinePlayer)e12, string3 + '.' + objectArray.toLowerCase(Locale.ENGLISH))) return false;
            return true;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return false;
        }
        catch (NoSuchMethodError noSuchMethodError) {
            return false;
        }
    }

    public final boolean BaseCoreGenericHandler(@Nullable Object targetObj, @NotNull String string, @Nullable String string2) {
        Object contextObj = this.c();
        Permission permission = contextObj instanceof Permission ? (Permission)contextObj : null;
        if (permission == null) {
            return false;
        }
        Permission permission2 = permission;
        ObjectUtilities.LiteBansModule_31(targetObj, "");
        return permission2.playerHas(string2, (OfflinePlayer)targetObj, string);
    }

    public static /* synthetic */ boolean BaseCoreGenericHandler(DefaultHandler e12, Object targetObj, String string, String string2, int n, Object contextObj) {
        if ((n & 4) != 0) {
            string2 = null;
        }
        return e12.BaseCoreGenericHandler(targetObj, string, string2);
    }

    public final String BaseCoreGenericHandler(@Nullable Object targetObj) {
        if (targetObj == null) {
            return "";
        }
        LiteBansModule_159 ec_02 = this.LiteBansModule_31;
        ObjectUtilities.LiteBansModule_31(ec_02, "");
        BungeecordHandler_2 ao_02 = (BungeecordHandler_2)ec_02;
        Object contextObj = this.c();
        Permission permission = contextObj instanceof Permission ? (Permission)contextObj : null;
        if (permission == null) {
            return "";
        }
        Permission permission2 = permission;
        Object resultObj = this.LiteBansModule_31();
        Chat chat = resultObj instanceof Chat ? (Chat)resultObj : null;
        if (chat == null) {
            return "";
        }
        Chat chat2 = chat;
        if (targetObj instanceof UUID) {
            Object helperObj = ao_02.BaseCoreGenericHandler((UUID)targetObj);
            OfflinePlayer offlinePlayer = helperObj instanceof OfflinePlayer ? (OfflinePlayer)helperObj : null;
            if (offlinePlayer == null) {
                return "";
            }
            contextObj = offlinePlayer;
            String string = chat2.getPlayerPrefix(null, (OfflinePlayer)contextObj);
            if (string == null) {
                string = "";
            }
            return string;
        }
        String string = chat2.getPlayerPrefix((Player)targetObj);
        if (string == null) {
            string = chat2.getGroupPrefix(((Player)targetObj).getWorld().getName(), permission2.getPrimaryGroup((Player)targetObj));
        }
        return string;
    }

    public final String LiteBansModule_31(@Nullable Object targetObj) {
        if (targetObj == null) {
            return "";
        }
        LiteBansModule_159 ec_02 = this.LiteBansModule_31;
        ObjectUtilities.LiteBansModule_31(ec_02, "");
        BungeecordHandler_2 ao_02 = (BungeecordHandler_2)ec_02;
        Object contextObj = this.c();
        Permission permission = contextObj instanceof Permission ? (Permission)contextObj : null;
        if (permission == null) {
            return "";
        }
        Permission permission2 = permission;
        Object resultObj = this.LiteBansModule_31();
        Chat chat = resultObj instanceof Chat ? (Chat)resultObj : null;
        if (chat == null) {
            return "";
        }
        Chat chat2 = chat;
        if (targetObj instanceof UUID) {
            Object helperObj = ao_02.BaseCoreGenericHandler((UUID)targetObj);
            OfflinePlayer offlinePlayer = helperObj instanceof OfflinePlayer ? (OfflinePlayer)helperObj : null;
            if (offlinePlayer == null) {
                return "";
            }
            contextObj = offlinePlayer;
            String string = chat2.getPlayerSuffix(null, (OfflinePlayer)contextObj);
            if (string == null) {
                string = "";
            }
            return string;
        }
        String string = chat2.getPlayerSuffix((Player)targetObj);
        if (string == null) {
            string = chat2.getGroupSuffix(((Player)targetObj).getWorld().getName(), permission2.getPrimaryGroup((Player)targetObj));
        }
        return string;
    }

    public final Object BaseCoreGenericHandler(@NotNull String string) {
        LiteBansModule_159 ec_02 = this.LiteBansModule_31;
        ObjectUtilities.LiteBansModule_31(ec_02, "");
        BungeecordHandler_2 ao_02 = (BungeecordHandler_2)ec_02;
        try {
            DefaultHandler e12 = this;
            RegisteredServiceProvider registeredServiceProvider = ao_02.BaseCoreGenericHandler(e12.BaseCoreGenericHandler().c()).getServer().getServicesManager().getRegistration(Class.forName(string));
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

    static {
        DefaultHandler.AsyncBackgroundTask_5();
    }
}

