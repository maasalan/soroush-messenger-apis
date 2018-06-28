package mobi.mmdt.ott.logic.sync;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.content.ContentResolver;
import android.os.Bundle;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.ott.MyApplication;

public final class C2905d {

    static class C29041 implements AccountManagerCallback<Boolean> {
        C29041() {
        }

        public final void run(AccountManagerFuture<Boolean> accountManagerFuture) {
        }
    }

    public static void m7282a() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("force", true);
        bundle.putBoolean("expedited", true);
        Account account = new Account("soroush_account", "soroush-app.ir");
        ((AccountManager) MyApplication.m12952b().getSystemService("account")).addAccountExplicitly(account, null, null);
        ContentResolver.requestSync(account, "com.android.contacts", bundle);
    }

    public static void m7283b() {
        try {
            ((AccountManager) MyApplication.m12952b().getSystemService("account")).removeAccount(new Account("soroush_account", "soroush-app.ir"), new C29041(), null);
        } catch (Throwable e) {
            C2480b.m6737b("Error in removeAccount", e);
        }
    }
}
