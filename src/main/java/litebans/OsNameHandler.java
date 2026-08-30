package litebans;

public class OsNameHandler {
    private static final LiteBansModule_149 BaseCoreGenericHandler() {
        String string = System.getProperty("os.name");
        if ("Mac OS X".equals(string)) {
            return new LiteBansModule_263();
        }
        return new LiteBansModule_148();
    }

    static /* synthetic */ LiteBansModule_149 LiteBansModule_31() {
        return OsNameHandler.BaseCoreGenericHandler();
    }
}

