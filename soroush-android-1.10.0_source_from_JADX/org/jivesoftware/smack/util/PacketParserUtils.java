package org.jivesoftware.smack.util;

import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.b.a.i;
import org.jivesoftware.smack.compress.packet.Compress.Feature;
import org.jivesoftware.smack.packet.EmptyResultIQ;
import org.jivesoftware.smack.packet.ErrorIQ;
import org.jivesoftware.smack.packet.ExtensionElement;
import org.jivesoftware.smack.packet.IQ;
import org.jivesoftware.smack.packet.Mechanisms;
import org.jivesoftware.smack.packet.Message;
import org.jivesoftware.smack.packet.Presence;
import org.jivesoftware.smack.packet.Presence.Mode;
import org.jivesoftware.smack.packet.Session;
import org.jivesoftware.smack.packet.Stanza;
import org.jivesoftware.smack.packet.StartTls;
import org.jivesoftware.smack.packet.StreamError;
import org.jivesoftware.smack.packet.UnparsedIQ;
import org.jivesoftware.smack.packet.XMPPError;
import org.jivesoftware.smack.packet.XMPPError.Builder;
import org.jivesoftware.smack.packet.XMPPError.Condition;
import org.jivesoftware.smack.packet.XMPPError.Type;
import org.jivesoftware.smack.parsing.StandardExtensionElementProvider;
import org.jivesoftware.smack.provider.ExtensionElementProvider;
import org.jivesoftware.smack.provider.IQProvider;
import org.jivesoftware.smack.provider.ProviderManager;
import org.jivesoftware.smack.sasl.packet.SaslStreamElements.SASLFailure;
import org.jivesoftware.smackx.hoxt.packet.AbstractHttpOverXmpp.Xml;
import org.jivesoftware.smackx.message_correct.element.MessageCorrectExtension;
import org.jivesoftware.smackx.muc.packet.MUCUser.Status;
import org.jivesoftware.smackx.privacy.packet.PrivacyItem;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

public class PacketParserUtils {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final String FEATURE_XML_ROUNDTRIP = "http://xmlpull.org/v1/doc/features.html#xml-roundtrip";
    private static final Logger LOGGER = Logger.getLogger(PacketParserUtils.class.getName());
    private static final XmlPullParserFactory XML_PULL_PARSER_FACTORY;
    public static final boolean XML_PULL_PARSER_SUPPORTS_ROUNDTRIP;

