package android.support.v4.media.session;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder.DeathRecipient;
import android.os.Message;
import android.os.ResultReceiver;
import android.support.v4.app.C0383e.C0382a;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.C0500a.C4819a;
import android.support.v4.media.session.C0501b.C4821a;
import android.support.v4.media.session.C0504c.C0502a;
import android.support.v4.media.session.C0504c.C0503b;
import android.support.v4.media.session.MediaSessionCompat.QueueItem;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;

public final class MediaControllerCompat {

    static class MediaControllerImplApi21 {
        final List<C0492a> f1684a;
        C0501b f1685b;
        HashMap<C0492a, C7017a> f1686c;

        private static class ExtraBinderRequestResultReceiver extends ResultReceiver {
            private WeakReference<MediaControllerImplApi21> f1683a;

            protected void onReceiveResult(int i, Bundle bundle) {
                MediaControllerImplApi21 mediaControllerImplApi21 = (MediaControllerImplApi21) this.f1683a.get();
                if (mediaControllerImplApi21 != null && bundle != null) {
                    String str = "android.support.v4.media.session.EXTRA_BINDER";
                    mediaControllerImplApi21.f1685b = C4821a.m9275a(VERSION.SDK_INT >= 18 ? bundle.getBinder(str) : C0382a.m750a(bundle, str));
                    if (mediaControllerImplApi21.f1685b != null) {
                        synchronized (mediaControllerImplApi21.f1684a) {
                            for (C0492a c0492a : mediaControllerImplApi21.f1684a) {
                                C0500a c7017a = new C7017a(c0492a);
                                mediaControllerImplApi21.f1686c.put(c0492a, c7017a);
                                c0492a.f1689b = true;
                                try {
                                    mediaControllerImplApi21.f1685b.mo339a(c7017a);
                                } catch (Throwable e) {
                                    Log.e("MediaControllerCompat", "Dead object in registerCallback.", e);
                                }
                            }
                            mediaControllerImplApi21.f1684a.clear();
                        }
                    }
                }
            }
        }

        private static class C7017a extends C6368c {
            C7017a(C0492a c0492a) {
                super(c0492a);
            }

            public final void mo319a() {
                throw new AssertionError();
            }

            public final void mo321a(Bundle bundle) {
                throw new AssertionError();
            }

            public final void mo322a(MediaMetadataCompat mediaMetadataCompat) {
                throw new AssertionError();
            }

            public final void mo323a(ParcelableVolumeInfo parcelableVolumeInfo) {
                throw new AssertionError();
            }

            public final void mo325a(CharSequence charSequence) {
                throw new AssertionError();
            }

            public final void mo327a(List<QueueItem> list) {
                throw new AssertionError();
            }
        }
    }

    public static abstract class C0492a implements DeathRecipient {
        C0491a f1688a;
        boolean f1689b;
        private final Object f1690c;

        private class C0491a extends Handler {
            boolean f1687a;

            public final void handleMessage(Message message) {
                if (this.f1687a) {
                    Object obj;
                    switch (message.what) {
                        case 1:
                            Object obj2 = message.obj;
                            message.getData();
                            return;
                        case 2:
                            obj = message.obj;
                            return;
                        case 3:
                            obj = message.obj;
                            return;
                        case 4:
                            obj = message.obj;
                            return;
                        case 5:
                            obj = message.obj;
                            return;
                        case 6:
                            obj = message.obj;
                            return;
                        case 7:
                            obj = message.obj;
                            return;
                        case 9:
                            ((Integer) message.obj).intValue();
                            return;
                        case 10:
                            ((Boolean) message.obj).booleanValue();
                            return;
                        case 11:
                            ((Boolean) message.obj).booleanValue();
                            return;
                        case 12:
                            ((Integer) message.obj).intValue();
                            return;
                        default:
                            return;
                    }
                }
            }
        }

        private static class C4817b implements C0502a {
            private final WeakReference<C0492a> f13400a;

            C4817b(C0492a c0492a) {
                this.f13400a = new WeakReference(c0492a);
            }

            public final void mo311a() {
                this.f13400a.get();
            }

            public final void mo312a(int i, int i2, int i3, int i4, int i5) {
                if (((C0492a) this.f13400a.get()) != null) {
                    C0493b c0493b = new C0493b(i, i2, i3, i4, i5);
                }
            }

            public final void mo313a(Object obj) {
                C0492a c0492a = (C0492a) this.f13400a.get();
                if (c0492a != null && !c0492a.f1689b) {
                    PlaybackStateCompat.m1043a(obj);
                }
            }

            public final void mo314a(List<?> list) {
                if (((C0492a) this.f13400a.get()) != null) {
                    QueueItem.m1041a(list);
                }
            }

