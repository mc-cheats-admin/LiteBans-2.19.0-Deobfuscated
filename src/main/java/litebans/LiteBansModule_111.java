package litebans;

import net.fabricmc.fabric.api.message.v1.ServerMessageEvents;
import net.minecraft.class_2168;
import net.minecraft.class_2556;
import net.minecraft.class_3222;
import net.minecraft.class_7471;
import org.jetbrains.annotations.NotNull;

public final class LiteBansModule_111
implements LiteBansModule_51 {
    private final PlatformPlugin BaseCoreGenericHandler;
    private final PunishmentTableService LiteBansModule_31;

    public LiteBansModule_111(@NotNull PlatformPlugin plugin) {
        this.plugin = plugin;
        this.LiteBansModule_31 = (PunishmentTableService)this.plugin.BaseCoreGenericHandler(PunishmentTableService.class);
    }

    public final PlatformPlugin LiteBansModule_31() {
        return this.plugin;
    }

    @Override
    public LiteBansModule_111 BaseCoreGenericHandler() {
        LiteBansModule_111 cy_02;
        LiteBansModule_111 cy_03 = cy_02 = this;
        ServerMessageEvents.ALLOW_CHAT_MESSAGE.register(cy_03::BaseCoreGenericHandler);
        ServerMessageEvents.ALLOW_COMMAND_MESSAGE.register(cy_03::BaseCoreGenericHandler);
        return cy_02;
    }

    public final boolean BaseCoreGenericHandler(@NotNull class_7471 class_74712, @NotNull class_3222 class_32222, @NotNull class_2556.class_7602 class_76022) {
        CommandSenderWrapper sender = this.plugin.BaseCoreGenericHandler(class_32222);
        String string = class_74712.method_46291().getString();
        LiteBansModule_71 c92 = new LiteBansModule_71(class_74712, false, 2, null);
        TestHandler_2 f82 = this.LiteBansModule_31.BaseCoreGenericHandler();
        ObjectUtilities.BaseCoreGenericHandler((Object)string);
        ObjectUtilities.BaseCoreGenericHandler(sender);
        f82.BaseCoreGenericHandler((Object)c92, string, sender, true);
        return !c92.BaseCoreGenericHandler();
    }

    public final boolean BaseCoreGenericHandler(@NotNull class_7471 class_74712, @NotNull class_2168 class_21682, @NotNull class_2556.class_7602 class_76022) {
        CommandSenderWrapper sender = this.plugin.BaseCoreGenericHandler(class_21682);
        String string = class_74712.method_46291().getString();
        LiteBansModule_71 c92 = new LiteBansModule_71(class_74712, false, 2, null);
        TestHandler_2 f82 = this.LiteBansModule_31.BaseCoreGenericHandler();
        ObjectUtilities.BaseCoreGenericHandler((Object)string);
        ObjectUtilities.BaseCoreGenericHandler(sender);
        TestHandler_2.BaseCoreGenericHandler(f82, c92, string, sender, false, 8, null);
        return !c92.BaseCoreGenericHandler();
    }

    @Override
    public LiteBansModule_176 BaseCoreGenericHandler() {
        return this.plugin();
    }
}

