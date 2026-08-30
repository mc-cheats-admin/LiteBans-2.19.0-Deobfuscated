package litebans;

static final class AcceptHandler
implements LiteBansModule_179 {
    final /* synthetic */ SQLiteDriverHandler_5 LiteBansModule_31;
        AcceptHandler(SQLiteDriverHandler_5 jr_02) {
        this.LiteBansModule_31 = jr_02;
    }

    public final String BaseCoreGenericHandler(BansHandler_2 kL2) {
        Object targetObj = kL2;
        String string = SQLiteDriverHandler.e("ALTER TABLE " + targetObj);
        targetObj = this.LiteBansModule_31;
        String string2 = "accept";
        String string3 = " DEFAULT 0";
        String string4 = ((SQLiteDriverHandler_5)targetObj).LiteBansModule_31().BaseCoreGenericHandler();
        return SQLiteDriverHandler.LiteBansModule_195(string, ObjectUtilities.BaseCoreGenericHandler((Object)string4, (Object)"pgsql") || ObjectUtilities.BaseCoreGenericHandler((Object)string4, (Object)"LiteBansModule_244") ? string2 + " SMALLINT NOT NULL" + string3 : string2 + " TINYINT" + ((SQLiteDriverHandler_5)targetObj).LiteBansModule_31().e() + " NOT NULL" + string3);
    }

    @Override
    public Object BaseCoreGenericHandler(Object targetObj) {
        return SQLiteDriverHandler.AsyncBackgroundTask_5(this.plugin((BansHandler_2)targetObj));
    }

    private static final void BaseCoreGenericHandler() {
        BaseCoreGenericHandler = new String[]{"ALTER TABLE ", "accept", " DEFAULT 0", "pgsql", "LiteBansModule_244", " SMALLINT NOT NULL", " TINYINT", " NOT NULL"};
    }

    static {
        AcceptHandler.BaseCoreGenericHandler();
    }
}

