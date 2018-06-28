package mobi.mmdt.ott.view.newdesign.mainpage;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;
import mobi.mmdt.ott.MyApplication;

public final class C4280e implements OnClickListener {
    public final void onClick(View view) {
        Intent intent = new Intent("android.intent.action.VIEW");
        StringBuilder stringBuilder = new StringBuilder("market://details?id=");
        stringBuilder.append(MyApplication.m12952b().getPackageName());
        intent.setData(Uri.parse(stringBuilder.toString()));
        intent.setFlags(268435456);
        MyApplication.m12952b().startActivity(intent);
    }
}
