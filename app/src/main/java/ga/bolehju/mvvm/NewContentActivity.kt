package ga.bolehju.mvvm

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_new_content.*

class NewContentActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_content)
        saveButton.setOnClickListener {
            Toast.makeText(this, "You saved content! (not really)", Toast.LENGTH_LONG).show()
            finish()
        }
    }

}
