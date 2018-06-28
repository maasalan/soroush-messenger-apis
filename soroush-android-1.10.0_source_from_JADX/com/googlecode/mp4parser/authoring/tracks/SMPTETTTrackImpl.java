package com.googlecode.mp4parser.authoring.tracks;

import com.coremedia.iso.Utf8;
import com.coremedia.iso.boxes.SampleDescriptionBox;
import com.coremedia.iso.boxes.SubSampleInformationBox;
import com.coremedia.iso.boxes.SubSampleInformationBox.SubSampleEntry;
import com.coremedia.iso.boxes.SubSampleInformationBox.SubSampleEntry.SubsampleEntry;
import com.googlecode.mp4parser.authoring.AbstractTrack;
import com.googlecode.mp4parser.authoring.Sample;
import com.googlecode.mp4parser.authoring.TrackMetaData;
import com.googlecode.mp4parser.util.Iso639;
import com.p149g.p150a.p594c.C7308a;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.xml.namespace.NamespaceContext;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;
import org.jivesoftware.smackx.bytestreams.ibb.InBandBytestreamManager;
import org.msgpack.util.TemplatePrecompiler;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class SMPTETTTrackImpl extends AbstractTrack {
    public static final String SMPTE_TT_NAMESPACE = "http://www.smpte-ra.org/schemas/2052-1/2010/smpte-tt";
    C7308a XMLSubtitleSampleEntry = new C7308a();
    boolean containsImages;
    SampleDescriptionBox sampleDescriptionBox = new SampleDescriptionBox();
    private long[] sampleDurations;
    List<Sample> samples = new ArrayList();
    SubSampleInformationBox subSampleInformationBox = new SubSampleInformationBox();
    TrackMetaData trackMetaData = new TrackMetaData();

    private static class TextTrackNamespaceContext implements NamespaceContext {
        private TextTrackNamespaceContext() {
        }

        public String getNamespaceURI(String str) {
            return str.equals("ttml") ? "http://www.w3.org/ns/ttml" : str.equals("smpte") ? SMPTETTTrackImpl.SMPTE_TT_NAMESPACE : null;
        }

        public String getPrefix(String str) {
            return str.equals("http://www.w3.org/ns/ttml") ? "ttml" : str.equals(SMPTETTTrackImpl.SMPTE_TT_NAMESPACE) ? "smpte" : null;
        }

        public Iterator getPrefixes(String str) {
            return Arrays.asList(new String[]{"ttml", "smpte"}).iterator();
        }
    }

    public SMPTETTTrackImpl(File... fileArr) {
        SMPTETTTrackImpl sMPTETTTrackImpl;
        String str;
        C7308a c7308a;
        File[] fileArr2 = fileArr;
        super(fileArr2[0].getName());
        TextTrackNamespaceContext textTrackNamespaceContext = null;
        boolean z = true;
        this.sampleDurations = new long[fileArr2.length];
        DocumentBuilderFactory newInstance = DocumentBuilderFactory.newInstance();
        newInstance.setNamespaceAware(true);
        DocumentBuilder newDocumentBuilder = newInstance.newDocumentBuilder();
        long j = 0;
        int i = 0;
        String str2 = null;
        while (i < fileArr2.length) {
            final File file = fileArr2[i];
            SubSampleEntry subSampleEntry = new SubSampleEntry();
            sMPTETTTrackImpl.subSampleInformationBox.getEntries().add(subSampleEntry);
            subSampleEntry.setSampleDelta(1);
            Document parse = newDocumentBuilder.parse(file);
            String language = getLanguage(parse);
            if (str2 == null) {
                str2 = language;
            } else if (!str2.equals(language)) {
                throw new RuntimeException("Within one Track all sample documents need to have the same language");
            }
            XPathFactory newInstance2 = XPathFactory.newInstance();
            NamespaceContext textTrackNamespaceContext2 = new TextTrackNamespaceContext();
            XPath newXPath = newInstance2.newXPath();
            newXPath.setNamespaceContext(textTrackNamespaceContext2);
            long latestTimestamp = latestTimestamp(parse);
            sMPTETTTrackImpl.sampleDurations[i] = latestTimestamp - j;
            NodeList nodeList = (NodeList) newXPath.compile("/ttml:tt/ttml:body/ttml:div/@smpte:backgroundImage").evaluate(parse, XPathConstants.NODESET);
            HashMap hashMap = new HashMap();
            Collection hashSet = new HashSet();
            int i2 = 0;
            while (i2 < nodeList.getLength()) {
                hashSet.add(nodeList.item(i2).getNodeValue());
                i2++;
                sMPTETTTrackImpl = this;
                z = true;
            }
            Collection<String> arrayList = new ArrayList(hashSet);
            Collections.sort((List) arrayList);
            int i3 = z;
            for (String str3 : arrayList) {
                String substring = str3.substring(str3.lastIndexOf(TemplatePrecompiler.DEFAULT_DEST));
                StringBuilder stringBuilder = new StringBuilder("urn:dece:container:subtitleimageindex:");
                int i4 = i3 + 1;
                stringBuilder.append(i3);
                stringBuilder.append(substring);
                hashMap.put(str3, stringBuilder.toString());
                i3 = i4;
                sMPTETTTrackImpl = this;
            }
            if (arrayList.isEmpty()) {
                sMPTETTTrackImpl.samples.add(new Sample() {
                    public ByteBuffer asByteBuffer() {
                        try {
                            return ByteBuffer.wrap(SMPTETTTrackImpl.this.streamToByteArray(new FileInputStream(file)));
                        } catch (Throwable e) {
                            throw new RuntimeException(e);
                        }
                    }

                    public long getSize() {
                        return file.length();
                    }

                    public void writeTo(WritableByteChannel writableByteChannel) {
                        Channels.newOutputStream(writableByteChannel).write(SMPTETTTrackImpl.this.streamToByteArray(new FileInputStream(file)));
                    }
                });
            } else {
                str = new String(sMPTETTTrackImpl.streamToByteArray(new FileInputStream(file)));
                for (Entry entry : hashMap.entrySet()) {
                    str = str.replace((CharSequence) entry.getKey(), (CharSequence) entry.getValue());
                }
                final List arrayList2 = new ArrayList();
                sMPTETTTrackImpl.samples.add(new Sample() {
                    public ByteBuffer asByteBuffer() {
                        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        try {
                            writeTo(Channels.newChannel(byteArrayOutputStream));
                            return ByteBuffer.wrap(byteArrayOutputStream.toByteArray());
                        } catch (Throwable e) {
                            throw new RuntimeException(e);
                        }
                    }

                    public long getSize() {
                        long length = (long) Utf8.convert(str).length;
                        for (File length2 : arrayList2) {
                            length += length2.length();
                        }
                        return length;
                    }

                    public void writeTo(WritableByteChannel writableByteChannel) {
                        writableByteChannel.write(ByteBuffer.wrap(Utf8.convert(str)));
                        for (File fileInputStream : arrayList2) {
                            FileInputStream fileInputStream2 = new FileInputStream(fileInputStream);
                            byte[] bArr = new byte[8096];
                            while (true) {
                                int read = fileInputStream2.read(bArr);
                                if (-1 == read) {
                                    break;
                                }
                                writableByteChannel.write(ByteBuffer.wrap(bArr, 0, read));
                            }
                        }
                    }
                });
                SubsampleEntry subsampleEntry = new SubsampleEntry();
                subsampleEntry.setSubsampleSize((long) Utf8.utf8StringLengthInBytes(str));
                subSampleEntry.getSubsampleEntries().add(subsampleEntry);
                for (String str4 : arrayList) {
                    File file2 = new File(file.getParentFile(), str4);
                    arrayList2.add(file2);
                    SubsampleEntry subsampleEntry2 = new SubsampleEntry();
                    subsampleEntry2.setSubsampleSize(file2.length());
                    subSampleEntry.getSubsampleEntries().add(subsampleEntry2);
                }
            }
            i++;
            j = latestTimestamp;
            textTrackNamespaceContext = null;
            z = true;
        }
        sMPTETTTrackImpl.trackMetaData.setLanguage(Iso639.convert2to3(str2));
        sMPTETTTrackImpl.XMLSubtitleSampleEntry.f21049a = SMPTE_TT_NAMESPACE;
        sMPTETTTrackImpl.XMLSubtitleSampleEntry.f21050b = SMPTE_TT_NAMESPACE;
        if (sMPTETTTrackImpl.containsImages) {
            c7308a = sMPTETTTrackImpl.XMLSubtitleSampleEntry;
            str4 = "image/png";
        } else {
            c7308a = sMPTETTTrackImpl.XMLSubtitleSampleEntry;
            str4 = "";
        }
        c7308a.f21051c = str4;
        sMPTETTTrackImpl.sampleDescriptionBox.addBox(sMPTETTTrackImpl.XMLSubtitleSampleEntry);
        sMPTETTTrackImpl.trackMetaData.setTimescale(30000);
        sMPTETTTrackImpl.trackMetaData.setLayer(InBandBytestreamManager.MAXIMUM_BLOCK_SIZE);
    }

    public static long earliestTimestamp(Document document) {
        XPathFactory newInstance = XPathFactory.newInstance();
        NamespaceContext textTrackNamespaceContext = new TextTrackNamespaceContext();
        XPath newXPath = newInstance.newXPath();
        newXPath.setNamespaceContext(textTrackNamespaceContext);
        try {
            NodeList nodeList = (NodeList) newXPath.compile("//*[@begin]").evaluate(document, XPathConstants.NODESET);
            long j = 0;
            for (int i = 0; i < nodeList.getLength(); i++) {
                j = Math.min(toTime(nodeList.item(i).getAttributes().getNamedItem("begin").getNodeValue()), j);
            }
            return j;
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public static String getLanguage(Document document) {
        return document.getDocumentElement().getAttribute("xml:lang");
    }

    public static long latestTimestamp(Document document) {
        XPathFactory newInstance = XPathFactory.newInstance();
        NamespaceContext textTrackNamespaceContext = new TextTrackNamespaceContext();
        XPath newXPath = newInstance.newXPath();
        newXPath.setNamespaceContext(textTrackNamespaceContext);
        try {
            NodeList nodeList = (NodeList) newXPath.compile("//*[@begin]").evaluate(document, XPathConstants.NODESET);
            long j = 0;
            for (int i = 0; i < nodeList.getLength(); i++) {
                long toTime;
                Node item = nodeList.item(i);
                String nodeValue = item.getAttributes().getNamedItem("begin").getNodeValue();
                if (item.getAttributes().getNamedItem("dur") != null) {
                    toTime = toTime(nodeValue) + toTime(item.getAttributes().getNamedItem("dur").getNodeValue());
                } else if (item.getAttributes().getNamedItem("end") != null) {
                    toTime = toTime(item.getAttributes().getNamedItem("end").getNodeValue());
                } else {
                    throw new RuntimeException("neither end nor dur attribute is present");
                }
                j = Math.max(toTime, j);
            }
            return j;
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    private byte[] streamToByteArray(InputStream inputStream) {
        byte[] bArr = new byte[8096];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int read = inputStream.read(bArr);
            if (-1 == read) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    static long toTime(String str) {
        Matcher matcher = Pattern.compile("([0-9][0-9]):([0-9][0-9]):([0-9][0-9])([\\.:][0-9][0-9]?[0-9]?)?").matcher(str);
        if (matcher.matches()) {
            str = matcher.group(1);
            String group = matcher.group(2);
            String group2 = matcher.group(3);
            String group3 = matcher.group(4);
            if (group3 == null) {
                group3 = ".000";
            }
            group3 = group3.replace(":", TemplatePrecompiler.DEFAULT_DEST);
            double parseLong = (double) (((((Long.parseLong(str) * 60) * 60) * 1000) + ((Long.parseLong(group) * 60) * 1000)) + (Long.parseLong(group2) * 1000));
            StringBuilder stringBuilder = new StringBuilder("0");
            stringBuilder.append(group3);
            return (long) (parseLong + (Double.parseDouble(stringBuilder.toString()) * 1000.0d));
        }
        StringBuilder stringBuilder2 = new StringBuilder("Cannot match ");
        stringBuilder2.append(str);
        stringBuilder2.append(" to time expression");
        throw new RuntimeException(stringBuilder2.toString());
    }

    public void close() {
    }

    public String getHandler() {
        return "subt";
    }

    public SampleDescriptionBox getSampleDescriptionBox() {
        return this.sampleDescriptionBox;
    }

    public long[] getSampleDurations() {
        long[] jArr = new long[this.sampleDurations.length];
        for (int i = 0; i < jArr.length; i++) {
            jArr[i] = (this.sampleDurations[i] * this.trackMetaData.getTimescale()) / 1000;
        }
        return jArr;
    }

    public List<Sample> getSamples() {
        return this.samples;
    }

    public SubSampleInformationBox getSubsampleInformationBox() {
        return this.subSampleInformationBox;
    }

    public TrackMetaData getTrackMetaData() {
        return this.trackMetaData;
    }
}
