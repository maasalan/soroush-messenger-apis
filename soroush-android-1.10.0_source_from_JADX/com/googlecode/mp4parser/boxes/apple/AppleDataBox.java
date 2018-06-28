package com.googlecode.mp4parser.boxes.apple;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import com.googlecode.mp4parser.AbstractBox;
import com.googlecode.mp4parser.RequiresParseDetailAspect;
import com.googlecode.mp4parser.annotations.DoNotParseDetail;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Locale;
import org.p487a.p488a.C4596a.C7000a;
import org.p487a.p490b.p491a.C4599a;
import org.p487a.p490b.p492b.C4600b;

public abstract class AppleDataBox extends AbstractBox {
    private static final C7000a ajc$tjp_0 = null;
    private static final C7000a ajc$tjp_1 = null;
    private static final C7000a ajc$tjp_2 = null;
    private static final C7000a ajc$tjp_3 = null;
    private static final C7000a ajc$tjp_4 = null;
    private static final C7000a ajc$tjp_5 = null;
    private static HashMap<String, String> language;
    int dataCountry;
    int dataLanguage;
    int dataType;

    static {
        ajc$preClinit();
        HashMap hashMap = new HashMap();
        language = hashMap;
        hashMap.put("0", "English");
        language.put("1", "French");
        language.put("2", "German");
        language.put("3", "Italian");
        language.put("4", "Dutch");
        language.put("5", "Swedish");
        language.put("6", "Spanish");
        language.put("7", "Danish");
        language.put("8", "Portuguese");
        language.put("9", "Norwegian");
        language.put("10", "Hebrew");
        language.put("11", "Japanese");
        language.put("12", "Arabic");
        language.put("13", "Finnish");
        language.put("14", "Greek");
        language.put("15", "Icelandic");
        language.put("16", "Maltese");
        language.put("17", "Turkish");
        language.put("18", "Croatian");
        language.put("19", "Traditional_Chinese");
        language.put("20", "Urdu");
        language.put("21", "Hindi");
        language.put("22", "Thai");
        language.put("23", "Korean");
        language.put("24", "Lithuanian");
        language.put("25", "Polish");
        language.put("26", "Hungarian");
        language.put("27", "Estonian");
        language.put("28", "Lettish");
        language.put("29", "Sami");
        language.put("30", "Faroese");
        language.put("31", "Farsi");
        language.put("32", "Russian");
        language.put("33", "Simplified_Chinese");
        language.put("34", "Flemish");
        language.put("35", "Irish");
        language.put("36", "Albanian");
        language.put("37", "Romanian");
        language.put("38", "Czech");
        language.put("39", "Slovak");
        language.put("40", "Slovenian");
        language.put("41", "Yiddish");
        language.put("42", "Serbian");
        language.put("43", "Macedonian");
        language.put("44", "Bulgarian");
        language.put("45", "Ukrainian");
        language.put("46", "Belarusian");
        language.put("47", "Uzbek");
        language.put("48", "Kazakh");
        language.put("49", "Azerbaijani");
        language.put("50", "AzerbaijanAr");
        language.put("51", "Armenian");
        language.put("52", "Georgian");
        language.put("53", "Moldavian");
        language.put("54", "Kirghiz");
        language.put("55", "Tajiki");
        language.put("56", "Turkmen");
        language.put("57", "Mongolian");
        language.put("58", "MongolianCyr");
        language.put("59", "Pashto");
        language.put("60", "Kurdish");
        language.put("61", "Kashmiri");
        language.put("62", "Sindhi");
        language.put("63", "Tibetan");
        language.put("64", "Nepali");
        language.put("65", "Sanskrit");
        language.put("66", "Marathi");
        language.put("67", "Bengali");
        language.put("68", "Assamese");
        language.put("69", "Gujarati");
        language.put("70", "Punjabi");
        language.put("71", "Oriya");
        language.put("72", "Malayalam");
        language.put("73", "Kannada");
        language.put("74", "Tamil");
        language.put("75", "Telugu");
        language.put("76", "Sinhala");
        language.put("77", "Burmese");
        language.put("78", "Khmer");
        language.put("79", "Lao");
        language.put("80", "Vietnamese");
        language.put("81", "Indonesian");
        language.put("82", "Tagalog");
        language.put("83", "MalayRoman");
        language.put("84", "MalayArabic");
        language.put("85", "Amharic");
        language.put("87", "Galla");
        language.put("87", "Oromo");
        language.put("88", "Somali");
        language.put("89", "Swahili");
        language.put("90", "Kinyarwanda");
        language.put("91", "Rundi");
        language.put("92", "Nyanja");
        language.put("93", "Malagasy");
        language.put("94", "Esperanto");
        language.put("128", "Welsh");
        language.put("129", "Basque");
        language.put("130", "Catalan");
        language.put("131", "Latin");
        language.put("132", "Quechua");
        language.put("133", "Guarani");
        language.put("134", "Aymara");
        language.put("135", "Tatar");
        language.put("136", "Uighur");
        language.put("137", "Dzongkha");
        language.put("138", "JavaneseRom");
        language.put("32767", "Unspecified");
    }

