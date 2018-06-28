package mobi.mmdt.ott.view.conversation.forward;

import android.app.Activity;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.app.C0417s.C0416a;
import android.support.v4.p029a.C0350e;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.widget.TextView;
import java.util.HashMap;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.provider.p384f.C2967c;
import mobi.mmdt.ott.provider.p385g.C2977d;
import mobi.mmdt.ott.provider.p385g.C2978e;
import mobi.mmdt.ott.provider.p385g.C2980g;
import mobi.mmdt.ott.provider.p385g.C2981h;
import mobi.mmdt.ott.provider.p385g.C7317l;
import mobi.mmdt.ott.provider.p389k.C3000b;
import mobi.mmdt.ott.provider.p390l.C3004f;
import mobi.mmdt.ott.view.components.p401c.C3126i;
import mobi.mmdt.ott.view.components.p402d.C7576b;
import mobi.mmdt.ott.view.main.p451a.C4143a;
import mobi.mmdt.ott.view.main.p454c.p455a.C7210a;
import mobi.mmdt.ott.view.main.p454c.p455a.p457b.C7365a;
import mobi.mmdt.ott.view.tools.C4522p;

public final class C6217b extends C4143a implements C0416a<Cursor>, C3126i, C4054e {
    C7210a f16815a;
    private boolean f16816b;
    private String f16817e;
    private String f16818f;
    private RecyclerView f16819g;
    private C4053d f16820h;
    private TextView f16821i;
    private int f16822j;
    private String f16823k = "";

    public C6217b(Activity activity, C4053d c4053d, boolean z) {
        super(activity);
        this.f16816b = z;
        this.f16820h = c4053d;
        int i = 0;
        this.d = LayoutInflater.from(activity).inflate(R.layout.fragment_forward_conversations_list, null, false);
        this.f16817e = C2535a.m6888a().m6928d();
        this.f16818f = C2535a.m6888a().m6919b();
        this.f16818f = C2535a.m6888a().m6919b();
        this.f16815a = new C7210a(this.f11833c, this, this, m14332d(), this.f16816b);
        Bundle bundle = new Bundle();
        bundle.putString("searchPattern", "");
        ((C7576b) this.f11833c).m19190e().mo268a(12, bundle, this);
        this.f16819g = (RecyclerView) this.d.findViewById(R.id.recycler_view);
        this.f16821i = (TextView) this.d.findViewById(R.id.divider_textView);
        m14331b();
        this.f16819g.setHasFixedSize(true);
        this.f16819g.setAdapter(this.f16815a);
        RecyclerView recyclerView = this.f16819g;
        if (recyclerView.getLayoutManager() != null) {
            i = ((LinearLayoutManager) recyclerView.getLayoutManager()).findFirstCompletelyVisibleItemPosition();
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(this.f11833c));
        recyclerView.scrollToPosition(i);
    }

    private void m14331b() {
        TextView textView;
        String a;
        Object[] objArr;
        if (this.f16818f.equals("fa")) {
            textView = this.f16821i;
            a = C4522p.m8236a(R.string.forward_divider_selection);
            objArr = new Object[]{C2491i.m6809b(this.f16822j), C4522p.m8236a(R.string.conversation_selected)};
        } else {
            textView = this.f16821i;
            a = C4522p.m8236a(R.string.forward_divider_selection);
            objArr = new Object[]{Integer.valueOf(this.f16822j), C4522p.m8236a(R.string.conversation_selected)};
        }
        textView.setText(String.format(a, objArr));
    }

    private HashMap<String, Integer> m14332d() {
        return ((ForwardActivity) this.f11833c).f24334m;
    }

    public final C0350e<Cursor> mo2226a(int i, Bundle bundle) {
        String string = bundle.getString("searchPattern");
        StringBuilder stringBuilder = new StringBuilder("SELECT dialogs._id as _id,dialog_party,dialog_title,dialog_avatar_thumbnail_url,dialog_avatar_url,dialog_description,dialog_is_mute,dialog_is_pinned,dialog_my_role,dialog_creation_date,dialog_is_reply_allowed,dialog_show_all_messages,dialog_unread_messages_count,dialog_last_message_id,dialog_updated_at,dialog_link,dialog_state,dialog_last_position,dialog_extra,channel_owner,dialog_members_count,dialog_type,channel_type,dialog_keyboard,dialog_draft_data,");
        stringBuilder.append(C2980g.m7441c("DIALOGS_MEMBERS"));
        stringBuilder.append(",conversations_message_id,conversations_event_type,conversations_event,conversations_send_time,conversations_receive_time,conversations_likes,conversations_my_like,conversations_visits,conversations_my_visit,conversations_my_vote,conversations_is_need_notify,conversations_reply_message_id,conversations_link_preview,conversations_direction_type,conversations_event_state,conversations_party,conversations_peer_user_id,conversations_group_type,conversations_file_id,conversations_sticker_id,conversations_forward_user_id,conversations_forward_group_type,conversations_forward_name,conversations_forward_message_id,conversations_edit_time,conversations_extra,");
        stringBuilder.append(C2980g.m7441c("CONVERSATIONS_MEMBERS"));
        stringBuilder.append(" FROM dialogs LEFT JOIN members DIALOGS_MEMBERS ON dialog_party = DIALOGS_MEMBERS_members_user_id LEFT JOIN conversations ON dialog_last_message_id = conversations_message_id LEFT JOIN members CONVERSATIONS_MEMBERS ON conversations_peer_user_id =CONVERSATIONS_MEMBERS_members_user_id WHERE (((dialog_type = '");
        stringBuilder.append(C2978e.CHANNEL.ordinal());
        stringBuilder.append("' OR dialog_type = '");
        stringBuilder.append(C2978e.BOT.ordinal());
        stringBuilder.append("' OR dialog_type = '");
        stringBuilder.append(C2978e.GROUP.ordinal());
        stringBuilder.append("') AND dialog_my_role <> '");
        stringBuilder.append(C3004f.NONE.ordinal());
        stringBuilder.append("') OR dialog_type <> '");
        stringBuilder.append(C2978e.CHANNEL.ordinal());
        stringBuilder.append("') AND dialog_state <> ");
        stringBuilder.append(C2977d.f9309d - 1);
        stringBuilder.append(" AND ((dialog_type = '");
        stringBuilder.append(C2978e.GROUP.ordinal());
        stringBuilder.append("'  AND dialog_my_role <> ");
        stringBuilder.append(C3004f.NONE.ordinal());
        stringBuilder.append(" AND dialog_title LIKE '%");
        stringBuilder.append(string);
        stringBuilder.append("%' )  OR (dialog_type = '");
        stringBuilder.append(C2978e.CHANNEL.ordinal());
        stringBuilder.append("'  AND (dialog_my_role = '");
        stringBuilder.append(C3004f.ADMIN.ordinal());
        stringBuilder.append("' OR dialog_my_role = '");
        stringBuilder.append(C3004f.OWNER.ordinal());
        stringBuilder.append(" ') AND dialog_title LIKE '%");
        stringBuilder.append(string);
        stringBuilder.append("%' )  )  GROUP BY dialogs.dialog_party ORDER BY dialog_is_pinned DESC , dialog_updated_at DESC ");
        string = stringBuilder.toString();
        return new C7317l(C2967c.f9203a, string, C2967c.f9203a, C3000b.f9413a, C2981h.f9316a);
    }

