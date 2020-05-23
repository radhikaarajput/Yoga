package android.support.v4.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.support.annotation.RequiresApi;
import android.view.View;
import android.widget.SearchView;

@TargetApi(14)
@RequiresApi(14)
class SearchViewCompatIcs {
    SearchViewCompatIcs() {
    }

    public static class MySearchView extends SearchView {
        public MySearchView(Context context) {
            super(context);
        }

        public void onActionViewCollapsed() {
            setQuery("", false);
            super.onActionViewCollapsed();
        }
    }

    public static View newSearchView(Context context) {
        return new MySearchView(context);
    }

    public static void setImeOptions(View searchView, int imeOptions) {
        ((SearchView) searchView).setImeOptions(imeOptions);
    }

    public static void setInputType(View searchView, int inputType) {
        ((SearchView) searchView).setInputType(inputType);
    }
}
