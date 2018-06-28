package ir.pec.mpl.pecpayment.view;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.ImageView;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.net.URL;

class C2377c extends AsyncTask<String, Void, Bitmap> {
    ImageView f7924a;

    public C2377c(ImageView imageView) {
        this.f7924a = imageView;
    }

    protected Bitmap m6567a(String... strArr) {
        Log.d("SSSSS", "HERE!!!!!!");
        try {
            return BitmapFactory.decodeStream(FirebasePerfUrlConnection.openStream(new URL(strArr[0])));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    protected void m6568a(Bitmap bitmap) {
        this.f7924a.setImageBitmap(bitmap);
    }

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return m6567a((String[]) objArr);
    }

    protected /* synthetic */ void onPostExecute(Object obj) {
        m6568a((Bitmap) obj);
    }
}
