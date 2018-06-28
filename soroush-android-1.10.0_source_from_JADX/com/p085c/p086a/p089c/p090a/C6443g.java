package com.p085c.p086a.p089c.p090a;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.FileNotFoundException;
import org.jivesoftware.smack.sm.packet.StreamManagement.AckRequest;

public final class C6443g extends C5112j<ParcelFileDescriptor> {
    public C6443g(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    protected final /* synthetic */ Object mo2692a(Uri uri, ContentResolver contentResolver) {
        AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, AckRequest.ELEMENT);
        if (openAssetFileDescriptor != null) {
            return openAssetFileDescriptor.getParcelFileDescriptor();
        }
        StringBuilder stringBuilder = new StringBuilder("FileDescriptor is null for: ");
        stringBuilder.append(uri);
        throw new FileNotFoundException(stringBuilder.toString());
    }

    protected final /* synthetic */ void mo2693a(Object obj) {
        ((ParcelFileDescriptor) obj).close();
    }

    public final Class<ParcelFileDescriptor> mo1112d() {
        return ParcelFileDescriptor.class;
    }
}
