package litebans;

import java.io.BufferedReader;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;

static final class ReaderHandler
implements LiteBansModule_295 {
    private final BufferedReader BaseCoreGenericHandler;
    public ReaderHandler(@NotNull BufferedReader bufferedReader) {
        ObjectUtilities.BaseCoreGenericHandler((Object)bufferedReader, "reader");
        this.plugin = bufferedReader;
    }

    @Override
    public Iterator BaseCoreGenericHandler() {
        return new LiteBansModule_125(this);
    }

    public static final /* synthetic */ BufferedReader BaseCoreGenericHandler(ReaderHandler b12) {
        return b12.BaseCoreGenericHandler;
}

