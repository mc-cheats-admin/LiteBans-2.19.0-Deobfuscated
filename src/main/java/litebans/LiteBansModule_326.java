package litebans;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.util.jar.JarEntry;
import java.util.jar.JarInputStream;
import java.util.zip.ZipEntry;
public final class LiteBansModule_326 {
    public static final LiteBansModule_326 BaseCoreGenericHandler = new LiteBansModule_326();

    private LiteBansModule_326() {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final long BaseCoreGenericHandler() {
        boolean flag = false;
        long l3 = 0L;
        l3 = -1L;
        String string = StackTraceAnalyzer.BaseCoreGenericHandler(RemoteUpdateService.class);
        File file = new File(string);
        JarInputStream jarInputStream = new JarInputStream(new FileInputStream(file));
        Closeable closeable = jarInputStream;
        Throwable throwable = null;
        try {
            Object object;
            Object object2 = (JarInputStream)closeable;
            boolean flag2 = false;
            JarEntry jarEntry = null;
            while ((object = (jarEntry = jarInputStream.getNextJarEntry())) != null && (object = ((ZipEntry)object).getName()) != null) {
                Object object3 = object;
                if (((String)object3).length() > 6) {
                    object3 = StringUtilities.BaseCoreGenericHandler((String)object3, '/', '.', false, 4, null).substring(0, ((String)object3).length() - 6);
                }
                long l5 = jarEntry.getTime();
                if (!ObjectUtilities.BaseCoreGenericHandler(object3, (Object)RemoteUpdateService.class.getName())) continue;
                l3 = l5;
            }
            object2 = KotlinUnitHandler.BaseCoreGenericHandler;
        }
        catch (Throwable throwable2) {
            throwable = throwable2;
            throw throwable2;
        }
        finally {
            LiteBansModule_258.BaseCoreGenericHandler(1);
            BlockHandler.BaseCoreGenericHandler(closeable, throwable);
            LiteBansModule_258.LiteBansModule_31(1);
        }
        return l3 / 1000L;
    }
}

