package com.yanze.school2021

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.yanze.school2021.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    //Bind the view
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //copy data from the view and assign to binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        //Use the binded view instead of raw main view which can't communicate with code
        setContentView(binding.root)
        //Give button event listener that await click
        binding.button.setOnClickListener{
            //Store edit text 's content
            var _user_name = binding.editText.text
            //Call Toast to create text on the screen (target, test, how long to lasting),
            // and then display it.
            Toast.makeText(this,"Hello $_user_name",Toast.LENGTH_LONG).show()
        }
    }
}