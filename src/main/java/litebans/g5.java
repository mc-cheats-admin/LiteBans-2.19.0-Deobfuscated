package litebans;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.sql.Connection;
import java.sql.SQLException;

static final class g5 {
    static final Connection a = g5.a();

    private g5() {
    }

    private static final Connection a() {
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
                return g5.class.getCanonicalName();
            }
            throw new SQLException("Connection is closed");
        };
        return (Connection)Proxy.newProxyInstance(Connection.class.getClassLoader(), new Class[]{Connection.class}, invocationHandler);
    }
}

