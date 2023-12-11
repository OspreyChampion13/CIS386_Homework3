import android.R
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.Random

class MainActivity : AppCompatActivity() {
    private var randomNumberTextView: TextView? = null
    protected fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        randomNumberTextView = findViewById(R.id.randomNumberTextView)
        val generateButton: Button = findViewById(R.id.generateButton)
        generateButton.setOnClickListener { generateRandomNumber() }
    }

    private fun generateRandomNumber() {
        val random = Random()
        val randomNumber = random.nextInt(100)
        randomNumberTextView!!.text = randomNumber.toString()
    }
}
