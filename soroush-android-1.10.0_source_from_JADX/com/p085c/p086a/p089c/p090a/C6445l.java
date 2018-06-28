package com.p085c.p086a.p089c.p090a;

import android.content.ContentResolver;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract.Contacts;
import java.io.FileNotFoundException;
import java.io.InputStream;

public final class C6445l extends C5112j<InputStream> {
    private static final UriMatcher f17605a;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f17605a = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        f17605a.addURI("com.android.contacts", "contacts/lookup/*", 1);
        f17605a.addURI("com.android.contacts", "contacts/#/photo", 2);
        f17605a.addURI("com.android.contacts", "contacts/#", 3);
        f17605a.addURI("com.android.contacts", "contacts/#/display_photo", 4);
    }

    public C6445l(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    protected final /* synthetic */ Object mo2692a(Uri uri, ContentResolver contentResolver) {
        Object openInputStream;
        int match = f17605a.match(uri);
        if (match != 1) {
            openInputStream = match != 3 ? contentResolver.openInputStream(uri) : Contacts.openContactPhotoInputStream(contentResolver, uri, true);
        } else {
            Uri lookupContact = Contacts.lookupContact(contentResolver, uri);
            if (lookupContact == null) {
                throw new FileNotFoundException("Contact cannot be found");
            }
            openInputStream = Contacts.openContactPhotoInputStream(contentResolver, lookupContact, true);
        }
        if (openInputStream != null) {
            return openInputStream;
        }
        StringBuilder stringBuilder = new StringBuilder("InputStream is null for ");
        stringBuilder.append(uri);
        throw new FileNotFoundException(stringBuilder.toString());
    }

    protected final /* synthetic */ void mo2693a(Object obj) {
        ((InputStream) obj).close();
    }

    public final Class<InputStream> mo1112d() {
        return InputStream.class;
    }
}
