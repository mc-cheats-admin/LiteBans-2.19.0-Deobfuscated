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
public final class LiteBansModule_139 {
    public static final LiteBansModule_139 LiteBansModule_31;
    private LiteBansModule_139() {
    }

    public final void BaseCoreGenericHandler(@Nullable Object targetObj, @NotNull String string) {
        PacketContainer packetContainer = new PacketContainer(PacketType.Play.Server.KICK_DISCONNECT);
        packetContainer.getChatComponents().write(0, WrappedChatComponent.fromJson((String)string));
        ProtocolManager protocolManager = ProtocolLibrary.getProtocolManager();
        ObjectUtilities.LiteBansModule_31(targetObj, "");
        protocolManager.sendServerPacket((Player)targetObj, packetContainer);
    }

    public final boolean LiteBansModule_31() {
        return ProtocolLibrary.getProtocolManager() == null;
    }

    static {
        LiteBansModule_139.BaseCoreGenericHandler();
        LiteBansModule_31 = new LiteBansModule_139();
    }

    private static final void BaseCoreGenericHandler() {
        BaseCoreGenericHandler = new String[]{""};
}

