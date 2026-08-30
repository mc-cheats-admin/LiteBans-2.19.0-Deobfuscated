package litebans;

public class OsNameHandler {
    private static final LiteBansModule_150 BaseCoreGenericHandler() {
        String string = System.getProperty("os.name");
        if ("Mac OS X".equals(string)) {
            return new LiteBansModule_264();
        }
        return new LiteBansModule_149();
    }

    static /* synthetic */ LiteBansModule_150 LiteBansModule_31() {
        return OsNameHandler.BaseCoreGenericHandler();
    }
}

