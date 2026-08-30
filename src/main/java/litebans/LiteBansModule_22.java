package litebans;

import java.util.Arrays;
import java.util.Objects;

static class LiteBansModule_22 {
    int r;
    int LiteBansModule_31;
    int Utf8Handler_2;
    int BroadcastService;
    int AsyncBackgroundTask_5;
    int g;
    int AsyncBackgroundTask_22;
    int LiteBansModule_195;
    long GnuSparseMapHandler;
    long BaseCoreGenericHandler;
    long LiteBansModule_241;
    int i;
    int m;
    int c;
    int n;
    int e;
    int LiteBansModule_403;
    int PunishmentTableService;
    int CommandThrottleService;
    String ServerSyncService;
    String AsyncBackgroundTask_21;
    byte[][] q = null;

    LiteBansModule_22() {
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("LocalFileHeader [archiverVersionNumber=");
        stringBuilder.append(this.r);
        stringBuilder.append(", minVersionToExtract=");
        stringBuilder.append(this.LiteBansModule_31);
        stringBuilder.append(", hostOS=");
        stringBuilder.append(this.Utf8Handler_2);
        stringBuilder.append(", arjFlags=");
        stringBuilder.append(this.BroadcastService);
        stringBuilder.append(", method=");
        stringBuilder.append(this.AsyncBackgroundTask_5);
        stringBuilder.append(", fileType=");
        stringBuilder.append(this.g);
        stringBuilder.append(", reserved=");
        stringBuilder.append(this.AsyncBackgroundTask_22);
        stringBuilder.append(", dateTimeModified=");
        stringBuilder.append(this.LiteBansModule_195);
        stringBuilder.append(", compressedSize=");
        stringBuilder.append(this.GnuSparseMapHandler);
        stringBuilder.append(", originalSize=");
        stringBuilder.append(this.plugin);
        stringBuilder.append(", originalCrc32=");
        stringBuilder.append(this.LiteBansModule_241);
        stringBuilder.append(", fileSpecPosition=");
        stringBuilder.append(this.i);
        stringBuilder.append(", fileAccessMode=");
        stringBuilder.append(this.m);
        stringBuilder.append(", firstChapter=");
        stringBuilder.append(this.c);
        stringBuilder.append(", lastChapter=");
        stringBuilder.append(this.n);
        stringBuilder.append(", extendedFilePosition=");
        stringBuilder.append(this.e);
        stringBuilder.append(", dateTimeAccessed=");
        stringBuilder.append(this.LiteBansModule_403);
        stringBuilder.append(", dateTimeCreated=");
        stringBuilder.append(this.PunishmentTableService);
        stringBuilder.append(", originalSizeEvenForVolumes=");
        stringBuilder.append(this.CommandThrottleService);
        stringBuilder.append(", name=");
        stringBuilder.append(this.ServerSyncService);
        stringBuilder.append(", comment=");
        stringBuilder.append(this.AsyncBackgroundTask_21);
        stringBuilder.append(", extendedHeaders=");
        stringBuilder.append(Arrays.toString((Object[])this.q));
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public int hashCode() {
        return this.ServerSyncService == null ? 0 : this.ServerSyncService.hashCode();
    }

    public boolean equals(Object targetObj) {
        if (this == targetObj) {
            return true;
        }
        if (targetObj == null || this.getClass() != targetObj.getClass()) {
            return false;
        }
        LiteBansModule_22 at_02 = (LiteBansModule_22)targetObj;
        return this.r == at_02.r && this.LiteBansModule_31 == at_02.LiteBansModule_31 && this.Utf8Handler_2 == at_02.Utf8Handler_2 && this.BroadcastService == at_02.BroadcastService && this.AsyncBackgroundTask_5 == at_02.AsyncBackgroundTask_5 && this.g == at_02.g && this.AsyncBackgroundTask_22 == at_02.AsyncBackgroundTask_22 && this.LiteBansModule_195 == at_02.LiteBansModule_195 && this.GnuSparseMapHandler == at_02.GnuSparseMapHandler && this.plugin == at_02.BaseCoreGenericHandler && this.LiteBansModule_241 == at_02.LiteBansModule_241 && this.i == at_02.i && this.m == at_02.m && this.c == at_02.c && this.n == at_02.n && this.e == at_02.e && this.LiteBansModule_403 == at_02.LiteBansModule_403 && this.PunishmentTableService == at_02.PunishmentTableService && this.CommandThrottleService == at_02.CommandThrottleService && Objects.equals(this.ServerSyncService, at_02.ServerSyncService) && Objects.equals(this.AsyncBackgroundTask_21, at_02.AsyncBackgroundTask_21) && Arrays.deepEquals((Object[])this.q, (Object[])at_02.q);
    }
}

