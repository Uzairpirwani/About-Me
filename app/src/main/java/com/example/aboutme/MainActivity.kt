package com.example.aboutme
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import androidx.databinding.DataBindingUtil
import com.example.aboutme.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity()
{
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.doneButton.setOnClickListener{
            addNickname(it)
        }
    }
 private fun addNickname(view: View){
     binding.apply {
         invalidateAll()
         nicknameTxt.text = nameEdt.text
         nameEdt.visibility = View.GONE
         view.visibility = View.GONE
         nicknameTxt.visibility = View.VISIBLE
     }
     //Hide Keyboard
     val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
     imm.hideSoftInputFromWindow(view.windowToken, 0)



 }
}