package mobi.mmdt.ott.view.main.callslist;

import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.app.C0401p;
import android.support.v4.app.C0417s.C0416a;
import android.support.v4.app.Fragment;
import android.support.v4.p029a.C0350e;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import mobi.mmdt.componentsutils.p232b.C2489g;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.provider.p384f.C2967c;
import mobi.mmdt.ott.provider.p384f.C2972l;
import mobi.mmdt.ott.provider.p384f.C7316h;
import mobi.mmdt.ott.provider.p389k.C3000b;
import mobi.mmdt.ott.view.components.p398a.C7175a;
import mobi.mmdt.ott.view.components.p401c.C3126i;
import mobi.mmdt.ott.view.components.p401c.C6073e;
import mobi.mmdt.ott.view.components.p401c.C6827b;
import mobi.mmdt.ott.view.components.p402d.C7576b;
import mobi.mmdt.ott.view.components.p405e.C3150a;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;
import mobi.mmdt.ott.view.main.callslist.newdesign.callhistory.CallHistoryProfileActivity;
import mobi.mmdt.ott.view.tools.C4508f;

public final class C6233a extends C3150a implements C0416a<Cursor>, C3126i {
    private RecyclerView f16863a;
    private C7211a f16864b;
    private LinearLayoutManager f16865c;
    private String f16866e;
    private String f16867f;
    private View f16868g;
    private LinearLayout f16869h;
    private FrameLayout f16870i;
    private TextView f16871j;
    private long f16872k;

    public class C7211a extends C6827b {
        final /* synthetic */ C6233a f20829a;

        public C7211a(C6233a c6233a, Context context) {
            this.f20829a = c6233a;
            super(context);
        }

        private String m19096a(Cursor cursor, int i, int i2) {
            long j = ((Cursor) m13685c(i)).getLong(cursor.getColumnIndex("conversations_send_time"));
            m13685c(i2);
            return C2491i.m6771a(MyApplication.m12952b(), j);
        }

