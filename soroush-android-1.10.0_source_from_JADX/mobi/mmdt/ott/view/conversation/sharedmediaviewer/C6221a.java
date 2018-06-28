package mobi.mmdt.ott.view.conversation.sharedmediaviewer;

import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.app.C0417s.C0416a;
import android.support.v4.p029a.C0350e;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import mobi.mmdt.componentsutils.p232b.C2489g;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.C2808d;
import mobi.mmdt.ott.logic.p261a.af.C6665d;
import mobi.mmdt.ott.logic.p261a.af.C6669k;
import mobi.mmdt.ott.logic.p261a.af.C6670l;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.provider.p384f.C2967c;
import mobi.mmdt.ott.provider.p384f.C2970j;
import mobi.mmdt.ott.provider.p384f.C2971k;
import mobi.mmdt.ott.provider.p384f.C2972l;
import mobi.mmdt.ott.provider.p384f.C7316h;
import mobi.mmdt.ott.provider.p386h.C2985d;
import mobi.mmdt.ott.provider.p386h.C2987i;
import mobi.mmdt.ott.view.components.ProgressWheel;
import mobi.mmdt.ott.view.components.mediaselector.C6105a;
import mobi.mmdt.ott.view.components.p401c.C3126i;
import mobi.mmdt.ott.view.components.p401c.C6073e;
import mobi.mmdt.ott.view.components.p401c.C6827b;
import mobi.mmdt.ott.view.components.p402d.C7576b;
import mobi.mmdt.ott.view.components.p405e.C3150a;
import mobi.mmdt.ott.view.conversation.p418a.C3284e;
import mobi.mmdt.ott.view.conversation.p573f.C7197a;
import mobi.mmdt.ott.view.conversation.sharedmediaviewer.p449a.C7203c;
import mobi.mmdt.ott.view.conversation.sharedmediaviewer.p449a.C7204d;
import mobi.mmdt.ott.view.conversation.sharedmediaviewer.p575b.C7205a;
import mobi.mmdt.ott.view.conversation.sharedmediaviewer.p575b.C7361b;
import mobi.mmdt.ott.view.conversation.sharedmediaviewer.p575b.C7362c;
import mobi.mmdt.ott.view.conversation.sharedmediaviewer.p575b.C7363d;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

public final class C6221a extends C3150a implements C3126i, C3284e {
    GridLayoutManager f16838a;
    private RecyclerView f16839b;
    private C7202b f16840c;
    private C6914a f16841e;
    private int f16842f;
    private int f16843g;
    private String f16844h;
    private ProgressWheel f16845i;
    private int f16846j = 0;
    private C0416a<Cursor> f16847k = new C62201(this);

    public interface C6914a {
        void mo3668a(String str);

        void mo3669b(String str);

        void mo3670c(int i);
    }

    class C62201 implements C0416a<Cursor> {
        final /* synthetic */ C6221a f16837a;

        C62201(C6221a c6221a) {
            this.f16837a = c6221a;
        }

        public final C0350e<Cursor> mo2226a(int i, Bundle bundle) {
            String a = this.f16837a.f16844h;
            StringBuilder stringBuilder = new StringBuilder("SELECT conversations._id as _id,conversations_message_id,conversations_event_type,conversations_event,conversations_send_time,conversations_receive_time,conversations_likes,conversations_my_like,conversations_visits,conversations_my_visit,conversations_my_vote,conversations_is_need_notify,conversations_reply_message_id,conversations_link_preview,conversations_direction_type,conversations_event_state,conversations_party,conversations_peer_user_id,conversations_group_type,conversations_file_id,conversations_sticker_id,conversations_forward_user_id,conversations_forward_group_type,conversations_forward_name,conversations_forward_message_id,conversations_edit_time,conversations_extra,files_file_uri,files_type,files_name,files_size,files_progress,files_thumbnail_uri,files_download_state,files_thumbnail_download_state,files_duration,files_audio_playing_time,files_audio_state,files_image_width,files_image_height,members_nick_name,members_avatar_url,members_avatar_thumbnail_url,members_user_id,members_is_local_user,members_last_online,members_last_position,members_can_reply,members_is_anouncer,members_local_name,members_local_phone_number,members_moto,members_is_pined,members_is_mute,members_local_image_uri FROM (( conversations LEFT JOIN files ON conversations.conversations_file_id = files._id) LEFT JOIN members ON conversations_party = members_user_id) WHERE conversations.conversations_party = '");
            stringBuilder.append(a);
            stringBuilder.append("' AND (conversations.conversations_event_type = ");
            stringBuilder.append(C2972l.IMAGE.ordinal());
            stringBuilder.append(" OR conversations.conversations_event_type = ");
            stringBuilder.append(C2972l.VIDEO.ordinal());
            stringBuilder.append(" OR conversations.conversations_event_type = ");
            stringBuilder.append(C2972l.GIF.ordinal());
            stringBuilder.append(") AND (conversations.conversations_direction_type = ");
            stringBuilder.append(C2970j.OUT.ordinal());
            stringBuilder.append(" OR files.files_download_state = ");
            stringBuilder.append(C2987i.FINISHED.ordinal());
            stringBuilder.append(") AND conversations.conversations_event_state <> ");
            stringBuilder.append(C2971k.DELETED.ordinal());
            stringBuilder.append(" ORDER BY conversations.conversations_send_time DESC ");
            a = stringBuilder.toString();
            return new C7316h(C2967c.f9203a, a, C2985d.f9350a);
        }

