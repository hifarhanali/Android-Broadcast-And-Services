package com.example.abcbook.letteractivity

import android.os.Bundle


class ALetterActivity : LetterActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        super.setNextButtonClickListener(BLetterActivity::class.java)
    }
}