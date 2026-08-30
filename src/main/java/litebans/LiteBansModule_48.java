package litebans;

import java.util.OptionalInt;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import net.luckperms.api.LuckPerms;
import net.luckperms.api.LuckPermsProvider;
import net.luckperms.api.model.group.Group;
import net.luckperms.api.model.group.GroupManager;
import net.luckperms.api.model.user.User;
import net.luckperms.api.model.user.UserManager;
import org.jetbrains.annotations.NotNull;

public final class LiteBansModule_48 {
    public static final LiteBansModule_48 LiteBansModule_31;
    private LiteBansModule_48() {
    }

    public final Object BaseCoreGenericHandler() {
        return LuckPermsProvider.get();
    }

    public final LuckPerms c(@NotNull Object object) {
        ObjectUtilities.LiteBansModule_31(object, "");
        return (LuckPerms)object;
    }

    public final User e(@NotNull Object object) {
        ObjectUtilities.LiteBansModule_31(object, "");
        return (User)object;
    }

    public final Object BaseCoreGenericHandler(@NotNull Object object, @NotNull String string) {
        if (!HexEncodingHelper.BaseCoreGenericHandler(string)) {
            return null;
        }
        UserManager userManager = this.c(object).getUserManager();
        CompletableFuture completableFuture = userManager.loadUser(UUID.fromString(string));
        return completableFuture.join();
    }

    public final Set LiteBansModule_31(@NotNull Object object) {
        GroupManager groupManager = this.c(object).getGroupManager();
        return groupManager.getLoadedGroups();
    }

    public final String AsyncBackgroundTask_5(@NotNull Object object) {
        return this.e(object).getCachedData().getMetaData().getPrefix();
    }

    public final String BaseCoreGenericHandler(@NotNull Object object) {
        return this.e(object).getCachedData().getMetaData().getSuffix();
    }

    public final int BaseCoreGenericHandler(@NotNull Object object, @NotNull Object object2) {
        Object object3;
        Object v0;
        block2: {
            Set set = this.LiteBansModule_31(object);
            String string = this.e(object2).getCachedData().getMetaData().getPrimaryGroup();
            Iterable iterable = set;
            for (Object t2 : iterable) {
                Group group = (Group)t2;
                boolean flag = false;
                if (!ObjectUtilities.BaseCoreGenericHandler((Object)group.getName(), (Object)string)) continue;
                v0 = t2;
                break block2;
            }
            v0 = null;
        }
        if ((object3 = (Group)v0) == null || (object3 = object3.getWeight()) == null) {
            object3 = OptionalInt.empty();
        }
        Object object4 = object3;
        return ((OptionalInt)object4).orElse(0);
    }

    public final boolean LiteBansModule_31(@NotNull Object object, @NotNull String string) {
        return this.e(object).getCachedData().getPermissionData().checkPermission(string).asBoolean();
    }

    static {
        LiteBansModule_48.LiteBansModule_31();
        LiteBansModule_31 = new LiteBansModule_48();
    }

    private static final void LiteBansModule_31() {
        BaseCoreGenericHandler = new String[]{"", ""};
    }
}

