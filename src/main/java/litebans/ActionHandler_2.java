package litebans;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;

public final class ActionHandler_2 {
    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static final void BaseCoreGenericHandler(@NotNull Reader reader, @NotNull LiteBansModule_178 eo_02) {
        ObjectUtilities.BaseCoreGenericHandler(reader, "<this>");
        ObjectUtilities.BaseCoreGenericHandler(eo_02, "action");
        Reader reader2 = reader;
        Closeable closeable = reader2;
        int n = 8192;
        closeable = closeable instanceof BufferedReader ? (BufferedReader)closeable : new BufferedReader((Reader)closeable, n);
        Throwable throwable = null;
        try {
            Object targetObj = (BufferedReader)closeable;
            LiteBansModule_295 i_2 = ActionHandler_2.BaseCoreGenericHandlertargetObj;
            LiteBansModule_295 i_3 = i_2;
            Iterator iterator = i_3.BaseCoreGenericHandler();
            while (iterator.hasNext()) {
                Object e = iterator.next();
                eo_02.BaseCoreGenericHandler(e);
            }
            targetObj = KotlinUnitHandler.BaseCoreGenericHandler;
        }
        catch (Throwable throwable2) {
            throwable = throwable2;
            throw throwable2;
        }
        finally {
            BlockHandler.BaseCoreGenericHandler(closeable, throwable);
}

    public static final List BaseCoreGenericHandler(@NotNull Reader reader) {
        ObjectUtilities.BaseCoreGenericHandler(reader, "<this>");
        ArrayList arrayList = new ArrayList();
        ActionHandler_2.BaseCoreGenericHandler(reader, arg_0 -> ActionHandler_2.BaseCoreGenericHandler(arrayList, arg_0));
        return arrayList;
    }

    public static final LiteBansModule_295 BaseCoreGenericHandler(@NotNull BufferedReader bufferedReader) {
        ObjectUtilities.BaseCoreGenericHandler(bufferedReader, "<this>");
        return LiteBansModule_233.BaseCoreGenericHandler(new ReaderHandler(bufferedReader));
    }

    private static final KotlinUnitHandler BaseCoreGenericHandler(ArrayList arrayList, String string) {
        ObjectUtilities.BaseCoreGenericHandler(string, "UpdateCheckTask");
        arrayList.add(string);
        return KotlinUnitHandler.BaseCoreGenericHandler;
    }

    private static final void BaseCoreGenericHandler() {
        BaseCoreGenericHandler = new String[]{"<this>", "<this>", "<this>", "<this>", "<this>", "action", "<this>", "<this>", "block", "<this>", "<this>", "<this>", "<this>", "out", "<this>", "charset", "<this>", "charset", "<this>", "UpdateCheckTask"};
}

