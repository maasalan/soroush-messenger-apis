package mobi.mmdt.ott.provider.p386h;

import android.content.Context;
import android.net.Uri;
import mobi.mmdt.ott.provider.p381c.C2953a;

public final class C6025e extends C2953a {
    public final int m13445a(Context context, C6027g c6027g) {
        return context.getContentResolver().update(C2985d.f9350a, m7350b(), c6027g.f9181a.toString(), c6027g.m7370e());
    }

    public final Uri mo2224a() {
        return C2985d.f9350a;
    }

    public final C6025e m13447a(int i) {
        this.a.put("files_progress", Integer.valueOf(i));
        return this;
    }

    public final C6025e m13448a(long j) {
        this.a.put("files_size", Long.valueOf(j));
        return this;
    }

    public final C6025e m13449a(Integer num) {
        this.a.put("files_duration", num);
        return this;
    }

    public final C6025e m13450a(String str) {
        this.a.put("files_file_uri", str);
        return this;
    }

    public final C6025e m13451a(C2986h c2986h) {
        this.a.put("files_audio_state", c2986h == null ? null : Integer.valueOf(c2986h.ordinal()));
        return this;
    }

    public final C6025e m13452a(C2987i c2987i) {
        if (c2987i == null) {
            throw new IllegalArgumentException("downloadState must not be null");
        }
        this.a.put("files_download_state", Integer.valueOf(c2987i.ordinal()));
        return this;
    }

    public final C6025e m13453a(C2988j c2988j) {
        if (c2988j == null) {
            throw new IllegalArgumentException("type must not be null");
        }
        this.a.put("files_type", Integer.valueOf(c2988j.ordinal()));
        return this;
    }

    public final C6025e m13454b(int i) {
        this.a.put("files_audio_playing_time", Integer.valueOf(i));
        return this;
    }

    public final C6025e m13455b(Integer num) {
        if (num == null) {
            throw new IllegalArgumentException("downloadTaskId must not be null");
        }
        this.a.put("files_download_task_id", num);
        return this;
    }

    public final C6025e m13456b(String str) {
        this.a.put("files_file_url", str);
        return this;
    }

    public final C6025e m13457b(C2987i c2987i) {
        if (c2987i == null) {
            throw new IllegalArgumentException("ThumbnaildownloadState must not be null");
        }
        this.a.put("files_thumbnail_download_state", Integer.valueOf(c2987i.ordinal()));
        return this;
    }

    public final C6025e m13458c(int i) {
        this.a.put("files_image_width", Integer.valueOf(i));
        return this;
    }

    public final C6025e m13459c(String str) {
        this.a.put("files_server_file_id", str);
        return this;
    }

    public final C6025e m13460d(int i) {
        this.a.put("files_image_height", Integer.valueOf(i));
        return this;
    }

    public final C6025e m13461d(String str) {
        if (str == null) {
            throw new IllegalArgumentException("name must not be null");
        }
        this.a.put("files_name", str);
        return this;
    }

    public final C6025e m13462e(String str) {
        this.a.put("files_thumbnail_uri", str);
        return this;
    }

    public final C6025e m13463f(String str) {
        this.a.put("files_thumbnail_url", str);
        return this;
    }
}
