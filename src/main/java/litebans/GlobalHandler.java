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
        Object object = this;
        ChatFormatter chatFormatter = MessageHandler.BaseCoreGenericHandler;
        boolean flag2 = ((MessageHandler)object).AsyncBackgroundTask_5().LiteBansModule_194();
        Object object2 = MessageKey.LiteBansModule_31;
        ChatFormatter fo_03 = chatFormatter;
        boolean flag4 = !flag2;
        if (flag4) {
            ChatFormatter fo_04 = fo_03;
            fo_04.BaseCoreGenericHandler(object2);
            throw new CommandExitException();
        }
        object = MessageHandler.BaseCoreGenericHandler;
        flag = !ArrayUtilities.LiteBansModule_31(this.g, "confirm");
        if (flag) {
            Object object3 = object;
            flag2 = false;
            object2 = this;
            flag3 = false;
            ((ChatFormatter)object3).BaseCoreGenericHandler(MessageKey.dj.BaseCoreGenericHandler("serverScope", (Object)((GlobalHandler)object2).LiteBansModule_194));
            throw new CommandExitException();
        }
        object = this;
        flag = false;
        ((DatabaseMonitorService)((MessageHandler)object).LiteBansModule_240().BaseCoreGenericHandler(DatabaseMonitorService.class)).BaseCoreGenericHandler(arg_0 -> GlobalHandler.BaseCoreGenericHandler(this, arg_0));
    }

    private static final KotlinUnitHandler BaseCoreGenericHandler(GlobalHandler fm_02, LiteBansModule_82 ch2) {
        List list;
        boolean flag;
        Object object;
        String string;
        Object v1;
        int n;
        Object object2;
        Object object3;
        Iterator iterator;
        Object object4;
        Object object5;
{
            String string2;
            boolean t7;
            Object v0;
            boolean flag3;
            Object object6;
            boolean flag4;
            DeleteHandler[] jZArray;
            boolean flag5;
            Object object7;
{
                object7 = MessageHandler.BaseCoreGenericHandler;
                boolean flag6 = ch2.LiteBansModule_31();
                object5 = MessageKey.ServerEventListener;
                flag5 = false;
                object4 = object7;
                if (flag6) {
                    ChatFormatter chatFormatter = object4;
                    chatFormatter.BaseCoreGenericHandler(object5);
                    throw new CommandExitException();
                }
                object7 = LiteBansModule_242.BaseCoreGenericHandler(ArrayUtilities.AsyncBackgroundTask_5(fm_02.g));
                object5 = (Iterable)object7;
                flag5 = false;
                object4 = object5.iterator();
                while (object4.hasNext()) {
                    Object e = object4.next();
                    jZArray = (String)e;
                    flag4 = false;
                    object6 = fm_02;
                    flag3 = false;
                    if (!(!(ObjectUtilities.BaseCoreGenericHandler((Object)jZArray, (Object)"reset-database") || StringUtilities.LiteBansModule_31((String)jZArray, "exclude:", false, 2, null) || StringUtilities.LiteBansModule_31((String)jZArray, "mode:", false, 2, null) || StringUtilities.LiteBansModule_31((String)jZArray, "server:", false, 2, null) || ObjectUtilities.BaseCoreGenericHandler((Object)jZArray, (Object)"-g") || ObjectUtilities.BaseCoreGenericHandler((Object)jZArray, (Object)"confirm")))) continue;
                    v0 = e;
                    break;
}
            String string3 = v0;
            object5 = MessageHandler.BaseCoreGenericHandler;
            flag5 = string3 != null;
            object4 = BlackHandler.LiteBansModule_194("Unrecognized parameter: " + BlackHandler.AsyncBackgroundTask_5(string3));
            jZArray = object5;
            flag4 = false;
            if (flag5) {
                object6 = jZArray;
                flag3 = false;
                ((ChatFormatter)object6).BaseCoreGenericHandler(object4);
                throw new CommandExitException();
            }
            fm_02.i = ch2;
            fm_02.AsyncBackgroundTask_5 = LiteBansModule_181.LiteBansModule_194.LiteBansModule_31(fm_02.LiteBansModule_194);
            object5 = fm_02.AsyncBackgroundTask_5 ? "__ALL__" : fm_02.LiteBansModule_194;
            object4 = (Iterable)object7;
            bl9 = false;
            jZArray = object4;
            Collection collection = new ArrayList();
            for (Object t2 : jZArray) {
                iterator = (String)t2;
                t7 = false;
                if (!StringUtilities.LiteBansModule_31((String)((Object)iterator), "exclude:reason:", false, 2, null)) continue;
                collection.add(t2);
            }
            object4 = (List)collection;
            bl9 = false;
            jZArray = object4;
            collection = new ArrayList(CollectionUtilities.BaseCoreGenericHandler((Iterable)object4, 10));
            bl10 = false;
            for (Object t5 : jZArray) {
                iterator = (String)t5;
                object3 = collection;
                t7 = false;
                object3.add(StringUtilities.BaseCoreGenericHandler((String)((Object)iterator), "exclude:reason:", null, 2, null));
            }
            List list2 = (List)collection;
            jZArray = (Iterable)object7;
            object2 = jZArray;
            Iterator iterator2 = new ArrayList();
            boolean n2 = false;
            iterator = object2.iterator();
            while (iterator.hasNext()) {
                Object t8 = iterator.next();
                string2 = (String)t8;
                n = 0;
                if (!StringUtilities.LiteBansModule_31(string2, "exclude:", false, 2, null)) continue;
                iterator2.add(t8);
            }
            jZArray = (List)((Object)iterator2);
            bl11 = false;
            object2 = jZArray;
            iterator2 = new ArrayList(CollectionUtilities.BaseCoreGenericHandler((Iterable)jZArray, 10));
            boolean enumArray = false;
            iterator = object2.iterator();
            while (iterator.hasNext()) {
                Object t9 = iterator.next();
                string2 = (String)t9;
                object3 = iterator2;
                n = 0;
                object3.add(StringUtilities.BaseCoreGenericHandler(string2, "exclude:", null, 2, null));
            }
            jZArray = (List)((Object)iterator2);
            bl11 = false;
            object2 = jZArray;
            iterator2 = new ArrayList();
            iterator = object2.iterator();
            while (iterator.hasNext()) {
                Object t10 = iterator.next();
                string2 = (String)t10;
                n = 0;
                if (!(!StringUtilities.c((CharSequence)string2, ':', false, 2, null))) continue;
                iterator2.add(t10);
            }
            object4 = NullHandler_6.c((List)((Object)iterator2));
            if (!((Collection)object4).isEmpty()) {
                GlobalHandler fm_03 = fm_02;
                ((Collection)object4).add("history");
                ((Collection)object4).add("config");
            }
            object2 = (Iterable)object7;
            iterator2 = object2.iterator();
            while (iterator2.hasNext()) {
                Object t2 = iterator2.next();
                iterator = (String)t2;
                if (!StringUtilities.LiteBansModule_31((String)((Object)iterator), "mode:", false, 2, null)) continue;
                v1 = t2;
                break;
}
        String string3 = v1;
        String string4 = string = string3 != null ? StringUtilities.LiteBansModule_31(string3, ':', null, 2, null) : null;
        if (string != null) {
            DeleteHandler jZ2;
            Object object6;
{
                DeleteHandler[] jZArray = DeleteHandler.values();
                object3 = fm_02;
                object2 = jZArray;
                int n2 = ((DeleteHandler[])object2).length;
                for (int i = 0; i < n2; ++i) {
                    Iterator iterator2 = iterator = object2[i];
                    if (!StringUtilities.BaseCoreGenericHandler(((Enum)((Object)iterator2)).name(), string, true)) continue;
                    object6 = iterator;
                    break;
                }
                object6 = jZ2 = null;
            }
            if (object6 == null) {
                jZ2 = DeleteHandler.c;
            }
            ((GlobalHandler)object3).e = jZ2;
        }
        Object object9 = fm_02;
        if (((GlobalHandler)object9).AsyncBackgroundTask_5) {
            object2 = BansHandler_2.values();
            Enum[] enumArray = object2;
            iterator = new ArrayList();
            for (Enum enum_ : enumArray) {
                object = enum_;
                flag = false;
                if (!(((BansHandler_2)object).BaseCoreGenericHandler() || object == BansHandler_2.g)) continue;
                iterator.add((Enum)enum_);
            }
            list = (List)((Object)iterator);
        } else {
            list = BansHandler_2.AsyncBackgroundTask_5.BaseCoreGenericHandler();
        }
        object9 = list;
        bl16 = false;
        object2 = object9;
        Object object10 = new ArrayList();
        iterator = object2.iterator();
        while (iterator.hasNext()) {
            Object t3 = iterator.next();
            BansHandler_2 kL2 = (BansHandler_2)t3;
            n = 0;
            if (!(!object4.contains(kL2.toString().toLowerCase(Locale.ROOT)))) continue;
            object10.add(t3);
        }
        object9 = (List)object10;
        bl16 = false;
        object2 = object9;
        object10 = new ArrayList();
        iterator = object2.iterator();
        while (iterator.hasNext()) {
            Object t4 = iterator.next();
            BansHandler_2 kL3 = (BansHandler_2)t4;
            n = 0;
            if (!(!object4.contains(kL3.name().toLowerCase(Locale.ROOT)))) continue;
            object10.add(t4);
        }
        object9 = (List)object10;
        bl16 = false;
        object2 = object9;
        object10 = new ArrayList(CollectionUtilities.BaseCoreGenericHandler((Iterable)object9, 10));
        iterator = object2.iterator();
        while (iterator.hasNext()) {
            Object t5 = iterator.next();
            BansHandler_2 kL4 = (BansHandler_2)t5;
            object3 = object10;
            n = 0;
            object3.add(LiteBansModule_371.BaseCoreGenericHandler(kL4, AllHandler_3.BaseCoreGenericHandler(ch2, kL4, (String)object5, false, 4, null)));
        }
        object9 = (List)object10;
        bl16 = false;
        object10 = object2 = object9;
        iterator = object10.iterator();
        while (iterator.hasNext()) {
            Object t6 = iterator.next();
            LiteBansModule_354 jT2 = (LiteBansModule_354)t6;
            n = 0;
            object = fm_02;
            flag = false;
            LiteBansModule_82 ch3 = ((GlobalHandler)object).i;
            if (ch3 == null) {
                ObjectUtilities.e("");
                ch3 = null;
            }
            ch3.BaseCoreGenericHandler((BansHandler_2)jT2.LiteBansModule_31(), ((GlobalHandler)object).LiteBansModule_194, ((GlobalHandler)object).e.ordinal());
        }
        object9 = object2;
        bl16 = false;
        object10 = object2 = object9;
        iterator = object10.iterator();
        while (iterator.hasNext()) {
            Object t7 = iterator.next();
            LiteBansModule_354 jT3 = (LiteBansModule_354)t7;
            n = 0;
            GlobalHandler fm_03 = fm_02;
            GlobalHandler fm_04 = fm_03;
            LiteBansModule_354 jT4 = jT3;
            CharSequence[] charSequenceArray = new CharSequence[]{"amount", String.valueOf(((Number)jT4.e()).longValue())};
            CharSequence charSequence = LiteBansModule_242.BaseCoreGenericHandler((CharSequence)MessageKey.LiteBansModule_39.BaseCoreGenericHandler("serverScope", (Object)fm_04.LiteBansModule_194), charSequenceArray);
            charSequenceArray = new CharSequence[]{"type", ((BansHandler_2)jT4.LiteBansModule_31()).name().toLowerCase(Locale.ROOT)};
            CommandArgumentUtils.BaseCoreGenericHandler((MessageHandler)fm_03, (CharSequence)LiteBansModule_242.BaseCoreGenericHandler(charSequence, charSequenceArray));
        }
        DatabaseMonitorService.BaseCoreGenericHandler(ch2.AsyncBackgroundTask_5(), 0L, true, true, false, 1, null);
        return KotlinUnitHandler.BaseCoreGenericHandler;
}

