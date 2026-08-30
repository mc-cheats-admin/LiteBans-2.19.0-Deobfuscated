package litebans;

static final class ServerOriginHandler
implements LiteBansModule_178 {
    final /* synthetic */ SQLiteDriverHandler_5 LiteBansModule_31;
    ServerOriginHandler(SQLiteDriverHandler_5 jr_02) {
        this.LiteBansModule_31 = jr_02;
    }

    public final String BaseCoreGenericHandler(BansHandler_2 kL2) {
        Object object = kL2;
        boolean flag = false;
        String string = SQLiteDriverHandler.e("ALTER TABLE " + object);
        object = this.LiteBansModule_31;
        String string2 = "server_origin";
        int n = 32;
        String string3 = "";
        String string4 = ((SQLiteDriverHandler_5)object).LiteBansModule_31().c();
        boolean flag2 = false;
        return SQLiteDriverHandler.LiteBansModule_194(string, DatabaseMonitorService.CommandThrottleService.LiteBansModule_31(((SQLiteDriverHandler_5)object).LiteBansModule_31().BaseCoreGenericHandler()) ? string2 + " VARCHAR(" + n + ')' + string4 + string3 : string2 + " VARCHAR(" + n + ')' + string3);
    }

    @Override
    public Object BaseCoreGenericHandler(Object object) {
        return SQLiteDriverHandler.AsyncBackgroundTask_5(this.plugin((BansHandler_2)object));
    }

    private static final void BaseCoreGenericHandler() {
        BaseCoreGenericHandler = new String[]{"ALTER TABLE ", "server_origin", "", " VARCHAR(", " VARCHAR("};
    }

    }

