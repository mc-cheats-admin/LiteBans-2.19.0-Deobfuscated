package litebans;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;

public class LiteBansModule_346
implements Iterator {
    private Object LiteBansModule_31;
    private final Class c;
    private final Iterator BaseCoreGenericHandler;

    public LiteBansModule_346(Class clazz) {
        this(clazz, ClassLoader.getSystemClassLoader());
    }

    public LiteBansModule_346(Class clazz, ClassLoader classLoader) {
        this.c = clazz;
        ServiceLoader serviceLoader = ServiceLoader.load(clazz, classLoader);
        this.plugin = serviceLoader.iterator();
        this.LiteBansModule_31 = null;
    }

    private final boolean BaseCoreGenericHandler() {
        while (this.LiteBansModule_31 == null) {
            try {
                if (!this.plugin.hasNext()) {
                    return false;
                }
                this.LiteBansModule_31 = this.plugin.next();
            }
            catch (ServiceConfigurationError serviceConfigurationError) {
                if (serviceConfigurationError.getCause() instanceof SecurityException) continue;
                throw serviceConfigurationError;
}
        return true;
    }

    @Override
    public boolean hasNext() {
        return this.plugin();
    }

    public Object next() {
        if (!this.plugin()) {
            throw new NoSuchElementException("No more elements for service " + this.c.getName());
        }
        Object object = this.LiteBansModule_31;
        this.LiteBansModule_31 = null;
        return object;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("service=" + this.c.getName());
}

