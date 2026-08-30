package litebans;

import com.mojang.brigadier.CommandDispatcher;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ModulePriority(priority=3)
public final class BanHandler_4
extends LiteBansModule_199 {
    public BanHandler_4(@NotNull PlatformPlugin plugin) {
        super(plugin);
    }

    @Override
    public boolean AsyncBackgroundTask_5() {
        return this.plugin.AsyncBackgroundTask_22() == 3;
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
{
            contextObj = AbstractCommand.AsyncBackgroundTask_5;
            targetObj = args;
            flag2 = false;
            n3 = ((String[])targetObj).length;
            for (n2 = 0; n2 < n3; ++n2) {
                String string2;
                String string3 = string2 = targetObj[n2];
                n = 0;
                if (!StringUtilities.LiteBansModule_31(string3)) continue;
                flag = false;
                break;
            }
            flag = true;
        }
        if (flag) {
            filteredArgs = args;
        } else {
            targetObj = args;
            flag2 = false;
            String[] parsedArgs = targetObj;
            Collection collection = new ArrayList();
            n = parsedArgs.length;
            for (int i = 0; i < n; ++i) {
                String string4;
                String string5 = string4 = parsedArgs[i];
                boolean flag6 = !StringUtilities.LiteBansModule_31(string5);
                if (!flag6) continue;
                collection.add(string4);
            }
            targetObj = (List)collection;
            flag2 = false;
            parsedArgs = targetObj;
            filteredArgs = parsedArgs.toArray(new String[0]);
        }
        String[] cmdArgs = filteredArgs;
        contextObj = string;
        contextObj = StringUtilities.BaseCoreGenericHandler((String)contextObj, "litebans:", null, 2, null);
        AbstractCommand abstractCommand = this.plugin((String)contextObj);
        if (abstractCommand != null) {
            targetObj = abstractCommand.getPermission();
            if (targetObj != null) {
                CommandSenderWrapper senderWrapper = sender;
                n2 = 0;
                CommandSenderWrapper senderWrapper = senderWrapper;
                if (!senderWrapper.etargetObj) {
                    senderWrapper = sender;
                    CharSequence charSequence = MessageKey.cZ;
                    ChatFormatter.BaseCoreGenericHandler(MessageHandler.BaseCoreGenericHandler, senderWrapper, charSequence, null, 4, null);
                    return;
}
            BanHandler_4 g = this;
            n2 = 0;
            g.BaseCoreGenericHandler.LiteBansModule_31(new CommandExecutionTask(sender, cmdArgs, abstractCommand, (String)contextObj));
            return;
        }
        targetObj = CommandArgumentUtils.BaseCoreGenericHandler(AbstractCommand.AsyncBackgroundTask_5, (String)contextObj, cmdArgs);
        BanHandler_4 g = this;
                n3 = 0;
        AbstractCommand banCommand = (AbstractCommand)this.BaseCoreGenericHandler("ban");
        if (banCommand == null) {
            AssertionUtilities.BaseCoreGenericHandler();
            throw new CommandExitException();
        }
        resultObj = banCommand;
        n3 = 0;
        g.BaseCoreGenericHandler.LiteBansModule_31(new CommandExecutionTask(sender, (String[])targetObj, (AbstractCommand)resultObj, (String)contextObj));
    }

    @Override
    public void BaseCoreGenericHandler() {
        ConfigService configService = this.plugin.BaseCoreGenericHandler(ConfigService.class);
        configService.BaseCoreGenericHandler();
        super.BaseCoreGenericHandler();
        this.plugin.BaseCoreGenericHandler(this);
        BanHandler_4 g = this;
        ObjectUtilities.BaseCoreGenericHandler(configService);
        ConfigService q_03 = configService;
        PlatformPlugin plugin = g.BaseCoreGenericHandler;
        ObjectUtilities.LiteBansModule_31(plugin, "");
        ((ConfigYmlHandler)plugin).g().BaseCoreGenericHandler(new UnbanHandler(q_03, g));
    }

    @Override
    public void BaseCoreGenericHandler(@NotNull LiteBansModule_352 v1, @NotNull CommandDispatcher v2) {
{
                        v3 = this.plugin.BaseCoreGenericHandler(ConfigService.class);
                        if (!v3.e(v1.getName())) break;
                        super.BaseCoreGenericHandler(v1, v2);
                        if (v1.BaseCoreGenericHandler() instanceof ClearChatCommand) break;
                        arg1 = new String[2][];
                        arg1[0] = v1.getAliases();
                        arg2 = AbstractCommand.AsyncBackgroundTask_5;
                        arg3 = v1.getName();
                        arg4 = arg3;
                        switch (arg4.hashCode()) {
                            case -1320563219: {
                                if (arg4.equals("dupeip")) break;
                                break;
                            }
                            case 712910260: {
                                if (!arg4.equals("staffhistory")) {
                                    break;
                                }
                                break;
                            }
                            case 926934164: {
                                if (!arg4.equals("history")) {
                                    break;
                                }
                                break;
}
                        arg5 = new String[]{"alts", "litebans:alts", "checkalts", "litebans:checkalts", "litebans:dupeip"};
                        v0   = arg5;
                        break;
                    }
                    arg5 = new String[]{"hist", "litebans:history"};
                    v0   = arg5;
                    break;
                }
                arg5 = new String[]{"staffhist", "litebans:staffhistory"};
                v0   = arg5;
                break;
                                arg5 = new String[]{"litebans:" + (String)arg3};
                v0   = arg5;
            }
            arg1[1] = v0  ;
            arg1 = ArrayUtilities.BaseCoreGenericHandler((Object[][])arg1);
            arg3 = arg1;
            arg6 = new ArrayList<PunishmentService>();
            arg5 = arg3.iterator();
            while (arg5.hasNext()) {
                arg7 = arg5.next();
                arg8 = (String)arg7;
                ObjectUtilities.BaseCoreGenericHandler(arg8);
                if (!(StringUtilities.c(arg8, ':', false, 2, null) == false)) continue;
                arg6.add(arg7);
            }
            arg1 = (List)arg6;
            arg3 = arg1.iterator();
            while (arg3.hasNext()) {
{
                                                arg6 = arg3.next();
                                                arg9 = (String)arg6;
                                                                                                ObjectUtilities.BaseCoreGenericHandler(arg9);
                                                arg8 = arg9;
                                                arg10 = v1.getName();
                                                v1 = new StringBuilder().append("litebans + ");
                                                arg11 = AbstractCommand.AsyncBackgroundTask_5;
                                                arg12 = arg8;
                                                switch (arg12.hashCode()) {
                                                    case -1396405339: {
                                                        if (!arg12.equals("ban-ip")) {
                                                            break;
                                                        }
                                                        break;
                                                    }
                                                    case 111426262: {
                                                        if (arg12.equals("unban")) break;
                                                        break;
                                                    }
                                                    case -840127329: {
                                                        if (!arg12.equals("unwarn")) {
                                                            break;
                                                        }
                                                        break;
                                                    }
                                                    case 1972486690: {
                                                        if (!arg12.equals("tempbanip")) {
                                                            break;
                                                        }
                                                        break;
                                                    }
                                                    case 93503862: {
                                                        if (!arg12.equals("banip")) {
                                                            break;
                                                        }
                                                        break;
                                                    }
                                                    case -1062781696: {
                                                        if (!arg12.equals("muteip")) {
                                                            break;
                                                        }
                                                        break;
                                                    }
                                                    case -840405966: {
                                                        if (!arg12.equals("unmute")) {
                                                            break;
                                                        }
                                                        break;
                                                    }
                                                    case 1351111124: {
                                                        if (!arg12.equals("tempmuteip")) {
                                                            break;
                                                        }
                                                        break;
                                                    }
                                                    case 1231784084: {
                                                        if (!arg12.equals("tempipmute")) {
                                                            break;
                                                        }
                                                        break;
                                                    }
                                                    case 1979386420: {
                                                        if (!arg12.equals("tempipban")) {
                                                            break;
                                                        }
                                                        break;
}
                                                v2 = "unban.own";
                                                break;
                                            }
                                            v2 = "unmute.own";
                                            break;
                                        }
                                        v2 = "unwarn.own";
                                        break;
                                    }
                                    v2 = "ipmute";
                                    break;
                                }
                                v2 = "ipban";
                                break;
                                                                v2 = arg8;
                            }
                            arg13 = v1.append(v2).toString();
                            arg11 = new ClearChatCommand(arg8, arg10, v1, arg13, (CommandManager)arg7);
                            arg14 = arg7;
                            arg12 = AbstractCommand.AsyncBackgroundTask_5;
                            arg15 = arg11.getName();
                            arg16 = arg15;
                            switch (arg16.hashCode()) {
                                case -1320563219: {
                                    if (arg16.equals("dupeip")) break;
                                    break;
                                }
                                case 712910260: {
                                    if (!arg16.equals("staffhistory")) {
                                        break;
                                    }
                                    break;
                                }
                                case 926934164: {
                                    if (!arg16.equals("history")) {
                                        break;
                                    }
                                    break;
}
                            arg17 = new String[]{"alts", "litebans:alts", "checkalts", "litebans:checkalts", "litebans:dupeip"};
                            v3 = arg17;
                            break;
                        }
                        arg17 = new String[]{"hist", "litebans:history"};
                        v3 = arg17;
                        break;
                    }
                    arg17 = new String[]{"staffhist", "litebans:staffhistory"};
                    v3 = arg17;
                    break;
                                        arg17 = new String[]{"litebans:" + arg15};
                    v3 = arg17;
                }
                arg12 = v3;
                arg7.BaseCoreGenericHandler(new LiteBansModule_352((LiteCommand)arg11, ((LiteCommand)arg11).getPermission(), arg14.BaseCoreGenericHandler, arg12), v2);
                if (v1 == null) continue;
                arg7.BaseCoreGenericHandler(arg8, (LiteCommand)arg11);
}

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public List BaseCoreGenericHandler(@Nullable LiteCommand command, @NotNull String string, @NotNull CommandSenderWrapper sender, @NotNull String[] args) {
        List list;
        if (!(args.length == 0)) {
            CommandSenderWrapper senderWrapper = sender;
            String string2 = "litebans.tabcomplete";
            CommandSenderWrapper senderWrapper = senderWrapper;
            if (!(!senderWrapper.e(string2))) {
                list = AbstractCommand.AsyncBackgroundTask_5.BaseCoreGenericHandler(command, string, sender, this.plugin, args);
                return list;
}
        list = CollectionUtilities.e();
        return list;
    }

    private static final void g() {
        e = new String[]{"ban", "litebans:", "ban", "", "dupeip", "staffhistory", "history", "alts", "litebans:alts", "checkalts", "litebans:checkalts", "litebans:dupeip", "hist", "litebans:history", "staffhist", "litebans:staffhistory", "litebans:", "", "ban-ip", "unban", "unwarn", "tempbanip", "banip", "muteip", "unmute", "tempmuteip", "tempipmute", "tempipban", "unban.own", "unmute.own", "unwarn.own", "ipmute", "ipban", "dupeip", "staffhistory", "history", "alts", "litebans:alts", "checkalts", "litebans:checkalts", "litebans:dupeip", "hist", "litebans:history", "staffhist", "litebans:staffhistory", "litebans:", "", "", "ban-ip", "unban", "unwarn", "tempbanip", "banip", "muteip", "unmute", "tempmuteip", "tempipmute", "tempipban", "unban.own", "unmute.own", "unwarn.own", StringDecryptor.BaseCoreGenericHandler("\ubf96\ubf8f\ubf92\ubf8a\ubf8b\ubf9a", 0xFFFBFFF), "ipban", "dupeip", "staffhistory", "history", "alts", "litebans:alts", "checkalts", "litebans:checkalts", "litebans:dupeip", "hist", "litebans:history", "staffhist", "litebans:staffhistory", "litebans:", "litebans.tabcomplete"};
}

