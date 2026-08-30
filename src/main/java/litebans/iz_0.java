package litebans;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.util.jar.JarEntry;
import java.util.jar.JarInputStream;
import java.util.zip.ZipEntry;
import litebans.bt_0;
import litebans.bz;
import litebans.ew;
import litebans.hb_0;
import litebans.hh;
import litebans.iv_0;
import litebans.z_0;

public final class iz_0 {
    public static final iz_0 a = new iz_0();

    private iz_0() {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final long a() {
        boolean bl = false;
        long l3 = 0L;
        l3 = -1L;
        String string = hb_0.a(z_0.class);
        File file = new File(string);
        JarInputStream jarInputStream = new JarInputStream(new FileInputStream(file));
        Closeable closeable = jarInputStream;
        Throwable throwable = null;
        try {
            Object object;
            Object object2 = (JarInputStream)closeable;
            boolean bl2 = false;
            JarEntry jarEntry = null;
            while ((object = (jarEntry = jarInputStream.getNextJarEntry())) != null && (object = ((ZipEntry)object).getName()) != null) {
                Object object3 = object;
                if (((String)object3).length() > 6) {
                    object3 = bz.a((String)object3, '/', '.', false, 4, null).substring(0, ((String)object3).length() - 6);
                }
                long l5 = jarEntry.getTime();
                if (!ew.a(object3, (Object)z_0.class.getName())) continue;
                l3 = l5;
            }
            object2 = iv_0.a;
        }
        catch (Throwable throwable2) {
            throwable = throwable2;
            throw throwable2;
        }
        finally {
            hh.a(1);
            bt_0.a(closeable, throwable);
            hh.b(1);
        }
        return l3 / 1000L;
    }
}

