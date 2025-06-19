package vcmsa.ci.practicum

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import vcmsa.ci.practicum.MainActivity

class MainActivity2 : AppCompatActivity() {
    private lateinit var songTitles: Array<String>
    private lateinit var artistNames: Array<String>
    private lateinit var comments: Array<String>
    private lateinit var ratings: Array<Int>
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        val listView = findViewById<TextView>(R.id.textView4)
        val avgRating = findViewById<TextView>(R.id.textView5)
        val btnList = findViewById<Button>(R.id.button5)
        val btnRating = findViewById<Button>(R.id.button6)
        val btnReturn = findViewById<Button>(R.id.button4)

        btnRating.setOnClickListener {


        }
        btnList.setOnClickListener {
            listView.text= "$songTitles,$artistNames,$ratings,$comments"

        }
        btnReturn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

        }




    }
} private fun calculateAverage(){

}