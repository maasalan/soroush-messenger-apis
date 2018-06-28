package com.googlecode.mp4parser.boxes.mp4.objectdescriptors;

import com.coremedia.iso.Hex;
import com.coremedia.iso.IsoTypeWriter;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@Descriptor(objectTypeIndication = 64, tags = {5})
public class AudioSpecificConfig extends BaseDescriptor {
    public static Map<Integer, String> audioObjectTypeMap = new HashMap();
    public static Map<Integer, Integer> samplingFrequencyIndexMap = new HashMap();
    public boolean aacScalefactorDataResilienceFlag;
    public boolean aacSectionDataResilienceFlag;
    public boolean aacSpectralDataResilienceFlag;
    public int audioObjectType;
    public int channelConfiguration;
    byte[] configBytes;
    public int coreCoderDelay;
    public int dependsOnCoreCoder;
    public int directMapping;
    public ELDSpecificConfig eldSpecificConfig;
    public int epConfig;
    public int erHvxcExtensionFlag;
    public int extensionAudioObjectType;
    public int extensionChannelConfiguration;
    public int extensionFlag;
    public int extensionFlag3;
    public int extensionSamplingFrequency;
    public int extensionSamplingFrequencyIndex;
    public int fillBits;
    public int frameLengthFlag;
    public boolean gaSpecificConfig;
    public int hilnContMode;
    public int hilnEnhaLayer;
    public int hilnEnhaQuantMode;
    public int hilnFrameLength;
    public int hilnMaxNumLine;
    public int hilnQuantMode;
    public int hilnSampleRateCode;
    public int hvxcRateMode;
    public int hvxcVarMode;
    public int isBaseLayer;
    public int layerNr;
    public int layer_length;
    public int numOfSubFrame;
    public int paraExtensionFlag;
    public int paraMode;
    public boolean parametricSpecificConfig;
    public boolean psPresentFlag;
    public int sacPayloadEmbedding;
    public int samplingFrequency;
    public int samplingFrequencyIndex;
    public boolean sbrPresentFlag;
    public int syncExtensionType;
    public int var_ScalableFlag;

    public class ELDSpecificConfig {
        private static final int ELDEXT_TERM = 0;
        public boolean aacScalefactorDataResilienceFlag;
        public boolean aacSectionDataResilienceFlag;
        public boolean aacSpectralDataResilienceFlag;
        public boolean frameLengthFlag;
        public boolean ldSbrCrcFlag;
        public boolean ldSbrPresentFlag;
        public boolean ldSbrSamplingRate;

        public ELDSpecificConfig(int i, BitReaderBuffer bitReaderBuffer) {
            this.frameLengthFlag = bitReaderBuffer.readBool();
            this.aacSectionDataResilienceFlag = bitReaderBuffer.readBool();
            this.aacScalefactorDataResilienceFlag = bitReaderBuffer.readBool();
            this.aacSpectralDataResilienceFlag = bitReaderBuffer.readBool();
            this.ldSbrPresentFlag = bitReaderBuffer.readBool();
            if (this.ldSbrPresentFlag) {
                this.ldSbrSamplingRate = bitReaderBuffer.readBool();
                this.ldSbrCrcFlag = bitReaderBuffer.readBool();
                ld_sbr_header(i, bitReaderBuffer);
            }
            while (bitReaderBuffer.readBits(4) != 0) {
                int readBits = bitReaderBuffer.readBits(4);
                int i2 = 0;
                if (readBits == 15) {
                    i = bitReaderBuffer.readBits(8);
                    readBits += i;
                } else {
                    i = 0;
                }
                if (i == 255) {
                    readBits += bitReaderBuffer.readBits(16);
                }
                while (i2 < readBits) {
                    bitReaderBuffer.readBits(8);
                    i2++;
                }
            }
        }

        public void ld_sbr_header(int i, BitReaderBuffer bitReaderBuffer) {
            int i2 = 0;
            switch (i) {
                case 1:
                case 2:
                    i = 1;
                    break;
                case 3:
                    i = 2;
                    break;
                case 4:
                case 5:
                case 6:
                    i = 3;
                    break;
                case 7:
                    i = 4;
                    break;
                default:
                    i = 0;
                    break;
            }
            while (i2 < i) {
                sbr_header com_googlecode_mp4parser_boxes_mp4_objectdescriptors_AudioSpecificConfig_sbr_header = new sbr_header(bitReaderBuffer);
                i2++;
            }
        }
    }

