package litebans;

static final class TemplateHandler
implements LiteBansModule_178 {
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
        String string4 = targetObj.LiteBansModule_31().BaseCoreGenericHandler();
        return SQLiteDriverHandler.LiteBansModule_194(string, ObjectUtilities.BaseCoreGenericHandler(string4, (Object)"pgsql") || ObjectUtilities.BaseCoreGenericHandler(string4, (Object)"LiteBansModule_243") ? string2 + " SMALLINT NOT NULL" + string3 : string2 + " TINYINT" + targetObj.LiteBansModule_31().e() + " NOT NULL" + string3);
    }

    @Override
    public Object BaseCoreGenericHandler(Object targetObj) {
        return SQLiteDriverHandler.AsyncBackgroundTask_5(this.plugintargetObj);
}

