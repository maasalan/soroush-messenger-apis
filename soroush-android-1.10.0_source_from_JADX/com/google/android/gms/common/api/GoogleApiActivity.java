package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.Dialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.C1771k;
import com.google.android.gms.common.C5458b;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.C1723g;
import com.google.android.gms.common.internal.ba;

public class GoogleApiActivity extends Activity implements OnCancelListener {
    private int f5210a = 0;

    public static PendingIntent m4304a(Context context, PendingIntent pendingIntent, int i) {
        return PendingIntent.getActivity(context, 0, m4305a(context, pendingIntent, i, true), 134217728);
    }

    public static Intent m4305a(Context context, PendingIntent pendingIntent, int i, boolean z) {
        Intent intent = new Intent(context, GoogleApiActivity.class);
        intent.putExtra("pending_intent", pendingIntent);
        intent.putExtra("failing_client_id", i);
        intent.putExtra("notify_manager", z);
        return intent;
    }

    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.f5210a = 0;
            setResult(i2, intent);
            if (booleanExtra) {
                C1723g a = C1723g.m4333a((Context) this);
                switch (i2) {
                    case -1:
                        a.m4347a();
                        break;
                    case 0:
                        a.m4349b(new ConnectionResult(13, null), getIntent().getIntExtra("failing_client_id", -1));
                        break;
                    default:
                        break;
                }
            }
        } else if (i == 2) {
            this.f5210a = 0;
            setResult(i2, intent);
        }
        finish();
    }

    public void onCancel(DialogInterface dialogInterface) {
        this.f5210a = 0;
        setResult(0);
        finish();
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f5210a = bundle.getInt("resolution");
        }
        if (this.f5210a != 1) {
            String str;
            String str2;
            bundle = getIntent().getExtras();
            if (bundle == null) {
                str = "GoogleApiActivity";
                str2 = "Activity started without extras";
            } else {
                PendingIntent pendingIntent = (PendingIntent) bundle.get("pending_intent");
                Integer num = (Integer) bundle.get("error_code");
                if (pendingIntent == null && num == null) {
                    str = "GoogleApiActivity";
                    str2 = "Activity started without resolution";
                } else if (pendingIntent != null) {
                    try {
                        startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
                        this.f5210a = 1;
                        return;
                    } catch (Throwable e) {
                        Log.e("GoogleApiActivity", "Failed to launch pendingIntent", e);
                    }
                } else {
                    C5458b.m11789a();
                    int intValue = num.intValue();
                    Dialog a = C5458b.m11787a((Context) this, intValue, ba.m4445a((Activity) this, C1771k.m4471a((Context) this, intValue, "d")), (OnCancelListener) this);
                    if (a != null) {
                        C5458b.m11790a((Activity) this, a, "GooglePlayServicesErrorDialog", (OnCancelListener) this);
                    }
                    this.f5210a = 1;
                }
            }
            Log.e(str, str2);
            finish();
        }
    }

    protected void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.f5210a);
        super.onSaveInstanceState(bundle);
    }
}