        public final C6073e mo3449a(ViewGroup viewGroup, int i) {
            return new mobi.mmdt.ott.view.main.callslist.p458a.C7211a(this.f20829a.getActivity(), this.f20829a, this.f19501b, viewGroup);
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        protected final mobi.mmdt.ott.view.components.p401c.C6829g mo3450a(android.database.Cursor r20, int r21) {
            /*
            r19 = this;
            r0 = r19;
            r1 = r20;
            r2 = r21;
            r3 = "_id";
            r3 = r1.getColumnIndex(r3);
            r5 = r1.getInt(r3);
            r3 = "conversations_party";
            r3 = r1.getColumnIndex(r3);
            r3 = r1.getString(r3);
            r4 = "conversations_peer_user_id";
            r4 = r1.getColumnIndex(r4);
            r7 = r1.getString(r4);
            r4 = "conversations_direction_type";
            r4 = r1.getColumnIndex(r4);
            r4 = r1.getInt(r4);
            r6 = "conversations_event_type";
            r6 = r1.getColumnIndex(r6);
            r6 = r1.getInt(r6);
            r8 = "conversations_event";
            r8 = r1.getColumnIndex(r8);
            r8 = r1.getString(r8);
            r9 = "conversations_send_time";
            r9 = r1.getColumnIndex(r9);
            r9 = r1.getLong(r9);
            r11 = ",";
            r11 = r8.split(r11);
            r12 = "";
            r13 = 2;
            r14 = 0;
            r15 = r11.length;
            if (r15 != r13) goto L_0x0082;
        L_0x0059:
            r15 = r11[r14];
            r15 = r15.trim();
            r15 = r15.charAt(r14);
            r15 = java.lang.Character.isDigit(r15);
            if (r15 == 0) goto L_0x006e;
        L_0x0069:
            r11 = r11[r14];
        L_0x006b:
            r16 = r11;
            goto L_0x0084;
        L_0x006e:
            r15 = 1;
            r13 = r11[r15];
            r13 = r13.trim();
            r13 = r13.charAt(r14);
            r13 = java.lang.Character.isDigit(r13);
            if (r13 == 0) goto L_0x0082;
        L_0x007f:
            r11 = r11[r15];
            goto L_0x006b;
        L_0x0082:
            r16 = r12;
        L_0x0084:
            r11 = mobi.mmdt.ott.provider.p384f.C2972l.MISSED_CALL;
            r11 = r11.ordinal();
            if (r6 != r11) goto L_0x0095;
        L_0x008c:
            r8 = 2131690157; // 0x7f0f02ad float:1.900935E38 double:1.053194874E-314;
        L_0x008f:
            r8 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r8);
        L_0x0093:
            r11 = r8;
            goto L_0x00ad;
        L_0x0095:
            r11 = mobi.mmdt.ott.provider.p384f.C2972l.CALL;
            r11 = r11.ordinal();
            if (r6 != r11) goto L_0x0093;
        L_0x009d:
            r8 = mobi.mmdt.ott.provider.p384f.C2970j.IN;
            r8 = r8.ordinal();
            if (r4 != r8) goto L_0x00a9;
        L_0x00a5:
            r8 = 2131690047; // 0x7f0f023f float:1.9009127E38 double:1.05319482E-314;
            goto L_0x008f;
        L_0x00a9:
            r8 = 2131690224; // 0x7f0f02f0 float:1.9009486E38 double:1.0531949073E-314;
            goto L_0x008f;
        L_0x00ad:
            r8 = mobi.mmdt.ott.MyApplication.m12952b();
            r12 = r0.f20829a;
            r12 = r12.f16867f;
            r15 = mobi.mmdt.componentsutils.p232b.C2491i.m6773a(r8, r9, r12);
            r8 = mobi.mmdt.ott.MyApplication.m12952b();
            r8 = mobi.mmdt.componentsutils.p232b.C2491i.m6771a(r8, r9);
            r12 = r20.getCount();
            r13 = 1;
            r12 = r12 - r13;
            r17 = 3;
            if (r2 != 0) goto L_0x00de;
        L_0x00cd:
            if (r2 == r12) goto L_0x0113;
        L_0x00cf:
            r12 = r2 + 1;
            r2 = r0.m19096a(r1, r12, r2);
            r2 = r8.equals(r2);
            if (r2 == 0) goto L_0x0113;
        L_0x00db:
            r17 = r13;
            goto L_0x0113;
        L_0x00de:
            if (r2 != r12) goto L_0x00ef;
        L_0x00e0:
            r12 = r2 + -1;
            r2 = r0.m19096a(r1, r12, r2);
            r2 = r8.equals(r2);
            if (r2 == 0) goto L_0x0113;
        L_0x00ec:
            r17 = 2;
            goto L_0x0113;
        L_0x00ef:
            r12 = r2 + -1;
            r12 = r0.m19096a(r1, r12, r2);
            r13 = r2 + 1;
            r2 = r0.m19096a(r1, r13, r2);
            r12 = r8.equals(r12);
            if (r12 == 0) goto L_0x010b;
        L_0x0101:
            r2 = r8.equals(r2);
            if (r2 == 0) goto L_0x00ec;
        L_0x0107:
            r2 = 4;
            r17 = r2;
            goto L_0x0113;
        L_0x010b:
            r2 = r8.equals(r2);
            if (r2 == 0) goto L_0x0113;
        L_0x0111:
            r17 = 1;
        L_0x0113:
            r2 = "members_is_local_user";
            r2 = r1.getColumnIndex(r2);
            r2 = r1.getInt(r2);
            if (r2 == 0) goto L_0x0120;
        L_0x011f:
            r14 = 1;
        L_0x0120:
            if (r14 == 0) goto L_0x013b;
        L_0x0122:
            r2 = "members_local_name";
            r2 = r1.getColumnIndex(r2);
            r2 = r1.getString(r2);
            r8 = "members_local_phone_number";
            r8 = r1.getColumnIndex(r8);
            r8 = r1.getString(r8);
            r2 = mobi.mmdt.ott.view.tools.C4508f.m8221a(r2, r8);
            goto L_0x0149;
        L_0x013b:
            r2 = "members_nick_name";
            r2 = r1.getColumnIndex(r2);
            r2 = r1.getString(r2);
            r2 = mobi.mmdt.ott.view.tools.C4508f.m8220a(r2);
        L_0x0149:
            r8 = r0.f;
            r8 = mobi.mmdt.componentsutils.p232b.C2491i.m6806b(r8, r3);
            r3 = new mobi.mmdt.ott.view.main.callslist.b.b;
            r12 = mobi.mmdt.ott.provider.p384f.C2970j.values();
            r12 = r12[r4];
            r4 = mobi.mmdt.ott.provider.p384f.C2972l.values();
            r13 = r4[r6];
            r4 = r0.f;
            r14 = mobi.mmdt.componentsutils.p232b.C2491i.m6812b(r4, r9);
            r1 = r20.getPosition();
            r4 = r3;
            r6 = r2;
            r9 = r12;
            r10 = r13;
            r12 = r14;
            r13 = r1;
            r14 = r17;
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16);
            return r3;
            */
            throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.main.callslist.a.a.a(android.database.Cursor, int):mobi.mmdt.ott.view.components.c.g");
        }

        public final int getItemViewType(int i) {
            return super.getItemViewType(i);
        }

        public final /* synthetic */ ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return mo3449a(viewGroup, i);
        }
    }

