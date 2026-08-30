package litebans;

static final class LiteBansModule_163
implements LiteBansModule_179 {
    public static final LiteBansModule_163 LiteBansModule_31;
        LiteBansModule_163() {
    }

    public final String BaseCoreGenericHandler(BansHandler_2 kL2) {
        BansHandler_2 kL3 = kL2;
        return SQLiteDriverHandler.LiteBansModule_195(SQLiteDriverHandler.e("ALTER TABLE " + kL3), "removed_by_reason VARCHAR(2048)");
    }

    @Override
    public Object BaseCoreGenericHandler(Object targetObj) {
        return SQLiteDriverHandler.AsyncBackgroundTask_5(this.plugin((BansHandler_2)targetObj));
    }

    static {
        LiteBansModule_163.BaseCoreGenericHandler();
        LiteBansModule_31 = new LiteBansModule_163();
    }

    private static final void BaseCoreGenericHandler() {
        BaseCoreGenericHandler = new String[]{"ALTER TABLE ", "removed_by_reason VARCHAR(2048)"};
    }
}

