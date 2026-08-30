package litebans;

import java.util.UUID;
import lombok.NonNull;
import org.jetbrains.annotations.Nullable;

public interface CommandSenderWrapper {
    public static final CommandSenderWrapper[] BaseCoreGenericHandler = new CommandSenderWrapper[0];
    public static final UUID LiteBansModule_31 = new UUID(0L, 0L);

    public void c(@NonNull String var1);

    public @NonNull String g();

    public @Nullable Object c();

    public @Nullable String LiteBansModule_31();

    public @NonNull String i();

    public @Nullable String LiteBansModule_241();

    public @NonNull UUID AsyncBackgroundTask_5();

    public @NonNull String BaseCoreGenericHandler();

    public boolean e(@Nullable String var1);

    public boolean LiteBansModule_195();

    public boolean GnuSparseMapHandler();

    public boolean e();

    public void AsyncBackgroundTask_5(@NonNull String var1);

    public void BaseCoreGenericHandler(String var1);

    public void LiteBansModule_31(String var1);

    public void BaseCoreGenericHandler(String var1, byte[] var2);
}

