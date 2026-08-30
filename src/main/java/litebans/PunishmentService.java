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
        boolean flag = false;
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
        v3 = false;
        v4 = v2;
        v5 = new ArrayList<PunishmentService>(CollectionUtilities.BaseCoreGenericHandler((Iterable)v2, 10));
        v6 = false;
        v7 = v4.iterator();
        while (v7.hasNext()) {
            block40: {
                block38: {
                    block39: {
                        var8_13 = v7.next();
                        var9_15 = (LiteCommand)var8_13;
                        var24_33 = v5;
                        var10_16 = false;
                        var11_18 = this;
                        var12_20 = false;
                        v0 = var11_18.BaseCoreGenericHandler;
                        v1 = var9_15.getPermission();
                        var13_22 = AbstractCommand.AsyncBackgroundTask_5;
                        var14_24 = var9_15.getName();
                        var15_25 = false;
                        var16_28 = var14_24;
                        switch (var16_28.hashCode()) {
                            case -1320563219: {
                                if (var16_28.equals("dupeip")) break;
                                ** break;
                            }
                            case 712910260: {
                                if (!var16_28.equals("staffhistory")) {
                                    ** break;
                                }
                                break block38;
                            }
                            case 926934164: {
                                if (!var16_28.equals("history")) {
                                    ** break;
                                }
                                break block39;
                            }
                        }
                        var17_31 /* !! */  = new String[]{"alts", "litebans:alts", "checkalts", "litebans:checkalts", "litebans:dupeip"};
                        v2 = var17_31 /* !! */ ;
                        break block40;
                    }
                    var17_31 /* !! */  = new String[]{"hist", "litebans:history"};
                    v2 = var17_31 /* !! */ ;
                    break block40;
                }
                var17_31 /* !! */  = new String[]{"staffhist", "litebans:staffhistory"};
                v2 = var17_31 /* !! */ ;
                break block40;
lbl47:
                // 4 sources

                var17_31 /* !! */  = new String[]{"litebans:" + (String)var14_24};
                v2 = var17_31 /* !! */ ;
            }
            var18_32 /* !! */  = v2;
            var24_33.add(new LiteBansModule_265((LiteCommand)var9_15, v0, v1, Arrays.copyOf(var18_32 /* !! */ , var18_32 /* !! */ .length)));
        }
        v2 = (List)v5;
        v3 = false;
        v4 = v2.iterator();
        while (v4.hasNext()) {
            v5 = v4.next();
            var6_9 = (LiteCommand)v5;
            var7_11 = false;
            this.LiteBansModule_31(var6_9);
        }
        v2 = this;
        ObjectUtilities.BaseCoreGenericHandler(v1);
        var3_4 = v1;
        var4_6 = false;
        v5 = AbstractCommand.AsyncBackgroundTask_5.BaseCoreGenericHandler(var3_4);
        v6 = false;
        var8_14 = v5.length;
        for (var7_12 = 0; var7_12 < var8_14; ++var7_12) {
            block48: {
                block46: {
                    block47: {
                        block45: {
                            block41: {
                                block43: {
                                    block42: {
                                        block44: {
                                            var10_17 = var9_15 = v5[var7_12];
                                            var11_19 = false;
                                            var12_21 = v2;
                                            var13_23 = false;
                                            v3 = new StringBuilder().append("litebans + ");
                                            var14_24 = AbstractCommand.AsyncBackgroundTask_5;
                                            var15_26 = false;
                                            var16_29 = var10_17;
                                            switch (var16_29.hashCode()) {
                                                case -1396405339: {
                                                    if (!var16_29.equals("ban-ip")) {
                                                        ** break;
                                                    }
                                                    break block41;
                                                }
                                                case 111426262: {
                                                    if (var16_29.equals("unban")) break;
                                                    ** break;
                                                }
                                                case -840127329: {
                                                    if (!var16_29.equals("unwarn")) {
                                                        ** break;
                                                    }
                                                    break block42;
                                                }
                                                case 1972486690: {
                                                    if (!var16_29.equals("tempbanip")) {
                                                        ** break;
                                                    }
                                                    break block41;
                                                }
                                                case 93503862: {
                                                    if (!var16_29.equals("banip")) {
                                                        ** break;
                                                    }
                                                    break block41;
                                                }
                                                case -1062781696: {
                                                    if (!var16_29.equals("muteip")) {
                                                        ** break;
                                                    }
                                                    break block43;
                                                }
                                                case -840405966: {
                                                    if (!var16_29.equals("unmute")) {
                                                        ** break;
                                                    }
                                                    break block44;
                                                }
                                                case 1351111124: {
                                                    if (!var16_29.equals("tempmuteip")) {
                                                        ** break;
                                                    }
                                                    break block43;
                                                }
                                                case 1231784084: {
                                                    if (!var16_29.equals("tempipmute")) {
                                                        ** break;
                                                    }
                                                    break block43;
                                                }
                                                case 1979386420: {
                                                    if (!var16_29.equals("tempipban")) {
                                                        ** break;
                                                    }
                                                    break block41;
                                                }
                                            }
                                            v4 = "unban.own";
                                            break block45;
                                        }
                                        v4 = "unmute.own";
                                        break block45;
                                    }
                                    v4 = "unwarn.own";
                                    break block45;
                                }
                                v4 = "ipmute";
                                break block45;
                            }
                            v4 = "ipban";
                            break block45;
lbl137:
                            // 11 sources

                            v4 = var10_17;
                        }
                        var17_31 /* !! */  = v3.append((String)v4).toString();
                        var14_24 = var12_21;
                        var15_27 = new PunishmentCommand((String)var10_17, (String)var17_31 /* !! */ , (PunishmentService)var12_21);
                        var16_30 = false;
                        v5 = var14_24.BaseCoreGenericHandler;
                        v6 = var15_27.getPermission();
                        var18_32 /* !! */  = AbstractCommand.AsyncBackgroundTask_5;
                        var19_34 = var15_27.getName();
                        var20_35 = false;
                        var21_36 = var19_34;
                        switch (var21_36.hashCode()) {
                            case -1320563219: {
                                if (var21_36.equals("dupeip")) break;
                                ** break;
                            }
                            case 712910260: {
                                if (!var21_36.equals("staffhistory")) {
                                    ** break;
                                }
                                break block46;
                            }
                            case 926934164: {
                                if (!var21_36.equals("history")) {
                                    ** break;
                                }
                                break block47;
                            }
                        }
                        var22_37 = new String[]{"alts", "litebans:alts", "checkalts", "litebans:checkalts", "litebans:dupeip"};
                        v7 = var22_37;
                        break block48;
                    }
                    var22_37 = new String[]{"hist", "litebans:history"};
                    v7 = var22_37;
                    break block48;
                }
                var22_37 = new String[]{"staffhist", "litebans:staffhistory"};
                v7 = var22_37;
                break block48;
lbl173:
                // 4 sources

                var22_37 = new String[]{"litebans:" + var19_34};
                v7 = var22_37;
            }
            var23_38 = v7;
            var12_21.LiteBansModule_31(new LiteBansModule_265(var15_27, v5, v6, Arrays.copyOf(var23_38, var23_38.length)));
        }
    }

    @Override
    public void e() {
    }

    @Override
    public void LiteBansModule_31() {
        v1 = this.e();
        v2 = false;
        v3 = v1;
        var4_4 /* !! */  = new ArrayList<PunishmentService>(CollectionUtilities.BaseCoreGenericHandler(v1, 10));
        var5_5 = false;
        var6_7 = v3.iterator();
        while (var6_7.hasNext()) {
            block11: {
                block9: {
                    block10: {
                        var7_9 = var6_7.next();
                        var8_10 = (LiteCommand)var7_9;
                        var18_20 = var4_4 /* !! */ ;
                        var9_11 = false;
                        var10_12 = this;
                        var11_13 = false;
                        v0 = var10_12.BaseCoreGenericHandler;
                        v1 = var8_10.getPermission();
                        var12_14 = AbstractCommand.AsyncBackgroundTask_5;
                        var13_15 = var8_10.getName();
                        var14_16 = false;
                        var15_17 = var13_15;
                        switch (var15_17.hashCode()) {
                            case -1320563219: {
                                if (var15_17.equals("dupeip")) break;
                                ** break;
                            }
                            case 712910260: {
                                if (!var15_17.equals("staffhistory")) {
                                    ** break;
                                }
                                break block9;
                            }
                            case 926934164: {
                                if (!var15_17.equals("history")) {
                                    ** break;
                                }
                                break block10;
                            }
                        }
                        var16_18 = new String[]{"alts", "litebans:alts", "checkalts", "litebans:checkalts", "litebans:dupeip"};
                        v2 = var16_18;
                        break block11;
                    }
                    var16_18 = new String[]{"hist", "litebans:history"};
                    v2 = var16_18;
                    break block11;
                }
                var16_18 = new String[]{"staffhist", "litebans:staffhistory"};
                v2 = var16_18;
                break block11;
lbl43:
                // 4 sources

                var16_18 = new String[]{"litebans:" + var13_15};
                v2 = var16_18;
            }
            var17_19 = v2;
            var18_20.add(new LiteBansModule_265(var8_10, v0, v1, Arrays.copyOf(var17_19, var17_19.length)));
        }
        v1 = (List)var4_4 /* !! */ ;
        v2 = false;
        for (Collection var4_4 : v1) {
            var5_6 = (LiteCommand)var4_4 /* !! */ ;
            v6 = false;
            this.LiteBansModule_31(var5_6);
        }
    }

    @Override
    public void LiteBansModule_31(@Nullable LiteCommand command) {
        ConfigService configService = (ConfigService)this.plugin.BaseCoreGenericHandler(ConfigService.class);
        if (command instanceof LiteBansModule_265 && configService.e(((LiteBansModule_265)command).getName())) {
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
            CommandSenderWrapper jv_03 = sender;
            String string2 = "litebans.tabcomplete";
            boolean flag = false;
            if (jv_03.e(string2)) {
                list = AbstractCommand.AsyncBackgroundTask_5.BaseCoreGenericHandler(command, string, sender, this.plugin, args);
                return list;
            }
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

    }

