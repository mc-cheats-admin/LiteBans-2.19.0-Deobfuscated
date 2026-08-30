package litebans;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.ProtocolLibrary;
import com.comphenix.protocol.ProtocolManager;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.WrappedChatComponent;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ModulePriority(priority=0)
public final class LiteBansModule_140 {
    public static final LiteBansModule_140 LiteBansModule_31;
        private LiteBansModule_140() {
    }

    public final void BaseCoreGenericHandler(@Nullable Object targetObj, @NotNull String string) {
        PacketContainer packetContainer = new PacketContainer(PacketType.Play.Server.KICK_DISCONNECT);
        packetContainer.getChatComponents().write(0, (Object)WrappedChatComponent.fromJson((String)string));
        ProtocolManager protocolManager = ProtocolLibrary.getProtocolManager();
        ObjectUtilities.LiteBansModule_31(targetObj, "");
        protocolManager.sendServerPacket((Player)targetObj, packetContainer);
    }

    public final boolean LiteBansModule_31() {
        return ProtocolLibrary.getProtocolManager() == null;
    }

    static {
        LiteBansModule_140.BaseCoreGenericHandler();
        LiteBansModule_31 = new LiteBansModule_140();
    }

    private static final void BaseCoreGenericHandler() {
        BaseCoreGenericHandler = new String[]{""};
    }
}