        public final void mo2227a() {
            if (this.f16837a.f16840c != null) {
                this.f16837a.f16840c.m13684c(null);
            }
        }

        public final /* synthetic */ void mo2228a(C0350e c0350e, Object obj) {
            Cursor cursor = (Cursor) obj;
            if (this.f16837a.f16840c != null) {
                this.f16837a.f16840c.m13684c(cursor);
                this.f16837a.f16845i.setVisibility(8);
                this.f16837a.f16841e.mo3670c(cursor.getCount());
            }
        }
    }

    public class C7202b extends C6827b {
        final /* synthetic */ C6221a f20795a;

        public C7202b(C6221a c6221a, Context context) {
            this.f20795a = c6221a;
            super(context);
        }

        public final C6073e mo3449a(ViewGroup viewGroup, int i) {
            C6827b c6827b = this;
            switch (i) {
                case 1:
                    return new C7203c(c6827b.f20795a.getActivity(), c6827b.f20795a, c6827b.f20795a, c6827b.f19501b, viewGroup, c6827b.f20795a.f16842f, c6827b.f20795a.f16843g);
                case 2:
                    return new C7204d(c6827b.f20795a.getActivity(), c6827b.f20795a, c6827b.f20795a, c6827b.f19501b, viewGroup, c6827b.f20795a.f16842f, c6827b.f20795a.f16843g);
                case 3:
                    return new mobi.mmdt.ott.view.conversation.sharedmediaviewer.p449a.C7202b(c6827b.f20795a.getActivity(), c6827b.f20795a, c6827b.f20795a, c6827b.f19501b, viewGroup, c6827b.f20795a.f16842f, c6827b.f20795a.f16843g);
                default:
                    return null;
            }
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        protected final mobi.mmdt.ott.view.components.p401c.C6829g mo3450a(android.database.Cursor r13, int r14) {
            /*
            r12 = this;
            r0 = "_id";
            r0 = r13.getColumnIndex(r0);
            r2 = r13.getLong(r0);
            r0 = "files_thumbnail_uri";
            r0 = r13.getColumnIndex(r0);
            r6 = r13.getString(r0);
            r0 = "files_file_uri";
            r0 = r13.getColumnIndex(r0);
            r5 = r13.getString(r0);
            r0 = "conversations_event_type";
            r0 = r13.getColumnIndex(r0);
            r0 = r13.getInt(r0);
            r1 = "conversations_direction_type";
            r1 = r13.getColumnIndex(r1);
            r1 = r13.getInt(r1);
            r4 = mobi.mmdt.ott.provider.p386h.C2987i.values();
            r7 = "files_download_state";
            r7 = r13.getColumnIndex(r7);
            r7 = r13.getInt(r7);
            r8 = r4[r7];
            r4 = "files_size";
            r4 = r13.getColumnIndex(r4);
            r4 = r13.getInt(r4);
            r7 = "files_progress";
            r7 = r13.getColumnIndex(r7);
            r9 = r13.getInt(r7);
            r13 = new java.lang.StringBuilder;
            r7 = ">>";
            r13.<init>(r7);
            r13.append(r9);
            r7 = ": progress  + fileUri: ";
            r13.append(r7);
            r13.append(r5);
            r13 = r13.toString();
            mobi.mmdt.componentsutils.p232b.p235c.C2480b.m6742f(r13);
            if (r4 <= 0) goto L_0x009f;
        L_0x0071:
            if (r9 <= 0) goto L_0x009f;
        L_0x0073:
            r4 = r4 / 100;
            r4 = r4 * r9;
            r13 = mobi.mmdt.ott.view.components.p405e.C3150a.m7631c();
            r4 = (float) r4;
            r13 = mobi.mmdt.componentsutils.p232b.C2491i.m6770a(r13, r4);
            r4 = new java.lang.StringBuilder;
            r4.<init>();
            r4.append(r13);
            r13 = " | ";
            r4.append(r13);
            r4.append(r9);
            r13 = "%";
            r4.append(r13);
            r13 = r4.toString();
            r4 = mobi.mmdt.ott.view.conversation.sharedmediaviewer.C6221a.m14365a();
            if (r4 == 0) goto L_0x00ab;
        L_0x009e:
            goto L_0x00a7;
        L_0x009f:
            r13 = "0B | 0%";
            r4 = mobi.mmdt.ott.view.conversation.sharedmediaviewer.C6221a.m14365a();
            if (r4 == 0) goto L_0x00ab;
        L_0x00a7:
            r13 = mobi.mmdt.componentsutils.p232b.C2491i.m6814b(r13);
        L_0x00ab:
            r10 = r13;
            r13 = 0;
            r4 = mobi.mmdt.ott.provider.p384f.C2972l.IMAGE;
            r4 = r4.ordinal();
            r7 = 0;
            r11 = 1;
            if (r0 != r4) goto L_0x00c8;
        L_0x00b7:
            r13 = new mobi.mmdt.ott.view.conversation.sharedmediaviewer.b.c;
            r0 = mobi.mmdt.ott.provider.p384f.C2970j.IN;
            r0 = r0.ordinal();
            if (r1 != r0) goto L_0x00c2;
        L_0x00c1:
            r7 = r11;
        L_0x00c2:
            r1 = r13;
            r4 = r14;
            r1.<init>(r2, r4, r5, r6, r7, r8, r9, r10);
            return r13;
        L_0x00c8:
            r4 = mobi.mmdt.ott.provider.p384f.C2972l.VIDEO;
            r4 = r4.ordinal();
            if (r0 != r4) goto L_0x00e1;
        L_0x00d0:
            r13 = new mobi.mmdt.ott.view.conversation.sharedmediaviewer.b.d;
            r0 = mobi.mmdt.ott.provider.p384f.C2970j.IN;
            r0 = r0.ordinal();
            if (r1 != r0) goto L_0x00db;
        L_0x00da:
            r7 = r11;
        L_0x00db:
            r1 = r13;
            r4 = r14;
            r1.<init>(r2, r4, r5, r6, r7, r8, r9, r10);
            return r13;
        L_0x00e1:
            r4 = mobi.mmdt.ott.provider.p384f.C2972l.GIF;
            r4 = r4.ordinal();
            if (r0 != r4) goto L_0x00f9;
        L_0x00e9:
            r13 = new mobi.mmdt.ott.view.conversation.sharedmediaviewer.b.b;
            r0 = mobi.mmdt.ott.provider.p384f.C2970j.IN;
            r0 = r0.ordinal();
            if (r1 != r0) goto L_0x00f4;
        L_0x00f3:
            r7 = r11;
        L_0x00f4:
            r1 = r13;
            r4 = r14;
            r1.<init>(r2, r4, r5, r6, r7, r8, r9, r10);
        L_0x00f9:
            return r13;
            */
            throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.conversation.sharedmediaviewer.a.b.a(android.database.Cursor, int):mobi.mmdt.ott.view.components.c.g");
        }

        public final int getItemViewType(int i) {
            Cursor cursor = (Cursor) m13685c(i);
            i = cursor.getInt(cursor.getColumnIndex("conversations_event_type"));
            return i == C2972l.IMAGE.ordinal() ? 1 : i == C2972l.VIDEO.ordinal() ? 2 : i == C2972l.GIF.ordinal() ? 3 : 1;
        }

        public final /* synthetic */ ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return mo3449a(viewGroup, i);
        }
    }

