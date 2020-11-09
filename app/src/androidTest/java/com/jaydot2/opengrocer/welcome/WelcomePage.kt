package com.jaydot2.opengrocer.welcome

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.jaydot2.opengrocer.R

class WelcomePage {

    fun shouldShowWelcomeTitle() : WelcomePage {
        onView(withId(R.id.welcomeFragment))
        return this
    }

    fun shouldDisplayLoginButton() : WelcomePage {
        onView(withId(R.id.loginBtn))
            .check(matches(isDisplayed()))
        return this
    }

    fun clickLoginButton() {
        onView(withId(R.id.loginBtn))
            .perform(click())
    }
}