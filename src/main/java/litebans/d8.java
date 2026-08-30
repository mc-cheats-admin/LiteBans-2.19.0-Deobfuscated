package litebans;

import java.util.List;
import litebans.gy_0;
import litebans.jv_0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@gy_0
public interface d8 {
    public void a(@NotNull jv_0 var1, @NotNull String[] var2);

    public String getName();

    public @Nullable String getPermission();

    public String[] getAliases();

    public @NotNull List suggest(@NotNull jv_0 var1, @NotNull String[] var2);
}

