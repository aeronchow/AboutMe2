package com.example.aboutme

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val doneButton : Button = findViewById(R.id.done_button)
        doneButton.setOnClickListener{
            val editText = findViewById<EditText>(R.id.nickname_edit)
            val nicknameTextView = findViewById<TextView>(R.id.nickname_text)

            nicknameTextView.text = editText.text
            editText.visibility = View.GONE
            doneButton.visibility = View.GONE
            nicknameTextView.visibility = View.VISIBLE

        }
    }
}