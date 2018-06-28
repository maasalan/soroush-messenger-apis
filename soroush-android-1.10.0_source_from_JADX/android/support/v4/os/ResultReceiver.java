package android.support.v4.os;

import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.v4.os.C0508b.C4823a;

public class ResultReceiver implements Parcelable {
    public static final Creator<ResultReceiver> CREATOR = new C05051();
    final boolean f1728a = false;
    final Handler f1729b = null;
    C0508b f1730c;

    static class C05051 implements Creator<ResultReceiver> {
        C05051() {
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ResultReceiver(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ResultReceiver[i];
        }
    }

    class C0506b implements Runnable {
        final int f1725a;
        final Bundle f1726b;
        final /* synthetic */ ResultReceiver f1727c;

        C0506b(ResultReceiver resultReceiver, int i, Bundle bundle) {
            this.f1727c = resultReceiver;
            this.f1725a = i;
            this.f1726b = bundle;
        }

        public final void run() {
            this.f1727c.mo310a(this.f1725a, this.f1726b);
        }
    }

    class C6369a extends C4823a {
        final /* synthetic */ ResultReceiver f17418a;

        C6369a(ResultReceiver resultReceiver) {
            this.f17418a = resultReceiver;
        }

        public final void mo380a(int i, Bundle bundle) {
            if (this.f17418a.f1729b != null) {
                this.f17418a.f1729b.post(new C0506b(this.f17418a, i, bundle));
            } else {
                this.f17418a.mo310a(i, bundle);
            }
        }
    }

    ResultReceiver(Parcel parcel) {
        this.f1730c = C4823a.m9277a(parcel.readStrongBinder());
    }

    public void mo310a(int i, Bundle bundle) {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            if (this.f1730c == null) {
                this.f1730c = new C6369a(this);
            }
            parcel.writeStrongBinder(this.f1730c.asBinder());
        }
    }
}
