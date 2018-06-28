package org.jivesoftware.smackx.iqregister.provider;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import org.jivesoftware.smack.provider.IQProvider;
import org.jivesoftware.smack.util.PacketParserUtils;
import org.jivesoftware.smackx.iqregister.packet.Registration;
import org.xmlpull.v1.XmlPullParser;

public class RegistrationProvider extends IQProvider<Registration> {
    public Registration parse(XmlPullParser xmlPullParser, int i) {
        Map hashMap = new HashMap();
        Collection linkedList = new LinkedList();
        String str = null;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 2) {
                if (xmlPullParser.getNamespace().equals(Registration.NAMESPACE)) {
                    String name = xmlPullParser.getName();
                    String str2 = "";
                    if (xmlPullParser.next() == 4) {
                        str2 = xmlPullParser.getText();
                    }
                    if (name.equals("instructions")) {
                        str = str2;
                    } else {
                        hashMap.put(name, str2);
                    }
                } else {
                    PacketParserUtils.addExtensionElement(linkedList, xmlPullParser);
                }
            } else if (next != 3) {
                continue;
            } else if (xmlPullParser.getName().equals("query")) {
                Registration registration = new Registration(str, hashMap);
                registration.addExtensions(linkedList);
                return registration;
            }
        }
    }
}
