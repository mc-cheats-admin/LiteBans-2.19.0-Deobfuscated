package litebans;

import java.util.Arrays;
import org.jetbrains.annotations.NotNull;

public final class LiteBansModule_403 {
    private final ConfigService LiteBansModule_31;
    private final CharSequence[] BaseCoreGenericHandler;

    public LiteBansModule_403(@NotNull ConfigService configService, @NotNull CharSequence[] charSequenceArray) {
        this.LiteBansModule_31 = configService;
        this.plugin = charSequenceArray;
    }

    public final ConfigService c() {
        return this.LiteBansModule_31;
    }

    public final CharSequence[] BaseCoreGenericHandler() {
        return this.plugin;
    }

    public final int LiteBansModule_31() {
        CharSequence[] charSequenceArray = this.plugin;
        return this.LiteBansModule_31.BaseCoreGenericHandler(Arrays.copyOf(charSequenceArray, charSequenceArray.length));
}

