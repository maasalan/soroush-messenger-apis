package mobi.mmdt.ott.view.components.mediacaption.p409a;

import android.graphics.PorterDuff.Mode;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import com.p085c.p086a.C1212c;
import mobi.mmdt.componentsutils.p232b.C2491i;
import mobi.mmdt.ott.R;
import tv.danmaku.ijk.media.player.IjkMediaCodecInfo;

public final class C7327c extends C7179a {
    private View f21112a;
    private ImageView f21113b;
    private EditText f21114c;
    private CheckBox f21115d;

    public static C7327c m19600a(int i, String str, String str2, boolean z) {
        C7327c c7327c = new C7327c();
        Bundle bundle = new Bundle();
        bundle.putInt("ARG_SECTION_NUMBER", i);
        bundle.putString("ARG_SECTION_PATH", str);
        bundle.putString("ARG_SECTION_CAPTION", str2);
        bundle.putBoolean("ARG_SECTION_IS_COMPRESS", z);
        c7327c.mo3059e(bundle);
        return c7327c;
    }

    public final boolean mo3573O() {
        return this.f21115d != null ? this.f21115d.isChecked() : Boolean.parseBoolean(null);
    }

    public final View mo3056a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f21112a = layoutInflater.inflate(R.layout.fragment_caption_item_photo, viewGroup, false);
        this.f21113b = (ImageView) this.f21112a.findViewById(R.id.imageView);
        this.f21114c = (EditText) this.f21112a.findViewById(R.id.editText);
        this.f21115d = (CheckBox) this.f21112a.findViewById(R.id.compression_checkBox);
        Object string = this.f13204p.getString("ARG_SECTION_PATH");
        this.f21114c.setFilters(new InputFilter[]{new LengthFilter(IjkMediaCodecInfo.RANK_MAX)});
        if (string != null) {
            C1212c.m2873a(m8911k()).m10950a(string).m3033a().m3031a(this.f21113b);
        }
        CharSequence string2 = this.f13204p.getString("ARG_SECTION_CAPTION");
        if (string2 != null) {
            this.f21114c.setText(string2);
        } else {
            this.f21114c.setText("");
        }
        this.f21115d.setChecked(this.f13204p.containsKey("ARG_SECTION_IS_COMPRESS") ? this.f13204p.getBoolean("ARG_SECTION_IS_COMPRESS") : true);
        C2491i.m6799a(this.f21115d, -1);
        C2491i.m6780a(-1, -1, this.f21114c);
        this.f21114c.getBackground().mutate().setColorFilter(-1, Mode.SRC_ATOP);
        return this.f21112a;
    }

    public final void mo3574a(String str) {
        if (this.f21114c != null) {
            this.f21114c.setText(str);
        }
    }

    public final void mo3575a(boolean z) {
        if (this.f21115d != null) {
            this.f21115d.setChecked(z);
        }
    }

    public final String mo2533e() {
        return (this.f21114c == null || this.f21114c.getText() == null) ? null : this.f21114c.getText().toString();
    }
}
