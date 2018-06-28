package mobi.mmdt.ott.view.main.callslist;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
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
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.cocosw.bottomsheet.C1287c.C1286a;
import mobi.mmdt.componentsutils.p232b.C2474a;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.p359k.C2837a;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.provider.p384f.C2967c;
import mobi.mmdt.ott.provider.p384f.C2970j;
import mobi.mmdt.ott.provider.p384f.C2972l;
import mobi.mmdt.ott.provider.p384f.C7316h;
import mobi.mmdt.ott.provider.p389k.C3000b;
import mobi.mmdt.ott.view.components.p398a.C7176b;
import mobi.mmdt.ott.view.components.p398a.C7176b.C3102a;
import mobi.mmdt.ott.view.components.p401c.C3126i;
import mobi.mmdt.ott.view.components.p401c.C6073e;
import mobi.mmdt.ott.view.components.p401c.C6827b;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.components.p402d.C7576b;
import mobi.mmdt.ott.view.main.callslist.newdesign.callhistory.CallHistoryProfileActivity;
import mobi.mmdt.ott.view.main.callslist.p458a.C6924b;
import mobi.mmdt.ott.view.main.callslist.p577b.C7367c;
import mobi.mmdt.ott.view.main.p451a.C4143a;
import mobi.mmdt.ott.view.tools.C4478a;
import mobi.mmdt.ott.view.tools.C4488b;
import mobi.mmdt.ott.view.tools.C4506e;
import mobi.mmdt.ott.view.tools.C4508f;
import mobi.mmdt.ott.view.tools.C4516l;
import mobi.mmdt.ott.view.tools.C4522p;

public final class C6234b extends C4143a implements C0416a<Cursor>, C3102a, C3126i, C4180c {
    String f16873a = C2535a.m6888a().m6919b();
    private RecyclerView f16874b;
    private C7213a f16875e;
    private FrameLayout f16876f;
    private LinearLayout f16877g;
    private TextView f16878h;

    class C41771 implements OnClickListener {
        final /* synthetic */ C6234b f11922a;

        C41771(C6234b c6234b) {
            this.f11922a = c6234b;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    class C41782 implements OnClickListener {
        final /* synthetic */ C6234b f11923a;

        C41782(C6234b c6234b) {
            this.f11923a = c6234b;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C2837a.m7167a(this.f11923a.f11833c, "android.permission.RECORD_AUDIO", 186);
        }
    }

    class C41793 implements OnClickListener {
        final /* synthetic */ C6234b f11924a;

        C41793(C6234b c6234b) {
            this.f11924a = c6234b;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C4488b.m8184a(this.f11924a.f11833c);
        }
    }

    private class C7213a extends C6827b {
        final /* synthetic */ C6234b f20830a;

        C7213a(C6234b c6234b, Context context) {
            this.f20830a = c6234b;
            super(context);
        }

        public final C6073e mo3449a(ViewGroup viewGroup, int i) {
            return new C6924b(this.f20830a.f11833c, this.f20830a, this.f19501b, viewGroup, this.f20830a);
        }

        protected final C6829g mo3450a(Cursor cursor, int i) {
            C7213a c7213a = this;
            Cursor cursor2 = cursor;
            int i2 = cursor2.getInt(cursor2.getColumnIndex("_id"));
            boolean z = cursor2.getInt(cursor2.getColumnIndex("members_is_anouncer")) != 0;
            String string = cursor2.getString(cursor2.getColumnIndex("conversations_party"));
            int i3 = cursor2.getInt(cursor2.getColumnIndex("conversations_direction_type"));
            int i4 = cursor2.getInt(cursor2.getColumnIndex("conversations_event_type"));
            String string2 = cursor2.getString(cursor2.getColumnIndex("conversations_event"));
            String string3 = cursor2.getString(cursor2.getColumnIndex("members_avatar_thumbnail_url"));
            String string4 = cursor2.getString(cursor2.getColumnIndex("members_local_image_uri"));
            long j = cursor2.getLong(cursor2.getColumnIndex("conversations_send_time"));
            boolean z2 = cursor2.getInt(cursor2.getColumnIndex("members_is_local_user")) != 0;
            return new C7367c(i2, z2 ? C4508f.m8221a(cursor2.getString(cursor2.getColumnIndex("members_local_name")), cursor2.getString(cursor2.getColumnIndex("members_local_phone_number"))) : C4508f.m8220a(cursor2.getString(cursor2.getColumnIndex("members_nick_name"))), string, string3, z2, string4, C2491i.m6806b(c7213a.f, string), C2970j.values()[i3], C2972l.values()[i4], string2, C2491i.m6829d(c7213a.f, j, c7213a.f20830a.f16873a), cursor.getPosition(), z, j);
        }

        public final int getItemViewType(int i) {
            return super.getItemViewType(i);
        }

        public final /* synthetic */ ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return mo3449a(viewGroup, i);
        }
    }

