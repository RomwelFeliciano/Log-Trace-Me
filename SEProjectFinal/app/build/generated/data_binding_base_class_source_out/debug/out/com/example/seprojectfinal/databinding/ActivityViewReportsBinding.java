// Generated by view binder compiler. Do not edit!
package com.example.seprojectfinal.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SearchView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.seprojectfinal.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityViewReportsBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final RecyclerView recyclerViewReport;

  @NonNull
  public final SearchView searchViewReport;

  private ActivityViewReportsBinding(@NonNull ConstraintLayout rootView,
      @NonNull RecyclerView recyclerViewReport, @NonNull SearchView searchViewReport) {
    this.rootView = rootView;
    this.recyclerViewReport = recyclerViewReport;
    this.searchViewReport = searchViewReport;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityViewReportsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityViewReportsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_view_reports, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityViewReportsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.recyclerViewReport;
      RecyclerView recyclerViewReport = ViewBindings.findChildViewById(rootView, id);
      if (recyclerViewReport == null) {
        break missingId;
      }

      id = R.id.searchViewReport;
      SearchView searchViewReport = ViewBindings.findChildViewById(rootView, id);
      if (searchViewReport == null) {
        break missingId;
      }

      return new ActivityViewReportsBinding((ConstraintLayout) rootView, recyclerViewReport,
          searchViewReport);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
