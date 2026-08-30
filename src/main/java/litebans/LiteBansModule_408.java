package litebans;

static final class LiteBansModule_408
implements LiteBansModule_179 {
    public static final LiteBansModule_408 BaseCoreGenericHandler;
        LiteBansModule_408() {
    }

    public final String BaseCoreGenericHandler(BansHandler_2 kL2) {
        BansHandler_2 kL3 = kL2;
        return SQLiteDriverHandler.LiteBansModule_195(SQLiteDriverHandler.e("ALTER TABLE " + kL3), "removed_by_date TIMESTAMP");
    }

    @Override
    public Object BaseCoreGenericHandler(Object targetObj) {
        return SQLiteDriverHandler.AsyncBackgroundTask_5(this.plugin((BansHandler_2)targetObj));
    }

    static {
        LiteBansModule_408.BaseCoreGenericHandler();
        BaseCoreGenericHandler = new LiteBansModule_408();
    }

    private static final void BaseCoreGenericHandler() {
        LiteBansModule_31 = new String[]{"ALTER TABLE ", "removed_by_date TIMESTAMP"};
    }
}

