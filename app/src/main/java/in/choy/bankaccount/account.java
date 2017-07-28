package in.choy.bankaccount;

import java.io.Serializable;

/**
 * Created by Jordan Liu on 2017-07-28.
 */

public class account implements Serializable {
  public int a = 0;

  public void add(int b) {
    a += b;
  }

  public void sub(int b) {
    a -= b;
  }
}