    static /* synthetic */ boolean m14365a() {
        String b = C2535a.m6888a().m6919b();
        if (!b.equals("fa")) {
            if (!b.equals("ar")) {
                return false;
            }
        }
        return true;
    }

    public final void mo2305a(long j) {
        C2808d.m7149c(new C6665d(j));
    }

    public final void mo2307a(long j, boolean z) {
        if (z) {
            C2808d.m7149c(new C6670l(j));
        } else {
            C2808d.m7149c(new C6669k(j, z));
        }
    }

    public final void mo2308a(String str, int i, boolean z) {
    }

    public final void mo2310a(String str, String str2, String str3, String str4) {
    }

    public final void mo2317b(long j) {
    }

    public final void mo2234c(int i) {
        C7205a c7205a = (C7205a) this.f16840c.m17257b(i);
        switch (c7205a.f19503j) {
            case 1:
                this.f16841e.mo3668a(((C7362c) c7205a).f21359e);
                return;
            case 2:
                this.f16841e.mo3669b(((C7363d) c7205a).f21362e);
                return;
            case 3:
                this.f16841e.mo3668a(((C7361b) c7205a).f21356e);
                return;
            default:
                return;
        }
    }

    public final void mo2235d(int i) {
    }

    public final void mo2331e(String str) {
    }

