package org.linphone.mediastream;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaFormat;
import java.nio.ByteBuffer;
import tv.danmaku.ijk.media.player.IjkMediaCodecInfo;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

@TargetApi(16)
public class AACFilter {
    private static AACFilter singleton;
    int bitrate;
    int channelCount;
    MediaCodec decoder;
    BufferInfo decoderBufferInfo;
    ByteBuffer[] decoderInputBuffers;
    ByteBuffer[] decoderOutputBuffers;
    MediaCodec encoder;
    BufferInfo encoderBufferInfo;
    ByteBuffer[] encoderInputBuffers;
    ByteBuffer[] encoderOutputBuffers;
    boolean initialized = false;
    int sampleRate;

    private static int dequeueData(MediaCodec mediaCodec, ByteBuffer[] byteBufferArr, BufferInfo bufferInfo, byte[] bArr) {
        int i = 0;
        while (i <= 0) {
            int dequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 100);
            StringBuilder stringBuilder;
            if (dequeueOutputBuffer >= 0) {
                if (bArr.length < bufferInfo.size) {
                    Object[] objArr = new Object[1];
                    stringBuilder = new StringBuilder("array is too small ");
                    stringBuilder.append(bArr.length);
                    stringBuilder.append(" < ");
                    stringBuilder.append(bufferInfo.size);
                    objArr[0] = stringBuilder.toString();
                    Log.m22095e(objArr);
                }
                if (bufferInfo.flags == 2) {
                    Log.m22099i("JUST READ MediaCodec.BUFFER_FLAG_CODEC_CONFIG buffer");
                }
                byteBufferArr[dequeueOutputBuffer].get(bArr, 0, bufferInfo.size);
                byteBufferArr[dequeueOutputBuffer].position(0);
                mediaCodec.releaseOutputBuffer(dequeueOutputBuffer, false);
                return bufferInfo.size;
            } else if (dequeueOutputBuffer == -3) {
                return -3;
            } else {
                if (dequeueOutputBuffer == -2) {
                    Log.m22099i("MediaCodec.INFO_OUTPUT_FORMAT_CHANGED");
                    Object[] objArr2 = new Object[1];
                    stringBuilder = new StringBuilder("CHANNEL_COUNT: ");
                    stringBuilder.append(mediaCodec.getOutputFormat().getInteger("channel-count"));
                    objArr2[0] = stringBuilder.toString();
                    Log.m22099i(objArr2);
                    objArr2 = new Object[1];
                    StringBuilder stringBuilder2 = new StringBuilder("SAMPLE_RATE: ");
                    stringBuilder2.append(mediaCodec.getOutputFormat().getInteger("sample-rate"));
                    objArr2[0] = stringBuilder2.toString();
                    Log.m22099i(objArr2);
                }
                i++;
            }
        }
        return 0;
    }

    public static AACFilter instance() {
        if (singleton == null) {
            singleton = new AACFilter();
        }
        return singleton;
    }

    private static boolean queueData(MediaCodec mediaCodec, ByteBuffer[] byteBufferArr, byte[] bArr, int i) {
        int dequeueInputBuffer = mediaCodec.dequeueInputBuffer(0);
        if (dequeueInputBuffer < 0) {
            return false;
        }
        byteBufferArr[dequeueInputBuffer].position(0);
        byteBufferArr[dequeueInputBuffer].put(bArr, 0, i);
        mediaCodec.queueInputBuffer(dequeueInputBuffer, 0, i, 0, 0);
        return true;
    }

    public boolean postprocess() {
        if (this.initialized) {
            this.encoder.flush();
            Log.m22099i("Stopping encoder");
            this.encoder.stop();
            Log.m22099i("Stopping decoder");
            this.decoder.flush();
            this.decoder.stop();
            Log.m22099i("Release encoder");
            this.encoder.release();
            Log.m22099i("Release decoder");
            this.decoder.release();
            this.encoder = null;
            this.decoder = null;
            this.initialized = false;
        }
        return true;
    }

    public boolean preprocess(int i, int i2, int i3, boolean z) {
        Throwable e;
        Object[] objArr;
        if (this.initialized) {
            return true;
        }
        this.sampleRate = i;
        this.channelCount = i2;
        this.bitrate = i3;
        try {
            MediaFormat createAudioFormat;
            MediaFormat createAudioFormat2 = MediaFormat.createAudioFormat("audio/mp4a-latm", i, i2);
            createAudioFormat2.setInteger("aac-profile", 39);
            createAudioFormat2.setInteger(IjkMediaMeta.IJKM_KEY_BITRATE, i3);
            this.encoder = MediaCodec.createByCodecName("OMX.google.aac.encoder");
            this.encoder.configure(createAudioFormat2, null, null, 1);
            this.encoder.start();
            this.encoderBufferInfo = new BufferInfo();
            int i4 = 0;
            byte[] bArr = null;
            while (bArr == null && i4 < IjkMediaCodecInfo.RANK_MAX) {
                int dequeueOutputBuffer = this.encoder.dequeueOutputBuffer(this.encoderBufferInfo, 0);
                if (dequeueOutputBuffer >= 0 && this.encoderBufferInfo.flags == 2) {
                    bArr = new byte[this.encoderBufferInfo.size];
                    this.encoder.getOutputBuffers()[dequeueOutputBuffer].get(bArr, 0, this.encoderBufferInfo.size);
                    this.encoder.getOutputBuffers()[dequeueOutputBuffer].position(0);
                    this.encoder.releaseOutputBuffer(dequeueOutputBuffer, false);
                }
                i4++;
            }
            this.encoderOutputBuffers = this.encoder.getOutputBuffers();
            this.encoderInputBuffers = this.encoder.getInputBuffers();
            if (bArr == null) {
                Log.m22095e("Sigh, failed to read asc from encoder");
            }
            Log.m22099i("AAC encoder initialized");
            if (bArr != null) {
                try {
                    createAudioFormat = MediaFormat.createAudioFormat("audio/mp4a-latm", 0, 0);
                    createAudioFormat.setByteBuffer("csd-0", ByteBuffer.wrap(bArr));
                } catch (Exception e2) {
                    e = e2;
                    objArr = new Object[]{"Unable to create AAC Decoder"};
                    Log.m22094e(e, objArr);
                    return false;
                }
            }
            createAudioFormat = MediaFormat.createAudioFormat("audio/mp4a-latm", i, i2);
            createAudioFormat.setInteger(IjkMediaMeta.IJKM_KEY_BITRATE, i3);
            this.decoder = MediaCodec.createByCodecName("OMX.google.aac.decoder");
            this.decoder.configure(createAudioFormat, null, null, 0);
            this.decoder.start();
            this.decoderOutputBuffers = this.decoder.getOutputBuffers();
            this.decoderInputBuffers = this.decoder.getInputBuffers();
            this.decoderBufferInfo = new BufferInfo();
            Log.m22099i("AAC decoder initialized");
            this.initialized = true;
            return true;
        } catch (Exception e3) {
            e = e3;
            objArr = new Object[]{"Unable to create AAC Encoder"};
            Log.m22094e(e, objArr);
            return false;
        }
    }

    public int pullFromDecoder(byte[] r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        r0 = r3.decoder;	 Catch:{ Exception -> 0x001b }
        r1 = r3.decoderOutputBuffers;	 Catch:{ Exception -> 0x001b }
        r2 = r3.decoderBufferInfo;	 Catch:{ Exception -> 0x001b }
        r0 = dequeueData(r0, r1, r2, r4);	 Catch:{ Exception -> 0x001b }
        r1 = -3;	 Catch:{ Exception -> 0x001b }
        if (r0 != r1) goto L_0x001a;	 Catch:{ Exception -> 0x001b }
    L_0x000d:
        r0 = r3.decoder;	 Catch:{ Exception -> 0x001b }
        r0 = r0.getOutputBuffers();	 Catch:{ Exception -> 0x001b }
        r3.decoderOutputBuffers = r0;	 Catch:{ Exception -> 0x001b }
        r4 = r3.pullFromDecoder(r4);	 Catch:{ Exception -> 0x001b }
        return r4;
    L_0x001a:
        return r0;
    L_0x001b:
        r4 = 0;
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.linphone.mediastream.AACFilter.pullFromDecoder(byte[]):int");
    }

    public int pullFromEncoder(byte[] r4) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
        /*
        r3 = this;
        r0 = r3.encoder;	 Catch:{ Exception -> 0x001b }
        r1 = r3.encoderOutputBuffers;	 Catch:{ Exception -> 0x001b }
        r2 = r3.encoderBufferInfo;	 Catch:{ Exception -> 0x001b }
        r0 = dequeueData(r0, r1, r2, r4);	 Catch:{ Exception -> 0x001b }
        r1 = -3;	 Catch:{ Exception -> 0x001b }
        if (r0 != r1) goto L_0x001a;	 Catch:{ Exception -> 0x001b }
    L_0x000d:
        r0 = r3.encoder;	 Catch:{ Exception -> 0x001b }
        r0 = r0.getOutputBuffers();	 Catch:{ Exception -> 0x001b }
        r3.encoderOutputBuffers = r0;	 Catch:{ Exception -> 0x001b }
        r4 = r3.pullFromDecoder(r4);	 Catch:{ Exception -> 0x001b }
        return r4;
    L_0x001a:
        return r0;
    L_0x001b:
        r4 = 0;
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.linphone.mediastream.AACFilter.pullFromEncoder(byte[]):int");
    }

    public boolean pushToDecoder(byte[] bArr, int i) {
        if (bArr != null) {
            try {
                if (this.decoder != null) {
                    return queueData(this.decoder, this.decoderInputBuffers, bArr, i);
                }
            } catch (Throwable e) {
                Log.m22094e(e, "Push to decoder failed");
            }
        }
        return false;
    }

    public boolean pushToEncoder(byte[] bArr, int i) {
        if (bArr != null) {
            try {
                if (this.encoder != null) {
                    return queueData(this.encoder, this.encoderInputBuffers, bArr, i);
                }
            } catch (Throwable e) {
                Log.m22094e(e, "Push to encoder failed");
            }
        }
        return false;
    }
}
