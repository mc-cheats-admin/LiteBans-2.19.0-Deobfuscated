package litebans;

import java.io.File;
import litebans.bb_0;
import litebans.di_0;
import litebans.gg_0;
import litebans.gn_0;
import litebans.ln;
import litebans.q_0;

public static final class eV
implements ln {
    final /* synthetic */ q_0 b;
    final /* synthetic */ Class a;

    eV(q_0 q_02, Class clazz) {
        this.b = q_02;
        this.a = clazz;
    }

    @Override
    public gn_0 a(di_0 di_02, File file) {
        bb_0 bb_02 = new bb_0(file, this.a);
        return new gg_0(this.b.a, bb_02).c(file);
    }
}

