package devandroid.isa.appcompras.ui

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import devandroid.isa.appcompras.R
import devandroid.isa.appcompras.databinding.ActivityCategoryBinding

class CategoryActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityCategoryBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityCategoryBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.btnSave.setOnClickListener(this)

    }

    override fun onClick(v: View) {
        if (v.id == R.id.btn_save) {
            val description = binding.edtDescription.text.toString()
            Toast.makeText(this, description, Toast.LENGTH_LONG).show()
        }
    }
}