package litebans;

static final class LiteBansModule_406
implements LiteBansModule_178 {
    public static final LiteBansModule_406 BaseCoreGenericHandler;
    LiteBansModule_406() {
    }

    public final String BaseCoreGenericHandler(BansHandler_2 kL2) {
        BansHandler_2 kL3 = kL2;
        return SQLiteDriverHandler.LiteBansModule_194(SQLiteDriverHandler.e("ALTER TABLE " + kL3), "removed_by_date TIMESTAMP");
    }

    @Override
    public Object BaseCoreGenericHandler(Object targetObj) {
        return SQLiteDriverHandler.AsyncBackgroundTask_5(this.plugintargetObj);
    }

    static {
        LiteBansModule_406.BaseCoreGenericHandler();
        BaseCoreGenericHandler = new LiteBansModule_406();
}