    public class sbr_header {
        public boolean bs_alter_scale;
        public boolean bs_amp_res;
        public int bs_freq_scale;
        public boolean bs_header_extra_1;
        public boolean bs_header_extra_2;
        public boolean bs_interpol_freq;
        public int bs_limiter_bands;
        public int bs_limiter_gains;
        public int bs_noise_bands;
        public int bs_reserved;
        public boolean bs_smoothing_mode;
        public int bs_start_freq;
        public int bs_stop_freq;
        public int bs_xover_band;

        public sbr_header(BitReaderBuffer bitReaderBuffer) {
            this.bs_amp_res = bitReaderBuffer.readBool();
            this.bs_start_freq = bitReaderBuffer.readBits(4);
            this.bs_stop_freq = bitReaderBuffer.readBits(4);
            this.bs_xover_band = bitReaderBuffer.readBits(3);
            this.bs_reserved = bitReaderBuffer.readBits(2);
            this.bs_header_extra_1 = bitReaderBuffer.readBool();
            this.bs_header_extra_2 = bitReaderBuffer.readBool();
            if (this.bs_header_extra_1) {
                this.bs_freq_scale = bitReaderBuffer.readBits(2);
                this.bs_alter_scale = bitReaderBuffer.readBool();
                this.bs_noise_bands = bitReaderBuffer.readBits(2);
            }
            if (this.bs_header_extra_2) {
                this.bs_limiter_bands = bitReaderBuffer.readBits(2);
                this.bs_limiter_gains = bitReaderBuffer.readBits(2);
                this.bs_interpol_freq = bitReaderBuffer.readBool();
            }
            this.bs_smoothing_mode = bitReaderBuffer.readBool();
        }
    }

    static {
        samplingFrequencyIndexMap.put(Integer.valueOf(0), Integer.valueOf(96000));
        samplingFrequencyIndexMap.put(Integer.valueOf(1), Integer.valueOf(88200));
        samplingFrequencyIndexMap.put(Integer.valueOf(2), Integer.valueOf(64000));
        samplingFrequencyIndexMap.put(Integer.valueOf(3), Integer.valueOf(48000));
        samplingFrequencyIndexMap.put(Integer.valueOf(4), Integer.valueOf(44100));
        samplingFrequencyIndexMap.put(Integer.valueOf(5), Integer.valueOf(32000));
        samplingFrequencyIndexMap.put(Integer.valueOf(6), Integer.valueOf(24000));
        samplingFrequencyIndexMap.put(Integer.valueOf(7), Integer.valueOf(22050));
        samplingFrequencyIndexMap.put(Integer.valueOf(8), Integer.valueOf(16000));
        samplingFrequencyIndexMap.put(Integer.valueOf(9), Integer.valueOf(12000));
        samplingFrequencyIndexMap.put(Integer.valueOf(10), Integer.valueOf(11025));
        samplingFrequencyIndexMap.put(Integer.valueOf(11), Integer.valueOf(8000));
        audioObjectTypeMap.put(Integer.valueOf(1), "AAC main");
        audioObjectTypeMap.put(Integer.valueOf(2), "AAC LC");
        audioObjectTypeMap.put(Integer.valueOf(3), "AAC SSR");
        audioObjectTypeMap.put(Integer.valueOf(4), "AAC LTP");
        audioObjectTypeMap.put(Integer.valueOf(5), "SBR");
        audioObjectTypeMap.put(Integer.valueOf(6), "AAC Scalable");
        audioObjectTypeMap.put(Integer.valueOf(7), "TwinVQ");
        audioObjectTypeMap.put(Integer.valueOf(8), "CELP");
        audioObjectTypeMap.put(Integer.valueOf(9), "HVXC");
        audioObjectTypeMap.put(Integer.valueOf(10), "(reserved)");
        audioObjectTypeMap.put(Integer.valueOf(11), "(reserved)");
        audioObjectTypeMap.put(Integer.valueOf(12), "TTSI");
        audioObjectTypeMap.put(Integer.valueOf(13), "Main synthetic");
        audioObjectTypeMap.put(Integer.valueOf(14), "Wavetable synthesis");
        audioObjectTypeMap.put(Integer.valueOf(15), "General MIDI");
        audioObjectTypeMap.put(Integer.valueOf(16), "Algorithmic Synthesis and Audio FX");
        audioObjectTypeMap.put(Integer.valueOf(17), "ER AAC LC");
        audioObjectTypeMap.put(Integer.valueOf(18), "(reserved)");
        audioObjectTypeMap.put(Integer.valueOf(19), "ER AAC LTP");
        audioObjectTypeMap.put(Integer.valueOf(20), "ER AAC Scalable");
        audioObjectTypeMap.put(Integer.valueOf(21), "ER TwinVQ");
        audioObjectTypeMap.put(Integer.valueOf(22), "ER BSAC");
        audioObjectTypeMap.put(Integer.valueOf(23), "ER AAC LD");
        audioObjectTypeMap.put(Integer.valueOf(24), "ER CELP");
        audioObjectTypeMap.put(Integer.valueOf(25), "ER HVXC");
        audioObjectTypeMap.put(Integer.valueOf(26), "ER HILN");
        audioObjectTypeMap.put(Integer.valueOf(27), "ER Parametric");
        audioObjectTypeMap.put(Integer.valueOf(28), "SSC");
        audioObjectTypeMap.put(Integer.valueOf(29), "PS");
        audioObjectTypeMap.put(Integer.valueOf(30), "MPEG Surround");
        audioObjectTypeMap.put(Integer.valueOf(31), "(escape)");
        audioObjectTypeMap.put(Integer.valueOf(32), "Layer-1");
        audioObjectTypeMap.put(Integer.valueOf(33), "Layer-2");
        audioObjectTypeMap.put(Integer.valueOf(34), "Layer-3");
        audioObjectTypeMap.put(Integer.valueOf(35), "DST");
        audioObjectTypeMap.put(Integer.valueOf(36), "ALS");
        audioObjectTypeMap.put(Integer.valueOf(37), "SLS");
        audioObjectTypeMap.put(Integer.valueOf(38), "SLS non-core");
        audioObjectTypeMap.put(Integer.valueOf(39), "ER AAC ELD");
        audioObjectTypeMap.put(Integer.valueOf(40), "SMR Simple");
        audioObjectTypeMap.put(Integer.valueOf(41), "SMR Main");
    }

