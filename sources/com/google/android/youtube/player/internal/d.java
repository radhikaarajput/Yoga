package com.google.android.youtube.player.internal;

import android.content.res.Configuration;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.KeyEvent;
import com.google.android.youtube.player.internal.u;
import java.util.List;

public interface d extends IInterface {

    public static abstract class a extends Binder implements d {

        /* renamed from: com.google.android.youtube.player.internal.d$a$a  reason: collision with other inner class name */
        private static class C0001a implements d {
            private IBinder a;

            C0001a(IBinder iBinder) {
                this.a = iBinder;
            }

            public final void a() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    this.a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void a(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    obtain.writeInt(i);
                    this.a.transact(17, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void a(Configuration configuration) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    if (configuration != null) {
                        obtain.writeInt(1);
                        configuration.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(32, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void a(e eVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    obtain.writeStrongBinder(eVar != null ? eVar.asBinder() : null);
                    this.a.transact(26, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void a(f fVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    obtain.writeStrongBinder(fVar != null ? fVar.asBinder() : null);
                    this.a.transact(29, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void a(g gVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    obtain.writeStrongBinder(gVar != null ? gVar.asBinder() : null);
                    this.a.transact(28, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void a(h hVar) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    obtain.writeStrongBinder(hVar != null ? hVar.asBinder() : null);
                    this.a.transact(27, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void a(String str) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    obtain.writeString(str);
                    this.a.transact(23, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void a(String str, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    this.a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void a(String str, int i, int i2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void a(List<String> list, int i, int i2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    obtain.writeStringList(list);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void a(boolean z) throws RemoteException {
                int i = 1;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    if (!z) {
                        i = 0;
                    }
                    obtain.writeInt(i);
                    this.a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final boolean a(int i, KeyEvent keyEvent) throws RemoteException {
                boolean z = true;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    obtain.writeInt(i);
                    if (keyEvent != null) {
                        obtain.writeInt(1);
                        keyEvent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(41, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z = false;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final boolean a(Bundle bundle) throws RemoteException {
                boolean z = true;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(40, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z = false;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final IBinder asBinder() {
                return this.a;
            }

            public final void b() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    this.a.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void b(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    obtain.writeInt(i);
                    this.a.transact(18, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void b(String str, int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    this.a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void b(String str, int i, int i2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    obtain.writeString(str);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void b(List<String> list, int i, int i2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    obtain.writeStringList(list);
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void b(boolean z) throws RemoteException {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.a.transact(19, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final boolean b(int i, KeyEvent keyEvent) throws RemoteException {
                boolean z = true;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    obtain.writeInt(i);
                    if (keyEvent != null) {
                        obtain.writeInt(1);
                        keyEvent.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(42, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z = false;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void c(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    obtain.writeInt(i);
                    this.a.transact(20, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void c(boolean z) throws RemoteException {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.a.transact(24, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final boolean c() throws RemoteException {
                boolean z = false;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    this.a.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void d(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    obtain.writeInt(i);
                    this.a.transact(22, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void d(boolean z) throws RemoteException {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.a.transact(25, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final boolean d() throws RemoteException {
                boolean z = false;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    this.a.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void e(boolean z) throws RemoteException {
                int i = 0;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    if (z) {
                        i = 1;
                    }
                    obtain.writeInt(i);
                    this.a.transact(37, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final boolean e() throws RemoteException {
                boolean z = false;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    this.a.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void f() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    this.a.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void g() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    this.a.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final int h() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    this.a.transact(15, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final int i() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    this.a.transact(16, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final int j() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    this.a.transact(21, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void k() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    this.a.transact(30, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void l() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    this.a.transact(31, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void m() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    this.a.transact(33, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void n() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    this.a.transact(34, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void o() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    this.a.transact(35, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void p() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    this.a.transact(36, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final void q() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    this.a.transact(38, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final Bundle r() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    this.a.transact(39, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public final u s() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.youtube.player.internal.IEmbeddedPlayer");
                    this.a.transact(43, obtain, obtain2, 0);
                    obtain2.readException();
                    return u.a.a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static d a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.youtube.player.internal.IEmbeddedPlayer");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof d)) ? new C0001a(iBinder) : (d) queryLocalInterface;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: android.view.KeyEvent} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: android.view.KeyEvent} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: android.os.Bundle} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v27, resolved type: android.content.res.Configuration} */
        /* JADX WARNING: type inference failed for: r0v0 */
        /* JADX WARNING: type inference failed for: r0v1, types: [android.os.IBinder] */
        /* JADX WARNING: type inference failed for: r0v37, types: [com.google.android.youtube.player.internal.f] */
        /* JADX WARNING: type inference failed for: r0v42, types: [com.google.android.youtube.player.internal.g] */
        /* JADX WARNING: type inference failed for: r0v47, types: [com.google.android.youtube.player.internal.h] */
        /* JADX WARNING: type inference failed for: r0v52, types: [com.google.android.youtube.player.internal.e] */
        /* JADX WARNING: type inference failed for: r0v103 */
        /* JADX WARNING: type inference failed for: r0v104 */
        /* JADX WARNING: type inference failed for: r0v105 */
        /* JADX WARNING: type inference failed for: r0v106 */
        /* JADX WARNING: type inference failed for: r0v107 */
        /* JADX WARNING: type inference failed for: r0v108 */
        /* JADX WARNING: type inference failed for: r0v109 */
        /* JADX WARNING: type inference failed for: r0v110 */
        /* JADX WARNING: type inference failed for: r0v111 */
        /* JADX WARNING: type inference failed for: r0v112 */
        /* JADX WARNING: type inference failed for: r0v113 */
        /* JADX WARNING: type inference failed for: r0v114 */
        /* JADX WARNING: type inference failed for: r0v115 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r6, android.os.Parcel r7, android.os.Parcel r8, int r9) throws android.os.RemoteException {
            /*
                r5 = this;
                r0 = 0
                r2 = 0
                r1 = 1
                switch(r6) {
                    case 1: goto L_0x0011;
                    case 2: goto L_0x0026;
                    case 3: goto L_0x003a;
                    case 4: goto L_0x004e;
                    case 5: goto L_0x0066;
                    case 6: goto L_0x007e;
                    case 7: goto L_0x0097;
                    case 8: goto L_0x00b0;
                    case 9: goto L_0x00bd;
                    case 10: goto L_0x00ca;
                    case 11: goto L_0x00de;
                    case 12: goto L_0x00f2;
                    case 13: goto L_0x0106;
                    case 14: goto L_0x0113;
                    case 15: goto L_0x0120;
                    case 16: goto L_0x0131;
                    case 17: goto L_0x0142;
                    case 18: goto L_0x0153;
                    case 19: goto L_0x0164;
                    case 20: goto L_0x0178;
                    case 21: goto L_0x0189;
                    case 22: goto L_0x019a;
                    case 23: goto L_0x01ab;
                    case 24: goto L_0x01bc;
                    case 25: goto L_0x01d0;
                    case 26: goto L_0x01e4;
                    case 27: goto L_0x020c;
                    case 28: goto L_0x0234;
                    case 29: goto L_0x025c;
                    case 30: goto L_0x0284;
                    case 31: goto L_0x0291;
                    case 32: goto L_0x029e;
                    case 33: goto L_0x02b9;
                    case 34: goto L_0x02c6;
                    case 35: goto L_0x02d3;
                    case 36: goto L_0x02e0;
                    case 37: goto L_0x02ed;
                    case 38: goto L_0x0301;
                    case 39: goto L_0x030e;
                    case 40: goto L_0x0329;
                    case 41: goto L_0x034b;
                    case 42: goto L_0x0371;
                    case 43: goto L_0x0397;
                    case 1598968902: goto L_0x000b;
                    default: goto L_0x0006;
                }
            L_0x0006:
                boolean r1 = super.onTransact(r6, r7, r8, r9)
            L_0x000a:
                return r1
            L_0x000b:
                java.lang.String r0 = "com.google.android.youtube.player.internal.IEmbeddedPlayer"
                r8.writeString(r0)
                goto L_0x000a
            L_0x0011:
                java.lang.String r0 = "com.google.android.youtube.player.internal.IEmbeddedPlayer"
                r7.enforceInterface(r0)
                int r0 = r7.readInt()
                if (r0 == 0) goto L_0x0024
                r0 = r1
            L_0x001d:
                r5.a((boolean) r0)
                r8.writeNoException()
                goto L_0x000a
            L_0x0024:
                r0 = r2
                goto L_0x001d
            L_0x0026:
                java.lang.String r0 = "com.google.android.youtube.player.internal.IEmbeddedPlayer"
                r7.enforceInterface(r0)
                java.lang.String r0 = r7.readString()
                int r2 = r7.readInt()
                r5.a((java.lang.String) r0, (int) r2)
                r8.writeNoException()
                goto L_0x000a
            L_0x003a:
                java.lang.String r0 = "com.google.android.youtube.player.internal.IEmbeddedPlayer"
                r7.enforceInterface(r0)
                java.lang.String r0 = r7.readString()
                int r2 = r7.readInt()
                r5.b((java.lang.String) r0, (int) r2)
                r8.writeNoException()
                goto L_0x000a
            L_0x004e:
                java.lang.String r0 = "com.google.android.youtube.player.internal.IEmbeddedPlayer"
                r7.enforceInterface(r0)
                java.lang.String r0 = r7.readString()
                int r2 = r7.readInt()
                int r3 = r7.readInt()
                r5.a((java.lang.String) r0, (int) r2, (int) r3)
                r8.writeNoException()
                goto L_0x000a
            L_0x0066:
                java.lang.String r0 = "com.google.android.youtube.player.internal.IEmbeddedPlayer"
                r7.enforceInterface(r0)
                java.lang.String r0 = r7.readString()
                int r2 = r7.readInt()
                int r3 = r7.readInt()
                r5.b((java.lang.String) r0, (int) r2, (int) r3)
                r8.writeNoException()
                goto L_0x000a
            L_0x007e:
                java.lang.String r0 = "com.google.android.youtube.player.internal.IEmbeddedPlayer"
                r7.enforceInterface(r0)
                java.util.ArrayList r0 = r7.createStringArrayList()
                int r2 = r7.readInt()
                int r3 = r7.readInt()
                r5.a((java.util.List<java.lang.String>) r0, (int) r2, (int) r3)
                r8.writeNoException()
                goto L_0x000a
            L_0x0097:
                java.lang.String r0 = "com.google.android.youtube.player.internal.IEmbeddedPlayer"
                r7.enforceInterface(r0)
                java.util.ArrayList r0 = r7.createStringArrayList()
                int r2 = r7.readInt()
                int r3 = r7.readInt()
                r5.b((java.util.List<java.lang.String>) r0, (int) r2, (int) r3)
                r8.writeNoException()
                goto L_0x000a
            L_0x00b0:
                java.lang.String r0 = "com.google.android.youtube.player.internal.IEmbeddedPlayer"
                r7.enforceInterface(r0)
                r5.a()
                r8.writeNoException()
                goto L_0x000a
            L_0x00bd:
                java.lang.String r0 = "com.google.android.youtube.player.internal.IEmbeddedPlayer"
                r7.enforceInterface(r0)
                r5.b()
                r8.writeNoException()
                goto L_0x000a
            L_0x00ca:
                java.lang.String r0 = "com.google.android.youtube.player.internal.IEmbeddedPlayer"
                r7.enforceInterface(r0)
                boolean r0 = r5.c()
                r8.writeNoException()
                if (r0 == 0) goto L_0x00d9
                r2 = r1
            L_0x00d9:
                r8.writeInt(r2)
                goto L_0x000a
            L_0x00de:
                java.lang.String r0 = "com.google.android.youtube.player.internal.IEmbeddedPlayer"
                r7.enforceInterface(r0)
                boolean r0 = r5.d()
                r8.writeNoException()
                if (r0 == 0) goto L_0x00ed
                r2 = r1
            L_0x00ed:
                r8.writeInt(r2)
                goto L_0x000a
            L_0x00f2:
                java.lang.String r0 = "com.google.android.youtube.player.internal.IEmbeddedPlayer"
                r7.enforceInterface(r0)
                boolean r0 = r5.e()
                r8.writeNoException()
                if (r0 == 0) goto L_0x0101
                r2 = r1
            L_0x0101:
                r8.writeInt(r2)
                goto L_0x000a
            L_0x0106:
                java.lang.String r0 = "com.google.android.youtube.player.internal.IEmbeddedPlayer"
                r7.enforceInterface(r0)
                r5.f()
                r8.writeNoException()
                goto L_0x000a
            L_0x0113:
                java.lang.String r0 = "com.google.android.youtube.player.internal.IEmbeddedPlayer"
                r7.enforceInterface(r0)
                r5.g()
                r8.writeNoException()
                goto L_0x000a
            L_0x0120:
                java.lang.String r0 = "com.google.android.youtube.player.internal.IEmbeddedPlayer"
                r7.enforceInterface(r0)
                int r0 = r5.h()
                r8.writeNoException()
                r8.writeInt(r0)
                goto L_0x000a
            L_0x0131:
                java.lang.String r0 = "com.google.android.youtube.player.internal.IEmbeddedPlayer"
                r7.enforceInterface(r0)
                int r0 = r5.i()
                r8.writeNoException()
                r8.writeInt(r0)
                goto L_0x000a
            L_0x0142:
                java.lang.String r0 = "com.google.android.youtube.player.internal.IEmbeddedPlayer"
                r7.enforceInterface(r0)
                int r0 = r7.readInt()
                r5.a((int) r0)
                r8.writeNoException()
                goto L_0x000a
            L_0x0153:
                java.lang.String r0 = "com.google.android.youtube.player.internal.IEmbeddedPlayer"
                r7.enforceInterface(r0)
                int r0 = r7.readInt()
                r5.b((int) r0)
                r8.writeNoException()
                goto L_0x000a
            L_0x0164:
                java.lang.String r0 = "com.google.android.youtube.player.internal.IEmbeddedPlayer"
                r7.enforceInterface(r0)
                int r0 = r7.readInt()
                if (r0 == 0) goto L_0x0170
                r2 = r1
            L_0x0170:
                r5.b((boolean) r2)
                r8.writeNoException()
                goto L_0x000a
            L_0x0178:
                java.lang.String r0 = "com.google.android.youtube.player.internal.IEmbeddedPlayer"
                r7.enforceInterface(r0)
                int r0 = r7.readInt()
                r5.c((int) r0)
                r8.writeNoException()
                goto L_0x000a
            L_0x0189:
                java.lang.String r0 = "com.google.android.youtube.player.internal.IEmbeddedPlayer"
                r7.enforceInterface(r0)
                int r0 = r5.j()
                r8.writeNoException()
                r8.writeInt(r0)
                goto L_0x000a
            L_0x019a:
                java.lang.String r0 = "com.google.android.youtube.player.internal.IEmbeddedPlayer"
                r7.enforceInterface(r0)
                int r0 = r7.readInt()
                r5.d((int) r0)
                r8.writeNoException()
                goto L_0x000a
            L_0x01ab:
                java.lang.String r0 = "com.google.android.youtube.player.internal.IEmbeddedPlayer"
                r7.enforceInterface(r0)
                java.lang.String r0 = r7.readString()
                r5.a((java.lang.String) r0)
                r8.writeNoException()
                goto L_0x000a
            L_0x01bc:
                java.lang.String r0 = "com.google.android.youtube.player.internal.IEmbeddedPlayer"
                r7.enforceInterface(r0)
                int r0 = r7.readInt()
                if (r0 == 0) goto L_0x01c8
                r2 = r1
            L_0x01c8:
                r5.c((boolean) r2)
                r8.writeNoException()
                goto L_0x000a
            L_0x01d0:
                java.lang.String r0 = "com.google.android.youtube.player.internal.IEmbeddedPlayer"
                r7.enforceInterface(r0)
                int r0 = r7.readInt()
                if (r0 == 0) goto L_0x01dc
                r2 = r1
            L_0x01dc:
                r5.d((boolean) r2)
                r8.writeNoException()
                goto L_0x000a
            L_0x01e4:
                java.lang.String r2 = "com.google.android.youtube.player.internal.IEmbeddedPlayer"
                r7.enforceInterface(r2)
                android.os.IBinder r2 = r7.readStrongBinder()
                if (r2 != 0) goto L_0x01f7
            L_0x01ef:
                r5.a((com.google.android.youtube.player.internal.e) r0)
                r8.writeNoException()
                goto L_0x000a
            L_0x01f7:
                java.lang.String r0 = "com.google.android.youtube.player.internal.IOnFullscreenListener"
                android.os.IInterface r0 = r2.queryLocalInterface(r0)
                if (r0 == 0) goto L_0x0206
                boolean r3 = r0 instanceof com.google.android.youtube.player.internal.e
                if (r3 == 0) goto L_0x0206
                com.google.android.youtube.player.internal.e r0 = (com.google.android.youtube.player.internal.e) r0
                goto L_0x01ef
            L_0x0206:
                com.google.android.youtube.player.internal.e$a$a r0 = new com.google.android.youtube.player.internal.e$a$a
                r0.<init>(r2)
                goto L_0x01ef
            L_0x020c:
                java.lang.String r2 = "com.google.android.youtube.player.internal.IEmbeddedPlayer"
                r7.enforceInterface(r2)
                android.os.IBinder r2 = r7.readStrongBinder()
                if (r2 != 0) goto L_0x021f
            L_0x0217:
                r5.a((com.google.android.youtube.player.internal.h) r0)
                r8.writeNoException()
                goto L_0x000a
            L_0x021f:
                java.lang.String r0 = "com.google.android.youtube.player.internal.IPlaylistEventListener"
                android.os.IInterface r0 = r2.queryLocalInterface(r0)
                if (r0 == 0) goto L_0x022e
                boolean r3 = r0 instanceof com.google.android.youtube.player.internal.h
                if (r3 == 0) goto L_0x022e
                com.google.android.youtube.player.internal.h r0 = (com.google.android.youtube.player.internal.h) r0
                goto L_0x0217
            L_0x022e:
                com.google.android.youtube.player.internal.h$a$a r0 = new com.google.android.youtube.player.internal.h$a$a
                r0.<init>(r2)
                goto L_0x0217
            L_0x0234:
                java.lang.String r2 = "com.google.android.youtube.player.internal.IEmbeddedPlayer"
                r7.enforceInterface(r2)
                android.os.IBinder r2 = r7.readStrongBinder()
                if (r2 != 0) goto L_0x0247
            L_0x023f:
                r5.a((com.google.android.youtube.player.internal.g) r0)
                r8.writeNoException()
                goto L_0x000a
            L_0x0247:
                java.lang.String r0 = "com.google.android.youtube.player.internal.IPlayerStateChangeListener"
                android.os.IInterface r0 = r2.queryLocalInterface(r0)
                if (r0 == 0) goto L_0x0256
                boolean r3 = r0 instanceof com.google.android.youtube.player.internal.g
                if (r3 == 0) goto L_0x0256
                com.google.android.youtube.player.internal.g r0 = (com.google.android.youtube.player.internal.g) r0
                goto L_0x023f
            L_0x0256:
                com.google.android.youtube.player.internal.g$a$a r0 = new com.google.android.youtube.player.internal.g$a$a
                r0.<init>(r2)
                goto L_0x023f
            L_0x025c:
                java.lang.String r2 = "com.google.android.youtube.player.internal.IEmbeddedPlayer"
                r7.enforceInterface(r2)
                android.os.IBinder r2 = r7.readStrongBinder()
                if (r2 != 0) goto L_0x026f
            L_0x0267:
                r5.a((com.google.android.youtube.player.internal.f) r0)
                r8.writeNoException()
                goto L_0x000a
            L_0x026f:
                java.lang.String r0 = "com.google.android.youtube.player.internal.IPlaybackEventListener"
                android.os.IInterface r0 = r2.queryLocalInterface(r0)
                if (r0 == 0) goto L_0x027e
                boolean r3 = r0 instanceof com.google.android.youtube.player.internal.f
                if (r3 == 0) goto L_0x027e
                com.google.android.youtube.player.internal.f r0 = (com.google.android.youtube.player.internal.f) r0
                goto L_0x0267
            L_0x027e:
                com.google.android.youtube.player.internal.f$a$a r0 = new com.google.android.youtube.player.internal.f$a$a
                r0.<init>(r2)
                goto L_0x0267
            L_0x0284:
                java.lang.String r0 = "com.google.android.youtube.player.internal.IEmbeddedPlayer"
                r7.enforceInterface(r0)
                r5.k()
                r8.writeNoException()
                goto L_0x000a
            L_0x0291:
                java.lang.String r0 = "com.google.android.youtube.player.internal.IEmbeddedPlayer"
                r7.enforceInterface(r0)
                r5.l()
                r8.writeNoException()
                goto L_0x000a
            L_0x029e:
                java.lang.String r2 = "com.google.android.youtube.player.internal.IEmbeddedPlayer"
                r7.enforceInterface(r2)
                int r2 = r7.readInt()
                if (r2 == 0) goto L_0x02b1
                android.os.Parcelable$Creator r0 = android.content.res.Configuration.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r7)
                android.content.res.Configuration r0 = (android.content.res.Configuration) r0
            L_0x02b1:
                r5.a((android.content.res.Configuration) r0)
                r8.writeNoException()
                goto L_0x000a
            L_0x02b9:
                java.lang.String r0 = "com.google.android.youtube.player.internal.IEmbeddedPlayer"
                r7.enforceInterface(r0)
                r5.m()
                r8.writeNoException()
                goto L_0x000a
            L_0x02c6:
                java.lang.String r0 = "com.google.android.youtube.player.internal.IEmbeddedPlayer"
                r7.enforceInterface(r0)
                r5.n()
                r8.writeNoException()
                goto L_0x000a
            L_0x02d3:
                java.lang.String r0 = "com.google.android.youtube.player.internal.IEmbeddedPlayer"
                r7.enforceInterface(r0)
                r5.o()
                r8.writeNoException()
                goto L_0x000a
            L_0x02e0:
                java.lang.String r0 = "com.google.android.youtube.player.internal.IEmbeddedPlayer"
                r7.enforceInterface(r0)
                r5.p()
                r8.writeNoException()
                goto L_0x000a
            L_0x02ed:
                java.lang.String r0 = "com.google.android.youtube.player.internal.IEmbeddedPlayer"
                r7.enforceInterface(r0)
                int r0 = r7.readInt()
                if (r0 == 0) goto L_0x02f9
                r2 = r1
            L_0x02f9:
                r5.e(r2)
                r8.writeNoException()
                goto L_0x000a
            L_0x0301:
                java.lang.String r0 = "com.google.android.youtube.player.internal.IEmbeddedPlayer"
                r7.enforceInterface(r0)
                r5.q()
                r8.writeNoException()
                goto L_0x000a
            L_0x030e:
                java.lang.String r0 = "com.google.android.youtube.player.internal.IEmbeddedPlayer"
                r7.enforceInterface(r0)
                android.os.Bundle r0 = r5.r()
                r8.writeNoException()
                if (r0 == 0) goto L_0x0324
                r8.writeInt(r1)
                r0.writeToParcel(r8, r1)
                goto L_0x000a
            L_0x0324:
                r8.writeInt(r2)
                goto L_0x000a
            L_0x0329:
                java.lang.String r3 = "com.google.android.youtube.player.internal.IEmbeddedPlayer"
                r7.enforceInterface(r3)
                int r3 = r7.readInt()
                if (r3 == 0) goto L_0x033c
                android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r7)
                android.os.Bundle r0 = (android.os.Bundle) r0
            L_0x033c:
                boolean r0 = r5.a((android.os.Bundle) r0)
                r8.writeNoException()
                if (r0 == 0) goto L_0x0346
                r2 = r1
            L_0x0346:
                r8.writeInt(r2)
                goto L_0x000a
            L_0x034b:
                java.lang.String r3 = "com.google.android.youtube.player.internal.IEmbeddedPlayer"
                r7.enforceInterface(r3)
                int r3 = r7.readInt()
                int r4 = r7.readInt()
                if (r4 == 0) goto L_0x0362
                android.os.Parcelable$Creator r0 = android.view.KeyEvent.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r7)
                android.view.KeyEvent r0 = (android.view.KeyEvent) r0
            L_0x0362:
                boolean r0 = r5.a((int) r3, (android.view.KeyEvent) r0)
                r8.writeNoException()
                if (r0 == 0) goto L_0x036c
                r2 = r1
            L_0x036c:
                r8.writeInt(r2)
                goto L_0x000a
            L_0x0371:
                java.lang.String r3 = "com.google.android.youtube.player.internal.IEmbeddedPlayer"
                r7.enforceInterface(r3)
                int r3 = r7.readInt()
                int r4 = r7.readInt()
                if (r4 == 0) goto L_0x0388
                android.os.Parcelable$Creator r0 = android.view.KeyEvent.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r7)
                android.view.KeyEvent r0 = (android.view.KeyEvent) r0
            L_0x0388:
                boolean r0 = r5.b((int) r3, (android.view.KeyEvent) r0)
                r8.writeNoException()
                if (r0 == 0) goto L_0x0392
                r2 = r1
            L_0x0392:
                r8.writeInt(r2)
                goto L_0x000a
            L_0x0397:
                java.lang.String r2 = "com.google.android.youtube.player.internal.IEmbeddedPlayer"
                r7.enforceInterface(r2)
                com.google.android.youtube.player.internal.u r2 = r5.s()
                r8.writeNoException()
                if (r2 == 0) goto L_0x03a9
                android.os.IBinder r0 = r2.asBinder()
            L_0x03a9:
                r8.writeStrongBinder(r0)
                goto L_0x000a
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.youtube.player.internal.d.a.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    void a() throws RemoteException;

    void a(int i) throws RemoteException;

    void a(Configuration configuration) throws RemoteException;

    void a(e eVar) throws RemoteException;

    void a(f fVar) throws RemoteException;

    void a(g gVar) throws RemoteException;

    void a(h hVar) throws RemoteException;

    void a(String str) throws RemoteException;

    void a(String str, int i) throws RemoteException;

    void a(String str, int i, int i2) throws RemoteException;

    void a(List<String> list, int i, int i2) throws RemoteException;

    void a(boolean z) throws RemoteException;

    boolean a(int i, KeyEvent keyEvent) throws RemoteException;

    boolean a(Bundle bundle) throws RemoteException;

    void b() throws RemoteException;

    void b(int i) throws RemoteException;

    void b(String str, int i) throws RemoteException;

    void b(String str, int i, int i2) throws RemoteException;

    void b(List<String> list, int i, int i2) throws RemoteException;

    void b(boolean z) throws RemoteException;

    boolean b(int i, KeyEvent keyEvent) throws RemoteException;

    void c(int i) throws RemoteException;

    void c(boolean z) throws RemoteException;

    boolean c() throws RemoteException;

    void d(int i) throws RemoteException;

    void d(boolean z) throws RemoteException;

    boolean d() throws RemoteException;

    void e(boolean z) throws RemoteException;

    boolean e() throws RemoteException;

    void f() throws RemoteException;

    void g() throws RemoteException;

    int h() throws RemoteException;

    int i() throws RemoteException;

    int j() throws RemoteException;

    void k() throws RemoteException;

    void l() throws RemoteException;

    void m() throws RemoteException;

    void n() throws RemoteException;

    void o() throws RemoteException;

    void p() throws RemoteException;

    void q() throws RemoteException;

    Bundle r() throws RemoteException;

    u s() throws RemoteException;
}
