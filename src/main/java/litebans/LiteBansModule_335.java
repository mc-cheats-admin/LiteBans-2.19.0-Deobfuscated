package litebans;

static final class LiteBansModule_335
implements LiteBansModule_178 {
    public static final LiteBansModule_335 LiteBansModule_31;
    LiteBansModule_335() {
    }

    public final String BaseCoreGenericHandler(BansHandler_2 kL2) {
        BansHandler_2 kL3 = kL2;
        return SQLiteDriverHandler.LiteBansModule_194(SQLiteDriverHandler.e("ALTER TABLE " + kL3), "removed_by_name VARCHAR(128)");
    }

    @Override
    public Object BaseCoreGenericHandler(Object object) {
        return SQLiteDriverHandler.AsyncBackgroundTask_5(this.plugin((BansHandler_2)object));
    }

    static {
        LiteBansModule_335.BaseCoreGenericHandler();
        LiteBansModule_31 = new LiteBansModule_335();
    }

    private static final void BaseCoreGenericHandler() {
        BaseCoreGenericHandler = new String[]{"ALTER TABLE ", "removed_by_name VARCHAR(128)"};
}

