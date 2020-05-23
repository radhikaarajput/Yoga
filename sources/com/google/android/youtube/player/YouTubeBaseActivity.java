package com.google.android.youtube.player;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class YouTubeBaseActivity extends Activity {
    private a a;
    /* access modifiers changed from: private */
    public YouTubePlayerView b;
    /* access modifiers changed from: private */
    public int c;
    /* access modifiers changed from: private */
    public Bundle d;

    private final class a implements YouTubePlayerView.b {
        private a() {
        }

        /* synthetic */ a(YouTubeBaseActivity youTubeBaseActivity, byte b) {
            this();
        }

        public final void a(YouTubePlayerView youTubePlayerView) {
            if (!(YouTubeBaseActivity.this.b == null || YouTubeBaseActivity.this.b == youTubePlayerView)) {
                YouTubeBaseActivity.this.b.c(true);
            }
            YouTubePlayerView unused = YouTubeBaseActivity.this.b = youTubePlayerView;
            if (YouTubeBaseActivity.this.c > 0) {
                youTubePlayerView.a();
            }
            if (YouTubeBaseActivity.this.c >= 2) {
                youTubePlayerView.b();
            }
        }

        public final void a(YouTubePlayerView youTubePlayerView, String str, YouTubePlayer.OnInitializedListener onInitializedListener) {
            youTubePlayerView.a(YouTubeBaseActivity.this, youTubePlayerView, str, onInitializedListener, YouTubeBaseActivity.this.d);
            Bundle unused = YouTubeBaseActivity.this.d = null;
        }
    }

    /* access modifiers changed from: package-private */
    public final YouTubePlayerView.b a() {
        return this.a;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.a = new a(this, (byte) 0);
        this.d = bundle != null ? bundle.getBundle("YouTubeBaseActivity.KEY_PLAYER_VIEW_STATE") : null;
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        if (this.b != null) {
            this.b.b(isFinishing());
        }
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        this.c = 1;
        if (this.b != null) {
            this.b.c();
        }
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.c = 2;
        if (this.b != null) {
            this.b.b();
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBundle("YouTubeBaseActivity.KEY_PLAYER_VIEW_STATE", this.b != null ? this.b.e() : this.d);
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        this.c = 1;
        if (this.b != null) {
            this.b.a();
        }
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        this.c = 0;
        if (this.b != null) {
            this.b.d();
        }
        super.onStop();
    }
}
