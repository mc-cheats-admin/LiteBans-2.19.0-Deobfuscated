package litebans;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Properties;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import litebans.aB;
import litebans.kI;

public static final class bh {
    private static final Pattern a = Pattern.compile("(get|is)[A-Z].+");

    private bh() {
    }

    public static void a(Object object, Properties properties) {
        if (object == null || properties == null) {
            return;
        }
        List<Method> list = Arrays.asList(object.getClass().getMethods());
        properties.forEach((object2, object3) -> {
            if (object instanceof aB && object2.toString().startsWith("dataSource.")) {
                ((aB)object).a(object2.toString().substring("dataSource.".length()), object3);
            } else {
                bh.a(object, object2.toString(), object3, list);
            }
        });
    }

    public static Set a(Class clazz) {
        HashSet<String> hashSet = new HashSet<String>();
        Matcher matcher = a.matcher("");
        for (Method method : clazz.getMethods()) {
            String string = method.getName();
            if (method.getParameterTypes().length != 0 || !matcher.reset(string).matches()) continue;
            string = string.replaceFirst("(get|is)", "");
            try {
                if (clazz.getMethod("set" + string, method.getReturnType()) == null) continue;
                string = Character.toLowerCase(string.charAt(0)) + string.substring(1);
                hashSet.add(string);
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        return hashSet;
    }

    public static Object a(String string, Object object) {
        try {
            String string2 = "get" + string.substring(0, 1).toUpperCase(Locale.ENGLISH) + string.substring(1);
            Method method = object.getClass().getMethod(string2, new Class[0]);
            return method.invoke(object, new Object[0]);
        }
        catch (Exception exception) {
            try {
                String string3 = "is" + string.substring(0, 1).toUpperCase(Locale.ENGLISH) + string.substring(1);
                Method method = object.getClass().getMethod(string3, new Class[0]);
                return method.invoke(object, new Object[0]);
            }
            catch (Exception exception2) {
                return null;
            }
        }
    }

    public static Properties a(Properties properties) {
        Properties properties2 = new Properties();
        properties.forEach((object, object2) -> properties2.setProperty(object.toString(), object2.toString()));
        return properties2;
    }

    private static final void a(Object object, String string, Object object2, List list) {
        Object object3;
        kI kI2 = kI.a(bh.class);
        String string2 = "set" + string.substring(0, 1).toUpperCase(Locale.ENGLISH) + string.substring(1);
        Method method2 = list.stream().filter(method -> method.getName().equals(string2) && method.getParameterCount() == 1).findFirst().orElse(null);
        if (method2 == null) {
            object3 = "set" + string.toUpperCase(Locale.ENGLISH);
            method2 = list.stream().filter(arg_0 -> bh.b((String)object3, arg_0)).findFirst().orElse(null);
        }
        if (method2 == null) {
            kI2.a("Property %s does not exist on target %s", new Object[]{string, object.getClass().toString()});
            throw new RuntimeException(String.format("Property %s does not exist on target %s", string, object.getClass()));
        }
        try {
            object3 = method2.getParameterTypes()[0];
            if (object3 == Integer.TYPE) {
                method2.invoke(object, Integer.parseInt(object2.toString()));
            } else if (object3 == Long.TYPE) {
                method2.invoke(object, Long.parseLong(object2.toString()));
            } else if (object3 == Short.TYPE) {
                method2.invoke(object, Short.parseShort(object2.toString()));
            } else if (object3 == Boolean.TYPE || object3 == Boolean.class) {
                method2.invoke(object, Boolean.parseBoolean(object2.toString()));
            } else if (object3 == String.class) {
                method2.invoke(object, object2.toString());
            } else {
                try {
                    kI2.b("Try to create a new instance of \"{}\"", new Object[]{object2});
                    method2.invoke(object, Class.forName(object2.toString()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                }
                catch (ClassNotFoundException | InstantiationException reflectiveOperationException) {
                    kI2.b("Class \"{}\" not found or could not instantiate it (Default constructor)", new Object[]{object2});
                    method2.invoke(object, object2);
                }
            }
        }
        catch (Exception exception) {
            kI2.a("Failed to set property %s on target %s", new Object[]{string, object.getClass().toString(), exception});
            throw new RuntimeException(exception);
        }
    }

    private static final /* synthetic */ boolean b(String string, Method method) {
        return method.getName().equals(string) && method.getParameterCount() == 1;
    }
}