    protected AppleDataBox(String str, int i) {
        super(str);
        this.dataType = i;
    }

    private static void ajc$preClinit() {
        C4600b c4600b = new C4600b("AppleDataBox.java", AppleDataBox.class);
        ajc$tjp_0 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getLanguageString", "com.googlecode.mp4parser.boxes.apple.AppleDataBox", "", "", "", "java.lang.String"), 25);
        ajc$tjp_1 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getDataType", "com.googlecode.mp4parser.boxes.apple.AppleDataBox", "", "", "", "int"), 43);
        ajc$tjp_2 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getDataCountry", "com.googlecode.mp4parser.boxes.apple.AppleDataBox", "", "", "", "int"), 47);
        ajc$tjp_3 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setDataCountry", "com.googlecode.mp4parser.boxes.apple.AppleDataBox", "int", "dataCountry", "", "void"), 51);
        ajc$tjp_4 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "getDataLanguage", "com.googlecode.mp4parser.boxes.apple.AppleDataBox", "", "", "", "int"), 55);
        ajc$tjp_5 = c4600b.m8324a("method-execution", c4600b.m8325a("1", "setDataLanguage", "com.googlecode.mp4parser.boxes.apple.AppleDataBox", "int", "dataLanguage", "", "void"), 59);
    }

    protected void _parseDetails(ByteBuffer byteBuffer) {
        parseData(parseDataLength4ccTypeCountryLanguageAndReturnRest(byteBuffer));
    }

    protected void getContent(ByteBuffer byteBuffer) {
        writeDataLength4ccTypeCountryLanguage(byteBuffer);
        byteBuffer.put(writeData());
    }

    protected long getContentSize() {
        return (long) (getDataLength() + 16);
    }

    public int getDataCountry() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_2, (Object) this, (Object) this));
        return this.dataCountry;
    }

    public int getDataLanguage() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_4, (Object) this, (Object) this));
        return this.dataLanguage;
    }

    protected abstract int getDataLength();

    public int getDataType() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_1, (Object) this, (Object) this));
        return this.dataType;
    }

    public String getLanguageString() {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8320a(ajc$tjp_0, (Object) this, (Object) this));
        HashMap hashMap = language;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.dataLanguage);
        String str = (String) hashMap.get(stringBuilder.toString());
        if (str != null) {
            return str;
        }
        ByteBuffer wrap = ByteBuffer.wrap(new byte[2]);
        IsoTypeWriter.writeUInt16(wrap, this.dataLanguage);
        wrap.reset();
        return new Locale(IsoTypeReader.readIso639(wrap)).getDisplayLanguage();
    }

    protected abstract void parseData(ByteBuffer byteBuffer);

    @DoNotParseDetail
    protected ByteBuffer parseDataLength4ccTypeCountryLanguageAndReturnRest(ByteBuffer byteBuffer) {
        int i = byteBuffer.getInt();
        byteBuffer.getInt();
        this.dataType = byteBuffer.getInt();
        this.dataCountry = byteBuffer.getShort();
        if (this.dataCountry < 0) {
            this.dataCountry += 65536;
        }
        this.dataLanguage = byteBuffer.getShort();
        if (this.dataLanguage < 0) {
            this.dataLanguage += 65536;
        }
        i -= 16;
        ByteBuffer byteBuffer2 = (ByteBuffer) byteBuffer.duplicate().slice().limit(i);
        byteBuffer.position(i + byteBuffer.position());
        return byteBuffer2;
    }

    public void setDataCountry(int i) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_3, (Object) this, (Object) this, C4599a.m8314a(i)));
        this.dataCountry = i;
    }

    public void setDataLanguage(int i) {
        RequiresParseDetailAspect.aspectOf().before(C4600b.m8321a(ajc$tjp_5, (Object) this, (Object) this, C4599a.m8314a(i)));
        this.dataLanguage = i;
    }

    protected abstract byte[] writeData();

    @DoNotParseDetail
    protected void writeDataLength4ccTypeCountryLanguage(ByteBuffer byteBuffer) {
        byteBuffer.putInt(getDataLength() + 16);
        byteBuffer.put("data".getBytes());
        byteBuffer.putInt(this.dataType);
        IsoTypeWriter.writeUInt16(byteBuffer, this.dataCountry);
        IsoTypeWriter.writeUInt16(byteBuffer, this.dataLanguage);
    }
}
