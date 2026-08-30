package litebans;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import litebans.as;
import litebans.x_0;
import net.md_5.bungee.api.chat.BaseComponent;
import net.md_5.bungee.api.config.ServerInfo;
import net.md_5.bungee.api.connection.Connection;
import net.md_5.bungee.api.connection.Server;

public final class c8
implements Server {
    final /* synthetic */ ServerInfo a;

    public c8(ServerInfo serverInfo) {
        this.a = serverInfo;
    }

    public InetSocketAddress getAddress() {
        x_0.a();
        throw new as();
    }

    public SocketAddress getSocketAddress() {
        x_0.a();
        throw new as();
    }

    public void disconnect(String string) {
    }

    public void disconnect(BaseComponent[] baseComponentArray) {
    }

    public void disconnect(BaseComponent baseComponent) {
    }

    public boolean isConnected() {
        return false;
    }

    public Connection.Unsafe unsafe() {
        x_0.a();
        throw new as();
    }

    public ServerInfo getInfo() {
        return this.a;
    }

    public void sendData(String string, byte[] byArray) {
    }
}

