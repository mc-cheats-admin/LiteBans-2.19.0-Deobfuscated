package litebans;

import com.mojang.brigadier.CommandDispatcher;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import litebans.hd;
import litebans.jq_0;
import litebans.jv_0;
import net.minecraft.server.MinecraftServer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface cr_0 {
    public void a(Object var1, String var2);

    public Object f();

    public String a(Object var1);

    public boolean a();

    public boolean e();

    public @Nullable List c();

    public void a(Runnable var1);

    public void b(Object var1, String var2);

    public int b();

    public Object d(Object var1);

    public void c(@Nullable Object var1, String var2);

    public void a(Object var1, String var2, byte[] var3);

    public jv_0 c(Object var1);

    public jv_0 b(Object var1);

    public jv_0 a(Object var1, @Nullable Supplier var2);

    public hd d();

    public void a(MinecraftServer var1);

    public void a(Function var1);

    public void a(jq_0 var1, CommandDispatcher var2);

    public boolean d(@Nullable Object var1, @NotNull String var2);
}

