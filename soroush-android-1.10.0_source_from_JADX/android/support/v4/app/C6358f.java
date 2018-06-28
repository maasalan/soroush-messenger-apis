package android.support.v4.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnDismissListener;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

public class C6358f extends Fragment implements OnCancelListener, OnDismissListener {
    int f17400a = 0;
    protected int f17401b = 0;
    boolean f17402c = true;
    protected boolean f17403d = true;
    int f17404e = -1;
    protected Dialog f17405f;
    boolean f17406g;
    boolean f17407h;
    boolean f17408i;

    public void mo3305a(Dialog dialog, int i) {
        switch (i) {
            case 1:
            case 2:
                break;
            case 3:
                dialog.getWindow().addFlags(24);
                break;
            default:
                return;
        }
        dialog.requestWindowFeature(1);
    }

    public final void mo2528a(Context context) {
        super.mo2528a(context);
        if (!this.f17408i) {
            this.f17407h = false;
        }
    }

    public void mo3404a(C0390k c0390k, String str) {
        this.f17407h = false;
        this.f17408i = true;
        C0401p a = c0390k.mo254a();
        a.mo237a((Fragment) this, str);
        a.mo242c();
    }

    public final void m14956a(boolean z) {
        if (!this.f17407h) {
            this.f17407h = true;
            this.f17408i = false;
            if (this.f17405f != null) {
                this.f17405f.dismiss();
                this.f17405f = null;
            }
            this.f17406g = true;
            if (this.f17404e >= 0) {
                this.f13173A.mo258b(this.f17404e);
                this.f17404e = -1;
                return;
            }
            C0401p a = this.f13173A.mo254a();
            a.mo236a((Fragment) this);
            if (z) {
                a.mo244d();
            } else {
                a.mo242c();
            }
        }
    }

    public void a_(Bundle bundle) {
        super.a_(bundle);
        this.f17403d = this.G == 0;
        if (bundle != null) {
            this.f17400a = bundle.getInt("android:style", 0);
            this.f17401b = bundle.getInt("android:theme", 0);
            this.f17402c = bundle.getBoolean("android:cancelable", true);
            this.f17403d = bundle.getBoolean("android:showsDialog", this.f17403d);
            this.f17404e = bundle.getInt("android:backStackId", -1);
        }
    }

    public final LayoutInflater mo2530b(Bundle bundle) {
        if (!this.f17403d) {
            return super.mo2530b(bundle);
        }
        Context context;
        this.f17405f = mo2533e();
        if (this.f17405f != null) {
            mo3305a(this.f17405f, this.f17400a);
            context = this.f17405f.getContext();
        } else {
            context = this.B.f13261c;
        }
        return (LayoutInflater) context.getSystemService("layout_inflater");
    }

    public final void mo2481b() {
        super.mo2481b();
        if (this.f17405f != null) {
            this.f17405f.hide();
        }
    }

    public final void mo2531c(Bundle bundle) {
        super.mo2531c(bundle);
        if (this.f17403d) {
            View view = this.f13189Q;
            if (view != null) {
                if (view.getParent() != null) {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                }
                this.f17405f.setContentView(view);
            }
            Activity k = m8911k();
            if (k != null) {
                this.f17405f.setOwnerActivity(k);
            }
            this.f17405f.setCancelable(this.f17402c);
            this.f17405f.setOnCancelListener(this);
            this.f17405f.setOnDismissListener(this);
            if (bundle != null) {
                bundle = bundle.getBundle("android:savedDialogState");
                if (bundle != null) {
                    this.f17405f.onRestoreInstanceState(bundle);
                }
            }
        }
    }

    public final void mo2532d(Bundle bundle) {
        super.mo2532d(bundle);
        if (this.f17405f != null) {
            Bundle onSaveInstanceState = this.f17405f.onSaveInstanceState();
            if (onSaveInstanceState != null) {
                bundle.putBundle("android:savedDialogState", onSaveInstanceState);
            }
        }
        if (this.f17400a != 0) {
            bundle.putInt("android:style", this.f17400a);
        }
        if (this.f17401b != 0) {
            bundle.putInt("android:theme", this.f17401b);
        }
        if (!this.f17402c) {
            bundle.putBoolean("android:cancelable", this.f17402c);
        }
        if (!this.f17403d) {
            bundle.putBoolean("android:showsDialog", this.f17403d);
        }
        if (this.f17404e != -1) {
            bundle.putInt("android:backStackId", this.f17404e);
        }
    }

    public Dialog mo2533e() {
        return new Dialog(m8911k(), this.f17401b);
    }

    public final void mo2534f() {
        super.mo2534f();
        if (!this.f17408i && !this.f17407h) {
            this.f17407h = true;
        }
    }

    public final void mo2535g() {
        super.mo2535g();
        if (this.f17405f != null) {
            this.f17406g = false;
            this.f17405f.show();
        }
    }

    public final void mo2536h() {
        super.mo2536h();
        if (this.f17405f != null) {
            this.f17406g = true;
            this.f17405f.dismiss();
            this.f17405f = null;
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.f17406g) {
            m14956a(true);
        }
    }
}
