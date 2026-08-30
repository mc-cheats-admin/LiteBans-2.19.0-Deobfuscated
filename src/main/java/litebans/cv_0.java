package litebans;

import java.util.ResourceBundle;
import java.util.function.Supplier;
import java.util.logging.Filter;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import litebans.hl;
import org.slf4j.Logger;

public class cv_0
extends java.util.logging.Logger {
    private final Logger b;
    private static /* synthetic */ String[] a;

    public cv_0(Logger logger, String string) {
        super(string, null);
        this.b = logger;
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
    public void entering(String string, String string2, Object object) {
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
    public void exiting(String string, String string2, Object object) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void fine(String string) {
        this.b.trace(string);
    }

    public void fine(Supplier supplier) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void finer(String string) {
        this.b.trace(string);
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
        return this.b.getName();
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
    public void setUseParentHandlers(boolean bl) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void info(String string) {
        this.b.info(string);
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
    public void log(Level var1_1, String var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter$TooOptimisticMatchException
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter.getString(SwitchStringRewriter.java:404)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter.access$600(SwitchStringRewriter.java:53)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter$SwitchStringMatchResultCollector.collectMatches(SwitchStringRewriter.java:368)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.ResetAfterTest.match(ResetAfterTest.java:24)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.KleeneN.match(KleeneN.java:24)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.MatchSequence.match(MatchSequence.java:26)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.matchutil.ResetAfterTest.match(ResetAfterTest.java:23)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter.rewriteComplex(SwitchStringRewriter.java:201)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op4rewriters.SwitchStringRewriter.rewrite(SwitchStringRewriter.java:73)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:881)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public void log(Level level, Supplier supplier) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void log(Level level, String string, Object object) {
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
    public void logp(Level level, String string, String string2, String string3, Object object) {
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
        this.b.error(string);
    }

    public void severe(Supplier supplier) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void throwing(String string, String string2, Throwable throwable) {
        throw new UnsupportedOperationException();
    }

    public void a(String string) {
        this.b.warn(string);
    }

    @Override
    public void warning(String string) {
        this.b.warn(string);
    }

    public void warning(Supplier supplier) {
        throw new UnsupportedOperationException();
    }

    private static final void a() {
        a = new String[]{"WARNING", "SEVERE"};
    }

    static {
        cv_0.a();
    }
}

