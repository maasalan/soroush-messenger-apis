package org.jivesoftware.smack.roster.provider;

import org.jivesoftware.smack.provider.ExtensionElementProvider;
import org.jivesoftware.smack.roster.packet.SubscriptionPreApproval;
import org.xmlpull.v1.XmlPullParser;

public class SubscriptionPreApprovalStreamFeatureProvider extends ExtensionElementProvider<SubscriptionPreApproval> {
    public SubscriptionPreApproval parse(XmlPullParser xmlPullParser, int i) {
        return SubscriptionPreApproval.INSTANCE;
    }
}
