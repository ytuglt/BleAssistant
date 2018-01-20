// Generated code from Butter Knife. Do not modify!
package com.usr.usrsimplebleassistent;

import android.support.annotation.UiThread;
import android.support.design.widget.CollapsingToolbarLayout;
import android.view.View;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MainActivity_ViewBinding extends MyBaseActivity_ViewBinding {
  private MainActivity target;

  @UiThread
  public MainActivity_ViewBinding(MainActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public MainActivity_ViewBinding(MainActivity target, View source) {
    super(target, source);

    this.target = target;

    target.collapsingToolbarLayout = Utils.findRequiredViewAsType(source, R.id.coll_toolbar, "field 'collapsingToolbarLayout'", CollapsingToolbarLayout.class);
  }

  @Override
  public void unbind() {
    MainActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.collapsingToolbarLayout = null;

    super.unbind();
  }
}
