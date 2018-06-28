package org.jivesoftware.smackx.search;

import java.util.ArrayList;
import java.util.List;
import org.jivesoftware.smack.packet.IQ;
import org.jivesoftware.smack.packet.IQ.IQChildElementXmlStringBuilder;
import org.jivesoftware.smack.util.ParserUtils;
import org.jivesoftware.smackx.search.ReportedData.Column;
import org.jivesoftware.smackx.search.ReportedData.Field;
import org.jivesoftware.smackx.search.ReportedData.Row;
import org.jivesoftware.smackx.xdata.Form;
import org.jivesoftware.smackx.xdata.FormField;
import org.jivesoftware.smackx.xdata.FormField.Type;
import org.xmlpull.v1.XmlPullParser;

class SimpleUserSearch extends IQ {
    public static final String ELEMENT = "query";
    public static final String NAMESPACE = "jabber:iq:search";
    private ReportedData data;
    private Form form;

    public SimpleUserSearch() {
        super("query", "jabber:iq:search");
    }

    private String getItemsToSearch() {
        StringBuilder stringBuilder = new StringBuilder();
        if (this.form == null) {
            this.form = Form.getFormFrom(this);
        }
        if (this.form == null) {
            return "";
        }
        for (FormField formField : this.form.getFields()) {
            String variable = formField.getVariable();
            String singleValue = getSingleValue(formField);
            if (singleValue.trim().length() > 0) {
                stringBuilder.append('<');
                stringBuilder.append(variable);
                stringBuilder.append('>');
                stringBuilder.append(singleValue);
                stringBuilder.append("</");
                stringBuilder.append(variable);
                stringBuilder.append('>');
            }
        }
        return stringBuilder.toString();
    }

    private static String getSingleValue(FormField formField) {
        List values = formField.getValues();
        return values.isEmpty() ? "" : (String) values.get(0);
    }

    protected IQChildElementXmlStringBuilder getIQChildElementBuilder(IQChildElementXmlStringBuilder iQChildElementXmlStringBuilder) {
        iQChildElementXmlStringBuilder.rightAngleBracket();
        iQChildElementXmlStringBuilder.append(getItemsToSearch());
        return iQChildElementXmlStringBuilder;
    }

    public ReportedData getReportedData() {
        return this.data;
    }

    protected void parseItems(XmlPullParser xmlPullParser) {
        ReportedData reportedData = new ReportedData();
        reportedData.addColumn(new Column("JID", ParserUtils.JID, Type.text_single));
        List arrayList = new ArrayList();
        Object obj = null;
        while (obj == null) {
            if (xmlPullParser.getAttributeCount() > 0) {
                String attributeValue = xmlPullParser.getAttributeValue("", ParserUtils.JID);
                List arrayList2 = new ArrayList();
                arrayList2.add(attributeValue);
                arrayList.add(new Field(ParserUtils.JID, arrayList2));
            }
            int next = xmlPullParser.next();
            if (next == 2 && xmlPullParser.getName().equals("item")) {
                arrayList = new ArrayList();
            } else if (next == 3 && xmlPullParser.getName().equals("item")) {
                reportedData.addRow(new Row(arrayList));
            } else {
                Object obj2 = 1;
                if (next == 2) {
                    attributeValue = xmlPullParser.getName();
                    String nextText = xmlPullParser.nextText();
                    List arrayList3 = new ArrayList();
                    arrayList3.add(nextText);
                    arrayList.add(new Field(attributeValue, arrayList3));
                    for (Column variable : reportedData.getColumns()) {
                        if (variable.getVariable().equals(attributeValue)) {
                            break;
                        }
                    }
                    obj2 = null;
                    if (obj2 == null) {
                        reportedData.addColumn(new Column(attributeValue, attributeValue, Type.text_single));
                    }
                } else if (next == 3 && xmlPullParser.getName().equals("query")) {
                    obj = 1;
                }
            }
        }
        this.data = reportedData;
    }

    public void setForm(Form form) {
        this.form = form;
    }
}
