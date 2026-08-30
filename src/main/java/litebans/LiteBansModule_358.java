package litebans;

import litebans.api.Entry;
import litebans.api.RandomID;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class LiteBansModule_358
extends Entry {
    private final PlatformPlugin BaseCoreGenericHandler;
    public LiteBansModule_358(@NotNull PlatformPlugin plugin, long l3, @Nullable String string, @Nullable String string2, @Nullable String string3, @Nullable String string4, @Nullable String string5, @Nullable String string6, @Nullable String string7, @Nullable String string8, @Nullable String string9, long l5, long l7, @Nullable String string10, @Nullable String string11, byte by2, boolean flag, boolean flag2, boolean flag3) {
        super(l3, string, string2, string3, string4, string5, string6, string7, string8, string9, l5, l7, string10, string11, by2, flag, flag2, flag3);
        this.plugin = plugin;
    }

    @Override
    public String getDurationString() {
        long l3 = this.getDuration();
        return PermanentHandler.BaseCoreGenericHandler(SecHandler.AsyncBackgroundTask_5, l3, false, 2, null);
    }

    @Override
    public long getRemainingDuration(long l3) {
        return this.isPermanent() || this.isExpired(l3) ? -1L : this.getDateEnd() - l3;
    }

    @Override
    public String getRemainingDurationString(long l3) {
        long l5 = this.getRemainingDuration(l3);
        return PermanentHandler.BaseCoreGenericHandler(SecHandler.AsyncBackgroundTask_5, l5, false, 2, null);
    }

    @Override
    public String getRandomID() {
        return RandomID.get().convert(this.getId());
    }

    @Override
    public long getDuration() {
        return this.isPermanent() ? -1L : this.getDateEnd() - this.getDateStart();
    }

    @Override
    public boolean isExpired(long l3) {
        return !this.isPermanent() && l3 >= this.getDateEnd();
    }

    @Override
    public boolean isPermanent() {
        return this.getDateEnd() <= 0L;
    }

    @Override
    public int getTemplateID() {
        return LiteBansModule_283.BaseCoreGenericHandler(this.getTemplate()) & 0xFF;
    }

    @Override
    public String getTemplateName() {
        ConfigService configService = (ConfigService)this.plugin.BaseCoreGenericHandler(ConfigService.class);
        TemplatesYmlHandler fu2 = configService.AsyncBackgroundTask_21();
        BanHandler a_2 = BanHandler.LiteBansModule_401.BaseCoreGenericHandler(this.getType());
        ObjectUtilities.BaseCoreGenericHandler(a_2);
        Object object = fu2.BaseCoreGenericHandler(a_2, this.getTemplateID());
        if (object == null || (object = ((LiteBansModule_65)object).g()) == null) {
            object = "";
        }
        return object;
    }

    @Override
    public boolean hasTemplate() {
        return this.getTemplateID() != (0xFFFFFFFF & 0xFF);
}

