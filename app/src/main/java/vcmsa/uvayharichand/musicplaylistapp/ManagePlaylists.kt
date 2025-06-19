package vcmsa.uvayharichand.musicplaylistapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.annotation.BinderThread
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ManagePlaylists : AppCompatActivity() {
    private fun avarageRating(songs: Nothing?) {

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_manage_playlists)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets

            var BtnSongs = findViewById<Button>(R.id.BtnSongs)
            var BtnReturn = findViewById<Button>(R.id.BtnReturn)
            var BtnAvarage = findViewById<Button>(R.id.BtnAvarage)
            var editText6 = findViewById<EditText>(R.id.editText6

                    BtnSongs.setOnClickListener {
                val  = editText6.text.toString().trim().lowercase()
                val songs = null
                val  = songs.filter {
                    val text = null
                    it.contains(text)

                    avarageRating(songs)

                    fun therating(Therating: String): String? {
                        "1"
                        "2"
                        "3"
                        "4"
                        "5"

                        val BtnReturn = findViewById<Button>(R.id.BtnReturn)
                        BtnReturn.setOnClickListener {
                            val intent = Intent(this, MainActivity::class.java)
                            startActivity(intent)
                        }
                    }

        }
    }
}
