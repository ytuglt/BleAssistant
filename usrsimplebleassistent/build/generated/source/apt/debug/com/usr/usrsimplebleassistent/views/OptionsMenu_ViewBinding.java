// Generated code from Butter Knife. Do not modify!
package com.usr.usrsimplebleassistent.views;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.usr.usrsimplebleassistent.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class OptionsMenu_ViewBinding implements Unbinder {
  private OptionsMenu target;

  @UiThread
  public OptionsMenu_ViewBinding(OptionsMenu target) {
    this(target, target);
  }

  @UiThread
  public OptionsMenu_ViewBinding(OptionsMenu target, View source) {
    this.target = target;

    target.rv_options = Utils.findRequiredViewAsType(source, R.id.rv_options, "field 'rv_options'", RecyclerView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    OptionsMenu target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.rv_options = null;
  }
}
