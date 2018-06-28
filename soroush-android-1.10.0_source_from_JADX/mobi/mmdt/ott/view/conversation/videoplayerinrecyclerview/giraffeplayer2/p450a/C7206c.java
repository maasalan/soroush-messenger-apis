package mobi.mmdt.ott.view.conversation.videoplayerinrecyclerview.giraffeplayer2.p450a;

import android.os.Bundle;
import android.support.v4.app.C6358f;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnGroupClickListener;
import com.p144f.p147b.p148a.C1586a;
import mobi.mmdt.ott.R;
import mobi.mmdt.ott.view.conversation.videoplayerinrecyclerview.giraffeplayer2.C4113d;
import mobi.mmdt.ott.view.conversation.videoplayerinrecyclerview.giraffeplayer2.C4118i;
import tv.danmaku.ijk.media.player.misc.ITrackInfo;

public final class C7206c extends C6358f {
    private C1586a ae;

    class C41001 implements OnClickListener {
        final /* synthetic */ C7206c f11722a;

        C41001(C7206c c7206c) {
            this.f11722a = c7206c;
        }

        public final void onClick(View view) {
            this.f11722a.m14956a(true);
        }
    }

    class C41012 implements OnGroupClickListener {
        final /* synthetic */ C7206c f11723a;

        C41012(C7206c c7206c) {
            this.f11723a = c7206c;
        }

        public final boolean onGroupClick(ExpandableListView expandableListView, View view, int i, long j) {
            return true;
        }
    }

    public final View mo3056a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f17405f.requestWindowFeature(1);
        View inflate = layoutInflater.inflate(R.layout.giraffe_track_selector, viewGroup, false);
        this.ae = new C1586a(inflate);
        return inflate;
    }

    public final void mo3453a(View view, Bundle bundle) {
        ExpandableListView expandableListView = (ExpandableListView) this.ae.m4110a((int) R.id.app_video_track_list).f4923a;
        this.ae.m4110a((int) R.id.app_video_track_close).m4111a(new C41001(this));
        C4103d c4103d = new C4103d();
        expandableListView.setGroupIndicator(null);
        expandableListView.setOnGroupClickListener(new C41012(this));
        expandableListView.setAdapter(c4103d);
        String string = this.f13204p.getString("fingerprint");
        int i = 0;
        if (!TextUtils.isEmpty(string)) {
            C4113d b = C4118i.m7985a().m7991b(string);
            if (b != null) {
                c4103d.f11726b.clear();
                c4103d.f11727c.clear();
                c4103d.f11725a = string;
                ITrackInfo[] c = b.m7968c();
                for (int i2 = 0; i2 < c.length; i2++) {
                    ITrackInfo iTrackInfo = c[i2];
                    int trackType = iTrackInfo.getTrackType();
                    if (trackType == 2 || trackType == 1 || trackType == 4 || trackType == 3) {
                        C4098a c4098a = (C4098a) c4103d.f11726b.get(Integer.valueOf(trackType));
                        if (c4098a == null) {
                            C4098a c4098a2 = new C4098a(trackType, b.m7966b(trackType));
                            c4103d.f11726b.put(Integer.valueOf(trackType), c4098a2);
                            c4103d.f11727c.add(c4098a2);
                            c4098a = c4098a2;
                        }
                        c4098a.f11717c.add(new C4099b(string, iTrackInfo, i2, trackType));
                    }
                }
                c4103d.notifyDataSetChanged();
            }
        }
        int groupCount = c4103d.getGroupCount();
        while (i < groupCount) {
            expandableListView.expandGroup(i);
            i++;
        }
    }
}
