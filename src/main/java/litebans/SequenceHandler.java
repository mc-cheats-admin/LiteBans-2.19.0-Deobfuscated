package litebans;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import org.jetbrains.annotations.NotNull;

public final class SequenceHandler
implements LiteBansModule_295 {
    private final AtomicReference BaseCoreGenericHandler;
    public SequenceHandler(@NotNull LiteBansModule_295 i_2) {
        ObjectUtilities.BaseCoreGenericHandler(i_2, "sequence");
        this.plugin = new AtomicReference<LiteBansModule_295>(i_2);
    }

    @Override
    public Iterator BaseCoreGenericHandler() {
        LiteBansModule_295 i_2 = this.plugin.getAndSet(null);
        if (i_2 == null) {
            throw new IllegalStateException("This sequence can be consumed only ");
        }
        LiteBansModule_295 i_3 = i_2;
        return i_3.BaseCoreGenericHandler();
}

