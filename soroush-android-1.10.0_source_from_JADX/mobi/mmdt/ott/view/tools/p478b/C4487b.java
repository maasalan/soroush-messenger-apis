package mobi.mmdt.ott.view.tools.p478b;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import mobi.mmdt.componentsutils.p232b.p235c.C2478a;
import mobi.mmdt.ott.R;

public abstract class C4487b {
    private int f12428a;
    public Bitmap f12429b;
    public boolean f12430c = true;
    boolean f12431d = false;
    final Object f12432e = new Object();
    public Resources f12433f;

    private static class C4485a extends BitmapDrawable {
        final WeakReference<C4486b> f12424a;

        public C4485a(Resources resources, Bitmap bitmap, C4486b c4486b) {
            super(resources, bitmap);
            this.f12424a = new WeakReference(c4486b);
        }
    }

    private class C4486b extends AsyncTask<Integer, Void, Bitmap> {
        final /* synthetic */ C4487b f12425a;
        private int f12426b;
        private final WeakReference<ImageView> f12427c;

        public C4486b(C4487b c4487b, ImageView imageView) {
            this.f12425a = c4487b;
            this.f12427c = new WeakReference(imageView);
        }

        private android.graphics.Bitmap m8177a(java.lang.Integer... r3) {
            /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
*/
            /*
            r2 = this;
            r0 = java.lang.Thread.currentThread();
            r1 = 1;
            r0.setPriority(r1);
            r0 = 0;
            r3 = r3[r0];
            r3 = r3.intValue();
            r2.f12426b = r3;
            r3 = r2.f12425a;
            r3 = r3.f12432e;
            monitor-enter(r3);
        L_0x0016:
            r0 = r2.f12425a;	 Catch:{ all -> 0x005e }
            r0 = r0.f12431d;	 Catch:{ all -> 0x005e }
            if (r0 == 0) goto L_0x002a;	 Catch:{ all -> 0x005e }
        L_0x001c:
            r0 = r2.isCancelled();	 Catch:{ all -> 0x005e }
            if (r0 != 0) goto L_0x002a;
        L_0x0022:
            r0 = r2.f12425a;	 Catch:{ InterruptedException -> 0x0016 }
            r0 = r0.f12432e;	 Catch:{ InterruptedException -> 0x0016 }
            r0.wait();	 Catch:{ InterruptedException -> 0x0016 }
            goto L_0x0016;
        L_0x002a:
            monitor-exit(r3);	 Catch:{ all -> 0x005e }
            r3 = r2.isCancelled();
            if (r3 != 0) goto L_0x0040;
        L_0x0031:
            r3 = r2.m8178a();
            if (r3 == 0) goto L_0x0040;
        L_0x0037:
            r3 = r2.f12425a;
            r0 = r2.f12426b;
            r3 = r3.mo2367a(r0);
            goto L_0x0041;
        L_0x0040:
            r3 = 0;
        L_0x0041:
            if (r3 == 0) goto L_0x005a;
        L_0x0043:
            r0 = mobi.mmdt.ott.MyApplication.m12950a();
            r0 = r0.f15909o;
            if (r0 == 0) goto L_0x005a;
        L_0x004b:
            r0 = mobi.mmdt.ott.MyApplication.m12950a();
            r0 = r0.f15909o;
            r1 = r2.f12426b;
            r1 = java.lang.Integer.valueOf(r1);
            r0.m8175a(r1, r3);
        L_0x005a:
            mobi.mmdt.componentsutils.p232b.p235c.C2478a.m6728a();
            return r3;
        L_0x005e:
            r0 = move-exception;
            monitor-exit(r3);	 Catch:{ all -> 0x005e }
            throw r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: mobi.mmdt.ott.view.tools.b.b.b.a(java.lang.Integer[]):android.graphics.Bitmap");
        }

        private ImageView m8178a() {
            ImageView imageView = (ImageView) this.f12427c.get();
            return this == C4487b.m8179a(imageView) ? imageView : null;
        }

        protected final /* synthetic */ Object doInBackground(Object[] objArr) {
            return m8177a((Integer[]) objArr);
        }

        @SuppressLint({"NewApi"})
        protected final /* synthetic */ void onCancelled(Object obj) {
            Bitmap bitmap = (Bitmap) obj;
            if (VERSION.SDK_INT > 11) {
                super.onCancelled(bitmap);
            }
            synchronized (this.f12425a.f12432e) {
                this.f12425a.f12432e.notifyAll();
            }
        }

        protected final /* synthetic */ void onPostExecute(Object obj) {
            Bitmap bitmap = (Bitmap) obj;
            if (isCancelled()) {
                bitmap = null;
            }
            ImageView a = m8178a();
            if (!(bitmap == null || a == null)) {
                C2478a.m6728a();
                if (this.f12425a.f12430c) {
                    Drawable transitionDrawable = new TransitionDrawable(new Drawable[]{new ColorDrawable(this.f12425a.f12433f.getColor(R.color.transparent)), new BitmapDrawable(this.f12425a.f12433f, bitmap)});
                    a.setImageDrawable(transitionDrawable);
                    transitionDrawable.startTransition(50);
                    return;
                }
                a.setImageBitmap(bitmap);
            }
        }
    }

    protected C4487b(Context context, int i) {
        this.f12433f = context.getResources();
        this.f12428a = i;
    }

    public static C4486b m8179a(ImageView imageView) {
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof C4485a) {
                return (C4486b) ((C4485a) drawable).f12424a.get();
            }
        }
        return null;
    }

    public abstract Bitmap mo2367a(int i);
}
