package mobi.mmdt.ott.logic.sync;

import android.accounts.AbstractAccountAuthenticator;
import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.os.Bundle;
import mobi.mmdt.ott.MyApplication;
import mobi.mmdt.ott.p246d.p248b.C2535a;

public final class C2901a extends AbstractAccountAuthenticator {
    public C2901a() {
        super(MyApplication.m12952b());
    }

    public final Bundle addAccount(AccountAuthenticatorResponse accountAuthenticatorResponse, String str, String str2, String[] strArr, Bundle bundle) {
        return null;
    }

    public final Bundle confirmCredentials(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, Bundle bundle) {
        return null;
    }

    public final Bundle editProperties(AccountAuthenticatorResponse accountAuthenticatorResponse, String str) {
        throw new UnsupportedOperationException();
    }

    public final Bundle getAccountRemovalAllowed(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account) {
        C2535a.m6888a().f8278a.edit().putBoolean("mobi.mmdt.ott.model.pref.KEY_SYNC_ACCOUNT_STATUS", true).apply();
        return super.getAccountRemovalAllowed(accountAuthenticatorResponse, account);
    }

    public final Bundle getAuthToken(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, String str, Bundle bundle) {
        throw new UnsupportedOperationException();
    }

    public final String getAuthTokenLabel(String str) {
        throw new UnsupportedOperationException();
    }

    public final Bundle hasFeatures(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, String[] strArr) {
        throw new UnsupportedOperationException();
    }

    public final Bundle updateCredentials(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, String str, Bundle bundle) {
        throw new UnsupportedOperationException();
    }
}
