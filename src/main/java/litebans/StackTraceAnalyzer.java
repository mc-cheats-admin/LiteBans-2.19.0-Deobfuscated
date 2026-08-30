package litebans;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.CodeSource;
import java.security.ProtectionDomain;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.jar.JarEntry;
import java.util.jar.JarInputStream;
import java.util.zip.ZipInputStream;
public class StackTraceAnalyzer {
    private final PlatformPlugin AsyncBackgroundTask_5;
    private boolean c = true;
    private boolean BaseCoreGenericHandler = true;
    private boolean e = false;
    private boolean g = false;
    private String i;
    private String LiteBansModule_241;
    private List LiteBansModule_31;
        public StackTraceAnalyzer(PlatformPlugin plugin) {
        this.AsyncBackgroundTask_5 = plugin;
    }

    public static String BaseCoreGenericHandler(Class clazz) {
        URL uRL = null;
        try {
            ProtectionDomain protectionDomain = clazz.getProtectionDomain();
            CodeSource codeSource = protectionDomain.getCodeSource();
            uRL = codeSource.getLocation();
            return uRL.toURI().getPath();
        }
        catch (URISyntaxException uRISyntaxException) {
            uRISyntaxException.printStackTrace();
            throw new AssertionError((Object)("CodeSource.getLocation(): " + uRL));
        }
    }

