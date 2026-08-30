package litebans;

import java.util.ResourceBundle;
import java.util.function.Supplier;
import java.util.logging.Filter;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

public static class kI
extends Logger {
    public static boolean b = false;
    private static Logger a = Logger.getLogger("HikariLogger");
    private static kI c = new kI("HikariLogger");

    protected kI(String string) {
        super(string, null);
    }

    public static kI a(Class clazz) {
        return c;
    }

    public static void a(Logger logger) {
        a = logger;
    }

    @Override
    public void addHandler(Handler handler) {
        a.addHandler(handler);
    }

    @Override
    public void config(String string) {
        a.config(string);
    }

    public void b(String string, Object[] objectArray) {
    }

    @Override
    public void entering(String string, String string2) {
        a.entering(string, string2);
    }

    @Override
    public void entering(String string, String string2, Object object) {
        a.entering(string, string2, object);
    }

    @Override
    public void entering(String string, String string2, Object[] objectArray) {
        a.entering(string, string2, objectArray);
    }

    public void a(String string, Object[] objectArray) {
        a.log(Level.SEVERE, String.format(string, objectArray));
    }

    @Override
    public void exiting(String string, String string2) {
        a.exiting(string, string2);
    }

    @Override
    public void exiting(String string, String string2, Object object) {
        a.exiting(string, string2, object);
    }

    @Override
    public void fine(String string) {
        a.fine(string);
    }

    public void fine(Supplier supplier) {
        a.fine(supplier);
    }

    @Override
    public void finer(String string) {
        a.finer(string);
    }

    public void finer(Supplier supplier) {
        a.finer(supplier);
    }

    @Override
    public void finest(String string) {
    }

    public void finest(Supplier supplier) {
    }

    @Override
    public Filter getFilter() {
        return a.getFilter();
    }

    @Override
    public void setFilter(Filter filter) {
        a.setFilter(filter);
    }

    @Override
    public Handler[] getHandlers() {
        return a.getHandlers();
    }

    @Override
    public Level getLevel() {
        return a.getLevel();
    }

    @Override
    public void setLevel(Level level) {
        a.setLevel(level);
    }

    @Override
    public String getName() {
        return a.getName();
    }

    @Override
    public Logger getParent() {
        return a.getParent();
    }

    @Override
    public void setParent(Logger logger) {
        a.setParent(logger);
    }

    @Override
    public ResourceBundle getResourceBundle() {
        return a.getResourceBundle();
    }

    @Override
    public void setResourceBundle(ResourceBundle resourceBundle) {
        a.setResourceBundle(resourceBundle);
    }

    @Override
    public String getResourceBundleName() {
        return a.getResourceBundleName();
    }

    @Override
    public boolean getUseParentHandlers() {
        return a.getUseParentHandlers();
    }

    @Override
    public void setUseParentHandlers(boolean bl) {
        a.setUseParentHandlers(bl);
    }

    public void d(String string, Object[] objectArray) {
        this.log(Level.INFO, String.format(string, objectArray));
    }

    @Override
    public void info(String string) {
        a.info(string);
    }

    public void info(Supplier supplier) {
        a.info(supplier);
    }

    public boolean a() {
        return false;
    }

    @Override
    public boolean isLoggable(Level level) {
        return a.isLoggable(level);
    }

    @Override
    public void log(LogRecord logRecord) {
        a.log(logRecord);
    }

    @Override
    public void log(Level level, String string) {
        a.log(level, string);
    }

    public void log(Level level, Supplier supplier) {
        a.log(level, supplier);
    }

    @Override
    public void log(Level level, String string, Object object) {
        a.log(level, string, object);
    }

    @Override
    public void log(Level level, String string, Object[] objectArray) {
        a.log(level, string, objectArray);
    }

    @Override
    public void log(Level level, String string, Throwable throwable) {
        a.log(level, string, throwable);
    }

    public void log(Level level, Throwable throwable, Supplier supplier) {
        a.log(level, throwable, supplier);
    }

    @Override
    public void logp(Level level, String string, String string2, String string3) {
        a.logp(level, string, string2, string3);
    }

    public void logp(Level level, String string, String string2, Supplier supplier) {
        a.logp(level, string, string2, supplier);
    }

    @Override
    public void logp(Level level, String string, String string2, String string3, Object object) {
        a.logp(level, string, string2, string3, object);
    }

    @Override
    public void logp(Level level, String string, String string2, String string3, Object[] objectArray) {
        a.logp(level, string, string2, string3, objectArray);
    }

    @Override
    public void logp(Level level, String string, String string2, String string3, Throwable throwable) {
        a.logp(level, string, string2, string3, throwable);
    }

    public void logp(Level level, String string, String string2, Throwable throwable, Supplier supplier) {
        a.logp(level, string, string2, throwable, supplier);
    }

    @Override
    public void logrb(Level level, String string, String string2, ResourceBundle resourceBundle, String string3, Object[] objectArray) {
        a.logrb(level, string, string2, resourceBundle, string3, objectArray);
    }

    @Override
    public void logrb(Level level, String string, String string2, ResourceBundle resourceBundle, String string3, Throwable throwable) {
        a.logrb(level, string, string2, resourceBundle, string3, throwable);
    }

    @Override
    public void removeHandler(Handler handler) {
        a.removeHandler(handler);
    }

    @Override
    public void severe(String string) {
        a.severe(string);
    }

    public void severe(Supplier supplier) {
        a.severe(supplier);
    }

    @Override
    public void throwing(String string, String string2, Throwable throwable) {
        a.throwing(string, string2, throwable);
    }

    public void c(String string, Object[] objectArray) {
        this.log(Level.WARNING, String.format(string, objectArray));
    }

    @Override
    public void warning(String string) {
        a.warning(string);
    }

    public void warning(Supplier supplier) {
        a.warning(supplier);
    }
}

