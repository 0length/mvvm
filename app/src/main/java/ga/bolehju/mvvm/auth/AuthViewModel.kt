package ga.bolehju.mvvm.auth


import android.content.Intent
import ga.bolehju.mvvm.IntentGenerator


class AuthViewModel(val authenticator : Authenticator,
                    val generator : IntentGenerator) {

    fun getActionIntent(): Intent {
        return if (authenticator.isAuthenticated()) {
            generator.getPetCreationIntent()
        } else {
            generator.getAuthenticationIntent()
        }
    }

}

