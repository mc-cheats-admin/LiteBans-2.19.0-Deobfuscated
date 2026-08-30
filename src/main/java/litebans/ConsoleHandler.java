package litebans;

public final class ConsoleHandler
implements LiteBansModule_178 {
    final /* synthetic */ boolean e;
    final /* synthetic */ String LiteBansModule_31;
    final /* synthetic */ BanHandler_3 c;
    final /* synthetic */ String AsyncBackgroundTask_5;
    final /* synthetic */ CommandSenderWrapper BaseCoreGenericHandler;
    public ConsoleHandler(boolean flag, String string, BanHandler_3 fk_02, String string2, CommandSenderWrapper sender) {
        this.e = flag;
        this.LiteBansModule_31 = string;
        this.c = fk_02;
        this.AsyncBackgroundTask_5 = string2;
        this.plugin = sender;
    }

    public final void BaseCoreGenericHandler(LiteBansModule_82 ch2) {
        if (this.e) {
            CharSequence charSequence = this.LiteBansModule_31;
            MessageHandler messageHandler = this.c;
            byte by2 = ((ConfigService)messageHandler.LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_194().be();
            flag = false;
            AllHandler_3.BaseCoreGenericHandler(ch2, LiteBansModule_242.BaseCoreGenericHandler((charSequence).toString(), by2 & 0xFF), this.AsyncBackgroundTask_5, this.plugin.LiteBansModule_31(), false, false, 16, null);
        } else if (this.plugin.e()) {
            CharSequence charSequence = this.plugin.i();
            MessageHandler fg_03 = this.c;
            byte by3 = ((ConfigService)fg_03.LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_194().be();
            flag = false;
            AllHandler_3.BaseCoreGenericHandler(ch2, LiteBansModule_242.BaseCoreGenericHandler((charSequence).toString(), by3 & 0xFF), this.plugin.BaseCoreGenericHandler(), this.plugin.LiteBansModule_31(), false, false, 16, null);
        } else if (this.plugin.LiteBansModule_194() && !StringUtilities.BaseCoreGenericHandler(this.LiteBansModule_31, "CONSOLE", true) || !this.plugin.LiteBansModule_194()) {
            CharSequence charSequence = this.LiteBansModule_31;
            MessageHandler fg_04 = this.c;
            byte by4 = ((ConfigService)fg_04.LiteBansModule_240().BaseCoreGenericHandler(ConfigService.class)).LiteBansModule_194().be();
            flag = false;
            AllHandler_3.BaseCoreGenericHandler(ch2, LiteBansModule_242.BaseCoreGenericHandler((charSequence).toString(), by4 & 0xFF), this.AsyncBackgroundTask_5, "#", false, false, 16, null);
        } else if (this.plugin.LiteBansModule_194()) {
            AllHandler_3.BaseCoreGenericHandler(ch2, "CONSOLE", "CONSOLE", "#", false, false, 16, null);
}

    @Override
    public Object BaseCoreGenericHandler(Object targetObj) {
        this.plugintargetObj;
        return KotlinUnitHandler.BaseCoreGenericHandler;
}

