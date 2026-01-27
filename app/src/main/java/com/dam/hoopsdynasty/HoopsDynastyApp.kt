
package com.dam.hoopsdynasty

import android.app.Application
import com.google.firebase.FirebaseApp

class HoopsDynastyApp : Application() {
    override fun onCreate() {
        super.onCreate()
        // This MUST run before any ViewModel is created
        FirebaseApp.initializeApp(this)
    }
}