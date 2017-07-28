package in.choy;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import in.choy.bankaccount.account;
import in.choy.messagessandbox.R;
import java.io.Serializable;

/**
 * Created by Jordan Liu on 2017-07-28.
 */

public class FirstFragment extends Fragment {

  private static final String FRAGMENT_MANAGER_KEY = "key";
  int counter = 0;
  View myView;

  private static final String DESCRIBABLE_KEY = "describable_key";
  private Serializable mSerializable;

  public static FirstFragment newInstance(Serializable serializable) {
    FirstFragment fragment = new FirstFragment();
    Bundle bundle = new Bundle();
    bundle.putSerializable(DESCRIBABLE_KEY, serializable);
    fragment.setArguments(bundle);
    return fragment;
  }

  @Nullable
  @Override
  public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
      Bundle savedInstanceState) {
    mSerializable = (Serializable) getArguments().getSerializable("describable_key");
    myView = inflater.inflate(R.layout.layout1, container, false);

    Button button = (Button) myView.findViewById(R.id.button);
    button.setOnClickListener(new OnClickListener() {
      @Override
      public void onClick(View view) {
        TextView text = myView.findViewById(R.id.textView3);
        text.setText(String.valueOf(((account) mSerializable).a));
        ((account) mSerializable).add(1);
      }
    });

    Button button2 = (Button) myView.findViewById(R.id.button2);
    button2.setOnClickListener(new OnClickListener() {
      @Override
      public void onClick(View view) {
        closeFragment();
      }
    });
    return myView;
  }

  private void closeFragment() {
    getActivity().getFragmentManager().popBackStack();
  }
}
