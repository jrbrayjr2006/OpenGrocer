package com.jaydot2.opengrocer

import android.app.Application
import com.jaydot2.opengrocer.koin.AppModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class OpenGrocerApp : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger()
            androidContext(this@OpenGrocerApp)
            modules(AppModule)
        }
    }
}