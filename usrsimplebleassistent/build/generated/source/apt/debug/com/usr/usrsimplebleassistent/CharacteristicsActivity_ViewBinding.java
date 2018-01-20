// Generated code from Butter Knife. Do not modify!
package com.usr.usrsimplebleassistent;

import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ListView;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class CharacteristicsActivity_ViewBinding extends MyBaseActivity_ViewBinding {
  private CharacteristicsActivity target;

  @UiThread
  public CharacteristicsActivity_ViewBinding(CharacteristicsActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public CharacteristicsActivity_ViewBinding(CharacteristicsActivity target, View source) {
    super(target, source);

    this.target = target;

    target.filterView = Utils.findRequiredView(source, R.id.view_filter, "field 'filterView'");
    target.lvCharacteristics = Utils.findRequiredViewAsType(source, R.id.lv_characteristics, "field 'lvCharacteristics'", ListView.class);
    target.viewShadow = Utils.findRequiredView(source, R.id.view_shadow, "field 'viewShadow'");
  }

  @Override
  public void unbind() {
    CharacteristicsActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.filterView = null;
    target.lvCharacteristics = null;
    target.viewShadow = null;

    super.unbind();
  }
}
