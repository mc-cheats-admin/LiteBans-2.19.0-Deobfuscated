package litebans;

import litebans.cr_0;
import litebans.di_0;
import litebans.hl;
import litebans.iy;
import litebans.l2;
import litebans.la_0;
import litebans.lb_0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class gk_0 {
    private static /* synthetic */ String[] a;

    public static cr_0 b(di_0 di_02, String string) {
        iy iy2 = gk_0.a(di_02, string);
        if (iy2 != null) {
            return iy2;
        }
        String string2 = "method_64396";
        try {
            Class.forName("net.minecraft.class_3222").getMethod(string2, new Class[0]);
            return new lb_0(di_02);
        }
        catch (NoSuchMethodException noSuchMethodException) {
            return gk_0.c(di_02, string2);
        }
        catch (Exception | LinkageError throwable) {
            throw new RuntimeException("Compatibility check failed (1.21) for " + string, throwable);
        }
    }

    private static final @Nullable iy a(di_0 di_02, String string) {
        try {
            Class.forName("net.minecraft.WorldVersion");
            return new iy(di_02);
        }
        catch (ClassNotFoundException classNotFoundException) {
            return null;
        }
        catch (Exception | LinkageError throwable) {
            throw new RuntimeException("Compatibility check failed (26) for " + string, throwable);
        }
    }

    protected static @NotNull cr_0 c(di_0 di_02, String string) {
        try {
            Class.forName("net.minecraft.class_8710");
            return new l2(di_02);
        }
        catch (ClassNotFoundException classNotFoundException) {
            return new la_0(di_02);
        }
    }

    private static final void a() {
        a = new String[]{"method_64396", "net.minecraft.class_3222", "Compatibility check failed (1.21) for ", "net.minecraft.WorldVersion", "Compatibility check failed (26) for ", "net.minecraft.class_8710"};
    }

    static {
        gk_0.a();
    }
}

