package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.capi.base;

public enum ChatMessageReceiveStatus {
    UNKNOWN(0),
    PENDING(1),
    DELIVERED(2),
    SEEN(3);
    
    private int id;

    private ChatMessageReceiveStatus(int i) {
        this.id = i;
    }

    public static ChatMessageReceiveStatus getValue(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return PENDING;
            case 2:
                return DELIVERED;
            case 3:
                return SEEN;
            default:
                return UNKNOWN;
        }
    }
}
