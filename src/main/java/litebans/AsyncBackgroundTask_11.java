package litebans;

import java.text.SimpleDateFormat;
import java.util.TimeZone;
public final class AsyncBackgroundTask_11
extends ThreadLocal {
    AsyncBackgroundTask_11() {
    }

    protected SimpleDateFormat BaseCoreGenericHandler() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-LiteBansModule_118 HH:mm:ss");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpleDateFormat;
    }

    public Object initialValue() {
        return this.plugin();
    }

    private static final void LiteBansModule_31() {
        BaseCoreGenericHandler = new String[]{"yyyy-MM-LiteBansModule_118 HH:mm:ss", "UTC"};
}