    public final void mo2333e(C7197a c7197a) {
    }

    public final void mo2335f(C7197a c7197a) {
    }

    public final void mo2337g(C7197a c7197a) {
    }

    public final void mo2338h(C7197a c7197a) {
    }

    public final void mo2339i(C7197a c7197a) {
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        ((C7576b) getActivity()).m19190e().mo268a(23, null, this.f16847k);
    }

    public final void onAttach(android.app.Activity r3) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        super.onAttach(r3);
        r0 = r3;	 Catch:{ ClassCastException -> 0x0009 }
        r0 = (mobi.mmdt.ott.view.conversation.sharedmediaviewer.C6221a.C6914a) r0;	 Catch:{ ClassCastException -> 0x0009 }
        r2.f16841e = r0;	 Catch:{ ClassCastException -> 0x0009 }
        return;
    L_0x0009:
        r0 = new java.lang.ClassCastException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r3 = r3.toString();
        r1.append(r3);
        r3 = " must implement OnSharedMediaViewerFragmentInteractionListener";
        r1.append(r3);
        r3 = r1.toString();
        r0.<init>(r3);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.conversation.sharedmediaviewer.a.onAttach(android.app.Activity):void");
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null && getArguments().containsKey("KEY_FIRST_COMPLETELY_VISIBLE_ITEM_POSITION")) {
            this.f16846j = getArguments().getInt("KEY_FIRST_COMPLETELY_VISIBLE_ITEM_POSITION");
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_shared_media_viewer, viewGroup, false);
    }

    public final void onDestroyView() {
        if (this.f16839b != null) {
            this.f16839b.setItemAnimator(null);
            this.f16839b.setAdapter(null);
            this.f16839b = null;
        }
        this.f16840c = null;
        super.onDestroyView();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f16844h = getArguments().getString("KEY_PEER_PARTY");
        int a = C2489g.m6754a().m6755a(BallPulseIndicator.SCALE);
        int i = getResources().getConfiguration().orientation == 1 ? 3 : 5;
        a /= i;
        this.f16842f = a;
        this.f16843g = a;
        this.f16838a = new GridLayoutManager(getActivity(), i);
        this.f16845i = (ProgressWheel) getView().findViewById(R.id.progress_wheel);
        this.f16839b = (RecyclerView) getView().findViewById(R.id.recycler_view);
        this.f16839b.addItemDecoration(new C6105a((int) C2491i.m6804b(getActivity(), 2.0f), i));
        this.f16840c = new C7202b(this, getActivity());
        this.f16839b.setHasFixedSize(true);
        this.f16839b.setAdapter(this.f16840c);
        this.f16839b.setLayoutManager(this.f16838a);
        this.f16839b.scrollToPosition(this.f16846j);
    }
}
