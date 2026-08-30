package litebans;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.ProtocolLibrary;
import com.comphenix.protocol.ProtocolManager;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.wrappers.WrappedChatComponent;
import litebans.ai_0;
import litebans.ew;
import litebans.hl;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from litebans.du
 */
@ai_0(a=0)
public static final class du_0 {
    public static final du_0 b;
    private static /* synthetic */ String[] a;

    private du_0() {
    }

    public final void a(@Nullable Object object, @NotNull String string) {
        PacketContainer packetContainer = new PacketContainer(PacketType.Play.Server.KICK_DISCONNECT);
        packetContainer.getChatComponents().write(0, (Object)WrappedChatComponent.fromJson((String)string));
        ProtocolManager protocolManager = ProtocolLibrary.getProtocolManager();
        ew.b(object, a[0]);
        protocolManager.sendServerPacket((Player)object, packetContainer);
    }

    public final boolean b() {
        return ProtocolLibrary.getProtocolManager() == null;
    }

    static {
        du_0.a();
        b = new du_0();
    }

    private static final void a() {
        a = new String[]{hl.a("", -638032155)};
    }
}

