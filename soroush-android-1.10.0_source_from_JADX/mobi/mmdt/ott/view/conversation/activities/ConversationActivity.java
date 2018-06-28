package mobi.mmdt.ott.view.conversation.activities;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.p341b.C2776a;
import mobi.mmdt.ott.provider.p384f.C2973m;
import mobi.mmdt.ott.provider.p385g.C2978e;
import mobi.mmdt.ott.view.components.p398a.C7175a.C3101a;
import mobi.mmdt.ott.view.components.p401c.C6829g;
import mobi.mmdt.ott.view.components.p402d.C7576b;
import mobi.mmdt.ott.view.conversation.activities.p419a.C6123a;
import mobi.mmdt.ott.view.conversation.activities.p419a.C6873b;
import mobi.mmdt.ott.view.conversation.activities.p419a.C6874c;
import mobi.mmdt.ott.view.conversation.activities.p419a.C6875d;
import mobi.mmdt.ott.view.conversation.activities.p419a.C6876e;
import mobi.mmdt.ott.view.conversation.activities.p419a.C6877f;
import mobi.mmdt.ott.view.conversation.activities.p419a.p420a.C3315b;
import mobi.mmdt.ott.view.conversation.activities.p419a.p420a.p422b.C7340a;
import mobi.mmdt.ott.view.conversation.activities.p419a.p423b.C3343d;
import mobi.mmdt.ott.view.tools.p482f.C4507a;

public class ConversationActivity extends C7576b implements C3101a, C3315b {
    private C6123a f24110m;

