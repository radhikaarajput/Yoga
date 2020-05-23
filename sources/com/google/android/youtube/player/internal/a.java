package com.google.android.youtube.player.internal;

import android.graphics.Bitmap;
import com.google.android.youtube.player.YouTubeThumbnailLoader;
import com.google.android.youtube.player.YouTubeThumbnailView;
import java.lang.ref.WeakReference;
import java.util.NoSuchElementException;

public abstract class a implements YouTubeThumbnailLoader {
    private final WeakReference<YouTubeThumbnailView> a;
    private YouTubeThumbnailLoader.OnThumbnailLoadedListener b;
    private boolean c;
    private boolean d;

    public a(YouTubeThumbnailView youTubeThumbnailView) {
        this.a = new WeakReference<>(ab.a(youTubeThumbnailView));
    }

    private void i() {
        if (!a()) {
            throw new IllegalStateException("This YouTubeThumbnailLoader has been released");
        }
    }

    public final void a(Bitmap bitmap, String str) {
        YouTubeThumbnailView youTubeThumbnailView = (YouTubeThumbnailView) this.a.get();
        if (a() && youTubeThumbnailView != null) {
            youTubeThumbnailView.setImageBitmap(bitmap);
            if (this.b != null) {
                this.b.onThumbnailLoaded(youTubeThumbnailView, str);
            }
        }
    }

    public abstract void a(String str);

    public abstract void a(String str, int i);

    /* access modifiers changed from: protected */
    public boolean a() {
        return !this.d;
    }

    public final void b() {
        if (a()) {
            y.a("The finalize() method for a YouTubeThumbnailLoader has work to do. You should have called release().", new Object[0]);
            release();
        }
    }

    public final void b(String str) {
        YouTubeThumbnailLoader.ErrorReason errorReason;
        YouTubeThumbnailView youTubeThumbnailView = (YouTubeThumbnailView) this.a.get();
        if (a() && this.b != null && youTubeThumbnailView != null) {
            try {
                errorReason = YouTubeThumbnailLoader.ErrorReason.valueOf(str);
            } catch (IllegalArgumentException e) {
                errorReason = YouTubeThumbnailLoader.ErrorReason.UNKNOWN;
            } catch (NullPointerException e2) {
                errorReason = YouTubeThumbnailLoader.ErrorReason.UNKNOWN;
            }
            this.b.onThumbnailError(youTubeThumbnailView, errorReason);
        }
    }

    public abstract void c();

    public abstract void d();

    public abstract void e();

    public abstract boolean f();

    public final void first() {
        i();
        if (!this.c) {
            throw new IllegalStateException("Must call setPlaylist first");
        }
        e();
    }

    public abstract boolean g();

    public abstract void h();

    public final boolean hasNext() {
        i();
        return f();
    }

    public final boolean hasPrevious() {
        i();
        return g();
    }

    public final void next() {
        i();
        if (!this.c) {
            throw new IllegalStateException("Must call setPlaylist first");
        } else if (!f()) {
            throw new NoSuchElementException("Called next at end of playlist");
        } else {
            c();
        }
    }

    public final void previous() {
        i();
        if (!this.c) {
            throw new IllegalStateException("Must call setPlaylist first");
        } else if (!g()) {
            throw new NoSuchElementException("Called previous at start of playlist");
        } else {
            d();
        }
    }

    public final void release() {
        if (a()) {
            this.d = true;
            this.b = null;
            h();
        }
    }

    public final void setOnThumbnailLoadedListener(YouTubeThumbnailLoader.OnThumbnailLoadedListener onThumbnailLoadedListener) {
        i();
        this.b = onThumbnailLoadedListener;
    }

    public final void setPlaylist(String str) {
        setPlaylist(str, 0);
    }

    public final void setPlaylist(String str, int i) {
        i();
        this.c = true;
        a(str, i);
    }

    public final void setVideo(String str) {
        i();
        this.c = false;
        a(str);
    }
}
