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
            if (MainActivity.ratings.isNotEmpty()) {
                var total = 0
                for (rating in MainActivity.ratings) {
                    total += rating
                }
                val average = total.toDouble() / MainActivity.ratings.size
                avgRating.text = " %.2f".format(average)
            }
            else{
                avgRating.text= "no Average available"
            }


        }
        btnList.setOnClickListener {
            var output = ""
            for (i in MainActivity.songTitles.indices) {
                output += "Song: ${MainActivity.songTitles[i]}\n"
                output += "Artist: ${MainActivity.artistNames[i]}\n"
                output += "Rating: ${MainActivity.ratings[i]}\n"
                output += "Comment: ${MainActivity.comments[i]}\n"
            }

            listView.text = output

        }
        btnReturn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

        }


    }
}