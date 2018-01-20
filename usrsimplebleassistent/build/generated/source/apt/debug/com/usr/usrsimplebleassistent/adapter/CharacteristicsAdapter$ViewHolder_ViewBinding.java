// Generated code from Butter Knife. Do not modify!
package com.usr.usrsimplebleassistent.adapter;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.usr.usrsimplebleassistent.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class CharacteristicsAdapter$ViewHolder_ViewBinding implements Unbinder {
  private CharacteristicsAdapter.ViewHolder target;

  @UiThread
  public CharacteristicsAdapter$ViewHolder_ViewBinding(CharacteristicsAdapter.ViewHolder target,
      View source) {
    this.target = target;

    target.tvCharacteristicName = Utils.findRequiredViewAsType(source, R.id.tv_characteristic_name, "field 'tvCharacteristicName'", TextView.class);
    target.tvCharacteristicProperties = Utils.findRequiredViewAsType(source, R.id.tv_characteristic_properties, "field 'tvCharacteristicProperties'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    CharacteristicsAdapter.ViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.tvCharacteristicName = null;
    target.tvCharacteristicProperties = null;
  }
}
