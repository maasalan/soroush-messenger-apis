package com.google.android.gms.internal;

import android.content.res.Resources.NotFoundException;
import android.content.res.XmlResourceParser;
import android.text.TextUtils;
import org.xmlpull.v1.XmlPullParserException;

public class av<T extends au> extends C1825u {
    private aw<T> f15180a;

    public av(C1827x c1827x, aw<T> awVar) {
        super(c1827x);
        this.f15180a = awVar;
    }

    private final T m11856a(XmlResourceParser xmlResourceParser) {
        Object attributeValue;
        Object trim;
        String str;
        try {
            xmlResourceParser.next();
            int eventType = xmlResourceParser.getEventType();
            while (eventType != 1) {
                if (xmlResourceParser.getEventType() == 2) {
                    String toLowerCase = xmlResourceParser.getName().toLowerCase();
                    String trim2;
                    if (toLowerCase.equals("screenname")) {
                        toLowerCase = xmlResourceParser.getAttributeValue(null, "name");
                        trim2 = xmlResourceParser.nextText().trim();
                        if (!(TextUtils.isEmpty(toLowerCase) || TextUtils.isEmpty(trim2))) {
                            this.f15180a.mo1591a(toLowerCase, trim2);
                        }
                    } else if (toLowerCase.equals("string")) {
                        attributeValue = xmlResourceParser.getAttributeValue(null, "name");
                        trim2 = xmlResourceParser.nextText().trim();
                        if (!(TextUtils.isEmpty(attributeValue) || trim2 == null)) {
                            this.f15180a.mo1593b(attributeValue, trim2);
                        }
                    } else if (toLowerCase.equals("bool")) {
                        toLowerCase = xmlResourceParser.getAttributeValue(null, "name");
                        trim = xmlResourceParser.nextText().trim();
                        if (!(TextUtils.isEmpty(toLowerCase) || TextUtils.isEmpty(trim))) {
                            try {
                                this.f15180a.mo1592a(toLowerCase, Boolean.parseBoolean(trim));
                            } catch (NumberFormatException e) {
                                attributeValue = e;
                                str = "Error parsing bool configuration value";
                                m5149c(str, trim, attributeValue);
                                eventType = xmlResourceParser.next();
                            }
                        }
                    } else if (toLowerCase.equals("integer")) {
                        toLowerCase = xmlResourceParser.getAttributeValue(null, "name");
                        trim = xmlResourceParser.nextText().trim();
                        if (!(TextUtils.isEmpty(toLowerCase) || TextUtils.isEmpty(trim))) {
                            try {
                                this.f15180a.mo1590a(toLowerCase, Integer.parseInt(trim));
                            } catch (NumberFormatException e2) {
                                attributeValue = e2;
                                str = "Error parsing int configuration value";
                                m5149c(str, trim, attributeValue);
                                eventType = xmlResourceParser.next();
                            }
                        }
                    }
                }
                eventType = xmlResourceParser.next();
            }
        } catch (XmlPullParserException e3) {
            m5154e("Error parsing tracker configuration file", e3);
        }
        return this.f15180a.mo1589a();
    }

    public final T m11857a(int i) {
        try {
            return m11856a(this.f6279f.f6284b.getResources().getXml(i));
        } catch (NotFoundException e) {
            m5151d("inflate() called with unknown resourceId", e);
            return null;
        }
    }
}