    public final C0350e<Cursor> mo2226a(int i, Bundle bundle) {
        if (this.f16872k == -1) {
            String str = this.f16866e;
            StringBuilder stringBuilder = new StringBuilder("SELECT conversations._id as _id,conversations_message_id,conversations_event_type,conversations_event,conversations_send_time,conversations_receive_time,conversations_likes,conversations_my_like,conversations_visits,conversations_my_visit,conversations_my_vote,conversations_is_need_notify,conversations_reply_message_id,conversations_link_preview,conversations_direction_type,conversations_event_state,conversations_party,conversations_peer_user_id,conversations_group_type,conversations_file_id,conversations_sticker_id,conversations_forward_user_id,conversations_forward_group_type,conversations_forward_name,conversations_forward_message_id,conversations_edit_time,conversations_extra,members_nick_name,members_avatar_url,members_avatar_thumbnail_url,members_user_id,members_is_local_user,members_last_online,members_last_position,members_can_reply,members_is_anouncer,members_local_name,members_local_phone_number,members_moto,members_is_pined,members_is_mute,members_local_image_uri FROM ( conversations LEFT JOIN members ON conversations_party = members_user_id) WHERE (conversations.conversations_event_type = '");
            stringBuilder.append(C2972l.CALL.ordinal());
            stringBuilder.append("' OR conversations.conversations_event_type = '");
            stringBuilder.append(C2972l.MISSED_CALL.ordinal());
            stringBuilder.append("' ) AND conversations_party = '");
            stringBuilder.append(str);
            stringBuilder.append("' ORDER BY conversations.conversations_send_time DESC");
            str = stringBuilder.toString();
            return new C7316h(C2967c.f9203a, str, C2967c.f9203a, C3000b.f9413a);
        }
        str = this.f16866e;
        long j = this.f16872k;
        StringBuilder stringBuilder2 = new StringBuilder("SELECT conversations._id as _id,conversations_message_id,conversations_event_type,conversations_event,conversations_send_time,conversations_receive_time,conversations_likes,conversations_my_like,conversations_visits,conversations_my_visit,conversations_my_vote,conversations_is_need_notify,conversations_reply_message_id,conversations_link_preview,conversations_direction_type,conversations_event_state,conversations_party,conversations_peer_user_id,conversations_group_type,conversations_file_id,conversations_sticker_id,conversations_forward_user_id,conversations_forward_group_type,conversations_forward_name,conversations_forward_message_id,conversations_edit_time,conversations_extra,members_nick_name,members_avatar_url,members_avatar_thumbnail_url,members_user_id,members_is_local_user,members_last_online,members_last_position,members_can_reply,members_is_anouncer,members_local_name,members_local_phone_number,members_moto,members_is_pined,members_is_mute,members_local_image_uri FROM ( conversations LEFT JOIN members ON conversations_party = members_user_id) WHERE (conversations.conversations_event_type = '");
        stringBuilder2.append(C2972l.CALL.ordinal());
        stringBuilder2.append("' OR conversations.conversations_event_type = '");
        stringBuilder2.append(C2972l.MISSED_CALL.ordinal());
        stringBuilder2.append("' ) AND conversations_party = '");
        stringBuilder2.append(str);
        stringBuilder2.append("' AND  strftime('%d-%m-%Y', conversations_send_time / 1000, 'unixepoch') =  strftime('%d-%m-%Y', ");
        stringBuilder2.append(j);
        stringBuilder2.append(" / 1000, 'unixepoch') ORDER BY conversations.conversations_send_time DESC");
        str = stringBuilder2.toString();
        return new C7316h(C2967c.f9203a, str, C2967c.f9203a, C3000b.f9413a);
    }

