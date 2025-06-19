package vcmsa.uvayharichand.musicplaylistapp         // Student Number: ST10477087   Student Name: Uvay Harichand

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

@Suppress("UNUSED_EXPRESSION")
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.run { setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom) }
            insets
            // code starts here
            println("Welcome to the music playlist manager app")

            val buttonNext = findViewById<Button>(R.id.buttonNext)
            buttonNext.setOnClickListener {
                Intent(this, ManagePlaylists::class.java)

                //ui components
                val button = findViewById<Button>(R.id.buttonNext)
            val textView = findViewById<TextView>(R.id.textView)
                findViewById<EditText>(R.id.editTextText2)
                findViewById<EditText>(R.id.editTextText3)
                findViewById<EditText>(R.id.editTextText4)
            val editText4 = findViewById<EditText>(R.id.editTextText5)
            button.setOnClickListener {
                textView.text = "Welcome to the music playlist manager app"

                //List of arrays to store the data
                fun Songname (songtitle: String) {
                        "Firework"
                        "Godzilla"
                        "Imagine"
                        "Whats going on"
                        else -> null

                    fun artistname (Artistname: String) {
                        "Katy perry"
                        "Eminem"
                        "John lennon"
                        "Marvin Gaye"
                        else -> null

                        fun therating(Therating: String) {
                            "1"
                            "2"
                            "3"
                            "4"
                            "5"
                            else -> null

                            fun yourcomment(Yourcomment: String): String? {
                                "I like it"
                                "I dont like it"
                                "I wish it had a better feeling to it"
                                "I dont know what to say"
                                else -> null
                            }

                            fun main() {
                                //Declare four parallel arrays
                                val songtitle = arrayOf("Firework", "Godzilla", "Imagine", "Whats going on")
                                val artistname = arrayOf("Katy perry", "Eminem", "John lennon", "Marvin Gaye")
                                val therating = arrayOf("1", "2", "3", "4", "5")
                                val yourcomment = arrayOf("I like it", "I dont like it", "I wish it had a better feeling to it", "I dont know what to say")
                            }

                           val index = (0..3).random()
                            println(songtitle[index])  //prints random song title





        }
    }
}