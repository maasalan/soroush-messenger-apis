package mobi.mmdt.ott.logic.p261a.p296j.p297a;

import android.os.Build.VERSION;
import com.p072b.p073a.p074a.C1063i;
import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.parsers.DocumentBuilderFactory;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.capi.base.ConversationListMessageState;
import mobi.mmdt.ott.lib_webservicescomponent.retrofit.webservices.capi.base.ConversationResponse;
import mobi.mmdt.ott.logic.C2808d;
import mobi.mmdt.ott.logic.notifications.C2874b;
import mobi.mmdt.ott.logic.p261a.aa.C6643b;
import mobi.mmdt.ott.logic.p261a.p284f.p286b.C2655q;
import mobi.mmdt.ott.logic.p261a.p284f.p286b.C6700i;
import mobi.mmdt.ott.logic.p261a.p287g.p288a.p290b.C2668c;
import mobi.mmdt.ott.logic.p261a.p295i.C6733b;
import mobi.mmdt.ott.logic.p261a.p311r.p312a.p314b.C6770d;
import mobi.mmdt.ott.p246d.p247a.C2531b;
import mobi.mmdt.ott.p246d.p247a.C2532d;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.provider.p384f.C2966b;
import mobi.mmdt.ott.provider.p384f.C2970j;
import mobi.mmdt.ott.provider.p384f.C2971k;
import mobi.mmdt.ott.provider.p385g.C2976c;
import mobi.mmdt.ott.provider.p385g.C2980g;
import mobi.mmdt.ott.provider.p385g.C6022i;
import mobi.mmdt.ott.provider.p385g.C6024k;
import org.jivesoftware.smack.packet.Message;
import org.jivesoftware.smack.util.StringUtils;
import org.jivesoftware.smackx.message_correct.element.MessageCorrectExtension;
import org.jivesoftware.smackx.privacy.packet.PrivacyItem;
import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.NodeList;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