    public C6234b(Activity activity) {
        super(activity);
        LayoutInflater from = LayoutInflater.from(activity);
        int i = 0;
        this.d = from.inflate(R.layout.fragment_calls_list, null, false);
        this.f16877g = (LinearLayout) this.d.findViewById(R.id.empty_state_linearLayout);
        this.f16876f = (FrameLayout) this.d.findViewById(R.id.empty_state_frameLayout_image);
        this.f16878h = (TextView) this.d.findViewById(R.id.empty_state_textView);
        this.f16874b = (RecyclerView) this.d.findViewById(R.id.recycler_view);
        this.f16875e = new C7213a(this, this.f11833c);
        this.f16874b.setHasFixedSize(true);
        this.f16874b.setAdapter(this.f16875e);
        RecyclerView recyclerView = this.f16874b;
        if (recyclerView.getLayoutManager() != null) {
            i = ((LinearLayoutManager) recyclerView.getLayoutManager()).findFirstCompletelyVisibleItemPosition();
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(this.f11833c));
        recyclerView.scrollToPosition(i);
        ((C7576b) this.f11833c).m19190e().mo268a(30, null, this);
        C2491i.m6786a(this.f11833c, this.f16876f);
        C2491i.m6802a(this.f16878h, UIThemeManager.getmInstance().getText_primary_color());
    }

    public final Dialog mo2398a(Bundle bundle) {
        int i = bundle.getInt("dialog_id");
        if (i == 82) {
            return C4488b.m8182a(this.f11833c, C4522p.m8236a(R.string.record_audio_permission), C4522p.m8236a(R.string.allow_soroush_access_to_your_microphone), C4522p.m8236a(R.string.movafegham), new C41782(this), C4522p.m8236a(R.string.felan_na), null);
        }
        if (i == 85) {
            return C4488b.m8182a(this.f11833c, C4522p.m8236a(R.string.record_audio_permission), C4522p.m8236a(R.string.soroush_needs_record_audio_permission_to_record_and_send_audio_messages), C4522p.m8236a(R.string.ok_cap), null, C4522p.m8236a(R.string.settings), new C41793(this));
        }
        if (i != 217) {
            return null;
        }
        C1286a c1286a = new C1286a(this.f11833c);
        c1286a.f4034f = new C41771(this);
        C4506e.m8204a(this.f11833c, c1286a, R.menu.context_menu_calls_list_long_click);
        return c1286a.m3053a();
    }

    public final C0350e<Cursor> mo2226a(int i, Bundle bundle) {
        StringBuilder stringBuilder = new StringBuilder("SELECT conversations._id as _id,conversations_message_id,conversations_event_type,conversations_event,conversations_send_time,conversations_receive_time,conversations_likes,conversations_my_like,conversations_visits,conversations_my_visit,conversations_my_vote,conversations_is_need_notify,conversations_reply_message_id,conversations_link_preview,conversations_direction_type,conversations_event_state,conversations_party,conversations_peer_user_id,conversations_group_type,conversations_file_id,conversations_sticker_id,conversations_forward_user_id,conversations_forward_group_type,conversations_forward_name,conversations_forward_message_id,conversations_edit_time,conversations_extra,members_nick_name,members_avatar_url,members_avatar_thumbnail_url,members_user_id,members_is_local_user,members_last_online,members_last_position,members_can_reply,members_is_anouncer,members_local_name,members_local_phone_number,members_moto,members_is_pined,members_is_mute,members_local_image_uri FROM ( conversations LEFT JOIN members ON conversations_party = members_user_id) WHERE conversations_event_type = '");
        stringBuilder.append(C2972l.CALL.ordinal());
        stringBuilder.append("' OR conversations_event_type = '");
        stringBuilder.append(C2972l.MISSED_CALL.ordinal());
        stringBuilder.append("' GROUP BY  strftime('%d-%m-%Y', conversations_send_time / 1000, 'unixepoch') ORDER BY conversations.conversations_send_time DESC  LIMIT 50");
        String stringBuilder2 = stringBuilder.toString();
        return new C7316h(C2967c.f9203a, stringBuilder2, C2967c.f9203a, C3000b.f9413a);
    }

    public final void mo2227a() {
        if (this.f16875e != null) {
            this.f16875e.m13684c(null);
        }
    }

    public final /* synthetic */ void mo2228a(C0350e c0350e, Object obj) {
        Cursor cursor = (Cursor) obj;
        if (this.f16875e != null) {
            this.f16875e.m13684c(cursor);
            if (this.f16875e.m13682b() > 0) {
                this.f16877g.setVisibility(8);
                return;
            } else {
                this.f16877g.setVisibility(0);
                return;
            }
        }
        this.f16877g.setVisibility(0);
    }

    public final void mo2375a(String str) {
    }

    public final void mo2399b(String str) {
        if (!C2474a.m6718b(MyApplication.m12952b())) {
            Toast.makeText(this.f11833c, C4522p.m8236a(R.string.connection_error_message), 0).show();
        } else if (!C4516l.m8232a() || C2837a.m7170a("android.permission.RECORD_AUDIO")) {
            C4478a.m8163c(this.f11833c, str);
        } else {
            Bundle bundle = new Bundle();
            bundle.putInt("dialog_id", 82);
            Fragment a = C7176b.m18967a(bundle, this);
            C0401p a2 = ((C7576b) this.f11833c).m19188c().mo254a();
            a2.mo237a(a, "tag");
            a2.mo244d();
        }
    }

    public final void mo2234c(int i) {
        C7367c c7367c = (C7367c) this.f16875e.m17257b(i);
        String str = c7367c.f21411c;
        Intent intent = new Intent(this.f11833c, CallHistoryProfileActivity.class);
        intent.putExtra("KEY_CONTACT_USER_ID_STRING", str);
        intent.putExtra("KEY_TIME_CALL", c7367c.f21409a);
        this.f11833c.startActivity(intent);
        this.f11833c.overridePendingTransition(R.anim.anim_slide_in_left, R.anim.anim_slide_out_left);
    }

    public final void mo2235d(int i) {
    }
}
