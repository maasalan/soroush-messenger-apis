package org.linphone;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.hardware.SensorEvent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.os.Vibrator;
import android.provider.Settings.System;
import android.telephony.TelephonyManager;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.HashSet;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;
import mobi.mmdt.componentsutils.b.j;
import mobi.mmdt.ott.b.a.a;
import mobi.mmdt.ott.b.a.b;
import mobi.mmdt.ott.b.a.c;
import org.linphone.core.CallDirection;
import org.linphone.core.LinphoneAddress;
import org.linphone.core.LinphoneCall;
import org.linphone.core.LinphoneCall.State;
import org.linphone.core.LinphoneCallParams;
import org.linphone.core.LinphoneCallStats;
import org.linphone.core.LinphoneChatMessage;
import org.linphone.core.LinphoneChatRoom;
import org.linphone.core.LinphoneContent;
import org.linphone.core.LinphoneCore;
import org.linphone.core.LinphoneCore.EcCalibratorStatus;
import org.linphone.core.LinphoneCore.GlobalState;
import org.linphone.core.LinphoneCore.LogCollectionUploadState;
import org.linphone.core.LinphoneCore.RegistrationState;
import org.linphone.core.LinphoneCore.TunnelMode;
import org.linphone.core.LinphoneCoreFactory;
import org.linphone.core.LinphoneCoreListener;
import org.linphone.core.LinphoneEvent;
import org.linphone.core.LinphoneFriend;
import org.linphone.core.LinphoneInfoMessage;
import org.linphone.core.LinphoneProxyConfig;
import org.linphone.core.PresenceActivityType;
import org.linphone.core.PresenceModel;
import org.linphone.core.PublishState;
import org.linphone.core.SubscriptionState;
import org.linphone.customized.CustomizedCallManager;
import org.linphone.customized.CustomizedCallManager.AudioAction;
import org.linphone.mediastream.Log;
import org.linphone.mediastream.video.capture.hwconf.Hacks;

public class LinphoneManager implements LinphoneCoreListener {
    private static final int LINPHONE_VOLUME_STREAM = 0;
    private static final int dbStep = 4;
    private static LinphoneManager instance;
    private static boolean sExited;
    private static boolean sLastProximitySensorValueNearby;
    private static Set<Activity> sProximityDependentActivities = new HashSet();
    private String basePath;
    private boolean disableRinging = false;
    private boolean isRinging;
    private boolean mAudioFocused;
    private AudioManager mAudioManager;
    private final String mCallLogDatabaseFile;
    private final String mChatDatabaseFile;
    private final String mConfigFile;
    private Context mContext;
    private final String mErrorToneFile;
    private WakeLock mIncallWakeLock;
    private final String mLPConfigXsd;
    private int mLastNetworkType = -1;
    private LinphoneCore mLc;
    public final String mLinphoneConfigFile;
    private final String mLinphoneFactoryConfigFile;
    private final String mLinphoneRootCaFile;
    private final String mPauseSoundFile;
    private PowerManager mPowerManager;
    private LinphonePreferences mPrefs;
    private Resources mR;
    private final String mRingSoundFile;
    private final String mRingbackSoundFile;
    private MediaPlayer mRingerPlayer;
    private Timer mTimer;
    private final String mUserCertificatePath;
    private Vibrator mVibrator;
    private LinphoneCall ringingCall;
    private int savedMaxCallWhileGsmIncall;
    public String wizardLoginViewDomain = null;

    class C78171 extends TimerTask {

        class C78161 implements Runnable {
            C78161() {
            }

            public void run() {
                if (LinphoneManager.this.mLc != null) {
                    LinphoneManager.this.mLc.iterate();
                }
            }
        }

        C78171() {
        }

        public void run() {
            UIThreadDispatcher.dispatch(new C78161());
        }
    }

