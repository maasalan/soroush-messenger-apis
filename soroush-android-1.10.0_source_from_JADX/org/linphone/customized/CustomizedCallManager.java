package org.linphone.customized;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import android.widget.Toast;
import mobi.mmdt.componentsutils.b.c.b;
import mobi.mmdt.ott.b.a.a;
import mobi.mmdt.ott.b.a.c;
import org.linphone.LinphoneManager;
import org.linphone.LinphonePreferences;
import org.linphone.LinphonePreferences.AccountBuilder;
import org.linphone.LinphoneUtils;
import org.linphone.core.LinphoneAddress;
import org.linphone.core.LinphoneAddress.TransportType;
import org.linphone.core.LinphoneCall;
import org.linphone.core.LinphoneCall.State;
import org.linphone.core.LinphoneCallParams;
import org.linphone.core.LinphoneCore.RegistrationState;
import org.linphone.core.LinphoneCoreFactory;
import org.linphone.mediastream.Log;

public class CustomizedCallManager implements CustomizedICall, ICustomizedListener {
    private static final String SHARED_PREF_CURRENT_CALL = "CURRENT_CALL";
    private static final String SHARED_PREF_MUTE_STATE = "MUTE_STATE";
    private static final String SHARED_PREF_SPEAKER_STATE = "SPEAKER_STATE";
    private static CustomizedCallManager mInstance;
    private ICustomizedListener mListener;

    public enum AudioAction {
        SPEAKER,
        MUTE,
        HOLD,
        BLUETOOTH
    }

    private CustomizedCallManager() {
    }

    private CustomizedCallManager(ICustomizedListener iCustomizedListener) {
        if (this.mListener == null) {
            this.mListener = iCustomizedListener;
        }
    }

    private void deleteAccounts(Context context) {
        LinphonePreferences instance = LinphonePreferences.instance(context);
        int accountCount = instance.getAccountCount();
        for (int i = 0; i < accountCount; i++) {
            instance.deleteAccount(0);
        }
    }

    public static CustomizedCallManager getInstance() {
        if (mInstance == null) {
            mInstance = new CustomizedCallManager();
        }
        return mInstance;
    }

    public static CustomizedCallManager getInstance(ICustomizedListener iCustomizedListener) {
        if (mInstance == null || mInstance.mListener == null) {
            mInstance = new CustomizedCallManager(iCustomizedListener);
        }
        return mInstance;
    }

    private void initPreferences(Context context) {
        Editor edit = context.getApplicationContext().getSharedPreferences("org.linphone.customized.CustomizedCallManager", 0).edit();
        edit.putString(SHARED_PREF_CURRENT_CALL, null);
        edit.putBoolean(SHARED_PREF_MUTE_STATE, false);
        edit.putBoolean(SHARED_PREF_SPEAKER_STATE, false);
        edit.apply();
    }

