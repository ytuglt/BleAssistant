// Generated code from Butter Knife. Do not modify!
package com.usr.usrsimplebleassistent.adapter;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.usr.usrsimplebleassistent.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class OptionsSelectAdapter$OptionHolder_ViewBinding implements Unbinder {
  private OptionsSelectAdapter.OptionHolder target;

  @UiThread
  public OptionsSelectAdapter$OptionHolder_ViewBinding(OptionsSelectAdapter.OptionHolder target,
      View source) {
    this.target = target;

    target.btnOption = Utils.findRequiredViewAsType(source, R.id.btn_option_select, "field 'btnOption'", Button.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    OptionsSelectAdapter.OptionHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.btnOption = null;
  }
}
