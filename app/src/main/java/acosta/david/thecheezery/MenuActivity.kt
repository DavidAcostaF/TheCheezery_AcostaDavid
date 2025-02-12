package acosta.david.thecheezery

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        var btnCold: Button = findViewById(R.id.button_cold_drinks) as Button
        var btnHot: Button = findViewById(R.id.button_hot_drinks) as Button
        var btnSweets: Button = findViewById(R.id.button_sweets) as Button
        var btnSalties: Button = findViewById(R.id.button_salties) as Button

        btnCold.setOnClickListener {
            viewEvent("cold")
        }
        btnHot.setOnClickListener {
            viewEvent("hot")
        }
        btnSweets.setOnClickListener {
            viewEvent("sweets")
        }
        btnSalties.setOnClickListener {
            viewEvent("salties")
        }

    }
    fun viewEvent(type:String){
        val intent = Intent(this@MenuActivity, ProductosActivity::class.java)
        intent.putExtra("type", type)
        startActivity(intent)
    }
}