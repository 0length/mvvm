package ga.bolehju.mvvm


import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import ga.bolehju.mvvm.auth.AuthViewModel
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.android.ext.android.inject


class MainActivity : AppCompatActivity() {

    private val authViewModel by inject<AuthViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       setContentView(R.layout.activity_main)
        createContentButton.setOnClickListener ({
            startActivity(authViewModel.getActionIntent())
        })
    }
}