public final class C2694a {
    private static C2531b m7064a(String str, String str2, int i, ConversationListMessageState conversationListMessageState) {
        String str3 = str2;
        try {
            C2971k c2971k;
            Map hashMap = new HashMap();
            Document parse = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(VERSION.SDK_INT >= 19 ? new ByteArrayInputStream(str3.getBytes(StandardCharsets.UTF_8)) : new ByteArrayInputStream(str3.getBytes(StringUtils.UTF8)));
            parse.getDocumentElement().normalize();
            NodeList elementsByTagName = parse.getElementsByTagName(Message.ELEMENT);
            NamedNodeMap attributes = elementsByTagName.item(0).getAttributes();
            C2531b c2531b = null;
            String str4 = c2531b;
            String str5 = str4;
            String str6 = str5;
            for (int i2 = 0; i2 < attributes.getLength(); i2++) {
                if (attributes.item(i2).getNodeName().equals(MessageCorrectExtension.ID_TAG)) {
                    str5 = attributes.item(i2).getTextContent();
                } else if (attributes.item(i2).getNodeName().equals(IjkMediaMeta.IJKM_KEY_TYPE)) {
                    str4 = attributes.item(i2).getTextContent();
                } else if (attributes.item(i2).getNodeName().equals(PrivacyItem.SUBSCRIPTION_FROM)) {
                    c2531b = attributes.item(i2).getTextContent().split("@")[0];
                } else if (attributes.item(i2).getNodeName().equals(PrivacyItem.SUBSCRIPTION_TO)) {
                    str6 = attributes.item(i2).getTextContent().split("@")[0];
                }
            }
            C2531b c2531b2 = null;
            int i3 = 0;
            while (i3 < elementsByTagName.getLength()) {
                NodeList childNodes = elementsByTagName.item(i3).getChildNodes();
                String str7 = c2531b2;
                int i4 = 0;
                while (i4 < childNodes.getLength()) {
                    NamedNodeMap attributes2 = childNodes.item(i4).getAttributes();
                    if (attributes2.getLength() > 0) {
                        hashMap.put(attributes2.item(0).getTextContent(), childNodes.item(i4).getTextContent());
                    } else if (attributes2.getLength() == 0 && Message.BODY.equals(childNodes.item(i4).getNodeName())) {
                        str7 = childNodes.item(i4).getTextContent();
                    }
                    i4++;
                }
                i3++;
                Object obj = str7;
            }
            C2655q c2655q = new C2655q(c2531b, str6, c2531b2, str4, str5, hashMap);
            if (conversationListMessageState != null) {
                switch (conversationListMessageState) {
                    case SEEN:
                        c2971k = C2971k.SEEN;
                        break;
                    case SENT:
                        c2971k = C2971k.PENDING;
                        break;
                    default:
                        break;
                }
            }
            c2971k = null;
            if (c2971k == null) {
                c2971k = (c2655q.f8572e == null || !c2655q.f8572e.equals(C2535a.m6888a().m6928d())) ? i == 0 ? C2971k.READ : C2971k.NOT_READ : C2971k.PENDING;
            }
            C2971k c2971k2 = c2971k;
            String str8 = (String) c2655q.f8570c.get("MINOR_TYPE");
            if (((String) c2655q.f8570c.get("MAJOR_TYPE")).equals("CONTROL_MESSAGE") && (str8.equals("GROUP_JOIN") || str8.equals("GROUP_INVITATION") || str8.equals("GROUP_CHANGE_ROLE") || str8.equals("GROUP_JOIN_BY_LINK") || str8.equals("GROUP_LEAVE") || str8.equals("GROUP_CHANGE_METADATA"))) {
                long parseLong = Long.parseLong((String) c2655q.f8570c.get("SEND_TIME_IN_GMT"));
                C2808d.m7148b(new C6733b(c2655q.f8571d, c2655q.f8572e, c2655q.f8570c, c2655q.f8569b, c2655q.f8568a, false, true));
                C2980g.m7424a(c2655q.f8571d, c2655q.f8569b, Long.valueOf(parseLong));
                return null;
            }
            try {
                return C2668c.m7060a(c2655q.f8572e, str, c2655q.f8568a, c2655q.f8569b, c2655q.f8570c, c2971k2, false, C2970j.IN);
            } catch (Throwable e) {
                C2480b.m6737b("Problem in preparing message model", e);
            }
        } catch (Throwable e2) {
            C2480b.m6737b("Problem in parsing message XML", e2);
            return null;
        }
    }

    public static void m7065a() {
        C2808d.m7148b(C2535a.m6888a().aq() == 0 ? new C6734b() : new C6735c());
    }

