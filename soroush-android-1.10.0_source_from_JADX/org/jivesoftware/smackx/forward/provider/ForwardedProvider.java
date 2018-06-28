package org.jivesoftware.smackx.forward.provider;

import java.util.logging.Logger;
import org.jivesoftware.smack.SmackException;
import org.jivesoftware.smack.packet.Message;
import org.jivesoftware.smack.packet.Stanza;
import org.jivesoftware.smack.provider.ExtensionElementProvider;
import org.jivesoftware.smack.util.PacketParserUtils;
import org.jivesoftware.smackx.delay.packet.DelayInformation;
import org.jivesoftware.smackx.delay.provider.DelayInformationProvider;
import org.jivesoftware.smackx.forward.packet.Forwarded;
import org.xmlpull.v1.XmlPullParser;

public class ForwardedProvider extends ExtensionElementProvider<Forwarded> {
    public static final ForwardedProvider INSTANCE = new ForwardedProvider();
    private static final Logger LOGGER = Logger.getLogger(ForwardedProvider.class.getName());

    public Forwarded parse(XmlPullParser xmlPullParser, int i) {
        Stanza stanza = null;
        DelayInformation delayInformation = null;
        while (true) {
            switch (xmlPullParser.next()) {
                case 2:
                    String name = xmlPullParser.getName();
                    String namespace = xmlPullParser.getNamespace();
                    Object obj = -1;
                    int hashCode = name.hashCode();
                    if (hashCode != 95467907) {
                        if (hashCode == 954925063) {
                            if (name.equals(Message.ELEMENT)) {
                                obj = 1;
                            }
                        }
                    } else if (name.equals(DelayInformation.ELEMENT)) {
                        obj = null;
                    }
                    StringBuilder stringBuilder;
                    switch (obj) {
                        case null:
                            if (!DelayInformation.NAMESPACE.equals(namespace)) {
                                Logger logger = LOGGER;
                                stringBuilder = new StringBuilder("Namespace '");
                                stringBuilder.append(namespace);
                                stringBuilder.append("' does not match expected namespace 'urn:xmpp:delay'");
                                logger.warning(stringBuilder.toString());
                                break;
                            }
                            delayInformation = DelayInformationProvider.INSTANCE.parse(xmlPullParser, xmlPullParser.getDepth());
                            break;
                        case 1:
                            stanza = PacketParserUtils.parseMessage(xmlPullParser);
                            break;
                        default:
                            Logger logger2 = LOGGER;
                            stringBuilder = new StringBuilder("Unsupported forwarded packet type: ");
                            stringBuilder.append(name);
                            logger2.warning(stringBuilder.toString());
                            break;
                    }
                case 3:
                    if (xmlPullParser.getDepth() != i) {
                        break;
                    } else if (stanza != null) {
                        return new Forwarded(delayInformation, stanza);
                    } else {
                        throw new SmackException("forwarded extension must contain a packet");
                    }
                default:
                    break;
            }
        }
    }
}
