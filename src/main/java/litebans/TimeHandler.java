package litebans;

public final class TimeHandler
extends DescHandler {
    final /* synthetic */ LiteBansModule_145 n;
        TimeHandler(SQLiteDriverHandler_3 gZ2, boolean flag, int n, LiteBansModule_145 dy_02, String string, UuidHandler jR2, AllHandler jJ2) {
        this.n = dy_02;
        super(gZ2, string, jR2, flag, jJ2, "time", false, n, null, 320, null);
    }

    @Override
    public void e() {
        this.plugin(SQLiteDriverHandler_3.LiteBansModule_403.BaseCoreGenericHandler(this.plugin(), (LiteBansModule_179)this.n.BaseCoreGenericHandler));
    }

    private static final void BaseCoreGenericHandler() {
        m = new String[]{"time"};
    }

    static {
        TimeHandler.BaseCoreGenericHandler();
    }
}

