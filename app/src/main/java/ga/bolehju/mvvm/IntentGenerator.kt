package ga.bolehju.mvvm

import android.content.Context
import android.content.Intent
import ga.bolehju.mvvm.auth.AuthUIWrapper


class IntentGenerator(val context: Context, val authUI: AuthUIWrapper) {
    fun getPetCreationIntent() : Intent {
        return Intent(context, NewContentActivity::class.java)
    }

    fun getAuthenticationIntent() : Intent {
        return authUI.getAuthIntent()
    }

}