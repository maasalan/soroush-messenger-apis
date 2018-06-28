package android.support.v7.p045d;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.AsyncTask;
import android.support.v4.p031b.C0433a;
import android.support.v4.p038g.C4813a;
import android.util.Log;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import mobi.mmdt.ott.view.conversation.typing.indicators.BallPulseIndicator;

public final class C0694b {
    static final C0691b f2296f = new C48811();
    final List<C0693d> f2297a;
    final List<C0695c> f2298b;
    final Map<C0695c, C0693d> f2299c = new C4813a();
    final SparseBooleanArray f2300d = new SparseBooleanArray();
    final C0693d f2301e = m1685a();

    public static final class C0690a {
        final List<C0693d> f2279a;
        final Bitmap f2280b;
        final List<C0695c> f2281c = new ArrayList();
        int f2282d = 16;
        int f2283e = 12544;
        int f2284f = -1;
        final List<C0691b> f2285g = new ArrayList();
        Rect f2286h;

        public C0690a(Bitmap bitmap) {
            if (bitmap != null) {
                if (!bitmap.isRecycled()) {
                    this.f2285g.add(C0694b.f2296f);
                    this.f2280b = bitmap;
                    this.f2279a = null;
                    this.f2281c.add(C0695c.f2302a);
                    this.f2281c.add(C0695c.f2303b);
                    this.f2281c.add(C0695c.f2304c);
                    this.f2281c.add(C0695c.f2305d);
                    this.f2281c.add(C0695c.f2306e);
                    this.f2281c.add(C0695c.f2307f);
                    return;
                }
            }
            throw new IllegalArgumentException("Bitmap is not valid");
        }

