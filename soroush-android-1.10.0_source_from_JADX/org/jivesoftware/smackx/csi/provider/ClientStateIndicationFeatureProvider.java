package org.jivesoftware.smackx.csi.provider;

import org.jivesoftware.smack.provider.ExtensionElementProvider;
import org.jivesoftware.smackx.csi.packet.ClientStateIndication.Feature;
import org.xmlpull.v1.XmlPullParser;

public class ClientStateIndicationFeatureProvider extends ExtensionElementProvider<Feature> {
    public Feature parse(XmlPullParser xmlPullParser, int i) {
        return Feature.INSTANCE;
    }
}
