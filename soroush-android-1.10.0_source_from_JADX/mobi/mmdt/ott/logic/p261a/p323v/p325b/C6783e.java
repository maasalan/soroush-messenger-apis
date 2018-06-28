package mobi.mmdt.ott.logic.p261a.p323v.p325b;

import android.database.Cursor;
import android.graphics.Bitmap;
import com.p072b.p073a.p074a.C1073q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.lib_webservicescomponent.p257d.C2556b;
import mobi.mmdt.ott.logic.notifications.C2873a;
import mobi.mmdt.ott.logic.notifications.C2874b;
import mobi.mmdt.ott.logic.notifications.C2875c;
import mobi.mmdt.ott.logic.notifications.notifsData.C2876b;
import mobi.mmdt.ott.logic.notifications.notifsData.C2877e;
import mobi.mmdt.ott.logic.notifications.notifsData.C6000a;
import mobi.mmdt.ott.logic.notifications.notifsData.C6001c;
import mobi.mmdt.ott.logic.notifications.notifsData.C6002d;
import mobi.mmdt.ott.logic.notifications.notifsData.C6003f;
import mobi.mmdt.ott.logic.notifications.notifsData.UpdateNotificationService;
import mobi.mmdt.ott.logic.p261a.C2683h;
import mobi.mmdt.ott.logic.p261a.C5891a;
import mobi.mmdt.ott.logic.p261a.p323v.C2753b;
import mobi.mmdt.ott.logic.p261a.p323v.p324a.C2747a;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.provider.p384f.C2971k;
import mobi.mmdt.ott.provider.p384f.C6021g;
import mobi.mmdt.ott.provider.p385g.C2976c;
import mobi.mmdt.ott.provider.p385g.C2978e;
import mobi.mmdt.ott.provider.p385g.C2980g;
import mobi.mmdt.ott.provider.p385g.C6023j;
import mobi.mmdt.ott.provider.p385g.C6024k;
import mobi.mmdt.ott.view.tools.C4522p;
import p000a.p001a.p002a.C0005c;

public final class C6783e extends C5891a {
    private int f19366a;
    private boolean f19367b;
    private boolean f19368c;
    private int f19369d;

    public C6783e(boolean z, boolean z2) {
        super(C2683h.f8620b);
        this.f19367b = z;
        this.f19368c = z2;
        StringBuilder stringBuilder = new StringBuilder("UpdateNotificationJob isNeedNotify: ");
        stringBuilder.append(z);
        stringBuilder.append(" - triggerNotification: ");
        stringBuilder.append(z2);
        C2480b.m6742f(stringBuilder.toString());
    }

