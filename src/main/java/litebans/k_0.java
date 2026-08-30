package litebans;

import java.util.ArrayList;
import java.util.Collection;
import litebans.BukkitPlugin;
import litebans.ai_0;
import litebans.di_0;
import litebans.j_0;
import litebans.jv_0;
import org.bukkit.entity.Player;

/*
 * Renamed from litebans.K
 */
@ai_0(a=0)
public static class k_0
extends j_0 {
    public k_0(di_0 di_02) {
        super(di_02);
    }

    @Override
    public int b() {
        Collection collection = ((BukkitPlugin)this.a).getServer().getOnlinePlayers();
        return collection.size();
    }

    @Override
    public jv_0[] a() {
        Collection collection = ((BukkitPlugin)this.a).getServer().getOnlinePlayers();
        if (collection.isEmpty()) {
            return jv_0.a;
        }
        int n = collection.size();
        ArrayList<jv_0> arrayList = new ArrayList<jv_0>(n);
        for (Player player : collection) {
            arrayList.add(this.a.a(player));
        }
        return arrayList.toArray(jv_0.a);
    }
}

