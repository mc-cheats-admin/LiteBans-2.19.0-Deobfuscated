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

/*
 * Renamed from litebans.hb
 */
public static class hb_0 {
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
            throw new AssertionError((Object)(f[0] + uRL));
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
                    printWriter.println(f[1] + stackTraceElement);
                }
                if ((throwable = throwable.getCause()) == null) continue;
                printWriter.print(f[2]);
            }
        }
    }

    public void a(String string, boolean bl) {
        List list = this.a(string, f[3]);
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
                string2 = string.equals(f[4]) ? file2.getName() : string + f[5] + file2.getName();
                this.a(file2, list, string2);
                continue;
            }
            if (!file2.getName().endsWith(f[6])) continue;
            string2 = file2.getName();
            string2 = string2.substring(0, string2.length() - 6);
            list.add(string + f[7] + string2);
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
                    if (!string3.startsWith(string2) || !string3.endsWith(f[8])) continue;
                    string3 = string3.replace('/', '.');
                    string3 = string3.substring(0, string3.length() - 6);
                    list.add(string3);
                }
            } else {
                list = this.a(file, list, f[9]);
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
            System.out.println(f[10] + i1.b((double)(System.nanoTime() - l3) / 1000.0 / 1000.0) + f[11]);
        }
        return list;
    }

    public boolean b(String string) {
        return string.contains(f[12]);
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
            System.out.println(f[13] + i1.b((double)(System.nanoTime() - l3) / 1000.0 / 1000.0) + f[14]);
        }
        return arrayList;
    }

    public List a(Class clazz, Class[] classArray, Object[] objectArray) {
        return this.a(hb_0.a(clazz), f[15], clazz, classArray, objectArray);
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
                    throw new NoSuchMethodException(f[16] + clazz2.getName() + ' ' + Arrays.toString(classArray));
                }
                arrayList.add(constructor.newInstance(objectArray));
            }
            catch (Throwable throwable) {
                String string3 = null;
                if (constructor != null) {
                    string3 = Arrays.toString(constructor.getParameterTypes());
                }
                System.err.println(clazz2.getName() + f[17] + string3);
                throwable.printStackTrace();
            }
        }
        if (this.e) {
            System.out.println(f[18] + i1.b((double)(System.nanoTime() - l3) / 1000.0 / 1000.0) + f[19]);
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
        this.d.getLogger().severe(f[20] + string);
        this.d.getLogger().severe(hb_0.b(throwable));
    }

    private final void b(String string, Throwable throwable) {
        System.err.println(f[21] + string);
        System.err.println(hb_0.b(throwable));
    }

    public boolean a(Throwable throwable) {
        Throwable throwable2 = throwable.getCause();
        throwable2 = throwable2 == null ? throwable : throwable2;
        Throwable throwable3 = throwable2.getCause();
        throwable3 = throwable3 == null ? throwable2 : throwable3;
        String string = f[22];
        String string2 = throwable2.getMessage();
        String string3 = throwable3.getMessage();
        if (string2 == null) {
            string2 = f[23];
        }
        if (string3 == null) {
            string3 = f[24];
        }
        return throwable instanceof ClassNotFoundException || throwable instanceof LinkageError && (throwable.getCause() == null || throwable2 instanceof ClassNotFoundException || throwable2 instanceof LinkageError && (string2.contains(f[25]) || string2.contains(f[26]) || string2.contains(f[27])) || throwable2 instanceof LinkageError && throwable3 instanceof ClassNotFoundException || throwable2 instanceof ClassCastException && string3.contains(f[28]));
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
        f = new String[]{hl.a("\u4520\u450c\u4507\u4506\u4530\u450c\u4516\u4511\u4500\u4506\u454d\u4504\u4506\u4517\u452f\u450c\u4500\u4502\u4517\u450a\u450c\u450d\u454b\u454a\u4559\u4543", -1145027229), hl.a("\ubd31\ubd59\ubd4c\ubd18", -1967342280), hl.a("\u5f2e\u5f0c\u5f18\u5f1e\u5f08\u5f09\u5f4d\u5f0f\u5f14\u5f57\u5f4d", -1747427475), hl.a("", 1809355637), hl.a("", -2032352391), hl.a("\ua750", -1299404930), hl.a("\ufdce\ufd83\ufd8c\ufd81\ufd93\ufd93", -975372832), hl.a("\u41e3", 2013741517), hl.a("\u6faf\u6fe2\u6fed\u6fe0\u6ff2\u6ff2", -797872255), hl.a("", -684803086), hl.a("\u69a6\u69ad\u69b7\u69e5\u69f2\u69e3\u69e2\u69e5\u69f9\u69f2\u69f3\u69b7\u69fe\u69f9\u69b7", 1091987863), hl.a("\u7aea\u7aa7\u7ab9", -491619638), hl.a("\u5cc6\u5cc2\u5cd3\u5cc2\u5cc5\u5c85", 151477419), hl.a("\ufae8\ufae0\ufafa\ufaa8\ufabf\ufaae\ufaaf\ufaa8\ufab4\ufabf\ufabe\ufafa\ufab3\ufab4\ufafa", -284230950), hl.a("\u765c\u7611\u760f", 1281062524), hl.a("", -2126640802), hl.a("\uc394\uc3b8\uc3b9\uc3a4\uc3a3\uc3a5\uc3a2\uc3b4\uc3a3\uc3b8\uc3a5\uc3f7\uc3b9\uc3b8\uc3a3\uc3f7\uc3b1\uc3b8\uc3a2\uc3b9\uc3b3\uc3ed\uc3f7", 1432994775), hl.a("\u9d44\u9d00\u9d0b\u9d01\u9d17\u9d44\u9d0a\u9d0b\u9d10\u9d44\u9d05\u9d07\u9d07\u9d01\u9d14\u9d10\u9d44", 532323684), hl.a("\ua355\ua35c\ua346\ua314\ua303\ua312\ua313\ua314\ua308\ua303\ua302\ua346\ua30f\ua308\ua346", -1310284954), hl.a("\u05f8\u05b5\u05ab", 401999320), hl.a("\uf498\uf498\uf4f4\uf4d3\uf4db\uf4de\uf4d7\uf4d6\uf492\uf4c6\uf4dd\uf492\uf4de\uf4dd\uf4d3\uf4d6\uf488\uf492", 185136306), hl.a("\ua53a\ua53a\ua556\ua571\ua579\ua57c\ua575\ua574\ua530\ua564\ua57f\ua530\ua57c\ua57f\ua571\ua574\ua52a\ua530", 824091920), hl.a("\uc25d\uc259\uc242\uc25a\uc25f\uc258\uc218\uc25f\uc258\uc242\uc253\uc244\uc258\uc257\uc25a\uc218", 406503990), hl.a("", -853936670), hl.a("", 1741525380), hl.a("\u2517\u2536\u251a\u2535\u2538\u252a\u252a\u251d\u253c\u253f\u251f\u2536\u252c\u2537\u253d\u251c\u252b\u252b\u2536\u252b", 550446425), hl.a("\ue75b\ue774\ue779\ue76b\ue76b\ue756\ue777\ue76c\ue75e\ue777\ue76d\ue776\ue77c\ue75d\ue760\ue77b\ue77d\ue768\ue76c\ue771\ue777\ue776", 1000531736), hl.a("\ubcd6\ubcd5\ubcdb\ubcde\ubcdf\ubcc8\ubc9a\ubcd9\ubcd5\ubcd4\ubcc9\ubcce\ubcc8\ubcdb\ubcd3\ubcd4\ubcce\ubc9a\ubccc\ubcd3\ubcd5\ubcd6\ubcdb\ubcce\ubcd3\ubcd5\ubcd4\ubc80", 2052570298), hl.a("\uf159\uf15d\uf146\uf15e\uf15b\uf15c\uf11c\uf15b\uf15c\uf146\uf157\uf140\uf15c\uf153\uf15e\uf11c", 1533210930)};
    }

    static {
        hb_0.a();
    }
}

