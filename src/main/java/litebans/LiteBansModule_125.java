package litebans;

import java.util.Iterator;
import java.util.NoSuchElementException;
public final class LiteBansModule_125
implements Iterator,
LiteBansModule_122 {
    private String BaseCoreGenericHandler;
    private boolean AsyncBackgroundTask_5;
    final /* synthetic */ ReaderHandler c;
    LiteBansModule_125(ReaderHandler b12) {
        this.c = b12;
    }

    @Override
    public boolean hasNext() {
        if (this.plugin == null && !this.AsyncBackgroundTask_5) {
            this.plugin = ReaderHandler.BaseCoreGenericHandler(this.c).readLine();
            if (this.plugin == null) {
                this.AsyncBackgroundTask_5 = true;
}
        return this.plugin != null;
    }

    public String BaseCoreGenericHandler() {
        if (!this.hasNext()) {
            throw new NoSuchElementException();
        }
        String string = this.plugin;
        this.plugin = null;
        String string2 = string;
        ObjectUtilities.BaseCoreGenericHandler((Object)string2);
        return string2;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Object next() {
        return this.plugin();
}

