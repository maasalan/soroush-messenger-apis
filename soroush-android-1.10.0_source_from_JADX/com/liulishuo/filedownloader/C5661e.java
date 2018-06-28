package com.liulishuo.filedownloader;

import com.liulishuo.filedownloader.p201d.C2162c;
import com.liulishuo.filedownloader.p201d.C2163d;
import com.liulishuo.filedownloader.p201d.C5659b;
import com.liulishuo.filedownloader.p201d.C5659b.C2161a;

public abstract class C5661e extends C2163d {
    int f15584a;

    public abstract void mo3106a();

    public final boolean mo1919a(C2162c c2162c) {
        if (c2162c instanceof C5659b) {
            this.f15584a = ((C5659b) c2162c).f15582a;
            if (this.f15584a == C2161a.f7227a) {
                mo3106a();
            } else {
                mo3108b();
            }
        }
        return false;
    }

    public abstract void mo3108b();
}
