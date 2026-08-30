package litebans;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;

/*
 * Renamed from litebans.jK
 */
public static class jk_0
implements Iterator {
    private Object b;
    private final Class c;
    private final Iterator a;

    public jk_0(Class clazz) {
        this(clazz, ClassLoader.getSystemClassLoader());
    }

    public jk_0(Class clazz, ClassLoader classLoader) {
        this.c = clazz;
        ServiceLoader serviceLoader = ServiceLoader.load(clazz, classLoader);
        this.a = serviceLoader.iterator();
        this.b = null;
    }

    private final boolean a() {
        while (this.b == null) {
            try {
                if (!this.a.hasNext()) {
                    return false;
                }
                this.b = this.a.next();
            }
            catch (ServiceConfigurationError serviceConfigurationError) {
                if (serviceConfigurationError.getCause() instanceof SecurityException) continue;
                throw serviceConfigurationError;
            }
        }
        return true;
    }

    @Override
    public boolean hasNext() {
        return this.a();
    }

    public Object next() {
        if (!this.a()) {
            throw new NoSuchElementException("No more elements for service " + this.c.getName());
        }
        Object object = this.b;
        this.b = null;
        return object;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("service=" + this.c.getName());
    }
}

