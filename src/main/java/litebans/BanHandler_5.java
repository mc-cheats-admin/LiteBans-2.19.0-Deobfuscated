package litebans;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ModulePriority(priority=2)
public final class BanHandler_5
extends LiteBansModule_250 {
        public BanHandler_5(@NotNull PlatformPlugin plugin) {
        super(plugin);
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
            BanHandler_5 i = this;
            n2 = 0;
            i.BaseCoreGenericHandler.LiteBansModule_31(new CommandExecutionTask(sender, cmdArgs, abstractCommand, (String)contextObj));
            return;
        }
        targetObj = CommandArgumentUtils.BaseCoreGenericHandler(AbstractCommand.AsyncBackgroundTask_5, (String)contextObj, cmdArgs);
        BanHandler_5 i = this;
                n3 = 0;
        AbstractCommand banCommand = (AbstractCommand)((CommandManager)resultObj).BaseCoreGenericHandler("ban");
        if (banCommand == null) {
            AssertionUtilities.BaseCoreGenericHandler();
            throw new CommandExitException();
        }
        resultObj = banCommand;
        n3 = 0;
        i.BaseCoreGenericHandler.LiteBansModule_31(new CommandExecutionTask(sender, (String[])targetObj, (AbstractCommand)resultObj, (String)contextObj));
    }

    @Override
    public void BaseCoreGenericHandler() {
        v1 = (ConfigService)this.plugin.BaseCoreGenericHandler(ConfigService.class);
        v1.e();
        super.BaseCoreGenericHandler();
        this.plugin.BaseCoreGenericHandler(this);
        v2 = this.e();
        v3 = v2;
        v4 = new ArrayList<PunishmentService>(CollectionUtilities.BaseCoreGenericHandler((Iterable)v2, 10));
        v5 = v3.iterator();
        while (v5.hasNext()) {
            block40: {
                block38: {
                    block39: {
                        v6 = v5.next();
                        v7 = (LiteCommand)v6;
                        v8 = v4;
                        v9 = this;
                        v0 = v9.BaseCoreGenericHandler;
                        v10 = AbstractCommand.AsyncBackgroundTask_5;
                        v11 = v7.getName();
                        v12 = v11;
                        switch (v12.hashCode()) {
                            case -1320563219: {
                                if (v12.equals("dupeip")) break;
                                break;
                            }
                            case 712910260: {
                                if (!v12.equals("staffhistory")) {
                                    break;
                                }
                                break block38;
                            }
                            case 926934164: {
                                if (!v12.equals("\u777d\u777c\u7766\u7761\u777a\u7767\u776c")) {
                                    break;
                                }
                                break block39;
                            }
                        }
                        v13   = new String[]{"alts", "litebans:alts", "checkalts", "litebans:checkalts", "litebans:dupeip"};
                        v1 = v13  ;
                        break block40;
                    }
                    v13   = new String[]{"hist", "litebans:history"};
                    v1 = v13  ;
                    break block40;
                }
                v13   = new String[]{"staffhist", "litebans:staffhistory"};
                v1 = v13  ;
                break block40;
                                v13   = new String[]{"litebans:" + (String)v11};
                v1 = v13  ;
            }
            v14   = v1;
            v8.add(new LiteBansModule_32((LiteCommand)v7, v0, null, Arrays.copyOf(v14  , v14  .length), 4, null));
        }
        v2 = (List)v4;
        v3 = v2.iterator();
        while (v3.hasNext()) {
            v4 = v3.next();
            v15 = (LiteCommand)v4;
            this.LiteBansModule_31(v15);
        }
        v2 = this;
        ObjectUtilities.BaseCoreGenericHandler(v1);
        v16 = v1;
        v4 = AbstractCommand.AsyncBackgroundTask_5.BaseCoreGenericHandler(v16);
        v17 = v4.length;
        for (v18 = 0; v18 < v17; ++v18) {
            block48: {
                block46: {
                    block47: {
                        block45: {
                            block41: {
                                block43: {
                                    block42: {
                                        block44: {
                                            v19 = v7 = v4[v18];
                                            v20 = v2;
                                            v2 = new StringBuilder().append("litebans + ");
                                            v11 = AbstractCommand.AsyncBackgroundTask_5;
                                            v21 = v19;
                                            switch (v21.hashCode()) {
                                                case -1396405339: {
                                                    if (!v21.equals("ban-ip")) {
                                                        break;
                                                    }
                                                    break block41;
                                                }
                                                case 111426262: {
                                                    if (v21.equals("unban")) break;
                                                    break;
                                                }
                                                case -840127329: {
                                                    if (!v21.equals("unwarn")) {
                                                        break;
                                                    }
                                                    break block42;
                                                }
                                                case 1972486690: {
                                                    if (!v21.equals("tempbanip")) {
                                                        break;
                                                    }
                                                    break block41;
                                                }
                                                case 93503862: {
                                                    if (!v21.equals("banip")) {
                                                        break;
                                                    }
                                                    break block41;
                                                }
                                                case -1062781696: {
                                                    if (!v21.equals("muteip")) {
                                                        break;
                                                    }
                                                    break block43;
                                                }
                                                case -840405966: {
                                                    if (!v21.equals("unmute")) {
                                                        break;
                                                    }
                                                    break block44;
                                                }
                                                case 1351111124: {
                                                    if (!v21.equals("tempmuteip")) {
                                                        break;
                                                    }
                                                    break block43;
                                                }
                                                case 1231784084: {
                                                    if (!v21.equals("tempipmute")) {
                                                        break;
                                                    }
                                                    break block43;
                                                }
                                                case 1979386420: {
                                                    if (!v21.equals("tempipban")) {
                                                        break;
                                                    }
                                                    break block41;
                                                }
                                            }
                                            v3 = "unban.own";
                                            break block45;
                                        }
                                        v3 = "unmute.own";
                                        break block45;
                                    }
                                    v3 = "unwarn.own";
                                    break block45;
                                }
                                v3 = "ipmute";
                                break block45;
                            }
                            v3 = "ipban";
                            break block45;
                                                        v3 = v19;
                        }
                        v13   = v2.append((String)v3).toString();
                        v11 = v20;
                        v22 = new MuteChatCommand((String)v19, (String)v13  , (CommandManager)v20);
                        v4 = v11.BaseCoreGenericHandler;
                        v14   = AbstractCommand.AsyncBackgroundTask_5;
                        v23 = v22.getName();
                        v24 = v23;
                        switch (v24.hashCode()) {
                            case -1320563219: {
                                if (v24.equals("dupeip")) break;
                                break;
                            }
                            case 712910260: {
                                if (!v24.equals("staffhistory")) {
                                    break;
                                }
                                break block46;
                            }
                            case 926934164: {
                                if (!v24.equals("history")) {
                                    break;
                                }
                                break block47;
                            }
                        }
                        v25 = new String[]{"alts", "litebans:alts", "checkalts", "litebans:checkalts", "litebans:dupeip"};
                        v5 = v25;
                        break block48;
                    }
                    v25 = new String[]{"hist", "litebans:history"};
                    v5 = v25;
                    break block48;
                }
                v25 = new String[]{"staffhist", "litebans:staffhistory"};
                v5 = v25;
                break block48;
                                v25 = new String[]{"litebans:" + v23};
                v5 = v25;
            }
            v26 = v5;
            v20.LiteBansModule_31(new LiteBansModule_32(v22, v4, null, Arrays.copyOf(v26, v26.length), 4, null));
        }
    }

    @Override
    public void LiteBansModule_31(@Nullable LiteCommand command) {
        ConfigService configService = (ConfigService)this.plugin.BaseCoreGenericHandler(ConfigService.class);
        if (command instanceof LiteBansModule_32 && configService.e(((LiteBansModule_32)command).getName())) {
            super.LiteBansModule_31(command);
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
        e = new String[]{"ban", "litebans:", "ban", "dupeip", "staffhistory", StringDecryptor.BaseCoreGenericHandler("\u777d\u777c\u7766\u7761\u777a\u7767\u776c", 0x51757715), "alts", "litebans:alts", "checkalts", "litebans:checkalts", "litebans:dupeip", "hist", "litebans:history", "staffhist", "litebans:staffhistory", "litebans:", "", "ban-ip", "unban", "unwarn", "tempbanip", "banip", "muteip", "unmute", "tempmuteip", "tempipmute", "tempipban", "unban.own", "unmute.own", "unwarn.own", "ipmute", "ipban", "dupeip", "staffhistory", "history", "alts", "litebans:alts", "checkalts", "litebans:checkalts", "litebans:dupeip", "hist", "litebans:history", "staffhist", "litebans:staffhistory", "litebans:", "dupeip", "staffhistory", "history", "alts", "litebans:alts", "checkalts", "litebans:checkalts", "litebans:dupeip", "hist", "litebans:history", "staffhist", "litebans:staffhistory", "litebans:", "", "ban-ip", "unban", "unwarn", "tempbanip", "banip", "muteip", "unmute", "tempmuteip", "tempipmute", "tempipban", "unban.own", "unmute.own", "unwarn.own", "ipmute", "ipban", "dupeip", "staffhistory", "history", "alts", "litebans:alts", "checkalts", "litebans:checkalts", "litebans:dupeip", "hist", "litebans:history", "staffhist", "litebans:staffhistory", "litebans:", "", "ban-ip", "unban", "unwarn", "tempbanip", "banip", "muteip", "unmute", "tempmuteip", "tempipmute", "tempipban", "unban.own", "unmute.own", "unwarn.own", "ipmute", "ipban", "dupeip", "staffhistory", "history", "alts", "litebans:alts", "checkalts", "litebans:checkalts", "litebans:dupeip", "hist", "litebans:history", "staffhist", "litebans:staffhistory", "litebans:", "litebans.tabcomplete"};
    }

    static {
        BanHandler_5.g();
    }
}

