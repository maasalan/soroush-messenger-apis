package mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.groupServices.channel.base;

public enum ChannelMemberType {
    ADMIN_MEMBER(0),
    ADMIN(1),
    MEMBER(2);
    
    private int number;

    private ChannelMemberType(int i) {
        this.number = i;
    }

    public final int getNumber() {
        return this.number;
    }
}