        public final AsyncTask<Bitmap, Void, C0694b> m1678a(final C0692c c0692c) {
            return new AsyncTask<Bitmap, Void, C0694b>(this) {
                final /* synthetic */ C0690a f2278b;

                private C0694b m1677a() {
                    try {
                        int width;
                        List list;
                        C0690a c0690a = this.f2278b;
                        int i = 0;
                        if (c0690a.f2280b != null) {
                            Bitmap bitmap = c0690a.f2280b;
                            double d = -1.0d;
                            if (c0690a.f2283e > 0) {
                                width = bitmap.getWidth() * bitmap.getHeight();
                                if (width > c0690a.f2283e) {
                                    d = Math.sqrt(((double) c0690a.f2283e) / ((double) width));
                                }
                            } else if (c0690a.f2284f > 0) {
                                width = Math.max(bitmap.getWidth(), bitmap.getHeight());
                                if (width > c0690a.f2284f) {
                                    d = ((double) c0690a.f2284f) / ((double) width);
                                }
                            }
                            if (d > 0.0d) {
                                bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * d), (int) Math.ceil(((double) bitmap.getHeight()) * d), false);
                            }
                            Rect rect = c0690a.f2286h;
                            if (!(bitmap == c0690a.f2280b || rect == null)) {
                                double width2 = ((double) bitmap.getWidth()) / ((double) c0690a.f2280b.getWidth());
                                rect.left = (int) Math.floor(((double) rect.left) * width2);
                                rect.top = (int) Math.floor(((double) rect.top) * width2);
                                rect.right = Math.min((int) Math.ceil(((double) rect.right) * width2), bitmap.getWidth());
                                rect.bottom = Math.min((int) Math.ceil(((double) rect.bottom) * width2), bitmap.getHeight());
                            }
                            C0688a c0688a = new C0688a(c0690a.m1679a(bitmap), c0690a.f2282d, c0690a.f2285g.isEmpty() ? null : (C0691b[]) c0690a.f2285g.toArray(new C0691b[c0690a.f2285g.size()]));
                            if (bitmap != c0690a.f2280b) {
                                bitmap.recycle();
                            }
                            list = c0688a.f2273c;
                        } else {
                            list = c0690a.f2279a;
                        }
                        C0694b c0694b = new C0694b(list, c0690a.f2281c);
                        int size = c0694b.f2298b.size();
                        int i2 = 0;
                        while (i2 < size) {
                            int i3;
                            C06891 c06891;
                            C0695c c0695c = (C0695c) c0694b.f2298b.get(i2);
                            width = c0695c.f2310i.length;
                            float f = 0.0f;
                            float f2 = 0.0f;
                            for (i3 = i; i3 < width; i3++) {
                                float f3 = c0695c.f2310i[i3];
                                if (f3 > 0.0f) {
                                    f2 += f3;
                                }
                            }
                            if (f2 != 0.0f) {
                                width = c0695c.f2310i.length;
                                for (i3 = i; i3 < width; i3++) {
                                    if (c0695c.f2310i[i3] > 0.0f) {
                                        float[] fArr = c0695c.f2310i;
                                        fArr[i3] = fArr[i3] / f2;
                                    }
                                }
                            }
                            Map map = c0694b.f2299c;
                            i3 = c0694b.f2297a.size();
                            int i4 = i;
                            float f4 = 0.0f;
                            C0693d c0693d = null;
                            while (i4 < i3) {
                                float f5;
                                C0693d c0693d2 = (C0693d) c0694b.f2297a.get(i4);
                                float[] a = c0693d2.m1683a();
                                int i5 = (a[1] < c0695c.f2308g[i] || a[1] > c0695c.f2308g[2] || a[2] < c0695c.f2309h[i] || a[2] > c0695c.f2309h[2] || c0694b.f2300d.get(c0693d2.f2287a)) ? i : 1;
                                if (i5 != 0) {
                                    float[] a2 = c0693d2.m1683a();
                                    int i6 = c0694b.f2301e != null ? c0694b.f2301e.f2288b : 1;
                                    f5 = 0.0f;
                                    f = ((c0695c.f2310i[i] > 0.0f ? c0695c.f2310i[i] * (BallPulseIndicator.SCALE - Math.abs(a2[1] - c0695c.f2308g[1])) : 0.0f) + (c0695c.f2310i[1] > 0.0f ? c0695c.f2310i[1] * (BallPulseIndicator.SCALE - Math.abs(a2[2] - c0695c.f2309h[1])) : 0.0f)) + (c0695c.f2310i[2] > 0.0f ? c0695c.f2310i[2] * (((float) c0693d2.f2288b) / ((float) i6)) : 0.0f);
                                    if (c0693d == null || f > r13) {
                                        f4 = f;
                                        c0693d = c0693d2;
                                    }
                                } else {
                                    f5 = f;
                                }
                                i4++;
                                f = f5;
                                c06891 = this;
                                i = 0;
                            }
                            if (c0693d != null && c0695c.f2311j) {
                                c0694b.f2300d.append(c0693d.f2287a, true);
                            }
                            map.put(c0695c, c0693d);
                            i2++;
                            c06891 = this;
                            i = 0;
                        }
                        c0694b.f2300d.clear();
                        return c0694b;
                    } catch (Throwable e) {
                        Log.e("Palette", "Exception thrown during async generate", e);
                        return null;
                    }
                }

                protected final /* synthetic */ Object doInBackground(Object[] objArr) {
                    return m1677a();
                }

