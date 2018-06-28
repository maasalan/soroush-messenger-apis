package org.jivesoftware.smackx.search;

import org.b.a.b;
import org.b.a.i;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.packet.ExtensionElement;
import org.jivesoftware.smack.packet.IQ;
import org.jivesoftware.smack.packet.SimpleIQ;
import org.jivesoftware.smack.packet.Stanza;
import org.jivesoftware.smack.provider.IQProvider;
import org.jivesoftware.smack.util.PacketParserUtils;
import org.jivesoftware.smackx.hoxt.packet.Base64BinaryChunk;
import org.jivesoftware.smackx.nick.packet.Nick;
import org.jivesoftware.smackx.xdata.Form;
import org.jivesoftware.smackx.xdata.FormField;
import org.jivesoftware.smackx.xdata.packet.DataForm;
import org.jivesoftware.smackx.xdata.packet.DataForm.Type;
import org.xmlpull.v1.XmlPullParser;

public class UserSearch extends SimpleIQ {
    public static final String ELEMENT = "query";
    public static final String NAMESPACE = "jabber:iq:search";

    public static class Provider extends IQProvider<IQ> {
        public IQ parse(XmlPullParser xmlPullParser, int i) {
            IQ simpleUserSearch = new SimpleUserSearch();
            IQ iq = null;
            Object obj = null;
            while (obj == null) {
                int next = xmlPullParser.next();
                if (next == 2 && xmlPullParser.getName().equals("instructions")) {
                    UserSearch.buildDataForm(simpleUserSearch, xmlPullParser.nextText(), xmlPullParser);
                    return simpleUserSearch;
                } else if (next == 2 && xmlPullParser.getName().equals("item")) {
                    simpleUserSearch.parseItems(xmlPullParser);
                    return simpleUserSearch;
                } else if (next == 2 && xmlPullParser.getNamespace().equals("jabber:x:data")) {
                    iq = new UserSearch();
                    PacketParserUtils.addExtensionElement((Stanza) iq, xmlPullParser);
                } else if (next == 3 && xmlPullParser.getName().equals("query")) {
                    obj = 1;
                }
            }
            return iq != null ? iq : simpleUserSearch;
        }
    }

    public UserSearch() {
        super("query", "jabber:iq:search");
    }

    private static void buildDataForm(SimpleUserSearch simpleUserSearch, String str, XmlPullParser xmlPullParser) {
        ExtensionElement dataForm = new DataForm(Type.form);
        dataForm.setTitle("User Search");
        dataForm.addInstruction(str);
        Object obj = null;
        while (obj == null) {
            int next = xmlPullParser.next();
            if (next != 2 || xmlPullParser.getNamespace().equals("jabber:x:data")) {
                if (next == 3) {
                    if (!xmlPullParser.getName().equals("query")) {
                    }
                } else if (next == 2 && xmlPullParser.getNamespace().equals("jabber:x:data")) {
                    PacketParserUtils.addExtensionElement((Stanza) simpleUserSearch, xmlPullParser);
                }
                obj = 1;
            } else {
                String name = xmlPullParser.getName();
                FormField formField = new FormField(name);
                if (name.equals("first")) {
                    name = "First Name";
                } else if (name.equals(Base64BinaryChunk.ATTRIBUTE_LAST)) {
                    name = "Last Name";
                } else if (name.equals("email")) {
                    name = "Email Address";
                } else {
                    if (name.equals(Nick.ELEMENT_NAME)) {
                        name = "Nickname";
                    }
                    formField.setType(FormField.Type.text_single);
                    dataForm.addField(formField);
                }
                formField.setLabel(name);
                formField.setType(FormField.Type.text_single);
                dataForm.addField(formField);
            }
        }
        if (simpleUserSearch.getExtension("x", "jabber:x:data") == null) {
            simpleUserSearch.addExtension(dataForm);
        }
    }

    public Form getSearchForm(XMPPConnection xMPPConnection, b bVar) {
        IQ userSearch = new UserSearch();
        userSearch.setType(IQ.Type.get);
        userSearch.setTo((i) bVar);
        return Form.getFormFrom((IQ) xMPPConnection.createStanzaCollectorAndSend(userSearch).nextResultOrThrow());
    }

    public ReportedData sendSearchForm(XMPPConnection xMPPConnection, Form form, b bVar) {
        IQ userSearch = new UserSearch();
        userSearch.setType(IQ.Type.set);
        userSearch.setTo((i) bVar);
        userSearch.addExtension(form.getDataFormToSend());
        return ReportedData.getReportedDataFrom((IQ) xMPPConnection.createStanzaCollectorAndSend(userSearch).nextResultOrThrow());
    }

    public ReportedData sendSimpleSearchForm(XMPPConnection xMPPConnection, Form form, b bVar) {
        IQ simpleUserSearch = new SimpleUserSearch();
        simpleUserSearch.setForm(form);
        simpleUserSearch.setType(IQ.Type.set);
        simpleUserSearch.setTo((i) bVar);
        return ((SimpleUserSearch) xMPPConnection.createStanzaCollectorAndSend(simpleUserSearch).nextResultOrThrow()).getReportedData();
    }
}
