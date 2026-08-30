package litebans;

import litebans.di_0;
import litebans.em_0;
import litebans.ew;
import litebans.f8;
import litebans.ly_0;
import litebans.p;
import net.md_5.bungee.api.connection.Connection;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.event.ChatEvent;
import net.md_5.bungee.event.EventHandler;
import org.jetbrains.annotations.NotNull;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public static final class kX
implements ly_0 {
    private final di_0 a;
    private final p b;

    public kX(@NotNull di_0 di_02) {
        this.a = di_02;
        this.b = (p)this.a.a(p.class);
    }

    public final di_0 a() {
        return this.a;
    }

    @EventHandler(priority=-32)
    public final void a(@NotNull ChatEvent chatEvent) {
        if (chatEvent.isCancelled()) {
            return;
        }
        Connection connection = chatEvent.getSender();
        ProxiedPlayer proxiedPlayer = connection instanceof ProxiedPlayer ? (ProxiedPlayer)connection : null;
        if (proxiedPlayer == null) {
            return;
        }
        ProxiedPlayer proxiedPlayer2 = proxiedPlayer;
        String string = chatEvent.getMessage();
        f8 f82 = this.b.a();
        ew.a((Object)string);
        f8.a(f82, chatEvent, string, this.a.a(proxiedPlayer2), false, 8, null);
    }

    public kX b() {
        kX kX2;
        kX kX3 = kX2 = this;
        boolean bl = false;
        em_0[] em_0Array = new em_0[]{kX3};
        kX3.a.b(em_0Array);
        return kX2;
    }

    @Override
    public em_0 a() {
        return this.b();
    }
}

