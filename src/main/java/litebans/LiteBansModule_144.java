package litebans;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketAdapter;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.events.PacketEvent;
import com.comphenix.protocol.wrappers.WrappedChatComponent;
import java.util.Arrays;
import org.bukkit.plugin.Plugin;
import org.jetbrains.annotations.NotNull;

public final class LiteBansModule_144
extends PacketAdapter {
    public static final LiteBansModule_329 e;
    private final PlatformPlugin BaseCoreGenericHandler;
    private final ConfigService LiteBansModule_31;
    private static final LiteBansModule_162 c;
        public LiteBansModule_144(@NotNull PlatformPlugin plugin) {
        LiteBansModule_159 ec_02 = plugin.i();
        ObjectUtilities.LiteBansModule_31(ec_02, "");
        Plugin plugin = BungeecordHandler_2.BaseCoreGenericHandler((BungeecordHandler_2)ec_02, null, 1, null);
        PacketType[] packetTypeArray = new PacketType[1];
        ObjectUtilities.LiteBansModule_31(LiteBansModule_329.BaseCoreGenericHandler(e), "");
        super(PacketAdapter.params((Plugin)plugin, (PacketType[])packetTypeArray).optionAsync());
        this.plugin = plugin;
        this.LiteBansModule_31 = (ConfigService)this.plugin.BaseCoreGenericHandler(ConfigService.class);
    }

    public void onPacketSending(@NotNull PacketEvent packetEvent) {
        try {
            boolean flag;
            boolean flag2;
            if (TemporaryplayerHandler.LiteBansModule_31(packetEvent.getPlayer())) {
                return;
            }
            PacketContainer packetContainer = packetEvent.getPacket();
            WrappedChatComponent wrappedChatComponent = (WrappedChatComponent)packetContainer.getChatComponents().read(0);
            Object contextObj = this.LiteBansModule_31;
            if (((ConfigService)contextObj).g()) {
                targetObj = contextObj;
                flag2 = false;
                WrappedChatComponent wrappedChatComponent2 = wrappedChatComponent;
                ((ConfigService)targetObj).BaseCoreGenericHandler((Object)("1 " + (wrappedChatComponent2 != null ? wrappedChatComponent2.getJson() : null)));
            }
            Object resultObj = LiteBansModule_105.BaseCoreGenericHandler(wrappedChatComponent.getJson());
            contextObj = HttpHandler.BaseCoreGenericHandler(Arrays.copyOf(resultObj, ((LiteBansModule_434[])resultObj).length));
            resultObj = this.LiteBansModule_31;
            flag2 = false;
            if (((ConfigService)resultObj).g()) {
                targetObj = resultObj;
                flag = false;
                ((ConfigService)targetObj).BaseCoreGenericHandler((Object)("2 " + (String)contextObj));
            }
            ObjectUtilities.BaseCoreGenericHandler(contextObj);
            if (StringUtilities.BaseCoreGenericHandler((CharSequence)contextObj, BlackHandler.AsyncBackgroundTask_22, false, 2, null)) {
                Object helperObj = HttpHandler.BaseCoreGenericHandler((String)contextObj);
                resultObj = WrappedChatComponent.fromJson((String)LiteBansModule_105.BaseCoreGenericHandler(Arrays.copyOf(helperObj, ((LiteBansModule_434[])helperObj).length)));
                helperObj = this.LiteBansModule_31;
                flag = false;
                if (((ConfigService)helperObj).g()) {
                    targetObj = helperObj;
                    ((ConfigService)targetObj).BaseCoreGenericHandler((Object)("3 " + resultObj.getJson()));
                }
                packetContainer.getChatComponents().write(0, resultObj);
            }
        }
        catch (Throwable throwable) {
            ConfigService.BaseCoreGenericHandler(this.LiteBansModule_31, throwable, 0, 2, null);
            TemporaryplayerHandler.LiteBansModule_31(this.LiteBansModule_31, (Object)this);
        }
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

    public static final /* synthetic */ LiteBansModule_162 LiteBansModule_31() {
        return c;
    }

    static {
        LiteBansModule_144.c();
        e = new LiteBansModule_329(null);
        c = ProxyConnection.BaseCoreGenericHandler(LiteBansModule_144::BaseCoreGenericHandler);
    }

    private static final void c() {
        AsyncBackgroundTask_5 = new String[]{"", "", "1 ", "2 ", "3 "};
    }
}

