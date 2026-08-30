package litebans;

import java.util.ResourceBundle;
import java.util.function.Supplier;
import java.util.logging.Filter;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import org.slf4j.Logger;

public class WarningHandler
extends java.util.logging.Logger {
    private final Logger LiteBansModule_31;
        public WarningHandler(Logger logger, String string) {
        super(string, null);
        this.LiteBansModule_31 = logger;
    }

    @Override
    public void addHandler(Handler handler) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void config(String string) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void entering(String string, String string2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void entering(String string, String string2, Object targetObj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void entering(String string, String string2, Object[] objectArray) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void exiting(String string, String string2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void exiting(String string, String string2, Object targetObj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void fine(String string) {
        this.LiteBansModule_31.trace(string);
    }

    public void fine(Supplier supplier) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void finer(String string) {
        this.LiteBansModule_31.trace(string);
    }

    public void finer(Supplier supplier) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void finest(String string) {
    }

    public void finest(Supplier supplier) {
    }

    @Override
    public Filter getFilter() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void setFilter(Filter filter) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Handler[] getHandlers() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Level getLevel() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void setLevel(Level level) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String getName() {
        return this.LiteBansModule_31.getName();
    }

    @Override
    public java.util.logging.Logger getParent() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void setParent(java.util.logging.Logger logger) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ResourceBundle getResourceBundle() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void setResourceBundle(ResourceBundle resourceBundle) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String getResourceBundleName() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean getUseParentHandlers() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void setUseParentHandlers(boolean flag) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void info(String string) {
        this.LiteBansModule_31.info(string);
    }

    public void info(Supplier supplier) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean isLoggable(Level level) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void log(LogRecord logRecord) {
        throw new UnsupportedOperationException();
    }

    /*
     * Exception decompiling
     */
    @Override
    public void log(Level v1, String v2) {
        /*
         * This method has failed to decompile.  When submitting BaseCoreGenericHandler bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter$TooOptimisticMatchException
         *     LiteBansModule_21 org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter.getString(SwitchStringRewriter.java:404)
         *     LiteBansModule_21 org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter.access$600(SwitchStringRewriter.java:53)
         *     LiteBansModule_21 org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter$SwitchStringMatchResultCollector.collectMatches(SwitchStringRewriter.java:368)
         *     LiteBansModule_21 org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.ResetAfterTest.match(ResetAfterTest.java:24)
         *     LiteBansModule_21 org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.KleeneN.match(KleeneN.java:24)
         *     LiteBansModule_21 org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.MatchSequence.match(MatchSequence.java:26)
         *     LiteBansModule_21 org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.ResetAfterTest.match(ResetAfterTest.java:23)
         *     LiteBansModule_21 org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter.rewriteComplex(SwitchStringRewriter.java:201)
         *     LiteBansModule_21 org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter.rewrite(SwitchStringRewriter.java:73)
         *     LiteBansModule_21 org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:881)
         *     LiteBansModule_21 org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     LiteBansModule_21 org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     LiteBansModule_21 org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     LiteBansModule_21 org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     LiteBansModule_21 org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     LiteBansModule_21 org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     LiteBansModule_21 org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     LiteBansModule_21 org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     LiteBansModule_21 org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     LiteBansModule_21 org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public void log(Level level, Supplier supplier) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void log(Level level, String string, Object targetObj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void log(Level level, String string, Object[] objectArray) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void log(Level level, String string, Throwable throwable) {
        throw new UnsupportedOperationException();
    }

    public void log(Level level, Throwable throwable, Supplier supplier) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void logp(Level level, String string, String string2, String string3) {
        throw new UnsupportedOperationException();
    }

    public void logp(Level level, String string, String string2, Supplier supplier) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void logp(Level level, String string, String string2, String string3, Object targetObj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void logp(Level level, String string, String string2, String string3, Object[] objectArray) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void logp(Level level, String string, String string2, String string3, Throwable throwable) {
        throw new UnsupportedOperationException();
    }

    public void logp(Level level, String string, String string2, Throwable throwable, Supplier supplier) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void logrb(Level level, String string, String string2, ResourceBundle resourceBundle, String string3, Object[] objectArray) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void logrb(Level level, String string, String string2, ResourceBundle resourceBundle, String string3, Throwable throwable) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void removeHandler(Handler handler) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void severe(String string) {
        this.LiteBansModule_31.error(string);
    }

    public void severe(Supplier supplier) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void throwing(String string, String string2, Throwable throwable) {
        throw new UnsupportedOperationException();
    }

    public void BaseCoreGenericHandler(String string) {
        this.LiteBansModule_31.warn(string);
    }

    @Override
    public void warning(String string) {
        this.LiteBansModule_31.warn(string);
    }

    public void warning(Supplier supplier) {
        throw new UnsupportedOperationException();
    }

    private static final void BaseCoreGenericHandler() {
        BaseCoreGenericHandler = new String[]{"WARNING", "SEVERE"};
    }

    static {
        WarningHandler.BaseCoreGenericHandler();
    }
}

