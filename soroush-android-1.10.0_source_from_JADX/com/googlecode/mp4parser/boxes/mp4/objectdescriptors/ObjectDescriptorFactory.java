package com.googlecode.mp4parser.boxes.mp4.objectdescriptors;

import com.coremedia.iso.IsoTypeReader;
import java.lang.reflect.Modifier;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ObjectDescriptorFactory {
    protected static Map<Integer, Map<Integer, Class<? extends BaseDescriptor>>> descriptorRegistry = new HashMap();
    protected static Logger log = Logger.getLogger(ObjectDescriptorFactory.class.getName());

    static {
        Set<Class> hashSet = new HashSet();
        hashSet.add(DecoderSpecificInfo.class);
        hashSet.add(SLConfigDescriptor.class);
        hashSet.add(BaseDescriptor.class);
        hashSet.add(ExtensionDescriptor.class);
        hashSet.add(ObjectDescriptorBase.class);
        hashSet.add(ProfileLevelIndicationDescriptor.class);
        hashSet.add(AudioSpecificConfig.class);
        hashSet.add(ExtensionProfileLevelDescriptor.class);
        hashSet.add(ESDescriptor.class);
        hashSet.add(DecoderConfigDescriptor.class);
        for (Class cls : hashSet) {
            Descriptor descriptor = (Descriptor) cls.getAnnotation(Descriptor.class);
            int[] tags = descriptor.tags();
            int objectTypeIndication = descriptor.objectTypeIndication();
            Map map = (Map) descriptorRegistry.get(Integer.valueOf(objectTypeIndication));
            if (map == null) {
                map = new HashMap();
            }
            for (int valueOf : tags) {
                map.put(Integer.valueOf(valueOf), cls);
            }
            descriptorRegistry.put(Integer.valueOf(objectTypeIndication), map);
        }
    }

    public static BaseDescriptor createFrom(int i, ByteBuffer byteBuffer) {
        BaseDescriptor baseDescriptor;
        Logger logger;
        int readUInt8 = IsoTypeReader.readUInt8(byteBuffer);
        Map map = (Map) descriptorRegistry.get(Integer.valueOf(i));
        if (map == null) {
            map = (Map) descriptorRegistry.get(Integer.valueOf(-1));
        }
        Class cls = (Class) map.get(Integer.valueOf(readUInt8));
        if (!(cls == null || cls.isInterface())) {
            if (!Modifier.isAbstract(cls.getModifiers())) {
                try {
                    baseDescriptor = (BaseDescriptor) cls.newInstance();
                    baseDescriptor.parse(readUInt8, byteBuffer);
                    return baseDescriptor;
                } catch (Throwable e) {
                    logger = log;
                    Level level = Level.SEVERE;
                    StringBuilder stringBuilder = new StringBuilder("Couldn't instantiate BaseDescriptor class ");
                    stringBuilder.append(cls);
                    stringBuilder.append(" for objectTypeIndication ");
                    stringBuilder.append(i);
                    stringBuilder.append(" and tag ");
                    stringBuilder.append(readUInt8);
                    logger.log(level, stringBuilder.toString(), e);
                    throw new RuntimeException(e);
                }
            }
        }
        logger = log;
        StringBuilder stringBuilder2 = new StringBuilder("No ObjectDescriptor found for objectTypeIndication ");
        stringBuilder2.append(Integer.toHexString(i));
        stringBuilder2.append(" and tag ");
        stringBuilder2.append(Integer.toHexString(readUInt8));
        stringBuilder2.append(" found: ");
        stringBuilder2.append(cls);
        logger.warning(stringBuilder2.toString());
        baseDescriptor = new UnknownDescriptor();
        baseDescriptor.parse(readUInt8, byteBuffer);
        return baseDescriptor;
    }
}