    protected LinphoneManager(Context context) {
        this.mContext = context;
        sExited = false;
        this.basePath = context.getFilesDir().getAbsolutePath();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.basePath);
        stringBuilder.append("/lpconfig.xsd");
        this.mLPConfigXsd = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append(this.basePath);
        stringBuilder.append("/linphonerc");
        this.mLinphoneFactoryConfigFile = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append(this.basePath);
        stringBuilder.append("/.linphonerc");
        this.mLinphoneConfigFile = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append(this.basePath);
        stringBuilder.append("/rootca.pem");
        this.mLinphoneRootCaFile = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append(this.basePath);
        stringBuilder.append("/oldphone_mono.wav");
        this.mRingSoundFile = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append(this.basePath);
        stringBuilder.append("/ringback.wav");
        this.mRingbackSoundFile = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append(this.basePath);
        stringBuilder.append("/toy_mono.wav");
        this.mPauseSoundFile = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append(this.basePath);
        stringBuilder.append("/linphone-history.db");
        this.mChatDatabaseFile = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append(this.basePath);
        stringBuilder.append("/linphone-log-history.db");
        this.mCallLogDatabaseFile = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append(this.basePath);
        stringBuilder.append("/error.wav");
        this.mErrorToneFile = stringBuilder.toString();
        stringBuilder = new StringBuilder();
        stringBuilder.append(this.basePath);
        stringBuilder.append("/configrc");
        this.mConfigFile = stringBuilder.toString();
        this.mUserCertificatePath = this.basePath;
        this.mPrefs = LinphonePreferences.instance(this.mContext);
        this.mAudioManager = (AudioManager) this.mContext.getSystemService("audio");
        this.mVibrator = (Vibrator) this.mContext.getSystemService("vibrator");
        this.mPowerManager = (PowerManager) this.mContext.getSystemService("power");
        this.mR = this.mContext.getResources();
    }

    private synchronized void allowSIPCalls() {
        if (this.savedMaxCallWhileGsmIncall == 0) {
            Log.m22101w("SIP calls are already allowed as no GSM call known to be running");
            return;
        }
        this.mLc.setMaxCalls(this.savedMaxCallWhileGsmIncall);
        this.savedMaxCallWhileGsmIncall = 0;
    }

    private void copyAssetsFromPackage() {
        copyIfNotExist(b.oldphone_mono, this.mRingSoundFile);
        copyIfNotExist(b.ringback, this.mRingbackSoundFile);
        copyIfNotExist(b.toy_mono, this.mPauseSoundFile);
        copyIfNotExist(b.incoming_chat, this.mErrorToneFile);
        copyIfNotExist(b.linphonerc_default, this.mLinphoneConfigFile);
        copyFromPackage(b.linphonerc_factory, new File(this.mLinphoneFactoryConfigFile).getName());
        copyIfNotExist(b.lpconfig, this.mLPConfigXsd);
        copyIfNotExist(b.rootca, this.mLinphoneRootCaFile);
    }

    @TargetApi(11)
    private void doDestroy() {
        try {
            this.mTimer.cancel();
            this.mLc.destroy();
        } catch (Throwable e) {
            mobi.mmdt.componentsutils.b.c.b.b("Error in destroy LinphoneManager", e);
        } catch (Throwable th) {
            this.mLc = null;
            instance = null;
        }
        this.mLc = null;
        instance = null;
    }

    public static synchronized LinphoneManager getInstance(Context context) {
        synchronized (LinphoneManager.class) {
            if (instance != null) {
                LinphoneManager linphoneManager = instance;
                return linphoneManager;
            }
            LinphoneManager linphoneManager2 = new LinphoneManager(context);
            instance = linphoneManager2;
            linphoneManager2.startLibLinphone(context);
            setGsmIdle(((TelephonyManager) context.getSystemService("phone")).getCallState() == 0);
            linphoneManager = instance;
            return linphoneManager;
        }
    }

    public static synchronized LinphoneManager getInstanceWithoutContext() {
        LinphoneManager linphoneManager;
        synchronized (LinphoneManager.class) {
            if (instance != null) {
                linphoneManager = instance;
            } else if (sExited) {
                throw new RuntimeException("Linphone Manager was already destroyed. Better use getLcIfManagerNotDestroyed and check returned value");
            } else {
                throw new RuntimeException("Linphone Manager should be created before accessed");
            }
        }
        return linphoneManager;
    }

    public static synchronized LinphoneCore getLc() {
        LinphoneCore linphoneCore;
        synchronized (LinphoneManager.class) {
            linphoneCore = getInstanceWithoutContext().mLc;
        }
        return linphoneCore;
    }

    public static synchronized LinphoneCore getLcIfManagerNotDestroyedOrNull() {
        synchronized (LinphoneManager.class) {
            if (!sExited) {
                if (instance != null) {
                    LinphoneCore lc = getLc();
                    return lc;
                }
            }
            Log.m22101w("Trying to get linphone core while LinphoneManager already destroyed or not created");
            return null;
        }
    }

    private String getString(int i) {
        return this.mR.getString(i);
    }

    private synchronized void initLiblinphone(LinphoneCore linphoneCore) {
        this.mLc = linphoneCore;
        boolean z = !this.mR.getBoolean(a.disable_every_log) && this.mPrefs.isDebugEnabled();
        LinphoneCoreFactory.instance().setDebugMode(z, getString(c.app_name));
        LinphoneCoreFactory.instance().enableLogCollection(z);
        PreferencesMigrator preferencesMigrator = new PreferencesMigrator(this.mContext);
        preferencesMigrator.migrateRemoteProvisioningUriIfNeeded();
        preferencesMigrator.migrateSharingServerUrlIfNeeded();
        if (preferencesMigrator.isMigrationNeeded()) {
            preferencesMigrator.doMigration();
        }
        if (preferencesMigrator.isEchoMigratioNeeded()) {
            mobi.mmdt.componentsutils.b.c.b.f("Echo canceller configuration need to be updated");
            preferencesMigrator.doEchoMigration();
            this.mPrefs.echoConfigurationUpdated();
        }
        this.mLc.setContext(this.mContext);
        linphoneCore = this.mLc;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.basePath);
        stringBuilder.append("/zrtp_secrets");
        linphoneCore.setZrtpSecretsCache(stringBuilder.toString());
        try {
            String str = this.mContext.getPackageManager().getPackageInfo(this.mContext.getPackageName(), 0).versionName;
            if (str == null) {
                str = String.valueOf(this.mContext.getPackageManager().getPackageInfo(this.mContext.getPackageName(), 0).versionCode);
            }
            this.mLc.setUserAgent(j.a(this.mContext), str);
        } catch (Throwable e) {
            mobi.mmdt.componentsutils.b.c.b.b("cannot get version name", e);
        }
        this.mLc.setRing(this.mRingSoundFile);
        if (this.mR.getBoolean(a.use_linphonecore_ringing)) {
            disableRinging();
        } else {
            this.mLc.setRing(null);
        }
        this.mLc.setRingback(this.mRingbackSoundFile);
        this.mLc.setRootCA(this.mLinphoneRootCaFile);
        this.mLc.setPlayFile(this.mPauseSoundFile);
        this.mLc.setChatDatabasePath(this.mChatDatabaseFile);
        this.mLc.setCallLogsDatabasePath(this.mCallLogDatabaseFile);
        this.mLc.setUserCertificatesPath(this.mUserCertificatePath);
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        StringBuilder stringBuilder2 = new StringBuilder("Linphone MediaStreamer : ");
        stringBuilder2.append(availableProcessors);
        stringBuilder2.append(" cores detected and configured");
        mobi.mmdt.componentsutils.b.c.b.c(stringBuilder2.toString());
        this.mLc.setCpuCount(availableProcessors);
        availableProcessors = getLc().migrateToMultiTransport();
        stringBuilder2 = new StringBuilder("Linphone Migration to multi transport result = ");
        stringBuilder2.append(availableProcessors);
        mobi.mmdt.componentsutils.b.c.b.c(stringBuilder2.toString());
        this.mLc.migrateCallLogs();
        new IntentFilter("android.intent.action.SCREEN_ON").addAction("android.intent.action.SCREEN_OFF");
        updateNetworkReachability();
        this.mLc.setFileTransferServer(LinphonePreferences.instance(this.mContext).getSharingPictureServerUrl());
    }

    public static boolean isInstanciated() {
        return instance != null;
    }

    private boolean isPresenceModelActivitySet() {
        LinphoneCore lcIfManagerNotDestroyedOrNull = getLcIfManagerNotDestroyedOrNull();
        return (!isInstanciated() || lcIfManagerNotDestroyedOrNull == null || lcIfManagerNotDestroyedOrNull.getPresenceModel() == null || lcIfManagerNotDestroyedOrNull.getPresenceModel().getActivity() == null) ? false : true;
    }

    public static Boolean isProximitySensorNearby(SensorEvent sensorEvent) {
        boolean z = false;
        float f = sensorEvent.values[0];
        float maximumRange = sensorEvent.sensor.getMaximumRange();
        StringBuilder stringBuilder = new StringBuilder("Linphone Proximity sensor report [");
        stringBuilder.append(f);
        stringBuilder.append("] , for max range [");
        stringBuilder.append(maximumRange);
        stringBuilder.append("]");
        mobi.mmdt.componentsutils.b.c.b.c(stringBuilder.toString());
        if (maximumRange > 4.001f) {
            maximumRange = 4.001f;
        }
        if (f < maximumRange) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    private boolean isTunnelNeeded(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            Log.m22099i("No connectivity: tunnel should be disabled");
            return false;
        }
        String tunnelMode = this.mPrefs.getTunnelMode();
        if (getString(c.tunnel_mode_entry_value_always).equals(tunnelMode)) {
            return true;
        }
        if (networkInfo.getType() == 1 || !getString(c.tunnel_mode_entry_value_3G_only).equals(tunnelMode)) {
            return false;
        }
        Log.m22099i("need tunnel: 'no wifi' connection");
        return true;
    }

    private void manageTunnelServer(NetworkInfo networkInfo) {
        if (this.mLc != null && this.mLc.isTunnelAvailable()) {
            Log.m22099i("Managing tunnel");
            if (isTunnelNeeded(networkInfo)) {
                Log.m22099i("Tunnel need to be activated");
                this.mLc.tunnelSetMode(TunnelMode.enable);
                return;
            }
            Log.m22099i("Tunnel should not be used");
            String tunnelMode = this.mPrefs.getTunnelMode();
            this.mLc.tunnelSetMode(TunnelMode.disable);
            if (getString(c.tunnel_mode_entry_value_auto).equals(tunnelMode)) {
                this.mLc.tunnelSetMode(TunnelMode.auto);
            }
        }
    }

    private synchronized void preventSIPCalls() {
        if (this.savedMaxCallWhileGsmIncall != 0) {
            Log.m22101w("SIP calls are already blocked due to GSM call running");
            return;
        }
        this.savedMaxCallWhileGsmIncall = this.mLc.getMaxCalls();
        this.mLc.setMaxCalls(1);
    }

    private void requestAudioFocus() {
        if (!this.mAudioFocused) {
            int requestAudioFocus = this.mAudioManager.requestAudioFocus(null, 0, 2);
            StringBuilder stringBuilder = new StringBuilder("Linphone Audio focus requested: ");
            stringBuilder.append(requestAudioFocus == 1 ? "Granted" : "Denied");
            mobi.mmdt.componentsutils.b.c.b.c(stringBuilder.toString());
            if (requestAudioFocus == 1) {
                this.mAudioFocused = true;
            }
        }
    }

    private void routeAudioToSpeakerHelper(boolean z) {
        this.mLc.enableSpeaker(z);
        CustomizedCallManager.getInstance().onAudioStateChanged(AudioAction.SPEAKER, z);
    }

    public static void setGsmIdle(boolean z) {
        LinphoneManager linphoneManager = instance;
        if (linphoneManager != null) {
            if (z) {
                linphoneManager.allowSIPCalls();
            } else {
                linphoneManager.preventSIPCalls();
            }
        }
    }

    private static void simulateProximitySensorNearby(Activity activity, boolean z) {
        Window window = activity.getWindow();
        LayoutParams attributes = window.getAttributes();
        View childAt = ((ViewGroup) window.getDecorView().findViewById(16908290)).getChildAt(0);
        if (z) {
            attributes.screenBrightness = 0.1f;
            childAt.setVisibility(4);
        } else {
            attributes.screenBrightness = -1.0f;
            childAt.setVisibility(0);
        }
        window.setAttributes(attributes);
    }

    private synchronized void startLibLinphone(Context context) {
        try {
            copyAssetsFromPackage();
            boolean z = this.mR.getBoolean(a.disable_every_log) ^ 1;
            LinphoneCoreFactory.instance().setDebugMode(z, getString(c.app_name));
            LinphoneCoreFactory.instance().enableLogCollection(z);
            this.mLc = LinphoneCoreFactory.instance().createLinphoneCore(this, this.mLinphoneConfigFile, this.mLinphoneFactoryConfigFile, null, context);
            TimerTask c78171 = new C78171();
            this.mTimer = new Timer("Linphone scheduler");
            this.mTimer.schedule(c78171, 0, 20);
        } catch (Throwable e) {
            mobi.mmdt.componentsutils.b.c.b.b("Cannot start linphone", e);
        }
    }

    private synchronized void startRinging() {
        if (this.disableRinging) {
            routeAudioToSpeaker();
            return;
        }
        if (this.mR.getBoolean(a.allow_ringing_while_early_media)) {
            routeAudioToSpeaker();
        }
        if (Hacks.needGalaxySAudioHack()) {
            this.mAudioManager.setMode(1);
        }
        try {
            if ((this.mAudioManager.getRingerMode() == 1 || this.mAudioManager.getRingerMode() == 2) && this.mVibrator != null) {
                this.mVibrator.vibrate(new long[]{0, 1000, 1000}, 1);
            }
            if (this.mRingerPlayer == null) {
                requestAudioFocus();
                this.mRingerPlayer = new MediaPlayer();
                this.mRingerPlayer.setAudioStreamType(2);
                String ringtone = LinphonePreferences.instance(this.mContext).getRingtone(System.DEFAULT_RINGTONE_URI.toString());
                try {
                    if (ringtone.startsWith("content://")) {
                        this.mRingerPlayer.setDataSource(this.mContext, Uri.parse(ringtone));
                    } else {
                        FileInputStream fileInputStream = new FileInputStream(ringtone);
                        this.mRingerPlayer.setDataSource(fileInputStream.getFD());
                        fileInputStream.close();
                    }
                } catch (Throwable e) {
                    Log.m22094e(e, "Cannot set ringtone");
                }
                this.mRingerPlayer.prepare();
                this.mRingerPlayer.setLooping(true);
                this.mRingerPlayer.start();
            } else {
                Log.m22101w("already ringing");
            }
        } catch (Throwable e2) {
            Log.m22094e(e2, "cannot handle incoming call");
        }
        this.isRinging = true;
    }

    private synchronized void stopRinging() {
        if (this.mRingerPlayer != null) {
            this.mRingerPlayer.stop();
            this.mRingerPlayer.release();
            this.mRingerPlayer = null;
        }
        if (this.mVibrator != null) {
            this.mVibrator.cancel();
        }
        if (Hacks.needGalaxySAudioHack()) {
            this.mAudioManager.setMode(0);
        }
        this.isRinging = false;
        if (this.mContext.getResources().getBoolean(a.isTablet)) {
            mobi.mmdt.componentsutils.b.c.b.c("Linphone Stopped ringing, routing back to speaker");
            routeAudioToSpeaker();
            return;
        }
        mobi.mmdt.componentsutils.b.c.b.c("Linphone Stopped ringing, routing back to earpiece");
        routeAudioToReceiver();
    }

    public boolean acceptCallWithParams(LinphoneCall linphoneCall, LinphoneCallParams linphoneCallParams) {
        try {
            this.mLc.acceptCallWithParams(linphoneCall, linphoneCallParams);
            return true;
        } catch (Throwable e) {
            Log.m22098i(e, "Accept call failed");
            return false;
        }
    }

    public void adjustVolume(int i) {
        if (VERSION.SDK_INT < 15) {
            int streamVolume = this.mAudioManager.getStreamVolume(0);
            int streamMaxVolume = this.mAudioManager.getStreamMaxVolume(0);
            streamVolume += i;
            if (streamVolume > streamMaxVolume) {
                streamVolume = streamMaxVolume;
            }
            if (streamVolume < 0) {
                streamVolume = 0;
            }
            this.mLc.setPlaybackGain((float) ((streamVolume - streamMaxVolume) * 4));
            return;
        }
        this.mAudioManager.adjustStreamVolume(0, i < 0 ? -1 : 1, 1);
    }

    public void authInfoRequested(LinphoneCore linphoneCore, String str, String str2, String str3) {
    }

    public void callEncryptionChanged(LinphoneCore linphoneCore, LinphoneCall linphoneCall, boolean z, String str) {
    }

    @SuppressLint({"Wakelock"})
    public void callState(LinphoneCore linphoneCore, LinphoneCall linphoneCall, State state, String str) {
        CustomizedCallManager.getInstance().onCallStateChanged(linphoneCall, state, str);
        StringBuilder stringBuilder = new StringBuilder("Linphone New call state [");
        stringBuilder.append(state);
        stringBuilder.append("]");
        mobi.mmdt.componentsutils.b.c.b.c(stringBuilder.toString());
        if (state != State.IncomingReceived || linphoneCall.equals(linphoneCore.getCurrentCall()) || linphoneCall.getReplacedCall() == null) {
            if (state == State.IncomingReceived && this.mR.getBoolean(a.auto_answer_calls)) {
                try {
                    this.mLc.acceptCall(linphoneCall);
                } catch (Throwable e) {
                    mobi.mmdt.componentsutils.b.c.b.b("Error in accept call", e);
                }
            } else {
                if (state != State.IncomingReceived) {
                    if (state != State.CallIncomingEarlyMedia || !this.mR.getBoolean(a.allow_ringing_while_early_media)) {
                        if (linphoneCall == this.ringingCall && this.isRinging) {
                            stopRinging();
                        }
                    }
                }
                if (this.mLc.getCallsNb() == 1) {
                    this.ringingCall = linphoneCall;
                    startRinging();
                }
            }
            if (state == State.Connected) {
                if (this.mLc.getCallsNb() == 1) {
                    requestAudioFocus();
                }
                if (Hacks.needSoftvolume()) {
                    Log.m22101w("Using soft volume audio hack");
                    adjustVolume(0);
                }
            }
            if ((state == State.CallReleased || state == State.Error) && this.mLc.getCallsNb() == 0) {
                if (this.mAudioFocused) {
                    int abandonAudioFocus = this.mAudioManager.abandonAudioFocus(null);
                    StringBuilder stringBuilder2 = new StringBuilder("Linphone Audio focus released a bit later: ");
                    stringBuilder2.append(abandonAudioFocus == 1 ? "Granted" : "Denied");
                    mobi.mmdt.componentsutils.b.c.b.c(stringBuilder2.toString());
                    this.mAudioFocused = false;
                }
                Context context = getContext();
                if (context != null && ((TelephonyManager) context.getSystemService("phone")).getCallState() == 0) {
                    mobi.mmdt.componentsutils.b.c.b.c("Linphone ---AudioManager: back to MODE_NORMAL");
                    this.mAudioManager.setMode(0);
                    mobi.mmdt.componentsutils.b.c.b.c("Linphone All call terminated, routing back to earpiece");
                    routeAudioToReceiver();
                }
            }
            if (state == State.CallEnd && this.mLc.getCallsNb() == 0) {
                String str2;
                if (this.mIncallWakeLock == null || !this.mIncallWakeLock.isHeld()) {
                    str2 = "Linphone Last call ended: no incall (CPU only) wake lock were held";
                } else {
                    this.mIncallWakeLock.release();
                    str2 = "Linphone Last call ended: releasing incall (CPU only) wake lock";
                }
                mobi.mmdt.componentsutils.b.c.b.c(str2);
            }
            if (state == State.StreamsRunning) {
                if (this.mIncallWakeLock == null) {
                    this.mIncallWakeLock = this.mPowerManager.newWakeLock(1, "incall");
                }
                if (this.mIncallWakeLock.isHeld()) {
                    mobi.mmdt.componentsutils.b.c.b.c("Linphone New call active while incall (CPU only) wake lock already active");
                } else {
                    mobi.mmdt.componentsutils.b.c.b.c("Linphone New call active : acquiring incall (CPU only) wake lock");
                    this.mIncallWakeLock.acquire();
                }
            }
        }
    }

    public void callStatsUpdated(LinphoneCore linphoneCore, LinphoneCall linphoneCall, LinphoneCallStats linphoneCallStats) {
    }

    public void changeStatusToOffline() {
        LinphoneCore lcIfManagerNotDestroyedOrNull = getLcIfManagerNotDestroyedOrNull();
        if (lcIfManagerNotDestroyedOrNull == null || !isInstanciated() || !isPresenceModelActivitySet() || lcIfManagerNotDestroyedOrNull.getPresenceModel().getActivity().getType() == PresenceActivityType.Offline) {
            if (isInstanciated() && !isPresenceModelActivitySet()) {
                PresenceModel createPresenceModel = LinphoneCoreFactory.instance().createPresenceModel(PresenceActivityType.Offline, null);
                if (lcIfManagerNotDestroyedOrNull != null) {
                    lcIfManagerNotDestroyedOrNull.setPresenceModel(createPresenceModel);
                }
            }
            return;
        }
        lcIfManagerNotDestroyedOrNull.getPresenceModel().getActivity().setType(PresenceActivityType.Offline);
    }

    public void configuringStatus(org.linphone.core.LinphoneCore r3, org.linphone.core.LinphoneCore.RemoteProvisioningState r4, java.lang.String r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r2 = this;
        r0 = new java.lang.StringBuilder;
        r1 = "Linphone Remote provisioning status = ";
        r0.<init>(r1);
        r1 = r4.toString();
        r0.append(r1);
        r1 = " (";
        r0.append(r1);
        r0.append(r5);
        r5 = ")";
        r0.append(r5);
        r5 = r0.toString();
        mobi.mmdt.componentsutils.b.c.b.c(r5);
        r5 = org.linphone.core.LinphoneCore.RemoteProvisioningState.ConfiguringSuccessful;
        if (r4 != r5) goto L_0x004c;
    L_0x0026:
        r4 = r2.mContext;
        r4 = org.linphone.LinphonePreferences.instance(r4);
        r4 = r4.isProvisioningLoginViewEnabled();
        if (r4 == 0) goto L_0x004c;
    L_0x0032:
        r3 = r3.createProxyConfig();
        r4 = org.linphone.core.LinphoneCoreFactory.instance();	 Catch:{ LinphoneCoreException -> 0x0049 }
        r3 = r3.getIdentity();	 Catch:{ LinphoneCoreException -> 0x0049 }
        r3 = r4.createLinphoneAddress(r3);	 Catch:{ LinphoneCoreException -> 0x0049 }
        r3 = r3.getDomain();	 Catch:{ LinphoneCoreException -> 0x0049 }
        r2.wizardLoginViewDomain = r3;	 Catch:{ LinphoneCoreException -> 0x0049 }
        return;
    L_0x0049:
        r3 = 0;
        r2.wizardLoginViewDomain = r3;
    L_0x004c:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.linphone.LinphoneManager.configuringStatus(org.linphone.core.LinphoneCore, org.linphone.core.LinphoneCore$RemoteProvisioningState, java.lang.String):void");
    }

    public void connectivityChanged(ConnectivityManager connectivityManager, boolean z) {
        updateNetworkReachability();
    }

    public void copyFromPackage(int i, String str) {
        FileOutputStream openFileOutput = this.mContext.openFileOutput(str, 0);
        InputStream openRawResource = this.mR.openRawResource(i);
        byte[] bArr = new byte[8048];
        while (true) {
            int read = openRawResource.read(bArr);
            if (read != -1) {
                openFileOutput.write(bArr, 0, read);
            } else {
                openFileOutput.flush();
                openFileOutput.close();
                openRawResource.close();
                return;
            }
        }
    }

    public void copyIfNotExist(int i, String str) {
        File file = new File(str);
        if (!file.exists()) {
            copyFromPackage(i, file.getName());
        }
    }

    public synchronized void destroy() {
        if (instance != null) {
            getInstance(this.mContext).changeStatusToOffline();
            sExited = true;
            instance.doDestroy();
        }
    }

    public void disableRinging() {
        this.disableRinging = true;
    }

    public void displayMessage(LinphoneCore linphoneCore, String str) {
    }

    public void displayStatus(LinphoneCore linphoneCore, String str) {
        StringBuilder stringBuilder = new StringBuilder("Linphone displayStatus: ");
        stringBuilder.append(str);
        mobi.mmdt.componentsutils.b.c.b.c(stringBuilder.toString());
    }

    public void displayWarning(LinphoneCore linphoneCore, String str) {
    }

    public void dtmfReceived(LinphoneCore linphoneCore, LinphoneCall linphoneCall, int i) {
        StringBuilder stringBuilder = new StringBuilder("DTMF received: ");
        stringBuilder.append(i);
        mobi.mmdt.componentsutils.b.c.b.f(stringBuilder.toString());
    }

    public void ecCalibrationStatus(LinphoneCore linphoneCore, EcCalibratorStatus ecCalibratorStatus, int i, Object obj) {
    }

    public void fileTransferProgressIndication(LinphoneCore linphoneCore, LinphoneChatMessage linphoneChatMessage, LinphoneContent linphoneContent, int i) {
    }

    public void fileTransferRecv(LinphoneCore linphoneCore, LinphoneChatMessage linphoneChatMessage, LinphoneContent linphoneContent, byte[] bArr, int i) {
    }

    public int fileTransferSend(LinphoneCore linphoneCore, LinphoneChatMessage linphoneChatMessage, LinphoneContent linphoneContent, ByteBuffer byteBuffer, int i) {
        return 0;
    }

    public Context getContext() {
        try {
            if (this.mContext != null) {
                return this.mContext;
            }
        } catch (Throwable e) {
            mobi.mmdt.componentsutils.b.c.b.b("Error in getContext of Linphone", e);
        }
        return null;
    }

    public synchronized LinphoneCore getLinphoneLc(Context context) {
        return getInstance(context).mLc;
    }

    public synchronized LinphoneCall getPendingIncomingCall() {
        LinphoneCall currentCall = this.mLc.getCurrentCall();
        if (currentCall == null) {
            return null;
        }
        State state = currentCall.getState();
        Object obj = (currentCall.getDirection() == CallDirection.Incoming && (state == State.IncomingReceived || state == State.CallIncomingEarlyMedia)) ? 1 : null;
        return obj != null ? currentCall : null;
    }

    public void globalState(LinphoneCore linphoneCore, GlobalState globalState, String str) {
        StringBuilder stringBuilder = new StringBuilder("Linphone New global state [");
        stringBuilder.append(globalState);
        stringBuilder.append("]");
        mobi.mmdt.componentsutils.b.c.b.c(stringBuilder.toString());
        if (globalState == GlobalState.GlobalOn) {
            try {
                initLiblinphone(linphoneCore);
            } catch (Throwable e) {
                mobi.mmdt.componentsutils.b.c.b.b("init linphone error", e);
            }
        }
    }

    public void infoReceived(LinphoneCore linphoneCore, LinphoneCall linphoneCall, LinphoneInfoMessage linphoneInfoMessage) {
        StringBuilder stringBuilder = new StringBuilder("Linphone Info message received from ");
        stringBuilder.append(linphoneCall.getRemoteAddress().asString());
        mobi.mmdt.componentsutils.b.c.b.c(stringBuilder.toString());
        LinphoneContent content = linphoneInfoMessage.getContent();
        if (content != null) {
            StringBuilder stringBuilder2 = new StringBuilder("Linphone Info received with body with mime type ");
            stringBuilder2.append(content.getType());
            stringBuilder2.append("/");
            stringBuilder2.append(content.getSubtype());
            stringBuilder2.append(" and data [");
            stringBuilder2.append(content.getDataAsString());
            stringBuilder2.append("]");
            mobi.mmdt.componentsutils.b.c.b.c(stringBuilder2.toString());
        }
    }

    public void isComposingReceived(LinphoneCore linphoneCore, LinphoneChatRoom linphoneChatRoom) {
        StringBuilder stringBuilder = new StringBuilder("Linphone Composing received for chatroom ");
        stringBuilder.append(linphoneChatRoom.getPeerAddress().asStringUriOnly());
        mobi.mmdt.componentsutils.b.c.b.c(stringBuilder.toString());
    }

    public void messageReceived(LinphoneCore linphoneCore, LinphoneChatRoom linphoneChatRoom, LinphoneChatMessage linphoneChatMessage) {
    }

    public void newOutgoingCall(java.lang.String r4, java.lang.String r5) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        r0 = r3.mLc;	 Catch:{ LinphoneCoreException -> 0x005e }
        r4 = r0.interpretUrl(r4);	 Catch:{ LinphoneCoreException -> 0x005e }
        r0 = r3.mLc;	 Catch:{ LinphoneCoreException -> 0x005e }
        r0 = r0.getDefaultProxyConfig();	 Catch:{ LinphoneCoreException -> 0x005e }
        r1 = r3.mR;	 Catch:{ LinphoneCoreException -> 0x005e }
        r2 = mobi.mmdt.ott.b.a.a.forbid_self_call;	 Catch:{ LinphoneCoreException -> 0x005e }
        r1 = r1.getBoolean(r2);	 Catch:{ LinphoneCoreException -> 0x005e }
        if (r1 == 0) goto L_0x0027;	 Catch:{ LinphoneCoreException -> 0x005e }
    L_0x0016:
        if (r0 == 0) goto L_0x0027;	 Catch:{ LinphoneCoreException -> 0x005e }
    L_0x0018:
        r1 = r4.asStringUriOnly();	 Catch:{ LinphoneCoreException -> 0x005e }
        r0 = r0.getIdentity();	 Catch:{ LinphoneCoreException -> 0x005e }
        r0 = r1.equals(r0);	 Catch:{ LinphoneCoreException -> 0x005e }
        if (r0 == 0) goto L_0x0027;
    L_0x0026:
        return;
    L_0x0027:
        r4.setDisplayName(r5);
        r5 = r3.getContext();
        r5 = org.linphone.LinphoneUtils.isHighBandwidthConnection(r5);
        r0 = 1;
        r5 = r5 ^ r0;
        r1 = r3.mLc;
        r1 = r1.isNetworkReachable();
        if (r1 == 0) goto L_0x0042;
    L_0x003c:
        r0 = r3.mContext;	 Catch:{ LinphoneCoreException -> 0x0041 }
        org.linphone.CallManager.inviteAddress(r0, r4, r5);	 Catch:{ LinphoneCoreException -> 0x0041 }
    L_0x0041:
        return;
    L_0x0042:
        r4 = new java.lang.Object[r0];
        r5 = 0;
        r0 = new java.lang.StringBuilder;
        r1 = "Error: ";
        r0.<init>(r1);
        r1 = mobi.mmdt.ott.b.a.c.error_network_unreachable;
        r1 = r3.getString(r1);
        r0.append(r1);
        r0 = r0.toString();
        r4[r5] = r0;
        org.linphone.mediastream.Log.m22095e(r4);
    L_0x005e:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.linphone.LinphoneManager.newOutgoingCall(java.lang.String, java.lang.String):void");
    }

    public void newSubscriptionRequest(LinphoneCore linphoneCore, LinphoneFriend linphoneFriend, String str) {
    }

    public void notifyPresenceReceived(LinphoneCore linphoneCore, LinphoneFriend linphoneFriend) {
    }

    public void notifyReceived(LinphoneCore linphoneCore, LinphoneCall linphoneCall, LinphoneAddress linphoneAddress, byte[] bArr) {
    }

    public void notifyReceived(LinphoneCore linphoneCore, LinphoneEvent linphoneEvent, String str, LinphoneContent linphoneContent) {
        StringBuilder stringBuilder = new StringBuilder("Linphone Notify received for event ");
        stringBuilder.append(str);
        mobi.mmdt.componentsutils.b.c.b.c(stringBuilder.toString());
        if (linphoneContent != null) {
            stringBuilder = new StringBuilder("Linphone with content ");
            stringBuilder.append(linphoneContent.getType());
            stringBuilder.append("/");
            stringBuilder.append(linphoneContent.getSubtype());
            stringBuilder.append(" data:");
            stringBuilder.append(linphoneContent.getDataAsString());
            mobi.mmdt.componentsutils.b.c.b.c(stringBuilder.toString());
        }
    }

    public void publishStateChanged(LinphoneCore linphoneCore, LinphoneEvent linphoneEvent, PublishState publishState) {
        StringBuilder stringBuilder = new StringBuilder("Linphone Publish state changed to ");
        stringBuilder.append(publishState);
        stringBuilder.append(" for event name ");
        stringBuilder.append(linphoneEvent.getEventName());
        mobi.mmdt.componentsutils.b.c.b.c(stringBuilder.toString());
    }

    public void registrationState(LinphoneCore linphoneCore, LinphoneProxyConfig linphoneProxyConfig, RegistrationState registrationState, String str) {
        CustomizedCallManager.getInstance().onRegistrationStateChanged(registrationState, str);
        StringBuilder stringBuilder = new StringBuilder("Linphone New registration state [");
        stringBuilder.append(registrationState);
        stringBuilder.append("] message : ");
        stringBuilder.append(str);
        mobi.mmdt.componentsutils.b.c.b.c(stringBuilder.toString());
    }

    public void routeAudioToHold(LinphoneCall linphoneCall) {
        getInstance(this.mContext).getLinphoneLc(this.mContext).pauseCall(linphoneCall);
        CustomizedCallManager.getInstance().onAudioStateChanged(AudioAction.HOLD, true);
    }

    public void routeAudioToMute(boolean z) {
        this.mLc.muteMic(z);
        CustomizedCallManager.getInstance().onAudioStateChanged(AudioAction.MUTE, z);
    }

    public void routeAudioToReceiver() {
        routeAudioToSpeakerHelper(false);
    }

    public void routeAudioToSpeaker() {
        routeAudioToSpeakerHelper(true);
    }

    public void routeAudioToUnHold(LinphoneCall linphoneCall) {
        getInstance(this.mContext).getLinphoneLc(this.mContext).resumeCall(linphoneCall);
        CustomizedCallManager.getInstance().onAudioStateChanged(AudioAction.HOLD, false);
    }

    public void show(LinphoneCore linphoneCore) {
    }

    public void subscriptionStateChanged(LinphoneCore linphoneCore, LinphoneEvent linphoneEvent, SubscriptionState subscriptionState) {
        StringBuilder stringBuilder = new StringBuilder("Linphone Subscription state changed to ");
        stringBuilder.append(subscriptionState);
        stringBuilder.append(" event name is ");
        stringBuilder.append(linphoneEvent.getEventName());
        mobi.mmdt.componentsutils.b.c.b.c(stringBuilder.toString());
    }

    public void transferState(LinphoneCore linphoneCore, LinphoneCall linphoneCall, State state) {
    }

    public void updateNetworkReachability() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.mContext.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null) {
            if (activeNetworkInfo.getState() != NetworkInfo.State.DISCONNECTED) {
                if (activeNetworkInfo.getState() == NetworkInfo.State.CONNECTED) {
                    manageTunnelServer(activeNetworkInfo);
                    if (!LinphonePreferences.instance(this.mContext).isWifiOnlyEnabled()) {
                        int type = activeNetworkInfo.getType();
                        if (type != this.mLastNetworkType) {
                            mobi.mmdt.componentsutils.b.c.b.c("Linphone Connectivity has changed.");
                            this.mLc.setNetworkReachable(false);
                        }
                        this.mLc.setNetworkReachable(true);
                        this.mLastNetworkType = type;
                    } else if (activeNetworkInfo.getType() == 1) {
                        this.mLc.setNetworkReachable(true);
                        return;
                    } else {
                        mobi.mmdt.componentsutils.b.c.b.c("Linphone Wifi-only mode, setting network not reachable");
                        this.mLc.setNetworkReachable(false);
                        return;
                    }
                }
                return;
            }
        }
        mobi.mmdt.componentsutils.b.c.b.c("Linphone No connectivity: setting network unreachable");
        this.mLc.setNetworkReachable(false);
    }

    public void uploadProgressIndication(LinphoneCore linphoneCore, int i, int i2) {
        if (i2 > 0) {
            StringBuilder stringBuilder = new StringBuilder("Linphone Log upload progress: currently uploaded = ");
            stringBuilder.append(i);
            stringBuilder.append(" , total = ");
            stringBuilder.append(i2);
            stringBuilder.append(", % = ");
            stringBuilder.append(String.valueOf((i * 100) / i2));
            mobi.mmdt.componentsutils.b.c.b.c(stringBuilder.toString());
        }
    }

    public void uploadStateChanged(LinphoneCore linphoneCore, LogCollectionUploadState logCollectionUploadState, String str) {
        StringBuilder stringBuilder = new StringBuilder("Linphone Log upload state: ");
        stringBuilder.append(logCollectionUploadState.toString());
        stringBuilder.append(", info = ");
        stringBuilder.append(str);
        mobi.mmdt.componentsutils.b.c.b.c(stringBuilder.toString());
    }
}
