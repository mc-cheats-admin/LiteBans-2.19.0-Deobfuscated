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
public final class SetHandler {
    private static final Pattern BaseCoreGenericHandler = Pattern.compile("(get|is)[A-NullHandler_8].+");

    private SetHandler() {
    }

    public static void BaseCoreGenericHandler(Object targetObj, Properties properties) {
        if (targetObj == null || properties == null) {
            return;
        }
        List<Method> list = Arrays.asList(targetObj.getClass().getMethods());
        properties.forEach((contextObj, resultObj) -> {
            if (targetObj instanceof HikariConfig && contextObj.toString().startsWith("")) {
                ((HikariConfig)targetObj).BaseCoreGenericHandler(contextObj.toString().substring("".length()), resultObj);
            } else {
                SetHandler.BaseCoreGenericHandler(targetObj, contextObj.toString(), resultObj, list);
            }
        });
    }

    public static Set BaseCoreGenericHandler(Class clazz) {
        HashSet<String> hashSet = new HashSet<String>();
        Matcher matcher = BaseCoreGenericHandler.matcher("");
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

    public static Object BaseCoreGenericHandler(String string, Object targetObj) {
        try {
            String string2 = "get" + string.substring(0, 1).toUpperCase(Locale.ENGLISH) + string.substring(1);
            Method method = targetObj.getClass().getMethod(string2, new Class[0]);
            return method.invoke(targetObj, new Object[0]);
        }
        catch (Exception exception) {
            try {
                String string3 = "is" + string.substring(0, 1).toUpperCase(Locale.ENGLISH) + string.substring(1);
                Method method = targetObj.getClass().getMethod(string3, new Class[0]);
                return method.invoke(targetObj, new Object[0]);
            }
            catch (Exception exception2) {
                return null;
            }
        }
    }

    public static Properties BaseCoreGenericHandler(Properties properties) {
        Properties properties2 = new Properties();
        properties.forEach((targetObj, contextObj) -> properties2.setProperty(targetObj.toString(), contextObj.toString()));
        return properties2;
    }

    private static final void BaseCoreGenericHandler(Object targetObj, String string, Object contextObj, List list) {
        HikariLogger kI2 = HikariLogger.BaseCoreGenericHandler(SetHandler.class);
        String string2 = "set" + string.substring(0, 1).toUpperCase(Locale.ENGLISH) + string.substring(1);
        Method method2 = list.stream().filter(method -> method.getName().equals(string2) && method.getParameterCount() == 1).findFirst().orElse(null);
        if (method2 == null) {
            resultObj = "set" + string.toUpperCase(Locale.ENGLISH);
            method2 = list.stream().filter(arg_0 -> SetHandler.LiteBansModule_31((String)resultObj, arg_0)).findFirst().orElse(null);
        }
        if (method2 == null) {
            kI2.BaseCoreGenericHandler("Property %AsyncBackgroundTask_21 does not exist on target %AsyncBackgroundTask_21", new Object[]{string, targetObj.getClass().toString()});
            throw new RuntimeException(String.format("Property %AsyncBackgroundTask_21 does not exist on target %AsyncBackgroundTask_21", string, targetObj.getClass()));
        }
        try {
            resultObj = method2.getParameterTypes()[0];
            if (resultObj == Integer.TYPE) {
                method2.invoke(targetObj, Integer.parseInt(contextObj.toString()));
            } else if (resultObj == Long.TYPE) {
                method2.invoke(targetObj, Long.parseLong(contextObj.toString()));
            } else if (resultObj == Short.TYPE) {
                method2.invoke(targetObj, Short.parseShort(contextObj.toString()));
            } else if (resultObj == Boolean.TYPE || resultObj == Boolean.class) {
                method2.invoke(targetObj, Boolean.parseBoolean(contextObj.toString()));
            } else if (resultObj == String.class) {
                method2.invoke(targetObj, contextObj.toString());
            } else {
                try {
                    kI2.LiteBansModule_31("Try to create BaseCoreGenericHandler new instance of \"{}\"", new Object[]{contextObj});
                    method2.invoke(targetObj, Class.forName(contextObj.toString()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                }
                catch (ClassNotFoundException | InstantiationException reflectiveOperationException) {
                    kI2.LiteBansModule_31("Class \"{}\" not found or could not instantiate UpdateCheckTask (Default constructor)", new Object[]{contextObj});
                    method2.invoke(targetObj, contextObj);
                }
            }
        }
        catch (Exception exception) {
            kI2.BaseCoreGenericHandler("Failed to set property %AsyncBackgroundTask_21 on target %AsyncBackgroundTask_21", new Object[]{string, targetObj.getClass().toString(), exception});
            throw new RuntimeException(exception);
        }
    }

    private static final /* synthetic */ boolean LiteBansModule_31(String string, Method method) {
        return method.getName().equals(string) && method.getParameterCount() == 1;
    }
}

