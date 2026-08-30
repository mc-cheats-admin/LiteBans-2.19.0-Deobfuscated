package litebans;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.TextComponent;
import net.kyori.adventure.text.serializer.gson.GsonComponentSerializer;
import net.kyori.adventure.text.serializer.legacy.LegacyComponentSerializer;
import org.jetbrains.annotations.NotNull;

public class LiteBansModule_305 {
    public static @NotNull TextComponent BaseCoreGenericHandler(CharSequence charSequence) {
        return LiteBansModule_305.BaseCoreGenericHandler().deserialize(charSequence.toString());
    }

    public static Component LiteBansModule_31(CharSequence charSequence) {
        return GsonComponentSerializer.gson().deserialize((Object)charSequence.toString());
    }

    public static @NotNull LegacyComponentSerializer BaseCoreGenericHandler() {
        return LegacyComponentSerializer.builder().useUnusualXRepeatedCharacterHexFormat().build();
    }
}

