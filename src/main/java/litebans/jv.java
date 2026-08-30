package litebans;

import litebans.a_;
import litebans.api.Entry;
import litebans.api.RandomID;
import litebans.c1;
import litebans.db_0;
import litebans.di_0;
import litebans.dk;
import litebans.ew;
import litebans.fu;
import litebans.hl;
import litebans.hy_0;
import litebans.q_0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public static final class jv
extends Entry {
    private final di_0 a;
    private static /* synthetic */ String[] b;

    public jv(@NotNull di_0 di_02, long l3, @Nullable String string, @Nullable String string2, @Nullable String string3, @Nullable String string4, @Nullable String string5, @Nullable String string6, @Nullable String string7, @Nullable String string8, @Nullable String string9, long l5, long l7, @Nullable String string10, @Nullable String string11, byte by2, boolean bl, boolean bl2, boolean bl3) {
        super(l3, string, string2, string3, string4, string5, string6, string7, string8, string9, l5, l7, string10, string11, by2, bl, bl2, bl3);
        this.a = di_02;
    }

    @Override
    public String getDurationString() {
        long l3 = this.getDuration();
        boolean bl = false;
        return db_0.a(dk.d, l3, false, 2, null);
    }

    @Override
    public long getRemainingDuration(long l3) {
        return this.isPermanent() || this.isExpired(l3) ? -1L : this.getDateEnd() - l3;
    }

    @Override
    public String getRemainingDurationString(long l3) {
        long l5 = this.getRemainingDuration(l3);
        boolean bl = false;
        return db_0.a(dk.d, l5, false, 2, null);
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
        return hy_0.a(this.getTemplate()) & 0xFF;
    }

    @Override
    public String getTemplateName() {
        q_0 q_02 = (q_0)this.a.a(q_0.class);
        fu fu2 = q_02.s();
        a_ a_2 = a_.l.a(this.getType());
        ew.a(a_2);
        Object object = fu2.a(a_2, this.getTemplateID());
        if (object == null || (object = ((c1)object).g()) == null) {
            object = b[0];
        }
        return object;
    }

    @Override
    public boolean hasTemplate() {
        return this.getTemplateID() != (0xFFFFFFFF & 0xFF);
    }

    private static final void a() {
        b = new String[]{hl.a("", -160891529)};
    }

    static {
        jv.a();
    }
}

