package litebans;

import java.util.OptionalInt;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import litebans.ew;
import litebans.hl;
import litebans.jj_0;
import net.luckperms.api.LuckPerms;
import net.luckperms.api.LuckPermsProvider;
import net.luckperms.api.model.group.Group;
import net.luckperms.api.model.group.GroupManager;
import net.luckperms.api.model.user.User;
import net.luckperms.api.model.user.UserManager;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from litebans.bH
 */
public static final class bh_0 {
    public static final bh_0 b;
    private static /* synthetic */ String[] a;

    private bh_0() {
    }

    public final Object a() {
        return LuckPermsProvider.get();
    }

    public final LuckPerms c(@NotNull Object object) {
        ew.b(object, a[0]);
        return (LuckPerms)object;
    }

    public final User e(@NotNull Object object) {
        ew.b(object, a[1]);
        return (User)object;
    }

    public final Object a(@NotNull Object object, @NotNull String string) {
        if (!jj_0.a(string)) {
            return null;
        }
        UserManager userManager = this.c(object).getUserManager();
        CompletableFuture completableFuture = userManager.loadUser(UUID.fromString(string));
        return completableFuture.join();
    }

    public final Set b(@NotNull Object object) {
        GroupManager groupManager = this.c(object).getGroupManager();
        return groupManager.getLoadedGroups();
    }

    public final String d(@NotNull Object object) {
        return this.e(object).getCachedData().getMetaData().getPrefix();
    }

    public final String a(@NotNull Object object) {
        return this.e(object).getCachedData().getMetaData().getSuffix();
    }

    public final int a(@NotNull Object object, @NotNull Object object2) {
        Object object3;
        Object v0;
        block2: {
            Set set = this.b(object);
            String string = this.e(object2).getCachedData().getMetaData().getPrimaryGroup();
            Iterable iterable = set;
            for (Object t2 : iterable) {
                Group group = (Group)t2;
                boolean bl = false;
                if (!ew.a((Object)group.getName(), (Object)string)) continue;
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

    public final boolean b(@NotNull Object object, @NotNull String string) {
        return this.e(object).getCachedData().getPermissionData().checkPermission(string).asBoolean();
    }

    static {
        bh_0.b();
        b = new bh_0();
    }

    private static final void b() {
        a = new String[]{hl.a("", -954855201), hl.a("", -218297747)};
    }
}

