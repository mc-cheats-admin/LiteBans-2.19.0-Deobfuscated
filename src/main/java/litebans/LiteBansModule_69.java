package litebans;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import net.md_5.bungee.api.chat.BaseComponent;
import net.md_5.bungee.api.config.ServerInfo;
import net.md_5.bungee.api.connection.Connection;
import net.md_5.bungee.api.connection.Server;

public final class LiteBansModule_69
implements Server {
    final /* synthetic */ ServerInfo BaseCoreGenericHandler;

    public LiteBansModule_69(ServerInfo serverInfo) {
        this.plugin = serverInfo;
    }

    public InetSocketAddress getAddress() {
        AssertionUtilities.BaseCoreGenericHandler();
        throw new CommandExitException();
    }

    public SocketAddress getSocketAddress() {
        AssertionUtilities.BaseCoreGenericHandler();
        throw new CommandExitException();
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
        AssertionUtilities.BaseCoreGenericHandler();
        throw new CommandExitException();
    }

    public ServerInfo getInfo() {
        return this.plugin;
    }

    public void sendData(String string, byte[] byArray) {
}

