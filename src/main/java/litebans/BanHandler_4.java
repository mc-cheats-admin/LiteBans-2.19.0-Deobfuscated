package litebans;

import com.mojang.brigadier.CommandDispatcher;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ModulePriority(priority=3)
public final class BanHandler_4
extends LiteBansModule_200 {
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
        block8: {
            contextObj = AbstractCommand.AsyncBackgroundTask_5;
            targetObj = args;
            flag2 = false;
            n3 = ((String[])targetObj).length;
            for (n2 = 0; n2 < n3; ++n2) {
                String string2;
                String string3 = string2 = targetObj[n2];
                n = 0;
                if (!StringUtilities.LiteBansModule_31((CharSequence)string3)) continue;
                flag = false;
                break block8;
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
                boolean flag6 = !StringUtilities.LiteBansModule_31((CharSequence)string5);
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
        AbstractCommand abstractCommand = (AbstractCommand)this.plugin((String)contextObj);
        if (abstractCommand != null) {
            targetObj = abstractCommand.getPermission();
            if (targetObj != null) {
                CommandSenderWrapper senderWrapper = sender;
                n2 = 0;
                CommandSenderWrapper senderWrapper = senderWrapper;
                if (!senderWrapper.e((String)targetObj)) {
                    senderWrapper = sender;
                    CharSequence charSequence = MessageKey.cZ;
                    ChatFormatter.BaseCoreGenericHandler(MessageHandler.BaseCoreGenericHandler, senderWrapper, charSequence, null, 4, null);
                    return;
                }
            }
            BanHandler_4 g = this;
            n2 = 0;
            g.BaseCoreGenericHandler.LiteBansModule_31(new CommandExecutionTask(sender, cmdArgs, abstractCommand, (String)contextObj));
            return;
        }
        targetObj = CommandArgumentUtils.BaseCoreGenericHandler(AbstractCommand.AsyncBackgroundTask_5, (String)contextObj, cmdArgs);
        BanHandler_4 g = this;
                n3 = 0;
        AbstractCommand banCommand = (AbstractCommand)((CommandManager)resultObj).BaseCoreGenericHandler("ban");
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
        ConfigService configService = (ConfigService)this.plugin.BaseCoreGenericHandler(ConfigService.class);
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
    public void BaseCoreGenericHandler(@NotNull LiteBansModule_354 v1, @NotNull CommandDispatcher v2) {
        block37: {
            block40: {
                block38: {
                    block39: {
                        v3 = (ConfigService)this.plugin.BaseCoreGenericHandler(ConfigService.class);
                        if (!v3.e(v1.getName())) break block37;
                        super.BaseCoreGenericHandler(v1, v2);
                        if (v1.BaseCoreGenericHandler() instanceof ClearChatCommand) break block37;
                        v4 = new String[2][];
                        v4[0] = v1.getAliases();
                        v5 = AbstractCommand.AsyncBackgroundTask_5;
                        v6 = v1.getName();
                        v7 = v6;
                        switch (v7.hashCode()) {
                            case -1320563219: {
                                if (v7.equals("dupeip")) break;
                                break;
                            }
                            case 712910260: {
                                if (!v7.equals("staffhistory")) {
                                    break;
                                }
                                break block38;
                            }
                            case 926934164: {
                                if (!v7.equals("history")) {
                                    break;
                                }
                                break block39;
                            }
                        }
                        v8 = new String[]{"alts", "litebans:alts", "checkalts", "litebans:checkalts", "litebans:dupeip"};
                        v0   = v8;
                        break block40;
                    }
                    v8 = new String[]{"hist", "litebans:history"};
                    v0   = v8;
                    break block40;
                }
                v8 = new String[]{"staffhist", "litebans:staffhistory"};
                v0   = v8;
                break block40;
                                v8 = new String[]{"litebans:" + (String)v6};
                v0   = v8;
            }
            v4[1] = v0  ;
            v4 = ArrayUtilities.BaseCoreGenericHandler((Object[][])v4);
            v6 = v4;
            v9 = new ArrayList<PunishmentService>();
            v8 = v6.iterator();
            while (v8.hasNext()) {
                v10 = v8.next();
                v11 = (String)v10;
                ObjectUtilities.BaseCoreGenericHandler((Object)v11);
                if (!(StringUtilities.c((CharSequence)v11, ':', false, 2, null) == false)) continue;
                v9.add(v10);
            }
            v4 = (List)v9;
            v6 = v4.iterator();
            while (v6.hasNext()) {
                block48: {
                    block46: {
                        block47: {
                            block45: {
                                block41: {
                                    block43: {
                                        block42: {
                                            block44: {
                                                v9 = v6.next();
                                                v12 = (String)v9;
                                                v10 = this;
                                                ObjectUtilities.BaseCoreGenericHandler((Object)v12);
                                                v11 = v12;
                                                v13 = v1.getName();
                                                v1 = new StringBuilder().append("litebans + ");
                                                v14 = AbstractCommand.AsyncBackgroundTask_5;
                                                v15 = v11;
                                                switch (v15.hashCode()) {
                                                    case -1396405339: {
                                                        if (!v15.equals("ban-ip")) {
                                                            break;
                                                        }
                                                        break block41;
                                                    }
                                                    case 111426262: {
                                                        if (v15.equals("unban")) break;
                                                        break;
                                                    }
                                                    case -840127329: {
                                                        if (!v15.equals("unwarn")) {
                                                            break;
                                                        }
                                                        break block42;
                                                    }
                                                    case 1972486690: {
                                                        if (!v15.equals("tempbanip")) {
                                                            break;
                                                        }
                                                        break block41;
                                                    }
                                                    case 93503862: {
                                                        if (!v15.equals("banip")) {
                                                            break;
                                                        }
                                                        break block41;
                                                    }
                                                    case -1062781696: {
                                                        if (!v15.equals("muteip")) {
                                                            break;
                                                        }
                                                        break block43;
                                                    }
                                                    case -840405966: {
                                                        if (!v15.equals("unmute")) {
                                                            break;
                                                        }
                                                        break block44;
                                                    }
                                                    case 1351111124: {
                                                        if (!v15.equals("tempmuteip")) {
                                                            break;
                                                        }
                                                        break block43;
                                                    }
                                                    case 1231784084: {
                                                        if (!v15.equals("tempipmute")) {
                                                            break;
                                                        }
                                                        break block43;
                                                    }
                                                    case 1979386420: {
                                                        if (!v15.equals("tempipban")) {
                                                            break;
                                                        }
                                                        break block41;
                                                    }
                                                }
                                                v2 = "unban.own";
                                                break block45;
                                            }
                                            v2 = "unmute.own";
                                            break block45;
                                        }
                                        v2 = "unwarn.own";
                                        break block45;
                                    }
                                    v2 = "ipmute";
                                    break block45;
                                }
                                v2 = "ipban";
                                break block45;
                                                                v2 = v11;
                            }
                            v16 = v1.append(v2).toString();
                            v14 = new ClearChatCommand(v11, v13, v1, v16, (CommandManager)v10);
                            v17 = v10;
                            v15 = AbstractCommand.AsyncBackgroundTask_5;
                            v18 = v14.getName();
                            v19 = v18;
                            switch (v19.hashCode()) {
                                case -1320563219: {
                                    if (v19.equals("dupeip")) break;
                                    break;
                                }
                                case 712910260: {
                                    if (!v19.equals("staffhistory")) {
                                        break;
                                    }
                                    break block46;
                                }
                                case 926934164: {
                                    if (!v19.equals("history")) {
                                        break;
                                    }
                                    break block47;
                                }
                            }
                            v20 = new String[]{"alts", "litebans:alts", "checkalts", "litebans:checkalts", "litebans:dupeip"};
                            v3 = v20;
                            break block48;
                        }
                        v20 = new String[]{"hist", "litebans:history"};
                        v3 = v20;
                        break block48;
                    }
                    v20 = new String[]{"staffhist", "litebans:staffhistory"};
                    v3 = v20;
                    break block48;
                                        v20 = new String[]{"litebans:" + v18};
                    v3 = v20;
                }
                v15 = v3;
                v10.BaseCoreGenericHandler(new LiteBansModule_354((LiteCommand)v14, ((LiteCommand)v14).getPermission(), v17.BaseCoreGenericHandler, v15), v2);
                if (v1 == null) continue;
                v10.BaseCoreGenericHandler(v11, (LiteCommand)v14);
            }
        }
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
        }
        list = CollectionUtilities.e();
        return list;
    }

    private static final void g() {
        e = new String[]{"ban", "litebans:", "ban", "", "dupeip", "staffhistory", "history", "alts", "litebans:alts", "checkalts", "litebans:checkalts", "litebans:dupeip", "hist", "litebans:history", "staffhist", "litebans:staffhistory", "litebans:", "", "ban-ip", "unban", "unwarn", "tempbanip", "banip", "muteip", "unmute", "tempmuteip", "tempipmute", "tempipban", "unban.own", "unmute.own", "unwarn.own", "ipmute", "ipban", "dupeip", "staffhistory", "history", "alts", "litebans:alts", "checkalts", "litebans:checkalts", "litebans:dupeip", "hist", "litebans:history", "staffhist", "litebans:staffhistory", "litebans:", "", "", "ban-ip", "unban", "unwarn", "tempbanip", "banip", "muteip", "unmute", "tempmuteip", "tempipmute", "tempipban", "unban.own", "unmute.own", "unwarn.own", StringDecryptor.BaseCoreGenericHandler("\ubf96\ubf8f\ubf92\ubf8a\ubf8b\ubf9a", 0xFFFBFFF), "ipban", "dupeip", "staffhistory", "history", "alts", "litebans:alts", "checkalts", "litebans:checkalts", "litebans:dupeip", "hist", "litebans:history", "staffhist", "litebans:staffhistory", "litebans:", "litebans.tabcomplete"};
    }

    static {
        BanHandler_4.g();
    }
}