    private LinphoneAddress saveCreatedAccount(Context context, String str, String str2, String str3, String str4, int i, TransportType transportType) {
        LinphonePreferences instance = LinphonePreferences.instance(context);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str4);
        stringBuilder.append(":");
        stringBuilder.append(i);
        str4 = stringBuilder.toString();
        StringBuilder stringBuilder2 = new StringBuilder("sip:");
        stringBuilder2.append(str);
        stringBuilder2.append("@");
        stringBuilder2.append(str4);
        String stringBuilder3 = stringBuilder2.toString();
        instance.useRandomPort(false, true);
        try {
            LinphoneAddress createLinphoneAddress = LinphoneCoreFactory.instance().createLinphoneAddress(stringBuilder3);
            if (!(str3 == null || str3.equals(""))) {
                createLinphoneAddress.setDisplayName(str3);
            }
            boolean equals = str4.equals(context.getString(c.default_domain));
            AccountBuilder expires = new AccountBuilder(LinphoneManager.getInstance(context).getLinphoneLc(context)).setUsername(str).setDomain(str4).setDisplayName(str3).setPassword(str2).setExpires("60");
            if (equals) {
                AccountBuilder proxy;
                TransportType transportType2;
                if (context.getResources().getBoolean(a.disable_all_security_features_for_markets)) {
                    proxy = expires.setProxy(str4);
                    transportType2 = TransportType.LinphoneTransportTcp;
                } else {
                    proxy = expires.setProxy(str4);
                    transportType2 = TransportType.LinphoneTransportTls;
                }
                proxy.setTransport(transportType2);
            } else {
                Object obj = "";
                if (!TextUtils.isEmpty(obj)) {
                    expires.setProxy(obj).setOutboundProxyEnabled(true).setAvpfRRInterval(5);
                }
                if (transportType != null) {
                    expires.setTransport(transportType);
                }
            }
            try {
                expires.saveNewAccount();
                return null;
            } catch (Throwable e) {
                b.b("Error in saveCreatedAccount 2", e);
                return null;
            }
        } catch (Throwable e2) {
            b.b("Error in saveCreatedAccount", e2);
            return null;
        }
    }

    public void answer(Context context) {
        initPreferences(context);
        if (LinphoneManager.getLcIfManagerNotDestroyedOrNull() != null) {
            for (LinphoneCall linphoneCall : LinphoneUtils.getLinphoneCalls(LinphoneManager.getInstance(context).getLinphoneLc(context))) {
                if (State.IncomingReceived == linphoneCall.getState()) {
                    break;
                }
            }
        }
        LinphoneCall linphoneCall2 = null;
        LinphoneCallParams createCallParams = LinphoneManager.getInstance(context).getLinphoneLc(context).createCallParams(linphoneCall2);
        boolean isHighBandwidthConnection = LinphoneUtils.isHighBandwidthConnection(context) ^ true;
        if (createCallParams != null) {
            createCallParams.enableLowBandwidth(isHighBandwidthConnection);
        } else {
            Log.m22095e("Could not create call params for call");
        }
        if (createCallParams == null || !LinphoneManager.getInstance(context).acceptCallWithParams(linphoneCall2, createCallParams)) {
            Toast.makeText(context, c.couldnt_accept_call, 1).show();
        }
    }

    public void call(Context context, String str) {
        LinphoneManager.getInstance(context).newOutgoingCall(str, str);
    }

    public LinphoneCall getCurrentCall(Context context) {
        return LinphoneManager.getInstance(context).getLinphoneLc(context).getCurrentCall();
    }

    public int getDuration(Context context) {
        LinphoneCall currentCall = LinphoneManager.getInstance(context).getLinphoneLc(context).getCurrentCall();
        return currentCall != null ? currentCall.getDuration() : -1;
    }

    public void hangUp(Context context) {
        LinphoneManager.getInstance(context).getLinphoneLc(context).terminateAllCalls();
    }

    public boolean isInCall(Context context) {
        LinphoneCall[] calls = LinphoneManager.getInstance(context).getLinphoneLc(context).getCalls();
        return calls != null && calls.length > 0;
    }

    public String onAudioStateChanged(AudioAction audioAction, boolean z) {
        Object[] objArr;
        if (this.mListener != null) {
            this.mListener.onAudioStateChanged(audioAction, z);
        }
        StringBuilder stringBuilder;
        switch (audioAction) {
            case SPEAKER:
                objArr = new Object[1];
                stringBuilder = new StringBuilder("CustomizedCallManager-->onSpeakerStateChanged(): Set Speaker State to ");
                stringBuilder.append(z);
                objArr[0] = stringBuilder.toString();
                break;
            case MUTE:
                objArr = new Object[1];
                stringBuilder = new StringBuilder("CustomizedCallManager-->onMuteStateChanged(): Set Mute State to ");
                stringBuilder.append(z);
                objArr[0] = stringBuilder.toString();
                break;
            case HOLD:
                objArr = new Object[1];
                stringBuilder = new StringBuilder("CustomizedCallManager-->onMuteStateChanged(): Set Hold State to ");
                stringBuilder.append(z);
                objArr[0] = stringBuilder.toString();
                break;
            default:
                break;
        }
        Log.m22099i(objArr);
        return null;
    }

    public String onCallStateChanged(LinphoneCall linphoneCall, State state, String str) {
        if (this.mListener != null) {
            this.mListener.onCallStateChanged(linphoneCall, state, str);
        }
        Object[] objArr = new Object[1];
        StringBuilder stringBuilder = new StringBuilder("CustomizedCallManager-->onCallStateChanged(): New call state [");
        stringBuilder.append(state);
        stringBuilder.append("]");
        objArr[0] = stringBuilder.toString();
        Log.m22099i(objArr);
        if (state.equals(State.Error)) {
            Object[] objArr2 = new Object[1];
            StringBuilder stringBuilder2 = new StringBuilder("New call state");
            stringBuilder2.append(state);
            stringBuilder2.append(",");
            stringBuilder2.append(state.value());
            stringBuilder2.append(",");
            stringBuilder2.append(str);
            objArr2[0] = stringBuilder2.toString();
            Log.m22099i(objArr2);
        }
        return state.toString();
    }

    public String onRegistrationStateChanged(RegistrationState registrationState, String str) {
        if (this.mListener != null) {
            this.mListener.onRegistrationStateChanged(registrationState, str);
        }
        return registrationState.toString();
    }

    public void register(Context context, String str, String str2, String str3, String str4, int i, TransportType transportType) {
        saveCreatedAccount(context, str, str2, str3, str4, i, transportType);
    }

    public void setHold(Context context, boolean z) {
        LinphoneCall[] calls = LinphoneManager.getInstance(context).getLinphoneLc(context).getCalls();
        LinphoneCall linphoneCall = (calls == null || calls.length <= 0) ? null : calls[0];
        if (linphoneCall != null) {
            if (z) {
                LinphoneManager.getInstance(context).routeAudioToHold(linphoneCall);
                return;
            }
            LinphoneManager.getInstance(context).routeAudioToUnHold(linphoneCall);
        }
    }

    public void setMute(Context context, boolean z) {
        LinphoneManager.getInstance(context).routeAudioToMute(z);
    }

    public void setSpeaker(Context context, boolean z) {
        if (z) {
            LinphoneManager.getInstance(context).routeAudioToSpeaker();
        } else {
            LinphoneManager.getInstance(context).routeAudioToReceiver();
        }
    }

    public void unRegister(Context context) {
        deleteAccounts(context);
    }
}
