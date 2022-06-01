package com.example.abcbook.letteractivity

import android.os.Bundle

class BLetterActivity : LetterActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setNextButtonClickListener(CLetterActivity::class.java)
    }
}