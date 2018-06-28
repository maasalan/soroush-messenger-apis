package com.nineoldandroids.animation;

public class TimeAnimator extends ValueAnimator {
    private TimeListener mListener;
    private long mPreviousTime = -1;

    public interface TimeListener {
        void onTimeUpdate(TimeAnimator timeAnimator, long j, long j2);
    }

    void animateValue(float f) {
    }

    boolean animationFrame(long j) {
        if (this.mPlayingState == 0) {
            this.mPlayingState = 1;
            if (this.mSeekTime < 0) {
                this.mStartTime = j;
            } else {
                this.mStartTime = j - this.mSeekTime;
                this.mSeekTime = -1;
            }
        }
        if (this.mListener != null) {
            long j2 = j - this.mStartTime;
            long j3 = this.mPreviousTime < 0 ? 0 : j - this.mPreviousTime;
            this.mPreviousTime = j;
            this.mListener.onTimeUpdate(this, j2, j3);
        }
        return false;
    }

    void initAnimation() {
    }

    public void setTimeListener(TimeListener timeListener) {
        this.mListener = timeListener;
    }
}
