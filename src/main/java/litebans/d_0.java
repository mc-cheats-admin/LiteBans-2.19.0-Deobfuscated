package litebans;

import litebans.a_0;
import litebans.ai_0;
import litebans.d8;
import litebans.di_0;
import litebans.hk_0;
import net.md_5.bungee.api.plugin.Command;
import net.md_5.bungee.api.plugin.Plugin;

/*
 * Renamed from litebans.D
 */
@ai_0(a=1)
public static abstract class d_0
extends a_0 {
    public d_0(di_0 di_02) {
        super(di_02);
    }

    @Override
    public boolean d() {
        return this.a.t() == 1;
    }

    @Override
    public void a() {
        super.a();
        for (d8 d82 : this.e()) {
            this.b(new hk_0(d82, d82.getPermission(), this.a, new String[0]));
        }
    }

    public void b(d8 d82) {
        Plugin plugin = (Plugin)this.a;
        plugin.getProxy().getPluginManager().registerCommand(plugin, (Command)((hk_0)d82));
    }
}