    public final void mo2227a() {
        if (this.f16864b != null) {
            this.f16864b.m13684c(null);
        }
    }

    public final /* synthetic */ void mo2228a(C0350e c0350e, Object obj) {
        Cursor cursor = (Cursor) obj;
        if (this.f16864b != null) {
            this.f16864b.m13684c(cursor);
            if (this.f16864b.m13682b() > 0) {
                this.f16869h.setVisibility(8);
                return;
            } else {
                this.f16869h.setVisibility(0);
                return;
            }
        }
        this.f16869h.setVisibility(0);
    }

    public final void mo2234c(int i) {
        mo2235d(i);
    }

    public final void mo2235d(int i) {
        String string;
        String string2;
        Cursor a = this.f16864b.mo2237a();
        a.moveToFirst();
        a.move(i);
        if ((a.getInt(a.getColumnIndex("members_is_local_user")) != 0 ? 1 : null) != null) {
            string = a.getString(a.getColumnIndex("members_local_name"));
            string2 = a.getString(a.getColumnIndex("conversations_message_id"));
            string = C4508f.m8221a(string, a.getString(a.getColumnIndex("members_local_phone_number")));
        } else {
            string = a.getString(a.getColumnIndex("members_nick_name"));
            string2 = a.getString(a.getColumnIndex("conversations_message_id"));
            a.getString(a.getColumnIndex("members_user_id"));
            string = C4508f.m8220a(string);
        }
        Bundle bundle = new Bundle();
        bundle.putInt("dialog_id", 417);
        bundle.putString("KEY_DIALOG_USER_NAME", string2);
        bundle.putString("KEY_DIALOG_NAME", string);
        Fragment k = C7175a.m18964k(bundle);
        C0401p a2 = ((CallHistoryProfileActivity) getActivity()).m19188c().mo254a();
        a2.mo237a(k, "tag");
        a2.mo244d();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            if (getArguments().containsKey("KEY_USER_ID")) {
                this.f16866e = getArguments().getString("KEY_USER_ID");
            }
            if (getArguments().containsKey("KEY_DATE")) {
                this.f16872k = getArguments().getLong("KEY_DATE");
            }
        }
        this.f16867f = C2535a.m6888a().m6919b();
        this.f16864b = new C7211a(this, getActivity());
        ((C7576b) getActivity()).m19190e().mo268a(32, null, this);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f16868g = layoutInflater.inflate(R.layout.fragment_call_info_list, viewGroup, false);
        return this.f16868g;
    }

    public final void onDestroyView() {
        if (this.f16863a != null) {
            this.f16863a.setItemAnimator(null);
            this.f16863a.setAdapter(null);
            this.f16863a = null;
        }
        this.f16864b = null;
        super.onDestroyView();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f16863a = (RecyclerView) this.f16868g.findViewById(R.id.recycler_view);
        this.f16869h = (LinearLayout) this.f16868g.findViewById(R.id.empty_state_linearLayout);
        this.f16870i = (FrameLayout) this.f16868g.findViewById(R.id.empty_state_frameLayout_image);
        this.f16871j = (TextView) this.f16868g.findViewById(R.id.empty_state_textView);
        this.f16863a.setHasFixedSize(false);
        this.f16863a.setNestedScrollingEnabled(false);
        this.f16863a.setAdapter(this.f16864b);
        this.f16865c = new LinearLayoutManager(getActivity());
        this.f16863a.setLayoutManager(this.f16865c);
        int a = getActivity().getResources().getConfiguration().orientation == 1 ? (C2489g.m6754a().m6755a(BallPulseIndicator.SCALE) * 40) / 100 : (C2489g.m6754a().m6756b(BallPulseIndicator.SCALE) * 30) / 100;
        this.f16870i.setLayoutParams(new LayoutParams(a, a));
        C2491i.m6802a(this.f16871j, UIThemeManager.getmInstance().getText_primary_color());
    }
}
