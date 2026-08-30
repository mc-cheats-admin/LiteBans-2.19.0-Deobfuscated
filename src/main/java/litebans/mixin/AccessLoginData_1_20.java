package litebans.mixin;

import com.mojang.authlib.GameProfile;
import net.minecraft.class_2535;
import net.minecraft.class_3248;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(value={class_3248.class})
public static interface AccessLoginData_1_20 {
    @Accessor(value="field_14160")
    public GameProfile getProfile();

    @Accessor(value="field_14158")
    public class_2535 getConnection();
}

