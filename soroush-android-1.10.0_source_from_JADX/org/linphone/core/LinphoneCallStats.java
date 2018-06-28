package org.linphone.core;

import java.util.Vector;

public interface LinphoneCallStats {

    public static class IceState {
        public static IceState Failed = new IceState(1, "Failed");
        public static IceState HostConnection = new IceState(3, "Host connection");
        public static IceState InProgress = new IceState(2, "In progress");
        public static IceState NotActivated = new IceState(0, "Not activated");
        public static IceState ReflexiveConnection = new IceState(4, "Reflexive connection");
        public static IceState RelayConnection = new IceState(5, "Relay connection");
        private static Vector<IceState> values = new Vector();
        private final String mStringValue;
        protected final int mValue;

        private IceState(int i, String str) {
            this.mValue = i;
            values.addElement(this);
            this.mStringValue = str;
        }

        public static IceState fromInt(int i) {
            for (int i2 = 0; i2 < values.size(); i2++) {
                IceState iceState = (IceState) values.elementAt(i2);
                if (iceState.mValue == i) {
                    return iceState;
                }
            }
            StringBuilder stringBuilder = new StringBuilder("IceState not found [");
            stringBuilder.append(i);
            stringBuilder.append("]");
            throw new RuntimeException(stringBuilder.toString());
        }

        public String toString() {
            return this.mStringValue;
        }
    }

    public static class MediaType {
        public static MediaType Audio = new MediaType(0, "Audio");
        public static MediaType Text = new MediaType(2, "Text");
        public static MediaType Video = new MediaType(1, "Video");
        private static Vector<MediaType> values = new Vector();
        private final String mStringValue;
        protected final int mValue;

        private MediaType(int i, String str) {
            this.mValue = i;
            values.addElement(this);
            this.mStringValue = str;
        }

        public static MediaType fromInt(int i) {
            for (int i2 = 0; i2 < values.size(); i2++) {
                MediaType mediaType = (MediaType) values.elementAt(i2);
                if (mediaType.mValue == i) {
                    return mediaType;
                }
            }
            StringBuilder stringBuilder = new StringBuilder("MediaType not found [");
            stringBuilder.append(i);
            stringBuilder.append("]");
            throw new RuntimeException(stringBuilder.toString());
        }

        public String toString() {
            return this.mStringValue;
        }
    }

    float getDownloadBandwidth();

    IceState getIceState();

    float getJitterBufferSize();

    long getLatePacketsCumulativeNumber();

    float getLocalLateRate();

    float getLocalLossRate();

    MediaType getMediaType();

    float getReceiverInterarrivalJitter();

    float getReceiverLossRate();

    float getRoundTripDelay();

    float getSenderInterarrivalJitter();

    float getSenderLossRate();

    float getUploadBandwidth();
}
