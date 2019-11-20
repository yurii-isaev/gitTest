package ru.mobile.beerhoven.ui.store.sections;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

import ru.mobile.beerhoven.R;

public class StoreFragment extends Fragment {

   private ViewPager mViewPager;
   private TabLayout mTabLayout;

   public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
      View view = inflater.inflate(R.layout.fragment_store, container, false);
      mTabLayout = view.findViewById(R.id.tab_layout);
      mViewPager = view.findViewById(R.id.view_pager);
      return view;
   }

   @Override
   public void onActivityCreated(@Nullable Bundle savedInstanceState) {
      super.onActivityCreated(savedInstanceState);

      mTabLayout.setupWithViewPager(mViewPager);

      mTabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
         @Override
         public void onTabSelected(TabLayout.Tab tab) {}

         @Override
         public void onTabUnselected(TabLayout.Tab tab) {}

         @Override
         public void onTabReselected(TabLayout.Tab tab) {}
      });
   }
}
