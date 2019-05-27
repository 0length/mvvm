package ga.bolehju.mvvm

import android.content.Context
import ga.bolehju.mvvm.auth.AuthUIWrapper
import ga.bolehju.mvvm.auth.AuthViewModel
import ga.bolehju.mvvm.auth.Authenticator
import io.kotlintest.specs.StringSpec
import org.mockito.Mockito
import org.mockito.Mockito.`when`
import org.mockito.Mockito.verify

class AuthenticationTests : StringSpec() {
    init {
        "when user is authenticated, returns creation intent" {
            val authenticator = Mockito.mock(Authenticator::class.java)
            `when`(authenticator.isAuthenticated()).thenReturn(true)

            val context = Mockito.mock(Context::class.java)
            val authUI = Mockito.mock(AuthUIWrapper::class.java)
            val generator = IntentGenerator(context, authUI)
            val generatorSpy = Mockito.spy(generator)
            val userViewModel = AuthViewModel(authenticator, generatorSpy)

            userViewModel.getActionIntent()
            verify(generatorSpy).getPetCreationIntent()
        }

        "when user is NOT authenticated, returns sign-in intent" {
            val authenticator =  Mockito.mock(Authenticator::class.java)
            `when`(authenticator.isAuthenticated()).thenReturn(false)

            val context = Mockito.mock(Context::class.java)
            val authUI = Mockito.mock(AuthUIWrapper::class.java)
            val generator = IntentGenerator(context, authUI)
            val generatorSpy = Mockito.spy(generator)
            val userViewModel = AuthViewModel(authenticator, generatorSpy)

            userViewModel.getActionIntent()
            verify(generatorSpy).getAuthenticationIntent()
        }
    }
}