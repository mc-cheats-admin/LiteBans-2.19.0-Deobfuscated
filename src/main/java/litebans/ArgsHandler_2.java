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

public class ArgsHandler_2
implements LiteBansModule_99 {
    protected final PlatformPlugin AsyncBackgroundTask_5;
    protected MinecraftServer c;
    protected final LiteBansModule_253 BaseCoreGenericHandler = new NetMinecraftClassHandler();
        public ArgsHandler_2(PlatformPlugin plugin) {
        this.AsyncBackgroundTask_5 = plugin;
    }

    @Override
    public LiteBansModule_253 AsyncBackgroundTask_5() {
        return this.plugin;
    }

    @Override
    public void BaseCoreGenericHandler(Object targetObj, String string) {
        int n = this.LiteBansModule_31();
        V116Handler g82 = n >= 770 ? V116Handler.BaseCoreGenericHandler : V116Handler.c;
        ((class_3222)targetObj).field_13987.method_52396((class_2561)this.AsyncBackgroundTask_5().LiteBansModule_31(LiteBansModule_165.BaseCoreGenericHandler(string, g82)));
    }

    @Override
    public Object LiteBansModule_195() {
        return this.c.method_3739();
    }

    @Override
    public String BaseCoreGenericHandler(Object targetObj) {
        InetAddress inetAddress;
        SocketAddress socketAddress;
        if (targetObj instanceof class_2168) {
            class_3222 class_32222 = ((class_2168)targetObj).method_44023();
            if (class_32222 == null) {
                return null;
            }
            return this.plugin(class_32222.field_13987);
        }
        if (targetObj instanceof class_3244 && (socketAddress = (InetSocketAddress)((class_3244)targetObj).method_48107()) != null && (inetAddress = ((InetSocketAddress)socketAddress).getAddress()) != null) {
            return inetAddress.getHostAddress();
        }
        if (targetObj instanceof class_2535 && (socketAddress = ((class_2535)targetObj).method_10755()) instanceof InetSocketAddress && (inetAddress = ((InetSocketAddress)socketAddress).getAddress()) != null) {
            return inetAddress.getHostAddress();
        }
        return null;
    }

    @Override
    public boolean BaseCoreGenericHandler() {
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
    public void BaseCoreGenericHandler(Runnable runnable) {
        this.c.method_19537(runnable);
    }

    @Override
    public void LiteBansModule_31(Object targetObj, String string) {
        this.c.method_3734().method_44252((class_2168)targetObj, string);
    }

    @Override
    public int LiteBansModule_31() {
        try {
            return class_155.method_31372();
        }
        catch (LinkageError linkageError) {
            this.AsyncBackgroundTask_5.getLogger().warning("Unable to determine server protocol version");
            return 770;
        }
    }

    @Override
    public Object AsyncBackgroundTask_5(Object targetObj) {
        if (targetObj instanceof class_3222) {
            return ((class_3222)targetObj).method_64396();
        }
        return targetObj;
    }

    @Override
    public void c(Object targetObj, String string) {
        if (targetObj instanceof class_2168) {
            ((class_2168)targetObj).method_45068((class_2561)this.AsyncBackgroundTask_5().LiteBansModule_31(string));
        }
    }

    @Override
    public void BaseCoreGenericHandler(Object targetObj, String string, byte[] byArray) {
        LiteBansModule_158.BaseCoreGenericHandler(targetObj, string, byArray);
    }

    @Override
    public CommandSenderWrapper c(Object targetObj) {
        String string = (targetObj = this.AsyncBackgroundTask_5(targetObj)) instanceof class_2168 ? ((class_2168)targetObj).method_9214() : targetObj.toString();
        return (CommandSenderWrapper)((ConfigYmlHandler)this.AsyncBackgroundTask_5).BaseCoreGenericHandler().LiteBansModule_31.remove(string);
    }

    @Override
    public CommandSenderWrapper LiteBansModule_31(Object targetObj) {
        return this.plugin(targetObj, (Supplier)null);
    }

    @Override
    public CommandSenderWrapper BaseCoreGenericHandler(Object targetObj, @Nullable Supplier supplier) {
        LiteBansCore core = ((ConfigYmlHandler)this.AsyncBackgroundTask_5).BaseCoreGenericHandler();
        Map map = core.LiteBansModule_31;
        String string = (targetObj = this.AsyncBackgroundTask_5(targetObj)) instanceof class_2168 ? ((class_2168)targetObj).method_9214() : targetObj.toString();
        CommandSenderWrapper sender = (CommandSenderWrapper)map.get(string);
        if (sender == null || sender.c() != targetObj) {
            sender = new BungeecordHandler((ConfigYmlHandler)this.AsyncBackgroundTask_5, targetObj, supplier);
            core.LiteBansModule_195();
            map.put(string, sender);
        }
        return sender;
    }

    @Override
    public void BaseCoreGenericHandler(Function function) {
        CommandRegistrationCallback.EVENT.register((commandDispatcher, class_71572, class_53642) -> function.apply(commandDispatcher));
    }

    @Override
    public void BaseCoreGenericHandler(LiteBansModule_354 jq_02, CommandDispatcher commandDispatcher) {
        ArgumentBuilder argumentBuilder = ((LiteralArgumentBuilder)((LiteralArgumentBuilder)class_2170.method_9247((String)jq_02.getName()).requires(class_21682 -> this.AsyncBackgroundTask_5.BaseCoreGenericHandler(class_21682).e(jq_02.getPermission()))).executes((Command)jq_02)).then(class_2170.method_9244((String)"args", (ArgumentType)StringArgumentType.greedyString()).suggests((SuggestionProvider)jq_02).executes((Command)jq_02));
        commandDispatcher.getRoot().getChildren().removeIf(commandNode -> commandNode.getName().equals(jq_02.getName()));
        commandDispatcher.register((LiteralArgumentBuilder)argumentBuilder);
    }

    @Override
    public boolean AsyncBackgroundTask_5(@Nullable Object targetObj, @Nullable String string) {
        if (!(targetObj instanceof class_2168)) {
            return false;
        }
        return ((class_2168)targetObj).method_9259(3);
    }

    @Override
    public void BaseCoreGenericHandler(MinecraftServer minecraftServer) {
        this.c = minecraftServer;
    }

    private static final void BaseCoreGenericHandler() {
        LiteBansModule_31 = new String[]{"Unable to determine server protocol version", "args"};
    }

    static {
        ArgsHandler_2.BaseCoreGenericHandler();
    }
}

