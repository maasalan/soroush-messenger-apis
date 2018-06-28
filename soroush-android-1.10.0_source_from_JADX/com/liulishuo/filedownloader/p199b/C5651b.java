package com.liulishuo.filedownloader.p199b;

import android.util.SparseArray;
import com.liulishuo.filedownloader.model.C2210a;
import com.liulishuo.filedownloader.model.FileDownloadModel;
import com.liulishuo.filedownloader.p199b.C2137a.C2136a;
import com.liulishuo.filedownloader.p205h.C2182d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class C5651b implements C2137a {
    final SparseArray<FileDownloadModel> f15509a = new SparseArray();
    final SparseArray<List<C2210a>> f15510b = new SparseArray();

    class C2138b implements Iterator<FileDownloadModel> {
        final /* synthetic */ C5651b f7126a;

        C2138b(C5651b c5651b) {
            this.f7126a = c5651b;
        }

        public final boolean hasNext() {
            return false;
        }

        public final /* bridge */ /* synthetic */ Object next() {
            return null;
        }

        public final void remove() {
        }
    }

    class C5650a implements C2136a {
        final /* synthetic */ C5651b f15508a;

        C5650a(C5651b c5651b) {
            this.f15508a = c5651b;
        }

        public final void mo1837a() {
        }

        public final void mo1838a(int i, FileDownloadModel fileDownloadModel) {
        }

        public final void mo1839a(FileDownloadModel fileDownloadModel) {
        }

        public final Iterator<FileDownloadModel> iterator() {
            return new C2138b(this.f15508a);
        }
    }

    public final void mo1840a() {
        this.f15509a.clear();
    }

    public final void mo1841a(int i) {
    }

    public final void mo1842a(int i, int i2) {
    }

    public final void mo1843a(int i, int i2, long j) {
        List<C2210a> list = (List) this.f15510b.get(i);
        if (list != null) {
            for (C2210a c2210a : list) {
                if (c2210a.f7306b == i2) {
                    c2210a.f7308d = j;
                    break;
                }
            }
        }
    }

    public final void mo1844a(int i, long j) {
    }

    public final void mo1845a(int i, long j, String str, String str2) {
    }

    public final void mo1846a(int i, String str, long j, long j2, int i2) {
    }

    public final void mo1847a(int i, Throwable th) {
    }

    public final void mo1848a(int i, Throwable th, long j) {
    }

    public final void mo1849a(FileDownloadModel fileDownloadModel) {
        if (fileDownloadModel == null) {
            C2182d.m5984d(this, "update but model == null!", new Object[0]);
        } else if (mo1852b(fileDownloadModel.f7290a) != null) {
            this.f15509a.remove(fileDownloadModel.f7290a);
            this.f15509a.put(fileDownloadModel.f7290a, fileDownloadModel);
        } else {
            this.f15509a.put(fileDownloadModel.f7290a, fileDownloadModel);
        }
    }

    public final void mo1850a(C2210a c2210a) {
        int i = c2210a.f7305a;
        List list = (List) this.f15510b.get(i);
        if (list == null) {
            list = new ArrayList();
            this.f15510b.put(i, list);
        }
        list.add(c2210a);
    }

    public final C2136a mo1851b() {
        return new C5650a(this);
    }

    public final FileDownloadModel mo1852b(int i) {
        return (FileDownloadModel) this.f15509a.get(i);
    }

    public final void mo1853b(int i, long j) {
    }

    public final List<C2210a> mo1854c(int i) {
        List<C2210a> arrayList = new ArrayList();
        List list = (List) this.f15510b.get(i);
        if (list != null) {
            arrayList.addAll(list);
        }
        return arrayList;
    }

    public final void mo1855d(int i) {
        this.f15510b.remove(i);
    }

    public final boolean mo1856e(int i) {
        this.f15509a.remove(i);
        return true;
    }

    public final void mo1857f(int i) {
        mo1856e(i);
    }

    public final void mo1858g(int i) {
    }
}
