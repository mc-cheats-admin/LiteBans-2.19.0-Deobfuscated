package litebans;

import java.util.Collection;
import litebans.BungeePlugin;
import litebans.ai_0;
import litebans.di_0;
import litebans.j_0;
import litebans.jv_0;
import net.md_5.bungee.api.connection.ProxiedPlayer;

@ai_0(a=1)
public class l_0
extends j_0 {
    public l_0(di_0 di_02) {
        super(di_02);
    }

    @Override
    public int b() {
        Collection collection = this.a();
        return collection.size();
    }

    private final Collection a() {
        return ((BungeePlugin)this.a).getProxy().getPlayers();
    }

    @Override
    public jv_0[] a() {
        di_0 di_02 = this.a;
        Collection collection = this.a();
        if (collection.isEmpty()) {
            return jv_0.a;
        }
        jv_0[] jv_0Array = new jv_0[collection.size()];
        int n = 0;
        for (ProxiedPlayer proxiedPlayer : collection) {
            jv_0Array[n++] = di_02.a(proxiedPlayer);
        }
        return jv_0Array;
    }
}

