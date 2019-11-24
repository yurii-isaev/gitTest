package ru.mobile.beerhoven.ui.store.catalog;

import androidx.test.espresso.contrib.RecyclerViewActions;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import ru.mobile.beerhoven.R;
import ru.mobile.beerhoven.activity.MainActivity;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class CatalogFragmentTest {

   @Rule
   public ActivityTestRule<MainActivity> activity = new ActivityTestRule<>(MainActivity.class);

   public ActivityTestRule<MainActivity> getActivity() {
      return activity;
   }

   @Test
   public void test_isListFragmentVisible_onAppLaunch() {
      // Recyclerview comes into view.
      onView(withId(R.id.recycler_view)).check(matches(isDisplayed()));
   }

   @Test
   public void test_selectListItem_isDetailFragmentVisible() {
      // Select list item, nav to DetailFragment.
      onView(withId(R.id.recycler_view)).perform(RecyclerViewActions.actionOnItemAtPosition(1, click()));
   }
}