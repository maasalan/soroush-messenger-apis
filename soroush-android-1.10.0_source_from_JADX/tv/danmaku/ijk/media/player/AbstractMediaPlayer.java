package tv.danmaku.ijk.media.player;

import tv.danmaku.ijk.media.player.IMediaPlayer.OnBufferingUpdateListener;
import tv.danmaku.ijk.media.player.IMediaPlayer.OnCompletionListener;
import tv.danmaku.ijk.media.player.IMediaPlayer.OnErrorListener;
import tv.danmaku.ijk.media.player.IMediaPlayer.OnInfoListener;
import tv.danmaku.ijk.media.player.IMediaPlayer.OnPreparedListener;
import tv.danmaku.ijk.media.player.IMediaPlayer.OnSeekCompleteListener;
import tv.danmaku.ijk.media.player.IMediaPlayer.OnTimedTextListener;
import tv.danmaku.ijk.media.player.IMediaPlayer.OnVideoSizeChangedListener;
import tv.danmaku.ijk.media.player.misc.IMediaDataSource;

public abstract class AbstractMediaPlayer implements IMediaPlayer {
    private OnBufferingUpdateListener mOnBufferingUpdateListener;
    private OnCompletionListener mOnCompletionListener;
    private OnErrorListener mOnErrorListener;
    private OnInfoListener mOnInfoListener;
    private OnPreparedListener mOnPreparedListener;
    private OnSeekCompleteListener mOnSeekCompleteListener;
    private OnTimedTextListener mOnTimedTextListener;
    private OnVideoSizeChangedListener mOnVideoSizeChangedListener;

    protected final void notifyOnBufferingUpdate(int i) {
        if (this.mOnBufferingUpdateListener != null) {
            this.mOnBufferingUpdateListener.onBufferingUpdate(this, i);
        }
    }

    protected final void notifyOnCompletion() {
        if (this.mOnCompletionListener != null) {
            this.mOnCompletionListener.onCompletion(this);
        }
    }

    protected final boolean notifyOnError(int i, int i2) {
        return this.mOnErrorListener != null && this.mOnErrorListener.onError(this, i, i2);
    }

    protected final boolean notifyOnInfo(int i, int i2) {
        return this.mOnInfoListener != null && this.mOnInfoListener.onInfo(this, i, i2);
    }

    protected final void notifyOnPrepared() {
        if (this.mOnPreparedListener != null) {
            this.mOnPreparedListener.onPrepared(this);
        }
    }

    protected final void notifyOnSeekComplete() {
        if (this.mOnSeekCompleteListener != null) {
            this.mOnSeekCompleteListener.onSeekComplete(this);
        }
    }

    protected final void notifyOnTimedText(IjkTimedText ijkTimedText) {
        if (this.mOnTimedTextListener != null) {
            this.mOnTimedTextListener.onTimedText(this, ijkTimedText);
        }
    }

    protected final void notifyOnVideoSizeChanged(int i, int i2, int i3, int i4) {
        if (this.mOnVideoSizeChangedListener != null) {
            this.mOnVideoSizeChangedListener.onVideoSizeChanged(this, i, i2, i3, i4);
        }
    }

    public void resetListeners() {
        this.mOnPreparedListener = null;
        this.mOnBufferingUpdateListener = null;
        this.mOnCompletionListener = null;
        this.mOnSeekCompleteListener = null;
        this.mOnVideoSizeChangedListener = null;
        this.mOnErrorListener = null;
        this.mOnInfoListener = null;
        this.mOnTimedTextListener = null;
    }

    public void setDataSource(IMediaDataSource iMediaDataSource) {
        throw new UnsupportedOperationException();
    }

    public final void setOnBufferingUpdateListener(OnBufferingUpdateListener onBufferingUpdateListener) {
        this.mOnBufferingUpdateListener = onBufferingUpdateListener;
    }

    public final void setOnCompletionListener(OnCompletionListener onCompletionListener) {
        this.mOnCompletionListener = onCompletionListener;
    }

    public final void setOnErrorListener(OnErrorListener onErrorListener) {
        this.mOnErrorListener = onErrorListener;
    }

    public final void setOnInfoListener(OnInfoListener onInfoListener) {
        this.mOnInfoListener = onInfoListener;
    }

    public final void setOnPreparedListener(OnPreparedListener onPreparedListener) {
        this.mOnPreparedListener = onPreparedListener;
    }

    public final void setOnSeekCompleteListener(OnSeekCompleteListener onSeekCompleteListener) {
        this.mOnSeekCompleteListener = onSeekCompleteListener;
    }

    public final void setOnTimedTextListener(OnTimedTextListener onTimedTextListener) {
        this.mOnTimedTextListener = onTimedTextListener;
    }

    public final void setOnVideoSizeChangedListener(OnVideoSizeChangedListener onVideoSizeChangedListener) {
        this.mOnVideoSizeChangedListener = onVideoSizeChangedListener;
    }
}
