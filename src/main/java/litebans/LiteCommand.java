package litebans;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InternalAnnotation
public interface LiteCommand {
    public void BaseCoreGenericHandler(@NotNull CommandSenderWrapper var1, @NotNull String[] var2);

    public String getName();

    public @Nullable String getPermission();

    public String[] getAliases();

    public @NotNull List suggest(@NotNull CommandSenderWrapper var1, @NotNull String[] var2);
}

