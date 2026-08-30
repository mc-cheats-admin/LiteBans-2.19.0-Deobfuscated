package litebans;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.util.jar.JarEntry;
import java.util.jar.JarInputStream;
import java.util.zip.ZipEntry;
public final class LiteBansModule_327 {
    public static final LiteBansModule_327 BaseCoreGenericHandler = new LiteBansModule_327();

    private LiteBansModule_327() {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final long BaseCoreGenericHandler() {
        long l3 = 0L;
        l3 = -1L;
        String string = StackTraceAnalyzer.BaseCoreGenericHandler(RemoteUpdateService.class);
        File file = new File(string);
        JarInputStream jarInputStream = new JarInputStream(new FileInputStream(file));
        Closeable closeable = jarInputStream;
        Throwable throwable = null;
        try {
            Object contextObj = (JarInputStream)closeable;
            JarEntry jarEntry = null;
            while ((targetObj = (jarEntry = jarInputStream.getNextJarEntry())) != null && (targetObj = ((ZipEntry)targetObj).getName()) != null) {
                Object resultObj = targetObj;
                if (((String)resultObj).length() > 6) {
                    resultObj = StringUtilities.BaseCoreGenericHandler((String)resultObj, '/', '.', false, 4, null).substring(0, ((String)resultObj).length() - 6);
                }
                long l5 = jarEntry.getTime();
                if (!ObjectUtilities.BaseCoreGenericHandler(resultObj, (Object)RemoteUpdateService.class.getName())) continue;
                l3 = l5;
            }
            contextObj = KotlinUnitHandler.BaseCoreGenericHandler;
        }
        catch (Throwable throwable2) {
            throwable = throwable2;
            throw throwable2;
        }
        finally {
            LiteBansModule_259.BaseCoreGenericHandler(1);
            BlockHandler.BaseCoreGenericHandler(closeable, throwable);
            LiteBansModule_259.LiteBansModule_31(1);
        }
        return l3 / 1000L;
    }
}

