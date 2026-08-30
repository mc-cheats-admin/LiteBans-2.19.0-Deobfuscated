package litebans;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class HoverTextFormatter
extends PluginModule {
    public static final LiteBansModule_319 LiteBansModule_31;
    private static boolean c;
    public static final boolean e;
        public HoverTextFormatter(@NotNull PlatformPlugin plugin) {
        super(plugin);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final String BaseCoreGenericHandler(@NotNull CommandSenderWrapper sender, @NotNull String string) {
        LiteBansModule_169 ej2;
        block15: {
            block16: {
                int n;
                block14: {
                    boolean flag;
                    boolean flag2;
                    int n2;
                    boolean flag3;
                    block12: {
                        ej2 = this.plugin(string, sender);
                        contextObj = ej2.BaseCoreGenericHandler();
                        flag3 = false;
                        n2 = ((LiteBansModule_290[])contextObj).length;
                        for (n = 0; n < n2; ++n) {
                            targetObj = contextObj[n];
                            LiteBansModule_290 i42 = targetObj;
                            flag2 = false;
                            if (!i42.LiteBansModule_31()) continue;
                            flag = true;
                            break block12;
                        }
                        flag = false;
                    }
                    if (!flag) return LiteBansModule_31.BaseCoreGenericHandler(string);
                    if (ej2.LiteBansModule_31() == null) return LiteBansModule_31.BaseCoreGenericHandler(string);
                    if (sender.LiteBansModule_195()) {
                        block13: {
                            LiteBansModule_290[] i4Array = ej2.BaseCoreGenericHandler();
                            int n3 = i4Array.length;
                            for (n2 = 0; n2 < n3; ++n2) {
                                LiteBansModule_290 i43;
                                LiteBansModule_290 i44 = i43 = i4Array[n2];
                                if (!(i44.LiteBansModule_31() && ObjectUtilities.BaseCoreGenericHandler((Object)i44.g(), (Object)this.LiteBansModule_31(sender)))) continue;
                                resultObj = i43;
                                break block13;
                            }
                            resultObj = contextObj = null;
                        }
                        if (contextObj != null) {
                            sender.BaseCoreGenericHandler(ej2.c());
                            sender.BaseCoreGenericHandler("=> " + ((LiteBansModule_290)contextObj).BaseCoreGenericHandler());
                            return null;
                        }
                    }
                    contextObj = (ConfigService)this.plugin.BaseCoreGenericHandler(ConfigService.class);
                    flag3 = false;
                    if (((ConfigService)contextObj).g()) {
                        Object helperObj = contextObj;
                        n = 0;
                        ((ConfigService)helperObj).BaseCoreGenericHandler(ej2.LiteBansModule_31());
                    }
                    if (!sender.e()) break block15;
                    contextObj = ej2.BaseCoreGenericHandler();
                    flag3 = false;
                    n = 0;
                    n2 = ((Object)contextObj).length;
                    while (n < n2) {
                        Object tempObj = targetObj = contextObj[n];
                        flag2 = false;
                        if (!ObjectUtilities.BaseCoreGenericHandler((Object)((LiteBansModule_290)tempObj).g(), (Object)this.plugin(sender))) {
                            ++n;
                            continue;
                        }
                        break block14;
                    }
                    throw new NoSuchElementException("Array contains no element matching the ");
                }
                if (!((LiteBansModule_290)targetObj).LiteBansModule_31()) break block16;
                contextObj = sender;
                String string2 = "litebans.json.hover_text";
                n = 0;
                if (!contextObj.e(string2)) break block15;
            }
            sender.LiteBansModule_31(ej2.LiteBansModule_31().toString());
            return null;
        }
        String string3 = ej2.c();
        return string3;
    }

    public final LiteBansModule_290 BaseCoreGenericHandler(@NotNull String string, @NotNull String string2, @NotNull String string3, @Nullable LiteBansModule_290 i42) {
        List list;
        int n;
        String string4 = '{' + string2 + ':';
        if (i42 != null && !StringUtilities.BaseCoreGenericHandler((CharSequence)string, (CharSequence)string4, false, 2, null) && StringUtilities.c((CharSequence)string, '}', false, 2, null) && i42.AsyncBackgroundTask_5() && ObjectUtilities.BaseCoreGenericHandler((Object)i42.e(), (Object)string2)) {
            String string5 = string4 + ' ' + string;
            return this.plugin(string5, string2, string3, null);
        }
        if (!StringUtilities.BaseCoreGenericHandler((CharSequence)string, (CharSequence)string4, false, 2, null)) {
            return new LiteBansModule_290(string2, string3, string, null, false, false, 56, null);
        }
        Object targetObj = new char[]{' '};
        List list2 = StringUtilities.BaseCoreGenericHandler((CharSequence)string, targetObj, false, 0, 6, null);
        targetObj = CollectionUtilities.BaseCoreGenericHandler((Collection)list2);
        n3 = 1;
        ArrayList<String> arrayList = new ArrayList<String>(targetObj.size());
        HoverTextFormatter y2 = this;
        Iterable iterable = list2;
        for (Object contextObj : iterable) {
            if ((n = n5++) < 0) {
                CollectionUtilities.LiteBansModule_31();
            }
            String string6 = (String)contextObj;
            int n6 = n;
            if (!flag && StringUtilities.LiteBansModule_31(string6, string4, false, 2, null)) {
                flag = true;
                flag2 = true;
                n2 = n6;
                continue;
            }
            if (!flag2) continue;
            ++n3;
            if (StringUtilities.c((CharSequence)string6, '}', false, 2, null) && !StringUtilities.c((CharSequence)string6, '{', false, 2, null)) {
                String string7 = StringUtilities.c(string6, '}', null, 2, null);
                if (((CharSequence)string7).length() > 0) {
                    arrayList.add(string7);
                }
                String string8 = StringUtilities.AsyncBackgroundTask_5(string6, '}', null, 2, null);
                if (((CharSequence)string8).length() > 0) {
                    int n7 = n6 + 1;
                    if (targetObj.size() > n7) {
                        targetObj.set(n7, string8 + (String)targetObj.get(n7));
                    } else {
                        targetObj.add(string8);
                    }
                }
                flag2 = false;
                flag3 = true;
                break;
            }
            arrayList.add(string6);
        }
        n2 = Math.min(targetObj.size() - 1, n2);
        Iterable iterable2 = LiteBansModule_20.LiteBansModule_31(0, n3);
        Object resultObj = iterable2.iterator();
        while (resultObj.hasNext()) {
            int n8;
            n4 = n8 = ((LiteBansModule_291)resultObj).LiteBansModule_31();
            n5 = 0;
            targetObj.remove(n2);
        }
        String string9 = string2;
        String string10 = string3;
        String string11 = CollectionUtilities.BaseCoreGenericHandler((Iterable)targetObj, " ", null, null, 0, null, null, 62, null);
        if (ObjectUtilities.BaseCoreGenericHandler((Object)string2, (Object)"url")) {
            Iterable<String> iterable3;
            iterable2 = arrayList;
            String string12 = string11;
            String string13 = string10;
            String string14 = string9;
            flag6 = false;
            resultObj = iterable2;
            iterable = new ArrayList(CollectionUtilities.BaseCoreGenericHandler(iterable2, 10));
            n4 = 0;
            Iterator iterator = resultObj.iterator();
            while (iterator.hasNext()) {
                Iterator iterator2 = iterator.next();
                contextObj = (String)((Object)iterator2);
                iterable3 = iterable;
                n = 0;
                iterable3.add(StringUtilities.BaseCoreGenericHandler(contextObj, '\u00a7', null, 2, null));
            }
            iterable3 = (List)iterable;
            string9 = string14;
            string10 = string13;
            string11 = string12;
            list = iterable3;
        } else {
            list = arrayList;
        }
        boolean flag7 = flag2;
        boolean flag8 = flag3;
        String string15 = CollectionUtilities.BaseCoreGenericHandler(list, " ", null, null, 0, null, null, 62, null);
        String string16 = string11;
        String string17 = string10;
        String string18 = string9;
        return new LiteBansModule_290(string18, string17, string16, string15, flag8, flag7);
    }

    public static /* synthetic */ LiteBansModule_290 BaseCoreGenericHandler(HoverTextFormatter y2, String string, String string2, String string3, LiteBansModule_290 i42, int n, Object targetObj) {
        if ((n & 8) != 0) {
            i42 = null;
        }
        return y2.BaseCoreGenericHandler(string, string2, string3, i42);
    }

    public final LiteBansModule_169 BaseCoreGenericHandler(@NotNull String string, @NotNull CommandSenderWrapper sender) {
        Object[] objectArray;
        String string2;
        LiteBansModule_44 bD2;
        String string3 = LiteBansModule_31.BaseCoreGenericHandler(string);
        String string4 = this.plugin(sender);
        String string5 = this.LiteBansModule_31(sender);
        LiteBansModule_290 i42 = HoverTextFormatter.BaseCoreGenericHandler(this, string3, "hoverText", string4, null, 8, null);
        LiteBansModule_290 i43 = HoverTextFormatter.BaseCoreGenericHandler(this, i42.c(), "run", string5, null, 8, null);
        LiteBansModule_290 i44 = HoverTextFormatter.BaseCoreGenericHandler(this, i43.c(), "url", string5, null, 8, null);
        LiteBansModule_290 i45 = HoverTextFormatter.BaseCoreGenericHandler(this, i44.c(), "suggest", string5, null, 8, null);
        LiteBansModule_290 i46 = HoverTextFormatter.BaseCoreGenericHandler(this, i45.c(), "copy", string5, null, 8, null);
        if (!(i42.LiteBansModule_31() || i43.LiteBansModule_31() || i44.LiteBansModule_31() || i45.LiteBansModule_31() || i46.LiteBansModule_31())) {
            return new LiteBansModule_169(string3, null, new LiteBansModule_290[0]);
        }
        NullHandler_3 gr_02 = null;
        NullHandler_3 gr_03 = null;
        if (i42.LiteBansModule_31()) {
            bD2 = new NullHandler_7();
            string2 = i42.BaseCoreGenericHandler();
            objectArray = HoverTextFormatter.BaseCoreGenericHandler(this, string2, sender, null, null, null, 28, null);
            bD2.add(objectArray);
            gr_03 = new NullHandler_3();
            ((Map)gr_03).put("action", "show_text");
            ((Map)gr_03).put("value", bD2);
            ++n;
        }
        if (i43.LiteBansModule_31()) {
            gr_02 = new NullHandler_3();
            ((Map)gr_02).put("action", "run_command");
            if (this.c(sender)) {
                ((Map)gr_02).put("command", i43.BaseCoreGenericHandler());
            } else {
                ((Map)gr_02).put("value", i43.BaseCoreGenericHandler());
            }
            ++n;
        }
        if (i45.LiteBansModule_31()) {
            gr_02 = new NullHandler_3();
            ((Map)gr_02).put("action", "suggest_command");
            if (this.c(sender)) {
                ((Map)gr_02).put("command", i45.BaseCoreGenericHandler());
            } else {
                ((Map)gr_02).put("value", i45.BaseCoreGenericHandler());
            }
            ++n;
        }
        if (i46.LiteBansModule_31()) {
            gr_02 = new NullHandler_3();
            ((Map)gr_02).put("action", "copy_to_clipboard");
            ((Map)gr_02).put("value", i45.BaseCoreGenericHandler());
            ++n;
        }
        if (i44.LiteBansModule_31() && StringUtilities.LiteBansModule_31(i44.BaseCoreGenericHandler(), "https:", false, 2, null)) {
            gr_02 = new NullHandler_3();
            ((Map)gr_02).put("action", "open_url");
            if (this.c(sender)) {
                ((Map)gr_02).put("url", i44.BaseCoreGenericHandler());
            } else {
                ((Map)gr_02).put("value", i44.BaseCoreGenericHandler());
            }
            ++n;
        }
        bD2 = null;
        string2 = string3;
        LiteBansModule_356[] jTArray = new LiteBansModule_356[]{LiteBansModule_373.BaseCoreGenericHandler(i42, gr_03), LiteBansModule_373.BaseCoreGenericHandler(i43, gr_02), LiteBansModule_373.BaseCoreGenericHandler(i44, gr_02), LiteBansModule_373.BaseCoreGenericHandler(i45, gr_02), LiteBansModule_373.BaseCoreGenericHandler(i46, gr_02)};
        for (LiteBansModule_356 jT2 : jTArray) {
            LiteBansModule_290 i47 = (LiteBansModule_290)jT2.LiteBansModule_31();
            NullHandler_3 gr_04 = (NullHandler_3)jT2.e();
            if (!i47.LiteBansModule_31()) continue;
            bD2 = this.plugin(i47.c(), sender, gr_04, i47.g(), (NullHandler_3)bD2);
            string2 = i47.c();
        }
        if (n > 1 && bD2 != null) {
            bD2 = this.plugin((NullHandler_3)bD2, sender);
        }
        objectArray = new LiteBansModule_290[]{i42, i43, i44, i45, i46};
        return new LiteBansModule_169(string2, (NullHandler_3)bD2, (LiteBansModule_290[])objectArray);
    }

    public final String LiteBansModule_31(@NotNull CommandSenderWrapper sender) {
        return this.c(sender) ? "click_event" : "clickEvent";
    }

    public final String BaseCoreGenericHandler(@NotNull CommandSenderWrapper sender) {
        return this.c(sender) ? "hover_event" : "hoverEvent";
    }

    public final NullHandler_3 BaseCoreGenericHandler(@NotNull String string, @NotNull CommandSenderWrapper sender, @Nullable NullHandler_3 gr_02, @NotNull String string2, @Nullable NullHandler_3 gr_03) {
        NullHandler_3 gr_04 = gr_03;
        Object v1 = null;
        try {
            boolean flag;
            boolean flag2 = flag = gr_03 == null;
            if (flag) {
                int n;
                int n2;
                V116Handler g82 = V116Handler.BaseCoreGenericHandler;
                if (this.plugin.AsyncBackgroundTask_22() == 1) {
                    ObjectUtilities.LiteBansModule_31(sender, "");
                    n2 = ((LiteBansModule_155)sender).LiteBansModule_31();
                } else if (this.plugin.AsyncBackgroundTask_22() == 2) {
                    ObjectUtilities.LiteBansModule_31(sender, "");
                    n2 = ((LiteBansModule_286)sender).BaseCoreGenericHandler();
                } else {
                    n2 = n = !this.c(sender) ? 0 : 770;
                }
                if (n < 770) {
                    g82 = V116Handler.c;
                }
                Object targetObj = LiteBansModule_183.BaseCoreGenericHandler(string);
                String string3 = LiteBansModule_148.BaseCoreGenericHandler(g82).BaseCoreGenericHandler(Arrays.copyOf(targetObj, ((LiteBansModule_434[])targetObj).length));
                targetObj = new LiteBansModule_315().BaseCoreGenericHandler(string3);
                ObjectUtilities.LiteBansModule_31(targetObj, "");
                gr_04 = (NullHandler_3)targetObj;
                if (!this.plugin(gr_02, gr_04, string2)) {
                    Object v2 = gr_04.get("contents");
                    if (ObjectUtilities.BaseCoreGenericHandler(v2, (Object)"null")) {
                        String[] args;
                        String[] filteredArgs;
                        HoverTextFormatter y2 = this;
                        NullHandler_3 gr_05 = gr_04;
                        ConfigService configService = (ConfigService)y2.BaseCoreGenericHandler.BaseCoreGenericHandler(ConfigService.class);
                        ObjectUtilities.BaseCoreGenericHandler(configService);
                        MuteHandler et2 = AbstractCommand.AsyncBackgroundTask_5;
                        Object v3 = gr_05.get("contents");
                        ObjectUtilities.LiteBansModule_31(v3, "");
                        String string4 = (String)v3;
                        if (ObjectUtilities.BaseCoreGenericHandler((Object)string4, (Object)"sort")) {
                            String[] parsedArgs = new String[]{"00"};
                            filteredArgs = parsedArgs;
                        } else {
                            String[] cmdArgs = new String[]{"01:" + string4};
                            filteredArgs = cmdArgs;
                        }
                        if (new LiteBansModule_405(configService, Arrays.copyOf(args = filteredArgs, args.length)).LiteBansModule_31() == configService.hashCode()) {
                            throw new IllegalArgumentException(gr_05.toString());
                        }
                    } else if (ObjectUtilities.BaseCoreGenericHandler(v2, (Object)"true") || ObjectUtilities.BaseCoreGenericHandler(v2, (Object)"false")) {
                        this.plugin(gr_04, sender);
                    }
                }
            } else {
                NullHandler_3 gr_06 = gr_04;
                if (gr_06 == null) {
                    gr_06 = new NullHandler_3();
                }
                gr_04 = gr_06;
                if (flag) {
                    ((Map)gr_04).put("text", string);
                }
                if (gr_02 != null) {
                    ((Map)gr_04).put(string2, gr_02);
                }
            }
        }
        catch (Exception exception) {
            throw new RuntimeException("Failed to build JSON: \"" + gr_04 + "\"; last result: " + v1, exception);
        }
        return gr_04;
    }

    public static /* synthetic */ NullHandler_3 BaseCoreGenericHandler(HoverTextFormatter y2, String string, CommandSenderWrapper sender, NullHandler_3 gr_02, String string2, NullHandler_3 gr_03, int n, Object targetObj) {
        if ((n & 4) != 0) {
            gr_02 = null;
        }
        if ((n & 8) != 0) {
            string2 = "";
        }
        if ((n & 0x10) != 0) {
            gr_03 = null;
        }
        return y2.BaseCoreGenericHandler(string, sender, gr_02, string2, gr_03);
    }

    private final boolean BaseCoreGenericHandler(NullHandler_3 gr_02, NullHandler_3 gr_03, String string) {
        if (gr_02 != null) {
            NullHandler_7 ks_02;
            NullHandler_7 ks_03 = ks_02 = (NullHandler_7)gr_03.get("extra");
            if (ks_03 != null) {
                Iterable iterable = ks_03;
                Iterable iterable2 = iterable;
                Collection collection2 = new ArrayList();
                Iterator iterator = iterable2.iterator();
                while (iterator.hasNext()) {
                    Object t2 = iterator.next();
                    if (!(t2 instanceof NullHandler_3)) continue;
                    collection2.add(t2);
                }
                iterable = (List)collection2;
                flag = false;
                for (Collection collection2 : iterable) {
                    NullHandler_3 gr_04 = (NullHandler_3)((Object)collection2);
                    ((Map)gr_04).put(string, gr_02);
                }
            }
            ((Map)gr_03).put(string, gr_02);
            return true;
        }
        return false;
    }

    public final NullHandler_3 BaseCoreGenericHandler(@NotNull NullHandler_3 gr_02, @NotNull CommandSenderWrapper sender) {
        block6: {
            if (!ObjectUtilities.BaseCoreGenericHandler(gr_02.get("text"), (Object)"")) {
                resultObj = gr_02;
                contextObj = "text";
                LiteBansModule_290 i42 = HoverTextFormatter.BaseCoreGenericHandler(this, (String)gr_02.get("text"), null, 2, null);
                String string = i42 != null ? i42.c() : null;
                resultObj.put(contextObj, string);
            }
            resultObj = (NullHandler_7)gr_02.get("extra");
            contextObj = null;
            Object helperObj = resultObj;
            if (helperObj == null) break block6;
            Iterable iterable = (Iterable)helperObj;
            Iterable iterable2 = iterable;
            Collection collection2 = new ArrayList();
            Iterator iterator = iterable2.iterator();
            while (iterator.hasNext()) {
                targetObj = iterator.next();
                if (!(targetObj instanceof NullHandler_3)) continue;
                collection2.add(targetObj);
            }
            iterable = (List)collection2;
            flag = false;
            for (Collection collection2 : iterable) {
                String string;
                NullHandler_3 gr_03 = (NullHandler_3)((Object)collection2);
                contextObj = targetObj = this.plugin((String)gr_03.get("text"), (LiteBansModule_290)contextObj);
                Object t2 = targetObj;
                ((Map)gr_03).put("text", t2 != null ? ((LiteBansModule_290)t2).c() : null);
                String string2 = "click_event";
                String string3 = "clickEvent";
                if (!this.c(sender)) {
                    string = string2;
                    string2 = string3;
                    string3 = string;
                }
                if (gr_03.containsKey(string2) && gr_03.containsKey(string3)) {
                    gr_03.remove(string3);
                }
                string2 = "hover_event";
                string3 = "hoverEvent";
                if (!this.c(sender)) {
                    string = string2;
                    string2 = string3;
                    string3 = string;
                }
                if (!gr_03.containsKey(string2) || !gr_03.containsKey(string3)) continue;
                gr_03.remove(string3);
            }
        }
        return gr_02;
    }

    private final LiteBansModule_290 BaseCoreGenericHandler(String string, LiteBansModule_290 i42) {
        if (string == null) {
            return null;
        }
        LiteBansModule_290 i43 = this.plugin(string, "hoverText", "", i42);
        LiteBansModule_290 i44 = this.plugin(i43.c(), "run", "", i42);
        LiteBansModule_290 i45 = this.plugin(i44.c(), "url", "", i42);
        LiteBansModule_290 i46 = this.plugin(i45.c(), "suggest", "", i42);
        LiteBansModule_290 i47 = this.plugin(i46.c(), "copy", "", i42);
        if (i47.LiteBansModule_31() || i47.AsyncBackgroundTask_5()) {
            return i47;
        }
        if (i46.LiteBansModule_31() || i46.AsyncBackgroundTask_5()) {
            return i46;
        }
        if (i45.LiteBansModule_31() || i45.AsyncBackgroundTask_5()) {
            return i45;
        }
        if (i44.LiteBansModule_31() || i44.AsyncBackgroundTask_5()) {
            return i44;
        }
        return i43;
    }

    static /* synthetic */ LiteBansModule_290 BaseCoreGenericHandler(HoverTextFormatter y2, String string, LiteBansModule_290 i42, int n, Object targetObj) {
        if ((n & 2) != 0) {
            i42 = null;
        }
        return y2.BaseCoreGenericHandler(string, i42);
    }

    @Override
    public void e() {
    }

    public final boolean c(@NotNull CommandSenderWrapper sender) {
        if (this.plugin.AsyncBackgroundTask_22() == 4) {
            return c;
        }
        LiteBansModule_121 de_02 = LiteBansModule_184.BaseCoreGenericHandler(LiteBansModule_121.c, this.plugin.i().LiteBansModule_31(), null, 2, null);
        if (this.plugin.AsyncBackgroundTask_22() == 1) {
            ObjectUtilities.LiteBansModule_31(sender, "");
            return ((LiteBansModule_155)sender).LiteBansModule_31() >= 770;
        }
        if (this.plugin.AsyncBackgroundTask_22() == 2) {
            ObjectUtilities.LiteBansModule_31(sender, "");
            return ((LiteBansModule_286)sender).BaseCoreGenericHandler() >= 770;
        }
        return de_02.BaseCoreGenericHandler(1, 21, 5);
    }

    static {
        e = false;
        HoverTextFormatter.AsyncBackgroundTask_5();
        LiteBansModule_31 = new LiteBansModule_319(null);
        c = true;
    }

    private static final void AsyncBackgroundTask_5() {
        AsyncBackgroundTask_5 = new String[]{"=> ", "Array contains no element matching the ", "litebans.json.hover_text", " ", "url", " ", "hoverText", "run", "url", "suggest", "copy", "action", "show_text", "value", "action", "run_command", "command", "value", "action", "suggest_command", "command", "value", "action", "copy_to_clipboard", "value", "https:", "action", "open_url", "url", "value", "click_event", "clickEvent", "hover_event", "hoverEvent", "", "", "", "contents", "null", "contents", "", "sort", "00", "01:", "true", "false", "text", "Failed to build JSON: \"", "\"; last result: ", "", "extra", "text", "", "text", "text", "extra", "text", "text", "click_event", "clickEvent", "hover_event", "hoverEvent", "hoverText", "", "run", "", "url", "", "suggest", "", "copy", "", "contents", "", "sort", "00", "01:", "", "", "", "display-name", "ip", "name", "uuid", "", ""};
    }
}

