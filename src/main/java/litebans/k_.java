package litebans;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collection;
import litebans.as;
import litebans.hl;
import litebans.x_0;
import net.md_5.bungee.api.Callback;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.config.ServerInfo;

public static final class k_
implements ServerInfo {
    private static /* synthetic */ String[] a;

    public String getName() {
        return a[0];
    }

    public InetSocketAddress getAddress() {
        x_0.a();
        throw new as();
    }

    public SocketAddress getSocketAddress() {
        x_0.a();
        throw new as();
    }

    public Collection getPlayers() {
        return new ArrayList();
    }

    public String getMotd() {
        x_0.a();
        throw new as();
    }

    public boolean isRestricted() {
        return false;
    }

    public String getPermission() {
        return a[1];
    }

    public boolean canAccess(CommandSender commandSender) {
        return true;
    }

    public void sendData(String string, byte[] byArray) {
    }

    public boolean sendData(String string, byte[] byArray, boolean bl) {
        x_0.a();
        throw new as();
    }

    public void ping(Callback callback) {
    }

    private static final void a() {
        a = new String[]{hl.a("\u4a2f\u4a2c\u4a21\u4a21\u4a3a", -1712436669), hl.a("", 1905430262)};
    }

    static {
        k_.a();
    }
}

