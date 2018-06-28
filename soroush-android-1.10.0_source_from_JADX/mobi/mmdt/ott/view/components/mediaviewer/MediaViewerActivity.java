package mobi.mmdt.ott.view.components.mediaviewer;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.app.C0417s.C0416a;
import android.support.v4.p029a.C0346c;
import android.support.v4.p029a.C0350e;
import android.support.v7.app.C7406c;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.OnScrollListener;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.componentsutils.p232b.p234b.C2475a;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.stheme.UIThemeManager;
import mobi.mmdt.ott.p246d.p248b.C2535a;
import mobi.mmdt.ott.provider.p384f.C2967c;
import mobi.mmdt.ott.provider.p384f.C2970j;
import mobi.mmdt.ott.provider.p384f.C2971k;
import mobi.mmdt.ott.provider.p384f.C2972l;
import mobi.mmdt.ott.provider.p384f.C2973m;
import mobi.mmdt.ott.provider.p384f.C7316h;
import mobi.mmdt.ott.provider.p386h.C2987i;
import mobi.mmdt.ott.view.components.ProgressWheel;
import mobi.mmdt.ott.view.components.mediaviewer.p414a.C7185b;
import mobi.mmdt.ott.view.components.mediaviewer.p414a.C7186c;
import mobi.mmdt.ott.view.components.mediaviewer.p414a.C7187d;
import mobi.mmdt.ott.view.components.mediaviewer.p568b.C7188a;
import mobi.mmdt.ott.view.components.mediaviewer.p568b.C7334b;
import mobi.mmdt.ott.view.components.mediaviewer.p568b.C7335c;
import mobi.mmdt.ott.view.components.mediaviewer.p568b.C7336d;
import mobi.mmdt.ott.view.components.p398a.C7175a.C3101a;
import mobi.mmdt.ott.view.components.p401c.C6073e;
import mobi.mmdt.ott.view.components.p401c.C6074f;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.components.p402d.C7576b;
import mobi.mmdt.ott.view.components.recyclerviewpager.RecyclerViewPager;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;
import mobi.mmdt.ott.view.tools.C4488b;
import mobi.mmdt.ott.view.tools.C4508f;
import mobi.mmdt.ott.view.tools.C4522p;

public class MediaViewerActivity extends C7576b implements C0416a<Cursor>, C3101a, C3231a {
    private TextView f24044A;
    private TextView f24045B;
    private LinearLayout f24046C;
    private String f24047D;
    private String f24048E;
    private C2973m f24049F;
    private MenuItem f24050G;
    private ProgressWheel f24051m;
    private C6866a f24052n;
    private ViewGroup f24053o;
    private RecyclerViewPager f24054p;
    private LinearLayoutManager f24055q;
    private String f24056r;
    private String f24057s;
    private String f24058t;
    private String f24059u;
    private int f24060v;
    private boolean f24061w;
    private String f24062z;

    class C32242 implements OnLayoutChangeListener {
        final /* synthetic */ MediaViewerActivity f9955a;

