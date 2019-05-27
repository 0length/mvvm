package ga.bolehju.mvvm.auth

import android.content.Intent
import com.firebase.ui.auth.AuthUI
import com.google.android.gms.auth.api.Auth
import java.util.*

class AuthUIWrapper {
    var providers = Arrays.asList(
        AuthUI.IdpConfig.Builder(AuthUI.EMAIL_PROVIDER).build(),
        AuthUI.IdpConfig.Builder(AuthUI.GOOGLE_PROVIDER).build())
    fun getAuthIntent() : Intent {
        return AuthUI.getInstance()
            .createSignInIntentBuilder()
            .setAvailableProviders(providers)
            .build()
    }

}