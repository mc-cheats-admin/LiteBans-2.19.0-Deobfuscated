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

    public final LuckPerms c(@NotNull Object targetObj) {
        ObjectUtilities.LiteBansModule_31(targetObj, "");
        return (LuckPerms)targetObj;
    }

    public final User e(@NotNull Object targetObj) {
        ObjectUtilities.LiteBansModule_31(targetObj, "");
        return (User)targetObj;
    }

    public final Object BaseCoreGenericHandler(@NotNull Object targetObj, @NotNull String string) {
        if (!HexEncodingHelper.BaseCoreGenericHandler(string)) {
            return null;
        }
        UserManager userManager = this.c(targetObj).getUserManager();
        CompletableFuture completableFuture = userManager.loadUser(UUID.fromString(string));
        return completableFuture.join();
    }

    public final Set LiteBansModule_31(@NotNull Object targetObj) {
        GroupManager groupManager = this.c(targetObj).getGroupManager();
        return groupManager.getLoadedGroups();
    }

    public final String AsyncBackgroundTask_5(@NotNull Object targetObj) {
        return this.e(targetObj).getCachedData().getMetaData().getPrefix();
    }

    public final String BaseCoreGenericHandler(@NotNull Object targetObj) {
        return this.e(targetObj).getCachedData().getMetaData().getSuffix();
    }

    public final int BaseCoreGenericHandler(@NotNull Object targetObj, @NotNull Object contextObj) {
        Object v0;
{
            Set set = this.LiteBansModule_31(targetObj);
            String string = this.e(contextObj).getCachedData().getMetaData().getPrimaryGroup();
            Iterable iterable = set;
            for (Object t2 : iterable) {
                Group group = (Group)t2;
                if (!ObjectUtilities.BaseCoreGenericHandler(group.getName(), string)) continue;
                v0 = t2;
                break;
}
        if ((resultObj = (Group)v0) == null || (resultObj = resultObj.getWeight()) == null) {
            resultObj = OptionalInt.empty();
        }
        Object helperObj = resultObj;
        return ((OptionalInt)helperObj).orElse(0);
    }

    public final boolean LiteBansModule_31(@NotNull Object targetObj, @NotNull String string) {
        return this.e(targetObj).getCachedData().getPermissionData().checkPermission(string).asBoolean();
    }

    static {
        LiteBansModule_48.LiteBansModule_31();
        LiteBansModule_31 = new LiteBansModule_48();
    }

    private static final void LiteBansModule_31() {
        BaseCoreGenericHandler = new String[]{"", ""};
}