        C32242(MediaViewerActivity mediaViewerActivity) {
            this.f9955a = mediaViewerActivity;
        }

        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            if (this.f9955a.f24054p.getChildCount() >= 3) {
                if (this.f9955a.f24054p.getChildAt(0) != null) {
                    view = this.f9955a.f24054p.getChildAt(0);
                    view.setScaleY(0.7f);
                    view.setScaleX(0.7f);
                }
                if (this.f9955a.f24054p.getChildAt(2) != null) {
                    view = this.f9955a.f24054p.getChildAt(2);
                    view.setScaleY(0.7f);
                    view.setScaleX(0.7f);
                }
            } else if (this.f9955a.f24054p.getChildAt(1) != null) {
                view = this.f9955a.f24054p.getCurrentPosition() == 0 ? this.f9955a.f24054p.getChildAt(1) : this.f9955a.f24054p.getChildAt(0);
                view.setScaleY(0.7f);
                view.setScaleX(0.7f);
            }
        }
    }

    class C32274 implements OnClickListener {
        final /* synthetic */ MediaViewerActivity f9960a;

        C32274(MediaViewerActivity mediaViewerActivity) {
            this.f9960a = mediaViewerActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            C4488b.m8184a(MediaViewerActivity.m21166r(this.f9960a));
        }
    }

    class C61141 extends OnScrollListener {
        final /* synthetic */ MediaViewerActivity f16420a;

        C61141(MediaViewerActivity mediaViewerActivity) {
            this.f16420a = mediaViewerActivity;
        }

        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            if (i == 0) {
                int findFirstCompletelyVisibleItemPosition = this.f16420a.f24055q.findFirstCompletelyVisibleItemPosition();
                if (findFirstCompletelyVisibleItemPosition >= 0) {
                    Activity c;
                    String a;
                    Object[] objArr;
                    this.f16420a.f24060v = findFirstCompletelyVisibleItemPosition;
                    if (this.f16420a.f24062z.equals("fa")) {
                        c = MediaViewerActivity.m21151c(this.f16420a);
                        a = C4522p.m8236a(R.string.media_viewer_of_phrase);
                        objArr = new Object[]{C2491i.m6809b(this.f16420a.f24060v + 1), C2491i.m6809b(this.f16420a.f24052n.getItemCount())};
                    } else {
                        c = MediaViewerActivity.m21154f(this.f16420a);
                        a = C4522p.m8236a(R.string.media_viewer_of_phrase);
                        objArr = new Object[]{Integer.valueOf(this.f16420a.f24060v + 1), Integer.valueOf(this.f16420a.f24052n.getItemCount())};
                    }
                    C2475a.m6721b(c, String.format(a, objArr));
                    C7188a c7188a = (C7188a) this.f16420a.f24052n.m13671a(this.f16420a.f24060v);
                    if (c7188a.f19503j == 3) {
                        this.f16420a.f24048E = ((C7334b) c7188a).f21143c;
                        this.f16420a.f24052n.notifyDataSetChanged();
                    }
                }
                MediaViewerActivity.m21155g(this.f16420a);
            }
        }

        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            i = this.f16420a.f24054p.getChildCount();
            int i3 = 0;
            int width = (this.f16420a.f24054p.getWidth() - this.f16420a.f24054p.getChildAt(0).getWidth()) / 2;
            while (i3 < i) {
                View childAt = recyclerView.getChildAt(i3);
                float f = 0.0f;
                if (childAt.getLeft() <= width) {
                    float left = BallPulseIndicator.SCALE - ((childAt.getLeft() >= width - childAt.getWidth() ? (((float) (width - childAt.getLeft())) * BallPulseIndicator.SCALE) / ((float) childAt.getWidth()) : BallPulseIndicator.SCALE) * 0.3f);
                    childAt.setScaleY(left);
                    childAt.setScaleX(left);
                } else {
                    if (childAt.getLeft() <= recyclerView.getWidth() - width) {
                        f = (((float) ((recyclerView.getWidth() - width) - childAt.getLeft())) * BallPulseIndicator.SCALE) / ((float) childAt.getWidth());
                    }
                    float f2 = 0.7f + (f * 0.3f);
                    childAt.setScaleY(f2);
                    childAt.setScaleX(f2);
                }
                i3++;
            }
        }
    }

    public class C6866a extends C6074f {
        final /* synthetic */ MediaViewerActivity f19582a;

        public C6866a(MediaViewerActivity mediaViewerActivity, Context context) {
            this.f19582a = mediaViewerActivity;
            super(context);
        }

        public final void mo3181a(C6073e c6073e, int i) {
            C6829g c6829g = (C6829g) this.c.get(i);
            if (c6073e.getItemViewType() == 3) {
                boolean z;
                C7334b c7334b = (C7334b) c6829g;
                if (this.f19582a.f24048E != null) {
                    if (!this.f19582a.f24048E.equals(c7334b.f21143c)) {
                        z = false;
                        c7334b.f21147g = z;
                    }
                }
                z = true;
                c7334b.f21147g = z;
            }
            super.mo3181a(c6073e, i);
        }

        public final /* synthetic */ void onBindViewHolder(ViewHolder viewHolder, int i) {
            mo3181a((C6073e) viewHolder, i);
        }

        public final /* synthetic */ ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            switch (i) {
                case 1:
                    return new C7186c(MediaViewerActivity.m21162n(this.f19582a), this.f16246b, viewGroup, this.f19582a);
                case 2:
                    return new C7187d(MediaViewerActivity.m21163o(this.f19582a), this.f16246b, viewGroup);
                case 3:
                    return new C7185b(MediaViewerActivity.m21164p(this.f19582a), this.f16246b, viewGroup, this.f19582a);
                default:
                    return null;
            }
        }
    }

    static /* synthetic */ C6829g m21149a(MediaViewerActivity mediaViewerActivity, Cursor cursor, int i) {
        int i2 = cursor.getInt(cursor.getColumnIndex("_id"));
        cursor.getString(cursor.getColumnIndex("members_local_name"));
        String string = cursor.getString(cursor.getColumnIndex("members_nick_name"));
        String string2 = cursor.getString(cursor.getColumnIndex("conversations_party"));
        cursor.getString(cursor.getColumnIndex("conversations_peer_user_id"));
        long j = cursor.getLong(cursor.getColumnIndex("conversations_send_time"));
        String string3 = cursor.getString(cursor.getColumnIndex("conversations_event"));
        String string4 = cursor.getString(cursor.getColumnIndex("conversations_message_id"));
        int i3 = cursor.getInt(cursor.getColumnIndex("conversations_event_type"));
        int i4 = cursor.getInt(cursor.getColumnIndex("conversations_direction_type"));
        mediaViewerActivity.f24047D = cursor.getString(cursor.getColumnIndex("files_file_uri"));
        long j2 = cursor.getLong(cursor.getColumnIndex("conversations_file_id"));
        String a = C4508f.m8220a(string);
        if (i4 == C2970j.OUT.ordinal()) {
            a = C4522p.m8236a(R.string.you);
        }
        Object obj = i3 == C2972l.IMAGE.ordinal() ? 1 : i3 == C2972l.VIDEO.ordinal() ? 2 : i3 == C2972l.GIF.ordinal() ? 3 : -1;
        switch (obj) {
            case 1:
                return new C7335c(i2, string2, a, mediaViewerActivity.f24047D, C2491i.m6825c(mediaViewerActivity.getApplicationContext(), j, mediaViewerActivity.f24062z), string3, j2, string4, i);
            case 2:
                return new C7336d(i2, string2, a, mediaViewerActivity.f24047D, C2491i.m6825c(mediaViewerActivity.getApplicationContext(), j, mediaViewerActivity.f24062z), string3, j2, string4, i);
            case 3:
                boolean z;
                if (mediaViewerActivity.f24048E != null) {
                    if (!mediaViewerActivity.f24048E.equals(string4)) {
                        z = false;
                        return new C7334b(i2, string2, a, mediaViewerActivity.f24047D, C2491i.m6825c(mediaViewerActivity.getApplicationContext(), j, mediaViewerActivity.f24062z), string3, j2, string4, z, i);
                    }
                }
                z = true;
                return new C7334b(i2, string2, a, mediaViewerActivity.f24047D, C2491i.m6825c(mediaViewerActivity.getApplicationContext(), j, mediaViewerActivity.f24062z), string3, j2, string4, z, i);
            default:
                return null;
        }
    }

    static /* synthetic */ C7406c m21151c(MediaViewerActivity mediaViewerActivity) {
        return mediaViewerActivity;
    }

    static /* synthetic */ C7406c m21154f(MediaViewerActivity mediaViewerActivity) {
        return mediaViewerActivity;
    }

    static /* synthetic */ void m21155g(MediaViewerActivity mediaViewerActivity) {
        if (mediaViewerActivity.f24052n != null && mediaViewerActivity.f24052n.getItemCount() > 0) {
            TextView textView;
            String a;
            Object[] objArr;
            C6829g a2 = mediaViewerActivity.f24052n.m13671a(mediaViewerActivity.f24060v);
            StringBuilder stringBuilder = new StringBuilder("TYPE : ");
            stringBuilder.append(a2.f19503j);
            C2480b.m6742f(stringBuilder.toString());
            switch (a2.f19503j) {
                case 1:
                    C7335c c7335c = (C7335c) a2;
                    if (c7335c.f21154f == null || c7335c.f21154f.isEmpty()) {
                        if (mediaViewerActivity.f24050G != null) {
                            mediaViewerActivity.f24050G.setVisible(false);
                        }
                        mediaViewerActivity.f24044A.setVisibility(8);
                    } else {
                        mediaViewerActivity.f24044A.setText(c7335c.f21154f);
                        mediaViewerActivity.f24044A.setVisibility(0);
                        if (mediaViewerActivity.f24050G != null) {
                            mediaViewerActivity.f24050G.setVisible(true);
                        }
                    }
                    if (mediaViewerActivity.f24049F != null && (mediaViewerActivity.f24049F == C2973m.SINGLE || mediaViewerActivity.f24049F == C2973m.GROUP)) {
                        textView = mediaViewerActivity.f24045B;
                        a = C4522p.m8236a(R.string.media_viewer_photo_view_holder);
                        objArr = new Object[]{c7335c.f21150b, c7335c.f21153e};
                        break;
                    }
                    textView = mediaViewerActivity.f24045B;
                    a = C4522p.m8236a(R.string.channel_media_viewer_photo_view_holder);
                    objArr = new Object[]{c7335c.f21153e};
                    break;
                    break;
                case 2:
                    C7336d c7336d = (C7336d) a2;
                    if (c7336d.f21160e == null || c7336d.f21160e.isEmpty()) {
                        mediaViewerActivity.f24044A.setVisibility(8);
                        if (mediaViewerActivity.f24050G != null) {
                            mediaViewerActivity.f24050G.setVisible(false);
                        }
                    } else {
                        mediaViewerActivity.f24044A.setText(c7336d.f21160e);
                        mediaViewerActivity.f24044A.setVisibility(0);
                        if (mediaViewerActivity.f24050G != null) {
                            mediaViewerActivity.f24050G.setVisible(true);
                        }
                    }
                    if (mediaViewerActivity.f24049F != null && (mediaViewerActivity.f24049F == C2973m.SINGLE || mediaViewerActivity.f24049F == C2973m.GROUP)) {
                        textView = mediaViewerActivity.f24045B;
                        a = C4522p.m8236a(R.string.media_viewer_photo_view_holder);
                        objArr = new Object[]{c7336d.f21157b, c7336d.f21158c};
                        break;
                    }
                    textView = mediaViewerActivity.f24045B;
                    a = C4522p.m8236a(R.string.channel_media_viewer_photo_view_holder);
                    objArr = new Object[]{c7336d.f21158c};
                    break;
                case 3:
                    C7334b c7334b = (C7334b) a2;
                    if (c7334b.f21146f == null || c7334b.f21146f.isEmpty()) {
                        mediaViewerActivity.f24044A.setVisibility(8);
                        if (mediaViewerActivity.f24050G != null) {
                            mediaViewerActivity.f24050G.setVisible(false);
                        }
                    } else {
                        mediaViewerActivity.f24044A.setText(c7334b.f21146f);
                        mediaViewerActivity.f24044A.setVisibility(0);
                        if (mediaViewerActivity.f24050G != null) {
                            mediaViewerActivity.f24050G.setVisible(true);
                        }
                    }
                    if (mediaViewerActivity.f24049F != null && (mediaViewerActivity.f24049F == C2973m.SINGLE || mediaViewerActivity.f24049F == C2973m.GROUP)) {
                        textView = mediaViewerActivity.f24045B;
                        a = C4522p.m8236a(R.string.media_viewer_photo_view_holder);
                        objArr = new Object[]{c7334b.f21142b, c7334b.f21145e};
                        break;
                    }
                    mediaViewerActivity.f24045B.setText(String.format(C4522p.m8236a(R.string.channel_media_viewer_photo_view_holder), new Object[]{c7334b.f21145e}));
                    return;
                    break;
                default:
                    return;
            }
            textView.setText(String.format(a, objArr));
        }
    }

    static /* synthetic */ C7406c m21160l(MediaViewerActivity mediaViewerActivity) {
        return mediaViewerActivity;
    }

    static /* synthetic */ C7406c m21161m(MediaViewerActivity mediaViewerActivity) {
        return mediaViewerActivity;
    }

    static /* synthetic */ C7406c m21162n(MediaViewerActivity mediaViewerActivity) {
        return mediaViewerActivity;
    }

    static /* synthetic */ C7406c m21163o(MediaViewerActivity mediaViewerActivity) {
        return mediaViewerActivity;
    }

    static /* synthetic */ C7406c m21164p(MediaViewerActivity mediaViewerActivity) {
        return mediaViewerActivity;
    }

    static /* synthetic */ C7406c m21166r(MediaViewerActivity mediaViewerActivity) {
        return mediaViewerActivity;
    }

    public final Dialog mo2299a(Bundle bundle) {
        if (bundle.getInt("dialog_id") != 92) {
            return null;
        }
        return C4488b.m8182a(this, C4522p.m8236a(R.string.storage_permission), C4522p.m8236a(R.string.soroush_needs_access_to_your_storage), C4522p.m8236a(R.string.ok_cap), null, C4522p.m8236a(R.string.settings), new C32274(this));
    }

    public final C0350e<Cursor> mo2226a(int i, Bundle bundle) {
        String str = this.f24056r;
        StringBuilder stringBuilder = new StringBuilder("SELECT conversations._id as _id,conversations_message_id,conversations_event_type,conversations_event,conversations_send_time,conversations_receive_time,conversations_likes,conversations_my_like,conversations_visits,conversations_my_visit,conversations_my_vote,conversations_is_need_notify,conversations_reply_message_id,conversations_link_preview,conversations_direction_type,conversations_event_state,conversations_party,conversations_peer_user_id,conversations_group_type,conversations_file_id,conversations_sticker_id,conversations_forward_user_id,conversations_forward_group_type,conversations_forward_name,conversations_forward_message_id,conversations_edit_time,conversations_extra,files_file_uri,files_type,files_name,files_size,files_progress,files_thumbnail_uri,files_download_state,files_thumbnail_download_state,files_duration,files_audio_playing_time,files_audio_state,files_image_width,files_image_height,members_nick_name,members_avatar_url,members_avatar_thumbnail_url,members_user_id,members_is_local_user,members_last_online,members_last_position,members_can_reply,members_is_anouncer,members_local_name,members_local_phone_number,members_moto,members_is_pined,members_is_mute,members_local_image_uri FROM ((( conversations LEFT JOIN files ON conversations.conversations_file_id = files._id) LEFT JOIN members ON conversations_peer_user_id = members_user_id)) WHERE conversations.conversations_party = '");
        stringBuilder.append(str);
        stringBuilder.append("' AND (conversations.conversations_event_type = ");
        stringBuilder.append(C2972l.IMAGE.ordinal());
        stringBuilder.append(" OR conversations.conversations_event_type = ");
        stringBuilder.append(C2972l.VIDEO.ordinal());
        stringBuilder.append(" OR conversations.conversations_event_type = ");
        stringBuilder.append(C2972l.GIF.ordinal());
        stringBuilder.append(") AND (files_download_state = ");
        stringBuilder.append(C2987i.FINISHED.ordinal());
        stringBuilder.append(") AND (conversations.conversations_event_state <> ");
        stringBuilder.append(C2971k.DELETED.ordinal());
        stringBuilder.append(")ORDER BY conversations.conversations_send_time ASC ");
        return new C7316h(C2967c.f9203a, stringBuilder.toString(), new Uri[0]);
    }

    public final void mo2227a() {
    }

    public final /* synthetic */ void mo2228a(C0350e c0350e, Object obj) {
        final Cursor cursor = (Cursor) obj;
        if (this.f24052n != null && !this.f24061w) {
            new Thread(new Runnable(this) {
                final /* synthetic */ MediaViewerActivity f9959b;

                public final void run() {
                    this.f9959b.f24061w = true;
                    final List arrayList = new ArrayList();
                    int i = 0;
                    if (cursor.moveToFirst()) {
                        do {
                            arrayList.add(MediaViewerActivity.m21149a(this.f9959b, cursor, cursor.getPosition()));
                            if (cursor.getString(cursor.getColumnIndex("files_file_uri")).equals(this.f9959b.f24059u)) {
                                i = cursor.getPosition();
                            }
                        } while (cursor.moveToNext());
                    }
                    this.f9959b.f24060v = i;
                    this.f9959b.runOnUiThread(new Runnable(this) {
                        final /* synthetic */ C32263 f9957b;

                        public final void run() {
                            Activity l;
                            String a;
                            Object[] objArr;
                            this.f9957b.f9959b.f24051m.setVisibility(8);
                            this.f9957b.f9959b.f24052n.m13673a(arrayList);
                            if (this.f9957b.f9959b.f24062z.equals("fa")) {
                                l = MediaViewerActivity.m21160l(this.f9957b.f9959b);
                                a = C4522p.m8236a(R.string.media_viewer_of_phrase);
                                objArr = new Object[]{C2491i.m6809b(this.f9957b.f9959b.f24060v + 1), C2491i.m6809b(cursor.getCount())};
                            } else {
                                l = MediaViewerActivity.m21161m(this.f9957b.f9959b);
                                a = C4522p.m8236a(R.string.media_viewer_of_phrase);
                                objArr = new Object[]{Integer.valueOf(this.f9957b.f9959b.f24060v + 1), Integer.valueOf(cursor.getCount())};
                            }
                            C2475a.m6721b(l, String.format(a, objArr));
                            this.f9957b.f9959b.f24055q.scrollToPosition(this.f9957b.f9959b.f24060v);
                            MediaViewerActivity.m21155g(this.f9957b.f9959b);
                        }
                    });
                }
            }).start();
        }
    }

    public final void k_() {
        if (this.x.isShown()) {
            this.x.setVisibility(8);
            this.f24046C.setVisibility(8);
            return;
        }
        Animation loadAnimation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.anim_fade_in_activity_theme_dialog);
        this.x.setAnimation(loadAnimation);
        this.x.setVisibility(0);
        this.f24046C.setVisibility(0);
        this.f24046C.setAnimation(loadAnimation);
        if (VERSION.SDK_INT >= 19) {
            getWindow().getDecorView().setSystemUiVisibility(0);
        }
    }

    public void onBackPressed() {
        super.onBackPressed();
        setResult(0);
        overridePendingTransition(R.anim.anim_slide_in_right, R.anim.anim_slide_out_right);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_media_viewer);
        this.x = (Toolbar) findViewById(R.id.toolbar);
        m20723a(true, UIThemeManager.getmInstance().getIcon_toolbar_white_color());
        C2475a.m6720a(getWindow(), C0346c.m687c(this, R.color.colorTransparentToolbarBackground));
        this.f24051m = (ProgressWheel) findViewById(R.id.progress_wheel);
        this.f24044A = (TextView) findViewById(R.id.caption_textView);
        this.f24045B = (TextView) findViewById(R.id.details_textView);
        this.f24046C = (LinearLayout) findViewById(R.id.details_layout);
        this.f24053o = (ViewGroup) findViewById(R.id.root_layout);
        this.f24058t = C2535a.m6888a().m6928d();
        this.f24062z = C2535a.m6888a().m6919b();
        if (!(getIntent() == null || getIntent().getExtras() == null)) {
            this.f24056r = getIntent().getStringExtra("KEY_PEER_PARTY");
            this.f24049F = C2973m.values()[getIntent().getIntExtra("KEY_GROUP_TYPE", 0)];
            this.f24057s = getIntent().getStringExtra("KEY_TITLE");
            this.f24059u = getIntent().getStringExtra("KEY_MEDIA_PATH");
        }
        if (bundle != null) {
            if (bundle.containsKey("KEY_PEER_PARTY")) {
                this.f24056r = bundle.getString("KEY_PEER_PARTY");
            }
            if (bundle.containsKey("KEY_TITLE")) {
                this.f24057s = bundle.getString("KEY_TITLE");
            }
            if (bundle.containsKey("KEY_MEDIA_PATH")) {
                this.f24059u = bundle.getString("KEY_MEDIA_PATH");
            }
            if (bundle.containsKey("KEY_CURRENT_POSITION")) {
                this.f24060v = bundle.getInt("KEY_CURRENT_POSITION");
            }
        }
        C2475a.m6719a((Activity) this, this.f24057s);
        this.f24052n = new C6866a(this, this);
        this.f24054p = (RecyclerViewPager) findViewById(R.id.recyclerViewPager);
        this.f24055q = new LinearLayoutManager(this, 0, false);
        this.f24054p.setLayoutManager(this.f24055q);
        this.f24054p.setAdapter(this.f24052n);
        this.f24054p.setHasFixedSize(true);
        this.f24054p.setLongClickable(true);
        this.f24054p.addOnScrollListener(new C61141(this));
        this.f24054p.addOnLayoutChangeListener(new C32242(this));
        if (m19190e().mo267a() != null) {
            m19190e().mo269a(19);
        }
        m19190e().mo268a(19, null, this);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_media_viewer, menu);
        MenuItem findItem = menu.findItem(R.id.action_share);
        MenuItem findItem2 = menu.findItem(R.id.action_forward);
        MenuItem findItem3 = menu.findItem(R.id.action_save_to_gallery);
        this.f24050G = menu.findItem(R.id.action_copy);
        C2491i.m6790a(findItem.getIcon(), UIThemeManager.getmInstance().getIcon_toolbar_white_color());
        C2491i.m6790a(findItem2.getIcon(), UIThemeManager.getmInstance().getIcon_toolbar_white_color());
        C2491i.m6790a(findItem3.getIcon(), UIThemeManager.getmInstance().getIcon_toolbar_white_color());
        C2491i.m6790a(this.f24050G.getIcon(), UIThemeManager.getmInstance().getIcon_toolbar_white_color());
        return super.onCreateOptionsMenu(menu);
    }

    protected void onDestroy() {
        super.onDestroy();
        m19190e().mo269a(19);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onOptionsItemSelected(android.view.MenuItem r5) {
        /*
        r4 = this;
        r0 = r5.getItemId();
        r1 = 1;
        r2 = 16908332; // 0x102002c float:2.3877352E-38 double:8.353826E-317;
        if (r0 != r2) goto L_0x000e;
    L_0x000a:
        r4.onBackPressed();
        return r1;
    L_0x000e:
        r2 = 2131296339; // 0x7f090053 float:1.8210592E38 double:1.053000302E-314;
        if (r0 != r2) goto L_0x0079;
    L_0x0013:
        r0 = r4.f24060v;
        if (r0 < 0) goto L_0x0184;
    L_0x0017:
        r0 = r4.f24060v;
        r2 = r4.f24052n;
        r2 = r2.getItemCount();
        if (r0 >= r2) goto L_0x0184;
    L_0x0021:
        r0 = r4.f24052n;
        r2 = r4.f24060v;
        r0 = r0.m13671a(r2);
        r0 = r0.f19503j;
        switch(r0) {
            case 1: goto L_0x0053;
            case 2: goto L_0x0041;
            case 3: goto L_0x002f;
            default: goto L_0x002e;
        };
    L_0x002e:
        goto L_0x0072;
    L_0x002f:
        r0 = r4.f24052n;
        r2 = r4.f24060v;
        r0 = r0.m13671a(r2);
        r0 = (mobi.mmdt.ott.view.components.mediaviewer.p568b.C7334b) r0;
        r2 = new java.util.ArrayList;
        r2.<init>();
        r0 = r0.f21143c;
        goto L_0x0064;
    L_0x0041:
        r0 = r4.f24052n;
        r2 = r4.f24060v;
        r0 = r0.m13671a(r2);
        r0 = (mobi.mmdt.ott.view.components.mediaviewer.p568b.C7336d) r0;
        r2 = new java.util.ArrayList;
        r2.<init>();
        r0 = r0.f21161f;
        goto L_0x0064;
    L_0x0053:
        r0 = r4.f24052n;
        r2 = r4.f24060v;
        r0 = r0.m13671a(r2);
        r0 = (mobi.mmdt.ott.view.components.mediaviewer.p568b.C7335c) r0;
        r2 = new java.util.ArrayList;
        r2.<init>();
        r0 = r0.f21151c;
    L_0x0064:
        r2.add(r0);
        r0 = r4.f24056r;
        r3 = r4.f24049F;
        r3 = r3.ordinal();
        mobi.mmdt.ott.view.tools.C4478a.m8151a(r4, r2, r0, r3, r1);
    L_0x0072:
        r0 = 18;
        r4.setResult(r0);
        goto L_0x0184;
    L_0x0079:
        r1 = 2131296383; // 0x7f09007f float:1.8210681E38 double:1.053000324E-314;
        if (r0 != r1) goto L_0x00de;
    L_0x007e:
        r0 = r4.f24060v;
        if (r0 < 0) goto L_0x0184;
    L_0x0082:
        r0 = r4.f24060v;
        r1 = r4.f24052n;
        r1 = r1.getItemCount();
        if (r0 >= r1) goto L_0x0184;
    L_0x008c:
        r0 = r4.f24052n;
        r1 = r4.f24060v;
        r0 = r0.m13671a(r1);
        r0 = r0.f19503j;
        switch(r0) {
            case 1: goto L_0x00c3;
            case 2: goto L_0x00a8;
            case 3: goto L_0x009b;
            default: goto L_0x0099;
        };
    L_0x0099:
        goto L_0x0184;
    L_0x009b:
        r0 = r4.f24052n;
        r1 = r4.f24060v;
        r0 = r0.m13671a(r1);
        r0 = (mobi.mmdt.ott.view.components.mediaviewer.p568b.C7334b) r0;
        r0 = r0.f21144d;
        goto L_0x00cf;
    L_0x00a8:
        r0 = r4.f24052n;
        r1 = r4.f24060v;
        r0 = r0.m13671a(r1);
        r0 = (mobi.mmdt.ott.view.components.mediaviewer.p568b.C7336d) r0;
        r0 = r0.f21159d;
        r0 = mobi.mmdt.ott.provider.p386h.C2984c.m7461a(r0);
        r0 = r0.f9334c;
        r0 = r0.toString();
        mobi.mmdt.ott.view.tools.C4533r.m8259d(r4, r0);
        goto L_0x0184;
    L_0x00c3:
        r0 = r4.f24052n;
        r1 = r4.f24060v;
        r0 = r0.m13671a(r1);
        r0 = (mobi.mmdt.ott.view.components.mediaviewer.p568b.C7335c) r0;
        r0 = r0.f21152d;
    L_0x00cf:
        r0 = mobi.mmdt.ott.provider.p386h.C2984c.m7461a(r0);
        r0 = r0.f9334c;
        r0 = r0.toString();
        mobi.mmdt.ott.view.tools.C4533r.m8257b(r4, r0);
        goto L_0x0184;
    L_0x00de:
        r1 = 2131296380; // 0x7f09007c float:1.8210675E38 double:1.0530003225E-314;
        if (r0 != r1) goto L_0x012b;
    L_0x00e3:
        r0 = r4.f24060v;
        if (r0 < 0) goto L_0x0184;
    L_0x00e7:
        r0 = r4.f24060v;
        r1 = r4.f24052n;
        r1 = r1.getItemCount();
        if (r0 >= r1) goto L_0x0184;
    L_0x00f1:
        r0 = 0;
        r1 = r4.f24052n;
        r2 = r4.f24060v;
        r1 = r1.m13671a(r2);
        r1 = r1.f19503j;
        switch(r1) {
            case 1: goto L_0x0116;
            case 2: goto L_0x010b;
            case 3: goto L_0x0100;
            default: goto L_0x00ff;
        };
    L_0x00ff:
        goto L_0x0120;
    L_0x0100:
        r0 = r4.f24052n;
        r1 = r4.f24060v;
        r0 = r0.m13671a(r1);
        r0 = (mobi.mmdt.ott.view.components.mediaviewer.p568b.C7334b) r0;
        goto L_0x0120;
    L_0x010b:
        r0 = r4.f24052n;
        r1 = r4.f24060v;
        r0 = r0.m13671a(r1);
        r0 = (mobi.mmdt.ott.view.components.mediaviewer.p568b.C7336d) r0;
        goto L_0x0120;
    L_0x0116:
        r0 = r4.f24052n;
        r1 = r4.f24060v;
        r0 = r0.m13671a(r1);
        r0 = (mobi.mmdt.ott.view.components.mediaviewer.p568b.C7335c) r0;
    L_0x0120:
        if (r0 == 0) goto L_0x0127;
    L_0x0122:
        r0 = r0.f20678a;
        mobi.mmdt.ott.logic.p261a.p308q.p309a.C2729d.m7072a(r4, r0);
    L_0x0127:
        mobi.mmdt.ott.logic.p261a.p308q.p309a.C2729d.m7071a(r4);
        goto L_0x0184;
    L_0x012b:
        r1 = 2131296326; // 0x7f090046 float:1.8210566E38 double:1.053000296E-314;
        if (r0 != r1) goto L_0x0184;
    L_0x0130:
        r0 = r4.f24044A;
        if (r0 == 0) goto L_0x013f;
    L_0x0134:
        r0 = r4.f24044A;
        r0 = r0.getText();
        r0 = r0.toString();
        goto L_0x0141;
    L_0x013f:
        r0 = "";
    L_0x0141:
        r1 = android.os.Build.VERSION.SDK_INT;
        r2 = 11;
        if (r1 >= r2) goto L_0x0157;
    L_0x0147:
        r1 = mobi.mmdt.ott.MyApplication.m12952b();
        r2 = "clipboard";
        r1 = r1.getSystemService(r2);
        r1 = (android.text.ClipboardManager) r1;
        r1.setText(r0);
        goto L_0x0171;
    L_0x0157:
        r1 = mobi.mmdt.ott.MyApplication.m12952b();
        r2 = "clipboard";
        r1 = r1.getSystemService(r2);
        r1 = (android.content.ClipboardManager) r1;
        r2 = 2131689627; // 0x7f0f009b float:1.9008275E38 double:1.0531946123E-314;
        r2 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r2);
        r0 = android.content.ClipData.newPlainText(r2, r0);
        r1.setPrimaryClip(r0);
    L_0x0171:
        r0 = mobi.mmdt.ott.MyApplication.m12952b();
        r1 = 2131690152; // 0x7f0f02a8 float:1.900934E38 double:1.0531948717E-314;
        r1 = mobi.mmdt.ott.view.tools.C4522p.m8236a(r1);
        r2 = 0;
        r0 = android.widget.Toast.makeText(r0, r1, r2);
        r0.show();
    L_0x0184:
        r5 = super.onOptionsItemSelected(r5);
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.components.mediaviewer.MediaViewerActivity.onOptionsItemSelected(android.view.MenuItem):boolean");
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 187 && iArr.length > 0 && iArr[0] == -1) {
            Bundle bundle = new Bundle();
            bundle.putInt("dialog_id", 92);
            b_(bundle);
        }
    }

    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f24059u = this.f24052n.getItemCount() > 0 ? ((C7188a) this.f24052n.m13671a(this.f24060v)).f20678a : "";
        bundle.putString("KEY_PEER_PARTY", this.f24056r);
        bundle.putString("KEY_TITLE", this.f24057s);
        bundle.putString("KEY_MEDIA_PATH", this.f24059u);
        bundle.putInt("KEY_CURRENT_POSITION", this.f24060v);
    }
}
