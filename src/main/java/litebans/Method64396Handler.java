package litebans;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class Method64396Handler {
        public static LiteBansModule_99 LiteBansModule_31(PlatformPlugin plugin, String string) {
        ArgsHandler iy2 = Method64396Handler.BaseCoreGenericHandler(plugin, string);
        if (iy2 != null) {
            return iy2;
        }
        String string2 = "method_64396";
        try {
            Class.forName("net.minecraft.class_3222").getMethod(string2, new Class[0]);
            return new ArgsHandler_2(plugin);
        }
        catch (NoSuchMethodException noSuchMethodException) {
            return Method64396Handler.c(plugin, string2);
        }
        catch (Exception | LinkageError throwable) {
            throw new RuntimeException("Compatibility check failed (1.21) for " + string, throwable);
        }
    }

    private static final @Nullable ArgsHandler BaseCoreGenericHandler(PlatformPlugin plugin, String string) {
        try {
            Class.forName("net.minecraft.WorldVersion");
            return new ArgsHandler(plugin);
        }
        catch (ClassNotFoundException classNotFoundException) {
            return null;
        }
        catch (Exception | LinkageError throwable) {
            throw new RuntimeException("Compatibility check failed (26) for " + string, throwable);
        }
    }

    protected static @NotNull LiteBansModule_99 c(PlatformPlugin plugin, String string) {
        try {
            Class.forName("net.minecraft.class_8710");
            return new LiteBansModule_404(plugin);
        }
        catch (ClassNotFoundException classNotFoundException) {
            return new LiteBansModule_407(plugin);
        }
    }

    private static final void BaseCoreGenericHandler() {
        BaseCoreGenericHandler = new String[]{"method_64396", "net.minecraft.class_3222", "Compatibility check failed (1.21) for ", "net.minecraft.WorldVersion", "Compatibility check failed (26) for ", "net.minecraft.class_8710"};
    }

    static {
        Method64396Handler.BaseCoreGenericHandler();
    }
}

