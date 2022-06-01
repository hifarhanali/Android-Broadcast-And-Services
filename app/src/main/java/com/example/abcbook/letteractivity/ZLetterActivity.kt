package com.example.abcbook.letteractivity

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.example.abcbook.MainActivity
import com.example.abcbook.R


class ZLetterActivity : LetterActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.setNextButtonClickListener(MainActivity::class.java)
        setNextButtonText()
    }

    override fun setNextButtonClickListener(dstContextClass: Class<*>) {
        findViewById<Button>(R.id.next_button).setOnClickListener {
            currentPosition = (currentPosition + 1) % 26
            val intent = Intent(this, dstContextClass)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP
            startActivity(intent)
            finish()
        }
    }


    private fun setNextButtonText(){
        findViewById<Button>(R.id.next_button).text = getString(R.string.finish_button_text)
    }
    
    
    companion object{
        private const val TAG = "LetterActivity"
    }


}