package litebans;

static final class AcceptHandler
implements LiteBansModule_178 {
    final /* synthetic */ SQLiteDriverHandler_5 LiteBansModule_31;
    AcceptHandler(SQLiteDriverHandler_5 jr_02) {
        this.LiteBansModule_31 = jr_02;
    }

    public final String BaseCoreGenericHandler(BansHandler_2 kL2) {
        Object object = kL2;
        String string = SQLiteDriverHandler.e("ALTER TABLE " + object);
        object = this.LiteBansModule_31;
        String string2 = "accept";
        String string3 = " DEFAULT 0";
        String string4 = ((SQLiteDriverHandler_5)object).LiteBansModule_31().BaseCoreGenericHandler();
        return SQLiteDriverHandler.LiteBansModule_194(string, ObjectUtilities.BaseCoreGenericHandler((Object)string4, (Object)"pgsql") || ObjectUtilities.BaseCoreGenericHandler((Object)string4, (Object)"LiteBansModule_243") ? string2 + " SMALLINT NOT NULL" + string3 : string2 + " TINYINT" + ((SQLiteDriverHandler_5)object).LiteBansModule_31().e() + " NOT NULL" + string3);
    }

    @Override
    public Object BaseCoreGenericHandler(Object object) {
        return SQLiteDriverHandler.AsyncBackgroundTask_5(this.plugin((BansHandler_2)object));
    }

    private static final void BaseCoreGenericHandler() {
        BaseCoreGenericHandler = new String[]{"ALTER TABLE ", "accept", " DEFAULT 0", "pgsql", "LiteBansModule_243", " SMALLINT NOT NULL", " TINYINT", " NOT NULL"};
}

