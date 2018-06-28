package com.google.android.gms.internal;

import com.google.android.gms.common.internal.ac;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

final class bs {
    int f5606a;
    ByteArrayOutputStream f5607b = new ByteArrayOutputStream();
    private /* synthetic */ br f5608c;

    public bs(br brVar) {
        this.f5608c = brVar;
    }

    public final boolean m4626a(bk bkVar) {
        ac.m4376a((Object) bkVar);
        if (this.f5606a + 1 > ax.m4591g()) {
            return false;
        }
        String a = this.f5608c.m16005a(bkVar, false);
        if (a == null) {
            this.f5608c.f6279f.m5160a().m15992a(bkVar, "Error formatting hit");
            return true;
        }
        byte[] bytes = a.getBytes();
        int length = bytes.length;
        if (length > ax.m4587c()) {
            this.f5608c.f6279f.m5160a().m15992a(bkVar, "Hit size exceeds the maximum size limit");
            return true;
        }
        if (this.f5607b.size() > 0) {
            length++;
        }
        if (this.f5607b.size() + length > ((Integer) bf.f5578t.f5585a).intValue()) {
            return false;
        }
        try {
            if (this.f5607b.size() > 0) {
                this.f5607b.write(br.f18095c);
            }
            this.f5607b.write(bytes);
            this.f5606a++;
            return true;
        } catch (IOException e) {
            this.f5608c.m5154e("Failed to write payload when batching hits", e);
            return true;
        }
    }
}