    private int gaSpecificConfigSize() {
        return 0;
    }

    private int getAudioObjectType(BitReaderBuffer bitReaderBuffer) {
        int readBits = bitReaderBuffer.readBits(5);
        return readBits == 31 ? 32 + bitReaderBuffer.readBits(6) : readBits;
    }

    private void parseErHvxcConfig(int i, int i2, int i3, BitReaderBuffer bitReaderBuffer) {
        this.hvxcVarMode = bitReaderBuffer.readBits(1);
        this.hvxcRateMode = bitReaderBuffer.readBits(2);
        this.erHvxcExtensionFlag = bitReaderBuffer.readBits(1);
        if (this.erHvxcExtensionFlag == 1) {
            this.var_ScalableFlag = bitReaderBuffer.readBits(1);
        }
    }

    private void parseGaSpecificConfig(int i, int i2, int i3, BitReaderBuffer bitReaderBuffer) {
        this.frameLengthFlag = bitReaderBuffer.readBits(1);
        this.dependsOnCoreCoder = bitReaderBuffer.readBits(1);
        if (this.dependsOnCoreCoder == 1) {
            this.coreCoderDelay = bitReaderBuffer.readBits(14);
        }
        this.extensionFlag = bitReaderBuffer.readBits(1);
        if (i2 == 0) {
            throw new UnsupportedOperationException("can't parse program_config_element yet");
        }
        if (i3 == 6 || i3 == 20) {
            this.layerNr = bitReaderBuffer.readBits(3);
        }
        if (this.extensionFlag == 1) {
            if (i3 == 22) {
                this.numOfSubFrame = bitReaderBuffer.readBits(5);
                this.layer_length = bitReaderBuffer.readBits(11);
            }
            if (i3 == 17 || i3 == 19 || i3 == 20 || i3 == 23) {
                this.aacSectionDataResilienceFlag = bitReaderBuffer.readBool();
                this.aacScalefactorDataResilienceFlag = bitReaderBuffer.readBool();
                this.aacSpectralDataResilienceFlag = bitReaderBuffer.readBool();
            }
            this.extensionFlag3 = bitReaderBuffer.readBits(1);
        }
        this.gaSpecificConfig = true;
    }

    private void parseHilnConfig(int i, int i2, int i3, BitReaderBuffer bitReaderBuffer) {
        this.hilnQuantMode = bitReaderBuffer.readBits(1);
        this.hilnMaxNumLine = bitReaderBuffer.readBits(8);
        this.hilnSampleRateCode = bitReaderBuffer.readBits(4);
        this.hilnFrameLength = bitReaderBuffer.readBits(12);
        this.hilnContMode = bitReaderBuffer.readBits(2);
    }

