package com.google.android.gms.common.internal;

import android.content.Intent;
import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import org.jivesoftware.smackx.message_correct.element.MessageCorrectExtension;

public final class C1761j {
    private static final Uri f5407a;
    private static final Uri f5408b;

    static {
        Uri parse = Uri.parse("https://plus.google.com/");
        f5407a = parse;
        f5408b = parse.buildUpon().appendPath("circles").appendPath("find").build();
    }

    public static Intent m4457a() {
        Intent intent = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
        intent.setPackage("com.google.android.wearable.app");
        return intent;
    }

    public static Intent m4458a(String str) {
        Uri fromParts = Uri.fromParts("package", str, null);
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(fromParts);
        return intent;
    }

    public static Intent m4459a(String str, String str2) {
        Intent intent = new Intent("android.intent.action.VIEW");
        Builder appendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter(MessageCorrectExtension.ID_TAG, str);
        if (!TextUtils.isEmpty(str2)) {
            appendQueryParameter.appendQueryParameter("pcampaignid", str2);
        }
        intent.setData(appendQueryParameter.build());
        intent.setPackage("com.android.vending");
        intent.addFlags(524288);
        return intent;
    }
}
