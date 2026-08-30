package litebans;

import java.util.concurrent.Executor;
import litebans.dI;
import litebans.hI;
import litebans.kI;

static class e9
implements Executor {
    private e9() {
    }

    @Override
    public void execute(Runnable runnable) {
        try {
            runnable.run();
        }
        catch (Exception exception) {
            kI.a(dI.class).b("Failed to execute: %s", new Object[]{runnable.toString(), exception});
        }
    }

    /* synthetic */ e9(hI hI2) {
        this();
    }
}

