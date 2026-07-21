package com.example.app;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import app.varlorg.unote.NoteMain;
import app.varlorg.unote.R;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withContentDescription;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class Struct2TestGeneratedTest {

    @Rule
    public ActivityScenarioRule<NoteMain> activityRule =
            new ActivityScenarioRule<>(NoteMain.class);

    @Test
    public void generatedFromHierarchy_mainScreenTest() {
        onView(withText("uNote")).check(matches(isDisplayed()));

        onView(withId(R.id.notemain_layout)).check(matches(isDisplayed()));
        onView(withId(R.id.listView)).check(matches(isDisplayed()));

        onView(withId(R.id.addNoteButton)).check(matches(isDisplayed()));
        onView(withId(R.id.returnSearch)).check(matches(isDisplayed()));
        onView(withId(R.id.returnButton)).check(matches(isDisplayed()));

        onView(withId(R.id.action_add)).check(matches(isDisplayed()));
        onView(withId(R.id.action_search)).check(matches(isDisplayed()));
        onView(withId(R.id.action_multi)).check(matches(isDisplayed()));
        onView(withId(R.id.action_settings)).check(matches(isDisplayed()));

        onView(withId(R.id.addNoteButton)).perform(click());
    }
}
