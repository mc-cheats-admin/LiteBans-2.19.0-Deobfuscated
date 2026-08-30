package litebans;

import net.minecraft.commands.CommandSourceStack;
import net.minecraft.server.permissions.LevelBasedPermissionSet;
import net.minecraft.server.permissions.Permission;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from litebans.kK
 */
public static class kk_0 {
    public static boolean a(@Nullable Object object, @NotNull String string) {
        if (object instanceof CommandSourceStack) {
            if (((CommandSourceStack)object).permissions() == LevelBasedPermissionSet.OWNER) {
                return true;
            }
            return ((CommandSourceStack)object).permissions().hasPermission((Permission)Permission.Atom.create((String)string));
        }
        return false;
    }
}

