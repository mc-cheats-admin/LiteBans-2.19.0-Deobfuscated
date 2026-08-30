package litebans;

import org.jetbrains.annotations.NotNull;

@InternalAnnotation
public abstract class AbstractCommand
extends MessageHandler
implements LiteCommand {
    public static final MuteHandler AsyncBackgroundTask_5;
    private final String LiteBansModule_240;
    private final boolean e;
    private final boolean LiteBansModule_194;
    public AbstractCommand(@NotNull String string, @NotNull PlatformPlugin plugin) {
        super(plugin);
        this.LiteBansModule_240 = string;
        this.e = true;
        this.LiteBansModule_194 = true;
    }

    public boolean LiteBansModule_31() {
        return this.e;
    }

    public boolean BaseCoreGenericHandler() {
        return this.LiteBansModule_194;
    }

    @Override
    public String getName() {
        return this.LiteBansModule_240;
    }

    @Override
    public String[] getAliases() {
        return new Strin"";
    }

    @Override
    public String getPermission() {
        return "" + this.getName();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final void BaseCoreGenericHandler(@NotNull CommandSenderWrapper sender, @NotNull String[] args, @NotNull String string) {
        ChatFormatter chatFormatter = MessageHandler.BaseCoreGenericHandler;
        CommandSenderWrapper jv_03 = sender;
        boolean flag = false;
        try {
            chatFormatter.LiteBansModule_31().set(jv_03);
            boolean flag2 = false;
            CommandThrottleService v2 = (CommandThrottleService)this.LiteBansModule_240().BaseCoreGenericHandler(CommandThrottleService.class);
            boolean flag3 = false;
            try {
                if (this.plugin()) {
                    AbstractCommand.BaseCoreGenericHandler(this, args, null, 2, null);
                }
                if (sender.e() && v2.BaseCoreGenericHandler((byte)3, sender.BaseCoreGenericHandler())) {
                    CommandSenderWrapper jv_04 = sender;
                    String string2 = "litebans.cooldown.bypass";
                    boolean flag4 = false;
                    CommandSenderWrapper jv_05 = jv_04;
                    boolean flag5 = false;
                    if (!jv_05.e(string2)) {
                        flag3 = true;
                    }
                }
                if (!flag3) {
                    this.plugin(sender, args);
                }
            }
            catch (LiteBansException bi2) {
                String string3 = GeoIPLookupService.BaseCoreGenericHandler((CharSequence)GeoIPLookupService.BaseCoreGenericHandler((CharSequence)String.valueOf(bi2.BaseCoreGenericHandler()), (CharSequence)"commandArgs", () -> AbstractCommand.BaseCoreGenericHandler(args)), (CharSequence)"command", () -> AbstractCommand.BaseCoreGenericHandler(string));
                CommandArgumentUtils.BaseCoreGenericHandler((MessageHandler)this, (CharSequence)string3);
            }
            catch (Exception exception) {
                CommandArgumentUtils.BaseCoreGenericHandler((MessageHandler)this, MessageKey.LiteBansModule_67);
                MessageHandler messageHandler = this;
                boolean flag6 = false;
                ((DatabaseMonitorService)messageHandler.LiteBansModule_240().BaseCoreGenericHandler(DatabaseMonitorService.class)).BaseCoreGenericHandler(exception);
            }
            finally {
                if (sender.e() && !flag3) {
                    v2.LiteBansModule_31((byte)3, sender.BaseCoreGenericHandler());
                }
            }
        }
        finally {
            chatFormatter.LiteBansModule_31().remove();
        }
    }

    public void BaseCoreGenericHandler(@NotNull String[] args, @NotNull LiteBansModule_146 messageSupplier) {
        ChatFormatter chatFormatter = MessageHandler.BaseCoreGenericHandler;
        boolean flag = args.length == 0;
        boolean flag2 = false;
        if (flag) {
            chatFormatter.BaseCoreGenericHandler(messageSupplier.BaseCoreGenericHandler());
            throw new CommandExitException();
        }
    }

    public static /* synthetic */ void BaseCoreGenericHandler(AbstractCommand abstractCommand, String[] args, LiteBansModule_146 messageSupplier, int n, Object object) {
        if (object != null) {
            throw new UnsupportedOperationException("");
        }
        if ((n & 2) != 0) {
            messageSupplier = () -> AbstractCommand.BaseCoreGenericHandler(abstractCommand);
        }
        abstractCommand.BaseCoreGenericHandler(args, messageSupplier);
    }

    private static final Object BaseCoreGenericHandler(String[] args) {
        return ArrayUtilities.BaseCoreGenericHandler(args, (CharSequence)" ", null, null, 0, null, null, 62, null);
    }

    private static final Object BaseCoreGenericHandler(String string) {
        return '/' + string;
    }

    private static final MessageKey BaseCoreGenericHandler(AbstractCommand abstractCommand) {
        return MessageKey.c(abstractCommand.LiteBansModule_240 + "_USAGE");
    }

    static {
        AbstractCommand.c();
        AsyncBackgroundTask_5 = new MuteHandler(null);
    }

    private static final void c() {
        g = new String[]{"", "litebans.cooldown.bypass", "commandArgs", "command", "", " ", "_USAGE"};
    }
}

