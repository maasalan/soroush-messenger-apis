package jp.wasabeef.p215a.p216a.p217a;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.renderscript.Allocation;
import android.renderscript.Allocation.MipmapControl;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.RenderScript.RSMessageHandler;
import android.renderscript.ScriptIntrinsicBlur;

public final class C2401b {
    @TargetApi(18)
    public static Bitmap m6570a(Context context, Bitmap bitmap, int i) {
        Allocation createFromBitmap;
        Throwable th;
        ScriptIntrinsicBlur scriptIntrinsicBlur;
        Allocation createTyped;
        Allocation allocation = null;
        RenderScript create;
        try {
            create = RenderScript.create(context);
            try {
                create.setMessageHandler(new RSMessageHandler());
                createFromBitmap = Allocation.createFromBitmap(create, bitmap, MipmapControl.MIPMAP_NONE, 1);
            } catch (Throwable th2) {
                th = th2;
                createFromBitmap = null;
                scriptIntrinsicBlur = createFromBitmap;
                if (create != null) {
                    create.destroy();
                }
                if (createFromBitmap != null) {
                    createFromBitmap.destroy();
                }
                if (allocation != null) {
                    allocation.destroy();
                }
                if (scriptIntrinsicBlur != null) {
                    scriptIntrinsicBlur.destroy();
                }
                throw th;
            }
            try {
                createTyped = Allocation.createTyped(create, createFromBitmap.getType());
            } catch (Throwable th3) {
                th = th3;
                scriptIntrinsicBlur = null;
                if (create != null) {
                    create.destroy();
                }
                if (createFromBitmap != null) {
                    createFromBitmap.destroy();
                }
                if (allocation != null) {
                    allocation.destroy();
                }
                if (scriptIntrinsicBlur != null) {
                    scriptIntrinsicBlur.destroy();
                }
                throw th;
            }
            try {
                scriptIntrinsicBlur = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
            } catch (Throwable th4) {
                th = th4;
                scriptIntrinsicBlur = null;
                allocation = createTyped;
                if (create != null) {
                    create.destroy();
                }
                if (createFromBitmap != null) {
                    createFromBitmap.destroy();
                }
                if (allocation != null) {
                    allocation.destroy();
                }
                if (scriptIntrinsicBlur != null) {
                    scriptIntrinsicBlur.destroy();
                }
                throw th;
            }
            try {
                scriptIntrinsicBlur.setInput(createFromBitmap);
                scriptIntrinsicBlur.setRadius((float) i);
                scriptIntrinsicBlur.forEach(createTyped);
                createTyped.copyTo(bitmap);
                if (create != null) {
                    create.destroy();
                }
                if (createFromBitmap != null) {
                    createFromBitmap.destroy();
                }
                if (createTyped != null) {
                    createTyped.destroy();
                }
                if (scriptIntrinsicBlur != null) {
                    scriptIntrinsicBlur.destroy();
                }
                return bitmap;
            } catch (Throwable th5) {
                th = th5;
                allocation = createTyped;
                if (create != null) {
                    create.destroy();
                }
                if (createFromBitmap != null) {
                    createFromBitmap.destroy();
                }
                if (allocation != null) {
                    allocation.destroy();
                }
                if (scriptIntrinsicBlur != null) {
                    scriptIntrinsicBlur.destroy();
                }
                throw th;
            }
        } catch (Throwable th6) {
            th = th6;
            create = null;
            createFromBitmap = create;
            scriptIntrinsicBlur = createFromBitmap;
            if (create != null) {
                create.destroy();
            }
            if (createFromBitmap != null) {
                createFromBitmap.destroy();
            }
            if (allocation != null) {
                allocation.destroy();
            }
            if (scriptIntrinsicBlur != null) {
                scriptIntrinsicBlur.destroy();
            }
            throw th;
        }
    }
}
