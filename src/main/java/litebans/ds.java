package litebans;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketAdapter;
import com.comphenix.protocol.events.PacketEvent;
import com.comphenix.protocol.utility.MinecraftVersion;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import litebans.al_0;
import litebans.ao_0;
import litebans.bN;
import litebans.di_0;
import litebans.eE;
import litebans.ec_0;
import litebans.ew;
import litebans.hl;
import litebans.kc;
import litebans.o;
import litebans.p;
import litebans.q_0;
import litebans.w;
import org.bukkit.plugin.Plugin;
import org.jetbrains.annotations.NotNull;

public static final class ds
extends PacketAdapter {
    public static final kc b;
    private final di_0 i;
    private final p f;
    private final o a;
    private final q_0 g;
    private final w d;
    private static final eE c;
    private static final eE e;
    private static /* synthetic */ String[] h;

    public ds(@NotNull di_0 di_02) {
        PacketType[] packetTypeArray;
        ec_0 ec_02 = di_02.i();
        ew.b(ec_02, h[0]);
        kc kc2 = b;
        Object[] objectArray = new Object[]{kc.b(b), kc.a(b)};
        Plugin plugin = ao_0.a((ao_0)ec_02, null, 1, null);
        ds ds2 = this;
        boolean bl = false;
        Object object = objectArray;
        boolean bl2 = false;
        Object[] objectArray2 = object;
        Collection collection = new ArrayList();
        boolean bl3 = false;
        Object[] objectArray3 = objectArray2;
        boolean bl4 = false;
        int n = objectArray3.length;
        for (int i = 0; i < n; ++i) {
            PacketType packetType;
            Object object2;
            Object object3 = object2 = objectArray3[i];
            boolean bl5 = false;
            Object object4 = object3;
            boolean bl6 = false;
            if ((object4 instanceof PacketType ? (PacketType)object4 : null) == null) continue;
            packetType = packetType;
            boolean bl7 = false;
            collection.add(packetType);
        }
        object = (List)collection;
        bl2 = false;
        objectArray2 = object;
        PacketType[] packetTypeArray2 = packetTypeArray = objectArray2.toArray(new PacketType[0]);
        super(PacketAdapter.params((Plugin)plugin, (PacketType[])Arrays.copyOf(packetTypeArray2, packetTypeArray2.length)).optionAsync());
        this.i = di_02;
        this.f = (p)this.i.a(p.class);
        this.a = (o)this.i.a(o.class);
        this.g = (q_0)this.i.a(q_0.class);
        this.d = (w)this.i.a(w.class);
    }

    public void onPacketReceiving(@NotNull PacketEvent packetEvent) {
        PacketType packetType = packetEvent.getPacketType();
        if (packetEvent.isCancelled() || al_0.a(packetEvent.getPlayer()) || al_0.c(packetEvent.getPlayer()) >= 759 && !ew.a((Object)packetType, kc.a(b))) {
            return;
        }
        String string = (ew.a((Object)packetType, kc.a(b)) ? h[1] : h[2]) + this.a(packetEvent);
        boolean bl = kc.a(b) != null && !ew.a((Object)packetType, kc.a(b));
        this.f.a().a((Object)packetEvent, string, this.i.a(packetEvent.getPlayer()), bl);
    }

    public final String a(@NotNull PacketEvent packetEvent) {
        String string = (String)packetEvent.getPacket().getStrings().readSafely(0);
        if (string == null) {
            string = h[3];
        }
        return string;
    }

    private static final PacketType a() {
        PacketType packetType;
        try {
            packetType = PacketType.Play.Client.CHAT;
        }
        catch (Throwable throwable) {
            packetType = null;
        }
        return packetType;
    }

    private static final PacketType c() {
        PacketType packetType;
        try {
            packetType = MinecraftVersion.WILD_UPDATE.atOrAbove() ? PacketType.Play.Client.CHAT_COMMAND : null;
        }
        catch (Throwable throwable) {
            packetType = null;
        }
        return packetType;
    }

    public static final /* synthetic */ eE e() {
        return c;
    }

    public static final /* synthetic */ eE b() {
        return e;
    }

    static {
        ds.d();
        b = new kc(null);
        c = bN.a(ds::a);
        e = bN.a(ds::c);
    }

    private static final void d() {
        h = new String[]{hl.a("", -1757714363), hl.a("\u520b", 1105941028), hl.a("", -1166116274), hl.a("", 929721943)};
    }
}

