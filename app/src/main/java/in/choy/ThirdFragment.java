package in.choy;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import in.choy.messagessandbox.R;

/**
 * Created by Jordan Liu on 2017-07-28.
 */

public class ThirdFragment extends Fragment {

  View myView;

  @Nullable
  @Override
  public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
      Bundle savedInstanceState) {
    myView = inflater.inflate(R.layout.layout3, container, false);
    return myView;
  }
}
