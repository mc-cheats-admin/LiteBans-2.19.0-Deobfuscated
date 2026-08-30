package litebans;

static final class TemplateHandler
implements LiteBansModule_178 {
    final /* synthetic */ SQLiteDriverHandler_5 BaseCoreGenericHandler;
    TemplateHandler(SQLiteDriverHandler_5 jr_02) {
        this.plugin = jr_02;
    }

    public final String BaseCoreGenericHandler(BansHandler_2 kL2) {
        Object object = kL2;
        boolean flag = false;
        String string = SQLiteDriverHandler.e("ALTER TABLE " + object);
        object = this.plugin;
        String string2 = "template";
        String string3 = " DEFAULT 255";
        boolean flag2 = false;
        String string4 = ((SQLiteDriverHandler_5)object).LiteBansModule_31().BaseCoreGenericHandler();
        return SQLiteDriverHandler.LiteBansModule_194(string, ObjectUtilities.BaseCoreGenericHandler((Object)string4, (Object)"pgsql") || ObjectUtilities.BaseCoreGenericHandler((Object)string4, (Object)"LiteBansModule_243") ? string2 + " SMALLINT NOT NULL" + string3 : string2 + " TINYINT" + ((SQLiteDriverHandler_5)object).LiteBansModule_31().e() + " NOT NULL" + string3);
    }

    @Override
    public Object BaseCoreGenericHandler(Object object) {
        return SQLiteDriverHandler.AsyncBackgroundTask_5(this.plugin((BansHandler_2)object));
    }

    }

