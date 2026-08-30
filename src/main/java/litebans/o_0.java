package litebans;

import com.velocitypowered.api.proxy.Player;
import java.util.Collection;
import litebans.VelocityPlugin;
import litebans.ai_0;
import litebans.di_0;
import litebans.j_0;
import litebans.jv_0;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from litebans.O
 */
@ai_0(a=2)
public static class o_0
extends j_0 {
    public o_0(di_0 di_02) {
        super(di_02);
    }

    @Override
    public int b() {
        Collection collection = this.a();
        return collection.size();
    }

    private final Collection a() {
        return ((VelocityPlugin)this.a).c.getAllPlayers();
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
        for (Player player : collection) {
            jv_0Array[n++] = di_02.a(player);
        }
        return jv_0Array;
    }
}

