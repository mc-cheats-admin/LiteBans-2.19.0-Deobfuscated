package litebans;

import org.jetbrains.annotations.NotNull;

@InternalAnnotation
public abstract class AbstractCommand
extends MessageHandler
implements LiteCommand {
    public static final MuteHandler AsyncBackgroundTask_5;
    private final String LiteBansModule_241;
    private final boolean e;
    private final boolean LiteBansModule_195;
        public AbstractCommand(@NotNull String string, @NotNull PlatformPlugin plugin) {
        super(plugin);
        this.LiteBansModule_241 = string;
        this.e = true;
        this.LiteBansModule_195 = true;
    }

    public boolean LiteBansModule_31() {
        return this.e;
    }

    public boolean BaseCoreGenericHandler() {
        return this.LiteBansModule_195;
    }

    @Override
    public String getName() {
        return this.LiteBansModule_241;
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
        CommandSenderWrapper senderWrapper = sender;
        try {
            chatFormatter.LiteBansModule_31().set(senderWrapper);
            CommandThrottleService v2 = (CommandThrottleService)this.LiteBansModule_241().BaseCoreGenericHandler(CommandThrottleService.class);
            try {
                if (this.plugin()) {
                    AbstractCommand.BaseCoreGenericHandler(this, args, null, 2, null);
                }
                if (sender.e() && v2.BaseCoreGenericHandler((byte)3, sender.BaseCoreGenericHandler())) {
                    CommandSenderWrapper senderWrapper = sender;
                    String string2 = "litebans.cooldown.bypass";
                    CommandSenderWrapper senderWrapper = senderWrapper;
                    if (!senderWrapper.e(string2)) {
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
                CommandArgumentUtils.BaseCoreGenericHandler((MessageHandler)this, MessageKey.LiteBansModule_68);
                MessageHandler messageHandler = this;
                ((DatabaseMonitorService)messageHandler.LiteBansModule_241().BaseCoreGenericHandler(DatabaseMonitorService.class)).BaseCoreGenericHandler(exception);
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

    public void BaseCoreGenericHandler(@NotNull String[] args, @NotNull LiteBansModule_147 messageSupplier) {
        ChatFormatter chatFormatter = MessageHandler.BaseCoreGenericHandler;
        boolean flag = args.length == 0;
        if (flag) {
            chatFormatter.BaseCoreGenericHandler(messageSupplier.BaseCoreGenericHandler());
            throw new CommandExitException();
        }
    }

    public static /* synthetic */ void BaseCoreGenericHandler(AbstractCommand abstractCommand, String[] args, LiteBansModule_147 messageSupplier, int n, Object targetObj) {
        if (targetObj != null) {
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
        return MessageKey.c(abstractCommand.LiteBansModule_241 + "_USAGE");
    }

    static {
        AbstractCommand.c();
        AsyncBackgroundTask_5 = new MuteHandler(null);
    }

    private static final void c() {
        g = new String[]{"", "litebans.cooldown.bypass", "commandArgs", "command", "", " ", "_USAGE"};
    }
}