            public final void mo315b() {
                C0492a c0492a = (C0492a) this.f13400a.get();
                if (c0492a != null && c0492a.f1689b) {
                    int i = VERSION.SDK_INT;
                }
            }

            public final void mo316b(Object obj) {
                if (((C0492a) this.f13400a.get()) != null) {
                    MediaMetadataCompat.m1039a(obj);
                }
            }

            public final void mo317c() {
                this.f13400a.get();
            }

            public final void mo318d() {
                this.f13400a.get();
            }
        }

        private static class C6368c extends C4819a {
            private final WeakReference<C0492a> f17417a;

            C6368c(C0492a c0492a) {
                this.f17417a = new WeakReference(c0492a);
            }

            public void mo319a() {
                C0492a c0492a = (C0492a) this.f17417a.get();
                if (c0492a != null) {
                    c0492a.m1040a(8, null, null);
                }
            }

            public final void mo320a(int i) {
                C0492a c0492a = (C0492a) this.f17417a.get();
                if (c0492a != null) {
                    c0492a.m1040a(9, Integer.valueOf(i), null);
                }
            }

            public void mo321a(Bundle bundle) {
                C0492a c0492a = (C0492a) this.f17417a.get();
                if (c0492a != null) {
                    c0492a.m1040a(7, bundle, null);
                }
            }

            public void mo322a(MediaMetadataCompat mediaMetadataCompat) {
                C0492a c0492a = (C0492a) this.f17417a.get();
                if (c0492a != null) {
                    c0492a.m1040a(3, mediaMetadataCompat, null);
                }
            }

            public void mo323a(ParcelableVolumeInfo parcelableVolumeInfo) {
                C0492a c0492a = (C0492a) this.f17417a.get();
                if (c0492a != null) {
                    Object obj;
                    if (parcelableVolumeInfo != null) {
                        C0493b c0493b = new C0493b(parcelableVolumeInfo.f1702a, parcelableVolumeInfo.f1703b, parcelableVolumeInfo.f1704c, parcelableVolumeInfo.f1705d, parcelableVolumeInfo.f1706e);
                    } else {
                        obj = null;
                    }
                    c0492a.m1040a(4, obj, null);
                }
            }

            public final void mo324a(PlaybackStateCompat playbackStateCompat) {
                C0492a c0492a = (C0492a) this.f17417a.get();
                if (c0492a != null) {
                    c0492a.m1040a(2, playbackStateCompat, null);
                }
            }

            public void mo325a(CharSequence charSequence) {
                C0492a c0492a = (C0492a) this.f17417a.get();
                if (c0492a != null) {
                    c0492a.m1040a(6, charSequence, null);
                }
            }

            public final void mo326a(String str, Bundle bundle) {
                C0492a c0492a = (C0492a) this.f17417a.get();
                if (c0492a != null) {
                    c0492a.m1040a(1, str, bundle);
                }
            }

            public void mo327a(List<QueueItem> list) {
                C0492a c0492a = (C0492a) this.f17417a.get();
                if (c0492a != null) {
                    c0492a.m1040a(5, list, null);
                }
            }

            public final void mo328a(boolean z) {
                C0492a c0492a = (C0492a) this.f17417a.get();
                if (c0492a != null) {
                    c0492a.m1040a(10, Boolean.valueOf(z), null);
                }
            }

            public final void mo329b(int i) {
                C0492a c0492a = (C0492a) this.f17417a.get();
                if (c0492a != null) {
                    c0492a.m1040a(12, Integer.valueOf(i), null);
                }
            }

            public final void mo330b(boolean z) {
                C0492a c0492a = (C0492a) this.f17417a.get();
                if (c0492a != null) {
                    c0492a.m1040a(11, Boolean.valueOf(z), null);
                }
            }
        }

        public C0492a() {
            if (VERSION.SDK_INT >= 21) {
                this.f1690c = new C0503b(new C4817b(this));
            } else {
                this.f1690c = new C6368c(this);
            }
        }

        final void m1040a(int i, Object obj, Bundle bundle) {
            if (this.f1688a != null) {
                Message obtainMessage = this.f1688a.obtainMessage(i, obj);
                obtainMessage.setData(bundle);
                obtainMessage.sendToTarget();
            }
        }
    }

    public static final class C0493b {
        private final int f1691a;
        private final int f1692b;
        private final int f1693c;
        private final int f1694d;
        private final int f1695e;

        C0493b(int i, int i2, int i3, int i4, int i5) {
            this.f1691a = i;
            this.f1692b = i2;
            this.f1693c = i3;
            this.f1694d = i4;
            this.f1695e = i5;
        }
    }
}