    public static void m7066a(List<ConversationResponse> list) {
        C2531b c2531b;
        Throwable th;
        StringBuilder stringBuilder;
        StringBuilder stringBuilder2;
        String stringBuilder3;
        C1063i c6700i;
        C2532d c2532d;
        String str;
        int unreadCount;
        boolean z;
        boolean z2;
        String lastMessageId;
        long parseLong;
        String a;
        C6022i c6022i;
        C6024k c6024k;
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (ConversationResponse conversationResponse : list) {
            C2531b a2;
            C2976c a3 = C2980g.m7433a(conversationResponse.getConversationId());
            if (conversationResponse.getUnreadCount() == 0) {
                C2966b.m7415f(conversationResponse.getConversationId());
            }
            try {
                a2 = C2694a.m7064a(conversationResponse.getConversationId(), conversationResponse.getLastMessage(), conversationResponse.getUnreadCount(), ConversationListMessageState.getConversationListMessageState(conversationResponse.getLastMessageState()));
                if (a2 != null) {
                    try {
                        hashMap.put(a2.f8227a, a2);
                    } catch (Throwable e) {
                        c2531b = a2;
                        th = e;
                        C2480b.m6737b("Can't add message to db", th);
                        a2 = c2531b;
                        stringBuilder = new StringBuilder("CONVERSATION LIST : ");
                        stringBuilder.append(conversationResponse.getConversationId());
                        stringBuilder.append(" - ");
                        stringBuilder.append(conversationResponse.getUnreadCount());
                        stringBuilder.append(" - ");
                        if (a3 != null) {
                            stringBuilder2 = new StringBuilder("UNKNOWN - ");
                            stringBuilder2.append(conversationResponse.getLastMessage());
                            stringBuilder3 = stringBuilder2.toString();
                        } else {
                            stringBuilder3 = a3.f9282b;
                        }
                        stringBuilder.append(stringBuilder3);
                        C2480b.m6742f(stringBuilder.toString());
                        if (a3 != null) {
                            switch (conversationResponse.getConversationType()) {
                                case CHANNEL:
                                    c6700i = new C6700i(conversationResponse.getConversationId());
                                    break;
                                case GROUP:
                                    c6700i = new C6770d(conversationResponse.getConversationId());
                                    break;
                                case USER:
                                    arrayList.add(conversationResponse.getConversationId());
                                    if (a2 == null) {
                                        C2980g.m7427a(conversationResponse.getConversationId(), Long.parseLong(conversationResponse.getLastUpdate()), conversationResponse.getMute() != 1, conversationResponse.getPinned() != 1, conversationResponse.getUnreadCount(), conversationResponse.getLastMessageId(), Long.valueOf(a2.f8230d));
                                        break;
                                    }
                                    continue;
                                    continue;
                                    continue;
                                default:
                                    continue;
                                    continue;
                                    continue;
                            }
                            C2808d.m7148b(c6700i);
                        } else {
                            if (conversationResponse.getDraftUpdateTime() == null) {
                            }
                            if (a3.f9303w == null) {
                                c2532d = null;
                                str = a3.f9281a;
                                unreadCount = conversationResponse.getUnreadCount();
                                z = conversationResponse.getMute() != 1;
                                z2 = conversationResponse.getPinned() != 1;
                                lastMessageId = conversationResponse.getLastMessageId();
                                parseLong = a2 != null ? Long.parseLong(conversationResponse.getLastUpdate()) : a2.f8230d;
                                a = c2532d != null ? null : c2532d.m6880a();
                                c6022i = new C6022i();
                                c6022i.m13397a(unreadCount).m13399a(Boolean.valueOf(z)).m13408b(Boolean.valueOf(z2)).m13418h(lastMessageId).m13407b(parseLong).m13421k(a);
                                c6024k = new C6024k();
                                c6024k.m13440a(str);
                                c6022i.m13395a(MyApplication.m12952b(), c6024k);
                            }
                            c2532d = a3.f9303w;
                            str = a3.f9281a;
                            unreadCount = conversationResponse.getUnreadCount();
                            if (conversationResponse.getMute() != 1) {
                            }
                            if (conversationResponse.getPinned() != 1) {
                            }
                            lastMessageId = conversationResponse.getLastMessageId();
                            if (a2 != null) {
                            }
                            if (c2532d != null) {
                            }
                            c6022i = new C6022i();
                            c6022i.m13397a(unreadCount).m13399a(Boolean.valueOf(z)).m13408b(Boolean.valueOf(z2)).m13418h(lastMessageId).m13407b(parseLong).m13421k(a);
                            c6024k = new C6024k();
                            c6024k.m13440a(str);
                            c6022i.m13395a(MyApplication.m12952b(), c6024k);
                        }
                    }
                }
            } catch (Throwable e2) {
                th = e2;
                c2531b = null;
                C2480b.m6737b("Can't add message to db", th);
                a2 = c2531b;
                stringBuilder = new StringBuilder("CONVERSATION LIST : ");
                stringBuilder.append(conversationResponse.getConversationId());
                stringBuilder.append(" - ");
                stringBuilder.append(conversationResponse.getUnreadCount());
                stringBuilder.append(" - ");
                if (a3 != null) {
                    stringBuilder3 = a3.f9282b;
                } else {
                    stringBuilder2 = new StringBuilder("UNKNOWN - ");
                    stringBuilder2.append(conversationResponse.getLastMessage());
                    stringBuilder3 = stringBuilder2.toString();
                }
                stringBuilder.append(stringBuilder3);
                C2480b.m6742f(stringBuilder.toString());
                if (a3 != null) {
                    if (conversationResponse.getDraftUpdateTime() == null) {
                    }
                    if (a3.f9303w == null) {
                        c2532d = null;
                        str = a3.f9281a;
                        unreadCount = conversationResponse.getUnreadCount();
                        if (conversationResponse.getMute() != 1) {
                        }
                        if (conversationResponse.getPinned() != 1) {
                        }
                        lastMessageId = conversationResponse.getLastMessageId();
                        if (a2 != null) {
                        }
                        if (c2532d != null) {
                        }
                        c6022i = new C6022i();
                        c6022i.m13397a(unreadCount).m13399a(Boolean.valueOf(z)).m13408b(Boolean.valueOf(z2)).m13418h(lastMessageId).m13407b(parseLong).m13421k(a);
                        c6024k = new C6024k();
                        c6024k.m13440a(str);
                        c6022i.m13395a(MyApplication.m12952b(), c6024k);
                    }
                    c2532d = a3.f9303w;
                    str = a3.f9281a;
                    unreadCount = conversationResponse.getUnreadCount();
                    if (conversationResponse.getMute() != 1) {
                    }
                    if (conversationResponse.getPinned() != 1) {
                    }
                    lastMessageId = conversationResponse.getLastMessageId();
                    if (a2 != null) {
                    }
                    if (c2532d != null) {
                    }
                    c6022i = new C6022i();
                    c6022i.m13397a(unreadCount).m13399a(Boolean.valueOf(z)).m13408b(Boolean.valueOf(z2)).m13418h(lastMessageId).m13407b(parseLong).m13421k(a);
                    c6024k = new C6024k();
                    c6024k.m13440a(str);
                    c6022i.m13395a(MyApplication.m12952b(), c6024k);
                } else {
                    switch (conversationResponse.getConversationType()) {
                        case CHANNEL:
                            c6700i = new C6700i(conversationResponse.getConversationId());
                            break;
                        case GROUP:
                            c6700i = new C6770d(conversationResponse.getConversationId());
                            break;
                        case USER:
                            arrayList.add(conversationResponse.getConversationId());
                            if (a2 == null) {
                                if (conversationResponse.getMute() != 1) {
                                }
                                if (conversationResponse.getPinned() != 1) {
                                }
                                C2980g.m7427a(conversationResponse.getConversationId(), Long.parseLong(conversationResponse.getLastUpdate()), conversationResponse.getMute() != 1, conversationResponse.getPinned() != 1, conversationResponse.getUnreadCount(), conversationResponse.getLastMessageId(), Long.valueOf(a2.f8230d));
                                break;
                            }
                            continue;
                            continue;
                            continue;
                        default:
                            continue;
                            continue;
                            continue;
                    }
                    C2808d.m7148b(c6700i);
                }
            }
            stringBuilder = new StringBuilder("CONVERSATION LIST : ");
            stringBuilder.append(conversationResponse.getConversationId());
            stringBuilder.append(" - ");
            stringBuilder.append(conversationResponse.getUnreadCount());
            stringBuilder.append(" - ");
            if (a3 != null) {
                stringBuilder3 = a3.f9282b;
            } else {
                stringBuilder2 = new StringBuilder("UNKNOWN - ");
                stringBuilder2.append(conversationResponse.getLastMessage());
                stringBuilder3 = stringBuilder2.toString();
            }
            stringBuilder.append(stringBuilder3);
            C2480b.m6742f(stringBuilder.toString());
            if (a3 != null) {
                if (conversationResponse.getDraftUpdateTime() == null && !conversationResponse.getDraftUpdateTime().isEmpty()) {
                    long parseLong2 = Long.parseLong(conversationResponse.getDraftUpdateTime());
                    long j = 0;
                    if (a3.f9303w != null) {
                        j = a3.f9303w.f8245b.longValue();
                    }
                    if (parseLong2 > j) {
                        c2532d = new C2532d(conversationResponse.getDraftMessage(), Long.valueOf(parseLong2), conversationResponse.getDraftReplyMessageId());
                        str = a3.f9281a;
                        unreadCount = conversationResponse.getUnreadCount();
                        if (conversationResponse.getMute() != 1) {
                        }
                        if (conversationResponse.getPinned() != 1) {
                        }
                        lastMessageId = conversationResponse.getLastMessageId();
                        if (a2 != null) {
                        }
                        if (c2532d != null) {
                        }
                        c6022i = new C6022i();
                        c6022i.m13397a(unreadCount).m13399a(Boolean.valueOf(z)).m13408b(Boolean.valueOf(z2)).m13418h(lastMessageId).m13407b(parseLong).m13421k(a);
                        c6024k = new C6024k();
                        c6024k.m13440a(str);
                        c6022i.m13395a(MyApplication.m12952b(), c6024k);
                    }
                } else if (a3.f9303w == null) {
                    c2532d = null;
                    str = a3.f9281a;
                    unreadCount = conversationResponse.getUnreadCount();
                    if (conversationResponse.getMute() != 1) {
                    }
                    if (conversationResponse.getPinned() != 1) {
                    }
                    lastMessageId = conversationResponse.getLastMessageId();
                    if (a2 != null) {
                    }
                    if (c2532d != null) {
                    }
                    c6022i = new C6022i();
                    c6022i.m13397a(unreadCount).m13399a(Boolean.valueOf(z)).m13408b(Boolean.valueOf(z2)).m13418h(lastMessageId).m13407b(parseLong).m13421k(a);
                    c6024k = new C6024k();
                    c6024k.m13440a(str);
                    c6022i.m13395a(MyApplication.m12952b(), c6024k);
                }
                c2532d = a3.f9303w;
                str = a3.f9281a;
                unreadCount = conversationResponse.getUnreadCount();
                if (conversationResponse.getMute() != 1) {
                }
                if (conversationResponse.getPinned() != 1) {
                }
                lastMessageId = conversationResponse.getLastMessageId();
                if (a2 != null) {
                }
                if (c2532d != null) {
                }
                c6022i = new C6022i();
                c6022i.m13397a(unreadCount).m13399a(Boolean.valueOf(z)).m13408b(Boolean.valueOf(z2)).m13418h(lastMessageId).m13407b(parseLong).m13421k(a);
                c6024k = new C6024k();
                c6024k.m13440a(str);
                c6022i.m13395a(MyApplication.m12952b(), c6024k);
            } else {
                switch (conversationResponse.getConversationType()) {
                    case CHANNEL:
                        c6700i = new C6700i(conversationResponse.getConversationId());
                        break;
                    case GROUP:
                        c6700i = new C6770d(conversationResponse.getConversationId());
                        break;
                    case USER:
                        arrayList.add(conversationResponse.getConversationId());
                        if (a2 == null) {
                            if (conversationResponse.getMute() != 1) {
                            }
                            if (conversationResponse.getPinned() != 1) {
                            }
                            C2980g.m7427a(conversationResponse.getConversationId(), Long.parseLong(conversationResponse.getLastUpdate()), conversationResponse.getMute() != 1, conversationResponse.getPinned() != 1, conversationResponse.getUnreadCount(), conversationResponse.getLastMessageId(), Long.valueOf(a2.f8230d));
                            break;
                        }
                        continue;
                        continue;
                        continue;
                    default:
                        continue;
                        continue;
                        continue;
                }
                C2808d.m7148b(c6700i);
            }
        }
        if (hashMap.size() > 0) {
            C2966b.m7403a(hashMap);
        }
        if (arrayList.size() > 0) {
            new C6643b((String[]) arrayList.toArray(new String[arrayList.size()]), false, false).onRun();
        }
        C2874b.m7229a();
    }
}