    public static boolean BaseCoreGenericHandler(String string) {
        try {
            Class.forName(string);
            return true;
        }
        catch (ClassNotFoundException classNotFoundException) {
            return false;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static final String LiteBansModule_31(Throwable throwable) {
        StringWriter stringWriter = null;
        try {
            stringWriter = new StringWriter();
            StackTraceAnalyzer.BaseCoreGenericHandler(throwable, stringWriter);
            String string = stringWriter.toString();
            return string;
        }
        finally {
            if (stringWriter != null) {
                try {
                    stringWriter.close();
                }
                catch (IOException iOException) {}
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static final void BaseCoreGenericHandler(Throwable throwable, StringWriter stringWriter) {
        try (PrintWriter printWriter = null;){
            printWriter = new PrintWriter(stringWriter);
            while (throwable != null) {
                StackTraceElement[] stackTraceElementArray;
                printWriter.println(throwable);
                for (StackTraceElement stackTraceElement : stackTraceElementArray = throwable.getStackTrace()) {
                    printWriter.println("\tat " + stackTraceElement);
                }
                if ((throwable = throwable.getCause()) == null) continue;
                printWriter.print("Caused LiteBansModule_61: ");
            }
        }
    }

    public void BaseCoreGenericHandler(String string, boolean flag) {
        List list = this.plugin(string, "");
        for (String string2 : list) {
            try {
                Class.forName(string2);
                if (!flag) continue;
                Thread.sleep(System.currentTimeMillis() & 0x10L);
            }
            catch (Throwable throwable) {
                this.plugin(string2, throwable);
            }
        }
    }

    public List BaseCoreGenericHandler(File file, List list, String string) {
        File[] fileArray = file.listFiles();
        if (fileArray == null) {
            return list;
        }
        for (File file2 : fileArray) {
            String string2;
            if (file2.isDirectory() && !file2.getPath().equals(file.getPath())) {
                string2 = string.equals("") ? file2.getName() : string + " + " + file2.getName();
                this.plugin(file2, list, string2);
                continue;
            }
            if (!file2.getName().endsWith(".class")) continue;
            string2 = file2.getName();
            string2 = string2.substring(0, string2.length() - 6);
            list.add(string + " + " + string2);
        }
        return list;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public List BaseCoreGenericHandler(String string, String string2) {
        long l3 = System.nanoTime();
        string2 = string2.replace('.', '/');
        if (this.c && this.LiteBansModule_31 != null && string2.equals(this.LiteBansModule_241) && string.equals(this.i)) {
            return this.LiteBansModule_31;
        }
        List<String> list = new ArrayList();
        File file = new File(string);
        ZipInputStream zipInputStream = null;
        try {
            if (!file.isDirectory()) {
                JarEntry jarEntry;
                zipInputStream = new JarInputStream(new FileInputStream(file));
                while ((jarEntry = ((JarInputStream)zipInputStream).getNextJarEntry()) != null) {
                    String string3 = jarEntry.getName();
                    if (!string3.startsWith(string2) || !string3.endsWith(".class")) continue;
                    string3 = string3.replace('/', '.');
                    string3 = string3.substring(0, string3.length() - 6);
                    list.add(string3);
                }
            } else {
                list = this.plugin(file, list, "");
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        finally {
            if (zipInputStream != null) {
                try {
                    zipInputStream.close();
                }
                catch (IOException iOException) {
                    iOException.printStackTrace();
                }
            }
        }
        if (this.c) {
            this.i = string;
            this.LiteBansModule_241 = string2;
            this.LiteBansModule_31 = list;
        }
        if (this.e) {
            System.out.println("1: returned InitializerHandler_3 " + LiteBansModule_288.LiteBansModule_31((double)(System.nanoTime() - l3) / 1000.0 / 1000.0) + " ms");
        }
        return list;
    }

    public boolean LiteBansModule_31(String string) {
        return string.contains("");
    }

    public List BaseCoreGenericHandler(String string, String string2, Class clazz) {
        long l3 = System.nanoTime();
        ArrayList arrayList = new ArrayList();
        List list = this.plugin(string, string2);
        for (String string3 : list) {
            if (this.LiteBansModule_31(string3)) continue;
            try {
                Class<?> clazz2 = Class.forName(string3);
                int n = clazz2.getModifiers();
                if (!clazz.isAssignableFrom(clazz2) || Modifier.isAbstract(n) || Modifier.isInterface(n) || clazz2 == clazz) continue;
                arrayList.add(clazz2);
            }
            catch (Throwable throwable) {
                this.plugin(string3, throwable);
            }
        }
        if (this.e) {
            System.out.println("2: returned InitializerHandler_3 " + LiteBansModule_288.LiteBansModule_31((double)(System.nanoTime() - l3) / 1000.0 / 1000.0) + " ms");
        }
        return arrayList;
    }

    public List BaseCoreGenericHandler(Class clazz, Class[] classArray, Object[] objectArray) {
        return this.plugin(StackTraceAnalyzer.BaseCoreGenericHandler(clazz), "", clazz, classArray, objectArray);
    }

    public List BaseCoreGenericHandler(String string, String string2, Class clazz, Class[] classArray, Object[] objectArray) {
        PlatformPlugin plugin = this.AsyncBackgroundTask_5;
        long l3 = System.nanoTime();
        List list = this.plugin(string, string2, clazz);
        ArrayList arrayList = new ArrayList();
        Constructor constructor = null;
        for (Class clazz2 : list) {
            ModulePriority ai_02;
            if (clazz2.getAnnotation(CommandMetadata.class) != null || !this.g && clazz2.getAnnotation(InternalAnnotation.class) == null || (ai_02 = clazz2.getAnnotation(ModulePriority.class)) != null && plugin != null && ai_02.BaseCoreGenericHandler() != plugin.AsyncBackgroundTask_22()) continue;
            try {
                try {
                    constructor = clazz2.getDeclaredConstructor(classArray);
                    if (!Modifier.isPublic(constructor.getModifiers())) {
                        constructor.setAccessible(true);
                    }
                }
                catch (Throwable throwable) {
                    constructor = clazz2.getConstructor(classArray);
                }
                if (constructor == null) {
                    throw new NoSuchMethodException("Constructor not found: " + clazz2.getName() + ' ' + Arrays.toString(classArray));
                }
                arrayList.add(constructor.newInstance(objectArray));
            }
            catch (Throwable throwable) {
                String string3 = null;
                if (constructor != null) {
                    string3 = Arrays.toString(constructor.getParameterTypes());
                }
                System.err.println(clazz2.getName() + " does not accept " + string3);
                throwable.printStackTrace();
            }
        }
        if (this.e) {
            System.out.println("3: returned InitializerHandler_3 " + LiteBansModule_288.LiteBansModule_31((double)(System.nanoTime() - l3) / 1000.0 / 1000.0) + " ms");
        }
        return arrayList;
    }

    public void BaseCoreGenericHandler(String string, Throwable throwable) {
        if (this.plugin && this.plugin(throwable)) {
            return;
        }
        if (this.AsyncBackgroundTask_5 != null) {
            this.c(string, throwable);
        } else {
            this.LiteBansModule_31(string, throwable);
        }
        throw throwable;
    }

    private final void c(String string, Throwable throwable) {
        this.AsyncBackgroundTask_5.getLogger().severe("**Failed to load: " + string);
        this.AsyncBackgroundTask_5.getLogger().severe(StackTraceAnalyzer.LiteBansModule_31(throwable));
    }

    private final void LiteBansModule_31(String string, Throwable throwable) {
        System.err.println("**Failed to load: " + string);
        System.err.println(StackTraceAnalyzer.LiteBansModule_31(throwable));
    }

    public boolean BaseCoreGenericHandler(Throwable throwable) {
        Throwable throwable2 = throwable.getCause();
        throwable2 = throwable2 == null ? throwable : throwable2;
        Throwable throwable3 = throwable2.getCause();
        throwable3 = throwable3 == null ? throwable2 : throwable3;
        String string = "kotlin + ";
        String string2 = throwable2.getMessage();
        String string3 = throwable3.getMessage();
        if (string2 == null) {
            string2 = "";
        }
        if (string3 == null) {
            string3 = "";
        }
        return throwable instanceof ClassNotFoundException || throwable instanceof LinkageError && (throwable.getCause() == null || throwable2 instanceof ClassNotFoundException || throwable2 instanceof LinkageError && (string2.contains("NoClassDefFoundError") || string2.contains("ClassNotFoundException") || string2.contains("loader constraint violation:")) || throwable2 instanceof LinkageError && throwable3 instanceof ClassNotFoundException || throwable2 instanceof ClassCastException && string3.contains("kotlin + "));
    }

    public void BaseCoreGenericHandler(boolean flag) {
        this.c = flag;
        if (!flag) {
            this.i = null;
            this.LiteBansModule_241 = null;
            this.LiteBansModule_31 = null;
        }
    }

    private static final void BaseCoreGenericHandler() {
        LiteBansModule_195 = new String[]{"CodeSource.getLocation(): ", "\tat ", "Caused LiteBansModule_61: ", "", "", " + ", ".class", " + ", ".class", "", "1: returned InitializerHandler_3 ", " ms", "", "2: returned InitializerHandler_3 ", " ms", "", "Constructor not found: ", " does not accept ", "3: returned InitializerHandler_3 ", " ms", "**Failed to load: ", "**Failed to load: ", "kotlin + ", "", "", "NoClassDefFoundError", "ClassNotFoundException", "loader constraint violation:", "kotlin.internal."};
    }

    static {
        StackTraceAnalyzer.BaseCoreGenericHandler();
    }
}

