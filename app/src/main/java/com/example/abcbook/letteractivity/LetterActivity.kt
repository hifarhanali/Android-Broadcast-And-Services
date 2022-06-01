package com.example.abcbook.letteractivity

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.abcbook.R
import com.example.abcbook.services.MusicService

abstract class LetterActivity : AppCompatActivity() {
    private lateinit var letter: Letter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_letter)
        setLetter()
        setBackButtonClickListener()
    }

    override fun onBackPressed() {
        super.onBackPressed()
        currentPosition = if(currentPosition - 1 < 0) 0 else currentPosition - 1
    }

    private fun setBackButtonClickListener() {
        findViewById<Button>(R.id.back_button).setOnClickListener {
            onBackPressed()
        }
    }

    protected open fun setNextButtonClickListener(dstContextClass: Class<*>) {
        findViewById<Button>(R.id.next_button).setOnClickListener {
            currentPosition = (currentPosition + 1) % 26
            val intent = Intent(this, dstContextClass)
            startActivity(intent)
        }
    }

    private fun setLetter() {
        letter = LettersData.getLetters()[currentPosition]
        setDataFields()
    }

    @SuppressLint("SetTextI18n")
    private fun setDataFields() {
        findViewById<TextView>(R.id.letter_textview).text = letter.letter.toString()
        findViewById<TextView>(R.id.description_textview).text =
            "${letter.letter} for ${letter.word}"
        findViewById<ImageView>(R.id.letter_imageview).setImageResource(letter.imageResource)
    }

    companion object {
        internal var currentPosition = 0
        private const val TAG = "LetterActivity"
    }
}