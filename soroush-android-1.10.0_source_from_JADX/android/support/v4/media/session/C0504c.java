package android.support.v4.media.session;

import android.media.AudioAttributes;
import android.media.MediaMetadata;
import android.media.session.MediaController.Callback;
import android.media.session.MediaController.PlaybackInfo;
import android.media.session.MediaSession.QueueItem;
import android.media.session.PlaybackState;
import android.os.Bundle;
import java.util.List;

final class C0504c {

    public interface C0502a {
        void mo311a();

        void mo312a(int i, int i2, int i3, int i4, int i5);

        void mo313a(Object obj);

        void mo314a(List<?> list);

        void mo315b();

        void mo316b(Object obj);

        void mo317c();

        void mo318d();
    }

    static class C0503b<T extends C0502a> extends Callback {
        protected final T f1724a;

        public C0503b(T t) {
            this.f1724a = t;
        }

        public final void onAudioInfoChanged(PlaybackInfo playbackInfo) {
            int i;
            C0502a c0502a = this.f1724a;
            int playbackType = playbackInfo.getPlaybackType();
            AudioAttributes audioAttributes = playbackInfo.getAudioAttributes();
            if ((audioAttributes.getFlags() & 1) != 1) {
                if ((audioAttributes.getFlags() & 4) != 4) {
                    switch (audioAttributes.getUsage()) {
                        case 2:
                            i = 0;
                            break;
                        case 3:
                            i = 8;
                            break;
                        case 4:
                            i = 4;
                            break;
                        case 5:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                            i = 5;
                            break;
                        case 6:
                            i = 2;
                            break;
                        case 13:
                            i = 1;
                            break;
                        default:
                            i = 3;
                            break;
                    }
                }
                i = 6;
            } else {
                i = 7;
            }
            c0502a.mo312a(playbackType, i, playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume());
        }

        public final void onExtrasChanged(Bundle bundle) {
            this.f1724a.mo318d();
        }

        public final void onMetadataChanged(MediaMetadata mediaMetadata) {
            this.f1724a.mo316b(mediaMetadata);
        }

        public final void onPlaybackStateChanged(PlaybackState playbackState) {
            this.f1724a.mo313a((Object) playbackState);
        }

        public final void onQueueChanged(List<QueueItem> list) {
            this.f1724a.mo314a((List) list);
        }

        public final void onQueueTitleChanged(CharSequence charSequence) {
            this.f1724a.mo317c();
        }

        public final void onSessionDestroyed() {
            this.f1724a.mo311a();
        }

        public final void onSessionEvent(String str, Bundle bundle) {
            this.f1724a.mo315b();
        }
    }
}
