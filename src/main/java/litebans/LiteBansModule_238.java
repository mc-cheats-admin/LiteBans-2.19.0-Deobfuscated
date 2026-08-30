package litebans;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;

public final class LiteBansModule_238
extends MessageHandler {
    private final String[] e;
    public LiteBansModule_238(@NotNull String[] args, @NotNull PlatformPlugin plugin) {
        super(plugin);
        this.e = args;
    }

    @Override
    public void run() {
        Object object;
        BanHandler a_22;
        int n;
        LiteBansModule_324 iX2;
{
            iX2 = new LiteBansModule_324(0L, 1, null);
            BanHandler[] a_Array = BanHandler.values();
            n = 0;
            for (BanHandler a_22 : a_Array) {
                object = a_22;
                if (!ObjectUtilities.BaseCoreGenericHandler((Object)((Enum)object).name(), (Object)this.e[1])) {
                    continue;
                }
                break;
            }
            throw new NoSuchElementException("Array contains no element matching the ");
        }
        BanHandler a_3 = a_22;
        int n2 = Integer.parseInt(this.e[2]);
        n = Integer.parseInt(this.e[3]);
        int n3 = Integer.parseInt(this.e[4]);
        int n4 = 15;
        int n5 = 40;
        object = new ArrayList(n2);
        List list = new ArrayList(n2);
        MessageHandler messageHandler = this;
        ((DatabaseMonitorService)messageHandler.LiteBansModule_240().BaseCoreGenericHandler(DatabaseMonitorService.class)).BaseCoreGenericHandler(arg_0 -> LiteBansModule_238.BaseCoreGenericHandler(this, n2, (List)object, iX2, n5, n, n3, n4, a_3, list, arg_0));
    }

    private static final KotlinUnitHandler BaseCoreGenericHandler(LiteBansModule_238 gw2, int n, List list, LiteBansModule_324 iX2, int n2, int n3, int n4, int n5, BanHandler a_2, List list2, LiteBansModule_82 ch2) {
        boolean flag;
        boolean flag2;
        Object object;
        int n6;
        if (ch2.LiteBansModule_31()) {
            CommandArgumentUtils.BaseCoreGenericHandler((MessageHandler)gw2, MessageKey.ServerEventListener);
            return KotlinUnitHandler.BaseCoreGenericHandler;
        }
        for (int i = 0; i < n; ++i) {
            list.add(new UUID(iX2.LiteBansModule_31(), iX2.LiteBansModule_31()).toString());
        }
        CommandArgumentUtils.BaseCoreGenericHandler((MessageHandler)gw2, (CharSequence)LiteBansModule_242.BaseCoreGenericHandler(BlackHandler.i, "Generating entries.. + "));
        long l3 = DatabaseMonitorService.BaseCoreGenericHandler(ch2.AsyncBackgroundTask_5(), false, 1, null);
        for (n6 = 0; n6 < n; ++n6) {
            object = (String)list.get(n6);
            flag2 = iX2.BaseCoreGenericHandler(100) < n2;
            boolean flag3 = iX2.BaseCoreGenericHandler(100) < n3;
            boolean flag4 = flag3 && n4 > 0 && iX2.BaseCoreGenericHandler(100) < n4;
            boolean flag5 = iX2.BaseCoreGenericHandler(100) < n5;
            flag = !flag5;
            long l5 = 0L;
            if (flag2) {
                l5 = 0L;
            } else {
                l5 = l3 + (long)300000000 + (long)iX2.BaseCoreGenericHandler(1000000000);
                if (flag5) {
                    l5 = l3 - (long)iX2.BaseCoreGenericHandler(10000000);
}
            int n7 = iX2.BaseCoreGenericHandler(252) + 2;
            int n8 = iX2.BaseCoreGenericHandler(252) + 2;
            int n9 = iX2.BaseCoreGenericHandler(252) + 2;
            String string = String.valueOf(iX2.BaseCoreGenericHandler(252) + 2);
            if (flag3 && flag4) {
                string = "%";
            }
            String string2 = "" + n7 + '.' + n8 + '.' + n9 + '.' + string;
            SilentHandler dZ2 = new SilentHandler(a_2, (String)object, string2, "", "", "", "*", "", l3, l5, 0, false, flag3, flag, 0L, 17408, null);
            list2.add(dZ2);
        }
        CommandArgumentUtils.BaseCoreGenericHandler((MessageHandler)gw2, (CharSequence)LiteBansModule_242.BaseCoreGenericHandler(BlackHandler.i, "Adding entries.. + "));
        object = gw2;
        flag2 = false;
        n6 = ((ConfigService)((MessageHandler)object).LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class)).BaseCoreGenericHandler();
        object = gw2;
        flag2 = false;
        ((ConfigService)((MessageHandler)object).LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class)).BaseCoreGenericHandler((byte)0);
        object = list2;
        flag2 = false;
        Iterator iterator = object.iterator();
        while (iterator.hasNext()) {
            Object t2 = iterator.next();
            SilentHandler dZ3 = (SilentHandler)t2;
            flag = false;
            ch2.c(dZ3);
        }
        object = gw2;
        flag2 = false;
        ((ConfigService)((MessageHandler)object).LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class)).BaseCoreGenericHandler((byte)n6);
        long l7 = DatabaseMonitorService.BaseCoreGenericHandler(ch2.AsyncBackgroundTask_5(), false, 1, null);
        CommandArgumentUtils.BaseCoreGenericHandler((MessageHandler)gw2, (CharSequence)(LiteBansModule_242.BaseCoreGenericHandler(BlackHandler.i, "Done InitializerHandler_3 ") + (l7 - l3) + " "));
        return KotlinUnitHandler.BaseCoreGenericHandler;
    }

    private static final void BaseCoreGenericHandler() {
        AsyncBackgroundTask_5 = new String[]{"Array contains no element matching the ", "Generating entries.. + ", "%", "", "", "", "*", "", "Adding entries.. + ", "Done InitializerHandler_3 ", " ms."};
}