    static /* synthetic */ class C32911 {
        static final /* synthetic */ int[] f10062a = new int[C3383b.m7839a().length];

        static {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r0 = mobi.mmdt.ott.view.conversation.activities.C3383b.m7839a();
            r0 = r0.length;
            r0 = new int[r0];
            f10062a = r0;
            r0 = 1;
            r1 = f10062a;	 Catch:{ NoSuchFieldError -> 0x0011 }
            r2 = mobi.mmdt.ott.view.conversation.activities.C3383b.f10379a;	 Catch:{ NoSuchFieldError -> 0x0011 }
            r2 = r2 - r0;	 Catch:{ NoSuchFieldError -> 0x0011 }
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x0011 }
        L_0x0011:
            r1 = f10062a;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r2 = mobi.mmdt.ott.view.conversation.activities.C3383b.f10381c;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r2 = r2 - r0;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r3 = 2;	 Catch:{ NoSuchFieldError -> 0x0019 }
            r1[r2] = r3;	 Catch:{ NoSuchFieldError -> 0x0019 }
        L_0x0019:
            r1 = f10062a;	 Catch:{ NoSuchFieldError -> 0x0021 }
            r2 = mobi.mmdt.ott.view.conversation.activities.C3383b.f10380b;	 Catch:{ NoSuchFieldError -> 0x0021 }
            r2 = r2 - r0;	 Catch:{ NoSuchFieldError -> 0x0021 }
            r3 = 3;	 Catch:{ NoSuchFieldError -> 0x0021 }
            r1[r2] = r3;	 Catch:{ NoSuchFieldError -> 0x0021 }
        L_0x0021:
            r1 = f10062a;	 Catch:{ NoSuchFieldError -> 0x0029 }
            r2 = mobi.mmdt.ott.view.conversation.activities.C3383b.f10382d;	 Catch:{ NoSuchFieldError -> 0x0029 }
            r2 = r2 - r0;	 Catch:{ NoSuchFieldError -> 0x0029 }
            r3 = 4;	 Catch:{ NoSuchFieldError -> 0x0029 }
            r1[r2] = r3;	 Catch:{ NoSuchFieldError -> 0x0029 }
        L_0x0029:
            r1 = f10062a;	 Catch:{ NoSuchFieldError -> 0x0031 }
            r2 = mobi.mmdt.ott.view.conversation.activities.C3383b.f10383e;	 Catch:{ NoSuchFieldError -> 0x0031 }
            r2 = r2 - r0;	 Catch:{ NoSuchFieldError -> 0x0031 }
            r0 = 5;	 Catch:{ NoSuchFieldError -> 0x0031 }
            r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x0031 }
        L_0x0031:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.conversation.activities.ConversationActivity.1.<clinit>():void");
        }
    }

    public final Dialog mo2299a(Bundle bundle) {
        return this.f24110m.mo2299a(bundle);
    }

    public final void mo3664a(C6829g c6829g) {
        C2978e c2978e;
        C3343d c3343d = this.f24110m.ag;
        C7340a c7340a = (C7340a) c6829g;
        switch (c6829g.f19503j) {
            case 2:
                c2978e = C2978e.GROUP;
                break;
            case 3:
                c2978e = C2978e.CHANNEL;
                break;
            case 5:
                c2978e = C2978e.BOT;
                break;
            default:
                c2978e = C2978e.SINGLE;
                break;
        }
        int ordinal = c2978e.ordinal();
        if (c3343d.f10269h.containsKey(c7340a.f20832z)) {
            c3343d.f10269h.remove(c7340a.f20832z);
        } else {
            c3343d.f10269h.put(c7340a.f20832z, Integer.valueOf(ordinal));
        }
        c3343d.f10266e.notifyItemChanged(c7340a.f19504k);
        c3343d.m7824a();
    }

    public final void b_(Bundle bundle) {
        super.b_(bundle);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.f24110m.mo2303a(i, i2, intent);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    public void onBackPressed() {
        this.f24110m.mo2330e();
    }

    protected void onCreate(Bundle bundle) {
        boolean z;
        String str;
        String str2;
        String stringExtra;
        super.onCreate(bundle);
        setContentView((int) R.layout.actvity_conversation_main);
        m20725t();
        C4507a.m8206a((Activity) this, findViewById(R.id.image_bg), false);
        int i = C3383b.f10379a;
        String str3 = null;
        if (getIntent() == null || getIntent().getExtras() == null) {
            z = false;
            str = null;
            str2 = str;
        } else {
            stringExtra = getIntent().getStringExtra("KEY_PARTY");
            boolean booleanExtra = getIntent().getBooleanExtra("isOpenByLink", false);
            String stringExtra2 = getIntent().getStringExtra("KEY_LAST_POSITION");
            if (!(bundle != null || stringExtra2 == null || stringExtra2.equals("0"))) {
                str3 = stringExtra2;
            }
            str = stringExtra;
            z = booleanExtra;
            i = C3383b.m7839a()[getIntent().getExtras().getInt("KEY_START_KIND")];
            str2 = str3;
        }
        switch (C32911.f10062a[i - 1]) {
            case 1:
                this.f24110m = new C6877f(this, getIntent(), str, str2, C2973m.SINGLE);
                stringExtra = "SingleConversationView";
                break;
            case 2:
                this.f24110m = new C6875d(this, getIntent(), str, str2, C2973m.CHANNEL, z);
                stringExtra = "ChannelConversationView";
                break;
            case 3:
                this.f24110m = new C6876e(this, getIntent(), str, str2, C2973m.GROUP);
                stringExtra = "GroupConversationView";
                break;
            case 4:
                this.f24110m = new C6874c(this, getIntent(), str, C2973m.SINGLE);
                stringExtra = "BulkMessageConversationView";
                break;
            case 5:
                this.f24110m = new C6873b(this, getIntent(), str, C2973m.BOT);
                stringExtra = "BotMessageConversationView";
                break;
            default:
                break;
        }
        C2776a.m7091a(stringExtra);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.container);
        this.f24110m.mo2318b(bundle);
        frameLayout.addView(this.f24110m.m14008f());
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu) | this.f24110m.mo3210a(menu);
    }

    protected void onDestroy() {
        super.onDestroy();
        this.f24110m.mo2326d();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public void onLoadMoreClicked(View view) {
        this.f24110m.onLoadMoreClicked(view);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return super.onOptionsItemSelected(menuItem) | this.f24110m.mo2315a(menuItem);
    }

    protected void onPause() {
        super.onPause();
        this.f24110m.mo2316b();
    }

    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        this.f24110m.mo2323c(bundle);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        this.f24110m.mo2304a(i, iArr);
    }

    protected void onRestart() {
        super.onRestart();
    }

    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
    }

    protected void onResume() {
        super.onResume();
        this.f24110m.mo2300a();
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f24110m.mo2327d(bundle);
    }

    protected void onStart() {
        super.onStart();
    }

    protected void onStop() {
        this.f24110m.mo2322c();
        super.onStop();
    }

    public void onUserInteraction() {
        super.onUserInteraction();
    }

    public void onUserLeaveHint() {
        super.onUserLeaveHint();
    }
}