    private void parseHilnEnexConfig(int i, int i2, int i3, BitReaderBuffer bitReaderBuffer) {
        this.hilnEnhaLayer = bitReaderBuffer.readBits(1);
        if (this.hilnEnhaLayer == 1) {
            this.hilnEnhaQuantMode = bitReaderBuffer.readBits(2);
        }
    }

    private void parseParaConfig(int i, int i2, int i3, BitReaderBuffer bitReaderBuffer) {
        this.paraMode = bitReaderBuffer.readBits(2);
        if (this.paraMode != 1) {
            parseErHvxcConfig(i, i2, i3, bitReaderBuffer);
        }
        if (this.paraMode != 0) {
            parseHilnConfig(i, i2, i3, bitReaderBuffer);
        }
        this.paraExtensionFlag = bitReaderBuffer.readBits(1);
        this.parametricSpecificConfig = true;
    }

    private void parseParametricSpecificConfig(int i, int i2, int i3, BitReaderBuffer bitReaderBuffer) {
        this.isBaseLayer = bitReaderBuffer.readBits(1);
        if (this.isBaseLayer == 1) {
            parseParaConfig(i, i2, i3, bitReaderBuffer);
        } else {
            parseHilnEnexConfig(i, i2, i3, bitReaderBuffer);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AudioSpecificConfig audioSpecificConfig = (AudioSpecificConfig) obj;
        return this.aacScalefactorDataResilienceFlag == audioSpecificConfig.aacScalefactorDataResilienceFlag && this.aacSectionDataResilienceFlag == audioSpecificConfig.aacSectionDataResilienceFlag && this.aacSpectralDataResilienceFlag == audioSpecificConfig.aacSpectralDataResilienceFlag && this.audioObjectType == audioSpecificConfig.audioObjectType && this.channelConfiguration == audioSpecificConfig.channelConfiguration && this.coreCoderDelay == audioSpecificConfig.coreCoderDelay && this.dependsOnCoreCoder == audioSpecificConfig.dependsOnCoreCoder && this.directMapping == audioSpecificConfig.directMapping && this.epConfig == audioSpecificConfig.epConfig && this.erHvxcExtensionFlag == audioSpecificConfig.erHvxcExtensionFlag && this.extensionAudioObjectType == audioSpecificConfig.extensionAudioObjectType && this.extensionChannelConfiguration == audioSpecificConfig.extensionChannelConfiguration && this.extensionFlag == audioSpecificConfig.extensionFlag && this.extensionFlag3 == audioSpecificConfig.extensionFlag3 && this.extensionSamplingFrequency == audioSpecificConfig.extensionSamplingFrequency && this.extensionSamplingFrequencyIndex == audioSpecificConfig.extensionSamplingFrequencyIndex && this.fillBits == audioSpecificConfig.fillBits && this.frameLengthFlag == audioSpecificConfig.frameLengthFlag && this.gaSpecificConfig == audioSpecificConfig.gaSpecificConfig && this.hilnContMode == audioSpecificConfig.hilnContMode && this.hilnEnhaLayer == audioSpecificConfig.hilnEnhaLayer && this.hilnEnhaQuantMode == audioSpecificConfig.hilnEnhaQuantMode && this.hilnFrameLength == audioSpecificConfig.hilnFrameLength && this.hilnMaxNumLine == audioSpecificConfig.hilnMaxNumLine && this.hilnQuantMode == audioSpecificConfig.hilnQuantMode && this.hilnSampleRateCode == audioSpecificConfig.hilnSampleRateCode && this.hvxcRateMode == audioSpecificConfig.hvxcRateMode && this.hvxcVarMode == audioSpecificConfig.hvxcVarMode && this.isBaseLayer == audioSpecificConfig.isBaseLayer && this.layerNr == audioSpecificConfig.layerNr && this.layer_length == audioSpecificConfig.layer_length && this.numOfSubFrame == audioSpecificConfig.numOfSubFrame && this.paraExtensionFlag == audioSpecificConfig.paraExtensionFlag && this.paraMode == audioSpecificConfig.paraMode && this.parametricSpecificConfig == audioSpecificConfig.parametricSpecificConfig && this.psPresentFlag == audioSpecificConfig.psPresentFlag && this.sacPayloadEmbedding == audioSpecificConfig.sacPayloadEmbedding && this.samplingFrequency == audioSpecificConfig.samplingFrequency && this.samplingFrequencyIndex == audioSpecificConfig.samplingFrequencyIndex && this.sbrPresentFlag == audioSpecificConfig.sbrPresentFlag && this.syncExtensionType == audioSpecificConfig.syncExtensionType && this.var_ScalableFlag == audioSpecificConfig.var_ScalableFlag && Arrays.equals(this.configBytes, audioSpecificConfig.configBytes);
    }

    public int getAudioObjectType() {
        return this.audioObjectType;
    }

    public int getChannelConfiguration() {
        return this.channelConfiguration;
    }

    public byte[] getConfigBytes() {
        return this.configBytes;
    }

    public int getExtensionAudioObjectType() {
        return this.extensionAudioObjectType;
    }

    public int getSamplingFrequency() {
        return this.samplingFrequencyIndex == 15 ? this.samplingFrequency : ((Integer) samplingFrequencyIndexMap.get(Integer.valueOf(this.samplingFrequencyIndex))).intValue();
    }

    public int hashCode() {
        return (31 * (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.configBytes != null ? Arrays.hashCode(this.configBytes) : 0) * 31) + this.audioObjectType) * 31) + this.samplingFrequencyIndex) * 31) + this.samplingFrequency) * 31) + this.channelConfiguration) * 31) + this.extensionAudioObjectType) * 31) + this.sbrPresentFlag) * 31) + this.psPresentFlag) * 31) + this.extensionSamplingFrequencyIndex) * 31) + this.extensionSamplingFrequency) * 31) + this.extensionChannelConfiguration) * 31) + this.sacPayloadEmbedding) * 31) + this.fillBits) * 31) + this.epConfig) * 31) + this.directMapping) * 31) + this.syncExtensionType) * 31) + this.frameLengthFlag) * 31) + this.dependsOnCoreCoder) * 31) + this.coreCoderDelay) * 31) + this.extensionFlag) * 31) + this.layerNr) * 31) + this.numOfSubFrame) * 31) + this.layer_length) * 31) + this.aacSectionDataResilienceFlag) * 31) + this.aacScalefactorDataResilienceFlag) * 31) + this.aacSpectralDataResilienceFlag) * 31) + this.extensionFlag3) * 31) + this.gaSpecificConfig) * 31) + this.isBaseLayer) * 31) + this.paraMode) * 31) + this.paraExtensionFlag) * 31) + this.hvxcVarMode) * 31) + this.hvxcRateMode) * 31) + this.erHvxcExtensionFlag) * 31) + this.var_ScalableFlag) * 31) + this.hilnQuantMode) * 31) + this.hilnMaxNumLine) * 31) + this.hilnSampleRateCode) * 31) + this.hilnFrameLength) * 31) + this.hilnContMode) * 31) + this.hilnEnhaLayer) * 31) + this.hilnEnhaQuantMode)) + this.parametricSpecificConfig;
    }

    public void parseDetail(ByteBuffer byteBuffer) {
        int i;
        ByteBuffer slice = byteBuffer.slice();
        slice.limit(this.sizeOfInstance);
        byteBuffer.position(byteBuffer.position() + this.sizeOfInstance);
        this.configBytes = new byte[this.sizeOfInstance];
        slice.get(this.configBytes);
        slice.rewind();
        BitReaderBuffer bitReaderBuffer = new BitReaderBuffer(slice);
        this.audioObjectType = getAudioObjectType(bitReaderBuffer);
        this.samplingFrequencyIndex = bitReaderBuffer.readBits(4);
        if (this.samplingFrequencyIndex == 15) {
            this.samplingFrequency = bitReaderBuffer.readBits(24);
        }
        this.channelConfiguration = bitReaderBuffer.readBits(4);
        if (this.audioObjectType != 5) {
            if (this.audioObjectType != 29) {
                this.extensionAudioObjectType = 0;
                switch (this.audioObjectType) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 6:
                    case 7:
                    case 17:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        parseGaSpecificConfig(this.samplingFrequencyIndex, this.channelConfiguration, this.audioObjectType, bitReaderBuffer);
                        break;
                    case 8:
                        throw new UnsupportedOperationException("can't parse CelpSpecificConfig yet");
                    case 9:
                        throw new UnsupportedOperationException("can't parse HvxcSpecificConfig yet");
                    case 12:
                        throw new UnsupportedOperationException("can't parse TTSSpecificConfig yet");
                    case 13:
                    case 14:
                    case 15:
                    case 16:
                        throw new UnsupportedOperationException("can't parse StructuredAudioSpecificConfig yet");
                    case 24:
                        throw new UnsupportedOperationException("can't parse ErrorResilientCelpSpecificConfig yet");
                    case 25:
                        throw new UnsupportedOperationException("can't parse ErrorResilientHvxcSpecificConfig yet");
                    case 26:
                    case 27:
                        parseParametricSpecificConfig(this.samplingFrequencyIndex, this.channelConfiguration, this.audioObjectType, bitReaderBuffer);
                        break;
                    case 28:
                        throw new UnsupportedOperationException("can't parse SSCSpecificConfig yet");
                    case 30:
                        this.sacPayloadEmbedding = bitReaderBuffer.readBits(1);
                        throw new UnsupportedOperationException("can't parse SpatialSpecificConfig yet");
                    case 32:
                    case 33:
                    case 34:
                        throw new UnsupportedOperationException("can't parse MPEG_1_2_SpecificConfig yet");
                    case 35:
                        throw new UnsupportedOperationException("can't parse DSTSpecificConfig yet");
                    case 36:
                        this.fillBits = bitReaderBuffer.readBits(5);
                        throw new UnsupportedOperationException("can't parse ALSSpecificConfig yet");
                    case 37:
                    case 38:
                        throw new UnsupportedOperationException("can't parse SLSSpecificConfig yet");
                    case 39:
                        this.eldSpecificConfig = new ELDSpecificConfig(this.channelConfiguration, bitReaderBuffer);
                        break;
                    case 40:
                    case 41:
                        throw new UnsupportedOperationException("can't parse SymbolicMusicSpecificConfig yet");
                    default:
                        break;
                }
                i = this.audioObjectType;
                if (!(i == 17 || i == 39)) {
                    switch (i) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                            break;
                        default:
                            break;
                    }
                }
                this.epConfig = bitReaderBuffer.readBits(2);
                if (this.epConfig != 2) {
                    if (this.epConfig == 3) {
                        if (this.epConfig == 3) {
                            this.directMapping = bitReaderBuffer.readBits(1);
                            if (this.directMapping == 0) {
                                throw new RuntimeException("not implemented");
                            }
                        }
                        if (this.extensionAudioObjectType != 5 && bitReaderBuffer.remainingBits() >= 16) {
                            this.syncExtensionType = bitReaderBuffer.readBits(11);
                            if (this.syncExtensionType == 695) {
                                this.extensionAudioObjectType = getAudioObjectType(bitReaderBuffer);
                                if (this.extensionAudioObjectType == 5) {
                                    this.sbrPresentFlag = bitReaderBuffer.readBool();
                                    if (this.sbrPresentFlag) {
                                        this.extensionSamplingFrequencyIndex = bitReaderBuffer.readBits(4);
                                        if (this.extensionSamplingFrequencyIndex == 15) {
                                            this.extensionSamplingFrequency = bitReaderBuffer.readBits(24);
                                        }
                                        if (bitReaderBuffer.remainingBits() >= 12) {
                                            this.syncExtensionType = bitReaderBuffer.readBits(11);
                                            if (this.syncExtensionType == 1352) {
                                                this.psPresentFlag = bitReaderBuffer.readBool();
                                            }
                                        }
                                    }
                                }
                                if (this.extensionAudioObjectType == 22) {
                                    this.sbrPresentFlag = bitReaderBuffer.readBool();
                                    if (this.sbrPresentFlag) {
                                        this.extensionSamplingFrequencyIndex = bitReaderBuffer.readBits(4);
                                        if (this.extensionSamplingFrequencyIndex == 15) {
                                            this.extensionSamplingFrequency = bitReaderBuffer.readBits(24);
                                        }
                                    }
                                    this.extensionChannelConfiguration = bitReaderBuffer.readBits(4);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
                throw new UnsupportedOperationException("can't parse ErrorProtectionSpecificConfig yet");
            }
        }
        this.extensionAudioObjectType = 5;
        this.sbrPresentFlag = true;
        if (this.audioObjectType == 29) {
            this.psPresentFlag = true;
        }
        this.extensionSamplingFrequencyIndex = bitReaderBuffer.readBits(4);
        if (this.extensionSamplingFrequencyIndex == 15) {
            this.extensionSamplingFrequency = bitReaderBuffer.readBits(24);
        }
        this.audioObjectType = getAudioObjectType(bitReaderBuffer);
        if (this.audioObjectType == 22) {
            this.extensionChannelConfiguration = bitReaderBuffer.readBits(4);
        }
        switch (this.audioObjectType) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 6:
            case 7:
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                parseGaSpecificConfig(this.samplingFrequencyIndex, this.channelConfiguration, this.audioObjectType, bitReaderBuffer);
                break;
            case 8:
                throw new UnsupportedOperationException("can't parse CelpSpecificConfig yet");
            case 9:
                throw new UnsupportedOperationException("can't parse HvxcSpecificConfig yet");
            case 12:
                throw new UnsupportedOperationException("can't parse TTSSpecificConfig yet");
            case 13:
            case 14:
            case 15:
            case 16:
                throw new UnsupportedOperationException("can't parse StructuredAudioSpecificConfig yet");
            case 24:
                throw new UnsupportedOperationException("can't parse ErrorResilientCelpSpecificConfig yet");
            case 25:
                throw new UnsupportedOperationException("can't parse ErrorResilientHvxcSpecificConfig yet");
            case 26:
            case 27:
                parseParametricSpecificConfig(this.samplingFrequencyIndex, this.channelConfiguration, this.audioObjectType, bitReaderBuffer);
                break;
            case 28:
                throw new UnsupportedOperationException("can't parse SSCSpecificConfig yet");
            case 30:
                this.sacPayloadEmbedding = bitReaderBuffer.readBits(1);
                throw new UnsupportedOperationException("can't parse SpatialSpecificConfig yet");
            case 32:
            case 33:
            case 34:
                throw new UnsupportedOperationException("can't parse MPEG_1_2_SpecificConfig yet");
            case 35:
                throw new UnsupportedOperationException("can't parse DSTSpecificConfig yet");
            case 36:
                this.fillBits = bitReaderBuffer.readBits(5);
                throw new UnsupportedOperationException("can't parse ALSSpecificConfig yet");
            case 37:
            case 38:
                throw new UnsupportedOperationException("can't parse SLSSpecificConfig yet");
            case 39:
                this.eldSpecificConfig = new ELDSpecificConfig(this.channelConfiguration, bitReaderBuffer);
                break;
            case 40:
            case 41:
                throw new UnsupportedOperationException("can't parse SymbolicMusicSpecificConfig yet");
            default:
                break;
        }
        i = this.audioObjectType;
        switch (i) {
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
                break;
            default:
                break;
        }
        this.epConfig = bitReaderBuffer.readBits(2);
        if (this.epConfig != 2) {
            if (this.epConfig == 3) {
                if (this.epConfig == 3) {
                    this.directMapping = bitReaderBuffer.readBits(1);
                    if (this.directMapping == 0) {
                        throw new RuntimeException("not implemented");
                    }
                }
                if (this.extensionAudioObjectType != 5) {
                    return;
                }
                return;
            }
        }
        throw new UnsupportedOperationException("can't parse ErrorProtectionSpecificConfig yet");
    }

    public ByteBuffer serialize() {
        ByteBuffer allocate = ByteBuffer.allocate(serializedSize());
        IsoTypeWriter.writeUInt8(allocate, 5);
        IsoTypeWriter.writeUInt8(allocate, serializedSize() - 2);
        BitWriterBuffer bitWriterBuffer = new BitWriterBuffer(allocate);
        bitWriterBuffer.writeBits(this.audioObjectType, 5);
        bitWriterBuffer.writeBits(this.samplingFrequencyIndex, 4);
        if (this.samplingFrequencyIndex == 15) {
            throw new UnsupportedOperationException("can't serialize that yet");
        }
        bitWriterBuffer.writeBits(this.channelConfiguration, 4);
        return allocate;
    }

    public int serializedSize() {
        if (this.audioObjectType == 2) {
            return 4 + gaSpecificConfigSize();
        }
        throw new UnsupportedOperationException("can't serialize that yet");
    }

    public void setAudioObjectType(int i) {
        this.audioObjectType = i;
    }

    public void setChannelConfiguration(int i) {
        this.channelConfiguration = i;
    }

    public void setSamplingFrequency(int i) {
        this.samplingFrequency = i;
    }

    public void setSamplingFrequencyIndex(int i) {
        this.samplingFrequencyIndex = i;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("AudioSpecificConfig");
        stringBuilder.append("{configBytes=");
        stringBuilder.append(Hex.encodeHex(this.configBytes));
        stringBuilder.append(", audioObjectType=");
        stringBuilder.append(this.audioObjectType);
        stringBuilder.append(" (");
        stringBuilder.append((String) audioObjectTypeMap.get(Integer.valueOf(this.audioObjectType)));
        stringBuilder.append(")");
        stringBuilder.append(", samplingFrequencyIndex=");
        stringBuilder.append(this.samplingFrequencyIndex);
        stringBuilder.append(" (");
        stringBuilder.append(samplingFrequencyIndexMap.get(Integer.valueOf(this.samplingFrequencyIndex)));
        stringBuilder.append(")");
        stringBuilder.append(", samplingFrequency=");
        stringBuilder.append(this.samplingFrequency);
        stringBuilder.append(", channelConfiguration=");
        stringBuilder.append(this.channelConfiguration);
        if (this.extensionAudioObjectType > 0) {
            stringBuilder.append(", extensionAudioObjectType=");
            stringBuilder.append(this.extensionAudioObjectType);
            stringBuilder.append(" (");
            stringBuilder.append((String) audioObjectTypeMap.get(Integer.valueOf(this.extensionAudioObjectType)));
            stringBuilder.append(")");
            stringBuilder.append(", sbrPresentFlag=");
            stringBuilder.append(this.sbrPresentFlag);
            stringBuilder.append(", psPresentFlag=");
            stringBuilder.append(this.psPresentFlag);
            stringBuilder.append(", extensionSamplingFrequencyIndex=");
            stringBuilder.append(this.extensionSamplingFrequencyIndex);
            stringBuilder.append(" (");
            stringBuilder.append(samplingFrequencyIndexMap.get(Integer.valueOf(this.extensionSamplingFrequencyIndex)));
            stringBuilder.append(")");
            stringBuilder.append(", extensionSamplingFrequency=");
            stringBuilder.append(this.extensionSamplingFrequency);
            stringBuilder.append(", extensionChannelConfiguration=");
            stringBuilder.append(this.extensionChannelConfiguration);
        }
        stringBuilder.append(", syncExtensionType=");
        stringBuilder.append(this.syncExtensionType);
        if (this.gaSpecificConfig) {
            stringBuilder.append(", frameLengthFlag=");
            stringBuilder.append(this.frameLengthFlag);
            stringBuilder.append(", dependsOnCoreCoder=");
            stringBuilder.append(this.dependsOnCoreCoder);
            stringBuilder.append(", coreCoderDelay=");
            stringBuilder.append(this.coreCoderDelay);
            stringBuilder.append(", extensionFlag=");
            stringBuilder.append(this.extensionFlag);
            stringBuilder.append(", layerNr=");
            stringBuilder.append(this.layerNr);
            stringBuilder.append(", numOfSubFrame=");
            stringBuilder.append(this.numOfSubFrame);
            stringBuilder.append(", layer_length=");
            stringBuilder.append(this.layer_length);
            stringBuilder.append(", aacSectionDataResilienceFlag=");
            stringBuilder.append(this.aacSectionDataResilienceFlag);
            stringBuilder.append(", aacScalefactorDataResilienceFlag=");
            stringBuilder.append(this.aacScalefactorDataResilienceFlag);
            stringBuilder.append(", aacSpectralDataResilienceFlag=");
            stringBuilder.append(this.aacSpectralDataResilienceFlag);
            stringBuilder.append(", extensionFlag3=");
            stringBuilder.append(this.extensionFlag3);
        }
        if (this.parametricSpecificConfig) {
            stringBuilder.append(", isBaseLayer=");
            stringBuilder.append(this.isBaseLayer);
            stringBuilder.append(", paraMode=");
            stringBuilder.append(this.paraMode);
            stringBuilder.append(", paraExtensionFlag=");
            stringBuilder.append(this.paraExtensionFlag);
            stringBuilder.append(", hvxcVarMode=");
            stringBuilder.append(this.hvxcVarMode);
            stringBuilder.append(", hvxcRateMode=");
            stringBuilder.append(this.hvxcRateMode);
            stringBuilder.append(", erHvxcExtensionFlag=");
            stringBuilder.append(this.erHvxcExtensionFlag);
            stringBuilder.append(", var_ScalableFlag=");
            stringBuilder.append(this.var_ScalableFlag);
            stringBuilder.append(", hilnQuantMode=");
            stringBuilder.append(this.hilnQuantMode);
            stringBuilder.append(", hilnMaxNumLine=");
            stringBuilder.append(this.hilnMaxNumLine);
            stringBuilder.append(", hilnSampleRateCode=");
            stringBuilder.append(this.hilnSampleRateCode);
            stringBuilder.append(", hilnFrameLength=");
            stringBuilder.append(this.hilnFrameLength);
            stringBuilder.append(", hilnContMode=");
            stringBuilder.append(this.hilnContMode);
            stringBuilder.append(", hilnEnhaLayer=");
            stringBuilder.append(this.hilnEnhaLayer);
            stringBuilder.append(", hilnEnhaQuantMode=");
            stringBuilder.append(this.hilnEnhaQuantMode);
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
