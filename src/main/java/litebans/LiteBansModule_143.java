package litebans;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketAdapter;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.events.PacketEvent;
import com.comphenix.protocol.wrappers.WrappedChatComponent;
import java.util.Arrays;
import org.bukkit.plugin.Plugin;
import org.jetbrains.annotations.NotNull;

public final class LiteBansModule_143
extends PacketAdapter {
    public static final LiteBansModule_328 e;
    private final PlatformPlugin BaseCoreGenericHandler;
    private final ConfigService LiteBansModule_31;
    private static final LiteBansModule_161 c;
    public LiteBansModule_143(@NotNull PlatformPlugin plugin) {
        LiteBansModule_158 ec_02 = plugin.i();
        ObjectUtilities.LiteBansModule_31(ec_02, "");
        Plugin plugin = BungeecordHandler_2.BaseCoreGenericHandler((BungeecordHandler_2)ec_02, null, 1, null);
        PacketType[] packetTypeArray = new PacketType[1];
        ObjectUtilities.LiteBansModule_31(LiteBansModule_328.BaseCoreGenericHandler(e), "");
        super(PacketAdapter.params((Plugin)plugin, (PacketType[])packetTypeArray).optionAsync());
        this.plugin = plugin;
        this.LiteBansModule_31 = (ConfigService)this.plugin.BaseCoreGenericHandler(ConfigService.class);
    }

    public void onPacketSending(@NotNull PacketEvent packetEvent) {
        try {
            boolean flag;
            boolean flag2;
            Object object;
            if (TemporaryplayerHandler.LiteBansModule_31(packetEvent.getPlayer())) {
                return;
            }
            PacketContainer packetContainer = packetEvent.getPacket();
            WrappedChatComponent wrappedChatComponent = (WrappedChatComponent)packetContainer.getChatComponents().read(0);
            Object object2 = this.LiteBansModule_31;
            if (((ConfigService)object2).g()) {
                object = object2;
                flag2 = false;
                WrappedChatComponent wrappedChatComponent2 = wrappedChatComponent;
                ((ConfigService)object).BaseCoreGenericHandler((Object)("1 " + (wrappedChatComponent2 != null ? wrappedChatComponent2.getJson() : null)));
            }
            Object object3 = LiteBansModule_104.BaseCoreGenericHandler(wrappedChatComponent.getJson());
            object2 = HttpHandler.BaseCoreGenericHandler(Arrays.copyOf(object3, ((LiteBansModule_432[])object3).length));
            object3 = this.LiteBansModule_31;
            flag2 = false;
            if (((ConfigService)object3).g()) {
                object = object3;
                flag = false;
                ((ConfigService)object).BaseCoreGenericHandler((Object)("2 " + (String)object2));
            }
            ObjectUtilities.BaseCoreGenericHandler(object2);
            if (StringUtilities.BaseCoreGenericHandler((CharSequence)object2, BlackHandler.AsyncBackgroundTask_22, false, 2, null)) {
                Object object4 = HttpHandler.BaseCoreGenericHandler((String)object2);
                object3 = WrappedChatComponent.fromJson((String)LiteBansModule_104.BaseCoreGenericHandler(Arrays.copyOf(object4, ((LiteBansModule_432[])object4).length)));
                object4 = this.LiteBansModule_31;
                flag = false;
                if (((ConfigService)object4).g()) {
                    object = object4;
                    ((ConfigService)object).BaseCoreGenericHandler((Object)("3 " + object3.getJson()));
                }
                packetContainer.getChatComponents().write(0, object3);
}
        catch (Throwable throwable) {
            ConfigService.BaseCoreGenericHandler(this.LiteBansModule_31, throwable, 0, 2, null);
            TemporaryplayerHandler.LiteBansModule_31(this.LiteBansModule_31, (Object)this);
}

    private static final PacketType BaseCoreGenericHandler() {
        PacketType packetType;
        try {
            packetType = PacketType.Login.Server.DISCONNECT;
        }
        catch (Throwable throwable) {
            packetType = null;
        }
        return packetType;
    }

    public static final /* synthetic */ LiteBansModule_161 LiteBansModule_31() {
        return c;
    }

    static {
        LiteBansModule_143.c();
        e = new LiteBansModule_328(null);
        c = ProxyConnection.BaseCoreGenericHandler(LiteBansModule_143::BaseCoreGenericHandler);
    }

    private static final void c() {
        AsyncBackgroundTask_5 = new String[]{"", "", "1 ", "2 ", "3 "};
}

