package litebans;

import com.mojang.brigadier.Command;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;
import litebans.FabricPlugin;
import litebans.ac_0;
import litebans.ag_0;
import litebans.bd_0;
import litebans.cr_0;
import litebans.di_0;
import litebans.ec;
import litebans.eg_0;
import litebans.g8;
import litebans.hd;
import litebans.hl;
import litebans.jq_0;
import litebans.jv_0;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.minecraft.class_155;
import net.minecraft.class_2168;
import net.minecraft.class_2170;
import net.minecraft.class_2535;
import net.minecraft.class_2561;
import net.minecraft.class_3222;
import net.minecraft.class_3244;
import net.minecraft.class_3324;
import net.minecraft.server.MinecraftServer;
import org.jetbrains.annotations.Nullable;

public class lb_0
implements cr_0 {
    protected final di_0 d;
    protected MinecraftServer c;
    protected final hd a = new ac_0();
    private static /* synthetic */ String[] b;

    public lb_0(di_0 di_02) {
        this.d = di_02;
    }

    @Override
    public hd d() {
        return this.a;
    }

    @Override
    public void a(Object object, String string) {
        int n = this.b();
        g8 g82 = n >= 770 ? g8.a : g8.c;
        ((class_3222)object).field_13987.method_52396((class_2561)this.d().b(eg_0.a(string, g82)));
    }

    @Override
    public Object f() {
        return this.c.method_3739();
    }

    @Override
    public String a(Object object) {
        InetAddress inetAddress;
        SocketAddress socketAddress;
        if (object instanceof class_2168) {
            class_3222 class_32222 = ((class_2168)object).method_44023();
            if (class_32222 == null) {
                return null;
            }
            return this.a(class_32222.field_13987);
        }
        if (object instanceof class_3244 && (socketAddress = (InetSocketAddress)((class_3244)object).method_48107()) != null && (inetAddress = ((InetSocketAddress)socketAddress).getAddress()) != null) {
            return inetAddress.getHostAddress();
        }
        if (object instanceof class_2535 && (socketAddress = ((class_2535)object).method_10755()) instanceof InetSocketAddress && (inetAddress = ((InetSocketAddress)socketAddress).getAddress()) != null) {
            return inetAddress.getHostAddress();
        }
        return null;
    }

    @Override
    public boolean a() {
        return this.c.method_3828();
    }

    @Override
    public boolean e() {
        return this.c.method_18854();
    }

    @Override
    public List c() {
        class_3324 class_33242 = this.c.method_3760();
        if (class_33242 == null) {
            return Collections.emptyList();
        }
        return class_33242.method_14571();
    }

    @Override
    public void a(Runnable runnable) {
        this.c.method_19537(runnable);
    }

    @Override
    public void b(Object object, String string) {
        this.c.method_3734().method_44252((class_2168)object, string);
    }

    @Override
    public int b() {
        try {
            return class_155.method_31372();
        }
        catch (LinkageError linkageError) {
            this.d.getLogger().warning("Unable to determine server protocol version");
            return 770;
        }
    }

    @Override
    public Object d(Object object) {
        if (object instanceof class_3222) {
            return ((class_3222)object).method_64396();
        }
        return object;
    }

    @Override
    public void c(Object object, String string) {
        if (object instanceof class_2168) {
            ((class_2168)object).method_45068((class_2561)this.d().b(string));
        }
    }

    @Override
    public void a(Object object, String string, byte[] byArray) {
        ec.a(object, string, byArray);
    }

    @Override
    public jv_0 c(Object object) {
        String string = (object = this.d(object)) instanceof class_2168 ? ((class_2168)object).method_9214() : object.toString();
        return (jv_0)((FabricPlugin)this.d).a().b.remove(string);
    }

    @Override
    public jv_0 b(Object object) {
        return this.a(object, (Supplier)null);
    }

    @Override
    public jv_0 a(Object object, @Nullable Supplier supplier) {
        bd_0 bd_02 = ((FabricPlugin)this.d).a();
        Map map = bd_02.b;
        String string = (object = this.d(object)) instanceof class_2168 ? ((class_2168)object).method_9214() : object.toString();
        jv_0 jv_02 = (jv_0)map.get(string);
        if (jv_02 == null || jv_02.c() != object) {
            jv_02 = new ag_0((FabricPlugin)this.d, object, supplier);
            bd_02.f();
            map.put(string, jv_02);
        }
        return jv_02;
    }

    @Override
    public void a(Function function) {
        CommandRegistrationCallback.EVENT.register((commandDispatcher, class_71572, class_53642) -> function.apply(commandDispatcher));
    }

    @Override
    public void a(jq_0 jq_02, CommandDispatcher commandDispatcher) {
        ArgumentBuilder argumentBuilder = ((LiteralArgumentBuilder)((LiteralArgumentBuilder)class_2170.method_9247((String)jq_02.getName()).requires(class_21682 -> this.d.a(class_21682).e(jq_02.getPermission()))).executes((Command)jq_02)).then(class_2170.method_9244((String)"args", (ArgumentType)StringArgumentType.greedyString()).suggests((SuggestionProvider)jq_02).executes((Command)jq_02));
        commandDispatcher.getRoot().getChildren().removeIf(commandNode -> commandNode.getName().equals(jq_02.getName()));
        commandDispatcher.register((LiteralArgumentBuilder)argumentBuilder);
    }

    @Override
    public boolean d(@Nullable Object object, @Nullable String string) {
        if (!(object instanceof class_2168)) {
            return false;
        }
        return ((class_2168)object).method_9259(3);
    }

    @Override
    public void a(MinecraftServer minecraftServer) {
        this.c = minecraftServer;
    }

    private static final void a() {
        b = new String[]{"Unable to determine server protocol version", "args"};
    }

    static {
        lb_0.a();
    }
}