    static {
        boolean z = false;
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            XML_PULL_PARSER_FACTORY = newInstance;
            try {
                newInstance.newPullParser().setFeature(FEATURE_XML_ROUNDTRIP, true);
                z = true;
            } catch (Throwable e) {
                LOGGER.log(Level.FINEST, "XmlPullParser does not support XML_ROUNDTRIP", e);
            }
            XML_PULL_PARSER_SUPPORTS_ROUNDTRIP = z;
        } catch (XmlPullParserException e2) {
            throw new AssertionError(e2);
        }
    }

    public static void addExtensionElement(Collection<ExtensionElement> collection, XmlPullParser xmlPullParser) {
        addExtensionElement((Collection) collection, xmlPullParser, xmlPullParser.getName(), xmlPullParser.getNamespace());
    }

    public static void addExtensionElement(Collection<ExtensionElement> collection, XmlPullParser xmlPullParser, String str, String str2) {
        collection.add(parseExtensionElement(str, str2, xmlPullParser));
    }

    public static void addExtensionElement(Stanza stanza, XmlPullParser xmlPullParser) {
        ParserUtils.assertAtStartTag(xmlPullParser);
        addExtensionElement(stanza, xmlPullParser, xmlPullParser.getName(), xmlPullParser.getNamespace());
    }

    public static void addExtensionElement(Stanza stanza, XmlPullParser xmlPullParser, String str, String str2) {
        stanza.addExtension(parseExtensionElement(str, str2, xmlPullParser));
    }

    @Deprecated
    public static void addPacketExtension(Collection<ExtensionElement> collection, XmlPullParser xmlPullParser) {
        addExtensionElement((Collection) collection, xmlPullParser, xmlPullParser.getName(), xmlPullParser.getNamespace());
    }

    @Deprecated
    public static void addPacketExtension(Collection<ExtensionElement> collection, XmlPullParser xmlPullParser, String str, String str2) {
        addExtensionElement((Collection) collection, xmlPullParser, str, str2);
    }

    @Deprecated
    public static void addPacketExtension(Stanza stanza, XmlPullParser xmlPullParser) {
        addExtensionElement(stanza, xmlPullParser);
    }

    @Deprecated
    public static void addPacketExtension(Stanza stanza, XmlPullParser xmlPullParser, String str, String str2) {
        addExtensionElement(stanza, xmlPullParser, str, str2);
    }

    private static String getLanguageAttribute(XmlPullParser xmlPullParser) {
        int i = 0;
        while (i < xmlPullParser.getAttributeCount()) {
            String attributeName = xmlPullParser.getAttributeName(i);
            if (!"xml:lang".equals(attributeName)) {
                if (!"lang".equals(attributeName) || !Xml.ELEMENT.equals(xmlPullParser.getAttributePrefix(i))) {
                    i++;
                }
            }
            return xmlPullParser.getAttributeValue(i);
        }
        return null;
    }

    public static XmlPullParser getParserFor(Reader reader) {
        XmlPullParser newXmppParser = newXmppParser(reader);
        for (int eventType = newXmppParser.getEventType(); eventType != 2; eventType = newXmppParser.next()) {
            if (eventType == 1) {
                throw new IllegalArgumentException("Document contains no start tag");
            }
        }
        return newXmppParser;
    }

    public static XmlPullParser getParserFor(String str) {
        return getParserFor(new StringReader(str));
    }

    public static XmlPullParser getParserFor(String str, String str2) {
        XmlPullParser parserFor = getParserFor(str);
        while (true) {
            int eventType = parserFor.getEventType();
            String name = parserFor.getName();
            if (eventType == 2) {
                if (name.equals(str2)) {
                    return parserFor;
                }
            }
            if (eventType == 1) {
                StringBuilder stringBuilder = new StringBuilder("Could not find start tag '");
                stringBuilder.append(str2);
                stringBuilder.append("' in stanza: ");
                stringBuilder.append(str);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            parserFor.next();
        }
    }

    public static XmlPullParser newXmppParser() {
        XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
        newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
        if (XML_PULL_PARSER_SUPPORTS_ROUNDTRIP) {
            try {
                newPullParser.setFeature(FEATURE_XML_ROUNDTRIP, true);
                return newPullParser;
            } catch (Throwable e) {
                LOGGER.log(Level.SEVERE, "XmlPullParser does not support XML_ROUNDTRIP, although it was first determined to be supported", e);
            }
        }
        return newPullParser;
    }

    public static XmlPullParser newXmppParser(Reader reader) {
        XmlPullParser newXmppParser = newXmppParser();
        newXmppParser.setInput(reader);
        return newXmppParser;
    }

    public static Feature parseCompressionFeature(XmlPullParser xmlPullParser) {
        int depth = xmlPullParser.getDepth();
        List linkedList = new LinkedList();
        while (true) {
            Object obj = null;
            String name;
            switch (xmlPullParser.next()) {
                case 2:
                    name = xmlPullParser.getName();
                    if (name.hashCode() == -1077554975) {
                        if (name.equals("method")) {
                            if (obj != null) {
                                linkedList.add(xmlPullParser.nextText());
                                break;
                            }
                            break;
                        }
                    }
                    obj = -1;
                    if (obj != null) {
                        linkedList.add(xmlPullParser.nextText());
                    }
                case 3:
                    name = xmlPullParser.getName();
                    if (name.hashCode() == 1431984486) {
                        if (name.equals(Feature.ELEMENT)) {
                            if (obj == null) {
                                break;
                            } else if (xmlPullParser.getDepth() == depth) {
                                break;
                            } else {
                                return new Feature(linkedList);
                            }
                        }
                    }
                    obj = -1;
                    if (obj == null) {
                        if (xmlPullParser.getDepth() == depth) {
                            return new Feature(linkedList);
                        }
                    }
                default:
                    break;
            }
        }
    }

    public static CharSequence parseContent(XmlPullParser xmlPullParser) {
        if (xmlPullParser.isEmptyElementTag()) {
            return "";
        }
        xmlPullParser.next();
        return parseContentDepth(xmlPullParser, xmlPullParser.getDepth(), false);
    }

    public static CharSequence parseContentDepth(XmlPullParser xmlPullParser, int i) {
        return parseContentDepth(xmlPullParser, i, false);
    }

    public static CharSequence parseContentDepth(XmlPullParser xmlPullParser, int i, boolean z) {
        return xmlPullParser.getFeature(FEATURE_XML_ROUNDTRIP) ? parseContentDepthWithRoundtrip(xmlPullParser, i, z) : parseContentDepthWithoutRoundtrip(xmlPullParser, i, z);
    }

    private static CharSequence parseContentDepthWithRoundtrip(XmlPullParser xmlPullParser, int i, boolean z) {
        CharSequence stringBuilder = new StringBuilder();
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (!(eventType == 2 && xmlPullParser.isEmptyElementTag())) {
                CharSequence text = xmlPullParser.getText();
                if (eventType == 4) {
                    text = StringUtils.escapeForXmlText(text.toString());
                }
                stringBuilder.append(text);
            }
            if (eventType == 3) {
                if (xmlPullParser.getDepth() <= i) {
                    return stringBuilder;
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    private static CharSequence parseContentDepthWithoutRoundtrip(XmlPullParser xmlPullParser, int i, boolean z) {
        XmlStringBuilder xmlStringBuilder = new XmlStringBuilder();
        int eventType = xmlPullParser.getEventType();
        String str = null;
        Object obj = null;
        while (true) {
            switch (eventType) {
                case 2:
                    xmlStringBuilder.halfOpenElement(xmlPullParser.getName());
                    if (str == null || z) {
                        String namespace = xmlPullParser.getNamespace();
                        if (StringUtils.isNotEmpty((CharSequence) namespace)) {
                            xmlStringBuilder.attribute("xmlns", namespace);
                            str = xmlPullParser.getName();
                        }
                    }
                    for (eventType = 0; eventType < xmlPullParser.getAttributeCount(); eventType++) {
                        xmlStringBuilder.attribute(xmlPullParser.getAttributeName(eventType), xmlPullParser.getAttributeValue(eventType));
                    }
                    if (!xmlPullParser.isEmptyElementTag()) {
                        xmlStringBuilder.rightAngleBracket();
                        break;
                    }
                    xmlStringBuilder.closeEmptyElement();
                    obj = 1;
                    break;
                case 3:
                    if (obj != null) {
                        obj = null;
                    } else {
                        xmlStringBuilder.closeElement(xmlPullParser.getName());
                    }
                    if (str != null && str.equals(xmlPullParser.getName())) {
                        str = null;
                    }
                    if (xmlPullParser.getDepth() > i) {
                        break;
                    }
                    return xmlStringBuilder;
                case 4:
                    xmlStringBuilder.escape(xmlPullParser.getText());
                    break;
                default:
                    break;
            }
            eventType = xmlPullParser.next();
        }
    }

    public static Map<String, String> parseDescriptiveTexts(XmlPullParser xmlPullParser, Map<String, String> map) {
        if (map == null) {
            map = new HashMap();
        }
        String str = (String) map.put(getLanguageAttribute(xmlPullParser), xmlPullParser.nextText());
        return map;
    }

    public static CharSequence parseElement(XmlPullParser xmlPullParser) {
        return parseElement(xmlPullParser, false);
    }

    public static CharSequence parseElement(XmlPullParser xmlPullParser, boolean z) {
        return parseContentDepth(xmlPullParser, xmlPullParser.getDepth(), z);
    }

    public static String parseElementText(XmlPullParser xmlPullParser) {
        if (xmlPullParser.isEmptyElementTag()) {
            return "";
        }
        int next = xmlPullParser.next();
        if (next == 4) {
            String text = xmlPullParser.getText();
            if (xmlPullParser.next() == 3) {
                return text;
            }
            throw new XmlPullParserException("Non-empty element tag contains child-elements, while Mixed Content (XML 3.2.2) is disallowed");
        } else if (next == 3) {
            return "";
        } else {
            throw new XmlPullParserException("Non-empty element tag not followed by text, while Mixed Content (XML 3.2.2) is disallowed");
        }
    }

    public static Builder parseError(XmlPullParser xmlPullParser) {
        int depth = xmlPullParser.getDepth();
        Collection arrayList = new ArrayList();
        Builder builder = XMPPError.getBuilder();
        builder.setType(Type.fromString(xmlPullParser.getAttributeValue("", IjkMediaMeta.IJKM_KEY_TYPE)));
        builder.setErrorGenerator(xmlPullParser.getAttributeValue("", "by"));
        Map map = null;
        while (true) {
            switch (xmlPullParser.next()) {
                case 2:
                    Object obj;
                    String name = xmlPullParser.getName();
                    String namespace = xmlPullParser.getNamespace();
                    Object obj2 = null;
                    if (namespace.hashCode() == 888780199) {
                        if (namespace.equals(XMPPError.NAMESPACE)) {
                            obj = null;
                            if (obj == null) {
                                addExtensionElement(arrayList, xmlPullParser, name, namespace);
                                break;
                            }
                            if (name.hashCode() != 3556653) {
                                if (name.equals("text")) {
                                    if (obj2 != null) {
                                        map = parseDescriptiveTexts(xmlPullParser, map);
                                        break;
                                    }
                                    builder.setCondition(Condition.fromString(name));
                                    if (!xmlPullParser.isEmptyElementTag()) {
                                        break;
                                    }
                                    builder.setConditionText(xmlPullParser.nextText());
                                    break;
                                }
                            }
                            obj2 = -1;
                            if (obj2 != null) {
                                map = parseDescriptiveTexts(xmlPullParser, map);
                            } else {
                                builder.setCondition(Condition.fromString(name));
                                if (!xmlPullParser.isEmptyElementTag()) {
                                    builder.setConditionText(xmlPullParser.nextText());
                                }
                            }
                        }
                    }
                    obj = -1;
                    if (obj == null) {
                        if (name.hashCode() != 3556653) {
                            if (name.equals("text")) {
                                if (obj2 != null) {
                                    builder.setCondition(Condition.fromString(name));
                                    if (!xmlPullParser.isEmptyElementTag()) {
                                        builder.setConditionText(xmlPullParser.nextText());
                                    }
                                } else {
                                    map = parseDescriptiveTexts(xmlPullParser, map);
                                }
                            }
                        }
                        obj2 = -1;
                        if (obj2 != null) {
                            map = parseDescriptiveTexts(xmlPullParser, map);
                        } else {
                            builder.setCondition(Condition.fromString(name));
                            if (!xmlPullParser.isEmptyElementTag()) {
                                builder.setConditionText(xmlPullParser.nextText());
                            }
                        }
                    } else {
                        addExtensionElement(arrayList, xmlPullParser, name, namespace);
                    }
                case 3:
                    if (xmlPullParser.getDepth() != depth) {
                        break;
                    }
                    ((Builder) builder.setExtensions(arrayList)).setDescriptiveTexts(map);
                    return builder;
                default:
                    break;
            }
        }
    }

    public static ExtensionElement parseExtensionElement(String str, String str2, XmlPullParser xmlPullParser) {
        ParserUtils.assertAtStartTag(xmlPullParser);
        ExtensionElementProvider extensionProvider = ProviderManager.getExtensionProvider(str, str2);
        return (ExtensionElement) (extensionProvider != null ? extensionProvider.parse(xmlPullParser) : StandardExtensionElementProvider.INSTANCE.parse(xmlPullParser));
    }

    public static IQ parseIQ(XmlPullParser xmlPullParser) {
        ParserUtils.assertAtStartTag(xmlPullParser);
        int depth = xmlPullParser.getDepth();
        String attributeValue = xmlPullParser.getAttributeValue("", MessageCorrectExtension.ID_TAG);
        i jidAttribute = ParserUtils.getJidAttribute(xmlPullParser, PrivacyItem.SUBSCRIPTION_TO);
        i jidAttribute2 = ParserUtils.getJidAttribute(xmlPullParser, PrivacyItem.SUBSCRIPTION_FROM);
        IQ.Type fromString = IQ.Type.fromString(xmlPullParser.getAttributeValue("", IjkMediaMeta.IJKM_KEY_TYPE));
        IQ iq = null;
        Builder builder = null;
        while (true) {
            switch (xmlPullParser.next()) {
                case 2:
                    String name = xmlPullParser.getName();
                    String namespace = xmlPullParser.getNamespace();
                    Object obj = -1;
                    if (name.hashCode() == 96784904) {
                        if (name.equals("error")) {
                            obj = null;
                        }
                    }
                    if (obj == null) {
                        builder = parseError(xmlPullParser);
                        break;
                    }
                    IQProvider iQProvider = ProviderManager.getIQProvider(name, namespace);
                    if (iQProvider == null) {
                        iq = new UnparsedIQ(name, namespace, parseElement(xmlPullParser));
                        break;
                    }
                    iq = (IQ) iQProvider.parse(xmlPullParser);
                    break;
                case 3:
                    if (xmlPullParser.getDepth() != depth) {
                        break;
                    }
                    if (iq == null) {
                        switch (fromString) {
                            case error:
                                iq = new ErrorIQ(builder);
                                break;
                            case result:
                                iq = new EmptyResultIQ();
                                break;
                            default:
                                break;
                        }
                    }
                    iq.setStanzaId(attributeValue);
                    iq.setTo(jidAttribute);
                    iq.setFrom(jidAttribute2);
                    iq.setType(fromString);
                    iq.setError(builder);
                    return iq;
                default:
                    break;
            }
        }
    }

    public static Collection<String> parseMechanisms(XmlPullParser xmlPullParser) {
        Collection arrayList = new ArrayList();
        Object obj = null;
        while (obj == null) {
            int next = xmlPullParser.next();
            if (next == 2) {
                if (xmlPullParser.getName().equals("mechanism")) {
                    arrayList.add(xmlPullParser.nextText());
                }
            } else if (next == 3 && xmlPullParser.getName().equals(Mechanisms.ELEMENT)) {
                obj = 1;
            }
        }
        return arrayList;
    }

    public static Message parseMessage(XmlPullParser xmlPullParser) {
        ParserUtils.assertAtStartTag(xmlPullParser);
        int depth = xmlPullParser.getDepth();
        Stanza message = new Message();
        message.setStanzaId(xmlPullParser.getAttributeValue("", MessageCorrectExtension.ID_TAG));
        message.setTo(ParserUtils.getJidAttribute(xmlPullParser, PrivacyItem.SUBSCRIPTION_TO));
        message.setFrom(ParserUtils.getJidAttribute(xmlPullParser, PrivacyItem.SUBSCRIPTION_FROM));
        String attributeValue = xmlPullParser.getAttributeValue("", IjkMediaMeta.IJKM_KEY_TYPE);
        if (attributeValue != null) {
            message.setType(Message.Type.fromString(attributeValue));
        }
        attributeValue = getLanguageAttribute(xmlPullParser);
        if (attributeValue == null || "".equals(attributeValue.trim())) {
            attributeValue = Stanza.getDefaultLanguage();
        } else {
            message.setLanguage(attributeValue);
        }
        String str = null;
        while (true) {
            switch (xmlPullParser.next()) {
                case 2:
                    String name = xmlPullParser.getName();
                    String namespace = xmlPullParser.getNamespace();
                    Object obj = -1;
                    int hashCode = name.hashCode();
                    if (hashCode != -1867885268) {
                        if (hashCode != -874443254) {
                            if (hashCode != 3029410) {
                                if (hashCode == 96784904) {
                                    if (name.equals("error")) {
                                        obj = 3;
                                    }
                                }
                            } else if (name.equals(Message.BODY)) {
                                obj = 1;
                            }
                        } else if (name.equals("thread")) {
                            obj = 2;
                        }
                    } else if (name.equals("subject")) {
                        obj = null;
                    }
                    switch (obj) {
                        case null:
                            name = getLanguageAttribute(xmlPullParser);
                            if (name == null) {
                                name = attributeValue;
                            }
                            namespace = parseElementText(xmlPullParser);
                            if (message.getSubject(name) != null) {
                                break;
                            }
                            message.addSubject(name, namespace);
                            break;
                        case 1:
                            name = getLanguageAttribute(xmlPullParser);
                            if (name == null) {
                                name = attributeValue;
                            }
                            namespace = parseElementText(xmlPullParser);
                            if (message.getBody(name) != null) {
                                break;
                            }
                            message.addBody(name, namespace);
                            break;
                        case 2:
                            if (str != null) {
                                break;
                            }
                            str = xmlPullParser.nextText();
                            break;
                        case 3:
                            message.setError(parseError(xmlPullParser));
                            break;
                        default:
                            addExtensionElement(message, xmlPullParser, name, namespace);
                            break;
                    }
                case 3:
                    if (xmlPullParser.getDepth() != depth) {
                        break;
                    }
                    message.setThread(str);
                    return message;
                default:
                    break;
            }
        }
    }

    @Deprecated
    public static ExtensionElement parsePacketExtension(String str, String str2, XmlPullParser xmlPullParser) {
        return parseExtensionElement(str, str2, xmlPullParser);
    }

    public static Presence parsePresence(XmlPullParser xmlPullParser) {
        ParserUtils.assertAtStartTag(xmlPullParser);
        int depth = xmlPullParser.getDepth();
        Presence.Type type = Presence.Type.available;
        String attributeValue = xmlPullParser.getAttributeValue("", IjkMediaMeta.IJKM_KEY_TYPE);
        if (!(attributeValue == null || attributeValue.equals(""))) {
            type = Presence.Type.fromString(attributeValue);
        }
        Stanza presence = new Presence(type);
        presence.setTo(ParserUtils.getJidAttribute(xmlPullParser, PrivacyItem.SUBSCRIPTION_TO));
        presence.setFrom(ParserUtils.getJidAttribute(xmlPullParser, PrivacyItem.SUBSCRIPTION_FROM));
        presence.setStanzaId(xmlPullParser.getAttributeValue("", MessageCorrectExtension.ID_TAG));
        String languageAttribute = getLanguageAttribute(xmlPullParser);
        if (!(languageAttribute == null || "".equals(languageAttribute.trim()))) {
            presence.setLanguage(languageAttribute);
        }
        while (true) {
            switch (xmlPullParser.next()) {
                case 2:
                    languageAttribute = xmlPullParser.getName();
                    String namespace = xmlPullParser.getNamespace();
                    Object obj = -1;
                    int hashCode = languageAttribute.hashCode();
                    if (hashCode != -1165461084) {
                        if (hashCode != -892481550) {
                            if (hashCode != 3529469) {
                                if (hashCode == 96784904) {
                                    if (languageAttribute.equals("error")) {
                                        obj = 3;
                                    }
                                }
                            } else if (languageAttribute.equals("show")) {
                                obj = 2;
                            }
                        } else if (languageAttribute.equals(Status.ELEMENT)) {
                            obj = null;
                        }
                    } else if (languageAttribute.equals("priority")) {
                        obj = 1;
                    }
                    switch (obj) {
                        case null:
                            presence.setStatus(xmlPullParser.nextText());
                            break;
                        case 1:
                            presence.setPriority(Integer.parseInt(xmlPullParser.nextText()));
                            break;
                        case 2:
                            CharSequence nextText = xmlPullParser.nextText();
                            if (!StringUtils.isNotEmpty(nextText)) {
                                Logger logger = LOGGER;
                                StringBuilder stringBuilder = new StringBuilder("Empty or null mode text in presence show element form ");
                                stringBuilder.append(presence.getFrom());
                                stringBuilder.append(" with id '");
                                stringBuilder.append(presence.getStanzaId());
                                stringBuilder.append("' which is invalid according to RFC6121 4.7.2.1");
                                logger.warning(stringBuilder.toString());
                                break;
                            }
                            presence.setMode(Mode.fromString(nextText));
                            break;
                        case 3:
                            presence.setError(parseError(xmlPullParser));
                            break;
                        default:
                            try {
                                addExtensionElement(presence, xmlPullParser, languageAttribute, namespace);
                                break;
                            } catch (Exception e) {
                                Logger logger2 = LOGGER;
                                StringBuilder stringBuilder2 = new StringBuilder("Failed to parse extension element in Presence stanza: \"");
                                stringBuilder2.append(e);
                                stringBuilder2.append("\" from: '");
                                stringBuilder2.append(presence.getFrom());
                                stringBuilder2.append(" id: '");
                                stringBuilder2.append(presence.getStanzaId());
                                stringBuilder2.append("'");
                                logger2.warning(stringBuilder2.toString());
                                break;
                            }
                    }
                case 3:
                    if (xmlPullParser.getDepth() != depth) {
                        break;
                    }
                    return presence;
                default:
                    break;
            }
        }
    }

    public static SASLFailure parseSASLFailure(XmlPullParser xmlPullParser) {
        int depth = xmlPullParser.getDepth();
        Map map = null;
        String str = null;
        while (true) {
            switch (xmlPullParser.next()) {
                case 2:
                    if (!xmlPullParser.getName().equals("text")) {
                        str = xmlPullParser.getName();
                        break;
                    }
                    map = parseDescriptiveTexts(xmlPullParser, map);
                    break;
                case 3:
                    if (xmlPullParser.getDepth() != depth) {
                        break;
                    }
                    return new SASLFailure(str, map);
                default:
                    break;
            }
        }
    }

    public static Session.Feature parseSessionFeature(XmlPullParser xmlPullParser) {
        boolean z;
        ParserUtils.assertAtStartTag(xmlPullParser);
        int depth = xmlPullParser.getDepth();
        if (xmlPullParser.isEmptyElementTag()) {
            z = false;
        } else {
            z = false;
            while (true) {
                switch (xmlPullParser.next()) {
                    case 2:
                        String name = xmlPullParser.getName();
                        Object obj = -1;
                        if (name.hashCode() == -79017120) {
                            if (name.equals(Session.Feature.OPTIONAL_ELEMENT)) {
                                obj = null;
                            }
                        }
                        if (obj == null) {
                            z = true;
                            break;
                        }
                        continue;
                    case 3:
                        if (xmlPullParser.getDepth() == depth) {
                            break;
                        }
                        continue;
                    default:
                        continue;
                }
            }
        }
        return new Session.Feature(z);
    }

    public static <S extends Stanza> S parseStanza(String str) {
        return parseStanza(getParserFor(str));
    }

    public static Stanza parseStanza(XmlPullParser xmlPullParser) {
        Object obj;
        StringBuilder stringBuilder;
        ParserUtils.assertAtStartTag(xmlPullParser);
        String name = xmlPullParser.getName();
        int hashCode = name.hashCode();
        if (hashCode != -1276666629) {
            if (hashCode != 3368) {
                if (hashCode == 954925063) {
                    if (name.equals(Message.ELEMENT)) {
                        obj = null;
                        switch (obj) {
                            case null:
                                return parseMessage(xmlPullParser);
                            case 1:
                                return parseIQ(xmlPullParser);
                            case 2:
                                return parsePresence(xmlPullParser);
                            default:
                                stringBuilder = new StringBuilder("Can only parse message, iq or presence, not ");
                                stringBuilder.append(name);
                                throw new IllegalArgumentException(stringBuilder.toString());
                        }
                    }
                }
            } else if (name.equals(IQ.IQ_ELEMENT)) {
                obj = 1;
                switch (obj) {
                    case null:
                        return parseMessage(xmlPullParser);
                    case 1:
                        return parseIQ(xmlPullParser);
                    case 2:
                        return parsePresence(xmlPullParser);
                    default:
                        stringBuilder = new StringBuilder("Can only parse message, iq or presence, not ");
                        stringBuilder.append(name);
                        throw new IllegalArgumentException(stringBuilder.toString());
                }
            }
        } else if (name.equals(Presence.ELEMENT)) {
            obj = 2;
            switch (obj) {
                case null:
                    return parseMessage(xmlPullParser);
                case 1:
                    return parseIQ(xmlPullParser);
                case 2:
                    return parsePresence(xmlPullParser);
                default:
                    stringBuilder = new StringBuilder("Can only parse message, iq or presence, not ");
                    stringBuilder.append(name);
                    throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        obj = -1;
        switch (obj) {
            case null:
                return parseMessage(xmlPullParser);
            case 1:
                return parseIQ(xmlPullParser);
            case 2:
                return parsePresence(xmlPullParser);
            default:
                stringBuilder = new StringBuilder("Can only parse message, iq or presence, not ");
                stringBuilder.append(name);
                throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    public static StartTls parseStartTlsFeature(XmlPullParser xmlPullParser) {
        int depth = xmlPullParser.getDepth();
        boolean z = false;
        while (true) {
            switch (xmlPullParser.next()) {
                case 2:
                    String name = xmlPullParser.getName();
                    Object obj = -1;
                    if (name.hashCode() == -393139297) {
                        if (name.equals("required")) {
                            obj = null;
                        }
                    }
                    if (obj == null) {
                        z = true;
                        break;
                    }
                    break;
                case 3:
                    if (xmlPullParser.getDepth() != depth) {
                        break;
                    }
                    return new StartTls(z);
                default:
                    break;
            }
        }
    }

    public static StreamError parseStreamError(XmlPullParser xmlPullParser) {
        int depth = xmlPullParser.getDepth();
        Collection arrayList = new ArrayList();
        StreamError.Condition condition = null;
        String str = null;
        Map map = str;
        while (true) {
            switch (xmlPullParser.next()) {
                case 2:
                    Object obj;
                    String name = xmlPullParser.getName();
                    String namespace = xmlPullParser.getNamespace();
                    Object obj2 = null;
                    if (namespace.hashCode() == 904188284) {
                        if (namespace.equals(StreamError.NAMESPACE)) {
                            obj = null;
                            if (obj == null) {
                                addExtensionElement(arrayList, xmlPullParser, name, namespace);
                                break;
                            }
                            if (name.hashCode() != 3556653) {
                                if (name.equals("text")) {
                                    if (obj2 != null) {
                                        map = parseDescriptiveTexts(xmlPullParser, map);
                                        break;
                                    }
                                    condition = StreamError.Condition.fromString(name);
                                    if (!xmlPullParser.isEmptyElementTag()) {
                                        break;
                                    }
                                    str = xmlPullParser.nextText();
                                    break;
                                }
                            }
                            obj2 = -1;
                            if (obj2 != null) {
                                map = parseDescriptiveTexts(xmlPullParser, map);
                            } else {
                                condition = StreamError.Condition.fromString(name);
                                if (!xmlPullParser.isEmptyElementTag()) {
                                    str = xmlPullParser.nextText();
                                }
                            }
                        }
                    }
                    obj = -1;
                    if (obj == null) {
                        if (name.hashCode() != 3556653) {
                            if (name.equals("text")) {
                                if (obj2 != null) {
                                    condition = StreamError.Condition.fromString(name);
                                    if (!xmlPullParser.isEmptyElementTag()) {
                                        str = xmlPullParser.nextText();
                                    }
                                } else {
                                    map = parseDescriptiveTexts(xmlPullParser, map);
                                }
                            }
                        }
                        obj2 = -1;
                        if (obj2 != null) {
                            map = parseDescriptiveTexts(xmlPullParser, map);
                        } else {
                            condition = StreamError.Condition.fromString(name);
                            if (!xmlPullParser.isEmptyElementTag()) {
                                str = xmlPullParser.nextText();
                            }
                        }
                    } else {
                        addExtensionElement(arrayList, xmlPullParser, name, namespace);
                    }
                case 3:
                    if (xmlPullParser.getDepth() != depth) {
                        break;
                    }
                    return new StreamError(condition, str, map, arrayList);
                default:
                    break;
            }
        }
    }
}
