import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.cwiczeniakarta2.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Znajdowanie elementów interfejsu użytkownika
        val showButton: Button = findViewById(R.id.showInput)
        val editText: EditText = findViewById(R.id.editText)
        val textView: TextView = findViewById(R.id.txtVw)
    }
}