                protected final /* synthetic */ void onPostExecute(Object obj) {
                    c0692c.mo2232a((C0694b) obj);
                }
            }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Bitmap[]{this.f2280b});
        }

        final int[] m1679a(Bitmap bitmap) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            Object obj = new int[(width * height)];
            bitmap.getPixels(obj, 0, width, 0, 0, width, height);
            if (this.f2286h == null) {
                return obj;
            }
            int width2 = this.f2286h.width();
            int height2 = this.f2286h.height();
            Object obj2 = new int[(width2 * height2)];
            for (int i = 0; i < height2; i++) {
                System.arraycopy(obj, ((this.f2286h.top + i) * width) + this.f2286h.left, obj2, i * width2, width2);
            }
            return obj2;
        }
    }

    public interface C0691b {
        boolean mo511a(float[] fArr);
    }

    public interface C0692c {
        void mo2232a(C0694b c0694b);
    }

    public static final class C0693d {
        final int f2287a;
        final int f2288b;
        private final int f2289c;
        private final int f2290d;
        private final int f2291e;
        private boolean f2292f;
        private int f2293g;
        private int f2294h;
        private float[] f2295i;

        public C0693d(int i, int i2) {
            this.f2289c = Color.red(i);
            this.f2290d = Color.green(i);
            this.f2291e = Color.blue(i);
            this.f2287a = i;
            this.f2288b = i2;
        }

        private void m1682b() {
            if (!this.f2292f) {
                int a = C0433a.m904a(-1, this.f2287a, 4.5f);
                int a2 = C0433a.m904a(-1, this.f2287a, 3.0f);
                if (a == -1 || a2 == -1) {
                    int a3 = C0433a.m904a(-16777216, this.f2287a, 4.5f);
                    int a4 = C0433a.m904a(-16777216, this.f2287a, 3.0f);
                    if (a3 == -1 || a4 == -1) {
                        this.f2294h = a != -1 ? C0433a.m908b(-1, a) : C0433a.m908b(-16777216, a3);
                        this.f2293g = a2 != -1 ? C0433a.m908b(-1, a2) : C0433a.m908b(-16777216, a4);
                        this.f2292f = true;
                    } else {
                        this.f2294h = C0433a.m908b(-16777216, a3);
                        a = C0433a.m908b(-16777216, a4);
                    }
                } else {
                    this.f2294h = C0433a.m908b(-1, a);
                    a = C0433a.m908b(-1, a2);
                }
                this.f2293g = a;
                this.f2292f = true;
            }
        }

        public final float[] m1683a() {
            if (this.f2295i == null) {
                this.f2295i = new float[3];
            }
            C0433a.m906a(this.f2289c, this.f2290d, this.f2291e, this.f2295i);
            return this.f2295i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C0693d c0693d = (C0693d) obj;
            return this.f2288b == c0693d.f2288b && this.f2287a == c0693d.f2287a;
        }

        public final int hashCode() {
            return (31 * this.f2287a) + this.f2288b;
        }

        public final String toString() {
            StringBuilder stringBuilder = new StringBuilder(getClass().getSimpleName());
            stringBuilder.append(" [RGB: #");
            stringBuilder.append(Integer.toHexString(this.f2287a));
            stringBuilder.append(']');
            stringBuilder.append(" [HSL: ");
            stringBuilder.append(Arrays.toString(m1683a()));
            stringBuilder.append(']');
            stringBuilder.append(" [Population: ");
            stringBuilder.append(this.f2288b);
            stringBuilder.append(']');
            stringBuilder.append(" [Title Text: #");
            m1682b();
            stringBuilder.append(Integer.toHexString(this.f2293g));
            stringBuilder.append(']');
            stringBuilder.append(" [Body Text: #");
            m1682b();
            stringBuilder.append(Integer.toHexString(this.f2294h));
            stringBuilder.append(']');
            return stringBuilder.toString();
        }
    }

    static class C48811 implements C0691b {
        C48811() {
        }

        public final boolean mo511a(float[] fArr) {
            if (!(fArr[2] >= 0.95f)) {
                if (!(fArr[2] <= 0.05f)) {
                    boolean z = fArr[0] >= 10.0f && fArr[0] <= 37.0f && fArr[1] <= 0.82f;
                    if (!z) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    C0694b(List<C0693d> list, List<C0695c> list2) {
        this.f2297a = list;
        this.f2298b = list2;
    }

    public static C0690a m1684a(Bitmap bitmap) {
        return new C0690a(bitmap);
    }

    private C0693d m1685a() {
        int size = this.f2297a.size();
        int i = Integer.MIN_VALUE;
        C0693d c0693d = null;
        for (int i2 = 0; i2 < size; i2++) {
            C0693d c0693d2 = (C0693d) this.f2297a.get(i2);
            if (c0693d2.f2288b > i) {
                i = c0693d2.f2288b;
                c0693d = c0693d2;
            }
        }
        return c0693d;
    }

    public final int m1686a(int i) {
        C0693d c0693d = (C0693d) this.f2299c.get(C0695c.f2303b);
        return c0693d != null ? c0693d.f2287a : i;
    }
}
