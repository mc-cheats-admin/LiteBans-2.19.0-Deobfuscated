package litebans;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import litebans.be_0;
import litebans.di_0;
import litebans.eI;
import litebans.fg_0;
import litebans.gu;
import litebans.hd_0;
import litebans.hl;
import litebans.hu_0;
import litebans.i1;
import litebans.i5;
import litebans.iX;
import litebans.jv_0;
import litebans.k_;
import litebans.kq_0;
import litebans.o;
import litebans.q_0;
import net.md_5.bungee.api.config.ServerInfo;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.event.ServerConnectEvent;
import org.jetbrains.annotations.NotNull;

public final class ga_0
extends fg_0 {
    private final String[] d;
    private static /* synthetic */ String[] e;

    public ga_0(@NotNull String[] stringArray, @NotNull di_0 di_02) {
        super(di_02);
        this.d = stringArray;
    }

    @Override
    public void run() {
        int n;
        int n2;
        int n3;
        jv_0 jv_02 = this.d();
        iX iX2 = new iX(0L, 1, null);
        int n4 = kq_0.a(this.d, 1, 512);
        int n5 = kq_0.a(this.d, 2, 4096);
        int n6 = kq_0.a(this.d, 3, 6);
        Object object = this;
        int n7 = 0;
        ServerInfo serverInfo = new k_();
        object = new ArrayList(n4);
        for (n7 = 0; n7 < n4; ++n7) {
            UUID uUID = new UUID(iX2.b(), iX2.b());
            int n8 = iX2.a(252) + 2;
            n3 = iX2.a(252) + 2;
            n2 = iX2.a(252) + 2;
            n = iX2.a(252) + 2;
            String string = "" + n8 + '.' + n3 + '.' + n2 + '.' + n;
            String string2 = String.valueOf(iX2.a(999999999));
            ga_0 ga_02 = this;
            boolean bl = false;
            object.add((jv_0)new be_0(string2, string, uUID));
        }
        Object object2 = this;
        boolean bl = false;
        ((q_0)((fg_0)object2).h().a(q_0.class)).a((byte)0);
        object2 = new eI(1, n6);
        bl = false;
        Iterator iterator = object2.iterator();
        while (iterator.hasNext()) {
            n2 = n3 = ((i5)iterator).b();
            n = 0;
            this.h().b(() -> ga_0.a(jv_02, n5, (List)object, iX2, this, serverInfo));
        }
    }

    private static final void a(jv_0 jv_02, int n, List list, iX iX2, ga_0 ga_02, ServerInfo serverInfo) {
        boolean bl = false;
        long l3 = System.nanoTime();
        boolean bl2 = false;
        Iterable iterable = new eI(1, n);
        boolean bl3 = false;
        Iterator iterator = iterable.iterator();
        while (iterator.hasNext()) {
            int n2;
            int n3 = n2 = ((i5)iterator).b();
            boolean bl4 = false;
            jv_0 jv_03 = (jv_0)list.get(iX2.a(list.size()));
            fg_0 fg_02 = ga_02;
            boolean bl5 = false;
            gu gu2 = ((o)fg_02.h().a(o.class)).c();
            fg_02 = ga_02;
            bl5 = false;
            gu2.b(new ServerConnectEvent((ProxiedPlayer)new hu_0(jv_03, serverInfo), serverInfo, ServerConnectEvent.Reason.PLUGIN, null));
        }
        long l5 = System.nanoTime() - l3;
        jv_02.a(hd_0.i + " -> " + hd_0.m + i1.a((double)l5 / 1000.0 / 1000.0) + ' ' + hd_0.i + "ms to process " + n + " ");
    }

    private static final void a() {
        e = new String[]{" -> ", "ms to process ", " events."};
    }

    static {
        ga_0.a();
    }
}

