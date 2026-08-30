package litebans;

static final class TemplateHandler
implements LiteBansModule_179 {
    final /* synthetic */ SQLiteDriverHandler_5 BaseCoreGenericHandler;
        TemplateHandler(SQLiteDriverHandler_5 jr_02) {
        this.plugin = jr_02;
    }

    public final String BaseCoreGenericHandler(BansHandler_2 kL2) {
        Object targetObj = kL2;
        String string = SQLiteDriverHandler.e("ALTER TABLE " + targetObj);
        targetObj = this.plugin;
        String string2 = "template";
        String string3 = " DEFAULT 255";
        String string4 = ((SQLiteDriverHandler_5)targetObj).LiteBansModule_31().BaseCoreGenericHandler();
        return SQLiteDriverHandler.LiteBansModule_195(string, ObjectUtilities.BaseCoreGenericHandler((Object)string4, (Object)"pgsql") || ObjectUtilities.BaseCoreGenericHandler((Object)string4, (Object)"LiteBansModule_244") ? string2 + " SMALLINT NOT NULL" + string3 : string2 + " TINYINT" + ((SQLiteDriverHandler_5)targetObj).LiteBansModule_31().e() + " NOT NULL" + string3);
    }

    @Override
    public Object BaseCoreGenericHandler(Object targetObj) {
        return SQLiteDriverHandler.AsyncBackgroundTask_5(this.plugin((BansHandler_2)targetObj));
    }

    private static final void BaseCoreGenericHandler() {
        LiteBansModule_31 = new String[]{"ALTER TABLE ", "template", " DEFAULT 255", "pgsql", "LiteBansModule_244", " SMALLINT NOT NULL", " TINYINT", " NOT NULL"};
    }

    static {
        TemplateHandler.BaseCoreGenericHandler();
    }
}

