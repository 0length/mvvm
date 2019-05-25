package ga.bolehju.mvvm.view


import android.support.v7.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import java.util.*


class MainActivity : AppCompatActivity() {

    private val firebaseAuth by inject<FirebaseAuth>()
    var providers = Arrays.asList(
        AuthUI.IdpConfig.Builder(AuthUI.Email_PROVIDER).build()
    )

}






