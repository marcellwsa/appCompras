package devandroid.isa.appcompras.ui

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import devandroid.isa.appcompras.R
import devandroid.isa.appcompras.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.btnHello.setOnClickListener(this)


    }

    override fun onClick(v: View) {
        if (v.id == R.id.btn_hello){
            startActivity(Intent(this, CategoryActivity::class.java))
            finish()
        }

    }
}