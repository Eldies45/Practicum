package vcmsa.ci.practicum

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import vcmsa.ci.practicum.MainActivity2
import vcmsa.ci.practicum.R

class MainActivity : AppCompatActivity() {
    private val songTitles = arrayOf("B","C","D","E")
    private val artistNames = arrayOf("A","B","C","D")
    private val ratings = arrayOf(3,4,2.5,4.5)
    val comments = arrayOf("","","","")


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val titleInput = findViewById<EditText>(R.id.editTextNumber)
        val artistInput = findViewById<EditText>(R.id.editTextNumber2)
        val ratingInput = findViewById<EditText>(R.id.editTextNumber3)
        val commentInput = findViewById<EditText>(R.id.editTextNumber4)
        val txtMessage = findViewById<TextView>(R.id.textView3)

        val btnAdd = findViewById<Button>(R.id.button)
        val btnNext = findViewById<Button>(R.id.button2)
        val btnExit = findViewById<Button>(R.id.button3)

        btnAdd.setOnClickListener {
            txtMessage.text = "Please Enter the Details for the playlist"

            }


        btnNext.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }

        btnExit.setOnClickListener {
            finish()
        }
    }
    private fun calcAveerage(){
        val sum= 0

        for (i in ratings){

        }
        println("The average is: ")
    }
}


