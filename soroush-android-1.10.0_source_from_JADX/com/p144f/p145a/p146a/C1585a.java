package com.p144f.p145a.p146a;

import android.media.MediaRecorder;
import android.util.Log;
import java.io.File;
import java.io.IOException;

public final class C1585a {
    private int f4919a;
    private C1583a f4920b;
    private long f4921c;
    private MediaRecorder f4922d;

    public interface C1583a {
        void mo2206a();
    }

    private static class C1584b {
        private static final C1585a f4918a = new C1585a();
    }

    private C1585a() {
        this.f4919a = 0;
        this.f4921c = 0;
    }

    private synchronized boolean m4104b(File file) {
        m4108b();
        this.f4922d = new MediaRecorder();
        this.f4922d.setAudioSource(1);
        this.f4922d.setOutputFormat(2);
        this.f4922d.setAudioSamplingRate(44100);
        this.f4922d.setAudioEncodingBitRate(44100);
        this.f4922d.setAudioEncoder(3);
        this.f4922d.setOutputFile(file.getAbsolutePath());
        try {
            this.f4922d.prepare();
            this.f4919a = 1;
        } catch (IOException e) {
            StringBuilder stringBuilder = new StringBuilder("startRecord fail, prepare fail: ");
            stringBuilder.append(e.getMessage());
            Log.w("AudioRecorder", stringBuilder.toString());
            m4105c();
            this.f4922d.reset();
            this.f4922d.release();
            this.f4922d = null;
            return false;
        }
        return true;
    }

    private void m4105c() {
        if (this.f4920b != null) {
            this.f4920b.mo2206a();
        }
    }

    public final synchronized boolean m4106a() {
        if (this.f4922d != null) {
            if (this.f4919a == 1) {
                try {
                    this.f4922d.start();
                    this.f4921c = System.currentTimeMillis();
                    this.f4919a = 2;
                    return true;
                } catch (RuntimeException e) {
                    StringBuilder stringBuilder = new StringBuilder("startRecord fail, start fail: ");
                    stringBuilder.append(e.getMessage());
                    Log.w("AudioRecorder", stringBuilder.toString());
                    m4105c();
                    this.f4922d.reset();
                    this.f4922d.release();
                    this.f4922d = null;
                    return false;
                }
            }
        }
        m4105c();
        return false;
    }

    public final synchronized boolean m4107a(File file) {
        return m4104b(file);
    }

    public final synchronized int m4108b() {
        StringBuilder stringBuilder;
        int i = -1;
        if (this.f4922d == null) {
            this.f4919a = 0;
            return -1;
        }
        if (this.f4919a == 2) {
            try {
                Thread.sleep(300);
                this.f4922d.stop();
                i = (int) ((System.currentTimeMillis() - this.f4921c) / 1000);
            } catch (RuntimeException e) {
                String str = "AudioRecorder";
                stringBuilder = new StringBuilder("stopRecord fail, stop fail(no audio data recorded): ");
                stringBuilder.append(e.getMessage());
                String stringBuilder2 = stringBuilder.toString();
                Log.w(str, stringBuilder2);
                this.f4922d.reset();
                this.f4922d.release();
                this.f4922d = null;
                this.f4919a = 0;
                return i;
            } catch (InterruptedException e2) {
                str = "AudioRecorder";
                stringBuilder = new StringBuilder("stopRecord fail, stop fail(InterruptedException): ");
                stringBuilder.append(e2.getMessage());
                stringBuilder2 = stringBuilder.toString();
                Log.w(str, stringBuilder2);
                this.f4922d.reset();
                this.f4922d.release();
                this.f4922d = null;
                this.f4919a = 0;
                return i;
            }
        }
        try {
            this.f4922d.reset();
        } catch (RuntimeException e3) {
            stringBuilder = new StringBuilder("stopRecord fail, reset fail ");
            stringBuilder.append(e3.getMessage());
            Log.w("AudioRecorder", stringBuilder.toString());
        }
        this.f4922d.release();
        this.f4922d = null;
        this.f4919a = 0;
        return i;
    }
}
