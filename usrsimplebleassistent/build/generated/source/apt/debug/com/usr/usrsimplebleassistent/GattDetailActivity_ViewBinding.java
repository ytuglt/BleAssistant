// Generated code from Butter Knife. Do not modify!
package com.usr.usrsimplebleassistent;

import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class GattDetailActivity_ViewBinding extends MyBaseActivity_ViewBinding {
  private GattDetailActivity target;

  private View view2131296306;

  private View view2131296304;

  private View view2131296308;

  @UiThread
  public GattDetailActivity_ViewBinding(GattDetailActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public GattDetailActivity_ViewBinding(final GattDetailActivity target, View source) {
    super(target, source);

    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.btn_options, "field 'btnOptions' and method 'onOptionsClick'");
    target.btnOptions = Utils.castView(view, R.id.btn_options, "field 'btnOptions'", ImageButton.class);
    view2131296306 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onOptionsClick();
      }
    });
    view = Utils.findRequiredView(source, R.id.btn_option, "field 'btnOption' and method 'onOptionClick'");
    target.btnOption = Utils.castView(view, R.id.btn_option, "field 'btnOption'", Button.class);
    view2131296304 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onOptionClick();
      }
    });
    target.rvMsg = Utils.findRequiredViewAsType(source, R.id.lv_msg, "field 'rvMsg'", RecyclerView.class);
    target.tvProperties = Utils.findRequiredViewAsType(source, R.id.tv_properties, "field 'tvProperties'", TextView.class);
    target.etWrite = Utils.findRequiredViewAsType(source, R.id.et_write, "field 'etWrite'", EditText.class);
    view = Utils.findRequiredView(source, R.id.btn_send, "field 'btnSend' and method 'onSendClick'");
    target.btnSend = Utils.castView(view, R.id.btn_send, "field 'btnSend'", Button.class);
    view2131296308 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onSendClick();
      }
    });
    target.rlWrite = Utils.findRequiredViewAsType(source, R.id.rl_write, "field 'rlWrite'", RelativeLayout.class);
    target.rlContent = Utils.findRequiredViewAsType(source, R.id.rl_content, "field 'rlContent'", RelativeLayout.class);
    target.rlBottom = Utils.findRequiredViewAsType(source, R.id.rl_bottom, "field 'rlBottom'", RelativeLayout.class);
    target.bottomShadow = Utils.findRequiredView(source, R.id.view_bottom_shadow, "field 'bottomShadow'");
    target.topShadow = Utils.findRequiredView(source, R.id.view_top_shadow, "field 'topShadow'");
    target.filterView = Utils.findRequiredView(source, R.id.view_filter, "field 'filterView'");
  }

  @Override
  public void unbind() {
    GattDetailActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.btnOptions = null;
    target.btnOption = null;
    target.rvMsg = null;
    target.tvProperties = null;
    target.etWrite = null;
    target.btnSend = null;
    target.rlWrite = null;
    target.rlContent = null;
    target.rlBottom = null;
    target.bottomShadow = null;
    target.topShadow = null;
    target.filterView = null;

    view2131296306.setOnClickListener(null);
    view2131296306 = null;
    view2131296304.setOnClickListener(null);
    view2131296304 = null;
    view2131296308.setOnClickListener(null);
    view2131296308 = null;

    super.unbind();
  }
}
