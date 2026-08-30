package litebans;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketAdapter;
import com.comphenix.protocol.events.PacketContainer;
import com.comphenix.protocol.events.PacketEvent;
import com.comphenix.protocol.wrappers.WrappedChatComponent;
import java.util.Arrays;
import litebans.al_0;
import litebans.ao_0;
import litebans.bN;
import litebans.bz;
import litebans.cV;
import litebans.di_0;
import litebans.eE;
import litebans.ec_0;
import litebans.ew;
import litebans.hd_0;
import litebans.hl;
import litebans.j1;
import litebans.q_0;
import litebans.v_0;
import litebans.w_0;
import org.bukkit.plugin.Plugin;
import org.jetbrains.annotations.NotNull;

public static final class dX
extends PacketAdapter {
    public static final j1 e;
    private final di_0 a;
    private final q_0 b;
    private static final eE c;
    private static /* synthetic */ String[] d;

    public dX(@NotNull di_0 di_02) {
        ec_0 ec_02 = di_02.i();
        ew.b(ec_02, d[0]);
        Plugin plugin = ao_0.a((ao_0)ec_02, null, 1, null);
        PacketType[] packetTypeArray = new PacketType[1];
        ew.b(j1.a(e), d[1]);
        super(PacketAdapter.params((Plugin)plugin, (PacketType[])packetTypeArray).optionAsync());
        this.a = di_02;
        this.b = (q_0)this.a.a(q_0.class);
    }

    public void onPacketSending(@NotNull PacketEvent packetEvent) {
        try {
            boolean bl;
            boolean bl2;
            Object object;
            if (al_0.b(packetEvent.getPlayer())) {
                return;
            }
            PacketContainer packetContainer = packetEvent.getPacket();
            WrappedChatComponent wrappedChatComponent = (WrappedChatComponent)packetContainer.getChatComponents().read(0);
            Object object2 = this.b;
            boolean bl3 = false;
            if (((q_0)object2).g()) {
                object = object2;
                bl2 = false;
                WrappedChatComponent wrappedChatComponent2 = wrappedChatComponent;
                ((q_0)object).a((Object)(d[2] + (wrappedChatComponent2 != null ? wrappedChatComponent2.getJson() : null)));
            }
            Object object3 = cV.a(wrappedChatComponent.getJson());
            object2 = w_0.a(Arrays.copyOf(object3, ((v_0[])object3).length));
            object3 = this.b;
            bl2 = false;
            if (((q_0)object3).g()) {
                object = object3;
                bl = false;
                ((q_0)object).a((Object)(d[3] + (String)object2));
            }
            ew.a(object2);
            if (bz.a((CharSequence)object2, hd_0.t, false, 2, null)) {
                Object object4 = w_0.a((String)object2);
                object3 = WrappedChatComponent.fromJson((String)cV.a(Arrays.copyOf(object4, ((v_0[])object4).length)));
                object4 = this.b;
                bl = false;
                if (((q_0)object4).g()) {
                    object = object4;
                    boolean bl4 = false;
                    ((q_0)object).a((Object)(d[4] + object3.getJson()));
                }
                packetContainer.getChatComponents().write(0, object3);
            }
        }
        catch (Throwable throwable) {
            q_0.a(this.b, throwable, 0, 2, null);
            al_0.b(this.b, (Object)this);
        }
    }

    private static final PacketType a() {
        PacketType packetType;
        try {
            packetType = PacketType.Login.Server.DISCONNECT;
        }
        catch (Throwable throwable) {
            packetType = null;
        }
        return packetType;
    }

    public static final /* synthetic */ eE b() {
        return c;
    }

    static {
        dX.c();
        e = new j1(null);
        c = bN.a(dX::a);
    }

    private static final void c() {
        d = new String[]{hl.a("", -1349291380), hl.a("", -1075930566), hl.a("\u68af\u68be", 1793681566), hl.a("\uf856\uf844", 611580004), hl.a("\u38bb\u38a8", 2073770120)};
    }
}

