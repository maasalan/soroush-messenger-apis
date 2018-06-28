package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.capi.base;

public enum ConversationListMessageState {
    UNKNOWN(1),
    SENT(2),
    DELIVERED(3),
    SEEN(4);

    private ConversationListMessageState(int i) {
    }

    public static ConversationListMessageState getConversationListMessageState(int i) {
        switch (i) {
            case 1:
                return SENT;
            case 2:
                return DELIVERED;
            case 3:
                return SEEN;
            default:
                return UNKNOWN;
        }
    }
}
