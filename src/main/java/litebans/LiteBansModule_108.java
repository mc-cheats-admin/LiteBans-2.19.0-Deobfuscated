package litebans;

static final class LiteBansModule_108
implements LiteBansModule_179 {
    public static final LiteBansModule_108 BaseCoreGenericHandler;
        LiteBansModule_108() {
    }

    public final String BaseCoreGenericHandler(BansHandler_2 kL2) {
        BansHandler_2 kL3 = kL2;
        return SQLiteDriverHandler.LiteBansModule_195(SQLiteDriverHandler.e("ALTER TABLE " + kL3), "removed_by_uuid VARCHAR(36)");
    }

    @Override
    public Object BaseCoreGenericHandler(Object targetObj) {
        return SQLiteDriverHandler.AsyncBackgroundTask_5(this.plugin((BansHandler_2)targetObj));
    }

    static {
        LiteBansModule_108.BaseCoreGenericHandler();
        BaseCoreGenericHandler = new LiteBansModule_108();
    }

    private static final void BaseCoreGenericHandler() {
        LiteBansModule_31 = new String[]{"ALTER TABLE ", "removed_by_uuid VARCHAR(36)"};
    }
}

