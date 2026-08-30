package litebans;

static final class LiteBansModule_107
implements LiteBansModule_178 {
    public static final LiteBansModule_107 BaseCoreGenericHandler;
    LiteBansModule_107() {
    }

    public final String BaseCoreGenericHandler(BansHandler_2 kL2) {
        BansHandler_2 kL3 = kL2;
        return SQLiteDriverHandler.LiteBansModule_194(SQLiteDriverHandler.e("ALTER TABLE " + kL3), "removed_by_uuid VARCHAR(36)");
    }

    @Override
    public Object BaseCoreGenericHandler(Object object) {
        return SQLiteDriverHandler.AsyncBackgroundTask_5(this.plugin((BansHandler_2)object));
    }

    static {
        LiteBansModule_107.BaseCoreGenericHandler();
        BaseCoreGenericHandler = new LiteBansModule_107();
}

