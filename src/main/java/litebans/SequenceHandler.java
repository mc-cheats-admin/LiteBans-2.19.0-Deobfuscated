package litebans;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import org.jetbrains.annotations.NotNull;

public final class SequenceHandler
implements LiteBansModule_296 {
    private final AtomicReference BaseCoreGenericHandler;
        public SequenceHandler(@NotNull LiteBansModule_296 i_2) {
        ObjectUtilities.BaseCoreGenericHandler((Object)i_2, "sequence");
        this.plugin = new AtomicReference<LiteBansModule_296>(i_2);
    }

    @Override
    public Iterator BaseCoreGenericHandler() {
        LiteBansModule_296 i_2 = this.plugin.getAndSet(null);
        if (i_2 == null) {
            throw new IllegalStateException("This sequence can be consumed only ");
        }
        LiteBansModule_296 i_3 = i_2;
        return i_3.BaseCoreGenericHandler();
    }

    private static final void BaseCoreGenericHandler() {
        LiteBansModule_31 = new String[]{"sequence", "This sequence can be consumed only once."};
    }

    static {
        SequenceHandler.BaseCoreGenericHandler();
    }
}

