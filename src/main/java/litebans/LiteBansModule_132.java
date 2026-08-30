package litebans;

import java.lang.reflect.Constructor;
import java.util.Locale;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
public final class LiteBansModule_132 {
    private LiteBansModule_132() {
    }

    public static String LiteBansModule_31(String string) {
        return string == null ? null : (string.trim().isEmpty() ? null : string.trim());
    }

    public static void BaseCoreGenericHandler(long l3) {
        try {
            Thread.sleep(l3);
        }
        catch (InterruptedException interruptedException) {
            Thread.currentThread().interrupt();
        }
    }

    public static Object BaseCoreGenericHandler(String string, Class clazz, Object[] objectArray) {
        if (string == null) {
            return null;
        }
        try {
            Class<?> clazz2 = LiteBansModule_132.class.getClassLoader().loadClass(string);
            if (objectArray.length == 0) {
                return clazz.cast(clazz2.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            }
            Class[] classArray = new Class[objectArray.length];
            for (int i = 0; i < objectArray.length; ++i) {
                classArray[i] = objectArray[i].getClass();
            }
            Constructor<?> constructor = clazz2.getConstructor(classArray);
            return clazz.cast(constructor.newInstance(objectArray));
        }
        catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }

    public static ThreadPoolExecutor BaseCoreGenericHandler(int n, String string, ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        if (threadFactory == null) {
            threadFactory = new LiteBansModule_217(string, true);
        }
        LinkedBlockingQueue<Runnable> linkedBlockingQueue = new LinkedBlockingQueue<Runnable>(n);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 5L, TimeUnit.SECONDS, linkedBlockingQueue, threadFactory, rejectedExecutionHandler);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    public static ThreadPoolExecutor BaseCoreGenericHandler(BlockingQueue blockingQueue, String string, ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        if (threadFactory == null) {
            threadFactory = new LiteBansModule_217(string, true);
        }
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 5L, TimeUnit.SECONDS, blockingQueue, threadFactory, rejectedExecutionHandler);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    public static int BaseCoreGenericHandler(String string) {
        if (string != null) {
            try {
                String string2 = string.toUpperCase(Locale.ENGLISH);
                return TransactionNoneHandler.BaseCoreGenericHandler(string2).BaseCoreGenericHandler();
            }
            catch (IllegalArgumentException illegalArgumentException) {
                try {
                    int n = Integer.parseInt(string);
                    for (TransactionNoneHandler k62 : TransactionNoneHandler.values()) {
                        if (k62.BaseCoreGenericHandler() != n) continue;
                        return k62.BaseCoreGenericHandler();
                    }
                    throw new IllegalArgumentException("Invalid transaction isolation value: " + string);
                }
                catch (NumberFormatException numberFormatException) {
                    throw new IllegalArgumentException("Invalid transaction isolation value: " + string, numberFormatException);
                }
            }
        }
        return -1;
    }
}

