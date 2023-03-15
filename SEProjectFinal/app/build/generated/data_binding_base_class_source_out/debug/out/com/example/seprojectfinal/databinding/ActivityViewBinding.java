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
import com.google.android.material.bottomnavigation.BottomNavigationView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityViewBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final BottomNavigationView bottomNavigationViewView;

  @NonNull
  public final RecyclerView recyclerViewView;

  @NonNull
  public final SearchView searchViewView;

  private ActivityViewBinding(@NonNull ConstraintLayout rootView,
      @NonNull BottomNavigationView bottomNavigationViewView,
      @NonNull RecyclerView recyclerViewView, @NonNull SearchView searchViewView) {
    this.rootView = rootView;
    this.bottomNavigationViewView = bottomNavigationViewView;
    this.recyclerViewView = recyclerViewView;
    this.searchViewView = searchViewView;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityViewBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityViewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_view, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityViewBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.bottomNavigationViewView;
      BottomNavigationView bottomNavigationViewView = ViewBindings.findChildViewById(rootView, id);
      if (bottomNavigationViewView == null) {
        break missingId;
      }

      id = R.id.recyclerViewView;
      RecyclerView recyclerViewView = ViewBindings.findChildViewById(rootView, id);
      if (recyclerViewView == null) {
        break missingId;
      }

      id = R.id.searchViewView;
      SearchView searchViewView = ViewBindings.findChildViewById(rootView, id);
      if (searchViewView == null) {
        break missingId;
      }

      return new ActivityViewBinding((ConstraintLayout) rootView, bottomNavigationViewView,
          recyclerViewView, searchViewView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
