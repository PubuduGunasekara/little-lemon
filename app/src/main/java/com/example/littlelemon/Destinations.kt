package com.example.littlelemon

interface Destinations {
    val onboarding: String
    val home: String
    val profile: String
}

object NavigationDestinations : Destinations {
    override val onboarding = "onboarding"
    override val home = "home"
    override val profile = "profile"
}