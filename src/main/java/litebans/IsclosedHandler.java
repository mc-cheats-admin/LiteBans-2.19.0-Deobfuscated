package litebans;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.sql.Connection;
import java.sql.SQLException;

static final class IsclosedHandler {
    static final Connection BaseCoreGenericHandler = IsclosedHandler.BaseCoreGenericHandler();

    private IsclosedHandler() {
    }

    private static final Connection BaseCoreGenericHandler() {
        InvocationHandler invocationHandler = (object, method, objectArray) -> {
            String string = method.getName();
            if ("isClosed".equals(string)) {
                return Boolean.TRUE;
            }
            if ("isValid".equals(string)) {
                return Boolean.FALSE;
            }
            if ("abort".equals(string)) {
                return Void.TYPE;
            }
            if ("close".equals(string)) {
                return Void.TYPE;
            }
            if ("toString".equals(string)) {
                return IsclosedHandler.class.getCanonicalName();
            }
            throw new SQLException("Connection is closed");
        };
        return (Connection)Proxy.newProxyInstance(Connection.class.getClassLoader(), new Class[]{Connection.class}, invocationHandler);
    }
}