    private static ArrayList<String> m17217a(ArrayList<C2877e> arrayList, boolean z) {
        ArrayList<String> arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object stringBuilder;
            C2877e c2877e = (C2877e) it.next();
            if (z) {
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append(c2877e.f8978a);
                stringBuilder2.append(" : ");
                stringBuilder2.append(c2877e.f8979b);
                stringBuilder = stringBuilder2.toString();
            } else {
                stringBuilder = c2877e.f8979b;
            }
            arrayList2.add(stringBuilder);
        }
        return arrayList2;
    }

    private void m17218a(ArrayList<String> arrayList, String str, String str2, String str3) {
        if (this.f19368c && arrayList.size() > 0) {
            int size = arrayList.size();
            C2976c a = C2980g.m7433a(str3);
            if (a != null) {
                size = a.f9294n;
            }
            int i = size;
            boolean z = this.f19367b;
            if (!C2535a.m6888a().m6903O()) {
                Bitmap a2;
                Bitmap bitmap;
                String str4;
                String str5;
                int i2;
                StringBuilder stringBuilder;
                if (str2 != null) {
                    try {
                        if (!str2.isEmpty()) {
                            a2 = C2491i.m6761a(MyApplication.m12952b(), C2556b.m6998a(str2));
                            bitmap = a2;
                            str4 = (String) arrayList.get(0);
                            str5 = str4;
                            for (i2 = 1; i2 < Math.min(arrayList.size(), 10); i2++) {
                                stringBuilder = new StringBuilder();
                                stringBuilder.append(str5);
                                stringBuilder.append("\n");
                                stringBuilder.append((String) arrayList.get(i2));
                                str5 = stringBuilder.toString();
                            }
                            if (arrayList.size() > 1) {
                                str4 = String.format(C4522p.m8236a(R.string.new_messages), new Object[]{String.valueOf(i)});
                            }
                            C2873a.m7226a(bitmap, str, str5, str4, (String) arrayList.get(0), i, str3, z);
                        }
                    } catch (Throwable e) {
                        C2480b.m6737b("IOException happened in GenerateNotification", e);
                        a2 = C2875c.m7231a();
                    }
                }
                a2 = C2875c.m7231a();
                bitmap = a2;
                str4 = (String) arrayList.get(0);
                str5 = str4;
                for (i2 = 1; i2 < Math.min(arrayList.size(), 10); i2++) {
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(str5);
                    stringBuilder.append("\n");
                    stringBuilder.append((String) arrayList.get(i2));
                    str5 = stringBuilder.toString();
                }
                if (arrayList.size() > 1) {
                    str4 = String.format(C4522p.m8236a(R.string.new_messages), new Object[]{String.valueOf(i)});
                }
                C2873a.m7226a(bitmap, str, str5, str4, (String) arrayList.get(0), i, str3, z);
            }
        }
    }

    private void m17219a(C2876b c2876b) {
        int i;
        boolean z;
        int i2;
        C6000a c6000a = (C6000a) c2876b;
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        int i4 = i3;
        int i5 = i4;
        for (Entry value : c6000a.f16159a.entrySet()) {
            C2876b c2876b2 = (C2876b) value.getValue();
            Iterator it;
            C2877e c2877e;
            StringBuilder stringBuilder;
            if (c2876b2 instanceof C6003f) {
                C6003f c6003f = (C6003f) c2876b2;
                it = c6003f.f16168a.iterator();
                while (it.hasNext()) {
                    c2877e = (C2877e) it.next();
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(c2877e.f8978a);
                    stringBuilder.append(" : ");
                    stringBuilder.append(c2877e.f8979b);
                    arrayList.add(stringBuilder.toString());
                }
                i3 += !c6003f.f16171e ? c6003f.f16168a.size() : 0;
            } else if (c2876b2 instanceof C6002d) {
                C6002d c6002d = (C6002d) c2876b2;
                it = c6002d.f16164a.iterator();
                while (it.hasNext()) {
                    c2877e = (C2877e) it.next();
                    if (c2877e.f8980c) {
                        stringBuilder = new StringBuilder();
                    } else {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append(c2877e.f8978a);
                        stringBuilder.append(" @ ");
                    }
                    stringBuilder.append(c6002d.f16166d);
                    stringBuilder.append(" : ");
                    stringBuilder.append(c2877e.f8979b);
                    arrayList.add(stringBuilder.toString());
                }
                i4 += !c6002d.f16167e ? c6002d.f16164a.size() : 0;
            } else if (c2876b2 instanceof C6001c) {
                C6001c c6001c = (C6001c) c2876b2;
                it = c6001c.f16160a.iterator();
                while (it.hasNext()) {
                    c2877e = (C2877e) it.next();
                    stringBuilder = new StringBuilder();
                    stringBuilder.append(c6001c.f16162d);
                    stringBuilder.append(" : ");
                    stringBuilder.append(c2877e.f8979b);
                    arrayList.add(stringBuilder.toString());
                }
                i5 += !c6001c.f16163e ? c6001c.f16160a.size() : 0;
            }
        }
        i3 += i4;
        if (i3 > 0 && i5 > 0) {
            i = C2752d.f8707g;
        } else if (i3 > 0) {
            i = C2752d.f8704d;
        } else {
            if (i5 > 0) {
                i = C2752d.f8703c;
            }
            if (this.f19368c) {
                HashMap a = C2980g.m7431a();
                i4 = ((a.containsKey(C2978e.SINGLE) ? ((Integer) a.get(C2978e.SINGLE)).intValue() : 0) + (a.containsKey(C2978e.GROUP) ? ((Integer) a.get(C2978e.GROUP)).intValue() : 0)) + (a.containsKey(C2978e.CHANNEL) ? ((Integer) a.get(C2978e.CHANNEL)).intValue() : 0);
                i = this.f19369d;
                z = this.f19367b;
                i2 = this.f19366a;
                if (!C2535a.m6888a().m6903O()) {
                    C2873a.m7228a(arrayList, (String) arrayList.get(0), String.format(C4522p.m8236a(R.string.new_messages_from), new Object[]{String.valueOf(i4), String.valueOf(i)}), i4, z, i2);
                }
            }
        }
        this.f19366a = i;
        if (this.f19368c) {
            HashMap a2 = C2980g.m7431a();
            if (a2.containsKey(C2978e.SINGLE)) {
            }
            if (a2.containsKey(C2978e.GROUP)) {
            }
            if (a2.containsKey(C2978e.CHANNEL)) {
            }
            i4 = ((a2.containsKey(C2978e.SINGLE) ? ((Integer) a2.get(C2978e.SINGLE)).intValue() : 0) + (a2.containsKey(C2978e.GROUP) ? ((Integer) a2.get(C2978e.GROUP)).intValue() : 0)) + (a2.containsKey(C2978e.CHANNEL) ? ((Integer) a2.get(C2978e.CHANNEL)).intValue() : 0);
            i = this.f19369d;
            z = this.f19367b;
            i2 = this.f19366a;
            if (!C2535a.m6888a().m6903O()) {
                C2873a.m7228a(arrayList, (String) arrayList.get(0), String.format(C4522p.m8236a(R.string.new_messages_from), new Object[]{String.valueOf(i4), String.valueOf(i)}), i4, z, i2);
            }
        }
    }

    public final void onAdded() {
    }

    protected final void onCancel(int i, Throwable th) {
    }

    public final void onRun() {
        C2874b.m7229a();
        C6023j a = new C6024k().m13437a("SELECT dialog_party,dialog_unread_messages_count FROM dialogs WHERE dialog_is_mute = 0  AND dialog_unread_messages_count> 0  GROUP BY dialog_party");
        HashMap hashMap = new HashMap();
        if (a.moveToFirst()) {
            do {
                hashMap.put(a.getString(a.getColumnIndex("dialog_party")), Integer.valueOf(a.getInt(a.getColumnIndex("dialog_unread_messages_count"))));
            } while (a.moveToNext());
        }
        a.close();
        this.f19369d = hashMap.size();
        if (this.f19369d == 0) {
            UpdateNotificationService.m13273a();
            return;
        }
        StringBuilder stringBuilder = new StringBuilder("SELECT conversations._id as _id,conversations_message_id,conversations_event_type,conversations_event,conversations_send_time,conversations_receive_time,conversations_likes,conversations_my_like,conversations_visits,conversations_my_visit,conversations_my_vote,conversations_is_need_notify,conversations_reply_message_id,conversations_link_preview,conversations_direction_type,conversations_event_state,conversations_party,conversations_peer_user_id,conversations_group_type,conversations_file_id,conversations_sticker_id,conversations_forward_user_id,conversations_forward_group_type,conversations_forward_name,conversations_forward_message_id,conversations_edit_time,conversations_extra,members_nick_name,members_avatar_url,members_avatar_thumbnail_url,members_user_id,members_is_local_user,members_last_online,members_last_position,members_can_reply,members_is_anouncer,members_local_name,members_local_phone_number,members_moto,members_is_pined,members_is_mute,members_local_image_uri,dialog_party,dialog_title,dialog_avatar_thumbnail_url,dialog_avatar_url,dialog_description,dialog_is_mute,dialog_is_pinned,dialog_my_role,dialog_creation_date,dialog_is_reply_allowed,dialog_show_all_messages,dialog_unread_messages_count,dialog_last_message_id,dialog_updated_at,dialog_link,dialog_state,dialog_last_position,dialog_extra,channel_owner,dialog_members_count,dialog_type,channel_type FROM (( conversations LEFT JOIN members ON conversations_peer_user_id = members_user_id) LEFT JOIN dialogs ON conversations_party = dialog_party) WHERE conversations.conversations_event_state = '");
        stringBuilder.append(C2971k.NOT_READ.ordinal());
        stringBuilder.append("' AND (dialog_is_mute <> 1 ) ORDER BY dialog_updated_at DESC ");
        Cursor b = new C6021g().m13384b(stringBuilder.toString());
        if (b != null) {
            if (b.getCount() != 0) {
                C2876b a2 = C2753b.m7080a(b);
                if (a2 == null) {
                    UpdateNotificationService.m13273a();
                    return;
                }
                int i;
                ArrayList arrayList;
                if (a2 instanceof C6003f) {
                    C6003f c6003f = (C6003f) a2;
                    arrayList = new ArrayList();
                    arrayList.addAll(C6783e.m17217a(c6003f.f16168a, false));
                    m17218a(arrayList, c6003f.f16170d, c6003f.f8977b, c6003f.f16169c);
                    i = C2752d.f8701a;
                } else if (a2 instanceof C6002d) {
                    C6002d c6002d = (C6002d) a2;
                    arrayList = new ArrayList();
                    arrayList.addAll(C6783e.m17217a(c6002d.f16164a, true));
                    m17218a(arrayList, c6002d.f16166d, c6002d.f8977b, c6002d.f16165c);
                    i = C2752d.f8702b;
                } else if (a2 instanceof C6001c) {
                    C6001c c6001c = (C6001c) a2;
                    arrayList = new ArrayList();
                    arrayList.addAll(C6783e.m17217a(c6001c.f16160a, false));
                    m17218a(arrayList, c6001c.f16162d, c6001c.f8977b, c6001c.f16161c);
                    i = C2752d.f8703c;
                } else {
                    if (a2 instanceof C6000a) {
                        m17219a(a2);
                    }
                    C0005c.m0a().m9d(new C2747a());
                    return;
                }
                this.f19366a = i;
                C0005c.m0a().m9d(new C2747a());
                return;
            }
        }
        UpdateNotificationService.m13273a();
    }

    protected final C1073q shouldReRunOnThrowable(Throwable th, int i, int i2) {
        return C1073q.f3504b;
    }
}
