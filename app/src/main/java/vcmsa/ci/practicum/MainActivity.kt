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

    companion object{
        val songTitles= arrayOf("Ninao","Jaja","Anihilate","Up")
        val artistNames= arrayOf("Gims","Aya Nakamura", "Lil Wayne","Cardi B")
        val comments= arrayOf("Pop", "Reggae","Rap","Rap")
        val ratings= arrayOf(4, 3,2,4)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
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
            txtMessage.text= "Please enter details for the playlist"
        }


        btnNext.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }

        btnExit.setOnClickListener {
            finish()
        }
    }



}