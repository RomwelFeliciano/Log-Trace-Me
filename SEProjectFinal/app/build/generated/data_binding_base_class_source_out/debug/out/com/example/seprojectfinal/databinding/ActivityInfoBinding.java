// Generated by view binder compiler. Do not edit!
package com.example.seprojectfinal.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.seprojectfinal.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityInfoBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button buttonInfo;

  @NonNull
  public final TextView textViewInfo;

  @NonNull
  public final TextView textViewInfo2;

  @NonNull
  public final TextView textViewSkip;

  private ActivityInfoBinding(@NonNull ConstraintLayout rootView, @NonNull Button buttonInfo,
      @NonNull TextView textViewInfo, @NonNull TextView textViewInfo2,
      @NonNull TextView textViewSkip) {
    this.rootView = rootView;
    this.buttonInfo = buttonInfo;
    this.textViewInfo = textViewInfo;
    this.textViewInfo2 = textViewInfo2;
    this.textViewSkip = textViewSkip;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityInfoBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityInfoBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_info, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityInfoBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.buttonInfo;
      Button buttonInfo = ViewBindings.findChildViewById(rootView, id);
      if (buttonInfo == null) {
        break missingId;
      }

      id = R.id.textViewInfo;
      TextView textViewInfo = ViewBindings.findChildViewById(rootView, id);
      if (textViewInfo == null) {
        break missingId;
      }

      id = R.id.textViewInfo2;
      TextView textViewInfo2 = ViewBindings.findChildViewById(rootView, id);
      if (textViewInfo2 == null) {
        break missingId;
      }

      id = R.id.textViewSkip;
      TextView textViewSkip = ViewBindings.findChildViewById(rootView, id);
      if (textViewSkip == null) {
        break missingId;
      }

      return new ActivityInfoBinding((ConstraintLayout) rootView, buttonInfo, textViewInfo,
          textViewInfo2, textViewSkip);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
