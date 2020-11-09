package com.jaydot2.opengrocer.welcome

import com.jaydot2.opengrocer.R
import org.junit.Test

class WelcomeFragmentUITest {

    val subject = WelcomePage()
    val destinationId = R.id.welcomeFragment

    @Test
    fun shouldDisplayLoginButton_whenWelcomeFragment() {
        launchFragment(destinationId)
        subject.shouldDisplayLoginButton()
    }

    private fun launchFragment(destinationId: Int) {

    }
}