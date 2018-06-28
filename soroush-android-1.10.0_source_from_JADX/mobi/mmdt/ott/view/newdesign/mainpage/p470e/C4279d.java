package mobi.mmdt.ott.view.newdesign.mainpage.p470e;

import mobi.mmdt.ott.R;

public enum C4279d {
    MERGE("MergeConversationsListView", R.drawable.ic_conversation_tab_new_design_fill, R.drawable.ic_conversation_tab_new_design_2),
    SINGLE("SingleConversationsListView", R.drawable.ic_single_tab_new_design_fill, R.drawable.ic_single_tab_new_design_2),
    GROUP("GroupConversationsListView", R.drawable.ic_group_tab_new_design_fill, R.drawable.ic_group_tab_new_design),
    CHANNEL("ChannelConversationsListView", R.drawable.ic_followed_channel_tab_new_design_fill, R.drawable.ic_followed_channel_tab_new_design),
    CONTACT("ContactsListFragment", R.drawable.ic_contact_tab_new_design_fill, R.drawable.ic_contact_tab_new_design),
    EXPLORE("ExploreChannelsListFragment", R.drawable.ic_explore_channel_tab_new_design_fill, R.drawable.ic_explore_channel_tab_new_design);
    
    public String f12095g;
    int f12096h;
    int f12097i;

    private C4279d(String str, int i, int i2) {
        this.f12095g = str;
        this.f12096h = i;
        this.f12097i = i2;
    }
}
