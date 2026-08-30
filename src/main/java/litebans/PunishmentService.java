package litebans;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ModulePriority(priority=1)
public final class PunishmentService
extends CommandModule {
    public PunishmentService(@NotNull PlatformPlugin plugin) {
        super(plugin);
    }

    @Override
    public Collection g() {
        Collection collection;
        Collection collection2 = collection = super.g();
        collection2.removeIf(arg_0 -> PunishmentService.BaseCoreGenericHandler(PunishmentService::BaseCoreGenericHandler, arg_0));
        return collection;
    }

    @Override
    public void BaseCoreGenericHandler(@NotNull LiteCommand command, @NotNull CommandSenderWrapper sender, @NotNull String[] args) {
        this.plugin(sender, command.getName(), args);
    }

    @Override
    public void BaseCoreGenericHandler(@NotNull CommandSenderWrapper sender, @NotNull String string, @NotNull String[] args) {
        String[] filteredArgs;
        boolean flag;
        int n;
        int n2;
        int n3;
        boolean flag2;
        Object object;
        Object object2;
{
            object2 = AbstractCommand.AsyncBackgroundTask_5;
            object = args;
            flag2 = false;
            n3 = ((String[])object).length;
            for (n2 = 0; n2 < n3; ++n2) {
                String string2;
                String string3 = string2 = object[n2];
                n = 0;
                if (!StringUtilities.LiteBansModule_31((CharSequence)string3)) continue;
                flag = false;
                break;
            }
            flag = true;
        }
        if (flag) {
            filteredArgs = args;
        } else {
            object = args;
            flag2 = false;
            String[] parsedArgs = object;
            Collection collection = new ArrayList();
            n = parsedArgs.length;
            for (int i = 0; i < n; ++i) {
                String string4;
                String string5 = string4 = parsedArgs[i];
                boolean flag6 = !StringUtilities.LiteBansModule_31((CharSequence)string5);
                if (!flag6) continue;
                collection.add(string4);
            }
            object = (List)collection;
            flag2 = false;
            parsedArgs = object;
            filteredArgs = parsedArgs.toArray(new String[0]);
        }
        String[] cmdArgs = filteredArgs;
        object2 = string;
        object2 = StringUtilities.BaseCoreGenericHandler((String)object2, "litebans:", null, 2, null);
        AbstractCommand abstractCommand = (AbstractCommand)this.plugin((String)object2);
        if (abstractCommand != null) {
            object = abstractCommand.getPermission();
            if (object != null) {
                CommandSenderWrapper jv_03 = sender;
                n2 = 0;
                CommandSenderWrapper jv_04 = jv_03;
                if (!jv_04.e((String)object)) {
                    jv_03 = sender;
                    CharSequence charSequence = MessageKey.cZ;
                    ChatFormatter.BaseCoreGenericHandler(MessageHandler.BaseCoreGenericHandler, jv_03, charSequence, null, 4, null);
                    return;
}
            PunishmentService e = this;
            n2 = 0;
            e.BaseCoreGenericHandler.LiteBansModule_31(new CommandExecutionTask(sender, cmdArgs, abstractCommand, (String)object2));
            return;
        }
        object = CommandArgumentUtils.BaseCoreGenericHandler(AbstractCommand.AsyncBackgroundTask_5, (String)object2, cmdArgs);
        PunishmentService e = this;
        Object object3 = this;
        n3 = 0;
        AbstractCommand banCommand = (AbstractCommand)((CommandManager)object3).BaseCoreGenericHandler("ban");
        if (banCommand == null) {
            AssertionUtilities.BaseCoreGenericHandler();
            throw new CommandExitException();
        }
        object3 = banCommand;
        n3 = 0;
        e.BaseCoreGenericHandler.LiteBansModule_31(new CommandExecutionTask(sender, (String[])object, (AbstractCommand)object3, (String)object2));
    }

    @Override
    public void BaseCoreGenericHandler() {
        v1 = (ConfigService)this.plugin.BaseCoreGenericHandler(ConfigService.class);
        v1.e();
        super.BaseCoreGenericHandler();
        this.plugin.BaseCoreGenericHandler(this);
        v2 = this.e();
        v4 = v2;
        v5 = new ArrayList<PunishmentService>(CollectionUtilities.BaseCoreGenericHandler((Iterable)v2, 10));
        v7 = v4.iterator();
        while (v7.hasNext()) {
{
                        arg1 = v7.next();
                        arg2 = (LiteCommand)arg1;
                        arg3 = v5;
                        arg4 = this;
                        v0 = arg4.BaseCoreGenericHandler;
                        v1 = arg2.getPermission();
                        arg5 = AbstractCommand.AsyncBackgroundTask_5;
                        arg6 = arg2.getName();
                        arg7 = arg6;
                        switch (arg7.hashCode()) {
                            case -1320563219: {
                                if (arg7.equals("dupeip")) break;
                                break;
                            }
                            case 712910260: {
                                if (!arg7.equals("staffhistory")) {
                                    break;
                                }
                                break;
                            }
                            case 926934164: {
                                if (!arg7.equals("history")) {
                                    break;
                                }
                                break;
}
                        arg8   = new String[]{"alts", "litebans:alts", "checkalts", "litebans:checkalts", "litebans:dupeip"};
                        v2 = arg8  ;
                        break;
                    }
                    arg8   = new String[]{"hist", "litebans:history"};
                    v2 = arg8  ;
                    break;
                }
                arg8   = new String[]{"staffhist", "litebans:staffhistory"};
                v2 = arg8  ;
                break;
                                arg8   = new String[]{"litebans:" + (String)arg6};
                v2 = arg8  ;
            }
            arg9   = v2;
            arg3.add(new LiteBansModule_265((LiteCommand)arg2, v0, v1, Arrays.copyOf(arg9  , arg9  .length)));
        }
        v2 = (List)v5;
        v4 = v2.iterator();
        while (v4.hasNext()) {
            v5 = v4.next();
            arg10 = (LiteCommand)v5;
            this.LiteBansModule_31(arg10);
        }
        v2 = this;
        ObjectUtilities.BaseCoreGenericHandler(v1);
        arg11 = v1;
        v5 = AbstractCommand.AsyncBackgroundTask_5.BaseCoreGenericHandler(arg11);
        arg12 = v5.length;
        for (arg13 = 0; arg13 < arg12; ++arg13) {
{
                                            arg14 = arg2 = v5[arg13];
                                            arg15 = v2;
                                            v3 = new StringBuilder().append("litebans + ");
                                            arg6 = AbstractCommand.AsyncBackgroundTask_5;
                                            arg16 = arg14;
                                            switch (arg16.hashCode()) {
                                                case -1396405339: {
                                                    if (!arg16.equals("ban-ip")) {
                                                        break;
                                                    }
                                                    break;
                                                }
                                                case 111426262: {
                                                    if (arg16.equals("unban")) break;
                                                    break;
                                                }
                                                case -840127329: {
                                                    if (!arg16.equals("unwarn")) {
                                                        break;
                                                    }
                                                    break;
                                                }
                                                case 1972486690: {
                                                    if (!arg16.equals("tempbanip")) {
                                                        break;
                                                    }
                                                    break;
                                                }
                                                case 93503862: {
                                                    if (!arg16.equals("banip")) {
                                                        break;
                                                    }
                                                    break;
                                                }
                                                case -1062781696: {
                                                    if (!arg16.equals("muteip")) {
                                                        break;
                                                    }
                                                    break;
                                                }
                                                case -840405966: {
                                                    if (!arg16.equals("unmute")) {
                                                        break;
                                                    }
                                                    break;
                                                }
                                                case 1351111124: {
                                                    if (!arg16.equals("tempmuteip")) {
                                                        break;
                                                    }
                                                    break;
                                                }
                                                case 1231784084: {
                                                    if (!arg16.equals("tempipmute")) {
                                                        break;
                                                    }
                                                    break;
                                                }
                                                case 1979386420: {
                                                    if (!arg16.equals("tempipban")) {
                                                        break;
                                                    }
                                                    break;
}
                                            v4 = "unban.own";
                                            break;
                                        }
                                        v4 = "unmute.own";
                                        break;
                                    }
                                    v4 = "unwarn.own";
                                    break;
                                }
                                v4 = "ipmute";
                                break;
                            }
                            v4 = "ipban";
                            break;
                                                        v4 = arg14;
                        }
                        arg8   = v3.append((String)v4).toString();
                        arg6 = arg15;
                        arg17 = new PunishmentCommand((String)arg14, (String)arg8  , (PunishmentService)arg15);
                        v5 = arg6.BaseCoreGenericHandler;
                        v6 = arg17.getPermission();
                        arg9   = AbstractCommand.AsyncBackgroundTask_5;
                        arg18 = arg17.getName();
                        arg19 = arg18;
                        switch (arg19.hashCode()) {
                            case -1320563219: {
                                if (arg19.equals("dupeip")) break;
                                break;
                            }
                            case 712910260: {
                                if (!arg19.equals("staffhistory")) {
                                    break;
                                }
                                break;
                            }
                            case 926934164: {
                                if (!arg19.equals("history")) {
                                    break;
                                }
                                break;
}
                        arg20 = new String[]{"alts", "litebans:alts", "checkalts", "litebans:checkalts", "litebans:dupeip"};
                        v7 = arg20;
                        break;
                    }
                    arg20 = new String[]{"hist", "litebans:history"};
                    v7 = arg20;
                    break;
                }
                arg20 = new String[]{"staffhist", "litebans:staffhistory"};
                v7 = arg20;
                break;
                                arg20 = new String[]{"litebans:" + arg18};
                v7 = arg20;
            }
            arg21 = v7;
            arg15.LiteBansModule_31(new LiteBansModule_265(arg17, v5, v6, Arrays.copyOf(arg21, arg21.length)));
}

    @Override
    public void e() {
    }

    @Override
    public void LiteBansModule_31() {
        v1 = this.e();
        v3 = v1;
        arg22   = new ArrayList<PunishmentService>(CollectionUtilities.BaseCoreGenericHandler(v1, 10));
        arg23 = v3.iterator();
        while (arg23.hasNext()) {
{
                        arg24 = arg23.next();
                        arg25 = (LiteCommand)arg24;
                        arg26 = arg22  ;
                        arg27 = this;
                        v0 = arg27.BaseCoreGenericHandler;
                        v1 = arg25.getPermission();
                        arg28 = AbstractCommand.AsyncBackgroundTask_5;
                        arg29 = arg25.getName();
                        arg30 = arg29;
                        switch (arg30.hashCode()) {
                            case -1320563219: {
                                if (arg30.equals("dupeip")) break;
                                break;
                            }
                            case 712910260: {
                                if (!arg30.equals("staffhistory")) {
                                    break;
                                }
                                break;
                            }
                            case 926934164: {
                                if (!arg30.equals("history")) {
                                    break;
                                }
                                break;
}
                        arg31 = new String[]{"alts", "litebans:alts", "checkalts", "litebans:checkalts", "litebans:dupeip"};
                        v2 = arg31;
                        break;
                    }
                    arg31 = new String[]{"hist", "litebans:history"};
                    v2 = arg31;
                    break;
                }
                arg31 = new String[]{"staffhist", "litebans:staffhistory"};
                v2 = arg31;
                break;
                                arg31 = new String[]{"litebans:" + arg29};
                v2 = arg31;
            }
            arg32 = v2;
            arg26.add(new LiteBansModule_265(arg25, v0, v1, Arrays.copyOf(arg32, arg32.length)));
        }
        v1 = (List)arg22  ;
        for (Collection arg22 : v1) {
            arg33 = (LiteCommand)arg22  ;
            this.LiteBansModule_31(arg33);
}

    @Override
    public void LiteBansModule_31(@Nullable LiteCommand command) {
        ConfigService configService = (ConfigService)this.plugin.BaseCoreGenericHandler(ConfigService.class);
        if (command instanceof LiteBansModule_265 && configService.e(((LiteBansModule_265)command).getName())) {
            super.LiteBansModule_31(command);
}

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public List BaseCoreGenericHandler(@Nullable LiteCommand command, @NotNull String string, @NotNull CommandSenderWrapper sender, @NotNull String[] args) {
        List list;
        if (!(args.length == 0)) {
            CommandSenderWrapper jv_03 = sender;
            String string2 = "litebans.tabcomplete";
            if (jv_03.e(string2)) {
                list = AbstractCommand.AsyncBackgroundTask_5.BaseCoreGenericHandler(command, string, sender, this.plugin, args);
                return list;
}
        list = CollectionUtilities.e();
        return list;
    }

    private static final boolean BaseCoreGenericHandler(LiteCommand command) {
        return ObjectUtilities.BaseCoreGenericHandler((Object)command.getName(), (Object)"togglechat");
    }

    private static final boolean BaseCoreGenericHandler(LiteBansModule_178 eo_02, Object object) {
        return (Boolean)eo_02.BaseCoreGenericHandler(object);
    }

    private static final void g() {
        e = new String[]{"ban", "litebans:", "ban", "dupeip", "staffhistory", "history", "alts", "litebans:alts", "checkalts", "litebans:checkalts", "litebans:dupeip", "hist", "litebans:history", "staffhist", "litebans:staffhistory", "litebans:", "", "ban-ip", "unban", "unwarn", "tempbanip", "banip", "muteip", "unmute", "tempmuteip", "tempipmute", "tempipban", "unban.own", "unmute.own", "unwarn.own", "ipmute", "ipban", "dupeip", "staffhistory", "history", "alts", "litebans:alts", "checkalts", "litebans:checkalts", "litebans:dupeip", "hist", "litebans:history", "staffhist", "litebans:staffhistory", "litebans:", "dupeip", "staffhistory", "history", "alts", "litebans:alts", "checkalts", "litebans:checkalts", "litebans:dupeip", "hist", "litebans:history", "staffhist", "litebans:staffhistory", "litebans:", "dupeip", "staffhistory", "history", "alts", "litebans:alts", "checkalts", "litebans:checkalts", "litebans:dupeip", "hist", "litebans:history", "staffhist", "litebans:staffhistory", "litebans:", "", "ban-ip", "unban", "unwarn", "tempbanip", "banip", "muteip", "unmute", "tempmuteip", "tempipmute", "tempipban", "unban.own", "unmute.own", "unwarn.own", "ipmute", "ipban", "dupeip", "staffhistory", "history", "alts", "litebans:alts", "checkalts", "litebans:checkalts", "litebans:dupeip", "hist", "litebans:history", "staffhist", "litebans:staffhistory", "litebans:", "", "ban-ip", "unban", "unwarn", "tempbanip", "banip", "muteip", "unmute", "tempmuteip", "tempipmute", "tempipban", "unban.own", "unmute.own", "unwarn.own", "ipmute", "ipban", "dupeip", "staffhistory", "history", "alts", "litebans:alts", "checkalts", "litebans:checkalts", "litebans:dupeip", "hist", "litebans:history", "staffhist", "litebans:staffhistory", "litebans:", "litebans.tabcomplete", "togglechat"};
}

