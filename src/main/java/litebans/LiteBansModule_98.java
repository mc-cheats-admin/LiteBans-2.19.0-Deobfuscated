package litebans;

import com.mojang.brigadier.CommandDispatcher;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import net.minecraft.server.MinecraftServer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface LiteBansModule_98 {
    public void BaseCoreGenericHandler(Object var1, String var2);

    public Object LiteBansModule_194();

    public String BaseCoreGenericHandler(Object var1);

    public boolean BaseCoreGenericHandler();

    public boolean e();

    public @Nullable List c();

    public void BaseCoreGenericHandler(Runnable var1);

    public void LiteBansModule_31(Object var1, String var2);

    public int LiteBansModule_31();

    public Object AsyncBackgroundTask_5(Object var1);

    public void c(@Nullable Object var1, String var2);

    public void BaseCoreGenericHandler(Object var1, String var2, byte[] var3);

    public CommandSenderWrapper c(Object var1);

    public CommandSenderWrapper LiteBansModule_31(Object var1);

    public CommandSenderWrapper BaseCoreGenericHandler(Object var1, @Nullable Supplier var2);

    public LiteBansModule_252 AsyncBackgroundTask_5();

    public void BaseCoreGenericHandler(MinecraftServer var1);

    public void BaseCoreGenericHandler(Function var1);

    public void BaseCoreGenericHandler(LiteBansModule_352 var1, CommandDispatcher var2);

    public boolean AsyncBackgroundTask_5(@Nullable Object var1, @NotNull String var2);
}

