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
import litebans.ai_0;
import litebans.di_0;
import litebans.gy_0;
import litebans.hh_0;
import litebans.hl;
import litebans.i1;

public class hb_0 {
    private final di_0 d;
    private boolean c = true;
    private boolean a = true;
    private boolean e = false;
    private boolean g = false;
    private String i;
    private String h;
    private List b;
    private static /* synthetic */ String[] f;

    public hb_0(di_0 di_02) {
        this.d = di_02;
    }

    public static String a(Class clazz) {
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

    public static boolean a(String string) {
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
    private static final String b(Throwable throwable) {
        StringWriter stringWriter = null;
        try {
            stringWriter = new StringWriter();
            hb_0.a(throwable, stringWriter);
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
    private static final void a(Throwable throwable, StringWriter stringWriter) {
        try (PrintWriter printWriter = null;){
            printWriter = new PrintWriter(stringWriter);
            while (throwable != null) {
                StackTraceElement[] stackTraceElementArray;
                printWriter.println(throwable);
                for (StackTraceElement stackTraceElement : stackTraceElementArray = throwable.getStackTrace()) {
                    printWriter.println("\tat " + stackTraceElement);
                }
                if ((throwable = throwable.getCause()) == null) continue;
                printWriter.print("Caused by: ");
            }
        }
    }

    public void a(String string, boolean bl) {
        List list = this.a(string, "");
        for (String string2 : list) {
            try {
                Class.forName(string2);
                if (!bl) continue;
                Thread.sleep(System.currentTimeMillis() & 0x10L);
            }
            catch (Throwable throwable) {
                this.a(string2, throwable);
            }
        }
    }

    public List a(File file, List list, String string) {
        File[] fileArray = file.listFiles();
        if (fileArray == null) {
            return list;
        }
        for (File file2 : fileArray) {
            String string2;
            if (file2.isDirectory() && !file2.getPath().equals(file.getPath())) {
                string2 = string.equals("") ? file2.getName() : string + " + " + file2.getName();
                this.a(file2, list, string2);
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
    public List a(String string, String string2) {
        long l3 = System.nanoTime();
        string2 = string2.replace('.', '/');
        if (this.c && this.b != null && string2.equals(this.h) && string.equals(this.i)) {
            return this.b;
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
                list = this.a(file, list, "");
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
            this.h = string2;
            this.b = list;
        }
        if (this.e) {
            System.out.println("1: returned in " + i1.b((double)(System.nanoTime() - l3) / 1000.0 / 1000.0) + " ms");
        }
        return list;
    }

    public boolean b(String string) {
        return string.contains("");
    }

    public List a(String string, String string2, Class clazz) {
        long l3 = System.nanoTime();
        ArrayList arrayList = new ArrayList();
        List list = this.a(string, string2);
        for (String string3 : list) {
            if (this.b(string3)) continue;
            try {
                Class<?> clazz2 = Class.forName(string3);
                int n = clazz2.getModifiers();
                if (!clazz.isAssignableFrom(clazz2) || Modifier.isAbstract(n) || Modifier.isInterface(n) || clazz2 == clazz) continue;
                arrayList.add(clazz2);
            }
            catch (Throwable throwable) {
                this.a(string3, throwable);
            }
        }
        if (this.e) {
            System.out.println("2: returned in " + i1.b((double)(System.nanoTime() - l3) / 1000.0 / 1000.0) + " ms");
        }
        return arrayList;
    }

    public List a(Class clazz, Class[] classArray, Object[] objectArray) {
        return this.a(hb_0.a(clazz), "", clazz, classArray, objectArray);
    }

    public List a(String string, String string2, Class clazz, Class[] classArray, Object[] objectArray) {
        di_0 di_02 = this.d;
        long l3 = System.nanoTime();
        List list = this.a(string, string2, clazz);
        ArrayList arrayList = new ArrayList();
        Constructor constructor = null;
        for (Class clazz2 : list) {
            ai_0 ai_02;
            if (clazz2.getAnnotation(hh_0.class) != null || !this.g && clazz2.getAnnotation(gy_0.class) == null || (ai_02 = clazz2.getAnnotation(ai_0.class)) != null && di_02 != null && ai_02.a() != di_02.t()) continue;
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
            System.out.println("3: returned in " + i1.b((double)(System.nanoTime() - l3) / 1000.0 / 1000.0) + " ms");
        }
        return arrayList;
    }

    public void a(String string, Throwable throwable) {
        if (this.a && this.a(throwable)) {
            return;
        }
        if (this.d != null) {
            this.c(string, throwable);
        } else {
            this.b(string, throwable);
        }
        throw throwable;
    }

    private final void c(String string, Throwable throwable) {
        this.d.getLogger().severe("**Failed to load: " + string);
        this.d.getLogger().severe(hb_0.b(throwable));
    }

    private final void b(String string, Throwable throwable) {
        System.err.println("**Failed to load: " + string);
        System.err.println(hb_0.b(throwable));
    }

    public boolean a(Throwable throwable) {
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

    public void a(boolean bl) {
        this.c = bl;
        if (!bl) {
            this.i = null;
            this.h = null;
            this.b = null;
        }
    }

    private static final void a() {
        f = new String[]{"CodeSource.getLocation(): ", "\tat ", "Caused by: ", "", "", " + ", ".class", " + ", ".class", "", "1: returned in ", " ms", "", "2: returned in ", " ms", "", "Constructor not found: ", " does not accept ", "3: returned in ", " ms", "**Failed to load: ", "**Failed to load: ", "kotlin + ", "", "", "NoClassDefFoundError", "ClassNotFoundException", "loader constraint violation:", "kotlin.internal."};
    }

    static {
        hb_0.a();
    }
}

