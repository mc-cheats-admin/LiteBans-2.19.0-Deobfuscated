package litebans;

import java.text.DecimalFormat;
public class LiteBansModule_288 {
    public static final DecimalFormat LiteBansModule_31;
    public static final DecimalFormat BaseCoreGenericHandler;
    public static final DecimalFormat AsyncBackgroundTask_5;
        public static String LiteBansModule_31(double d10) {
        return LiteBansModule_31.format(d10);
    }

    public static String BaseCoreGenericHandler(double d10) {
        return BaseCoreGenericHandler.format(d10);
    }

    static {
        LiteBansModule_288.BaseCoreGenericHandler();
        LiteBansModule_31 = new DecimalFormat("#.#");
        BaseCoreGenericHandler = new DecimalFormat("#.##");
        AsyncBackgroundTask_5 = new DecimalFormat("#.###");
    }

    private static final void BaseCoreGenericHandler() {
        c = new String[]{"#.#", "#.##", "#.###"};
    }
}