    public final void mo2227a() {
        if (this.f16815a != null) {
            this.f16815a.m13684c(null);
        }
    }

    public final void mo2374a(int i) {
        HashMap d;
        Object obj;
        C2978e c2978e;
        C7365a c7365a = (C7365a) this.f16815a.m17259a(i);
        switch (c7365a.f19503j) {
            case 1:
                c7365a.f21396w = true;
                d = m14332d();
                obj = c7365a.f20832z;
                c2978e = C2978e.SINGLE;
                break;
            case 2:
                c7365a.f21396w = true;
                d = m14332d();
                obj = c7365a.f20832z;
                c2978e = C2978e.GROUP;
                break;
            case 3:
                m14332d().put(c7365a.f20832z, Integer.valueOf(C2978e.CHANNEL.ordinal()));
                c7365a.f21396w = true;
                break;
            default:
                break;
        }
        d.put(obj, Integer.valueOf(c2978e.ordinal()));
        ((ForwardActivity) this.f11833c).m21260i();
        this.f16822j++;
        m14331b();
        if (!this.f16823k.isEmpty()) {
            ((ForwardActivity) this.f11833c).m21259h();
        }
        ((ForwardActivity) this.f11833c).mo3643g();
    }

    public final /* synthetic */ void mo2228a(C0350e c0350e, Object obj) {
        Cursor cursor = (Cursor) obj;
        if (this.f16815a != null) {
            this.f16815a.m19095a(this.f16823k);
            this.f16815a.m13684c(cursor);
        }
    }

    public final void mo2375a(String str) {
        this.f16823k = str;
        Bundle bundle = new Bundle();
        bundle.putString("searchPattern", str);
        ((C7576b) this.f11833c).m19190e().mo270b(12, bundle, this);
    }

    public final void mo2376b(int i) {
        C7365a c7365a = (C7365a) this.f16815a.m17259a(i);
        if (m14332d().containsKey(c7365a.f20832z)) {
            m14332d().remove(c7365a.f20832z);
            switch (c7365a.f19503j) {
                case 1:
                case 2:
                case 3:
                    c7365a.f21396w = false;
                    break;
                default:
                    break;
            }
            ((ForwardActivity) this.f11833c).m21260i();
            this.f16822j--;
            m14331b();
            if (!this.f16823k.isEmpty()) {
                ((ForwardActivity) this.f11833c).m21259h();
            }
        }
        ((ForwardActivity) this.f11833c).mo3643g();
    }

    public final void mo2234c(int i) {
    }

    public final void mo2235d(int i) {
    }

    public final void mo2377e(int r7) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:9:0x002b in {2, 4, 5, 7, 8} preds:[]
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:129)
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:48)
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:38)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r6 = this;
        r0 = r6.f16815a;
        r7 = r0.m17259a(r7);
        r7 = (mobi.mmdt.ott.view.main.p454c.p455a.p457b.C7365a) r7;
        r1 = r7.f20832z;
        r7 = r7.f19503j;
        switch(r7) {
            case 1: goto L_0x0026;
            case 2: goto L_0x001b;
            case 3: goto L_0x0010;
            default: goto L_0x000f;
        };
    L_0x000f:
        return;
    L_0x0010:
        r0 = r6.f16820h;
        r2 = mobi.mmdt.ott.provider.p385g.C2978e.CHANNEL;
        r3 = 0;
        r4 = 0;
        r5 = 0;
        r0.mo3667a(r1, r2, r3, r4, r5);
        return;
    L_0x001b:
        r0 = r6.f16820h;
        r2 = mobi.mmdt.ott.provider.p385g.C2978e.GROUP;
    L_0x001f:
        r3 = 0;
        r4 = 0;
        r5 = 0;
        r0.mo3667a(r1, r2, r3, r4, r5);
        return;
    L_0x0026:
        r0 = r6.f16820h;
        r2 = mobi.mmdt.ott.provider.p385g.C2978e.SINGLE;
        goto L_0x001f;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.conversation.forward.b.e(int):void");
    }
}
