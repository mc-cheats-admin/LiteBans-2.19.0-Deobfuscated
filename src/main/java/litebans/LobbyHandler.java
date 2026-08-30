package litebans;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collection;
import net.md_5.bungee.api.Callback;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.config.ServerInfo;

public final class LobbyHandler
implements ServerInfo {
        public String getName() {
        return "lobby";
    }

    public InetSocketAddress getAddress() {
        AssertionUtilities.BaseCoreGenericHandler();
        throw new CommandExitException();
    }

    public SocketAddress getSocketAddress() {
        AssertionUtilities.BaseCoreGenericHandler();
        throw new CommandExitException();
    }

    public Collection getPlayers() {
        return new ArrayList();
    }

    public String getMotd() {
        AssertionUtilities.BaseCoreGenericHandler();
        throw new CommandExitException();
    }

    public boolean isRestricted() {
        return false;
    }

    public String getPermission() {
        return "";
    }

    public boolean canAccess(CommandSender commandSender) {
        return true;
    }

    public void sendData(String string, byte[] byArray) {
    }

    public boolean sendData(String string, byte[] byArray, boolean flag) {
        AssertionUtilities.BaseCoreGenericHandler();
        throw new CommandExitException();
    }

    public void ping(Callback callback) {
    }

    private static final void BaseCoreGenericHandler() {
        BaseCoreGenericHandler = new String[]{"lobby", ""};
    }

    static {
        LobbyHandler.BaseCoreGenericHandler();
    }
}

