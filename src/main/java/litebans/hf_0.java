package litebans;

import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import litebans.hd;
import net.minecraft.core.RegistryAccess;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.ComponentSerialization;
import net.minecraft.util.StrictJsonParser;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from litebans.hF
 */
public static class hf_0
implements hd {
    @Override
    public Object a(CharSequence charSequence) {
        return Component.literal((String)charSequence.toString());
    }

    @Override
    public Object b(CharSequence charSequence) {
        return this.a(charSequence);
    }

    private final Component a(CharSequence charSequence) {
        return (Component)ComponentSerialization.CODEC.parse((DynamicOps)RegistryAccess.EMPTY.createSerializationContext((DynamicOps)JsonOps.INSTANCE), (Object)StrictJsonParser.parse((String)charSequence.toString())).getOrThrow(IllegalArgumentException::new);
    }
}

