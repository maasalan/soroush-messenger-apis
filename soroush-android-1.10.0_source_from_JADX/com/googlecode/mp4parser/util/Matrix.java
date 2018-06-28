package com.googlecode.mp4parser.util;

import com.coremedia.iso.IsoTypeReader;
import com.coremedia.iso.IsoTypeWriter;
import java.nio.ByteBuffer;

public class Matrix {
    public static final Matrix ROTATE_0 = new Matrix(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final Matrix ROTATE_180 = new Matrix(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final Matrix ROTATE_270 = new Matrix(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final Matrix ROTATE_90 = new Matrix(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    double f7095a;
    double f7096b;
    double f7097c;
    double f7098d;
    double tx;
    double ty;
    double f7099u;
    double f7100v;
    double f7101w;

    public Matrix(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
        this.f7099u = d5;
        this.f7100v = d6;
        this.f7101w = d7;
        this.f7095a = d;
        this.f7096b = d2;
        this.f7097c = d3;
        this.f7098d = d4;
        this.tx = d8;
        this.ty = d9;
    }

    public static Matrix fromByteBuffer(ByteBuffer byteBuffer) {
        return fromFileOrder(IsoTypeReader.readFixedPoint1616(byteBuffer), IsoTypeReader.readFixedPoint1616(byteBuffer), IsoTypeReader.readFixedPoint0230(byteBuffer), IsoTypeReader.readFixedPoint1616(byteBuffer), IsoTypeReader.readFixedPoint1616(byteBuffer), IsoTypeReader.readFixedPoint0230(byteBuffer), IsoTypeReader.readFixedPoint1616(byteBuffer), IsoTypeReader.readFixedPoint1616(byteBuffer), IsoTypeReader.readFixedPoint0230(byteBuffer));
    }

    public static Matrix fromFileOrder(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
        return new Matrix(d, d2, d4, d5, d3, d6, d9, d7, d8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Matrix matrix = (Matrix) obj;
        return Double.compare(matrix.f7095a, this.f7095a) == 0 && Double.compare(matrix.f7096b, this.f7096b) == 0 && Double.compare(matrix.f7097c, this.f7097c) == 0 && Double.compare(matrix.f7098d, this.f7098d) == 0 && Double.compare(matrix.tx, this.tx) == 0 && Double.compare(matrix.ty, this.ty) == 0 && Double.compare(matrix.f7099u, this.f7099u) == 0 && Double.compare(matrix.f7100v, this.f7100v) == 0 && Double.compare(matrix.f7101w, this.f7101w) == 0;
    }

    public void getContent(ByteBuffer byteBuffer) {
        IsoTypeWriter.writeFixedPoint1616(byteBuffer, this.f7095a);
        IsoTypeWriter.writeFixedPoint1616(byteBuffer, this.f7096b);
        IsoTypeWriter.writeFixedPoint0230(byteBuffer, this.f7099u);
        IsoTypeWriter.writeFixedPoint1616(byteBuffer, this.f7097c);
        IsoTypeWriter.writeFixedPoint1616(byteBuffer, this.f7098d);
        IsoTypeWriter.writeFixedPoint0230(byteBuffer, this.f7100v);
        IsoTypeWriter.writeFixedPoint1616(byteBuffer, this.tx);
        IsoTypeWriter.writeFixedPoint1616(byteBuffer, this.ty);
        IsoTypeWriter.writeFixedPoint0230(byteBuffer, this.f7101w);
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f7099u);
        int i = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        long doubleToLongBits2 = Double.doubleToLongBits(this.f7100v);
        i = (i * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
        doubleToLongBits2 = Double.doubleToLongBits(this.f7101w);
        i = (i * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
        doubleToLongBits2 = Double.doubleToLongBits(this.f7095a);
        i = (i * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
        doubleToLongBits2 = Double.doubleToLongBits(this.f7096b);
        i = (i * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
        doubleToLongBits2 = Double.doubleToLongBits(this.f7097c);
        i = (i * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
        doubleToLongBits2 = Double.doubleToLongBits(this.f7098d);
        i = (i * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
        doubleToLongBits2 = Double.doubleToLongBits(this.tx);
        i = (i * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
        doubleToLongBits2 = Double.doubleToLongBits(this.ty);
        return (31 * i) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
    }

    public String toString() {
        if (equals(ROTATE_0)) {
            return "Rotate 0°";
        }
        if (equals(ROTATE_90)) {
            return "Rotate 90°";
        }
        if (equals(ROTATE_180)) {
            return "Rotate 180°";
        }
        if (equals(ROTATE_270)) {
            return "Rotate 270°";
        }
        StringBuilder stringBuilder = new StringBuilder("Matrix{u=");
        stringBuilder.append(this.f7099u);
        stringBuilder.append(", v=");
        stringBuilder.append(this.f7100v);
        stringBuilder.append(", w=");
        stringBuilder.append(this.f7101w);
        stringBuilder.append(", a=");
        stringBuilder.append(this.f7095a);
        stringBuilder.append(", b=");
        stringBuilder.append(this.f7096b);
        stringBuilder.append(", c=");
        stringBuilder.append(this.f7097c);
        stringBuilder.append(", d=");
        stringBuilder.append(this.f7098d);
        stringBuilder.append(", tx=");
        stringBuilder.append(this.tx);
        stringBuilder.append(", ty=");
        stringBuilder.append(this.ty);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
