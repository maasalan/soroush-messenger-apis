package mobi.mmdt.ott.view.components.p401c;

import android.database.Cursor;
import android.widget.Filter;
import android.widget.Filter.FilterResults;

final class C3125h extends Filter {
    C3124a f9707a;

    interface C3124a {
        Cursor mo2237a();

        Cursor mo2238a(CharSequence charSequence);

        CharSequence mo2239a(Cursor cursor);

        void mo2240b(Cursor cursor);
    }

    C3125h(C3124a c3124a) {
        this.f9707a = c3124a;
    }

    public final CharSequence convertResultToString(Object obj) {
        return this.f9707a.mo2239a((Cursor) obj);
    }

    protected final android.widget.Filter.FilterResults performFiltering(java.lang.CharSequence r3) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Can't find immediate dominator for block B:6:0x001b in {2, 4, 5} preds:[]
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.computeDominators(BlockProcessor.java:129)
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:48)
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:38)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r2 = this;
        r0 = r2.f9707a;
        r3 = r0.mo2238a(r3);
        r0 = new android.widget.Filter$FilterResults;
        r0.<init>();
        if (r3 == 0) goto L_0x0016;
    L_0x000d:
        r1 = r3.getCount();
        r0.count = r1;
    L_0x0013:
        r0.values = r3;
        return r0;
    L_0x0016:
        r3 = 0;
        r0.count = r3;
        r3 = 0;
        goto L_0x0013;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.components.c.h.performFiltering(java.lang.CharSequence):android.widget.Filter$FilterResults");
    }

    protected final void publishResults(CharSequence charSequence, FilterResults filterResults) {
        Cursor a = this.f9707a.mo2237a();
        if (filterResults.values != null && filterResults.values != a) {
            this.f9707a.mo2240b((Cursor) filterResults.values);
        }
    }
}
