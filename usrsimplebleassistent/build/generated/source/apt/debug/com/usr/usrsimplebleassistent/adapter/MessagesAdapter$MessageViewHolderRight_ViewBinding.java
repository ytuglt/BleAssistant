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

public class MessagesAdapter$MessageViewHolderRight_ViewBinding implements Unbinder {
  private MessagesAdapter.MessageViewHolderRight target;

  @UiThread
  public MessagesAdapter$MessageViewHolderRight_ViewBinding(MessagesAdapter.MessageViewHolderRight target,
      View source) {
    this.target = target;

    target.tvMsgContent = Utils.findRequiredViewAsType(source, R.id.tv_msg_content, "field 'tvMsgContent'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    MessagesAdapter.MessageViewHolderRight target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.tvMsgContent = null;
  }
}
