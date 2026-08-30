package litebans;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;

public final class GlobalHandler
extends MessageHandler {
    private final String[] g;
    private boolean AsyncBackgroundTask_5;
    private String LiteBansModule_194;
    private DeleteHandler e;
    private LiteBansModule_82 i;
    public GlobalHandler(@NotNull String[] args, @NotNull PlatformPlugin plugin) {
        super(plugin);
        this.g = args;
        this.LiteBansModule_194 = "global";
        this.e = DeleteHandler.c;
    }

    @Override
    public void run() {
        this.LiteBansModule_194 = CommandArgumentUtils.BaseCoreGenericHandler(this, this.AsyncBackgroundTask_5(), this.g, this.LiteBansModule_194);
                ChatFormatter chatFormatter = MessageHandler.BaseCoreGenericHandler;
        boolean flag2 = targetObj.AsyncBackgroundTask_5().LiteBansModule_194();
        Object contextObj = MessageKey.LiteBansModule_31;
        ChatFormatter fo_03 = chatFormatter;
        boolean flag4 = !flag2;
        if (flag4) {
            ChatFormatter fo_04 = fo_03;
            fo_04.BaseCoreGenericHandler(contextObj);
            throw new CommandExitException();
        }
        targetObj = MessageHandler.BaseCoreGenericHandler;
        flag = !ArrayUtilities.LiteBansModule_31(this.g, "confirm");
        if (flag) {
            Object resultObj = targetObj;
            flag2 = false;
            contextObj = this;
            flag3 = false;
            this.BaseCoreGenericHandler(MessageKey.dj.BaseCoreGenericHandler("serverScope", (Object)((GlobalHandler)contextObj).LiteBansModule_194));
            throw new CommandExitException();
        }
        targetObj = this;
        flag = false;
        ((DatabaseMonitorService)targetObj.LiteBansModule_240().BaseCoreGenericHandler(DatabaseMonitorService.class)).BaseCoreGenericHandler(arg_0 -> GlobalHandler.BaseCoreGenericHandler(this, arg_0));
    }

    private static final KotlinUnitHandler BaseCoreGenericHandler(GlobalHandler fm_02, LiteBansModule_82 ch2) {
        List list;
        boolean flag;
        String string;
        Object v1;
        int n;
        Iterator iterator;
{
            String string2;
            boolean t7;
            Object v0;
            boolean flag3;
            boolean flag4;
            DeleteHandler[] jZArray;
            boolean flag5;
{
                object7 = MessageHandler.BaseCoreGenericHandler;
                boolean flag6 = ch2.LiteBansModule_31();
                tempObj = MessageKey.ServerEventListener;
                flag5 = false;
                helperObj = object7;
                if (flag6) {
                    ChatFormatter chatFormatter = helperObj;
                    chatFormatter.BaseCoreGenericHandler(tempObj);
                    throw new CommandExitException();
                }
                object7 = LiteBansModule_242.BaseCoreGenericHandler(ArrayUtilities.AsyncBackgroundTask_5(fm_02.g));
                tempObj = (Iterable)object7;
                flag5 = false;
                helperObj = tempObj.iterator();
                while (helperObj.hasNext()) {
                    Object e = helperObj.next();
                    jZArray = (String)e;
                    flag4 = false;
                    object6 = fm_02;
                    flag3 = false;
                    if (!(!(ObjectUtilities.BaseCoreGenericHandler(jZArray, (Object)"reset-database") || StringUtilities.LiteBansModule_31((String)jZArray, "exclude:", false, 2, null) || StringUtilities.LiteBansModule_31((String)jZArray, "mode:", false, 2, null) || StringUtilities.LiteBansModule_31((String)jZArray, "server:", false, 2, null) || ObjectUtilities.BaseCoreGenericHandler(jZArray, (Object)"-g") || ObjectUtilities.BaseCoreGenericHandler(jZArray, (Object)"confirm")))) continue;
                    v0 = e;
                    break;
}
            String string3 = v0;
            tempObj = MessageHandler.BaseCoreGenericHandler;
            flag5 = string3 != null;
            helperObj = BlackHandler.LiteBansModule_194("Unrecognized parameter: " + BlackHandler.AsyncBackgroundTask_5(string3));
            jZArray = tempObj;
            flag4 = false;
            if (flag5) {
                object6 = jZArray;
                flag3 = false;
                ((ChatFormatter)object6).BaseCoreGenericHandler(helperObj);
                throw new CommandExitException();
            }
            fm_02.i = ch2;
            fm_02.AsyncBackgroundTask_5 = LiteBansModule_181.LiteBansModule_194.LiteBansModule_31(fm_02.LiteBansModule_194);
            tempObj = fm_02.AsyncBackgroundTask_5 ? "__ALL__" : fm_02.LiteBansModule_194;
            helperObj = (Iterable)object7;
            bl9 = false;
            jZArray = helperObj;
            Collection collection = new ArrayList();
            for (Object t2 : jZArray) {
                iterator = (String)t2;
                t7 = false;
                if (!StringUtilities.LiteBansModule_31((String)(iterator), "exclude:reason:", false, 2, null)) continue;
                collection.add(t2);
            }
            helperObj = (List)collection;
            bl9 = false;
            jZArray = helperObj;
            collection = new ArrayList(CollectionUtilities.BaseCoreGenericHandler((Iterable)helperObj, 10));
            bl10 = false;
            for (Object t5 : jZArray) {
                iterator = (String)t5;
                resultObj = collection;
                t7 = false;
                resultObj.add(StringUtilities.BaseCoreGenericHandler((String)(iterator), "exclude:reason:", null, 2, null));
            }
            List list2 = (List)collection;
            jZArray = (Iterable)object7;
            contextObj = jZArray;
            Iterator iterator2 = new ArrayList();
            boolean n2 = false;
            iterator = contextObj.iterator();
            while (iterator.hasNext()) {
                Object t8 = iterator.next();
                string2 = (String)t8;
                n = 0;
                if (!StringUtilities.LiteBansModule_31(string2, "exclude:", false, 2, null)) continue;
                iterator2.add(t8);
            }
            jZArray = (List)(iterator2);
            bl11 = false;
            contextObj = jZArray;
            iterator2 = new ArrayList(CollectionUtilities.BaseCoreGenericHandler((Iterable)jZArray, 10));
            boolean enumArray = false;
            iterator = contextObj.iterator();
            while (iterator.hasNext()) {
                Object t9 = iterator.next();
                string2 = (String)t9;
                resultObj = iterator2;
                n = 0;
                resultObj.add(StringUtilities.BaseCoreGenericHandler(string2, "exclude:", null, 2, null));
            }
            jZArray = (List)(iterator2);
            bl11 = false;
            contextObj = jZArray;
            iterator2 = new ArrayList();
            iterator = contextObj.iterator();
            while (iterator.hasNext()) {
                Object t10 = iterator.next();
                string2 = (String)t10;
                n = 0;
                if (!(!StringUtilities.c(string2, ':', false, 2, null))) continue;
                iterator2.add(t10);
            }
            helperObj = NullHandler_6.c((List)(iterator2));
            if (!((Collection)helperObj).isEmpty()) {
                GlobalHandler fm_03 = fm_02;
                ((Collection)helperObj).add("history");
                ((Collection)helperObj).add("config");
            }
            contextObj = (Iterable)object7;
            iterator2 = contextObj.iterator();
            while (iterator2.hasNext()) {
                Object t2 = iterator2.next();
                iterator = (String)t2;
                if (!StringUtilities.LiteBansModule_31((String)(iterator), "mode:", false, 2, null)) continue;
                v1 = t2;
                break;
}
        String string3 = v1;
        String string4 = string = string3 != null ? StringUtilities.LiteBansModule_31(string3, ':', null, 2, null) : null;
        if (string != null) {
            DeleteHandler jZ2;
{
                DeleteHandler[] jZArray = DeleteHandler.values();
                resultObj = fm_02;
                contextObj = jZArray;
                int n2 = ((DeleteHandler[])contextObj).length;
                for (int i = 0; i < n2; ++i) {
                    Iterator iterator2 = iterator = contextObj[i];
                    if (!StringUtilities.BaseCoreGenericHandler(((Enum)(iterator2)).name(), string, true)) continue;
                    object6 = iterator;
                    break;
                }
                object6 = jZ2 = null;
            }
            if (object6 == null) {
                jZ2 = DeleteHandler.c;
            }
            this.e = jZ2;
        }
        Object object9 = fm_02;
        if (((GlobalHandler)object9).AsyncBackgroundTask_5) {
            contextObj = BansHandler_2.values();
            Enum[] enumArray = contextObj;
            iterator = new ArrayList();
            for (Enum enum_ : enumArray) {
                targetObj = enum_;
                flag = false;
                if (!(targetObj.BaseCoreGenericHandler() || targetObj == BansHandler_2.g)) continue;
                iterator.add((Enum)enum_);
            }
            list = (List)(iterator);
        } else {
            list = BansHandler_2.AsyncBackgroundTask_5.BaseCoreGenericHandler();
        }
        object9 = list;
        bl16 = false;
        contextObj = object9;
        Object object10 = new ArrayList();
        iterator = contextObj.iterator();
        while (iterator.hasNext()) {
            Object t3 = iterator.next();
            BansHandler_2 kL2 = (BansHandler_2)t3;
            n = 0;
            if (!(!helperObj.contains(kL2.toString().toLowerCase(Locale.ROOT)))) continue;
            object10.add(t3);
        }
        object9 = (List)object10;
        bl16 = false;
        contextObj = object9;
        object10 = new ArrayList();
        iterator = contextObj.iterator();
        while (iterator.hasNext()) {
            Object t4 = iterator.next();
            BansHandler_2 kL3 = (BansHandler_2)t4;
            n = 0;
            if (!(!helperObj.contains(kL3.name().toLowerCase(Locale.ROOT)))) continue;
            object10.add(t4);
        }
        object9 = (List)object10;
        bl16 = false;
        contextObj = object9;
        object10 = new ArrayList(CollectionUtilities.BaseCoreGenericHandler((Iterable)object9, 10));
        iterator = contextObj.iterator();
        while (iterator.hasNext()) {
            Object t5 = iterator.next();
            BansHandler_2 kL4 = (BansHandler_2)t5;
            resultObj = object10;
            n = 0;
            resultObj.add(LiteBansModule_371.BaseCoreGenericHandler(kL4, AllHandler_3.BaseCoreGenericHandler(ch2, kL4, (String)tempObj, false, 4, null)));
        }
        object9 = (List)object10;
        bl16 = false;
        object10 = contextObj = object9;
        iterator = object10.iterator();
        while (iterator.hasNext()) {
            Object t6 = iterator.next();
            LiteBansModule_354 jT2 = (LiteBansModule_354)t6;
            n = 0;
            targetObj = fm_02;
            flag = false;
            LiteBansModule_82 ch3 = targetObj.i;
            if (ch3 == null) {
                ObjectUtilities.e("");
                ch3 = null;
            }
            ch3.BaseCoreGenericHandler((BansHandler_2)jT2.LiteBansModule_31(), targetObj.LiteBansModule_194, targetObj.e.ordinal());
        }
        object9 = contextObj;
        bl16 = false;
        object10 = contextObj = object9;
        iterator = object10.iterator();
        while (iterator.hasNext()) {
            Object t7 = iterator.next();
            LiteBansModule_354 jT3 = (LiteBansModule_354)t7;
            n = 0;
            GlobalHandler fm_03 = fm_02;
            GlobalHandler fm_04 = fm_03;
            LiteBansModule_354 jT4 = jT3;
            CharSequence[] charSequenceArray = new CharSequence[]{"amount", String.valueOf(((Number)jT4.e()).longValue())};
            CharSequence charSequence = LiteBansModule_242.BaseCoreGenericHandler(MessageKey.LiteBansModule_39.BaseCoreGenericHandler("serverScope", fm_04.LiteBansModule_194), charSequenceArray);
            charSequenceArray = new CharSequence[]{"type", ((BansHandler_2)jT4.LiteBansModule_31()).name().toLowerCase(Locale.ROOT)};
            CommandArgumentUtils.BaseCoreGenericHandler((MessageHandler)fm_03, LiteBansModule_242.BaseCoreGenericHandler(charSequence, charSequenceArray));
        }
        DatabaseMonitorService.BaseCoreGenericHandler(ch2.AsyncBackgroundTask_5(), 0L, true, true, false, 1, null);
        return KotlinUnitHandler.BaseCoreGenericHandler;
}

