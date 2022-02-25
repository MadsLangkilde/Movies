package com.madslangkilde.movies

import android.app.Application
import com.madslangkilde.movies.di.koinModuleList
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.component.KoinComponent
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class MoviesApplication : Application(), KoinComponent {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger(Level.ERROR)
            androidContext(this@MoviesApplication)
            modules(koinModuleList)
        }
    }
}