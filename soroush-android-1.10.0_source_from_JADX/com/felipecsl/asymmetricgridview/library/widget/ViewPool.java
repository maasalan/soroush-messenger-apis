package com.felipecsl.asymmetricgridview.library.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import java.util.Stack;

class ViewPool<T extends View> implements Parcelable {
    Stack<T> f4983a;
    C1608g<T> f4984b;
    C1604a f4985c;

    static class C1604a {
        int f4979a = 0;
        int f4980b = 0;
        int f4981c = 0;
        int f4982d = 0;

        C1604a() {
        }
    }

    ViewPool() {
        this.f4983a = new Stack();
        this.f4984b = null;
        this.f4985c = new C1604a();
    }

    ViewPool(C1608g<T> c1608g) {
        this.f4983a = new Stack();
        this.f4984b = null;
        this.f4984b = c1608g;
    }

    final T m4137a() {
        if (this.f4983a.size() > 0) {
            C1604a c1604a = this.f4985c;
            c1604a.f4980b++;
            c1604a = this.f4985c;
            c1604a.f4979a--;
            return (View) this.f4983a.pop();
        }
        c1604a = this.f4985c;
        c1604a.f4981c++;
        T a = this.f4984b != null ? this.f4984b.mo1506a() : null;
        if (a != null) {
            C1604a c1604a2 = this.f4985c;
            c1604a2.f4982d++;
        }
        return a;
    }

    final void m4138a(T t) {
        this.f4983a.push(t);
        C1604a c1604a = this.f4985c;
        c1604a.f4979a++;
    }

    final void m4139b() {
        this.f4985c = new C1604a();
        this.f4983a.clear();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
    }
}
