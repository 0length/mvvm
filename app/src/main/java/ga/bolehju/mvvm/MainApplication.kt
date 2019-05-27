package ga.bolehju.mvvm

import android.app.Application
import ga.bolehju.mvvm.di.AuthModule
import org.koin.android.ext.android.startKoin

class MainApplication : Application(){

    override fun onCreate() {
        super.onCreate()
        startKoin(this, getModules())
    }

    private fun getModules() = listOf(AuthModule())

}