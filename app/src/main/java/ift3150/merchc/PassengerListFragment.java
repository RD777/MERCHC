package ift3150.merchc;

import android.support.annotation.Nullable;
import android.support.v4.app.ListFragment;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

/**
 * Created by Diego on 2015-04-08.
 */
public class PassengerListFragment extends ListFragment {
    private static final String TAG = "PassengerList";
    void blank(View view){}

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Log.d(TAG,id+"");
    }
}
