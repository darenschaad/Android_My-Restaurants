package com.epicodus.myrestaurants;

import dalvik.annotation.TestTargetClass;

/**
 * Created by Guest on 4/18/16.
 */
public class MainActivityInstrumentTest {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule =
            new ActivityTestRule<>(MainActivity.class);

    @Test
    public void validateEditText() {
        onView(withId(R.id.locationEditText)).perform(typeText("Portland"))
                .check(matches(withText("Portland")));
    }
}
