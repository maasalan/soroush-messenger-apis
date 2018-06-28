package com.googlecode.mp4parser.authoring;

import com.googlecode.mp4parser.util.Matrix;
import java.util.Date;

public class TrackMetaData implements Cloneable {
    private Date creationTime = new Date();
    private int group = 0;
    private double height;
    private String language = "eng";
    int layer;
    private Matrix matrix = Matrix.ROTATE_0;
    private Date modificationTime = new Date();
    private long timescale;
    private long trackId = 1;
    private float volume;
    private double width;

    public java.lang.Object clone() {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r1 = this;
        r0 = super.clone();	 Catch:{ CloneNotSupportedException -> 0x0005 }
        return r0;
    L_0x0005:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.googlecode.mp4parser.authoring.TrackMetaData.clone():java.lang.Object");
    }

    public Date getCreationTime() {
        return this.creationTime;
    }

    public int getGroup() {
        return this.group;
    }

    public double getHeight() {
        return this.height;
    }

    public String getLanguage() {
        return this.language;
    }

    public int getLayer() {
        return this.layer;
    }

    public Matrix getMatrix() {
        return this.matrix;
    }

    public Date getModificationTime() {
        return this.modificationTime;
    }

    public long getTimescale() {
        return this.timescale;
    }

    public long getTrackId() {
        return this.trackId;
    }

    public float getVolume() {
        return this.volume;
    }

    public double getWidth() {
        return this.width;
    }

    public void setCreationTime(Date date) {
        this.creationTime = date;
    }

    public void setGroup(int i) {
        this.group = i;
    }

    public void setHeight(double d) {
        this.height = d;
    }

    public void setLanguage(String str) {
        this.language = str;
    }

    public void setLayer(int i) {
        this.layer = i;
    }

    public void setMatrix(Matrix matrix) {
        this.matrix = matrix;
    }

    public void setModificationTime(Date date) {
        this.modificationTime = date;
    }

    public void setTimescale(long j) {
        this.timescale = j;
    }

    public void setTrackId(long j) {
        this.trackId = j;
    }

    public void setVolume(float f) {
        this.volume = f;
    }

    public void setWidth(double d) {
        this.width = d;
    }
}
