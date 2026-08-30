package litebans.api;

import lombok.Generated;
import lombok.NonNull;
import org.jetbrains.annotations.Nullable;

public abstract class Entry {
    private final long id;
    private final String type;
    @Nullable
    private final String uuid;
    @Nullable
    private final String ip;
    private final String reason;
    @Nullable
    private final String executorUUID;
    @Nullable
    private final String executorName;
    @Nullable
    private final String removedByUUID;
    @Nullable
    private final String removedByName;
    @Nullable
    private final String removalReason;
    private final long dateStart;
    private final long dateEnd;
    private final String serverScope;
    private final String serverOrigin;
    private final byte template;
    private final boolean silent;
    private final boolean ipban;
    private final boolean active;

    public abstract long getDuration();

    public abstract String getDurationString();

    public abstract long getRemainingDuration(long var1);

    public abstract String getRemainingDurationString(long var1);

    public abstract String getRandomID();

    public abstract boolean isExpired(long var1);

    public abstract boolean isPermanent();

    public abstract int getTemplateID();

    @NonNull
    public abstract String getTemplateName();

    public abstract boolean hasTemplate();

    @Generated
    public Entry(long l3, String string, @Nullable String string2, @Nullable String string3, String string4, @Nullable String string5, @Nullable String string6, @Nullable String string7, @Nullable String string8, @Nullable String string9, long l5, long l7, String string10, String string11, byte by2, boolean bl, boolean bl2, boolean bl3) {
        this.id = l3;
        this.type = string;
        this.uuid = string2;
        this.ip = string3;
        this.reason = string4;
        this.executorUUID = string5;
        this.executorName = string6;
        this.removedByUUID = string7;
        this.removedByName = string8;
        this.removalReason = string9;
        this.dateStart = l5;
        this.dateEnd = l7;
        this.serverScope = string10;
        this.serverOrigin = string11;
        this.template = by2;
        this.silent = bl;
        this.ipban = bl2;
        this.active = bl3;
    }

    @Generated
    public long getId() {
        return this.id;
    }

    @Generated
    public String getType() {
        return this.type;
    }

    @Nullable
    @Generated
    public String getUuid() {
        return this.uuid;
    }

    @Nullable
    @Generated
    public String getIp() {
        return this.ip;
    }

    @Generated
    public String getReason() {
        return this.reason;
    }

    @Nullable
    @Generated
    public String getExecutorUUID() {
        return this.executorUUID;
    }

    @Nullable
    @Generated
    public String getExecutorName() {
        return this.executorName;
    }

    @Nullable
    @Generated
    public String getRemovedByUUID() {
        return this.removedByUUID;
    }

    @Nullable
    @Generated
    public String getRemovedByName() {
        return this.removedByName;
    }

    @Nullable
    @Generated
    public String getRemovalReason() {
        return this.removalReason;
    }

    @Generated
    public long getDateStart() {
        return this.dateStart;
    }

    @Generated
    public long getDateEnd() {
        return this.dateEnd;
    }

    @Generated
    public String getServerScope() {
        return this.serverScope;
    }

    @Generated
    public String getServerOrigin() {
        return this.serverOrigin;
    }

    @Generated
    public boolean isSilent() {
        return this.silent;
    }

    @Generated
    public boolean isIpban() {
        return this.ipban;
    }

    @Generated
    public boolean isActive() {
        return this.active;
    }

    @Generated
    public String toString() {
        return "Entry(id=" + this.getId() + ", type=" + this.getType() + ", uuid=" + this.getUuid() + ", ip=" + this.getIp() + ", reason=" + this.getReason() + ", executorUUID=" + this.getExecutorUUID() + ", executorName=" + this.getExecutorName() + ", removedByUUID=" + this.getRemovedByUUID() + ", removedByName=" + this.getRemovedByName() + ", removalReason=" + this.getRemovalReason() + ", dateStart=" + this.getDateStart() + ", dateEnd=" + this.getDateEnd() + ", serverScope=" + this.getServerScope() + ", serverOrigin=" + this.getServerOrigin() + ", template=" + this.getTemplate() + ", silent=" + this.isSilent() + ", ipban=" + this.isIpban() + ", active=" + this.isActive() + ")";
    }

    @Generated
    protected byte getTemplate() {
        return this.template;
    }
}

