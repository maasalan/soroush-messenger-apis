package mobi.mmdt.ott.view.conversation.videoplayerinrecyclerview.giraffeplayer2.p450a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.Checkable;
import com.p144f.p147b.p148a.C1586a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.view.conversation.videoplayerinrecyclerview.giraffeplayer2.C4113d;
import mobi.mmdt.ott.view.conversation.videoplayerinrecyclerview.giraffeplayer2.C4118i;

public final class C4103d extends BaseExpandableListAdapter {
    String f11725a;
    Map<Integer, C4098a> f11726b = new HashMap();
    List<C4098a> f11727c = new ArrayList();

    class C41021 implements OnClickListener {
        final /* synthetic */ C4103d f11724a;

        C41021(C4103d c4103d) {
            this.f11724a = c4103d;
        }

        public final void onClick(View view) {
            C4099b c4099b = (C4099b) view.getTag();
            C4098a c4098a = (C4098a) this.f11724a.f11726b.get(Integer.valueOf(c4099b.f11720c));
            if (c4098a.f11716b != c4099b.f11719b) {
                c4098a.f11716b = c4099b.f11719b;
                this.f11724a.notifyDataSetChanged();
                C4113d b = C4118i.m7985a().m7991b(c4099b.f11721d);
                if (b != null) {
                    int i;
                    if (c4099b.f11719b >= 0) {
                        i = c4099b.f11719b;
                        if (b.f11760e != null && !b.f11761f) {
                            b.f11762g.removeMessages(6);
                            b.f11762g.obtainMessage(6, Integer.valueOf(i)).sendToTarget();
                            return;
                        }
                        return;
                    }
                    i = b.m7966b(c4099b.f11720c);
                    if (b.f11760e != null && !b.f11761f) {
                        b.f11762g.removeMessages(7);
                        b.f11762g.obtainMessage(7, Integer.valueOf(i)).sendToTarget();
                    }
                }
            }
        }
    }

    private C4098a m7926a(int i) {
        return (C4098a) this.f11727c.get(i);
    }

    private C4099b m7927a(int i, int i2) {
        return (C4099b) m7926a(i).f11717c.get(i2);
    }

    public final /* synthetic */ Object getChild(int i, int i2) {
        return m7927a(i, i2);
    }

    public final long getChildId(int i, int i2) {
        return (long) m7927a(i, i2).hashCode();
    }

    public final View getChildView(int i, int i2, boolean z, View view, ViewGroup viewGroup) {
        C4098a a = m7926a(i);
        C4099b a2 = m7927a(i, i2);
        boolean z2 = false;
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.giraffe_track_selector_child, viewGroup, false);
            view.findViewById(R.id.app_video_track_group_child).setOnClickListener(new C41021(this));
        }
        C1586a a3 = new C1586a(view).m4110a((int) R.id.app_video_track_group_child).m4112a(a2.f11718a == null ? "OFF" : a2.f11718a.getInfoInline());
        if (a.f11716b == a2.f11719b) {
            z2 = true;
        }
        if (a3.f4923a != null && (a3.f4923a instanceof Checkable)) {
            ((Checkable) a3.f4923a).setChecked(z2);
        }
        a3.f4923a.setTag(a2);
        return view;
    }

    public final int getChildrenCount(int i) {
        return ((C4098a) this.f11727c.get(i)).f11717c.size();
    }

    public final /* synthetic */ Object getGroup(int i) {
        return m7926a(i);
    }

    public final int getGroupCount() {
        return this.f11727c.size();
    }

    public final long getGroupId(int i) {
        return (long) i;
    }

    public final View getGroupView(int i, boolean z, View view, ViewGroup viewGroup) {
        C4098a a = m7926a(i);
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.giraffe_track_selector_group, viewGroup, false);
        }
        C1586a a2 = new C1586a(view).m4110a((int) R.id.app_video_track_group);
        i = a.f11715a == 2 ? R.string.giraffe_player_track_type_audio : a.f11715a == 1 ? R.string.giraffe_player_track_type_video : a.f11715a == 3 ? R.string.giraffe_player_track_type_timed_text : a.f11715a == 4 ? R.string.giraffe_player_track_type_subtitle : R.string.giraffe_player_track_type_unknown;
        a2.m4116c(i);
        return view;
    }

    public final boolean hasStableIds() {
        return true;
    }

    public final boolean isChildSelectable(int i, int i2) {
        return true;
    }
}
