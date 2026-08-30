package litebans;

import com.velocitypowered.api.command.Command;
import com.velocitypowered.api.command.CommandManager;
import litebans.VelocityPlugin;
import litebans.a_0;
import litebans.ai_0;
import litebans.bm_0;
import litebans.d8;
import litebans.di_0;

/*
 * Renamed from litebans.H
 */
@ai_0(a=2)
public static class h_0
extends a_0 {
    public h_0(di_0 di_02) {
        super(di_02);
    }

    @Override
    public boolean d() {
        return this.a.t() == 2;
    }

    @Override
    public void e() {
    }

    @Override
    public void a() {
        super.a();
        for (d8 d82 : this.e()) {
            this.b(new bm_0(d82, d82.getPermission(), this.a, d82.getAliases()));
        }
    }

    public void b(d8 d82) {
        VelocityPlugin velocityPlugin = (VelocityPlugin)this.a;
        CommandManager commandManager = velocityPlugin.c.getCommandManager();
        commandManager.register(d82.getName(), (Command)((bm_0)d82), d82.getAliases());
    }
}

