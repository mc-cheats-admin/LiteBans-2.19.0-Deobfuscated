package litebans;

import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import net.minecraft.core.RegistryAccess;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.ComponentSerialization;
import net.minecraft.util.StrictJsonParser;

public class LiteBansModule_255
implements LiteBansModule_252 {
    @Override
    public Object BaseCoreGenericHandler(CharSequence charSequence) {
        return Component.literal((String)charSequence.toString());
    }

    @Override
    public Object LiteBansModule_31(CharSequence charSequence) {
        return this.plugin(charSequence);
    }

    private final Component BaseCoreGenericHandler(CharSequence charSequence) {
        return (Component)ComponentSerialization.CODEC.parse((DynamicOps)RegistryAccess.EMPTY.createSerializationContext((DynamicOps)JsonOps.INSTANCE), StrictJsonParser.parse((String)charSequence.toString())).getOrThrow(IllegalArgumentException::new);
}

