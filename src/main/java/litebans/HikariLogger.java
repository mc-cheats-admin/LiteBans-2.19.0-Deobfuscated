package litebans;

import java.util.ResourceBundle;
import java.util.function.Supplier;
import java.util.logging.Filter;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

public class HikariLogger
extends Logger {
    public static boolean LiteBansModule_31 = false;
    private static Logger BaseCoreGenericHandler = Logger.getLogger("HikariLogger");
    private static HikariLogger c = new HikariLogger("HikariLogger");

    protected HikariLogger(String string) {
        super(string, null);
    }

    public static HikariLogger BaseCoreGenericHandler(Class clazz) {
        return c;
    }

    public static void BaseCoreGenericHandler(Logger logger) {
        BaseCoreGenericHandler = logger;
    }

    @Override
    public void addHandler(Handler handler) {
        BaseCoreGenericHandler.addHandler(handler);
    }

    @Override
    public void config(String string) {
        BaseCoreGenericHandler.config(string);
    }

    public void LiteBansModule_31(String string, Object[] objectArray) {
    }

    @Override
    public void entering(String string, String string2) {
        BaseCoreGenericHandler.entering(string, string2);
    }

    @Override
    public void entering(String string, String string2, Object object) {
        BaseCoreGenericHandler.entering(string, string2, object);
    }

    @Override
    public void entering(String string, String string2, Object[] objectArray) {
        BaseCoreGenericHandler.entering(string, string2, objectArray);
    }

    public void BaseCoreGenericHandler(String string, Object[] objectArray) {
        BaseCoreGenericHandler.log(Level.SEVERE, String.format(string, objectArray));
    }

    @Override
    public void exiting(String string, String string2) {
        BaseCoreGenericHandler.exiting(string, string2);
    }

    @Override
    public void exiting(String string, String string2, Object object) {
        BaseCoreGenericHandler.exiting(string, string2, object);
    }

    @Override
    public void fine(String string) {
        BaseCoreGenericHandler.fine(string);
    }

    public void fine(Supplier supplier) {
        BaseCoreGenericHandler.fine(supplier);
    }

    @Override
    public void finer(String string) {
        BaseCoreGenericHandler.finer(string);
    }

    public void finer(Supplier supplier) {
        BaseCoreGenericHandler.finer(supplier);
    }

    @Override
    public void finest(String string) {
    }

    public void finest(Supplier supplier) {
    }

    @Override
    public Filter getFilter() {
        return BaseCoreGenericHandler.getFilter();
    }

    @Override
    public void setFilter(Filter filter) {
        BaseCoreGenericHandler.setFilter(filter);
    }

    @Override
    public Handler[] getHandlers() {
        return BaseCoreGenericHandler.getHandlers();
    }

    @Override
    public Level getLevel() {
        return BaseCoreGenericHandler.getLevel();
    }

    @Override
    public void setLevel(Level level) {
        BaseCoreGenericHandler.setLevel(level);
    }

    @Override
    public String getName() {
        return BaseCoreGenericHandler.getName();
    }

    @Override
    public Logger getParent() {
        return BaseCoreGenericHandler.getParent();
    }

    @Override
    public void setParent(Logger logger) {
        BaseCoreGenericHandler.setParent(logger);
    }

    @Override
    public ResourceBundle getResourceBundle() {
        return BaseCoreGenericHandler.getResourceBundle();
    }

    @Override
    public void setResourceBundle(ResourceBundle resourceBundle) {
        BaseCoreGenericHandler.setResourceBundle(resourceBundle);
    }

    @Override
    public String getResourceBundleName() {
        return BaseCoreGenericHandler.getResourceBundleName();
    }

    @Override
    public boolean getUseParentHandlers() {
        return BaseCoreGenericHandler.getUseParentHandlers();
    }

    @Override
    public void setUseParentHandlers(boolean flag) {
        BaseCoreGenericHandler.setUseParentHandlers(flag);
    }

    public void AsyncBackgroundTask_5(String string, Object[] objectArray) {
        this.log(Level.INFO, String.format(string, objectArray));
    }

    @Override
    public void info(String string) {
        BaseCoreGenericHandler.info(string);
    }

    public void info(Supplier supplier) {
        BaseCoreGenericHandler.info(supplier);
    }

    public boolean BaseCoreGenericHandler() {
        return false;
    }

    @Override
    public boolean isLoggable(Level level) {
        return BaseCoreGenericHandler.isLoggable(level);
    }

    @Override
    public void log(LogRecord logRecord) {
        BaseCoreGenericHandler.log(logRecord);
    }

    @Override
    public void log(Level level, String string) {
        BaseCoreGenericHandler.log(level, string);
    }

    public void log(Level level, Supplier supplier) {
        BaseCoreGenericHandler.log(level, supplier);
    }

    @Override
    public void log(Level level, String string, Object object) {
        BaseCoreGenericHandler.log(level, string, object);
    }

    @Override
    public void log(Level level, String string, Object[] objectArray) {
        BaseCoreGenericHandler.log(level, string, objectArray);
    }

    @Override
    public void log(Level level, String string, Throwable throwable) {
        BaseCoreGenericHandler.log(level, string, throwable);
    }

    public void log(Level level, Throwable throwable, Supplier supplier) {
        BaseCoreGenericHandler.log(level, throwable, supplier);
    }

    @Override
    public void logp(Level level, String string, String string2, String string3) {
        BaseCoreGenericHandler.logp(level, string, string2, string3);
    }

    public void logp(Level level, String string, String string2, Supplier supplier) {
        BaseCoreGenericHandler.logp(level, string, string2, supplier);
    }

    @Override
    public void logp(Level level, String string, String string2, String string3, Object object) {
        BaseCoreGenericHandler.logp(level, string, string2, string3, object);
    }

    @Override
    public void logp(Level level, String string, String string2, String string3, Object[] objectArray) {
        BaseCoreGenericHandler.logp(level, string, string2, string3, objectArray);
    }

    @Override
    public void logp(Level level, String string, String string2, String string3, Throwable throwable) {
        BaseCoreGenericHandler.logp(level, string, string2, string3, throwable);
    }

    public void logp(Level level, String string, String string2, Throwable throwable, Supplier supplier) {
        BaseCoreGenericHandler.logp(level, string, string2, throwable, supplier);
    }

    @Override
    public void logrb(Level level, String string, String string2, ResourceBundle resourceBundle, String string3, Object[] objectArray) {
        BaseCoreGenericHandler.logrb(level, string, string2, resourceBundle, string3, objectArray);
    }

    @Override
    public void logrb(Level level, String string, String string2, ResourceBundle resourceBundle, String string3, Throwable throwable) {
        BaseCoreGenericHandler.logrb(level, string, string2, resourceBundle, string3, throwable);
    }

    @Override
    public void removeHandler(Handler handler) {
        BaseCoreGenericHandler.removeHandler(handler);
    }

    @Override
    public void severe(String string) {
        BaseCoreGenericHandler.severe(string);
    }

    public void severe(Supplier supplier) {
        BaseCoreGenericHandler.severe(supplier);
    }

    @Override
    public void throwing(String string, String string2, Throwable throwable) {
        BaseCoreGenericHandler.throwing(string, string2, throwable);
    }

    public void c(String string, Object[] objectArray) {
        this.log(Level.WARNING, String.format(string, objectArray));
    }

    @Override
    public void warning(String string) {
        BaseCoreGenericHandler.warning(string);
    }

    public void warning(Supplier supplier) {
        BaseCoreGenericHandler.warning(supplier);
}

