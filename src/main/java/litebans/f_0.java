package litebans;

import com.mojang.brigadier.CommandDispatcher;
import litebans.FabricPlugin;
import litebans.a_0;
import litebans.ai_0;
import litebans.d8;
import litebans.di_0;
import litebans.jq_0;

@ai_0(a=3)
public class f_0
extends a_0 {
    public f_0(di_0 di_02) {
        super(di_02);
    }

    @Override
    public boolean d() {
        return this.a.t() == 3;
    }

    @Override
    public void e() {
    }

    @Override
    public void a() {
        super.a();
        ((FabricPlugin)this.a).g().a((T object) -> {
            for (d8 d82 : this.e()) {
                this.a(new jq_0(d82, d82.getPermission(), this.a, d82.getAliases()), (CommandDispatcher)object);
            }
            return Void.TYPE;
        });
    }

    public void a(jq_0 jq_02, CommandDispatcher commandDispatcher) {
        ((FabricPlugin)this.a).g().a(jq_02, commandDispatcher);
    }
}

