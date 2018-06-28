package mobi.mmdt.ott.view.components.squarecrop;

import android.graphics.Bitmap;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.view.components.p402d.C7576b;
import org.jivesoftware.smack.roster.Roster;

public final class CropResultActivity extends C7576b {
    static Bitmap f24065m;
    private ImageView f24066n;

    private static void m21171g() {
        if (f24065m != null) {
            f24065m.recycle();
            f24065m = null;
        }
    }

    public final void onBackPressed() {
        m21171g();
        super.onBackPressed();
    }

    protected final void onCreate(Bundle bundle) {
        requestWindowFeature(1);
        super.onCreate(bundle);
        setContentView((int) R.layout.activity_crop_result);
        if (f24065m != null) {
            this.f24066n = (ImageView) findViewById(R.id.resultImageView);
            if (this.f24066n != null) {
                this.f24066n.setBackgroundResource(R.drawable.backdrop);
                this.f24066n.setImageBitmap(f24065m);
            }
            double width = ((double) ((int) (((double) (10 * f24065m.getWidth())) / ((double) f24065m.getHeight())))) / 10.0d;
            int i = 0;
            if (VERSION.SDK_INT >= 12) {
                i = f24065m.getByteCount() / Roster.INITIAL_DEFAULT_NON_ROSTER_PRESENCE_MAP_SIZE;
            }
            StringBuilder stringBuilder = new StringBuilder("(");
            stringBuilder.append(f24065m.getWidth());
            stringBuilder.append(", ");
            stringBuilder.append(f24065m.getHeight());
            stringBuilder.append("), Ratio: ");
            stringBuilder.append(width);
            stringBuilder.append(", Bytes: ");
            stringBuilder.append(i);
            stringBuilder.append("K");
            ((TextView) findViewById(R.id.resultImageText)).setText(stringBuilder.toString());
            return;
        }
        Toast.makeText(this, "No image is set to show", 1).show();
    }

    public final void onImageViewClicked(View view) {
        m21171g();
        finish();
    }
}
