package mobi.mmdt.ott.view.components.squarecrop;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import com.theartofdev.edmodo.cropper.CropImageView;
import com.theartofdev.edmodo.cropper.CropImageView.C2247c;
import com.theartofdev.edmodo.cropper.CropImageView.C2249e;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.OutputStream;
import mobi.mmdt.componentsutils.p232b.C2486e;
import mobi.mmdt.componentsutils.p232b.p235c.C2480b;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.logic.C2791c;
import mobi.mmdt.ott.view.components.p405e.C3150a;
import mobi.mmdt.ott.view.tools.C4517m;
import mobi.mmdt.ott.view.tools.p479c.C4501c;

public final class C6119d extends C3150a implements C2247c, C2249e {
    CropImageView f16433a;
    String f16434b;
    private C3238a f16435c;
    private String f16436e;
    private Bitmap f16437f;

    class C32441 implements Runnable {
        final /* synthetic */ C6119d f9991a;

        class C32411 implements Runnable {
            final /* synthetic */ C32441 f9987a;

            C32411(C32441 c32441) {
                this.f9987a = c32441;
            }

            public final void run() {
                C4501c.m8189a().m8192a(this.f9987a.f9991a.getActivity(), null);
            }
        }

        class C32422 implements Runnable {
            final /* synthetic */ C32441 f9988a;

            C32422(C32441 c32441) {
                this.f9988a = c32441;
            }

            public final void run() {
                C4501c.m8189a().m8193b();
            }
        }

        C32441(C6119d c6119d) {
            this.f9991a = c6119d;
        }

        public final void run() {
            this.f9991a.getActivity().runOnUiThread(new C32411(this));
            Bitmap a = this.f9991a.f16437f;
            OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            a.compress(CompressFormat.JPEG, 100, byteArrayOutputStream);
            byte[] toByteArray = byteArrayOutputStream.toByteArray();
            String c = C2791c.m7109a().m7117c();
            final String f = C2791c.m7109a().m7121f(new File(c).getName());
            try {
                File file;
                C4517m.m8233a(c, toByteArray);
                C2486e.m6747a(c, f);
                switch (SquareCropActivityCopy.f24067n) {
                    case 1001:
                        file = new File(c);
                        break;
                    case 1002:
                        new File(c).delete();
                        file = new File(this.f9991a.f16434b);
                        break;
                    default:
                        break;
                }
                file.delete();
            } catch (Throwable e) {
                C2480b.m6738b(e);
            }
            this.f9991a.getActivity().runOnUiThread(new C32422(this));
            try {
                Thread.sleep(100);
            } catch (Throwable e2) {
                C2480b.m6738b(e2);
            }
            this.f9991a.getActivity().runOnUiThread(new Runnable(this) {
                final /* synthetic */ C32441 f9990b;

                public final void run() {
                    Intent intent = new Intent();
                    intent.putExtra("KEY_SQUARE_IMAGE_FILE_PATH", f);
                    this.f9990b.f9991a.getActivity().setResult(-1, intent);
                    this.f9990b.f9991a.getActivity().onBackPressed();
                }
            });
        }
    }

    public static C6119d m13861a(C3238a c3238a, String str) {
        C6119d c6119d = new C6119d();
        Bundle bundle = new Bundle();
        bundle.putString("DEMO_PRESET", c3238a.name());
        bundle.putString("IMAGE_PATH", str);
        c6119d.setArguments(bundle);
        return c6119d;
    }

    public final void m13863a() {
        SquareCropActivityCopy squareCropActivityCopy = (SquareCropActivityCopy) getActivity();
        C6119d c6119d = squareCropActivityCopy.f24069o;
        boolean z = squareCropActivityCopy.f24068m;
        CropImageView cropImageView = c6119d.f16433a;
        cropImageView.f7426a.setAspectRatioX(1);
        cropImageView.f7426a.setAspectRatioY(1);
        c6119d.f16433a.setFixedAspectRatio(z);
    }

    public final void mo2288a(Bitmap bitmap, Exception exception) {
        if (exception == null) {
            this.f16437f = bitmap;
            new Thread(new C32441(this)).start();
        }
    }

    public final void mo2289a(Exception exception) {
        Toast makeText;
        if (exception == null) {
            makeText = Toast.makeText(getActivity(), "Image load successful", 0);
        } else {
            Log.e("AIC", "Failed to load image by URI", exception);
            Context activity = getActivity();
            StringBuilder stringBuilder = new StringBuilder("Image load failed: ");
            stringBuilder.append(exception.getMessage());
            makeText = Toast.makeText(activity, stringBuilder.toString(), 1);
        }
        makeText.show();
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f16435c = C3238a.valueOf(getArguments().getString("DEMO_PRESET"));
        this.f16436e = getArguments().getString("IMAGE_PATH");
        ((SquareCropActivityCopy) activity).f24069o = this;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        switch (this.f16435c) {
            case RECT:
            case CUSTOM:
                return layoutInflater.inflate(R.layout.fragment_main_rect, viewGroup, false);
            case CIRCULAR:
                i = R.layout.fragment_main_oval;
                break;
            case CUSTOMIZED_OVERLAY:
                i = R.layout.fragment_main_customized;
                break;
            case MIN_MAX_OVERRIDE:
                i = R.layout.fragment_main_min_max;
                break;
            case SCALE_CENTER_INSIDE:
                i = R.layout.fragment_main_scale_center;
                break;
            default:
                StringBuilder stringBuilder = new StringBuilder("Unknown preset: ");
                stringBuilder.append(this.f16435c);
                throw new IllegalStateException(stringBuilder.toString());
        }
        return layoutInflater.inflate(i, viewGroup, false);
    }

    public final void onDetach() {
        super.onDetach();
        if (this.f16433a != null) {
            this.f16433a.setOnSetImageUriCompleteListener(null);
            this.f16433a.setOnGetCroppedImageCompleteListener(null);
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.f16434b != null) {
            bundle.putString("KEY_LAST_CAMERA_TAKEN_ADDRESS", this.f16434b);
        }
    }

    @TargetApi(9)
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f16433a = (CropImageView) view.findViewById(R.id.cropImageView);
        this.f16433a.setOnSetImageUriCompleteListener(this);
        this.f16433a.setOnGetCroppedImageCompleteListener(this);
        m13863a();
        if (!(this.f16436e == null || this.f16436e.isEmpty())) {
            try {
                this.f16433a.setImageBitmap(C2486e.m6746a(this.f16436e));
            } catch (Throwable e) {
                e.printStackTrace();
            }
        }
        if (bundle != null && bundle.containsKey("KEY_LAST_CAMERA_TAKEN_ADDRESS")) {
            this.f16434b = bundle.getString("KEY_LAST_CAMERA_TAKEN_ADDRESS");
        }
    }
}
