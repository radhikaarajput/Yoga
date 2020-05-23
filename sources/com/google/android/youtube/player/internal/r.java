package com.google.android.youtube.player.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.youtube.player.YouTubeApiServiceUtil;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.internal.c;
import com.google.android.youtube.player.internal.i;
import com.google.android.youtube.player.internal.t;
import java.util.ArrayList;

public abstract class r<T extends IInterface> implements t {
    final Handler a;
    private final Context b;
    /* access modifiers changed from: private */
    public T c;
    /* access modifiers changed from: private */
    public ArrayList<t.a> d;
    private final ArrayList<t.a> e = new ArrayList<>();
    private boolean f = false;
    private ArrayList<t.b> g;
    private boolean h = false;
    /* access modifiers changed from: private */
    public final ArrayList<b<?>> i = new ArrayList<>();
    private ServiceConnection j;
    /* access modifiers changed from: private */
    public boolean k = false;

    final class a extends Handler {
        a() {
        }

        public final void handleMessage(Message message) {
            if (message.what == 3) {
                r.this.a((YouTubeInitializationResult) message.obj);
            } else if (message.what == 4) {
                synchronized (r.this.d) {
                    if (r.this.k && r.this.f() && r.this.d.contains(message.obj)) {
                        ((t.a) message.obj).a();
                    }
                }
            } else if (message.what == 2 && !r.this.f()) {
            } else {
                if (message.what == 2 || message.what == 1) {
                    ((b) message.obj).a();
                }
            }
        }
    }

    protected abstract class b<TListener> {
        private TListener b;

        public b(TListener tlistener) {
            this.b = tlistener;
            synchronized (r.this.i) {
                r.this.i.add(this);
            }
        }

        public final void a() {
            TListener tlistener;
            synchronized (this) {
                tlistener = this.b;
            }
            a(tlistener);
        }

        /* access modifiers changed from: protected */
        public abstract void a(TListener tlistener);

        public final void b() {
            synchronized (this) {
                this.b = null;
            }
        }
    }

    protected final class c extends b<Boolean> {
        public final YouTubeInitializationResult b;
        public final IBinder c;

        public c(String str, IBinder iBinder) {
            super(true);
            this.b = r.b(str);
            this.c = iBinder;
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ void a(Object obj) {
            if (((Boolean) obj) != null) {
                switch (this.b) {
                    case SUCCESS:
                        try {
                            if (r.this.b().equals(this.c.getInterfaceDescriptor())) {
                                IInterface unused = r.this.c = r.this.a(this.c);
                                if (r.this.c != null) {
                                    r.this.g();
                                    return;
                                }
                            }
                        } catch (RemoteException e) {
                        }
                        r.this.a();
                        r.this.a(YouTubeInitializationResult.INTERNAL_ERROR);
                        return;
                    default:
                        r.this.a(this.b);
                        return;
                }
            }
        }
    }

    protected final class d extends c.a {
        protected d() {
        }

        public final void a(String str, IBinder iBinder) {
            r.this.a.sendMessage(r.this.a.obtainMessage(1, new c(str, iBinder)));
        }
    }

    final class e implements ServiceConnection {
        e() {
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            r.this.b(iBinder);
        }

        public final void onServiceDisconnected(ComponentName componentName) {
            IInterface unused = r.this.c = null;
            r.this.h();
        }
    }

    protected r(Context context, t.a aVar, t.b bVar) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Clients must be created on the UI thread.");
        }
        this.b = (Context) ab.a(context);
        this.d = new ArrayList<>();
        this.d.add(ab.a(aVar));
        this.g = new ArrayList<>();
        this.g.add(ab.a(bVar));
        this.a = new a();
    }

    /* access modifiers changed from: private */
    public void a() {
        if (this.j != null) {
            try {
                this.b.unbindService(this.j);
            } catch (IllegalArgumentException e2) {
                Log.w("YouTubeClient", "Unexpected error from unbindService()", e2);
            }
        }
        this.c = null;
        this.j = null;
    }

    /* access modifiers changed from: private */
    public static YouTubeInitializationResult b(String str) {
        try {
            return YouTubeInitializationResult.valueOf(str);
        } catch (IllegalArgumentException e2) {
            return YouTubeInitializationResult.UNKNOWN_ERROR;
        } catch (NullPointerException e3) {
            return YouTubeInitializationResult.UNKNOWN_ERROR;
        }
    }

    /* access modifiers changed from: protected */
    public abstract T a(IBinder iBinder);

    /* access modifiers changed from: protected */
    public final void a(YouTubeInitializationResult youTubeInitializationResult) {
        this.a.removeMessages(4);
        synchronized (this.g) {
            this.h = true;
            ArrayList<t.b> arrayList = this.g;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                if (this.k) {
                    if (this.g.contains(arrayList.get(i2))) {
                        arrayList.get(i2).a(youTubeInitializationResult);
                    }
                    i2++;
                } else {
                    return;
                }
            }
            this.h = false;
        }
    }

    /* access modifiers changed from: protected */
    public abstract void a(i iVar, d dVar) throws RemoteException;

    /* access modifiers changed from: protected */
    public abstract String b();

    /* access modifiers changed from: protected */
    public final void b(IBinder iBinder) {
        try {
            a(i.a.a(iBinder), new d());
        } catch (RemoteException e2) {
            Log.w("YouTubeClient", "service died");
        }
    }

    /* access modifiers changed from: protected */
    public abstract String c();

    public void d() {
        h();
        this.k = false;
        synchronized (this.i) {
            int size = this.i.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.i.get(i2).b();
            }
            this.i.clear();
        }
        a();
    }

    public final void e() {
        this.k = true;
        YouTubeInitializationResult isYouTubeApiServiceAvailable = YouTubeApiServiceUtil.isYouTubeApiServiceAvailable(this.b);
        if (isYouTubeApiServiceAvailable != YouTubeInitializationResult.SUCCESS) {
            this.a.sendMessage(this.a.obtainMessage(3, isYouTubeApiServiceAvailable));
            return;
        }
        Intent intent = new Intent(c()).setPackage(z.a(this.b));
        if (this.j != null) {
            Log.e("YouTubeClient", "Calling connect() while still connected, missing disconnect().");
            a();
        }
        this.j = new e();
        if (!this.b.bindService(intent, this.j, 129)) {
            this.a.sendMessage(this.a.obtainMessage(3, YouTubeInitializationResult.ERROR_CONNECTING_TO_SERVICE));
        }
    }

    public final boolean f() {
        return this.c != null;
    }

    /* access modifiers changed from: protected */
    public final void g() {
        boolean z = true;
        synchronized (this.d) {
            ab.a(!this.f);
            this.a.removeMessages(4);
            this.f = true;
            if (this.e.size() != 0) {
                z = false;
            }
            ab.a(z);
            ArrayList<t.a> arrayList = this.d;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size && this.k && f(); i2++) {
                if (!this.e.contains(arrayList.get(i2))) {
                    arrayList.get(i2).a();
                }
            }
            this.e.clear();
            this.f = false;
        }
    }

    /* access modifiers changed from: protected */
    public final void h() {
        this.a.removeMessages(4);
        synchronized (this.d) {
            this.f = true;
            ArrayList<t.a> arrayList = this.d;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size && this.k; i2++) {
                if (this.d.contains(arrayList.get(i2))) {
                    arrayList.get(i2).b();
                }
            }
            this.f = false;
        }
    }

    /* access modifiers changed from: protected */
    public final void i() {
        if (!f()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    /* access modifiers changed from: protected */
    public final T j() {
        i();
        return this.c;
    }
}
