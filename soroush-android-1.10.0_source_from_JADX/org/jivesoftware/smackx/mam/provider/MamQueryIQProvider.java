package org.jivesoftware.smackx.mam.provider;

import org.jivesoftware.smack.provider.IQProvider;
import org.jivesoftware.smackx.iot.data.element.NodeElement;
import org.jivesoftware.smackx.mam.element.MamQueryIQ;
import org.jivesoftware.smackx.xdata.packet.DataForm;
import org.jivesoftware.smackx.xdata.provider.DataFormProvider;
import org.xmlpull.v1.XmlPullParser;

public class MamQueryIQProvider extends IQProvider<MamQueryIQ> {
    public MamQueryIQ parse(XmlPullParser xmlPullParser, int i) {
        String attributeValue = xmlPullParser.getAttributeValue("", "queryid");
        String attributeValue2 = xmlPullParser.getAttributeValue("", NodeElement.ELEMENT);
        DataForm dataForm = null;
        while (true) {
            int next = xmlPullParser.next();
            String name = xmlPullParser.getName();
            switch (next) {
                case 2:
                    Object obj = -1;
                    if (name.hashCode() == 120) {
                        if (name.equals("x")) {
                            obj = null;
                        }
                    }
                    if (obj == null) {
                        dataForm = (DataForm) DataFormProvider.INSTANCE.parse(xmlPullParser);
                        break;
                    }
                    break;
                case 3:
                    if (xmlPullParser.getDepth() != i) {
                        break;
                    }
                    return new MamQueryIQ(attributeValue, attributeValue2, dataForm);
                default:
                    break;
            }
        }
    }
}
