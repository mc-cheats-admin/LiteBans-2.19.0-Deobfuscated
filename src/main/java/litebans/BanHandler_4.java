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
        Object object;
        Object object2;
        block8: {
            object2 = AbstractCommand.AsyncBackgroundTask_5;
            boolean flag3 = false;
            object = args;
            flag2 = false;
            n3 = ((String[])object).length;
            for (n2 = 0; n2 < n3; ++n2) {
                String string2;
                String string3 = string2 = object[n2];
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
            object = args;
            flag2 = false;
            String[] parsedArgs = object;
            Collection collection = new ArrayList();
            boolean flag4 = false;
            n = parsedArgs.length;
            for (int i = 0; i < n; ++i) {
                String string4;
                String string5 = string4 = parsedArgs[i];
                boolean flag5 = false;
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
                boolean flag7 = false;
                if (!jv_04.e((String)object)) {
                    jv_03 = sender;
                    CharSequence charSequence = MessageKey.cZ;
                    boolean flag8 = false;
                    ChatFormatter.BaseCoreGenericHandler(MessageHandler.BaseCoreGenericHandler, jv_03, charSequence, null, 4, null);
                    return;
                }
            }
            BanHandler_4 g = this;
            n2 = 0;
            g.BaseCoreGenericHandler.LiteBansModule_31(new CommandExecutionTask(sender, cmdArgs, abstractCommand, (String)object2));
            return;
        }
        object = CommandArgumentUtils.BaseCoreGenericHandler(AbstractCommand.AsyncBackgroundTask_5, (String)object2, cmdArgs);
        BanHandler_4 g = this;
        Object object3 = this;
        n3 = 0;
        AbstractCommand banCommand = (AbstractCommand)((CommandManager)object3).BaseCoreGenericHandler("ban");
        if (banCommand == null) {
            AssertionUtilities.BaseCoreGenericHandler();
            throw new CommandExitException();
        }
        object3 = banCommand;
        n3 = 0;
        g.BaseCoreGenericHandler.LiteBansModule_31(new CommandExecutionTask(sender, (String[])object, (AbstractCommand)object3, (String)object2));
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
        boolean flag = false;
        PlatformPlugin plugin = g.BaseCoreGenericHandler;
        ObjectUtilities.LiteBansModule_31(plugin, "");
        ((ConfigYmlHandler)plugin).g().BaseCoreGenericHandler(new UnbanHandler(q_03, g));
    }

    @Override
    public void BaseCoreGenericHandler(@NotNull LiteBansModule_352 v1, @NotNull CommandDispatcher v2) {
        block37: {
            block40: {
                block38: {
                    block39: {
                        v3 = (ConfigService)this.plugin.BaseCoreGenericHandler(ConfigService.class);
                        if (!v3.e(v1.getName())) break block37;
                        super.BaseCoreGenericHandler(v1, v2);
                        if (v1.BaseCoreGenericHandler() instanceof ClearChatCommand) break block37;
                        var4_4 = new String[2][];
                        var4_4[0] = v1.getAliases();
                        var5_5 = AbstractCommand.AsyncBackgroundTask_5;
                        var6_7 = v1.getName();
                        var7_8 = false;
                        var8_10 = var6_7;
                        switch (var8_10.hashCode()) {
                            case -1320563219: {
                                if (var8_10.equals("dupeip")) break;
                                ** break;
                            }
                            case 712910260: {
                                if (!var8_10.equals("staffhistory")) {
                                    ** break;
                                }
                                break block38;
                            }
                            case 926934164: {
                                if (!var8_10.equals("history")) {
                                    ** break;
                                }
                                break block39;
                            }
                        }
                        var9_13 = new String[]{"alts", "litebans:alts", "checkalts", "litebans:checkalts", "litebans:dupeip"};
                        v0 /* !! */  = var9_13;
                        break block40;
                    }
                    var9_13 = new String[]{"hist", "litebans:history"};
                    v0 /* !! */  = var9_13;
                    break block40;
                }
                var9_13 = new String[]{"staffhist", "litebans:staffhistory"};
                v0 /* !! */  = var9_13;
                break block40;
lbl34:
                // 4 sources

                var9_13 = new String[]{"litebans:" + (String)var6_7};
                v0 /* !! */  = var9_13;
            }
            var4_4[1] = v0 /* !! */ ;
            var4_4 = ArrayUtilities.BaseCoreGenericHandler((Object[][])var4_4);
            var5_6 = false;
            var6_7 = var4_4;
            var7_9 = new ArrayList<PunishmentService>();
            var8_11 = false;
            var9_13 = var6_7.iterator();
            while (var9_13.hasNext()) {
                var10_15 = var9_13.next();
                var11_16 = (String)var10_15;
                var12_17 = false;
                ObjectUtilities.BaseCoreGenericHandler((Object)var11_16);
                if (!(StringUtilities.c((CharSequence)var11_16, ':', false, 2, null) == false)) continue;
                var7_9.add(var10_15);
            }
            var4_4 = (List)var7_9;
            var5_6 = false;
            var6_7 = var4_4.iterator();
            while (var6_7.hasNext()) {
                block48: {
                    block46: {
                        block47: {
                            block45: {
                                block41: {
                                    block43: {
                                        block42: {
                                            block44: {
                                                var7_9 = var6_7.next();
                                                var8_12 = (String)var7_9;
                                                var9_14 = false;
                                                var10_15 = this;
                                                ObjectUtilities.BaseCoreGenericHandler((Object)var8_12);
                                                var11_16 = var8_12;
                                                var12_18 = v1.getName();
                                                var13_19 = false;
                                                v1 = new StringBuilder().append("litebans + ");
                                                var14_20 = AbstractCommand.AsyncBackgroundTask_5;
                                                var15_22 = false;
                                                var16_23 = var11_16;
                                                switch (var16_23.hashCode()) {
                                                    case -1396405339: {
                                                        if (!var16_23.equals("ban-ip")) {
                                                            ** break;
                                                        }
                                                        break block41;
                                                    }
                                                    case 111426262: {
                                                        if (var16_23.equals("unban")) break;
                                                        ** break;
                                                    }
                                                    case -840127329: {
                                                        if (!var16_23.equals("unwarn")) {
                                                            ** break;
                                                        }
                                                        break block42;
                                                    }
                                                    case 1972486690: {
                                                        if (!var16_23.equals("tempbanip")) {
                                                            ** break;
                                                        }
                                                        break block41;
                                                    }
                                                    case 93503862: {
                                                        if (!var16_23.equals("banip")) {
                                                            ** break;
                                                        }
                                                        break block41;
                                                    }
                                                    case -1062781696: {
                                                        if (!var16_23.equals("muteip")) {
                                                            ** break;
                                                        }
                                                        break block43;
                                                    }
                                                    case -840405966: {
                                                        if (!var16_23.equals("unmute")) {
                                                            ** break;
                                                        }
                                                        break block44;
                                                    }
                                                    case 1351111124: {
                                                        if (!var16_23.equals("tempmuteip")) {
                                                            ** break;
                                                        }
                                                        break block43;
                                                    }
                                                    case 1231784084: {
                                                        if (!var16_23.equals("tempipmute")) {
                                                            ** break;
                                                        }
                                                        break block43;
                                                    }
                                                    case 1979386420: {
                                                        if (!var16_23.equals("tempipban")) {
                                                            ** break;
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
lbl125:
                                // 11 sources

                                v2 = var11_16;
                            }
                            var17_24 = v1.append(v2).toString();
                            var14_20 = new ClearChatCommand(var11_16, var12_18, v1, var17_24, (CommandManager)var10_15);
                            var15_21 = var10_15;
                            var16_23 = AbstractCommand.AsyncBackgroundTask_5;
                            var18_26 = var14_20.getName();
                            var19_27 = false;
                            var20_28 = var18_26;
                            switch (var20_28.hashCode()) {
                                case -1320563219: {
                                    if (var20_28.equals("dupeip")) break;
                                    ** break;
                                }
                                case 712910260: {
                                    if (!var20_28.equals("staffhistory")) {
                                        ** break;
                                    }
                                    break block46;
                                }
                                case 926934164: {
                                    if (!var20_28.equals("history")) {
                                        ** break;
                                    }
                                    break block47;
                                }
                            }
                            var21_29 = new String[]{"alts", "litebans:alts", "checkalts", "litebans:checkalts", "litebans:dupeip"};
                            v3 = var21_29;
                            break block48;
                        }
                        var21_29 = new String[]{"hist", "litebans:history"};
                        v3 = var21_29;
                        break block48;
                    }
                    var21_29 = new String[]{"staffhist", "litebans:staffhistory"};
                    v3 = var21_29;
                    break block48;
lbl158:
                    // 4 sources

                    var21_29 = new String[]{"litebans:" + var18_26};
                    v3 = var21_29;
                }
                var16_23 = v3;
                var18_25 = false;
                var10_15.BaseCoreGenericHandler(new LiteBansModule_352((LiteCommand)var14_20, ((LiteCommand)var14_20).getPermission(), var15_21.BaseCoreGenericHandler, var16_23), v2);
                if (v1 == null) continue;
                var10_15.BaseCoreGenericHandler(var11_16, (LiteCommand)var14_20);
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
            CommandSenderWrapper jv_03 = sender;
            String string2 = "litebans.tabcomplete";
            boolean flag = false;
            CommandSenderWrapper jv_04 = jv_03;
            boolean flag2 = false;
            if (!(!jv_04.e(string2))) {
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

    }

