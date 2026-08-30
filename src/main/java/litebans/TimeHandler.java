package litebans;

public final class TimeHandler
extends DescHandler {
    final /* synthetic */ LiteBansModule_144 n;
    TimeHandler(SQLiteDriverHandler_3 gZ2, boolean flag, int n, LiteBansModule_144 dy_02, String string, UuidHandler jR2, AllHandler jJ2) {
        this.n = dy_02;
        super(gZ2, string, jR2, flag, jJ2, "time", false, n, null, 320, null);
    }

    @Override
    public void e() {
        this.plugin(SQLiteDriverHandler_3.LiteBansModule_401.BaseCoreGenericHandler(this.plugin(), (LiteBansModule_178)this.n.BaseCoreGenericHandler));
    }

    private static final void BaseCoreGenericHandler() {
        m = new String[]{"time"};
    }

    }

