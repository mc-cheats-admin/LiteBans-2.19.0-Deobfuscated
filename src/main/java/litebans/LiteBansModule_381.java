package litebans;

import net.minecraft.commands.CommandSourceStack;
import net.minecraft.server.permissions.LevelBasedPermissionSet;
import net.minecraft.server.permissions.Permission;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class LiteBansModule_381 {
    public static boolean BaseCoreGenericHandler(@Nullable Object targetObj, @NotNull String string) {
        if (targetObj instanceof CommandSourceStack) {
            if (targetObj.permissions() == LevelBasedPermissionSet.OWNER) {
                return true;
            }
            return targetObj.permissions().hasPermission((Permission)Permission.Atom.create((String)string));
        }
        return false;
}

