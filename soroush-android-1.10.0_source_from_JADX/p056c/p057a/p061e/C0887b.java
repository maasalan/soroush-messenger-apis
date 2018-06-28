package p056c.p057a.p061e;

public enum C0887b {
    NO_ERROR(0),
    PROTOCOL_ERROR(1),
    INTERNAL_ERROR(2),
    FLOW_CONTROL_ERROR(3),
    REFUSED_STREAM(7),
    CANCEL(8),
    COMPRESSION_ERROR(9),
    CONNECT_ERROR(10),
    ENHANCE_YOUR_CALM(11),
    INADEQUATE_SECURITY(12),
    HTTP_1_1_REQUIRED(13);
    
    public final int f2663l;

    private C0887b(int i) {
        this.f2663l = i;
    }

    public static C0887b m2113a(int i) {
        for (C0887b c0887b : C0887b.values()) {
            if (c0887b.f2663l == i) {
                return c0887b;
            }
        }
        return null;
    }
}
