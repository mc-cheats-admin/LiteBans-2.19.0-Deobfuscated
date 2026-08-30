package litebans;

import java.io.Closeable;
import java.sql.SQLException;
import java.util.Date;
import java.util.Map;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import litebans.a_;
import litebans.bt_0;
import litebans.ch;
import litebans.dZ;
import litebans.di_0;
import litebans.dl_0;
import litebans.ew;
import litebans.hl;
import litebans.iv_0;
import litebans.kR;
import litebans.w;
import net.minecrell.serverlistplus.core.ServerListPlusCore;
import net.minecrell.serverlistplus.core.player.PlayerIdentity;
import net.minecrell.serverlistplus.core.player.ban.BanProvider;
import net.minecrell.serverlistplus.core.plugin.ServerListPlusPlugin;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public static final class Z
implements BanProvider {
    private final di_0 a;
    private final ThreadLocal c;
    private final AtomicBoolean b;
    private static /* synthetic */ String[] d;

    public Z(@NotNull di_0 di_02) {
        this.a = di_02;
        this.c = new dl_0();
        this.b = new AtomicBoolean();
    }

    public final ThreadLocal b() {
        return this.c;
    }

    public final AtomicBoolean c() {
        return this.b;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final dZ a(@NotNull UUID uUID) {
        dZ dZ2;
        block9: {
            Object object = this;
            boolean bl = false;
            WeakHashMap weakHashMap = (WeakHashMap)((Z)object).b().get();
            object = (w)this.a.a(w.class);
            dZ2 = null;
            Object object2 = object;
            boolean bl2 = false;
            try {
                ch ch2 = ((w)object2).f();
                Closeable closeable = ch2;
                Throwable throwable = null;
                try {
                    Object object3 = (ch)closeable;
                    boolean bl3 = false;
                    ch ch3 = ch2;
                    boolean bl4 = false;
                    dZ dZ3 = dZ2 = kR.a(ch3, uUID.toString(), null, a_.h, ((w)object).u(), false, false, 48, null);
                    boolean bl5 = dZ3 != null ? dZ3.a(uUID.toString(), null, w.a((w)object, false, 1, null)) : false;
                    if (bl5) {
                        ew.a(weakHashMap);
                        Map map = weakHashMap;
                        dZ dZ4 = dZ2;
                        ew.a(dZ4);
                        map.put(uUID, dZ4);
                    } else {
                        dZ2 = null;
                    }
                    object3 = iv_0.a;
                }
                catch (Throwable throwable2) {
                    throwable = throwable2;
                    throw throwable2;
                }
                finally {
                    bt_0.a(closeable, throwable);
                }
            }
            catch (SQLException sQLException) {
                if (((w)object2).b(sQLException)) break block9;
                throw sQLException;
            }
        }
        return dZ2;
    }

    public String getBanReason(@NotNull PlayerIdentity playerIdentity) {
        Z z = this;
        UUID uUID = playerIdentity.getUuid();
        boolean bl = false;
        Z z2 = z;
        boolean bl2 = false;
        dZ dZ2 = (dZ)((WeakHashMap)z2.b().get()).get(uUID);
        Object object = dZ2;
        if (object == null || (object = ((dZ)object).b()) == null) {
            dZ dZ3 = this.a(playerIdentity.getUuid());
            object = dZ3 != null ? dZ3.b() : (CharSequence)d[0];
        }
        return object.toString();
    }

    public boolean isBanned(@NotNull PlayerIdentity playerIdentity) {
        dZ dZ2 = this.a(playerIdentity.getUuid());
        return dZ2 != null;
    }

    public String getBanOperator(@NotNull PlayerIdentity playerIdentity) {
        Object object = this;
        UUID uUID = playerIdentity.getUuid();
        boolean bl = false;
        Z z = object;
        boolean bl2 = false;
        dZ dZ2 = (dZ)((WeakHashMap)z.b().get()).get(uUID);
        if (dZ2 != null) {
            return dZ2.x();
        }
        Object object2 = object = this.a(playerIdentity.getUuid());
        return object2 != null ? ((dZ)object2).x() : null;
    }

    public Date getBanExpiration(@NotNull PlayerIdentity playerIdentity) {
        Object object = this;
        UUID uUID = playerIdentity.getUuid();
        boolean bl = false;
        Z z = object;
        boolean bl2 = false;
        dZ dZ2 = (dZ)((WeakHashMap)z.b().get()).get(uUID);
        if (dZ2 != null) {
            if (dZ2.l() <= 0L) {
                return null;
            }
            return new Date(dZ2.l());
        }
        object = this.a(playerIdentity.getUuid());
        if (object != null) {
            if (((dZ)object).y()) {
                return null;
            }
            return new Date(((dZ)object).l());
        }
        return null;
    }

    public final void a(@Nullable Object object) {
        ew.b(object, d[1]);
        ServerListPlusPlugin serverListPlusPlugin = (ServerListPlusPlugin)object;
        ServerListPlusCore serverListPlusCore = serverListPlusPlugin.getCore();
        if (serverListPlusCore == null) {
            throw new NullPointerException(d[2]);
        }
        ServerListPlusCore serverListPlusCore2 = serverListPlusCore;
        serverListPlusCore2.setBanProvider((BanProvider)this);
        this.a.getLogger().info(d[3]);
    }

    private static final void a() {
        d = new String[]{hl.a("\u9aae\u9ab5\u9aac\u9aac", 272014016), hl.a("", -1079278577), hl.a("\u1484\u1488\u1495\u1482", -1974201113), hl.a("\u6794\u67a3\u67a1\u67af\u67b5\u67b2\u67a3\u67b4\u67a3\u67a2\u67e6\u67a7\u67b5\u67e6\u6795\u67a3\u67b4\u67b0\u67a3\u67b4\u678a\u67af\u67b5\u67b2\u6796\u67aa\u67b3\u67b5\u67e6\u67a4\u67a7\u67a8\u67e6\u67b6\u67b4\u67a9\u67b0\u67af\u67a2\u67a3\u67b4\u67e8", -1613338682)};
    }

    static {
        Z.a();
    }
}

