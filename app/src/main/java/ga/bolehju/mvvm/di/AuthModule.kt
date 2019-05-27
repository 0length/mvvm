package ga.bolehju.mvvm.di

import com.google.firebase.auth.FirebaseAuth
import ga.bolehju.mvvm.IntentGenerator
import ga.bolehju.mvvm.auth.AuthUIWrapper
import ga.bolehju.mvvm.auth.Authenticator
import ga.bolehju.mvvm.auth.AuthViewModel
import org.koin.android.module.AndroidModule



class AuthModule : AndroidModule(){
    override fun context() =  applicationContext {
        provide { Authenticator(get()) }
        provide { AuthUIWrapper() }
        provide { IntentGenerator(get(), get()) }
        provide { AuthViewModel(get(), get()) }
        provide { FirebaseAuth.getInstance() }
    }

}