package litebans;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class AllHandler
implements CharSequence {
    private final PlatformPlugin LiteBansModule_31;
    private String AsyncBackgroundTask_5;
    private final byte c;
    public AllHandler(@NotNull PlatformPlugin plugin, @Nullable String string) {
        byte by2;
        this.LiteBansModule_31 = plugin;
        this.AsyncBackgroundTask_5 = string;
        this.AsyncBackgroundTask_5 = LiteBansModule_181.LiteBansModule_194.c(this.AsyncBackgroundTask_5);
        AllHandler jJ2 = this;
        if (ObjectUtilities.BaseCoreGenericHandler(jJ2.AsyncBackgroundTask_5, (Object)"__ALL__")) {
            by2 = 0;
        } else {
            String string2 = jJ2.AsyncBackgroundTask_5().ServerSyncService();
            byte by3 = 1;
            if (jJ2.AsyncBackgroundTask_5 != null && !LiteBansModule_181.LiteBansModule_194.LiteBansModule_31(jJ2.AsyncBackgroundTask_5)) {
                by3 = (byte)(by3 + 1);
            }
            if (jJ2.LiteBansModule_31.LiteBansModule_401() && !ObjectUtilities.BaseCoreGenericHandler(string2, jJ2.AsyncBackgroundTask_5)) {
                by3 = (byte)(by3 + 1);
            }
            by2 = by3;
        }
        this.c = by2;
    }

    public final String c() {
        return this.AsyncBackgroundTask_5;
    }

    public final DatabaseMonitorService AsyncBackgroundTask_5() {
        return this.LiteBansModule_31.BaseCoreGenericHandler(DatabaseMonitorService.class);
    }

    public void BaseCoreGenericHandler(@NotNull LiteBansModule_60 bT2) {
        if (this.c >= 2) {
            bT2.BaseCoreGenericHandler(this.AsyncBackgroundTask_5);
        }
        if (this.c >= 3) {
            bT2.BaseCoreGenericHandler(this.AsyncBackgroundTask_5().ServerSyncService());
}

    public int BaseCoreGenericHandler() {
        return this.toString().length();
    }

    public char BaseCoreGenericHandler(int n) {
        return this.toString().charAt(n);
    }

    @Override
    public CharSequence subSequence(int n, int n2) {
        return this.toString().subSequence(n, n2);
    }

    @Override
    public String toString() {
        String string;
        switch (this.c) {
            case 0: {
                string = "";
                break;
            }
            case 1: {
                string = " AND(server_scope='*')";
                break;
            }
            case 2: {
                string = " AND(server_scope='*' OR server_scope=?)";
                break;
            }
            case 3: {
                string = " AND(server_scope='*' OR server_scope=? OR server_scope=?)";
                break;
            }
            default: {
                throw new LiteBansModule_132();
}
        return string;
    }

    @Override
    public final int length() {
        return this.plugin();
    }

    @Override
    public final char charAt(int n) {
        return this.plugin(n);
    }

    private static final void LiteBansModule_31() {
        BaseCoreGenericHandler = new String[]{"__ALL__", "__ALL__", "", " AND(server_scope='*')", " AND(server_scope='*' OR server_scope=?)", " AND(server_scope='*' OR server_scope=? OR server_scope=?)"};
}

