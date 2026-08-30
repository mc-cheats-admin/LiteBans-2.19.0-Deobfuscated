package litebans;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.TextComponent;
import net.kyori.adventure.text.serializer.gson.GsonComponentSerializer;
import net.kyori.adventure.text.serializer.legacy.LegacyComponentSerializer;
import org.jetbrains.annotations.NotNull;

public class ih_0 {
    public static @NotNull TextComponent a(CharSequence charSequence) {
        return ih_0.a().deserialize(charSequence.toString());
    }

    public static Component b(CharSequence charSequence) {
        return GsonComponentSerializer.gson().deserialize((Object)charSequence.toString());
    }

    public static @NotNull LegacyComponentSerializer a() {
        return LegacyComponentSerializer.builder().useUnusualXRepeatedCharacterHexFormat().build();
    }
}

