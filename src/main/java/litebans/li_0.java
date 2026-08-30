package litebans;

import litebans.hl;
import litebans.ld_0;
import net.minecraft.class_2540;
import net.minecraft.network.protocol.common.custom.CustomPacketPayload;
import net.minecraft.resources.Identifier;

/*
 * Renamed from litebans.li
 */
public static class li_0
extends ld_0
implements CustomPacketPayload {
    private static /* synthetic */ String[] d;

    public li_0(String string, byte[] byArray) {
        super(string, byArray);
    }

    private li_0(class_2540 class_25402) {
        super(d[0], new byte[class_25402.readableBytes()]);
        class_25402.readBytes(this.a);
    }

    private final void a(class_2540 class_25402) {
        class_25402.writeBytes(this.a);
    }

    public CustomPacketPayload.Type type() {
        return new CustomPacketPayload.Type(Identifier.parse((String)this.b));
    }

    private static final void a() {
        d = new String[]{hl.a("", -1238747738)};
    }

    static {
        li_0.a();
    }
}

