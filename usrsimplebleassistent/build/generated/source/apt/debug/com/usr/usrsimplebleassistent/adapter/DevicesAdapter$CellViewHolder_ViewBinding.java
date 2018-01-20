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

public class DevicesAdapter$CellViewHolder_ViewBinding implements Unbinder {
  private DevicesAdapter.CellViewHolder target;

  @UiThread
  public DevicesAdapter$CellViewHolder_ViewBinding(DevicesAdapter.CellViewHolder target,
      View source) {
    this.target = target;

    target.tvDevName = Utils.findRequiredViewAsType(source, R.id.tv_dev_name, "field 'tvDevName'", TextView.class);
    target.tvDevSignal = Utils.findRequiredViewAsType(source, R.id.tv_dev_signal, "field 'tvDevSignal'", TextView.class);
    target.tvDevMac = Utils.findRequiredViewAsType(source, R.id.tv_dev_mac, "field 'tvDevMac'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    DevicesAdapter.CellViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.tvDevName = null;
    target.tvDevSignal = null;
    target.tvDevMac = null;
  }
}
