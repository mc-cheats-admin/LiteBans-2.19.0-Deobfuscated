package litebans;

import litebans.a_;
import litebans.di_0;
import litebans.fh_0;
import litebans.hl;
import org.jetbrains.annotations.NotNull;

public final class fq
extends fh_0 {
    private static /* synthetic */ String[] j;

    public fq(@NotNull di_0 di_02) {
        super(di_02);
    }

    @Override
    public a_ a() {
        return a_.c;
    }

    @Override
    public String getName() {
        return "warnlist";
    }

    private static final void a() {
        j = new String[]{"warnlist"};
    }

    static {
        fq.a();
    }
}

