package org.linphone.customized;

import org.linphone.core.LinphoneCall;
import org.linphone.core.LinphoneCall.State;
import org.linphone.core.LinphoneCore.RegistrationState;
import org.linphone.customized.CustomizedCallManager.AudioAction;

public interface ICustomizedListener {
    String onAudioStateChanged(AudioAction audioAction, boolean z);

    String onCallStateChanged(LinphoneCall linphoneCall, State state, String str);

    String onRegistrationStateChanged(RegistrationState registrationState, String str);
}
