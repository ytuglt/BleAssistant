// Generated code from Butter Knife. Do not modify!
package com.usr.usrsimplebleassistent;

import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ServicesActivity_ViewBinding extends MyBaseActivity_ViewBinding {
  private ServicesActivity target;

  @UiThread
  public ServicesActivity_ViewBinding(ServicesActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public ServicesActivity_ViewBinding(ServicesActivity target, View source) {
    super(target, source);

    this.target = target;

    target.rlTop = Utils.findRequiredViewAsType(source, R.id.rl_top, "field 'rlTop'", RelativeLayout.class);
    target.filterView = Utils.findRequiredView(source, R.id.view_filter, "field 'filterView'");
    target.viewShadow = Utils.findRequiredView(source, R.id.view_shadow, "field 'viewShadow'");
    target.lvServices = Utils.findRequiredViewAsType(source, R.id.lv_services, "field 'lvServices'", ListView.class);
    target.ivBle = Utils.findRequiredViewAsType(source, R.id.iv_ble, "field 'ivBle'", ImageView.class);
    target.tvServiceName = Utils.findRequiredViewAsType(source, R.id.tv_service_name, "field 'tvServiceName'", TextView.class);
    target.tvServiceMac = Utils.findRequiredViewAsType(source, R.id.tv_service_mac, "field 'tvServiceMac'", TextView.class);
    target.tvServiceCount = Utils.findRequiredViewAsType(source, R.id.tv_service_count, "field 'tvServiceCount'", TextView.class);
  }

  @Override
  public void unbind() {
    ServicesActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.rlTop = null;
    target.filterView = null;
    target.viewShadow = null;
    target.lvServices = null;
    target.ivBle = null;
    target.tvServiceName = null;
    target.tvServiceMac = null;
    target.tvServiceCount = null;

    super.unbind();
  }
}
