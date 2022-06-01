package com.example.abcbook.letteractivity

import android.os.Bundle


class HLetterActivity : LetterActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        super.setNextButtonClickListener(ILetterActivity::class.java)
    }
}